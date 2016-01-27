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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#getEventSourceMapping(GetEventSourceMappingRequest) GetEventSourceMapping operation}.
 * <p>
 * Returns configuration information for the specified event source
 * mapping (see CreateEventSourceMapping).
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:GetEventSourceMapping</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#getEventSourceMapping(GetEventSourceMappingRequest)
 */
public class GetEventSourceMappingRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The AWS Lambda assigned ID of the event source mapping.
     */
    private String uUID;

    /**
     * The AWS Lambda assigned ID of the event source mapping.
     *
     * @return The AWS Lambda assigned ID of the event source mapping.
     */
    public String getUUID() {
        return uUID;
    }
    
    /**
     * The AWS Lambda assigned ID of the event source mapping.
     *
     * @param uUID The AWS Lambda assigned ID of the event source mapping.
     */
    public void setUUID(String uUID) {
        this.uUID = uUID;
    }
    
    /**
     * The AWS Lambda assigned ID of the event source mapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uUID The AWS Lambda assigned ID of the event source mapping.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEventSourceMappingRequest withUUID(String uUID) {
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

        if (obj instanceof GetEventSourceMappingRequest == false) return false;
        GetEventSourceMappingRequest other = (GetEventSourceMappingRequest)obj;
        
        if (other.getUUID() == null ^ this.getUUID() == null) return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false) return false; 
        return true;
    }
    
    @Override
    public GetEventSourceMappingRequest clone() {
        
            return (GetEventSourceMappingRequest) super.clone();
    }

}
    