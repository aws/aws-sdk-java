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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingPlan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePricingPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan that you're updating.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the pricing plan. The name must be unique to each pricing plan.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the pricing plan.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan that you're updating.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the pricing plan that you're updating.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan that you're updating.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pricing plan that you're updating.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan that you're updating.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the pricing plan that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePricingPlanRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the pricing plan. The name must be unique to each pricing plan.
     * </p>
     * 
     * @param name
     *        The name of the pricing plan. The name must be unique to each pricing plan.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pricing plan. The name must be unique to each pricing plan.
     * </p>
     * 
     * @return The name of the pricing plan. The name must be unique to each pricing plan.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pricing plan. The name must be unique to each pricing plan.
     * </p>
     * 
     * @param name
     *        The name of the pricing plan. The name must be unique to each pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePricingPlanRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the pricing plan.
     * </p>
     * 
     * @param description
     *        The description of the pricing plan.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the pricing plan.
     * </p>
     * 
     * @return The description of the pricing plan.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the pricing plan.
     * </p>
     * 
     * @param description
     *        The description of the pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePricingPlanRequest withDescription(String description) {
        setDescription(description);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePricingPlanRequest == false)
            return false;
        UpdatePricingPlanRequest other = (UpdatePricingPlanRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePricingPlanRequest clone() {
        return (UpdatePricingPlanRequest) super.clone();
    }

}
