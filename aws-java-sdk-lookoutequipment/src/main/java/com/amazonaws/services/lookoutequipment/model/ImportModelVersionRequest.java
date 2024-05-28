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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ImportModelVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportModelVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version to import.
     * </p>
     */
    private String sourceModelVersionArn;
    /**
     * <p>
     * The name for the machine learning model to be created. If the model already exists, Amazon Lookout for Equipment
     * creates a new version. If you do not specify this field, it is filled with the name of the source model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The name of the dataset for the machine learning model being imported.
     * </p>
     */
    private String datasetName;

    private LabelsInputConfiguration labelsInputConfiguration;
    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create the
     * machine learning model.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Provides the identifier of the KMS key key used to encrypt model data by Amazon Lookout for Equipment.
     * </p>
     */
    private String serverSideKmsKeyId;
    /**
     * <p>
     * The tags associated with the machine learning model to be created.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Indicates how to import the accumulated inference data when a model version is imported. The possible values are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NO_IMPORT – Don't import the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * ADD_WHEN_EMPTY – Only import the data from the source model if there is no existing data in the target model.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE – Import the data from the source model and overwrite the existing data in the target model.
     * </p>
     * </li>
     * </ul>
     */
    private String inferenceDataImportStrategy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version to import.
     * </p>
     * 
     * @param sourceModelVersionArn
     *        The Amazon Resource Name (ARN) of the model version to import.
     */

    public void setSourceModelVersionArn(String sourceModelVersionArn) {
        this.sourceModelVersionArn = sourceModelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version to import.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model version to import.
     */

    public String getSourceModelVersionArn() {
        return this.sourceModelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version to import.
     * </p>
     * 
     * @param sourceModelVersionArn
     *        The Amazon Resource Name (ARN) of the model version to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionRequest withSourceModelVersionArn(String sourceModelVersionArn) {
        setSourceModelVersionArn(sourceModelVersionArn);
        return this;
    }

    /**
     * <p>
     * The name for the machine learning model to be created. If the model already exists, Amazon Lookout for Equipment
     * creates a new version. If you do not specify this field, it is filled with the name of the source model.
     * </p>
     * 
     * @param modelName
     *        The name for the machine learning model to be created. If the model already exists, Amazon Lookout for
     *        Equipment creates a new version. If you do not specify this field, it is filled with the name of the
     *        source model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name for the machine learning model to be created. If the model already exists, Amazon Lookout for Equipment
     * creates a new version. If you do not specify this field, it is filled with the name of the source model.
     * </p>
     * 
     * @return The name for the machine learning model to be created. If the model already exists, Amazon Lookout for
     *         Equipment creates a new version. If you do not specify this field, it is filled with the name of the
     *         source model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name for the machine learning model to be created. If the model already exists, Amazon Lookout for Equipment
     * creates a new version. If you do not specify this field, it is filled with the name of the source model.
     * </p>
     * 
     * @param modelName
     *        The name for the machine learning model to be created. If the model already exists, Amazon Lookout for
     *        Equipment creates a new version. If you do not specify this field, it is filled with the name of the
     *        source model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The name of the dataset for the machine learning model being imported.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset for the machine learning model being imported.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset for the machine learning model being imported.
     * </p>
     * 
     * @return The name of the dataset for the machine learning model being imported.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset for the machine learning model being imported.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset for the machine learning model being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * @param labelsInputConfiguration
     */

    public void setLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        this.labelsInputConfiguration = labelsInputConfiguration;
    }

    /**
     * @return
     */

    public LabelsInputConfiguration getLabelsInputConfiguration() {
        return this.labelsInputConfiguration;
    }

    /**
     * @param labelsInputConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionRequest withLabelsInputConfiguration(LabelsInputConfiguration labelsInputConfiguration) {
        setLabelsInputConfiguration(labelsInputConfiguration);
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

    public ImportModelVersionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create the
     * machine learning model.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create
     *        the machine learning model.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create the
     * machine learning model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create
     *         the machine learning model.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create the
     * machine learning model.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source being used to create
     *        the machine learning model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Provides the identifier of the KMS key key used to encrypt model data by Amazon Lookout for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the KMS key key used to encrypt model data by Amazon Lookout for Equipment.
     */

    public void setServerSideKmsKeyId(String serverSideKmsKeyId) {
        this.serverSideKmsKeyId = serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the KMS key key used to encrypt model data by Amazon Lookout for Equipment.
     * </p>
     * 
     * @return Provides the identifier of the KMS key key used to encrypt model data by Amazon Lookout for Equipment.
     */

    public String getServerSideKmsKeyId() {
        return this.serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the KMS key key used to encrypt model data by Amazon Lookout for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the KMS key key used to encrypt model data by Amazon Lookout for Equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionRequest withServerSideKmsKeyId(String serverSideKmsKeyId) {
        setServerSideKmsKeyId(serverSideKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The tags associated with the machine learning model to be created.
     * </p>
     * 
     * @return The tags associated with the machine learning model to be created.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the machine learning model to be created.
     * </p>
     * 
     * @param tags
     *        The tags associated with the machine learning model to be created.
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
     * The tags associated with the machine learning model to be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the machine learning model to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionRequest withTags(Tag... tags) {
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
     * The tags associated with the machine learning model to be created.
     * </p>
     * 
     * @param tags
     *        The tags associated with the machine learning model to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelVersionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates how to import the accumulated inference data when a model version is imported. The possible values are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NO_IMPORT – Don't import the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * ADD_WHEN_EMPTY – Only import the data from the source model if there is no existing data in the target model.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE – Import the data from the source model and overwrite the existing data in the target model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferenceDataImportStrategy
     *        Indicates how to import the accumulated inference data when a model version is imported. The possible
     *        values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        NO_IMPORT – Don't import the data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ADD_WHEN_EMPTY – Only import the data from the source model if there is no existing data in the target
     *        model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVERWRITE – Import the data from the source model and overwrite the existing data in the target model.
     *        </p>
     *        </li>
     * @see InferenceDataImportStrategy
     */

    public void setInferenceDataImportStrategy(String inferenceDataImportStrategy) {
        this.inferenceDataImportStrategy = inferenceDataImportStrategy;
    }

    /**
     * <p>
     * Indicates how to import the accumulated inference data when a model version is imported. The possible values are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NO_IMPORT – Don't import the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * ADD_WHEN_EMPTY – Only import the data from the source model if there is no existing data in the target model.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE – Import the data from the source model and overwrite the existing data in the target model.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates how to import the accumulated inference data when a model version is imported. The possible
     *         values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         NO_IMPORT – Don't import the data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ADD_WHEN_EMPTY – Only import the data from the source model if there is no existing data in the target
     *         model.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OVERWRITE – Import the data from the source model and overwrite the existing data in the target model.
     *         </p>
     *         </li>
     * @see InferenceDataImportStrategy
     */

    public String getInferenceDataImportStrategy() {
        return this.inferenceDataImportStrategy;
    }

    /**
     * <p>
     * Indicates how to import the accumulated inference data when a model version is imported. The possible values are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NO_IMPORT – Don't import the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * ADD_WHEN_EMPTY – Only import the data from the source model if there is no existing data in the target model.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE – Import the data from the source model and overwrite the existing data in the target model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferenceDataImportStrategy
     *        Indicates how to import the accumulated inference data when a model version is imported. The possible
     *        values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        NO_IMPORT – Don't import the data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ADD_WHEN_EMPTY – Only import the data from the source model if there is no existing data in the target
     *        model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVERWRITE – Import the data from the source model and overwrite the existing data in the target model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceDataImportStrategy
     */

    public ImportModelVersionRequest withInferenceDataImportStrategy(String inferenceDataImportStrategy) {
        setInferenceDataImportStrategy(inferenceDataImportStrategy);
        return this;
    }

    /**
     * <p>
     * Indicates how to import the accumulated inference data when a model version is imported. The possible values are
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NO_IMPORT – Don't import the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * ADD_WHEN_EMPTY – Only import the data from the source model if there is no existing data in the target model.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE – Import the data from the source model and overwrite the existing data in the target model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferenceDataImportStrategy
     *        Indicates how to import the accumulated inference data when a model version is imported. The possible
     *        values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        NO_IMPORT – Don't import the data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ADD_WHEN_EMPTY – Only import the data from the source model if there is no existing data in the target
     *        model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVERWRITE – Import the data from the source model and overwrite the existing data in the target model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceDataImportStrategy
     */

    public ImportModelVersionRequest withInferenceDataImportStrategy(InferenceDataImportStrategy inferenceDataImportStrategy) {
        this.inferenceDataImportStrategy = inferenceDataImportStrategy.toString();
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
        if (getSourceModelVersionArn() != null)
            sb.append("SourceModelVersionArn: ").append(getSourceModelVersionArn()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getLabelsInputConfiguration() != null)
            sb.append("LabelsInputConfiguration: ").append(getLabelsInputConfiguration()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getServerSideKmsKeyId() != null)
            sb.append("ServerSideKmsKeyId: ").append(getServerSideKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getInferenceDataImportStrategy() != null)
            sb.append("InferenceDataImportStrategy: ").append(getInferenceDataImportStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportModelVersionRequest == false)
            return false;
        ImportModelVersionRequest other = (ImportModelVersionRequest) obj;
        if (other.getSourceModelVersionArn() == null ^ this.getSourceModelVersionArn() == null)
            return false;
        if (other.getSourceModelVersionArn() != null && other.getSourceModelVersionArn().equals(this.getSourceModelVersionArn()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getLabelsInputConfiguration() == null ^ this.getLabelsInputConfiguration() == null)
            return false;
        if (other.getLabelsInputConfiguration() != null && other.getLabelsInputConfiguration().equals(this.getLabelsInputConfiguration()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getServerSideKmsKeyId() == null ^ this.getServerSideKmsKeyId() == null)
            return false;
        if (other.getServerSideKmsKeyId() != null && other.getServerSideKmsKeyId().equals(this.getServerSideKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getInferenceDataImportStrategy() == null ^ this.getInferenceDataImportStrategy() == null)
            return false;
        if (other.getInferenceDataImportStrategy() != null && other.getInferenceDataImportStrategy().equals(this.getInferenceDataImportStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceModelVersionArn() == null) ? 0 : getSourceModelVersionArn().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getLabelsInputConfiguration() == null) ? 0 : getLabelsInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getServerSideKmsKeyId() == null) ? 0 : getServerSideKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getInferenceDataImportStrategy() == null) ? 0 : getInferenceDataImportStrategy().hashCode());
        return hashCode;
    }

    @Override
    public ImportModelVersionRequest clone() {
        return (ImportModelVersionRequest) super.clone();
    }

}
