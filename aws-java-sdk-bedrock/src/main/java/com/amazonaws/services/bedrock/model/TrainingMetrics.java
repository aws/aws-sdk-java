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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metrics associated with the custom job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/TrainingMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Loss metric associated with the custom job.
     * </p>
     */
    private Float trainingLoss;

    /**
     * <p>
     * Loss metric associated with the custom job.
     * </p>
     * 
     * @param trainingLoss
     *        Loss metric associated with the custom job.
     */

    public void setTrainingLoss(Float trainingLoss) {
        this.trainingLoss = trainingLoss;
    }

    /**
     * <p>
     * Loss metric associated with the custom job.
     * </p>
     * 
     * @return Loss metric associated with the custom job.
     */

    public Float getTrainingLoss() {
        return this.trainingLoss;
    }

    /**
     * <p>
     * Loss metric associated with the custom job.
     * </p>
     * 
     * @param trainingLoss
     *        Loss metric associated with the custom job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingMetrics withTrainingLoss(Float trainingLoss) {
        setTrainingLoss(trainingLoss);
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
        if (getTrainingLoss() != null)
            sb.append("TrainingLoss: ").append(getTrainingLoss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingMetrics == false)
            return false;
        TrainingMetrics other = (TrainingMetrics) obj;
        if (other.getTrainingLoss() == null ^ this.getTrainingLoss() == null)
            return false;
        if (other.getTrainingLoss() != null && other.getTrainingLoss().equals(this.getTrainingLoss()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingLoss() == null) ? 0 : getTrainingLoss().hashCode());
        return hashCode;
    }

    @Override
    public TrainingMetrics clone() {
        try {
            return (TrainingMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.TrainingMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
