/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The ListOperations response includes the following elements.
 * </p>
 */
public class ListOperationsResult implements Serializable {

    /**
     * Lists summaries of the operations. <p>Type: Complex type containing a
     * list of operation summaries <p>Children: <code>OperationId</code>,
     * <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OperationSummary> operations;

    /**
     * If there are more operations than you specified for
     * <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of
     * <code>Marker</code>. <p>Type: String <p>Parent:
     * <code>Operations</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String nextPageMarker;

    /**
     * Lists summaries of the operations. <p>Type: Complex type containing a
     * list of operation summaries <p>Children: <code>OperationId</code>,
     * <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     *
     * @return Lists summaries of the operations. <p>Type: Complex type containing a
     *         list of operation summaries <p>Children: <code>OperationId</code>,
     *         <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     */
    public java.util.List<OperationSummary> getOperations() {
        if (operations == null) {
              operations = new com.amazonaws.internal.ListWithAutoConstructFlag<OperationSummary>();
              operations.setAutoConstruct(true);
        }
        return operations;
    }
    
    /**
     * Lists summaries of the operations. <p>Type: Complex type containing a
     * list of operation summaries <p>Children: <code>OperationId</code>,
     * <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     *
     * @param operations Lists summaries of the operations. <p>Type: Complex type containing a
     *         list of operation summaries <p>Children: <code>OperationId</code>,
     *         <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     */
    public void setOperations(java.util.Collection<OperationSummary> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<OperationSummary> operationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OperationSummary>(operations.size());
        operationsCopy.addAll(operations);
        this.operations = operationsCopy;
    }
    
    /**
     * Lists summaries of the operations. <p>Type: Complex type containing a
     * list of operation summaries <p>Children: <code>OperationId</code>,
     * <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operations Lists summaries of the operations. <p>Type: Complex type containing a
     *         list of operation summaries <p>Children: <code>OperationId</code>,
     *         <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOperationsResult withOperations(OperationSummary... operations) {
        if (getOperations() == null) setOperations(new java.util.ArrayList<OperationSummary>(operations.length));
        for (OperationSummary value : operations) {
            getOperations().add(value);
        }
        return this;
    }
    
    /**
     * Lists summaries of the operations. <p>Type: Complex type containing a
     * list of operation summaries <p>Children: <code>OperationId</code>,
     * <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operations Lists summaries of the operations. <p>Type: Complex type containing a
     *         list of operation summaries <p>Children: <code>OperationId</code>,
     *         <code>Status</code>, <code>SubmittedDate</code>, <code>Type</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOperationsResult withOperations(java.util.Collection<OperationSummary> operations) {
        if (operations == null) {
            this.operations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<OperationSummary> operationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OperationSummary>(operations.size());
            operationsCopy.addAll(operations);
            this.operations = operationsCopy;
        }

        return this;
    }

    /**
     * If there are more operations than you specified for
     * <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of
     * <code>Marker</code>. <p>Type: String <p>Parent:
     * <code>Operations</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return If there are more operations than you specified for
     *         <code>MaxItems</code> in the request, submit another request and
     *         include the value of <code>NextPageMarker</code> in the value of
     *         <code>Marker</code>. <p>Type: String <p>Parent:
     *         <code>Operations</code>
     */
    public String getNextPageMarker() {
        return nextPageMarker;
    }
    
    /**
     * If there are more operations than you specified for
     * <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of
     * <code>Marker</code>. <p>Type: String <p>Parent:
     * <code>Operations</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param nextPageMarker If there are more operations than you specified for
     *         <code>MaxItems</code> in the request, submit another request and
     *         include the value of <code>NextPageMarker</code> in the value of
     *         <code>Marker</code>. <p>Type: String <p>Parent:
     *         <code>Operations</code>
     */
    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }
    
    /**
     * If there are more operations than you specified for
     * <code>MaxItems</code> in the request, submit another request and
     * include the value of <code>NextPageMarker</code> in the value of
     * <code>Marker</code>. <p>Type: String <p>Parent:
     * <code>Operations</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param nextPageMarker If there are more operations than you specified for
     *         <code>MaxItems</code> in the request, submit another request and
     *         include the value of <code>NextPageMarker</code> in the value of
     *         <code>Marker</code>. <p>Type: String <p>Parent:
     *         <code>Operations</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOperationsResult withNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
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
        if (getOperations() != null) sb.append("Operations: " + getOperations() + ",");
        if (getNextPageMarker() != null) sb.append("NextPageMarker: " + getNextPageMarker() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListOperationsResult == false) return false;
        ListOperationsResult other = (ListOperationsResult)obj;
        
        if (other.getOperations() == null ^ this.getOperations() == null) return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false) return false; 
        if (other.getNextPageMarker() == null ^ this.getNextPageMarker() == null) return false;
        if (other.getNextPageMarker() != null && other.getNextPageMarker().equals(this.getNextPageMarker()) == false) return false; 
        return true;
    }
    
}
    