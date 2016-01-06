/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#deleteEventSourceMapping(DeleteEventSourceMappingRequest) DeleteEventSourceMapping operation}.
 * <p>
 * Removes an event source mapping. This means AWS Lambda will no longer
 * invoke the function for events in the associated source.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:DeleteEventSourceMapping</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#deleteEventSourceMapping(DeleteEventSourceMappingRequest)
 */
public class DeleteEventSourceMappingRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The event source mapping ID.
     */
    private String uUID;

    /**
     * The event source mapping ID.
     *
     * @return The event source mapping ID.
     */
    public String getUUID() {
        return uUID;
    }
    
    /**
     * The event source mapping ID.
     *
     * @param uUID The event source mapping ID.
     */
    public void setUUID(String uUID) {
        this.uUID = uUID;
    }
    
    /**
     * The event source mapping ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uUID The event source mapping ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteEventSourceMappingRequest withUUID(String uUID) {
        this.uUID = uUID;
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
        if (getUUID() != null) sb.append("UUID: " + getUUID() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteEventSourceMappingRequest == false) return false;
        DeleteEventSourceMappingRequest other = (DeleteEventSourceMappingRequest)obj;
        
        if (other.getUUID() == null ^ this.getUUID() == null) return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteEventSourceMappingRequest clone() {
        
            return (DeleteEventSourceMappingRequest) super.clone();
    }

}
    