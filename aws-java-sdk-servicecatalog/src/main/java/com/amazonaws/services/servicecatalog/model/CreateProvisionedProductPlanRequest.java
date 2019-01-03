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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProvisionedProductPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProvisionedProductPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The name of the plan.
     * </p>
     */
    private String planName;
    /**
     * <p>
     * The plan type.
     * </p>
     */
    private String planType;
    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     */
    private java.util.List<String> notificationArns;
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
     * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be
     * updated after the product is provisioned.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     */
    private java.util.List<UpdateProvisioningParameter> provisioningParameters;
    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedProductPlanRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
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

    public CreateProvisionedProductPlanRequest withPlanName(String planName) {
        setPlanName(planName);
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

    public CreateProvisionedProductPlanRequest withPlanType(String planType) {
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

    public CreateProvisionedProductPlanRequest withPlanType(ProvisionedProductPlanType planType) {
        this.planType = planType.toString();
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

    public CreateProvisionedProductPlanRequest withNotificationArns(String... notificationArns) {
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

    public CreateProvisionedProductPlanRequest withNotificationArns(java.util.Collection<String> notificationArns) {
        setNotificationArns(notificationArns);
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

    public CreateProvisionedProductPlanRequest withPathId(String pathId) {
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

    public CreateProvisionedProductPlanRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be
     * updated after the product is provisioned.
     * </p>
     * 
     * @param provisionedProductName
     *        A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot
     *        be updated after the product is provisioned.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be
     * updated after the product is provisioned.
     * </p>
     * 
     * @return A user-friendly name for the provisioned product. This value must be unique for the AWS account and
     *         cannot be updated after the product is provisioned.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be
     * updated after the product is provisioned.
     * </p>
     * 
     * @param provisionedProductName
     *        A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot
     *        be updated after the product is provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedProductPlanRequest withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
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

    public CreateProvisionedProductPlanRequest withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
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

    public CreateProvisionedProductPlanRequest withProvisioningParameters(UpdateProvisioningParameter... provisioningParameters) {
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

    public CreateProvisionedProductPlanRequest withProvisioningParameters(java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @return A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *         idempotency token, the same response is returned for each repeated request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedProductPlanRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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

    public CreateProvisionedProductPlanRequest withTags(Tag... tags) {
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

    public CreateProvisionedProductPlanRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getPlanName() != null)
            sb.append("PlanName: ").append(getPlanName()).append(",");
        if (getPlanType() != null)
            sb.append("PlanType: ").append(getPlanType()).append(",");
        if (getNotificationArns() != null)
            sb.append("NotificationArns: ").append(getNotificationArns()).append(",");
        if (getPathId() != null)
            sb.append("PathId: ").append(getPathId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: ").append(getProvisionedProductName()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: ").append(getProvisioningParameters()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
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

        if (obj instanceof CreateProvisionedProductPlanRequest == false)
            return false;
        CreateProvisionedProductPlanRequest other = (CreateProvisionedProductPlanRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPlanName() == null ^ this.getPlanName() == null)
            return false;
        if (other.getPlanName() != null && other.getPlanName().equals(this.getPlanName()) == false)
            return false;
        if (other.getPlanType() == null ^ this.getPlanType() == null)
            return false;
        if (other.getPlanType() != null && other.getPlanType().equals(this.getPlanType()) == false)
            return false;
        if (other.getNotificationArns() == null ^ this.getNotificationArns() == null)
            return false;
        if (other.getNotificationArns() != null && other.getNotificationArns().equals(this.getNotificationArns()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getProvisioningParameters() == null ^ this.getProvisioningParameters() == null)
            return false;
        if (other.getProvisioningParameters() != null && other.getProvisioningParameters().equals(this.getProvisioningParameters()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
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

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPlanName() == null) ? 0 : getPlanName().hashCode());
        hashCode = prime * hashCode + ((getPlanType() == null) ? 0 : getPlanType().hashCode());
        hashCode = prime * hashCode + ((getNotificationArns() == null) ? 0 : getNotificationArns().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningParameters() == null) ? 0 : getProvisioningParameters().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProvisionedProductPlanRequest clone() {
        return (CreateProvisionedProductPlanRequest) super.clone();
    }

}
