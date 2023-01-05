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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateViewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that you want to modify.
     * </p>
     */
    private String viewArn;

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

    public UpdateViewRequest withFilters(SearchFilter filters) {
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

    public UpdateViewRequest withIncludedProperties(IncludedProperty... includedProperties) {
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

    public UpdateViewRequest withIncludedProperties(java.util.Collection<IncludedProperty> includedProperties) {
        setIncludedProperties(includedProperties);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that you want to modify.
     * </p>
     * 
     * @param viewArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the view that you want to modify.
     */

    public void setViewArn(String viewArn) {
        this.viewArn = viewArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that you want to modify.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the view that you want to modify.
     */

    public String getViewArn() {
        return this.viewArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that you want to modify.
     * </p>
     * 
     * @param viewArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the view that you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateViewRequest withViewArn(String viewArn) {
        setViewArn(viewArn);
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
        if (getFilters() != null)
            sb.append("Filters: ").append("***Sensitive Data Redacted***").append(",");
        if (getIncludedProperties() != null)
            sb.append("IncludedProperties: ").append(getIncludedProperties()).append(",");
        if (getViewArn() != null)
            sb.append("ViewArn: ").append(getViewArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateViewRequest == false)
            return false;
        UpdateViewRequest other = (UpdateViewRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getIncludedProperties() == null ^ this.getIncludedProperties() == null)
            return false;
        if (other.getIncludedProperties() != null && other.getIncludedProperties().equals(this.getIncludedProperties()) == false)
            return false;
        if (other.getViewArn() == null ^ this.getViewArn() == null)
            return false;
        if (other.getViewArn() != null && other.getViewArn().equals(this.getViewArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getIncludedProperties() == null) ? 0 : getIncludedProperties().hashCode());
        hashCode = prime * hashCode + ((getViewArn() == null) ? 0 : getViewArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateViewRequest clone() {
        return (UpdateViewRequest) super.clone();
    }

}
