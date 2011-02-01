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
 * The output for the TerminateInstanceInAutoScalingGroup action.
 * </p>
 */
public class TerminateInstanceInAutoScalingGroupResult {

    /**
     * A Scaling Activity.
     */
    private Activity activity;

    /**
     * A Scaling Activity.
     *
     * @return A Scaling Activity.
     */
    public Activity getActivity() {
        return activity;
    }
    
    /**
     * A Scaling Activity.
     *
     * @param activity A Scaling Activity.
     */
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    
    /**
     * A Scaling Activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activity A Scaling Activity.
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
        sb.append("Activity: " + activity + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    