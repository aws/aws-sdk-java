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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the count of documents that match a particular attribute when doing a faceted search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DocumentAttributeValueCountPair"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentAttributeValueCountPair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the attribute. For example, "HR".
     * </p>
     */
    private DocumentAttributeValue documentAttributeValue;
    /**
     * <p>
     * The number of documents in the response that have the attribute value for the key.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * Contains the results of a document attribute that is a nested facet. A <code>FacetResult</code> contains the
     * counts for each facet nested within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. The counts for documents that belong to
     * "Frontend" and "Backend" within "Engineering" are returned for a query.
     * </p>
     */
    private java.util.List<FacetResult> facetResults;

    /**
     * <p>
     * The value of the attribute. For example, "HR".
     * </p>
     * 
     * @param documentAttributeValue
     *        The value of the attribute. For example, "HR".
     */

    public void setDocumentAttributeValue(DocumentAttributeValue documentAttributeValue) {
        this.documentAttributeValue = documentAttributeValue;
    }

    /**
     * <p>
     * The value of the attribute. For example, "HR".
     * </p>
     * 
     * @return The value of the attribute. For example, "HR".
     */

    public DocumentAttributeValue getDocumentAttributeValue() {
        return this.documentAttributeValue;
    }

    /**
     * <p>
     * The value of the attribute. For example, "HR".
     * </p>
     * 
     * @param documentAttributeValue
     *        The value of the attribute. For example, "HR".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeValueCountPair withDocumentAttributeValue(DocumentAttributeValue documentAttributeValue) {
        setDocumentAttributeValue(documentAttributeValue);
        return this;
    }

    /**
     * <p>
     * The number of documents in the response that have the attribute value for the key.
     * </p>
     * 
     * @param count
     *        The number of documents in the response that have the attribute value for the key.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of documents in the response that have the attribute value for the key.
     * </p>
     * 
     * @return The number of documents in the response that have the attribute value for the key.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of documents in the response that have the attribute value for the key.
     * </p>
     * 
     * @param count
     *        The number of documents in the response that have the attribute value for the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeValueCountPair withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * Contains the results of a document attribute that is a nested facet. A <code>FacetResult</code> contains the
     * counts for each facet nested within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. The counts for documents that belong to
     * "Frontend" and "Backend" within "Engineering" are returned for a query.
     * </p>
     * 
     * @return Contains the results of a document attribute that is a nested facet. A <code>FacetResult</code> contains
     *         the counts for each facet nested within a facet.</p>
     *         <p>
     *         For example, the document attribute or facet "Department" includes a value called "Engineering". In
     *         addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend"
     *         for documents assigned to "Engineering". You can display nested facets in the search results so that
     *         documents can be searched not only by department but also by a sub department within a department. The
     *         counts for documents that belong to "Frontend" and "Backend" within "Engineering" are returned for a
     *         query.
     */

    public java.util.List<FacetResult> getFacetResults() {
        return facetResults;
    }

    /**
     * <p>
     * Contains the results of a document attribute that is a nested facet. A <code>FacetResult</code> contains the
     * counts for each facet nested within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. The counts for documents that belong to
     * "Frontend" and "Backend" within "Engineering" are returned for a query.
     * </p>
     * 
     * @param facetResults
     *        Contains the results of a document attribute that is a nested facet. A <code>FacetResult</code> contains
     *        the counts for each facet nested within a facet.</p>
     *        <p>
     *        For example, the document attribute or facet "Department" includes a value called "Engineering". In
     *        addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for
     *        documents assigned to "Engineering". You can display nested facets in the search results so that documents
     *        can be searched not only by department but also by a sub department within a department. The counts for
     *        documents that belong to "Frontend" and "Backend" within "Engineering" are returned for a query.
     */

    public void setFacetResults(java.util.Collection<FacetResult> facetResults) {
        if (facetResults == null) {
            this.facetResults = null;
            return;
        }

        this.facetResults = new java.util.ArrayList<FacetResult>(facetResults);
    }

    /**
     * <p>
     * Contains the results of a document attribute that is a nested facet. A <code>FacetResult</code> contains the
     * counts for each facet nested within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. The counts for documents that belong to
     * "Frontend" and "Backend" within "Engineering" are returned for a query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFacetResults(java.util.Collection)} or {@link #withFacetResults(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param facetResults
     *        Contains the results of a document attribute that is a nested facet. A <code>FacetResult</code> contains
     *        the counts for each facet nested within a facet.</p>
     *        <p>
     *        For example, the document attribute or facet "Department" includes a value called "Engineering". In
     *        addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for
     *        documents assigned to "Engineering". You can display nested facets in the search results so that documents
     *        can be searched not only by department but also by a sub department within a department. The counts for
     *        documents that belong to "Frontend" and "Backend" within "Engineering" are returned for a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeValueCountPair withFacetResults(FacetResult... facetResults) {
        if (this.facetResults == null) {
            setFacetResults(new java.util.ArrayList<FacetResult>(facetResults.length));
        }
        for (FacetResult ele : facetResults) {
            this.facetResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the results of a document attribute that is a nested facet. A <code>FacetResult</code> contains the
     * counts for each facet nested within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. The counts for documents that belong to
     * "Frontend" and "Backend" within "Engineering" are returned for a query.
     * </p>
     * 
     * @param facetResults
     *        Contains the results of a document attribute that is a nested facet. A <code>FacetResult</code> contains
     *        the counts for each facet nested within a facet.</p>
     *        <p>
     *        For example, the document attribute or facet "Department" includes a value called "Engineering". In
     *        addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for
     *        documents assigned to "Engineering". You can display nested facets in the search results so that documents
     *        can be searched not only by department but also by a sub department within a department. The counts for
     *        documents that belong to "Frontend" and "Backend" within "Engineering" are returned for a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeValueCountPair withFacetResults(java.util.Collection<FacetResult> facetResults) {
        setFacetResults(facetResults);
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
        if (getDocumentAttributeValue() != null)
            sb.append("DocumentAttributeValue: ").append(getDocumentAttributeValue()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getFacetResults() != null)
            sb.append("FacetResults: ").append(getFacetResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentAttributeValueCountPair == false)
            return false;
        DocumentAttributeValueCountPair other = (DocumentAttributeValueCountPair) obj;
        if (other.getDocumentAttributeValue() == null ^ this.getDocumentAttributeValue() == null)
            return false;
        if (other.getDocumentAttributeValue() != null && other.getDocumentAttributeValue().equals(this.getDocumentAttributeValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getFacetResults() == null ^ this.getFacetResults() == null)
            return false;
        if (other.getFacetResults() != null && other.getFacetResults().equals(this.getFacetResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentAttributeValue() == null) ? 0 : getDocumentAttributeValue().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getFacetResults() == null) ? 0 : getFacetResults().hashCode());
        return hashCode;
    }

    @Override
    public DocumentAttributeValueCountPair clone() {
        try {
            return (DocumentAttributeValueCountPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DocumentAttributeValueCountPairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
