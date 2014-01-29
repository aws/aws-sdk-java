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
import com.amazonaws.services.ec2.model.transform.DescribeSpotPriceHistoryRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotPriceHistory(DescribeSpotPriceHistoryRequest) DescribeSpotPriceHistory operation}.
 * <p>
 * Describes the Spot Price history. Spot Instances are instances that Amazon EC2 starts on your behalf when the maximum price that you specify exceeds
 * the current Spot Price. Amazon EC2 periodically sets the Spot Price based on available Spot Instance capacity and current Spot Instance requests. For
 * more information about Spot Instances, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * When you specify an Availability Zone, this operation describes the price history for the specified Availability Zone with the most recent set of
 * prices listed first. If you don't specify an Availability Zone, you get the prices across all Availability Zones, starting with the most recent set.
 * However, if you're using an API version earlier than 2011-05-15, you get the lowest price across the region for the specified time period. The prices
 * returned are listed in chronological order, from the oldest to the most recent.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotPriceHistory(DescribeSpotPriceHistoryRequest)
 */
public class DescribeSpotPriceHistoryRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSpotPriceHistoryRequest> {

    /**
     * The start date and time of the Spot Price history data.
     */
    private java.util.Date startTime;

    /**
     * The end date and time of the Spot Price history data.
     */
    private java.util.Date endTime;

    /**
     * One or more instance types.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceTypes;

    /**
     * One or more basic product descriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> productDescriptions;

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m1.small</code>). </li> <li> <p><code>product-description</code>
     * - The product description for the Spot Price (<code>Linux/UNIX</code>
     * | <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX
     * (Amazon VPC)</code> | <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Windows (Amazon VPC)</code>). </li> <li>
     * <p><code>spot-price</code> - The Spot Price. The value must match
     * exactly (or use wildcards; greater than or less than comparison is not
     * supported). </li> <li> <p><code>timestamp</code> - The timestamp of
     * the Spot Price history (for example, 2010-08-16T05:06:11.000Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The Availability Zone.
     */
    private String availabilityZone;

    /**
     * The number of rows to return.
     */
    private Integer maxResults;

    /**
     * The next set of rows to return.
     */
    private String nextToken;

    /**
     * The start date and time of the Spot Price history data.
     *
     * @return The start date and time of the Spot Price history data.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The start date and time of the Spot Price history data.
     *
     * @param startTime The start date and time of the Spot Price history data.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The start date and time of the Spot Price history data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The start date and time of the Spot Price history data.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The end date and time of the Spot Price history data.
     *
     * @return The end date and time of the Spot Price history data.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The end date and time of the Spot Price history data.
     *
     * @param endTime The end date and time of the Spot Price history data.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The end date and time of the Spot Price history data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The end date and time of the Spot Price history data.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * One or more instance types.
     *
     * @return One or more instance types.
     */
    public java.util.List<String> getInstanceTypes() {
        if (instanceTypes == null) {
              instanceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceTypes.setAutoConstruct(true);
        }
        return instanceTypes;
    }
    
