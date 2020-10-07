/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The username of the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Must be Redis.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Passwords used for this user account. You can create up to two passwords for each user.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> passwords;
    /**
     * <p>
     * Access permissions string used for this user account.
     * </p>
     */
    private String accessString;
    /**
     * <p>
     * Indicates a password is not required for this user account.
     * </p>
     */
    private Boolean noPasswordRequired;

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param userId
     *        The ID of the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @return The ID of the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param userId
     *        The ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The username of the user.
     * </p>
     * 
     * @param userName
     *        The username of the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The username of the user.
     * </p>
     * 
     * @return The username of the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The username of the user.
     * </p>
     * 
     * @param userName
     *        The username of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Must be Redis.
     * </p>
     * 
     * @param engine
     *        Must be Redis.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Must be Redis.
     * </p>
     * 
     * @return Must be Redis.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * Must be Redis.
     * </p>
     * 
     * @param engine
     *        Must be Redis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Passwords used for this user account. You can create up to two passwords for each user.
     * </p>
     * 
     * @return Passwords used for this user account. You can create up to two passwords for each user.
     */

    public java.util.List<String> getPasswords() {
        if (passwords == null) {
            passwords = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return passwords;
    }

    /**
     * <p>
     * Passwords used for this user account. You can create up to two passwords for each user.
     * </p>
     * 
     * @param passwords
     *        Passwords used for this user account. You can create up to two passwords for each user.
     */

    public void setPasswords(java.util.Collection<String> passwords) {
        if (passwords == null) {
            this.passwords = null;
            return;
        }

        this.passwords = new com.amazonaws.internal.SdkInternalList<String>(passwords);
    }

    /**
     * <p>
     * Passwords used for this user account. You can create up to two passwords for each user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPasswords(java.util.Collection)} or {@link #withPasswords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param passwords
     *        Passwords used for this user account. You can create up to two passwords for each user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPasswords(String... passwords) {
        if (this.passwords == null) {
            setPasswords(new com.amazonaws.internal.SdkInternalList<String>(passwords.length));
        }
        for (String ele : passwords) {
            this.passwords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Passwords used for this user account. You can create up to two passwords for each user.
     * </p>
     * 
     * @param passwords
     *        Passwords used for this user account. You can create up to two passwords for each user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPasswords(java.util.Collection<String> passwords) {
        setPasswords(passwords);
        return this;
    }

    /**
     * <p>
     * Access permissions string used for this user account.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user account.
     */

    public void setAccessString(String accessString) {
        this.accessString = accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user account.
     * </p>
     * 
     * @return Access permissions string used for this user account.
     */

    public String getAccessString() {
        return this.accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user account.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withAccessString(String accessString) {
        setAccessString(accessString);
        return this;
    }

    /**
     * <p>
     * Indicates a password is not required for this user account.
     * </p>
     * 
     * @param noPasswordRequired
     *        Indicates a password is not required for this user account.
     */

    public void setNoPasswordRequired(Boolean noPasswordRequired) {
        this.noPasswordRequired = noPasswordRequired;
    }

    /**
     * <p>
     * Indicates a password is not required for this user account.
     * </p>
     * 
     * @return Indicates a password is not required for this user account.
     */

    public Boolean getNoPasswordRequired() {
        return this.noPasswordRequired;
    }

    /**
     * <p>
     * Indicates a password is not required for this user account.
     * </p>
     * 
     * @param noPasswordRequired
     *        Indicates a password is not required for this user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withNoPasswordRequired(Boolean noPasswordRequired) {
        setNoPasswordRequired(noPasswordRequired);
        return this;
    }

    /**
     * <p>
     * Indicates a password is not required for this user account.
     * </p>
     * 
     * @return Indicates a password is not required for this user account.
     */

    public Boolean isNoPasswordRequired() {
        return this.noPasswordRequired;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getPasswords() != null)
            sb.append("Passwords: ").append(getPasswords()).append(",");
        if (getAccessString() != null)
            sb.append("AccessString: ").append(getAccessString()).append(",");
        if (getNoPasswordRequired() != null)
            sb.append("NoPasswordRequired: ").append(getNoPasswordRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getPasswords() == null ^ this.getPasswords() == null)
            return false;
        if (other.getPasswords() != null && other.getPasswords().equals(this.getPasswords()) == false)
            return false;
        if (other.getAccessString() == null ^ this.getAccessString() == null)
            return false;
        if (other.getAccessString() != null && other.getAccessString().equals(this.getAccessString()) == false)
            return false;
        if (other.getNoPasswordRequired() == null ^ this.getNoPasswordRequired() == null)
            return false;
        if (other.getNoPasswordRequired() != null && other.getNoPasswordRequired().equals(this.getNoPasswordRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getPasswords() == null) ? 0 : getPasswords().hashCode());
        hashCode = prime * hashCode + ((getAccessString() == null) ? 0 : getAccessString().hashCode());
        hashCode = prime * hashCode + ((getNoPasswordRequired() == null) ? 0 : getNoPasswordRequired().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
