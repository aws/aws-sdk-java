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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAutoMLJobV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAutoMLJobV2Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies an Autopilot job. The name must be unique to your account and is case insensitive.
     * </p>
     */
    private String autoMLJobName;
    /**
     * <p>
     * An array of channel objects describing the input data and their location. Each channel is a named input source.
     * Similar to the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJob.html#sagemaker-CreateAutoMLJob-request-InputDataConfig"
     * >InputDataConfig</a> attribute in the <code>CreateAutoMLJob</code> input parameters. The supported formats depend
     * on the problem type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: <code>S3Prefix</code>, <code>ManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For image classification: <code>S3Prefix</code>, <code>ManifestFile</code>, <code>AugmentedManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text classification: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation (LLMs fine-tuning): <code>S3Prefix</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<AutoMLJobChannel> autoMLJobInputDataConfig;
    /**
     * <p>
     * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job.
     * </p>
     */
    private AutoMLOutputDataConfig outputDataConfig;
    /**
     * <p>
     * Defines the configuration settings of one of the supported problem types.
     * </p>
     */
    private AutoMLProblemTypeConfig autoMLProblemTypeConfig;
    /**
     * <p>
     * The ARN of the role that is used to access the data.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * such as by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web ServicesResources</a>.
     * Tag keys must be unique per resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     */
    private AutoMLSecurityConfig securityConfig;
    /**
     * <p>
     * Specifies a metric to minimize or maximize as the objective of a job. If not specified, the default objective
     * metric depends on the problem type. For the list of default values per problem type, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobObjective.html"
     * >AutoMLJobObjective</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: You must either provide both the <code>AutoMLJobObjective</code> and indicate the type
     * of supervised learning problem in <code>AutoMLProblemTypeConfig</code> (<code>TabularJobConfig.ProblemType</code>
     * ), or none at all.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not require
     * setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring multiple
     * candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly fine-tunes your target
     * model to enhance a default objective metric, the cross-entropy loss. After fine-tuning a language model, you can
     * evaluate the quality of its generated text using different metrics. For a list of the available metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     * fine-tuning LLMs in Autopilot</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private AutoMLJobObjective autoMLJobObjective;
    /**
     * <p>
     * Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
     * </p>
     */
    private ModelDeployConfig modelDeployConfig;
    /**
     * <p>
     * This structure specifies how to split the data into train and validation datasets.
     * </p>
     * <p>
     * The validation and training datasets must contain the same headers. For jobs created by calling
     * <code>CreateAutoMLJob</code>, the validation dataset must be less than 2 GB in size.
     * </p>
     * <note>
     * <p>
     * This attribute must not be set for the time-series forecasting problem type, as Autopilot automatically splits
     * the input dataset into training and validation sets.
     * </p>
     * </note>
     */
    private AutoMLDataSplitConfig dataSplitConfig;

    /**
     * <p>
     * Identifies an Autopilot job. The name must be unique to your account and is case insensitive.
     * </p>
     * 
     * @param autoMLJobName
     *        Identifies an Autopilot job. The name must be unique to your account and is case insensitive.
     */

    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * Identifies an Autopilot job. The name must be unique to your account and is case insensitive.
     * </p>
     * 
     * @return Identifies an Autopilot job. The name must be unique to your account and is case insensitive.
     */

    public String getAutoMLJobName() {
        return this.autoMLJobName;
    }

    /**
     * <p>
     * Identifies an Autopilot job. The name must be unique to your account and is case insensitive.
     * </p>
     * 
     * @param autoMLJobName
     *        Identifies an Autopilot job. The name must be unique to your account and is case insensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withAutoMLJobName(String autoMLJobName) {
        setAutoMLJobName(autoMLJobName);
        return this;
    }

    /**
     * <p>
     * An array of channel objects describing the input data and their location. Each channel is a named input source.
     * Similar to the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJob.html#sagemaker-CreateAutoMLJob-request-InputDataConfig"
     * >InputDataConfig</a> attribute in the <code>CreateAutoMLJob</code> input parameters. The supported formats depend
     * on the problem type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: <code>S3Prefix</code>, <code>ManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For image classification: <code>S3Prefix</code>, <code>ManifestFile</code>, <code>AugmentedManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text classification: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation (LLMs fine-tuning): <code>S3Prefix</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of channel objects describing the input data and their location. Each channel is a named input
     *         source. Similar to the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJob.html#sagemaker-CreateAutoMLJob-request-InputDataConfig"
     *         >InputDataConfig</a> attribute in the <code>CreateAutoMLJob</code> input parameters. The supported
     *         formats depend on the problem type:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For tabular problem types: <code>S3Prefix</code>, <code>ManifestFile</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For image classification: <code>S3Prefix</code>, <code>ManifestFile</code>,
     *         <code>AugmentedManifestFile</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For text classification: <code>S3Prefix</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For time-series forecasting: <code>S3Prefix</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For text generation (LLMs fine-tuning): <code>S3Prefix</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<AutoMLJobChannel> getAutoMLJobInputDataConfig() {
        return autoMLJobInputDataConfig;
    }

    /**
     * <p>
     * An array of channel objects describing the input data and their location. Each channel is a named input source.
     * Similar to the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJob.html#sagemaker-CreateAutoMLJob-request-InputDataConfig"
     * >InputDataConfig</a> attribute in the <code>CreateAutoMLJob</code> input parameters. The supported formats depend
     * on the problem type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: <code>S3Prefix</code>, <code>ManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For image classification: <code>S3Prefix</code>, <code>ManifestFile</code>, <code>AugmentedManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text classification: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation (LLMs fine-tuning): <code>S3Prefix</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param autoMLJobInputDataConfig
     *        An array of channel objects describing the input data and their location. Each channel is a named input
     *        source. Similar to the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJob.html#sagemaker-CreateAutoMLJob-request-InputDataConfig"
     *        >InputDataConfig</a> attribute in the <code>CreateAutoMLJob</code> input parameters. The supported formats
     *        depend on the problem type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types: <code>S3Prefix</code>, <code>ManifestFile</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For image classification: <code>S3Prefix</code>, <code>ManifestFile</code>,
     *        <code>AugmentedManifestFile</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text classification: <code>S3Prefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For time-series forecasting: <code>S3Prefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation (LLMs fine-tuning): <code>S3Prefix</code>.
     *        </p>
     *        </li>
     */

    public void setAutoMLJobInputDataConfig(java.util.Collection<AutoMLJobChannel> autoMLJobInputDataConfig) {
        if (autoMLJobInputDataConfig == null) {
            this.autoMLJobInputDataConfig = null;
            return;
        }

        this.autoMLJobInputDataConfig = new java.util.ArrayList<AutoMLJobChannel>(autoMLJobInputDataConfig);
    }

    /**
     * <p>
     * An array of channel objects describing the input data and their location. Each channel is a named input source.
     * Similar to the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJob.html#sagemaker-CreateAutoMLJob-request-InputDataConfig"
     * >InputDataConfig</a> attribute in the <code>CreateAutoMLJob</code> input parameters. The supported formats depend
     * on the problem type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: <code>S3Prefix</code>, <code>ManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For image classification: <code>S3Prefix</code>, <code>ManifestFile</code>, <code>AugmentedManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text classification: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation (LLMs fine-tuning): <code>S3Prefix</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoMLJobInputDataConfig(java.util.Collection)} or
     * {@link #withAutoMLJobInputDataConfig(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoMLJobInputDataConfig
     *        An array of channel objects describing the input data and their location. Each channel is a named input
     *        source. Similar to the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJob.html#sagemaker-CreateAutoMLJob-request-InputDataConfig"
     *        >InputDataConfig</a> attribute in the <code>CreateAutoMLJob</code> input parameters. The supported formats
     *        depend on the problem type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types: <code>S3Prefix</code>, <code>ManifestFile</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For image classification: <code>S3Prefix</code>, <code>ManifestFile</code>,
     *        <code>AugmentedManifestFile</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text classification: <code>S3Prefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For time-series forecasting: <code>S3Prefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation (LLMs fine-tuning): <code>S3Prefix</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withAutoMLJobInputDataConfig(AutoMLJobChannel... autoMLJobInputDataConfig) {
        if (this.autoMLJobInputDataConfig == null) {
            setAutoMLJobInputDataConfig(new java.util.ArrayList<AutoMLJobChannel>(autoMLJobInputDataConfig.length));
        }
        for (AutoMLJobChannel ele : autoMLJobInputDataConfig) {
            this.autoMLJobInputDataConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of channel objects describing the input data and their location. Each channel is a named input source.
     * Similar to the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJob.html#sagemaker-CreateAutoMLJob-request-InputDataConfig"
     * >InputDataConfig</a> attribute in the <code>CreateAutoMLJob</code> input parameters. The supported formats depend
     * on the problem type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: <code>S3Prefix</code>, <code>ManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For image classification: <code>S3Prefix</code>, <code>ManifestFile</code>, <code>AugmentedManifestFile</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text classification: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For time-series forecasting: <code>S3Prefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation (LLMs fine-tuning): <code>S3Prefix</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param autoMLJobInputDataConfig
     *        An array of channel objects describing the input data and their location. Each channel is a named input
     *        source. Similar to the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateAutoMLJob.html#sagemaker-CreateAutoMLJob-request-InputDataConfig"
     *        >InputDataConfig</a> attribute in the <code>CreateAutoMLJob</code> input parameters. The supported formats
     *        depend on the problem type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types: <code>S3Prefix</code>, <code>ManifestFile</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For image classification: <code>S3Prefix</code>, <code>ManifestFile</code>,
     *        <code>AugmentedManifestFile</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text classification: <code>S3Prefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For time-series forecasting: <code>S3Prefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation (LLMs fine-tuning): <code>S3Prefix</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withAutoMLJobInputDataConfig(java.util.Collection<AutoMLJobChannel> autoMLJobInputDataConfig) {
        setAutoMLJobInputDataConfig(autoMLJobInputDataConfig);
        return this;
    }

    /**
     * <p>
     * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job.
     * </p>
     * 
     * @param outputDataConfig
     *        Provides information about encryption and the Amazon S3 output path needed to store artifacts from an
     *        AutoML job.
     */

    public void setOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job.
     * </p>
     * 
     * @return Provides information about encryption and the Amazon S3 output path needed to store artifacts from an
     *         AutoML job.
     */

    public AutoMLOutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job.
     * </p>
     * 
     * @param outputDataConfig
     *        Provides information about encryption and the Amazon S3 output path needed to store artifacts from an
     *        AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * Defines the configuration settings of one of the supported problem types.
     * </p>
     * 
     * @param autoMLProblemTypeConfig
     *        Defines the configuration settings of one of the supported problem types.
     */

    public void setAutoMLProblemTypeConfig(AutoMLProblemTypeConfig autoMLProblemTypeConfig) {
        this.autoMLProblemTypeConfig = autoMLProblemTypeConfig;
    }

    /**
     * <p>
     * Defines the configuration settings of one of the supported problem types.
     * </p>
     * 
     * @return Defines the configuration settings of one of the supported problem types.
     */

    public AutoMLProblemTypeConfig getAutoMLProblemTypeConfig() {
        return this.autoMLProblemTypeConfig;
    }

    /**
     * <p>
     * Defines the configuration settings of one of the supported problem types.
     * </p>
     * 
     * @param autoMLProblemTypeConfig
     *        Defines the configuration settings of one of the supported problem types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withAutoMLProblemTypeConfig(AutoMLProblemTypeConfig autoMLProblemTypeConfig) {
        setAutoMLProblemTypeConfig(autoMLProblemTypeConfig);
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

    public CreateAutoMLJobV2Request withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * such as by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web ServicesResources</a>.
     * Tag keys must be unique per resource.
     * </p>
     * 
     * @return An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *         different ways, such as by purpose, owner, or environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web
     *         ServicesResources</a>. Tag keys must be unique per resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * such as by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web ServicesResources</a>.
     * Tag keys must be unique per resource.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *        different ways, such as by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web
     *        ServicesResources</a>. Tag keys must be unique per resource.
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
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * such as by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web ServicesResources</a>.
     * Tag keys must be unique per resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *        different ways, such as by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web
     *        ServicesResources</a>. Tag keys must be unique per resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withTags(Tag... tags) {
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
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * such as by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web ServicesResources</a>.
     * Tag keys must be unique per resource.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *        different ways, such as by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web
     *        ServicesResources</a>. Tag keys must be unique per resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @param securityConfig
     *        The security configuration for traffic encryption or Amazon VPC settings.
     */

    public void setSecurityConfig(AutoMLSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    /**
     * <p>
     * The security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @return The security configuration for traffic encryption or Amazon VPC settings.
     */

    public AutoMLSecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    /**
     * <p>
     * The security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @param securityConfig
     *        The security configuration for traffic encryption or Amazon VPC settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withSecurityConfig(AutoMLSecurityConfig securityConfig) {
        setSecurityConfig(securityConfig);
        return this;
    }

    /**
     * <p>
     * Specifies a metric to minimize or maximize as the objective of a job. If not specified, the default objective
     * metric depends on the problem type. For the list of default values per problem type, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobObjective.html"
     * >AutoMLJobObjective</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: You must either provide both the <code>AutoMLJobObjective</code> and indicate the type
     * of supervised learning problem in <code>AutoMLProblemTypeConfig</code> (<code>TabularJobConfig.ProblemType</code>
     * ), or none at all.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not require
     * setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring multiple
     * candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly fine-tunes your target
     * model to enhance a default objective metric, the cross-entropy loss. After fine-tuning a language model, you can
     * evaluate the quality of its generated text using different metrics. For a list of the available metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     * fine-tuning LLMs in Autopilot</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param autoMLJobObjective
     *        Specifies a metric to minimize or maximize as the objective of a job. If not specified, the default
     *        objective metric depends on the problem type. For the list of default values per problem type, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobObjective.html">
     *        AutoMLJobObjective</a>.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types: You must either provide both the <code>AutoMLJobObjective</code> and indicate
     *        the type of supervised learning problem in <code>AutoMLProblemTypeConfig</code> (
     *        <code>TabularJobConfig.ProblemType</code>), or none at all.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not
     *        require setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring
     *        multiple candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly
     *        fine-tunes your target model to enhance a default objective metric, the cross-entropy loss. After
     *        fine-tuning a language model, you can evaluate the quality of its generated text using different metrics.
     *        For a list of the available metrics, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     *        fine-tuning LLMs in Autopilot</a>.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
    }

    /**
     * <p>
     * Specifies a metric to minimize or maximize as the objective of a job. If not specified, the default objective
     * metric depends on the problem type. For the list of default values per problem type, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobObjective.html"
     * >AutoMLJobObjective</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: You must either provide both the <code>AutoMLJobObjective</code> and indicate the type
     * of supervised learning problem in <code>AutoMLProblemTypeConfig</code> (<code>TabularJobConfig.ProblemType</code>
     * ), or none at all.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not require
     * setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring multiple
     * candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly fine-tunes your target
     * model to enhance a default objective metric, the cross-entropy loss. After fine-tuning a language model, you can
     * evaluate the quality of its generated text using different metrics. For a list of the available metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     * fine-tuning LLMs in Autopilot</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Specifies a metric to minimize or maximize as the objective of a job. If not specified, the default
     *         objective metric depends on the problem type. For the list of default values per problem type, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobObjective.html">
     *         AutoMLJobObjective</a>.</p> <note>
     *         <ul>
     *         <li>
     *         <p>
     *         For tabular problem types: You must either provide both the <code>AutoMLJobObjective</code> and indicate
     *         the type of supervised learning problem in <code>AutoMLProblemTypeConfig</code> (
     *         <code>TabularJobConfig.ProblemType</code>), or none at all.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not
     *         require setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring
     *         multiple candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly
     *         fine-tunes your target model to enhance a default objective metric, the cross-entropy loss. After
     *         fine-tuning a language model, you can evaluate the quality of its generated text using different metrics.
     *         For a list of the available metrics, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     *         fine-tuning LLMs in Autopilot</a>.
     *         </p>
     *         </li>
     *         </ul>
     */

    public AutoMLJobObjective getAutoMLJobObjective() {
        return this.autoMLJobObjective;
    }

    /**
     * <p>
     * Specifies a metric to minimize or maximize as the objective of a job. If not specified, the default objective
     * metric depends on the problem type. For the list of default values per problem type, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobObjective.html"
     * >AutoMLJobObjective</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * For tabular problem types: You must either provide both the <code>AutoMLJobObjective</code> and indicate the type
     * of supervised learning problem in <code>AutoMLProblemTypeConfig</code> (<code>TabularJobConfig.ProblemType</code>
     * ), or none at all.
     * </p>
     * </li>
     * <li>
     * <p>
     * For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not require
     * setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring multiple
     * candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly fine-tunes your target
     * model to enhance a default objective metric, the cross-entropy loss. After fine-tuning a language model, you can
     * evaluate the quality of its generated text using different metrics. For a list of the available metrics, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     * fine-tuning LLMs in Autopilot</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param autoMLJobObjective
     *        Specifies a metric to minimize or maximize as the objective of a job. If not specified, the default
     *        objective metric depends on the problem type. For the list of default values per problem type, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobObjective.html">
     *        AutoMLJobObjective</a>.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        For tabular problem types: You must either provide both the <code>AutoMLJobObjective</code> and indicate
     *        the type of supervised learning problem in <code>AutoMLProblemTypeConfig</code> (
     *        <code>TabularJobConfig.ProblemType</code>), or none at all.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For text generation problem types (LLMs fine-tuning): Fine-tuning language models in Autopilot does not
     *        require setting the <code>AutoMLJobObjective</code> field. Autopilot fine-tunes LLMs without requiring
     *        multiple candidates to be trained and evaluated. Instead, using your dataset, Autopilot directly
     *        fine-tunes your target model to enhance a default objective metric, the cross-entropy loss. After
     *        fine-tuning a language model, you can evaluate the quality of its generated text using different metrics.
     *        For a list of the available metrics, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-llms-finetuning-metrics.html">Metrics for
     *        fine-tuning LLMs in Autopilot</a>.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        setAutoMLJobObjective(autoMLJobObjective);
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

    public CreateAutoMLJobV2Request withModelDeployConfig(ModelDeployConfig modelDeployConfig) {
        setModelDeployConfig(modelDeployConfig);
        return this;
    }

    /**
     * <p>
     * This structure specifies how to split the data into train and validation datasets.
     * </p>
     * <p>
     * The validation and training datasets must contain the same headers. For jobs created by calling
     * <code>CreateAutoMLJob</code>, the validation dataset must be less than 2 GB in size.
     * </p>
     * <note>
     * <p>
     * This attribute must not be set for the time-series forecasting problem type, as Autopilot automatically splits
     * the input dataset into training and validation sets.
     * </p>
     * </note>
     * 
     * @param dataSplitConfig
     *        This structure specifies how to split the data into train and validation datasets.</p>
     *        <p>
     *        The validation and training datasets must contain the same headers. For jobs created by calling
     *        <code>CreateAutoMLJob</code>, the validation dataset must be less than 2 GB in size.
     *        </p>
     *        <note>
     *        <p>
     *        This attribute must not be set for the time-series forecasting problem type, as Autopilot automatically
     *        splits the input dataset into training and validation sets.
     *        </p>
     */

    public void setDataSplitConfig(AutoMLDataSplitConfig dataSplitConfig) {
        this.dataSplitConfig = dataSplitConfig;
    }

    /**
     * <p>
     * This structure specifies how to split the data into train and validation datasets.
     * </p>
     * <p>
     * The validation and training datasets must contain the same headers. For jobs created by calling
     * <code>CreateAutoMLJob</code>, the validation dataset must be less than 2 GB in size.
     * </p>
     * <note>
     * <p>
     * This attribute must not be set for the time-series forecasting problem type, as Autopilot automatically splits
     * the input dataset into training and validation sets.
     * </p>
     * </note>
     * 
     * @return This structure specifies how to split the data into train and validation datasets.</p>
     *         <p>
     *         The validation and training datasets must contain the same headers. For jobs created by calling
     *         <code>CreateAutoMLJob</code>, the validation dataset must be less than 2 GB in size.
     *         </p>
     *         <note>
     *         <p>
     *         This attribute must not be set for the time-series forecasting problem type, as Autopilot automatically
     *         splits the input dataset into training and validation sets.
     *         </p>
     */

    public AutoMLDataSplitConfig getDataSplitConfig() {
        return this.dataSplitConfig;
    }

    /**
     * <p>
     * This structure specifies how to split the data into train and validation datasets.
     * </p>
     * <p>
     * The validation and training datasets must contain the same headers. For jobs created by calling
     * <code>CreateAutoMLJob</code>, the validation dataset must be less than 2 GB in size.
     * </p>
     * <note>
     * <p>
     * This attribute must not be set for the time-series forecasting problem type, as Autopilot automatically splits
     * the input dataset into training and validation sets.
     * </p>
     * </note>
     * 
     * @param dataSplitConfig
     *        This structure specifies how to split the data into train and validation datasets.</p>
     *        <p>
     *        The validation and training datasets must contain the same headers. For jobs created by calling
     *        <code>CreateAutoMLJob</code>, the validation dataset must be less than 2 GB in size.
     *        </p>
     *        <note>
     *        <p>
     *        This attribute must not be set for the time-series forecasting problem type, as Autopilot automatically
     *        splits the input dataset into training and validation sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAutoMLJobV2Request withDataSplitConfig(AutoMLDataSplitConfig dataSplitConfig) {
        setDataSplitConfig(dataSplitConfig);
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
        if (getAutoMLJobInputDataConfig() != null)
            sb.append("AutoMLJobInputDataConfig: ").append(getAutoMLJobInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getAutoMLProblemTypeConfig() != null)
            sb.append("AutoMLProblemTypeConfig: ").append(getAutoMLProblemTypeConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSecurityConfig() != null)
            sb.append("SecurityConfig: ").append(getSecurityConfig()).append(",");
        if (getAutoMLJobObjective() != null)
            sb.append("AutoMLJobObjective: ").append(getAutoMLJobObjective()).append(",");
        if (getModelDeployConfig() != null)
            sb.append("ModelDeployConfig: ").append(getModelDeployConfig()).append(",");
        if (getDataSplitConfig() != null)
            sb.append("DataSplitConfig: ").append(getDataSplitConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAutoMLJobV2Request == false)
            return false;
        CreateAutoMLJobV2Request other = (CreateAutoMLJobV2Request) obj;
        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
            return false;
        if (other.getAutoMLJobInputDataConfig() == null ^ this.getAutoMLJobInputDataConfig() == null)
            return false;
        if (other.getAutoMLJobInputDataConfig() != null && other.getAutoMLJobInputDataConfig().equals(this.getAutoMLJobInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getAutoMLProblemTypeConfig() == null ^ this.getAutoMLProblemTypeConfig() == null)
            return false;
        if (other.getAutoMLProblemTypeConfig() != null && other.getAutoMLProblemTypeConfig().equals(this.getAutoMLProblemTypeConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSecurityConfig() == null ^ this.getSecurityConfig() == null)
            return false;
        if (other.getSecurityConfig() != null && other.getSecurityConfig().equals(this.getSecurityConfig()) == false)
            return false;
        if (other.getAutoMLJobObjective() == null ^ this.getAutoMLJobObjective() == null)
            return false;
        if (other.getAutoMLJobObjective() != null && other.getAutoMLJobObjective().equals(this.getAutoMLJobObjective()) == false)
            return false;
        if (other.getModelDeployConfig() == null ^ this.getModelDeployConfig() == null)
            return false;
        if (other.getModelDeployConfig() != null && other.getModelDeployConfig().equals(this.getModelDeployConfig()) == false)
            return false;
        if (other.getDataSplitConfig() == null ^ this.getDataSplitConfig() == null)
            return false;
        if (other.getDataSplitConfig() != null && other.getDataSplitConfig().equals(this.getDataSplitConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobInputDataConfig() == null) ? 0 : getAutoMLJobInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getAutoMLProblemTypeConfig() == null) ? 0 : getAutoMLProblemTypeConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfig() == null) ? 0 : getSecurityConfig().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobObjective() == null) ? 0 : getAutoMLJobObjective().hashCode());
        hashCode = prime * hashCode + ((getModelDeployConfig() == null) ? 0 : getModelDeployConfig().hashCode());
        hashCode = prime * hashCode + ((getDataSplitConfig() == null) ? 0 : getDataSplitConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateAutoMLJobV2Request clone() {
        return (CreateAutoMLJobV2Request) super.clone();
    }

}
