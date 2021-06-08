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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of features. You must include <code>FeatureName</code> and <code>FeatureType</code>. Valid feature
 * <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/FeatureDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     * <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     * </p>
     */
    private String featureName;
    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     */
    private String featureType;

    /**
     * <p>
     * The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     * <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     * </p>
     * 
     * @param featureName
     *        The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     *        <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     */

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     * <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     * </p>
     * 
     * @return The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the
     *         following: <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     */

    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * <p>
     * The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     * <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     * </p>
     * 
     * @param featureName
     *        The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     *        <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureDefinition withFeatureName(String featureName) {
        setFeatureName(featureName);
        return this;
    }

    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     * 
     * @param featureType
     *        The value type of a feature. Valid values are Integral, Fractional, or String.
     * @see FeatureType
     */

    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     * 
     * @return The value type of a feature. Valid values are Integral, Fractional, or String.
     * @see FeatureType
     */

    public String getFeatureType() {
        return this.featureType;
    }

    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     * 
     * @param featureType
     *        The value type of a feature. Valid values are Integral, Fractional, or String.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public FeatureDefinition withFeatureType(String featureType) {
        setFeatureType(featureType);
        return this;
    }

    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     * 
     * @param featureType
     *        The value type of a feature. Valid values are Integral, Fractional, or String.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public FeatureDefinition withFeatureType(FeatureType featureType) {
        this.featureType = featureType.toString();
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
        if (getFeatureType() != null)
            sb.append("FeatureType: ").append(getFeatureType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeatureDefinition == false)
            return false;
        FeatureDefinition other = (FeatureDefinition) obj;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        if (other.getFeatureType() == null ^ this.getFeatureType() == null)
            return false;
        if (other.getFeatureType() != null && other.getFeatureType().equals(this.getFeatureType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        hashCode = prime * hashCode + ((getFeatureType() == null) ? 0 : getFeatureType().hashCode());
        return hashCode;
    }

    @Override
    public FeatureDefinition clone() {
        try {
            return (FeatureDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FeatureDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
