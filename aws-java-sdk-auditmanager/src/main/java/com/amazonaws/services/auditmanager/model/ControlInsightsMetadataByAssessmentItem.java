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
 * A summary of the latest analytics data for a specific control in a specific active assessment.
 * </p>
 * <p>
 * Control insights are grouped by control domain, and ranked by the highest total count of non-compliant evidence.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ControlInsightsMetadataByAssessmentItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlInsightsMetadataByAssessmentItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the assessment control.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier for the assessment control.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A breakdown of the compliance check status for the evidence that’s associated with the assessment control.
     * </p>
     */
    private EvidenceInsights evidenceInsights;
    /**
     * <p>
     * The name of the control set that the assessment control belongs to.
     * </p>
     */
    private String controlSetName;
    /**
     * <p>
     * The time when the assessment control insights were last updated.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The name of the assessment control.
     * </p>
     * 
     * @param name
     *        The name of the assessment control.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the assessment control.
     * </p>
     * 
     * @return The name of the assessment control.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the assessment control.
     * </p>
     * 
     * @param name
     *        The name of the assessment control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlInsightsMetadataByAssessmentItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the assessment control.
     * </p>
     * 
     * @param id
     *        The unique identifier for the assessment control.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the assessment control.
     * </p>
     * 
     * @return The unique identifier for the assessment control.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the assessment control.
     * </p>
     * 
     * @param id
     *        The unique identifier for the assessment control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlInsightsMetadataByAssessmentItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A breakdown of the compliance check status for the evidence that’s associated with the assessment control.
     * </p>
     * 
     * @param evidenceInsights
     *        A breakdown of the compliance check status for the evidence that’s associated with the assessment control.
     */

    public void setEvidenceInsights(EvidenceInsights evidenceInsights) {
        this.evidenceInsights = evidenceInsights;
    }

    /**
     * <p>
     * A breakdown of the compliance check status for the evidence that’s associated with the assessment control.
     * </p>
     * 
     * @return A breakdown of the compliance check status for the evidence that’s associated with the assessment
     *         control.
     */

    public EvidenceInsights getEvidenceInsights() {
        return this.evidenceInsights;
    }

    /**
     * <p>
     * A breakdown of the compliance check status for the evidence that’s associated with the assessment control.
     * </p>
     * 
     * @param evidenceInsights
     *        A breakdown of the compliance check status for the evidence that’s associated with the assessment control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlInsightsMetadataByAssessmentItem withEvidenceInsights(EvidenceInsights evidenceInsights) {
        setEvidenceInsights(evidenceInsights);
        return this;
    }

    /**
     * <p>
     * The name of the control set that the assessment control belongs to.
     * </p>
     * 
     * @param controlSetName
     *        The name of the control set that the assessment control belongs to.
     */

    public void setControlSetName(String controlSetName) {
        this.controlSetName = controlSetName;
    }

    /**
     * <p>
     * The name of the control set that the assessment control belongs to.
     * </p>
     * 
     * @return The name of the control set that the assessment control belongs to.
     */

    public String getControlSetName() {
        return this.controlSetName;
    }

    /**
     * <p>
     * The name of the control set that the assessment control belongs to.
     * </p>
     * 
     * @param controlSetName
     *        The name of the control set that the assessment control belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlInsightsMetadataByAssessmentItem withControlSetName(String controlSetName) {
        setControlSetName(controlSetName);
        return this;
    }

    /**
     * <p>
     * The time when the assessment control insights were last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time when the assessment control insights were last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time when the assessment control insights were last updated.
     * </p>
     * 
     * @return The time when the assessment control insights were last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time when the assessment control insights were last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time when the assessment control insights were last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlInsightsMetadataByAssessmentItem withLastUpdated(java.util.Date lastUpdated) {
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
        if (getEvidenceInsights() != null)
            sb.append("EvidenceInsights: ").append(getEvidenceInsights()).append(",");
        if (getControlSetName() != null)
            sb.append("ControlSetName: ").append(getControlSetName()).append(",");
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

        if (obj instanceof ControlInsightsMetadataByAssessmentItem == false)
            return false;
        ControlInsightsMetadataByAssessmentItem other = (ControlInsightsMetadataByAssessmentItem) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEvidenceInsights() == null ^ this.getEvidenceInsights() == null)
            return false;
        if (other.getEvidenceInsights() != null && other.getEvidenceInsights().equals(this.getEvidenceInsights()) == false)
            return false;
        if (other.getControlSetName() == null ^ this.getControlSetName() == null)
            return false;
        if (other.getControlSetName() != null && other.getControlSetName().equals(this.getControlSetName()) == false)
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
        hashCode = prime * hashCode + ((getEvidenceInsights() == null) ? 0 : getEvidenceInsights().hashCode());
        hashCode = prime * hashCode + ((getControlSetName() == null) ? 0 : getControlSetName().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public ControlInsightsMetadataByAssessmentItem clone() {
        try {
            return (ControlInsightsMetadataByAssessmentItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ControlInsightsMetadataByAssessmentItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
