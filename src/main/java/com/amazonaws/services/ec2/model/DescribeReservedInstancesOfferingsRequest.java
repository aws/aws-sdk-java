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
import com.amazonaws.services.ec2.model.transform.DescribeReservedInstancesOfferingsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest) DescribeReservedInstancesOfferings operation}.
 * <p>
 * The DescribeReservedInstancesOfferings operation describes Reserved Instance offerings that are available for purchase. With Amazon EC2 Reserved
 * Instances, you purchase the right to launch Amazon EC2 instances for a period of time (without getting insufficient capacity errors) and pay a lower
 * usage rate for the actual time used.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest)
 */
public class DescribeReservedInstancesOfferingsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeReservedInstancesOfferingsRequest> {

    /**
     * An optional list of the unique IDs of the Reserved Instance offerings
     * to describe.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesOfferingIds;

    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     */
    private String instanceType;

    /**
     * The Availability Zone in which the Reserved Instance can be used.
     */
    private String availabilityZone;

    /**
     * The Reserved Instance product description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     */
    private String productDescription;

    /**
     * A list of filters used to match properties for
     * ReservedInstancesOfferings. For a complete reference to the available
     * filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The tenancy of the Reserved Instance offering. A Reserved Instance
     * with tenancy of dedicated will run on single-tenant hardware and can
     * only be launched within a VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     */
    private String instanceTenancy;

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     */
    private String offeringType;

    private String nextToken;

    private Integer maxResults;

    /**
     * Include Marketplace offerings in the response.
     */
    private Boolean includeMarketplace;

    /**
     * Minimum duration (in seconds) to filter when searching for offerings.
     */
    private Long minDuration;

    /**
     * Maximum duration (in seconds) to filter when searching for offerings.
     */
    private Long maxDuration;

    private Integer maxInstanceCount;

