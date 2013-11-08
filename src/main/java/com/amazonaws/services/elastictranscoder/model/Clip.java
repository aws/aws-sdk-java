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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * Settings for one clip in a composition. All jobs in a playlist must have the same clip settings.
 * </p>
 */
public class Clip implements Serializable {

    /**
     * Settings that determine when a clip begins and how long it lasts.
     */
    private TimeSpan timeSpan;

    /**
     * Settings that determine when a clip begins and how long it lasts.
     *
     * @return Settings that determine when a clip begins and how long it lasts.
     */
    public TimeSpan getTimeSpan() {
        return timeSpan;
    }
    
    /**
     * Settings that determine when a clip begins and how long it lasts.
     *
     * @param timeSpan Settings that determine when a clip begins and how long it lasts.
     */
    public void setTimeSpan(TimeSpan timeSpan) {
        this.timeSpan = timeSpan;
    }
    
    /**
     * Settings that determine when a clip begins and how long it lasts.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeSpan Settings that determine when a clip begins and how long it lasts.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Clip withTimeSpan(TimeSpan timeSpan) {
        this.timeSpan = timeSpan;
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
        if (getTimeSpan() != null) sb.append("TimeSpan: " + getTimeSpan() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTimeSpan() == null) ? 0 : getTimeSpan().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Clip == false) return false;
        Clip other = (Clip)obj;
        
        if (other.getTimeSpan() == null ^ this.getTimeSpan() == null) return false;
        if (other.getTimeSpan() != null && other.getTimeSpan().equals(this.getTimeSpan()) == false) return false; 
        return true;
    }
    
}
    