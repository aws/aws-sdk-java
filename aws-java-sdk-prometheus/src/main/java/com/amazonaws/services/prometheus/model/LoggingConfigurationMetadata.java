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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the logging configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/LoggingConfigurationMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfigurationMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the logging configuration was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ARN of the CloudWatch log group to which the vended log data will be published.
     * </p>
     */
    private String logGroupArn;
    /**
     * <p>
     * The date and time that the logging configuration was most recently changed.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The current status of the logging configuration.
     * </p>
     */
    private LoggingConfigurationStatus status;
    /**
     * <p>
     * The ID of the workspace the logging configuration is for.
     * </p>
     */
    private String workspace;

    /**
     * <p>
     * The date and time that the logging configuration was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the logging configuration was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the logging configuration was created.
     * </p>
     * 
     * @return The date and time that the logging configuration was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the logging configuration was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the logging configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationMetadata withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ARN of the CloudWatch log group to which the vended log data will be published.
     * </p>
     * 
     * @param logGroupArn
     *        The ARN of the CloudWatch log group to which the vended log data will be published.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch log group to which the vended log data will be published.
     * </p>
     * 
     * @return The ARN of the CloudWatch log group to which the vended log data will be published.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch log group to which the vended log data will be published.
     * </p>
     * 
     * @param logGroupArn
     *        The ARN of the CloudWatch log group to which the vended log data will be published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationMetadata withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the logging configuration was most recently changed.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time that the logging configuration was most recently changed.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The date and time that the logging configuration was most recently changed.
     * </p>
     * 
     * @return The date and time that the logging configuration was most recently changed.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The date and time that the logging configuration was most recently changed.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time that the logging configuration was most recently changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationMetadata withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The current status of the logging configuration.
     * </p>
     * 
     * @param status
     *        The current status of the logging configuration.
     */

    public void setStatus(LoggingConfigurationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the logging configuration.
     * </p>
     * 
     * @return The current status of the logging configuration.
     */

    public LoggingConfigurationStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the logging configuration.
     * </p>
     * 
     * @param status
     *        The current status of the logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationMetadata withStatus(LoggingConfigurationStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace the logging configuration is for.
     * </p>
     * 
     * @param workspace
     *        The ID of the workspace the logging configuration is for.
     */

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    /**
     * <p>
     * The ID of the workspace the logging configuration is for.
     * </p>
     * 
     * @return The ID of the workspace the logging configuration is for.
     */

    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * <p>
     * The ID of the workspace the logging configuration is for.
     * </p>
     * 
     * @param workspace
     *        The ID of the workspace the logging configuration is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationMetadata withWorkspace(String workspace) {
        setWorkspace(workspace);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: ").append(getLogGroupArn()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getWorkspace() != null)
            sb.append("Workspace: ").append(getWorkspace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfigurationMetadata == false)
            return false;
        LoggingConfigurationMetadata other = (LoggingConfigurationMetadata) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWorkspace() == null ^ this.getWorkspace() == null)
            return false;
        if (other.getWorkspace() != null && other.getWorkspace().equals(this.getWorkspace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorkspace() == null) ? 0 : getWorkspace().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfigurationMetadata clone() {
        try {
            return (LoggingConfigurationMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.LoggingConfigurationMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
