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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A security control in Security Hub describes a security best practice related to a specific resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SecurityControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number, such as APIGateway.3.
     * </p>
     */
    private String securityControlId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for a security control across standards, such as
     * <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't mention
     * a specific standard.
     * </p>
     */
    private String securityControlArn;
    /**
     * <p>
     * The title of a security control.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The description of a security control across standards. This typically summarizes how Security Hub evaluates the
     * control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific
     * standard.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A link to Security Hub documentation that explains how to remediate a failed finding for a security control.
     * </p>
     */
    private String remediationUrl;
    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     */
    private String severityRating;
    /**
     * <p>
     * The enablement status of a security control in a specific standard.
     * </p>
     */
    private String securityControlStatus;
    /**
     * <p>
     * Identifies whether customizable properties of a security control are reflected in Security Hub findings. A status
     * of <code>READY</code> indicates findings include the current parameter values. A status of <code>UPDATING</code>
     * indicates that all findings may not include the current parameter values.
     * </p>
     */
    private String updateStatus;
    /**
     * <p>
     * An object that identifies the name of a control parameter, its current value, and whether it has been customized.
     * </p>
     */
    private java.util.Map<String, ParameterConfiguration> parameters;
    /**
     * <p>
     * The most recent reason for updating the customizable properties of a security control. This differs from the
     * <code>UpdateReason</code> field of the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html">
     * <code>BatchUpdateStandardsControlAssociations</code> </a> API, which tracks the reason for updating the
     * enablement status of a control. This field accepts alphanumeric characters in addition to white spaces, dashes,
     * and underscores.
     * </p>
     */
    private String lastUpdateReason;

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number, such as APIGateway.3.
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier of a security control across standards. Values for this field typically consist of
     *        an Amazon Web Service name and a number, such as APIGateway.3.
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number, such as APIGateway.3.
     * </p>
     * 
     * @return The unique identifier of a security control across standards. Values for this field typically consist of
     *         an Amazon Web Service name and a number, such as APIGateway.3.
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number, such as APIGateway.3.
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier of a security control across standards. Values for this field typically consist of
     *        an Amazon Web Service name and a number, such as APIGateway.3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControl withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a security control across standards, such as
     * <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't mention
     * a specific standard.
     * </p>
     * 
     * @param securityControlArn
     *        The Amazon Resource Name (ARN) for a security control across standards, such as
     *        <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't
     *        mention a specific standard.
     */

    public void setSecurityControlArn(String securityControlArn) {
        this.securityControlArn = securityControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a security control across standards, such as
     * <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't mention
     * a specific standard.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a security control across standards, such as
     *         <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't
     *         mention a specific standard.
     */

    public String getSecurityControlArn() {
        return this.securityControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a security control across standards, such as
     * <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't mention
     * a specific standard.
     * </p>
     * 
     * @param securityControlArn
     *        The Amazon Resource Name (ARN) for a security control across standards, such as
     *        <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't
     *        mention a specific standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControl withSecurityControlArn(String securityControlArn) {
        setSecurityControlArn(securityControlArn);
        return this;
    }

    /**
     * <p>
     * The title of a security control.
     * </p>
     * 
     * @param title
     *        The title of a security control.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of a security control.
     * </p>
     * 
     * @return The title of a security control.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of a security control.
     * </p>
     * 
     * @param title
     *        The title of a security control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControl withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The description of a security control across standards. This typically summarizes how Security Hub evaluates the
     * control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific
     * standard.
     * </p>
     * 
     * @param description
     *        The description of a security control across standards. This typically summarizes how Security Hub
     *        evaluates the control and the conditions under which it produces a failed finding. This parameter doesn't
     *        reference a specific standard.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a security control across standards. This typically summarizes how Security Hub evaluates the
     * control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific
     * standard.
     * </p>
     * 
     * @return The description of a security control across standards. This typically summarizes how Security Hub
     *         evaluates the control and the conditions under which it produces a failed finding. This parameter doesn't
     *         reference a specific standard.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a security control across standards. This typically summarizes how Security Hub evaluates the
     * control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific
     * standard.
     * </p>
     * 
     * @param description
     *        The description of a security control across standards. This typically summarizes how Security Hub
     *        evaluates the control and the conditions under which it produces a failed finding. This parameter doesn't
     *        reference a specific standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControl withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A link to Security Hub documentation that explains how to remediate a failed finding for a security control.
     * </p>
     * 
     * @param remediationUrl
     *        A link to Security Hub documentation that explains how to remediate a failed finding for a security
     *        control.
     */

    public void setRemediationUrl(String remediationUrl) {
        this.remediationUrl = remediationUrl;
    }

    /**
     * <p>
     * A link to Security Hub documentation that explains how to remediate a failed finding for a security control.
     * </p>
     * 
     * @return A link to Security Hub documentation that explains how to remediate a failed finding for a security
     *         control.
     */

    public String getRemediationUrl() {
        return this.remediationUrl;
    }

    /**
     * <p>
     * A link to Security Hub documentation that explains how to remediate a failed finding for a security control.
     * </p>
     * 
     * @param remediationUrl
     *        A link to Security Hub documentation that explains how to remediate a failed finding for a security
     *        control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControl withRemediationUrl(String remediationUrl) {
        setRemediationUrl(remediationUrl);
        return this;
    }

    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param severityRating
     *        The severity of a security control. For more information about how Security Hub determines control
     *        severity, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     *        >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * @see SeverityRating
     */

    public void setSeverityRating(String severityRating) {
        this.severityRating = severityRating;
    }

    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @return The severity of a security control. For more information about how Security Hub determines control
     *         severity, see <a href=
     *         "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     *         >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * @see SeverityRating
     */

    public String getSeverityRating() {
        return this.severityRating;
    }

    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param severityRating
     *        The severity of a security control. For more information about how Security Hub determines control
     *        severity, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     *        >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityRating
     */

    public SecurityControl withSeverityRating(String severityRating) {
        setSeverityRating(severityRating);
        return this;
    }

    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param severityRating
     *        The severity of a security control. For more information about how Security Hub determines control
     *        severity, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     *        >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityRating
     */

    public SecurityControl withSeverityRating(SeverityRating severityRating) {
        this.severityRating = severityRating.toString();
        return this;
    }

    /**
     * <p>
     * The enablement status of a security control in a specific standard.
     * </p>
     * 
     * @param securityControlStatus
     *        The enablement status of a security control in a specific standard.
     * @see ControlStatus
     */

    public void setSecurityControlStatus(String securityControlStatus) {
        this.securityControlStatus = securityControlStatus;
    }

    /**
     * <p>
     * The enablement status of a security control in a specific standard.
     * </p>
     * 
     * @return The enablement status of a security control in a specific standard.
     * @see ControlStatus
     */

    public String getSecurityControlStatus() {
        return this.securityControlStatus;
    }

    /**
     * <p>
     * The enablement status of a security control in a specific standard.
     * </p>
     * 
     * @param securityControlStatus
     *        The enablement status of a security control in a specific standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public SecurityControl withSecurityControlStatus(String securityControlStatus) {
        setSecurityControlStatus(securityControlStatus);
        return this;
    }

    /**
     * <p>
     * The enablement status of a security control in a specific standard.
     * </p>
     * 
     * @param securityControlStatus
     *        The enablement status of a security control in a specific standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public SecurityControl withSecurityControlStatus(ControlStatus securityControlStatus) {
        this.securityControlStatus = securityControlStatus.toString();
        return this;
    }

    /**
     * <p>
     * Identifies whether customizable properties of a security control are reflected in Security Hub findings. A status
     * of <code>READY</code> indicates findings include the current parameter values. A status of <code>UPDATING</code>
     * indicates that all findings may not include the current parameter values.
     * </p>
     * 
     * @param updateStatus
     *        Identifies whether customizable properties of a security control are reflected in Security Hub findings. A
     *        status of <code>READY</code> indicates findings include the current parameter values. A status of
     *        <code>UPDATING</code> indicates that all findings may not include the current parameter values.
     * @see UpdateStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * Identifies whether customizable properties of a security control are reflected in Security Hub findings. A status
     * of <code>READY</code> indicates findings include the current parameter values. A status of <code>UPDATING</code>
     * indicates that all findings may not include the current parameter values.
     * </p>
     * 
     * @return Identifies whether customizable properties of a security control are reflected in Security Hub findings.
     *         A status of <code>READY</code> indicates findings include the current parameter values. A status of
     *         <code>UPDATING</code> indicates that all findings may not include the current parameter values.
     * @see UpdateStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * Identifies whether customizable properties of a security control are reflected in Security Hub findings. A status
     * of <code>READY</code> indicates findings include the current parameter values. A status of <code>UPDATING</code>
     * indicates that all findings may not include the current parameter values.
     * </p>
     * 
     * @param updateStatus
     *        Identifies whether customizable properties of a security control are reflected in Security Hub findings. A
     *        status of <code>READY</code> indicates findings include the current parameter values. A status of
     *        <code>UPDATING</code> indicates that all findings may not include the current parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public SecurityControl withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * Identifies whether customizable properties of a security control are reflected in Security Hub findings. A status
     * of <code>READY</code> indicates findings include the current parameter values. A status of <code>UPDATING</code>
     * indicates that all findings may not include the current parameter values.
     * </p>
     * 
     * @param updateStatus
     *        Identifies whether customizable properties of a security control are reflected in Security Hub findings. A
     *        status of <code>READY</code> indicates findings include the current parameter values. A status of
     *        <code>UPDATING</code> indicates that all findings may not include the current parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public SecurityControl withUpdateStatus(UpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * An object that identifies the name of a control parameter, its current value, and whether it has been customized.
     * </p>
     * 
     * @return An object that identifies the name of a control parameter, its current value, and whether it has been
     *         customized.
     */

    public java.util.Map<String, ParameterConfiguration> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * An object that identifies the name of a control parameter, its current value, and whether it has been customized.
     * </p>
     * 
     * @param parameters
     *        An object that identifies the name of a control parameter, its current value, and whether it has been
     *        customized.
     */

    public void setParameters(java.util.Map<String, ParameterConfiguration> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * An object that identifies the name of a control parameter, its current value, and whether it has been customized.
     * </p>
     * 
     * @param parameters
     *        An object that identifies the name of a control parameter, its current value, and whether it has been
     *        customized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControl withParameters(java.util.Map<String, ParameterConfiguration> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see SecurityControl#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControl addParametersEntry(String key, ParameterConfiguration value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, ParameterConfiguration>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControl clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The most recent reason for updating the customizable properties of a security control. This differs from the
     * <code>UpdateReason</code> field of the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html">
     * <code>BatchUpdateStandardsControlAssociations</code> </a> API, which tracks the reason for updating the
     * enablement status of a control. This field accepts alphanumeric characters in addition to white spaces, dashes,
     * and underscores.
     * </p>
     * 
     * @param lastUpdateReason
     *        The most recent reason for updating the customizable properties of a security control. This differs from
     *        the <code>UpdateReason</code> field of the <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     *        > <code>BatchUpdateStandardsControlAssociations</code> </a> API, which tracks the reason for updating the
     *        enablement status of a control. This field accepts alphanumeric characters in addition to white spaces,
     *        dashes, and underscores.
     */

    public void setLastUpdateReason(String lastUpdateReason) {
        this.lastUpdateReason = lastUpdateReason;
    }

    /**
     * <p>
     * The most recent reason for updating the customizable properties of a security control. This differs from the
     * <code>UpdateReason</code> field of the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html">
     * <code>BatchUpdateStandardsControlAssociations</code> </a> API, which tracks the reason for updating the
     * enablement status of a control. This field accepts alphanumeric characters in addition to white spaces, dashes,
     * and underscores.
     * </p>
     * 
     * @return The most recent reason for updating the customizable properties of a security control. This differs from
     *         the <code>UpdateReason</code> field of the <a href=
     *         "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     *         > <code>BatchUpdateStandardsControlAssociations</code> </a> API, which tracks the reason for updating the
     *         enablement status of a control. This field accepts alphanumeric characters in addition to white spaces,
     *         dashes, and underscores.
     */

    public String getLastUpdateReason() {
        return this.lastUpdateReason;
    }

    /**
     * <p>
     * The most recent reason for updating the customizable properties of a security control. This differs from the
     * <code>UpdateReason</code> field of the <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html">
     * <code>BatchUpdateStandardsControlAssociations</code> </a> API, which tracks the reason for updating the
     * enablement status of a control. This field accepts alphanumeric characters in addition to white spaces, dashes,
     * and underscores.
     * </p>
     * 
     * @param lastUpdateReason
     *        The most recent reason for updating the customizable properties of a security control. This differs from
     *        the <code>UpdateReason</code> field of the <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     *        > <code>BatchUpdateStandardsControlAssociations</code> </a> API, which tracks the reason for updating the
     *        enablement status of a control. This field accepts alphanumeric characters in addition to white spaces,
     *        dashes, and underscores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControl withLastUpdateReason(String lastUpdateReason) {
        setLastUpdateReason(lastUpdateReason);
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
        if (getSecurityControlId() != null)
            sb.append("SecurityControlId: ").append(getSecurityControlId()).append(",");
        if (getSecurityControlArn() != null)
            sb.append("SecurityControlArn: ").append(getSecurityControlArn()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRemediationUrl() != null)
            sb.append("RemediationUrl: ").append(getRemediationUrl()).append(",");
        if (getSeverityRating() != null)
            sb.append("SeverityRating: ").append(getSeverityRating()).append(",");
        if (getSecurityControlStatus() != null)
            sb.append("SecurityControlStatus: ").append(getSecurityControlStatus()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getLastUpdateReason() != null)
            sb.append("LastUpdateReason: ").append(getLastUpdateReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityControl == false)
            return false;
        SecurityControl other = (SecurityControl) obj;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
            return false;
        if (other.getSecurityControlArn() == null ^ this.getSecurityControlArn() == null)
            return false;
        if (other.getSecurityControlArn() != null && other.getSecurityControlArn().equals(this.getSecurityControlArn()) == false)
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
        if (other.getSecurityControlStatus() == null ^ this.getSecurityControlStatus() == null)
            return false;
        if (other.getSecurityControlStatus() != null && other.getSecurityControlStatus().equals(this.getSecurityControlStatus()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getLastUpdateReason() == null ^ this.getLastUpdateReason() == null)
            return false;
        if (other.getLastUpdateReason() != null && other.getLastUpdateReason().equals(this.getLastUpdateReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getSecurityControlArn() == null) ? 0 : getSecurityControlArn().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRemediationUrl() == null) ? 0 : getRemediationUrl().hashCode());
        hashCode = prime * hashCode + ((getSeverityRating() == null) ? 0 : getSeverityRating().hashCode());
        hashCode = prime * hashCode + ((getSecurityControlStatus() == null) ? 0 : getSecurityControlStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateReason() == null) ? 0 : getLastUpdateReason().hashCode());
        return hashCode;
    }

    @Override
    public SecurityControl clone() {
        try {
            return (SecurityControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SecurityControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
