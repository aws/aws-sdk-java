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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use <code>Expression</code> to filter in various Cost Explorer APIs.
 * </p>
 * <p>
 * Not all <code>Expression</code> types are supported in each API. Refer to the documentation for each specific API to
 * see what is supported.
 * </p>
 * <p>
 * There are two patterns:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Simple dimension values.
 * </p>
 * <ul>
 * <li>
 * <p>
 * There are three types of simple dimension values: <code>CostCategories</code>, <code>Tags</code>, and
 * <code>Dimensions</code>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Specify the <code>CostCategories</code> field to define a filter that acts on Cost Categories.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify the <code>Tags</code> field to define a filter that acts on Cost Allocation Tags.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify the <code>Dimensions</code> field to define a filter that acts on the <a
 * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_DimensionValues.html">
 * <code>DimensionValues</code> </a>.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * For each filter type, you can set the dimension name and values for the filters that you plan to use.
 * </p>
 * <ul>
 * <li>
 * <p>
 * For example, you can filter for <code>REGION==us-east-1 OR REGION==us-west-1</code>. For
 * <code>GetRightsizingRecommendation</code>, the Region is a full name (for example,
 * <code>REGION==US East (N. Virginia)</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The corresponding <code>Expression</code> for this example is as follows:
 * <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * As shown in the previous example, lists of dimension values are combined with <code>OR</code> when applying the
 * filter.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * You can also set different match options to further control how the filter behaves. Not all APIs support match
 * options. Refer to the documentation for each specific API to see what is supported.
 * </p>
 * <ul>
 * <li>
 * <p>
 * For example, you can filter for linked account names that start with “a”.
 * </p>
 * </li>
 * <li>
 * <p>
 * The corresponding <code>Expression</code> for this example is as follows:
 * <code>{ "Dimensions": { "Key": "LINKED_ACCOUNT_NAME", "MatchOptions": [ "STARTS_WITH" ], "Values": [ "a" ] } }</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Compound <code>Expression</code> types with logical operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can use multiple <code>Expression</code> types and the logical operators <code>AND/OR/NOT</code> to create a list
 * of one or more <code>Expression</code> objects. By doing this, you can filter by more advanced options.
 * </p>
 * </li>
 * <li>
 * <p>
 * For example, you can filter by
 * <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The corresponding <code>Expression</code> for this example is as follows:
 * <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * Because each <code>Expression</code> can have only one operator, the service returns an error if more than one is
 * specified. The following example shows an <code>Expression</code> object that creates an error:
 * <code> { "And": [ ... ], "Dimensions": { "Key": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
 * </p>
 * <p>
 * The following is an example of the corresponding error message:
 * <code>"Expression has more than one roots. Only one root operator is allowed for each expression: And, Or, Not, Dimensions, Tags, CostCategories"</code>
 * </p>
 * </note></li>
 * </ul>
 * <note>
 * <p>
 * For the <code>GetRightsizingRecommendation</code> action, a combination of OR and NOT isn't supported. OR isn't
 * supported between different dimensions, or dimensions and tags. NOT operators aren't supported. Dimensions are also
 * limited to <code>LINKED_ACCOUNT</code>, <code>REGION</code>, or <code>RIGHTSIZING_TYPE</code>.
 * </p>
 * <p>
 * For the <code>GetReservationPurchaseRecommendation</code> action, only NOT is supported. AND and OR aren't supported.
 * Dimensions are limited to <code>LINKED_ACCOUNT</code>.
 * </p>
 * </note>
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
     * The filter that's based on <code>CostCategory</code> values.
     * </p>
     */
    private CostCategoryValues costCategories;

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
     * <p>
     * The filter that's based on <code>CostCategory</code> values.
     * </p>
     * 
     * @param costCategories
     *        The filter that's based on <code>CostCategory</code> values.
     */

    public void setCostCategories(CostCategoryValues costCategories) {
        this.costCategories = costCategories;
    }

    /**
     * <p>
     * The filter that's based on <code>CostCategory</code> values.
     * </p>
     * 
     * @return The filter that's based on <code>CostCategory</code> values.
     */

    public CostCategoryValues getCostCategories() {
        return this.costCategories;
    }

    /**
     * <p>
     * The filter that's based on <code>CostCategory</code> values.
     * </p>
     * 
     * @param costCategories
     *        The filter that's based on <code>CostCategory</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withCostCategories(CostCategoryValues costCategories) {
        setCostCategories(costCategories);
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
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCostCategories() != null)
            sb.append("CostCategories: ").append(getCostCategories());
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
        if (other.getCostCategories() == null ^ this.getCostCategories() == null)
            return false;
        if (other.getCostCategories() != null && other.getCostCategories().equals(this.getCostCategories()) == false)
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
        hashCode = prime * hashCode + ((getCostCategories() == null) ? 0 : getCostCategories().hashCode());
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
