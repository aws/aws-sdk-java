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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A representation of the line item filter for your custom line item. You can use line item filters to include or
 * exclude specific resource values from the billing group's total cost. For example, if you create a custom line item
 * and you want to filter out a value, such as Savings Plan discounts, you can update <code>LineItemFilter</code> to
 * exclude it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/LineItemFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineItemFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute of the line item filter. This specifies what attribute that you can filter on.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The match criteria of the line item filter. This parameter specifies whether not to include the resource value
     * from the billing group total cost.
     * </p>
     */
    private String matchOption;
    /**
     * <p>
     * The values of the line item filter. This specifies the values to filter on. Currently, you can only exclude
     * Savings Plan discounts.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The attribute of the line item filter. This specifies what attribute that you can filter on.
     * </p>
     * 
     * @param attribute
     *        The attribute of the line item filter. This specifies what attribute that you can filter on.
     * @see LineItemFilterAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute of the line item filter. This specifies what attribute that you can filter on.
     * </p>
     * 
     * @return The attribute of the line item filter. This specifies what attribute that you can filter on.
     * @see LineItemFilterAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute of the line item filter. This specifies what attribute that you can filter on.
     * </p>
     * 
     * @param attribute
     *        The attribute of the line item filter. This specifies what attribute that you can filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineItemFilterAttributeName
     */

    public LineItemFilter withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The attribute of the line item filter. This specifies what attribute that you can filter on.
     * </p>
     * 
     * @param attribute
     *        The attribute of the line item filter. This specifies what attribute that you can filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineItemFilterAttributeName
     */

    public LineItemFilter withAttribute(LineItemFilterAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The match criteria of the line item filter. This parameter specifies whether not to include the resource value
     * from the billing group total cost.
     * </p>
     * 
     * @param matchOption
     *        The match criteria of the line item filter. This parameter specifies whether not to include the resource
     *        value from the billing group total cost.
     * @see MatchOption
     */

    public void setMatchOption(String matchOption) {
        this.matchOption = matchOption;
    }

    /**
     * <p>
     * The match criteria of the line item filter. This parameter specifies whether not to include the resource value
     * from the billing group total cost.
     * </p>
     * 
     * @return The match criteria of the line item filter. This parameter specifies whether not to include the resource
     *         value from the billing group total cost.
     * @see MatchOption
     */

    public String getMatchOption() {
        return this.matchOption;
    }

    /**
     * <p>
     * The match criteria of the line item filter. This parameter specifies whether not to include the resource value
     * from the billing group total cost.
     * </p>
     * 
     * @param matchOption
     *        The match criteria of the line item filter. This parameter specifies whether not to include the resource
     *        value from the billing group total cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchOption
     */

    public LineItemFilter withMatchOption(String matchOption) {
        setMatchOption(matchOption);
        return this;
    }

    /**
     * <p>
     * The match criteria of the line item filter. This parameter specifies whether not to include the resource value
     * from the billing group total cost.
     * </p>
     * 
     * @param matchOption
     *        The match criteria of the line item filter. This parameter specifies whether not to include the resource
     *        value from the billing group total cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchOption
     */

    public LineItemFilter withMatchOption(MatchOption matchOption) {
        this.matchOption = matchOption.toString();
        return this;
    }

    /**
     * <p>
     * The values of the line item filter. This specifies the values to filter on. Currently, you can only exclude
     * Savings Plan discounts.
     * </p>
     * 
     * @return The values of the line item filter. This specifies the values to filter on. Currently, you can only
     *         exclude Savings Plan discounts.
     * @see LineItemFilterValue
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values of the line item filter. This specifies the values to filter on. Currently, you can only exclude
     * Savings Plan discounts.
     * </p>
     * 
     * @param values
     *        The values of the line item filter. This specifies the values to filter on. Currently, you can only
     *        exclude Savings Plan discounts.
     * @see LineItemFilterValue
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
     * The values of the line item filter. This specifies the values to filter on. Currently, you can only exclude
     * Savings Plan discounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values of the line item filter. This specifies the values to filter on. Currently, you can only
     *        exclude Savings Plan discounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineItemFilterValue
     */

    public LineItemFilter withValues(String... values) {
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
     * The values of the line item filter. This specifies the values to filter on. Currently, you can only exclude
     * Savings Plan discounts.
     * </p>
     * 
     * @param values
     *        The values of the line item filter. This specifies the values to filter on. Currently, you can only
     *        exclude Savings Plan discounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineItemFilterValue
     */

    public LineItemFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The values of the line item filter. This specifies the values to filter on. Currently, you can only exclude
     * Savings Plan discounts.
     * </p>
     * 
     * @param values
     *        The values of the line item filter. This specifies the values to filter on. Currently, you can only
     *        exclude Savings Plan discounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineItemFilterValue
     */

    public LineItemFilter withValues(LineItemFilterValue... values) {
        java.util.ArrayList<String> valuesCopy = new java.util.ArrayList<String>(values.length);
        for (LineItemFilterValue value : values) {
            valuesCopy.add(value.toString());
        }
        if (getValues() == null) {
            setValues(valuesCopy);
        } else {
            getValues().addAll(valuesCopy);
        }
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getMatchOption() != null)
            sb.append("MatchOption: ").append(getMatchOption()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineItemFilter == false)
            return false;
        LineItemFilter other = (LineItemFilter) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getMatchOption() == null ^ this.getMatchOption() == null)
            return false;
        if (other.getMatchOption() != null && other.getMatchOption().equals(this.getMatchOption()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getMatchOption() == null) ? 0 : getMatchOption().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public LineItemFilter clone() {
        try {
            return (LineItemFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.LineItemFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
