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
 * Provides metadata for a security control, including its unique standard-agnostic identifier, title, description,
 * severity, availability in Amazon Web Services Regions, and a link to remediation steps.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SecurityControlDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityControlDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     * <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The ARN
     * references the security control ID (for example,
     * arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * </p>
     */
    private String securityControlId;
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
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     */
    private String currentRegionAvailability;
    /**
     * <p>
     * Security control properties that you can customize. Currently, only parameter customization is supported for
     * select controls. An empty array is returned for controls that don’t support custom properties.
     * </p>
     */
    private java.util.List<String> customizableProperties;
    /**
     * <p>
     * An object that provides a security control parameter name, description, and the options for customizing it. This
     * object is excluded for a control that doesn't support custom parameters.
     * </p>
     */
    private java.util.Map<String, ParameterDefinition> parameterDefinitions;

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     * <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The ARN
     * references the security control ID (for example,
     * arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier of a security control across standards. Values for this field typically consist of
     *        an Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     *        <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The
     *        ARN references the security control ID (for example,
     *        arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     * <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The ARN
     * references the security control ID (for example,
     * arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * </p>
     * 
     * @return The unique identifier of a security control across standards. Values for this field typically consist of
     *         an Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     *         <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The
     *         ARN references the security control ID (for example,
     *         arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     * <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The ARN
     * references the security control ID (for example,
     * arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier of a security control across standards. Values for this field typically consist of
     *        an Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     *        <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The
     *        ARN references the security control ID (for example,
     *        arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlDefinition withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
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

    public SecurityControlDefinition withTitle(String title) {
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

    public SecurityControlDefinition withDescription(String description) {
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

    public SecurityControlDefinition withRemediationUrl(String remediationUrl) {
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

    public SecurityControlDefinition withSeverityRating(String severityRating) {
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

    public SecurityControlDefinition withSeverityRating(SeverityRating severityRating) {
        this.severityRating = severityRating.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     * 
     * @param currentRegionAvailability
     *        Specifies whether a security control is available in the current Amazon Web Services Region.
     * @see RegionAvailabilityStatus
     */

    public void setCurrentRegionAvailability(String currentRegionAvailability) {
        this.currentRegionAvailability = currentRegionAvailability;
    }

    /**
     * <p>
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     * 
     * @return Specifies whether a security control is available in the current Amazon Web Services Region.
     * @see RegionAvailabilityStatus
     */

    public String getCurrentRegionAvailability() {
        return this.currentRegionAvailability;
    }

    /**
     * <p>
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     * 
     * @param currentRegionAvailability
     *        Specifies whether a security control is available in the current Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionAvailabilityStatus
     */

    public SecurityControlDefinition withCurrentRegionAvailability(String currentRegionAvailability) {
        setCurrentRegionAvailability(currentRegionAvailability);
        return this;
    }

    /**
     * <p>
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     * 
     * @param currentRegionAvailability
     *        Specifies whether a security control is available in the current Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionAvailabilityStatus
     */

    public SecurityControlDefinition withCurrentRegionAvailability(RegionAvailabilityStatus currentRegionAvailability) {
        this.currentRegionAvailability = currentRegionAvailability.toString();
        return this;
    }

    /**
     * <p>
     * Security control properties that you can customize. Currently, only parameter customization is supported for
     * select controls. An empty array is returned for controls that don’t support custom properties.
     * </p>
     * 
     * @return Security control properties that you can customize. Currently, only parameter customization is supported
     *         for select controls. An empty array is returned for controls that don’t support custom properties.
     * @see SecurityControlProperty
     */

    public java.util.List<String> getCustomizableProperties() {
        return customizableProperties;
    }

    /**
     * <p>
     * Security control properties that you can customize. Currently, only parameter customization is supported for
     * select controls. An empty array is returned for controls that don’t support custom properties.
     * </p>
     * 
     * @param customizableProperties
     *        Security control properties that you can customize. Currently, only parameter customization is supported
     *        for select controls. An empty array is returned for controls that don’t support custom properties.
     * @see SecurityControlProperty
     */

    public void setCustomizableProperties(java.util.Collection<String> customizableProperties) {
        if (customizableProperties == null) {
            this.customizableProperties = null;
            return;
        }

        this.customizableProperties = new java.util.ArrayList<String>(customizableProperties);
    }

    /**
     * <p>
     * Security control properties that you can customize. Currently, only parameter customization is supported for
     * select controls. An empty array is returned for controls that don’t support custom properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomizableProperties(java.util.Collection)} or
     * {@link #withCustomizableProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customizableProperties
     *        Security control properties that you can customize. Currently, only parameter customization is supported
     *        for select controls. An empty array is returned for controls that don’t support custom properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityControlProperty
     */

    public SecurityControlDefinition withCustomizableProperties(String... customizableProperties) {
        if (this.customizableProperties == null) {
            setCustomizableProperties(new java.util.ArrayList<String>(customizableProperties.length));
        }
        for (String ele : customizableProperties) {
            this.customizableProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Security control properties that you can customize. Currently, only parameter customization is supported for
     * select controls. An empty array is returned for controls that don’t support custom properties.
     * </p>
     * 
     * @param customizableProperties
     *        Security control properties that you can customize. Currently, only parameter customization is supported
     *        for select controls. An empty array is returned for controls that don’t support custom properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityControlProperty
     */

    public SecurityControlDefinition withCustomizableProperties(java.util.Collection<String> customizableProperties) {
        setCustomizableProperties(customizableProperties);
        return this;
    }

    /**
     * <p>
     * Security control properties that you can customize. Currently, only parameter customization is supported for
     * select controls. An empty array is returned for controls that don’t support custom properties.
     * </p>
     * 
     * @param customizableProperties
     *        Security control properties that you can customize. Currently, only parameter customization is supported
     *        for select controls. An empty array is returned for controls that don’t support custom properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityControlProperty
     */

    public SecurityControlDefinition withCustomizableProperties(SecurityControlProperty... customizableProperties) {
        java.util.ArrayList<String> customizablePropertiesCopy = new java.util.ArrayList<String>(customizableProperties.length);
        for (SecurityControlProperty value : customizableProperties) {
            customizablePropertiesCopy.add(value.toString());
        }
        if (getCustomizableProperties() == null) {
            setCustomizableProperties(customizablePropertiesCopy);
        } else {
            getCustomizableProperties().addAll(customizablePropertiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * An object that provides a security control parameter name, description, and the options for customizing it. This
     * object is excluded for a control that doesn't support custom parameters.
     * </p>
     * 
     * @return An object that provides a security control parameter name, description, and the options for customizing
     *         it. This object is excluded for a control that doesn't support custom parameters.
     */

    public java.util.Map<String, ParameterDefinition> getParameterDefinitions() {
        return parameterDefinitions;
    }

    /**
     * <p>
     * An object that provides a security control parameter name, description, and the options for customizing it. This
     * object is excluded for a control that doesn't support custom parameters.
     * </p>
     * 
     * @param parameterDefinitions
     *        An object that provides a security control parameter name, description, and the options for customizing
     *        it. This object is excluded for a control that doesn't support custom parameters.
     */

    public void setParameterDefinitions(java.util.Map<String, ParameterDefinition> parameterDefinitions) {
        this.parameterDefinitions = parameterDefinitions;
    }

    /**
     * <p>
     * An object that provides a security control parameter name, description, and the options for customizing it. This
     * object is excluded for a control that doesn't support custom parameters.
     * </p>
     * 
     * @param parameterDefinitions
     *        An object that provides a security control parameter name, description, and the options for customizing
     *        it. This object is excluded for a control that doesn't support custom parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlDefinition withParameterDefinitions(java.util.Map<String, ParameterDefinition> parameterDefinitions) {
        setParameterDefinitions(parameterDefinitions);
        return this;
    }

    /**
     * Add a single ParameterDefinitions entry
     *
     * @see SecurityControlDefinition#withParameterDefinitions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlDefinition addParameterDefinitionsEntry(String key, ParameterDefinition value) {
        if (null == this.parameterDefinitions) {
            this.parameterDefinitions = new java.util.HashMap<String, ParameterDefinition>();
        }
        if (this.parameterDefinitions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameterDefinitions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ParameterDefinitions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlDefinition clearParameterDefinitionsEntries() {
        this.parameterDefinitions = null;
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRemediationUrl() != null)
            sb.append("RemediationUrl: ").append(getRemediationUrl()).append(",");
        if (getSeverityRating() != null)
            sb.append("SeverityRating: ").append(getSeverityRating()).append(",");
        if (getCurrentRegionAvailability() != null)
            sb.append("CurrentRegionAvailability: ").append(getCurrentRegionAvailability()).append(",");
        if (getCustomizableProperties() != null)
            sb.append("CustomizableProperties: ").append(getCustomizableProperties()).append(",");
        if (getParameterDefinitions() != null)
            sb.append("ParameterDefinitions: ").append(getParameterDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityControlDefinition == false)
            return false;
        SecurityControlDefinition other = (SecurityControlDefinition) obj;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
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
        if (other.getCurrentRegionAvailability() == null ^ this.getCurrentRegionAvailability() == null)
            return false;
        if (other.getCurrentRegionAvailability() != null && other.getCurrentRegionAvailability().equals(this.getCurrentRegionAvailability()) == false)
            return false;
        if (other.getCustomizableProperties() == null ^ this.getCustomizableProperties() == null)
            return false;
        if (other.getCustomizableProperties() != null && other.getCustomizableProperties().equals(this.getCustomizableProperties()) == false)
            return false;
        if (other.getParameterDefinitions() == null ^ this.getParameterDefinitions() == null)
            return false;
        if (other.getParameterDefinitions() != null && other.getParameterDefinitions().equals(this.getParameterDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRemediationUrl() == null) ? 0 : getRemediationUrl().hashCode());
        hashCode = prime * hashCode + ((getSeverityRating() == null) ? 0 : getSeverityRating().hashCode());
        hashCode = prime * hashCode + ((getCurrentRegionAvailability() == null) ? 0 : getCurrentRegionAvailability().hashCode());
        hashCode = prime * hashCode + ((getCustomizableProperties() == null) ? 0 : getCustomizableProperties().hashCode());
        hashCode = prime * hashCode + ((getParameterDefinitions() == null) ? 0 : getParameterDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public SecurityControlDefinition clone() {
        try {
            return (SecurityControlDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SecurityControlDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
