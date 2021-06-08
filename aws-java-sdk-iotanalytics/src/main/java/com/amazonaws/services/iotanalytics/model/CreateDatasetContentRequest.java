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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatasetContent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The version ID of the dataset content. To specify <code>versionId</code> for a dataset content, the dataset must
     * use a <a href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     * filter.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @return The name of the dataset.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetContentRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The version ID of the dataset content. To specify <code>versionId</code> for a dataset content, the dataset must
     * use a <a href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     * filter.
     * </p>
     * 
     * @param versionId
     *        The version ID of the dataset content. To specify <code>versionId</code> for a dataset content, the
     *        dataset must use a <a
     *        href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     *        filter.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version ID of the dataset content. To specify <code>versionId</code> for a dataset content, the dataset must
     * use a <a href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     * filter.
     * </p>
     * 
     * @return The version ID of the dataset content. To specify <code>versionId</code> for a dataset content, the
     *         dataset must use a <a
     *         href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     *         filter.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The version ID of the dataset content. To specify <code>versionId</code> for a dataset content, the dataset must
     * use a <a href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     * filter.
     * </p>
     * 
     * @param versionId
     *        The version ID of the dataset content. To specify <code>versionId</code> for a dataset content, the
     *        dataset must use a <a
     *        href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html">DeltaTimer</a>
     *        filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetContentRequest withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetContentRequest == false)
            return false;
        CreateDatasetContentRequest other = (CreateDatasetContentRequest) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetContentRequest clone() {
        return (CreateDatasetContentRequest) super.clone();
    }

}
