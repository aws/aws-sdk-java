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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the automatically generated business metadata that is rejected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectChoice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectChoice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the the automatically generated business metadata that can be rejected.
     * </p>
     */
    private java.util.List<Integer> predictionChoices;
    /**
     * <p>
     * Specifies the target (for example, a column name) where a prediction can be rejected.
     * </p>
     */
    private String predictionTarget;

    /**
     * <p>
     * Specifies the the automatically generated business metadata that can be rejected.
     * </p>
     * 
     * @return Specifies the the automatically generated business metadata that can be rejected.
     */

    public java.util.List<Integer> getPredictionChoices() {
        return predictionChoices;
    }

    /**
     * <p>
     * Specifies the the automatically generated business metadata that can be rejected.
     * </p>
     * 
     * @param predictionChoices
     *        Specifies the the automatically generated business metadata that can be rejected.
     */

    public void setPredictionChoices(java.util.Collection<Integer> predictionChoices) {
        if (predictionChoices == null) {
            this.predictionChoices = null;
            return;
        }

        this.predictionChoices = new java.util.ArrayList<Integer>(predictionChoices);
    }

    /**
     * <p>
     * Specifies the the automatically generated business metadata that can be rejected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredictionChoices(java.util.Collection)} or {@link #withPredictionChoices(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param predictionChoices
     *        Specifies the the automatically generated business metadata that can be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectChoice withPredictionChoices(Integer... predictionChoices) {
        if (this.predictionChoices == null) {
            setPredictionChoices(new java.util.ArrayList<Integer>(predictionChoices.length));
        }
        for (Integer ele : predictionChoices) {
            this.predictionChoices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the the automatically generated business metadata that can be rejected.
     * </p>
     * 
     * @param predictionChoices
     *        Specifies the the automatically generated business metadata that can be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectChoice withPredictionChoices(java.util.Collection<Integer> predictionChoices) {
        setPredictionChoices(predictionChoices);
        return this;
    }

    /**
     * <p>
     * Specifies the target (for example, a column name) where a prediction can be rejected.
     * </p>
     * 
     * @param predictionTarget
     *        Specifies the target (for example, a column name) where a prediction can be rejected.
     */

    public void setPredictionTarget(String predictionTarget) {
        this.predictionTarget = predictionTarget;
    }

    /**
     * <p>
     * Specifies the target (for example, a column name) where a prediction can be rejected.
     * </p>
     * 
     * @return Specifies the target (for example, a column name) where a prediction can be rejected.
     */

    public String getPredictionTarget() {
        return this.predictionTarget;
    }

    /**
     * <p>
     * Specifies the target (for example, a column name) where a prediction can be rejected.
     * </p>
     * 
     * @param predictionTarget
     *        Specifies the target (for example, a column name) where a prediction can be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectChoice withPredictionTarget(String predictionTarget) {
        setPredictionTarget(predictionTarget);
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
        if (getPredictionChoices() != null)
            sb.append("PredictionChoices: ").append(getPredictionChoices()).append(",");
        if (getPredictionTarget() != null)
            sb.append("PredictionTarget: ").append(getPredictionTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectChoice == false)
            return false;
        RejectChoice other = (RejectChoice) obj;
        if (other.getPredictionChoices() == null ^ this.getPredictionChoices() == null)
            return false;
        if (other.getPredictionChoices() != null && other.getPredictionChoices().equals(this.getPredictionChoices()) == false)
            return false;
        if (other.getPredictionTarget() == null ^ this.getPredictionTarget() == null)
            return false;
        if (other.getPredictionTarget() != null && other.getPredictionTarget().equals(this.getPredictionTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictionChoices() == null) ? 0 : getPredictionChoices().hashCode());
        hashCode = prime * hashCode + ((getPredictionTarget() == null) ? 0 : getPredictionTarget().hashCode());
        return hashCode;
    }

    @Override
    public RejectChoice clone() {
        try {
            return (RejectChoice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.RejectChoiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
