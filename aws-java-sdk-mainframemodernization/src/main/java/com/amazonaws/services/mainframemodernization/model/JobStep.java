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
 * Provides information related to a job step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/JobStep" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a procedure step.
     * </p>
     */
    private String procStepName;
    /**
     * <p>
     * The number of a procedure step.
     * </p>
     */
    private Integer procStepNumber;
    /**
     * <p>
     * The condition code of a step.
     * </p>
     */
    private String stepCondCode;
    /**
     * <p>
     * The name of a step.
     * </p>
     */
    private String stepName;
    /**
     * <p>
     * The number of a step.
     * </p>
     */
    private Integer stepNumber;
    /**
     * <p>
     * Specifies if a step can be restarted or not.
     * </p>
     */
    private Boolean stepRestartable;

    /**
     * <p>
     * The name of a procedure step.
     * </p>
     * 
     * @param procStepName
     *        The name of a procedure step.
     */

    public void setProcStepName(String procStepName) {
        this.procStepName = procStepName;
    }

    /**
     * <p>
     * The name of a procedure step.
     * </p>
     * 
     * @return The name of a procedure step.
     */

    public String getProcStepName() {
        return this.procStepName;
    }

    /**
     * <p>
     * The name of a procedure step.
     * </p>
     * 
     * @param procStepName
     *        The name of a procedure step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStep withProcStepName(String procStepName) {
        setProcStepName(procStepName);
        return this;
    }

    /**
     * <p>
     * The number of a procedure step.
     * </p>
     * 
     * @param procStepNumber
     *        The number of a procedure step.
     */

    public void setProcStepNumber(Integer procStepNumber) {
        this.procStepNumber = procStepNumber;
    }

    /**
     * <p>
     * The number of a procedure step.
     * </p>
     * 
     * @return The number of a procedure step.
     */

    public Integer getProcStepNumber() {
        return this.procStepNumber;
    }

    /**
     * <p>
     * The number of a procedure step.
     * </p>
     * 
     * @param procStepNumber
     *        The number of a procedure step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStep withProcStepNumber(Integer procStepNumber) {
        setProcStepNumber(procStepNumber);
        return this;
    }

    /**
     * <p>
     * The condition code of a step.
     * </p>
     * 
     * @param stepCondCode
     *        The condition code of a step.
     */

    public void setStepCondCode(String stepCondCode) {
        this.stepCondCode = stepCondCode;
    }

    /**
     * <p>
     * The condition code of a step.
     * </p>
     * 
     * @return The condition code of a step.
     */

    public String getStepCondCode() {
        return this.stepCondCode;
    }

    /**
     * <p>
     * The condition code of a step.
     * </p>
     * 
     * @param stepCondCode
     *        The condition code of a step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStep withStepCondCode(String stepCondCode) {
        setStepCondCode(stepCondCode);
        return this;
    }

    /**
     * <p>
     * The name of a step.
     * </p>
     * 
     * @param stepName
     *        The name of a step.
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The name of a step.
     * </p>
     * 
     * @return The name of a step.
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * The name of a step.
     * </p>
     * 
     * @param stepName
     *        The name of a step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStep withStepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    /**
     * <p>
     * The number of a step.
     * </p>
     * 
     * @param stepNumber
     *        The number of a step.
     */

    public void setStepNumber(Integer stepNumber) {
        this.stepNumber = stepNumber;
    }

    /**
     * <p>
     * The number of a step.
     * </p>
     * 
     * @return The number of a step.
     */

    public Integer getStepNumber() {
        return this.stepNumber;
    }

    /**
     * <p>
     * The number of a step.
     * </p>
     * 
     * @param stepNumber
     *        The number of a step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStep withStepNumber(Integer stepNumber) {
        setStepNumber(stepNumber);
        return this;
    }

    /**
     * <p>
     * Specifies if a step can be restarted or not.
     * </p>
     * 
     * @param stepRestartable
     *        Specifies if a step can be restarted or not.
     */

    public void setStepRestartable(Boolean stepRestartable) {
        this.stepRestartable = stepRestartable;
    }

    /**
     * <p>
     * Specifies if a step can be restarted or not.
     * </p>
     * 
     * @return Specifies if a step can be restarted or not.
     */

    public Boolean getStepRestartable() {
        return this.stepRestartable;
    }

    /**
     * <p>
     * Specifies if a step can be restarted or not.
     * </p>
     * 
     * @param stepRestartable
     *        Specifies if a step can be restarted or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStep withStepRestartable(Boolean stepRestartable) {
        setStepRestartable(stepRestartable);
        return this;
    }

    /**
     * <p>
     * Specifies if a step can be restarted or not.
     * </p>
     * 
     * @return Specifies if a step can be restarted or not.
     */

    public Boolean isStepRestartable() {
        return this.stepRestartable;
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
        if (getProcStepName() != null)
            sb.append("ProcStepName: ").append(getProcStepName()).append(",");
        if (getProcStepNumber() != null)
            sb.append("ProcStepNumber: ").append(getProcStepNumber()).append(",");
        if (getStepCondCode() != null)
            sb.append("StepCondCode: ").append(getStepCondCode()).append(",");
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName()).append(",");
        if (getStepNumber() != null)
            sb.append("StepNumber: ").append(getStepNumber()).append(",");
        if (getStepRestartable() != null)
            sb.append("StepRestartable: ").append(getStepRestartable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobStep == false)
            return false;
        JobStep other = (JobStep) obj;
        if (other.getProcStepName() == null ^ this.getProcStepName() == null)
            return false;
        if (other.getProcStepName() != null && other.getProcStepName().equals(this.getProcStepName()) == false)
            return false;
        if (other.getProcStepNumber() == null ^ this.getProcStepNumber() == null)
            return false;
        if (other.getProcStepNumber() != null && other.getProcStepNumber().equals(this.getProcStepNumber()) == false)
            return false;
        if (other.getStepCondCode() == null ^ this.getStepCondCode() == null)
            return false;
        if (other.getStepCondCode() != null && other.getStepCondCode().equals(this.getStepCondCode()) == false)
            return false;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getStepNumber() == null ^ this.getStepNumber() == null)
            return false;
        if (other.getStepNumber() != null && other.getStepNumber().equals(this.getStepNumber()) == false)
            return false;
        if (other.getStepRestartable() == null ^ this.getStepRestartable() == null)
            return false;
        if (other.getStepRestartable() != null && other.getStepRestartable().equals(this.getStepRestartable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcStepName() == null) ? 0 : getProcStepName().hashCode());
        hashCode = prime * hashCode + ((getProcStepNumber() == null) ? 0 : getProcStepNumber().hashCode());
        hashCode = prime * hashCode + ((getStepCondCode() == null) ? 0 : getStepCondCode().hashCode());
        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getStepNumber() == null) ? 0 : getStepNumber().hashCode());
        hashCode = prime * hashCode + ((getStepRestartable() == null) ? 0 : getStepRestartable().hashCode());
        return hashCode;
    }

    @Override
    public JobStep clone() {
        try {
            return (JobStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.JobStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
