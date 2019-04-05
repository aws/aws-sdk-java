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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListDevelopmentSchemaArns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevelopmentSchemaArnsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARNs of retrieved development schemas.
     * </p>
     */
    private java.util.List<String> schemaArns;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARNs of retrieved development schemas.
     * </p>
     * 
     * @return The ARNs of retrieved development schemas.
     */

    public java.util.List<String> getSchemaArns() {
        return schemaArns;
    }

    /**
     * <p>
     * The ARNs of retrieved development schemas.
     * </p>
     * 
     * @param schemaArns
     *        The ARNs of retrieved development schemas.
     */

    public void setSchemaArns(java.util.Collection<String> schemaArns) {
        if (schemaArns == null) {
            this.schemaArns = null;
            return;
        }

        this.schemaArns = new java.util.ArrayList<String>(schemaArns);
    }

    /**
     * <p>
     * The ARNs of retrieved development schemas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaArns(java.util.Collection)} or {@link #withSchemaArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param schemaArns
     *        The ARNs of retrieved development schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevelopmentSchemaArnsResult withSchemaArns(String... schemaArns) {
        if (this.schemaArns == null) {
            setSchemaArns(new java.util.ArrayList<String>(schemaArns.length));
        }
        for (String ele : schemaArns) {
            this.schemaArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of retrieved development schemas.
     * </p>
     * 
     * @param schemaArns
     *        The ARNs of retrieved development schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevelopmentSchemaArnsResult withSchemaArns(java.util.Collection<String> schemaArns) {
        setSchemaArns(schemaArns);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevelopmentSchemaArnsResult withNextToken(String nextToken) {
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
        if (getSchemaArns() != null)
            sb.append("SchemaArns: ").append(getSchemaArns()).append(",");
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

        if (obj instanceof ListDevelopmentSchemaArnsResult == false)
            return false;
        ListDevelopmentSchemaArnsResult other = (ListDevelopmentSchemaArnsResult) obj;
        if (other.getSchemaArns() == null ^ this.getSchemaArns() == null)
            return false;
        if (other.getSchemaArns() != null && other.getSchemaArns().equals(this.getSchemaArns()) == false)
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

        hashCode = prime * hashCode + ((getSchemaArns() == null) ? 0 : getSchemaArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDevelopmentSchemaArnsResult clone() {
        try {
            return (ListDevelopmentSchemaArnsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
