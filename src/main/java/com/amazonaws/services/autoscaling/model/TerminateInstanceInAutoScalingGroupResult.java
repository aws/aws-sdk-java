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
 * The output for the TerminateInstanceInAutoScalingGroup action.
 * </p>
 */
public class TerminateInstanceInAutoScalingGroupResult implements Serializable {

    /**
     * A scaling Activity.
     */
    private Activity activity;

    /**
     * A scaling Activity.
     *
     * @return A scaling Activity.
     */
    public Activity getActivity() {
        return activity;
    }
    
    /**
     * A scaling Activity.
     *
     * @param activity A scaling Activity.
     */
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    
    /**
     * A scaling Activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activity A scaling Activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateInstanceInAutoScalingGroupResult withActivity(Activity activity) {
        this.activity = activity;
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
        if (getActivity() != null) sb.append("Activity: " + getActivity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getActivity() == null) ? 0 : getActivity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TerminateInstanceInAutoScalingGroupResult == false) return false;
        TerminateInstanceInAutoScalingGroupResult other = (TerminateInstanceInAutoScalingGroupResult)obj;
        
        if (other.getActivity() == null ^ this.getActivity() == null) return false;
        if (other.getActivity() != null && other.getActivity().equals(this.getActivity()) == false) return false; 
        return true;
    }
    
}
    