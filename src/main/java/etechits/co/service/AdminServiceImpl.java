package etechits.co.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
 
import org.springframework.stereotype.Service;
import etechits.co.vo.MemberVO;
import etechits.co.vo.AdminDTO;
import etechits.co.dao.AdminDAO;

@Service    //서비스 빈으로 설정함
public class AdminServiceImpl implements AdminService {

    @Inject    //dao를 호출하기때문에 의존성을 주입한다.
    AdminDAO admindao;
    
    
    
    @Override    //로그인 체크 관련 메소드 (세션에 아이디와 비밀번호를 저장함)
    public boolean loginCheck(AdminDTO dto, HttpSession session) throws Exception {
        
        boolean result = admindao.loginCheck(dto);
        
        if(result) {    //로그인 성공
            
            session.setAttribute("admin_id", dto.getAdmin_id());
            session.setAttribute("admin_pass", dto.getAdmin_pass());
            
        }
        
        return result;
    }
 
 
    //회원 강제탈퇴 관련 메소드
    @Override
    public void admin_member_forced_evictionCheck(MemberVO vo) throws Exception{
 
        admindao.admin_member_forced_evictionCheck(vo);
        
    }
    
}
