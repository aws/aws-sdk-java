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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateModelPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateModelPackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     */
    private String modelPackageArn;
    /**
     * <p>
     * The approval status of the model.
     * </p>
     */
    private String modelApprovalStatus;
    /**
     * <p>
     * A description for the approval status of the model.
     * </p>
     */
    private String approvalDescription;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @param modelPackageArn
     *        The Amazon Resource Name (ARN) of the model.
     */

    public void setModelPackageArn(String modelPackageArn) {
        this.modelPackageArn = modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model.
     */

    public String getModelPackageArn() {
        return this.modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @param modelPackageArn
     *        The Amazon Resource Name (ARN) of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelPackageRequest withModelPackageArn(String modelPackageArn) {
        setModelPackageArn(modelPackageArn);
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

    public UpdateModelPackageRequest withModelApprovalStatus(String modelApprovalStatus) {
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

    public UpdateModelPackageRequest withModelApprovalStatus(ModelApprovalStatus modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description for the approval status of the model.
     * </p>
     * 
     * @param approvalDescription
     *        A description for the approval status of the model.
     */

    public void setApprovalDescription(String approvalDescription) {
        this.approvalDescription = approvalDescription;
    }

    /**
     * <p>
     * A description for the approval status of the model.
     * </p>
     * 
     * @return A description for the approval status of the model.
     */

    public String getApprovalDescription() {
        return this.approvalDescription;
    }

    /**
     * <p>
     * A description for the approval status of the model.
     * </p>
     * 
     * @param approvalDescription
     *        A description for the approval status of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelPackageRequest withApprovalDescription(String approvalDescription) {
        setApprovalDescription(approvalDescription);
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
        if (getModelPackageArn() != null)
            sb.append("ModelPackageArn: ").append(getModelPackageArn()).append(",");
        if (getModelApprovalStatus() != null)
            sb.append("ModelApprovalStatus: ").append(getModelApprovalStatus()).append(",");
        if (getApprovalDescription() != null)
            sb.append("ApprovalDescription: ").append(getApprovalDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateModelPackageRequest == false)
            return false;
        UpdateModelPackageRequest other = (UpdateModelPackageRequest) obj;
        if (other.getModelPackageArn() == null ^ this.getModelPackageArn() == null)
            return false;
        if (other.getModelPackageArn() != null && other.getModelPackageArn().equals(this.getModelPackageArn()) == false)
            return false;
        if (other.getModelApprovalStatus() == null ^ this.getModelApprovalStatus() == null)
            return false;
        if (other.getModelApprovalStatus() != null && other.getModelApprovalStatus().equals(this.getModelApprovalStatus()) == false)
            return false;
        if (other.getApprovalDescription() == null ^ this.getApprovalDescription() == null)
            return false;
        if (other.getApprovalDescription() != null && other.getApprovalDescription().equals(this.getApprovalDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageArn() == null) ? 0 : getModelPackageArn().hashCode());
        hashCode = prime * hashCode + ((getModelApprovalStatus() == null) ? 0 : getModelApprovalStatus().hashCode());
        hashCode = prime * hashCode + ((getApprovalDescription() == null) ? 0 : getApprovalDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateModelPackageRequest clone() {
        return (UpdateModelPackageRequest) super.clone();
    }

}
