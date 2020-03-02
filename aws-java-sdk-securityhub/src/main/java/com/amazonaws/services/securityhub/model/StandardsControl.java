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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for an individual security standard control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StandardsControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the security standard control.
     * </p>
     */
    private String standardsControlArn;
    /**
     * <p>
     * The current status of the security standard control. Indicates whether the control is enabled or disabled.
     * Security Hub does not check against disabled controls.
     * </p>
     */
    private String controlStatus;
    /**
     * <p>
     * The reason provided for the most recent change in status for the control.
     * </p>
     */
    private String disabledReason;
    /**
     * <p>
     * The date and time that the status of the security standard control was most recently updated.
     * </p>
     */
    private java.util.Date controlStatusUpdatedAt;
    /**
     * <p>
     * The identifier of the security standard control.
     * </p>
     */
    private String controlId;
    /**
     * <p>
     * The title of the security standard control.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The longer description of the security standard control. Provides information about what the control is checking
     * for.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A link to remediation information for the control in the Security Hub user documentation.
     * </p>
     */
    private String remediationUrl;
    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the issue
     * is detected.
     * </p>
     */
    private String severityRating;
    /**
     * <p>
     * The list of requirements that are related to this control.
     * </p>
     */
    private java.util.List<String> relatedRequirements;

    /**
     * <p>
     * The ARN of the security standard control.
     * </p>
     * 
     * @param standardsControlArn
     *        The ARN of the security standard control.
     */

    public void setStandardsControlArn(String standardsControlArn) {
        this.standardsControlArn = standardsControlArn;
    }

    /**
     * <p>
     * The ARN of the security standard control.
     * </p>
     * 
     * @return The ARN of the security standard control.
     */

    public String getStandardsControlArn() {
        return this.standardsControlArn;
    }

    /**
     * <p>
     * The ARN of the security standard control.
     * </p>
     * 
     * @param standardsControlArn
     *        The ARN of the security standard control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControl withStandardsControlArn(String standardsControlArn) {
        setStandardsControlArn(standardsControlArn);
        return this;
    }

    /**
     * <p>
     * The current status of the security standard control. Indicates whether the control is enabled or disabled.
     * Security Hub does not check against disabled controls.
     * </p>
     * 
     * @param controlStatus
     *        The current status of the security standard control. Indicates whether the control is enabled or disabled.
     *        Security Hub does not check against disabled controls.
     * @see ControlStatus
     */

    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
    }

    /**
     * <p>
     * The current status of the security standard control. Indicates whether the control is enabled or disabled.
     * Security Hub does not check against disabled controls.
     * </p>
     * 
     * @return The current status of the security standard control. Indicates whether the control is enabled or
     *         disabled. Security Hub does not check against disabled controls.
     * @see ControlStatus
     */

    public String getControlStatus() {
        return this.controlStatus;
    }

    /**
     * <p>
     * The current status of the security standard control. Indicates whether the control is enabled or disabled.
     * Security Hub does not check against disabled controls.
     * </p>
     * 
     * @param controlStatus
     *        The current status of the security standard control. Indicates whether the control is enabled or disabled.
     *        Security Hub does not check against disabled controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public StandardsControl withControlStatus(String controlStatus) {
        setControlStatus(controlStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the security standard control. Indicates whether the control is enabled or disabled.
     * Security Hub does not check against disabled controls.
     * </p>
     * 
     * @param controlStatus
     *        The current status of the security standard control. Indicates whether the control is enabled or disabled.
     *        Security Hub does not check against disabled controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public StandardsControl withControlStatus(ControlStatus controlStatus) {
        this.controlStatus = controlStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason provided for the most recent change in status for the control.
     * </p>
     * 
     * @param disabledReason
     *        The reason provided for the most recent change in status for the control.
     */

    public void setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
    }

    /**
     * <p>
     * The reason provided for the most recent change in status for the control.
     * </p>
     * 
     * @return The reason provided for the most recent change in status for the control.
     */

    public String getDisabledReason() {
        return this.disabledReason;
    }

    /**
     * <p>
     * The reason provided for the most recent change in status for the control.
     * </p>
     * 
     * @param disabledReason
     *        The reason provided for the most recent change in status for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControl withDisabledReason(String disabledReason) {
        setDisabledReason(disabledReason);
        return this;
    }

    /**
     * <p>
     * The date and time that the status of the security standard control was most recently updated.
     * </p>
     * 
     * @param controlStatusUpdatedAt
     *        The date and time that the status of the security standard control was most recently updated.
     */

    public void setControlStatusUpdatedAt(java.util.Date controlStatusUpdatedAt) {
        this.controlStatusUpdatedAt = controlStatusUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the status of the security standard control was most recently updated.
     * </p>
     * 
     * @return The date and time that the status of the security standard control was most recently updated.
     */

    public java.util.Date getControlStatusUpdatedAt() {
        return this.controlStatusUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the status of the security standard control was most recently updated.
     * </p>
     * 
     * @param controlStatusUpdatedAt
     *        The date and time that the status of the security standard control was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControl withControlStatusUpdatedAt(java.util.Date controlStatusUpdatedAt) {
        setControlStatusUpdatedAt(controlStatusUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the security standard control.
     * </p>
     * 
     * @param controlId
     *        The identifier of the security standard control.
     */

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * The identifier of the security standard control.
     * </p>
     * 
     * @return The identifier of the security standard control.
     */

    public String getControlId() {
        return this.controlId;
    }

    /**
     * <p>
     * The identifier of the security standard control.
     * </p>
     * 
     * @param controlId
     *        The identifier of the security standard control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControl withControlId(String controlId) {
        setControlId(controlId);
        return this;
    }

    /**
     * <p>
     * The title of the security standard control.
     * </p>
     * 
     * @param title
     *        The title of the security standard control.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the security standard control.
     * </p>
     * 
     * @return The title of the security standard control.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the security standard control.
     * </p>
     * 
     * @param title
     *        The title of the security standard control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControl withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The longer description of the security standard control. Provides information about what the control is checking
     * for.
     * </p>
     * 
     * @param description
     *        The longer description of the security standard control. Provides information about what the control is
     *        checking for.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The longer description of the security standard control. Provides information about what the control is checking
     * for.
     * </p>
     * 
     * @return The longer description of the security standard control. Provides information about what the control is
     *         checking for.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The longer description of the security standard control. Provides information about what the control is checking
     * for.
     * </p>
     * 
     * @param description
     *        The longer description of the security standard control. Provides information about what the control is
     *        checking for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControl withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A link to remediation information for the control in the Security Hub user documentation.
     * </p>
     * 
     * @param remediationUrl
     *        A link to remediation information for the control in the Security Hub user documentation.
     */

    public void setRemediationUrl(String remediationUrl) {
        this.remediationUrl = remediationUrl;
    }

    /**
     * <p>
     * A link to remediation information for the control in the Security Hub user documentation.
     * </p>
     * 
     * @return A link to remediation information for the control in the Security Hub user documentation.
     */

    public String getRemediationUrl() {
        return this.remediationUrl;
    }

    /**
     * <p>
     * A link to remediation information for the control in the Security Hub user documentation.
     * </p>
     * 
     * @param remediationUrl
     *        A link to remediation information for the control in the Security Hub user documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControl withRemediationUrl(String remediationUrl) {
        setRemediationUrl(remediationUrl);
        return this;
    }

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the issue
     * is detected.
     * </p>
     * 
     * @param severityRating
     *        The severity of findings generated from this security standard control.</p>
     *        <p>
     *        The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the
     *        issue is detected.
     * @see SeverityRating
     */

    public void setSeverityRating(String severityRating) {
        this.severityRating = severityRating;
    }

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the issue
     * is detected.
     * </p>
     * 
     * @return The severity of findings generated from this security standard control.</p>
     *         <p>
     *         The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the
     *         issue is detected.
     * @see SeverityRating
     */

    public String getSeverityRating() {
        return this.severityRating;
    }

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the issue
     * is detected.
     * </p>
     * 
     * @param severityRating
     *        The severity of findings generated from this security standard control.</p>
     *        <p>
     *        The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the
     *        issue is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityRating
     */

    public StandardsControl withSeverityRating(String severityRating) {
        setSeverityRating(severityRating);
        return this;
    }

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the issue
     * is detected.
     * </p>
     * 
     * @param severityRating
     *        The severity of findings generated from this security standard control.</p>
     *        <p>
     *        The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the
     *        issue is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityRating
     */

    public StandardsControl withSeverityRating(SeverityRating severityRating) {
        this.severityRating = severityRating.toString();
        return this;
    }

    /**
     * <p>
     * The list of requirements that are related to this control.
     * </p>
     * 
     * @return The list of requirements that are related to this control.
     */

    public java.util.List<String> getRelatedRequirements() {
        return relatedRequirements;
    }

    /**
     * <p>
     * The list of requirements that are related to this control.
     * </p>
     * 
     * @param relatedRequirements
     *        The list of requirements that are related to this control.
     */

    public void setRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        if (relatedRequirements == null) {
            this.relatedRequirements = null;
            return;
        }

        this.relatedRequirements = new java.util.ArrayList<String>(relatedRequirements);
    }

    /**
     * <p>
     * The list of requirements that are related to this control.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedRequirements(java.util.Collection)} or {@link #withRelatedRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param relatedRequirements
     *        The list of requirements that are related to this control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControl withRelatedRequirements(String... relatedRequirements) {
        if (this.relatedRequirements == null) {
            setRelatedRequirements(new java.util.ArrayList<String>(relatedRequirements.length));
        }
        for (String ele : relatedRequirements) {
            this.relatedRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of requirements that are related to this control.
     * </p>
     * 
     * @param relatedRequirements
     *        The list of requirements that are related to this control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControl withRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        setRelatedRequirements(relatedRequirements);
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
        if (getStandardsControlArn() != null)
            sb.append("StandardsControlArn: ").append(getStandardsControlArn()).append(",");
        if (getControlStatus() != null)
            sb.append("ControlStatus: ").append(getControlStatus()).append(",");
        if (getDisabledReason() != null)
            sb.append("DisabledReason: ").append(getDisabledReason()).append(",");
        if (getControlStatusUpdatedAt() != null)
            sb.append("ControlStatusUpdatedAt: ").append(getControlStatusUpdatedAt()).append(",");
        if (getControlId() != null)
            sb.append("ControlId: ").append(getControlId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRemediationUrl() != null)
            sb.append("RemediationUrl: ").append(getRemediationUrl()).append(",");
        if (getSeverityRating() != null)
            sb.append("SeverityRating: ").append(getSeverityRating()).append(",");
        if (getRelatedRequirements() != null)
            sb.append("RelatedRequirements: ").append(getRelatedRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsControl == false)
            return false;
        StandardsControl other = (StandardsControl) obj;
        if (other.getStandardsControlArn() == null ^ this.getStandardsControlArn() == null)
            return false;
        if (other.getStandardsControlArn() != null && other.getStandardsControlArn().equals(this.getStandardsControlArn()) == false)
            return false;
        if (other.getControlStatus() == null ^ this.getControlStatus() == null)
            return false;
        if (other.getControlStatus() != null && other.getControlStatus().equals(this.getControlStatus()) == false)
            return false;
        if (other.getDisabledReason() == null ^ this.getDisabledReason() == null)
            return false;
        if (other.getDisabledReason() != null && other.getDisabledReason().equals(this.getDisabledReason()) == false)
            return false;
        if (other.getControlStatusUpdatedAt() == null ^ this.getControlStatusUpdatedAt() == null)
            return false;
        if (other.getControlStatusUpdatedAt() != null && other.getControlStatusUpdatedAt().equals(this.getControlStatusUpdatedAt()) == false)
            return false;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null && other.getControlId().equals(this.getControlId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRemediationUrl() == null ^ this.getRemediationUrl() == null)
            return false;
        if (other.getRemediationUrl() != null && other.getRemediationUrl().equals(this.getRemediationUrl()) == false)
            return false;
        if (other.getSeverityRating() == null ^ this.getSeverityRating() == null)
            return false;
        if (other.getSeverityRating() != null && other.getSeverityRating().equals(this.getSeverityRating()) == false)
            return false;
        if (other.getRelatedRequirements() == null ^ this.getRelatedRequirements() == null)
            return false;
        if (other.getRelatedRequirements() != null && other.getRelatedRequirements().equals(this.getRelatedRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsControlArn() == null) ? 0 : getStandardsControlArn().hashCode());
        hashCode = prime * hashCode + ((getControlStatus() == null) ? 0 : getControlStatus().hashCode());
        hashCode = prime * hashCode + ((getDisabledReason() == null) ? 0 : getDisabledReason().hashCode());
        hashCode = prime * hashCode + ((getControlStatusUpdatedAt() == null) ? 0 : getControlStatusUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRemediationUrl() == null) ? 0 : getRemediationUrl().hashCode());
        hashCode = prime * hashCode + ((getSeverityRating() == null) ? 0 : getSeverityRating().hashCode());
        hashCode = prime * hashCode + ((getRelatedRequirements() == null) ? 0 : getRelatedRequirements().hashCode());
        return hashCode;
    }

    @Override
    public StandardsControl clone() {
        try {
            return (StandardsControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StandardsControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
