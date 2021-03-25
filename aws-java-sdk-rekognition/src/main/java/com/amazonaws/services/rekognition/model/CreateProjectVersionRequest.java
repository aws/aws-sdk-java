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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The Amazon S3 location to store the results of training.
     * </p>
     */
    private OutputConfig outputConfig;
    /**
     * <p>
     * The dataset to use for training.
     * </p>
     */
    private TrainingData trainingData;
    /**
     * <p>
     * The dataset to use for testing.
     * </p>
     */
    private TestingData testingData;
    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * </p>
     * 
     * @return The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * 
     * @param versionName
     *        A name for the version of the model. This value must be unique.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * 
     * @return A name for the version of the model. This value must be unique.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * 
     * @param versionName
     *        A name for the version of the model. This value must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location to store the results of training.
     * </p>
     * 
     * @param outputConfig
     *        The Amazon S3 location to store the results of training.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 location to store the results of training.
     * </p>
     * 
     * @return The Amazon S3 location to store the results of training.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 location to store the results of training.
     * </p>
     * 
     * @param outputConfig
     *        The Amazon S3 location to store the results of training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The dataset to use for training.
     * </p>
     * 
     * @param trainingData
     *        The dataset to use for training.
     */

    public void setTrainingData(TrainingData trainingData) {
        this.trainingData = trainingData;
    }

    /**
     * <p>
     * The dataset to use for training.
     * </p>
     * 
     * @return The dataset to use for training.
     */

    public TrainingData getTrainingData() {
        return this.trainingData;
    }

    /**
     * <p>
     * The dataset to use for training.
     * </p>
     * 
     * @param trainingData
     *        The dataset to use for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withTrainingData(TrainingData trainingData) {
        setTrainingData(trainingData);
        return this;
    }

    /**
     * <p>
     * The dataset to use for testing.
     * </p>
     * 
     * @param testingData
     *        The dataset to use for testing.
     */

    public void setTestingData(TestingData testingData) {
        this.testingData = testingData;
    }

    /**
     * <p>
     * The dataset to use for testing.
     * </p>
     * 
     * @return The dataset to use for testing.
     */

    public TestingData getTestingData() {
        return this.testingData;
    }

    /**
     * <p>
     * The dataset to use for testing.
     * </p>
     * 
     * @param testingData
     *        The dataset to use for testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withTestingData(TestingData testingData) {
        setTestingData(testingData);
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * 
     * @return A set of tags (key-value pairs) that you want to attach to the model.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the model.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateProjectVersionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest clearTagsEntries() {
        this.tags = null;
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getTrainingData() != null)
            sb.append("TrainingData: ").append(getTrainingData()).append(",");
        if (getTestingData() != null)
            sb.append("TestingData: ").append(getTestingData()).append(",");
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

        if (obj instanceof CreateProjectVersionRequest == false)
            return false;
        CreateProjectVersionRequest other = (CreateProjectVersionRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTrainingData() == null ^ this.getTrainingData() == null)
            return false;
        if (other.getTrainingData() != null && other.getTrainingData().equals(this.getTrainingData()) == false)
            return false;
        if (other.getTestingData() == null ^ this.getTestingData() == null)
            return false;
        if (other.getTestingData() != null && other.getTestingData().equals(this.getTestingData()) == false)
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

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingData() == null) ? 0 : getTrainingData().hashCode());
        hashCode = prime * hashCode + ((getTestingData() == null) ? 0 : getTestingData().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectVersionRequest clone() {
        return (CreateProjectVersionRequest) super.clone();
    }

}
