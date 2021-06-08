/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     */
    private String accessString;
    /**
     * <p>
     * Adds additional user permissions to the access string.
     * </p>
     */
    private String appendAccessString;
    /**
     * <p>
     * The passwords belonging to the user. You are allowed up to two.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> passwords;
    /**
     * <p>
     * Indicates no password is required for the user.
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

    public ModifyUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user.
     */

    public void setAccessString(String accessString) {
        this.accessString = accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @return Access permissions string used for this user.
     */

    public String getAccessString() {
        return this.accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUserRequest withAccessString(String accessString) {
        setAccessString(accessString);
        return this;
    }

    /**
     * <p>
     * Adds additional user permissions to the access string.
     * </p>
     * 
     * @param appendAccessString
     *        Adds additional user permissions to the access string.
     */

    public void setAppendAccessString(String appendAccessString) {
        this.appendAccessString = appendAccessString;
    }

    /**
     * <p>
     * Adds additional user permissions to the access string.
     * </p>
     * 
     * @return Adds additional user permissions to the access string.
     */

    public String getAppendAccessString() {
        return this.appendAccessString;
    }

    /**
     * <p>
     * Adds additional user permissions to the access string.
     * </p>
     * 
     * @param appendAccessString
     *        Adds additional user permissions to the access string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUserRequest withAppendAccessString(String appendAccessString) {
        setAppendAccessString(appendAccessString);
        return this;
    }

    /**
     * <p>
     * The passwords belonging to the user. You are allowed up to two.
     * </p>
     * 
     * @return The passwords belonging to the user. You are allowed up to two.
     */

    public java.util.List<String> getPasswords() {
        if (passwords == null) {
            passwords = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return passwords;
    }

    /**
     * <p>
     * The passwords belonging to the user. You are allowed up to two.
     * </p>
     * 
     * @param passwords
     *        The passwords belonging to the user. You are allowed up to two.
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
     * The passwords belonging to the user. You are allowed up to two.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPasswords(java.util.Collection)} or {@link #withPasswords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param passwords
     *        The passwords belonging to the user. You are allowed up to two.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUserRequest withPasswords(String... passwords) {
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
     * The passwords belonging to the user. You are allowed up to two.
     * </p>
     * 
     * @param passwords
     *        The passwords belonging to the user. You are allowed up to two.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUserRequest withPasswords(java.util.Collection<String> passwords) {
        setPasswords(passwords);
        return this;
    }

    /**
     * <p>
     * Indicates no password is required for the user.
     * </p>
     * 
     * @param noPasswordRequired
     *        Indicates no password is required for the user.
     */

    public void setNoPasswordRequired(Boolean noPasswordRequired) {
        this.noPasswordRequired = noPasswordRequired;
    }

    /**
     * <p>
     * Indicates no password is required for the user.
     * </p>
     * 
     * @return Indicates no password is required for the user.
     */

    public Boolean getNoPasswordRequired() {
        return this.noPasswordRequired;
    }

    /**
     * <p>
     * Indicates no password is required for the user.
     * </p>
     * 
     * @param noPasswordRequired
     *        Indicates no password is required for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUserRequest withNoPasswordRequired(Boolean noPasswordRequired) {
        setNoPasswordRequired(noPasswordRequired);
        return this;
    }

    /**
     * <p>
     * Indicates no password is required for the user.
     * </p>
     * 
     * @return Indicates no password is required for the user.
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
        if (getAccessString() != null)
            sb.append("AccessString: ").append(getAccessString()).append(",");
        if (getAppendAccessString() != null)
            sb.append("AppendAccessString: ").append(getAppendAccessString()).append(",");
        if (getPasswords() != null)
            sb.append("Passwords: ").append(getPasswords()).append(",");
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

        if (obj instanceof ModifyUserRequest == false)
            return false;
        ModifyUserRequest other = (ModifyUserRequest) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getAccessString() == null ^ this.getAccessString() == null)
            return false;
        if (other.getAccessString() != null && other.getAccessString().equals(this.getAccessString()) == false)
            return false;
        if (other.getAppendAccessString() == null ^ this.getAppendAccessString() == null)
            return false;
        if (other.getAppendAccessString() != null && other.getAppendAccessString().equals(this.getAppendAccessString()) == false)
            return false;
        if (other.getPasswords() == null ^ this.getPasswords() == null)
            return false;
        if (other.getPasswords() != null && other.getPasswords().equals(this.getPasswords()) == false)
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
        hashCode = prime * hashCode + ((getAccessString() == null) ? 0 : getAccessString().hashCode());
        hashCode = prime * hashCode + ((getAppendAccessString() == null) ? 0 : getAppendAccessString().hashCode());
        hashCode = prime * hashCode + ((getPasswords() == null) ? 0 : getPasswords().hashCode());
        hashCode = prime * hashCode + ((getNoPasswordRequired() == null) ? 0 : getNoPasswordRequired().hashCode());
        return hashCode;
    }

    @Override
    public ModifyUserRequest clone() {
        return (ModifyUserRequest) super.clone();
    }

}
