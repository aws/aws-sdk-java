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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Amazon Rekognition project that will manage the project version you want to train.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * A name for the version of the project version. This value must be unique.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The bucket can be any S3 bucket in your AWS
     * account. You need <code>s3:PutObject</code> permission on the bucket.
     * </p>
     */
    private OutputConfig outputConfig;
    /**
     * <p>
     * Specifies an external manifest that the services uses to train the project version. If you specify
     * <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     * associated datasets.
     * </p>
     */
    private TrainingData trainingData;
    /**
     * <p>
     * Specifies an external manifest that the service uses to test the project version. If you specify
     * <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     * associated datasets.
     * </p>
     */
    private TestingData testingData;
    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the project version.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training images, test images, and manifest files copied into the service for the project version. Your
     * source images are unaffected. The key is also used to encrypt training results and manifest files written to the
     * output Amazon S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A description applied to the project version being created.
     * </p>
     */
    private String versionDescription;
    /**
     * <p>
     * Feature-specific configuration of the training job. If the job configuration does not match the feature type
     * associated with the project, an InvalidParameterException is returned.
     * </p>
     */
    private CustomizationFeatureConfig featureConfig;

    /**
     * <p>
     * The ARN of the Amazon Rekognition project that will manage the project version you want to train.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the Amazon Rekognition project that will manage the project version you want to train.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition project that will manage the project version you want to train.
     * </p>
     * 
     * @return The ARN of the Amazon Rekognition project that will manage the project version you want to train.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition project that will manage the project version you want to train.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the Amazon Rekognition project that will manage the project version you want to train.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * A name for the version of the project version. This value must be unique.
     * </p>
     * 
     * @param versionName
     *        A name for the version of the project version. This value must be unique.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * A name for the version of the project version. This value must be unique.
     * </p>
     * 
     * @return A name for the version of the project version. This value must be unique.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * A name for the version of the project version. This value must be unique.
     * </p>
     * 
     * @param versionName
     *        A name for the version of the project version. This value must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The bucket can be any S3 bucket in your AWS
     * account. You need <code>s3:PutObject</code> permission on the bucket.
     * </p>
     * 
     * @param outputConfig
     *        The Amazon S3 bucket location to store the results of training. The bucket can be any S3 bucket in your
     *        AWS account. You need <code>s3:PutObject</code> permission on the bucket.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The bucket can be any S3 bucket in your AWS
     * account. You need <code>s3:PutObject</code> permission on the bucket.
     * </p>
     * 
     * @return The Amazon S3 bucket location to store the results of training. The bucket can be any S3 bucket in your
     *         AWS account. You need <code>s3:PutObject</code> permission on the bucket.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The bucket can be any S3 bucket in your AWS
     * account. You need <code>s3:PutObject</code> permission on the bucket.
     * </p>
     * 
     * @param outputConfig
     *        The Amazon S3 bucket location to store the results of training. The bucket can be any S3 bucket in your
     *        AWS account. You need <code>s3:PutObject</code> permission on the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the project version. If you specify
     * <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     * associated datasets.
     * </p>
     * 
     * @param trainingData
     *        Specifies an external manifest that the services uses to train the project version. If you specify
     *        <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     *        associated datasets.
     */

    public void setTrainingData(TrainingData trainingData) {
        this.trainingData = trainingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the project version. If you specify
     * <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     * associated datasets.
     * </p>
     * 
     * @return Specifies an external manifest that the services uses to train the project version. If you specify
     *         <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     *         associated datasets.
     */

    public TrainingData getTrainingData() {
        return this.trainingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the project version. If you specify
     * <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     * associated datasets.
     * </p>
     * 
     * @param trainingData
     *        Specifies an external manifest that the services uses to train the project version. If you specify
     *        <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     *        associated datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withTrainingData(TrainingData trainingData) {
        setTrainingData(trainingData);
        return this;
    }

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the project version. If you specify
     * <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     * associated datasets.
     * </p>
     * 
     * @param testingData
     *        Specifies an external manifest that the service uses to test the project version. If you specify
     *        <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     *        associated datasets.
     */

    public void setTestingData(TestingData testingData) {
        this.testingData = testingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the project version. If you specify
     * <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     * associated datasets.
     * </p>
     * 
     * @return Specifies an external manifest that the service uses to test the project version. If you specify
     *         <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     *         associated datasets.
     */

    public TestingData getTestingData() {
        return this.testingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the project version. If you specify
     * <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     * associated datasets.
     * </p>
     * 
     * @param testingData
     *        Specifies an external manifest that the service uses to test the project version. If you specify
     *        <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     *        associated datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withTestingData(TestingData testingData) {
        setTestingData(testingData);
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the project version.
     * </p>
     * 
     * @return A set of tags (key-value pairs) that you want to attach to the project version.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the project version.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the project version.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the project version.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the project version.
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
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training images, test images, and manifest files copied into the service for the project version. Your
     * source images are unaffected. The key is also used to encrypt training results and manifest files written to the
     * output Amazon S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource
     *        Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is
     *        used to encrypt training images, test images, and manifest files copied into the service for the project
     *        version. Your source images are unaffected. The key is also used to encrypt training results and manifest
     *        files written to the output Amazon S3 bucket (<code>OutputConfig</code>).</p>
     *        <p>
     *        If you choose to use your own KMS key, you need the following permissions on the KMS key.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        kms:CreateGrant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:DescribeKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:GenerateDataKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:Decrypt
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using
     *        a key that AWS owns and manages.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training images, test images, and manifest files copied into the service for the project version. Your
     * source images are unaffected. The key is also used to encrypt training results and manifest files written to the
     * output Amazon S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     * 
     * @return The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource
     *         Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key
     *         is used to encrypt training images, test images, and manifest files copied into the service for the
     *         project version. Your source images are unaffected. The key is also used to encrypt training results and
     *         manifest files written to the output Amazon S3 bucket (<code>OutputConfig</code>).</p>
     *         <p>
     *         If you choose to use your own KMS key, you need the following permissions on the KMS key.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         kms:CreateGrant
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:DescribeKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:GenerateDataKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:Decrypt
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted
     *         using a key that AWS owns and manages.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training images, test images, and manifest files copied into the service for the project version. Your
     * source images are unaffected. The key is also used to encrypt training results and manifest files written to the
     * output Amazon S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource
     *        Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is
     *        used to encrypt training images, test images, and manifest files copied into the service for the project
     *        version. Your source images are unaffected. The key is also used to encrypt training results and manifest
     *        files written to the output Amazon S3 bucket (<code>OutputConfig</code>).</p>
     *        <p>
     *        If you choose to use your own KMS key, you need the following permissions on the KMS key.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        kms:CreateGrant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:DescribeKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:GenerateDataKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:Decrypt
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using
     *        a key that AWS owns and manages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A description applied to the project version being created.
     * </p>
     * 
     * @param versionDescription
     *        A description applied to the project version being created.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description applied to the project version being created.
     * </p>
     * 
     * @return A description applied to the project version being created.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * A description applied to the project version being created.
     * </p>
     * 
     * @param versionDescription
     *        A description applied to the project version being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
        return this;
    }

    /**
     * <p>
     * Feature-specific configuration of the training job. If the job configuration does not match the feature type
     * associated with the project, an InvalidParameterException is returned.
     * </p>
     * 
     * @param featureConfig
     *        Feature-specific configuration of the training job. If the job configuration does not match the feature
     *        type associated with the project, an InvalidParameterException is returned.
     */

    public void setFeatureConfig(CustomizationFeatureConfig featureConfig) {
        this.featureConfig = featureConfig;
    }

    /**
     * <p>
     * Feature-specific configuration of the training job. If the job configuration does not match the feature type
     * associated with the project, an InvalidParameterException is returned.
     * </p>
     * 
     * @return Feature-specific configuration of the training job. If the job configuration does not match the feature
     *         type associated with the project, an InvalidParameterException is returned.
     */

    public CustomizationFeatureConfig getFeatureConfig() {
        return this.featureConfig;
    }

    /**
     * <p>
     * Feature-specific configuration of the training job. If the job configuration does not match the feature type
     * associated with the project, an InvalidParameterException is returned.
     * </p>
     * 
     * @param featureConfig
     *        Feature-specific configuration of the training job. If the job configuration does not match the feature
     *        type associated with the project, an InvalidParameterException is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withFeatureConfig(CustomizationFeatureConfig featureConfig) {
        setFeatureConfig(featureConfig);
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
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription()).append(",");
        if (getFeatureConfig() != null)
            sb.append("FeatureConfig: ").append(getFeatureConfig());
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
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getFeatureConfig() == null ^ this.getFeatureConfig() == null)
            return false;
        if (other.getFeatureConfig() != null && other.getFeatureConfig().equals(this.getFeatureConfig()) == false)
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
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getFeatureConfig() == null) ? 0 : getFeatureConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectVersionRequest clone() {
        return (CreateProjectVersionRequest) super.clone();
    }

}
