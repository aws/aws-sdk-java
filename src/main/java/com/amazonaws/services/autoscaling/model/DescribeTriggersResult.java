/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * </p>
 */
public class DescribeTriggersResult {

    /**
     * 
     */
    private java.util.List<Trigger> triggers;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<Trigger> getTriggers() {
        if (triggers == null) {
            triggers = new java.util.ArrayList<Trigger>();
        }
        return triggers;
    }
    
    /**
     * 
     *
     * @param triggers 
     */
    public void setTriggers(java.util.Collection<Trigger> triggers) {
        java.util.List<Trigger> triggersCopy = new java.util.ArrayList<Trigger>();
        if (triggers != null) {
            triggersCopy.addAll(triggers);
        }
        this.triggers = triggersCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param triggers 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTriggersResult withTriggers(Trigger... triggers) {
        for (Trigger value : triggers) {
            getTriggers().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param triggers 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTriggersResult withTriggers(java.util.Collection<Trigger> triggers) {
        java.util.List<Trigger> triggersCopy = new java.util.ArrayList<Trigger>();
        if (triggers != null) {
            triggersCopy.addAll(triggers);
        }
        this.triggers = triggersCopy;

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
        sb.append("Triggers: " + triggers + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    