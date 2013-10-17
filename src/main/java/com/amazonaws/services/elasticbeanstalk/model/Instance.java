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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * The description of an Amazon EC2 instance.
 * </p>
 */
public class Instance implements Serializable {

    /**
     * The ID of the Amazon EC2 instance.
     */
    private String id;

    /**
     * Default constructor for a new Instance object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Instance() {}
    
    /**
     * The ID of the Amazon EC2 instance.
     *
     * @return The ID of the Amazon EC2 instance.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the Amazon EC2 instance.
     *
     * @param id The ID of the Amazon EC2 instance.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the Amazon EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The ID of the Amazon EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withId(String id) {
        this.id = id;
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
        if (getId() != null) sb.append("Id: " + getId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Instance == false) return false;
        Instance other = (Instance)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    