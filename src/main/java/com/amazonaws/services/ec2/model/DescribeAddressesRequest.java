/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeAddressesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeAddresses(DescribeAddressesRequest) DescribeAddresses operation}.
 * <p>
 * Describes one or more of your Elastic IP addresses.
 * </p>
 * <p>
 * An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a> in the <i>Amazon Elastic Compute
 * Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeAddresses(DescribeAddressesRequest)
 */
public class DescribeAddressesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeAddressesRequest> {

    /**
     * [EC2-Classic] One or more Elastic IP addresses. <p>Default: Describes
     * all your Elastic IP addresses.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> publicIps;

    /**
     * One or more filters. <ul> <li> <p><code>allocation-id</code> -
     * [EC2-VPC] The allocation ID for the address. </li> <li>
     * <p><code>association-id</code> - [EC2-VPC] The association ID for the
     * address. </li> <li> <p><code>domain</code> - Indicates whether the
     * address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>). </li> <li> <p><code>instance-id</code> - The ID of
     * the instance the address is associated with, if any. </li> <li>
     * <p><code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any. </li> <li>
     * <p><code>network-interface-owner-id</code> - The AWS account ID of the
     * owner. </li> <li> <p><code>private-ip-address</code> - [EC2-VPC] The
     * private IP address associated with the Elastic IP address. </li> <li>
     * <p><code>public-ip</code> - The Elastic IP address. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * [EC2-VPC] One or more allocation IDs. <p>Default: Describes all your
     * Elastic IP addresses.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> allocationIds;

    /**
     * [EC2-Classic] One or more Elastic IP addresses. <p>Default: Describes
     * all your Elastic IP addresses.
     *
     * @return [EC2-Classic] One or more Elastic IP addresses. <p>Default: Describes
     *         all your Elastic IP addresses.
     */
    public java.util.List<String> getPublicIps() {
        if (publicIps == null) {
              publicIps = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              publicIps.setAutoConstruct(true);
        }
        return publicIps;
    }
    
