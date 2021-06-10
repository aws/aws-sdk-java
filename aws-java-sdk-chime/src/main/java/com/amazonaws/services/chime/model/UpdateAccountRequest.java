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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The new name for the specified Amazon Chime account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The default license applied when you add users to an Amazon Chime account.
     * </p>
     */
    private String defaultLicense;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The new name for the specified Amazon Chime account.
     * </p>
     * 
     * @param name
     *        The new name for the specified Amazon Chime account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name for the specified Amazon Chime account.
     * </p>
     * 
     * @return The new name for the specified Amazon Chime account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name for the specified Amazon Chime account.
     * </p>
     * 
     * @param name
     *        The new name for the specified Amazon Chime account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The default license applied when you add users to an Amazon Chime account.
     * </p>
     * 
     * @param defaultLicense
     *        The default license applied when you add users to an Amazon Chime account.
     * @see License
     */

    public void setDefaultLicense(String defaultLicense) {
        this.defaultLicense = defaultLicense;
    }

    /**
     * <p>
     * The default license applied when you add users to an Amazon Chime account.
     * </p>
     * 
     * @return The default license applied when you add users to an Amazon Chime account.
     * @see License
     */

    public String getDefaultLicense() {
        return this.defaultLicense;
    }

    /**
     * <p>
     * The default license applied when you add users to an Amazon Chime account.
     * </p>
     * 
     * @param defaultLicense
     *        The default license applied when you add users to an Amazon Chime account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public UpdateAccountRequest withDefaultLicense(String defaultLicense) {
        setDefaultLicense(defaultLicense);
        return this;
    }

    /**
     * <p>
     * The default license applied when you add users to an Amazon Chime account.
     * </p>
     * 
     * @param defaultLicense
     *        The default license applied when you add users to an Amazon Chime account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public UpdateAccountRequest withDefaultLicense(License defaultLicense) {
        this.defaultLicense = defaultLicense.toString();
        return this;
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultLicense() != null)
            sb.append("DefaultLicense: ").append(getDefaultLicense());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountRequest == false)
            return false;
        UpdateAccountRequest other = (UpdateAccountRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultLicense() == null ^ this.getDefaultLicense() == null)
            return false;
        if (other.getDefaultLicense() != null && other.getDefaultLicense().equals(this.getDefaultLicense()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultLicense() == null) ? 0 : getDefaultLicense().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountRequest clone() {
        return (UpdateAccountRequest) super.clone();
    }

}
