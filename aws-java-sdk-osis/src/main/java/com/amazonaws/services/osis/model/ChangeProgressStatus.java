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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The progress details of a pipeline configuration change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ChangeProgressStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeProgressStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time at which the configuration change is made on the pipeline.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The overall status of the pipeline configuration change.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The total number of stages required for the pipeline configuration change.
     * </p>
     */
    private Integer totalNumberOfStages;
    /**
     * <p>
     * Information about the stages that the pipeline is going through to perform the configuration change.
     * </p>
     */
    private java.util.List<ChangeProgressStage> changeProgressStages;

    /**
     * <p>
     * The time at which the configuration change is made on the pipeline.
     * </p>
     * 
     * @param startTime
     *        The time at which the configuration change is made on the pipeline.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the configuration change is made on the pipeline.
     * </p>
     * 
     * @return The time at which the configuration change is made on the pipeline.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which the configuration change is made on the pipeline.
     * </p>
     * 
     * @param startTime
     *        The time at which the configuration change is made on the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatus withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The overall status of the pipeline configuration change.
     * </p>
     * 
     * @param status
     *        The overall status of the pipeline configuration change.
     * @see ChangeProgressStatuses
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The overall status of the pipeline configuration change.
     * </p>
     * 
     * @return The overall status of the pipeline configuration change.
     * @see ChangeProgressStatuses
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The overall status of the pipeline configuration change.
     * </p>
     * 
     * @param status
     *        The overall status of the pipeline configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeProgressStatuses
     */

    public ChangeProgressStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The overall status of the pipeline configuration change.
     * </p>
     * 
     * @param status
     *        The overall status of the pipeline configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeProgressStatuses
     */

    public ChangeProgressStatus withStatus(ChangeProgressStatuses status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The total number of stages required for the pipeline configuration change.
     * </p>
     * 
     * @param totalNumberOfStages
     *        The total number of stages required for the pipeline configuration change.
     */

    public void setTotalNumberOfStages(Integer totalNumberOfStages) {
        this.totalNumberOfStages = totalNumberOfStages;
    }

    /**
     * <p>
     * The total number of stages required for the pipeline configuration change.
     * </p>
     * 
     * @return The total number of stages required for the pipeline configuration change.
     */

    public Integer getTotalNumberOfStages() {
        return this.totalNumberOfStages;
    }

    /**
     * <p>
     * The total number of stages required for the pipeline configuration change.
     * </p>
     * 
     * @param totalNumberOfStages
     *        The total number of stages required for the pipeline configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatus withTotalNumberOfStages(Integer totalNumberOfStages) {
        setTotalNumberOfStages(totalNumberOfStages);
        return this;
    }

    /**
     * <p>
     * Information about the stages that the pipeline is going through to perform the configuration change.
     * </p>
     * 
     * @return Information about the stages that the pipeline is going through to perform the configuration change.
     */

    public java.util.List<ChangeProgressStage> getChangeProgressStages() {
        return changeProgressStages;
    }

    /**
     * <p>
     * Information about the stages that the pipeline is going through to perform the configuration change.
     * </p>
     * 
     * @param changeProgressStages
     *        Information about the stages that the pipeline is going through to perform the configuration change.
     */

    public void setChangeProgressStages(java.util.Collection<ChangeProgressStage> changeProgressStages) {
        if (changeProgressStages == null) {
            this.changeProgressStages = null;
            return;
        }

        this.changeProgressStages = new java.util.ArrayList<ChangeProgressStage>(changeProgressStages);
    }

    /**
     * <p>
     * Information about the stages that the pipeline is going through to perform the configuration change.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeProgressStages(java.util.Collection)} or {@link #withChangeProgressStages(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param changeProgressStages
     *        Information about the stages that the pipeline is going through to perform the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatus withChangeProgressStages(ChangeProgressStage... changeProgressStages) {
        if (this.changeProgressStages == null) {
            setChangeProgressStages(new java.util.ArrayList<ChangeProgressStage>(changeProgressStages.length));
        }
        for (ChangeProgressStage ele : changeProgressStages) {
            this.changeProgressStages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the stages that the pipeline is going through to perform the configuration change.
     * </p>
     * 
     * @param changeProgressStages
     *        Information about the stages that the pipeline is going through to perform the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatus withChangeProgressStages(java.util.Collection<ChangeProgressStage> changeProgressStages) {
        setChangeProgressStages(changeProgressStages);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTotalNumberOfStages() != null)
            sb.append("TotalNumberOfStages: ").append(getTotalNumberOfStages()).append(",");
        if (getChangeProgressStages() != null)
            sb.append("ChangeProgressStages: ").append(getChangeProgressStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeProgressStatus == false)
            return false;
        ChangeProgressStatus other = (ChangeProgressStatus) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTotalNumberOfStages() == null ^ this.getTotalNumberOfStages() == null)
            return false;
        if (other.getTotalNumberOfStages() != null && other.getTotalNumberOfStages().equals(this.getTotalNumberOfStages()) == false)
            return false;
        if (other.getChangeProgressStages() == null ^ this.getChangeProgressStages() == null)
            return false;
        if (other.getChangeProgressStages() != null && other.getChangeProgressStages().equals(this.getChangeProgressStages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfStages() == null) ? 0 : getTotalNumberOfStages().hashCode());
        hashCode = prime * hashCode + ((getChangeProgressStages() == null) ? 0 : getChangeProgressStages().hashCode());
        return hashCode;
    }

    @Override
    public ChangeProgressStatus clone() {
        try {
            return (ChangeProgressStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.osis.model.transform.ChangeProgressStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
