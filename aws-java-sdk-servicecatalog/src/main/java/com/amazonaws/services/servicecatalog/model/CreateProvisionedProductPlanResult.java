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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProvisionedProductPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProvisionedProductPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
    private String provisionedProductName;
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactId;

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

    public CreateProvisionedProductPlanResult withPlanName(String planName) {
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

    public CreateProvisionedProductPlanResult withPlanId(String planId) {
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

    public CreateProvisionedProductPlanResult withProvisionProductId(String provisionProductId) {
        setProvisionProductId(provisionProductId);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @param provisionedProductName
     *        The user-friendly name of the provisioned product.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @return The user-friendly name of the provisioned product.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @param provisionedProductName
     *        The user-friendly name of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedProductPlanResult withProvisionedProductName(String provisionedProductName) {
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

    public CreateProvisionedProductPlanResult withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
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
        if (getPlanName() != null)
            sb.append("PlanName: ").append(getPlanName()).append(",");
        if (getPlanId() != null)
            sb.append("PlanId: ").append(getPlanId()).append(",");
        if (getProvisionProductId() != null)
            sb.append("ProvisionProductId: ").append(getProvisionProductId()).append(",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: ").append(getProvisionedProductName()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisionedProductPlanResult == false)
            return false;
        CreateProvisionedProductPlanResult other = (CreateProvisionedProductPlanResult) obj;
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
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlanName() == null) ? 0 : getPlanName().hashCode());
        hashCode = prime * hashCode + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        hashCode = prime * hashCode + ((getProvisionProductId() == null) ? 0 : getProvisionProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        return hashCode;
    }

    @Override
    public CreateProvisionedProductPlanResult clone() {
        try {
            return (CreateProvisionedProductPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
