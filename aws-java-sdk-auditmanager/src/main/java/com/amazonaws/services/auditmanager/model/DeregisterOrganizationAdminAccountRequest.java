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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterOrganizationAdminAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterOrganizationAdminAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified administrator account.
     * </p>
     */
    private String adminAccountId;

    /**
     * <p>
     * The identifier for the specified administrator account.
     * </p>
     * 
     * @param adminAccountId
     *        The identifier for the specified administrator account.
     */

    public void setAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * <p>
     * The identifier for the specified administrator account.
     * </p>
     * 
     * @return The identifier for the specified administrator account.
     */

    public String getAdminAccountId() {
        return this.adminAccountId;
    }

    /**
     * <p>
     * The identifier for the specified administrator account.
     * </p>
     * 
     * @param adminAccountId
     *        The identifier for the specified administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterOrganizationAdminAccountRequest withAdminAccountId(String adminAccountId) {
        setAdminAccountId(adminAccountId);
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
        if (getAdminAccountId() != null)
            sb.append("AdminAccountId: ").append(getAdminAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterOrganizationAdminAccountRequest == false)
            return false;
        DeregisterOrganizationAdminAccountRequest other = (DeregisterOrganizationAdminAccountRequest) obj;
        if (other.getAdminAccountId() == null ^ this.getAdminAccountId() == null)
            return false;
        if (other.getAdminAccountId() != null && other.getAdminAccountId().equals(this.getAdminAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminAccountId() == null) ? 0 : getAdminAccountId().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterOrganizationAdminAccountRequest clone() {
        return (DeregisterOrganizationAdminAccountRequest) super.clone();
    }

}
