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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSearchSuggestions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSearchSuggestionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a <code>SuggestionQuery</code>.
     * </p>
     */
    private java.util.List<PropertyNameSuggestion> propertyNameSuggestions;

    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a <code>SuggestionQuery</code>.
     * </p>
     * 
     * @return A list of property names for a <code>Resource</code> that match a <code>SuggestionQuery</code>.
     */

    public java.util.List<PropertyNameSuggestion> getPropertyNameSuggestions() {
        return propertyNameSuggestions;
    }

    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a <code>SuggestionQuery</code>.
     * </p>
     * 
     * @param propertyNameSuggestions
     *        A list of property names for a <code>Resource</code> that match a <code>SuggestionQuery</code>.
     */

    public void setPropertyNameSuggestions(java.util.Collection<PropertyNameSuggestion> propertyNameSuggestions) {
        if (propertyNameSuggestions == null) {
            this.propertyNameSuggestions = null;
            return;
        }

        this.propertyNameSuggestions = new java.util.ArrayList<PropertyNameSuggestion>(propertyNameSuggestions);
    }

    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a <code>SuggestionQuery</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyNameSuggestions(java.util.Collection)} or
     * {@link #withPropertyNameSuggestions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param propertyNameSuggestions
     *        A list of property names for a <code>Resource</code> that match a <code>SuggestionQuery</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSearchSuggestionsResult withPropertyNameSuggestions(PropertyNameSuggestion... propertyNameSuggestions) {
        if (this.propertyNameSuggestions == null) {
            setPropertyNameSuggestions(new java.util.ArrayList<PropertyNameSuggestion>(propertyNameSuggestions.length));
        }
        for (PropertyNameSuggestion ele : propertyNameSuggestions) {
            this.propertyNameSuggestions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a <code>SuggestionQuery</code>.
     * </p>
     * 
     * @param propertyNameSuggestions
     *        A list of property names for a <code>Resource</code> that match a <code>SuggestionQuery</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSearchSuggestionsResult withPropertyNameSuggestions(java.util.Collection<PropertyNameSuggestion> propertyNameSuggestions) {
        setPropertyNameSuggestions(propertyNameSuggestions);
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
        if (getPropertyNameSuggestions() != null)
            sb.append("PropertyNameSuggestions: ").append(getPropertyNameSuggestions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSearchSuggestionsResult == false)
            return false;
        GetSearchSuggestionsResult other = (GetSearchSuggestionsResult) obj;
        if (other.getPropertyNameSuggestions() == null ^ this.getPropertyNameSuggestions() == null)
            return false;
        if (other.getPropertyNameSuggestions() != null && other.getPropertyNameSuggestions().equals(this.getPropertyNameSuggestions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyNameSuggestions() == null) ? 0 : getPropertyNameSuggestions().hashCode());
        return hashCode;
    }

    @Override
    public GetSearchSuggestionsResult clone() {
        try {
            return (GetSearchSuggestionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
