package com.example.demo.loginCredentials;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class UserDto {
	
	@NotNull(message = "user id is required")
	private int u_Id;
	@NotBlank(message = "user name should not blank")
	@Size(min=3, message ="name must be atlist 3 character")
    private String userName;
	
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String userEmail;
    @NotBlank(message = "Password is required")
    private String userPassword;
    @NotNull
    private Long userNumber;
    
	public int getU_Id() {
		return u_Id;
	}
	public void setU_Id(int u_Id) {
		this.u_Id = u_Id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Long getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(Long userNumber) {
		this.userNumber = userNumber;
	}
	public UserDto(@NotNull(message = "user id is required") int u_Id,
			@NotBlank(message = "user name should not blank") @Size(min = 3, message = "name must be atlist 3 character") String userName,
			@NotEmpty(message = "Email should not be empty") @Email String userEmail,
			@NotBlank(message = "Password is required") String userPassword, @NotNull Long userNumber) {
		super();
		this.u_Id = u_Id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userNumber = userNumber;
	}
	public UserDto() {
		super();
	}

 
}
