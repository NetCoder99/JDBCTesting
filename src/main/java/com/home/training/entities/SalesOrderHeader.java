package com.home.training.entities;

import java.sql.Date;

public class SalesOrderHeader {

	public Integer   SalesOrderID;         // ] [int] IDENTITY(1,1) NOT FOR REPLICATION NOT NULL,
	public Integer   RevisionNumber;       // ] [tinyint] NOT NULL,
	public Date      OrderDate;            // ] [datetime] NOT NULL,
	public Date      DueDate;              // ] [datetime] NOT NULL,
	public Date      ShipDate;             // ] [datetime] NULL,
	public Integer   Status;               // ] [tinyint] NOT NULL,
	public Boolean   OnlineOrderFlag;      // ] [dbo].[Flag] NOT NULL,
	public String    SalesOrderNumber;     // ]  AS (isnull(N'SO'+CONVERT([nvarchar](23),[SalesOrderID]),N'*** ERROR ***')),
	public String    PurchaseOrderNumber;  // ] [dbo].[OrderNumber] NULL,
	public String    AccountNumber;        // ] [dbo].[AccountNumber] NULL,
	public Integer   CustomerID;         // ] [int] NOT NULL,
	public Integer   SalesPersonID;      // ] [int] NULL,
	public Integer   TerritoryID;        // ] [int] NULL,
	public Integer   BillToAddressID;    // ] [int] NOT NULL,
	public Integer   ShipToAddressID;    // ] [int] NOT NULL,
	public Integer   ShipMethodID;       // ] [int] NOT NULL,
	public Integer   CreditCardID;       // ] [int] NULL,
	public String    CreditCardApprovalCode; // ] [varchar](15) NULL,
	public Integer   CurrencyRateID;    // ] [int] NULL,
	public Double    SubTotal;          // ] [money] NOT NULL,
	public Double    TaxAmt;            // ] [money] NOT NULL,
	public Double    Freight;           // ] [money] NOT NULL,
	public Double    TotalDue;          // ]  AS (isnull(([SubTotal]+[TaxAmt])+[Freight],(0))),
	public String    Comment;           // ] [nvarchar](128) NULL,
	public String    rowguid;           // ] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
	public Date      ModifiedDate;      // ] [datetime] NOT NULL,

	@Override
	public String toString() {
		return  String.format("%d", SalesOrderID);
	}

	public SalesOrderHeader() {}
	
	public SalesOrderHeader(Integer salesOrderID, Integer revisionNumber, Date orderDate, Date dueDate, Date shipDate,
			Integer status, Boolean onlineOrderFlag, String salesOrderNumber, String purchaseOrderNumber,
			String accountNumber, Integer customerID, Integer salesPersonID, Integer territoryID,
			Integer billToAddressID, Integer shipToAddressID, Integer shipMethodID, Integer creditCardID,
			String creditCardApprovalCode, Integer currencyRateID, Double subTotal, Double taxAmt, Double freight,
			Double totalDue, String comment, String rowguid, Date modifiedDate) {
		super();
		SalesOrderID = salesOrderID;
		RevisionNumber = revisionNumber;
		OrderDate = orderDate;
		DueDate = dueDate;
		ShipDate = shipDate;
		Status = status;
		OnlineOrderFlag = onlineOrderFlag;
		SalesOrderNumber = salesOrderNumber;
		PurchaseOrderNumber = purchaseOrderNumber;
		AccountNumber = accountNumber;
		CustomerID = customerID;
		SalesPersonID = salesPersonID;
		TerritoryID = territoryID;
		BillToAddressID = billToAddressID;
		ShipToAddressID = shipToAddressID;
		ShipMethodID = shipMethodID;
		CreditCardID = creditCardID;
		CreditCardApprovalCode = creditCardApprovalCode;
		CurrencyRateID = currencyRateID;
		SubTotal = subTotal;
		TaxAmt = taxAmt;
		Freight = freight;
		TotalDue = totalDue;
		Comment = comment;
		this.rowguid = rowguid;
		ModifiedDate = modifiedDate;
	}

	public Integer getSalesOrderID() {
		return SalesOrderID;
	}

	public void setSalesOrderID(Integer salesOrderID) {
		SalesOrderID = salesOrderID;
	}

	public Integer getRevisionNumber() {
		return RevisionNumber;
	}

	public void setRevisionNumber(Integer revisionNumber) {
		RevisionNumber = revisionNumber;
	}

	public Date getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}

	public Date getDueDate() {
		return DueDate;
	}

	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}

	public Date getShipDate() {
		return ShipDate;
	}

	public void setShipDate(Date shipDate) {
		ShipDate = shipDate;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	public Boolean getOnlineOrderFlag() {
		return OnlineOrderFlag;
	}

	public void setOnlineOrderFlag(Boolean onlineOrderFlag) {
		OnlineOrderFlag = onlineOrderFlag;
	}

	public String getSalesOrderNumber() {
		return SalesOrderNumber;
	}

	public void setSalesOrderNumber(String salesOrderNumber) {
		SalesOrderNumber = salesOrderNumber;
	}

	public String getPurchaseOrderNumber() {
		return PurchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		PurchaseOrderNumber = purchaseOrderNumber;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public Integer getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(Integer customerID) {
		CustomerID = customerID;
	}

	public Integer getSalesPersonID() {
		return SalesPersonID;
	}

	public void setSalesPersonID(Integer salesPersonID) {
		SalesPersonID = salesPersonID;
	}

	public Integer getTerritoryID() {
		return TerritoryID;
	}

	public void setTerritoryID(Integer territoryID) {
		TerritoryID = territoryID;
	}

	public Integer getBillToAddressID() {
		return BillToAddressID;
	}

	public void setBillToAddressID(Integer billToAddressID) {
		BillToAddressID = billToAddressID;
	}

	public Integer getShipToAddressID() {
		return ShipToAddressID;
	}

	public void setShipToAddressID(Integer shipToAddressID) {
		ShipToAddressID = shipToAddressID;
	}

	public Integer getShipMethodID() {
		return ShipMethodID;
	}

	public void setShipMethodID(Integer shipMethodID) {
		ShipMethodID = shipMethodID;
	}

	public Integer getCreditCardID() {
		return CreditCardID;
	}

	public void setCreditCardID(Integer creditCardID) {
		CreditCardID = creditCardID;
	}

	public String getCreditCardApprovalCode() {
		return CreditCardApprovalCode;
	}

	public void setCreditCardApprovalCode(String creditCardApprovalCode) {
		CreditCardApprovalCode = creditCardApprovalCode;
	}

	public Integer getCurrencyRateID() {
		return CurrencyRateID;
	}

	public void setCurrencyRateID(Integer currencyRateID) {
		CurrencyRateID = currencyRateID;
	}

	public Double getSubTotal() {
		return SubTotal;
	}

	public void setSubTotal(Double subTotal) {
		SubTotal = subTotal;
	}

	public Double getTaxAmt() {
		return TaxAmt;
	}

	public void setTaxAmt(Double taxAmt) {
		TaxAmt = taxAmt;
	}

	public Double getFreight() {
		return Freight;
	}

	public void setFreight(Double freight) {
		Freight = freight;
	}

	public Double getTotalDue() {
		return TotalDue;
	}

	public void setTotalDue(Double totalDue) {
		TotalDue = totalDue;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public String getRowguid() {
		return rowguid;
	}

	public void setRowguid(String rowguid) {
		this.rowguid = rowguid;
	}

	public Date getModifiedDate() {
		return ModifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		ModifiedDate = modifiedDate;
	}
	



}
