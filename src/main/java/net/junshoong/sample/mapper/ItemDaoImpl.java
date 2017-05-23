package net.junshoong.sample.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import net.junshoong.sample.domain.Item;

public class ItemDaoImpl extends SqlSessionDaoSupport implements ItemMapper {

	@Override
	public Item getItem(String itemId) {
		return (Item) getSqlSession().selectOne("net.harvey.sample.mapper.ItemMapper.getItem", itemId);
	}
	


}
