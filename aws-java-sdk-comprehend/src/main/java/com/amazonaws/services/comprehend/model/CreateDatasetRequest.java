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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.
     * </p>
     */
    private String flywheelArn;
    /**
     * <p>
     * Name of the dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for training the model or for testing the model.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * Description of the dataset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the input data configuration. The type of input data varies based on the format of the input
     * and whether the data is for a classifier model or an entity recognition model.
     * </p>
     */
    private DatasetInputDataConfig inputDataConfig;
    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Tags for the dataset.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.
     */

    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.
     */

    public String getFlywheelArn() {
        return this.flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withFlywheelArn(String flywheelArn) {
        setFlywheelArn(flywheelArn);
        return this;
    }

    /**
     * <p>
     * Name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        Name of the dataset.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * Name of the dataset.
     * </p>
     * 
     * @return Name of the dataset.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * Name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        Name of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for training the model or for testing the model.
     * </p>
     * 
     * @param datasetType
     *        The dataset type. You can specify that the data in a dataset is for training the model or for testing the
     *        model.
     * @see DatasetType
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for training the model or for testing the model.
     * </p>
     * 
     * @return The dataset type. You can specify that the data in a dataset is for training the model or for testing the
     *         model.
     * @see DatasetType
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for training the model or for testing the model.
     * </p>
     * 
     * @param datasetType
     *        The dataset type. You can specify that the data in a dataset is for training the model or for testing the
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public CreateDatasetRequest withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for training the model or for testing the model.
     * </p>
     * 
     * @param datasetType
     *        The dataset type. You can specify that the data in a dataset is for training the model or for testing the
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public CreateDatasetRequest withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * 
     * @param description
     *        Description of the dataset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * 
     * @return Description of the dataset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * 
     * @param description
     *        Description of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the input data configuration. The type of input data varies based on the format of the input
     * and whether the data is for a classifier model or an entity recognition model.
     * </p>
     * 
     * @param inputDataConfig
     *        Information about the input data configuration. The type of input data varies based on the format of the
     *        input and whether the data is for a classifier model or an entity recognition model.
     */

    public void setInputDataConfig(DatasetInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Information about the input data configuration. The type of input data varies based on the format of the input
     * and whether the data is for a classifier model or an entity recognition model.
     * </p>
     * 
     * @return Information about the input data configuration. The type of input data varies based on the format of the
     *         input and whether the data is for a classifier model or an entity recognition model.
     */

    public DatasetInputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * Information about the input data configuration. The type of input data varies based on the format of the input
     * and whether the data is for a classifier model or an entity recognition model.
     * </p>
     * 
     * @param inputDataConfig
     *        Information about the input data configuration. The type of input data varies based on the format of the
     *        input and whether the data is for a classifier model or an entity recognition model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withInputDataConfig(DatasetInputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the request. If you don't set the client request token, Amazon Comprehend
     *        generates one.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     * 
     * @return A unique identifier for the request. If you don't set the client request token, Amazon Comprehend
     *         generates one.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for the request. If you don't set the client request token, Amazon Comprehend
     *        generates one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Tags for the dataset.
     * </p>
     * 
     * @return Tags for the dataset.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the dataset.
     * </p>
     * 
     * @param tags
     *        Tags for the dataset.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags for the dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags for the dataset.
     * </p>
     * 
     * @param tags
     *        Tags for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getFlywheelArn() != null)
            sb.append("FlywheelArn: ").append(getFlywheelArn()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetRequest == false)
            return false;
        CreateDatasetRequest other = (CreateDatasetRequest) obj;
        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetRequest clone() {
        return (CreateDatasetRequest) super.clone();
    }

}
