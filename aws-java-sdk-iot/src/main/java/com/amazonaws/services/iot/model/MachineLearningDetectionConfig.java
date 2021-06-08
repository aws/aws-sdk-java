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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of an ML Detect Security Profile.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MachineLearningDetectionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sensitivity of anomalous behavior evaluation. Can be <code>Low</code>, <code>Medium</code>, or
     * <code>High</code>.
     * </p>
     */
    private String confidenceLevel;

    /**
     * <p>
     * The sensitivity of anomalous behavior evaluation. Can be <code>Low</code>, <code>Medium</code>, or
     * <code>High</code>.
     * </p>
     * 
     * @param confidenceLevel
     *        The sensitivity of anomalous behavior evaluation. Can be <code>Low</code>, <code>Medium</code>, or
     *        <code>High</code>.
     * @see ConfidenceLevel
     */

    public void setConfidenceLevel(String confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    /**
     * <p>
     * The sensitivity of anomalous behavior evaluation. Can be <code>Low</code>, <code>Medium</code>, or
     * <code>High</code>.
     * </p>
     * 
     * @return The sensitivity of anomalous behavior evaluation. Can be <code>Low</code>, <code>Medium</code>, or
     *         <code>High</code>.
     * @see ConfidenceLevel
     */

    public String getConfidenceLevel() {
        return this.confidenceLevel;
    }

    /**
     * <p>
     * The sensitivity of anomalous behavior evaluation. Can be <code>Low</code>, <code>Medium</code>, or
     * <code>High</code>.
     * </p>
     * 
     * @param confidenceLevel
     *        The sensitivity of anomalous behavior evaluation. Can be <code>Low</code>, <code>Medium</code>, or
     *        <code>High</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfidenceLevel
     */

    public MachineLearningDetectionConfig withConfidenceLevel(String confidenceLevel) {
        setConfidenceLevel(confidenceLevel);
        return this;
    }

    /**
     * <p>
     * The sensitivity of anomalous behavior evaluation. Can be <code>Low</code>, <code>Medium</code>, or
     * <code>High</code>.
     * </p>
     * 
     * @param confidenceLevel
     *        The sensitivity of anomalous behavior evaluation. Can be <code>Low</code>, <code>Medium</code>, or
     *        <code>High</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfidenceLevel
     */

    public MachineLearningDetectionConfig withConfidenceLevel(ConfidenceLevel confidenceLevel) {
        this.confidenceLevel = confidenceLevel.toString();
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
        if (getConfidenceLevel() != null)
            sb.append("ConfidenceLevel: ").append(getConfidenceLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MachineLearningDetectionConfig == false)
            return false;
        MachineLearningDetectionConfig other = (MachineLearningDetectionConfig) obj;
        if (other.getConfidenceLevel() == null ^ this.getConfidenceLevel() == null)
            return false;
        if (other.getConfidenceLevel() != null && other.getConfidenceLevel().equals(this.getConfidenceLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidenceLevel() == null) ? 0 : getConfidenceLevel().hashCode());
        return hashCode;
    }

    @Override
    public MachineLearningDetectionConfig clone() {
        try {
            return (MachineLearningDetectionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.MachineLearningDetectionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
