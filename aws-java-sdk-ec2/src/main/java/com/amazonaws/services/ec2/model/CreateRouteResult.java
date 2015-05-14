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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateRouteResult implements Serializable, Cloneable {

    /**
     * Returns <code>true</code> if the request succeeds; otherwise, it
     * returns an error.
     */
    private Boolean returnValue;

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     */
    private String clientToken;

    /**
     * Returns <code>true</code> if the request succeeds; otherwise, it
     * returns an error.
     *
     * @return Returns <code>true</code> if the request succeeds; otherwise, it
     *         returns an error.
     */
    public Boolean isReturn() {
        return returnValue;
    }
    
    /**
     * Returns <code>true</code> if the request succeeds; otherwise, it
     * returns an error.
     *
     * @param returnValue Returns <code>true</code> if the request succeeds; otherwise, it
     *         returns an error.
     */
    public void setReturn(Boolean returnValue) {
        this.returnValue = returnValue;
    }
    
    /**
     * Returns <code>true</code> if the request succeeds; otherwise, it
     * returns an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param returnValue Returns <code>true</code> if the request succeeds; otherwise, it
     *         returns an error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateRouteResult withReturn(Boolean returnValue) {
        this.returnValue = returnValue;
        return this;
    }

    /**
     * Returns <code>true</code> if the request succeeds; otherwise, it
     * returns an error.
     *
     * @return Returns <code>true</code> if the request succeeds; otherwise, it
     *         returns an error.
     */
    public Boolean getReturn() {
        return returnValue;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     *
     * @return Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateRouteResult withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (isReturn() != null) sb.append("Return: " + isReturn() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isReturn() == null) ? 0 : isReturn().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateRouteResult == false) return false;
        CreateRouteResult other = (CreateRouteResult)obj;
        
        if (other.isReturn() == null ^ this.isReturn() == null) return false;
        if (other.isReturn() != null && other.isReturn().equals(this.isReturn()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateRouteResult clone() {
        try {
            return (CreateRouteResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    