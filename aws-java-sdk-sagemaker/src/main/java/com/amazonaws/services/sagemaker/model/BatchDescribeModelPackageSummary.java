/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides summary information about the model package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/BatchDescribeModelPackageSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeModelPackageSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The group name for the model package
     * </p>
     */
    private String modelPackageGroupName;
    /**
     * <p>
     * The version number of a versioned model.
     * </p>
     */
    private Integer modelPackageVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     */
    private String modelPackageArn;
    /**
     * <p>
     * The description of the model package.
     * </p>
     */
    private String modelPackageDescription;
    /**
     * <p>
     * The creation time of the mortgage package summary.
     * </p>
     */
    private java.util.Date creationTime;

    private InferenceSpecification inferenceSpecification;
    /**
     * <p>
     * The status of the mortgage package.
     * </p>
     */
    private String modelPackageStatus;
    /**
     * <p>
     * The approval status of the model.
     * </p>
     */
    private String modelApprovalStatus;

    /**
     * <p>
     * The group name for the model package
     * </p>
     * 
     * @param modelPackageGroupName
     *        The group name for the model package
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * The group name for the model package
     * </p>
     * 
     * @return The group name for the model package
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * The group name for the model package
     * </p>
     * 
     * @param modelPackageGroupName
     *        The group name for the model package
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageSummary withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
        return this;
    }

    /**
     * <p>
     * The version number of a versioned model.
     * </p>
     * 
     * @param modelPackageVersion
     *        The version number of a versioned model.
     */

    public void setModelPackageVersion(Integer modelPackageVersion) {
        this.modelPackageVersion = modelPackageVersion;
    }

    /**
     * <p>
     * The version number of a versioned model.
     * </p>
     * 
     * @return The version number of a versioned model.
     */

    public Integer getModelPackageVersion() {
        return this.modelPackageVersion;
    }

    /**
     * <p>
     * The version number of a versioned model.
     * </p>
     * 
     * @param modelPackageVersion
     *        The version number of a versioned model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageSummary withModelPackageVersion(Integer modelPackageVersion) {
        setModelPackageVersion(modelPackageVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * 
     * @param modelPackageArn
     *        The Amazon Resource Name (ARN) of the model package.
     */

    public void setModelPackageArn(String modelPackageArn) {
        this.modelPackageArn = modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model package.
     */

    public String getModelPackageArn() {
        return this.modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * 
     * @param modelPackageArn
     *        The Amazon Resource Name (ARN) of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageSummary withModelPackageArn(String modelPackageArn) {
        setModelPackageArn(modelPackageArn);
        return this;
    }

    /**
     * <p>
     * The description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        The description of the model package.
     */

    public void setModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
    }

    /**
     * <p>
     * The description of the model package.
     * </p>
     * 
     * @return The description of the model package.
     */

    public String getModelPackageDescription() {
        return this.modelPackageDescription;
    }

    /**
     * <p>
     * The description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        The description of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageSummary withModelPackageDescription(String modelPackageDescription) {
        setModelPackageDescription(modelPackageDescription);
        return this;
    }

    /**
     * <p>
     * The creation time of the mortgage package summary.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the mortgage package summary.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the mortgage package summary.
     * </p>
     * 
     * @return The creation time of the mortgage package summary.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the mortgage package summary.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the mortgage package summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param inferenceSpecification
     */

    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * @return
     */

    public InferenceSpecification getInferenceSpecification() {
        return this.inferenceSpecification;
    }

    /**
     * @param inferenceSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageSummary withInferenceSpecification(InferenceSpecification inferenceSpecification) {
        setInferenceSpecification(inferenceSpecification);
        return this;
    }

    /**
     * <p>
     * The status of the mortgage package.
     * </p>
     * 
     * @param modelPackageStatus
     *        The status of the mortgage package.
     * @see ModelPackageStatus
     */

    public void setModelPackageStatus(String modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus;
    }

    /**
     * <p>
     * The status of the mortgage package.
     * </p>
     * 
     * @return The status of the mortgage package.
     * @see ModelPackageStatus
     */

    public String getModelPackageStatus() {
        return this.modelPackageStatus;
    }

    /**
     * <p>
     * The status of the mortgage package.
     * </p>
     * 
     * @param modelPackageStatus
     *        The status of the mortgage package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageStatus
     */

    public BatchDescribeModelPackageSummary withModelPackageStatus(String modelPackageStatus) {
        setModelPackageStatus(modelPackageStatus);
        return this;
    }

    /**
     * <p>
     * The status of the mortgage package.
     * </p>
     * 
     * @param modelPackageStatus
     *        The status of the mortgage package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageStatus
     */

    public BatchDescribeModelPackageSummary withModelPackageStatus(ModelPackageStatus modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus.toString();
        return this;
    }

    /**
     * <p>
     * The approval status of the model.
     * </p>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model.
     * @see ModelApprovalStatus
     */

    public void setModelApprovalStatus(String modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus;
    }

    /**
     * <p>
     * The approval status of the model.
     * </p>
     * 
     * @return The approval status of the model.
     * @see ModelApprovalStatus
     */

    public String getModelApprovalStatus() {
        return this.modelApprovalStatus;
    }

    /**
     * <p>
     * The approval status of the model.
     * </p>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public BatchDescribeModelPackageSummary withModelApprovalStatus(String modelApprovalStatus) {
        setModelApprovalStatus(modelApprovalStatus);
        return this;
    }

    /**
     * <p>
     * The approval status of the model.
     * </p>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public BatchDescribeModelPackageSummary withModelApprovalStatus(ModelApprovalStatus modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus.toString();
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
        if (getModelPackageGroupName() != null)
            sb.append("ModelPackageGroupName: ").append(getModelPackageGroupName()).append(",");
        if (getModelPackageVersion() != null)
            sb.append("ModelPackageVersion: ").append(getModelPackageVersion()).append(",");
        if (getModelPackageArn() != null)
            sb.append("ModelPackageArn: ").append(getModelPackageArn()).append(",");
        if (getModelPackageDescription() != null)
            sb.append("ModelPackageDescription: ").append(getModelPackageDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: ").append(getInferenceSpecification()).append(",");
        if (getModelPackageStatus() != null)
            sb.append("ModelPackageStatus: ").append(getModelPackageStatus()).append(",");
        if (getModelApprovalStatus() != null)
            sb.append("ModelApprovalStatus: ").append(getModelApprovalStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeModelPackageSummary == false)
            return false;
        BatchDescribeModelPackageSummary other = (BatchDescribeModelPackageSummary) obj;
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
            return false;
        if (other.getModelPackageVersion() == null ^ this.getModelPackageVersion() == null)
            return false;
        if (other.getModelPackageVersion() != null && other.getModelPackageVersion().equals(this.getModelPackageVersion()) == false)
            return false;
        if (other.getModelPackageArn() == null ^ this.getModelPackageArn() == null)
            return false;
        if (other.getModelPackageArn() != null && other.getModelPackageArn().equals(this.getModelPackageArn()) == false)
            return false;
        if (other.getModelPackageDescription() == null ^ this.getModelPackageDescription() == null)
            return false;
        if (other.getModelPackageDescription() != null && other.getModelPackageDescription().equals(this.getModelPackageDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getInferenceSpecification() == null ^ this.getInferenceSpecification() == null)
            return false;
        if (other.getInferenceSpecification() != null && other.getInferenceSpecification().equals(this.getInferenceSpecification()) == false)
            return false;
        if (other.getModelPackageStatus() == null ^ this.getModelPackageStatus() == null)
            return false;
        if (other.getModelPackageStatus() != null && other.getModelPackageStatus().equals(this.getModelPackageStatus()) == false)
            return false;
        if (other.getModelApprovalStatus() == null ^ this.getModelApprovalStatus() == null)
            return false;
        if (other.getModelApprovalStatus() != null && other.getModelApprovalStatus().equals(this.getModelApprovalStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageVersion() == null) ? 0 : getModelPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getModelPackageArn() == null) ? 0 : getModelPackageArn().hashCode());
        hashCode = prime * hashCode + ((getModelPackageDescription() == null) ? 0 : getModelPackageDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getInferenceSpecification() == null) ? 0 : getInferenceSpecification().hashCode());
        hashCode = prime * hashCode + ((getModelPackageStatus() == null) ? 0 : getModelPackageStatus().hashCode());
        hashCode = prime * hashCode + ((getModelApprovalStatus() == null) ? 0 : getModelApprovalStatus().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeModelPackageSummary clone() {
        try {
            return (BatchDescribeModelPackageSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.BatchDescribeModelPackageSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
