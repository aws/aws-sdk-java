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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The flywheel properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/FlywheelProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlywheelProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel.
     * </p>
     */
    private String flywheelArn;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     */
    private String activeModelArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel
     * data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * Configuration about the model associated with a flywheel.
     * </p>
     */
    private TaskConfig taskConfig;
    /**
     * <p>
     * Amazon S3 URI of the data lake location.
     * </p>
     */
    private String dataLakeS3Uri;
    /**
     * <p>
     * Data security configuration.
     * </p>
     */
    private DataSecurityConfig dataSecurityConfig;
    /**
     * <p>
     * The status of the flywheel.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     */
    private String modelType;
    /**
     * <p>
     * A description of the status of the flywheel.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Creation time of the flywheel.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Last modified time for the flywheel.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The most recent flywheel iteration.
     * </p>
     */
    private String latestFlywheelIteration;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel.
     */

    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the flywheel.
     */

    public String getFlywheelArn() {
        return this.flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withFlywheelArn(String flywheelArn) {
        setFlywheelArn(flywheelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     * 
     * @param activeModelArn
     *        The Amazon Resource Number (ARN) of the active model version.
     */

    public void setActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the active model version.
     */

    public String getActiveModelArn() {
        return this.activeModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     * 
     * @param activeModelArn
     *        The Amazon Resource Number (ARN) of the active model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withActiveModelArn(String activeModelArn) {
        setActiveModelArn(activeModelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel
     * data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the
     *        flywheel data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel
     * data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the
     *         flywheel data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel
     * data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the
     *        flywheel data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Configuration about the model associated with a flywheel.
     * </p>
     * 
     * @param taskConfig
     *        Configuration about the model associated with a flywheel.
     */

    public void setTaskConfig(TaskConfig taskConfig) {
        this.taskConfig = taskConfig;
    }

    /**
     * <p>
     * Configuration about the model associated with a flywheel.
     * </p>
     * 
     * @return Configuration about the model associated with a flywheel.
     */

    public TaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    /**
     * <p>
     * Configuration about the model associated with a flywheel.
     * </p>
     * 
     * @param taskConfig
     *        Configuration about the model associated with a flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withTaskConfig(TaskConfig taskConfig) {
        setTaskConfig(taskConfig);
        return this;
    }

    /**
     * <p>
     * Amazon S3 URI of the data lake location.
     * </p>
     * 
     * @param dataLakeS3Uri
     *        Amazon S3 URI of the data lake location.
     */

    public void setDataLakeS3Uri(String dataLakeS3Uri) {
        this.dataLakeS3Uri = dataLakeS3Uri;
    }

    /**
     * <p>
     * Amazon S3 URI of the data lake location.
     * </p>
     * 
     * @return Amazon S3 URI of the data lake location.
     */

    public String getDataLakeS3Uri() {
        return this.dataLakeS3Uri;
    }

    /**
     * <p>
     * Amazon S3 URI of the data lake location.
     * </p>
     * 
     * @param dataLakeS3Uri
     *        Amazon S3 URI of the data lake location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withDataLakeS3Uri(String dataLakeS3Uri) {
        setDataLakeS3Uri(dataLakeS3Uri);
        return this;
    }

    /**
     * <p>
     * Data security configuration.
     * </p>
     * 
     * @param dataSecurityConfig
     *        Data security configuration.
     */

    public void setDataSecurityConfig(DataSecurityConfig dataSecurityConfig) {
        this.dataSecurityConfig = dataSecurityConfig;
    }

    /**
     * <p>
     * Data security configuration.
     * </p>
     * 
     * @return Data security configuration.
     */

    public DataSecurityConfig getDataSecurityConfig() {
        return this.dataSecurityConfig;
    }

    /**
     * <p>
     * Data security configuration.
     * </p>
     * 
     * @param dataSecurityConfig
     *        Data security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withDataSecurityConfig(DataSecurityConfig dataSecurityConfig) {
        setDataSecurityConfig(dataSecurityConfig);
        return this;
    }

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * 
     * @param status
     *        The status of the flywheel.
     * @see FlywheelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * 
     * @return The status of the flywheel.
     * @see FlywheelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * 
     * @param status
     *        The status of the flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlywheelStatus
     */

    public FlywheelProperties withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the flywheel.
     * </p>
     * 
     * @param status
     *        The status of the flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlywheelStatus
     */

    public FlywheelProperties withStatus(FlywheelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * 
     * @param modelType
     *        Model type of the flywheel's model.
     * @see ModelType
     */

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * 
     * @return Model type of the flywheel's model.
     * @see ModelType
     */

    public String getModelType() {
        return this.modelType;
    }

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * 
     * @param modelType
     *        Model type of the flywheel's model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelType
     */

    public FlywheelProperties withModelType(String modelType) {
        setModelType(modelType);
        return this;
    }

    /**
     * <p>
     * Model type of the flywheel's model.
     * </p>
     * 
     * @param modelType
     *        Model type of the flywheel's model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelType
     */

    public FlywheelProperties withModelType(ModelType modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the flywheel.
     * </p>
     * 
     * @param message
     *        A description of the status of the flywheel.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the flywheel.
     * </p>
     * 
     * @return A description of the status of the flywheel.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the status of the flywheel.
     * </p>
     * 
     * @param message
     *        A description of the status of the flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Creation time of the flywheel.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the flywheel.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the flywheel.
     * </p>
     * 
     * @return Creation time of the flywheel.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Creation time of the flywheel.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Last modified time for the flywheel.
     * </p>
     * 
     * @param lastModifiedTime
     *        Last modified time for the flywheel.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Last modified time for the flywheel.
     * </p>
     * 
     * @return Last modified time for the flywheel.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Last modified time for the flywheel.
     * </p>
     * 
     * @param lastModifiedTime
     *        Last modified time for the flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The most recent flywheel iteration.
     * </p>
     * 
     * @param latestFlywheelIteration
     *        The most recent flywheel iteration.
     */

    public void setLatestFlywheelIteration(String latestFlywheelIteration) {
        this.latestFlywheelIteration = latestFlywheelIteration;
    }

    /**
     * <p>
     * The most recent flywheel iteration.
     * </p>
     * 
     * @return The most recent flywheel iteration.
     */

    public String getLatestFlywheelIteration() {
        return this.latestFlywheelIteration;
    }

    /**
     * <p>
     * The most recent flywheel iteration.
     * </p>
     * 
     * @param latestFlywheelIteration
     *        The most recent flywheel iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelProperties withLatestFlywheelIteration(String latestFlywheelIteration) {
        setLatestFlywheelIteration(latestFlywheelIteration);
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
        if (getFlywheelArn() != null)
            sb.append("FlywheelArn: ").append(getFlywheelArn()).append(",");
        if (getActiveModelArn() != null)
            sb.append("ActiveModelArn: ").append(getActiveModelArn()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getTaskConfig() != null)
            sb.append("TaskConfig: ").append(getTaskConfig()).append(",");
        if (getDataLakeS3Uri() != null)
            sb.append("DataLakeS3Uri: ").append(getDataLakeS3Uri()).append(",");
        if (getDataSecurityConfig() != null)
            sb.append("DataSecurityConfig: ").append(getDataSecurityConfig()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getModelType() != null)
            sb.append("ModelType: ").append(getModelType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLatestFlywheelIteration() != null)
            sb.append("LatestFlywheelIteration: ").append(getLatestFlywheelIteration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlywheelProperties == false)
            return false;
        FlywheelProperties other = (FlywheelProperties) obj;
        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getActiveModelArn() == null ^ this.getActiveModelArn() == null)
            return false;
        if (other.getActiveModelArn() != null && other.getActiveModelArn().equals(this.getActiveModelArn()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getTaskConfig() == null ^ this.getTaskConfig() == null)
            return false;
        if (other.getTaskConfig() != null && other.getTaskConfig().equals(this.getTaskConfig()) == false)
            return false;
        if (other.getDataLakeS3Uri() == null ^ this.getDataLakeS3Uri() == null)
            return false;
        if (other.getDataLakeS3Uri() != null && other.getDataLakeS3Uri().equals(this.getDataLakeS3Uri()) == false)
            return false;
        if (other.getDataSecurityConfig() == null ^ this.getDataSecurityConfig() == null)
            return false;
        if (other.getDataSecurityConfig() != null && other.getDataSecurityConfig().equals(this.getDataSecurityConfig()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLatestFlywheelIteration() == null ^ this.getLatestFlywheelIteration() == null)
            return false;
        if (other.getLatestFlywheelIteration() != null && other.getLatestFlywheelIteration().equals(this.getLatestFlywheelIteration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode + ((getActiveModelArn() == null) ? 0 : getActiveModelArn().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTaskConfig() == null) ? 0 : getTaskConfig().hashCode());
        hashCode = prime * hashCode + ((getDataLakeS3Uri() == null) ? 0 : getDataLakeS3Uri().hashCode());
        hashCode = prime * hashCode + ((getDataSecurityConfig() == null) ? 0 : getDataSecurityConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLatestFlywheelIteration() == null) ? 0 : getLatestFlywheelIteration().hashCode());
        return hashCode;
    }

    @Override
    public FlywheelProperties clone() {
        try {
            return (FlywheelProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.FlywheelPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
