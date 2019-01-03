/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The output from a <code>Predict</code> operation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Details</code> - Contains the following attributes:
 * <code>DetailsAttributes.PREDICTIVE_MODEL_TYPE - REGRESSION | BINARY | MULTICLASS</code>
 * <code>DetailsAttributes.ALGORITHM - SGD</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PredictedLabel</code> - Present for either a <code>BINARY</code> or <code>MULTICLASS</code>
 * <code>MLModel</code> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PredictedScores</code> - Contains the raw classification score corresponding to each label.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PredictedValue</code> - Present for a <code>REGRESSION</code> <code>MLModel</code> request.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Prediction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The prediction label for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code>.
     * </p>
     */
    private String predictedLabel;
    /** The prediction value for <code>REGRESSION</code> <code>MLModel</code>. */
    private Float predictedValue;

    private com.amazonaws.internal.SdkInternalMap<String, Float> predictedScores;

    private com.amazonaws.internal.SdkInternalMap<String, String> details;

    /**
     * <p>
     * The prediction label for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code>.
     * </p>
     * 
     * @param predictedLabel
     *        The prediction label for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code>.
     */

    public void setPredictedLabel(String predictedLabel) {
        this.predictedLabel = predictedLabel;
    }

    /**
     * <p>
     * The prediction label for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code>.
     * </p>
     * 
     * @return The prediction label for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code>.
     */

    public String getPredictedLabel() {
        return this.predictedLabel;
    }

    /**
     * <p>
     * The prediction label for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code>.
     * </p>
     * 
     * @param predictedLabel
     *        The prediction label for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prediction withPredictedLabel(String predictedLabel) {
        setPredictedLabel(predictedLabel);
        return this;
    }

    /**
     * The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     * 
     * @param predictedValue
     *        The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     */

    public void setPredictedValue(Float predictedValue) {
        this.predictedValue = predictedValue;
    }

    /**
     * The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     * 
     * @return The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     */

    public Float getPredictedValue() {
        return this.predictedValue;
    }

    /**
     * The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     * 
     * @param predictedValue
     *        The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prediction withPredictedValue(Float predictedValue) {
        setPredictedValue(predictedValue);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, Float> getPredictedScores() {
        if (predictedScores == null) {
            predictedScores = new com.amazonaws.internal.SdkInternalMap<String, Float>();
        }
        return predictedScores;
    }

    /**
     * @param predictedScores
     */

    public void setPredictedScores(java.util.Map<String, Float> predictedScores) {
        this.predictedScores = predictedScores == null ? null : new com.amazonaws.internal.SdkInternalMap<String, Float>(predictedScores);
    }

    /**
     * @param predictedScores
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prediction withPredictedScores(java.util.Map<String, Float> predictedScores) {
        setPredictedScores(predictedScores);
        return this;
    }

    public Prediction addPredictedScoresEntry(String key, Float value) {
        if (null == this.predictedScores) {
            this.predictedScores = new com.amazonaws.internal.SdkInternalMap<String, Float>();
        }
        if (this.predictedScores.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.predictedScores.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PredictedScores.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prediction clearPredictedScoresEntries() {
        this.predictedScores = null;
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getDetails() {
        if (details == null) {
            details = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return details;
    }

    /**
     * @param details
     */

    public void setDetails(java.util.Map<String, String> details) {
        this.details = details == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(details);
    }

    /**
     * @param details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prediction withDetails(java.util.Map<String, String> details) {
        setDetails(details);
        return this;
    }

    public Prediction addDetailsEntry(String key, String value) {
        if (null == this.details) {
            this.details = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.details.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.details.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Details.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prediction clearDetailsEntries() {
        this.details = null;
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
        if (getPredictedLabel() != null)
            sb.append("PredictedLabel: ").append(getPredictedLabel()).append(",");
        if (getPredictedValue() != null)
            sb.append("PredictedValue: ").append(getPredictedValue()).append(",");
        if (getPredictedScores() != null)
            sb.append("PredictedScores: ").append(getPredictedScores()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Prediction == false)
            return false;
        Prediction other = (Prediction) obj;
        if (other.getPredictedLabel() == null ^ this.getPredictedLabel() == null)
            return false;
        if (other.getPredictedLabel() != null && other.getPredictedLabel().equals(this.getPredictedLabel()) == false)
            return false;
        if (other.getPredictedValue() == null ^ this.getPredictedValue() == null)
            return false;
        if (other.getPredictedValue() != null && other.getPredictedValue().equals(this.getPredictedValue()) == false)
            return false;
        if (other.getPredictedScores() == null ^ this.getPredictedScores() == null)
            return false;
        if (other.getPredictedScores() != null && other.getPredictedScores().equals(this.getPredictedScores()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictedLabel() == null) ? 0 : getPredictedLabel().hashCode());
        hashCode = prime * hashCode + ((getPredictedValue() == null) ? 0 : getPredictedValue().hashCode());
        hashCode = prime * hashCode + ((getPredictedScores() == null) ? 0 : getPredictedScores().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public Prediction clone() {
        try {
            return (Prediction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.PredictionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
