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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about when a transcription job should be executed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/JobExecutionSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobExecutionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is exceeded.
     * When the <code>AllowDeferredExecution</code> field is true, jobs are queued and will be executed when the number
     * of executing jobs falls below the concurrent execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must specify the <code>DataAccessRoleArn</code>
     * field.
     * </p>
     */
    private Boolean allowDeferredExecution;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains the input files. Amazon
     * Transcribe will assume this role to read queued media files. If you have specified an output S3 bucket for the
     * transcription results, this role should have access to the output bucket as well.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must specify the <code>DataAccessRoleArn</code>
     * field.
     * </p>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is exceeded.
     * When the <code>AllowDeferredExecution</code> field is true, jobs are queued and will be executed when the number
     * of executing jobs falls below the concurrent execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must specify the <code>DataAccessRoleArn</code>
     * field.
     * </p>
     * 
     * @param allowDeferredExecution
     *        Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is
     *        exceeded. When the <code>AllowDeferredExecution</code> field is true, jobs are queued and will be executed
     *        when the number of executing jobs falls below the concurrent execution limit. If the field is false,
     *        Amazon Transcribe returns a <code>LimitExceededException</code> exception.</p>
     *        <p>
     *        If you specify the <code>AllowDeferredExecution</code> field, you must specify the
     *        <code>DataAccessRoleArn</code> field.
     */

    public void setAllowDeferredExecution(Boolean allowDeferredExecution) {
        this.allowDeferredExecution = allowDeferredExecution;
    }

    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is exceeded.
     * When the <code>AllowDeferredExecution</code> field is true, jobs are queued and will be executed when the number
     * of executing jobs falls below the concurrent execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must specify the <code>DataAccessRoleArn</code>
     * field.
     * </p>
     * 
     * @return Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is
     *         exceeded. When the <code>AllowDeferredExecution</code> field is true, jobs are queued and will be
     *         executed when the number of executing jobs falls below the concurrent execution limit. If the field is
     *         false, Amazon Transcribe returns a <code>LimitExceededException</code> exception.</p>
     *         <p>
     *         If you specify the <code>AllowDeferredExecution</code> field, you must specify the
     *         <code>DataAccessRoleArn</code> field.
     */

    public Boolean getAllowDeferredExecution() {
        return this.allowDeferredExecution;
    }

    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is exceeded.
     * When the <code>AllowDeferredExecution</code> field is true, jobs are queued and will be executed when the number
     * of executing jobs falls below the concurrent execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must specify the <code>DataAccessRoleArn</code>
     * field.
     * </p>
     * 
     * @param allowDeferredExecution
     *        Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is
     *        exceeded. When the <code>AllowDeferredExecution</code> field is true, jobs are queued and will be executed
     *        when the number of executing jobs falls below the concurrent execution limit. If the field is false,
     *        Amazon Transcribe returns a <code>LimitExceededException</code> exception.</p>
     *        <p>
     *        If you specify the <code>AllowDeferredExecution</code> field, you must specify the
     *        <code>DataAccessRoleArn</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecutionSettings withAllowDeferredExecution(Boolean allowDeferredExecution) {
        setAllowDeferredExecution(allowDeferredExecution);
        return this;
    }

    /**
     * <p>
     * Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is exceeded.
     * When the <code>AllowDeferredExecution</code> field is true, jobs are queued and will be executed when the number
     * of executing jobs falls below the concurrent execution limit. If the field is false, Amazon Transcribe returns a
     * <code>LimitExceededException</code> exception.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must specify the <code>DataAccessRoleArn</code>
     * field.
     * </p>
     * 
     * @return Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is
     *         exceeded. When the <code>AllowDeferredExecution</code> field is true, jobs are queued and will be
     *         executed when the number of executing jobs falls below the concurrent execution limit. If the field is
     *         false, Amazon Transcribe returns a <code>LimitExceededException</code> exception.</p>
     *         <p>
     *         If you specify the <code>AllowDeferredExecution</code> field, you must specify the
     *         <code>DataAccessRoleArn</code> field.
     */

    public Boolean isAllowDeferredExecution() {
        return this.allowDeferredExecution;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains the input files. Amazon
     * Transcribe will assume this role to read queued media files. If you have specified an output S3 bucket for the
     * transcription results, this role should have access to the output bucket as well.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must specify the <code>DataAccessRoleArn</code>
     * field.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains the input files.
     *        Amazon Transcribe will assume this role to read queued media files. If you have specified an output S3
     *        bucket for the transcription results, this role should have access to the output bucket as well.</p>
     *        <p>
     *        If you specify the <code>AllowDeferredExecution</code> field, you must specify the
     *        <code>DataAccessRoleArn</code> field.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains the input files. Amazon
     * Transcribe will assume this role to read queued media files. If you have specified an output S3 bucket for the
     * transcription results, this role should have access to the output bucket as well.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must specify the <code>DataAccessRoleArn</code>
     * field.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains the input files.
     *         Amazon Transcribe will assume this role to read queued media files. If you have specified an output S3
     *         bucket for the transcription results, this role should have access to the output bucket as well.</p>
     *         <p>
     *         If you specify the <code>AllowDeferredExecution</code> field, you must specify the
     *         <code>DataAccessRoleArn</code> field.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains the input files. Amazon
     * Transcribe will assume this role to read queued media files. If you have specified an output S3 bucket for the
     * transcription results, this role should have access to the output bucket as well.
     * </p>
     * <p>
     * If you specify the <code>AllowDeferredExecution</code> field, you must specify the <code>DataAccessRoleArn</code>
     * field.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains the input files.
     *        Amazon Transcribe will assume this role to read queued media files. If you have specified an output S3
     *        bucket for the transcription results, this role should have access to the output bucket as well.</p>
     *        <p>
     *        If you specify the <code>AllowDeferredExecution</code> field, you must specify the
     *        <code>DataAccessRoleArn</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecutionSettings withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
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
        if (getAllowDeferredExecution() != null)
            sb.append("AllowDeferredExecution: ").append(getAllowDeferredExecution()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecutionSettings == false)
            return false;
        JobExecutionSettings other = (JobExecutionSettings) obj;
        if (other.getAllowDeferredExecution() == null ^ this.getAllowDeferredExecution() == null)
            return false;
        if (other.getAllowDeferredExecution() != null && other.getAllowDeferredExecution().equals(this.getAllowDeferredExecution()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowDeferredExecution() == null) ? 0 : getAllowDeferredExecution().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public JobExecutionSettings clone() {
        try {
            return (JobExecutionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.JobExecutionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
