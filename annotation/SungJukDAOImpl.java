package siestageek.spring.annotation;

import org.springframework.stereotype.Repository;

import siestageek.spring.sungjuk.SungJuk;
import siestageek.spring.sungjuk.SungJukDAO;

@Repository("sdao")
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가됨!");
	}

}
