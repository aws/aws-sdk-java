/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an Auto Scaling group.
 * </p>
 */
public class AutoScalingGroup implements Serializable {

    /**
     * The Auto Scaling group name.
     */
    private String name;

    /**
     * An Auto Scaling lifecycle event hook name.
     */
    private String hook;

    /**
     * The Auto Scaling group name.
     *
     * @return The Auto Scaling group name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The Auto Scaling group name.
     *
     * @param name The Auto Scaling group name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The Auto Scaling group name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The Auto Scaling group name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * An Auto Scaling lifecycle event hook name.
     *
     * @return An Auto Scaling lifecycle event hook name.
     */
    public String getHook() {
        return hook;
    }
    
    /**
     * An Auto Scaling lifecycle event hook name.
     *
     * @param hook An Auto Scaling lifecycle event hook name.
     */
    public void setHook(String hook) {
        this.hook = hook;
    }
    
    /**
     * An Auto Scaling lifecycle event hook name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hook An Auto Scaling lifecycle event hook name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AutoScalingGroup withHook(String hook) {
        this.hook = hook;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getHook() != null) sb.append("Hook: " + getHook() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getHook() == null) ? 0 : getHook().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AutoScalingGroup == false) return false;
        AutoScalingGroup other = (AutoScalingGroup)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getHook() == null ^ this.getHook() == null) return false;
        if (other.getHook() != null && other.getHook().equals(this.getHook()) == false) return false; 
        return true;
    }
    
}
    