/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListSchemaVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchemaVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     */
    private java.util.List<SchemaVersionSummary> schemaVersions;

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies the next page of results to return. To request the first page, leave NextToken
     *        empty. The token will expire in 24 hours, and cannot be shared with other accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     * 
     * @return The token that specifies the next page of results to return. To request the first page, leave NextToken
     *         empty. The token will expire in 24 hours, and cannot be shared with other accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies the next page of results to return. To request the first page, leave NextToken
     *        empty. The token will expire in 24 hours, and cannot be shared with other accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * 
     * @return An array of schema version summaries.
     */

    public java.util.List<SchemaVersionSummary> getSchemaVersions() {
        return schemaVersions;
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * 
     * @param schemaVersions
     *        An array of schema version summaries.
     */

    public void setSchemaVersions(java.util.Collection<SchemaVersionSummary> schemaVersions) {
        if (schemaVersions == null) {
            this.schemaVersions = null;
            return;
        }

        this.schemaVersions = new java.util.ArrayList<SchemaVersionSummary>(schemaVersions);
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaVersions(java.util.Collection)} or {@link #withSchemaVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param schemaVersions
     *        An array of schema version summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaVersionsResult withSchemaVersions(SchemaVersionSummary... schemaVersions) {
        if (this.schemaVersions == null) {
            setSchemaVersions(new java.util.ArrayList<SchemaVersionSummary>(schemaVersions.length));
        }
        for (SchemaVersionSummary ele : schemaVersions) {
            this.schemaVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * 
     * @param schemaVersions
     *        An array of schema version summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaVersionsResult withSchemaVersions(java.util.Collection<SchemaVersionSummary> schemaVersions) {
        setSchemaVersions(schemaVersions);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSchemaVersions() != null)
            sb.append("SchemaVersions: ").append(getSchemaVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSchemaVersionsResult == false)
            return false;
        ListSchemaVersionsResult other = (ListSchemaVersionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSchemaVersions() == null ^ this.getSchemaVersions() == null)
            return false;
        if (other.getSchemaVersions() != null && other.getSchemaVersions().equals(this.getSchemaVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersions() == null) ? 0 : getSchemaVersions().hashCode());
        return hashCode;
    }

    @Override
    public ListSchemaVersionsResult clone() {
        try {
            return (ListSchemaVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
