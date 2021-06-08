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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListApprovedOrigins" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApprovedOriginsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The approved origins.
     * </p>
     */
    private java.util.List<String> origins;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The approved origins.
     * </p>
     * 
     * @return The approved origins.
     */

    public java.util.List<String> getOrigins() {
        return origins;
    }

    /**
     * <p>
     * The approved origins.
     * </p>
     * 
     * @param origins
     *        The approved origins.
     */

    public void setOrigins(java.util.Collection<String> origins) {
        if (origins == null) {
            this.origins = null;
            return;
        }

        this.origins = new java.util.ArrayList<String>(origins);
    }

    /**
     * <p>
     * The approved origins.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrigins(java.util.Collection)} or {@link #withOrigins(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param origins
     *        The approved origins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApprovedOriginsResult withOrigins(String... origins) {
        if (this.origins == null) {
            setOrigins(new java.util.ArrayList<String>(origins.length));
        }
        for (String ele : origins) {
            this.origins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The approved origins.
     * </p>
     * 
     * @param origins
     *        The approved origins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApprovedOriginsResult withOrigins(java.util.Collection<String> origins) {
        setOrigins(origins);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApprovedOriginsResult withNextToken(String nextToken) {
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
        if (getOrigins() != null)
            sb.append("Origins: ").append(getOrigins()).append(",");
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

        if (obj instanceof ListApprovedOriginsResult == false)
            return false;
        ListApprovedOriginsResult other = (ListApprovedOriginsResult) obj;
        if (other.getOrigins() == null ^ this.getOrigins() == null)
            return false;
        if (other.getOrigins() != null && other.getOrigins().equals(this.getOrigins()) == false)
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

        hashCode = prime * hashCode + ((getOrigins() == null) ? 0 : getOrigins().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApprovedOriginsResult clone() {
        try {
            return (ListApprovedOriginsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
