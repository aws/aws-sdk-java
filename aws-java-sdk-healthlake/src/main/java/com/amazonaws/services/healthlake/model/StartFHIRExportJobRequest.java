/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRExportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFHIRExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user generated name for an export job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The output data configuration that was supplied when the export job was created.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The AWS generated ID for the Data Store from which files are being exported for an export job.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The Amazon Resource Name used during the initiation of the job.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * An optional user provided token used for ensuring idempotency.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The user generated name for an export job.
     * </p>
     * 
     * @param jobName
     *        The user generated name for an export job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The user generated name for an export job.
     * </p>
     * 
     * @return The user generated name for an export job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The user generated name for an export job.
     * </p>
     * 
     * @param jobName
     *        The user generated name for an export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRExportJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The output data configuration that was supplied when the export job was created.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration that was supplied when the export job was created.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that was supplied when the export job was created.
     * </p>
     * 
     * @return The output data configuration that was supplied when the export job was created.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that was supplied when the export job was created.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration that was supplied when the export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRExportJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The AWS generated ID for the Data Store from which files are being exported for an export job.
     * </p>
     * 
     * @param datastoreId
     *        The AWS generated ID for the Data Store from which files are being exported for an export job.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The AWS generated ID for the Data Store from which files are being exported for an export job.
     * </p>
     * 
     * @return The AWS generated ID for the Data Store from which files are being exported for an export job.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The AWS generated ID for the Data Store from which files are being exported for an export job.
     * </p>
     * 
     * @param datastoreId
     *        The AWS generated ID for the Data Store from which files are being exported for an export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRExportJobRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name used during the initiation of the job.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name used during the initiation of the job.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name used during the initiation of the job.
     * </p>
     * 
     * @return The Amazon Resource Name used during the initiation of the job.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name used during the initiation of the job.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name used during the initiation of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRExportJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * An optional user provided token used for ensuring idempotency.
     * </p>
     * 
     * @param clientToken
     *        An optional user provided token used for ensuring idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * An optional user provided token used for ensuring idempotency.
     * </p>
     * 
     * @return An optional user provided token used for ensuring idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * An optional user provided token used for ensuring idempotency.
     * </p>
     * 
     * @param clientToken
     *        An optional user provided token used for ensuring idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRExportJobRequest withClientToken(String clientToken) {
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
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

        if (obj instanceof StartFHIRExportJobRequest == false)
            return false;
        StartFHIRExportJobRequest other = (StartFHIRExportJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartFHIRExportJobRequest clone() {
        return (StartFHIRExportJobRequest) super.clone();
    }

}
