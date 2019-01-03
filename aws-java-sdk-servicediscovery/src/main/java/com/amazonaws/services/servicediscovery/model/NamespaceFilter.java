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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that identifies the namespaces that you want to list. You can choose to list public or private
 * namespaces.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/NamespaceFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamespaceFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify <code>TYPE</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If you specify <code>EQ</code> for <code>Condition</code>, specify either <code>DNS_PUBLIC</code> or
     * <code>DNS_PRIVATE</code>.
     * </p>
     * <p>
     * If you specify <code>IN</code> for <code>Condition</code>, you can specify <code>DNS_PUBLIC</code>,
     * <code>DNS_PRIVATE</code>, or both.
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * The operator that you want to use to determine whether <code>ListNamespaces</code> returns a namespace. Valid
     * values for <code>condition</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you can choose to list only public
     * namespaces or private namespaces, but not both. <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you can choose to list public namespaces,
     * private namespaces, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable
     * </p>
     * </li>
     * </ul>
     */
    private String condition;

    /**
     * <p>
     * Specify <code>TYPE</code>.
     * </p>
     * 
     * @param name
     *        Specify <code>TYPE</code>.
     * @see NamespaceFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specify <code>TYPE</code>.
     * </p>
     * 
     * @return Specify <code>TYPE</code>.
     * @see NamespaceFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specify <code>TYPE</code>.
     * </p>
     * 
     * @param name
     *        Specify <code>TYPE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceFilterName
     */

    public NamespaceFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specify <code>TYPE</code>.
     * </p>
     * 
     * @param name
     *        Specify <code>TYPE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceFilterName
     */

    public NamespaceFilter withName(NamespaceFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * If you specify <code>EQ</code> for <code>Condition</code>, specify either <code>DNS_PUBLIC</code> or
     * <code>DNS_PRIVATE</code>.
     * </p>
     * <p>
     * If you specify <code>IN</code> for <code>Condition</code>, you can specify <code>DNS_PUBLIC</code>,
     * <code>DNS_PRIVATE</code>, or both.
     * </p>
     * 
     * @return If you specify <code>EQ</code> for <code>Condition</code>, specify either <code>DNS_PUBLIC</code> or
     *         <code>DNS_PRIVATE</code>.</p>
     *         <p>
     *         If you specify <code>IN</code> for <code>Condition</code>, you can specify <code>DNS_PUBLIC</code>,
     *         <code>DNS_PRIVATE</code>, or both.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * If you specify <code>EQ</code> for <code>Condition</code>, specify either <code>DNS_PUBLIC</code> or
     * <code>DNS_PRIVATE</code>.
     * </p>
     * <p>
     * If you specify <code>IN</code> for <code>Condition</code>, you can specify <code>DNS_PUBLIC</code>,
     * <code>DNS_PRIVATE</code>, or both.
     * </p>
     * 
     * @param values
     *        If you specify <code>EQ</code> for <code>Condition</code>, specify either <code>DNS_PUBLIC</code> or
     *        <code>DNS_PRIVATE</code>.</p>
     *        <p>
     *        If you specify <code>IN</code> for <code>Condition</code>, you can specify <code>DNS_PUBLIC</code>,
     *        <code>DNS_PRIVATE</code>, or both.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * If you specify <code>EQ</code> for <code>Condition</code>, specify either <code>DNS_PUBLIC</code> or
     * <code>DNS_PRIVATE</code>.
     * </p>
     * <p>
     * If you specify <code>IN</code> for <code>Condition</code>, you can specify <code>DNS_PUBLIC</code>,
     * <code>DNS_PRIVATE</code>, or both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        If you specify <code>EQ</code> for <code>Condition</code>, specify either <code>DNS_PUBLIC</code> or
     *        <code>DNS_PRIVATE</code>.</p>
     *        <p>
     *        If you specify <code>IN</code> for <code>Condition</code>, you can specify <code>DNS_PUBLIC</code>,
     *        <code>DNS_PRIVATE</code>, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you specify <code>EQ</code> for <code>Condition</code>, specify either <code>DNS_PUBLIC</code> or
     * <code>DNS_PRIVATE</code>.
     * </p>
     * <p>
     * If you specify <code>IN</code> for <code>Condition</code>, you can specify <code>DNS_PUBLIC</code>,
     * <code>DNS_PRIVATE</code>, or both.
     * </p>
     * 
     * @param values
     *        If you specify <code>EQ</code> for <code>Condition</code>, specify either <code>DNS_PUBLIC</code> or
     *        <code>DNS_PRIVATE</code>.</p>
     *        <p>
     *        If you specify <code>IN</code> for <code>Condition</code>, you can specify <code>DNS_PUBLIC</code>,
     *        <code>DNS_PRIVATE</code>, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether <code>ListNamespaces</code> returns a namespace. Valid
     * values for <code>condition</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you can choose to list only public
     * namespaces or private namespaces, but not both. <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you can choose to list public namespaces,
     * private namespaces, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The operator that you want to use to determine whether <code>ListNamespaces</code> returns a namespace.
     *        Valid values for <code>condition</code> include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code>: When you specify <code>EQ</code> for the condition, you can choose to list only public
     *        namespaces or private namespaces, but not both. <code>EQ</code> is the default condition and can be
     *        omitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN</code>: When you specify <code>IN</code> for the condition, you can choose to list public
     *        namespaces, private namespaces, or both.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code>: Not applicable
     *        </p>
     *        </li>
     * @see FilterCondition
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether <code>ListNamespaces</code> returns a namespace. Valid
     * values for <code>condition</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you can choose to list only public
     * namespaces or private namespaces, but not both. <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you can choose to list public namespaces,
     * private namespaces, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable
     * </p>
     * </li>
     * </ul>
     * 
     * @return The operator that you want to use to determine whether <code>ListNamespaces</code> returns a namespace.
     *         Valid values for <code>condition</code> include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EQ</code>: When you specify <code>EQ</code> for the condition, you can choose to list only public
     *         namespaces or private namespaces, but not both. <code>EQ</code> is the default condition and can be
     *         omitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN</code>: When you specify <code>IN</code> for the condition, you can choose to list public
     *         namespaces, private namespaces, or both.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BETWEEN</code>: Not applicable
     *         </p>
     *         </li>
     * @see FilterCondition
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether <code>ListNamespaces</code> returns a namespace. Valid
     * values for <code>condition</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you can choose to list only public
     * namespaces or private namespaces, but not both. <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you can choose to list public namespaces,
     * private namespaces, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The operator that you want to use to determine whether <code>ListNamespaces</code> returns a namespace.
     *        Valid values for <code>condition</code> include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code>: When you specify <code>EQ</code> for the condition, you can choose to list only public
     *        namespaces or private namespaces, but not both. <code>EQ</code> is the default condition and can be
     *        omitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN</code>: When you specify <code>IN</code> for the condition, you can choose to list public
     *        namespaces, private namespaces, or both.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code>: Not applicable
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterCondition
     */

    public NamespaceFilter withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether <code>ListNamespaces</code> returns a namespace. Valid
     * values for <code>condition</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you can choose to list only public
     * namespaces or private namespaces, but not both. <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you can choose to list public namespaces,
     * private namespaces, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The operator that you want to use to determine whether <code>ListNamespaces</code> returns a namespace.
     *        Valid values for <code>condition</code> include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code>: When you specify <code>EQ</code> for the condition, you can choose to list only public
     *        namespaces or private namespaces, but not both. <code>EQ</code> is the default condition and can be
     *        omitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN</code>: When you specify <code>IN</code> for the condition, you can choose to list public
     *        namespaces, private namespaces, or both.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code>: Not applicable
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterCondition
     */

    public NamespaceFilter withCondition(FilterCondition condition) {
        this.condition = condition.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NamespaceFilter == false)
            return false;
        NamespaceFilter other = (NamespaceFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public NamespaceFilter clone() {
        try {
            return (NamespaceFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.NamespaceFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
