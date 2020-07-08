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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Enables you to customize recommendations across two attributes. You can choose to view recommendations for instances
 * within the same instance families or across different instance families. You can also choose to view your estimated
 * savings associated with recommendations with consideration of existing Savings Plans or RI benefits, or neither.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/RightsizingRecommendationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RightsizingRecommendationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The option to see recommendations within the same instance family, or recommendations for instances across other
     * families. The default value is <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     */
    private String recommendationTarget;
    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your savings calculation. The default value is
     * <code>TRUE</code>.
     * </p>
     */
    private Boolean benefitsConsidered;

    /**
     * <p>
     * The option to see recommendations within the same instance family, or recommendations for instances across other
     * families. The default value is <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * 
     * @param recommendationTarget
     *        The option to see recommendations within the same instance family, or recommendations for instances across
     *        other families. The default value is <code>SAME_INSTANCE_FAMILY</code>.
     * @see RecommendationTarget
     */

    public void setRecommendationTarget(String recommendationTarget) {
        this.recommendationTarget = recommendationTarget;
    }

    /**
     * <p>
     * The option to see recommendations within the same instance family, or recommendations for instances across other
     * families. The default value is <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * 
     * @return The option to see recommendations within the same instance family, or recommendations for instances
     *         across other families. The default value is <code>SAME_INSTANCE_FAMILY</code>.
     * @see RecommendationTarget
     */

    public String getRecommendationTarget() {
        return this.recommendationTarget;
    }

    /**
     * <p>
     * The option to see recommendations within the same instance family, or recommendations for instances across other
     * families. The default value is <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * 
     * @param recommendationTarget
     *        The option to see recommendations within the same instance family, or recommendations for instances across
     *        other families. The default value is <code>SAME_INSTANCE_FAMILY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationTarget
     */

    public RightsizingRecommendationConfiguration withRecommendationTarget(String recommendationTarget) {
        setRecommendationTarget(recommendationTarget);
        return this;
    }

    /**
     * <p>
     * The option to see recommendations within the same instance family, or recommendations for instances across other
     * families. The default value is <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * 
     * @param recommendationTarget
     *        The option to see recommendations within the same instance family, or recommendations for instances across
     *        other families. The default value is <code>SAME_INSTANCE_FAMILY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationTarget
     */

    public RightsizingRecommendationConfiguration withRecommendationTarget(RecommendationTarget recommendationTarget) {
        this.recommendationTarget = recommendationTarget.toString();
        return this;
    }

    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your savings calculation. The default value is
     * <code>TRUE</code>.
     * </p>
     * 
     * @param benefitsConsidered
     *        The option to consider RI or Savings Plans discount benefits in your savings calculation. The default
     *        value is <code>TRUE</code>.
     */

    public void setBenefitsConsidered(Boolean benefitsConsidered) {
        this.benefitsConsidered = benefitsConsidered;
    }

    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your savings calculation. The default value is
     * <code>TRUE</code>.
     * </p>
     * 
     * @return The option to consider RI or Savings Plans discount benefits in your savings calculation. The default
     *         value is <code>TRUE</code>.
     */

    public Boolean getBenefitsConsidered() {
        return this.benefitsConsidered;
    }

    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your savings calculation. The default value is
     * <code>TRUE</code>.
     * </p>
     * 
     * @param benefitsConsidered
     *        The option to consider RI or Savings Plans discount benefits in your savings calculation. The default
     *        value is <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendationConfiguration withBenefitsConsidered(Boolean benefitsConsidered) {
        setBenefitsConsidered(benefitsConsidered);
        return this;
    }

    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your savings calculation. The default value is
     * <code>TRUE</code>.
     * </p>
     * 
     * @return The option to consider RI or Savings Plans discount benefits in your savings calculation. The default
     *         value is <code>TRUE</code>.
     */

    public Boolean isBenefitsConsidered() {
        return this.benefitsConsidered;
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
        if (getRecommendationTarget() != null)
            sb.append("RecommendationTarget: ").append(getRecommendationTarget()).append(",");
        if (getBenefitsConsidered() != null)
            sb.append("BenefitsConsidered: ").append(getBenefitsConsidered());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RightsizingRecommendationConfiguration == false)
            return false;
        RightsizingRecommendationConfiguration other = (RightsizingRecommendationConfiguration) obj;
        if (other.getRecommendationTarget() == null ^ this.getRecommendationTarget() == null)
            return false;
        if (other.getRecommendationTarget() != null && other.getRecommendationTarget().equals(this.getRecommendationTarget()) == false)
            return false;
        if (other.getBenefitsConsidered() == null ^ this.getBenefitsConsidered() == null)
            return false;
        if (other.getBenefitsConsidered() != null && other.getBenefitsConsidered().equals(this.getBenefitsConsidered()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationTarget() == null) ? 0 : getRecommendationTarget().hashCode());
        hashCode = prime * hashCode + ((getBenefitsConsidered() == null) ? 0 : getBenefitsConsidered().hashCode());
        return hashCode;
    }

    @Override
    public RightsizingRecommendationConfiguration clone() {
        try {
            return (RightsizingRecommendationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.RightsizingRecommendationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
