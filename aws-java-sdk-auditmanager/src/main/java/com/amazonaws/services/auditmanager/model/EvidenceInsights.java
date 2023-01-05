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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A breakdown of the latest compliance check status for the evidence in your Audit Manager assessments.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/EvidenceInsights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvidenceInsights implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as non-compliant. This includes evidence
     * that was collected from Security Hub with a <i>Fail</i> ruling, or collected from Config with a
     * <i>Non-compliant</i> ruling.
     * </p>
     */
    private Integer noncompliantEvidenceCount;
    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as compliant. This includes evidence that
     * was collected from Security Hub with a <i>Pass</i> ruling, or collected from Config with a <i>Compliant</i>
     * ruling.
     * </p>
     */
    private Integer compliantEvidenceCount;
    /**
     * <p>
     * The number of evidence that a compliance check ruling isn't available for. Evidence is inconclusive when the
     * associated control uses Security Hub or Config as a data source but you didn't enable those services. This is
     * also the case when a control uses a data source that doesn’t support compliance checks (for example, manual
     * evidence, API calls, or CloudTrail).
     * </p>
     * <note>
     * <p>
     * If evidence has a compliance check status of <i>not applicable</i> in the console, it's classified as
     * <i>inconclusive</i> in <code>EvidenceInsights</code> data.
     * </p>
     * </note>
     */
    private Integer inconclusiveEvidenceCount;

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as non-compliant. This includes evidence
     * that was collected from Security Hub with a <i>Fail</i> ruling, or collected from Config with a
     * <i>Non-compliant</i> ruling.
     * </p>
     * 
     * @param noncompliantEvidenceCount
     *        The number of compliance check evidence that Audit Manager classified as non-compliant. This includes
     *        evidence that was collected from Security Hub with a <i>Fail</i> ruling, or collected from Config with a
     *        <i>Non-compliant</i> ruling.
     */

    public void setNoncompliantEvidenceCount(Integer noncompliantEvidenceCount) {
        this.noncompliantEvidenceCount = noncompliantEvidenceCount;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as non-compliant. This includes evidence
     * that was collected from Security Hub with a <i>Fail</i> ruling, or collected from Config with a
     * <i>Non-compliant</i> ruling.
     * </p>
     * 
     * @return The number of compliance check evidence that Audit Manager classified as non-compliant. This includes
     *         evidence that was collected from Security Hub with a <i>Fail</i> ruling, or collected from Config with a
     *         <i>Non-compliant</i> ruling.
     */

    public Integer getNoncompliantEvidenceCount() {
        return this.noncompliantEvidenceCount;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as non-compliant. This includes evidence
     * that was collected from Security Hub with a <i>Fail</i> ruling, or collected from Config with a
     * <i>Non-compliant</i> ruling.
     * </p>
     * 
     * @param noncompliantEvidenceCount
     *        The number of compliance check evidence that Audit Manager classified as non-compliant. This includes
     *        evidence that was collected from Security Hub with a <i>Fail</i> ruling, or collected from Config with a
     *        <i>Non-compliant</i> ruling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvidenceInsights withNoncompliantEvidenceCount(Integer noncompliantEvidenceCount) {
        setNoncompliantEvidenceCount(noncompliantEvidenceCount);
        return this;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as compliant. This includes evidence that
     * was collected from Security Hub with a <i>Pass</i> ruling, or collected from Config with a <i>Compliant</i>
     * ruling.
     * </p>
     * 
     * @param compliantEvidenceCount
     *        The number of compliance check evidence that Audit Manager classified as compliant. This includes evidence
     *        that was collected from Security Hub with a <i>Pass</i> ruling, or collected from Config with a
     *        <i>Compliant</i> ruling.
     */

    public void setCompliantEvidenceCount(Integer compliantEvidenceCount) {
        this.compliantEvidenceCount = compliantEvidenceCount;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as compliant. This includes evidence that
     * was collected from Security Hub with a <i>Pass</i> ruling, or collected from Config with a <i>Compliant</i>
     * ruling.
     * </p>
     * 
     * @return The number of compliance check evidence that Audit Manager classified as compliant. This includes
     *         evidence that was collected from Security Hub with a <i>Pass</i> ruling, or collected from Config with a
     *         <i>Compliant</i> ruling.
     */

    public Integer getCompliantEvidenceCount() {
        return this.compliantEvidenceCount;
    }

    /**
     * <p>
     * The number of compliance check evidence that Audit Manager classified as compliant. This includes evidence that
     * was collected from Security Hub with a <i>Pass</i> ruling, or collected from Config with a <i>Compliant</i>
     * ruling.
     * </p>
     * 
     * @param compliantEvidenceCount
     *        The number of compliance check evidence that Audit Manager classified as compliant. This includes evidence
     *        that was collected from Security Hub with a <i>Pass</i> ruling, or collected from Config with a
     *        <i>Compliant</i> ruling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvidenceInsights withCompliantEvidenceCount(Integer compliantEvidenceCount) {
        setCompliantEvidenceCount(compliantEvidenceCount);
        return this;
    }

    /**
     * <p>
     * The number of evidence that a compliance check ruling isn't available for. Evidence is inconclusive when the
     * associated control uses Security Hub or Config as a data source but you didn't enable those services. This is
     * also the case when a control uses a data source that doesn’t support compliance checks (for example, manual
     * evidence, API calls, or CloudTrail).
     * </p>
     * <note>
     * <p>
     * If evidence has a compliance check status of <i>not applicable</i> in the console, it's classified as
     * <i>inconclusive</i> in <code>EvidenceInsights</code> data.
     * </p>
     * </note>
     * 
     * @param inconclusiveEvidenceCount
     *        The number of evidence that a compliance check ruling isn't available for. Evidence is inconclusive when
     *        the associated control uses Security Hub or Config as a data source but you didn't enable those services.
     *        This is also the case when a control uses a data source that doesn’t support compliance checks (for
     *        example, manual evidence, API calls, or CloudTrail). </p> <note>
     *        <p>
     *        If evidence has a compliance check status of <i>not applicable</i> in the console, it's classified as
     *        <i>inconclusive</i> in <code>EvidenceInsights</code> data.
     *        </p>
     */

    public void setInconclusiveEvidenceCount(Integer inconclusiveEvidenceCount) {
        this.inconclusiveEvidenceCount = inconclusiveEvidenceCount;
    }

    /**
     * <p>
     * The number of evidence that a compliance check ruling isn't available for. Evidence is inconclusive when the
     * associated control uses Security Hub or Config as a data source but you didn't enable those services. This is
     * also the case when a control uses a data source that doesn’t support compliance checks (for example, manual
     * evidence, API calls, or CloudTrail).
     * </p>
     * <note>
     * <p>
     * If evidence has a compliance check status of <i>not applicable</i> in the console, it's classified as
     * <i>inconclusive</i> in <code>EvidenceInsights</code> data.
     * </p>
     * </note>
     * 
     * @return The number of evidence that a compliance check ruling isn't available for. Evidence is inconclusive when
     *         the associated control uses Security Hub or Config as a data source but you didn't enable those services.
     *         This is also the case when a control uses a data source that doesn’t support compliance checks (for
     *         example, manual evidence, API calls, or CloudTrail). </p> <note>
     *         <p>
     *         If evidence has a compliance check status of <i>not applicable</i> in the console, it's classified as
     *         <i>inconclusive</i> in <code>EvidenceInsights</code> data.
     *         </p>
     */

    public Integer getInconclusiveEvidenceCount() {
        return this.inconclusiveEvidenceCount;
    }

    /**
     * <p>
     * The number of evidence that a compliance check ruling isn't available for. Evidence is inconclusive when the
     * associated control uses Security Hub or Config as a data source but you didn't enable those services. This is
     * also the case when a control uses a data source that doesn’t support compliance checks (for example, manual
     * evidence, API calls, or CloudTrail).
     * </p>
     * <note>
     * <p>
     * If evidence has a compliance check status of <i>not applicable</i> in the console, it's classified as
     * <i>inconclusive</i> in <code>EvidenceInsights</code> data.
     * </p>
     * </note>
     * 
     * @param inconclusiveEvidenceCount
     *        The number of evidence that a compliance check ruling isn't available for. Evidence is inconclusive when
     *        the associated control uses Security Hub or Config as a data source but you didn't enable those services.
     *        This is also the case when a control uses a data source that doesn’t support compliance checks (for
     *        example, manual evidence, API calls, or CloudTrail). </p> <note>
     *        <p>
     *        If evidence has a compliance check status of <i>not applicable</i> in the console, it's classified as
     *        <i>inconclusive</i> in <code>EvidenceInsights</code> data.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvidenceInsights withInconclusiveEvidenceCount(Integer inconclusiveEvidenceCount) {
        setInconclusiveEvidenceCount(inconclusiveEvidenceCount);
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
        if (getNoncompliantEvidenceCount() != null)
            sb.append("NoncompliantEvidenceCount: ").append(getNoncompliantEvidenceCount()).append(",");
        if (getCompliantEvidenceCount() != null)
            sb.append("CompliantEvidenceCount: ").append(getCompliantEvidenceCount()).append(",");
        if (getInconclusiveEvidenceCount() != null)
            sb.append("InconclusiveEvidenceCount: ").append(getInconclusiveEvidenceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvidenceInsights == false)
            return false;
        EvidenceInsights other = (EvidenceInsights) obj;
        if (other.getNoncompliantEvidenceCount() == null ^ this.getNoncompliantEvidenceCount() == null)
            return false;
        if (other.getNoncompliantEvidenceCount() != null && other.getNoncompliantEvidenceCount().equals(this.getNoncompliantEvidenceCount()) == false)
            return false;
        if (other.getCompliantEvidenceCount() == null ^ this.getCompliantEvidenceCount() == null)
            return false;
        if (other.getCompliantEvidenceCount() != null && other.getCompliantEvidenceCount().equals(this.getCompliantEvidenceCount()) == false)
            return false;
        if (other.getInconclusiveEvidenceCount() == null ^ this.getInconclusiveEvidenceCount() == null)
            return false;
        if (other.getInconclusiveEvidenceCount() != null && other.getInconclusiveEvidenceCount().equals(this.getInconclusiveEvidenceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNoncompliantEvidenceCount() == null) ? 0 : getNoncompliantEvidenceCount().hashCode());
        hashCode = prime * hashCode + ((getCompliantEvidenceCount() == null) ? 0 : getCompliantEvidenceCount().hashCode());
        hashCode = prime * hashCode + ((getInconclusiveEvidenceCount() == null) ? 0 : getInconclusiveEvidenceCount().hashCode());
        return hashCode;
    }

    @Override
    public EvidenceInsights clone() {
        try {
            return (EvidenceInsights) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.EvidenceInsightsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
