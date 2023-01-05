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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StartBatchJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBatchJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the application associated with this batch job.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The unique identifier of the batch job.
     * </p>
     */
    private BatchJobIdentifier batchJobIdentifier;
    /**
     * <p>
     * The collection of batch job parameters. For details about limits for keys and values, see <a
     * href="https://www.ibm.com/docs/en/workload-automation/9.3.0?topic=zos-coding-variables-in-jcl">Coding variables
     * in JCL</a>.
     * </p>
     */
    private java.util.Map<String, String> jobParams;

    /**
     * <p>
     * The unique identifier of the application associated with this batch job.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application associated with this batch job.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application associated with this batch job.
     * </p>
     * 
     * @return The unique identifier of the application associated with this batch job.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application associated with this batch job.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application associated with this batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBatchJobRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the batch job.
     * </p>
     * 
     * @param batchJobIdentifier
     *        The unique identifier of the batch job.
     */

    public void setBatchJobIdentifier(BatchJobIdentifier batchJobIdentifier) {
        this.batchJobIdentifier = batchJobIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the batch job.
     * </p>
     * 
     * @return The unique identifier of the batch job.
     */

    public BatchJobIdentifier getBatchJobIdentifier() {
        return this.batchJobIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the batch job.
     * </p>
     * 
     * @param batchJobIdentifier
     *        The unique identifier of the batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBatchJobRequest withBatchJobIdentifier(BatchJobIdentifier batchJobIdentifier) {
        setBatchJobIdentifier(batchJobIdentifier);
        return this;
    }

    /**
     * <p>
     * The collection of batch job parameters. For details about limits for keys and values, see <a
     * href="https://www.ibm.com/docs/en/workload-automation/9.3.0?topic=zos-coding-variables-in-jcl">Coding variables
     * in JCL</a>.
     * </p>
     * 
     * @return The collection of batch job parameters. For details about limits for keys and values, see <a
     *         href="https://www.ibm.com/docs/en/workload-automation/9.3.0?topic=zos-coding-variables-in-jcl">Coding
     *         variables in JCL</a>.
     */

    public java.util.Map<String, String> getJobParams() {
        return jobParams;
    }

    /**
     * <p>
     * The collection of batch job parameters. For details about limits for keys and values, see <a
     * href="https://www.ibm.com/docs/en/workload-automation/9.3.0?topic=zos-coding-variables-in-jcl">Coding variables
     * in JCL</a>.
     * </p>
     * 
     * @param jobParams
     *        The collection of batch job parameters. For details about limits for keys and values, see <a
     *        href="https://www.ibm.com/docs/en/workload-automation/9.3.0?topic=zos-coding-variables-in-jcl">Coding
     *        variables in JCL</a>.
     */

    public void setJobParams(java.util.Map<String, String> jobParams) {
        this.jobParams = jobParams;
    }

    /**
     * <p>
     * The collection of batch job parameters. For details about limits for keys and values, see <a
     * href="https://www.ibm.com/docs/en/workload-automation/9.3.0?topic=zos-coding-variables-in-jcl">Coding variables
     * in JCL</a>.
     * </p>
     * 
     * @param jobParams
     *        The collection of batch job parameters. For details about limits for keys and values, see <a
     *        href="https://www.ibm.com/docs/en/workload-automation/9.3.0?topic=zos-coding-variables-in-jcl">Coding
     *        variables in JCL</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBatchJobRequest withJobParams(java.util.Map<String, String> jobParams) {
        setJobParams(jobParams);
        return this;
    }

    /**
     * Add a single JobParams entry
     *
     * @see StartBatchJobRequest#withJobParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartBatchJobRequest addJobParamsEntry(String key, String value) {
        if (null == this.jobParams) {
            this.jobParams = new java.util.HashMap<String, String>();
        }
        if (this.jobParams.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.jobParams.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into JobParams.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBatchJobRequest clearJobParamsEntries() {
        this.jobParams = null;
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
        if (getBatchJobIdentifier() != null)
            sb.append("BatchJobIdentifier: ").append(getBatchJobIdentifier()).append(",");
        if (getJobParams() != null)
            sb.append("JobParams: ").append(getJobParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBatchJobRequest == false)
            return false;
        StartBatchJobRequest other = (StartBatchJobRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getBatchJobIdentifier() == null ^ this.getBatchJobIdentifier() == null)
            return false;
        if (other.getBatchJobIdentifier() != null && other.getBatchJobIdentifier().equals(this.getBatchJobIdentifier()) == false)
            return false;
        if (other.getJobParams() == null ^ this.getJobParams() == null)
            return false;
        if (other.getJobParams() != null && other.getJobParams().equals(this.getJobParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getBatchJobIdentifier() == null) ? 0 : getBatchJobIdentifier().hashCode());
        hashCode = prime * hashCode + ((getJobParams() == null) ? 0 : getJobParams().hashCode());
        return hashCode;
    }

    @Override
    public StartBatchJobRequest clone() {
        return (StartBatchJobRequest) super.clone();
    }

}
