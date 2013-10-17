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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeNotificationConfigurations(DescribeNotificationConfigurationsRequest) DescribeNotificationConfigurations operation}.
 * <p>
 * Returns a list of notification actions associated with Auto Scaling groups for specified events.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeNotificationConfigurations(DescribeNotificationConfigurationsRequest)
 */
public class DescribeNotificationConfigurationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> autoScalingGroupNames;

    /**
     * A string that is used to mark the start of the next batch of returned
     * results for pagination.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * Maximum number of records to be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxRecords;

    /**
     * The name of the Auto Scaling group.
     *
     * @return The name of the Auto Scaling group.
     */
    public java.util.List<String> getAutoScalingGroupNames() {
        if (autoScalingGroupNames == null) {
              autoScalingGroupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              autoScalingGroupNames.setAutoConstruct(true);
        }
        return autoScalingGroupNames;
    }
    
    /**
     * The name of the Auto Scaling group.
     *
     * @param autoScalingGroupNames The name of the Auto Scaling group.
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
     * The name of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupNames The name of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNotificationConfigurationsRequest withAutoScalingGroupNames(String... autoScalingGroupNames) {
        if (getAutoScalingGroupNames() == null) setAutoScalingGroupNames(new java.util.ArrayList<String>(autoScalingGroupNames.length));
        for (String value : autoScalingGroupNames) {
            getAutoScalingGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupNames The name of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNotificationConfigurationsRequest withAutoScalingGroupNames(java.util.Collection<String> autoScalingGroupNames) {
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
     * A string that is used to mark the start of the next batch of returned
     * results for pagination.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A string that is used to mark the start of the next batch of returned
     *         results for pagination.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string that is used to mark the start of the next batch of returned
     * results for pagination.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that is used to mark the start of the next batch of returned
     *         results for pagination.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string that is used to mark the start of the next batch of returned
     * results for pagination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that is used to mark the start of the next batch of returned
     *         results for pagination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNotificationConfigurationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Maximum number of records to be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return Maximum number of records to be returned.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * Maximum number of records to be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxRecords Maximum number of records to be returned.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * Maximum number of records to be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxRecords Maximum number of records to be returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNotificationConfigurationsRequest withMaxRecords(Integer maxRecords) {
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

        if (obj instanceof DescribeNotificationConfigurationsRequest == false) return false;
        DescribeNotificationConfigurationsRequest other = (DescribeNotificationConfigurationsRequest)obj;
        
        if (other.getAutoScalingGroupNames() == null ^ this.getAutoScalingGroupNames() == null) return false;
        if (other.getAutoScalingGroupNames() != null && other.getAutoScalingGroupNames().equals(this.getAutoScalingGroupNames()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        return true;
    }
    
}
    