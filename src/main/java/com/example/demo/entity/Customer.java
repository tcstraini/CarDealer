package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
public class Customer {
          @Id
          @GeneratedValue(strategy = GenerationType.AUTO)
          private Integer customerid;
          
          @NotBlank
      	  @NotNull
      	  @Pattern(regexp = "^[a-zA-Z\\s]+$")
          private String customername;
          
          @NotBlank
      	  @NotNull
      	  @Pattern(regexp = "^[a-zA-Z\\s]+$")
          private String carname;
          
          @NotBlank
      	  @NotNull
      	  @Pattern(regexp = "^[a-zA-Z\\s]+$")
          private String salesperson;
          
		public Integer getCustomerid() {
			return customerid;
		}
		public void setCustomerid(Integer customerid) {
			this.customerid = customerid;
		}
		public String getCustomername() {
			return customername;
		}
		public void setCustomername(String customername) {
			this.customername = customername;
		}
		public String getCarname() {
			return carname;
		}
		public void setCarname(String carname) {
			this.carname = carname;
		}
		public String getSalesperson() {
			return salesperson;
		}
		public void setSalesperson(String salesperson) {
			this.salesperson = salesperson;
		}
          
}