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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeEventCategories(DescribeEventCategoriesRequest) DescribeEventCategories operation}.
 * <p>
 * Displays a list of event categories for all event source types, or for a specified source type. For a list of the event categories and source types,
 * go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html"> Amazon Redshift Event Notifications </a> .
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeEventCategories(DescribeEventCategoriesRequest)
 */
public class DescribeEventCategoriesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The source type, such as cluster or parameter group, to which the
     * described event categories apply. <p> Valid values: cluster, snapshot,
     * parameter group, and security group.
     */
    private String sourceType;

    /**
     * The source type, such as cluster or parameter group, to which the
     * described event categories apply. <p> Valid values: cluster, snapshot,
     * parameter group, and security group.
     *
     * @return The source type, such as cluster or parameter group, to which the
     *         described event categories apply. <p> Valid values: cluster, snapshot,
     *         parameter group, and security group.
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The source type, such as cluster or parameter group, to which the
     * described event categories apply. <p> Valid values: cluster, snapshot,
     * parameter group, and security group.
     *
     * @param sourceType The source type, such as cluster or parameter group, to which the
     *         described event categories apply. <p> Valid values: cluster, snapshot,
     *         parameter group, and security group.
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The source type, such as cluster or parameter group, to which the
     * described event categories apply. <p> Valid values: cluster, snapshot,
     * parameter group, and security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceType The source type, such as cluster or parameter group, to which the
     *         described event categories apply. <p> Valid values: cluster, snapshot,
     *         parameter group, and security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventCategoriesRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
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
        if (getSourceType() != null) sb.append("SourceType: " + getSourceType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEventCategoriesRequest == false) return false;
        DescribeEventCategoriesRequest other = (DescribeEventCategoriesRequest)obj;
        
        if (other.getSourceType() == null ^ this.getSourceType() == null) return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false) return false; 
        return true;
    }
    
}
    