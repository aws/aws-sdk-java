/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#describeActivityType(DescribeActivityTypeRequest) DescribeActivityType operation}.
 * <p>
 * Returns information about the specified activity type. This includes
 * configuration settings provided at registration time as well as other
 * general information about the type.
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#describeActivityType(DescribeActivityTypeRequest)
 */
public class DescribeActivityTypeRequest extends AmazonWebServiceRequest {

    /**
     * The name of the domain in which the activity type is registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * The activity type to describe.
     */
    private ActivityType activityType;

    /**
     * The name of the domain in which the activity type is registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain in which the activity type is registered.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain in which the activity type is registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which the activity type is registered.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain in which the activity type is registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which the activity type is registered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeActivityTypeRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    
    /**
     * The activity type to describe.
     *
     * @return The activity type to describe.
     */
    public ActivityType getActivityType() {
        return activityType;
    }
    
    /**
     * The activity type to describe.
     *
     * @param activityType The activity type to describe.
     */
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
    
    /**
     * The activity type to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityType The activity type to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeActivityTypeRequest withActivityType(ActivityType activityType) {
        this.activityType = activityType;
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
        if (domain != null) sb.append("Domain: " + domain + ", ");
        if (activityType != null) sb.append("ActivityType: " + activityType + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getActivityType() == null) ? 0 : getActivityType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeActivityTypeRequest == false) return false;
        DescribeActivityTypeRequest other = (DescribeActivityTypeRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getActivityType() == null ^ this.getActivityType() == null) return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false) return false; 
        return true;
    }
    
}
    