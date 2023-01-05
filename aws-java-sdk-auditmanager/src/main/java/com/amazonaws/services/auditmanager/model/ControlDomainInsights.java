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
 * A summary of the latest analytics data for a specific control domain.
 * </p>
 * <p>
 * Control domain insights are grouped by control domain, and ranked by the highest total count of non-compliant
 * evidence.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ControlDomainInsights" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlDomainInsights implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the control domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier for the control domain.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The number of controls in the control domain that collected non-compliant evidence on the
     * <code>lastUpdated</code> date.
     * </p>
     */
    private Integer controlsCountByNoncompliantEvidence;
    /**
     * <p>
     * The total number of controls in the control domain.
     * </p>
     */
    private Integer totalControlsCount;
    /**
     * <p>
     * A breakdown of the compliance check status for the evidence that’s associated with the control domain.
     * </p>
     */
    private EvidenceInsights evidenceInsights;
    /**
     * <p>
     * The time when the control domain insights were last updated.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The name of the control domain.
     * </p>
     * 
     * @param name
     *        The name of the control domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the control domain.
     * </p>
     * 
     * @return The name of the control domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the control domain.
     * </p>
     * 
     * @param name
     *        The name of the control domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlDomainInsights withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the control domain.
     * </p>
     * 
     * @param id
     *        The unique identifier for the control domain.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the control domain.
     * </p>
     * 
     * @return The unique identifier for the control domain.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the control domain.
     * </p>
     * 
     * @param id
     *        The unique identifier for the control domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlDomainInsights withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The number of controls in the control domain that collected non-compliant evidence on the
     * <code>lastUpdated</code> date.
     * </p>
     * 
     * @param controlsCountByNoncompliantEvidence
     *        The number of controls in the control domain that collected non-compliant evidence on the
     *        <code>lastUpdated</code> date.
     */

    public void setControlsCountByNoncompliantEvidence(Integer controlsCountByNoncompliantEvidence) {
        this.controlsCountByNoncompliantEvidence = controlsCountByNoncompliantEvidence;
    }

    /**
     * <p>
     * The number of controls in the control domain that collected non-compliant evidence on the
     * <code>lastUpdated</code> date.
     * </p>
     * 
     * @return The number of controls in the control domain that collected non-compliant evidence on the
     *         <code>lastUpdated</code> date.
     */

    public Integer getControlsCountByNoncompliantEvidence() {
        return this.controlsCountByNoncompliantEvidence;
    }

    /**
     * <p>
     * The number of controls in the control domain that collected non-compliant evidence on the
     * <code>lastUpdated</code> date.
     * </p>
     * 
     * @param controlsCountByNoncompliantEvidence
     *        The number of controls in the control domain that collected non-compliant evidence on the
     *        <code>lastUpdated</code> date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlDomainInsights withControlsCountByNoncompliantEvidence(Integer controlsCountByNoncompliantEvidence) {
        setControlsCountByNoncompliantEvidence(controlsCountByNoncompliantEvidence);
        return this;
    }

    /**
     * <p>
     * The total number of controls in the control domain.
     * </p>
     * 
     * @param totalControlsCount
     *        The total number of controls in the control domain.
     */

    public void setTotalControlsCount(Integer totalControlsCount) {
        this.totalControlsCount = totalControlsCount;
    }

    /**
     * <p>
     * The total number of controls in the control domain.
     * </p>
     * 
     * @return The total number of controls in the control domain.
     */

    public Integer getTotalControlsCount() {
        return this.totalControlsCount;
    }

    /**
     * <p>
     * The total number of controls in the control domain.
     * </p>
     * 
     * @param totalControlsCount
     *        The total number of controls in the control domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlDomainInsights withTotalControlsCount(Integer totalControlsCount) {
        setTotalControlsCount(totalControlsCount);
        return this;
    }

    /**
     * <p>
     * A breakdown of the compliance check status for the evidence that’s associated with the control domain.
     * </p>
     * 
     * @param evidenceInsights
     *        A breakdown of the compliance check status for the evidence that’s associated with the control domain.
     */

    public void setEvidenceInsights(EvidenceInsights evidenceInsights) {
        this.evidenceInsights = evidenceInsights;
    }

    /**
     * <p>
     * A breakdown of the compliance check status for the evidence that’s associated with the control domain.
     * </p>
     * 
     * @return A breakdown of the compliance check status for the evidence that’s associated with the control domain.
     */

    public EvidenceInsights getEvidenceInsights() {
        return this.evidenceInsights;
    }

    /**
     * <p>
     * A breakdown of the compliance check status for the evidence that’s associated with the control domain.
     * </p>
     * 
     * @param evidenceInsights
     *        A breakdown of the compliance check status for the evidence that’s associated with the control domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlDomainInsights withEvidenceInsights(EvidenceInsights evidenceInsights) {
        setEvidenceInsights(evidenceInsights);
        return this;
    }

    /**
     * <p>
     * The time when the control domain insights were last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time when the control domain insights were last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time when the control domain insights were last updated.
     * </p>
     * 
     * @return The time when the control domain insights were last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time when the control domain insights were last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time when the control domain insights were last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlDomainInsights withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getControlsCountByNoncompliantEvidence() != null)
            sb.append("ControlsCountByNoncompliantEvidence: ").append(getControlsCountByNoncompliantEvidence()).append(",");
        if (getTotalControlsCount() != null)
            sb.append("TotalControlsCount: ").append(getTotalControlsCount()).append(",");
        if (getEvidenceInsights() != null)
            sb.append("EvidenceInsights: ").append(getEvidenceInsights()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlDomainInsights == false)
            return false;
        ControlDomainInsights other = (ControlDomainInsights) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getControlsCountByNoncompliantEvidence() == null ^ this.getControlsCountByNoncompliantEvidence() == null)
            return false;
        if (other.getControlsCountByNoncompliantEvidence() != null
                && other.getControlsCountByNoncompliantEvidence().equals(this.getControlsCountByNoncompliantEvidence()) == false)
            return false;
        if (other.getTotalControlsCount() == null ^ this.getTotalControlsCount() == null)
            return false;
        if (other.getTotalControlsCount() != null && other.getTotalControlsCount().equals(this.getTotalControlsCount()) == false)
            return false;
        if (other.getEvidenceInsights() == null ^ this.getEvidenceInsights() == null)
            return false;
        if (other.getEvidenceInsights() != null && other.getEvidenceInsights().equals(this.getEvidenceInsights()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getControlsCountByNoncompliantEvidence() == null) ? 0 : getControlsCountByNoncompliantEvidence().hashCode());
        hashCode = prime * hashCode + ((getTotalControlsCount() == null) ? 0 : getTotalControlsCount().hashCode());
        hashCode = prime * hashCode + ((getEvidenceInsights() == null) ? 0 : getEvidenceInsights().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public ControlDomainInsights clone() {
        try {
            return (ControlDomainInsights) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ControlDomainInsightsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
