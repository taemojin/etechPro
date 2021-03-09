package etechits.co.service;


import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.mail.HtmlEmail;
import org.springframework.stereotype.Service;

import etechits.co.dao.MemberDAO;
import etechits.co.vo.MemberVO;



@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject MemberDAO dao;
	
	@Override
	public void register(MemberVO vo) throws Exception {
		
		dao.register(vo);
		
	}

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}

	//Controller에서 보내는 파라미터들을 memberUpdate(MemberVO vo)로 받고
	@Override
	public void memberUpdate(MemberVO vo) throws Exception {
		
		//받은 vo를 DAO로 보내줍니다.
		dao.memberUpdate(vo);
		
	}
	
	// 업데이트에서 처리한 내용과 같습니다.
	@Override
	public void memberDelete(MemberVO vo) throws Exception {
		dao.memberDelete(vo);
	}

	// 패스워드 체크
	@Override
	public int passChk(MemberVO vo) throws Exception {
		int result = dao.passChk(vo);
		return result;
	}
	
	// 아이디 중복 체크
	@Override
	public int idChk(MemberVO vo) throws Exception {
		int result = dao.idChk(vo);
		return result;
	}
	
	//비밀번호 찾기 이메일발송
	@Override
	public void sendEmail(MemberVO vo, String div) throws Exception {
		// Mail Server 설정
		String charSet = "utf-8";
		String hostSMTP = "smtp.gmail.com"; //네이버 이용시 smtp.naver.com
		String hostSMTPid = "서버 이메일 주소(보내는 사람 이메일 주소)";
		String hostSMTPpwd = "서버 이메일 비번(보내는 사람 이메일 비번)";

		// 보내는 사람 EMail, 제목, 내용
		String fromEmail = "보내는 사람 이메일주소(받는 사람 이메일에 표시됨)";
		String fromName = "프로젝트이름 또는 보내는 사람 이름";
		String subject = "";
		String msg = "";

		if(div.equals("findpw")) {
			subject = "베프마켓 임시 비밀번호 입니다.";
			msg += "<div align='center' style='border:1px solid black; font-family:verdana'>";
			msg += "<h3 style='color: blue;'>";
			msg += vo.getUserId() + "님의 임시 비밀번호 입니다. 비밀번호를 변경하여 사용하세요.</h3>";
			msg += "<p>임시 비밀번호 : ";
			msg += vo.getUserPass() + "</p></div>";
		}

		// 받는 사람 E-Mail 주소
		String mail = vo.getEmail();
		try {
			HtmlEmail email = new HtmlEmail();
			email.setDebug(true);
			email.setCharset(charSet);
			email.setSSL(true);
			email.setHostName(hostSMTP);
			email.setSmtpPort(465); //네이버 이용시 587

			email.setAuthentication(hostSMTPid, hostSMTPpwd);
			email.setTLS(true);
			email.addTo(mail, charSet);
			email.setFrom(fromEmail, fromName, charSet);
			email.setSubject(subject);
			email.setHtmlMsg(msg);
			email.send();
		} catch (Exception e) {
			System.out.println("메일발송 실패 : " + e);
		}
	}

	//비밀번호찾기
	@Override
	public void findPw(HttpServletResponse response, MemberVO vo) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		MemberVO ck = dao.login(vo);
		PrintWriter out = response.getWriter();
		// 가입된 아이디가 없으면
		if(dao.login(vo) == null) {
			out.print("등록되지 않은 아이디입니다.");
			out.close();
		}
		// 가입된 이메일이 아니면
		else if(!vo.getEmail().equals(ck.getEmail())) {
			out.print("등록되지 않은 이메일입니다.");
			out.close();
		}else {
			// 임시 비밀번호 생성
			String pw = "";
			for (int i = 0; i < 12; i++) {
				pw += (char) ((Math.random() * 26) + 97);
			}
			vo.setUserPass(pw);;
			// 비밀번호 변경
			dao.updatePw(vo);
			// 비밀번호 변경 메일 발송
			sendEmail(vo, "findpw");

			out.print("이메일로 임시 비밀번호를 발송하였습니다.");
			out.close();
		}
	}
	
}