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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StartModelPackagingJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartModelPackagingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project which contains the version of the model that you want to package.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The version of the model within the project that you want to package.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * A name for the model packaging job. If you don't supply a value, the service creates a job name for you.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The configuration for the model packaging job.
     * </p>
     */
    private ModelPackagingConfiguration configuration;
    /**
     * <p>
     * A description for the model packaging job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>StartModelPackagingJob</code> completes only
     * once. You choose the value to pass. For example, An issue might prevent you from getting a response from
     * <code>StartModelPackagingJob</code>. In this case, safely retry your call to <code>StartModelPackagingJob</code>
     * by using the same <code>ClientToken</code> parameter value.
     * </p>
     * <p>
     * If you don't supply a value for <code>ClientToken</code>, the AWS SDK you are using inserts a value for you. This
     * prevents retries after a network error from making multiple dataset creation requests. You'll need to provide
     * your own value for other use cases.
     * </p>
     * <p>
     * An error occurs if the other input parameters are not the same as in the first request. Using a different value
     * for <code>ClientToken</code> is considered a new call to <code>StartModelPackagingJob</code>. An idempotency
     * token is active for 8 hours.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the project which contains the version of the model that you want to package.
     * </p>
     * 
     * @param projectName
     *        The name of the project which contains the version of the model that you want to package.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project which contains the version of the model that you want to package.
     * </p>
     * 
     * @return The name of the project which contains the version of the model that you want to package.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project which contains the version of the model that you want to package.
     * </p>
     * 
     * @param projectName
     *        The name of the project which contains the version of the model that you want to package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelPackagingJobRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The version of the model within the project that you want to package.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model within the project that you want to package.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model within the project that you want to package.
     * </p>
     * 
     * @return The version of the model within the project that you want to package.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model within the project that you want to package.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model within the project that you want to package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelPackagingJobRequest withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * A name for the model packaging job. If you don't supply a value, the service creates a job name for you.
     * </p>
     * 
     * @param jobName
     *        A name for the model packaging job. If you don't supply a value, the service creates a job name for you.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * A name for the model packaging job. If you don't supply a value, the service creates a job name for you.
     * </p>
     * 
     * @return A name for the model packaging job. If you don't supply a value, the service creates a job name for you.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * A name for the model packaging job. If you don't supply a value, the service creates a job name for you.
     * </p>
     * 
     * @param jobName
     *        A name for the model packaging job. If you don't supply a value, the service creates a job name for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelPackagingJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The configuration for the model packaging job.
     * </p>
     * 
     * @param configuration
     *        The configuration for the model packaging job.
     */

    public void setConfiguration(ModelPackagingConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration for the model packaging job.
     * </p>
     * 
     * @return The configuration for the model packaging job.
     */

    public ModelPackagingConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration for the model packaging job.
     * </p>
     * 
     * @param configuration
     *        The configuration for the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelPackagingJobRequest withConfiguration(ModelPackagingConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * A description for the model packaging job.
     * </p>
     * 
     * @param description
     *        A description for the model packaging job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the model packaging job.
     * </p>
     * 
     * @return A description for the model packaging job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the model packaging job.
     * </p>
     * 
     * @param description
     *        A description for the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelPackagingJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>StartModelPackagingJob</code> completes only
     * once. You choose the value to pass. For example, An issue might prevent you from getting a response from
     * <code>StartModelPackagingJob</code>. In this case, safely retry your call to <code>StartModelPackagingJob</code>
     * by using the same <code>ClientToken</code> parameter value.
     * </p>
     * <p>
     * If you don't supply a value for <code>ClientToken</code>, the AWS SDK you are using inserts a value for you. This
     * prevents retries after a network error from making multiple dataset creation requests. You'll need to provide
     * your own value for other use cases.
     * </p>
     * <p>
     * An error occurs if the other input parameters are not the same as in the first request. Using a different value
     * for <code>ClientToken</code> is considered a new call to <code>StartModelPackagingJob</code>. An idempotency
     * token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>StartModelPackagingJob</code> completes
     *        only once. You choose the value to pass. For example, An issue might prevent you from getting a response
     *        from <code>StartModelPackagingJob</code>. In this case, safely retry your call to
     *        <code>StartModelPackagingJob</code> by using the same <code>ClientToken</code> parameter value.</p>
     *        <p>
     *        If you don't supply a value for <code>ClientToken</code>, the AWS SDK you are using inserts a value for
     *        you. This prevents retries after a network error from making multiple dataset creation requests. You'll
     *        need to provide your own value for other use cases.
     *        </p>
     *        <p>
     *        An error occurs if the other input parameters are not the same as in the first request. Using a different
     *        value for <code>ClientToken</code> is considered a new call to <code>StartModelPackagingJob</code>. An
     *        idempotency token is active for 8 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>StartModelPackagingJob</code> completes only
     * once. You choose the value to pass. For example, An issue might prevent you from getting a response from
     * <code>StartModelPackagingJob</code>. In this case, safely retry your call to <code>StartModelPackagingJob</code>
     * by using the same <code>ClientToken</code> parameter value.
     * </p>
     * <p>
     * If you don't supply a value for <code>ClientToken</code>, the AWS SDK you are using inserts a value for you. This
     * prevents retries after a network error from making multiple dataset creation requests. You'll need to provide
     * your own value for other use cases.
     * </p>
     * <p>
     * An error occurs if the other input parameters are not the same as in the first request. Using a different value
     * for <code>ClientToken</code> is considered a new call to <code>StartModelPackagingJob</code>. An idempotency
     * token is active for 8 hours.
     * </p>
     * 
     * @return ClientToken is an idempotency token that ensures a call to <code>StartModelPackagingJob</code> completes
     *         only once. You choose the value to pass. For example, An issue might prevent you from getting a response
     *         from <code>StartModelPackagingJob</code>. In this case, safely retry your call to
     *         <code>StartModelPackagingJob</code> by using the same <code>ClientToken</code> parameter value.</p>
     *         <p>
     *         If you don't supply a value for <code>ClientToken</code>, the AWS SDK you are using inserts a value for
     *         you. This prevents retries after a network error from making multiple dataset creation requests. You'll
     *         need to provide your own value for other use cases.
     *         </p>
     *         <p>
     *         An error occurs if the other input parameters are not the same as in the first request. Using a different
     *         value for <code>ClientToken</code> is considered a new call to <code>StartModelPackagingJob</code>. An
     *         idempotency token is active for 8 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>StartModelPackagingJob</code> completes only
     * once. You choose the value to pass. For example, An issue might prevent you from getting a response from
     * <code>StartModelPackagingJob</code>. In this case, safely retry your call to <code>StartModelPackagingJob</code>
     * by using the same <code>ClientToken</code> parameter value.
     * </p>
     * <p>
     * If you don't supply a value for <code>ClientToken</code>, the AWS SDK you are using inserts a value for you. This
     * prevents retries after a network error from making multiple dataset creation requests. You'll need to provide
     * your own value for other use cases.
     * </p>
     * <p>
     * An error occurs if the other input parameters are not the same as in the first request. Using a different value
     * for <code>ClientToken</code> is considered a new call to <code>StartModelPackagingJob</code>. An idempotency
     * token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>StartModelPackagingJob</code> completes
     *        only once. You choose the value to pass. For example, An issue might prevent you from getting a response
     *        from <code>StartModelPackagingJob</code>. In this case, safely retry your call to
     *        <code>StartModelPackagingJob</code> by using the same <code>ClientToken</code> parameter value.</p>
     *        <p>
     *        If you don't supply a value for <code>ClientToken</code>, the AWS SDK you are using inserts a value for
     *        you. This prevents retries after a network error from making multiple dataset creation requests. You'll
     *        need to provide your own value for other use cases.
     *        </p>
     *        <p>
     *        An error occurs if the other input parameters are not the same as in the first request. Using a different
     *        value for <code>ClientToken</code> is considered a new call to <code>StartModelPackagingJob</code>. An
     *        idempotency token is active for 8 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelPackagingJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartModelPackagingJobRequest == false)
            return false;
        StartModelPackagingJobRequest other = (StartModelPackagingJobRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartModelPackagingJobRequest clone() {
        return (StartModelPackagingJobRequest) super.clone();
    }

}