    /**
     * [EC2-Classic] One or more Elastic IP addresses. <p>Default: Describes
     * all your Elastic IP addresses.
     *
     * @param publicIps [EC2-Classic] One or more Elastic IP addresses. <p>Default: Describes
     *         all your Elastic IP addresses.
     */
    public void setPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> publicIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(publicIps.size());
        publicIpsCopy.addAll(publicIps);
        this.publicIps = publicIpsCopy;
    }
    
    /**
     * [EC2-Classic] One or more Elastic IP addresses. <p>Default: Describes
     * all your Elastic IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIps [EC2-Classic] One or more Elastic IP addresses. <p>Default: Describes
     *         all your Elastic IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAddressesRequest withPublicIps(String... publicIps) {
        if (getPublicIps() == null) setPublicIps(new java.util.ArrayList<String>(publicIps.length));
        for (String value : publicIps) {
            getPublicIps().add(value);
        }
        return this;
    }
    
    /**
     * [EC2-Classic] One or more Elastic IP addresses. <p>Default: Describes
     * all your Elastic IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIps [EC2-Classic] One or more Elastic IP addresses. <p>Default: Describes
     *         all your Elastic IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAddressesRequest withPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> publicIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(publicIps.size());
            publicIpsCopy.addAll(publicIps);
            this.publicIps = publicIpsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>allocation-id</code> -
     * [EC2-VPC] The allocation ID for the address. </li> <li>
     * <p><code>association-id</code> - [EC2-VPC] The association ID for the
     * address. </li> <li> <p><code>domain</code> - Indicates whether the
     * address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>). </li> <li> <p><code>instance-id</code> - The ID of
     * the instance the address is associated with, if any. </li> <li>
     * <p><code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any. </li> <li>
     * <p><code>network-interface-owner-id</code> - The AWS account ID of the
     * owner. </li> <li> <p><code>private-ip-address</code> - [EC2-VPC] The
     * private IP address associated with the Elastic IP address. </li> <li>
     * <p><code>public-ip</code> - The Elastic IP address. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>allocation-id</code> -
     *         [EC2-VPC] The allocation ID for the address. </li> <li>
     *         <p><code>association-id</code> - [EC2-VPC] The association ID for the
     *         address. </li> <li> <p><code>domain</code> - Indicates whether the
     *         address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     *         (<code>vpc</code>). </li> <li> <p><code>instance-id</code> - The ID of
     *         the instance the address is associated with, if any. </li> <li>
     *         <p><code>network-interface-id</code> - [EC2-VPC] The ID of the network
     *         interface that the address is associated with, if any. </li> <li>
     *         <p><code>network-interface-owner-id</code> - The AWS account ID of the
     *         owner. </li> <li> <p><code>private-ip-address</code> - [EC2-VPC] The
     *         private IP address associated with the Elastic IP address. </li> <li>
     *         <p><code>public-ip</code> - The Elastic IP address. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>allocation-id</code> -
     * [EC2-VPC] The allocation ID for the address. </li> <li>
     * <p><code>association-id</code> - [EC2-VPC] The association ID for the
     * address. </li> <li> <p><code>domain</code> - Indicates whether the
     * address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>). </li> <li> <p><code>instance-id</code> - The ID of
     * the instance the address is associated with, if any. </li> <li>
     * <p><code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any. </li> <li>
     * <p><code>network-interface-owner-id</code> - The AWS account ID of the
     * owner. </li> <li> <p><code>private-ip-address</code> - [EC2-VPC] The
     * private IP address associated with the Elastic IP address. </li> <li>
     * <p><code>public-ip</code> - The Elastic IP address. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>allocation-id</code> -
     *         [EC2-VPC] The allocation ID for the address. </li> <li>
     *         <p><code>association-id</code> - [EC2-VPC] The association ID for the
     *         address. </li> <li> <p><code>domain</code> - Indicates whether the
     *         address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     *         (<code>vpc</code>). </li> <li> <p><code>instance-id</code> - The ID of
     *         the instance the address is associated with, if any. </li> <li>
     *         <p><code>network-interface-id</code> - [EC2-VPC] The ID of the network
     *         interface that the address is associated with, if any. </li> <li>
     *         <p><code>network-interface-owner-id</code> - The AWS account ID of the
     *         owner. </li> <li> <p><code>private-ip-address</code> - [EC2-VPC] The
     *         private IP address associated with the Elastic IP address. </li> <li>
     *         <p><code>public-ip</code> - The Elastic IP address. </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>allocation-id</code> -
     * [EC2-VPC] The allocation ID for the address. </li> <li>
     * <p><code>association-id</code> - [EC2-VPC] The association ID for the
     * address. </li> <li> <p><code>domain</code> - Indicates whether the
     * address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>). </li> <li> <p><code>instance-id</code> - The ID of
     * the instance the address is associated with, if any. </li> <li>
     * <p><code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any. </li> <li>
     * <p><code>network-interface-owner-id</code> - The AWS account ID of the
     * owner. </li> <li> <p><code>private-ip-address</code> - [EC2-VPC] The
     * private IP address associated with the Elastic IP address. </li> <li>
     * <p><code>public-ip</code> - The Elastic IP address. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>allocation-id</code> -
     *         [EC2-VPC] The allocation ID for the address. </li> <li>
     *         <p><code>association-id</code> - [EC2-VPC] The association ID for the
     *         address. </li> <li> <p><code>domain</code> - Indicates whether the
     *         address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     *         (<code>vpc</code>). </li> <li> <p><code>instance-id</code> - The ID of
     *         the instance the address is associated with, if any. </li> <li>
     *         <p><code>network-interface-id</code> - [EC2-VPC] The ID of the network
     *         interface that the address is associated with, if any. </li> <li>
     *         <p><code>network-interface-owner-id</code> - The AWS account ID of the
     *         owner. </li> <li> <p><code>private-ip-address</code> - [EC2-VPC] The
     *         private IP address associated with the Elastic IP address. </li> <li>
     *         <p><code>public-ip</code> - The Elastic IP address. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAddressesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>allocation-id</code> -
     * [EC2-VPC] The allocation ID for the address. </li> <li>
     * <p><code>association-id</code> - [EC2-VPC] The association ID for the
     * address. </li> <li> <p><code>domain</code> - Indicates whether the
     * address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>). </li> <li> <p><code>instance-id</code> - The ID of
     * the instance the address is associated with, if any. </li> <li>
     * <p><code>network-interface-id</code> - [EC2-VPC] The ID of the network
     * interface that the address is associated with, if any. </li> <li>
     * <p><code>network-interface-owner-id</code> - The AWS account ID of the
     * owner. </li> <li> <p><code>private-ip-address</code> - [EC2-VPC] The
     * private IP address associated with the Elastic IP address. </li> <li>
     * <p><code>public-ip</code> - The Elastic IP address. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>allocation-id</code> -
     *         [EC2-VPC] The allocation ID for the address. </li> <li>
     *         <p><code>association-id</code> - [EC2-VPC] The association ID for the
     *         address. </li> <li> <p><code>domain</code> - Indicates whether the
     *         address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     *         (<code>vpc</code>). </li> <li> <p><code>instance-id</code> - The ID of
     *         the instance the address is associated with, if any. </li> <li>
     *         <p><code>network-interface-id</code> - [EC2-VPC] The ID of the network
     *         interface that the address is associated with, if any. </li> <li>
     *         <p><code>network-interface-owner-id</code> - The AWS account ID of the
     *         owner. </li> <li> <p><code>private-ip-address</code> - [EC2-VPC] The
     *         private IP address associated with the Elastic IP address. </li> <li>
     *         <p><code>public-ip</code> - The Elastic IP address. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAddressesRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * [EC2-VPC] One or more allocation IDs. <p>Default: Describes all your
     * Elastic IP addresses.
     *
     * @return [EC2-VPC] One or more allocation IDs. <p>Default: Describes all your
     *         Elastic IP addresses.
     */
    public java.util.List<String> getAllocationIds() {
        if (allocationIds == null) {
              allocationIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              allocationIds.setAutoConstruct(true);
        }
        return allocationIds;
    }
    
    /**
     * [EC2-VPC] One or more allocation IDs. <p>Default: Describes all your
     * Elastic IP addresses.
     *
     * @param allocationIds [EC2-VPC] One or more allocation IDs. <p>Default: Describes all your
     *         Elastic IP addresses.
     */
    public void setAllocationIds(java.util.Collection<String> allocationIds) {
        if (allocationIds == null) {
            this.allocationIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> allocationIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(allocationIds.size());
        allocationIdsCopy.addAll(allocationIds);
        this.allocationIds = allocationIdsCopy;
    }
    
    /**
     * [EC2-VPC] One or more allocation IDs. <p>Default: Describes all your
     * Elastic IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationIds [EC2-VPC] One or more allocation IDs. <p>Default: Describes all your
     *         Elastic IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAddressesRequest withAllocationIds(String... allocationIds) {
        if (getAllocationIds() == null) setAllocationIds(new java.util.ArrayList<String>(allocationIds.length));
        for (String value : allocationIds) {
            getAllocationIds().add(value);
        }
        return this;
    }
    
    /**
     * [EC2-VPC] One or more allocation IDs. <p>Default: Describes all your
     * Elastic IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationIds [EC2-VPC] One or more allocation IDs. <p>Default: Describes all your
     *         Elastic IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAddressesRequest withAllocationIds(java.util.Collection<String> allocationIds) {
        if (allocationIds == null) {
            this.allocationIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> allocationIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(allocationIds.size());
            allocationIdsCopy.addAll(allocationIds);
            this.allocationIds = allocationIdsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeAddressesRequest> getDryRunRequest() {
        Request<DescribeAddressesRequest> request = new DescribeAddressesRequestMarshaller().marshall(this);
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
        if (getPublicIps() != null) sb.append("PublicIps: " + getPublicIps() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getAllocationIds() != null) sb.append("AllocationIds: " + getAllocationIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPublicIps() == null) ? 0 : getPublicIps().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getAllocationIds() == null) ? 0 : getAllocationIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAddressesRequest == false) return false;
        DescribeAddressesRequest other = (DescribeAddressesRequest)obj;
        
        if (other.getPublicIps() == null ^ this.getPublicIps() == null) return false;
        if (other.getPublicIps() != null && other.getPublicIps().equals(this.getPublicIps()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getAllocationIds() == null ^ this.getAllocationIds() == null) return false;
        if (other.getAllocationIds() != null && other.getAllocationIds().equals(this.getAllocationIds()) == false) return false; 
        return true;
    }
    
}
    