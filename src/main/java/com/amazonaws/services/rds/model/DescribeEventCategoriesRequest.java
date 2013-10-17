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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeEventCategories(DescribeEventCategoriesRequest) DescribeEventCategories operation}.
 * <p>
 * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories
 * and source types in the <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events </a> topic in the Amazon RDS User
 * Guide.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeEventCategories(DescribeEventCategoriesRequest)
 */
public class DescribeEventCategoriesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The type of source that will be generating the events. <p>Valid
     * values: db-instance | db-parameter-group | db-security-group |
     * db-snapshot
     */
    private String sourceType;

    /**
     * The type of source that will be generating the events. <p>Valid
     * values: db-instance | db-parameter-group | db-security-group |
     * db-snapshot
     *
     * @return The type of source that will be generating the events. <p>Valid
     *         values: db-instance | db-parameter-group | db-security-group |
     *         db-snapshot
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The type of source that will be generating the events. <p>Valid
     * values: db-instance | db-parameter-group | db-security-group |
     * db-snapshot
     *
     * @param sourceType The type of source that will be generating the events. <p>Valid
     *         values: db-instance | db-parameter-group | db-security-group |
     *         db-snapshot
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The type of source that will be generating the events. <p>Valid
     * values: db-instance | db-parameter-group | db-security-group |
     * db-snapshot
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceType The type of source that will be generating the events. <p>Valid
     *         values: db-instance | db-parameter-group | db-security-group |
     *         db-snapshot
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
    