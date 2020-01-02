/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value of a custom document attribute. You can only provide one value for a custom attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DocumentAttributeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentAttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string, such as "department".
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * A list of strings.
     * </p>
     */
    private java.util.List<String> stringListValue;
    /**
     * <p>
     * A long integer value.
     * </p>
     */
    private Long longValue;
    /**
     * <p>
     * A date value expressed as seconds from the Unix epoch.
     * </p>
     */
    private java.util.Date dateValue;

    /**
     * <p>
     * A string, such as "department".
     * </p>
     * 
     * @param stringValue
     *        A string, such as "department".
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * A string, such as "department".
     * </p>
     * 
     * @return A string, such as "department".
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * A string, such as "department".
     * </p>
     * 
     * @param stringValue
     *        A string, such as "department".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeValue withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     * 
     * @return A list of strings.
     */

    public java.util.List<String> getStringListValue() {
        return stringListValue;
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     * 
     * @param stringListValue
     *        A list of strings.
     */

    public void setStringListValue(java.util.Collection<String> stringListValue) {
        if (stringListValue == null) {
            this.stringListValue = null;
            return;
        }

        this.stringListValue = new java.util.ArrayList<String>(stringListValue);
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringListValue(java.util.Collection)} or {@link #withStringListValue(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stringListValue
     *        A list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeValue withStringListValue(String... stringListValue) {
        if (this.stringListValue == null) {
            setStringListValue(new java.util.ArrayList<String>(stringListValue.length));
        }
        for (String ele : stringListValue) {
            this.stringListValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     * 
     * @param stringListValue
     *        A list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeValue withStringListValue(java.util.Collection<String> stringListValue) {
        setStringListValue(stringListValue);
        return this;
    }

    /**
     * <p>
     * A long integer value.
     * </p>
     * 
     * @param longValue
     *        A long integer value.
     */

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    /**
     * <p>
     * A long integer value.
     * </p>
     * 
     * @return A long integer value.
     */

    public Long getLongValue() {
        return this.longValue;
    }

    /**
     * <p>
     * A long integer value.
     * </p>
     * 
     * @param longValue
     *        A long integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeValue withLongValue(Long longValue) {
        setLongValue(longValue);
        return this;
    }

    /**
     * <p>
     * A date value expressed as seconds from the Unix epoch.
     * </p>
     * 
     * @param dateValue
     *        A date value expressed as seconds from the Unix epoch.
     */

    public void setDateValue(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * A date value expressed as seconds from the Unix epoch.
     * </p>
     * 
     * @return A date value expressed as seconds from the Unix epoch.
     */

    public java.util.Date getDateValue() {
        return this.dateValue;
    }

    /**
     * <p>
     * A date value expressed as seconds from the Unix epoch.
     * </p>
     * 
     * @param dateValue
     *        A date value expressed as seconds from the Unix epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeValue withDateValue(java.util.Date dateValue) {
        setDateValue(dateValue);
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
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getStringListValue() != null)
            sb.append("StringListValue: ").append(getStringListValue()).append(",");
        if (getLongValue() != null)
            sb.append("LongValue: ").append(getLongValue()).append(",");
        if (getDateValue() != null)
            sb.append("DateValue: ").append(getDateValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentAttributeValue == false)
            return false;
        DocumentAttributeValue other = (DocumentAttributeValue) obj;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getStringListValue() == null ^ this.getStringListValue() == null)
            return false;
        if (other.getStringListValue() != null && other.getStringListValue().equals(this.getStringListValue()) == false)
            return false;
        if (other.getLongValue() == null ^ this.getLongValue() == null)
            return false;
        if (other.getLongValue() != null && other.getLongValue().equals(this.getLongValue()) == false)
            return false;
        if (other.getDateValue() == null ^ this.getDateValue() == null)
            return false;
        if (other.getDateValue() != null && other.getDateValue().equals(this.getDateValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getStringListValue() == null) ? 0 : getStringListValue().hashCode());
        hashCode = prime * hashCode + ((getLongValue() == null) ? 0 : getLongValue().hashCode());
        hashCode = prime * hashCode + ((getDateValue() == null) ? 0 : getDateValue().hashCode());
        return hashCode;
    }

    @Override
    public DocumentAttributeValue clone() {
        try {
            return (DocumentAttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DocumentAttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
