/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListOperations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOperationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the operations that match the specified criteria.
     * </p>
     */
    private java.util.List<OperationSummary> operations;
    /**
     * <p>
     * If the response contains <code>NextToken</code>, submit another <code>ListOperations</code> request to get the
     * next group of results. Specify the value of <code>NextToken</code> from the previous response in the next
     * request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> operations and then filters them based on the specified criteria. It's
     * possible that no operations in the first <code>MaxResults</code> operations matched the specified criteria but
     * that subsequent groups of <code>MaxResults</code> operations do contain operations that match the criteria.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the operations that match the specified criteria.
     * </p>
     * 
     * @return Summary information about the operations that match the specified criteria.
     */

    public java.util.List<OperationSummary> getOperations() {
        return operations;
    }

    /**
     * <p>
     * Summary information about the operations that match the specified criteria.
     * </p>
     * 
     * @param operations
     *        Summary information about the operations that match the specified criteria.
     */

    public void setOperations(java.util.Collection<OperationSummary> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<OperationSummary>(operations);
    }

    /**
     * <p>
     * Summary information about the operations that match the specified criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        Summary information about the operations that match the specified criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsResult withOperations(OperationSummary... operations) {
        if (this.operations == null) {
            setOperations(new java.util.ArrayList<OperationSummary>(operations.length));
        }
        for (OperationSummary ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the operations that match the specified criteria.
     * </p>
     * 
     * @param operations
     *        Summary information about the operations that match the specified criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsResult withOperations(java.util.Collection<OperationSummary> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * If the response contains <code>NextToken</code>, submit another <code>ListOperations</code> request to get the
     * next group of results. Specify the value of <code>NextToken</code> from the previous response in the next
     * request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> operations and then filters them based on the specified criteria. It's
     * possible that no operations in the first <code>MaxResults</code> operations matched the specified criteria but
     * that subsequent groups of <code>MaxResults</code> operations do contain operations that match the criteria.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        If the response contains <code>NextToken</code>, submit another <code>ListOperations</code> request to get
     *        the next group of results. Specify the value of <code>NextToken</code> from the previous response in the
     *        next request.</p> <note>
     *        <p>
     *        AWS Cloud Map gets <code>MaxResults</code> operations and then filters them based on the specified
     *        criteria. It's possible that no operations in the first <code>MaxResults</code> operations matched the
     *        specified criteria but that subsequent groups of <code>MaxResults</code> operations do contain operations
     *        that match the criteria.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response contains <code>NextToken</code>, submit another <code>ListOperations</code> request to get the
     * next group of results. Specify the value of <code>NextToken</code> from the previous response in the next
     * request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> operations and then filters them based on the specified criteria. It's
     * possible that no operations in the first <code>MaxResults</code> operations matched the specified criteria but
     * that subsequent groups of <code>MaxResults</code> operations do contain operations that match the criteria.
     * </p>
     * </note>
     * 
     * @return If the response contains <code>NextToken</code>, submit another <code>ListOperations</code> request to
     *         get the next group of results. Specify the value of <code>NextToken</code> from the previous response in
     *         the next request.</p> <note>
     *         <p>
     *         AWS Cloud Map gets <code>MaxResults</code> operations and then filters them based on the specified
     *         criteria. It's possible that no operations in the first <code>MaxResults</code> operations matched the
     *         specified criteria but that subsequent groups of <code>MaxResults</code> operations do contain operations
     *         that match the criteria.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response contains <code>NextToken</code>, submit another <code>ListOperations</code> request to get the
     * next group of results. Specify the value of <code>NextToken</code> from the previous response in the next
     * request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> operations and then filters them based on the specified criteria. It's
     * possible that no operations in the first <code>MaxResults</code> operations matched the specified criteria but
     * that subsequent groups of <code>MaxResults</code> operations do contain operations that match the criteria.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        If the response contains <code>NextToken</code>, submit another <code>ListOperations</code> request to get
     *        the next group of results. Specify the value of <code>NextToken</code> from the previous response in the
     *        next request.</p> <note>
     *        <p>
     *        AWS Cloud Map gets <code>MaxResults</code> operations and then filters them based on the specified
     *        criteria. It's possible that no operations in the first <code>MaxResults</code> operations matched the
     *        specified criteria but that subsequent groups of <code>MaxResults</code> operations do contain operations
     *        that match the criteria.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("Operations: ").append(getOperations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
