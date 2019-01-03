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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of AWS Config rules or AWS resources that are compliant and noncompliant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ComplianceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and 100 for
     * resources.
     * </p>
     */
    private ComplianceContributorCount compliantResourceCount;
    /**
     * <p>
     * The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and 100
     * for resources.
     * </p>
     */
    private ComplianceContributorCount nonCompliantResourceCount;
    /**
     * <p>
     * The time that AWS Config created the compliance summary.
     * </p>
     */
    private java.util.Date complianceSummaryTimestamp;

    /**
     * <p>
     * The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and 100 for
     * resources.
     * </p>
     * 
     * @param compliantResourceCount
     *        The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and
     *        100 for resources.
     */

    public void setCompliantResourceCount(ComplianceContributorCount compliantResourceCount) {
        this.compliantResourceCount = compliantResourceCount;
    }

    /**
     * <p>
     * The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and 100 for
     * resources.
     * </p>
     * 
     * @return The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and
     *         100 for resources.
     */

    public ComplianceContributorCount getCompliantResourceCount() {
        return this.compliantResourceCount;
    }

    /**
     * <p>
     * The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and 100 for
     * resources.
     * </p>
     * 
     * @param compliantResourceCount
     *        The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and
     *        100 for resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceSummary withCompliantResourceCount(ComplianceContributorCount compliantResourceCount) {
        setCompliantResourceCount(compliantResourceCount);
        return this;
    }

    /**
     * <p>
     * The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and 100
     * for resources.
     * </p>
     * 
     * @param nonCompliantResourceCount
     *        The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and
     *        100 for resources.
     */

    public void setNonCompliantResourceCount(ComplianceContributorCount nonCompliantResourceCount) {
        this.nonCompliantResourceCount = nonCompliantResourceCount;
    }

    /**
     * <p>
     * The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and 100
     * for resources.
     * </p>
     * 
     * @return The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules
     *         and 100 for resources.
     */

    public ComplianceContributorCount getNonCompliantResourceCount() {
        return this.nonCompliantResourceCount;
    }

    /**
     * <p>
     * The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and 100
     * for resources.
     * </p>
     * 
     * @param nonCompliantResourceCount
     *        The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and
     *        100 for resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceSummary withNonCompliantResourceCount(ComplianceContributorCount nonCompliantResourceCount) {
        setNonCompliantResourceCount(nonCompliantResourceCount);
        return this;
    }

    /**
     * <p>
     * The time that AWS Config created the compliance summary.
     * </p>
     * 
     * @param complianceSummaryTimestamp
     *        The time that AWS Config created the compliance summary.
     */

    public void setComplianceSummaryTimestamp(java.util.Date complianceSummaryTimestamp) {
        this.complianceSummaryTimestamp = complianceSummaryTimestamp;
    }

    /**
     * <p>
     * The time that AWS Config created the compliance summary.
     * </p>
     * 
     * @return The time that AWS Config created the compliance summary.
     */

    public java.util.Date getComplianceSummaryTimestamp() {
        return this.complianceSummaryTimestamp;
    }

    /**
     * <p>
     * The time that AWS Config created the compliance summary.
     * </p>
     * 
     * @param complianceSummaryTimestamp
     *        The time that AWS Config created the compliance summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceSummary withComplianceSummaryTimestamp(java.util.Date complianceSummaryTimestamp) {
        setComplianceSummaryTimestamp(complianceSummaryTimestamp);
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
        if (getCompliantResourceCount() != null)
            sb.append("CompliantResourceCount: ").append(getCompliantResourceCount()).append(",");
        if (getNonCompliantResourceCount() != null)
            sb.append("NonCompliantResourceCount: ").append(getNonCompliantResourceCount()).append(",");
        if (getComplianceSummaryTimestamp() != null)
            sb.append("ComplianceSummaryTimestamp: ").append(getComplianceSummaryTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceSummary == false)
            return false;
        ComplianceSummary other = (ComplianceSummary) obj;
        if (other.getCompliantResourceCount() == null ^ this.getCompliantResourceCount() == null)
            return false;
        if (other.getCompliantResourceCount() != null && other.getCompliantResourceCount().equals(this.getCompliantResourceCount()) == false)
            return false;
        if (other.getNonCompliantResourceCount() == null ^ this.getNonCompliantResourceCount() == null)
            return false;
        if (other.getNonCompliantResourceCount() != null && other.getNonCompliantResourceCount().equals(this.getNonCompliantResourceCount()) == false)
            return false;
        if (other.getComplianceSummaryTimestamp() == null ^ this.getComplianceSummaryTimestamp() == null)
            return false;
        if (other.getComplianceSummaryTimestamp() != null && other.getComplianceSummaryTimestamp().equals(this.getComplianceSummaryTimestamp()) == false)
            return false;
        return true;
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
    public ComplianceSummary clone() {
        try {
            return (ComplianceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ComplianceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
