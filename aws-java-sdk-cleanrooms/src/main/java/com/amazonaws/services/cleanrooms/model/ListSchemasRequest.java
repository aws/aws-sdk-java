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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListSchemas" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchemasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
     * </p>
     */
    private String collaborationIdentifier;
    /**
     * <p>
     * If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
     * </p>
     */
    private String schemaType;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum size of the results that is returned per call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
     * </p>
     * 
     * @param collaborationIdentifier
     *        A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration
     *        ID.
     */

    public void setCollaborationIdentifier(String collaborationIdentifier) {
        this.collaborationIdentifier = collaborationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
     * </p>
     * 
     * @return A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration
     *         ID.
     */

    public String getCollaborationIdentifier() {
        return this.collaborationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
     * </p>
     * 
     * @param collaborationIdentifier
     *        A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration
     *        ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasRequest withCollaborationIdentifier(String collaborationIdentifier) {
        setCollaborationIdentifier(collaborationIdentifier);
        return this;
    }

    /**
     * <p>
     * If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
     * </p>
     * 
     * @param schemaType
     *        If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
     * @see SchemaType
     */

    public void setSchemaType(String schemaType) {
        this.schemaType = schemaType;
    }

    /**
     * <p>
     * If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
     * </p>
     * 
     * @return If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
     * @see SchemaType
     */

    public String getSchemaType() {
        return this.schemaType;
    }

    /**
     * <p>
     * If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
     * </p>
     * 
     * @param schemaType
     *        If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaType
     */

    public ListSchemasRequest withSchemaType(String schemaType) {
        setSchemaType(schemaType);
        return this;
    }

    /**
     * <p>
     * If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
     * </p>
     * 
     * @param schemaType
     *        If present, filter schemas by schema type. The only valid schema type is currently `TABLE`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaType
     */

    public ListSchemasRequest withSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType.toString();
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

    public ListSchemasRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum size of the results that is returned per call.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of the results that is returned per call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of the results that is returned per call.
     * </p>
     * 
     * @return The maximum size of the results that is returned per call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of the results that is returned per call.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of the results that is returned per call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getCollaborationIdentifier() != null)
            sb.append("CollaborationIdentifier: ").append(getCollaborationIdentifier()).append(",");
        if (getSchemaType() != null)
            sb.append("SchemaType: ").append(getSchemaType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSchemasRequest == false)
            return false;
        ListSchemasRequest other = (ListSchemasRequest) obj;
        if (other.getCollaborationIdentifier() == null ^ this.getCollaborationIdentifier() == null)
            return false;
        if (other.getCollaborationIdentifier() != null && other.getCollaborationIdentifier().equals(this.getCollaborationIdentifier()) == false)
            return false;
        if (other.getSchemaType() == null ^ this.getSchemaType() == null)
            return false;
        if (other.getSchemaType() != null && other.getSchemaType().equals(this.getSchemaType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollaborationIdentifier() == null) ? 0 : getCollaborationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSchemaType() == null) ? 0 : getSchemaType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListSchemasRequest clone() {
        return (ListSchemasRequest) super.clone();
    }

}
