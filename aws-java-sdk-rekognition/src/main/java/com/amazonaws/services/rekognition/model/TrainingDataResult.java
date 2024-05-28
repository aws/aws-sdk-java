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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data validation manifest created for the training dataset during model training.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingDataResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The training data that you supplied.
     * </p>
     */
    private TrainingData input;
    /**
     * <p>
     * Reference to images (assets) that were actually used during training with trained model predictions.
     * </p>
     */
    private TrainingData output;
    /**
     * <p>
     * A manifest that you supplied for training, with validation results for each line.
     * </p>
     */
    private ValidationData validation;

    /**
     * <p>
     * The training data that you supplied.
     * </p>
     * 
     * @param input
     *        The training data that you supplied.
     */

    public void setInput(TrainingData input) {
        this.input = input;
    }

    /**
     * <p>
     * The training data that you supplied.
     * </p>
     * 
     * @return The training data that you supplied.
     */

    public TrainingData getInput() {
        return this.input;
    }

    /**
     * <p>
     * The training data that you supplied.
     * </p>
     * 
     * @param input
     *        The training data that you supplied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataResult withInput(TrainingData input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Reference to images (assets) that were actually used during training with trained model predictions.
     * </p>
     * 
     * @param output
     *        Reference to images (assets) that were actually used during training with trained model predictions.
     */

    public void setOutput(TrainingData output) {
        this.output = output;
    }

    /**
     * <p>
     * Reference to images (assets) that were actually used during training with trained model predictions.
     * </p>
     * 
     * @return Reference to images (assets) that were actually used during training with trained model predictions.
     */

    public TrainingData getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Reference to images (assets) that were actually used during training with trained model predictions.
     * </p>
     * 
     * @param output
     *        Reference to images (assets) that were actually used during training with trained model predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataResult withOutput(TrainingData output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * A manifest that you supplied for training, with validation results for each line.
     * </p>
     * 
     * @param validation
     *        A manifest that you supplied for training, with validation results for each line.
     */

    public void setValidation(ValidationData validation) {
        this.validation = validation;
    }

    /**
     * <p>
     * A manifest that you supplied for training, with validation results for each line.
     * </p>
     * 
     * @return A manifest that you supplied for training, with validation results for each line.
     */

    public ValidationData getValidation() {
        return this.validation;
    }

    /**
     * <p>
     * A manifest that you supplied for training, with validation results for each line.
     * </p>
     * 
     * @param validation
     *        A manifest that you supplied for training, with validation results for each line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataResult withValidation(ValidationData validation) {
        setValidation(validation);
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getValidation() != null)
            sb.append("Validation: ").append(getValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingDataResult == false)
            return false;
        TrainingDataResult other = (TrainingDataResult) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getValidation() == null ^ this.getValidation() == null)
            return false;
        if (other.getValidation() != null && other.getValidation().equals(this.getValidation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getValidation() == null) ? 0 : getValidation().hashCode());
        return hashCode;
    }

    @Override
    public TrainingDataResult clone() {
        try {
            return (TrainingDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.TrainingDataResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
