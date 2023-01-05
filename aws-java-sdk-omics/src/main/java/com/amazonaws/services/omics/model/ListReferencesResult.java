/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of references.
     * </p>
     */
    private java.util.List<ReferenceListItem> references;

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @return A pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferencesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of references.
     * </p>
     * 
     * @return A list of references.
     */

    public java.util.List<ReferenceListItem> getReferences() {
        return references;
    }

    /**
     * <p>
     * A list of references.
     * </p>
     * 
     * @param references
     *        A list of references.
     */

    public void setReferences(java.util.Collection<ReferenceListItem> references) {
        if (references == null) {
            this.references = null;
            return;
        }

        this.references = new java.util.ArrayList<ReferenceListItem>(references);
    }

    /**
     * <p>
     * A list of references.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferences(java.util.Collection)} or {@link #withReferences(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param references
     *        A list of references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferencesResult withReferences(ReferenceListItem... references) {
        if (this.references == null) {
            setReferences(new java.util.ArrayList<ReferenceListItem>(references.length));
        }
        for (ReferenceListItem ele : references) {
            this.references.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of references.
     * </p>
     * 
     * @param references
     *        A list of references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferencesResult withReferences(java.util.Collection<ReferenceListItem> references) {
        setReferences(references);
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
        if (getReferences() != null)
            sb.append("References: ").append(getReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReferencesResult == false)
            return false;
        ListReferencesResult other = (ListReferencesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null && other.getReferences().equals(this.getReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        return hashCode;
    }

    @Override
    public ListReferencesResult clone() {
        try {
            return (ListReferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
