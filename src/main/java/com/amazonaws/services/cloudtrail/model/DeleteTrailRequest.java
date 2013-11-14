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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudtrail.AWSCloudTrail#deleteTrail(DeleteTrailRequest) DeleteTrail operation}.
 * <p>
 * Deletes a trail.
 * </p>
 *
 * @see com.amazonaws.services.cloudtrail.AWSCloudTrail#deleteTrail(DeleteTrailRequest)
 */
public class DeleteTrailRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of a trail to be deleted.
     */
    private String name;

    /**
     * The name of a trail to be deleted.
     *
     * @return The name of a trail to be deleted.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of a trail to be deleted.
     *
     * @param name The name of a trail to be deleted.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of a trail to be deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of a trail to be deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTrailRequest withName(String name) {
        this.name = name;
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
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteTrailRequest == false) return false;
        DeleteTrailRequest other = (DeleteTrailRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
}
    