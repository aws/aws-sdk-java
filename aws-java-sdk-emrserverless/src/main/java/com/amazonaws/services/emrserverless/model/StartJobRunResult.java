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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartJobRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This output displays the application ID on which the job run was submitted.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The output contains the ID of the started job run.
     * </p>
     */
    private String jobRunId;
    /**
     * <p>
     * The output lists the execution role ARN of the job run.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * This output displays the application ID on which the job run was submitted.
     * </p>
     * 
     * @param applicationId
     *        This output displays the application ID on which the job run was submitted.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * This output displays the application ID on which the job run was submitted.
     * </p>
     * 
     * @return This output displays the application ID on which the job run was submitted.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * This output displays the application ID on which the job run was submitted.
     * </p>
     * 
     * @param applicationId
     *        This output displays the application ID on which the job run was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The output contains the ID of the started job run.
     * </p>
     * 
     * @param jobRunId
     *        The output contains the ID of the started job run.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The output contains the ID of the started job run.
     * </p>
     * 
     * @return The output contains the ID of the started job run.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The output contains the ID of the started job run.
     * </p>
     * 
     * @param jobRunId
     *        The output contains the ID of the started job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunResult withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
        return this;
    }

    /**
     * <p>
     * The output lists the execution role ARN of the job run.
     * </p>
     * 
     * @param arn
     *        The output lists the execution role ARN of the job run.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The output lists the execution role ARN of the job run.
     * </p>
     * 
     * @return The output lists the execution role ARN of the job run.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The output lists the execution role ARN of the job run.
     * </p>
     * 
     * @param arn
     *        The output lists the execution role ARN of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunResult withArn(String arn) {
        setArn(arn);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartJobRunResult == false)
            return false;
        StartJobRunResult other = (StartJobRunResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public StartJobRunResult clone() {
        try {
            return (StartJobRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