    /**
     * One or more instance types.
     *
     * @param instanceTypes One or more instance types.
     */
    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceTypes.size());
        instanceTypesCopy.addAll(instanceTypes);
        this.instanceTypes = instanceTypesCopy;
    }
    
    /**
     * One or more instance types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTypes One or more instance types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(String... instanceTypes) {
        if (getInstanceTypes() == null) setInstanceTypes(new java.util.ArrayList<String>(instanceTypes.length));
        for (String value : instanceTypes) {
            getInstanceTypes().add(value);
        }
        return this;
    }
    
    /**
     * One or more instance types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTypes One or more instance types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceTypes.size());
            instanceTypesCopy.addAll(instanceTypes);
            this.instanceTypes = instanceTypesCopy;
        }

        return this;
    }

    /**
     * One or more instance types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTypes One or more instance types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(InstanceType... instanceTypes) {
        java.util.ArrayList<String> instanceTypesCopy = new java.util.ArrayList<String>(instanceTypes.length);
        for (InstanceType member : instanceTypes) {
            instanceTypesCopy.add(member.toString());
        }
        if (getInstanceTypes() == null) {
            setInstanceTypes(instanceTypesCopy);
        } else {
            getInstanceTypes().addAll(instanceTypesCopy);
        }
        return this;
    }

    /**
     * One or more basic product descriptions.
     *
     * @return One or more basic product descriptions.
     */
    public java.util.List<String> getProductDescriptions() {
        if (productDescriptions == null) {
              productDescriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              productDescriptions.setAutoConstruct(true);
        }
        return productDescriptions;
    }
    
    /**
     * One or more basic product descriptions.
     *
     * @param productDescriptions One or more basic product descriptions.
     */
    public void setProductDescriptions(java.util.Collection<String> productDescriptions) {
        if (productDescriptions == null) {
            this.productDescriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> productDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(productDescriptions.size());
        productDescriptionsCopy.addAll(productDescriptions);
        this.productDescriptions = productDescriptionsCopy;
    }
    
    /**
     * One or more basic product descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescriptions One or more basic product descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withProductDescriptions(String... productDescriptions) {
        if (getProductDescriptions() == null) setProductDescriptions(new java.util.ArrayList<String>(productDescriptions.length));
        for (String value : productDescriptions) {
            getProductDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * One or more basic product descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescriptions One or more basic product descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withProductDescriptions(java.util.Collection<String> productDescriptions) {
        if (productDescriptions == null) {
            this.productDescriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> productDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(productDescriptions.size());
            productDescriptionsCopy.addAll(productDescriptions);
            this.productDescriptions = productDescriptionsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m1.small</code>). </li> <li> <p><code>product-description</code>
     * - The product description for the Spot Price (<code>Linux/UNIX</code>
     * | <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX
     * (Amazon VPC)</code> | <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Windows (Amazon VPC)</code>). </li> <li>
     * <p><code>spot-price</code> - The Spot Price. The value must match
     * exactly (or use wildcards; greater than or less than comparison is not
     * supported). </li> <li> <p><code>timestamp</code> - The timestamp of
     * the Spot Price history (for example, 2010-08-16T05:06:11.000Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone for which prices should be returned. </li> <li>
     *         <p><code>instance-type</code> - The type of instance (for example,
     *         <code>m1.small</code>). </li> <li> <p><code>product-description</code>
     *         - The product description for the Spot Price (<code>Linux/UNIX</code>
     *         | <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX
     *         (Amazon VPC)</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *         <code>Windows (Amazon VPC)</code>). </li> <li>
     *         <p><code>spot-price</code> - The Spot Price. The value must match
     *         exactly (or use wildcards; greater than or less than comparison is not
     *         supported). </li> <li> <p><code>timestamp</code> - The timestamp of
     *         the Spot Price history (for example, 2010-08-16T05:06:11.000Z). You
     *         can use wildcards (* and ?). Greater than or less than comparison is
     *         not supported. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m1.small</code>). </li> <li> <p><code>product-description</code>
     * - The product description for the Spot Price (<code>Linux/UNIX</code>
     * | <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX
     * (Amazon VPC)</code> | <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Windows (Amazon VPC)</code>). </li> <li>
     * <p><code>spot-price</code> - The Spot Price. The value must match
     * exactly (or use wildcards; greater than or less than comparison is not
     * supported). </li> <li> <p><code>timestamp</code> - The timestamp of
     * the Spot Price history (for example, 2010-08-16T05:06:11.000Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone for which prices should be returned. </li> <li>
     *         <p><code>instance-type</code> - The type of instance (for example,
     *         <code>m1.small</code>). </li> <li> <p><code>product-description</code>
     *         - The product description for the Spot Price (<code>Linux/UNIX</code>
     *         | <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX
     *         (Amazon VPC)</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *         <code>Windows (Amazon VPC)</code>). </li> <li>
     *         <p><code>spot-price</code> - The Spot Price. The value must match
     *         exactly (or use wildcards; greater than or less than comparison is not
     *         supported). </li> <li> <p><code>timestamp</code> - The timestamp of
     *         the Spot Price history (for example, 2010-08-16T05:06:11.000Z). You
     *         can use wildcards (* and ?). Greater than or less than comparison is
     *         not supported. </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m1.small</code>). </li> <li> <p><code>product-description</code>
     * - The product description for the Spot Price (<code>Linux/UNIX</code>
     * | <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX
     * (Amazon VPC)</code> | <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Windows (Amazon VPC)</code>). </li> <li>
     * <p><code>spot-price</code> - The Spot Price. The value must match
     * exactly (or use wildcards; greater than or less than comparison is not
     * supported). </li> <li> <p><code>timestamp</code> - The timestamp of
     * the Spot Price history (for example, 2010-08-16T05:06:11.000Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone for which prices should be returned. </li> <li>
     *         <p><code>instance-type</code> - The type of instance (for example,
     *         <code>m1.small</code>). </li> <li> <p><code>product-description</code>
     *         - The product description for the Spot Price (<code>Linux/UNIX</code>
     *         | <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX
     *         (Amazon VPC)</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *         <code>Windows (Amazon VPC)</code>). </li> <li>
     *         <p><code>spot-price</code> - The Spot Price. The value must match
     *         exactly (or use wildcards; greater than or less than comparison is not
     *         supported). </li> <li> <p><code>timestamp</code> - The timestamp of
     *         the Spot Price history (for example, 2010-08-16T05:06:11.000Z). You
     *         can use wildcards (* and ?). Greater than or less than comparison is
     *         not supported. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m1.small</code>). </li> <li> <p><code>product-description</code>
     * - The product description for the Spot Price (<code>Linux/UNIX</code>
     * | <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX
     * (Amazon VPC)</code> | <code>SUSE Linux (Amazon VPC)</code> |
     * <code>Windows (Amazon VPC)</code>). </li> <li>
     * <p><code>spot-price</code> - The Spot Price. The value must match
     * exactly (or use wildcards; greater than or less than comparison is not
     * supported). </li> <li> <p><code>timestamp</code> - The timestamp of
     * the Spot Price history (for example, 2010-08-16T05:06:11.000Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone for which prices should be returned. </li> <li>
     *         <p><code>instance-type</code> - The type of instance (for example,
     *         <code>m1.small</code>). </li> <li> <p><code>product-description</code>
     *         - The product description for the Spot Price (<code>Linux/UNIX</code>
     *         | <code>SUSE Linux</code> | <code>Windows</code> | <code>Linux/UNIX
     *         (Amazon VPC)</code> | <code>SUSE Linux (Amazon VPC)</code> |
     *         <code>Windows (Amazon VPC)</code>). </li> <li>
     *         <p><code>spot-price</code> - The Spot Price. The value must match
     *         exactly (or use wildcards; greater than or less than comparison is not
     *         supported). </li> <li> <p><code>timestamp</code> - The timestamp of
     *         the Spot Price history (for example, 2010-08-16T05:06:11.000Z). You
     *         can use wildcards (* and ?). Greater than or less than comparison is
     *         not supported. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The Availability Zone.
     *
     * @return The Availability Zone.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone.
     *
     * @param availabilityZone The Availability Zone.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The number of rows to return.
     *
     * @return The number of rows to return.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The number of rows to return.
     *
     * @param maxResults The number of rows to return.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The number of rows to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The number of rows to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The next set of rows to return.
     *
     * @return The next set of rows to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The next set of rows to return.
     *
     * @param nextToken The next set of rows to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The next set of rows to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The next set of rows to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotPriceHistoryRequest> getDryRunRequest() {
        Request<DescribeSpotPriceHistoryRequest> request = new DescribeSpotPriceHistoryRequestMarshaller().marshall(this);
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
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getInstanceTypes() != null) sb.append("InstanceTypes: " + getInstanceTypes() + ",");
        if (getProductDescriptions() != null) sb.append("ProductDescriptions: " + getProductDescriptions() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescriptions() == null) ? 0 : getProductDescriptions().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotPriceHistoryRequest == false) return false;
        DescribeSpotPriceHistoryRequest other = (DescribeSpotPriceHistoryRequest)obj;
        
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null) return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false) return false; 
        if (other.getProductDescriptions() == null ^ this.getProductDescriptions() == null) return false;
        if (other.getProductDescriptions() != null && other.getProductDescriptions().equals(this.getProductDescriptions()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    