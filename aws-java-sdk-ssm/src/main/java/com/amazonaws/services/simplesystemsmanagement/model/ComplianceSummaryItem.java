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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of compliance information by compliance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ComplianceSummaryItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceSummaryItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * A list of COMPLIANT items for the specified compliance type.
     * </p>
     */
    private CompliantSummary compliantSummary;
    /**
     * <p>
     * A list of NON_COMPLIANT items for the specified compliance type.
     * </p>
     */
    private NonCompliantSummary nonCompliantSummary;

    /**
     * <p>
     * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
     * </p>
     * 
     * @param complianceType
     *        The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
     * </p>
     * 
     * @return The type of compliance item. For example, the compliance type can be Association, Patch, or
     *         Custom:string.
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
     * </p>
     * 
     * @param complianceType
     *        The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceSummaryItem withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * A list of COMPLIANT items for the specified compliance type.
     * </p>
     * 
     * @param compliantSummary
     *        A list of COMPLIANT items for the specified compliance type.
     */

    public void setCompliantSummary(CompliantSummary compliantSummary) {
        this.compliantSummary = compliantSummary;
    }

    /**
     * <p>
     * A list of COMPLIANT items for the specified compliance type.
     * </p>
     * 
     * @return A list of COMPLIANT items for the specified compliance type.
     */

    public CompliantSummary getCompliantSummary() {
        return this.compliantSummary;
    }

    /**
     * <p>
     * A list of COMPLIANT items for the specified compliance type.
     * </p>
     * 
     * @param compliantSummary
     *        A list of COMPLIANT items for the specified compliance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceSummaryItem withCompliantSummary(CompliantSummary compliantSummary) {
        setCompliantSummary(compliantSummary);
        return this;
    }

    /**
     * <p>
     * A list of NON_COMPLIANT items for the specified compliance type.
     * </p>
     * 
     * @param nonCompliantSummary
     *        A list of NON_COMPLIANT items for the specified compliance type.
     */

    public void setNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        this.nonCompliantSummary = nonCompliantSummary;
    }

    /**
     * <p>
     * A list of NON_COMPLIANT items for the specified compliance type.
     * </p>
     * 
     * @return A list of NON_COMPLIANT items for the specified compliance type.
     */

    public NonCompliantSummary getNonCompliantSummary() {
        return this.nonCompliantSummary;
    }

    /**
     * <p>
     * A list of NON_COMPLIANT items for the specified compliance type.
     * </p>
     * 
     * @param nonCompliantSummary
     *        A list of NON_COMPLIANT items for the specified compliance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceSummaryItem withNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        setNonCompliantSummary(nonCompliantSummary);
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
        if (getCompliantSummary() != null)
            sb.append("CompliantSummary: ").append(getCompliantSummary()).append(",");
        if (getNonCompliantSummary() != null)
            sb.append("NonCompliantSummary: ").append(getNonCompliantSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceSummaryItem == false)
            return false;
        ComplianceSummaryItem other = (ComplianceSummaryItem) obj;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getCompliantSummary() == null ^ this.getCompliantSummary() == null)
            return false;
        if (other.getCompliantSummary() != null && other.getCompliantSummary().equals(this.getCompliantSummary()) == false)
            return false;
        if (other.getNonCompliantSummary() == null ^ this.getNonCompliantSummary() == null)
            return false;
        if (other.getNonCompliantSummary() != null && other.getNonCompliantSummary().equals(this.getNonCompliantSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getCompliantSummary() == null) ? 0 : getCompliantSummary().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantSummary() == null) ? 0 : getNonCompliantSummary().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceSummaryItem clone() {
        try {
            return (ComplianceSummaryItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ComplianceSummaryItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
