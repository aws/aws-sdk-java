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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateLabelingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLabelingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a list of labeling jobs. Labeling job
     * names must be unique within an AWS account and region. <code>LabelingJobName</code> is not case sensitive. For
     * example, Example-job and example-job are considered the same labeling job name by Ground Truth.
     * </p>
     */
    private String labelingJobName;
    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair
     * formed with the label that a worker assigns to the object. The <code>LabelAttributeName</code> must meet the
     * following requirements.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can't end with "-metadata".
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using one of the following <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task types</a>, the attribute
     * name <i>must</i> end with "-ref". If the task type you are using is not listed below, the attribute name <i>must
     * not</i> end with "-ref".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image semantic segmentation (<code>SemanticSegmentation)</code>, and adjustment (
     * <code>AdjustmentSemanticSegmentation</code>) and verification (<code>VerificationSemanticSegmentation</code>)
     * labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Video frame object detection (<code>VideoObjectDetection</code>), and adjustment and verification (
     * <code>AdjustmentVideoObjectDetection</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Video frame object tracking (<code>VideoObjectTracking</code>), and adjustment and verification (
     * <code>AdjustmentVideoObjectTracking</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 3D point cloud semantic segmentation (<code>3DPointCloudSemanticSegmentation</code>), and adjustment and
     * verification (<code>Adjustment3DPointCloudSemanticSegmentation</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 3D point cloud object tracking (<code>3DPointCloudObjectTracking</code>), and adjustment and verification (
     * <code>Adjustment3DPointCloudObjectTracking</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p/>
     * <important>
     * <p>
     * If you are creating an adjustment or verification labeling job, you must use a <i>different</i>
     * <code>LabelAttributeName</code> than the one used in the original labeling job. The original labeling job is the
     * Ground Truth labeling job that produced the labels that you want verified or adjusted. To learn more about
     * adjustment and verification labeling jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-verification-data.html">Verify and Adjust Labels</a>.
     * </p>
     * </important>
     */
    private String labelAttributeName;
    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the
     * manifest file that describes the data objects.
     * </p>
     * <p>
     * You must specify at least one of the following: <code>S3DataSource</code> or <code>SnsDataSource</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>SnsDataSource</code> to specify an SNS input topic for a streaming labeling job. If you do not specify
     * and SNS input topic ARN, Ground Truth will create a one-time labeling job that stops after all data objects in
     * the input manifest file have been labeled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>S3DataSource</code> to specify an input manifest file for both streaming and one-time labeling jobs.
     * Adding an <code>S3DataSource</code> is optional if you use <code>SnsDataSource</code> to create a streaming
     * labeling job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the Amazon Mechanical Turk workforce, your input data should not include confidential information,
     * personal information or protected health information. Use <code>ContentClassifiers</code> to specify that your
     * data is free of personally identifiable information and adult content.
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
     * The S3 URI of the file, referred to as a <i>label category configuration file</i>, that defines the categories
     * used to label the data objects.
     * </p>
     * <p>
     * For 3D point cloud and video frame task types, you can add label category attributes and frame attributes to your
     * label category configuration file. To learn how, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-point-cloud-label-category-config.html">Create a
     * Labeling Category Configuration File for 3D Point Cloud Labeling Jobs</a>.
     * </p>
     * <p>
     * For all other <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task
     * types</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates.html">custom
     * tasks</a>, your label category configuration file must be a JSON file in the following format. Identify the
     * labels you want to use by replacing <code>label_1</code>, <code>label_2</code>,<code>...</code>,
     * <code>label_n</code> with your label categories.
     * </p>
     * <p>
     * <code>{ </code>
     * </p>
     * <p>
     * <code>"document-version": "2018-11-28",</code>
     * </p>
     * <p>
     * <code>"labels": [{"label": "label_1"},{"label": "label_2"},...{"label": "label_n"}]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * Note the following about the label category configuration file:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For image classification and text classification (single and multi-label) you must specify at least two label
     * categories. For all other task types, the minimum number of label categories required is one.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each label category must be unique, you cannot specify duplicate label categories.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create a 3D point cloud or video frame adjustment or verification labeling job, you must include
     * <code>auditLabelAttributeName</code> in the label category configuration. Use this parameter to enter the <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateLabelingJob.html#sagemaker-CreateLabelingJob-request-LabelAttributeName"
     * > <code>LabelAttributeName</code> </a> of the labeling job you want to adjust or verify annotations of.
     * </p>
     * </li>
     * </ul>
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
     * Configures the labeling task and how it is presented to workers; including, but not limited to price, keywords,
     * and batch size (task count).
     * </p>
     */
    private HumanTaskConfig humanTaskConfig;
    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a list of labeling jobs. Labeling job
     * names must be unique within an AWS account and region. <code>LabelingJobName</code> is not case sensitive. For
     * example, Example-job and example-job are considered the same labeling job name by Ground Truth.
     * </p>
     * 
     * @param labelingJobName
     *        The name of the labeling job. This name is used to identify the job in a list of labeling jobs. Labeling
     *        job names must be unique within an AWS account and region. <code>LabelingJobName</code> is not case
     *        sensitive. For example, Example-job and example-job are considered the same labeling job name by Ground
     *        Truth.
     */

    public void setLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a list of labeling jobs. Labeling job
     * names must be unique within an AWS account and region. <code>LabelingJobName</code> is not case sensitive. For
     * example, Example-job and example-job are considered the same labeling job name by Ground Truth.
     * </p>
     * 
     * @return The name of the labeling job. This name is used to identify the job in a list of labeling jobs. Labeling
     *         job names must be unique within an AWS account and region. <code>LabelingJobName</code> is not case
     *         sensitive. For example, Example-job and example-job are considered the same labeling job name by Ground
     *         Truth.
     */

    public String getLabelingJobName() {
        return this.labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a list of labeling jobs. Labeling job
     * names must be unique within an AWS account and region. <code>LabelingJobName</code> is not case sensitive. For
     * example, Example-job and example-job are considered the same labeling job name by Ground Truth.
     * </p>
     * 
     * @param labelingJobName
     *        The name of the labeling job. This name is used to identify the job in a list of labeling jobs. Labeling
     *        job names must be unique within an AWS account and region. <code>LabelingJobName</code> is not case
     *        sensitive. For example, Example-job and example-job are considered the same labeling job name by Ground
     *        Truth.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withLabelingJobName(String labelingJobName) {
        setLabelingJobName(labelingJobName);
        return this;
    }

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair
     * formed with the label that a worker assigns to the object. The <code>LabelAttributeName</code> must meet the
     * following requirements.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can't end with "-metadata".
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using one of the following <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task types</a>, the attribute
     * name <i>must</i> end with "-ref". If the task type you are using is not listed below, the attribute name <i>must
     * not</i> end with "-ref".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image semantic segmentation (<code>SemanticSegmentation)</code>, and adjustment (
     * <code>AdjustmentSemanticSegmentation</code>) and verification (<code>VerificationSemanticSegmentation</code>)
     * labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Video frame object detection (<code>VideoObjectDetection</code>), and adjustment and verification (
     * <code>AdjustmentVideoObjectDetection</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Video frame object tracking (<code>VideoObjectTracking</code>), and adjustment and verification (
     * <code>AdjustmentVideoObjectTracking</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 3D point cloud semantic segmentation (<code>3DPointCloudSemanticSegmentation</code>), and adjustment and
     * verification (<code>Adjustment3DPointCloudSemanticSegmentation</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 3D point cloud object tracking (<code>3DPointCloudObjectTracking</code>), and adjustment and verification (
     * <code>Adjustment3DPointCloudObjectTracking</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p/>
     * <important>
     * <p>
     * If you are creating an adjustment or verification labeling job, you must use a <i>different</i>
     * <code>LabelAttributeName</code> than the one used in the original labeling job. The original labeling job is the
     * Ground Truth labeling job that produced the labels that you want verified or adjusted. To learn more about
     * adjustment and verification labeling jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-verification-data.html">Verify and Adjust Labels</a>.
     * </p>
     * </important>
     * 
     * @param labelAttributeName
     *        The attribute name to use for the label in the output manifest file. This is the key for the key/value
     *        pair formed with the label that a worker assigns to the object. The <code>LabelAttributeName</code> must
     *        meet the following requirements.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The name can't end with "-metadata".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are using one of the following <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task types</a>, the
     *        attribute name <i>must</i> end with "-ref". If the task type you are using is not listed below, the
     *        attribute name <i>must not</i> end with "-ref".
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Image semantic segmentation (<code>SemanticSegmentation)</code>, and adjustment (
     *        <code>AdjustmentSemanticSegmentation</code>) and verification (
     *        <code>VerificationSemanticSegmentation</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Video frame object detection (<code>VideoObjectDetection</code>), and adjustment and verification (
     *        <code>AdjustmentVideoObjectDetection</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Video frame object tracking (<code>VideoObjectTracking</code>), and adjustment and verification (
     *        <code>AdjustmentVideoObjectTracking</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3D point cloud semantic segmentation (<code>3DPointCloudSemanticSegmentation</code>), and adjustment and
     *        verification (<code>Adjustment3DPointCloudSemanticSegmentation</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3D point cloud object tracking (<code>3DPointCloudObjectTracking</code>), and adjustment and verification
     *        (<code>Adjustment3DPointCloudObjectTracking</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p/>
     *        <important>
     *        <p>
     *        If you are creating an adjustment or verification labeling job, you must use a <i>different</i>
     *        <code>LabelAttributeName</code> than the one used in the original labeling job. The original labeling job
     *        is the Ground Truth labeling job that produced the labels that you want verified or adjusted. To learn
     *        more about adjustment and verification labeling jobs, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-verification-data.html">Verify and Adjust
     *        Labels</a>.
     *        </p>
     */

    public void setLabelAttributeName(String labelAttributeName) {
        this.labelAttributeName = labelAttributeName;
    }

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair
     * formed with the label that a worker assigns to the object. The <code>LabelAttributeName</code> must meet the
     * following requirements.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can't end with "-metadata".
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using one of the following <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task types</a>, the attribute
     * name <i>must</i> end with "-ref". If the task type you are using is not listed below, the attribute name <i>must
     * not</i> end with "-ref".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image semantic segmentation (<code>SemanticSegmentation)</code>, and adjustment (
     * <code>AdjustmentSemanticSegmentation</code>) and verification (<code>VerificationSemanticSegmentation</code>)
     * labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Video frame object detection (<code>VideoObjectDetection</code>), and adjustment and verification (
     * <code>AdjustmentVideoObjectDetection</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Video frame object tracking (<code>VideoObjectTracking</code>), and adjustment and verification (
     * <code>AdjustmentVideoObjectTracking</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 3D point cloud semantic segmentation (<code>3DPointCloudSemanticSegmentation</code>), and adjustment and
     * verification (<code>Adjustment3DPointCloudSemanticSegmentation</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 3D point cloud object tracking (<code>3DPointCloudObjectTracking</code>), and adjustment and verification (
     * <code>Adjustment3DPointCloudObjectTracking</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p/>
     * <important>
     * <p>
     * If you are creating an adjustment or verification labeling job, you must use a <i>different</i>
     * <code>LabelAttributeName</code> than the one used in the original labeling job. The original labeling job is the
     * Ground Truth labeling job that produced the labels that you want verified or adjusted. To learn more about
     * adjustment and verification labeling jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-verification-data.html">Verify and Adjust Labels</a>.
     * </p>
     * </important>
     * 
     * @return The attribute name to use for the label in the output manifest file. This is the key for the key/value
     *         pair formed with the label that a worker assigns to the object. The <code>LabelAttributeName</code> must
     *         meet the following requirements.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The name can't end with "-metadata".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are using one of the following <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task types</a>, the
     *         attribute name <i>must</i> end with "-ref". If the task type you are using is not listed below, the
     *         attribute name <i>must not</i> end with "-ref".
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Image semantic segmentation (<code>SemanticSegmentation)</code>, and adjustment (
     *         <code>AdjustmentSemanticSegmentation</code>) and verification (
     *         <code>VerificationSemanticSegmentation</code>) labeling jobs for this task type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Video frame object detection (<code>VideoObjectDetection</code>), and adjustment and verification (
     *         <code>AdjustmentVideoObjectDetection</code>) labeling jobs for this task type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Video frame object tracking (<code>VideoObjectTracking</code>), and adjustment and verification (
     *         <code>AdjustmentVideoObjectTracking</code>) labeling jobs for this task type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3D point cloud semantic segmentation (<code>3DPointCloudSemanticSegmentation</code>), and adjustment and
     *         verification (<code>Adjustment3DPointCloudSemanticSegmentation</code>) labeling jobs for this task type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3D point cloud object tracking (<code>3DPointCloudObjectTracking</code>), and adjustment and verification
     *         (<code>Adjustment3DPointCloudObjectTracking</code>) labeling jobs for this task type.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p/>
     *         <important>
     *         <p>
     *         If you are creating an adjustment or verification labeling job, you must use a <i>different</i>
     *         <code>LabelAttributeName</code> than the one used in the original labeling job. The original labeling job
     *         is the Ground Truth labeling job that produced the labels that you want verified or adjusted. To learn
     *         more about adjustment and verification labeling jobs, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-verification-data.html">Verify and Adjust
     *         Labels</a>.
     *         </p>
     */

    public String getLabelAttributeName() {
        return this.labelAttributeName;
    }

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair
     * formed with the label that a worker assigns to the object. The <code>LabelAttributeName</code> must meet the
     * following requirements.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can't end with "-metadata".
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using one of the following <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task types</a>, the attribute
     * name <i>must</i> end with "-ref". If the task type you are using is not listed below, the attribute name <i>must
     * not</i> end with "-ref".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image semantic segmentation (<code>SemanticSegmentation)</code>, and adjustment (
     * <code>AdjustmentSemanticSegmentation</code>) and verification (<code>VerificationSemanticSegmentation</code>)
     * labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Video frame object detection (<code>VideoObjectDetection</code>), and adjustment and verification (
     * <code>AdjustmentVideoObjectDetection</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Video frame object tracking (<code>VideoObjectTracking</code>), and adjustment and verification (
     * <code>AdjustmentVideoObjectTracking</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 3D point cloud semantic segmentation (<code>3DPointCloudSemanticSegmentation</code>), and adjustment and
     * verification (<code>Adjustment3DPointCloudSemanticSegmentation</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * <li>
     * <p>
     * 3D point cloud object tracking (<code>3DPointCloudObjectTracking</code>), and adjustment and verification (
     * <code>Adjustment3DPointCloudObjectTracking</code>) labeling jobs for this task type.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p/>
     * <important>
     * <p>
     * If you are creating an adjustment or verification labeling job, you must use a <i>different</i>
     * <code>LabelAttributeName</code> than the one used in the original labeling job. The original labeling job is the
     * Ground Truth labeling job that produced the labels that you want verified or adjusted. To learn more about
     * adjustment and verification labeling jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-verification-data.html">Verify and Adjust Labels</a>.
     * </p>
     * </important>
     * 
     * @param labelAttributeName
     *        The attribute name to use for the label in the output manifest file. This is the key for the key/value
     *        pair formed with the label that a worker assigns to the object. The <code>LabelAttributeName</code> must
     *        meet the following requirements.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The name can't end with "-metadata".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are using one of the following <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task types</a>, the
     *        attribute name <i>must</i> end with "-ref". If the task type you are using is not listed below, the
     *        attribute name <i>must not</i> end with "-ref".
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Image semantic segmentation (<code>SemanticSegmentation)</code>, and adjustment (
     *        <code>AdjustmentSemanticSegmentation</code>) and verification (
     *        <code>VerificationSemanticSegmentation</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Video frame object detection (<code>VideoObjectDetection</code>), and adjustment and verification (
     *        <code>AdjustmentVideoObjectDetection</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Video frame object tracking (<code>VideoObjectTracking</code>), and adjustment and verification (
     *        <code>AdjustmentVideoObjectTracking</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3D point cloud semantic segmentation (<code>3DPointCloudSemanticSegmentation</code>), and adjustment and
     *        verification (<code>Adjustment3DPointCloudSemanticSegmentation</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3D point cloud object tracking (<code>3DPointCloudObjectTracking</code>), and adjustment and verification
     *        (<code>Adjustment3DPointCloudObjectTracking</code>) labeling jobs for this task type.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p/>
     *        <important>
     *        <p>
     *        If you are creating an adjustment or verification labeling job, you must use a <i>different</i>
     *        <code>LabelAttributeName</code> than the one used in the original labeling job. The original labeling job
     *        is the Ground Truth labeling job that produced the labels that you want verified or adjusted. To learn
     *        more about adjustment and verification labeling jobs, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-verification-data.html">Verify and Adjust
     *        Labels</a>.
     *        </p>
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
     * <p>
     * You must specify at least one of the following: <code>S3DataSource</code> or <code>SnsDataSource</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>SnsDataSource</code> to specify an SNS input topic for a streaming labeling job. If you do not specify
     * and SNS input topic ARN, Ground Truth will create a one-time labeling job that stops after all data objects in
     * the input manifest file have been labeled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>S3DataSource</code> to specify an input manifest file for both streaming and one-time labeling jobs.
     * Adding an <code>S3DataSource</code> is optional if you use <code>SnsDataSource</code> to create a streaming
     * labeling job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the Amazon Mechanical Turk workforce, your input data should not include confidential information,
     * personal information or protected health information. Use <code>ContentClassifiers</code> to specify that your
     * data is free of personally identifiable information and adult content.
     * </p>
     * 
     * @param inputConfig
     *        Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of
     *        the manifest file that describes the data objects.</p>
     *        <p>
     *        You must specify at least one of the following: <code>S3DataSource</code> or <code>SnsDataSource</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>SnsDataSource</code> to specify an SNS input topic for a streaming labeling job. If you do not
     *        specify and SNS input topic ARN, Ground Truth will create a one-time labeling job that stops after all
     *        data objects in the input manifest file have been labeled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>S3DataSource</code> to specify an input manifest file for both streaming and one-time labeling
     *        jobs. Adding an <code>S3DataSource</code> is optional if you use <code>SnsDataSource</code> to create a
     *        streaming labeling job.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use the Amazon Mechanical Turk workforce, your input data should not include confidential
     *        information, personal information or protected health information. Use <code>ContentClassifiers</code> to
     *        specify that your data is free of personally identifiable information and adult content.
     */

    public void setInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the
     * manifest file that describes the data objects.
     * </p>
     * <p>
     * You must specify at least one of the following: <code>S3DataSource</code> or <code>SnsDataSource</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>SnsDataSource</code> to specify an SNS input topic for a streaming labeling job. If you do not specify
     * and SNS input topic ARN, Ground Truth will create a one-time labeling job that stops after all data objects in
     * the input manifest file have been labeled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>S3DataSource</code> to specify an input manifest file for both streaming and one-time labeling jobs.
     * Adding an <code>S3DataSource</code> is optional if you use <code>SnsDataSource</code> to create a streaming
     * labeling job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the Amazon Mechanical Turk workforce, your input data should not include confidential information,
     * personal information or protected health information. Use <code>ContentClassifiers</code> to specify that your
     * data is free of personally identifiable information and adult content.
     * </p>
     * 
     * @return Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of
     *         the manifest file that describes the data objects.</p>
     *         <p>
     *         You must specify at least one of the following: <code>S3DataSource</code> or <code>SnsDataSource</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use <code>SnsDataSource</code> to specify an SNS input topic for a streaming labeling job. If you do not
     *         specify and SNS input topic ARN, Ground Truth will create a one-time labeling job that stops after all
     *         data objects in the input manifest file have been labeled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use <code>S3DataSource</code> to specify an input manifest file for both streaming and one-time labeling
     *         jobs. Adding an <code>S3DataSource</code> is optional if you use <code>SnsDataSource</code> to create a
     *         streaming labeling job.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you use the Amazon Mechanical Turk workforce, your input data should not include confidential
     *         information, personal information or protected health information. Use <code>ContentClassifiers</code> to
     *         specify that your data is free of personally identifiable information and adult content.
     */

    public LabelingJobInputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the
     * manifest file that describes the data objects.
     * </p>
     * <p>
     * You must specify at least one of the following: <code>S3DataSource</code> or <code>SnsDataSource</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>SnsDataSource</code> to specify an SNS input topic for a streaming labeling job. If you do not specify
     * and SNS input topic ARN, Ground Truth will create a one-time labeling job that stops after all data objects in
     * the input manifest file have been labeled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>S3DataSource</code> to specify an input manifest file for both streaming and one-time labeling jobs.
     * Adding an <code>S3DataSource</code> is optional if you use <code>SnsDataSource</code> to create a streaming
     * labeling job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the Amazon Mechanical Turk workforce, your input data should not include confidential information,
     * personal information or protected health information. Use <code>ContentClassifiers</code> to specify that your
     * data is free of personally identifiable information and adult content.
     * </p>
     * 
     * @param inputConfig
     *        Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of
     *        the manifest file that describes the data objects.</p>
     *        <p>
     *        You must specify at least one of the following: <code>S3DataSource</code> or <code>SnsDataSource</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>SnsDataSource</code> to specify an SNS input topic for a streaming labeling job. If you do not
     *        specify and SNS input topic ARN, Ground Truth will create a one-time labeling job that stops after all
     *        data objects in the input manifest file have been labeled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>S3DataSource</code> to specify an input manifest file for both streaming and one-time labeling
     *        jobs. Adding an <code>S3DataSource</code> is optional if you use <code>SnsDataSource</code> to create a
     *        streaming labeling job.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use the Amazon Mechanical Turk workforce, your input data should not include confidential
     *        information, personal information or protected health information. Use <code>ContentClassifiers</code> to
     *        specify that your data is free of personally identifiable information and adult content.
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
     * The S3 URI of the file, referred to as a <i>label category configuration file</i>, that defines the categories
     * used to label the data objects.
     * </p>
     * <p>
     * For 3D point cloud and video frame task types, you can add label category attributes and frame attributes to your
     * label category configuration file. To learn how, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-point-cloud-label-category-config.html">Create a
     * Labeling Category Configuration File for 3D Point Cloud Labeling Jobs</a>.
     * </p>
     * <p>
     * For all other <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task
     * types</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates.html">custom
     * tasks</a>, your label category configuration file must be a JSON file in the following format. Identify the
     * labels you want to use by replacing <code>label_1</code>, <code>label_2</code>,<code>...</code>,
     * <code>label_n</code> with your label categories.
     * </p>
     * <p>
     * <code>{ </code>
     * </p>
     * <p>
     * <code>"document-version": "2018-11-28",</code>
     * </p>
     * <p>
     * <code>"labels": [{"label": "label_1"},{"label": "label_2"},...{"label": "label_n"}]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * Note the following about the label category configuration file:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For image classification and text classification (single and multi-label) you must specify at least two label
     * categories. For all other task types, the minimum number of label categories required is one.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each label category must be unique, you cannot specify duplicate label categories.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create a 3D point cloud or video frame adjustment or verification labeling job, you must include
     * <code>auditLabelAttributeName</code> in the label category configuration. Use this parameter to enter the <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateLabelingJob.html#sagemaker-CreateLabelingJob-request-LabelAttributeName"
     * > <code>LabelAttributeName</code> </a> of the labeling job you want to adjust or verify annotations of.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelCategoryConfigS3Uri
     *        The S3 URI of the file, referred to as a <i>label category configuration file</i>, that defines the
     *        categories used to label the data objects.</p>
     *        <p>
     *        For 3D point cloud and video frame task types, you can add label category attributes and frame attributes
     *        to your label category configuration file. To learn how, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-point-cloud-label-category-config.html">Create a
     *        Labeling Category Configuration File for 3D Point Cloud Labeling Jobs</a>.
     *        </p>
     *        <p>
     *        For all other <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task
     *        types</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates.html">custom
     *        tasks</a>, your label category configuration file must be a JSON file in the following format. Identify
     *        the labels you want to use by replacing <code>label_1</code>, <code>label_2</code>,<code>...</code>,
     *        <code>label_n</code> with your label categories.
     *        </p>
     *        <p>
     *        <code>{ </code>
     *        </p>
     *        <p>
     *        <code>"document-version": "2018-11-28",</code>
     *        </p>
     *        <p>
     *        <code>"labels": [{"label": "label_1"},{"label": "label_2"},...{"label": "label_n"}]</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     *        </p>
     *        <p>
     *        Note the following about the label category configuration file:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For image classification and text classification (single and multi-label) you must specify at least two
     *        label categories. For all other task types, the minimum number of label categories required is one.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each label category must be unique, you cannot specify duplicate label categories.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you create a 3D point cloud or video frame adjustment or verification labeling job, you must include
     *        <code>auditLabelAttributeName</code> in the label category configuration. Use this parameter to enter the
     *        <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateLabelingJob.html#sagemaker-CreateLabelingJob-request-LabelAttributeName"
     *        > <code>LabelAttributeName</code> </a> of the labeling job you want to adjust or verify annotations of.
     *        </p>
     *        </li>
     */

    public void setLabelCategoryConfigS3Uri(String labelCategoryConfigS3Uri) {
        this.labelCategoryConfigS3Uri = labelCategoryConfigS3Uri;
    }

    /**
     * <p>
     * The S3 URI of the file, referred to as a <i>label category configuration file</i>, that defines the categories
     * used to label the data objects.
     * </p>
     * <p>
     * For 3D point cloud and video frame task types, you can add label category attributes and frame attributes to your
     * label category configuration file. To learn how, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-point-cloud-label-category-config.html">Create a
     * Labeling Category Configuration File for 3D Point Cloud Labeling Jobs</a>.
     * </p>
     * <p>
     * For all other <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task
     * types</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates.html">custom
     * tasks</a>, your label category configuration file must be a JSON file in the following format. Identify the
     * labels you want to use by replacing <code>label_1</code>, <code>label_2</code>,<code>...</code>,
     * <code>label_n</code> with your label categories.
     * </p>
     * <p>
     * <code>{ </code>
     * </p>
     * <p>
     * <code>"document-version": "2018-11-28",</code>
     * </p>
     * <p>
     * <code>"labels": [{"label": "label_1"},{"label": "label_2"},...{"label": "label_n"}]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * Note the following about the label category configuration file:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For image classification and text classification (single and multi-label) you must specify at least two label
     * categories. For all other task types, the minimum number of label categories required is one.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each label category must be unique, you cannot specify duplicate label categories.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create a 3D point cloud or video frame adjustment or verification labeling job, you must include
     * <code>auditLabelAttributeName</code> in the label category configuration. Use this parameter to enter the <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateLabelingJob.html#sagemaker-CreateLabelingJob-request-LabelAttributeName"
     * > <code>LabelAttributeName</code> </a> of the labeling job you want to adjust or verify annotations of.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The S3 URI of the file, referred to as a <i>label category configuration file</i>, that defines the
     *         categories used to label the data objects.</p>
     *         <p>
     *         For 3D point cloud and video frame task types, you can add label category attributes and frame attributes
     *         to your label category configuration file. To learn how, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-point-cloud-label-category-config.html">Create
     *         a Labeling Category Configuration File for 3D Point Cloud Labeling Jobs</a>.
     *         </p>
     *         <p>
     *         For all other <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task
     *         types</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates.html">custom
     *         tasks</a>, your label category configuration file must be a JSON file in the following format. Identify
     *         the labels you want to use by replacing <code>label_1</code>, <code>label_2</code>,<code>...</code>,
     *         <code>label_n</code> with your label categories.
     *         </p>
     *         <p>
     *         <code>{ </code>
     *         </p>
     *         <p>
     *         <code>"document-version": "2018-11-28",</code>
     *         </p>
     *         <p>
     *         <code>"labels": [{"label": "label_1"},{"label": "label_2"},...{"label": "label_n"}]</code>
     *         </p>
     *         <p>
     *         <code>}</code>
     *         </p>
     *         <p>
     *         Note the following about the label category configuration file:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For image classification and text classification (single and multi-label) you must specify at least two
     *         label categories. For all other task types, the minimum number of label categories required is one.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each label category must be unique, you cannot specify duplicate label categories.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you create a 3D point cloud or video frame adjustment or verification labeling job, you must include
     *         <code>auditLabelAttributeName</code> in the label category configuration. Use this parameter to enter the
     *         <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateLabelingJob.html#sagemaker-CreateLabelingJob-request-LabelAttributeName"
     *         > <code>LabelAttributeName</code> </a> of the labeling job you want to adjust or verify annotations of.
     *         </p>
     *         </li>
     */

    public String getLabelCategoryConfigS3Uri() {
        return this.labelCategoryConfigS3Uri;
    }

    /**
     * <p>
     * The S3 URI of the file, referred to as a <i>label category configuration file</i>, that defines the categories
     * used to label the data objects.
     * </p>
     * <p>
     * For 3D point cloud and video frame task types, you can add label category attributes and frame attributes to your
     * label category configuration file. To learn how, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-point-cloud-label-category-config.html">Create a
     * Labeling Category Configuration File for 3D Point Cloud Labeling Jobs</a>.
     * </p>
     * <p>
     * For all other <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task
     * types</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates.html">custom
     * tasks</a>, your label category configuration file must be a JSON file in the following format. Identify the
     * labels you want to use by replacing <code>label_1</code>, <code>label_2</code>,<code>...</code>,
     * <code>label_n</code> with your label categories.
     * </p>
     * <p>
     * <code>{ </code>
     * </p>
     * <p>
     * <code>"document-version": "2018-11-28",</code>
     * </p>
     * <p>
     * <code>"labels": [{"label": "label_1"},{"label": "label_2"},...{"label": "label_n"}]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * Note the following about the label category configuration file:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For image classification and text classification (single and multi-label) you must specify at least two label
     * categories. For all other task types, the minimum number of label categories required is one.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each label category must be unique, you cannot specify duplicate label categories.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create a 3D point cloud or video frame adjustment or verification labeling job, you must include
     * <code>auditLabelAttributeName</code> in the label category configuration. Use this parameter to enter the <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateLabelingJob.html#sagemaker-CreateLabelingJob-request-LabelAttributeName"
     * > <code>LabelAttributeName</code> </a> of the labeling job you want to adjust or verify annotations of.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelCategoryConfigS3Uri
     *        The S3 URI of the file, referred to as a <i>label category configuration file</i>, that defines the
     *        categories used to label the data objects.</p>
     *        <p>
     *        For 3D point cloud and video frame task types, you can add label category attributes and frame attributes
     *        to your label category configuration file. To learn how, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-point-cloud-label-category-config.html">Create a
     *        Labeling Category Configuration File for 3D Point Cloud Labeling Jobs</a>.
     *        </p>
     *        <p>
     *        For all other <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-task-types.html">built-in task
     *        types</a> and <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates.html">custom
     *        tasks</a>, your label category configuration file must be a JSON file in the following format. Identify
     *        the labels you want to use by replacing <code>label_1</code>, <code>label_2</code>,<code>...</code>,
     *        <code>label_n</code> with your label categories.
     *        </p>
     *        <p>
     *        <code>{ </code>
     *        </p>
     *        <p>
     *        <code>"document-version": "2018-11-28",</code>
     *        </p>
     *        <p>
     *        <code>"labels": [{"label": "label_1"},{"label": "label_2"},...{"label": "label_n"}]</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     *        </p>
     *        <p>
     *        Note the following about the label category configuration file:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For image classification and text classification (single and multi-label) you must specify at least two
     *        label categories. For all other task types, the minimum number of label categories required is one.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each label category must be unique, you cannot specify duplicate label categories.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you create a 3D point cloud or video frame adjustment or verification labeling job, you must include
     *        <code>auditLabelAttributeName</code> in the label category configuration. Use this parameter to enter the
     *        <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateLabelingJob.html#sagemaker-CreateLabelingJob-request-LabelAttributeName"
     *        > <code>LabelAttributeName</code> </a> of the labeling job you want to adjust or verify annotations of.
     *        </p>
     *        </li>
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
     * Configures the labeling task and how it is presented to workers; including, but not limited to price, keywords,
     * and batch size (task count).
     * </p>
     * 
     * @param humanTaskConfig
     *        Configures the labeling task and how it is presented to workers; including, but not limited to price,
     *        keywords, and batch size (task count).
     */

    public void setHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
        this.humanTaskConfig = humanTaskConfig;
    }

    /**
     * <p>
     * Configures the labeling task and how it is presented to workers; including, but not limited to price, keywords,
     * and batch size (task count).
     * </p>
     * 
     * @return Configures the labeling task and how it is presented to workers; including, but not limited to price,
     *         keywords, and batch size (task count).
     */

    public HumanTaskConfig getHumanTaskConfig() {
        return this.humanTaskConfig;
    }

    /**
     * <p>
     * Configures the labeling task and how it is presented to workers; including, but not limited to price, keywords,
     * and batch size (task count).
     * </p>
     * 
     * @param humanTaskConfig
     *        Configures the labeling task and how it is presented to workers; including, but not limited to price,
     *        keywords, and batch size (task count).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelingJobRequest withHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
        setHumanTaskConfig(humanTaskConfig);
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key/value pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key/value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
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
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
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
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
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
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key/value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
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
