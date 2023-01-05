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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Makes it possible to control how your transcription job is processed. Currently, the only
 * <code>JobExecutionSettings</code> modification you can choose is enabling job queueing using the
 * <code>AllowDeferredExecution</code> sub-parameter.
 * </p>
 * <p>
 * If you include <code>JobExecutionSettings</code> in your request, you must also include the sub-parameters:
 * <code>AllowDeferredExecution</code> and <code>DataAccessRoleArn</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/JobExecutionSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobExecutionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Makes it possible to enable job queuing when your concurrent request limit is exceeded. When
     * <code>AllowDeferredExecution</code> is set to <code>true</code>, transcription job requests are placed in a queue
     * until the number of jobs falls below the concurrent request limit. If <code>AllowDeferredExecution</code> is set
     * to <code>false</code> and the number of transcription job requests exceed the concurrent request limit, you get a
     * <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for Call Analytics jobs.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you must also include
     * <code>DataAccessRoleArn</code>.
     * </p>
     */
    private Boolean allowDeferredExecution;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * <p>
     * Note that if you include <code>DataAccessRoleArn</code> in your request, you must also include
     * <code>AllowDeferredExecution</code>.
     * </p>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Makes it possible to enable job queuing when your concurrent request limit is exceeded. When
     * <code>AllowDeferredExecution</code> is set to <code>true</code>, transcription job requests are placed in a queue
     * until the number of jobs falls below the concurrent request limit. If <code>AllowDeferredExecution</code> is set
     * to <code>false</code> and the number of transcription job requests exceed the concurrent request limit, you get a
     * <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for Call Analytics jobs.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you must also include
     * <code>DataAccessRoleArn</code>.
     * </p>
     * 
     * @param allowDeferredExecution
     *        Makes it possible to enable job queuing when your concurrent request limit is exceeded. When
     *        <code>AllowDeferredExecution</code> is set to <code>true</code>, transcription job requests are placed in
     *        a queue until the number of jobs falls below the concurrent request limit. If
     *        <code>AllowDeferredExecution</code> is set to <code>false</code> and the number of transcription job
     *        requests exceed the concurrent request limit, you get a <code>LimitExceededException</code> error.</p>
     *        <p>
     *        Note that job queuing is enabled by default for Call Analytics jobs.
     *        </p>
     *        <p>
     *        If you include <code>AllowDeferredExecution</code> in your request, you must also include
     *        <code>DataAccessRoleArn</code>.
     */

    public void setAllowDeferredExecution(Boolean allowDeferredExecution) {
        this.allowDeferredExecution = allowDeferredExecution;
    }

    /**
     * <p>
     * Makes it possible to enable job queuing when your concurrent request limit is exceeded. When
     * <code>AllowDeferredExecution</code> is set to <code>true</code>, transcription job requests are placed in a queue
     * until the number of jobs falls below the concurrent request limit. If <code>AllowDeferredExecution</code> is set
     * to <code>false</code> and the number of transcription job requests exceed the concurrent request limit, you get a
     * <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for Call Analytics jobs.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you must also include
     * <code>DataAccessRoleArn</code>.
     * </p>
     * 
     * @return Makes it possible to enable job queuing when your concurrent request limit is exceeded. When
     *         <code>AllowDeferredExecution</code> is set to <code>true</code>, transcription job requests are placed in
     *         a queue until the number of jobs falls below the concurrent request limit. If
     *         <code>AllowDeferredExecution</code> is set to <code>false</code> and the number of transcription job
     *         requests exceed the concurrent request limit, you get a <code>LimitExceededException</code> error.</p>
     *         <p>
     *         Note that job queuing is enabled by default for Call Analytics jobs.
     *         </p>
     *         <p>
     *         If you include <code>AllowDeferredExecution</code> in your request, you must also include
     *         <code>DataAccessRoleArn</code>.
     */

    public Boolean getAllowDeferredExecution() {
        return this.allowDeferredExecution;
    }

    /**
     * <p>
     * Makes it possible to enable job queuing when your concurrent request limit is exceeded. When
     * <code>AllowDeferredExecution</code> is set to <code>true</code>, transcription job requests are placed in a queue
     * until the number of jobs falls below the concurrent request limit. If <code>AllowDeferredExecution</code> is set
     * to <code>false</code> and the number of transcription job requests exceed the concurrent request limit, you get a
     * <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for Call Analytics jobs.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you must also include
     * <code>DataAccessRoleArn</code>.
     * </p>
     * 
     * @param allowDeferredExecution
     *        Makes it possible to enable job queuing when your concurrent request limit is exceeded. When
     *        <code>AllowDeferredExecution</code> is set to <code>true</code>, transcription job requests are placed in
     *        a queue until the number of jobs falls below the concurrent request limit. If
     *        <code>AllowDeferredExecution</code> is set to <code>false</code> and the number of transcription job
     *        requests exceed the concurrent request limit, you get a <code>LimitExceededException</code> error.</p>
     *        <p>
     *        Note that job queuing is enabled by default for Call Analytics jobs.
     *        </p>
     *        <p>
     *        If you include <code>AllowDeferredExecution</code> in your request, you must also include
     *        <code>DataAccessRoleArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecutionSettings withAllowDeferredExecution(Boolean allowDeferredExecution) {
        setAllowDeferredExecution(allowDeferredExecution);
        return this;
    }

    /**
     * <p>
     * Makes it possible to enable job queuing when your concurrent request limit is exceeded. When
     * <code>AllowDeferredExecution</code> is set to <code>true</code>, transcription job requests are placed in a queue
     * until the number of jobs falls below the concurrent request limit. If <code>AllowDeferredExecution</code> is set
     * to <code>false</code> and the number of transcription job requests exceed the concurrent request limit, you get a
     * <code>LimitExceededException</code> error.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for Call Analytics jobs.
     * </p>
     * <p>
     * If you include <code>AllowDeferredExecution</code> in your request, you must also include
     * <code>DataAccessRoleArn</code>.
     * </p>
     * 
     * @return Makes it possible to enable job queuing when your concurrent request limit is exceeded. When
     *         <code>AllowDeferredExecution</code> is set to <code>true</code>, transcription job requests are placed in
     *         a queue until the number of jobs falls below the concurrent request limit. If
     *         <code>AllowDeferredExecution</code> is set to <code>false</code> and the number of transcription job
     *         requests exceed the concurrent request limit, you get a <code>LimitExceededException</code> error.</p>
     *         <p>
     *         Note that job queuing is enabled by default for Call Analytics jobs.
     *         </p>
     *         <p>
     *         If you include <code>AllowDeferredExecution</code> in your request, you must also include
     *         <code>DataAccessRoleArn</code>.
     */

    public Boolean isAllowDeferredExecution() {
        return this.allowDeferredExecution;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * <p>
     * Note that if you include <code>DataAccessRoleArn</code> in your request, you must also include
     * <code>AllowDeferredExecution</code>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *        contains your input files. If the role that you specify doesn’t have the appropriate permissions to access
     *        the specified Amazon S3 location, your request fails.</p>
     *        <p>
     *        IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *        example: <code>arn:aws:iam::111122223333:role/Admin</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *        ARNs</a>.
     *        </p>
     *        <p>
     *        Note that if you include <code>DataAccessRoleArn</code> in your request, you must also include
     *        <code>AllowDeferredExecution</code>.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * <p>
     * Note that if you include <code>DataAccessRoleArn</code> in your request, you must also include
     * <code>AllowDeferredExecution</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *         contains your input files. If the role that you specify doesn’t have the appropriate permissions to
     *         access the specified Amazon S3 location, your request fails.</p>
     *         <p>
     *         IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *         example: <code>arn:aws:iam::111122223333:role/Admin</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *         ARNs</a>.
     *         </p>
     *         <p>
     *         Note that if you include <code>DataAccessRoleArn</code> in your request, you must also include
     *         <code>AllowDeferredExecution</code>.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * <p>
     * Note that if you include <code>DataAccessRoleArn</code> in your request, you must also include
     * <code>AllowDeferredExecution</code>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *        contains your input files. If the role that you specify doesn’t have the appropriate permissions to access
     *        the specified Amazon S3 location, your request fails.</p>
     *        <p>
     *        IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *        example: <code>arn:aws:iam::111122223333:role/Admin</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *        ARNs</a>.
     *        </p>
     *        <p>
     *        Note that if you include <code>DataAccessRoleArn</code> in your request, you must also include
     *        <code>AllowDeferredExecution</code>.
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
