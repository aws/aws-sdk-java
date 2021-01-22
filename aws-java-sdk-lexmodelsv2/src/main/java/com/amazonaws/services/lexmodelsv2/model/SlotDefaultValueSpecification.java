/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a list of values that Amazon Lex should use as the default value for a slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotDefaultValueSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotDefaultValueSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of default values. Amazon Lex chooses the default value to use in the order that they are presented in the
     * list.
     * </p>
     */
    private java.util.List<SlotDefaultValue> defaultValueList;

    /**
     * <p>
     * A list of default values. Amazon Lex chooses the default value to use in the order that they are presented in the
     * list.
     * </p>
     * 
     * @return A list of default values. Amazon Lex chooses the default value to use in the order that they are
     *         presented in the list.
     */

    public java.util.List<SlotDefaultValue> getDefaultValueList() {
        return defaultValueList;
    }

    /**
     * <p>
     * A list of default values. Amazon Lex chooses the default value to use in the order that they are presented in the
     * list.
     * </p>
     * 
     * @param defaultValueList
     *        A list of default values. Amazon Lex chooses the default value to use in the order that they are presented
     *        in the list.
     */

    public void setDefaultValueList(java.util.Collection<SlotDefaultValue> defaultValueList) {
        if (defaultValueList == null) {
            this.defaultValueList = null;
            return;
        }

        this.defaultValueList = new java.util.ArrayList<SlotDefaultValue>(defaultValueList);
    }

    /**
     * <p>
     * A list of default values. Amazon Lex chooses the default value to use in the order that they are presented in the
     * list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultValueList(java.util.Collection)} or {@link #withDefaultValueList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param defaultValueList
     *        A list of default values. Amazon Lex chooses the default value to use in the order that they are presented
     *        in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotDefaultValueSpecification withDefaultValueList(SlotDefaultValue... defaultValueList) {
        if (this.defaultValueList == null) {
            setDefaultValueList(new java.util.ArrayList<SlotDefaultValue>(defaultValueList.length));
        }
        for (SlotDefaultValue ele : defaultValueList) {
            this.defaultValueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of default values. Amazon Lex chooses the default value to use in the order that they are presented in the
     * list.
     * </p>
     * 
     * @param defaultValueList
     *        A list of default values. Amazon Lex chooses the default value to use in the order that they are presented
     *        in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotDefaultValueSpecification withDefaultValueList(java.util.Collection<SlotDefaultValue> defaultValueList) {
        setDefaultValueList(defaultValueList);
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
        if (getDefaultValueList() != null)
            sb.append("DefaultValueList: ").append(getDefaultValueList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotDefaultValueSpecification == false)
            return false;
        SlotDefaultValueSpecification other = (SlotDefaultValueSpecification) obj;
        if (other.getDefaultValueList() == null ^ this.getDefaultValueList() == null)
            return false;
        if (other.getDefaultValueList() != null && other.getDefaultValueList().equals(this.getDefaultValueList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValueList() == null) ? 0 : getDefaultValueList().hashCode());
        return hashCode;
    }

    @Override
    public SlotDefaultValueSpecification clone() {
        try {
            return (SlotDefaultValueSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotDefaultValueSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
