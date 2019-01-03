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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisionedProductPlanDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedProductPlanDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     */
    private String pathId;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The name of the plan.
     * </p>
     */
    private String planName;
    /**
     * <p>
     * The plan identifier.
     * </p>
     */
    private String planId;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String provisionProductId;
    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     */
    private String provisionProductName;
    /**
     * <p>
     * The plan type.
     * </p>
     */
    private String planType;
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time when the plan was last updated.
     * </p>
     */
    private java.util.Date updatedTime;
    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     */
    private java.util.List<String> notificationArns;
    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     */
    private java.util.List<UpdateProvisioningParameter> provisioningParameters;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The status message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @return The UTC time stamp of the creation time.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * 
     * @param pathId
     *        The path identifier of the product. This value is optional if the product has a default path, and required
     *        if the product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * 
     * @return The path identifier of the product. This value is optional if the product has a default path, and
     *         required if the product has more than one path. To list the paths for a product, use
     *         <a>ListLaunchPaths</a>.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * 
     * @param pathId
     *        The path identifier of the product. This value is optional if the product has a default path, and required
     *        if the product has more than one path. To list the paths for a product, use <a>ListLaunchPaths</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withPathId(String pathId) {
        setPathId(pathId);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The name of the plan.
     * </p>
     * 
     * @param planName
     *        The name of the plan.
     */

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * <p>
     * The name of the plan.
     * </p>
     * 
     * @return The name of the plan.
     */

    public String getPlanName() {
        return this.planName;
    }

    /**
     * <p>
     * The name of the plan.
     * </p>
     * 
     * @param planName
     *        The name of the plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withPlanName(String planName) {
        setPlanName(planName);
        return this;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * 
     * @param planId
     *        The plan identifier.
     */

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * 
     * @return The plan identifier.
     */

    public String getPlanId() {
        return this.planId;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * 
     * @param planId
     *        The plan identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withPlanId(String planId) {
        setPlanId(planId);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param provisionProductId
     *        The product identifier.
     */

    public void setProvisionProductId(String provisionProductId) {
        this.provisionProductId = provisionProductId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProvisionProductId() {
        return this.provisionProductId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param provisionProductId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withProvisionProductId(String provisionProductId) {
        setProvisionProductId(provisionProductId);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @param provisionProductName
     *        The user-friendly name of the provisioned product.
     */

    public void setProvisionProductName(String provisionProductName) {
        this.provisionProductName = provisionProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @return The user-friendly name of the provisioned product.
     */

    public String getProvisionProductName() {
        return this.provisionProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @param provisionProductName
     *        The user-friendly name of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withProvisionProductName(String provisionProductName) {
        setProvisionProductName(provisionProductName);
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planType
     *        The plan type.
     * @see ProvisionedProductPlanType
     */

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @return The plan type.
     * @see ProvisionedProductPlanType
     */

    public String getPlanType() {
        return this.planType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planType
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedProductPlanType
     */

    public ProvisionedProductPlanDetails withPlanType(String planType) {
        setPlanType(planType);
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planType
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedProductPlanType
     */

    public ProvisionedProductPlanDetails withPlanType(ProvisionedProductPlanType planType) {
        this.planType = planType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @return The identifier of the provisioning artifact.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see ProvisionedProductPlanStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see ProvisionedProductPlanStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedProductPlanStatus
     */

    public ProvisionedProductPlanDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedProductPlanStatus
     */

    public ProvisionedProductPlanDetails withStatus(ProvisionedProductPlanStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time when the plan was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time when the plan was last updated.
     */

    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The time when the plan was last updated.
     * </p>
     * 
     * @return The time when the plan was last updated.
     */

    public java.util.Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The time when the plan was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time when the plan was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withUpdatedTime(java.util.Date updatedTime) {
        setUpdatedTime(updatedTime);
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * 
     * @return Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     */

    public java.util.List<String> getNotificationArns() {
        return notificationArns;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * 
     * @param notificationArns
     *        Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     */

    public void setNotificationArns(java.util.Collection<String> notificationArns) {
        if (notificationArns == null) {
            this.notificationArns = null;
            return;
        }

        this.notificationArns = new java.util.ArrayList<String>(notificationArns);
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationArns(java.util.Collection)} or {@link #withNotificationArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notificationArns
     *        Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withNotificationArns(String... notificationArns) {
        if (this.notificationArns == null) {
            setNotificationArns(new java.util.ArrayList<String>(notificationArns.length));
        }
        for (String ele : notificationArns) {
            this.notificationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * 
     * @param notificationArns
     *        Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withNotificationArns(java.util.Collection<String> notificationArns) {
        setNotificationArns(notificationArns);
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * 
     * @return Parameters specified by the administrator that are required for provisioning the product.
     */

    public java.util.List<UpdateProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * 
     * @param provisioningParameters
     *        Parameters specified by the administrator that are required for provisioning the product.
     */

    public void setProvisioningParameters(java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        if (provisioningParameters == null) {
            this.provisioningParameters = null;
            return;
        }

        this.provisioningParameters = new java.util.ArrayList<UpdateProvisioningParameter>(provisioningParameters);
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningParameters(java.util.Collection)} or
     * {@link #withProvisioningParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningParameters
     *        Parameters specified by the administrator that are required for provisioning the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withProvisioningParameters(UpdateProvisioningParameter... provisioningParameters) {
        if (this.provisioningParameters == null) {
            setProvisioningParameters(new java.util.ArrayList<UpdateProvisioningParameter>(provisioningParameters.length));
        }
        for (UpdateProvisioningParameter ele : provisioningParameters) {
            this.provisioningParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * 
     * @param provisioningParameters
     *        Parameters specified by the administrator that are required for provisioning the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withProvisioningParameters(java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
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
     * One or more tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withTags(Tag... tags) {
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
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductPlanDetails withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getPathId() != null)
            sb.append("PathId: ").append(getPathId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getPlanName() != null)
            sb.append("PlanName: ").append(getPlanName()).append(",");
        if (getPlanId() != null)
            sb.append("PlanId: ").append(getPlanId()).append(",");
        if (getProvisionProductId() != null)
            sb.append("ProvisionProductId: ").append(getProvisionProductId()).append(",");
        if (getProvisionProductName() != null)
            sb.append("ProvisionProductName: ").append(getProvisionProductName()).append(",");
        if (getPlanType() != null)
            sb.append("PlanType: ").append(getPlanType()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime()).append(",");
        if (getNotificationArns() != null)
            sb.append("NotificationArns: ").append(getNotificationArns()).append(",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: ").append(getProvisioningParameters()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedProductPlanDetails == false)
            return false;
        ProvisionedProductPlanDetails other = (ProvisionedProductPlanDetails) obj;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getPlanName() == null ^ this.getPlanName() == null)
            return false;
        if (other.getPlanName() != null && other.getPlanName().equals(this.getPlanName()) == false)
            return false;
        if (other.getPlanId() == null ^ this.getPlanId() == null)
            return false;
        if (other.getPlanId() != null && other.getPlanId().equals(this.getPlanId()) == false)
            return false;
        if (other.getProvisionProductId() == null ^ this.getProvisionProductId() == null)
            return false;
        if (other.getProvisionProductId() != null && other.getProvisionProductId().equals(this.getProvisionProductId()) == false)
            return false;
        if (other.getProvisionProductName() == null ^ this.getProvisionProductName() == null)
            return false;
        if (other.getProvisionProductName() != null && other.getProvisionProductName().equals(this.getProvisionProductName()) == false)
            return false;
        if (other.getPlanType() == null ^ this.getPlanType() == null)
            return false;
        if (other.getPlanType() != null && other.getPlanType().equals(this.getPlanType()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        if (other.getNotificationArns() == null ^ this.getNotificationArns() == null)
            return false;
        if (other.getNotificationArns() != null && other.getNotificationArns().equals(this.getNotificationArns()) == false)
            return false;
        if (other.getProvisioningParameters() == null ^ this.getProvisioningParameters() == null)
            return false;
        if (other.getProvisioningParameters() != null && other.getProvisioningParameters().equals(this.getProvisioningParameters()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getPlanName() == null) ? 0 : getPlanName().hashCode());
        hashCode = prime * hashCode + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        hashCode = prime * hashCode + ((getProvisionProductId() == null) ? 0 : getProvisionProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisionProductName() == null) ? 0 : getProvisionProductName().hashCode());
        hashCode = prime * hashCode + ((getPlanType() == null) ? 0 : getPlanType().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getNotificationArns() == null) ? 0 : getNotificationArns().hashCode());
        hashCode = prime * hashCode + ((getProvisioningParameters() == null) ? 0 : getProvisioningParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedProductPlanDetails clone() {
        try {
            return (ProvisionedProductPlanDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProvisionedProductPlanDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
