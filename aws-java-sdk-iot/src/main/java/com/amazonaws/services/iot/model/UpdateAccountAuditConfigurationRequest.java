/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountAuditConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies,
     * certificates and other items as necessary when performing an audit.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Information about the targets to which audit notifications are sent.
     * </p>
     */
    private java.util.Map<String, AuditNotificationTarget> auditNotificationTargetConfigurations;
    /**
     * <p>
     * Specifies which audit checks are enabled and disabled for this account. Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are currently
     * enabled.
     * </p>
     * <p>
     * Note that some data collection may begin immediately when certain checks are enabled. When a check is disabled,
     * any data collected so far in relation to the check is deleted.
     * </p>
     * <p>
     * You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the
     * scheduled audit or delete the scheduled audit itself.
     * </p>
     * <p>
     * On the first call to <code>UpdateAccountAuditConfiguration</code> this parameter is required and must specify at
     * least one enabled check.
     * </p>
     */
    private java.util.Map<String, AuditCheckConfiguration> auditCheckConfigurations;

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies,
     * certificates and other items as necessary when performing an audit.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT to access information about your devices, policies,
     *        certificates and other items as necessary when performing an audit.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies,
     * certificates and other items as necessary when performing an audit.
     * </p>
     * 
     * @return The ARN of the role that grants permission to AWS IoT to access information about your devices, policies,
     *         certificates and other items as necessary when performing an audit.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies,
     * certificates and other items as necessary when performing an audit.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT to access information about your devices, policies,
     *        certificates and other items as necessary when performing an audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountAuditConfigurationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Information about the targets to which audit notifications are sent.
     * </p>
     * 
     * @return Information about the targets to which audit notifications are sent.
     */

    public java.util.Map<String, AuditNotificationTarget> getAuditNotificationTargetConfigurations() {
        return auditNotificationTargetConfigurations;
    }

    /**
     * <p>
     * Information about the targets to which audit notifications are sent.
     * </p>
     * 
     * @param auditNotificationTargetConfigurations
     *        Information about the targets to which audit notifications are sent.
     */

    public void setAuditNotificationTargetConfigurations(java.util.Map<String, AuditNotificationTarget> auditNotificationTargetConfigurations) {
        this.auditNotificationTargetConfigurations = auditNotificationTargetConfigurations;
    }

    /**
     * <p>
     * Information about the targets to which audit notifications are sent.
     * </p>
     * 
     * @param auditNotificationTargetConfigurations
     *        Information about the targets to which audit notifications are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountAuditConfigurationRequest withAuditNotificationTargetConfigurations(
            java.util.Map<String, AuditNotificationTarget> auditNotificationTargetConfigurations) {
        setAuditNotificationTargetConfigurations(auditNotificationTargetConfigurations);
        return this;
    }

    public UpdateAccountAuditConfigurationRequest addAuditNotificationTargetConfigurationsEntry(String key, AuditNotificationTarget value) {
        if (null == this.auditNotificationTargetConfigurations) {
            this.auditNotificationTargetConfigurations = new java.util.HashMap<String, AuditNotificationTarget>();
        }
        if (this.auditNotificationTargetConfigurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.auditNotificationTargetConfigurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuditNotificationTargetConfigurations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountAuditConfigurationRequest clearAuditNotificationTargetConfigurationsEntries() {
        this.auditNotificationTargetConfigurations = null;
        return this;
    }

    /**
     * <p>
     * Specifies which audit checks are enabled and disabled for this account. Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are currently
     * enabled.
     * </p>
     * <p>
     * Note that some data collection may begin immediately when certain checks are enabled. When a check is disabled,
     * any data collected so far in relation to the check is deleted.
     * </p>
     * <p>
     * You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the
     * scheduled audit or delete the scheduled audit itself.
     * </p>
     * <p>
     * On the first call to <code>UpdateAccountAuditConfiguration</code> this parameter is required and must specify at
     * least one enabled check.
     * </p>
     * 
     * @return Specifies which audit checks are enabled and disabled for this account. Use
     *         <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are
     *         currently enabled.</p>
     *         <p>
     *         Note that some data collection may begin immediately when certain checks are enabled. When a check is
     *         disabled, any data collected so far in relation to the check is deleted.
     *         </p>
     *         <p>
     *         You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the
     *         scheduled audit or delete the scheduled audit itself.
     *         </p>
     *         <p>
     *         On the first call to <code>UpdateAccountAuditConfiguration</code> this parameter is required and must
     *         specify at least one enabled check.
     */

    public java.util.Map<String, AuditCheckConfiguration> getAuditCheckConfigurations() {
        return auditCheckConfigurations;
    }

    /**
     * <p>
     * Specifies which audit checks are enabled and disabled for this account. Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are currently
     * enabled.
     * </p>
     * <p>
     * Note that some data collection may begin immediately when certain checks are enabled. When a check is disabled,
     * any data collected so far in relation to the check is deleted.
     * </p>
     * <p>
     * You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the
     * scheduled audit or delete the scheduled audit itself.
     * </p>
     * <p>
     * On the first call to <code>UpdateAccountAuditConfiguration</code> this parameter is required and must specify at
     * least one enabled check.
     * </p>
     * 
     * @param auditCheckConfigurations
     *        Specifies which audit checks are enabled and disabled for this account. Use
     *        <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are
     *        currently enabled.</p>
     *        <p>
     *        Note that some data collection may begin immediately when certain checks are enabled. When a check is
     *        disabled, any data collected so far in relation to the check is deleted.
     *        </p>
     *        <p>
     *        You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the
     *        scheduled audit or delete the scheduled audit itself.
     *        </p>
     *        <p>
     *        On the first call to <code>UpdateAccountAuditConfiguration</code> this parameter is required and must
     *        specify at least one enabled check.
     */

    public void setAuditCheckConfigurations(java.util.Map<String, AuditCheckConfiguration> auditCheckConfigurations) {
        this.auditCheckConfigurations = auditCheckConfigurations;
    }

    /**
     * <p>
     * Specifies which audit checks are enabled and disabled for this account. Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are currently
     * enabled.
     * </p>
     * <p>
     * Note that some data collection may begin immediately when certain checks are enabled. When a check is disabled,
     * any data collected so far in relation to the check is deleted.
     * </p>
     * <p>
     * You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the
     * scheduled audit or delete the scheduled audit itself.
     * </p>
     * <p>
     * On the first call to <code>UpdateAccountAuditConfiguration</code> this parameter is required and must specify at
     * least one enabled check.
     * </p>
     * 
     * @param auditCheckConfigurations
     *        Specifies which audit checks are enabled and disabled for this account. Use
     *        <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including those that are
     *        currently enabled.</p>
     *        <p>
     *        Note that some data collection may begin immediately when certain checks are enabled. When a check is
     *        disabled, any data collected so far in relation to the check is deleted.
     *        </p>
     *        <p>
     *        You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the
     *        scheduled audit or delete the scheduled audit itself.
     *        </p>
     *        <p>
     *        On the first call to <code>UpdateAccountAuditConfiguration</code> this parameter is required and must
     *        specify at least one enabled check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountAuditConfigurationRequest withAuditCheckConfigurations(java.util.Map<String, AuditCheckConfiguration> auditCheckConfigurations) {
        setAuditCheckConfigurations(auditCheckConfigurations);
        return this;
    }

    public UpdateAccountAuditConfigurationRequest addAuditCheckConfigurationsEntry(String key, AuditCheckConfiguration value) {
        if (null == this.auditCheckConfigurations) {
            this.auditCheckConfigurations = new java.util.HashMap<String, AuditCheckConfiguration>();
        }
        if (this.auditCheckConfigurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.auditCheckConfigurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuditCheckConfigurations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountAuditConfigurationRequest clearAuditCheckConfigurationsEntries() {
        this.auditCheckConfigurations = null;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAuditNotificationTargetConfigurations() != null)
            sb.append("AuditNotificationTargetConfigurations: ").append(getAuditNotificationTargetConfigurations()).append(",");
        if (getAuditCheckConfigurations() != null)
            sb.append("AuditCheckConfigurations: ").append(getAuditCheckConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountAuditConfigurationRequest == false)
            return false;
        UpdateAccountAuditConfigurationRequest other = (UpdateAccountAuditConfigurationRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAuditNotificationTargetConfigurations() == null ^ this.getAuditNotificationTargetConfigurations() == null)
            return false;
        if (other.getAuditNotificationTargetConfigurations() != null
                && other.getAuditNotificationTargetConfigurations().equals(this.getAuditNotificationTargetConfigurations()) == false)
            return false;
        if (other.getAuditCheckConfigurations() == null ^ this.getAuditCheckConfigurations() == null)
            return false;
        if (other.getAuditCheckConfigurations() != null && other.getAuditCheckConfigurations().equals(this.getAuditCheckConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAuditNotificationTargetConfigurations() == null) ? 0 : getAuditNotificationTargetConfigurations().hashCode());
        hashCode = prime * hashCode + ((getAuditCheckConfigurations() == null) ? 0 : getAuditCheckConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountAuditConfigurationRequest clone() {
        return (UpdateAccountAuditConfigurationRequest) super.clone();
    }

}
