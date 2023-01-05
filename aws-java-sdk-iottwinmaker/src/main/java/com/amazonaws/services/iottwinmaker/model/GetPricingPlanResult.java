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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPricingPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPricingPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The chosen pricing plan for the current billing cycle.
     * </p>
     */
    private PricingPlan currentPricingPlan;
    /**
     * <p>
     * The pending pricing plan.
     * </p>
     */
    private PricingPlan pendingPricingPlan;

    /**
     * <p>
     * The chosen pricing plan for the current billing cycle.
     * </p>
     * 
     * @param currentPricingPlan
     *        The chosen pricing plan for the current billing cycle.
     */

    public void setCurrentPricingPlan(PricingPlan currentPricingPlan) {
        this.currentPricingPlan = currentPricingPlan;
    }

    /**
     * <p>
     * The chosen pricing plan for the current billing cycle.
     * </p>
     * 
     * @return The chosen pricing plan for the current billing cycle.
     */

    public PricingPlan getCurrentPricingPlan() {
        return this.currentPricingPlan;
    }

    /**
     * <p>
     * The chosen pricing plan for the current billing cycle.
     * </p>
     * 
     * @param currentPricingPlan
     *        The chosen pricing plan for the current billing cycle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPricingPlanResult withCurrentPricingPlan(PricingPlan currentPricingPlan) {
        setCurrentPricingPlan(currentPricingPlan);
        return this;
    }

    /**
     * <p>
     * The pending pricing plan.
     * </p>
     * 
     * @param pendingPricingPlan
     *        The pending pricing plan.
     */

    public void setPendingPricingPlan(PricingPlan pendingPricingPlan) {
        this.pendingPricingPlan = pendingPricingPlan;
    }

    /**
     * <p>
     * The pending pricing plan.
     * </p>
     * 
     * @return The pending pricing plan.
     */

    public PricingPlan getPendingPricingPlan() {
        return this.pendingPricingPlan;
    }

    /**
     * <p>
     * The pending pricing plan.
     * </p>
     * 
     * @param pendingPricingPlan
     *        The pending pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPricingPlanResult withPendingPricingPlan(PricingPlan pendingPricingPlan) {
        setPendingPricingPlan(pendingPricingPlan);
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
        if (getCurrentPricingPlan() != null)
            sb.append("CurrentPricingPlan: ").append(getCurrentPricingPlan()).append(",");
        if (getPendingPricingPlan() != null)
            sb.append("PendingPricingPlan: ").append(getPendingPricingPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPricingPlanResult == false)
            return false;
        GetPricingPlanResult other = (GetPricingPlanResult) obj;
        if (other.getCurrentPricingPlan() == null ^ this.getCurrentPricingPlan() == null)
            return false;
        if (other.getCurrentPricingPlan() != null && other.getCurrentPricingPlan().equals(this.getCurrentPricingPlan()) == false)
            return false;
        if (other.getPendingPricingPlan() == null ^ this.getPendingPricingPlan() == null)
            return false;
        if (other.getPendingPricingPlan() != null && other.getPendingPricingPlan().equals(this.getPendingPricingPlan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentPricingPlan() == null) ? 0 : getCurrentPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getPendingPricingPlan() == null) ? 0 : getPendingPricingPlan().hashCode());
        return hashCode;
    }

    @Override
    public GetPricingPlanResult clone() {
        try {
            return (GetPricingPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
