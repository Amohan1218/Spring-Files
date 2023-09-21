package com.springboot.bootexam.model;

public class Orders {
    private Integer orderId;
    private String customerId;
    private String orderDate;
    private String productId;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
	
    public Orders() {
		super();
	}

	public Orders(Integer orderId, String customerId, String orderDate, String productId, Integer quantity,
			Double unitPrice, Double totalAmount) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.productId = productId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "orders [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate + ", productId="
				+ productId + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalAmount=" + totalAmount
				+ "]";
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
