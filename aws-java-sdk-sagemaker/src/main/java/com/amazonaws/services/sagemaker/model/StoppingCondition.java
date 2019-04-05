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
 * Specifies how long model training can run. When model training reaches the limit, Amazon SageMaker ends the training
 * job. Use this API to cap model training cost.
 * </p>
 * <p>
 * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which delays job termination
 * for120 seconds. Algorithms might use this 120-second window to save the model artifacts, so the results of training
 * is not lost.
 * </p>
 * <p>
 * Training algorithms provided by Amazon SageMaker automatically saves the intermediate results of a model training job
 * (it is best effort case, as model might not be ready to save as some stages, for example training just started). This
 * intermediate data is a valid model artifact. You can use it to create a model (<code>CreateModel</code>).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StoppingCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StoppingCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum length of time, in seconds, that the training job can run. If model training does not complete during
     * this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. Maximum value is 28
     * days.
     * </p>
     */
    private Integer maxRuntimeInSeconds;

    /**
     * <p>
     * The maximum length of time, in seconds, that the training job can run. If model training does not complete during
     * this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. Maximum value is 28
     * days.
     * </p>
     * 
     * @param maxRuntimeInSeconds
     *        The maximum length of time, in seconds, that the training job can run. If model training does not complete
     *        during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day.
     *        Maximum value is 28 days.
     */

    public void setMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = maxRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum length of time, in seconds, that the training job can run. If model training does not complete during
     * this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. Maximum value is 28
     * days.
     * </p>
     * 
     * @return The maximum length of time, in seconds, that the training job can run. If model training does not
     *         complete during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1
     *         day. Maximum value is 28 days.
     */

    public Integer getMaxRuntimeInSeconds() {
        return this.maxRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum length of time, in seconds, that the training job can run. If model training does not complete during
     * this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. Maximum value is 28
     * days.
     * </p>
     * 
     * @param maxRuntimeInSeconds
     *        The maximum length of time, in seconds, that the training job can run. If model training does not complete
     *        during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day.
     *        Maximum value is 28 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoppingCondition withMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        setMaxRuntimeInSeconds(maxRuntimeInSeconds);
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
        if (getMaxRuntimeInSeconds() != null)
            sb.append("MaxRuntimeInSeconds: ").append(getMaxRuntimeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StoppingCondition == false)
            return false;
        StoppingCondition other = (StoppingCondition) obj;
        if (other.getMaxRuntimeInSeconds() == null ^ this.getMaxRuntimeInSeconds() == null)
            return false;
        if (other.getMaxRuntimeInSeconds() != null && other.getMaxRuntimeInSeconds().equals(this.getMaxRuntimeInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxRuntimeInSeconds() == null) ? 0 : getMaxRuntimeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public StoppingCondition clone() {
        try {
            return (StoppingCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.StoppingConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
