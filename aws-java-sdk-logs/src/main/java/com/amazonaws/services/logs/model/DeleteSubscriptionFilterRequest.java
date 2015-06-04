/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#deleteSubscriptionFilter(DeleteSubscriptionFilterRequest) DeleteSubscriptionFilter operation}.
 * <p>
 * Deletes a subscription filter associated with the specified log
 * group.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#deleteSubscriptionFilter(DeleteSubscriptionFilterRequest)
 */
public class DeleteSubscriptionFilterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the log group that is associated with the subscription
     * filter to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * The name of the subscription filter to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String filterName;

    /**
     * The name of the log group that is associated with the subscription
     * filter to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The name of the log group that is associated with the subscription
     *         filter to delete.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * The name of the log group that is associated with the subscription
     * filter to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The name of the log group that is associated with the subscription
     *         filter to delete.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * The name of the log group that is associated with the subscription
     * filter to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The name of the log group that is associated with the subscription
     *         filter to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteSubscriptionFilterRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * The name of the subscription filter to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The name of the subscription filter to delete.
     */
    public String getFilterName() {
        return filterName;
    }
    
    /**
     * The name of the subscription filter to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName The name of the subscription filter to delete.
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }
    
    /**
     * The name of the subscription filter to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName The name of the subscription filter to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteSubscriptionFilterRequest withFilterName(String filterName) {
        this.filterName = filterName;
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
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getFilterName() != null) sb.append("FilterName: " + getFilterName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteSubscriptionFilterRequest == false) return false;
        DeleteSubscriptionFilterRequest other = (DeleteSubscriptionFilterRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getFilterName() == null ^ this.getFilterName() == null) return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteSubscriptionFilterRequest clone() {
        
            return (DeleteSubscriptionFilterRequest) super.clone();
    }

}
    