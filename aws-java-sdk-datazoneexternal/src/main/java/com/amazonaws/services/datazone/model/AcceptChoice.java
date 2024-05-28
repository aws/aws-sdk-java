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
 * Specifies the prediction (aka, the automatically generated piece of metadata) and the target (for example, a column
 * name) that can be accepted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AcceptChoice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptChoice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The edit of the prediction.
     * </p>
     */
    private String editedValue;
    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) that can be accepted.
     * </p>
     */
    private Integer predictionChoice;
    /**
     * <p>
     * Specifies the target (for example, a column name) where a prediction can be accepted.
     * </p>
     */
    private String predictionTarget;

    /**
     * <p>
     * The edit of the prediction.
     * </p>
     * 
     * @param editedValue
     *        The edit of the prediction.
     */

    public void setEditedValue(String editedValue) {
        this.editedValue = editedValue;
    }

    /**
     * <p>
     * The edit of the prediction.
     * </p>
     * 
     * @return The edit of the prediction.
     */

    public String getEditedValue() {
        return this.editedValue;
    }

    /**
     * <p>
     * The edit of the prediction.
     * </p>
     * 
     * @param editedValue
     *        The edit of the prediction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptChoice withEditedValue(String editedValue) {
        setEditedValue(editedValue);
        return this;
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) that can be accepted.
     * </p>
     * 
     * @param predictionChoice
     *        Specifies the prediction (aka, the automatically generated piece of metadata) that can be accepted.
     */

    public void setPredictionChoice(Integer predictionChoice) {
        this.predictionChoice = predictionChoice;
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) that can be accepted.
     * </p>
     * 
     * @return Specifies the prediction (aka, the automatically generated piece of metadata) that can be accepted.
     */

    public Integer getPredictionChoice() {
        return this.predictionChoice;
    }

    /**
     * <p>
     * Specifies the prediction (aka, the automatically generated piece of metadata) that can be accepted.
     * </p>
     * 
     * @param predictionChoice
     *        Specifies the prediction (aka, the automatically generated piece of metadata) that can be accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptChoice withPredictionChoice(Integer predictionChoice) {
        setPredictionChoice(predictionChoice);
        return this;
    }

    /**
     * <p>
     * Specifies the target (for example, a column name) where a prediction can be accepted.
     * </p>
     * 
     * @param predictionTarget
     *        Specifies the target (for example, a column name) where a prediction can be accepted.
     */

    public void setPredictionTarget(String predictionTarget) {
        this.predictionTarget = predictionTarget;
    }

    /**
     * <p>
     * Specifies the target (for example, a column name) where a prediction can be accepted.
     * </p>
     * 
     * @return Specifies the target (for example, a column name) where a prediction can be accepted.
     */

    public String getPredictionTarget() {
        return this.predictionTarget;
    }

    /**
     * <p>
     * Specifies the target (for example, a column name) where a prediction can be accepted.
     * </p>
     * 
     * @param predictionTarget
     *        Specifies the target (for example, a column name) where a prediction can be accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptChoice withPredictionTarget(String predictionTarget) {
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
        if (getEditedValue() != null)
            sb.append("EditedValue: ").append("***Sensitive Data Redacted***").append(",");
        if (getPredictionChoice() != null)
            sb.append("PredictionChoice: ").append(getPredictionChoice()).append(",");
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

        if (obj instanceof AcceptChoice == false)
            return false;
        AcceptChoice other = (AcceptChoice) obj;
        if (other.getEditedValue() == null ^ this.getEditedValue() == null)
            return false;
        if (other.getEditedValue() != null && other.getEditedValue().equals(this.getEditedValue()) == false)
            return false;
        if (other.getPredictionChoice() == null ^ this.getPredictionChoice() == null)
            return false;
        if (other.getPredictionChoice() != null && other.getPredictionChoice().equals(this.getPredictionChoice()) == false)
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

        hashCode = prime * hashCode + ((getEditedValue() == null) ? 0 : getEditedValue().hashCode());
        hashCode = prime * hashCode + ((getPredictionChoice() == null) ? 0 : getPredictionChoice().hashCode());
        hashCode = prime * hashCode + ((getPredictionTarget() == null) ? 0 : getPredictionTarget().hashCode());
        return hashCode;
    }

    @Override
    public AcceptChoice clone() {
        try {
            return (AcceptChoice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.AcceptChoiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
