package com.home.training.mappers;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.home.training.entities.SalesOrderHeader;

public class SalesOrderHeaderMapper implements RowMapper<SalesOrderHeader> {

    @Override
    public SalesOrderHeader mapRow(ResultSet rs, int rowNum) throws SQLException {
    	SalesOrderHeader rtnRec = new SalesOrderHeader();
 
    	rtnRec.setSalesOrderID(rs.getInt("SalesOrderID"));

//    	public Integer   SalesOrderID;         // ] [int] IDENTITY(1,1) NOT FOR REPLICATION NOT NULL,
//    	public Integer   RevisionNumber;       // ] [tinyint] NOT NULL,
//    	public Date      OrderDate;            // ] [datetime] NOT NULL,
//    	public Date      DueDate;              // ] [datetime] NOT NULL,
//    	public Date      ShipDate;             // ] [datetime] NULL,
    	
        return rtnRec;
    }
    
}
