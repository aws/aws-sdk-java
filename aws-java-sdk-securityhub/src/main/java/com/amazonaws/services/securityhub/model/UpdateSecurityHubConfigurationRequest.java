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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityHubConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityHubConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * By default, this is set to <code>true</code>, and new controls are enabled automatically. To not automatically
     * enable new controls, set this to <code>false</code>.
     * </p>
     */
    private Boolean autoEnableControls;
    /**
     * <p>
     * Updates whether the calling account has consolidated control findings turned on. If the value for this field is
     * set to <code>SECURITY_CONTROL</code>, Security Hub generates a single finding for a control check even when the
     * check applies to multiple enabled standards.
     * </p>
     * <p>
     * If the value for this field is set to <code>STANDARD_CONTROL</code>, Security Hub generates separate findings for
     * a control check when the check applies to multiple enabled standards.
     * </p>
     * <p>
     * For accounts that are part of an organization, this value can only be updated in the administrator account.
     * </p>
     */
    private String controlFindingGenerator;

    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * By default, this is set to <code>true</code>, and new controls are enabled automatically. To not automatically
     * enable new controls, set this to <code>false</code>.
     * </p>
     * 
     * @param autoEnableControls
     *        Whether to automatically enable new controls when they are added to standards that are enabled.</p>
     *        <p>
     *        By default, this is set to <code>true</code>, and new controls are enabled automatically. To not
     *        automatically enable new controls, set this to <code>false</code>.
     */

    public void setAutoEnableControls(Boolean autoEnableControls) {
        this.autoEnableControls = autoEnableControls;
    }

    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * By default, this is set to <code>true</code>, and new controls are enabled automatically. To not automatically
     * enable new controls, set this to <code>false</code>.
     * </p>
     * 
     * @return Whether to automatically enable new controls when they are added to standards that are enabled.</p>
     *         <p>
     *         By default, this is set to <code>true</code>, and new controls are enabled automatically. To not
     *         automatically enable new controls, set this to <code>false</code>.
     */

    public Boolean getAutoEnableControls() {
        return this.autoEnableControls;
    }

    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * By default, this is set to <code>true</code>, and new controls are enabled automatically. To not automatically
     * enable new controls, set this to <code>false</code>.
     * </p>
     * 
     * @param autoEnableControls
     *        Whether to automatically enable new controls when they are added to standards that are enabled.</p>
     *        <p>
     *        By default, this is set to <code>true</code>, and new controls are enabled automatically. To not
     *        automatically enable new controls, set this to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityHubConfigurationRequest withAutoEnableControls(Boolean autoEnableControls) {
        setAutoEnableControls(autoEnableControls);
        return this;
    }

    /**
     * <p>
     * Whether to automatically enable new controls when they are added to standards that are enabled.
     * </p>
     * <p>
     * By default, this is set to <code>true</code>, and new controls are enabled automatically. To not automatically
     * enable new controls, set this to <code>false</code>.
     * </p>
     * 
     * @return Whether to automatically enable new controls when they are added to standards that are enabled.</p>
     *         <p>
     *         By default, this is set to <code>true</code>, and new controls are enabled automatically. To not
     *         automatically enable new controls, set this to <code>false</code>.
     */

    public Boolean isAutoEnableControls() {
        return this.autoEnableControls;
    }

    /**
     * <p>
     * Updates whether the calling account has consolidated control findings turned on. If the value for this field is
     * set to <code>SECURITY_CONTROL</code>, Security Hub generates a single finding for a control check even when the
     * check applies to multiple enabled standards.
     * </p>
     * <p>
     * If the value for this field is set to <code>STANDARD_CONTROL</code>, Security Hub generates separate findings for
     * a control check when the check applies to multiple enabled standards.
     * </p>
     * <p>
     * For accounts that are part of an organization, this value can only be updated in the administrator account.
     * </p>
     * 
     * @param controlFindingGenerator
     *        Updates whether the calling account has consolidated control findings turned on. If the value for this
     *        field is set to <code>SECURITY_CONTROL</code>, Security Hub generates a single finding for a control check
     *        even when the check applies to multiple enabled standards.</p>
     *        <p>
     *        If the value for this field is set to <code>STANDARD_CONTROL</code>, Security Hub generates separate
     *        findings for a control check when the check applies to multiple enabled standards.
     *        </p>
     *        <p>
     *        For accounts that are part of an organization, this value can only be updated in the administrator
     *        account.
     * @see ControlFindingGenerator
     */

    public void setControlFindingGenerator(String controlFindingGenerator) {
        this.controlFindingGenerator = controlFindingGenerator;
    }

    /**
     * <p>
     * Updates whether the calling account has consolidated control findings turned on. If the value for this field is
     * set to <code>SECURITY_CONTROL</code>, Security Hub generates a single finding for a control check even when the
     * check applies to multiple enabled standards.
     * </p>
     * <p>
     * If the value for this field is set to <code>STANDARD_CONTROL</code>, Security Hub generates separate findings for
     * a control check when the check applies to multiple enabled standards.
     * </p>
     * <p>
     * For accounts that are part of an organization, this value can only be updated in the administrator account.
     * </p>
     * 
     * @return Updates whether the calling account has consolidated control findings turned on. If the value for this
     *         field is set to <code>SECURITY_CONTROL</code>, Security Hub generates a single finding for a control
     *         check even when the check applies to multiple enabled standards.</p>
     *         <p>
     *         If the value for this field is set to <code>STANDARD_CONTROL</code>, Security Hub generates separate
     *         findings for a control check when the check applies to multiple enabled standards.
     *         </p>
     *         <p>
     *         For accounts that are part of an organization, this value can only be updated in the administrator
     *         account.
     * @see ControlFindingGenerator
     */

    public String getControlFindingGenerator() {
        return this.controlFindingGenerator;
    }

    /**
     * <p>
     * Updates whether the calling account has consolidated control findings turned on. If the value for this field is
     * set to <code>SECURITY_CONTROL</code>, Security Hub generates a single finding for a control check even when the
     * check applies to multiple enabled standards.
     * </p>
     * <p>
     * If the value for this field is set to <code>STANDARD_CONTROL</code>, Security Hub generates separate findings for
     * a control check when the check applies to multiple enabled standards.
     * </p>
     * <p>
     * For accounts that are part of an organization, this value can only be updated in the administrator account.
     * </p>
     * 
     * @param controlFindingGenerator
     *        Updates whether the calling account has consolidated control findings turned on. If the value for this
     *        field is set to <code>SECURITY_CONTROL</code>, Security Hub generates a single finding for a control check
     *        even when the check applies to multiple enabled standards.</p>
     *        <p>
     *        If the value for this field is set to <code>STANDARD_CONTROL</code>, Security Hub generates separate
     *        findings for a control check when the check applies to multiple enabled standards.
     *        </p>
     *        <p>
     *        For accounts that are part of an organization, this value can only be updated in the administrator
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlFindingGenerator
     */

    public UpdateSecurityHubConfigurationRequest withControlFindingGenerator(String controlFindingGenerator) {
        setControlFindingGenerator(controlFindingGenerator);
        return this;
    }

    /**
     * <p>
     * Updates whether the calling account has consolidated control findings turned on. If the value for this field is
     * set to <code>SECURITY_CONTROL</code>, Security Hub generates a single finding for a control check even when the
     * check applies to multiple enabled standards.
     * </p>
     * <p>
     * If the value for this field is set to <code>STANDARD_CONTROL</code>, Security Hub generates separate findings for
     * a control check when the check applies to multiple enabled standards.
     * </p>
     * <p>
     * For accounts that are part of an organization, this value can only be updated in the administrator account.
     * </p>
     * 
     * @param controlFindingGenerator
     *        Updates whether the calling account has consolidated control findings turned on. If the value for this
     *        field is set to <code>SECURITY_CONTROL</code>, Security Hub generates a single finding for a control check
     *        even when the check applies to multiple enabled standards.</p>
     *        <p>
     *        If the value for this field is set to <code>STANDARD_CONTROL</code>, Security Hub generates separate
     *        findings for a control check when the check applies to multiple enabled standards.
     *        </p>
     *        <p>
     *        For accounts that are part of an organization, this value can only be updated in the administrator
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlFindingGenerator
     */

    public UpdateSecurityHubConfigurationRequest withControlFindingGenerator(ControlFindingGenerator controlFindingGenerator) {
        this.controlFindingGenerator = controlFindingGenerator.toString();
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
        if (getAutoEnableControls() != null)
            sb.append("AutoEnableControls: ").append(getAutoEnableControls()).append(",");
        if (getControlFindingGenerator() != null)
            sb.append("ControlFindingGenerator: ").append(getControlFindingGenerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityHubConfigurationRequest == false)
            return false;
        UpdateSecurityHubConfigurationRequest other = (UpdateSecurityHubConfigurationRequest) obj;
        if (other.getAutoEnableControls() == null ^ this.getAutoEnableControls() == null)
            return false;
        if (other.getAutoEnableControls() != null && other.getAutoEnableControls().equals(this.getAutoEnableControls()) == false)
            return false;
        if (other.getControlFindingGenerator() == null ^ this.getControlFindingGenerator() == null)
            return false;
        if (other.getControlFindingGenerator() != null && other.getControlFindingGenerator().equals(this.getControlFindingGenerator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnableControls() == null) ? 0 : getAutoEnableControls().hashCode());
        hashCode = prime * hashCode + ((getControlFindingGenerator() == null) ? 0 : getControlFindingGenerator().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecurityHubConfigurationRequest clone() {
        return (UpdateSecurityHubConfigurationRequest) super.clone();
    }

}
