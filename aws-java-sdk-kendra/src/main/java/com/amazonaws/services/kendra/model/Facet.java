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
 * Information about a document attribute. You can use document attributes as facets.
 * </p>
 * <p>
 * For example, the document attribute or facet "Department" includes the values "HR", "Engineering", and "Accounting".
 * You can display these values in the search results so that documents can be searched by department.
 * </p>
 * <p>
 * You can display up to 10 facet values per facet for a query. If you want to increase this limit, contact <a
 * href="http://aws.amazon.com/contact-us/">Support</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Facet" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Facet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique key for the document attribute.
     * </p>
     */
    private String documentAttributeKey;
    /**
     * <p>
     * An array of document attributes that are nested facets within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. This helps your users further narrow their
     * search.
     * </p>
     * <p>
     * You can only have one nested facet within a facet. If you want to increase this limit, contact <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     */
    private java.util.List<Facet> facets;
    /**
     * <p>
     * Maximum number of facet values per facet. The default is 10. You can use this to limit the number of facet values
     * to less than 10. If you want to increase the default, contact <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique key for the document attribute.
     * </p>
     * 
     * @param documentAttributeKey
     *        The unique key for the document attribute.
     */

    public void setDocumentAttributeKey(String documentAttributeKey) {
        this.documentAttributeKey = documentAttributeKey;
    }

    /**
     * <p>
     * The unique key for the document attribute.
     * </p>
     * 
     * @return The unique key for the document attribute.
     */

    public String getDocumentAttributeKey() {
        return this.documentAttributeKey;
    }

    /**
     * <p>
     * The unique key for the document attribute.
     * </p>
     * 
     * @param documentAttributeKey
     *        The unique key for the document attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Facet withDocumentAttributeKey(String documentAttributeKey) {
        setDocumentAttributeKey(documentAttributeKey);
        return this;
    }

    /**
     * <p>
     * An array of document attributes that are nested facets within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. This helps your users further narrow their
     * search.
     * </p>
     * <p>
     * You can only have one nested facet within a facet. If you want to increase this limit, contact <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * 
     * @return An array of document attributes that are nested facets within a facet.</p>
     *         <p>
     *         For example, the document attribute or facet "Department" includes a value called "Engineering". In
     *         addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend"
     *         for documents assigned to "Engineering". You can display nested facets in the search results so that
     *         documents can be searched not only by department but also by a sub department within a department. This
     *         helps your users further narrow their search.
     *         </p>
     *         <p>
     *         You can only have one nested facet within a facet. If you want to increase this limit, contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a>.
     */

    public java.util.List<Facet> getFacets() {
        return facets;
    }

    /**
     * <p>
     * An array of document attributes that are nested facets within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. This helps your users further narrow their
     * search.
     * </p>
     * <p>
     * You can only have one nested facet within a facet. If you want to increase this limit, contact <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * 
     * @param facets
     *        An array of document attributes that are nested facets within a facet.</p>
     *        <p>
     *        For example, the document attribute or facet "Department" includes a value called "Engineering". In
     *        addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for
     *        documents assigned to "Engineering". You can display nested facets in the search results so that documents
     *        can be searched not only by department but also by a sub department within a department. This helps your
     *        users further narrow their search.
     *        </p>
     *        <p>
     *        You can only have one nested facet within a facet. If you want to increase this limit, contact <a
     *        href="http://aws.amazon.com/contact-us/">Support</a>.
     */

    public void setFacets(java.util.Collection<Facet> facets) {
        if (facets == null) {
            this.facets = null;
            return;
        }

        this.facets = new java.util.ArrayList<Facet>(facets);
    }

    /**
     * <p>
     * An array of document attributes that are nested facets within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. This helps your users further narrow their
     * search.
     * </p>
     * <p>
     * You can only have one nested facet within a facet. If you want to increase this limit, contact <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFacets(java.util.Collection)} or {@link #withFacets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param facets
     *        An array of document attributes that are nested facets within a facet.</p>
     *        <p>
     *        For example, the document attribute or facet "Department" includes a value called "Engineering". In
     *        addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for
     *        documents assigned to "Engineering". You can display nested facets in the search results so that documents
     *        can be searched not only by department but also by a sub department within a department. This helps your
     *        users further narrow their search.
     *        </p>
     *        <p>
     *        You can only have one nested facet within a facet. If you want to increase this limit, contact <a
     *        href="http://aws.amazon.com/contact-us/">Support</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Facet withFacets(Facet... facets) {
        if (this.facets == null) {
            setFacets(new java.util.ArrayList<Facet>(facets.length));
        }
        for (Facet ele : facets) {
            this.facets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of document attributes that are nested facets within a facet.
     * </p>
     * <p>
     * For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the
     * document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned
     * to "Engineering". You can display nested facets in the search results so that documents can be searched not only
     * by department but also by a sub department within a department. This helps your users further narrow their
     * search.
     * </p>
     * <p>
     * You can only have one nested facet within a facet. If you want to increase this limit, contact <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * 
     * @param facets
     *        An array of document attributes that are nested facets within a facet.</p>
     *        <p>
     *        For example, the document attribute or facet "Department" includes a value called "Engineering". In
     *        addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for
     *        documents assigned to "Engineering". You can display nested facets in the search results so that documents
     *        can be searched not only by department but also by a sub department within a department. This helps your
     *        users further narrow their search.
     *        </p>
     *        <p>
     *        You can only have one nested facet within a facet. If you want to increase this limit, contact <a
     *        href="http://aws.amazon.com/contact-us/">Support</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Facet withFacets(java.util.Collection<Facet> facets) {
        setFacets(facets);
        return this;
    }

    /**
     * <p>
     * Maximum number of facet values per facet. The default is 10. You can use this to limit the number of facet values
     * to less than 10. If you want to increase the default, contact <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of facet values per facet. The default is 10. You can use this to limit the number of facet
     *        values to less than 10. If you want to increase the default, contact <a
     *        href="http://aws.amazon.com/contact-us/">Support</a>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of facet values per facet. The default is 10. You can use this to limit the number of facet values
     * to less than 10. If you want to increase the default, contact <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * 
     * @return Maximum number of facet values per facet. The default is 10. You can use this to limit the number of
     *         facet values to less than 10. If you want to increase the default, contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of facet values per facet. The default is 10. You can use this to limit the number of facet values
     * to less than 10. If you want to increase the default, contact <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of facet values per facet. The default is 10. You can use this to limit the number of facet
     *        values to less than 10. If you want to increase the default, contact <a
     *        href="http://aws.amazon.com/contact-us/">Support</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Facet withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getDocumentAttributeKey() != null)
            sb.append("DocumentAttributeKey: ").append(getDocumentAttributeKey()).append(",");
        if (getFacets() != null)
            sb.append("Facets: ").append(getFacets()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Facet == false)
            return false;
        Facet other = (Facet) obj;
        if (other.getDocumentAttributeKey() == null ^ this.getDocumentAttributeKey() == null)
            return false;
        if (other.getDocumentAttributeKey() != null && other.getDocumentAttributeKey().equals(this.getDocumentAttributeKey()) == false)
            return false;
        if (other.getFacets() == null ^ this.getFacets() == null)
            return false;
        if (other.getFacets() != null && other.getFacets().equals(this.getFacets()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentAttributeKey() == null) ? 0 : getDocumentAttributeKey().hashCode());
        hashCode = prime * hashCode + ((getFacets() == null) ? 0 : getFacets().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public Facet clone() {
        try {
            return (Facet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FacetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
