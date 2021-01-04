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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the default values for a slot. Default values are used when Amazon Lex hasn't determined a value for a slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/SlotDefaultValueSpec" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotDefaultValueSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default values for a slot. You can specify more than one default. For example, you can specify a default
     * value to use from a matching context variable, a session attribute, or a fixed value.
     * </p>
     * <p>
     * The default value chosen is selected based on the order that you specify them in the list. For example, if you
     * specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it is
     * available, else it uses the fixed value.
     * </p>
     */
    private java.util.List<SlotDefaultValue> defaultValueList;

    /**
     * <p>
     * The default values for a slot. You can specify more than one default. For example, you can specify a default
     * value to use from a matching context variable, a session attribute, or a fixed value.
     * </p>
     * <p>
     * The default value chosen is selected based on the order that you specify them in the list. For example, if you
     * specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it is
     * available, else it uses the fixed value.
     * </p>
     * 
     * @return The default values for a slot. You can specify more than one default. For example, you can specify a
     *         default value to use from a matching context variable, a session attribute, or a fixed value.</p>
     *         <p>
     *         The default value chosen is selected based on the order that you specify them in the list. For example,
     *         if you specify a context variable and a fixed value in that order, Amazon Lex uses the context variable
     *         if it is available, else it uses the fixed value.
     */

    public java.util.List<SlotDefaultValue> getDefaultValueList() {
        return defaultValueList;
    }

    /**
     * <p>
     * The default values for a slot. You can specify more than one default. For example, you can specify a default
     * value to use from a matching context variable, a session attribute, or a fixed value.
     * </p>
     * <p>
     * The default value chosen is selected based on the order that you specify them in the list. For example, if you
     * specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it is
     * available, else it uses the fixed value.
     * </p>
     * 
     * @param defaultValueList
     *        The default values for a slot. You can specify more than one default. For example, you can specify a
     *        default value to use from a matching context variable, a session attribute, or a fixed value.</p>
     *        <p>
     *        The default value chosen is selected based on the order that you specify them in the list. For example, if
     *        you specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it
     *        is available, else it uses the fixed value.
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
     * The default values for a slot. You can specify more than one default. For example, you can specify a default
     * value to use from a matching context variable, a session attribute, or a fixed value.
     * </p>
     * <p>
     * The default value chosen is selected based on the order that you specify them in the list. For example, if you
     * specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it is
     * available, else it uses the fixed value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultValueList(java.util.Collection)} or {@link #withDefaultValueList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param defaultValueList
     *        The default values for a slot. You can specify more than one default. For example, you can specify a
     *        default value to use from a matching context variable, a session attribute, or a fixed value.</p>
     *        <p>
     *        The default value chosen is selected based on the order that you specify them in the list. For example, if
     *        you specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it
     *        is available, else it uses the fixed value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotDefaultValueSpec withDefaultValueList(SlotDefaultValue... defaultValueList) {
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
     * The default values for a slot. You can specify more than one default. For example, you can specify a default
     * value to use from a matching context variable, a session attribute, or a fixed value.
     * </p>
     * <p>
     * The default value chosen is selected based on the order that you specify them in the list. For example, if you
     * specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it is
     * available, else it uses the fixed value.
     * </p>
     * 
     * @param defaultValueList
     *        The default values for a slot. You can specify more than one default. For example, you can specify a
     *        default value to use from a matching context variable, a session attribute, or a fixed value.</p>
     *        <p>
     *        The default value chosen is selected based on the order that you specify them in the list. For example, if
     *        you specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it
     *        is available, else it uses the fixed value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotDefaultValueSpec withDefaultValueList(java.util.Collection<SlotDefaultValue> defaultValueList) {
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

        if (obj instanceof SlotDefaultValueSpec == false)
            return false;
        SlotDefaultValueSpec other = (SlotDefaultValueSpec) obj;
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
    public SlotDefaultValueSpec clone() {
        try {
            return (SlotDefaultValueSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.SlotDefaultValueSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
