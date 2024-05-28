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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of a version of a Amazon Rekognition project version.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectVersionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project version.
     * </p>
     */
    private String projectVersionArn;
    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The minimum number of inference units used by the model. Applies only to Custom Labels projects. For more
     * information, see <a>StartProjectVersion</a>.
     * </p>
     */
    private Integer minInferenceUnits;
    /**
     * <p>
     * The current status of the model version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The duration, in seconds, that you were billed for a successful training of the model version. This value is only
     * returned if the model version has been successfully trained.
     * </p>
     */
    private Long billableTrainingTimeInSeconds;
    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     */
    private java.util.Date trainingEndTimestamp;
    /**
     * <p>
     * The location where training results are saved.
     * </p>
     */
    private OutputConfig outputConfig;
    /**
     * <p>
     * Contains information about the training results.
     * </p>
     */
    private TrainingDataResult trainingDataResult;
    /**
     * <p>
     * Contains information about the testing results.
     * </p>
     */
    private TestingDataResult testingDataResult;
    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * </p>
     */
    private EvaluationResult evaluationResult;
    /**
     * <p>
     * The location of the summary manifest. The summary manifest provides aggregate data validation results for the
     * training and test datasets.
     * </p>
     */
    private GroundTruthManifest manifestSummary;
    /**
     * <p>
     * The identifer for the AWS Key Management Service key (AWS KMS key) that was used to encrypt the model during
     * training.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The maximum number of inference units Amazon Rekognition uses to auto-scale the model. Applies only to Custom
     * Labels projects. For more information, see <a>StartProjectVersion</a>.
     * </p>
     */
    private Integer maxInferenceUnits;
    /**
     * <p>
     * If the model version was copied from a different project, <code>SourceProjectVersionArn</code> contains the ARN
     * of the source model version.
     * </p>
     */
    private String sourceProjectVersionArn;
    /**
     * <p>
     * A user-provided description of the project version.
     * </p>
     */
    private String versionDescription;
    /**
     * <p>
     * The feature that was customized.
     * </p>
     */
    private String feature;
    /**
     * <p>
     * The base detection model version used to create the project version.
     * </p>
     */
    private String baseModelVersion;
    /**
     * <p>
     * Feature specific configuration that was applied during training.
     * </p>
     */
    private CustomizationFeatureConfig featureConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project version.
     * </p>
     * 
     * @param projectVersionArn
     *        The Amazon Resource Name (ARN) of the project version.
     */

    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project version.
     */

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project version.
     * </p>
     * 
     * @param projectVersionArn
     *        The Amazon Resource Name (ARN) of the project version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withProjectVersionArn(String projectVersionArn) {
        setProjectVersionArn(projectVersionArn);
        return this;
    }

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix datetime for the date and time that training started.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     * 
     * @return The Unix datetime for the date and time that training started.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for the date and time that training started.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix datetime for the date and time that training started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The minimum number of inference units used by the model. Applies only to Custom Labels projects. For more
     * information, see <a>StartProjectVersion</a>.
     * </p>
     * 
     * @param minInferenceUnits
     *        The minimum number of inference units used by the model. Applies only to Custom Labels projects. For more
     *        information, see <a>StartProjectVersion</a>.
     */

    public void setMinInferenceUnits(Integer minInferenceUnits) {
        this.minInferenceUnits = minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units used by the model. Applies only to Custom Labels projects. For more
     * information, see <a>StartProjectVersion</a>.
     * </p>
     * 
     * @return The minimum number of inference units used by the model. Applies only to Custom Labels projects. For more
     *         information, see <a>StartProjectVersion</a>.
     */

    public Integer getMinInferenceUnits() {
        return this.minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units used by the model. Applies only to Custom Labels projects. For more
     * information, see <a>StartProjectVersion</a>.
     * </p>
     * 
     * @param minInferenceUnits
     *        The minimum number of inference units used by the model. Applies only to Custom Labels projects. For more
     *        information, see <a>StartProjectVersion</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withMinInferenceUnits(Integer minInferenceUnits) {
        setMinInferenceUnits(minInferenceUnits);
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @see ProjectVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @return The current status of the model version.
     * @see ProjectVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectVersionStatus
     */

    public ProjectVersionDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectVersionStatus
     */

    public ProjectVersionDescription withStatus(ProjectVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     * 
     * @param statusMessage
     *        A descriptive message for an error or warning that occurred.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     * 
     * @return A descriptive message for an error or warning that occurred.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A descriptive message for an error or warning that occurred.
     * </p>
     * 
     * @param statusMessage
     *        A descriptive message for an error or warning that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, that you were billed for a successful training of the model version. This value is only
     * returned if the model version has been successfully trained.
     * </p>
     * 
     * @param billableTrainingTimeInSeconds
     *        The duration, in seconds, that you were billed for a successful training of the model version. This value
     *        is only returned if the model version has been successfully trained.
     */

    public void setBillableTrainingTimeInSeconds(Long billableTrainingTimeInSeconds) {
        this.billableTrainingTimeInSeconds = billableTrainingTimeInSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that you were billed for a successful training of the model version. This value is only
     * returned if the model version has been successfully trained.
     * </p>
     * 
     * @return The duration, in seconds, that you were billed for a successful training of the model version. This value
     *         is only returned if the model version has been successfully trained.
     */

    public Long getBillableTrainingTimeInSeconds() {
        return this.billableTrainingTimeInSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that you were billed for a successful training of the model version. This value is only
     * returned if the model version has been successfully trained.
     * </p>
     * 
     * @param billableTrainingTimeInSeconds
     *        The duration, in seconds, that you were billed for a successful training of the model version. This value
     *        is only returned if the model version has been successfully trained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withBillableTrainingTimeInSeconds(Long billableTrainingTimeInSeconds) {
        setBillableTrainingTimeInSeconds(billableTrainingTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     * 
     * @param trainingEndTimestamp
     *        The Unix date and time that training of the model ended.
     */

    public void setTrainingEndTimestamp(java.util.Date trainingEndTimestamp) {
        this.trainingEndTimestamp = trainingEndTimestamp;
    }

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     * 
     * @return The Unix date and time that training of the model ended.
     */

    public java.util.Date getTrainingEndTimestamp() {
        return this.trainingEndTimestamp;
    }

    /**
     * <p>
     * The Unix date and time that training of the model ended.
     * </p>
     * 
     * @param trainingEndTimestamp
     *        The Unix date and time that training of the model ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withTrainingEndTimestamp(java.util.Date trainingEndTimestamp) {
        setTrainingEndTimestamp(trainingEndTimestamp);
        return this;
    }

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     * 
     * @param outputConfig
     *        The location where training results are saved.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     * 
     * @return The location where training results are saved.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The location where training results are saved.
     * </p>
     * 
     * @param outputConfig
     *        The location where training results are saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * Contains information about the training results.
     * </p>
     * 
     * @param trainingDataResult
     *        Contains information about the training results.
     */

    public void setTrainingDataResult(TrainingDataResult trainingDataResult) {
        this.trainingDataResult = trainingDataResult;
    }

    /**
     * <p>
     * Contains information about the training results.
     * </p>
     * 
     * @return Contains information about the training results.
     */

    public TrainingDataResult getTrainingDataResult() {
        return this.trainingDataResult;
    }

    /**
     * <p>
     * Contains information about the training results.
     * </p>
     * 
     * @param trainingDataResult
     *        Contains information about the training results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withTrainingDataResult(TrainingDataResult trainingDataResult) {
        setTrainingDataResult(trainingDataResult);
        return this;
    }

    /**
     * <p>
     * Contains information about the testing results.
     * </p>
     * 
     * @param testingDataResult
     *        Contains information about the testing results.
     */

    public void setTestingDataResult(TestingDataResult testingDataResult) {
        this.testingDataResult = testingDataResult;
    }

    /**
     * <p>
     * Contains information about the testing results.
     * </p>
     * 
     * @return Contains information about the testing results.
     */

    public TestingDataResult getTestingDataResult() {
        return this.testingDataResult;
    }

    /**
     * <p>
     * Contains information about the testing results.
     * </p>
     * 
     * @param testingDataResult
     *        Contains information about the testing results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withTestingDataResult(TestingDataResult testingDataResult) {
        setTestingDataResult(testingDataResult);
        return this;
    }

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * </p>
     * 
     * @param evaluationResult
     *        The training results. <code>EvaluationResult</code> is only returned if training is successful.
     */

    public void setEvaluationResult(EvaluationResult evaluationResult) {
        this.evaluationResult = evaluationResult;
    }

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * </p>
     * 
     * @return The training results. <code>EvaluationResult</code> is only returned if training is successful.
     */

    public EvaluationResult getEvaluationResult() {
        return this.evaluationResult;
    }

    /**
     * <p>
     * The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * </p>
     * 
     * @param evaluationResult
     *        The training results. <code>EvaluationResult</code> is only returned if training is successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withEvaluationResult(EvaluationResult evaluationResult) {
        setEvaluationResult(evaluationResult);
        return this;
    }

    /**
     * <p>
     * The location of the summary manifest. The summary manifest provides aggregate data validation results for the
     * training and test datasets.
     * </p>
     * 
     * @param manifestSummary
     *        The location of the summary manifest. The summary manifest provides aggregate data validation results for
     *        the training and test datasets.
     */

    public void setManifestSummary(GroundTruthManifest manifestSummary) {
        this.manifestSummary = manifestSummary;
    }

    /**
     * <p>
     * The location of the summary manifest. The summary manifest provides aggregate data validation results for the
     * training and test datasets.
     * </p>
     * 
     * @return The location of the summary manifest. The summary manifest provides aggregate data validation results for
     *         the training and test datasets.
     */

    public GroundTruthManifest getManifestSummary() {
        return this.manifestSummary;
    }

    /**
     * <p>
     * The location of the summary manifest. The summary manifest provides aggregate data validation results for the
     * training and test datasets.
     * </p>
     * 
     * @param manifestSummary
     *        The location of the summary manifest. The summary manifest provides aggregate data validation results for
     *        the training and test datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withManifestSummary(GroundTruthManifest manifestSummary) {
        setManifestSummary(manifestSummary);
        return this;
    }

    /**
     * <p>
     * The identifer for the AWS Key Management Service key (AWS KMS key) that was used to encrypt the model during
     * training.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifer for the AWS Key Management Service key (AWS KMS key) that was used to encrypt the model
     *        during training.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifer for the AWS Key Management Service key (AWS KMS key) that was used to encrypt the model during
     * training.
     * </p>
     * 
     * @return The identifer for the AWS Key Management Service key (AWS KMS key) that was used to encrypt the model
     *         during training.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifer for the AWS Key Management Service key (AWS KMS key) that was used to encrypt the model during
     * training.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifer for the AWS Key Management Service key (AWS KMS key) that was used to encrypt the model
     *        during training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The maximum number of inference units Amazon Rekognition uses to auto-scale the model. Applies only to Custom
     * Labels projects. For more information, see <a>StartProjectVersion</a>.
     * </p>
     * 
     * @param maxInferenceUnits
     *        The maximum number of inference units Amazon Rekognition uses to auto-scale the model. Applies only to
     *        Custom Labels projects. For more information, see <a>StartProjectVersion</a>.
     */

    public void setMaxInferenceUnits(Integer maxInferenceUnits) {
        this.maxInferenceUnits = maxInferenceUnits;
    }

    /**
     * <p>
     * The maximum number of inference units Amazon Rekognition uses to auto-scale the model. Applies only to Custom
     * Labels projects. For more information, see <a>StartProjectVersion</a>.
     * </p>
     * 
     * @return The maximum number of inference units Amazon Rekognition uses to auto-scale the model. Applies only to
     *         Custom Labels projects. For more information, see <a>StartProjectVersion</a>.
     */

    public Integer getMaxInferenceUnits() {
        return this.maxInferenceUnits;
    }

    /**
     * <p>
     * The maximum number of inference units Amazon Rekognition uses to auto-scale the model. Applies only to Custom
     * Labels projects. For more information, see <a>StartProjectVersion</a>.
     * </p>
     * 
     * @param maxInferenceUnits
     *        The maximum number of inference units Amazon Rekognition uses to auto-scale the model. Applies only to
     *        Custom Labels projects. For more information, see <a>StartProjectVersion</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withMaxInferenceUnits(Integer maxInferenceUnits) {
        setMaxInferenceUnits(maxInferenceUnits);
        return this;
    }

    /**
     * <p>
     * If the model version was copied from a different project, <code>SourceProjectVersionArn</code> contains the ARN
     * of the source model version.
     * </p>
     * 
     * @param sourceProjectVersionArn
     *        If the model version was copied from a different project, <code>SourceProjectVersionArn</code> contains
     *        the ARN of the source model version.
     */

    public void setSourceProjectVersionArn(String sourceProjectVersionArn) {
        this.sourceProjectVersionArn = sourceProjectVersionArn;
    }

    /**
     * <p>
     * If the model version was copied from a different project, <code>SourceProjectVersionArn</code> contains the ARN
     * of the source model version.
     * </p>
     * 
     * @return If the model version was copied from a different project, <code>SourceProjectVersionArn</code> contains
     *         the ARN of the source model version.
     */

    public String getSourceProjectVersionArn() {
        return this.sourceProjectVersionArn;
    }

    /**
     * <p>
     * If the model version was copied from a different project, <code>SourceProjectVersionArn</code> contains the ARN
     * of the source model version.
     * </p>
     * 
     * @param sourceProjectVersionArn
     *        If the model version was copied from a different project, <code>SourceProjectVersionArn</code> contains
     *        the ARN of the source model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withSourceProjectVersionArn(String sourceProjectVersionArn) {
        setSourceProjectVersionArn(sourceProjectVersionArn);
        return this;
    }

    /**
     * <p>
     * A user-provided description of the project version.
     * </p>
     * 
     * @param versionDescription
     *        A user-provided description of the project version.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A user-provided description of the project version.
     * </p>
     * 
     * @return A user-provided description of the project version.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * A user-provided description of the project version.
     * </p>
     * 
     * @param versionDescription
     *        A user-provided description of the project version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
        return this;
    }

    /**
     * <p>
     * The feature that was customized.
     * </p>
     * 
     * @param feature
     *        The feature that was customized.
     * @see CustomizationFeature
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * The feature that was customized.
     * </p>
     * 
     * @return The feature that was customized.
     * @see CustomizationFeature
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * The feature that was customized.
     * </p>
     * 
     * @param feature
     *        The feature that was customized.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationFeature
     */

    public ProjectVersionDescription withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * The feature that was customized.
     * </p>
     * 
     * @param feature
     *        The feature that was customized.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationFeature
     */

    public ProjectVersionDescription withFeature(CustomizationFeature feature) {
        this.feature = feature.toString();
        return this;
    }

    /**
     * <p>
     * The base detection model version used to create the project version.
     * </p>
     * 
     * @param baseModelVersion
     *        The base detection model version used to create the project version.
     */

    public void setBaseModelVersion(String baseModelVersion) {
        this.baseModelVersion = baseModelVersion;
    }

    /**
     * <p>
     * The base detection model version used to create the project version.
     * </p>
     * 
     * @return The base detection model version used to create the project version.
     */

    public String getBaseModelVersion() {
        return this.baseModelVersion;
    }

    /**
     * <p>
     * The base detection model version used to create the project version.
     * </p>
     * 
     * @param baseModelVersion
     *        The base detection model version used to create the project version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withBaseModelVersion(String baseModelVersion) {
        setBaseModelVersion(baseModelVersion);
        return this;
    }

    /**
     * <p>
     * Feature specific configuration that was applied during training.
     * </p>
     * 
     * @param featureConfig
     *        Feature specific configuration that was applied during training.
     */

    public void setFeatureConfig(CustomizationFeatureConfig featureConfig) {
        this.featureConfig = featureConfig;
    }

    /**
     * <p>
     * Feature specific configuration that was applied during training.
     * </p>
     * 
     * @return Feature specific configuration that was applied during training.
     */

    public CustomizationFeatureConfig getFeatureConfig() {
        return this.featureConfig;
    }

    /**
     * <p>
     * Feature specific configuration that was applied during training.
     * </p>
     * 
     * @param featureConfig
     *        Feature specific configuration that was applied during training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectVersionDescription withFeatureConfig(CustomizationFeatureConfig featureConfig) {
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
        if (getProjectVersionArn() != null)
            sb.append("ProjectVersionArn: ").append(getProjectVersionArn()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getMinInferenceUnits() != null)
            sb.append("MinInferenceUnits: ").append(getMinInferenceUnits()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getBillableTrainingTimeInSeconds() != null)
            sb.append("BillableTrainingTimeInSeconds: ").append(getBillableTrainingTimeInSeconds()).append(",");
        if (getTrainingEndTimestamp() != null)
            sb.append("TrainingEndTimestamp: ").append(getTrainingEndTimestamp()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getTrainingDataResult() != null)
            sb.append("TrainingDataResult: ").append(getTrainingDataResult()).append(",");
        if (getTestingDataResult() != null)
            sb.append("TestingDataResult: ").append(getTestingDataResult()).append(",");
        if (getEvaluationResult() != null)
            sb.append("EvaluationResult: ").append(getEvaluationResult()).append(",");
        if (getManifestSummary() != null)
            sb.append("ManifestSummary: ").append(getManifestSummary()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getMaxInferenceUnits() != null)
            sb.append("MaxInferenceUnits: ").append(getMaxInferenceUnits()).append(",");
        if (getSourceProjectVersionArn() != null)
            sb.append("SourceProjectVersionArn: ").append(getSourceProjectVersionArn()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription()).append(",");
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getBaseModelVersion() != null)
            sb.append("BaseModelVersion: ").append(getBaseModelVersion()).append(",");
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

        if (obj instanceof ProjectVersionDescription == false)
            return false;
        ProjectVersionDescription other = (ProjectVersionDescription) obj;
        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getMinInferenceUnits() == null ^ this.getMinInferenceUnits() == null)
            return false;
        if (other.getMinInferenceUnits() != null && other.getMinInferenceUnits().equals(this.getMinInferenceUnits()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getBillableTrainingTimeInSeconds() == null ^ this.getBillableTrainingTimeInSeconds() == null)
            return false;
        if (other.getBillableTrainingTimeInSeconds() != null
                && other.getBillableTrainingTimeInSeconds().equals(this.getBillableTrainingTimeInSeconds()) == false)
            return false;
        if (other.getTrainingEndTimestamp() == null ^ this.getTrainingEndTimestamp() == null)
            return false;
        if (other.getTrainingEndTimestamp() != null && other.getTrainingEndTimestamp().equals(this.getTrainingEndTimestamp()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTrainingDataResult() == null ^ this.getTrainingDataResult() == null)
            return false;
        if (other.getTrainingDataResult() != null && other.getTrainingDataResult().equals(this.getTrainingDataResult()) == false)
            return false;
        if (other.getTestingDataResult() == null ^ this.getTestingDataResult() == null)
            return false;
        if (other.getTestingDataResult() != null && other.getTestingDataResult().equals(this.getTestingDataResult()) == false)
            return false;
        if (other.getEvaluationResult() == null ^ this.getEvaluationResult() == null)
            return false;
        if (other.getEvaluationResult() != null && other.getEvaluationResult().equals(this.getEvaluationResult()) == false)
            return false;
        if (other.getManifestSummary() == null ^ this.getManifestSummary() == null)
            return false;
        if (other.getManifestSummary() != null && other.getManifestSummary().equals(this.getManifestSummary()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getMaxInferenceUnits() == null ^ this.getMaxInferenceUnits() == null)
            return false;
        if (other.getMaxInferenceUnits() != null && other.getMaxInferenceUnits().equals(this.getMaxInferenceUnits()) == false)
            return false;
        if (other.getSourceProjectVersionArn() == null ^ this.getSourceProjectVersionArn() == null)
            return false;
        if (other.getSourceProjectVersionArn() != null && other.getSourceProjectVersionArn().equals(this.getSourceProjectVersionArn()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getBaseModelVersion() == null ^ this.getBaseModelVersion() == null)
            return false;
        if (other.getBaseModelVersion() != null && other.getBaseModelVersion().equals(this.getBaseModelVersion()) == false)
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

        hashCode = prime * hashCode + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMinInferenceUnits() == null) ? 0 : getMinInferenceUnits().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getBillableTrainingTimeInSeconds() == null) ? 0 : getBillableTrainingTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTrainingEndTimestamp() == null) ? 0 : getTrainingEndTimestamp().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataResult() == null) ? 0 : getTrainingDataResult().hashCode());
        hashCode = prime * hashCode + ((getTestingDataResult() == null) ? 0 : getTestingDataResult().hashCode());
        hashCode = prime * hashCode + ((getEvaluationResult() == null) ? 0 : getEvaluationResult().hashCode());
        hashCode = prime * hashCode + ((getManifestSummary() == null) ? 0 : getManifestSummary().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getMaxInferenceUnits() == null) ? 0 : getMaxInferenceUnits().hashCode());
        hashCode = prime * hashCode + ((getSourceProjectVersionArn() == null) ? 0 : getSourceProjectVersionArn().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getBaseModelVersion() == null) ? 0 : getBaseModelVersion().hashCode());
        hashCode = prime * hashCode + ((getFeatureConfig() == null) ? 0 : getFeatureConfig().hashCode());
        return hashCode;
    }

    @Override
    public ProjectVersionDescription clone() {
        try {
            return (ProjectVersionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ProjectVersionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
