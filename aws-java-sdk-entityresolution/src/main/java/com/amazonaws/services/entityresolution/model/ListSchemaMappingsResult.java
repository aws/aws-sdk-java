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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListSchemaMappings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchemaMappingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of <code>SchemaMappingSummary</code> objects, each of which contain the fields <code>SchemaName</code>,
     * <code>SchemaArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
     * </p>
     */
    private java.util.List<SchemaMappingSummary> schemaList;

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @return The pagination token from the previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaMappingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of <code>SchemaMappingSummary</code> objects, each of which contain the fields <code>SchemaName</code>,
     * <code>SchemaArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
     * </p>
     * 
     * @return A list of <code>SchemaMappingSummary</code> objects, each of which contain the fields
     *         <code>SchemaName</code>, <code>SchemaArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
     */

    public java.util.List<SchemaMappingSummary> getSchemaList() {
        return schemaList;
    }

    /**
     * <p>
     * A list of <code>SchemaMappingSummary</code> objects, each of which contain the fields <code>SchemaName</code>,
     * <code>SchemaArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
     * </p>
     * 
     * @param schemaList
     *        A list of <code>SchemaMappingSummary</code> objects, each of which contain the fields
     *        <code>SchemaName</code>, <code>SchemaArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
     */

    public void setSchemaList(java.util.Collection<SchemaMappingSummary> schemaList) {
        if (schemaList == null) {
            this.schemaList = null;
            return;
        }

        this.schemaList = new java.util.ArrayList<SchemaMappingSummary>(schemaList);
    }

    /**
     * <p>
     * A list of <code>SchemaMappingSummary</code> objects, each of which contain the fields <code>SchemaName</code>,
     * <code>SchemaArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaList(java.util.Collection)} or {@link #withSchemaList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param schemaList
     *        A list of <code>SchemaMappingSummary</code> objects, each of which contain the fields
     *        <code>SchemaName</code>, <code>SchemaArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaMappingsResult withSchemaList(SchemaMappingSummary... schemaList) {
        if (this.schemaList == null) {
            setSchemaList(new java.util.ArrayList<SchemaMappingSummary>(schemaList.length));
        }
        for (SchemaMappingSummary ele : schemaList) {
            this.schemaList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SchemaMappingSummary</code> objects, each of which contain the fields <code>SchemaName</code>,
     * <code>SchemaArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
     * </p>
     * 
     * @param schemaList
     *        A list of <code>SchemaMappingSummary</code> objects, each of which contain the fields
     *        <code>SchemaName</code>, <code>SchemaArn</code>, <code>CreatedAt</code>, <code>UpdatedAt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaMappingsResult withSchemaList(java.util.Collection<SchemaMappingSummary> schemaList) {
        setSchemaList(schemaList);
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
        if (getSchemaList() != null)
            sb.append("SchemaList: ").append(getSchemaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSchemaMappingsResult == false)
            return false;
        ListSchemaMappingsResult other = (ListSchemaMappingsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSchemaList() == null ^ this.getSchemaList() == null)
            return false;
        if (other.getSchemaList() != null && other.getSchemaList().equals(this.getSchemaList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSchemaList() == null) ? 0 : getSchemaList().hashCode());
        return hashCode;
    }

    @Override
    public ListSchemaMappingsResult clone() {
        try {
            return (ListSchemaMappingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
