/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListRetrievers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRetrieversResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of summary information for one or more retrievers.
     * </p>
     */
    private java.util.List<Retriever> retrievers;
    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of retrievers.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summary information for one or more retrievers.
     * </p>
     * 
     * @return An array of summary information for one or more retrievers.
     */

    public java.util.List<Retriever> getRetrievers() {
        return retrievers;
    }

    /**
     * <p>
     * An array of summary information for one or more retrievers.
     * </p>
     * 
     * @param retrievers
     *        An array of summary information for one or more retrievers.
     */

    public void setRetrievers(java.util.Collection<Retriever> retrievers) {
        if (retrievers == null) {
            this.retrievers = null;
            return;
        }

        this.retrievers = new java.util.ArrayList<Retriever>(retrievers);
    }

    /**
     * <p>
     * An array of summary information for one or more retrievers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRetrievers(java.util.Collection)} or {@link #withRetrievers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param retrievers
     *        An array of summary information for one or more retrievers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetrieversResult withRetrievers(Retriever... retrievers) {
        if (this.retrievers == null) {
            setRetrievers(new java.util.ArrayList<Retriever>(retrievers.length));
        }
        for (Retriever ele : retrievers) {
            this.retrievers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more retrievers.
     * </p>
     * 
     * @param retrievers
     *        An array of summary information for one or more retrievers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetrieversResult withRetrievers(java.util.Collection<Retriever> retrievers) {
        setRetrievers(retrievers);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of retrievers.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token, which you can use in a later request
     *        to list the next set of retrievers.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of retrievers.
     * </p>
     * 
     * @return If the response is truncated, Amazon Q Business returns this token, which you can use in a later request
     *         to list the next set of retrievers.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of retrievers.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token, which you can use in a later request
     *        to list the next set of retrievers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetrieversResult withNextToken(String nextToken) {
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
        if (getRetrievers() != null)
            sb.append("Retrievers: ").append(getRetrievers()).append(",");
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

        if (obj instanceof ListRetrieversResult == false)
            return false;
        ListRetrieversResult other = (ListRetrieversResult) obj;
        if (other.getRetrievers() == null ^ this.getRetrievers() == null)
            return false;
        if (other.getRetrievers() != null && other.getRetrievers().equals(this.getRetrievers()) == false)
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

        hashCode = prime * hashCode + ((getRetrievers() == null) ? 0 : getRetrievers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRetrieversResult clone() {
        try {
            return (ListRetrieversResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
