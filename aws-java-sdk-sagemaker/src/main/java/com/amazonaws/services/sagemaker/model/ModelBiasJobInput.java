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
 * Inputs for the model bias job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelBiasJobInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelBiasJobInput implements Serializable, Cloneable, StructuredPojo {

    private EndpointInput endpointInput;
    /**
     * <p>
     * Location of ground truth labels to use in model bias job.
     * </p>
     */
    private MonitoringGroundTruthS3Input groundTruthS3Input;

    /**
     * @param endpointInput
     */

    public void setEndpointInput(EndpointInput endpointInput) {
        this.endpointInput = endpointInput;
    }

    /**
     * @return
     */

    public EndpointInput getEndpointInput() {
        return this.endpointInput;
    }

    /**
     * @param endpointInput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelBiasJobInput withEndpointInput(EndpointInput endpointInput) {
        setEndpointInput(endpointInput);
        return this;
    }

    /**
     * <p>
     * Location of ground truth labels to use in model bias job.
     * </p>
     * 
     * @param groundTruthS3Input
     *        Location of ground truth labels to use in model bias job.
     */

    public void setGroundTruthS3Input(MonitoringGroundTruthS3Input groundTruthS3Input) {
        this.groundTruthS3Input = groundTruthS3Input;
    }

    /**
     * <p>
     * Location of ground truth labels to use in model bias job.
     * </p>
     * 
     * @return Location of ground truth labels to use in model bias job.
     */

    public MonitoringGroundTruthS3Input getGroundTruthS3Input() {
        return this.groundTruthS3Input;
    }

    /**
     * <p>
     * Location of ground truth labels to use in model bias job.
     * </p>
     * 
     * @param groundTruthS3Input
     *        Location of ground truth labels to use in model bias job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelBiasJobInput withGroundTruthS3Input(MonitoringGroundTruthS3Input groundTruthS3Input) {
        setGroundTruthS3Input(groundTruthS3Input);
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
        if (getEndpointInput() != null)
            sb.append("EndpointInput: ").append(getEndpointInput()).append(",");
        if (getGroundTruthS3Input() != null)
            sb.append("GroundTruthS3Input: ").append(getGroundTruthS3Input());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelBiasJobInput == false)
            return false;
        ModelBiasJobInput other = (ModelBiasJobInput) obj;
        if (other.getEndpointInput() == null ^ this.getEndpointInput() == null)
            return false;
        if (other.getEndpointInput() != null && other.getEndpointInput().equals(this.getEndpointInput()) == false)
            return false;
        if (other.getGroundTruthS3Input() == null ^ this.getGroundTruthS3Input() == null)
            return false;
        if (other.getGroundTruthS3Input() != null && other.getGroundTruthS3Input().equals(this.getGroundTruthS3Input()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointInput() == null) ? 0 : getEndpointInput().hashCode());
        hashCode = prime * hashCode + ((getGroundTruthS3Input() == null) ? 0 : getGroundTruthS3Input().hashCode());
        return hashCode;
    }

    @Override
    public ModelBiasJobInput clone() {
        try {
            return (ModelBiasJobInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelBiasJobInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
