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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A featured document. This document is displayed at the top of the search results page, placed above all other results
 * for certain queries. If there's an exact match of a query, then the document is featured in the search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/FeaturedDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeaturedDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the document to feature in the search results. You can use the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific documents
     * with their document IDs included in the result items, or you can use the console.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The identifier of the document to feature in the search results. You can use the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific documents
     * with their document IDs included in the result items, or you can use the console.
     * </p>
     * 
     * @param id
     *        The identifier of the document to feature in the search results. You can use the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific
     *        documents with their document IDs included in the result items, or you can use the console.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the document to feature in the search results. You can use the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific documents
     * with their document IDs included in the result items, or you can use the console.
     * </p>
     * 
     * @return The identifier of the document to feature in the search results. You can use the <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific
     *         documents with their document IDs included in the result items, or you can use the console.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the document to feature in the search results. You can use the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific documents
     * with their document IDs included in the result items, or you can use the console.
     * </p>
     * 
     * @param id
     *        The identifier of the document to feature in the search results. You can use the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific
     *        documents with their document IDs included in the result items, or you can use the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedDocument withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeaturedDocument == false)
            return false;
        FeaturedDocument other = (FeaturedDocument) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public FeaturedDocument clone() {
        try {
            return (FeaturedDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FeaturedDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
