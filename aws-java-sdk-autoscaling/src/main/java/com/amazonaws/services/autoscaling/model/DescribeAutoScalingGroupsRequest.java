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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAutoScalingGroups(DescribeAutoScalingGroupsRequest) DescribeAutoScalingGroups operation}.
 * <p>
 * Describes one or more Auto Scaling groups. If a list of names is not
 * provided, the call describes all Auto Scaling groups.
 * </p>
 * <p>
 * You can specify a maximum number of items to be returned with a single
 * call. If there are more items to return, the call returns a token. To
 * get the next set of items, repeat the call with the returned token in
 * the <code>NextToken</code> parameter.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAutoScalingGroups(DescribeAutoScalingGroupsRequest)
 */
public class DescribeAutoScalingGroupsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The group names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroupNames;

    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * The maximum number of items to return with this call.
     */
    private Integer maxRecords;

    /**
     * The group names.
     *
     * @return The group names.
     */
    public java.util.List<String> getAutoScalingGroupNames() {
        if (autoScalingGroupNames == null) {
              autoScalingGroupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              autoScalingGroupNames.setAutoConstruct(true);
        }
        return autoScalingGroupNames;
    }
    
    /**
     * The group names.
     *
     * @param autoScalingGroupNames The group names.
     */
    public void setAutoScalingGroupNames(java.util.Collection<String> autoScalingGroupNames) {
        if (autoScalingGroupNames == null) {
            this.autoScalingGroupNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoScalingGroupNames.size());
        autoScalingGroupNamesCopy.addAll(autoScalingGroupNames);
        this.autoScalingGroupNames = autoScalingGroupNamesCopy;
    }
    
    /**
     * The group names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupNames The group names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAutoScalingGroupsRequest withAutoScalingGroupNames(String... autoScalingGroupNames) {
        if (getAutoScalingGroupNames() == null) setAutoScalingGroupNames(new java.util.ArrayList<String>(autoScalingGroupNames.length));
        for (String value : autoScalingGroupNames) {
            getAutoScalingGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * The group names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupNames The group names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAutoScalingGroupsRequest withAutoScalingGroupNames(java.util.Collection<String> autoScalingGroupNames) {
        if (autoScalingGroupNames == null) {
            this.autoScalingGroupNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoScalingGroupNames.size());
            autoScalingGroupNamesCopy.addAll(autoScalingGroupNames);
            this.autoScalingGroupNames = autoScalingGroupNamesCopy;
        }

        return this;
    }

    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAutoScalingGroupsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of items to return with this call.
     *
     * @return The maximum number of items to return with this call.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of items to return with this call.
     *
     * @param maxRecords The maximum number of items to return with this call.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of items to return with this call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of items to return with this call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAutoScalingGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        if (getAutoScalingGroupNames() != null) sb.append("AutoScalingGroupNames: " + getAutoScalingGroupNames() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupNames() == null) ? 0 : getAutoScalingGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAutoScalingGroupsRequest == false) return false;
        DescribeAutoScalingGroupsRequest other = (DescribeAutoScalingGroupsRequest)obj;
        
        if (other.getAutoScalingGroupNames() == null ^ this.getAutoScalingGroupNames() == null) return false;
        if (other.getAutoScalingGroupNames() != null && other.getAutoScalingGroupNames().equals(this.getAutoScalingGroupNames()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        return true;
    }
    
}
    