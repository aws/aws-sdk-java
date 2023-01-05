/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details of the highest severity threat detected during scan and number of infected files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/HighestSeverityThreatDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HighestSeverityThreatDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Severity level of the highest severity threat detected.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * Threat name of the highest severity threat detected as part of the malware scan.
     * </p>
     */
    private String threatName;
    /**
     * <p>
     * Total number of infected files with the highest severity threat detected.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * Severity level of the highest severity threat detected.
     * </p>
     * 
     * @param severity
     *        Severity level of the highest severity threat detected.
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Severity level of the highest severity threat detected.
     * </p>
     * 
     * @return Severity level of the highest severity threat detected.
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Severity level of the highest severity threat detected.
     * </p>
     * 
     * @param severity
     *        Severity level of the highest severity threat detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HighestSeverityThreatDetails withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * Threat name of the highest severity threat detected as part of the malware scan.
     * </p>
     * 
     * @param threatName
     *        Threat name of the highest severity threat detected as part of the malware scan.
     */

    public void setThreatName(String threatName) {
        this.threatName = threatName;
    }

    /**
     * <p>
     * Threat name of the highest severity threat detected as part of the malware scan.
     * </p>
     * 
     * @return Threat name of the highest severity threat detected as part of the malware scan.
     */

    public String getThreatName() {
        return this.threatName;
    }

    /**
     * <p>
     * Threat name of the highest severity threat detected as part of the malware scan.
     * </p>
     * 
     * @param threatName
     *        Threat name of the highest severity threat detected as part of the malware scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HighestSeverityThreatDetails withThreatName(String threatName) {
        setThreatName(threatName);
        return this;
    }

    /**
     * <p>
     * Total number of infected files with the highest severity threat detected.
     * </p>
     * 
     * @param count
     *        Total number of infected files with the highest severity threat detected.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * Total number of infected files with the highest severity threat detected.
     * </p>
     * 
     * @return Total number of infected files with the highest severity threat detected.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * Total number of infected files with the highest severity threat detected.
     * </p>
     * 
     * @param count
     *        Total number of infected files with the highest severity threat detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HighestSeverityThreatDetails withCount(Integer count) {
        setCount(count);
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
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getThreatName() != null)
            sb.append("ThreatName: ").append(getThreatName()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HighestSeverityThreatDetails == false)
            return false;
        HighestSeverityThreatDetails other = (HighestSeverityThreatDetails) obj;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getThreatName() == null ^ this.getThreatName() == null)
            return false;
        if (other.getThreatName() != null && other.getThreatName().equals(this.getThreatName()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getThreatName() == null) ? 0 : getThreatName().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public HighestSeverityThreatDetails clone() {
        try {
            return (HighestSeverityThreatDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.HighestSeverityThreatDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
