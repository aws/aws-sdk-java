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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListSchemaVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchemaVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>SchemaVersionList</code> objects containing details of each schema version.
     * </p>
     */
    private java.util.List<SchemaVersionListItem> schemas;
    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>SchemaVersionList</code> objects containing details of each schema version.
     * </p>
     * 
     * @return An array of <code>SchemaVersionList</code> objects containing details of each schema version.
     */

    public java.util.List<SchemaVersionListItem> getSchemas() {
        return schemas;
    }

    /**
     * <p>
     * An array of <code>SchemaVersionList</code> objects containing details of each schema version.
     * </p>
     * 
     * @param schemas
     *        An array of <code>SchemaVersionList</code> objects containing details of each schema version.
     */

    public void setSchemas(java.util.Collection<SchemaVersionListItem> schemas) {
        if (schemas == null) {
            this.schemas = null;
            return;
        }

        this.schemas = new java.util.ArrayList<SchemaVersionListItem>(schemas);
    }

    /**
     * <p>
     * An array of <code>SchemaVersionList</code> objects containing details of each schema version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemas(java.util.Collection)} or {@link #withSchemas(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param schemas
     *        An array of <code>SchemaVersionList</code> objects containing details of each schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaVersionsResult withSchemas(SchemaVersionListItem... schemas) {
        if (this.schemas == null) {
            setSchemas(new java.util.ArrayList<SchemaVersionListItem>(schemas.length));
        }
        for (SchemaVersionListItem ele : schemas) {
            this.schemas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>SchemaVersionList</code> objects containing details of each schema version.
     * </p>
     * 
     * @param schemas
     *        An array of <code>SchemaVersionList</code> objects containing details of each schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaVersionsResult withSchemas(java.util.Collection<SchemaVersionListItem> schemas) {
        setSchemas(schemas);
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

    public ListSchemaVersionsResult withNextToken(String nextToken) {
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
        if (getSchemas() != null)
            sb.append("Schemas: ").append(getSchemas()).append(",");
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

        if (obj instanceof ListSchemaVersionsResult == false)
            return false;
        ListSchemaVersionsResult other = (ListSchemaVersionsResult) obj;
        if (other.getSchemas() == null ^ this.getSchemas() == null)
            return false;
        if (other.getSchemas() != null && other.getSchemas().equals(this.getSchemas()) == false)
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

        hashCode = prime * hashCode + ((getSchemas() == null) ? 0 : getSchemas().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
