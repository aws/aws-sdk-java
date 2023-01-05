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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configurations and outcomes of an Amazon EMR step execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EMRStepMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EMRStepMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the EMR cluster.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The identifier of the EMR cluster step.
     * </p>
     */
    private String stepId;
    /**
     * <p>
     * The name of the EMR cluster step.
     * </p>
     */
    private String stepName;
    /**
     * <p>
     * The path to the log file where the cluster step's failure root cause is recorded.
     * </p>
     */
    private String logFilePath;

    /**
     * <p>
     * The identifier of the EMR cluster.
     * </p>
     * 
     * @param clusterId
     *        The identifier of the EMR cluster.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier of the EMR cluster.
     * </p>
     * 
     * @return The identifier of the EMR cluster.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier of the EMR cluster.
     * </p>
     * 
     * @param clusterId
     *        The identifier of the EMR cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EMRStepMetadata withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The identifier of the EMR cluster step.
     * </p>
     * 
     * @param stepId
     *        The identifier of the EMR cluster step.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The identifier of the EMR cluster step.
     * </p>
     * 
     * @return The identifier of the EMR cluster step.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The identifier of the EMR cluster step.
     * </p>
     * 
     * @param stepId
     *        The identifier of the EMR cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EMRStepMetadata withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * <p>
     * The name of the EMR cluster step.
     * </p>
     * 
     * @param stepName
     *        The name of the EMR cluster step.
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The name of the EMR cluster step.
     * </p>
     * 
     * @return The name of the EMR cluster step.
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * The name of the EMR cluster step.
     * </p>
     * 
     * @param stepName
     *        The name of the EMR cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EMRStepMetadata withStepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    /**
     * <p>
     * The path to the log file where the cluster step's failure root cause is recorded.
     * </p>
     * 
     * @param logFilePath
     *        The path to the log file where the cluster step's failure root cause is recorded.
     */

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    /**
     * <p>
     * The path to the log file where the cluster step's failure root cause is recorded.
     * </p>
     * 
     * @return The path to the log file where the cluster step's failure root cause is recorded.
     */

    public String getLogFilePath() {
        return this.logFilePath;
    }

    /**
     * <p>
     * The path to the log file where the cluster step's failure root cause is recorded.
     * </p>
     * 
     * @param logFilePath
     *        The path to the log file where the cluster step's failure root cause is recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EMRStepMetadata withLogFilePath(String logFilePath) {
        setLogFilePath(logFilePath);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId()).append(",");
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName()).append(",");
        if (getLogFilePath() != null)
            sb.append("LogFilePath: ").append(getLogFilePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EMRStepMetadata == false)
            return false;
        EMRStepMetadata other = (EMRStepMetadata) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getLogFilePath() == null ^ this.getLogFilePath() == null)
            return false;
        if (other.getLogFilePath() != null && other.getLogFilePath().equals(this.getLogFilePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getLogFilePath() == null) ? 0 : getLogFilePath().hashCode());
        return hashCode;
    }

    @Override
    public EMRStepMetadata clone() {
        try {
            return (EMRStepMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EMRStepMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
