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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns status details of an evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/EvaluationStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of an execution. The valid values are In_Progress, Succeeded or Failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An explanation for failed execution status.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The status of an execution. The valid values are In_Progress, Succeeded or Failed.
     * </p>
     * 
     * @param status
     *        The status of an execution. The valid values are In_Progress, Succeeded or Failed.
     * @see ResourceEvaluationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an execution. The valid values are In_Progress, Succeeded or Failed.
     * </p>
     * 
     * @return The status of an execution. The valid values are In_Progress, Succeeded or Failed.
     * @see ResourceEvaluationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an execution. The valid values are In_Progress, Succeeded or Failed.
     * </p>
     * 
     * @param status
     *        The status of an execution. The valid values are In_Progress, Succeeded or Failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceEvaluationStatus
     */

    public EvaluationStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of an execution. The valid values are In_Progress, Succeeded or Failed.
     * </p>
     * 
     * @param status
     *        The status of an execution. The valid values are In_Progress, Succeeded or Failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceEvaluationStatus
     */

    public EvaluationStatus withStatus(ResourceEvaluationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An explanation for failed execution status.
     * </p>
     * 
     * @param failureReason
     *        An explanation for failed execution status.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * An explanation for failed execution status.
     * </p>
     * 
     * @return An explanation for failed execution status.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * An explanation for failed execution status.
     * </p>
     * 
     * @param failureReason
     *        An explanation for failed execution status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationStatus withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationStatus == false)
            return false;
        EvaluationStatus other = (EvaluationStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationStatus clone() {
        try {
            return (EvaluationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.EvaluationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
