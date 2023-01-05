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
     * The Amazon Resource Name (ARN) of the model package.
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
     * The metadata properties associated with the model package versions.
     * </p>
     */
    private java.util.Map<String, String> customerMetadataProperties;
    /**
     * <p>
     * The metadata properties associated with the model package versions to remove.
     * </p>
     */
    private java.util.List<String> customerMetadataPropertiesToRemove;
    /**
     * <p>
     * An array of additional Inference Specification objects to be added to the existing array additional Inference
     * Specification. Total number of additional Inference Specifications can not exceed 15. Each additional Inference
     * Specification specifies artifacts based on this model package that can be used on inference endpoints. Generally
     * used with SageMaker Neo to store the compiled artifacts.
     * </p>
     */
    private java.util.List<AdditionalInferenceSpecificationDefinition> additionalInferenceSpecificationsToAdd;

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
     * <p>
     * The metadata properties associated with the model package versions.
     * </p>
     * 
     * @return The metadata properties associated with the model package versions.
     */

    public java.util.Map<String, String> getCustomerMetadataProperties() {
        return customerMetadataProperties;
    }

    /**
     * <p>
     * The metadata properties associated with the model package versions.
     * </p>
     * 
     * @param customerMetadataProperties
     *        The metadata properties associated with the model package versions.
     */

    public void setCustomerMetadataProperties(java.util.Map<String, String> customerMetadataProperties) {
        this.customerMetadataProperties = customerMetadataProperties;
    }

    /**
     * <p>
     * The metadata properties associated with the model package versions.
     * </p>
     * 
     * @param customerMetadataProperties
     *        The metadata properties associated with the model package versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelPackageRequest withCustomerMetadataProperties(java.util.Map<String, String> customerMetadataProperties) {
        setCustomerMetadataProperties(customerMetadataProperties);
        return this;
    }

    /**
     * Add a single CustomerMetadataProperties entry
     *
     * @see UpdateModelPackageRequest#withCustomerMetadataProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelPackageRequest addCustomerMetadataPropertiesEntry(String key, String value) {
        if (null == this.customerMetadataProperties) {
            this.customerMetadataProperties = new java.util.HashMap<String, String>();
        }
        if (this.customerMetadataProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.customerMetadataProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CustomerMetadataProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelPackageRequest clearCustomerMetadataPropertiesEntries() {
        this.customerMetadataProperties = null;
        return this;
    }

    /**
     * <p>
     * The metadata properties associated with the model package versions to remove.
     * </p>
     * 
     * @return The metadata properties associated with the model package versions to remove.
     */

    public java.util.List<String> getCustomerMetadataPropertiesToRemove() {
        return customerMetadataPropertiesToRemove;
    }

    /**
     * <p>
     * The metadata properties associated with the model package versions to remove.
     * </p>
     * 
     * @param customerMetadataPropertiesToRemove
     *        The metadata properties associated with the model package versions to remove.
     */

    public void setCustomerMetadataPropertiesToRemove(java.util.Collection<String> customerMetadataPropertiesToRemove) {
        if (customerMetadataPropertiesToRemove == null) {
            this.customerMetadataPropertiesToRemove = null;
            return;
        }

        this.customerMetadataPropertiesToRemove = new java.util.ArrayList<String>(customerMetadataPropertiesToRemove);
    }

    /**
     * <p>
     * The metadata properties associated with the model package versions to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomerMetadataPropertiesToRemove(java.util.Collection)} or
     * {@link #withCustomerMetadataPropertiesToRemove(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param customerMetadataPropertiesToRemove
     *        The metadata properties associated with the model package versions to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelPackageRequest withCustomerMetadataPropertiesToRemove(String... customerMetadataPropertiesToRemove) {
        if (this.customerMetadataPropertiesToRemove == null) {
            setCustomerMetadataPropertiesToRemove(new java.util.ArrayList<String>(customerMetadataPropertiesToRemove.length));
        }
        for (String ele : customerMetadataPropertiesToRemove) {
            this.customerMetadataPropertiesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata properties associated with the model package versions to remove.
     * </p>
     * 
     * @param customerMetadataPropertiesToRemove
     *        The metadata properties associated with the model package versions to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelPackageRequest withCustomerMetadataPropertiesToRemove(java.util.Collection<String> customerMetadataPropertiesToRemove) {
        setCustomerMetadataPropertiesToRemove(customerMetadataPropertiesToRemove);
        return this;
    }

    /**
     * <p>
     * An array of additional Inference Specification objects to be added to the existing array additional Inference
     * Specification. Total number of additional Inference Specifications can not exceed 15. Each additional Inference
     * Specification specifies artifacts based on this model package that can be used on inference endpoints. Generally
     * used with SageMaker Neo to store the compiled artifacts.
     * </p>
     * 
     * @return An array of additional Inference Specification objects to be added to the existing array additional
     *         Inference Specification. Total number of additional Inference Specifications can not exceed 15. Each
     *         additional Inference Specification specifies artifacts based on this model package that can be used on
     *         inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
     */

    public java.util.List<AdditionalInferenceSpecificationDefinition> getAdditionalInferenceSpecificationsToAdd() {
        return additionalInferenceSpecificationsToAdd;
    }

    /**
     * <p>
     * An array of additional Inference Specification objects to be added to the existing array additional Inference
     * Specification. Total number of additional Inference Specifications can not exceed 15. Each additional Inference
     * Specification specifies artifacts based on this model package that can be used on inference endpoints. Generally
     * used with SageMaker Neo to store the compiled artifacts.
     * </p>
     * 
     * @param additionalInferenceSpecificationsToAdd
     *        An array of additional Inference Specification objects to be added to the existing array additional
     *        Inference Specification. Total number of additional Inference Specifications can not exceed 15. Each
     *        additional Inference Specification specifies artifacts based on this model package that can be used on
     *        inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
     */

    public void setAdditionalInferenceSpecificationsToAdd(
            java.util.Collection<AdditionalInferenceSpecificationDefinition> additionalInferenceSpecificationsToAdd) {
        if (additionalInferenceSpecificationsToAdd == null) {
            this.additionalInferenceSpecificationsToAdd = null;
            return;
        }

        this.additionalInferenceSpecificationsToAdd = new java.util.ArrayList<AdditionalInferenceSpecificationDefinition>(
                additionalInferenceSpecificationsToAdd);
    }

    /**
     * <p>
     * An array of additional Inference Specification objects to be added to the existing array additional Inference
     * Specification. Total number of additional Inference Specifications can not exceed 15. Each additional Inference
     * Specification specifies artifacts based on this model package that can be used on inference endpoints. Generally
     * used with SageMaker Neo to store the compiled artifacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalInferenceSpecificationsToAdd(java.util.Collection)} or
     * {@link #withAdditionalInferenceSpecificationsToAdd(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param additionalInferenceSpecificationsToAdd
     *        An array of additional Inference Specification objects to be added to the existing array additional
     *        Inference Specification. Total number of additional Inference Specifications can not exceed 15. Each
     *        additional Inference Specification specifies artifacts based on this model package that can be used on
     *        inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelPackageRequest withAdditionalInferenceSpecificationsToAdd(
            AdditionalInferenceSpecificationDefinition... additionalInferenceSpecificationsToAdd) {
        if (this.additionalInferenceSpecificationsToAdd == null) {
            setAdditionalInferenceSpecificationsToAdd(new java.util.ArrayList<AdditionalInferenceSpecificationDefinition>(
                    additionalInferenceSpecificationsToAdd.length));
        }
        for (AdditionalInferenceSpecificationDefinition ele : additionalInferenceSpecificationsToAdd) {
            this.additionalInferenceSpecificationsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of additional Inference Specification objects to be added to the existing array additional Inference
     * Specification. Total number of additional Inference Specifications can not exceed 15. Each additional Inference
     * Specification specifies artifacts based on this model package that can be used on inference endpoints. Generally
     * used with SageMaker Neo to store the compiled artifacts.
     * </p>
     * 
     * @param additionalInferenceSpecificationsToAdd
     *        An array of additional Inference Specification objects to be added to the existing array additional
     *        Inference Specification. Total number of additional Inference Specifications can not exceed 15. Each
     *        additional Inference Specification specifies artifacts based on this model package that can be used on
     *        inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelPackageRequest withAdditionalInferenceSpecificationsToAdd(
            java.util.Collection<AdditionalInferenceSpecificationDefinition> additionalInferenceSpecificationsToAdd) {
        setAdditionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd);
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
            sb.append("ApprovalDescription: ").append(getApprovalDescription()).append(",");
        if (getCustomerMetadataProperties() != null)
            sb.append("CustomerMetadataProperties: ").append(getCustomerMetadataProperties()).append(",");
        if (getCustomerMetadataPropertiesToRemove() != null)
            sb.append("CustomerMetadataPropertiesToRemove: ").append(getCustomerMetadataPropertiesToRemove()).append(",");
        if (getAdditionalInferenceSpecificationsToAdd() != null)
            sb.append("AdditionalInferenceSpecificationsToAdd: ").append(getAdditionalInferenceSpecificationsToAdd());
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
        if (other.getCustomerMetadataProperties() == null ^ this.getCustomerMetadataProperties() == null)
            return false;
        if (other.getCustomerMetadataProperties() != null && other.getCustomerMetadataProperties().equals(this.getCustomerMetadataProperties()) == false)
            return false;
        if (other.getCustomerMetadataPropertiesToRemove() == null ^ this.getCustomerMetadataPropertiesToRemove() == null)
            return false;
        if (other.getCustomerMetadataPropertiesToRemove() != null
                && other.getCustomerMetadataPropertiesToRemove().equals(this.getCustomerMetadataPropertiesToRemove()) == false)
            return false;
        if (other.getAdditionalInferenceSpecificationsToAdd() == null ^ this.getAdditionalInferenceSpecificationsToAdd() == null)
            return false;
        if (other.getAdditionalInferenceSpecificationsToAdd() != null
                && other.getAdditionalInferenceSpecificationsToAdd().equals(this.getAdditionalInferenceSpecificationsToAdd()) == false)
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
        hashCode = prime * hashCode + ((getCustomerMetadataProperties() == null) ? 0 : getCustomerMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getCustomerMetadataPropertiesToRemove() == null) ? 0 : getCustomerMetadataPropertiesToRemove().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInferenceSpecificationsToAdd() == null) ? 0 : getAdditionalInferenceSpecificationsToAdd().hashCode());
        return hashCode;
    }

    @Override
    public UpdateModelPackageRequest clone() {
        return (UpdateModelPackageRequest) super.clone();
    }

}
