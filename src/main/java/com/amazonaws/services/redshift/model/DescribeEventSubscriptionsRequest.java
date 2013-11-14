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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeEventSubscriptions(DescribeEventSubscriptionsRequest) DescribeEventSubscriptions operation}.
 * <p>
 * Lists descriptions of all the Amazon Redshift event notifications subscription for a customer account. If you specify a subscription name, lists the
 * description for that subscription.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeEventSubscriptions(DescribeEventSubscriptionsRequest)
 */
public class DescribeEventSubscriptionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the Amazon Redshift event notification subscription to be
     * described.
     */
    private String subscriptionName;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified MaxRecords value, a pagination token
     * called a marker is included in the response so that the remaining
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional pagination token provided by a previous
     * DescribeOrderableClusterOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by MaxRecords.
     */
    private String marker;

    /**
     * The name of the Amazon Redshift event notification subscription to be
     * described.
     *
     * @return The name of the Amazon Redshift event notification subscription to be
     *         described.
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }
    
    /**
     * The name of the Amazon Redshift event notification subscription to be
     * described.
     *
     * @param subscriptionName The name of the Amazon Redshift event notification subscription to be
     *         described.
     */
    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
    
    /**
     * The name of the Amazon Redshift event notification subscription to be
     * described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionName The name of the Amazon Redshift event notification subscription to be
     *         described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventSubscriptionsRequest withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified MaxRecords value, a pagination token
     * called a marker is included in the response so that the remaining
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified MaxRecords value, a pagination token
     *         called a marker is included in the response so that the remaining
     *         results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     *         maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified MaxRecords value, a pagination token
     * called a marker is included in the response so that the remaining
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified MaxRecords value, a pagination token
     *         called a marker is included in the response so that the remaining
     *         results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     *         maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified MaxRecords value, a pagination token
     * called a marker is included in the response so that the remaining
     * results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     * maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified MaxRecords value, a pagination token
     *         called a marker is included in the response so that the remaining
     *         results can be retrieved. <p>Default: 100 <p>Constraints: minimum 20,
     *         maximum 100
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventSubscriptionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional pagination token provided by a previous
     * DescribeOrderableClusterOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by MaxRecords.
     *
     * @return An optional pagination token provided by a previous
     *         DescribeOrderableClusterOptions request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by MaxRecords.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * DescribeOrderableClusterOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by MaxRecords.
     *
     * @param marker An optional pagination token provided by a previous
     *         DescribeOrderableClusterOptions request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by MaxRecords.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * DescribeOrderableClusterOptions request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by MaxRecords.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         DescribeOrderableClusterOptions request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by MaxRecords.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventSubscriptionsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getSubscriptionName() != null) sb.append("SubscriptionName: " + getSubscriptionName() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEventSubscriptionsRequest == false) return false;
        DescribeEventSubscriptionsRequest other = (DescribeEventSubscriptionsRequest)obj;
        
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null) return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    