/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFields" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFieldsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of detailed field information.
     * </p>
     */
    private java.util.List<FieldSummary> fields;
    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of detailed field information.
     * </p>
     * 
     * @return List of detailed field information.
     */

    public java.util.List<FieldSummary> getFields() {
        return fields;
    }

    /**
     * <p>
     * List of detailed field information.
     * </p>
     * 
     * @param fields
     *        List of detailed field information.
     */

    public void setFields(java.util.Collection<FieldSummary> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<FieldSummary>(fields);
    }

    /**
     * <p>
     * List of detailed field information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        List of detailed field information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFieldsResult withFields(FieldSummary... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<FieldSummary>(fields.length));
        }
        for (FieldSummary ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of detailed field information.
     * </p>
     * 
     * @param fields
     *        List of detailed field information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFieldsResult withFields(java.util.Collection<FieldSummary> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @return The token for the next set of results. This is null if there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFieldsResult withNextToken(String nextToken) {
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
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
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

        if (obj instanceof ListFieldsResult == false)
            return false;
        ListFieldsResult other = (ListFieldsResult) obj;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
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

        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFieldsResult clone() {
        try {
            return (ListFieldsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
