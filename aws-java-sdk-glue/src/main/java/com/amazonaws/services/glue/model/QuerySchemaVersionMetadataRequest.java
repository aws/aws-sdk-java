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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/QuerySchemaVersionMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuerySchemaVersionMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * </p>
     */
    private SchemaId schemaId;
    /**
     * <p>
     * The version number of the schema.
     * </p>
     */
    private SchemaVersionNumber schemaVersionNumber;
    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * Search key-value pairs for metadata, if they are not provided all the metadata information will be fetched.
     * </p>
     */
    private java.util.List<MetadataKeyValuePair> metadataList;
    /**
     * <p>
     * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param schemaId
     *        A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     */

    public void setSchemaId(SchemaId schemaId) {
        this.schemaId = schemaId;
    }

    /**
     * <p>
     * A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @return A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     */

    public SchemaId getSchemaId() {
        return this.schemaId;
    }

    /**
     * <p>
     * A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param schemaId
     *        A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataRequest withSchemaId(SchemaId schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param schemaVersionNumber
     *        The version number of the schema.
     */

    public void setSchemaVersionNumber(SchemaVersionNumber schemaVersionNumber) {
        this.schemaVersionNumber = schemaVersionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @return The version number of the schema.
     */

    public SchemaVersionNumber getSchemaVersionNumber() {
        return this.schemaVersionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param schemaVersionNumber
     *        The version number of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataRequest withSchemaVersionNumber(SchemaVersionNumber schemaVersionNumber) {
        setSchemaVersionNumber(schemaVersionNumber);
        return this;
    }

    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique version ID of the schema version.
     */

    public void setSchemaVersionId(String schemaVersionId) {
        this.schemaVersionId = schemaVersionId;
    }

    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     * 
     * @return The unique version ID of the schema version.
     */

    public String getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique version ID of the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataRequest withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * Search key-value pairs for metadata, if they are not provided all the metadata information will be fetched.
     * </p>
     * 
     * @return Search key-value pairs for metadata, if they are not provided all the metadata information will be
     *         fetched.
     */

    public java.util.List<MetadataKeyValuePair> getMetadataList() {
        return metadataList;
    }

    /**
     * <p>
     * Search key-value pairs for metadata, if they are not provided all the metadata information will be fetched.
     * </p>
     * 
     * @param metadataList
     *        Search key-value pairs for metadata, if they are not provided all the metadata information will be
     *        fetched.
     */

    public void setMetadataList(java.util.Collection<MetadataKeyValuePair> metadataList) {
        if (metadataList == null) {
            this.metadataList = null;
            return;
        }

        this.metadataList = new java.util.ArrayList<MetadataKeyValuePair>(metadataList);
    }

    /**
     * <p>
     * Search key-value pairs for metadata, if they are not provided all the metadata information will be fetched.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetadataList(java.util.Collection)} or {@link #withMetadataList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metadataList
     *        Search key-value pairs for metadata, if they are not provided all the metadata information will be
     *        fetched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataRequest withMetadataList(MetadataKeyValuePair... metadataList) {
        if (this.metadataList == null) {
            setMetadataList(new java.util.ArrayList<MetadataKeyValuePair>(metadataList.length));
        }
        for (MetadataKeyValuePair ele : metadataList) {
            this.metadataList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Search key-value pairs for metadata, if they are not provided all the metadata information will be fetched.
     * </p>
     * 
     * @param metadataList
     *        Search key-value pairs for metadata, if they are not provided all the metadata information will be
     *        fetched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataRequest withMetadataList(java.util.Collection<MetadataKeyValuePair> metadataList) {
        setMetadataList(metadataList);
        return this;
    }

    /**
     * <p>
     * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25
     *        per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
     * </p>
     * 
     * @return Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25
     *         per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25
     *        per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataRequest withNextToken(String nextToken) {
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
        if (getSchemaId() != null)
            sb.append("SchemaId: ").append(getSchemaId()).append(",");
        if (getSchemaVersionNumber() != null)
            sb.append("SchemaVersionNumber: ").append(getSchemaVersionNumber()).append(",");
        if (getSchemaVersionId() != null)
            sb.append("SchemaVersionId: ").append(getSchemaVersionId()).append(",");
        if (getMetadataList() != null)
            sb.append("MetadataList: ").append(getMetadataList()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof QuerySchemaVersionMetadataRequest == false)
            return false;
        QuerySchemaVersionMetadataRequest other = (QuerySchemaVersionMetadataRequest) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getSchemaVersionNumber() == null ^ this.getSchemaVersionNumber() == null)
            return false;
        if (other.getSchemaVersionNumber() != null && other.getSchemaVersionNumber().equals(this.getSchemaVersionNumber()) == false)
            return false;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
            return false;
        if (other.getMetadataList() == null ^ this.getMetadataList() == null)
            return false;
        if (other.getMetadataList() != null && other.getMetadataList().equals(this.getMetadataList()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionNumber() == null) ? 0 : getSchemaVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getMetadataList() == null) ? 0 : getMetadataList().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public QuerySchemaVersionMetadataRequest clone() {
        return (QuerySchemaVersionMetadataRequest) super.clone();
    }

}
