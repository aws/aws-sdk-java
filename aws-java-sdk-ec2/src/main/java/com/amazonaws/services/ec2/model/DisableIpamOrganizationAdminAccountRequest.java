/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DisableIpamOrganizationAdminAccountRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableIpamOrganizationAdminAccountRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DisableIpamOrganizationAdminAccountRequest> {

    /**
     * <p>
     * The Organizations member account ID that you want to disable as IPAM account.
     * </p>
     */
    private String delegatedAdminAccountId;

    /**
     * <p>
     * The Organizations member account ID that you want to disable as IPAM account.
     * </p>
     * 
     * @param delegatedAdminAccountId
     *        The Organizations member account ID that you want to disable as IPAM account.
     */

    public void setDelegatedAdminAccountId(String delegatedAdminAccountId) {
        this.delegatedAdminAccountId = delegatedAdminAccountId;
    }

    /**
     * <p>
     * The Organizations member account ID that you want to disable as IPAM account.
     * </p>
     * 
     * @return The Organizations member account ID that you want to disable as IPAM account.
     */

    public String getDelegatedAdminAccountId() {
        return this.delegatedAdminAccountId;
    }

    /**
     * <p>
     * The Organizations member account ID that you want to disable as IPAM account.
     * </p>
     * 
     * @param delegatedAdminAccountId
     *        The Organizations member account ID that you want to disable as IPAM account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableIpamOrganizationAdminAccountRequest withDelegatedAdminAccountId(String delegatedAdminAccountId) {
        setDelegatedAdminAccountId(delegatedAdminAccountId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DisableIpamOrganizationAdminAccountRequest> getDryRunRequest() {
        Request<DisableIpamOrganizationAdminAccountRequest> request = new DisableIpamOrganizationAdminAccountRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDelegatedAdminAccountId() != null)
            sb.append("DelegatedAdminAccountId: ").append(getDelegatedAdminAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableIpamOrganizationAdminAccountRequest == false)
            return false;
        DisableIpamOrganizationAdminAccountRequest other = (DisableIpamOrganizationAdminAccountRequest) obj;
        if (other.getDelegatedAdminAccountId() == null ^ this.getDelegatedAdminAccountId() == null)
            return false;
        if (other.getDelegatedAdminAccountId() != null && other.getDelegatedAdminAccountId().equals(this.getDelegatedAdminAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelegatedAdminAccountId() == null) ? 0 : getDelegatedAdminAccountId().hashCode());
        return hashCode;
    }

    @Override
    public DisableIpamOrganizationAdminAccountRequest clone() {
        return (DisableIpamOrganizationAdminAccountRequest) super.clone();
    }
}
