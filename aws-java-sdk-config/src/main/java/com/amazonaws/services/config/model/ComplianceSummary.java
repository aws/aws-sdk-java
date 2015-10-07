/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The number of AWS Config rules or AWS resources that are compliant and
 * noncompliant, up to a maximum.
 * </p>
 */
public class ComplianceSummary implements Serializable, Cloneable {

    /**
     * The number of AWS Config rules or AWS resources that are compliant, up
     * to a maximum of 25 for rules and 100 for resources.
     */
    private ComplianceContributorCount compliantResourceCount;

    /**
     * The number of AWS Config rules or AWS resources that are noncompliant,
     * up to a maximum of 25 for rules and 100 for resources.
     */
    private ComplianceContributorCount nonCompliantResourceCount;

    /**
     * The time that AWS Config created the compliance summary.
     */
    private java.util.Date complianceSummaryTimestamp;

    /**
     * The number of AWS Config rules or AWS resources that are compliant, up
     * to a maximum of 25 for rules and 100 for resources.
     *
     * @return The number of AWS Config rules or AWS resources that are compliant, up
     *         to a maximum of 25 for rules and 100 for resources.
     */
    public ComplianceContributorCount getCompliantResourceCount() {
        return compliantResourceCount;
    }
    
    /**
     * The number of AWS Config rules or AWS resources that are compliant, up
     * to a maximum of 25 for rules and 100 for resources.
     *
     * @param compliantResourceCount The number of AWS Config rules or AWS resources that are compliant, up
     *         to a maximum of 25 for rules and 100 for resources.
     */
    public void setCompliantResourceCount(ComplianceContributorCount compliantResourceCount) {
        this.compliantResourceCount = compliantResourceCount;
    }
    
    /**
     * The number of AWS Config rules or AWS resources that are compliant, up
     * to a maximum of 25 for rules and 100 for resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param compliantResourceCount The number of AWS Config rules or AWS resources that are compliant, up
     *         to a maximum of 25 for rules and 100 for resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ComplianceSummary withCompliantResourceCount(ComplianceContributorCount compliantResourceCount) {
        this.compliantResourceCount = compliantResourceCount;
        return this;
    }

    /**
     * The number of AWS Config rules or AWS resources that are noncompliant,
     * up to a maximum of 25 for rules and 100 for resources.
     *
     * @return The number of AWS Config rules or AWS resources that are noncompliant,
     *         up to a maximum of 25 for rules and 100 for resources.
     */
    public ComplianceContributorCount getNonCompliantResourceCount() {
        return nonCompliantResourceCount;
    }
    
    /**
     * The number of AWS Config rules or AWS resources that are noncompliant,
     * up to a maximum of 25 for rules and 100 for resources.
     *
     * @param nonCompliantResourceCount The number of AWS Config rules or AWS resources that are noncompliant,
     *         up to a maximum of 25 for rules and 100 for resources.
     */
    public void setNonCompliantResourceCount(ComplianceContributorCount nonCompliantResourceCount) {
        this.nonCompliantResourceCount = nonCompliantResourceCount;
    }
    
    /**
     * The number of AWS Config rules or AWS resources that are noncompliant,
     * up to a maximum of 25 for rules and 100 for resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nonCompliantResourceCount The number of AWS Config rules or AWS resources that are noncompliant,
     *         up to a maximum of 25 for rules and 100 for resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ComplianceSummary withNonCompliantResourceCount(ComplianceContributorCount nonCompliantResourceCount) {
        this.nonCompliantResourceCount = nonCompliantResourceCount;
        return this;
    }

    /**
     * The time that AWS Config created the compliance summary.
     *
     * @return The time that AWS Config created the compliance summary.
     */
    public java.util.Date getComplianceSummaryTimestamp() {
        return complianceSummaryTimestamp;
    }
    
    /**
     * The time that AWS Config created the compliance summary.
     *
     * @param complianceSummaryTimestamp The time that AWS Config created the compliance summary.
     */
    public void setComplianceSummaryTimestamp(java.util.Date complianceSummaryTimestamp) {
        this.complianceSummaryTimestamp = complianceSummaryTimestamp;
    }
    
    /**
     * The time that AWS Config created the compliance summary.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param complianceSummaryTimestamp The time that AWS Config created the compliance summary.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ComplianceSummary withComplianceSummaryTimestamp(java.util.Date complianceSummaryTimestamp) {
        this.complianceSummaryTimestamp = complianceSummaryTimestamp;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCompliantResourceCount() != null) sb.append("CompliantResourceCount: " + getCompliantResourceCount() + ",");
        if (getNonCompliantResourceCount() != null) sb.append("NonCompliantResourceCount: " + getNonCompliantResourceCount() + ",");
        if (getComplianceSummaryTimestamp() != null) sb.append("ComplianceSummaryTimestamp: " + getComplianceSummaryTimestamp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCompliantResourceCount() == null) ? 0 : getCompliantResourceCount().hashCode()); 
        hashCode = prime * hashCode + ((getNonCompliantResourceCount() == null) ? 0 : getNonCompliantResourceCount().hashCode()); 
        hashCode = prime * hashCode + ((getComplianceSummaryTimestamp() == null) ? 0 : getComplianceSummaryTimestamp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ComplianceSummary == false) return false;
        ComplianceSummary other = (ComplianceSummary)obj;
        
        if (other.getCompliantResourceCount() == null ^ this.getCompliantResourceCount() == null) return false;
        if (other.getCompliantResourceCount() != null && other.getCompliantResourceCount().equals(this.getCompliantResourceCount()) == false) return false; 
        if (other.getNonCompliantResourceCount() == null ^ this.getNonCompliantResourceCount() == null) return false;
        if (other.getNonCompliantResourceCount() != null && other.getNonCompliantResourceCount().equals(this.getNonCompliantResourceCount()) == false) return false; 
        if (other.getComplianceSummaryTimestamp() == null ^ this.getComplianceSummaryTimestamp() == null) return false;
        if (other.getComplianceSummaryTimestamp() != null && other.getComplianceSummaryTimestamp().equals(this.getComplianceSummaryTimestamp()) == false) return false; 
        return true;
    }
    
    @Override
    public ComplianceSummary clone() {
        try {
            return (ComplianceSummary) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    