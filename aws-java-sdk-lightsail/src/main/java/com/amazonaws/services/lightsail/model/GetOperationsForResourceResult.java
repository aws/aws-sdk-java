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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperationsForResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOperationsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get operations for resource request.
     * </p>
     */
    private java.util.List<Operation> operations;
    /**
     * <p>
     * (Deprecated) Returns the number of pages of results that remain.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter returned <code>null</code> by the API. It is now deprecated,
     * and the API returns the <code>next page token</code> parameter instead.
     * </p>
     * </note>
     */
    @Deprecated
    private String nextPageCount;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextPageToken;

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
     * (Deprecated) Returns the number of pages of results that remain.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter returned <code>null</code> by the API. It is now deprecated,
     * and the API returns the <code>next page token</code> parameter instead.
     * </p>
     * </note>
     * 
     * @param nextPageCount
     *        (Deprecated) Returns the number of pages of results that remain.</p> <note>
     *        <p>
     *        In releases prior to June 12, 2017, this parameter returned <code>null</code> by the API. It is now
     *        deprecated, and the API returns the <code>next page token</code> parameter instead.
     *        </p>
     */
    @Deprecated
    public void setNextPageCount(String nextPageCount) {
        this.nextPageCount = nextPageCount;
    }

    /**
     * <p>
     * (Deprecated) Returns the number of pages of results that remain.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter returned <code>null</code> by the API. It is now deprecated,
     * and the API returns the <code>next page token</code> parameter instead.
     * </p>
     * </note>
     * 
     * @return (Deprecated) Returns the number of pages of results that remain.</p> <note>
     *         <p>
     *         In releases prior to June 12, 2017, this parameter returned <code>null</code> by the API. It is now
     *         deprecated, and the API returns the <code>next page token</code> parameter instead.
     *         </p>
     */
    @Deprecated
    public String getNextPageCount() {
        return this.nextPageCount;
    }

    /**
     * <p>
     * (Deprecated) Returns the number of pages of results that remain.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter returned <code>null</code> by the API. It is now deprecated,
     * and the API returns the <code>next page token</code> parameter instead.
     * </p>
     * </note>
     * 
     * @param nextPageCount
     *        (Deprecated) Returns the number of pages of results that remain.</p> <note>
     *        <p>
     *        In releases prior to June 12, 2017, this parameter returned <code>null</code> by the API. It is now
     *        deprecated, and the API returns the <code>next page token</code> parameter instead.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public GetOperationsForResourceResult withNextPageCount(String nextPageCount) {
        setNextPageCount(nextPageCount);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextPageToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextPageToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationsForResourceResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getNextPageCount() != null)
            sb.append("NextPageCount: ").append(getNextPageCount()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
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
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getNextPageCount() == null) ? 0 : getNextPageCount().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
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
