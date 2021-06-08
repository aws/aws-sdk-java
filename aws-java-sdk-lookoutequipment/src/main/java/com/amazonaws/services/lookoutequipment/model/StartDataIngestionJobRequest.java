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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartDataIngestionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDataIngestionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset being used by the data ingestion job.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * Specifies information for the input data for the data ingestion job, including dataset S3 location.
     * </p>
     */
    private IngestionInputConfiguration ingestionInputConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the data ingestion job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the dataset being used by the data ingestion job.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used by the data ingestion job.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used by the data ingestion job.
     * </p>
     * 
     * @return The name of the dataset being used by the data ingestion job.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset being used by the data ingestion job.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being used by the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataIngestionJobRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * Specifies information for the input data for the data ingestion job, including dataset S3 location.
     * </p>
     * 
     * @param ingestionInputConfiguration
     *        Specifies information for the input data for the data ingestion job, including dataset S3 location.
     */

    public void setIngestionInputConfiguration(IngestionInputConfiguration ingestionInputConfiguration) {
        this.ingestionInputConfiguration = ingestionInputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the input data for the data ingestion job, including dataset S3 location.
     * </p>
     * 
     * @return Specifies information for the input data for the data ingestion job, including dataset S3 location.
     */

    public IngestionInputConfiguration getIngestionInputConfiguration() {
        return this.ingestionInputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the input data for the data ingestion job, including dataset S3 location.
     * </p>
     * 
     * @param ingestionInputConfiguration
     *        Specifies information for the input data for the data ingestion job, including dataset S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataIngestionJobRequest withIngestionInputConfiguration(IngestionInputConfiguration ingestionInputConfiguration) {
        setIngestionInputConfiguration(ingestionInputConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the data ingestion job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the data ingestion
     *        job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the data ingestion job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source for the data ingestion
     *         job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source for the data ingestion job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source for the data ingestion
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataIngestionJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *        Equipment generates one.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @return A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *         Equipment generates one.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *        Equipment generates one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataIngestionJobRequest withClientToken(String clientToken) {
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getIngestionInputConfiguration() != null)
            sb.append("IngestionInputConfiguration: ").append(getIngestionInputConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof StartDataIngestionJobRequest == false)
            return false;
        StartDataIngestionJobRequest other = (StartDataIngestionJobRequest) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getIngestionInputConfiguration() == null ^ this.getIngestionInputConfiguration() == null)
            return false;
        if (other.getIngestionInputConfiguration() != null && other.getIngestionInputConfiguration().equals(this.getIngestionInputConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getIngestionInputConfiguration() == null) ? 0 : getIngestionInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartDataIngestionJobRequest clone() {
        return (StartDataIngestionJobRequest) super.clone();
    }

}
