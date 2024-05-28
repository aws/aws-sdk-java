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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the evidence for a vulnerability identified in a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Evidence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Evidence implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The evidence details.
     * </p>
     */
    private String evidenceDetail;
    /**
     * <p>
     * The evidence rule.
     * </p>
     */
    private String evidenceRule;
    /**
     * <p>
     * The evidence severity.
     * </p>
     */
    private String severity;

    /**
     * <p>
     * The evidence details.
     * </p>
     * 
     * @param evidenceDetail
     *        The evidence details.
     */

    public void setEvidenceDetail(String evidenceDetail) {
        this.evidenceDetail = evidenceDetail;
    }

    /**
     * <p>
     * The evidence details.
     * </p>
     * 
     * @return The evidence details.
     */

    public String getEvidenceDetail() {
        return this.evidenceDetail;
    }

    /**
     * <p>
     * The evidence details.
     * </p>
     * 
     * @param evidenceDetail
     *        The evidence details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withEvidenceDetail(String evidenceDetail) {
        setEvidenceDetail(evidenceDetail);
        return this;
    }

    /**
     * <p>
     * The evidence rule.
     * </p>
     * 
     * @param evidenceRule
     *        The evidence rule.
     */

    public void setEvidenceRule(String evidenceRule) {
        this.evidenceRule = evidenceRule;
    }

    /**
     * <p>
     * The evidence rule.
     * </p>
     * 
     * @return The evidence rule.
     */

    public String getEvidenceRule() {
        return this.evidenceRule;
    }

    /**
     * <p>
     * The evidence rule.
     * </p>
     * 
     * @param evidenceRule
     *        The evidence rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withEvidenceRule(String evidenceRule) {
        setEvidenceRule(evidenceRule);
        return this;
    }

    /**
     * <p>
     * The evidence severity.
     * </p>
     * 
     * @param severity
     *        The evidence severity.
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The evidence severity.
     * </p>
     * 
     * @return The evidence severity.
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The evidence severity.
     * </p>
     * 
     * @param severity
     *        The evidence severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withSeverity(String severity) {
        setSeverity(severity);
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
        if (getEvidenceDetail() != null)
            sb.append("EvidenceDetail: ").append(getEvidenceDetail()).append(",");
        if (getEvidenceRule() != null)
            sb.append("EvidenceRule: ").append(getEvidenceRule()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Evidence == false)
            return false;
        Evidence other = (Evidence) obj;
        if (other.getEvidenceDetail() == null ^ this.getEvidenceDetail() == null)
            return false;
        if (other.getEvidenceDetail() != null && other.getEvidenceDetail().equals(this.getEvidenceDetail()) == false)
            return false;
        if (other.getEvidenceRule() == null ^ this.getEvidenceRule() == null)
            return false;
        if (other.getEvidenceRule() != null && other.getEvidenceRule().equals(this.getEvidenceRule()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvidenceDetail() == null) ? 0 : getEvidenceDetail().hashCode());
        hashCode = prime * hashCode + ((getEvidenceRule() == null) ? 0 : getEvidenceRule().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public Evidence clone() {
        try {
            return (Evidence) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.EvidenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
