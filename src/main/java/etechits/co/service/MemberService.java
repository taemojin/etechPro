package etechits.co.service;

import javax.servlet.http.HttpServletResponse;

import etechits.co.vo.MemberVO;

public interface MemberService {
 
	public void register(MemberVO vo) throws Exception;
	
	public MemberVO login(MemberVO vo) throws Exception;
	
	public void memberUpdate(MemberVO vo) throws Exception;
	
	public void memberDelete(MemberVO vo) throws Exception;	
	
	public int passChk(MemberVO vo) throws Exception;
	
	public int idChk(MemberVO vo) throws Exception;
	
	////메일발송
	public void sendEmail(MemberVO vo, String div) throws Exception;

	//아이디찾기
	public void findPw(HttpServletResponse resp, MemberVO vo) throws Exception;
}
