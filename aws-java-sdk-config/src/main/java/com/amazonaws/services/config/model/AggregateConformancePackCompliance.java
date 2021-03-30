/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the number of compliant and noncompliant rules within a conformance pack. Also provides the total count of
 * compliant rules, noncompliant rules, and the rules that do not have any applicable resources to evaluate upon
 * resulting in insufficient data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AggregateConformancePackCompliance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateConformancePackCompliance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compliance status of the conformance pack.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The number of compliant AWS Config Rules.
     * </p>
     */
    private Integer compliantRuleCount;
    /**
     * <p>
     * The number of noncompliant AWS Config Rules.
     * </p>
     */
    private Integer nonCompliantRuleCount;
    /**
     * <p>
     * Total number of compliant rules, noncompliant rules, and the rules that do not have any applicable resources to
     * evaluate upon resulting in insufficient data.
     * </p>
     */
    private Integer totalRuleCount;

    /**
     * <p>
     * The compliance status of the conformance pack.
     * </p>
     * 
     * @param complianceType
     *        The compliance status of the conformance pack.
     * @see ConformancePackComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The compliance status of the conformance pack.
     * </p>
     * 
     * @return The compliance status of the conformance pack.
     * @see ConformancePackComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The compliance status of the conformance pack.
     * </p>
     * 
     * @param complianceType
     *        The compliance status of the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public AggregateConformancePackCompliance withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The compliance status of the conformance pack.
     * </p>
     * 
     * @param complianceType
     *        The compliance status of the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public AggregateConformancePackCompliance withComplianceType(ConformancePackComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of compliant AWS Config Rules.
     * </p>
     * 
     * @param compliantRuleCount
     *        The number of compliant AWS Config Rules.
     */

    public void setCompliantRuleCount(Integer compliantRuleCount) {
        this.compliantRuleCount = compliantRuleCount;
    }

    /**
     * <p>
     * The number of compliant AWS Config Rules.
     * </p>
     * 
     * @return The number of compliant AWS Config Rules.
     */

    public Integer getCompliantRuleCount() {
        return this.compliantRuleCount;
    }

    /**
     * <p>
     * The number of compliant AWS Config Rules.
     * </p>
     * 
     * @param compliantRuleCount
     *        The number of compliant AWS Config Rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConformancePackCompliance withCompliantRuleCount(Integer compliantRuleCount) {
        setCompliantRuleCount(compliantRuleCount);
        return this;
    }

    /**
     * <p>
     * The number of noncompliant AWS Config Rules.
     * </p>
     * 
     * @param nonCompliantRuleCount
     *        The number of noncompliant AWS Config Rules.
     */

    public void setNonCompliantRuleCount(Integer nonCompliantRuleCount) {
        this.nonCompliantRuleCount = nonCompliantRuleCount;
    }

    /**
     * <p>
     * The number of noncompliant AWS Config Rules.
     * </p>
     * 
     * @return The number of noncompliant AWS Config Rules.
     */

    public Integer getNonCompliantRuleCount() {
        return this.nonCompliantRuleCount;
    }

    /**
     * <p>
     * The number of noncompliant AWS Config Rules.
     * </p>
     * 
     * @param nonCompliantRuleCount
     *        The number of noncompliant AWS Config Rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConformancePackCompliance withNonCompliantRuleCount(Integer nonCompliantRuleCount) {
        setNonCompliantRuleCount(nonCompliantRuleCount);
        return this;
    }

    /**
     * <p>
     * Total number of compliant rules, noncompliant rules, and the rules that do not have any applicable resources to
     * evaluate upon resulting in insufficient data.
     * </p>
     * 
     * @param totalRuleCount
     *        Total number of compliant rules, noncompliant rules, and the rules that do not have any applicable
     *        resources to evaluate upon resulting in insufficient data.
     */

    public void setTotalRuleCount(Integer totalRuleCount) {
        this.totalRuleCount = totalRuleCount;
    }

    /**
     * <p>
     * Total number of compliant rules, noncompliant rules, and the rules that do not have any applicable resources to
     * evaluate upon resulting in insufficient data.
     * </p>
     * 
     * @return Total number of compliant rules, noncompliant rules, and the rules that do not have any applicable
     *         resources to evaluate upon resulting in insufficient data.
     */

    public Integer getTotalRuleCount() {
        return this.totalRuleCount;
    }

    /**
     * <p>
     * Total number of compliant rules, noncompliant rules, and the rules that do not have any applicable resources to
     * evaluate upon resulting in insufficient data.
     * </p>
     * 
     * @param totalRuleCount
     *        Total number of compliant rules, noncompliant rules, and the rules that do not have any applicable
     *        resources to evaluate upon resulting in insufficient data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConformancePackCompliance withTotalRuleCount(Integer totalRuleCount) {
        setTotalRuleCount(totalRuleCount);
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
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getCompliantRuleCount() != null)
            sb.append("CompliantRuleCount: ").append(getCompliantRuleCount()).append(",");
        if (getNonCompliantRuleCount() != null)
            sb.append("NonCompliantRuleCount: ").append(getNonCompliantRuleCount()).append(",");
        if (getTotalRuleCount() != null)
            sb.append("TotalRuleCount: ").append(getTotalRuleCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregateConformancePackCompliance == false)
            return false;
        AggregateConformancePackCompliance other = (AggregateConformancePackCompliance) obj;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getCompliantRuleCount() == null ^ this.getCompliantRuleCount() == null)
            return false;
        if (other.getCompliantRuleCount() != null && other.getCompliantRuleCount().equals(this.getCompliantRuleCount()) == false)
            return false;
        if (other.getNonCompliantRuleCount() == null ^ this.getNonCompliantRuleCount() == null)
            return false;
        if (other.getNonCompliantRuleCount() != null && other.getNonCompliantRuleCount().equals(this.getNonCompliantRuleCount()) == false)
            return false;
        if (other.getTotalRuleCount() == null ^ this.getTotalRuleCount() == null)
            return false;
        if (other.getTotalRuleCount() != null && other.getTotalRuleCount().equals(this.getTotalRuleCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getCompliantRuleCount() == null) ? 0 : getCompliantRuleCount().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantRuleCount() == null) ? 0 : getNonCompliantRuleCount().hashCode());
        hashCode = prime * hashCode + ((getTotalRuleCount() == null) ? 0 : getTotalRuleCount().hashCode());
        return hashCode;
    }

    @Override
    public AggregateConformancePackCompliance clone() {
        try {
            return (AggregateConformancePackCompliance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AggregateConformancePackComplianceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
