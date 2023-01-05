/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The fraud prediction scores from Amazon SageMaker model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ExternalModelOutputs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalModelOutputs implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon SageMaker model.
     * </p>
     */
    private ExternalModelSummary externalModel;
    /**
     * <p>
     * The fraud prediction scores from Amazon SageMaker model.
     * </p>
     */
    private java.util.Map<String, String> outputs;

    /**
     * <p>
     * The Amazon SageMaker model.
     * </p>
     * 
     * @param externalModel
     *        The Amazon SageMaker model.
     */

    public void setExternalModel(ExternalModelSummary externalModel) {
        this.externalModel = externalModel;
    }

    /**
     * <p>
     * The Amazon SageMaker model.
     * </p>
     * 
     * @return The Amazon SageMaker model.
     */

    public ExternalModelSummary getExternalModel() {
        return this.externalModel;
    }

    /**
     * <p>
     * The Amazon SageMaker model.
     * </p>
     * 
     * @param externalModel
     *        The Amazon SageMaker model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModelOutputs withExternalModel(ExternalModelSummary externalModel) {
        setExternalModel(externalModel);
        return this;
    }

    /**
     * <p>
     * The fraud prediction scores from Amazon SageMaker model.
     * </p>
     * 
     * @return The fraud prediction scores from Amazon SageMaker model.
     */

    public java.util.Map<String, String> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The fraud prediction scores from Amazon SageMaker model.
     * </p>
     * 
     * @param outputs
     *        The fraud prediction scores from Amazon SageMaker model.
     */

    public void setOutputs(java.util.Map<String, String> outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * The fraud prediction scores from Amazon SageMaker model.
     * </p>
     * 
     * @param outputs
     *        The fraud prediction scores from Amazon SageMaker model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModelOutputs withOutputs(java.util.Map<String, String> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * Add a single Outputs entry
     *
     * @see ExternalModelOutputs#withOutputs
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModelOutputs addOutputsEntry(String key, String value) {
        if (null == this.outputs) {
            this.outputs = new java.util.HashMap<String, String>();
        }
        if (this.outputs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.outputs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Outputs.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalModelOutputs clearOutputsEntries() {
        this.outputs = null;
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
        if (getExternalModel() != null)
            sb.append("ExternalModel: ").append(getExternalModel()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalModelOutputs == false)
            return false;
        ExternalModelOutputs other = (ExternalModelOutputs) obj;
        if (other.getExternalModel() == null ^ this.getExternalModel() == null)
            return false;
        if (other.getExternalModel() != null && other.getExternalModel().equals(this.getExternalModel()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalModel() == null) ? 0 : getExternalModel().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        return hashCode;
    }

    @Override
    public ExternalModelOutputs clone() {
        try {
            return (ExternalModelOutputs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ExternalModelOutputsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
