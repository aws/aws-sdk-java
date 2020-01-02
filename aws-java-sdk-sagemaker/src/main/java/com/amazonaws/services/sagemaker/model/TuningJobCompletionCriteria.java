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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The job completion criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TuningJobCompletionCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TuningJobCompletionCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The objective metric's value.
     * </p>
     */
    private Float targetObjectiveMetricValue;

    /**
     * <p>
     * The objective metric's value.
     * </p>
     * 
     * @param targetObjectiveMetricValue
     *        The objective metric's value.
     */

    public void setTargetObjectiveMetricValue(Float targetObjectiveMetricValue) {
        this.targetObjectiveMetricValue = targetObjectiveMetricValue;
    }

    /**
     * <p>
     * The objective metric's value.
     * </p>
     * 
     * @return The objective metric's value.
     */

    public Float getTargetObjectiveMetricValue() {
        return this.targetObjectiveMetricValue;
    }

    /**
     * <p>
     * The objective metric's value.
     * </p>
     * 
     * @param targetObjectiveMetricValue
     *        The objective metric's value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TuningJobCompletionCriteria withTargetObjectiveMetricValue(Float targetObjectiveMetricValue) {
        setTargetObjectiveMetricValue(targetObjectiveMetricValue);
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
        if (getTargetObjectiveMetricValue() != null)
            sb.append("TargetObjectiveMetricValue: ").append(getTargetObjectiveMetricValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TuningJobCompletionCriteria == false)
            return false;
        TuningJobCompletionCriteria other = (TuningJobCompletionCriteria) obj;
        if (other.getTargetObjectiveMetricValue() == null ^ this.getTargetObjectiveMetricValue() == null)
            return false;
        if (other.getTargetObjectiveMetricValue() != null && other.getTargetObjectiveMetricValue().equals(this.getTargetObjectiveMetricValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetObjectiveMetricValue() == null) ? 0 : getTargetObjectiveMetricValue().hashCode());
        return hashCode;
    }

    @Override
    public TuningJobCompletionCriteria clone() {
        try {
            return (TuningJobCompletionCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TuningJobCompletionCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
