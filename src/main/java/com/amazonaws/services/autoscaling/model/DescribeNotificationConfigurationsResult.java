/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The output of the DescribeNotificationConfigurations action.
 * </p>
 */
public class DescribeNotificationConfigurationsResult {

    /**
     * The list of notification configurations.
     */
    private java.util.List<NotificationConfiguration> notificationConfigurations;

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
            notificationConfigurations = new java.util.ArrayList<NotificationConfiguration>();
        }
        return notificationConfigurations;
    }
    
    /**
     * The list of notification configurations.
     *
     * @param notificationConfigurations The list of notification configurations.
     */
    public void setNotificationConfigurations(java.util.Collection<NotificationConfiguration> notificationConfigurations) {
        java.util.List<NotificationConfiguration> notificationConfigurationsCopy = new java.util.ArrayList<NotificationConfiguration>();
        if (notificationConfigurations != null) {
            notificationConfigurationsCopy.addAll(notificationConfigurations);
        }
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
        if (getNotificationConfigurations() == null) setNotificationConfigurations(new java.util.ArrayList<NotificationConfiguration>());
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
        java.util.List<NotificationConfiguration> notificationConfigurationsCopy = new java.util.ArrayList<NotificationConfiguration>();
        if (notificationConfigurations != null) {
            notificationConfigurationsCopy.addAll(notificationConfigurations);
        }
        this.notificationConfigurations = notificationConfigurationsCopy;

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
        sb.append("NotificationConfigurations: " + notificationConfigurations + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    