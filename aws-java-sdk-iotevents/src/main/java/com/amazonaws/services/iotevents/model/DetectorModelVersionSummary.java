/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the detector model version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DetectorModelVersionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorModelVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the detector model.
     * </p>
     */
    private String detectorModelName;
    /**
     * <p>
     * The ID of the detector model version.
     * </p>
     */
    private String detectorModelVersion;
    /**
     * <p>
     * The ARN of the detector model version.
     * </p>
     */
    private String detectorModelArn;
    /**
     * <p>
     * The ARN of the role that grants the detector model permission to perform its tasks.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The time the detector model version was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the detector model version was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The status of the detector model version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     */
    private String evaluationMethod;

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model.
     */

    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * 
     * @return The name of the detector model.
     */

    public String getDetectorModelName() {
        return this.detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelVersionSummary withDetectorModelName(String detectorModelName) {
        setDetectorModelName(detectorModelName);
        return this;
    }

    /**
     * <p>
     * The ID of the detector model version.
     * </p>
     * 
     * @param detectorModelVersion
     *        The ID of the detector model version.
     */

    public void setDetectorModelVersion(String detectorModelVersion) {
        this.detectorModelVersion = detectorModelVersion;
    }

    /**
     * <p>
     * The ID of the detector model version.
     * </p>
     * 
     * @return The ID of the detector model version.
     */

    public String getDetectorModelVersion() {
        return this.detectorModelVersion;
    }

    /**
     * <p>
     * The ID of the detector model version.
     * </p>
     * 
     * @param detectorModelVersion
     *        The ID of the detector model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelVersionSummary withDetectorModelVersion(String detectorModelVersion) {
        setDetectorModelVersion(detectorModelVersion);
        return this;
    }

    /**
     * <p>
     * The ARN of the detector model version.
     * </p>
     * 
     * @param detectorModelArn
     *        The ARN of the detector model version.
     */

    public void setDetectorModelArn(String detectorModelArn) {
        this.detectorModelArn = detectorModelArn;
    }

    /**
     * <p>
     * The ARN of the detector model version.
     * </p>
     * 
     * @return The ARN of the detector model version.
     */

    public String getDetectorModelArn() {
        return this.detectorModelArn;
    }

    /**
     * <p>
     * The ARN of the detector model version.
     * </p>
     * 
     * @param detectorModelArn
     *        The ARN of the detector model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelVersionSummary withDetectorModelArn(String detectorModelArn) {
        setDetectorModelArn(detectorModelArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants the detector model permission to perform its tasks.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants the detector model permission to perform its tasks.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants the detector model permission to perform its tasks.
     * </p>
     * 
     * @return The ARN of the role that grants the detector model permission to perform its tasks.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants the detector model permission to perform its tasks.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants the detector model permission to perform its tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelVersionSummary withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The time the detector model version was created.
     * </p>
     * 
     * @param creationTime
     *        The time the detector model version was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the detector model version was created.
     * </p>
     * 
     * @return The time the detector model version was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the detector model version was created.
     * </p>
     * 
     * @param creationTime
     *        The time the detector model version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelVersionSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the detector model version was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the detector model version was updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time the detector model version was updated.
     * </p>
     * 
     * @return The last time the detector model version was updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last time the detector model version was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the detector model version was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelVersionSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * 
     * @param status
     *        The status of the detector model version.
     * @see DetectorModelVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * 
     * @return The status of the detector model version.
     * @see DetectorModelVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * 
     * @param status
     *        The status of the detector model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectorModelVersionStatus
     */

    public DetectorModelVersionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * 
     * @param status
     *        The status of the detector model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectorModelVersionStatus
     */

    public DetectorModelVersionSummary withStatus(DetectorModelVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     * 
     * @param evaluationMethod
     *        Information about the order in which events are evaluated and how actions are executed.
     * @see EvaluationMethod
     */

    public void setEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     * 
     * @return Information about the order in which events are evaluated and how actions are executed.
     * @see EvaluationMethod
     */

    public String getEvaluationMethod() {
        return this.evaluationMethod;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     * 
     * @param evaluationMethod
     *        Information about the order in which events are evaluated and how actions are executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMethod
     */

    public DetectorModelVersionSummary withEvaluationMethod(String evaluationMethod) {
        setEvaluationMethod(evaluationMethod);
        return this;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     * 
     * @param evaluationMethod
     *        Information about the order in which events are evaluated and how actions are executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMethod
     */

    public DetectorModelVersionSummary withEvaluationMethod(EvaluationMethod evaluationMethod) {
        this.evaluationMethod = evaluationMethod.toString();
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
        if (getDetectorModelName() != null)
            sb.append("DetectorModelName: ").append(getDetectorModelName()).append(",");
        if (getDetectorModelVersion() != null)
            sb.append("DetectorModelVersion: ").append(getDetectorModelVersion()).append(",");
        if (getDetectorModelArn() != null)
            sb.append("DetectorModelArn: ").append(getDetectorModelArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEvaluationMethod() != null)
            sb.append("EvaluationMethod: ").append(getEvaluationMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorModelVersionSummary == false)
            return false;
        DetectorModelVersionSummary other = (DetectorModelVersionSummary) obj;
        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getDetectorModelVersion() == null ^ this.getDetectorModelVersion() == null)
            return false;
        if (other.getDetectorModelVersion() != null && other.getDetectorModelVersion().equals(this.getDetectorModelVersion()) == false)
            return false;
        if (other.getDetectorModelArn() == null ^ this.getDetectorModelArn() == null)
            return false;
        if (other.getDetectorModelArn() != null && other.getDetectorModelArn().equals(this.getDetectorModelArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEvaluationMethod() == null ^ this.getEvaluationMethod() == null)
            return false;
        if (other.getEvaluationMethod() != null && other.getEvaluationMethod().equals(this.getEvaluationMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelVersion() == null) ? 0 : getDetectorModelVersion().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelArn() == null) ? 0 : getDetectorModelArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMethod() == null) ? 0 : getEvaluationMethod().hashCode());
        return hashCode;
    }

    @Override
    public DetectorModelVersionSummary clone() {
        try {
            return (DetectorModelVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.DetectorModelVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
