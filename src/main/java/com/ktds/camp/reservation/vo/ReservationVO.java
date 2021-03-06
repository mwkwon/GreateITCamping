package com.ktds.camp.reservation.vo;

import com.ktds.camp.member.vo.MemberVO;

public class ReservationVO {
	private int rId;
	private int rPeopleCount;
	private int rPrice;
	private int rRoomNumber;
	private String rGrillYN;
	private int rFoodPrice;
	private String rCheckIn;
	private String rCheckOut;
	private String rPeriod;
	private String memberId;
	private int campingPlaceId;
	
	private MemberVO memberVO;
	
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public int getrPeopleCount() {
		return rPeopleCount;
	}
	public void setrPeopleCount(int rPeopleCount) {
		this.rPeopleCount = rPeopleCount;
	}
	public int getrPrice() {
		return rPrice;
	}
	public void setrPrice(int rPrice) {
		this.rPrice = rPrice;
	}
	public int getrRoomNumber() {
		return rRoomNumber;
	}
	public void setrRoomNumber(int rRoomNumber) {
		this.rRoomNumber = rRoomNumber;
	}
	public String isrGrillYN() {
		return rGrillYN;
	}
	public void setrGrillYN(String rGrillYN) {
		this.rGrillYN = rGrillYN;
	}
	public int getrFoodPrice() {
		return rFoodPrice;
	}
	public void setrFoodPrice(int rFoodPrice) {
		this.rFoodPrice = rFoodPrice;
	}
	public String getrCheckIn() {
		return rCheckIn;
	}
	public void setrCheckIn(String rCheckIn) {
		this.rCheckIn = rCheckIn;
	}
	public String getrCheckOut() {
		return rCheckOut;
	}
	public void setrCheckOut(String rCheckOut) {
		this.rCheckOut = rCheckOut;
	}
	public String getrPeriod() {
		return rPeriod;
	}
	public void setrPeriod(String rPeriod) {
		this.rPeriod = rPeriod;
	}
	
	
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getCampingPlaceId() {
		return campingPlaceId;
	}
	public void setCampingPlaceId(int campingPlaceId) {
		this.campingPlaceId = campingPlaceId;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	
	
	@Override
	public String toString() {
		return "ReservationVO [rId=" + rId + ", rPeopleCount=" + rPeopleCount + ", rPrice=" + rPrice + ", rRoomNumber="
				+ rRoomNumber + ", rGrillYN=" + rGrillYN + ", rFoodPrice=" + rFoodPrice + ", rCheckIn=" + rCheckIn
				+ ", rCheckOut=" + rCheckOut + ", rPeriod=" + rPeriod + ", memberId=" + memberId + ", campingPlaceId="
				+ campingPlaceId + "]";
	}
	

}
