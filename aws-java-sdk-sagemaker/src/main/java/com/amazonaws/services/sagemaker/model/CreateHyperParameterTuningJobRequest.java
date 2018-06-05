/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHyperParameterTuningJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHyperParameterTuningJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning job
     * launches. The name must be unique within the same AWS account and AWS Region. Names are not case sensitive, and
     * must be between 1-32 characters.
     * </p>
     */
    private String hyperParameterTuningJobName;
    /**
     * <p>
     * The object that describes the tuning job, including the search strategy, metric used to evaluate training jobs,
     * ranges of parameters to search, and resource limits for the tuning job.
     * </p>
     */
    private HyperParameterTuningJobConfig hyperParameterTuningJobConfig;
    /**
     * <p>
     * The object that describes the training jobs that this tuning job launches, including static hyperparameters,
     * input data configuration, output data configuration, resource configuration, and stopping condition.
     * </p>
     */
    private HyperParameterTrainingJobDefinition trainingJobDefinition;
    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="http://docs.aws.amazon.com//awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning job
     * launches. The name must be unique within the same AWS account and AWS Region. Names are not case sensitive, and
     * must be between 1-32 characters.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning
     *        job launches. The name must be unique within the same AWS account and AWS Region. Names are not case
     *        sensitive, and must be between 1-32 characters.
     */

    public void setHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning job
     * launches. The name must be unique within the same AWS account and AWS Region. Names are not case sensitive, and
     * must be between 1-32 characters.
     * </p>
     * 
     * @return The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning
     *         job launches. The name must be unique within the same AWS account and AWS Region. Names are not case
     *         sensitive, and must be between 1-32 characters.
     */

    public String getHyperParameterTuningJobName() {
        return this.hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning job
     * launches. The name must be unique within the same AWS account and AWS Region. Names are not case sensitive, and
     * must be between 1-32 characters.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning
     *        job launches. The name must be unique within the same AWS account and AWS Region. Names are not case
     *        sensitive, and must be between 1-32 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHyperParameterTuningJobRequest withHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        setHyperParameterTuningJobName(hyperParameterTuningJobName);
        return this;
    }

    /**
     * <p>
     * The object that describes the tuning job, including the search strategy, metric used to evaluate training jobs,
     * ranges of parameters to search, and resource limits for the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobConfig
     *        The object that describes the tuning job, including the search strategy, metric used to evaluate training
     *        jobs, ranges of parameters to search, and resource limits for the tuning job.
     */

    public void setHyperParameterTuningJobConfig(HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        this.hyperParameterTuningJobConfig = hyperParameterTuningJobConfig;
    }

    /**
     * <p>
     * The object that describes the tuning job, including the search strategy, metric used to evaluate training jobs,
     * ranges of parameters to search, and resource limits for the tuning job.
     * </p>
     * 
     * @return The object that describes the tuning job, including the search strategy, metric used to evaluate training
     *         jobs, ranges of parameters to search, and resource limits for the tuning job.
     */

    public HyperParameterTuningJobConfig getHyperParameterTuningJobConfig() {
        return this.hyperParameterTuningJobConfig;
    }

    /**
     * <p>
     * The object that describes the tuning job, including the search strategy, metric used to evaluate training jobs,
     * ranges of parameters to search, and resource limits for the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobConfig
     *        The object that describes the tuning job, including the search strategy, metric used to evaluate training
     *        jobs, ranges of parameters to search, and resource limits for the tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHyperParameterTuningJobRequest withHyperParameterTuningJobConfig(HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        setHyperParameterTuningJobConfig(hyperParameterTuningJobConfig);
        return this;
    }

    /**
     * <p>
     * The object that describes the training jobs that this tuning job launches, including static hyperparameters,
     * input data configuration, output data configuration, resource configuration, and stopping condition.
     * </p>
     * 
     * @param trainingJobDefinition
     *        The object that describes the training jobs that this tuning job launches, including static
     *        hyperparameters, input data configuration, output data configuration, resource configuration, and stopping
     *        condition.
     */

    public void setTrainingJobDefinition(HyperParameterTrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
    }

    /**
     * <p>
     * The object that describes the training jobs that this tuning job launches, including static hyperparameters,
     * input data configuration, output data configuration, resource configuration, and stopping condition.
     * </p>
     * 
     * @return The object that describes the training jobs that this tuning job launches, including static
     *         hyperparameters, input data configuration, output data configuration, resource configuration, and
     *         stopping condition.
     */

    public HyperParameterTrainingJobDefinition getTrainingJobDefinition() {
        return this.trainingJobDefinition;
    }

    /**
     * <p>
     * The object that describes the training jobs that this tuning job launches, including static hyperparameters,
     * input data configuration, output data configuration, resource configuration, and stopping condition.
     * </p>
     * 
     * @param trainingJobDefinition
     *        The object that describes the training jobs that this tuning job launches, including static
     *        hyperparameters, input data configuration, output data configuration, resource configuration, and stopping
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHyperParameterTuningJobRequest withTrainingJobDefinition(HyperParameterTrainingJobDefinition trainingJobDefinition) {
        setTrainingJobDefinition(trainingJobDefinition);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="http://docs.aws.amazon.com//awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for
     *         example, by purpose, owner, or environment. For more information, see <a href=
     *         "http://docs.aws.amazon.com//awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     *         Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="http://docs.aws.amazon.com//awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for
     *        example, by purpose, owner, or environment. For more information, see <a
     *        href="http://docs.aws.amazon.com//awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
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
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="http://docs.aws.amazon.com//awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for
     *        example, by purpose, owner, or environment. For more information, see <a
     *        href="http://docs.aws.amazon.com//awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHyperParameterTuningJobRequest withTags(Tag... tags) {
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
     * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by
     * purpose, owner, or environment. For more information, see <a
     * href="http://docs.aws.amazon.com//awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for
     *        example, by purpose, owner, or environment. For more information, see <a
     *        href="http://docs.aws.amazon.com//awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHyperParameterTuningJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHyperParameterTuningJobName() != null)
            sb.append("HyperParameterTuningJobName: ").append(getHyperParameterTuningJobName()).append(",");
        if (getHyperParameterTuningJobConfig() != null)
            sb.append("HyperParameterTuningJobConfig: ").append(getHyperParameterTuningJobConfig()).append(",");
        if (getTrainingJobDefinition() != null)
            sb.append("TrainingJobDefinition: ").append(getTrainingJobDefinition()).append(",");
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

        if (obj instanceof CreateHyperParameterTuningJobRequest == false)
            return false;
        CreateHyperParameterTuningJobRequest other = (CreateHyperParameterTuningJobRequest) obj;
        if (other.getHyperParameterTuningJobName() == null ^ this.getHyperParameterTuningJobName() == null)
            return false;
        if (other.getHyperParameterTuningJobName() != null && other.getHyperParameterTuningJobName().equals(this.getHyperParameterTuningJobName()) == false)
            return false;
        if (other.getHyperParameterTuningJobConfig() == null ^ this.getHyperParameterTuningJobConfig() == null)
            return false;
        if (other.getHyperParameterTuningJobConfig() != null
                && other.getHyperParameterTuningJobConfig().equals(this.getHyperParameterTuningJobConfig()) == false)
            return false;
        if (other.getTrainingJobDefinition() == null ^ this.getTrainingJobDefinition() == null)
            return false;
        if (other.getTrainingJobDefinition() != null && other.getTrainingJobDefinition().equals(this.getTrainingJobDefinition()) == false)
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

        hashCode = prime * hashCode + ((getHyperParameterTuningJobName() == null) ? 0 : getHyperParameterTuningJobName().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJobConfig() == null) ? 0 : getHyperParameterTuningJobConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobDefinition() == null) ? 0 : getTrainingJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateHyperParameterTuningJobRequest clone() {
        return (CreateHyperParameterTuningJobRequest) super.clone();
    }

}
