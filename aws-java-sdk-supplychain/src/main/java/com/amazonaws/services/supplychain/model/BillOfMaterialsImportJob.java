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
package com.amazonaws.services.supplychain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The BillOfMaterialsImportJob details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/BillOfMaterialsImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BillOfMaterialsImportJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The BillOfMaterialsImportJob instanceId.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The BillOfMaterialsImportJob jobId.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The BillOfMaterialsImportJob ConfigurationJobStatus.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The S3 URI from which the CSV is read.
     * </p>
     */
    private String s3uri;
    /**
     * <p>
     * When the BillOfMaterialsImportJob has reached a terminal state, there will be a message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The BillOfMaterialsImportJob instanceId.
     * </p>
     * 
     * @param instanceId
     *        The BillOfMaterialsImportJob instanceId.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob instanceId.
     * </p>
     * 
     * @return The BillOfMaterialsImportJob instanceId.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob instanceId.
     * </p>
     * 
     * @param instanceId
     *        The BillOfMaterialsImportJob instanceId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillOfMaterialsImportJob withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob jobId.
     * </p>
     * 
     * @param jobId
     *        The BillOfMaterialsImportJob jobId.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob jobId.
     * </p>
     * 
     * @return The BillOfMaterialsImportJob jobId.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob jobId.
     * </p>
     * 
     * @param jobId
     *        The BillOfMaterialsImportJob jobId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillOfMaterialsImportJob withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob ConfigurationJobStatus.
     * </p>
     * 
     * @param status
     *        The BillOfMaterialsImportJob ConfigurationJobStatus.
     * @see ConfigurationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob ConfigurationJobStatus.
     * </p>
     * 
     * @return The BillOfMaterialsImportJob ConfigurationJobStatus.
     * @see ConfigurationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob ConfigurationJobStatus.
     * </p>
     * 
     * @param status
     *        The BillOfMaterialsImportJob ConfigurationJobStatus.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationJobStatus
     */

    public BillOfMaterialsImportJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The BillOfMaterialsImportJob ConfigurationJobStatus.
     * </p>
     * 
     * @param status
     *        The BillOfMaterialsImportJob ConfigurationJobStatus.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationJobStatus
     */

    public BillOfMaterialsImportJob withStatus(ConfigurationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The S3 URI from which the CSV is read.
     * </p>
     * 
     * @param s3uri
     *        The S3 URI from which the CSV is read.
     */

    public void setS3uri(String s3uri) {
        this.s3uri = s3uri;
    }

    /**
     * <p>
     * The S3 URI from which the CSV is read.
     * </p>
     * 
     * @return The S3 URI from which the CSV is read.
     */

    public String getS3uri() {
        return this.s3uri;
    }

    /**
     * <p>
     * The S3 URI from which the CSV is read.
     * </p>
     * 
     * @param s3uri
     *        The S3 URI from which the CSV is read.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillOfMaterialsImportJob withS3uri(String s3uri) {
        setS3uri(s3uri);
        return this;
    }

    /**
     * <p>
     * When the BillOfMaterialsImportJob has reached a terminal state, there will be a message.
     * </p>
     * 
     * @param message
     *        When the BillOfMaterialsImportJob has reached a terminal state, there will be a message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * When the BillOfMaterialsImportJob has reached a terminal state, there will be a message.
     * </p>
     * 
     * @return When the BillOfMaterialsImportJob has reached a terminal state, there will be a message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * When the BillOfMaterialsImportJob has reached a terminal state, there will be a message.
     * </p>
     * 
     * @param message
     *        When the BillOfMaterialsImportJob has reached a terminal state, there will be a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillOfMaterialsImportJob withMessage(String message) {
        setMessage(message);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getS3uri() != null)
            sb.append("S3uri: ").append(getS3uri()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BillOfMaterialsImportJob == false)
            return false;
        BillOfMaterialsImportJob other = (BillOfMaterialsImportJob) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getS3uri() == null ^ this.getS3uri() == null)
            return false;
        if (other.getS3uri() != null && other.getS3uri().equals(this.getS3uri()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getS3uri() == null) ? 0 : getS3uri().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BillOfMaterialsImportJob clone() {
        try {
            return (BillOfMaterialsImportJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.supplychain.model.transform.BillOfMaterialsImportJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
