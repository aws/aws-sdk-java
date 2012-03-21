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

/**
 * <p>
 * Provides details of the <code>RequestCancelActivityTask</code>
 * decision.
 * </p>
 */
public class RequestCancelActivityTaskDecisionAttributes {

    /**
     * The <code>activityId</code> of the activity task to be canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String activityId;

    /**
     * The <code>activityId</code> of the activity task to be canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The <code>activityId</code> of the activity task to be canceled.
     */
    public String getActivityId() {
        return activityId;
    }
    
    /**
     * The <code>activityId</code> of the activity task to be canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The <code>activityId</code> of the activity task to be canceled.
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    /**
     * The <code>activityId</code> of the activity task to be canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The <code>activityId</code> of the activity task to be canceled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RequestCancelActivityTaskDecisionAttributes withActivityId(String activityId) {
        this.activityId = activityId;
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
        if (activityId != null) sb.append("ActivityId: " + activityId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof RequestCancelActivityTaskDecisionAttributes == false) return false;
        RequestCancelActivityTaskDecisionAttributes other = (RequestCancelActivityTaskDecisionAttributes)obj;
        
        if (other.getActivityId() == null ^ this.getActivityId() == null) return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false) return false; 
        return true;
    }
    
}
    