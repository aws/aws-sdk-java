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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The interaction or event that started a pipeline execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ExecutionTrigger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionTrigger implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of change-detection method, command, or user interaction that started a pipeline execution.
     * </p>
     */
    private String triggerType;
    /**
     * <p>
     * Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook that
     * triggered the pipeline execution or the user ARN for a user-initiated <code>start-pipeline-execution</code> CLI
     * command.
     * </p>
     */
    private String triggerDetail;

    /**
     * <p>
     * The type of change-detection method, command, or user interaction that started a pipeline execution.
     * </p>
     * 
     * @param triggerType
     *        The type of change-detection method, command, or user interaction that started a pipeline execution.
     * @see TriggerType
     */

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    /**
     * <p>
     * The type of change-detection method, command, or user interaction that started a pipeline execution.
     * </p>
     * 
     * @return The type of change-detection method, command, or user interaction that started a pipeline execution.
     * @see TriggerType
     */

    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * <p>
     * The type of change-detection method, command, or user interaction that started a pipeline execution.
     * </p>
     * 
     * @param triggerType
     *        The type of change-detection method, command, or user interaction that started a pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public ExecutionTrigger withTriggerType(String triggerType) {
        setTriggerType(triggerType);
        return this;
    }

    /**
     * <p>
     * The type of change-detection method, command, or user interaction that started a pipeline execution.
     * </p>
     * 
     * @param triggerType
     *        The type of change-detection method, command, or user interaction that started a pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public ExecutionTrigger withTriggerType(TriggerType triggerType) {
        this.triggerType = triggerType.toString();
        return this;
    }

    /**
     * <p>
     * Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook that
     * triggered the pipeline execution or the user ARN for a user-initiated <code>start-pipeline-execution</code> CLI
     * command.
     * </p>
     * 
     * @param triggerDetail
     *        Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook that
     *        triggered the pipeline execution or the user ARN for a user-initiated
     *        <code>start-pipeline-execution</code> CLI command.
     */

    public void setTriggerDetail(String triggerDetail) {
        this.triggerDetail = triggerDetail;
    }

    /**
     * <p>
     * Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook that
     * triggered the pipeline execution or the user ARN for a user-initiated <code>start-pipeline-execution</code> CLI
     * command.
     * </p>
     * 
     * @return Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook
     *         that triggered the pipeline execution or the user ARN for a user-initiated
     *         <code>start-pipeline-execution</code> CLI command.
     */

    public String getTriggerDetail() {
        return this.triggerDetail;
    }

    /**
     * <p>
     * Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook that
     * triggered the pipeline execution or the user ARN for a user-initiated <code>start-pipeline-execution</code> CLI
     * command.
     * </p>
     * 
     * @param triggerDetail
     *        Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook that
     *        triggered the pipeline execution or the user ARN for a user-initiated
     *        <code>start-pipeline-execution</code> CLI command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionTrigger withTriggerDetail(String triggerDetail) {
        setTriggerDetail(triggerDetail);
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
        if (getTriggerType() != null)
            sb.append("TriggerType: ").append(getTriggerType()).append(",");
        if (getTriggerDetail() != null)
            sb.append("TriggerDetail: ").append(getTriggerDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionTrigger == false)
            return false;
        ExecutionTrigger other = (ExecutionTrigger) obj;
        if (other.getTriggerType() == null ^ this.getTriggerType() == null)
            return false;
        if (other.getTriggerType() != null && other.getTriggerType().equals(this.getTriggerType()) == false)
            return false;
        if (other.getTriggerDetail() == null ^ this.getTriggerDetail() == null)
            return false;
        if (other.getTriggerDetail() != null && other.getTriggerDetail().equals(this.getTriggerDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTriggerType() == null) ? 0 : getTriggerType().hashCode());
        hashCode = prime * hashCode + ((getTriggerDetail() == null) ? 0 : getTriggerDetail().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionTrigger clone() {
        try {
            return (ExecutionTrigger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ExecutionTriggerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
