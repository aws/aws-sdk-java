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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use <code>Expression</code> to filter by cost or by usage. There are two patterns:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Simple dimension values - You can set the dimension name and values for the filters that you plan to use. For
 * example, you can filter for <code>INSTANCE_TYPE==m4.xlarge OR INSTANCE_TYPE==c4.large</code>. The
 * <code>Expression</code> for that looks like this:
 * </p>
 * <p>
 * <code>{ "Dimensions": { "Key": "INSTANCE_TYPE", "Values": [ "m4.xlarge", “c4.large” ] } }</code>
 * </p>
 * <p>
 * The list of dimension values are OR'd together to retrieve cost or usage data. You can create <code>Expression</code>
 * and <code>DimensionValues</code> objects using either <code>with*</code> methods or <code>set*</code> methods in
 * multiple lines.
 * </p>
 * </li>
 * <li>
 * <p>
 * Compound dimension values with logical operations - You can use multiple <code>Expression</code> types and the
 * logical operators <code>AND/OR/NOT</code> to create a list of one or more <code>Expression</code> objects. This
 * allows you to filter on more advanced options. For example, you can filter on
 * <code>((INSTANCE_TYPE == m4.large OR INSTANCE_TYPE == m3.large) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>
 * . The <code>Expression</code> for that looks like this:
 * </p>
 * <p>
 * <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "INSTANCE_TYPE", "Values": [ "m4.x.large", "c4.large" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
 * </p>
 * <note>
 * <p>
 * Because each <code>Expression</code> can have only one operator, the service returns an error if more than one is
 * specified. The following example shows an <code>Expression</code> object that creates an error.
 * </p>
 * </note>
 * <p>
 * <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/Expression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Expression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     */
    private java.util.List<Expression> or;
    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     */
    private java.util.List<Expression> and;
    /**
     * <p>
     * Return results that don't match a <code>Dimension</code> object.
     * </p>
     */
    private Expression not;
    /**
     * <p>
     * The specific <code>Dimension</code> to use for <code>Expression</code>.
     * </p>
     */
    private DimensionValues dimensions;
    /**
     * <p>
     * The specific <code>Tag</code> to use for <code>Expression</code>.
     * </p>
     */
    private TagValues tags;

    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     * 
     * @return Return results that match either <code>Dimension</code> object.
     */

    public java.util.List<Expression> getOr() {
        return or;
    }

    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     * 
     * @param or
     *        Return results that match either <code>Dimension</code> object.
     */

    public void setOr(java.util.Collection<Expression> or) {
        if (or == null) {
            this.or = null;
            return;
        }

        this.or = new java.util.ArrayList<Expression>(or);
    }

    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOr(java.util.Collection)} or {@link #withOr(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param or
     *        Return results that match either <code>Dimension</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withOr(Expression... or) {
        if (this.or == null) {
            setOr(new java.util.ArrayList<Expression>(or.length));
        }
        for (Expression ele : or) {
            this.or.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Return results that match either <code>Dimension</code> object.
     * </p>
     * 
     * @param or
     *        Return results that match either <code>Dimension</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withOr(java.util.Collection<Expression> or) {
        setOr(or);
        return this;
    }

    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     * 
     * @return Return results that match both <code>Dimension</code> objects.
     */

    public java.util.List<Expression> getAnd() {
        return and;
    }

    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     * 
     * @param and
     *        Return results that match both <code>Dimension</code> objects.
     */

    public void setAnd(java.util.Collection<Expression> and) {
        if (and == null) {
            this.and = null;
            return;
        }

        this.and = new java.util.ArrayList<Expression>(and);
    }

    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnd(java.util.Collection)} or {@link #withAnd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param and
     *        Return results that match both <code>Dimension</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withAnd(Expression... and) {
        if (this.and == null) {
            setAnd(new java.util.ArrayList<Expression>(and.length));
        }
        for (Expression ele : and) {
            this.and.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Return results that match both <code>Dimension</code> objects.
     * </p>
     * 
     * @param and
     *        Return results that match both <code>Dimension</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withAnd(java.util.Collection<Expression> and) {
        setAnd(and);
        return this;
    }

    /**
     * <p>
     * Return results that don't match a <code>Dimension</code> object.
     * </p>
     * 
     * @param not
     *        Return results that don't match a <code>Dimension</code> object.
     */

    public void setNot(Expression not) {
        this.not = not;
    }

    /**
     * <p>
     * Return results that don't match a <code>Dimension</code> object.
     * </p>
     * 
     * @return Return results that don't match a <code>Dimension</code> object.
     */

    public Expression getNot() {
        return this.not;
    }

    /**
     * <p>
     * Return results that don't match a <code>Dimension</code> object.
     * </p>
     * 
     * @param not
     *        Return results that don't match a <code>Dimension</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withNot(Expression not) {
        setNot(not);
        return this;
    }

    /**
     * <p>
     * The specific <code>Dimension</code> to use for <code>Expression</code>.
     * </p>
     * 
     * @param dimensions
     *        The specific <code>Dimension</code> to use for <code>Expression</code>.
     */

    public void setDimensions(DimensionValues dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The specific <code>Dimension</code> to use for <code>Expression</code>.
     * </p>
     * 
     * @return The specific <code>Dimension</code> to use for <code>Expression</code>.
     */

    public DimensionValues getDimensions() {
        return this.dimensions;
    }

    /**
     * <p>
     * The specific <code>Dimension</code> to use for <code>Expression</code>.
     * </p>
     * 
     * @param dimensions
     *        The specific <code>Dimension</code> to use for <code>Expression</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withDimensions(DimensionValues dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The specific <code>Tag</code> to use for <code>Expression</code>.
     * </p>
     * 
     * @param tags
     *        The specific <code>Tag</code> to use for <code>Expression</code>.
     */

    public void setTags(TagValues tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The specific <code>Tag</code> to use for <code>Expression</code>.
     * </p>
     * 
     * @return The specific <code>Tag</code> to use for <code>Expression</code>.
     */

    public TagValues getTags() {
        return this.tags;
    }

    /**
     * <p>
     * The specific <code>Tag</code> to use for <code>Expression</code>.
     * </p>
     * 
     * @param tags
     *        The specific <code>Tag</code> to use for <code>Expression</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withTags(TagValues tags) {
        setTags(tags);
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
        if (getOr() != null)
            sb.append("Or: ").append(getOr()).append(",");
        if (getAnd() != null)
            sb.append("And: ").append(getAnd()).append(",");
        if (getNot() != null)
            sb.append("Not: ").append(getNot()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Expression == false)
            return false;
        Expression other = (Expression) obj;
        if (other.getOr() == null ^ this.getOr() == null)
            return false;
        if (other.getOr() != null && other.getOr().equals(this.getOr()) == false)
            return false;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        if (other.getNot() == null ^ this.getNot() == null)
            return false;
        if (other.getNot() != null && other.getNot().equals(this.getNot()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOr() == null) ? 0 : getOr().hashCode());
        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        hashCode = prime * hashCode + ((getNot() == null) ? 0 : getNot().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Expression clone() {
        try {
            return (Expression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