    /**
     * An optional list of the unique IDs of the Reserved Instance offerings
     * to describe.
     *
     * @return An optional list of the unique IDs of the Reserved Instance offerings
     *         to describe.
     */
    public java.util.List<String> getReservedInstancesOfferingIds() {
        if (reservedInstancesOfferingIds == null) {
              reservedInstancesOfferingIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              reservedInstancesOfferingIds.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesOfferingIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesOfferingIds.size());
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
            com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesOfferingIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesOfferingIds.size());
            reservedInstancesOfferingIdsCopy.addAll(reservedInstancesOfferingIds);
            this.reservedInstancesOfferingIds = reservedInstancesOfferingIdsCopy;
        }

        return this;
    }

    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @return The Reserved Instance product description.
     *
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The Reserved Instance product description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product description.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The Reserved Instance product description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RIProductDescription
     */
    public DescribeReservedInstancesOfferingsRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The Reserved Instance product description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product description.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }
    
    /**
     * The Reserved Instance product description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RIProductDescription
     */
    public DescribeReservedInstancesOfferingsRequest withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * A list of filters used to match properties for
     * ReservedInstancesOfferings. For a complete reference to the available
     * filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for
     *         ReservedInstancesOfferings. For a complete reference to the available
     *         filter keys for this operation, see the <a
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
     * A list of filters used to match properties for
     * ReservedInstancesOfferings. For a complete reference to the available
     * filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for
     *         ReservedInstancesOfferings. For a complete reference to the available
     *         filter keys for this operation, see the <a
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
     * A list of filters used to match properties for
     * ReservedInstancesOfferings. For a complete reference to the available
     * filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for
     *         ReservedInstancesOfferings. For a complete reference to the available
     *         filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
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
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for
     *         ReservedInstancesOfferings. For a complete reference to the available
     *         filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The tenancy of the Reserved Instance offering. A Reserved Instance
     * with tenancy of dedicated will run on single-tenant hardware and can
     * only be launched within a VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @return The tenancy of the Reserved Instance offering. A Reserved Instance
     *         with tenancy of dedicated will run on single-tenant hardware and can
     *         only be launched within a VPC.
     *
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }
    
    /**
     * The tenancy of the Reserved Instance offering. A Reserved Instance
     * with tenancy of dedicated will run on single-tenant hardware and can
     * only be launched within a VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The tenancy of the Reserved Instance offering. A Reserved Instance
     *         with tenancy of dedicated will run on single-tenant hardware and can
     *         only be launched within a VPC.
     *
     * @see Tenancy
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The tenancy of the Reserved Instance offering. A Reserved Instance
     *         with tenancy of dedicated will run on single-tenant hardware and can
     *         only be launched within a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Tenancy
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * The tenancy of the Reserved Instance offering. A Reserved Instance
     * with tenancy of dedicated will run on single-tenant hardware and can
     * only be launched within a VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The tenancy of the Reserved Instance offering. A Reserved Instance
     *         with tenancy of dedicated will run on single-tenant hardware and can
     *         only be launched within a VPC.
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }
    
    /**
     * The tenancy of the Reserved Instance offering. A Reserved Instance
     * with tenancy of dedicated will run on single-tenant hardware and can
     * only be launched within a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The tenancy of the Reserved Instance offering. A Reserved Instance
     *         with tenancy of dedicated will run on single-tenant hardware and can
     *         only be launched within a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Tenancy
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
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
    public DescribeReservedInstancesOfferingsRequest withOfferingType(String offeringType) {
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
    public DescribeReservedInstancesOfferingsRequest withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * Returns the value of the NextToken property for this object.
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     *
     * @param nextToken The new value for the NextToken property for this object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The new value for the NextToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns the value of the MaxResults property for this object.
     *
     * @return The value of the MaxResults property for this object.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * Sets the value of the MaxResults property for this object.
     *
     * @param maxResults The new value for the MaxResults property for this object.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * Sets the value of the MaxResults property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The new value for the MaxResults property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Include Marketplace offerings in the response.
     *
     * @return Include Marketplace offerings in the response.
     */
    public Boolean isIncludeMarketplace() {
        return includeMarketplace;
    }
    
    /**
     * Include Marketplace offerings in the response.
     *
     * @param includeMarketplace Include Marketplace offerings in the response.
     */
    public void setIncludeMarketplace(Boolean includeMarketplace) {
        this.includeMarketplace = includeMarketplace;
    }
    
    /**
     * Include Marketplace offerings in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeMarketplace Include Marketplace offerings in the response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withIncludeMarketplace(Boolean includeMarketplace) {
        this.includeMarketplace = includeMarketplace;
        return this;
    }

    /**
     * Include Marketplace offerings in the response.
     *
     * @return Include Marketplace offerings in the response.
     */
    public Boolean getIncludeMarketplace() {
        return includeMarketplace;
    }

    /**
     * Minimum duration (in seconds) to filter when searching for offerings.
     *
     * @return Minimum duration (in seconds) to filter when searching for offerings.
     */
    public Long getMinDuration() {
        return minDuration;
    }
    
    /**
     * Minimum duration (in seconds) to filter when searching for offerings.
     *
     * @param minDuration Minimum duration (in seconds) to filter when searching for offerings.
     */
    public void setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
    }
    
    /**
     * Minimum duration (in seconds) to filter when searching for offerings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minDuration Minimum duration (in seconds) to filter when searching for offerings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }

    /**
     * Maximum duration (in seconds) to filter when searching for offerings.
     *
     * @return Maximum duration (in seconds) to filter when searching for offerings.
     */
    public Long getMaxDuration() {
        return maxDuration;
    }
    
    /**
     * Maximum duration (in seconds) to filter when searching for offerings.
     *
     * @param maxDuration Maximum duration (in seconds) to filter when searching for offerings.
     */
    public void setMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
    }
    
    /**
     * Maximum duration (in seconds) to filter when searching for offerings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxDuration Maximum duration (in seconds) to filter when searching for offerings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * Returns the value of the MaxInstanceCount property for this object.
     *
     * @return The value of the MaxInstanceCount property for this object.
     */
    public Integer getMaxInstanceCount() {
        return maxInstanceCount;
    }
    
    /**
     * Sets the value of the MaxInstanceCount property for this object.
     *
     * @param maxInstanceCount The new value for the MaxInstanceCount property for this object.
     */
    public void setMaxInstanceCount(Integer maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
    }
    
    /**
     * Sets the value of the MaxInstanceCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxInstanceCount The new value for the MaxInstanceCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withMaxInstanceCount(Integer maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeReservedInstancesOfferingsRequest> getDryRunRequest() {
        Request<DescribeReservedInstancesOfferingsRequest> request = new DescribeReservedInstancesOfferingsRequestMarshaller().marshall(this);
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
        if (getReservedInstancesOfferingIds() != null) sb.append("ReservedInstancesOfferingIds: " + getReservedInstancesOfferingIds() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getInstanceTenancy() != null) sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (isIncludeMarketplace() != null) sb.append("IncludeMarketplace: " + isIncludeMarketplace() + ",");
        if (getMinDuration() != null) sb.append("MinDuration: " + getMinDuration() + ",");
        if (getMaxDuration() != null) sb.append("MaxDuration: " + getMaxDuration() + ",");
        if (getMaxInstanceCount() != null) sb.append("MaxInstanceCount: " + getMaxInstanceCount() );
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((isIncludeMarketplace() == null) ? 0 : isIncludeMarketplace().hashCode()); 
        hashCode = prime * hashCode + ((getMinDuration() == null) ? 0 : getMinDuration().hashCode()); 
        hashCode = prime * hashCode + ((getMaxDuration() == null) ? 0 : getMaxDuration().hashCode()); 
        hashCode = prime * hashCode + ((getMaxInstanceCount() == null) ? 0 : getMaxInstanceCount().hashCode()); 
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
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.isIncludeMarketplace() == null ^ this.isIncludeMarketplace() == null) return false;
        if (other.isIncludeMarketplace() != null && other.isIncludeMarketplace().equals(this.isIncludeMarketplace()) == false) return false; 
        if (other.getMinDuration() == null ^ this.getMinDuration() == null) return false;
        if (other.getMinDuration() != null && other.getMinDuration().equals(this.getMinDuration()) == false) return false; 
        if (other.getMaxDuration() == null ^ this.getMaxDuration() == null) return false;
        if (other.getMaxDuration() != null && other.getMaxDuration().equals(this.getMaxDuration()) == false) return false; 
        if (other.getMaxInstanceCount() == null ^ this.getMaxInstanceCount() == null) return false;
        if (other.getMaxInstanceCount() != null && other.getMaxInstanceCount().equals(this.getMaxInstanceCount()) == false) return false; 
        return true;
    }
    
}
    