/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A metric for a particular lens in a workload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/LensMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LensMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lens ARN.
     * </p>
     */
    private String lensArn;
    /**
     * <p>
     * The metrics for the pillars in a lens.
     * </p>
     */
    private java.util.List<PillarMetric> pillars;

    private java.util.Map<String, Integer> riskCounts;

    /**
     * <p>
     * The lens ARN.
     * </p>
     * 
     * @param lensArn
     *        The lens ARN.
     */

    public void setLensArn(String lensArn) {
        this.lensArn = lensArn;
    }

    /**
     * <p>
     * The lens ARN.
     * </p>
     * 
     * @return The lens ARN.
     */

    public String getLensArn() {
        return this.lensArn;
    }

    /**
     * <p>
     * The lens ARN.
     * </p>
     * 
     * @param lensArn
     *        The lens ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensMetric withLensArn(String lensArn) {
        setLensArn(lensArn);
        return this;
    }

    /**
     * <p>
     * The metrics for the pillars in a lens.
     * </p>
     * 
     * @return The metrics for the pillars in a lens.
     */

    public java.util.List<PillarMetric> getPillars() {
        return pillars;
    }

    /**
     * <p>
     * The metrics for the pillars in a lens.
     * </p>
     * 
     * @param pillars
     *        The metrics for the pillars in a lens.
     */

    public void setPillars(java.util.Collection<PillarMetric> pillars) {
        if (pillars == null) {
            this.pillars = null;
            return;
        }

        this.pillars = new java.util.ArrayList<PillarMetric>(pillars);
    }

    /**
     * <p>
     * The metrics for the pillars in a lens.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPillars(java.util.Collection)} or {@link #withPillars(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param pillars
     *        The metrics for the pillars in a lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensMetric withPillars(PillarMetric... pillars) {
        if (this.pillars == null) {
            setPillars(new java.util.ArrayList<PillarMetric>(pillars.length));
        }
        for (PillarMetric ele : pillars) {
            this.pillars.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics for the pillars in a lens.
     * </p>
     * 
     * @param pillars
     *        The metrics for the pillars in a lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensMetric withPillars(java.util.Collection<PillarMetric> pillars) {
        setPillars(pillars);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, Integer> getRiskCounts() {
        return riskCounts;
    }

    /**
     * @param riskCounts
     */

    public void setRiskCounts(java.util.Map<String, Integer> riskCounts) {
        this.riskCounts = riskCounts;
    }

    /**
     * @param riskCounts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensMetric withRiskCounts(java.util.Map<String, Integer> riskCounts) {
        setRiskCounts(riskCounts);
        return this;
    }

    /**
     * Add a single RiskCounts entry
     *
     * @see LensMetric#withRiskCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LensMetric addRiskCountsEntry(String key, Integer value) {
        if (null == this.riskCounts) {
            this.riskCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.riskCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.riskCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RiskCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensMetric clearRiskCountsEntries() {
        this.riskCounts = null;
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
        if (getLensArn() != null)
            sb.append("LensArn: ").append(getLensArn()).append(",");
        if (getPillars() != null)
            sb.append("Pillars: ").append(getPillars()).append(",");
        if (getRiskCounts() != null)
            sb.append("RiskCounts: ").append(getRiskCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LensMetric == false)
            return false;
        LensMetric other = (LensMetric) obj;
        if (other.getLensArn() == null ^ this.getLensArn() == null)
            return false;
        if (other.getLensArn() != null && other.getLensArn().equals(this.getLensArn()) == false)
            return false;
        if (other.getPillars() == null ^ this.getPillars() == null)
            return false;
        if (other.getPillars() != null && other.getPillars().equals(this.getPillars()) == false)
            return false;
        if (other.getRiskCounts() == null ^ this.getRiskCounts() == null)
            return false;
        if (other.getRiskCounts() != null && other.getRiskCounts().equals(this.getRiskCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensArn() == null) ? 0 : getLensArn().hashCode());
        hashCode = prime * hashCode + ((getPillars() == null) ? 0 : getPillars().hashCode());
        hashCode = prime * hashCode + ((getRiskCounts() == null) ? 0 : getRiskCounts().hashCode());
        return hashCode;
    }

    @Override
    public LensMetric clone() {
        try {
            return (LensMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.LensMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
