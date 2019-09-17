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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Combines the execution state and configuration of a step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/StepDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The step configuration.
     * </p>
     */
    private StepConfig stepConfig;
    /**
     * <p>
     * The description of the step status.
     * </p>
     */
    private StepExecutionStatusDetail executionStatusDetail;

    /**
     * Default constructor for StepDetail object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public StepDetail() {
    }

    /**
     * Constructs a new StepDetail object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param stepConfig
     *        The step configuration.
     * @param executionStatusDetail
     *        The description of the step status.
     */
    public StepDetail(StepConfig stepConfig, StepExecutionStatusDetail executionStatusDetail) {
        setStepConfig(stepConfig);
        setExecutionStatusDetail(executionStatusDetail);
    }

    /**
     * <p>
     * The step configuration.
     * </p>
     * 
     * @param stepConfig
     *        The step configuration.
     */

    public void setStepConfig(StepConfig stepConfig) {
        this.stepConfig = stepConfig;
    }

    /**
     * <p>
     * The step configuration.
     * </p>
     * 
     * @return The step configuration.
     */

    public StepConfig getStepConfig() {
        return this.stepConfig;
    }

    /**
     * <p>
     * The step configuration.
     * </p>
     * 
     * @param stepConfig
     *        The step configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepDetail withStepConfig(StepConfig stepConfig) {
        setStepConfig(stepConfig);
        return this;
    }

    /**
     * <p>
     * The description of the step status.
     * </p>
     * 
     * @param executionStatusDetail
     *        The description of the step status.
     */

    public void setExecutionStatusDetail(StepExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
    }

    /**
     * <p>
     * The description of the step status.
     * </p>
     * 
     * @return The description of the step status.
     */

    public StepExecutionStatusDetail getExecutionStatusDetail() {
        return this.executionStatusDetail;
    }

    /**
     * <p>
     * The description of the step status.
     * </p>
     * 
     * @param executionStatusDetail
     *        The description of the step status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepDetail withExecutionStatusDetail(StepExecutionStatusDetail executionStatusDetail) {
        setExecutionStatusDetail(executionStatusDetail);
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
        if (getStepConfig() != null)
            sb.append("StepConfig: ").append(getStepConfig()).append(",");
        if (getExecutionStatusDetail() != null)
            sb.append("ExecutionStatusDetail: ").append(getExecutionStatusDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepDetail == false)
            return false;
        StepDetail other = (StepDetail) obj;
        if (other.getStepConfig() == null ^ this.getStepConfig() == null)
            return false;
        if (other.getStepConfig() != null && other.getStepConfig().equals(this.getStepConfig()) == false)
            return false;
        if (other.getExecutionStatusDetail() == null ^ this.getExecutionStatusDetail() == null)
            return false;
        if (other.getExecutionStatusDetail() != null && other.getExecutionStatusDetail().equals(this.getExecutionStatusDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepConfig() == null) ? 0 : getStepConfig().hashCode());
        hashCode = prime * hashCode + ((getExecutionStatusDetail() == null) ? 0 : getExecutionStatusDetail().hashCode());
        return hashCode;
    }

    @Override
    public StepDetail clone() {
        try {
            return (StepDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.StepDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
