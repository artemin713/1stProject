/**
 * YOU ARE STRICTLY PROHIBITED TO COPY, DISCLOSE, DISTRIBUTE, MODIFY OR USE THIS PROGRAM
 * IN PART OR AS A WHOLE WITHOUT THE PRIOR WRITTEN CONSENT OF HIMEDIA.CO.KR.
 * HIMEDIA.CO.KR OWNS THE INTELLECTUAL PROPERTY RIGHTS IN AND TO THIS PROGRAM.
 * COPYRIGHT (C) 2023 HIMEDIA.CO.KR ALL RIGHTS RESERVED.
 *
 * 하기 프로그램에 대한 저작권을 포함한 지적재산권은 himedia.co.kr에 있으며,
 * himedia.co.kr이 명시적으로 허용하지 않는 사용, 복사, 변경 및 제 3자에 의한 공개, 배포는 엄격히 금지되며
 * himedia.co.kr의 지적재산권 침해에 해당된다.
 * Copyright (C) 2023 himedia.co.kr All Rights Reserved.
 *
 *
 * Program		: kr.co.himedia.sn.ecommerce5th.moon
 * Description	:
 * Environment	: JRE 1.7 or more
 * File			: BoardDao.java
 * Notes		:
 * History		: [NO][Programmer][Description]
 *				: [20231201175214][pluto@himedia.co.kr][CREATE: Initial Release]
 */
package kr.co.himedia.ecommerce.common.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.himedia.ecommerce.common.dto.BoardDto;
import kr.co.himedia.ecommerce.common.dto.PagingDto;

/**
 * @version 1.0.0
 * @author pluto@himedia.co.kr
 * 
 * @since 2023-12-01
 * <p>DESCRIPTION:</p>
 * <p>IMPORTANT:</p>
 */
@Repository("kr.co.himedia.ecommerce.common.dao.BoardDao")
public class BoardDao extends BaseDao {
	
	public List<BoardDto> mylist(PagingDto pagingDto) {
		return sqlSessionCommon.selectList("kr.co.himedia.ecommerce.common.mybatis.board.Board.mylist", pagingDto);
	}
	
	public int count(PagingDto pagingDto) {
		return sqlSessionCommon.selectOne("kr.co.himedia.ecommerce.common.mybatis.board.Board.count", pagingDto);
	}
	
	public List<BoardDto> list(PagingDto pagingDto) {
		return sqlSessionCommon.selectList("kr.co.himedia.ecommerce.common.mybatis.board.Board.list", pagingDto);
	}
	
	public int sequence() {
		return sqlSessionCommon.selectOne("kr.co.himedia.ecommerce.common.mybatis.board.Board.sequence");
	}
	
	public int insert(BoardDto boardDto) {
		return sqlSessionCommon.insert("kr.co.himedia.ecommerce.common.mybatis.board.Board.insert", boardDto);
	}
	
	public BoardDto select(BoardDto boardDto) {
		return sqlSessionCommon.selectOne("kr.co.himedia.ecommerce.common.mybatis.board.Board.select", boardDto);
	}
	
	public int update(BoardDto boardDto) {
		return sqlSessionCommon.update("kr.co.himedia.ecommerce.common.mybatis.board.Board.update", boardDto);
	}
	
	public BoardDto checkSecret(BoardDto boardDto) {
		return sqlSessionCommon.selectOne("kr.co.himedia.ecommerce.common.mybatis.board.Board.checkSecret", boardDto);
	}
	
	public int deleteFlag(BoardDto boardDto) { return sqlSessionCommon.update(
	"kr.co.himedia.ecommerce.common.mybatis.board.Board.deleteFlag", boardDto); }
	 
	
	
	/*
	 * public int cd_delete(BoardDto boardDto) { return sqlSessionCommon.update(
	 * "kr.co.himedia.ecommerce.common.mybatis.board.Board.cd_delete", boardDto); }
	 */
}
