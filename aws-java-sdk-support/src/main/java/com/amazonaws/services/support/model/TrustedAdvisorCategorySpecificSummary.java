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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for summary information that relates to the category of the Trusted Advisor check.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/TrustedAdvisorCategorySpecificSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedAdvisorCategorySpecificSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing category.
     * </p>
     */
    private TrustedAdvisorCostOptimizingSummary costOptimizing;

    /**
     * <p>
     * The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing category.
     * </p>
     * 
     * @param costOptimizing
     *        The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing
     *        category.
     */

    public void setCostOptimizing(TrustedAdvisorCostOptimizingSummary costOptimizing) {
        this.costOptimizing = costOptimizing;
    }

    /**
     * <p>
     * The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing category.
     * </p>
     * 
     * @return The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing
     *         category.
     */

    public TrustedAdvisorCostOptimizingSummary getCostOptimizing() {
        return this.costOptimizing;
    }

    /**
     * <p>
     * The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing category.
     * </p>
     * 
     * @param costOptimizing
     *        The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing
     *        category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCategorySpecificSummary withCostOptimizing(TrustedAdvisorCostOptimizingSummary costOptimizing) {
        setCostOptimizing(costOptimizing);
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
        if (getCostOptimizing() != null)
            sb.append("CostOptimizing: ").append(getCostOptimizing());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCategorySpecificSummary == false)
            return false;
        TrustedAdvisorCategorySpecificSummary other = (TrustedAdvisorCategorySpecificSummary) obj;
        if (other.getCostOptimizing() == null ^ this.getCostOptimizing() == null)
            return false;
        if (other.getCostOptimizing() != null && other.getCostOptimizing().equals(this.getCostOptimizing()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCostOptimizing() == null) ? 0 : getCostOptimizing().hashCode());
        return hashCode;
    }

    @Override
    public TrustedAdvisorCategorySpecificSummary clone() {
        try {
            return (TrustedAdvisorCategorySpecificSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.TrustedAdvisorCategorySpecificSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
