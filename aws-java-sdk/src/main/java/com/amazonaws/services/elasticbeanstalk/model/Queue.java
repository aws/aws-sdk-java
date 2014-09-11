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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a queue.
 * </p>
 */
public class Queue implements Serializable {

    /**
     * The name of the queue.
     */
    private String name;

    /**
     * The URL of the queue.
     */
    private String uRL;

    /**
     * The name of the queue.
     *
     * @return The name of the queue.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the queue.
     *
     * @param name The name of the queue.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the queue.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Queue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The URL of the queue.
     *
     * @return The URL of the queue.
     */
    public String getURL() {
        return uRL;
    }
    
    /**
     * The URL of the queue.
     *
     * @param uRL The URL of the queue.
     */
    public void setURL(String uRL) {
        this.uRL = uRL;
    }
    
    /**
     * The URL of the queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uRL The URL of the queue.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Queue withURL(String uRL) {
        this.uRL = uRL;
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
        if (getURL() != null) sb.append("URL: " + getURL() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getURL() == null) ? 0 : getURL().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Queue == false) return false;
        Queue other = (Queue)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getURL() == null ^ this.getURL() == null) return false;
        if (other.getURL() != null && other.getURL().equals(this.getURL()) == false) return false; 
        return true;
    }
    
}
    