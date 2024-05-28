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
 * Provides the configuration information for the document fields/attributes that you want to base query suggestions on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AttributeSuggestionsGetConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeSuggestionsGetConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of document field/attribute keys or field names to use for query suggestions. If the content within any
     * of the fields match what your user starts typing as their query, then the field content is returned as a query
     * suggestion.
     * </p>
     */
    private java.util.List<String> suggestionAttributes;
    /**
     * <p>
     * The list of additional document field/attribute keys or field names to include in the response. You can use
     * additional fields to provide extra information in the response. Additional fields are not used to based
     * suggestions on.
     * </p>
     */
    private java.util.List<String> additionalResponseAttributes;
    /**
     * <p>
     * Filters the search results based on document fields/attributes.
     * </p>
     */
    private AttributeFilter attributeFilter;
    /**
     * <p>
     * Applies user context filtering so that only users who are given access to certain documents see these document in
     * their search results.
     * </p>
     */
    private UserContext userContext;

    /**
     * <p>
     * The list of document field/attribute keys or field names to use for query suggestions. If the content within any
     * of the fields match what your user starts typing as their query, then the field content is returned as a query
     * suggestion.
     * </p>
     * 
     * @return The list of document field/attribute keys or field names to use for query suggestions. If the content
     *         within any of the fields match what your user starts typing as their query, then the field content is
     *         returned as a query suggestion.
     */

    public java.util.List<String> getSuggestionAttributes() {
        return suggestionAttributes;
    }

    /**
     * <p>
     * The list of document field/attribute keys or field names to use for query suggestions. If the content within any
     * of the fields match what your user starts typing as their query, then the field content is returned as a query
     * suggestion.
     * </p>
     * 
     * @param suggestionAttributes
     *        The list of document field/attribute keys or field names to use for query suggestions. If the content
     *        within any of the fields match what your user starts typing as their query, then the field content is
     *        returned as a query suggestion.
     */

    public void setSuggestionAttributes(java.util.Collection<String> suggestionAttributes) {
        if (suggestionAttributes == null) {
            this.suggestionAttributes = null;
            return;
        }

        this.suggestionAttributes = new java.util.ArrayList<String>(suggestionAttributes);
    }

    /**
     * <p>
     * The list of document field/attribute keys or field names to use for query suggestions. If the content within any
     * of the fields match what your user starts typing as their query, then the field content is returned as a query
     * suggestion.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggestionAttributes(java.util.Collection)} or {@link #withSuggestionAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param suggestionAttributes
     *        The list of document field/attribute keys or field names to use for query suggestions. If the content
     *        within any of the fields match what your user starts typing as their query, then the field content is
     *        returned as a query suggestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeSuggestionsGetConfig withSuggestionAttributes(String... suggestionAttributes) {
        if (this.suggestionAttributes == null) {
            setSuggestionAttributes(new java.util.ArrayList<String>(suggestionAttributes.length));
        }
        for (String ele : suggestionAttributes) {
            this.suggestionAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of document field/attribute keys or field names to use for query suggestions. If the content within any
     * of the fields match what your user starts typing as their query, then the field content is returned as a query
     * suggestion.
     * </p>
     * 
     * @param suggestionAttributes
     *        The list of document field/attribute keys or field names to use for query suggestions. If the content
     *        within any of the fields match what your user starts typing as their query, then the field content is
     *        returned as a query suggestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeSuggestionsGetConfig withSuggestionAttributes(java.util.Collection<String> suggestionAttributes) {
        setSuggestionAttributes(suggestionAttributes);
        return this;
    }

    /**
     * <p>
     * The list of additional document field/attribute keys or field names to include in the response. You can use
     * additional fields to provide extra information in the response. Additional fields are not used to based
     * suggestions on.
     * </p>
     * 
     * @return The list of additional document field/attribute keys or field names to include in the response. You can
     *         use additional fields to provide extra information in the response. Additional fields are not used to
     *         based suggestions on.
     */

    public java.util.List<String> getAdditionalResponseAttributes() {
        return additionalResponseAttributes;
    }

    /**
     * <p>
     * The list of additional document field/attribute keys or field names to include in the response. You can use
     * additional fields to provide extra information in the response. Additional fields are not used to based
     * suggestions on.
     * </p>
     * 
     * @param additionalResponseAttributes
     *        The list of additional document field/attribute keys or field names to include in the response. You can
     *        use additional fields to provide extra information in the response. Additional fields are not used to
     *        based suggestions on.
     */

    public void setAdditionalResponseAttributes(java.util.Collection<String> additionalResponseAttributes) {
        if (additionalResponseAttributes == null) {
            this.additionalResponseAttributes = null;
            return;
        }

        this.additionalResponseAttributes = new java.util.ArrayList<String>(additionalResponseAttributes);
    }

    /**
     * <p>
     * The list of additional document field/attribute keys or field names to include in the response. You can use
     * additional fields to provide extra information in the response. Additional fields are not used to based
     * suggestions on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalResponseAttributes(java.util.Collection)} or
     * {@link #withAdditionalResponseAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalResponseAttributes
     *        The list of additional document field/attribute keys or field names to include in the response. You can
     *        use additional fields to provide extra information in the response. Additional fields are not used to
     *        based suggestions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeSuggestionsGetConfig withAdditionalResponseAttributes(String... additionalResponseAttributes) {
        if (this.additionalResponseAttributes == null) {
            setAdditionalResponseAttributes(new java.util.ArrayList<String>(additionalResponseAttributes.length));
        }
        for (String ele : additionalResponseAttributes) {
            this.additionalResponseAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of additional document field/attribute keys or field names to include in the response. You can use
     * additional fields to provide extra information in the response. Additional fields are not used to based
     * suggestions on.
     * </p>
     * 
     * @param additionalResponseAttributes
     *        The list of additional document field/attribute keys or field names to include in the response. You can
     *        use additional fields to provide extra information in the response. Additional fields are not used to
     *        based suggestions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeSuggestionsGetConfig withAdditionalResponseAttributes(java.util.Collection<String> additionalResponseAttributes) {
        setAdditionalResponseAttributes(additionalResponseAttributes);
        return this;
    }

    /**
     * <p>
     * Filters the search results based on document fields/attributes.
     * </p>
     * 
     * @param attributeFilter
     *        Filters the search results based on document fields/attributes.
     */

    public void setAttributeFilter(AttributeFilter attributeFilter) {
        this.attributeFilter = attributeFilter;
    }

    /**
     * <p>
     * Filters the search results based on document fields/attributes.
     * </p>
     * 
     * @return Filters the search results based on document fields/attributes.
     */

    public AttributeFilter getAttributeFilter() {
        return this.attributeFilter;
    }

    /**
     * <p>
     * Filters the search results based on document fields/attributes.
     * </p>
     * 
     * @param attributeFilter
     *        Filters the search results based on document fields/attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeSuggestionsGetConfig withAttributeFilter(AttributeFilter attributeFilter) {
        setAttributeFilter(attributeFilter);
        return this;
    }

    /**
     * <p>
     * Applies user context filtering so that only users who are given access to certain documents see these document in
     * their search results.
     * </p>
     * 
     * @param userContext
     *        Applies user context filtering so that only users who are given access to certain documents see these
     *        document in their search results.
     */

    public void setUserContext(UserContext userContext) {
        this.userContext = userContext;
    }

    /**
     * <p>
     * Applies user context filtering so that only users who are given access to certain documents see these document in
     * their search results.
     * </p>
     * 
     * @return Applies user context filtering so that only users who are given access to certain documents see these
     *         document in their search results.
     */

    public UserContext getUserContext() {
        return this.userContext;
    }

    /**
     * <p>
     * Applies user context filtering so that only users who are given access to certain documents see these document in
     * their search results.
     * </p>
     * 
     * @param userContext
     *        Applies user context filtering so that only users who are given access to certain documents see these
     *        document in their search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeSuggestionsGetConfig withUserContext(UserContext userContext) {
        setUserContext(userContext);
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
        if (getSuggestionAttributes() != null)
            sb.append("SuggestionAttributes: ").append(getSuggestionAttributes()).append(",");
        if (getAdditionalResponseAttributes() != null)
            sb.append("AdditionalResponseAttributes: ").append(getAdditionalResponseAttributes()).append(",");
        if (getAttributeFilter() != null)
            sb.append("AttributeFilter: ").append(getAttributeFilter()).append(",");
        if (getUserContext() != null)
            sb.append("UserContext: ").append(getUserContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeSuggestionsGetConfig == false)
            return false;
        AttributeSuggestionsGetConfig other = (AttributeSuggestionsGetConfig) obj;
        if (other.getSuggestionAttributes() == null ^ this.getSuggestionAttributes() == null)
            return false;
        if (other.getSuggestionAttributes() != null && other.getSuggestionAttributes().equals(this.getSuggestionAttributes()) == false)
            return false;
        if (other.getAdditionalResponseAttributes() == null ^ this.getAdditionalResponseAttributes() == null)
            return false;
        if (other.getAdditionalResponseAttributes() != null && other.getAdditionalResponseAttributes().equals(this.getAdditionalResponseAttributes()) == false)
            return false;
        if (other.getAttributeFilter() == null ^ this.getAttributeFilter() == null)
            return false;
        if (other.getAttributeFilter() != null && other.getAttributeFilter().equals(this.getAttributeFilter()) == false)
            return false;
        if (other.getUserContext() == null ^ this.getUserContext() == null)
            return false;
        if (other.getUserContext() != null && other.getUserContext().equals(this.getUserContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuggestionAttributes() == null) ? 0 : getSuggestionAttributes().hashCode());
        hashCode = prime * hashCode + ((getAdditionalResponseAttributes() == null) ? 0 : getAdditionalResponseAttributes().hashCode());
        hashCode = prime * hashCode + ((getAttributeFilter() == null) ? 0 : getAttributeFilter().hashCode());
        hashCode = prime * hashCode + ((getUserContext() == null) ? 0 : getUserContext().hashCode());
        return hashCode;
    }

    @Override
    public AttributeSuggestionsGetConfig clone() {
        try {
            return (AttributeSuggestionsGetConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.AttributeSuggestionsGetConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
