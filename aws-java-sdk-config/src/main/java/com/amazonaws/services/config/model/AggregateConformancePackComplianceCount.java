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
 * The number of conformance packs that are compliant and noncompliant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AggregateConformancePackComplianceCount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateConformancePackComplianceCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of compliant conformance packs.
     * </p>
     */
    private Integer compliantConformancePackCount;
    /**
     * <p>
     * Number of noncompliant conformance packs.
     * </p>
     */
    private Integer nonCompliantConformancePackCount;

    /**
     * <p>
     * Number of compliant conformance packs.
     * </p>
     * 
     * @param compliantConformancePackCount
     *        Number of compliant conformance packs.
     */

    public void setCompliantConformancePackCount(Integer compliantConformancePackCount) {
        this.compliantConformancePackCount = compliantConformancePackCount;
    }

    /**
     * <p>
     * Number of compliant conformance packs.
     * </p>
     * 
     * @return Number of compliant conformance packs.
     */

    public Integer getCompliantConformancePackCount() {
        return this.compliantConformancePackCount;
    }

    /**
     * <p>
     * Number of compliant conformance packs.
     * </p>
     * 
     * @param compliantConformancePackCount
     *        Number of compliant conformance packs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConformancePackComplianceCount withCompliantConformancePackCount(Integer compliantConformancePackCount) {
        setCompliantConformancePackCount(compliantConformancePackCount);
        return this;
    }

    /**
     * <p>
     * Number of noncompliant conformance packs.
     * </p>
     * 
     * @param nonCompliantConformancePackCount
     *        Number of noncompliant conformance packs.
     */

    public void setNonCompliantConformancePackCount(Integer nonCompliantConformancePackCount) {
        this.nonCompliantConformancePackCount = nonCompliantConformancePackCount;
    }

    /**
     * <p>
     * Number of noncompliant conformance packs.
     * </p>
     * 
     * @return Number of noncompliant conformance packs.
     */

    public Integer getNonCompliantConformancePackCount() {
        return this.nonCompliantConformancePackCount;
    }

    /**
     * <p>
     * Number of noncompliant conformance packs.
     * </p>
     * 
     * @param nonCompliantConformancePackCount
     *        Number of noncompliant conformance packs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateConformancePackComplianceCount withNonCompliantConformancePackCount(Integer nonCompliantConformancePackCount) {
        setNonCompliantConformancePackCount(nonCompliantConformancePackCount);
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
        if (getCompliantConformancePackCount() != null)
            sb.append("CompliantConformancePackCount: ").append(getCompliantConformancePackCount()).append(",");
        if (getNonCompliantConformancePackCount() != null)
            sb.append("NonCompliantConformancePackCount: ").append(getNonCompliantConformancePackCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregateConformancePackComplianceCount == false)
            return false;
        AggregateConformancePackComplianceCount other = (AggregateConformancePackComplianceCount) obj;
        if (other.getCompliantConformancePackCount() == null ^ this.getCompliantConformancePackCount() == null)
            return false;
        if (other.getCompliantConformancePackCount() != null
                && other.getCompliantConformancePackCount().equals(this.getCompliantConformancePackCount()) == false)
            return false;
        if (other.getNonCompliantConformancePackCount() == null ^ this.getNonCompliantConformancePackCount() == null)
            return false;
        if (other.getNonCompliantConformancePackCount() != null
                && other.getNonCompliantConformancePackCount().equals(this.getNonCompliantConformancePackCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompliantConformancePackCount() == null) ? 0 : getCompliantConformancePackCount().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantConformancePackCount() == null) ? 0 : getNonCompliantConformancePackCount().hashCode());
        return hashCode;
    }

    @Override
    public AggregateConformancePackComplianceCount clone() {
        try {
            return (AggregateConformancePackComplianceCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AggregateConformancePackComplianceCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
