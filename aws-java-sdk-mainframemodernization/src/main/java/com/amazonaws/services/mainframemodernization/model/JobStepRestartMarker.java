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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides restart step information for the most recent restart operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/JobStepRestartMarker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobStepRestartMarker implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The procedure step name that a job was restarted from.
     * </p>
     */
    private String fromProcStep;
    /**
     * <p>
     * The step name that a batch job restart was from.
     * </p>
     */
    private String fromStep;
    /**
     * <p>
     * The procedure step name that a batch job was restarted to.
     * </p>
     */
    private String toProcStep;
    /**
     * <p>
     * The step name that a job was restarted to.
     * </p>
     */
    private String toStep;

    /**
     * <p>
     * The procedure step name that a job was restarted from.
     * </p>
     * 
     * @param fromProcStep
     *        The procedure step name that a job was restarted from.
     */

    public void setFromProcStep(String fromProcStep) {
        this.fromProcStep = fromProcStep;
    }

    /**
     * <p>
     * The procedure step name that a job was restarted from.
     * </p>
     * 
     * @return The procedure step name that a job was restarted from.
     */

    public String getFromProcStep() {
        return this.fromProcStep;
    }

    /**
     * <p>
     * The procedure step name that a job was restarted from.
     * </p>
     * 
     * @param fromProcStep
     *        The procedure step name that a job was restarted from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStepRestartMarker withFromProcStep(String fromProcStep) {
        setFromProcStep(fromProcStep);
        return this;
    }

    /**
     * <p>
     * The step name that a batch job restart was from.
     * </p>
     * 
     * @param fromStep
     *        The step name that a batch job restart was from.
     */

    public void setFromStep(String fromStep) {
        this.fromStep = fromStep;
    }

    /**
     * <p>
     * The step name that a batch job restart was from.
     * </p>
     * 
     * @return The step name that a batch job restart was from.
     */

    public String getFromStep() {
        return this.fromStep;
    }

    /**
     * <p>
     * The step name that a batch job restart was from.
     * </p>
     * 
     * @param fromStep
     *        The step name that a batch job restart was from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStepRestartMarker withFromStep(String fromStep) {
        setFromStep(fromStep);
        return this;
    }

    /**
     * <p>
     * The procedure step name that a batch job was restarted to.
     * </p>
     * 
     * @param toProcStep
     *        The procedure step name that a batch job was restarted to.
     */

    public void setToProcStep(String toProcStep) {
        this.toProcStep = toProcStep;
    }

    /**
     * <p>
     * The procedure step name that a batch job was restarted to.
     * </p>
     * 
     * @return The procedure step name that a batch job was restarted to.
     */

    public String getToProcStep() {
        return this.toProcStep;
    }

    /**
     * <p>
     * The procedure step name that a batch job was restarted to.
     * </p>
     * 
     * @param toProcStep
     *        The procedure step name that a batch job was restarted to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStepRestartMarker withToProcStep(String toProcStep) {
        setToProcStep(toProcStep);
        return this;
    }

    /**
     * <p>
     * The step name that a job was restarted to.
     * </p>
     * 
     * @param toStep
     *        The step name that a job was restarted to.
     */

    public void setToStep(String toStep) {
        this.toStep = toStep;
    }

    /**
     * <p>
     * The step name that a job was restarted to.
     * </p>
     * 
     * @return The step name that a job was restarted to.
     */

    public String getToStep() {
        return this.toStep;
    }

    /**
     * <p>
     * The step name that a job was restarted to.
     * </p>
     * 
     * @param toStep
     *        The step name that a job was restarted to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStepRestartMarker withToStep(String toStep) {
        setToStep(toStep);
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
        if (getFromProcStep() != null)
            sb.append("FromProcStep: ").append(getFromProcStep()).append(",");
        if (getFromStep() != null)
            sb.append("FromStep: ").append(getFromStep()).append(",");
        if (getToProcStep() != null)
            sb.append("ToProcStep: ").append(getToProcStep()).append(",");
        if (getToStep() != null)
            sb.append("ToStep: ").append(getToStep());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobStepRestartMarker == false)
            return false;
        JobStepRestartMarker other = (JobStepRestartMarker) obj;
        if (other.getFromProcStep() == null ^ this.getFromProcStep() == null)
            return false;
        if (other.getFromProcStep() != null && other.getFromProcStep().equals(this.getFromProcStep()) == false)
            return false;
        if (other.getFromStep() == null ^ this.getFromStep() == null)
            return false;
        if (other.getFromStep() != null && other.getFromStep().equals(this.getFromStep()) == false)
            return false;
        if (other.getToProcStep() == null ^ this.getToProcStep() == null)
            return false;
        if (other.getToProcStep() != null && other.getToProcStep().equals(this.getToProcStep()) == false)
            return false;
        if (other.getToStep() == null ^ this.getToStep() == null)
            return false;
        if (other.getToStep() != null && other.getToStep().equals(this.getToStep()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromProcStep() == null) ? 0 : getFromProcStep().hashCode());
        hashCode = prime * hashCode + ((getFromStep() == null) ? 0 : getFromStep().hashCode());
        hashCode = prime * hashCode + ((getToProcStep() == null) ? 0 : getToProcStep().hashCode());
        hashCode = prime * hashCode + ((getToStep() == null) ? 0 : getToStep().hashCode());
        return hashCode;
    }

    @Override
    public JobStepRestartMarker clone() {
        try {
            return (JobStepRestartMarker) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.JobStepRestartMarkerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
