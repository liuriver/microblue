package com.microblue.dal.entity;

import java.util.Date;

/**
 * 
 * TODO
 * 
 * @see microblue-dal
 * @author liujiang admin
 * @Date 2017年3月17日
 */
public class GameRoomInfo extends BaseEntity
{
	private String name;

	private int counts;

	private Date startTime;

	private Date endTime;

	private int ownerUserId;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getCounts()
	{
		return counts;
	}

	public void setCounts(int counts)
	{
		this.counts = counts;
	}

	public Date getStartTime()
	{
		return startTime;
	}

	public void setStartTime(Date startTime)
	{
		this.startTime = startTime;
	}

	public Date getEndTime()
	{
		return endTime;
	}

	public void setEndTime(Date endTime)
	{
		this.endTime = endTime;
	}

	public int getOwnerUserId()
	{
		return ownerUserId;
	}

	public void setOwnerUserId(int ownerUserId)
	{
		this.ownerUserId = ownerUserId;
	}

	@Override
	public String tableName()
	{
		return "game_room_info";
	}

}
