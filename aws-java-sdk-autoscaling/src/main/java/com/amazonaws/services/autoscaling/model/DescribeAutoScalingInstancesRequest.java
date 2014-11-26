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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAutoScalingInstances(DescribeAutoScalingInstancesRequest) DescribeAutoScalingInstances operation}.
 * <p>
 * Describes one or more Auto Scaling instances. If a list is not
 * provided, the call describes all instances.
 * </p>
 * <p>
 * You can describe up to a maximum of 50 instances with a single call.
 * By default, a call returns up to 20 instances. If there are more items
 * to return, the call returns a token. To get the next set of items,
 * repeat the call with the returned token in the <code>NextToken</code>
 * parameter.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAutoScalingInstances(DescribeAutoScalingInstancesRequest)
 */
public class DescribeAutoScalingInstancesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If
     * you specify an ID that does not exist, it is ignored with no error.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * The maximum number of items to return with this call.
     */
    private Integer maxRecords;

    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If
     * you specify an ID that does not exist, it is ignored with no error.
     *
     * @return One or more Auto Scaling instances to describe, up to 50 instances. If
     *         you omit this parameter, all Auto Scaling instances are described. If
     *         you specify an ID that does not exist, it is ignored with no error.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
              instanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceIds.setAutoConstruct(true);
        }
        return instanceIds;
    }
    
    /**
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If
     * you specify an ID that does not exist, it is ignored with no error.
     *
     * @param instanceIds One or more Auto Scaling instances to describe, up to 50 instances. If
     *         you omit this parameter, all Auto Scaling instances are described. If
     *         you specify an ID that does not exist, it is ignored with no error.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If
     * you specify an ID that does not exist, it is ignored with no error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds One or more Auto Scaling instances to describe, up to 50 instances. If
     *         you omit this parameter, all Auto Scaling instances are described. If
     *         you specify an ID that does not exist, it is ignored with no error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAutoScalingInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If
     * you specify an ID that does not exist, it is ignored with no error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds One or more Auto Scaling instances to describe, up to 50 instances. If
     *         you omit this parameter, all Auto Scaling instances are described. If
     *         you specify an ID that does not exist, it is ignored with no error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAutoScalingInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

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
    public DescribeAutoScalingInstancesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
    public DescribeAutoScalingInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAutoScalingInstancesRequest == false) return false;
        DescribeAutoScalingInstancesRequest other = (DescribeAutoScalingInstancesRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    