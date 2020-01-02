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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary includes the name and status of the conformance pack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConformancePackComplianceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackComplianceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the conformance pack name.
     * </p>
     */
    private String conformancePackName;
    /**
     * <p>
     * The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT.
     * </p>
     */
    private String conformancePackComplianceStatus;

    /**
     * <p>
     * The name of the conformance pack name.
     * </p>
     * 
     * @param conformancePackName
     *        The name of the conformance pack name.
     */

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    /**
     * <p>
     * The name of the conformance pack name.
     * </p>
     * 
     * @return The name of the conformance pack name.
     */

    public String getConformancePackName() {
        return this.conformancePackName;
    }

    /**
     * <p>
     * The name of the conformance pack name.
     * </p>
     * 
     * @param conformancePackName
     *        The name of the conformance pack name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackComplianceSummary withConformancePackName(String conformancePackName) {
        setConformancePackName(conformancePackName);
        return this;
    }

    /**
     * <p>
     * The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT.
     * </p>
     * 
     * @param conformancePackComplianceStatus
     *        The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT.
     * @see ConformancePackComplianceType
     */

    public void setConformancePackComplianceStatus(String conformancePackComplianceStatus) {
        this.conformancePackComplianceStatus = conformancePackComplianceStatus;
    }

    /**
     * <p>
     * The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT.
     * </p>
     * 
     * @return The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT.
     * @see ConformancePackComplianceType
     */

    public String getConformancePackComplianceStatus() {
        return this.conformancePackComplianceStatus;
    }

    /**
     * <p>
     * The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT.
     * </p>
     * 
     * @param conformancePackComplianceStatus
     *        The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public ConformancePackComplianceSummary withConformancePackComplianceStatus(String conformancePackComplianceStatus) {
        setConformancePackComplianceStatus(conformancePackComplianceStatus);
        return this;
    }

    /**
     * <p>
     * The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT.
     * </p>
     * 
     * @param conformancePackComplianceStatus
     *        The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public ConformancePackComplianceSummary withConformancePackComplianceStatus(ConformancePackComplianceType conformancePackComplianceStatus) {
        this.conformancePackComplianceStatus = conformancePackComplianceStatus.toString();
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
        if (getConformancePackName() != null)
            sb.append("ConformancePackName: ").append(getConformancePackName()).append(",");
        if (getConformancePackComplianceStatus() != null)
            sb.append("ConformancePackComplianceStatus: ").append(getConformancePackComplianceStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConformancePackComplianceSummary == false)
            return false;
        ConformancePackComplianceSummary other = (ConformancePackComplianceSummary) obj;
        if (other.getConformancePackName() == null ^ this.getConformancePackName() == null)
            return false;
        if (other.getConformancePackName() != null && other.getConformancePackName().equals(this.getConformancePackName()) == false)
            return false;
        if (other.getConformancePackComplianceStatus() == null ^ this.getConformancePackComplianceStatus() == null)
            return false;
        if (other.getConformancePackComplianceStatus() != null
                && other.getConformancePackComplianceStatus().equals(this.getConformancePackComplianceStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConformancePackName() == null) ? 0 : getConformancePackName().hashCode());
        hashCode = prime * hashCode + ((getConformancePackComplianceStatus() == null) ? 0 : getConformancePackComplianceStatus().hashCode());
        return hashCode;
    }

    @Override
    public ConformancePackComplianceSummary clone() {
        try {
            return (ConformancePackComplianceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConformancePackComplianceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
