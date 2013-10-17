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
import com.amazonaws.services.ec2.model.transform.DescribeReservedInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstances(DescribeReservedInstancesRequest) DescribeReservedInstances operation}.
 * <p>
 * The DescribeReservedInstances operation describes Reserved Instances that were purchased for use with your account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstances(DescribeReservedInstancesRequest)
 */
public class DescribeReservedInstancesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeReservedInstancesRequest> {

    /**
     * The optional list of Reserved Instance IDs to describe.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesIds;

    /**
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     */
    private String offeringType;

    /**
     * The optional list of Reserved Instance IDs to describe.
     *
     * @return The optional list of Reserved Instance IDs to describe.
     */
    public java.util.List<String> getReservedInstancesIds() {
        if (reservedInstancesIds == null) {
              reservedInstancesIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              reservedInstancesIds.setAutoConstruct(true);
        }
        return reservedInstancesIds;
    }
    
    /**
     * The optional list of Reserved Instance IDs to describe.
     *
     * @param reservedInstancesIds The optional list of Reserved Instance IDs to describe.
     */
    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesIds.size());
        reservedInstancesIdsCopy.addAll(reservedInstancesIds);
        this.reservedInstancesIds = reservedInstancesIdsCopy;
    }
    
    /**
     * The optional list of Reserved Instance IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The optional list of Reserved Instance IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        if (getReservedInstancesIds() == null) setReservedInstancesIds(new java.util.ArrayList<String>(reservedInstancesIds.length));
        for (String value : reservedInstancesIds) {
            getReservedInstancesIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of Reserved Instance IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The optional list of Reserved Instance IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesIds.size());
            reservedInstancesIdsCopy.addAll(reservedInstancesIds);
            this.reservedInstancesIds = reservedInstancesIdsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for ReservedInstances. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for ReservedInstances. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
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
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for ReservedInstances. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for ReservedInstances. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for ReservedInstances. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @return The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OfferingTypeValues
     */
    public DescribeReservedInstancesRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OfferingTypeValues
     */
    public DescribeReservedInstancesRequest withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeReservedInstancesRequest> getDryRunRequest() {
        Request<DescribeReservedInstancesRequest> request = new DescribeReservedInstancesRequestMarshaller().marshall(this);
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
        if (getReservedInstancesIds() != null) sb.append("ReservedInstancesIds: " + getReservedInstancesIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedInstancesRequest == false) return false;
        DescribeReservedInstancesRequest other = (DescribeReservedInstancesRequest)obj;
        
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null) return false;
        if (other.getReservedInstancesIds() != null && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        return true;
    }
    
}
    