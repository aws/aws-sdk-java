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
import com.amazonaws.services.ec2.model.transform.DeleteCoipCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCoipCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteCoipCidrRequest> {

    /**
     * <p>
     * A customer-owned IP address range that you want to delete.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     */
    private String coipPoolId;

    /**
     * <p>
     * A customer-owned IP address range that you want to delete.
     * </p>
     * 
     * @param cidr
     *        A customer-owned IP address range that you want to delete.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * A customer-owned IP address range that you want to delete.
     * </p>
     * 
     * @return A customer-owned IP address range that you want to delete.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * A customer-owned IP address range that you want to delete.
     * </p>
     * 
     * @param cidr
     *        A customer-owned IP address range that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCoipCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * 
     * @param coipPoolId
     *        The ID of the customer-owned address pool.
     */

    public void setCoipPoolId(String coipPoolId) {
        this.coipPoolId = coipPoolId;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * 
     * @return The ID of the customer-owned address pool.
     */

    public String getCoipPoolId() {
        return this.coipPoolId;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * 
     * @param coipPoolId
     *        The ID of the customer-owned address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCoipCidrRequest withCoipPoolId(String coipPoolId) {
        setCoipPoolId(coipPoolId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteCoipCidrRequest> getDryRunRequest() {
        Request<DeleteCoipCidrRequest> request = new DeleteCoipCidrRequestMarshaller().marshall(this);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getCoipPoolId() != null)
            sb.append("CoipPoolId: ").append(getCoipPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCoipCidrRequest == false)
            return false;
        DeleteCoipCidrRequest other = (DeleteCoipCidrRequest) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getCoipPoolId() == null ^ this.getCoipPoolId() == null)
            return false;
        if (other.getCoipPoolId() != null && other.getCoipPoolId().equals(this.getCoipPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getCoipPoolId() == null) ? 0 : getCoipPoolId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCoipCidrRequest clone() {
        return (DeleteCoipCidrRequest) super.clone();
    }
}
