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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListSchemas" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchemasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     */
    private java.util.List<SchemaSummary> schemaSummaries;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     * 
     * @return The retrieved list of schemas.
     */

    public java.util.List<SchemaSummary> getSchemaSummaries() {
        return schemaSummaries;
    }

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     * 
     * @param schemaSummaries
     *        The retrieved list of schemas.
     */

    public void setSchemaSummaries(java.util.Collection<SchemaSummary> schemaSummaries) {
        if (schemaSummaries == null) {
            this.schemaSummaries = null;
            return;
        }

        this.schemaSummaries = new java.util.ArrayList<SchemaSummary>(schemaSummaries);
    }

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaSummaries(java.util.Collection)} or {@link #withSchemaSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param schemaSummaries
     *        The retrieved list of schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasResult withSchemaSummaries(SchemaSummary... schemaSummaries) {
        if (this.schemaSummaries == null) {
            setSchemaSummaries(new java.util.ArrayList<SchemaSummary>(schemaSummaries.length));
        }
        for (SchemaSummary ele : schemaSummaries) {
            this.schemaSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     * 
     * @param schemaSummaries
     *        The retrieved list of schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasResult withSchemaSummaries(java.util.Collection<SchemaSummary> schemaSummaries) {
        setSchemaSummaries(schemaSummaries);
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasResult withNextToken(String nextToken) {
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
        if (getSchemaSummaries() != null)
            sb.append("SchemaSummaries: ").append(getSchemaSummaries()).append(",");
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

        if (obj instanceof ListSchemasResult == false)
            return false;
        ListSchemasResult other = (ListSchemasResult) obj;
        if (other.getSchemaSummaries() == null ^ this.getSchemaSummaries() == null)
            return false;
        if (other.getSchemaSummaries() != null && other.getSchemaSummaries().equals(this.getSchemaSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSchemaSummaries() == null) ? 0 : getSchemaSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSchemasResult clone() {
        try {
            return (ListSchemasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
