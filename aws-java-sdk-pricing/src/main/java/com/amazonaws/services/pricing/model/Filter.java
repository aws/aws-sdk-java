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
package com.amazonaws.services.pricing.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The constraints that you want all returned products to match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of filter that you want to use.
     * </p>
     * <p>
     * Valid values are: <code>TERM_MATCH</code>. <code>TERM_MATCH</code> returns only products that match both the
     * given filter field and the given value.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The product metadata field that you want to filter on. You can filter by just the service code to see all
     * products for a specific service, filter by just the attribute name to see a specific attribute for multiple
     * services, or use both a service code and an attribute name to retrieve only products that match both fields.
     * </p>
     * <p>
     * Valid values include: <code>ServiceCode</code>, and all attribute names
     * </p>
     * <p>
     * For example, you can filter by the <code>AmazonEC2</code> service code and the <code>volumeType</code> attribute
     * name to get the prices for only Amazon EC2 volumes.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The service code or attribute value that you want to filter by. If you are filtering by service code this is the
     * actual service code, such as <code>AmazonEC2</code>. If you are filtering by attribute name, this is the
     * attribute value that you want the returned products to match, such as a <code>Provisioned IOPS</code> volume.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of filter that you want to use.
     * </p>
     * <p>
     * Valid values are: <code>TERM_MATCH</code>. <code>TERM_MATCH</code> returns only products that match both the
     * given filter field and the given value.
     * </p>
     * 
     * @param type
     *        The type of filter that you want to use.</p>
     *        <p>
     *        Valid values are: <code>TERM_MATCH</code>. <code>TERM_MATCH</code> returns only products that match both
     *        the given filter field and the given value.
     * @see FilterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of filter that you want to use.
     * </p>
     * <p>
     * Valid values are: <code>TERM_MATCH</code>. <code>TERM_MATCH</code> returns only products that match both the
     * given filter field and the given value.
     * </p>
     * 
     * @return The type of filter that you want to use.</p>
     *         <p>
     *         Valid values are: <code>TERM_MATCH</code>. <code>TERM_MATCH</code> returns only products that match both
     *         the given filter field and the given value.
     * @see FilterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of filter that you want to use.
     * </p>
     * <p>
     * Valid values are: <code>TERM_MATCH</code>. <code>TERM_MATCH</code> returns only products that match both the
     * given filter field and the given value.
     * </p>
     * 
     * @param type
     *        The type of filter that you want to use.</p>
     *        <p>
     *        Valid values are: <code>TERM_MATCH</code>. <code>TERM_MATCH</code> returns only products that match both
     *        the given filter field and the given value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterType
     */

    public Filter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of filter that you want to use.
     * </p>
     * <p>
     * Valid values are: <code>TERM_MATCH</code>. <code>TERM_MATCH</code> returns only products that match both the
     * given filter field and the given value.
     * </p>
     * 
     * @param type
     *        The type of filter that you want to use.</p>
     *        <p>
     *        Valid values are: <code>TERM_MATCH</code>. <code>TERM_MATCH</code> returns only products that match both
     *        the given filter field and the given value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterType
     */

    public Filter withType(FilterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The product metadata field that you want to filter on. You can filter by just the service code to see all
     * products for a specific service, filter by just the attribute name to see a specific attribute for multiple
     * services, or use both a service code and an attribute name to retrieve only products that match both fields.
     * </p>
     * <p>
     * Valid values include: <code>ServiceCode</code>, and all attribute names
     * </p>
     * <p>
     * For example, you can filter by the <code>AmazonEC2</code> service code and the <code>volumeType</code> attribute
     * name to get the prices for only Amazon EC2 volumes.
     * </p>
     * 
     * @param field
     *        The product metadata field that you want to filter on. You can filter by just the service code to see all
     *        products for a specific service, filter by just the attribute name to see a specific attribute for
     *        multiple services, or use both a service code and an attribute name to retrieve only products that match
     *        both fields.</p>
     *        <p>
     *        Valid values include: <code>ServiceCode</code>, and all attribute names
     *        </p>
     *        <p>
     *        For example, you can filter by the <code>AmazonEC2</code> service code and the <code>volumeType</code>
     *        attribute name to get the prices for only Amazon EC2 volumes.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The product metadata field that you want to filter on. You can filter by just the service code to see all
     * products for a specific service, filter by just the attribute name to see a specific attribute for multiple
     * services, or use both a service code and an attribute name to retrieve only products that match both fields.
     * </p>
     * <p>
     * Valid values include: <code>ServiceCode</code>, and all attribute names
     * </p>
     * <p>
     * For example, you can filter by the <code>AmazonEC2</code> service code and the <code>volumeType</code> attribute
     * name to get the prices for only Amazon EC2 volumes.
     * </p>
     * 
     * @return The product metadata field that you want to filter on. You can filter by just the service code to see all
     *         products for a specific service, filter by just the attribute name to see a specific attribute for
     *         multiple services, or use both a service code and an attribute name to retrieve only products that match
     *         both fields.</p>
     *         <p>
     *         Valid values include: <code>ServiceCode</code>, and all attribute names
     *         </p>
     *         <p>
     *         For example, you can filter by the <code>AmazonEC2</code> service code and the <code>volumeType</code>
     *         attribute name to get the prices for only Amazon EC2 volumes.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The product metadata field that you want to filter on. You can filter by just the service code to see all
     * products for a specific service, filter by just the attribute name to see a specific attribute for multiple
     * services, or use both a service code and an attribute name to retrieve only products that match both fields.
     * </p>
     * <p>
     * Valid values include: <code>ServiceCode</code>, and all attribute names
     * </p>
     * <p>
     * For example, you can filter by the <code>AmazonEC2</code> service code and the <code>volumeType</code> attribute
     * name to get the prices for only Amazon EC2 volumes.
     * </p>
     * 
     * @param field
     *        The product metadata field that you want to filter on. You can filter by just the service code to see all
     *        products for a specific service, filter by just the attribute name to see a specific attribute for
     *        multiple services, or use both a service code and an attribute name to retrieve only products that match
     *        both fields.</p>
     *        <p>
     *        Valid values include: <code>ServiceCode</code>, and all attribute names
     *        </p>
     *        <p>
     *        For example, you can filter by the <code>AmazonEC2</code> service code and the <code>volumeType</code>
     *        attribute name to get the prices for only Amazon EC2 volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The service code or attribute value that you want to filter by. If you are filtering by service code this is the
     * actual service code, such as <code>AmazonEC2</code>. If you are filtering by attribute name, this is the
     * attribute value that you want the returned products to match, such as a <code>Provisioned IOPS</code> volume.
     * </p>
     * 
     * @param value
     *        The service code or attribute value that you want to filter by. If you are filtering by service code this
     *        is the actual service code, such as <code>AmazonEC2</code>. If you are filtering by attribute name, this
     *        is the attribute value that you want the returned products to match, such as a
     *        <code>Provisioned IOPS</code> volume.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The service code or attribute value that you want to filter by. If you are filtering by service code this is the
     * actual service code, such as <code>AmazonEC2</code>. If you are filtering by attribute name, this is the
     * attribute value that you want the returned products to match, such as a <code>Provisioned IOPS</code> volume.
     * </p>
     * 
     * @return The service code or attribute value that you want to filter by. If you are filtering by service code this
     *         is the actual service code, such as <code>AmazonEC2</code>. If you are filtering by attribute name, this
     *         is the attribute value that you want the returned products to match, such as a
     *         <code>Provisioned IOPS</code> volume.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The service code or attribute value that you want to filter by. If you are filtering by service code this is the
     * actual service code, such as <code>AmazonEC2</code>. If you are filtering by attribute name, this is the
     * attribute value that you want the returned products to match, such as a <code>Provisioned IOPS</code> volume.
     * </p>
     * 
     * @param value
     *        The service code or attribute value that you want to filter by. If you are filtering by service code this
     *        is the actual service code, such as <code>AmazonEC2</code>. If you are filtering by attribute name, this
     *        is the attribute value that you want the returned products to match, such as a
     *        <code>Provisioned IOPS</code> volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValue(String value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pricing.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
