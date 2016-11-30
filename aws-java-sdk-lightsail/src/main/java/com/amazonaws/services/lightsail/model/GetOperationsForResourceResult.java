/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * 
 */
public class GetOperationsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get operations for resource request.
     * </p>
     */
    private java.util.List<Operation> operations;
    /**
     * <p>
     * Returns the number of pages of results that remain.
     * </p>
     */
    private String nextPageCount;

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get operations for resource request.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the results of your get operations for resource
     *         request.
     */

    public java.util.List<Operation> getOperations() {
        return operations;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get operations for resource request.
     * </p>
     * 
     * @param operations
     *        An array of key-value pairs containing information about the results of your get operations for resource
     *        request.
     */

    public void setOperations(java.util.Collection<Operation> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<Operation>(operations);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get operations for resource request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        An array of key-value pairs containing information about the results of your get operations for resource
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationsForResourceResult withOperations(Operation... operations) {
        if (this.operations == null) {
            setOperations(new java.util.ArrayList<Operation>(operations.length));
        }
        for (Operation ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get operations for resource request.
     * </p>
     * 
     * @param operations
     *        An array of key-value pairs containing information about the results of your get operations for resource
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationsForResourceResult withOperations(java.util.Collection<Operation> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * Returns the number of pages of results that remain.
     * </p>
     * 
     * @param nextPageCount
     *        Returns the number of pages of results that remain.
     */

    public void setNextPageCount(String nextPageCount) {
        this.nextPageCount = nextPageCount;
    }

    /**
     * <p>
     * Returns the number of pages of results that remain.
     * </p>
     * 
     * @return Returns the number of pages of results that remain.
     */

    public String getNextPageCount() {
        return this.nextPageCount;
    }

    /**
     * <p>
     * Returns the number of pages of results that remain.
     * </p>
     * 
     * @param nextPageCount
     *        Returns the number of pages of results that remain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationsForResourceResult withNextPageCount(String nextPageCount) {
        setNextPageCount(nextPageCount);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOperations() != null)
            sb.append("Operations: " + getOperations() + ",");
        if (getNextPageCount() != null)
            sb.append("NextPageCount: " + getNextPageCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOperationsForResourceResult == false)
            return false;
        GetOperationsForResourceResult other = (GetOperationsForResourceResult) obj;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getNextPageCount() == null ^ this.getNextPageCount() == null)
            return false;
        if (other.getNextPageCount() != null && other.getNextPageCount().equals(this.getNextPageCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getNextPageCount() == null) ? 0 : getNextPageCount().hashCode());
        return hashCode;
    }

    @Override
    public GetOperationsForResourceResult clone() {
        try {
            return (GetOperationsForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
