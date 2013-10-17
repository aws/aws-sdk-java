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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateDhcpOptionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createDhcpOptions(CreateDhcpOptionsRequest) CreateDhcpOptions operation}.
 * <p>
 * Creates a set of DHCP options that you can then associate with one or more VPCs, causing all existing and new instances that you launch in those VPCs
 * to use the set of DHCP options. The following table lists the individual DHCP options you can specify. For more information about the options, go to
 * <a href="http://www.ietf.org/rfc/rfc2132.txt"> http://www.ietf.org/rfc/rfc2132.txt </a>
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createDhcpOptions(CreateDhcpOptionsRequest)
 */
public class CreateDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateDhcpOptionsRequest> {

    /**
     * A set of one or more DHCP configurations.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration> dhcpConfigurations;

    /**
     * Default constructor for a new CreateDhcpOptionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDhcpOptionsRequest() {}
    
    /**
     * Constructs a new CreateDhcpOptionsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dhcpConfigurations A set of one or more DHCP configurations.
     */
    public CreateDhcpOptionsRequest(java.util.List<DhcpConfiguration> dhcpConfigurations) {
        setDhcpConfigurations(dhcpConfigurations);
    }

    /**
     * A set of one or more DHCP configurations.
     *
     * @return A set of one or more DHCP configurations.
     */
    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        if (dhcpConfigurations == null) {
              dhcpConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration>();
              dhcpConfigurations.setAutoConstruct(true);
        }
        return dhcpConfigurations;
    }
    
    /**
     * A set of one or more DHCP configurations.
     *
     * @param dhcpConfigurations A set of one or more DHCP configurations.
     */
    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration> dhcpConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration>(dhcpConfigurations.size());
        dhcpConfigurationsCopy.addAll(dhcpConfigurations);
        this.dhcpConfigurations = dhcpConfigurationsCopy;
    }
    
    /**
     * A set of one or more DHCP configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations A set of one or more DHCP configurations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDhcpOptionsRequest withDhcpConfigurations(DhcpConfiguration... dhcpConfigurations) {
        if (getDhcpConfigurations() == null) setDhcpConfigurations(new java.util.ArrayList<DhcpConfiguration>(dhcpConfigurations.length));
        for (DhcpConfiguration value : dhcpConfigurations) {
            getDhcpConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * A set of one or more DHCP configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations A set of one or more DHCP configurations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDhcpOptionsRequest withDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration> dhcpConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration>(dhcpConfigurations.size());
            dhcpConfigurationsCopy.addAll(dhcpConfigurations);
            this.dhcpConfigurations = dhcpConfigurationsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateDhcpOptionsRequest> getDryRunRequest() {
        Request<CreateDhcpOptionsRequest> request = new CreateDhcpOptionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDhcpConfigurations() != null) sb.append("DhcpConfigurations: " + getDhcpConfigurations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDhcpConfigurations() == null) ? 0 : getDhcpConfigurations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDhcpOptionsRequest == false) return false;
        CreateDhcpOptionsRequest other = (CreateDhcpOptionsRequest)obj;
        
        if (other.getDhcpConfigurations() == null ^ this.getDhcpConfigurations() == null) return false;
        if (other.getDhcpConfigurations() != null && other.getDhcpConfigurations().equals(this.getDhcpConfigurations()) == false) return false; 
        return true;
    }
    
}
    