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
     * The value associated with a feature, in string format. Note that features types can be String, Integral, or
     * Fractional. This value represents all three types as a string.
     * </p>
     */
    private String valueAsString;

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
     * The value associated with a feature, in string format. Note that features types can be String, Integral, or
     * Fractional. This value represents all three types as a string.
     * </p>
     * 
     * @param valueAsString
     *        The value associated with a feature, in string format. Note that features types can be String, Integral,
     *        or Fractional. This value represents all three types as a string.
     */

    public void setValueAsString(String valueAsString) {
        this.valueAsString = valueAsString;
    }

    /**
     * <p>
     * The value associated with a feature, in string format. Note that features types can be String, Integral, or
     * Fractional. This value represents all three types as a string.
     * </p>
     * 
     * @return The value associated with a feature, in string format. Note that features types can be String, Integral,
     *         or Fractional. This value represents all three types as a string.
     */

    public String getValueAsString() {
        return this.valueAsString;
    }

    /**
     * <p>
     * The value associated with a feature, in string format. Note that features types can be String, Integral, or
     * Fractional. This value represents all three types as a string.
     * </p>
     * 
     * @param valueAsString
     *        The value associated with a feature, in string format. Note that features types can be String, Integral,
     *        or Fractional. This value represents all three types as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureValue withValueAsString(String valueAsString) {
        setValueAsString(valueAsString);
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
            sb.append("ValueAsString: ").append(getValueAsString());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        hashCode = prime * hashCode + ((getValueAsString() == null) ? 0 : getValueAsString().hashCode());
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
