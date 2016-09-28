package com.mycompany.app.domain;

public class OrderDomain {

  public long id;
  public String name;
  public int paymentId;
  public int userId;
  public int startDate;
  public int endDate;
  public int pricePaid;
  public int state;
  public int crearedDate;
  public int modifiedDate;
  public int locations;
  public int targetImpressions;
  public int targetClicks;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public int getStartDate() {
    return startDate;
  }

  public void setStartDate(int startDate) {
    this.startDate = startDate;
  }

  public int getEndDate() {
    return endDate;
  }

  public void setEndDate(int endDate) {
    this.endDate = endDate;
  }

  public int getPricePaid() {
    return pricePaid;
  }

  public void setPricePaid(int pricePaid) {
    this.pricePaid = pricePaid;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public int getCrearedDate() {
    return crearedDate;
  }

  public void setCrearedDate(int crearedDate) {
    this.crearedDate = crearedDate;
  }

  public int getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(int modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public int getLocations() {
    return locations;
  }

  public void setLocations(int locations) {
    this.locations = locations;
  }

  public int getTargetImpressions() {
    return targetImpressions;
  }

  public void setTargetImpressions(int targetImpressions) {
    this.targetImpressions = targetImpressions;
  }

  public int getTargetClicks() {
    return targetClicks;
  }

  public void setTargetClicks(int targetClicks) {
    this.targetClicks = targetClicks;
  }
}
