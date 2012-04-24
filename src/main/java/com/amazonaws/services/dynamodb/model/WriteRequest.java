/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;

/**
 * <p>
 * This structure is a Union of PutRequest and DeleteRequest. It can
 * contain exactly one of <code>PutRequest</code> or
 * <code>DeleteRequest</code> . Never Both. This is enforced in the code.
 * </p>
 */
public class WriteRequest {

    /**
     * A container for a Put BatchWrite request
     */
    private PutRequest putRequest;

    /**
     * A container for a Delete BatchWrite request
     */
    private DeleteRequest deleteRequest;

    /**
     * A container for a Put BatchWrite request
     *
     * @return A container for a Put BatchWrite request
     */
    public PutRequest getPutRequest() {
        return putRequest;
    }
    
    /**
     * A container for a Put BatchWrite request
     *
     * @param putRequest A container for a Put BatchWrite request
     */
    public void setPutRequest(PutRequest putRequest) {
        this.putRequest = putRequest;
    }
    
    /**
     * A container for a Put BatchWrite request
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param putRequest A container for a Put BatchWrite request
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public WriteRequest withPutRequest(PutRequest putRequest) {
        this.putRequest = putRequest;
        return this;
    }
    
    
    /**
     * A container for a Delete BatchWrite request
     *
     * @return A container for a Delete BatchWrite request
     */
    public DeleteRequest getDeleteRequest() {
        return deleteRequest;
    }
    
    /**
     * A container for a Delete BatchWrite request
     *
     * @param deleteRequest A container for a Delete BatchWrite request
     */
    public void setDeleteRequest(DeleteRequest deleteRequest) {
        this.deleteRequest = deleteRequest;
    }
    
    /**
     * A container for a Delete BatchWrite request
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteRequest A container for a Delete BatchWrite request
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public WriteRequest withDeleteRequest(DeleteRequest deleteRequest) {
        this.deleteRequest = deleteRequest;
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
        if (putRequest != null) sb.append("PutRequest: " + putRequest + ", ");
        if (deleteRequest != null) sb.append("DeleteRequest: " + deleteRequest + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPutRequest() == null) ? 0 : getPutRequest().hashCode()); 
        hashCode = prime * hashCode + ((getDeleteRequest() == null) ? 0 : getDeleteRequest().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof WriteRequest == false) return false;
        WriteRequest other = (WriteRequest)obj;
        
        if (other.getPutRequest() == null ^ this.getPutRequest() == null) return false;
        if (other.getPutRequest() != null && other.getPutRequest().equals(this.getPutRequest()) == false) return false; 
        if (other.getDeleteRequest() == null ^ this.getDeleteRequest() == null) return false;
        if (other.getDeleteRequest() != null && other.getDeleteRequest().equals(this.getDeleteRequest()) == false) return false; 
        return true;
    }
    
}
    