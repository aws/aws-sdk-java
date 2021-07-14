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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFHIRImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the FHIR Import job in the StartFHIRImport job request.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The input properties of the FHIR Import job in the StartFHIRImport job request.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    private OutputDataConfig jobOutputDataConfig;
    /**
     * <p>
     * The AWS-generated Data Store ID.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon HealthLake access permission.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * Optional user provided token used for ensuring idempotency.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the FHIR Import job in the StartFHIRImport job request.
     * </p>
     * 
     * @param jobName
     *        The name of the FHIR Import job in the StartFHIRImport job request.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the FHIR Import job in the StartFHIRImport job request.
     * </p>
     * 
     * @return The name of the FHIR Import job in the StartFHIRImport job request.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the FHIR Import job in the StartFHIRImport job request.
     * </p>
     * 
     * @param jobName
     *        The name of the FHIR Import job in the StartFHIRImport job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRImportJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The input properties of the FHIR Import job in the StartFHIRImport job request.
     * </p>
     * 
     * @param inputDataConfig
     *        The input properties of the FHIR Import job in the StartFHIRImport job request.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input properties of the FHIR Import job in the StartFHIRImport job request.
     * </p>
     * 
     * @return The input properties of the FHIR Import job in the StartFHIRImport job request.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input properties of the FHIR Import job in the StartFHIRImport job request.
     * </p>
     * 
     * @param inputDataConfig
     *        The input properties of the FHIR Import job in the StartFHIRImport job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRImportJobRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * @param jobOutputDataConfig
     */

    public void setJobOutputDataConfig(OutputDataConfig jobOutputDataConfig) {
        this.jobOutputDataConfig = jobOutputDataConfig;
    }

    /**
     * @return
     */

    public OutputDataConfig getJobOutputDataConfig() {
        return this.jobOutputDataConfig;
    }

    /**
     * @param jobOutputDataConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRImportJobRequest withJobOutputDataConfig(OutputDataConfig jobOutputDataConfig) {
        setJobOutputDataConfig(jobOutputDataConfig);
        return this;
    }

    /**
     * <p>
     * The AWS-generated Data Store ID.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated Data Store ID.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The AWS-generated Data Store ID.
     * </p>
     * 
     * @return The AWS-generated Data Store ID.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The AWS-generated Data Store ID.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated Data Store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRImportJobRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon HealthLake access permission.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) that gives Amazon HealthLake access permission.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon HealthLake access permission.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that gives Amazon HealthLake access permission.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon HealthLake access permission.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) that gives Amazon HealthLake access permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRImportJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Optional user provided token used for ensuring idempotency.
     * </p>
     * 
     * @param clientToken
     *        Optional user provided token used for ensuring idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Optional user provided token used for ensuring idempotency.
     * </p>
     * 
     * @return Optional user provided token used for ensuring idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Optional user provided token used for ensuring idempotency.
     * </p>
     * 
     * @param clientToken
     *        Optional user provided token used for ensuring idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRImportJobRequest withClientToken(String clientToken) {
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
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getJobOutputDataConfig() != null)
            sb.append("JobOutputDataConfig: ").append(getJobOutputDataConfig()).append(",");
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

        if (obj instanceof StartFHIRImportJobRequest == false)
            return false;
        StartFHIRImportJobRequest other = (StartFHIRImportJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getJobOutputDataConfig() == null ^ this.getJobOutputDataConfig() == null)
            return false;
        if (other.getJobOutputDataConfig() != null && other.getJobOutputDataConfig().equals(this.getJobOutputDataConfig()) == false)
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
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getJobOutputDataConfig() == null) ? 0 : getJobOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartFHIRImportJobRequest clone() {
        return (StartFHIRImportJobRequest) super.clone();
    }

}
