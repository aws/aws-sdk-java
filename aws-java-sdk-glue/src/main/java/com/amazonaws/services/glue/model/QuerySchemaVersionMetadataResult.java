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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/QuerySchemaVersionMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuerySchemaVersionMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A map of a metadata key and associated values.
     * </p>
     */
    private java.util.Map<String, MetadataInfo> metadataInfoMap;
    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A map of a metadata key and associated values.
     * </p>
     * 
     * @return A map of a metadata key and associated values.
     */

    public java.util.Map<String, MetadataInfo> getMetadataInfoMap() {
        return metadataInfoMap;
    }

    /**
     * <p>
     * A map of a metadata key and associated values.
     * </p>
     * 
     * @param metadataInfoMap
     *        A map of a metadata key and associated values.
     */

    public void setMetadataInfoMap(java.util.Map<String, MetadataInfo> metadataInfoMap) {
        this.metadataInfoMap = metadataInfoMap;
    }

    /**
     * <p>
     * A map of a metadata key and associated values.
     * </p>
     * 
     * @param metadataInfoMap
     *        A map of a metadata key and associated values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataResult withMetadataInfoMap(java.util.Map<String, MetadataInfo> metadataInfoMap) {
        setMetadataInfoMap(metadataInfoMap);
        return this;
    }

    /**
     * Add a single MetadataInfoMap entry
     *
     * @see QuerySchemaVersionMetadataResult#withMetadataInfoMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataResult addMetadataInfoMapEntry(String key, MetadataInfo value) {
        if (null == this.metadataInfoMap) {
            this.metadataInfoMap = new java.util.HashMap<String, MetadataInfo>();
        }
        if (this.metadataInfoMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadataInfoMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MetadataInfoMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataResult clearMetadataInfoMapEntries() {
        this.metadataInfoMap = null;
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

    public QuerySchemaVersionMetadataResult withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @return A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *         list is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySchemaVersionMetadataResult withNextToken(String nextToken) {
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
        if (getMetadataInfoMap() != null)
            sb.append("MetadataInfoMap: ").append(getMetadataInfoMap()).append(",");
        if (getSchemaVersionId() != null)
            sb.append("SchemaVersionId: ").append(getSchemaVersionId()).append(",");
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

        if (obj instanceof QuerySchemaVersionMetadataResult == false)
            return false;
        QuerySchemaVersionMetadataResult other = (QuerySchemaVersionMetadataResult) obj;
        if (other.getMetadataInfoMap() == null ^ this.getMetadataInfoMap() == null)
            return false;
        if (other.getMetadataInfoMap() != null && other.getMetadataInfoMap().equals(this.getMetadataInfoMap()) == false)
            return false;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
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

        hashCode = prime * hashCode + ((getMetadataInfoMap() == null) ? 0 : getMetadataInfoMap().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public QuerySchemaVersionMetadataResult clone() {
        try {
            return (QuerySchemaVersionMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
