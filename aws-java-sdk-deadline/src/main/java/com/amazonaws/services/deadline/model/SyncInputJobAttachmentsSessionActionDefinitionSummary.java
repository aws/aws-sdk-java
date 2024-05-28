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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a synced job attachment.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SyncInputJobAttachmentsSessionActionDefinitionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncInputJobAttachmentsSessionActionDefinitionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The step ID of the step in the job attachment.
     * </p>
     */
    private String stepId;

    /**
     * <p>
     * The step ID of the step in the job attachment.
     * </p>
     * 
     * @param stepId
     *        The step ID of the step in the job attachment.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The step ID of the step in the job attachment.
     * </p>
     * 
     * @return The step ID of the step in the job attachment.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The step ID of the step in the job attachment.
     * </p>
     * 
     * @param stepId
     *        The step ID of the step in the job attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncInputJobAttachmentsSessionActionDefinitionSummary withStepId(String stepId) {
        setStepId(stepId);
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
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyncInputJobAttachmentsSessionActionDefinitionSummary == false)
            return false;
        SyncInputJobAttachmentsSessionActionDefinitionSummary other = (SyncInputJobAttachmentsSessionActionDefinitionSummary) obj;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        return hashCode;
    }

    @Override
    public SyncInputJobAttachmentsSessionActionDefinitionSummary clone() {
        try {
            return (SyncInputJobAttachmentsSessionActionDefinitionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.SyncInputJobAttachmentsSessionActionDefinitionSummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
