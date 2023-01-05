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
package com.amazonaws.services.personalizeruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on a promotion. A promotion defines additional business rules that apply to a configurable
 * subset of recommended items.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/Promotion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Promotion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the promotion.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The percentage of recommended items to apply the promotion to.
     * </p>
     */
    private Integer percentPromotedItems;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter used by the promotion. This filter defines the criteria for promoted
     * items. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/promoting-items.html#promotion-filters">Promotion
     * filters</a>.
     * </p>
     */
    private String filterArn;
    /**
     * <p>
     * The values to use when promoting items. For each placeholder parameter in your promotion's filter expression,
     * provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value.
     * Separate multiple values for one parameter with a comma.
     * </p>
     * <p>
     * For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values for all
     * parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude items, you can omit the <code>filter-values</code>. In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information on creating filters, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     * segments</a>.
     * </p>
     */
    private java.util.Map<String, String> filterValues;

    /**
     * <p>
     * The name of the promotion.
     * </p>
     * 
     * @param name
     *        The name of the promotion.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the promotion.
     * </p>
     * 
     * @return The name of the promotion.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the promotion.
     * </p>
     * 
     * @param name
     *        The name of the promotion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Promotion withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The percentage of recommended items to apply the promotion to.
     * </p>
     * 
     * @param percentPromotedItems
     *        The percentage of recommended items to apply the promotion to.
     */

    public void setPercentPromotedItems(Integer percentPromotedItems) {
        this.percentPromotedItems = percentPromotedItems;
    }

    /**
     * <p>
     * The percentage of recommended items to apply the promotion to.
     * </p>
     * 
     * @return The percentage of recommended items to apply the promotion to.
     */

    public Integer getPercentPromotedItems() {
        return this.percentPromotedItems;
    }

    /**
     * <p>
     * The percentage of recommended items to apply the promotion to.
     * </p>
     * 
     * @param percentPromotedItems
     *        The percentage of recommended items to apply the promotion to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Promotion withPercentPromotedItems(Integer percentPromotedItems) {
        setPercentPromotedItems(percentPromotedItems);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter used by the promotion. This filter defines the criteria for promoted
     * items. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/promoting-items.html#promotion-filters">Promotion
     * filters</a>.
     * </p>
     * 
     * @param filterArn
     *        The Amazon Resource Name (ARN) of the filter used by the promotion. This filter defines the criteria for
     *        promoted items. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/promoting-items.html#promotion-filters">Promotion
     *        filters</a>.
     */

    public void setFilterArn(String filterArn) {
        this.filterArn = filterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter used by the promotion. This filter defines the criteria for promoted
     * items. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/promoting-items.html#promotion-filters">Promotion
     * filters</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the filter used by the promotion. This filter defines the criteria for
     *         promoted items. For more information, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/promoting-items.html#promotion-filters">Promotion
     *         filters</a>.
     */

    public String getFilterArn() {
        return this.filterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter used by the promotion. This filter defines the criteria for promoted
     * items. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/promoting-items.html#promotion-filters">Promotion
     * filters</a>.
     * </p>
     * 
     * @param filterArn
     *        The Amazon Resource Name (ARN) of the filter used by the promotion. This filter defines the criteria for
     *        promoted items. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/promoting-items.html#promotion-filters">Promotion
     *        filters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Promotion withFilterArn(String filterArn) {
        setFilterArn(filterArn);
        return this;
    }

    /**
     * <p>
     * The values to use when promoting items. For each placeholder parameter in your promotion's filter expression,
     * provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value.
     * Separate multiple values for one parameter with a comma.
     * </p>
     * <p>
     * For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values for all
     * parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude items, you can omit the <code>filter-values</code>. In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information on creating filters, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     * segments</a>.
     * </p>
     * 
     * @return The values to use when promoting items. For each placeholder parameter in your promotion's filter
     *         expression, provide the parameter name (in matching case) as a key and the filter value(s) as the
     *         corresponding value. Separate multiple values for one parameter with a comma. </p>
     *         <p>
     *         For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values
     *         for all parameters that are defined in the expression. For filters with expressions that use an
     *         <code>EXCLUDE</code> element to exclude items, you can omit the <code>filter-values</code>. In this case,
     *         Amazon Personalize doesn't use that portion of the expression to filter recommendations.
     *         </p>
     *         <p>
     *         For more information on creating filters, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     *         segments</a>.
     */

    public java.util.Map<String, String> getFilterValues() {
        return filterValues;
    }

    /**
     * <p>
     * The values to use when promoting items. For each placeholder parameter in your promotion's filter expression,
     * provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value.
     * Separate multiple values for one parameter with a comma.
     * </p>
     * <p>
     * For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values for all
     * parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude items, you can omit the <code>filter-values</code>. In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information on creating filters, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     * segments</a>.
     * </p>
     * 
     * @param filterValues
     *        The values to use when promoting items. For each placeholder parameter in your promotion's filter
     *        expression, provide the parameter name (in matching case) as a key and the filter value(s) as the
     *        corresponding value. Separate multiple values for one parameter with a comma. </p>
     *        <p>
     *        For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values
     *        for all parameters that are defined in the expression. For filters with expressions that use an
     *        <code>EXCLUDE</code> element to exclude items, you can omit the <code>filter-values</code>. In this case,
     *        Amazon Personalize doesn't use that portion of the expression to filter recommendations.
     *        </p>
     *        <p>
     *        For more information on creating filters, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     *        segments</a>.
     */

    public void setFilterValues(java.util.Map<String, String> filterValues) {
        this.filterValues = filterValues;
    }

    /**
     * <p>
     * The values to use when promoting items. For each placeholder parameter in your promotion's filter expression,
     * provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value.
     * Separate multiple values for one parameter with a comma.
     * </p>
     * <p>
     * For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values for all
     * parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude items, you can omit the <code>filter-values</code>. In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information on creating filters, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     * segments</a>.
     * </p>
     * 
     * @param filterValues
     *        The values to use when promoting items. For each placeholder parameter in your promotion's filter
     *        expression, provide the parameter name (in matching case) as a key and the filter value(s) as the
     *        corresponding value. Separate multiple values for one parameter with a comma. </p>
     *        <p>
     *        For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values
     *        for all parameters that are defined in the expression. For filters with expressions that use an
     *        <code>EXCLUDE</code> element to exclude items, you can omit the <code>filter-values</code>. In this case,
     *        Amazon Personalize doesn't use that portion of the expression to filter recommendations.
     *        </p>
     *        <p>
     *        For more information on creating filters, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     *        segments</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Promotion withFilterValues(java.util.Map<String, String> filterValues) {
        setFilterValues(filterValues);
        return this;
    }

    /**
     * Add a single FilterValues entry
     *
     * @see Promotion#withFilterValues
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Promotion addFilterValuesEntry(String key, String value) {
        if (null == this.filterValues) {
            this.filterValues = new java.util.HashMap<String, String>();
        }
        if (this.filterValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filterValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FilterValues.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Promotion clearFilterValuesEntries() {
        this.filterValues = null;
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
        if (getPercentPromotedItems() != null)
            sb.append("PercentPromotedItems: ").append(getPercentPromotedItems()).append(",");
        if (getFilterArn() != null)
            sb.append("FilterArn: ").append(getFilterArn()).append(",");
        if (getFilterValues() != null)
            sb.append("FilterValues: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Promotion == false)
            return false;
        Promotion other = (Promotion) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPercentPromotedItems() == null ^ this.getPercentPromotedItems() == null)
            return false;
        if (other.getPercentPromotedItems() != null && other.getPercentPromotedItems().equals(this.getPercentPromotedItems()) == false)
            return false;
        if (other.getFilterArn() == null ^ this.getFilterArn() == null)
            return false;
        if (other.getFilterArn() != null && other.getFilterArn().equals(this.getFilterArn()) == false)
            return false;
        if (other.getFilterValues() == null ^ this.getFilterValues() == null)
            return false;
        if (other.getFilterValues() != null && other.getFilterValues().equals(this.getFilterValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPercentPromotedItems() == null) ? 0 : getPercentPromotedItems().hashCode());
        hashCode = prime * hashCode + ((getFilterArn() == null) ? 0 : getFilterArn().hashCode());
        hashCode = prime * hashCode + ((getFilterValues() == null) ? 0 : getFilterValues().hashCode());
        return hashCode;
    }

    @Override
    public Promotion clone() {
        try {
            return (Promotion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalizeruntime.model.transform.PromotionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
