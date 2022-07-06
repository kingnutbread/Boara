package com.githrd.boa.controller.p;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.githrd.boa.dao.p.BoardpDao;
import com.githrd.boa.vo.p.MyInfoVO;

@Controller
@RequestMapping("/board")
public class Boardp {
	
	@Autowired
	BoardpDao pDao;
	
	@RequestMapping("/buyBoard.boa")
	public ModelAndView buyBoard(ModelAndView mv, MyInfoVO iVO, String nowPage) {
		
		int cnt = pDao.buyBoard(iVO);
		int bno = iVO.getBno();
		System.out.println(bno + "bno");
		if(cnt != 1) {
			mv.addObject("MSG", "게시글 구매에 실패했습니다.");
		}
		
		mv.addObject("NOWPAGE", nowPage);
		mv.addObject("VIEW", "/boa/board/boardDetail.boa");
		mv.addObject("MSG", "게시글 구매에 성공했습니다.");
		mv.setViewName("p/redirect");
		return mv;
	}
	
	//핫 게시글 등록 처리
	@RequestMapping("/hotBoardProc.boa")
	@ResponseBody
	public Map hotBoardProc(MyInfoVO iVO) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		String result = "NO";
		int cnt = pDao.hotBoardProc(iVO);
		int cnt2 = pDao.hotBoardPoint(iVO);
		
		if(cnt == 1 && cnt2 == 1) {
			result = "OK";
		}
		
		map.put("result", result);
		return map;
	}
	
}