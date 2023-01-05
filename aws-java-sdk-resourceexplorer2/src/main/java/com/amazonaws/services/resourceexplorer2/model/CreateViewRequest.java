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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/CreateView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateViewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of
     * duplicate versions. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the uniqueness of
     * your views.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * An array of strings that specify which resources are included in the results of queries made using this view.
     * When you use this view in a <a>Search</a> operation, the filter string is combined with the search's
     * <code>QueryString</code> parameter using a logical <code>AND</code> operator.
     * </p>
     * <p>
     * For information about the supported syntax, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html">Search query
     * reference for Resource Explorer</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This query string in the context of this operation supports only <a href=
     * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters"
     * >filter prefixes</a> with optional <a href=
     * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators"
     * >operators</a>. It doesn't support free-form text. For example, the string
     * <code>region:us* service:ec2 -tag:stage=prod</code> includes all Amazon EC2 resources in any Amazon Web Services
     * Region that begins with the letters <code>us</code> and is <i>not</i> tagged with a key <code>Stage</code> that
     * has the value <code>prod</code>.
     * </p>
     * </important>
     */
    private SearchFilter filters;
    /**
     * <p>
     * Specifies optional fields that you want included in search results from this view. It is a list of objects that
     * each describe a field to include.
     * </p>
     * <p>
     * The default is an empty list, with no optional fields included in the results.
     * </p>
     */
    private java.util.List<IncludedProperty> includedProperties;
    /**
     * <p>
     * Tag key and value pairs that are attached to the view.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The name of the new view. This name appears in the list of views in Resource Explorer.
     * </p>
     * <p>
     * The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character.
     * The name must be unique within its Amazon Web Services Region.
     * </p>
     */
    private String viewName;

    /**
     * <p>
     * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of
     * duplicate versions. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the uniqueness of
     * your views.
     * </p>
     * 
     * @param clientToken
     *        This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation
     *        of duplicate versions. We recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the
     *        uniqueness of your views.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of
     * duplicate versions. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the uniqueness of
     * your views.
     * </p>
     * 
     * @return This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation
     *         of duplicate versions. We recommend that you generate a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the
     *         uniqueness of your views.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of
     * duplicate versions. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the uniqueness of
     * your views.
     * </p>
     * 
     * @param clientToken
     *        This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation
     *        of duplicate versions. We recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the
     *        uniqueness of your views.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify which resources are included in the results of queries made using this view.
     * When you use this view in a <a>Search</a> operation, the filter string is combined with the search's
     * <code>QueryString</code> parameter using a logical <code>AND</code> operator.
     * </p>
     * <p>
     * For information about the supported syntax, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html">Search query
     * reference for Resource Explorer</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This query string in the context of this operation supports only <a href=
     * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters"
     * >filter prefixes</a> with optional <a href=
     * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators"
     * >operators</a>. It doesn't support free-form text. For example, the string
     * <code>region:us* service:ec2 -tag:stage=prod</code> includes all Amazon EC2 resources in any Amazon Web Services
     * Region that begins with the letters <code>us</code> and is <i>not</i> tagged with a key <code>Stage</code> that
     * has the value <code>prod</code>.
     * </p>
     * </important>
     * 
     * @param filters
     *        An array of strings that specify which resources are included in the results of queries made using this
     *        view. When you use this view in a <a>Search</a> operation, the filter string is combined with the search's
     *        <code>QueryString</code> parameter using a logical <code>AND</code> operator.</p>
     *        <p>
     *        For information about the supported syntax, see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html"
     *        >Search query reference for Resource Explorer</a> in the <i>Amazon Web Services Resource Explorer User
     *        Guide</i>.
     *        </p>
     *        <important>
     *        <p>
     *        This query string in the context of this operation supports only <a href=
     *        "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters"
     *        >filter prefixes</a> with optional <a href=
     *        "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators"
     *        >operators</a>. It doesn't support free-form text. For example, the string
     *        <code>region:us* service:ec2 -tag:stage=prod</code> includes all Amazon EC2 resources in any Amazon Web
     *        Services Region that begins with the letters <code>us</code> and is <i>not</i> tagged with a key
     *        <code>Stage</code> that has the value <code>prod</code>.
     *        </p>
     */

    public void setFilters(SearchFilter filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * An array of strings that specify which resources are included in the results of queries made using this view.
     * When you use this view in a <a>Search</a> operation, the filter string is combined with the search's
     * <code>QueryString</code> parameter using a logical <code>AND</code> operator.
     * </p>
     * <p>
     * For information about the supported syntax, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html">Search query
     * reference for Resource Explorer</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This query string in the context of this operation supports only <a href=
     * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters"
     * >filter prefixes</a> with optional <a href=
     * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators"
     * >operators</a>. It doesn't support free-form text. For example, the string
     * <code>region:us* service:ec2 -tag:stage=prod</code> includes all Amazon EC2 resources in any Amazon Web Services
     * Region that begins with the letters <code>us</code> and is <i>not</i> tagged with a key <code>Stage</code> that
     * has the value <code>prod</code>.
     * </p>
     * </important>
     * 
     * @return An array of strings that specify which resources are included in the results of queries made using this
     *         view. When you use this view in a <a>Search</a> operation, the filter string is combined with the
     *         search's <code>QueryString</code> parameter using a logical <code>AND</code> operator.</p>
     *         <p>
     *         For information about the supported syntax, see <a
     *         href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html"
     *         >Search query reference for Resource Explorer</a> in the <i>Amazon Web Services Resource Explorer User
     *         Guide</i>.
     *         </p>
     *         <important>
     *         <p>
     *         This query string in the context of this operation supports only <a href=
     *         "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters"
     *         >filter prefixes</a> with optional <a href=
     *         "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators"
     *         >operators</a>. It doesn't support free-form text. For example, the string
     *         <code>region:us* service:ec2 -tag:stage=prod</code> includes all Amazon EC2 resources in any Amazon Web
     *         Services Region that begins with the letters <code>us</code> and is <i>not</i> tagged with a key
     *         <code>Stage</code> that has the value <code>prod</code>.
     *         </p>
     */

    public SearchFilter getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * An array of strings that specify which resources are included in the results of queries made using this view.
     * When you use this view in a <a>Search</a> operation, the filter string is combined with the search's
     * <code>QueryString</code> parameter using a logical <code>AND</code> operator.
     * </p>
     * <p>
     * For information about the supported syntax, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html">Search query
     * reference for Resource Explorer</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This query string in the context of this operation supports only <a href=
     * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters"
     * >filter prefixes</a> with optional <a href=
     * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators"
     * >operators</a>. It doesn't support free-form text. For example, the string
     * <code>region:us* service:ec2 -tag:stage=prod</code> includes all Amazon EC2 resources in any Amazon Web Services
     * Region that begins with the letters <code>us</code> and is <i>not</i> tagged with a key <code>Stage</code> that
     * has the value <code>prod</code>.
     * </p>
     * </important>
     * 
     * @param filters
     *        An array of strings that specify which resources are included in the results of queries made using this
     *        view. When you use this view in a <a>Search</a> operation, the filter string is combined with the search's
     *        <code>QueryString</code> parameter using a logical <code>AND</code> operator.</p>
     *        <p>
     *        For information about the supported syntax, see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html"
     *        >Search query reference for Resource Explorer</a> in the <i>Amazon Web Services Resource Explorer User
     *        Guide</i>.
     *        </p>
     *        <important>
     *        <p>
     *        This query string in the context of this operation supports only <a href=
     *        "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-filters"
     *        >filter prefixes</a> with optional <a href=
     *        "https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html#query-syntax-operators"
     *        >operators</a>. It doesn't support free-form text. For example, the string
     *        <code>region:us* service:ec2 -tag:stage=prod</code> includes all Amazon EC2 resources in any Amazon Web
     *        Services Region that begins with the letters <code>us</code> and is <i>not</i> tagged with a key
     *        <code>Stage</code> that has the value <code>prod</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withFilters(SearchFilter filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Specifies optional fields that you want included in search results from this view. It is a list of objects that
     * each describe a field to include.
     * </p>
     * <p>
     * The default is an empty list, with no optional fields included in the results.
     * </p>
     * 
     * @return Specifies optional fields that you want included in search results from this view. It is a list of
     *         objects that each describe a field to include.</p>
     *         <p>
     *         The default is an empty list, with no optional fields included in the results.
     */

    public java.util.List<IncludedProperty> getIncludedProperties() {
        return includedProperties;
    }

    /**
     * <p>
     * Specifies optional fields that you want included in search results from this view. It is a list of objects that
     * each describe a field to include.
     * </p>
     * <p>
     * The default is an empty list, with no optional fields included in the results.
     * </p>
     * 
     * @param includedProperties
     *        Specifies optional fields that you want included in search results from this view. It is a list of objects
     *        that each describe a field to include.</p>
     *        <p>
     *        The default is an empty list, with no optional fields included in the results.
     */

    public void setIncludedProperties(java.util.Collection<IncludedProperty> includedProperties) {
        if (includedProperties == null) {
            this.includedProperties = null;
            return;
        }

        this.includedProperties = new java.util.ArrayList<IncludedProperty>(includedProperties);
    }

    /**
     * <p>
     * Specifies optional fields that you want included in search results from this view. It is a list of objects that
     * each describe a field to include.
     * </p>
     * <p>
     * The default is an empty list, with no optional fields included in the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludedProperties(java.util.Collection)} or {@link #withIncludedProperties(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param includedProperties
     *        Specifies optional fields that you want included in search results from this view. It is a list of objects
     *        that each describe a field to include.</p>
     *        <p>
     *        The default is an empty list, with no optional fields included in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withIncludedProperties(IncludedProperty... includedProperties) {
        if (this.includedProperties == null) {
            setIncludedProperties(new java.util.ArrayList<IncludedProperty>(includedProperties.length));
        }
        for (IncludedProperty ele : includedProperties) {
            this.includedProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies optional fields that you want included in search results from this view. It is a list of objects that
     * each describe a field to include.
     * </p>
     * <p>
     * The default is an empty list, with no optional fields included in the results.
     * </p>
     * 
     * @param includedProperties
     *        Specifies optional fields that you want included in search results from this view. It is a list of objects
     *        that each describe a field to include.</p>
     *        <p>
     *        The default is an empty list, with no optional fields included in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withIncludedProperties(java.util.Collection<IncludedProperty> includedProperties) {
        setIncludedProperties(includedProperties);
        return this;
    }

    /**
     * <p>
     * Tag key and value pairs that are attached to the view.
     * </p>
     * 
     * @return Tag key and value pairs that are attached to the view.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tag key and value pairs that are attached to the view.
     * </p>
     * 
     * @param tags
     *        Tag key and value pairs that are attached to the view.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tag key and value pairs that are attached to the view.
     * </p>
     * 
     * @param tags
     *        Tag key and value pairs that are attached to the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateViewRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name of the new view. This name appears in the list of views in Resource Explorer.
     * </p>
     * <p>
     * The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character.
     * The name must be unique within its Amazon Web Services Region.
     * </p>
     * 
     * @param viewName
     *        The name of the new view. This name appears in the list of views in Resource Explorer.</p>
     *        <p>
     *        The name must be no more than 64 characters long, and can include letters, digits, and the dash (-)
     *        character. The name must be unique within its Amazon Web Services Region.
     */

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * <p>
     * The name of the new view. This name appears in the list of views in Resource Explorer.
     * </p>
     * <p>
     * The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character.
     * The name must be unique within its Amazon Web Services Region.
     * </p>
     * 
     * @return The name of the new view. This name appears in the list of views in Resource Explorer.</p>
     *         <p>
     *         The name must be no more than 64 characters long, and can include letters, digits, and the dash (-)
     *         character. The name must be unique within its Amazon Web Services Region.
     */

    public String getViewName() {
        return this.viewName;
    }

    /**
     * <p>
     * The name of the new view. This name appears in the list of views in Resource Explorer.
     * </p>
     * <p>
     * The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character.
     * The name must be unique within its Amazon Web Services Region.
     * </p>
     * 
     * @param viewName
     *        The name of the new view. This name appears in the list of views in Resource Explorer.</p>
     *        <p>
     *        The name must be no more than 64 characters long, and can include letters, digits, and the dash (-)
     *        character. The name must be unique within its Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateViewRequest withViewName(String viewName) {
        setViewName(viewName);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append("***Sensitive Data Redacted***").append(",");
        if (getIncludedProperties() != null)
            sb.append("IncludedProperties: ").append(getIncludedProperties()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getViewName() != null)
            sb.append("ViewName: ").append(getViewName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateViewRequest == false)
            return false;
        CreateViewRequest other = (CreateViewRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getIncludedProperties() == null ^ this.getIncludedProperties() == null)
            return false;
        if (other.getIncludedProperties() != null && other.getIncludedProperties().equals(this.getIncludedProperties()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getViewName() == null ^ this.getViewName() == null)
            return false;
        if (other.getViewName() != null && other.getViewName().equals(this.getViewName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getIncludedProperties() == null) ? 0 : getIncludedProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getViewName() == null) ? 0 : getViewName().hashCode());
        return hashCode;
    }

    @Override
    public CreateViewRequest clone() {
        return (CreateViewRequest) super.clone();
    }

}
