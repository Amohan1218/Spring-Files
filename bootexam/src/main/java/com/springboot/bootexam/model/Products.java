package com.springboot.bootexam.model;

public class Products {
	private String productId;
    private String productName;
    private String category;
    private String description;
    private Double unitPrice;
    private Integer stockQuantity;
    private String supplierId;

    public Products() {
    }

	public Products(String productId, String productName, String category, String description, Double unitPrice,
			Integer stockQuantity, String supplierId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.description = description;
		this.unitPrice = unitPrice;
		this.stockQuantity = stockQuantity;
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", description=" + description + ", unitPrice=" + unitPrice + ", stockQuantity=" + stockQuantity
				+ ", supplierId=" + supplierId + "]";
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
