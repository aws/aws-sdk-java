/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListStoredQueries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStoredQueriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>StoredQueryMetadata</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StoredQueryMetadata> storedQueryMetadata;
    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>StoredQueryMetadata</code> objects.
     * </p>
     * 
     * @return A list of <code>StoredQueryMetadata</code> objects.
     */

    public java.util.List<StoredQueryMetadata> getStoredQueryMetadata() {
        if (storedQueryMetadata == null) {
            storedQueryMetadata = new com.amazonaws.internal.SdkInternalList<StoredQueryMetadata>();
        }
        return storedQueryMetadata;
    }

    /**
     * <p>
     * A list of <code>StoredQueryMetadata</code> objects.
     * </p>
     * 
     * @param storedQueryMetadata
     *        A list of <code>StoredQueryMetadata</code> objects.
     */

    public void setStoredQueryMetadata(java.util.Collection<StoredQueryMetadata> storedQueryMetadata) {
        if (storedQueryMetadata == null) {
            this.storedQueryMetadata = null;
            return;
        }

        this.storedQueryMetadata = new com.amazonaws.internal.SdkInternalList<StoredQueryMetadata>(storedQueryMetadata);
    }

    /**
     * <p>
     * A list of <code>StoredQueryMetadata</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStoredQueryMetadata(java.util.Collection)} or {@link #withStoredQueryMetadata(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param storedQueryMetadata
     *        A list of <code>StoredQueryMetadata</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStoredQueriesResult withStoredQueryMetadata(StoredQueryMetadata... storedQueryMetadata) {
        if (this.storedQueryMetadata == null) {
            setStoredQueryMetadata(new com.amazonaws.internal.SdkInternalList<StoredQueryMetadata>(storedQueryMetadata.length));
        }
        for (StoredQueryMetadata ele : storedQueryMetadata) {
            this.storedQueryMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StoredQueryMetadata</code> objects.
     * </p>
     * 
     * @param storedQueryMetadata
     *        A list of <code>StoredQueryMetadata</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStoredQueriesResult withStoredQueryMetadata(java.util.Collection<StoredQueryMetadata> storedQueryMetadata) {
        setStoredQueryMetadata(storedQueryMetadata);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request didn't return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *        action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *        no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *        <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @return If the previous paginated request didn't return all of the remaining results, the response object's
     *         <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *         action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *         no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *         <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request didn't return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *        action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *        no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStoredQueriesResult withNextToken(String nextToken) {
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
        if (getStoredQueryMetadata() != null)
            sb.append("StoredQueryMetadata: ").append(getStoredQueryMetadata()).append(",");
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

        if (obj instanceof ListStoredQueriesResult == false)
            return false;
        ListStoredQueriesResult other = (ListStoredQueriesResult) obj;
        if (other.getStoredQueryMetadata() == null ^ this.getStoredQueryMetadata() == null)
            return false;
        if (other.getStoredQueryMetadata() != null && other.getStoredQueryMetadata().equals(this.getStoredQueryMetadata()) == false)
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

        hashCode = prime * hashCode + ((getStoredQueryMetadata() == null) ? 0 : getStoredQueryMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStoredQueriesResult clone() {
        try {
            return (ListStoredQueriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
