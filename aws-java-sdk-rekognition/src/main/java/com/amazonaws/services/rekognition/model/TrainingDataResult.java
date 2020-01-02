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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A Sagemaker Groundtruth format manifest file that represents the dataset used for training.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingDataResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The training assets that you supplied for training.
     * </p>
     */
    private TrainingData input;
    /**
     * <p>
     * The images (assets) that were actually trained by Amazon Rekognition Custom Labels.
     * </p>
     */
    private TrainingData output;

    /**
     * <p>
     * The training assets that you supplied for training.
     * </p>
     * 
     * @param input
     *        The training assets that you supplied for training.
     */

    public void setInput(TrainingData input) {
        this.input = input;
    }

    /**
     * <p>
     * The training assets that you supplied for training.
     * </p>
     * 
     * @return The training assets that you supplied for training.
     */

    public TrainingData getInput() {
        return this.input;
    }

    /**
     * <p>
     * The training assets that you supplied for training.
     * </p>
     * 
     * @param input
     *        The training assets that you supplied for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataResult withInput(TrainingData input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The images (assets) that were actually trained by Amazon Rekognition Custom Labels.
     * </p>
     * 
     * @param output
     *        The images (assets) that were actually trained by Amazon Rekognition Custom Labels.
     */

    public void setOutput(TrainingData output) {
        this.output = output;
    }

    /**
     * <p>
     * The images (assets) that were actually trained by Amazon Rekognition Custom Labels.
     * </p>
     * 
     * @return The images (assets) that were actually trained by Amazon Rekognition Custom Labels.
     */

    public TrainingData getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The images (assets) that were actually trained by Amazon Rekognition Custom Labels.
     * </p>
     * 
     * @param output
     *        The images (assets) that were actually trained by Amazon Rekognition Custom Labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataResult withOutput(TrainingData output) {
        setOutput(output);
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
            sb.append("Output: ").append(getOutput());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
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
