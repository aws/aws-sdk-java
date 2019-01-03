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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateLabelingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLabelingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
     * </p>
     */
    private String labelingJobName;
    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair
     * formed with the label that a worker assigns to the object. The name can't end with "-metadata". If you are
     * running a semantic segmentation labeling job, the attribute name must end with "-ref". If you are running any
     * other kind of labeling job, the attribute name must not end with "-ref".
     * </p>
     */
    private String labelAttributeName;
    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the
     * manifest file that describes the data objects.
     * </p>
     */
    private LabelingJobInputConfig inputConfig;
    /**
     * <p>
     * The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the output
     * data, if any.
     * </p>
     */
    private LabelingJobOutputConfig outputConfig;
    /**
     * <p>
     * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     * labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete
     * data labeling.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The S3 URL of the file that defines the categories used to label the data objects.
     * </p>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     */
    private String labelCategoryConfigS3Uri;
    /**
     * <p>
     * A set of conditions for stopping the labeling job. If any of the conditions are met, the job is automatically
     * stopped. You can use these conditions to control the cost of data labeling.
     * </p>
     */
    private LabelingJobStoppingConditions stoppingConditions;
    /**
     * <p>
     * Configures the information required to perform automated data labeling.
     * </p>
     */
    private LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig;
    /**
     * <p>
     * Configures the information required for human workers to complete a labeling task.
     * </p>
     */
    private HumanTaskConfig humanTaskConfig;
    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
     * </p>
     * 
     * @param labelingJobName
     *        The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
     */

    public void setLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
     * </p>
     * 
     * @return The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
     */

    public String getLabelingJobName() {
        return this.labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
     * </p>
     * 
     * @param labelingJobName
     *        The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withLabelingJobName(String labelingJobName) {
        setLabelingJobName(labelingJobName);
        return this;
    }

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair
     * formed with the label that a worker assigns to the object. The name can't end with "-metadata". If you are
     * running a semantic segmentation labeling job, the attribute name must end with "-ref". If you are running any
     * other kind of labeling job, the attribute name must not end with "-ref".
     * </p>
     * 
     * @param labelAttributeName
     *        The attribute name to use for the label in the output manifest file. This is the key for the key/value
     *        pair formed with the label that a worker assigns to the object. The name can't end with "-metadata". If
     *        you are running a semantic segmentation labeling job, the attribute name must end with "-ref". If you are
     *        running any other kind of labeling job, the attribute name must not end with "-ref".
     */

    public void setLabelAttributeName(String labelAttributeName) {
        this.labelAttributeName = labelAttributeName;
    }

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair
     * formed with the label that a worker assigns to the object. The name can't end with "-metadata". If you are
     * running a semantic segmentation labeling job, the attribute name must end with "-ref". If you are running any
     * other kind of labeling job, the attribute name must not end with "-ref".
     * </p>
     * 
     * @return The attribute name to use for the label in the output manifest file. This is the key for the key/value
     *         pair formed with the label that a worker assigns to the object. The name can't end with "-metadata". If
     *         you are running a semantic segmentation labeling job, the attribute name must end with "-ref". If you are
     *         running any other kind of labeling job, the attribute name must not end with "-ref".
     */

    public String getLabelAttributeName() {
        return this.labelAttributeName;
    }

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair
     * formed with the label that a worker assigns to the object. The name can't end with "-metadata". If you are
     * running a semantic segmentation labeling job, the attribute name must end with "-ref". If you are running any
     * other kind of labeling job, the attribute name must not end with "-ref".
     * </p>
     * 
     * @param labelAttributeName
     *        The attribute name to use for the label in the output manifest file. This is the key for the key/value
     *        pair formed with the label that a worker assigns to the object. The name can't end with "-metadata". If
     *        you are running a semantic segmentation labeling job, the attribute name must end with "-ref". If you are
     *        running any other kind of labeling job, the attribute name must not end with "-ref".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withLabelAttributeName(String labelAttributeName) {
        setLabelAttributeName(labelAttributeName);
        return this;
    }

    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the
     * manifest file that describes the data objects.
     * </p>
     * 
     * @param inputConfig
     *        Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of
     *        the manifest file that describes the data objects.
     */

    public void setInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the
     * manifest file that describes the data objects.
     * </p>
     * 
     * @return Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of
     *         the manifest file that describes the data objects.
     */

    public LabelingJobInputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the
     * manifest file that describes the data objects.
     * </p>
     * 
     * @param inputConfig
     *        Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of
     *        the manifest file that describes the data objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withInputConfig(LabelingJobInputConfig inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the output
     * data, if any.
     * </p>
     * 
     * @param outputConfig
     *        The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the
     *        output data, if any.
     */

    public void setOutputConfig(LabelingJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the output
     * data, if any.
     * </p>
     * 
     * @return The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the
     *         output data, if any.
     */

    public LabelingJobOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the output
     * data, if any.
     * </p>
     * 
     * @param outputConfig
     *        The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the
     *        output data, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withOutputConfig(LabelingJobOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     * labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete
     * data labeling.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     *        labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully
     *        complete data labeling.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     * labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete
     * data labeling.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during
     *         data labeling. You must grant this role the necessary permissions so that Amazon SageMaker can
     *         successfully complete data labeling.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     * labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete
     * data labeling.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     *        labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully
     *        complete data labeling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The S3 URL of the file that defines the categories used to label the data objects.
     * </p>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * 
     * @param labelCategoryConfigS3Uri
     *        The S3 URL of the file that defines the categories used to label the data objects.</p>
     *        <p>
     *        The file is a JSON structure in the following format:
     *        </p>
     *        <p>
     *        <code>{</code>
     *        </p>
     *        <p>
     *        <code> "document-version": "2018-11-28"</code>
     *        </p>
     *        <p>
     *        <code> "labels": [</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label 1</i>"</code>
     *        </p>
     *        <p>
     *        <code> },</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label 2</i>"</code>
     *        </p>
     *        <p>
     *        <code> },</code>
     *        </p>
     *        <p>
     *        <code> ...</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label n</i>"</code>
     *        </p>
     *        <p>
     *        <code> }</code>
     *        </p>
     *        <p>
     *        <code> ]</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     */

    public void setLabelCategoryConfigS3Uri(String labelCategoryConfigS3Uri) {
        this.labelCategoryConfigS3Uri = labelCategoryConfigS3Uri;
    }

    /**
     * <p>
     * The S3 URL of the file that defines the categories used to label the data objects.
     * </p>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * 
     * @return The S3 URL of the file that defines the categories used to label the data objects.</p>
     *         <p>
     *         The file is a JSON structure in the following format:
     *         </p>
     *         <p>
     *         <code>{</code>
     *         </p>
     *         <p>
     *         <code> "document-version": "2018-11-28"</code>
     *         </p>
     *         <p>
     *         <code> "labels": [</code>
     *         </p>
     *         <p>
     *         <code> {</code>
     *         </p>
     *         <p>
     *         <code> "label": "<i>label 1</i>"</code>
     *         </p>
     *         <p>
     *         <code> },</code>
     *         </p>
     *         <p>
     *         <code> {</code>
     *         </p>
     *         <p>
     *         <code> "label": "<i>label 2</i>"</code>
     *         </p>
     *         <p>
     *         <code> },</code>
     *         </p>
     *         <p>
     *         <code> ...</code>
     *         </p>
     *         <p>
     *         <code> {</code>
     *         </p>
     *         <p>
     *         <code> "label": "<i>label n</i>"</code>
     *         </p>
     *         <p>
     *         <code> }</code>
     *         </p>
     *         <p>
     *         <code> ]</code>
     *         </p>
     *         <p>
     *         <code>}</code>
     */

    public String getLabelCategoryConfigS3Uri() {
        return this.labelCategoryConfigS3Uri;
    }

    /**
     * <p>
     * The S3 URL of the file that defines the categories used to label the data objects.
     * </p>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * 
     * @param labelCategoryConfigS3Uri
     *        The S3 URL of the file that defines the categories used to label the data objects.</p>
     *        <p>
     *        The file is a JSON structure in the following format:
     *        </p>
     *        <p>
     *        <code>{</code>
     *        </p>
     *        <p>
     *        <code> "document-version": "2018-11-28"</code>
     *        </p>
     *        <p>
     *        <code> "labels": [</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label 1</i>"</code>
     *        </p>
     *        <p>
     *        <code> },</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label 2</i>"</code>
     *        </p>
     *        <p>
     *        <code> },</code>
     *        </p>
     *        <p>
     *        <code> ...</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label n</i>"</code>
     *        </p>
     *        <p>
     *        <code> }</code>
     *        </p>
     *        <p>
     *        <code> ]</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withLabelCategoryConfigS3Uri(String labelCategoryConfigS3Uri) {
        setLabelCategoryConfigS3Uri(labelCategoryConfigS3Uri);
        return this;
    }

    /**
     * <p>
     * A set of conditions for stopping the labeling job. If any of the conditions are met, the job is automatically
     * stopped. You can use these conditions to control the cost of data labeling.
     * </p>
     * 
     * @param stoppingConditions
     *        A set of conditions for stopping the labeling job. If any of the conditions are met, the job is
     *        automatically stopped. You can use these conditions to control the cost of data labeling.
     */

    public void setStoppingConditions(LabelingJobStoppingConditions stoppingConditions) {
        this.stoppingConditions = stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping the labeling job. If any of the conditions are met, the job is automatically
     * stopped. You can use these conditions to control the cost of data labeling.
     * </p>
     * 
     * @return A set of conditions for stopping the labeling job. If any of the conditions are met, the job is
     *         automatically stopped. You can use these conditions to control the cost of data labeling.
     */

    public LabelingJobStoppingConditions getStoppingConditions() {
        return this.stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping the labeling job. If any of the conditions are met, the job is automatically
     * stopped. You can use these conditions to control the cost of data labeling.
     * </p>
     * 
     * @param stoppingConditions
     *        A set of conditions for stopping the labeling job. If any of the conditions are met, the job is
     *        automatically stopped. You can use these conditions to control the cost of data labeling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withStoppingConditions(LabelingJobStoppingConditions stoppingConditions) {
        setStoppingConditions(stoppingConditions);
        return this;
    }

    /**
     * <p>
     * Configures the information required to perform automated data labeling.
     * </p>
     * 
     * @param labelingJobAlgorithmsConfig
     *        Configures the information required to perform automated data labeling.
     */

    public void setLabelingJobAlgorithmsConfig(LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig) {
        this.labelingJobAlgorithmsConfig = labelingJobAlgorithmsConfig;
    }

    /**
     * <p>
     * Configures the information required to perform automated data labeling.
     * </p>
     * 
     * @return Configures the information required to perform automated data labeling.
     */

    public LabelingJobAlgorithmsConfig getLabelingJobAlgorithmsConfig() {
        return this.labelingJobAlgorithmsConfig;
    }

    /**
     * <p>
     * Configures the information required to perform automated data labeling.
     * </p>
     * 
     * @param labelingJobAlgorithmsConfig
     *        Configures the information required to perform automated data labeling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withLabelingJobAlgorithmsConfig(LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig) {
        setLabelingJobAlgorithmsConfig(labelingJobAlgorithmsConfig);
        return this;
    }

    /**
     * <p>
     * Configures the information required for human workers to complete a labeling task.
     * </p>
     * 
     * @param humanTaskConfig
     *        Configures the information required for human workers to complete a labeling task.
     */

    public void setHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
        this.humanTaskConfig = humanTaskConfig;
    }

    /**
     * <p>
     * Configures the information required for human workers to complete a labeling task.
     * </p>
     * 
     * @return Configures the information required for human workers to complete a labeling task.
     */

    public HumanTaskConfig getHumanTaskConfig() {
        return this.humanTaskConfig;
    }

    /**
     * <p>
     * Configures the information required for human workers to complete a labeling task.
     * </p>
     * 
     * @param humanTaskConfig
     *        Configures the information required for human workers to complete a labeling task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
        setHumanTaskConfig(humanTaskConfig);
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key/value pairs. For more information, see <a
     *         href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key/value pairs. For more information, see <a
     *        href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
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
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key/value pairs. For more information, see <a
     *        href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withTags(Tag... tags) {
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
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key/value pairs. For more information, see <a
     *        href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getLabelingJobName() != null)
            sb.append("LabelingJobName: ").append(getLabelingJobName()).append(",");
        if (getLabelAttributeName() != null)
            sb.append("LabelAttributeName: ").append(getLabelAttributeName()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLabelCategoryConfigS3Uri() != null)
            sb.append("LabelCategoryConfigS3Uri: ").append(getLabelCategoryConfigS3Uri()).append(",");
        if (getStoppingConditions() != null)
            sb.append("StoppingConditions: ").append(getStoppingConditions()).append(",");
        if (getLabelingJobAlgorithmsConfig() != null)
            sb.append("LabelingJobAlgorithmsConfig: ").append(getLabelingJobAlgorithmsConfig()).append(",");
        if (getHumanTaskConfig() != null)
            sb.append("HumanTaskConfig: ").append(getHumanTaskConfig()).append(",");
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

        if (obj instanceof CreateLabelingJobRequest == false)
            return false;
        CreateLabelingJobRequest other = (CreateLabelingJobRequest) obj;
        if (other.getLabelingJobName() == null ^ this.getLabelingJobName() == null)
            return false;
        if (other.getLabelingJobName() != null && other.getLabelingJobName().equals(this.getLabelingJobName()) == false)
            return false;
        if (other.getLabelAttributeName() == null ^ this.getLabelAttributeName() == null)
            return false;
        if (other.getLabelAttributeName() != null && other.getLabelAttributeName().equals(this.getLabelAttributeName()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLabelCategoryConfigS3Uri() == null ^ this.getLabelCategoryConfigS3Uri() == null)
            return false;
        if (other.getLabelCategoryConfigS3Uri() != null && other.getLabelCategoryConfigS3Uri().equals(this.getLabelCategoryConfigS3Uri()) == false)
            return false;
        if (other.getStoppingConditions() == null ^ this.getStoppingConditions() == null)
            return false;
        if (other.getStoppingConditions() != null && other.getStoppingConditions().equals(this.getStoppingConditions()) == false)
            return false;
        if (other.getLabelingJobAlgorithmsConfig() == null ^ this.getLabelingJobAlgorithmsConfig() == null)
            return false;
        if (other.getLabelingJobAlgorithmsConfig() != null && other.getLabelingJobAlgorithmsConfig().equals(this.getLabelingJobAlgorithmsConfig()) == false)
            return false;
        if (other.getHumanTaskConfig() == null ^ this.getHumanTaskConfig() == null)
            return false;
        if (other.getHumanTaskConfig() != null && other.getHumanTaskConfig().equals(this.getHumanTaskConfig()) == false)
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

        hashCode = prime * hashCode + ((getLabelingJobName() == null) ? 0 : getLabelingJobName().hashCode());
        hashCode = prime * hashCode + ((getLabelAttributeName() == null) ? 0 : getLabelAttributeName().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLabelCategoryConfigS3Uri() == null) ? 0 : getLabelCategoryConfigS3Uri().hashCode());
        hashCode = prime * hashCode + ((getStoppingConditions() == null) ? 0 : getStoppingConditions().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobAlgorithmsConfig() == null) ? 0 : getLabelingJobAlgorithmsConfig().hashCode());
        hashCode = prime * hashCode + ((getHumanTaskConfig() == null) ? 0 : getHumanTaskConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLabelingJobRequest clone() {
        return (CreateLabelingJobRequest) super.clone();
    }

}
