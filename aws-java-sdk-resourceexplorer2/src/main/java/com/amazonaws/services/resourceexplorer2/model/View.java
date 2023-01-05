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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A view is a structure that defines a set of filters that provide a view into the information in the Amazon Web
 * Services Resource Explorer index. The filters specify which information from the index is visible to the users of the
 * view. For example, you can specify filters that include only resources that are tagged with the key "ENV" and the
 * value "DEVELOPMENT" in the results returned by this view. You could also create a second view that includes only
 * resources that are tagged with "ENV" and "PRODUCTION".
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/View" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class View implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of <a>SearchFilter</a> objects that specify which resources can be included in the results of queries
     * made using this view.
     * </p>
     */
    private SearchFilter filters;
    /**
     * <p>
     * A structure that contains additional information about the view.
     * </p>
     */
    private java.util.List<IncludedProperty> includedProperties;
    /**
     * <p>
     * The date and time when this view was last modified.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The Amazon Web Services account that owns this view.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of an Amazon Web Services account, an organization, or an organizational unit (OU) that specifies
     * whether this view includes resources from only the specified Amazon Web Services account, all accounts in the
     * specified organization, or all accounts in the specified OU.
     * </p>
     * <p>
     * If not specified, the value defaults to the Amazon Web Services account used to call this operation.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view.
     * </p>
     */
    private String viewArn;

    /**
     * <p>
     * An array of <a>SearchFilter</a> objects that specify which resources can be included in the results of queries
     * made using this view.
     * </p>
     * 
     * @param filters
     *        An array of <a>SearchFilter</a> objects that specify which resources can be included in the results of
     *        queries made using this view.
     */

    public void setFilters(SearchFilter filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * An array of <a>SearchFilter</a> objects that specify which resources can be included in the results of queries
     * made using this view.
     * </p>
     * 
     * @return An array of <a>SearchFilter</a> objects that specify which resources can be included in the results of
     *         queries made using this view.
     */

    public SearchFilter getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * An array of <a>SearchFilter</a> objects that specify which resources can be included in the results of queries
     * made using this view.
     * </p>
     * 
     * @param filters
     *        An array of <a>SearchFilter</a> objects that specify which resources can be included in the results of
     *        queries made using this view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withFilters(SearchFilter filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * A structure that contains additional information about the view.
     * </p>
     * 
     * @return A structure that contains additional information about the view.
     */

    public java.util.List<IncludedProperty> getIncludedProperties() {
        return includedProperties;
    }

    /**
     * <p>
     * A structure that contains additional information about the view.
     * </p>
     * 
     * @param includedProperties
     *        A structure that contains additional information about the view.
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
     * A structure that contains additional information about the view.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludedProperties(java.util.Collection)} or {@link #withIncludedProperties(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param includedProperties
     *        A structure that contains additional information about the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withIncludedProperties(IncludedProperty... includedProperties) {
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
     * A structure that contains additional information about the view.
     * </p>
     * 
     * @param includedProperties
     *        A structure that contains additional information about the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withIncludedProperties(java.util.Collection<IncludedProperty> includedProperties) {
        setIncludedProperties(includedProperties);
        return this;
    }

    /**
     * <p>
     * The date and time when this view was last modified.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when this view was last modified.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when this view was last modified.
     * </p>
     * 
     * @return The date and time when this view was last modified.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when this view was last modified.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when this view was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns this view.
     * </p>
     * 
     * @param owner
     *        The Amazon Web Services account that owns this view.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns this view.
     * </p>
     * 
     * @return The Amazon Web Services account that owns this view.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns this view.
     * </p>
     * 
     * @param owner
     *        The Amazon Web Services account that owns this view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of an Amazon Web Services account, an organization, or an organizational unit (OU) that specifies
     * whether this view includes resources from only the specified Amazon Web Services account, all accounts in the
     * specified organization, or all accounts in the specified OU.
     * </p>
     * <p>
     * If not specified, the value defaults to the Amazon Web Services account used to call this operation.
     * </p>
     * 
     * @param scope
     *        An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of an Amazon Web Services account, an organization, or an organizational unit (OU) that
     *        specifies whether this view includes resources from only the specified Amazon Web Services account, all
     *        accounts in the specified organization, or all accounts in the specified OU.</p>
     *        <p>
     *        If not specified, the value defaults to the Amazon Web Services account used to call this operation.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of an Amazon Web Services account, an organization, or an organizational unit (OU) that specifies
     * whether this view includes resources from only the specified Amazon Web Services account, all accounts in the
     * specified organization, or all accounts in the specified OU.
     * </p>
     * <p>
     * If not specified, the value defaults to the Amazon Web Services account used to call this operation.
     * </p>
     * 
     * @return An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of an Amazon Web Services account, an organization, or an organizational unit (OU) that
     *         specifies whether this view includes resources from only the specified Amazon Web Services account, all
     *         accounts in the specified organization, or all accounts in the specified OU.</p>
     *         <p>
     *         If not specified, the value defaults to the Amazon Web Services account used to call this operation.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of an Amazon Web Services account, an organization, or an organizational unit (OU) that specifies
     * whether this view includes resources from only the specified Amazon Web Services account, all accounts in the
     * specified organization, or all accounts in the specified OU.
     * </p>
     * <p>
     * If not specified, the value defaults to the Amazon Web Services account used to call this operation.
     * </p>
     * 
     * @param scope
     *        An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of an Amazon Web Services account, an organization, or an organizational unit (OU) that
     *        specifies whether this view includes resources from only the specified Amazon Web Services account, all
     *        accounts in the specified organization, or all accounts in the specified OU.</p>
     *        <p>
     *        If not specified, the value defaults to the Amazon Web Services account used to call this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view.
     * </p>
     * 
     * @param viewArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the view.
     */

    public void setViewArn(String viewArn) {
        this.viewArn = viewArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the view.
     */

    public String getViewArn() {
        return this.viewArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view.
     * </p>
     * 
     * @param viewArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withViewArn(String viewArn) {
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
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
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

        if (obj instanceof View == false)
            return false;
        View other = (View) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getIncludedProperties() == null ^ this.getIncludedProperties() == null)
            return false;
        if (other.getIncludedProperties() != null && other.getIncludedProperties().equals(this.getIncludedProperties()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
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
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getViewArn() == null) ? 0 : getViewArn().hashCode());
        return hashCode;
    }

    @Override
    public View clone() {
        try {
            return (View) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourceexplorer2.model.transform.ViewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
