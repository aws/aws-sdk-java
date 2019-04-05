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
 * Provides a breakdown of the number of objects labeled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelCounters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelCounters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of objects labeled.
     * </p>
     */
    private Integer totalLabeled;
    /**
     * <p>
     * The total number of objects labeled by a human worker.
     * </p>
     */
    private Integer humanLabeled;
    /**
     * <p>
     * The total number of objects labeled by automated data labeling.
     * </p>
     */
    private Integer machineLabeled;
    /**
     * <p>
     * The total number of objects that could not be labeled due to an error.
     * </p>
     */
    private Integer failedNonRetryableError;
    /**
     * <p>
     * The total number of objects not yet labeled.
     * </p>
     */
    private Integer unlabeled;

    /**
     * <p>
     * The total number of objects labeled.
     * </p>
     * 
     * @param totalLabeled
     *        The total number of objects labeled.
     */

    public void setTotalLabeled(Integer totalLabeled) {
        this.totalLabeled = totalLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled.
     * </p>
     * 
     * @return The total number of objects labeled.
     */

    public Integer getTotalLabeled() {
        return this.totalLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled.
     * </p>
     * 
     * @param totalLabeled
     *        The total number of objects labeled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelCounters withTotalLabeled(Integer totalLabeled) {
        setTotalLabeled(totalLabeled);
        return this;
    }

    /**
     * <p>
     * The total number of objects labeled by a human worker.
     * </p>
     * 
     * @param humanLabeled
     *        The total number of objects labeled by a human worker.
     */

    public void setHumanLabeled(Integer humanLabeled) {
        this.humanLabeled = humanLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled by a human worker.
     * </p>
     * 
     * @return The total number of objects labeled by a human worker.
     */

    public Integer getHumanLabeled() {
        return this.humanLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled by a human worker.
     * </p>
     * 
     * @param humanLabeled
     *        The total number of objects labeled by a human worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelCounters withHumanLabeled(Integer humanLabeled) {
        setHumanLabeled(humanLabeled);
        return this;
    }

    /**
     * <p>
     * The total number of objects labeled by automated data labeling.
     * </p>
     * 
     * @param machineLabeled
     *        The total number of objects labeled by automated data labeling.
     */

    public void setMachineLabeled(Integer machineLabeled) {
        this.machineLabeled = machineLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled by automated data labeling.
     * </p>
     * 
     * @return The total number of objects labeled by automated data labeling.
     */

    public Integer getMachineLabeled() {
        return this.machineLabeled;
    }

    /**
     * <p>
     * The total number of objects labeled by automated data labeling.
     * </p>
     * 
     * @param machineLabeled
     *        The total number of objects labeled by automated data labeling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelCounters withMachineLabeled(Integer machineLabeled) {
        setMachineLabeled(machineLabeled);
        return this;
    }

    /**
     * <p>
     * The total number of objects that could not be labeled due to an error.
     * </p>
     * 
     * @param failedNonRetryableError
     *        The total number of objects that could not be labeled due to an error.
     */

    public void setFailedNonRetryableError(Integer failedNonRetryableError) {
        this.failedNonRetryableError = failedNonRetryableError;
    }

    /**
     * <p>
     * The total number of objects that could not be labeled due to an error.
     * </p>
     * 
     * @return The total number of objects that could not be labeled due to an error.
     */

    public Integer getFailedNonRetryableError() {
        return this.failedNonRetryableError;
    }

    /**
     * <p>
     * The total number of objects that could not be labeled due to an error.
     * </p>
     * 
     * @param failedNonRetryableError
     *        The total number of objects that could not be labeled due to an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelCounters withFailedNonRetryableError(Integer failedNonRetryableError) {
        setFailedNonRetryableError(failedNonRetryableError);
        return this;
    }

    /**
     * <p>
     * The total number of objects not yet labeled.
     * </p>
     * 
     * @param unlabeled
     *        The total number of objects not yet labeled.
     */

    public void setUnlabeled(Integer unlabeled) {
        this.unlabeled = unlabeled;
    }

    /**
     * <p>
     * The total number of objects not yet labeled.
     * </p>
     * 
     * @return The total number of objects not yet labeled.
     */

    public Integer getUnlabeled() {
        return this.unlabeled;
    }

    /**
     * <p>
     * The total number of objects not yet labeled.
     * </p>
     * 
     * @param unlabeled
     *        The total number of objects not yet labeled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelCounters withUnlabeled(Integer unlabeled) {
        setUnlabeled(unlabeled);
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
        if (getTotalLabeled() != null)
            sb.append("TotalLabeled: ").append(getTotalLabeled()).append(",");
        if (getHumanLabeled() != null)
            sb.append("HumanLabeled: ").append(getHumanLabeled()).append(",");
        if (getMachineLabeled() != null)
            sb.append("MachineLabeled: ").append(getMachineLabeled()).append(",");
        if (getFailedNonRetryableError() != null)
            sb.append("FailedNonRetryableError: ").append(getFailedNonRetryableError()).append(",");
        if (getUnlabeled() != null)
            sb.append("Unlabeled: ").append(getUnlabeled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelCounters == false)
            return false;
        LabelCounters other = (LabelCounters) obj;
        if (other.getTotalLabeled() == null ^ this.getTotalLabeled() == null)
            return false;
        if (other.getTotalLabeled() != null && other.getTotalLabeled().equals(this.getTotalLabeled()) == false)
            return false;
        if (other.getHumanLabeled() == null ^ this.getHumanLabeled() == null)
            return false;
        if (other.getHumanLabeled() != null && other.getHumanLabeled().equals(this.getHumanLabeled()) == false)
            return false;
        if (other.getMachineLabeled() == null ^ this.getMachineLabeled() == null)
            return false;
        if (other.getMachineLabeled() != null && other.getMachineLabeled().equals(this.getMachineLabeled()) == false)
            return false;
        if (other.getFailedNonRetryableError() == null ^ this.getFailedNonRetryableError() == null)
            return false;
        if (other.getFailedNonRetryableError() != null && other.getFailedNonRetryableError().equals(this.getFailedNonRetryableError()) == false)
            return false;
        if (other.getUnlabeled() == null ^ this.getUnlabeled() == null)
            return false;
        if (other.getUnlabeled() != null && other.getUnlabeled().equals(this.getUnlabeled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalLabeled() == null) ? 0 : getTotalLabeled().hashCode());
        hashCode = prime * hashCode + ((getHumanLabeled() == null) ? 0 : getHumanLabeled().hashCode());
        hashCode = prime * hashCode + ((getMachineLabeled() == null) ? 0 : getMachineLabeled().hashCode());
        hashCode = prime * hashCode + ((getFailedNonRetryableError() == null) ? 0 : getFailedNonRetryableError().hashCode());
        hashCode = prime * hashCode + ((getUnlabeled() == null) ? 0 : getUnlabeled().hashCode());
        return hashCode;
    }

    @Override
    public LabelCounters clone() {
        try {
            return (LabelCounters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelCountersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
