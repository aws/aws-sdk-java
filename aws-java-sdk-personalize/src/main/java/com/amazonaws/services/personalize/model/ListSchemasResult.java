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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSchemas" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchemasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of schemas.
     * </p>
     */
    private java.util.List<DatasetSchemaSummary> schemas;
    /**
     * <p>
     * A token used to get the next set of schemas (if they exist).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of schemas.
     * </p>
     * 
     * @return A list of schemas.
     */

    public java.util.List<DatasetSchemaSummary> getSchemas() {
        return schemas;
    }

    /**
     * <p>
     * A list of schemas.
     * </p>
     * 
     * @param schemas
     *        A list of schemas.
     */

    public void setSchemas(java.util.Collection<DatasetSchemaSummary> schemas) {
        if (schemas == null) {
            this.schemas = null;
            return;
        }

        this.schemas = new java.util.ArrayList<DatasetSchemaSummary>(schemas);
    }

    /**
     * <p>
     * A list of schemas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemas(java.util.Collection)} or {@link #withSchemas(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param schemas
     *        A list of schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasResult withSchemas(DatasetSchemaSummary... schemas) {
        if (this.schemas == null) {
            setSchemas(new java.util.ArrayList<DatasetSchemaSummary>(schemas.length));
        }
        for (DatasetSchemaSummary ele : schemas) {
            this.schemas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of schemas.
     * </p>
     * 
     * @param schemas
     *        A list of schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasResult withSchemas(java.util.Collection<DatasetSchemaSummary> schemas) {
        setSchemas(schemas);
        return this;
    }

    /**
     * <p>
     * A token used to get the next set of schemas (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token used to get the next set of schemas (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of schemas (if they exist).
     * </p>
     * 
     * @return A token used to get the next set of schemas (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of schemas (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token used to get the next set of schemas (if they exist).
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

        if (obj instanceof ListSchemasResult == false)
            return false;
        ListSchemasResult other = (ListSchemasResult) obj;
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
    public ListSchemasResult clone() {
        try {
            return (ListSchemasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
