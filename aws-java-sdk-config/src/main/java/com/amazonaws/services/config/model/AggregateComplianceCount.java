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
 * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AggregateComplianceCount" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateComplianceCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit account ID or region based on the GroupByKey value.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The number of compliant and noncompliant AWS Config rules.
     * </p>
     */
    private ComplianceSummary complianceSummary;

    /**
     * <p>
     * The 12-digit account ID or region based on the GroupByKey value.
     * </p>
     * 
     * @param groupName
     *        The 12-digit account ID or region based on the GroupByKey value.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The 12-digit account ID or region based on the GroupByKey value.
     * </p>
     * 
     * @return The 12-digit account ID or region based on the GroupByKey value.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The 12-digit account ID or region based on the GroupByKey value.
     * </p>
     * 
     * @param groupName
     *        The 12-digit account ID or region based on the GroupByKey value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateComplianceCount withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The number of compliant and noncompliant AWS Config rules.
     * </p>
     * 
     * @param complianceSummary
     *        The number of compliant and noncompliant AWS Config rules.
     */

    public void setComplianceSummary(ComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
    }

    /**
     * <p>
     * The number of compliant and noncompliant AWS Config rules.
     * </p>
     * 
     * @return The number of compliant and noncompliant AWS Config rules.
     */

    public ComplianceSummary getComplianceSummary() {
        return this.complianceSummary;
    }

    /**
     * <p>
     * The number of compliant and noncompliant AWS Config rules.
     * </p>
     * 
     * @param complianceSummary
     *        The number of compliant and noncompliant AWS Config rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateComplianceCount withComplianceSummary(ComplianceSummary complianceSummary) {
        setComplianceSummary(complianceSummary);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getComplianceSummary() != null)
            sb.append("ComplianceSummary: ").append(getComplianceSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregateComplianceCount == false)
            return false;
        AggregateComplianceCount other = (AggregateComplianceCount) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getComplianceSummary() == null ^ this.getComplianceSummary() == null)
            return false;
        if (other.getComplianceSummary() != null && other.getComplianceSummary().equals(this.getComplianceSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getComplianceSummary() == null) ? 0 : getComplianceSummary().hashCode());
        return hashCode;
    }

    @Override
    public AggregateComplianceCount clone() {
        try {
            return (AggregateComplianceCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AggregateComplianceCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
