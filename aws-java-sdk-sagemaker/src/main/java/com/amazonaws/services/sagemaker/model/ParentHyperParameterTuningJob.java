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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A previously completed or stopped hyperparameter tuning job to be used as a starting point for a new hyperparameter
 * tuning job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ParentHyperParameterTuningJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParentHyperParameterTuningJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
     * </p>
     */
    private String hyperParameterTuningJobName;

    /**
     * <p>
     * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning
     *        job.
     */

    public void setHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
     * </p>
     * 
     * @return The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning
     *         job.
     */

    public String getHyperParameterTuningJobName() {
        return this.hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParentHyperParameterTuningJob withHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        setHyperParameterTuningJobName(hyperParameterTuningJobName);
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
        if (getHyperParameterTuningJobName() != null)
            sb.append("HyperParameterTuningJobName: ").append(getHyperParameterTuningJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParentHyperParameterTuningJob == false)
            return false;
        ParentHyperParameterTuningJob other = (ParentHyperParameterTuningJob) obj;
        if (other.getHyperParameterTuningJobName() == null ^ this.getHyperParameterTuningJobName() == null)
            return false;
        if (other.getHyperParameterTuningJobName() != null && other.getHyperParameterTuningJobName().equals(this.getHyperParameterTuningJobName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHyperParameterTuningJobName() == null) ? 0 : getHyperParameterTuningJobName().hashCode());
        return hashCode;
    }

    @Override
    public ParentHyperParameterTuningJob clone() {
        try {
            return (ParentHyperParameterTuningJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ParentHyperParameterTuningJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
