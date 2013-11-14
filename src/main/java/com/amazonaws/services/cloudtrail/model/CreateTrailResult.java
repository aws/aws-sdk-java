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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;


/**
 * <p>
 * A JSON-formatted Trail object that represents the settings for the requested trail.
 * </p>
 */
public class CreateTrailResult implements Serializable {

    /**
     * Data type that represents the settings for a trail.
     */
    private Trail trail;

    /**
     * Data type that represents the settings for a trail.
     *
     * @return Data type that represents the settings for a trail.
     */
    public Trail getTrail() {
        return trail;
    }
    
    /**
     * Data type that represents the settings for a trail.
     *
     * @param trail Data type that represents the settings for a trail.
     */
    public void setTrail(Trail trail) {
        this.trail = trail;
    }
    
    /**
     * Data type that represents the settings for a trail.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trail Data type that represents the settings for a trail.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTrailResult withTrail(Trail trail) {
        this.trail = trail;
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
        if (getTrail() != null) sb.append("Trail: " + getTrail() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTrail() == null) ? 0 : getTrail().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTrailResult == false) return false;
        CreateTrailResult other = (CreateTrailResult)obj;
        
        if (other.getTrail() == null ^ this.getTrail() == null) return false;
        if (other.getTrail() != null && other.getTrail().equals(this.getTrail()) == false) return false; 
        return true;
    }
    
}
    