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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The ListOperations response includes the following elements.
 * </p>
 */
public class ListOperationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     * <p>
     * Type: Complex type containing a list of operation summaries
     * </p>
     * <p>
     * Children: <code>OperationId</code>, <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OperationSummary> operations;
    /**
     * <p>
     * If there are more operations than you specified for <code>MaxItems</code> in the request, submit another request
     * and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>Operations</code>
     * </p>
     */
    private String nextPageMarker;

    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     * <p>
     * Type: Complex type containing a list of operation summaries
     * </p>
     * <p>
     * Children: <code>OperationId</code>, <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     * </p>
     * 
     * @return Lists summaries of the operations.</p>
     *         <p>
     *         Type: Complex type containing a list of operation summaries
     *         </p>
     *         <p>
     *         Children: <code>OperationId</code>, <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     */

    public java.util.List<OperationSummary> getOperations() {
        if (operations == null) {
            operations = new com.amazonaws.internal.SdkInternalList<OperationSummary>();
        }
        return operations;
    }

    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     * <p>
     * Type: Complex type containing a list of operation summaries
     * </p>
     * <p>
     * Children: <code>OperationId</code>, <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     * </p>
     * 
     * @param operations
     *        Lists summaries of the operations.</p>
     *        <p>
     *        Type: Complex type containing a list of operation summaries
     *        </p>
     *        <p>
     *        Children: <code>OperationId</code>, <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     */

    public void setOperations(java.util.Collection<OperationSummary> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new com.amazonaws.internal.SdkInternalList<OperationSummary>(operations);
    }

    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     * <p>
     * Type: Complex type containing a list of operation summaries
     * </p>
     * <p>
     * Children: <code>OperationId</code>, <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        Lists summaries of the operations.</p>
     *        <p>
     *        Type: Complex type containing a list of operation summaries
     *        </p>
     *        <p>
     *        Children: <code>OperationId</code>, <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsResult withOperations(OperationSummary... operations) {
        if (this.operations == null) {
            setOperations(new com.amazonaws.internal.SdkInternalList<OperationSummary>(operations.length));
        }
        for (OperationSummary ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     * <p>
     * Type: Complex type containing a list of operation summaries
     * </p>
     * <p>
     * Children: <code>OperationId</code>, <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     * </p>
     * 
     * @param operations
     *        Lists summaries of the operations.</p>
     *        <p>
     *        Type: Complex type containing a list of operation summaries
     *        </p>
     *        <p>
     *        Children: <code>OperationId</code>, <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsResult withOperations(java.util.Collection<OperationSummary> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * If there are more operations than you specified for <code>MaxItems</code> in the request, submit another request
     * and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>Operations</code>
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more operations than you specified for <code>MaxItems</code> in the request, submit another
     *        request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Parent: <code>Operations</code>
     */

    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }

    /**
     * <p>
     * If there are more operations than you specified for <code>MaxItems</code> in the request, submit another request
     * and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>Operations</code>
     * </p>
     * 
     * @return If there are more operations than you specified for <code>MaxItems</code> in the request, submit another
     *         request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Parent: <code>Operations</code>
     */

    public String getNextPageMarker() {
        return this.nextPageMarker;
    }

    /**
     * <p>
     * If there are more operations than you specified for <code>MaxItems</code> in the request, submit another request
     * and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>Operations</code>
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more operations than you specified for <code>MaxItems</code> in the request, submit another
     *        request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Parent: <code>Operations</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsResult withNextPageMarker(String nextPageMarker) {
        setNextPageMarker(nextPageMarker);
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
        if (getNextPageMarker() != null)
            sb.append("NextPageMarker: " + getNextPageMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOperationsResult == false)
            return false;
        ListOperationsResult other = (ListOperationsResult) obj;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getNextPageMarker() == null ^ this.getNextPageMarker() == null)
            return false;
        if (other.getNextPageMarker() != null && other.getNextPageMarker().equals(this.getNextPageMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getNextPageMarker() == null) ? 0 : getNextPageMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListOperationsResult clone() {
        try {
            return (ListOperationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
