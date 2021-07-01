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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provided configuration information for the worker UI for a labeling job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UiConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UiConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to render
     * the worker UI and tools for labeling job tasks. For more information about the contents of a UI template, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"> Creating Your Custom
     * Labeling Task Template</a>.
     * </p>
     */
    private String uiTemplateS3Uri;
    /**
     * <p>
     * The ARN of the worker task template used to render the worker UI and tools for labeling job tasks.
     * </p>
     * <p>
     * Use this parameter when you are creating a labeling job for 3D point cloud and video fram labeling jobs. Use your
     * labeling job task type to select one of the following ARNs and use it with this parameter when you create a
     * labeling job. Replace <code>aws-region</code> with the Amazon Web Services region you are creating your labeling
     * job in.
     * </p>
     * <p>
     * <b>3D Point Cloud HumanTaskUiArns</b>
     * </p>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud object detection and 3D point cloud object detection
     * adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectDetection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud object tracking and 3D point cloud object tracking
     * adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectTracking</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud semantic segmentation and 3D point cloud semantic
     * segmentation adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Video Frame HumanTaskUiArns</b>
     * </p>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for video frame object detection and video frame object detection adjustment
     * labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:region:394669845002:human-task-ui/VideoObjectDetection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for video frame object tracking and video frame object tracking adjustment
     * labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/VideoObjectTracking</code>
     * </p>
     * </li>
     * </ul>
     */
    private String humanTaskUiArn;

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to render
     * the worker UI and tools for labeling job tasks. For more information about the contents of a UI template, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"> Creating Your Custom
     * Labeling Task Template</a>.
     * </p>
     * 
     * @param uiTemplateS3Uri
     *        The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to
     *        render the worker UI and tools for labeling job tasks. For more information about the contents of a UI
     *        template, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html">
     *        Creating Your Custom Labeling Task Template</a>.
     */

    public void setUiTemplateS3Uri(String uiTemplateS3Uri) {
        this.uiTemplateS3Uri = uiTemplateS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to render
     * the worker UI and tools for labeling job tasks. For more information about the contents of a UI template, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"> Creating Your Custom
     * Labeling Task Template</a>.
     * </p>
     * 
     * @return The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to
     *         render the worker UI and tools for labeling job tasks. For more information about the contents of a UI
     *         template, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html">
     *         Creating Your Custom Labeling Task Template</a>.
     */

    public String getUiTemplateS3Uri() {
        return this.uiTemplateS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to render
     * the worker UI and tools for labeling job tasks. For more information about the contents of a UI template, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html"> Creating Your Custom
     * Labeling Task Template</a>.
     * </p>
     * 
     * @param uiTemplateS3Uri
     *        The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to
     *        render the worker UI and tools for labeling job tasks. For more information about the contents of a UI
     *        template, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-custom-templates-step2.html">
     *        Creating Your Custom Labeling Task Template</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UiConfig withUiTemplateS3Uri(String uiTemplateS3Uri) {
        setUiTemplateS3Uri(uiTemplateS3Uri);
        return this;
    }

    /**
     * <p>
     * The ARN of the worker task template used to render the worker UI and tools for labeling job tasks.
     * </p>
     * <p>
     * Use this parameter when you are creating a labeling job for 3D point cloud and video fram labeling jobs. Use your
     * labeling job task type to select one of the following ARNs and use it with this parameter when you create a
     * labeling job. Replace <code>aws-region</code> with the Amazon Web Services region you are creating your labeling
     * job in.
     * </p>
     * <p>
     * <b>3D Point Cloud HumanTaskUiArns</b>
     * </p>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud object detection and 3D point cloud object detection
     * adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectDetection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud object tracking and 3D point cloud object tracking
     * adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectTracking</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud semantic segmentation and 3D point cloud semantic
     * segmentation adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Video Frame HumanTaskUiArns</b>
     * </p>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for video frame object detection and video frame object detection adjustment
     * labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:region:394669845002:human-task-ui/VideoObjectDetection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for video frame object tracking and video frame object tracking adjustment
     * labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/VideoObjectTracking</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param humanTaskUiArn
     *        The ARN of the worker task template used to render the worker UI and tools for labeling job tasks.</p>
     *        <p>
     *        Use this parameter when you are creating a labeling job for 3D point cloud and video fram labeling jobs.
     *        Use your labeling job task type to select one of the following ARNs and use it with this parameter when
     *        you create a labeling job. Replace <code>aws-region</code> with the Amazon Web Services region you are
     *        creating your labeling job in.
     *        </p>
     *        <p>
     *        <b>3D Point Cloud HumanTaskUiArns</b>
     *        </p>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for 3D point cloud object detection and 3D point cloud object
     *        detection adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectDetection</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for 3D point cloud object tracking and 3D point cloud object tracking
     *        adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectTracking</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for 3D point cloud semantic segmentation and 3D point cloud semantic
     *        segmentation adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudSemanticSegmentation</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Video Frame HumanTaskUiArns</b>
     *        </p>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for video frame object detection and video frame object detection
     *        adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:region:394669845002:human-task-ui/VideoObjectDetection</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for video frame object tracking and video frame object tracking
     *        adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/VideoObjectTracking</code>
     *        </p>
     *        </li>
     */

    public void setHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
    }

    /**
     * <p>
     * The ARN of the worker task template used to render the worker UI and tools for labeling job tasks.
     * </p>
     * <p>
     * Use this parameter when you are creating a labeling job for 3D point cloud and video fram labeling jobs. Use your
     * labeling job task type to select one of the following ARNs and use it with this parameter when you create a
     * labeling job. Replace <code>aws-region</code> with the Amazon Web Services region you are creating your labeling
     * job in.
     * </p>
     * <p>
     * <b>3D Point Cloud HumanTaskUiArns</b>
     * </p>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud object detection and 3D point cloud object detection
     * adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectDetection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud object tracking and 3D point cloud object tracking
     * adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectTracking</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud semantic segmentation and 3D point cloud semantic
     * segmentation adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Video Frame HumanTaskUiArns</b>
     * </p>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for video frame object detection and video frame object detection adjustment
     * labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:region:394669845002:human-task-ui/VideoObjectDetection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for video frame object tracking and video frame object tracking adjustment
     * labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/VideoObjectTracking</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ARN of the worker task template used to render the worker UI and tools for labeling job tasks.</p>
     *         <p>
     *         Use this parameter when you are creating a labeling job for 3D point cloud and video fram labeling jobs.
     *         Use your labeling job task type to select one of the following ARNs and use it with this parameter when
     *         you create a labeling job. Replace <code>aws-region</code> with the Amazon Web Services region you are
     *         creating your labeling job in.
     *         </p>
     *         <p>
     *         <b>3D Point Cloud HumanTaskUiArns</b>
     *         </p>
     *         <p>
     *         Use this <code>HumanTaskUiArn</code> for 3D point cloud object detection and 3D point cloud object
     *         detection adjustment labeling jobs.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectDetection</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use this <code>HumanTaskUiArn</code> for 3D point cloud object tracking and 3D point cloud object
     *         tracking adjustment labeling jobs.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectTracking</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use this <code>HumanTaskUiArn</code> for 3D point cloud semantic segmentation and 3D point cloud semantic
     *         segmentation adjustment labeling jobs.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Video Frame HumanTaskUiArns</b>
     *         </p>
     *         <p>
     *         Use this <code>HumanTaskUiArn</code> for video frame object detection and video frame object detection
     *         adjustment labeling jobs.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:sagemaker:region:394669845002:human-task-ui/VideoObjectDetection</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use this <code>HumanTaskUiArn</code> for video frame object tracking and video frame object tracking
     *         adjustment labeling jobs.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/VideoObjectTracking</code>
     *         </p>
     *         </li>
     */

    public String getHumanTaskUiArn() {
        return this.humanTaskUiArn;
    }

    /**
     * <p>
     * The ARN of the worker task template used to render the worker UI and tools for labeling job tasks.
     * </p>
     * <p>
     * Use this parameter when you are creating a labeling job for 3D point cloud and video fram labeling jobs. Use your
     * labeling job task type to select one of the following ARNs and use it with this parameter when you create a
     * labeling job. Replace <code>aws-region</code> with the Amazon Web Services region you are creating your labeling
     * job in.
     * </p>
     * <p>
     * <b>3D Point Cloud HumanTaskUiArns</b>
     * </p>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud object detection and 3D point cloud object detection
     * adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectDetection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud object tracking and 3D point cloud object tracking
     * adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectTracking</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for 3D point cloud semantic segmentation and 3D point cloud semantic
     * segmentation adjustment labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Video Frame HumanTaskUiArns</b>
     * </p>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for video frame object detection and video frame object detection adjustment
     * labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:region:394669845002:human-task-ui/VideoObjectDetection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use this <code>HumanTaskUiArn</code> for video frame object tracking and video frame object tracking adjustment
     * labeling jobs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/VideoObjectTracking</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param humanTaskUiArn
     *        The ARN of the worker task template used to render the worker UI and tools for labeling job tasks.</p>
     *        <p>
     *        Use this parameter when you are creating a labeling job for 3D point cloud and video fram labeling jobs.
     *        Use your labeling job task type to select one of the following ARNs and use it with this parameter when
     *        you create a labeling job. Replace <code>aws-region</code> with the Amazon Web Services region you are
     *        creating your labeling job in.
     *        </p>
     *        <p>
     *        <b>3D Point Cloud HumanTaskUiArns</b>
     *        </p>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for 3D point cloud object detection and 3D point cloud object
     *        detection adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectDetection</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for 3D point cloud object tracking and 3D point cloud object tracking
     *        adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectTracking</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for 3D point cloud semantic segmentation and 3D point cloud semantic
     *        segmentation adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudSemanticSegmentation</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Video Frame HumanTaskUiArns</b>
     *        </p>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for video frame object detection and video frame object detection
     *        adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:region:394669845002:human-task-ui/VideoObjectDetection</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use this <code>HumanTaskUiArn</code> for video frame object tracking and video frame object tracking
     *        adjustment labeling jobs.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:sagemaker:aws-region:394669845002:human-task-ui/VideoObjectTracking</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UiConfig withHumanTaskUiArn(String humanTaskUiArn) {
        setHumanTaskUiArn(humanTaskUiArn);
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
        if (getUiTemplateS3Uri() != null)
            sb.append("UiTemplateS3Uri: ").append(getUiTemplateS3Uri()).append(",");
        if (getHumanTaskUiArn() != null)
            sb.append("HumanTaskUiArn: ").append(getHumanTaskUiArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UiConfig == false)
            return false;
        UiConfig other = (UiConfig) obj;
        if (other.getUiTemplateS3Uri() == null ^ this.getUiTemplateS3Uri() == null)
            return false;
        if (other.getUiTemplateS3Uri() != null && other.getUiTemplateS3Uri().equals(this.getUiTemplateS3Uri()) == false)
            return false;
        if (other.getHumanTaskUiArn() == null ^ this.getHumanTaskUiArn() == null)
            return false;
        if (other.getHumanTaskUiArn() != null && other.getHumanTaskUiArn().equals(this.getHumanTaskUiArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUiTemplateS3Uri() == null) ? 0 : getUiTemplateS3Uri().hashCode());
        hashCode = prime * hashCode + ((getHumanTaskUiArn() == null) ? 0 : getHumanTaskUiArn().hashCode());
        return hashCode;
    }

    @Override
    public UiConfig clone() {
        try {
            return (UiConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.UiConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
