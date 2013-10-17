/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;


/**
 * <p>
 * The LoginProfile data type contains the user name and password create date for a user.
 * </p>
 * <p>
 * This data type is used as a response element in the actions CreateLoginProfile and GetLoginProfile.
 * </p>
 */
public class LoginProfile implements Serializable {

    /**
     * The name of the user, which can be used for signing into the AWS
     * Management Console.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The date when the password for the user was created.
     */
    private java.util.Date createDate;

    /**
     * Default constructor for a new LoginProfile object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public LoginProfile() {}
    
    /**
     * Constructs a new LoginProfile object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName The name of the user, which can be used for signing
     * into the AWS Management Console.
     * @param createDate The date when the password for the user was created.
     */
    public LoginProfile(String userName, java.util.Date createDate) {
        setUserName(userName);
        setCreateDate(createDate);
    }

    /**
     * The name of the user, which can be used for signing into the AWS
     * Management Console.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the user, which can be used for signing into the AWS
     *         Management Console.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The name of the user, which can be used for signing into the AWS
     * Management Console.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The name of the user, which can be used for signing into the AWS
     *         Management Console.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The name of the user, which can be used for signing into the AWS
     * Management Console.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The name of the user, which can be used for signing into the AWS
     *         Management Console.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoginProfile withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The date when the password for the user was created.
     *
     * @return The date when the password for the user was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date when the password for the user was created.
     *
     * @param createDate The date when the password for the user was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date when the password for the user was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date when the password for the user was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoginProfile withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LoginProfile == false) return false;
        LoginProfile other = (LoginProfile)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        return true;
    }
    
}
    