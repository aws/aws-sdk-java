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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CancelJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelJobRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application on which the job run will be canceled.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the job run to cancel.
     * </p>
     */
    private String jobRunId;

    /**
     * <p>
     * The ID of the application on which the job run will be canceled.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application on which the job run will be canceled.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application on which the job run will be canceled.
     * </p>
     * 
     * @return The ID of the application on which the job run will be canceled.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application on which the job run will be canceled.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application on which the job run will be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRunRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the job run to cancel.
     * </p>
     * 
     * @param jobRunId
     *        The ID of the job run to cancel.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The ID of the job run to cancel.
     * </p>
     * 
     * @return The ID of the job run to cancel.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The ID of the job run to cancel.
     * </p>
     * 
     * @param jobRunId
     *        The ID of the job run to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRunRequest withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
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
            sb.append("JobRunId: ").append(getJobRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJobRunRequest == false)
            return false;
        CancelJobRunRequest other = (CancelJobRunRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        return hashCode;
    }

    @Override
    public CancelJobRunRequest clone() {
        return (CancelJobRunRequest) super.clone();
    }

}
