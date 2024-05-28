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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a single calculated attribute for a profile.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListCalculatedAttributeForProfileItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCalculatedAttributeForProfileItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     */
    private String calculatedAttributeName;
    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * Indicates whether the calculated attribute’s value is based on partial data. If data is partial, it is set to
     * true.
     * </p>
     */
    private String isDataPartial;
    /**
     * <p>
     * The value of the calculated attribute.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     * 
     * @param calculatedAttributeName
     *        The unique name of the calculated attribute.
     */

    public void setCalculatedAttributeName(String calculatedAttributeName) {
        this.calculatedAttributeName = calculatedAttributeName;
    }

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     * 
     * @return The unique name of the calculated attribute.
     */

    public String getCalculatedAttributeName() {
        return this.calculatedAttributeName;
    }

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     * 
     * @param calculatedAttributeName
     *        The unique name of the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCalculatedAttributeForProfileItem withCalculatedAttributeName(String calculatedAttributeName) {
        setCalculatedAttributeName(calculatedAttributeName);
        return this;
    }

    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     * 
     * @param displayName
     *        The display name of the calculated attribute.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     * 
     * @return The display name of the calculated attribute.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     * 
     * @param displayName
     *        The display name of the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCalculatedAttributeForProfileItem withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the calculated attribute’s value is based on partial data. If data is partial, it is set to
     * true.
     * </p>
     * 
     * @param isDataPartial
     *        Indicates whether the calculated attribute’s value is based on partial data. If data is partial, it is set
     *        to true.
     */

    public void setIsDataPartial(String isDataPartial) {
        this.isDataPartial = isDataPartial;
    }

    /**
     * <p>
     * Indicates whether the calculated attribute’s value is based on partial data. If data is partial, it is set to
     * true.
     * </p>
     * 
     * @return Indicates whether the calculated attribute’s value is based on partial data. If data is partial, it is
     *         set to true.
     */

    public String getIsDataPartial() {
        return this.isDataPartial;
    }

    /**
     * <p>
     * Indicates whether the calculated attribute’s value is based on partial data. If data is partial, it is set to
     * true.
     * </p>
     * 
     * @param isDataPartial
     *        Indicates whether the calculated attribute’s value is based on partial data. If data is partial, it is set
     *        to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCalculatedAttributeForProfileItem withIsDataPartial(String isDataPartial) {
        setIsDataPartial(isDataPartial);
        return this;
    }

    /**
     * <p>
     * The value of the calculated attribute.
     * </p>
     * 
     * @param value
     *        The value of the calculated attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the calculated attribute.
     * </p>
     * 
     * @return The value of the calculated attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the calculated attribute.
     * </p>
     * 
     * @param value
     *        The value of the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCalculatedAttributeForProfileItem withValue(String value) {
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
        if (getCalculatedAttributeName() != null)
            sb.append("CalculatedAttributeName: ").append(getCalculatedAttributeName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getIsDataPartial() != null)
            sb.append("IsDataPartial: ").append(getIsDataPartial()).append(",");
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

        if (obj instanceof ListCalculatedAttributeForProfileItem == false)
            return false;
        ListCalculatedAttributeForProfileItem other = (ListCalculatedAttributeForProfileItem) obj;
        if (other.getCalculatedAttributeName() == null ^ this.getCalculatedAttributeName() == null)
            return false;
        if (other.getCalculatedAttributeName() != null && other.getCalculatedAttributeName().equals(this.getCalculatedAttributeName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getIsDataPartial() == null ^ this.getIsDataPartial() == null)
            return false;
        if (other.getIsDataPartial() != null && other.getIsDataPartial().equals(this.getIsDataPartial()) == false)
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

        hashCode = prime * hashCode + ((getCalculatedAttributeName() == null) ? 0 : getCalculatedAttributeName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIsDataPartial() == null) ? 0 : getIsDataPartial().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ListCalculatedAttributeForProfileItem clone() {
        try {
            return (ListCalculatedAttributeForProfileItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ListCalculatedAttributeForProfileItemMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
