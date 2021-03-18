package etechits.co.service;


import javax.servlet.http.HttpSession;
import etechits.co.vo.AdminDTO;
import etechits.co.vo.MemberVO;

public interface AdminService {

    boolean loginCheck(AdminDTO dto, HttpSession session) throws Exception;    //관리자 로그인을 체크하는 메소드
 
    
    void admin_member_forced_evictionCheck(MemberVO vo) throws Exception; //강제탈퇴 시킬때 해당 회원이 있는지 체크하는 메소드
 
}
