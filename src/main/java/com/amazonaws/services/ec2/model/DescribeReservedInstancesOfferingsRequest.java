/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest) DescribeReservedInstancesOfferings operation}.
 * <p>
 * The DescribeReservedInstancesOfferings operation describes Reserved
 * Instance offerings that are available for purchase. With Amazon EC2
 * Reserved Instances, you purchase the right to launch Amazon EC2
 * instances for a period of time (without getting insufficient capacity
 * errors) and pay a lower usage rate for the actual time used.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest)
 */
public class DescribeReservedInstancesOfferingsRequest extends AmazonWebServiceRequest {

    /**
     * An optional list of the unique IDs of the Reserved Instance offerings
     * to describe.
     */
    private java.util.List<String> reservedInstancesOfferingIds;

    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     */
    private String instanceType;

    /**
     * The Availability Zone in which the Reserved Instance can be used.
     */
    private String availabilityZone;

    /**
     * The Reserved Instance product description.
     */
    private String productDescription;

    /**
     * A list of filters used to match properties for
     * ReservedInstancesOfferings. For a complete reference to the available
     * filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The tenancy of the Reserved Instance offering. A Reserved Instance
     * with tenancy of dedicated will run on single-tenant hardware and can
     * only be launched within a VPC.
     */
    private String instanceTenancy;

    /**
     * The Reserved Instance offering type.
     */
    private String offeringType;

    /**
     * An optional list of the unique IDs of the Reserved Instance offerings
     * to describe.
     *
     * @return An optional list of the unique IDs of the Reserved Instance offerings
     *         to describe.
     */
    public java.util.List<String> getReservedInstancesOfferingIds() {
        
        if (reservedInstancesOfferingIds == null) {
            reservedInstancesOfferingIds = new java.util.ArrayList<String>();
        }
        return reservedInstancesOfferingIds;
    }
    
    /**
     * An optional list of the unique IDs of the Reserved Instance offerings
     * to describe.
     *
     * @param reservedInstancesOfferingIds An optional list of the unique IDs of the Reserved Instance offerings
     *         to describe.
     */
    public void setReservedInstancesOfferingIds(java.util.Collection<String> reservedInstancesOfferingIds) {
        if (reservedInstancesOfferingIds == null) {
            this.reservedInstancesOfferingIds = null;
            return;
        }

        java.util.List<String> reservedInstancesOfferingIdsCopy = new java.util.ArrayList<String>(reservedInstancesOfferingIds.size());
        reservedInstancesOfferingIdsCopy.addAll(reservedInstancesOfferingIds);
        this.reservedInstancesOfferingIds = reservedInstancesOfferingIdsCopy;
    }
    
    /**
     * An optional list of the unique IDs of the Reserved Instance offerings
     * to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesOfferingIds An optional list of the unique IDs of the Reserved Instance offerings
     *         to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsRequest withReservedInstancesOfferingIds(String... reservedInstancesOfferingIds) {
        if (getReservedInstancesOfferingIds() == null) setReservedInstancesOfferingIds(new java.util.ArrayList<String>(reservedInstancesOfferingIds.length));
        for (String value : reservedInstancesOfferingIds) {
            getReservedInstancesOfferingIds().add(value);
        }
        return this;
    }
    
    /**
     * An optional list of the unique IDs of the Reserved Instance offerings
     * to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesOfferingIds An optional list of the unique IDs of the Reserved Instance offerings
     *         to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsRequest withReservedInstancesOfferingIds(java.util.Collection<String> reservedInstancesOfferingIds) {
        if (reservedInstancesOfferingIds == null) {
            this.reservedInstancesOfferingIds = null;
        } else {
            java.util.List<String> reservedInstancesOfferingIdsCopy = new java.util.ArrayList<String>(reservedInstancesOfferingIds.size());
            reservedInstancesOfferingIdsCopy.addAll(reservedInstancesOfferingIds);
            this.reservedInstancesOfferingIds = reservedInstancesOfferingIdsCopy;
        }

        return this;
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @return The instance type on which the Reserved Instance can be used.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceType
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceType
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }
    
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     *
     * @return The Availability Zone in which the Reserved Instance can be used.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instance can be used.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instance can be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The Reserved Instance product description.
     *
     * @return The Reserved Instance product description.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The Reserved Instance product description.
     *
     * @param productDescription The Reserved Instance product description.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The Reserved Instance product description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The Reserved Instance product description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
    /**
     * A list of filters used to match properties for
     * ReservedInstancesOfferings. For a complete reference to the available
     * filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for
     *         ReservedInstancesOfferings. For a complete reference to the available
     *         filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for
     * ReservedInstancesOfferings. For a complete reference to the available
     * filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for
     *         ReservedInstancesOfferings. For a complete reference to the available
     *         filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for
     * ReservedInstancesOfferings. For a complete reference to the available
     * filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for
     *         ReservedInstancesOfferings. For a complete reference to the available
     *         filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for
     * ReservedInstancesOfferings. For a complete reference to the available
     * filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for
     *         ReservedInstancesOfferings. For a complete reference to the available
     *         filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }
    
    /**
     * The tenancy of the Reserved Instance offering. A Reserved Instance
     * with tenancy of dedicated will run on single-tenant hardware and can
     * only be launched within a VPC.
     *
     * @return The tenancy of the Reserved Instance offering. A Reserved Instance
     *         with tenancy of dedicated will run on single-tenant hardware and can
     *         only be launched within a VPC.
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }
    
    /**
     * The tenancy of the Reserved Instance offering. A Reserved Instance
     * with tenancy of dedicated will run on single-tenant hardware and can
     * only be launched within a VPC.
     *
     * @param instanceTenancy The tenancy of the Reserved Instance offering. A Reserved Instance
     *         with tenancy of dedicated will run on single-tenant hardware and can
     *         only be launched within a VPC.
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }
    
    /**
     * The tenancy of the Reserved Instance offering. A Reserved Instance
     * with tenancy of dedicated will run on single-tenant hardware and can
     * only be launched within a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTenancy The tenancy of the Reserved Instance offering. A Reserved Instance
     *         with tenancy of dedicated will run on single-tenant hardware and can
     *         only be launched within a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }
    
    
    /**
     * The Reserved Instance offering type.
     *
     * @return The Reserved Instance offering type.
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     *
     * @param offeringType The Reserved Instance offering type.
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesOfferingsRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
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
        if (reservedInstancesOfferingIds != null) sb.append("ReservedInstancesOfferingIds: " + reservedInstancesOfferingIds + ", ");
        if (instanceType != null) sb.append("InstanceType: " + instanceType + ", ");
        if (availabilityZone != null) sb.append("AvailabilityZone: " + availabilityZone + ", ");
        if (productDescription != null) sb.append("ProductDescription: " + productDescription + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        if (instanceTenancy != null) sb.append("InstanceTenancy: " + instanceTenancy + ", ");
        if (offeringType != null) sb.append("OfferingType: " + offeringType + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesOfferingIds() == null) ? 0 : getReservedInstancesOfferingIds().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeReservedInstancesOfferingsRequest == false) return false;
        DescribeReservedInstancesOfferingsRequest other = (DescribeReservedInstancesOfferingsRequest)obj;
        
        if (other.getReservedInstancesOfferingIds() == null ^ this.getReservedInstancesOfferingIds() == null) return false;
        if (other.getReservedInstancesOfferingIds() != null && other.getReservedInstancesOfferingIds().equals(this.getReservedInstancesOfferingIds()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null) return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        return true;
    }
    
}
    