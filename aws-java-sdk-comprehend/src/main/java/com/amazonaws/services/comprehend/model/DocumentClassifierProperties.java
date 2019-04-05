/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a document classifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DocumentClassifierProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentClassifierProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     */
    private String documentClassifierArn;
    /**
     * <p>
     * The language code for the language of the documents that the classifier was trained on.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The status of the document classifier. If the status is <code>TRAINED</code> the classifier is ready to use. If
     * the status is <code>FAILED</code> you can see additional information about why the classifier wasn't trained in
     * the <code>Message</code> field.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information about the status of the classifier.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The time that the document classifier was submitted for training.
     * </p>
     */
    private java.util.Date submitTime;
    /**
     * <p>
     * The time that training the document classifier completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Indicates the time when the training starts on documentation classifiers. You are billed for the time interval
     * between this time and the value of TrainingEndTime.
     * </p>
     */
    private java.util.Date trainingStartTime;
    /**
     * <p>
     * The time that training of the document classifier was completed. Indicates the time when the training completes
     * on documentation classifiers. You are billed for the time interval between this time and the value of
     * TrainingStartTime.
     * </p>
     */
    private java.util.Date trainingEndTime;
    /**
     * <p>
     * The input data configuration that you supplied when you created the document classifier for training.
     * </p>
     */
    private DocumentClassifierInputDataConfig inputDataConfig;
    /**
     * <p>
     * Provides output results configuration parameters for custom classifier jobs.
     * </p>
     */
    private DocumentClassifierOutputDataConfig outputDataConfig;
    /**
     * <p>
     * Information about the document classifier, including the number of documents used for training the classifier,
     * the number of documents used for test the classifier, and an accuracy rating.
     * </p>
     */
    private ClassifierMetadata classifierMetadata;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * 
     * @param documentClassifierArn
     *        The Amazon Resource Name (ARN) that identifies the document classifier.
     */

    public void setDocumentClassifierArn(String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the document classifier.
     */

    public String getDocumentClassifierArn() {
        return this.documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * 
     * @param documentClassifierArn
     *        The Amazon Resource Name (ARN) that identifies the document classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withDocumentClassifierArn(String documentClassifierArn) {
        setDocumentClassifierArn(documentClassifierArn);
        return this;
    }

    /**
     * <p>
     * The language code for the language of the documents that the classifier was trained on.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language of the documents that the classifier was trained on.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language of the documents that the classifier was trained on.
     * </p>
     * 
     * @return The language code for the language of the documents that the classifier was trained on.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code for the language of the documents that the classifier was trained on.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language of the documents that the classifier was trained on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DocumentClassifierProperties withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the language of the documents that the classifier was trained on.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language of the documents that the classifier was trained on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DocumentClassifierProperties withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the document classifier. If the status is <code>TRAINED</code> the classifier is ready to use. If
     * the status is <code>FAILED</code> you can see additional information about why the classifier wasn't trained in
     * the <code>Message</code> field.
     * </p>
     * 
     * @param status
     *        The status of the document classifier. If the status is <code>TRAINED</code> the classifier is ready to
     *        use. If the status is <code>FAILED</code> you can see additional information about why the classifier
     *        wasn't trained in the <code>Message</code> field.
     * @see ModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the document classifier. If the status is <code>TRAINED</code> the classifier is ready to use. If
     * the status is <code>FAILED</code> you can see additional information about why the classifier wasn't trained in
     * the <code>Message</code> field.
     * </p>
     * 
     * @return The status of the document classifier. If the status is <code>TRAINED</code> the classifier is ready to
     *         use. If the status is <code>FAILED</code> you can see additional information about why the classifier
     *         wasn't trained in the <code>Message</code> field.
     * @see ModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the document classifier. If the status is <code>TRAINED</code> the classifier is ready to use. If
     * the status is <code>FAILED</code> you can see additional information about why the classifier wasn't trained in
     * the <code>Message</code> field.
     * </p>
     * 
     * @param status
     *        The status of the document classifier. If the status is <code>TRAINED</code> the classifier is ready to
     *        use. If the status is <code>FAILED</code> you can see additional information about why the classifier
     *        wasn't trained in the <code>Message</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public DocumentClassifierProperties withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the document classifier. If the status is <code>TRAINED</code> the classifier is ready to use. If
     * the status is <code>FAILED</code> you can see additional information about why the classifier wasn't trained in
     * the <code>Message</code> field.
     * </p>
     * 
     * @param status
     *        The status of the document classifier. If the status is <code>TRAINED</code> the classifier is ready to
     *        use. If the status is <code>FAILED</code> you can see additional information about why the classifier
     *        wasn't trained in the <code>Message</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public DocumentClassifierProperties withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the status of the classifier.
     * </p>
     * 
     * @param message
     *        Additional information about the status of the classifier.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Additional information about the status of the classifier.
     * </p>
     * 
     * @return Additional information about the status of the classifier.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Additional information about the status of the classifier.
     * </p>
     * 
     * @param message
     *        Additional information about the status of the classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The time that the document classifier was submitted for training.
     * </p>
     * 
     * @param submitTime
     *        The time that the document classifier was submitted for training.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the document classifier was submitted for training.
     * </p>
     * 
     * @return The time that the document classifier was submitted for training.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * The time that the document classifier was submitted for training.
     * </p>
     * 
     * @param submitTime
     *        The time that the document classifier was submitted for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
        return this;
    }

    /**
     * <p>
     * The time that training the document classifier completed.
     * </p>
     * 
     * @param endTime
     *        The time that training the document classifier completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that training the document classifier completed.
     * </p>
     * 
     * @return The time that training the document classifier completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that training the document classifier completed.
     * </p>
     * 
     * @param endTime
     *        The time that training the document classifier completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time when the training starts on documentation classifiers. You are billed for the time interval
     * between this time and the value of TrainingEndTime.
     * </p>
     * 
     * @param trainingStartTime
     *        Indicates the time when the training starts on documentation classifiers. You are billed for the time
     *        interval between this time and the value of TrainingEndTime.
     */

    public void setTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training starts on documentation classifiers. You are billed for the time interval
     * between this time and the value of TrainingEndTime.
     * </p>
     * 
     * @return Indicates the time when the training starts on documentation classifiers. You are billed for the time
     *         interval between this time and the value of TrainingEndTime.
     */

    public java.util.Date getTrainingStartTime() {
        return this.trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training starts on documentation classifiers. You are billed for the time interval
     * between this time and the value of TrainingEndTime.
     * </p>
     * 
     * @param trainingStartTime
     *        Indicates the time when the training starts on documentation classifiers. You are billed for the time
     *        interval between this time and the value of TrainingEndTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withTrainingStartTime(java.util.Date trainingStartTime) {
        setTrainingStartTime(trainingStartTime);
        return this;
    }

    /**
     * <p>
     * The time that training of the document classifier was completed. Indicates the time when the training completes
     * on documentation classifiers. You are billed for the time interval between this time and the value of
     * TrainingStartTime.
     * </p>
     * 
     * @param trainingEndTime
     *        The time that training of the document classifier was completed. Indicates the time when the training
     *        completes on documentation classifiers. You are billed for the time interval between this time and the
     *        value of TrainingStartTime.
     */

    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * The time that training of the document classifier was completed. Indicates the time when the training completes
     * on documentation classifiers. You are billed for the time interval between this time and the value of
     * TrainingStartTime.
     * </p>
     * 
     * @return The time that training of the document classifier was completed. Indicates the time when the training
     *         completes on documentation classifiers. You are billed for the time interval between this time and the
     *         value of TrainingStartTime.
     */

    public java.util.Date getTrainingEndTime() {
        return this.trainingEndTime;
    }

    /**
     * <p>
     * The time that training of the document classifier was completed. Indicates the time when the training completes
     * on documentation classifiers. You are billed for the time interval between this time and the value of
     * TrainingStartTime.
     * </p>
     * 
     * @param trainingEndTime
     *        The time that training of the document classifier was completed. Indicates the time when the training
     *        completes on documentation classifiers. You are billed for the time interval between this time and the
     *        value of TrainingStartTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withTrainingEndTime(java.util.Date trainingEndTime) {
        setTrainingEndTime(trainingEndTime);
        return this;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the document classifier for training.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration that you supplied when you created the document classifier for training.
     */

    public void setInputDataConfig(DocumentClassifierInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the document classifier for training.
     * </p>
     * 
     * @return The input data configuration that you supplied when you created the document classifier for training.
     */

    public DocumentClassifierInputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the document classifier for training.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration that you supplied when you created the document classifier for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withInputDataConfig(DocumentClassifierInputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Provides output results configuration parameters for custom classifier jobs.
     * </p>
     * 
     * @param outputDataConfig
     *        Provides output results configuration parameters for custom classifier jobs.
     */

    public void setOutputDataConfig(DocumentClassifierOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Provides output results configuration parameters for custom classifier jobs.
     * </p>
     * 
     * @return Provides output results configuration parameters for custom classifier jobs.
     */

    public DocumentClassifierOutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Provides output results configuration parameters for custom classifier jobs.
     * </p>
     * 
     * @param outputDataConfig
     *        Provides output results configuration parameters for custom classifier jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withOutputDataConfig(DocumentClassifierOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * Information about the document classifier, including the number of documents used for training the classifier,
     * the number of documents used for test the classifier, and an accuracy rating.
     * </p>
     * 
     * @param classifierMetadata
     *        Information about the document classifier, including the number of documents used for training the
     *        classifier, the number of documents used for test the classifier, and an accuracy rating.
     */

    public void setClassifierMetadata(ClassifierMetadata classifierMetadata) {
        this.classifierMetadata = classifierMetadata;
    }

    /**
     * <p>
     * Information about the document classifier, including the number of documents used for training the classifier,
     * the number of documents used for test the classifier, and an accuracy rating.
     * </p>
     * 
     * @return Information about the document classifier, including the number of documents used for training the
     *         classifier, the number of documents used for test the classifier, and an accuracy rating.
     */

    public ClassifierMetadata getClassifierMetadata() {
        return this.classifierMetadata;
    }

    /**
     * <p>
     * Information about the document classifier, including the number of documents used for training the classifier,
     * the number of documents used for test the classifier, and an accuracy rating.
     * </p>
     * 
     * @param classifierMetadata
     *        Information about the document classifier, including the number of documents used for training the
     *        classifier, the number of documents used for test the classifier, and an accuracy rating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withClassifierMetadata(ClassifierMetadata classifierMetadata) {
        setClassifierMetadata(classifierMetadata);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend
     *        read access to your input data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon
     *         Comprehend read access to your input data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend
     *        read access to your input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the
     *         storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId
     *         can be either of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierProperties withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
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
        if (getDocumentClassifierArn() != null)
            sb.append("DocumentClassifierArn: ").append(getDocumentClassifierArn()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getTrainingStartTime() != null)
            sb.append("TrainingStartTime: ").append(getTrainingStartTime()).append(",");
        if (getTrainingEndTime() != null)
            sb.append("TrainingEndTime: ").append(getTrainingEndTime()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getClassifierMetadata() != null)
            sb.append("ClassifierMetadata: ").append(getClassifierMetadata()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentClassifierProperties == false)
            return false;
        DocumentClassifierProperties other = (DocumentClassifierProperties) obj;
        if (other.getDocumentClassifierArn() == null ^ this.getDocumentClassifierArn() == null)
            return false;
        if (other.getDocumentClassifierArn() != null && other.getDocumentClassifierArn().equals(this.getDocumentClassifierArn()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTrainingStartTime() == null ^ this.getTrainingStartTime() == null)
            return false;
        if (other.getTrainingStartTime() != null && other.getTrainingStartTime().equals(this.getTrainingStartTime()) == false)
            return false;
        if (other.getTrainingEndTime() == null ^ this.getTrainingEndTime() == null)
            return false;
        if (other.getTrainingEndTime() != null && other.getTrainingEndTime().equals(this.getTrainingEndTime()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getClassifierMetadata() == null ^ this.getClassifierMetadata() == null)
            return false;
        if (other.getClassifierMetadata() != null && other.getClassifierMetadata().equals(this.getClassifierMetadata()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentClassifierArn() == null) ? 0 : getDocumentClassifierArn().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingStartTime() == null) ? 0 : getTrainingStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingEndTime() == null) ? 0 : getTrainingEndTime().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getClassifierMetadata() == null) ? 0 : getClassifierMetadata().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public DocumentClassifierProperties clone() {
        try {
            return (DocumentClassifierProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DocumentClassifierPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
