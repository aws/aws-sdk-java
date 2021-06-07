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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAutoMLJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAutoMLJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies an Autopilot job. The name must be unique to your account and is case-insensitive.
     * </p>
     */
    private String autoMLJobName;
    /**
     * <p>
     * An array of channel objects that describes the input data and its location. Each channel is a named input source.
     * Similar to <code>InputDataConfig</code> supported by . Format(s) supported: CSV. Minimum of 500 rows.
     * </p>
     */
    private java.util.List<AutoMLChannel> inputDataConfig;
    /**
     * <p>
     * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job.
     * Format(s) supported: CSV.
     * </p>
     */
    private AutoMLOutputDataConfig outputDataConfig;
    /**
     * <p>
     * Defines the type of supervised learning available for the candidates. Options include:
     * <code>BinaryClassification</code>, <code>MulticlassClassification</code>, and <code>Regression</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development-problem-types.html">
     * Amazon SageMaker Autopilot problem types and algorithm support</a>.
     * </p>
     */
    private String problemType;
    /**
     * <p>
     * Defines the objective metric used to measure the predictive quality of an AutoML job. You provide an
     * <a>AutoMLJobObjective$MetricName</a> and Autopilot infers whether to minimize or maximize it.
     * </p>
     */
    private AutoMLJobObjective autoMLJobObjective;
    /**
     * <p>
     * Contains <code>CompletionCriteria</code> and <code>SecurityConfig</code> settings for the AutoML job.
     * </p>
     */
    private AutoMLJobConfig autoMLJobConfig;
    /**
     * <p>
     * The ARN of the role that is used to access the data.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Generates possible candidates without training the models. A candidate is a combination of data preprocessors,
     * algorithms, and algorithm parameter settings.
     * </p>
     */
    private Boolean generateCandidateDefinitionsOnly;
    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
     * </p>
     */
    private ModelDeployConfig modelDeployConfig;

    /**
     * <p>
     * Identifies an Autopilot job. The name must be unique to your account and is case-insensitive.
     * </p>
     * 
     * @param autoMLJobName
     *        Identifies an Autopilot job. The name must be unique to your account and is case-insensitive.
     */

    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * Identifies an Autopilot job. The name must be unique to your account and is case-insensitive.
     * </p>
     * 
     * @return Identifies an Autopilot job. The name must be unique to your account and is case-insensitive.
     */

    public String getAutoMLJobName() {
        return this.autoMLJobName;
    }

    /**
     * <p>
     * Identifies an Autopilot job. The name must be unique to your account and is case-insensitive.
     * </p>
     * 
     * @param autoMLJobName
     *        Identifies an Autopilot job. The name must be unique to your account and is case-insensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withAutoMLJobName(String autoMLJobName) {
        setAutoMLJobName(autoMLJobName);
        return this;
    }

    /**
     * <p>
     * An array of channel objects that describes the input data and its location. Each channel is a named input source.
     * Similar to <code>InputDataConfig</code> supported by . Format(s) supported: CSV. Minimum of 500 rows.
     * </p>
     * 
     * @return An array of channel objects that describes the input data and its location. Each channel is a named input
     *         source. Similar to <code>InputDataConfig</code> supported by . Format(s) supported: CSV. Minimum of 500
     *         rows.
     */

    public java.util.List<AutoMLChannel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of channel objects that describes the input data and its location. Each channel is a named input source.
     * Similar to <code>InputDataConfig</code> supported by . Format(s) supported: CSV. Minimum of 500 rows.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of channel objects that describes the input data and its location. Each channel is a named input
     *        source. Similar to <code>InputDataConfig</code> supported by . Format(s) supported: CSV. Minimum of 500
     *        rows.
     */

    public void setInputDataConfig(java.util.Collection<AutoMLChannel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<AutoMLChannel>(inputDataConfig);
    }

    /**
     * <p>
     * An array of channel objects that describes the input data and its location. Each channel is a named input source.
     * Similar to <code>InputDataConfig</code> supported by . Format(s) supported: CSV. Minimum of 500 rows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of channel objects that describes the input data and its location. Each channel is a named input
     *        source. Similar to <code>InputDataConfig</code> supported by . Format(s) supported: CSV. Minimum of 500
     *        rows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withInputDataConfig(AutoMLChannel... inputDataConfig) {
        if (this.inputDataConfig == null) {
            setInputDataConfig(new java.util.ArrayList<AutoMLChannel>(inputDataConfig.length));
        }
        for (AutoMLChannel ele : inputDataConfig) {
            this.inputDataConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of channel objects that describes the input data and its location. Each channel is a named input source.
     * Similar to <code>InputDataConfig</code> supported by . Format(s) supported: CSV. Minimum of 500 rows.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of channel objects that describes the input data and its location. Each channel is a named input
     *        source. Similar to <code>InputDataConfig</code> supported by . Format(s) supported: CSV. Minimum of 500
     *        rows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withInputDataConfig(java.util.Collection<AutoMLChannel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job.
     * Format(s) supported: CSV.
     * </p>
     * 
     * @param outputDataConfig
     *        Provides information about encryption and the Amazon S3 output path needed to store artifacts from an
     *        AutoML job. Format(s) supported: CSV.
     */

    public void setOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job.
     * Format(s) supported: CSV.
     * </p>
     * 
     * @return Provides information about encryption and the Amazon S3 output path needed to store artifacts from an
     *         AutoML job. Format(s) supported: CSV.
     */

    public AutoMLOutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job.
     * Format(s) supported: CSV.
     * </p>
     * 
     * @param outputDataConfig
     *        Provides information about encryption and the Amazon S3 output path needed to store artifacts from an
     *        AutoML job. Format(s) supported: CSV.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * Defines the type of supervised learning available for the candidates. Options include:
     * <code>BinaryClassification</code>, <code>MulticlassClassification</code>, and <code>Regression</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development-problem-types.html">
     * Amazon SageMaker Autopilot problem types and algorithm support</a>.
     * </p>
     * 
     * @param problemType
     *        Defines the type of supervised learning available for the candidates. Options include:
     *        <code>BinaryClassification</code>, <code>MulticlassClassification</code>, and <code>Regression</code>. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development-problem-types.html">
     *        Amazon SageMaker Autopilot problem types and algorithm support</a>.
     * @see ProblemType
     */

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * <p>
     * Defines the type of supervised learning available for the candidates. Options include:
     * <code>BinaryClassification</code>, <code>MulticlassClassification</code>, and <code>Regression</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development-problem-types.html">
     * Amazon SageMaker Autopilot problem types and algorithm support</a>.
     * </p>
     * 
     * @return Defines the type of supervised learning available for the candidates. Options include:
     *         <code>BinaryClassification</code>, <code>MulticlassClassification</code>, and <code>Regression</code>.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development-problem-types.html"
     *         > Amazon SageMaker Autopilot problem types and algorithm support</a>.
     * @see ProblemType
     */

    public String getProblemType() {
        return this.problemType;
    }

    /**
     * <p>
     * Defines the type of supervised learning available for the candidates. Options include:
     * <code>BinaryClassification</code>, <code>MulticlassClassification</code>, and <code>Regression</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development-problem-types.html">
     * Amazon SageMaker Autopilot problem types and algorithm support</a>.
     * </p>
     * 
     * @param problemType
     *        Defines the type of supervised learning available for the candidates. Options include:
     *        <code>BinaryClassification</code>, <code>MulticlassClassification</code>, and <code>Regression</code>. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development-problem-types.html">
     *        Amazon SageMaker Autopilot problem types and algorithm support</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public CreateAutoMLJobRequest withProblemType(String problemType) {
        setProblemType(problemType);
        return this;
    }

    /**
     * <p>
     * Defines the type of supervised learning available for the candidates. Options include:
     * <code>BinaryClassification</code>, <code>MulticlassClassification</code>, and <code>Regression</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development-problem-types.html">
     * Amazon SageMaker Autopilot problem types and algorithm support</a>.
     * </p>
     * 
     * @param problemType
     *        Defines the type of supervised learning available for the candidates. Options include:
     *        <code>BinaryClassification</code>, <code>MulticlassClassification</code>, and <code>Regression</code>. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development-problem-types.html">
     *        Amazon SageMaker Autopilot problem types and algorithm support</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public CreateAutoMLJobRequest withProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
        return this;
    }

    /**
     * <p>
     * Defines the objective metric used to measure the predictive quality of an AutoML job. You provide an
     * <a>AutoMLJobObjective$MetricName</a> and Autopilot infers whether to minimize or maximize it.
     * </p>
     * 
     * @param autoMLJobObjective
     *        Defines the objective metric used to measure the predictive quality of an AutoML job. You provide an
     *        <a>AutoMLJobObjective$MetricName</a> and Autopilot infers whether to minimize or maximize it.
     */

    public void setAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
    }

    /**
     * <p>
     * Defines the objective metric used to measure the predictive quality of an AutoML job. You provide an
     * <a>AutoMLJobObjective$MetricName</a> and Autopilot infers whether to minimize or maximize it.
     * </p>
     * 
     * @return Defines the objective metric used to measure the predictive quality of an AutoML job. You provide an
     *         <a>AutoMLJobObjective$MetricName</a> and Autopilot infers whether to minimize or maximize it.
     */

    public AutoMLJobObjective getAutoMLJobObjective() {
        return this.autoMLJobObjective;
    }

    /**
     * <p>
     * Defines the objective metric used to measure the predictive quality of an AutoML job. You provide an
     * <a>AutoMLJobObjective$MetricName</a> and Autopilot infers whether to minimize or maximize it.
     * </p>
     * 
     * @param autoMLJobObjective
     *        Defines the objective metric used to measure the predictive quality of an AutoML job. You provide an
     *        <a>AutoMLJobObjective$MetricName</a> and Autopilot infers whether to minimize or maximize it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        setAutoMLJobObjective(autoMLJobObjective);
        return this;
    }

    /**
     * <p>
     * Contains <code>CompletionCriteria</code> and <code>SecurityConfig</code> settings for the AutoML job.
     * </p>
     * 
     * @param autoMLJobConfig
     *        Contains <code>CompletionCriteria</code> and <code>SecurityConfig</code> settings for the AutoML job.
     */

    public void setAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        this.autoMLJobConfig = autoMLJobConfig;
    }

    /**
     * <p>
     * Contains <code>CompletionCriteria</code> and <code>SecurityConfig</code> settings for the AutoML job.
     * </p>
     * 
     * @return Contains <code>CompletionCriteria</code> and <code>SecurityConfig</code> settings for the AutoML job.
     */

    public AutoMLJobConfig getAutoMLJobConfig() {
        return this.autoMLJobConfig;
    }

    /**
     * <p>
     * Contains <code>CompletionCriteria</code> and <code>SecurityConfig</code> settings for the AutoML job.
     * </p>
     * 
     * @param autoMLJobConfig
     *        Contains <code>CompletionCriteria</code> and <code>SecurityConfig</code> settings for the AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        setAutoMLJobConfig(autoMLJobConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that is used to access the data.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that is used to access the data.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that is used to access the data.
     * </p>
     * 
     * @return The ARN of the role that is used to access the data.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that is used to access the data.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that is used to access the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Generates possible candidates without training the models. A candidate is a combination of data preprocessors,
     * algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        Generates possible candidates without training the models. A candidate is a combination of data
     *        preprocessors, algorithms, and algorithm parameter settings.
     */

    public void setGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        this.generateCandidateDefinitionsOnly = generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Generates possible candidates without training the models. A candidate is a combination of data preprocessors,
     * algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @return Generates possible candidates without training the models. A candidate is a combination of data
     *         preprocessors, algorithms, and algorithm parameter settings.
     */

    public Boolean getGenerateCandidateDefinitionsOnly() {
        return this.generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Generates possible candidates without training the models. A candidate is a combination of data preprocessors,
     * algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        Generates possible candidates without training the models. A candidate is a combination of data
     *        preprocessors, algorithms, and algorithm parameter settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        setGenerateCandidateDefinitionsOnly(generateCandidateDefinitionsOnly);
        return this;
    }

    /**
     * <p>
     * Generates possible candidates without training the models. A candidate is a combination of data preprocessors,
     * algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @return Generates possible candidates without training the models. A candidate is a combination of data
     *         preprocessors, algorithms, and algorithm parameter settings.
     */

    public Boolean isGenerateCandidateDefinitionsOnly() {
        return this.generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * 
     * @return Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and an optional value. Tag keys must be unique per resource.
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
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withTags(Tag... tags) {
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
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
     * </p>
     * 
     * @param modelDeployConfig
     *        Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
     */

    public void setModelDeployConfig(ModelDeployConfig modelDeployConfig) {
        this.modelDeployConfig = modelDeployConfig;
    }

    /**
     * <p>
     * Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
     * </p>
     * 
     * @return Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
     */

    public ModelDeployConfig getModelDeployConfig() {
        return this.modelDeployConfig;
    }

    /**
     * <p>
     * Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
     * </p>
     * 
     * @param modelDeployConfig
     *        Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withModelDeployConfig(ModelDeployConfig modelDeployConfig) {
        setModelDeployConfig(modelDeployConfig);
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
        if (getAutoMLJobName() != null)
            sb.append("AutoMLJobName: ").append(getAutoMLJobName()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getProblemType() != null)
            sb.append("ProblemType: ").append(getProblemType()).append(",");
        if (getAutoMLJobObjective() != null)
            sb.append("AutoMLJobObjective: ").append(getAutoMLJobObjective()).append(",");
        if (getAutoMLJobConfig() != null)
            sb.append("AutoMLJobConfig: ").append(getAutoMLJobConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getGenerateCandidateDefinitionsOnly() != null)
            sb.append("GenerateCandidateDefinitionsOnly: ").append(getGenerateCandidateDefinitionsOnly()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getModelDeployConfig() != null)
            sb.append("ModelDeployConfig: ").append(getModelDeployConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAutoMLJobRequest == false)
            return false;
        CreateAutoMLJobRequest other = (CreateAutoMLJobRequest) obj;
        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getProblemType() == null ^ this.getProblemType() == null)
            return false;
        if (other.getProblemType() != null && other.getProblemType().equals(this.getProblemType()) == false)
            return false;
        if (other.getAutoMLJobObjective() == null ^ this.getAutoMLJobObjective() == null)
            return false;
        if (other.getAutoMLJobObjective() != null && other.getAutoMLJobObjective().equals(this.getAutoMLJobObjective()) == false)
            return false;
        if (other.getAutoMLJobConfig() == null ^ this.getAutoMLJobConfig() == null)
            return false;
        if (other.getAutoMLJobConfig() != null && other.getAutoMLJobConfig().equals(this.getAutoMLJobConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() == null ^ this.getGenerateCandidateDefinitionsOnly() == null)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() != null
                && other.getGenerateCandidateDefinitionsOnly().equals(this.getGenerateCandidateDefinitionsOnly()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getModelDeployConfig() == null ^ this.getModelDeployConfig() == null)
            return false;
        if (other.getModelDeployConfig() != null && other.getModelDeployConfig().equals(this.getModelDeployConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getProblemType() == null) ? 0 : getProblemType().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobObjective() == null) ? 0 : getAutoMLJobObjective().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobConfig() == null) ? 0 : getAutoMLJobConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getGenerateCandidateDefinitionsOnly() == null) ? 0 : getGenerateCandidateDefinitionsOnly().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getModelDeployConfig() == null) ? 0 : getModelDeployConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateAutoMLJobRequest clone() {
        return (CreateAutoMLJobRequest) super.clone();
    }

}
