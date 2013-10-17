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


/**
 * <p>
 * The output of the DescribeNotificationConfigurations action.
 * </p>
 */
public class DescribeNotificationConfigurationsResult implements Serializable {

    /**
     * The list of notification configurations.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<NotificationConfiguration> notificationConfigurations;

    /**
     * A string that is used to mark the start of the next batch of returned
     * results for pagination.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * The list of notification configurations.
     *
     * @return The list of notification configurations.
     */
    public java.util.List<NotificationConfiguration> getNotificationConfigurations() {
        if (notificationConfigurations == null) {
              notificationConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<NotificationConfiguration>();
              notificationConfigurations.setAutoConstruct(true);
        }
        return notificationConfigurations;
    }
    
    /**
     * The list of notification configurations.
     *
     * @param notificationConfigurations The list of notification configurations.
     */
    public void setNotificationConfigurations(java.util.Collection<NotificationConfiguration> notificationConfigurations) {
        if (notificationConfigurations == null) {
            this.notificationConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NotificationConfiguration> notificationConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NotificationConfiguration>(notificationConfigurations.size());
        notificationConfigurationsCopy.addAll(notificationConfigurations);
        this.notificationConfigurations = notificationConfigurationsCopy;
    }
    
    /**
     * The list of notification configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationConfigurations The list of notification configurations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNotificationConfigurationsResult withNotificationConfigurations(NotificationConfiguration... notificationConfigurations) {
        if (getNotificationConfigurations() == null) setNotificationConfigurations(new java.util.ArrayList<NotificationConfiguration>(notificationConfigurations.length));
        for (NotificationConfiguration value : notificationConfigurations) {
            getNotificationConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * The list of notification configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationConfigurations The list of notification configurations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeNotificationConfigurationsResult withNotificationConfigurations(java.util.Collection<NotificationConfiguration> notificationConfigurations) {
        if (notificationConfigurations == null) {
            this.notificationConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NotificationConfiguration> notificationConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NotificationConfiguration>(notificationConfigurations.size());
            notificationConfigurationsCopy.addAll(notificationConfigurations);
            this.notificationConfigurations = notificationConfigurationsCopy;
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
    public DescribeNotificationConfigurationsResult withNextToken(String nextToken) {
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
        if (getNotificationConfigurations() != null) sb.append("NotificationConfigurations: " + getNotificationConfigurations() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNotificationConfigurations() == null) ? 0 : getNotificationConfigurations().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNotificationConfigurationsResult == false) return false;
        DescribeNotificationConfigurationsResult other = (DescribeNotificationConfigurationsResult)obj;
        
        if (other.getNotificationConfigurations() == null ^ this.getNotificationConfigurations() == null) return false;
        if (other.getNotificationConfigurations() != null && other.getNotificationConfigurations().equals(this.getNotificationConfigurations()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    