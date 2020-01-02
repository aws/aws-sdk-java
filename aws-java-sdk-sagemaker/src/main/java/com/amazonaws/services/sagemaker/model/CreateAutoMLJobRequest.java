/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Identifies an AutoPilot job. Must be unique to your account and is case-insensitive.
     * </p>
     */
    private String autoMLJobName;
    /**
     * <p>
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * </p>
     */
    private java.util.List<AutoMLChannel> inputDataConfig;
    /**
     * <p>
     * Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
     * </p>
     */
    private AutoMLOutputDataConfig outputDataConfig;
    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the candidates. Options include:
     * BinaryClassification, MulticlassClassification, and Regression.
     * </p>
     */
    private String problemType;
    /**
     * <p>
     * Defines the job's objective. You provide a MetricName and AutoML will infer minimize or maximize. If this is not
     * provided, the most commonly used ObjectiveMetric for problem type will be selected.
     * </p>
     */
    private AutoMLJobObjective autoMLJobObjective;
    /**
     * <p>
     * Contains CompletionCriteria and SecurityConfig.
     * </p>
     */
    private AutoMLJobConfig autoMLJobConfig;
    /**
     * <p>
     * The ARN of the role that will be used to access the data.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * This will generate possible candidates without training a model. A candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
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
     * Identifies an AutoPilot job. Must be unique to your account and is case-insensitive.
     * </p>
     * 
     * @param autoMLJobName
     *        Identifies an AutoPilot job. Must be unique to your account and is case-insensitive.
     */

    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * Identifies an AutoPilot job. Must be unique to your account and is case-insensitive.
     * </p>
     * 
     * @return Identifies an AutoPilot job. Must be unique to your account and is case-insensitive.
     */

    public String getAutoMLJobName() {
        return this.autoMLJobName;
    }

    /**
     * <p>
     * Identifies an AutoPilot job. Must be unique to your account and is case-insensitive.
     * </p>
     * 
     * @param autoMLJobName
     *        Identifies an AutoPilot job. Must be unique to your account and is case-insensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withAutoMLJobName(String autoMLJobName) {
        setAutoMLJobName(autoMLJobName);
        return this;
    }

    /**
     * <p>
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * </p>
     * 
     * @return Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     */

    public java.util.List<AutoMLChannel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * </p>
     * 
     * @param inputDataConfig
     *        Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
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
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
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
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * </p>
     * 
     * @param inputDataConfig
     *        Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withInputDataConfig(java.util.Collection<AutoMLChannel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
     * </p>
     * 
     * @param outputDataConfig
     *        Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
     */

    public void setOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
     * </p>
     * 
     * @return Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
     */

    public AutoMLOutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
     * </p>
     * 
     * @param outputDataConfig
     *        Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the candidates. Options include:
     * BinaryClassification, MulticlassClassification, and Regression.
     * </p>
     * 
     * @param problemType
     *        Defines the kind of preprocessing and algorithms intended for the candidates. Options include:
     *        BinaryClassification, MulticlassClassification, and Regression.
     * @see ProblemType
     */

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the candidates. Options include:
     * BinaryClassification, MulticlassClassification, and Regression.
     * </p>
     * 
     * @return Defines the kind of preprocessing and algorithms intended for the candidates. Options include:
     *         BinaryClassification, MulticlassClassification, and Regression.
     * @see ProblemType
     */

    public String getProblemType() {
        return this.problemType;
    }

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the candidates. Options include:
     * BinaryClassification, MulticlassClassification, and Regression.
     * </p>
     * 
     * @param problemType
     *        Defines the kind of preprocessing and algorithms intended for the candidates. Options include:
     *        BinaryClassification, MulticlassClassification, and Regression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public CreateAutoMLJobRequest withProblemType(String problemType) {
        setProblemType(problemType);
        return this;
    }

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the candidates. Options include:
     * BinaryClassification, MulticlassClassification, and Regression.
     * </p>
     * 
     * @param problemType
     *        Defines the kind of preprocessing and algorithms intended for the candidates. Options include:
     *        BinaryClassification, MulticlassClassification, and Regression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public CreateAutoMLJobRequest withProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
        return this;
    }

    /**
     * <p>
     * Defines the job's objective. You provide a MetricName and AutoML will infer minimize or maximize. If this is not
     * provided, the most commonly used ObjectiveMetric for problem type will be selected.
     * </p>
     * 
     * @param autoMLJobObjective
     *        Defines the job's objective. You provide a MetricName and AutoML will infer minimize or maximize. If this
     *        is not provided, the most commonly used ObjectiveMetric for problem type will be selected.
     */

    public void setAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
    }

    /**
     * <p>
     * Defines the job's objective. You provide a MetricName and AutoML will infer minimize or maximize. If this is not
     * provided, the most commonly used ObjectiveMetric for problem type will be selected.
     * </p>
     * 
     * @return Defines the job's objective. You provide a MetricName and AutoML will infer minimize or maximize. If this
     *         is not provided, the most commonly used ObjectiveMetric for problem type will be selected.
     */

    public AutoMLJobObjective getAutoMLJobObjective() {
        return this.autoMLJobObjective;
    }

    /**
     * <p>
     * Defines the job's objective. You provide a MetricName and AutoML will infer minimize or maximize. If this is not
     * provided, the most commonly used ObjectiveMetric for problem type will be selected.
     * </p>
     * 
     * @param autoMLJobObjective
     *        Defines the job's objective. You provide a MetricName and AutoML will infer minimize or maximize. If this
     *        is not provided, the most commonly used ObjectiveMetric for problem type will be selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        setAutoMLJobObjective(autoMLJobObjective);
        return this;
    }

    /**
     * <p>
     * Contains CompletionCriteria and SecurityConfig.
     * </p>
     * 
     * @param autoMLJobConfig
     *        Contains CompletionCriteria and SecurityConfig.
     */

    public void setAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        this.autoMLJobConfig = autoMLJobConfig;
    }

    /**
     * <p>
     * Contains CompletionCriteria and SecurityConfig.
     * </p>
     * 
     * @return Contains CompletionCriteria and SecurityConfig.
     */

    public AutoMLJobConfig getAutoMLJobConfig() {
        return this.autoMLJobConfig;
    }

    /**
     * <p>
     * Contains CompletionCriteria and SecurityConfig.
     * </p>
     * 
     * @param autoMLJobConfig
     *        Contains CompletionCriteria and SecurityConfig.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        setAutoMLJobConfig(autoMLJobConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that will be used to access the data.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that will be used to access the data.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that will be used to access the data.
     * </p>
     * 
     * @return The ARN of the role that will be used to access the data.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that will be used to access the data.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that will be used to access the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * This will generate possible candidates without training a model. A candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        This will generate possible candidates without training a model. A candidate is a combination of data
     *        preprocessors, algorithms, and algorithm parameter settings.
     */

    public void setGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        this.generateCandidateDefinitionsOnly = generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * This will generate possible candidates without training a model. A candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @return This will generate possible candidates without training a model. A candidate is a combination of data
     *         preprocessors, algorithms, and algorithm parameter settings.
     */

    public Boolean getGenerateCandidateDefinitionsOnly() {
        return this.generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * This will generate possible candidates without training a model. A candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        This will generate possible candidates without training a model. A candidate is a combination of data
     *        preprocessors, algorithms, and algorithm parameter settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobRequest withGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        setGenerateCandidateDefinitionsOnly(generateCandidateDefinitionsOnly);
        return this;
    }

    /**
     * <p>
     * This will generate possible candidates without training a model. A candidate is a combination of data
     * preprocessors, algorithms, and algorithm parameter settings.
     * </p>
     * 
     * @return This will generate possible candidates without training a model. A candidate is a combination of data
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
        return hashCode;
    }

    @Override
    public CreateAutoMLJobRequest clone() {
        return (CreateAutoMLJobRequest) super.clone();
    }

}
