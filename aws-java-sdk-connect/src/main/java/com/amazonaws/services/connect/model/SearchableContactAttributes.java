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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines search criteria based on user-defined contact attributes that are configured for contact
 * search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchableContactAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchableContactAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of criteria based on user-defined contact attributes that are configured for contact search.
     * </p>
     */
    private java.util.List<SearchableContactAttributesCriteria> criteria;
    /**
     * <p>
     * The match type combining search criteria using multiple searchable contact attributes.
     * </p>
     */
    private String matchType;

    /**
     * <p>
     * The list of criteria based on user-defined contact attributes that are configured for contact search.
     * </p>
     * 
     * @return The list of criteria based on user-defined contact attributes that are configured for contact search.
     */

    public java.util.List<SearchableContactAttributesCriteria> getCriteria() {
        return criteria;
    }

    /**
     * <p>
     * The list of criteria based on user-defined contact attributes that are configured for contact search.
     * </p>
     * 
     * @param criteria
     *        The list of criteria based on user-defined contact attributes that are configured for contact search.
     */

    public void setCriteria(java.util.Collection<SearchableContactAttributesCriteria> criteria) {
        if (criteria == null) {
            this.criteria = null;
            return;
        }

        this.criteria = new java.util.ArrayList<SearchableContactAttributesCriteria>(criteria);
    }

    /**
     * <p>
     * The list of criteria based on user-defined contact attributes that are configured for contact search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCriteria(java.util.Collection)} or {@link #withCriteria(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param criteria
     *        The list of criteria based on user-defined contact attributes that are configured for contact search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchableContactAttributes withCriteria(SearchableContactAttributesCriteria... criteria) {
        if (this.criteria == null) {
            setCriteria(new java.util.ArrayList<SearchableContactAttributesCriteria>(criteria.length));
        }
        for (SearchableContactAttributesCriteria ele : criteria) {
            this.criteria.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of criteria based on user-defined contact attributes that are configured for contact search.
     * </p>
     * 
     * @param criteria
     *        The list of criteria based on user-defined contact attributes that are configured for contact search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchableContactAttributes withCriteria(java.util.Collection<SearchableContactAttributesCriteria> criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple searchable contact attributes.
     * </p>
     * 
     * @param matchType
     *        The match type combining search criteria using multiple searchable contact attributes.
     * @see SearchContactsMatchType
     */

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple searchable contact attributes.
     * </p>
     * 
     * @return The match type combining search criteria using multiple searchable contact attributes.
     * @see SearchContactsMatchType
     */

    public String getMatchType() {
        return this.matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple searchable contact attributes.
     * </p>
     * 
     * @param matchType
     *        The match type combining search criteria using multiple searchable contact attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchContactsMatchType
     */

    public SearchableContactAttributes withMatchType(String matchType) {
        setMatchType(matchType);
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple searchable contact attributes.
     * </p>
     * 
     * @param matchType
     *        The match type combining search criteria using multiple searchable contact attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchContactsMatchType
     */

    public SearchableContactAttributes withMatchType(SearchContactsMatchType matchType) {
        this.matchType = matchType.toString();
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
        if (getCriteria() != null)
            sb.append("Criteria: ").append(getCriteria()).append(",");
        if (getMatchType() != null)
            sb.append("MatchType: ").append(getMatchType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchableContactAttributes == false)
            return false;
        SearchableContactAttributes other = (SearchableContactAttributes) obj;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getMatchType() == null ^ this.getMatchType() == null)
            return false;
        if (other.getMatchType() != null && other.getMatchType().equals(this.getMatchType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        return hashCode;
    }

    @Override
    public SearchableContactAttributes clone() {
        try {
            return (SearchableContactAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.SearchableContactAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
