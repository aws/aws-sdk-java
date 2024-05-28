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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ImportDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the created machine learning dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that was imported.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The status of the <code>ImportDataset</code> operation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A unique identifier for the job of importing the dataset.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The name of the created machine learning dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the created machine learning dataset.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the created machine learning dataset.
     * </p>
     * 
     * @return The name of the created machine learning dataset.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the created machine learning dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the created machine learning dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDatasetResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that was imported.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that was imported.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that was imported.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset that was imported.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that was imported.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that was imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDatasetResult withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The status of the <code>ImportDataset</code> operation.
     * </p>
     * 
     * @param status
     *        The status of the <code>ImportDataset</code> operation.
     * @see DatasetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the <code>ImportDataset</code> operation.
     * </p>
     * 
     * @return The status of the <code>ImportDataset</code> operation.
     * @see DatasetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the <code>ImportDataset</code> operation.
     * </p>
     * 
     * @param status
     *        The status of the <code>ImportDataset</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public ImportDatasetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the <code>ImportDataset</code> operation.
     * </p>
     * 
     * @param status
     *        The status of the <code>ImportDataset</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public ImportDatasetResult withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the job of importing the dataset.
     * </p>
     * 
     * @param jobId
     *        A unique identifier for the job of importing the dataset.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A unique identifier for the job of importing the dataset.
     * </p>
     * 
     * @return A unique identifier for the job of importing the dataset.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * A unique identifier for the job of importing the dataset.
     * </p>
     * 
     * @param jobId
     *        A unique identifier for the job of importing the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDatasetResult withJobId(String jobId) {
        setJobId(jobId);
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportDatasetResult == false)
            return false;
        ImportDatasetResult other = (ImportDatasetResult) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public ImportDatasetResult clone() {
        try {
            return (ImportDatasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
