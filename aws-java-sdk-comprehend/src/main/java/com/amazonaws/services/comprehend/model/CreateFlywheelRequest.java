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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateFlywheel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlywheelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name for the flywheel.
     * </p>
     */
    private String flywheelName;
    /**
     * <p>
     * To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model version.
     * Do not set <code>TaskConfig</code> or <code>ModelType</code> if you specify an <code>ActiveModelArn</code>.
     * </p>
     */
    private String activeModelArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend the permissions required to access
     * the flywheel data in the data lake.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * Configuration about the model associated with the flywheel. You need to set <code>TaskConfig</code> if you are
     * creating a flywheel for a new model.
     * </p>
     */
    private TaskConfig taskConfig;
    /**
     * <p>
     * The model type. You need to set <code>ModelType</code> if you are creating a flywheel for a new model.
     * </p>
     */
    private String modelType;
    /**
     * <p>
     * Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an existing S3
     * bucket. The flywheel creates the data lake at this location.
     * </p>
     */
    private String dataLakeS3Uri;
    /**
     * <p>
     * Data security configurations.
     * </p>
     */
    private DataSecurityConfig dataSecurityConfig;
    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags to associate with this flywheel.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Name for the flywheel.
     * </p>
     * 
     * @param flywheelName
     *        Name for the flywheel.
     */

    public void setFlywheelName(String flywheelName) {
        this.flywheelName = flywheelName;
    }

    /**
     * <p>
     * Name for the flywheel.
     * </p>
     * 
     * @return Name for the flywheel.
     */

    public String getFlywheelName() {
        return this.flywheelName;
    }

    /**
     * <p>
     * Name for the flywheel.
     * </p>
     * 
     * @param flywheelName
     *        Name for the flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelRequest withFlywheelName(String flywheelName) {
        setFlywheelName(flywheelName);
        return this;
    }

    /**
     * <p>
     * To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model version.
     * Do not set <code>TaskConfig</code> or <code>ModelType</code> if you specify an <code>ActiveModelArn</code>.
     * </p>
     * 
     * @param activeModelArn
     *        To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model
     *        version. Do not set <code>TaskConfig</code> or <code>ModelType</code> if you specify an
     *        <code>ActiveModelArn</code>.
     */

    public void setActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
    }

    /**
     * <p>
     * To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model version.
     * Do not set <code>TaskConfig</code> or <code>ModelType</code> if you specify an <code>ActiveModelArn</code>.
     * </p>
     * 
     * @return To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model
     *         version. Do not set <code>TaskConfig</code> or <code>ModelType</code> if you specify an
     *         <code>ActiveModelArn</code>.
     */

    public String getActiveModelArn() {
        return this.activeModelArn;
    }

    /**
     * <p>
     * To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model version.
     * Do not set <code>TaskConfig</code> or <code>ModelType</code> if you specify an <code>ActiveModelArn</code>.
     * </p>
     * 
     * @param activeModelArn
     *        To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model
     *        version. Do not set <code>TaskConfig</code> or <code>ModelType</code> if you specify an
     *        <code>ActiveModelArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelRequest withActiveModelArn(String activeModelArn) {
        setActiveModelArn(activeModelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend the permissions required to access
     * the flywheel data in the data lake.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend the permissions required to
     *        access the flywheel data in the data lake.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend the permissions required to access
     * the flywheel data in the data lake.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend the permissions required to
     *         access the flywheel data in the data lake.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend the permissions required to access
     * the flywheel data in the data lake.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend the permissions required to
     *        access the flywheel data in the data lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Configuration about the model associated with the flywheel. You need to set <code>TaskConfig</code> if you are
     * creating a flywheel for a new model.
     * </p>
     * 
     * @param taskConfig
     *        Configuration about the model associated with the flywheel. You need to set <code>TaskConfig</code> if you
     *        are creating a flywheel for a new model.
     */

    public void setTaskConfig(TaskConfig taskConfig) {
        this.taskConfig = taskConfig;
    }

    /**
     * <p>
     * Configuration about the model associated with the flywheel. You need to set <code>TaskConfig</code> if you are
     * creating a flywheel for a new model.
     * </p>
     * 
     * @return Configuration about the model associated with the flywheel. You need to set <code>TaskConfig</code> if
     *         you are creating a flywheel for a new model.
     */

    public TaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    /**
     * <p>
     * Configuration about the model associated with the flywheel. You need to set <code>TaskConfig</code> if you are
     * creating a flywheel for a new model.
     * </p>
     * 
     * @param taskConfig
     *        Configuration about the model associated with the flywheel. You need to set <code>TaskConfig</code> if you
     *        are creating a flywheel for a new model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelRequest withTaskConfig(TaskConfig taskConfig) {
        setTaskConfig(taskConfig);
        return this;
    }

    /**
     * <p>
     * The model type. You need to set <code>ModelType</code> if you are creating a flywheel for a new model.
     * </p>
     * 
     * @param modelType
     *        The model type. You need to set <code>ModelType</code> if you are creating a flywheel for a new model.
     * @see ModelType
     */

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * The model type. You need to set <code>ModelType</code> if you are creating a flywheel for a new model.
     * </p>
     * 
     * @return The model type. You need to set <code>ModelType</code> if you are creating a flywheel for a new model.
     * @see ModelType
     */

    public String getModelType() {
        return this.modelType;
    }

    /**
     * <p>
     * The model type. You need to set <code>ModelType</code> if you are creating a flywheel for a new model.
     * </p>
     * 
     * @param modelType
     *        The model type. You need to set <code>ModelType</code> if you are creating a flywheel for a new model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelType
     */

    public CreateFlywheelRequest withModelType(String modelType) {
        setModelType(modelType);
        return this;
    }

    /**
     * <p>
     * The model type. You need to set <code>ModelType</code> if you are creating a flywheel for a new model.
     * </p>
     * 
     * @param modelType
     *        The model type. You need to set <code>ModelType</code> if you are creating a flywheel for a new model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelType
     */

    public CreateFlywheelRequest withModelType(ModelType modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an existing S3
     * bucket. The flywheel creates the data lake at this location.
     * </p>
     * 
     * @param dataLakeS3Uri
     *        Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an existing S3
     *        bucket. The flywheel creates the data lake at this location.
     */

    public void setDataLakeS3Uri(String dataLakeS3Uri) {
        this.dataLakeS3Uri = dataLakeS3Uri;
    }

    /**
     * <p>
     * Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an existing S3
     * bucket. The flywheel creates the data lake at this location.
     * </p>
     * 
     * @return Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an existing
     *         S3 bucket. The flywheel creates the data lake at this location.
     */

    public String getDataLakeS3Uri() {
        return this.dataLakeS3Uri;
    }

    /**
     * <p>
     * Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an existing S3
     * bucket. The flywheel creates the data lake at this location.
     * </p>
     * 
     * @param dataLakeS3Uri
     *        Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an existing S3
     *        bucket. The flywheel creates the data lake at this location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelRequest withDataLakeS3Uri(String dataLakeS3Uri) {
        setDataLakeS3Uri(dataLakeS3Uri);
        return this;
    }

    /**
     * <p>
     * Data security configurations.
     * </p>
     * 
     * @param dataSecurityConfig
     *        Data security configurations.
     */

    public void setDataSecurityConfig(DataSecurityConfig dataSecurityConfig) {
        this.dataSecurityConfig = dataSecurityConfig;
    }

    /**
     * <p>
     * Data security configurations.
     * </p>
     * 
     * @return Data security configurations.
     */

    public DataSecurityConfig getDataSecurityConfig() {
        return this.dataSecurityConfig;
    }

    /**
     * <p>
     * Data security configurations.
     * </p>
     * 
     * @param dataSecurityConfig
     *        Data security configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelRequest withDataSecurityConfig(DataSecurityConfig dataSecurityConfig) {
        setDataSecurityConfig(dataSecurityConfig);
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

    public CreateFlywheelRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags to associate with this flywheel.
     * </p>
     * 
     * @return The tags to associate with this flywheel.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with this flywheel.
     * </p>
     * 
     * @param tags
     *        The tags to associate with this flywheel.
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
     * The tags to associate with this flywheel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to associate with this flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelRequest withTags(Tag... tags) {
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
     * The tags to associate with this flywheel.
     * </p>
     * 
     * @param tags
     *        The tags to associate with this flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlywheelRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getFlywheelName() != null)
            sb.append("FlywheelName: ").append(getFlywheelName()).append(",");
        if (getActiveModelArn() != null)
            sb.append("ActiveModelArn: ").append(getActiveModelArn()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getTaskConfig() != null)
            sb.append("TaskConfig: ").append(getTaskConfig()).append(",");
        if (getModelType() != null)
            sb.append("ModelType: ").append(getModelType()).append(",");
        if (getDataLakeS3Uri() != null)
            sb.append("DataLakeS3Uri: ").append(getDataLakeS3Uri()).append(",");
        if (getDataSecurityConfig() != null)
            sb.append("DataSecurityConfig: ").append(getDataSecurityConfig()).append(",");
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

        if (obj instanceof CreateFlywheelRequest == false)
            return false;
        CreateFlywheelRequest other = (CreateFlywheelRequest) obj;
        if (other.getFlywheelName() == null ^ this.getFlywheelName() == null)
            return false;
        if (other.getFlywheelName() != null && other.getFlywheelName().equals(this.getFlywheelName()) == false)
            return false;
        if (other.getActiveModelArn() == null ^ this.getActiveModelArn() == null)
            return false;
        if (other.getActiveModelArn() != null && other.getActiveModelArn().equals(this.getActiveModelArn()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getTaskConfig() == null ^ this.getTaskConfig() == null)
            return false;
        if (other.getTaskConfig() != null && other.getTaskConfig().equals(this.getTaskConfig()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getDataLakeS3Uri() == null ^ this.getDataLakeS3Uri() == null)
            return false;
        if (other.getDataLakeS3Uri() != null && other.getDataLakeS3Uri().equals(this.getDataLakeS3Uri()) == false)
            return false;
        if (other.getDataSecurityConfig() == null ^ this.getDataSecurityConfig() == null)
            return false;
        if (other.getDataSecurityConfig() != null && other.getDataSecurityConfig().equals(this.getDataSecurityConfig()) == false)
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

        hashCode = prime * hashCode + ((getFlywheelName() == null) ? 0 : getFlywheelName().hashCode());
        hashCode = prime * hashCode + ((getActiveModelArn() == null) ? 0 : getActiveModelArn().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTaskConfig() == null) ? 0 : getTaskConfig().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode + ((getDataLakeS3Uri() == null) ? 0 : getDataLakeS3Uri().hashCode());
        hashCode = prime * hashCode + ((getDataSecurityConfig() == null) ? 0 : getDataSecurityConfig().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlywheelRequest clone() {
        return (CreateFlywheelRequest) super.clone();
    }

}
