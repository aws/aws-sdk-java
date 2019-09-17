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
import com.amazonaws.services.ec2.model.transform.CreateDhcpOptionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateDhcpOptionsRequest> {

    /**
     * <p>
     * A DHCP configuration option.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DhcpConfiguration> dhcpConfigurations;

    /**
     * Default constructor for CreateDhcpOptionsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateDhcpOptionsRequest() {
    }

    /**
     * Constructs a new CreateDhcpOptionsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param dhcpConfigurations
     *        A DHCP configuration option.
     */
    public CreateDhcpOptionsRequest(java.util.List<DhcpConfiguration> dhcpConfigurations) {
        setDhcpConfigurations(dhcpConfigurations);
    }

    /**
     * <p>
     * A DHCP configuration option.
     * </p>
     * 
     * @return A DHCP configuration option.
     */

    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        if (dhcpConfigurations == null) {
            dhcpConfigurations = new com.amazonaws.internal.SdkInternalList<DhcpConfiguration>();
        }
        return dhcpConfigurations;
    }

    /**
     * <p>
     * A DHCP configuration option.
     * </p>
     * 
     * @param dhcpConfigurations
     *        A DHCP configuration option.
     */

    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
            return;
        }

        this.dhcpConfigurations = new com.amazonaws.internal.SdkInternalList<DhcpConfiguration>(dhcpConfigurations);
    }

    /**
     * <p>
     * A DHCP configuration option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDhcpConfigurations(java.util.Collection)} or {@link #withDhcpConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dhcpConfigurations
     *        A DHCP configuration option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDhcpOptionsRequest withDhcpConfigurations(DhcpConfiguration... dhcpConfigurations) {
        if (this.dhcpConfigurations == null) {
            setDhcpConfigurations(new com.amazonaws.internal.SdkInternalList<DhcpConfiguration>(dhcpConfigurations.length));
        }
        for (DhcpConfiguration ele : dhcpConfigurations) {
            this.dhcpConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A DHCP configuration option.
     * </p>
     * 
     * @param dhcpConfigurations
     *        A DHCP configuration option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDhcpOptionsRequest withDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        setDhcpConfigurations(dhcpConfigurations);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateDhcpOptionsRequest> getDryRunRequest() {
        Request<CreateDhcpOptionsRequest> request = new CreateDhcpOptionsRequestMarshaller().marshall(this);
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
        if (getDhcpConfigurations() != null)
            sb.append("DhcpConfigurations: ").append(getDhcpConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDhcpOptionsRequest == false)
            return false;
        CreateDhcpOptionsRequest other = (CreateDhcpOptionsRequest) obj;
        if (other.getDhcpConfigurations() == null ^ this.getDhcpConfigurations() == null)
            return false;
        if (other.getDhcpConfigurations() != null && other.getDhcpConfigurations().equals(this.getDhcpConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDhcpConfigurations() == null) ? 0 : getDhcpConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public CreateDhcpOptionsRequest clone() {
        return (CreateDhcpOptionsRequest) super.clone();
    }
}
