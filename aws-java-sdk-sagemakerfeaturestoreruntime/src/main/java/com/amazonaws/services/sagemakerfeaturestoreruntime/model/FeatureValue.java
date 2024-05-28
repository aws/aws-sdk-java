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
package com.amazonaws.services.sagemakerfeaturestoreruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value associated with a feature.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/FeatureValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a feature that a feature value corresponds to.
     * </p>
     */
    private String featureName;
    /**
     * <p>
     * The value in string format associated with a feature. Used when your <code>CollectionType</code> is
     * <code>None</code>. Note that features types can be <code>String</code>, <code>Integral</code>, or
     * <code>Fractional</code>. This value represents all three types as a string.
     * </p>
     */
    private String valueAsString;
    /**
     * <p>
     * The list of values in string format associated with a feature. Used when your <code>CollectionType</code> is a
     * <code>List</code>, <code>Set</code>, or <code>Vector</code>. Note that features types can be <code>String</code>,
     * <code>Integral</code>, or <code>Fractional</code>. These values represents all three types as a string.
     * </p>
     */
    private java.util.List<String> valueAsStringList;

    /**
     * <p>
     * The name of a feature that a feature value corresponds to.
     * </p>
     * 
     * @param featureName
     *        The name of a feature that a feature value corresponds to.
     */

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of a feature that a feature value corresponds to.
     * </p>
     * 
     * @return The name of a feature that a feature value corresponds to.
     */

    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * <p>
     * The name of a feature that a feature value corresponds to.
     * </p>
     * 
     * @param featureName
     *        The name of a feature that a feature value corresponds to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureValue withFeatureName(String featureName) {
        setFeatureName(featureName);
        return this;
    }

    /**
     * <p>
     * The value in string format associated with a feature. Used when your <code>CollectionType</code> is
     * <code>None</code>. Note that features types can be <code>String</code>, <code>Integral</code>, or
     * <code>Fractional</code>. This value represents all three types as a string.
     * </p>
     * 
     * @param valueAsString
     *        The value in string format associated with a feature. Used when your <code>CollectionType</code> is
     *        <code>None</code>. Note that features types can be <code>String</code>, <code>Integral</code>, or
     *        <code>Fractional</code>. This value represents all three types as a string.
     */

    public void setValueAsString(String valueAsString) {
        this.valueAsString = valueAsString;
    }

    /**
     * <p>
     * The value in string format associated with a feature. Used when your <code>CollectionType</code> is
     * <code>None</code>. Note that features types can be <code>String</code>, <code>Integral</code>, or
     * <code>Fractional</code>. This value represents all three types as a string.
     * </p>
     * 
     * @return The value in string format associated with a feature. Used when your <code>CollectionType</code> is
     *         <code>None</code>. Note that features types can be <code>String</code>, <code>Integral</code>, or
     *         <code>Fractional</code>. This value represents all three types as a string.
     */

    public String getValueAsString() {
        return this.valueAsString;
    }

    /**
     * <p>
     * The value in string format associated with a feature. Used when your <code>CollectionType</code> is
     * <code>None</code>. Note that features types can be <code>String</code>, <code>Integral</code>, or
     * <code>Fractional</code>. This value represents all three types as a string.
     * </p>
     * 
     * @param valueAsString
     *        The value in string format associated with a feature. Used when your <code>CollectionType</code> is
     *        <code>None</code>. Note that features types can be <code>String</code>, <code>Integral</code>, or
     *        <code>Fractional</code>. This value represents all three types as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureValue withValueAsString(String valueAsString) {
        setValueAsString(valueAsString);
        return this;
    }

    /**
     * <p>
     * The list of values in string format associated with a feature. Used when your <code>CollectionType</code> is a
     * <code>List</code>, <code>Set</code>, or <code>Vector</code>. Note that features types can be <code>String</code>,
     * <code>Integral</code>, or <code>Fractional</code>. These values represents all three types as a string.
     * </p>
     * 
     * @return The list of values in string format associated with a feature. Used when your <code>CollectionType</code>
     *         is a <code>List</code>, <code>Set</code>, or <code>Vector</code>. Note that features types can be
     *         <code>String</code>, <code>Integral</code>, or <code>Fractional</code>. These values represents all three
     *         types as a string.
     */

    public java.util.List<String> getValueAsStringList() {
        return valueAsStringList;
    }

    /**
     * <p>
     * The list of values in string format associated with a feature. Used when your <code>CollectionType</code> is a
     * <code>List</code>, <code>Set</code>, or <code>Vector</code>. Note that features types can be <code>String</code>,
     * <code>Integral</code>, or <code>Fractional</code>. These values represents all three types as a string.
     * </p>
     * 
     * @param valueAsStringList
     *        The list of values in string format associated with a feature. Used when your <code>CollectionType</code>
     *        is a <code>List</code>, <code>Set</code>, or <code>Vector</code>. Note that features types can be
     *        <code>String</code>, <code>Integral</code>, or <code>Fractional</code>. These values represents all three
     *        types as a string.
     */

    public void setValueAsStringList(java.util.Collection<String> valueAsStringList) {
        if (valueAsStringList == null) {
            this.valueAsStringList = null;
            return;
        }

        this.valueAsStringList = new java.util.ArrayList<String>(valueAsStringList);
    }

    /**
     * <p>
     * The list of values in string format associated with a feature. Used when your <code>CollectionType</code> is a
     * <code>List</code>, <code>Set</code>, or <code>Vector</code>. Note that features types can be <code>String</code>,
     * <code>Integral</code>, or <code>Fractional</code>. These values represents all three types as a string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValueAsStringList(java.util.Collection)} or {@link #withValueAsStringList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param valueAsStringList
     *        The list of values in string format associated with a feature. Used when your <code>CollectionType</code>
     *        is a <code>List</code>, <code>Set</code>, or <code>Vector</code>. Note that features types can be
     *        <code>String</code>, <code>Integral</code>, or <code>Fractional</code>. These values represents all three
     *        types as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureValue withValueAsStringList(String... valueAsStringList) {
        if (this.valueAsStringList == null) {
            setValueAsStringList(new java.util.ArrayList<String>(valueAsStringList.length));
        }
        for (String ele : valueAsStringList) {
            this.valueAsStringList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of values in string format associated with a feature. Used when your <code>CollectionType</code> is a
     * <code>List</code>, <code>Set</code>, or <code>Vector</code>. Note that features types can be <code>String</code>,
     * <code>Integral</code>, or <code>Fractional</code>. These values represents all three types as a string.
     * </p>
     * 
     * @param valueAsStringList
     *        The list of values in string format associated with a feature. Used when your <code>CollectionType</code>
     *        is a <code>List</code>, <code>Set</code>, or <code>Vector</code>. Note that features types can be
     *        <code>String</code>, <code>Integral</code>, or <code>Fractional</code>. These values represents all three
     *        types as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureValue withValueAsStringList(java.util.Collection<String> valueAsStringList) {
        setValueAsStringList(valueAsStringList);
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
        if (getFeatureName() != null)
            sb.append("FeatureName: ").append(getFeatureName()).append(",");
        if (getValueAsString() != null)
            sb.append("ValueAsString: ").append(getValueAsString()).append(",");
        if (getValueAsStringList() != null)
            sb.append("ValueAsStringList: ").append(getValueAsStringList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeatureValue == false)
            return false;
        FeatureValue other = (FeatureValue) obj;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        if (other.getValueAsString() == null ^ this.getValueAsString() == null)
            return false;
        if (other.getValueAsString() != null && other.getValueAsString().equals(this.getValueAsString()) == false)
            return false;
        if (other.getValueAsStringList() == null ^ this.getValueAsStringList() == null)
            return false;
        if (other.getValueAsStringList() != null && other.getValueAsStringList().equals(this.getValueAsStringList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        hashCode = prime * hashCode + ((getValueAsString() == null) ? 0 : getValueAsString().hashCode());
        hashCode = prime * hashCode + ((getValueAsStringList() == null) ? 0 : getValueAsStringList().hashCode());
        return hashCode;
    }

    @Override
    public FeatureValue clone() {
        try {
            return (FeatureValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.FeatureValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
