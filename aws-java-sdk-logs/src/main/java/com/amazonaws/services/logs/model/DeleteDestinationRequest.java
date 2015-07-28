/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#deleteDestination(DeleteDestinationRequest) DeleteDestination operation}.
 * <p>
 * Deletes the destination with the specified name and eventually
 * disables all the subscription filters that publish to it. This will
 * not delete the physical resource encapsulated by the destination.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#deleteDestination(DeleteDestinationRequest)
 */
public class DeleteDestinationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of destination to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String destinationName;

    /**
     * The name of destination to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The name of destination to delete.
     */
    public String getDestinationName() {
        return destinationName;
    }
    
    /**
     * The name of destination to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName The name of destination to delete.
     */
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }
    
    /**
     * The name of destination to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName The name of destination to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteDestinationRequest withDestinationName(String destinationName) {
        this.destinationName = destinationName;
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
        if (getDestinationName() != null) sb.append("DestinationName: " + getDestinationName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteDestinationRequest == false) return false;
        DeleteDestinationRequest other = (DeleteDestinationRequest)obj;
        
        if (other.getDestinationName() == null ^ this.getDestinationName() == null) return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteDestinationRequest clone() {
        
            return (DeleteDestinationRequest) super.clone();
    }

}
    