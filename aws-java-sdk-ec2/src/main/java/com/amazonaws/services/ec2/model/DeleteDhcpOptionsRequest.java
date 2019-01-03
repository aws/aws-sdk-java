/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeleteDhcpOptionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteDhcpOptionsRequest> {

    /**
     * <p>
     * The ID of the DHCP options set.
     * </p>
     */
    private String dhcpOptionsId;

    /**
     * Default constructor for DeleteDhcpOptionsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DeleteDhcpOptionsRequest() {
    }

    /**
     * Constructs a new DeleteDhcpOptionsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param dhcpOptionsId
     *        The ID of the DHCP options set.
     */
    public DeleteDhcpOptionsRequest(String dhcpOptionsId) {
        setDhcpOptionsId(dhcpOptionsId);
    }

    /**
     * <p>
     * The ID of the DHCP options set.
     * </p>
     * 
     * @param dhcpOptionsId
     *        The ID of the DHCP options set.
     */

    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the DHCP options set.
     * </p>
     * 
     * @return The ID of the DHCP options set.
     */

    public String getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the DHCP options set.
     * </p>
     * 
     * @param dhcpOptionsId
     *        The ID of the DHCP options set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDhcpOptionsRequest withDhcpOptionsId(String dhcpOptionsId) {
        setDhcpOptionsId(dhcpOptionsId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteDhcpOptionsRequest> getDryRunRequest() {
        Request<DeleteDhcpOptionsRequest> request = new DeleteDhcpOptionsRequestMarshaller().marshall(this);
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
        if (getDhcpOptionsId() != null)
            sb.append("DhcpOptionsId: ").append(getDhcpOptionsId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDhcpOptionsRequest == false)
            return false;
        DeleteDhcpOptionsRequest other = (DeleteDhcpOptionsRequest) obj;
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null)
            return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDhcpOptionsRequest clone() {
        return (DeleteDhcpOptionsRequest) super.clone();
    }
}
