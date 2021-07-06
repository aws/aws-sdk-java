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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableOrganizationAdminAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableOrganizationAdminAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for the account to designate as the delegated Amazon Macie administrator
     * account for the organization.
     * </p>
     */
    private String adminAccountId;
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The Amazon Web Services account ID for the account to designate as the delegated Amazon Macie administrator
     * account for the organization.
     * </p>
     * 
     * @param adminAccountId
     *        The Amazon Web Services account ID for the account to designate as the delegated Amazon Macie
     *        administrator account for the organization.
     */

    public void setAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account to designate as the delegated Amazon Macie administrator
     * account for the organization.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the account to designate as the delegated Amazon Macie
     *         administrator account for the organization.
     */

    public String getAdminAccountId() {
        return this.adminAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account to designate as the delegated Amazon Macie administrator
     * account for the organization.
     * </p>
     * 
     * @param adminAccountId
     *        The Amazon Web Services account ID for the account to designate as the delegated Amazon Macie
     *        administrator account for the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableOrganizationAdminAccountRequest withAdminAccountId(String adminAccountId) {
        setAdminAccountId(adminAccountId);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableOrganizationAdminAccountRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
            sb.append("AdminAccountId: ").append(getAdminAccountId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableOrganizationAdminAccountRequest == false)
            return false;
        EnableOrganizationAdminAccountRequest other = (EnableOrganizationAdminAccountRequest) obj;
        if (other.getAdminAccountId() == null ^ this.getAdminAccountId() == null)
            return false;
        if (other.getAdminAccountId() != null && other.getAdminAccountId().equals(this.getAdminAccountId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminAccountId() == null) ? 0 : getAdminAccountId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public EnableOrganizationAdminAccountRequest clone() {
        return (EnableOrganizationAdminAccountRequest) super.clone();
    }

}
