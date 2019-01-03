/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListSchemaExtensions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchemaExtensionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the schema extensions applied to the directory.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SchemaExtensionInfo> schemaExtensionsInfo;
    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <code>ListSchemaExtensions</code> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the schema extensions applied to the directory.
     * </p>
     * 
     * @return Information about the schema extensions applied to the directory.
     */

    public java.util.List<SchemaExtensionInfo> getSchemaExtensionsInfo() {
        if (schemaExtensionsInfo == null) {
            schemaExtensionsInfo = new com.amazonaws.internal.SdkInternalList<SchemaExtensionInfo>();
        }
        return schemaExtensionsInfo;
    }

    /**
     * <p>
     * Information about the schema extensions applied to the directory.
     * </p>
     * 
     * @param schemaExtensionsInfo
     *        Information about the schema extensions applied to the directory.
     */

    public void setSchemaExtensionsInfo(java.util.Collection<SchemaExtensionInfo> schemaExtensionsInfo) {
        if (schemaExtensionsInfo == null) {
            this.schemaExtensionsInfo = null;
            return;
        }

        this.schemaExtensionsInfo = new com.amazonaws.internal.SdkInternalList<SchemaExtensionInfo>(schemaExtensionsInfo);
    }

    /**
     * <p>
     * Information about the schema extensions applied to the directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaExtensionsInfo(java.util.Collection)} or {@link #withSchemaExtensionsInfo(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param schemaExtensionsInfo
     *        Information about the schema extensions applied to the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaExtensionsResult withSchemaExtensionsInfo(SchemaExtensionInfo... schemaExtensionsInfo) {
        if (this.schemaExtensionsInfo == null) {
            setSchemaExtensionsInfo(new com.amazonaws.internal.SdkInternalList<SchemaExtensionInfo>(schemaExtensionsInfo.length));
        }
        for (SchemaExtensionInfo ele : schemaExtensionsInfo) {
            this.schemaExtensionsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the schema extensions applied to the directory.
     * </p>
     * 
     * @param schemaExtensionsInfo
     *        Information about the schema extensions applied to the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaExtensionsResult withSchemaExtensionsInfo(java.util.Collection<SchemaExtensionInfo> schemaExtensionsInfo) {
        setSchemaExtensionsInfo(schemaExtensionsInfo);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <code>ListSchemaExtensions</code> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *        subsequent call to <code>ListSchemaExtensions</code> to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <code>ListSchemaExtensions</code> to retrieve the next set of items.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *         subsequent call to <code>ListSchemaExtensions</code> to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <code>ListSchemaExtensions</code> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *        subsequent call to <code>ListSchemaExtensions</code> to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemaExtensionsResult withNextToken(String nextToken) {
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
        if (getSchemaExtensionsInfo() != null)
            sb.append("SchemaExtensionsInfo: ").append(getSchemaExtensionsInfo()).append(",");
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

        if (obj instanceof ListSchemaExtensionsResult == false)
            return false;
        ListSchemaExtensionsResult other = (ListSchemaExtensionsResult) obj;
        if (other.getSchemaExtensionsInfo() == null ^ this.getSchemaExtensionsInfo() == null)
            return false;
        if (other.getSchemaExtensionsInfo() != null && other.getSchemaExtensionsInfo().equals(this.getSchemaExtensionsInfo()) == false)
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

        hashCode = prime * hashCode + ((getSchemaExtensionsInfo() == null) ? 0 : getSchemaExtensionsInfo().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSchemaExtensionsResult clone() {
        try {
            return (ListSchemaExtensionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
