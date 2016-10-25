package com.mycompany.app.domain;

import java.util.Date;

public class OrderDomain {

  private Long id;
  private Integer paymentId;
  private Integer userId;
  private Date startDate;
  private Date endDate;
  private Integer pricePaid;
  private String state;
  private Date createdDate;
  private Date modifiedDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(int paymentId) {
    this.paymentId = paymentId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public int getPricePaid() {
    return pricePaid;
  }

  public void setPricePaid(int pricePaid) {
    this.pricePaid = pricePaid;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Date getCrearedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public Date getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

}
