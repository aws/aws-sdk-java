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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The service setting data structure.
 * </p>
 * <p>
 * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user interacts
 * with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based
 * on feature or service usage, then the AWS service team might create a default setting of "false". This means the user
 * can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature.
 * </p>
 * <p>
 * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for a
 * <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value if you
 * have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the <a>UpdateServiceSetting</a> API
 * action to change the default setting. Or, use the <a>ResetServiceSetting</a> to change the value back to the original
 * value defined by the AWS service team.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ServiceSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the service setting.
     * </p>
     */
    private String settingId;
    /**
     * <p>
     * The value of the service setting.
     * </p>
     */
    private String settingValue;
    /**
     * <p>
     * The last time the service setting was modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The ARN of the last modified user. This field is populated only if the setting value was overwritten.
     * </p>
     */
    private String lastModifiedUser;
    /**
     * <p>
     * The ARN of the service setting.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The status of the service setting. The value can be Default, Customized or PendingUpdate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Default: The current setting uses a default value provisioned by the AWS service team.
     * </p>
     * </li>
     * <li>
     * <p>
     * Customized: The current setting use a custom value specified by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending
     * approval.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The ID of the service setting.
     * </p>
     * 
     * @param settingId
     *        The ID of the service setting.
     */

    public void setSettingId(String settingId) {
        this.settingId = settingId;
    }

    /**
     * <p>
     * The ID of the service setting.
     * </p>
     * 
     * @return The ID of the service setting.
     */

    public String getSettingId() {
        return this.settingId;
    }

    /**
     * <p>
     * The ID of the service setting.
     * </p>
     * 
     * @param settingId
     *        The ID of the service setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSetting withSettingId(String settingId) {
        setSettingId(settingId);
        return this;
    }

    /**
     * <p>
     * The value of the service setting.
     * </p>
     * 
     * @param settingValue
     *        The value of the service setting.
     */

    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }

    /**
     * <p>
     * The value of the service setting.
     * </p>
     * 
     * @return The value of the service setting.
     */

    public String getSettingValue() {
        return this.settingValue;
    }

    /**
     * <p>
     * The value of the service setting.
     * </p>
     * 
     * @param settingValue
     *        The value of the service setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSetting withSettingValue(String settingValue) {
        setSettingValue(settingValue);
        return this;
    }

    /**
     * <p>
     * The last time the service setting was modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time the service setting was modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last time the service setting was modified.
     * </p>
     * 
     * @return The last time the service setting was modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last time the service setting was modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time the service setting was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSetting withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The ARN of the last modified user. This field is populated only if the setting value was overwritten.
     * </p>
     * 
     * @param lastModifiedUser
     *        The ARN of the last modified user. This field is populated only if the setting value was overwritten.
     */

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>
     * The ARN of the last modified user. This field is populated only if the setting value was overwritten.
     * </p>
     * 
     * @return The ARN of the last modified user. This field is populated only if the setting value was overwritten.
     */

    public String getLastModifiedUser() {
        return this.lastModifiedUser;
    }

    /**
     * <p>
     * The ARN of the last modified user. This field is populated only if the setting value was overwritten.
     * </p>
     * 
     * @param lastModifiedUser
     *        The ARN of the last modified user. This field is populated only if the setting value was overwritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSetting withLastModifiedUser(String lastModifiedUser) {
        setLastModifiedUser(lastModifiedUser);
        return this;
    }

    /**
     * <p>
     * The ARN of the service setting.
     * </p>
     * 
     * @param aRN
     *        The ARN of the service setting.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the service setting.
     * </p>
     * 
     * @return The ARN of the service setting.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the service setting.
     * </p>
     * 
     * @param aRN
     *        The ARN of the service setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSetting withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The status of the service setting. The value can be Default, Customized or PendingUpdate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Default: The current setting uses a default value provisioned by the AWS service team.
     * </p>
     * </li>
     * <li>
     * <p>
     * Customized: The current setting use a custom value specified by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending
     * approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the service setting. The value can be Default, Customized or PendingUpdate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Default: The current setting uses a default value provisioned by the AWS service team.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Customized: The current setting use a custom value specified by the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending
     *        approval.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service setting. The value can be Default, Customized or PendingUpdate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Default: The current setting uses a default value provisioned by the AWS service team.
     * </p>
     * </li>
     * <li>
     * <p>
     * Customized: The current setting use a custom value specified by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending
     * approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the service setting. The value can be Default, Customized or PendingUpdate.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Default: The current setting uses a default value provisioned by the AWS service team.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Customized: The current setting use a custom value specified by the customer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PendingUpdate: The current setting uses a default or custom value, but a setting change request is
     *         pending approval.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service setting. The value can be Default, Customized or PendingUpdate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Default: The current setting uses a default value provisioned by the AWS service team.
     * </p>
     * </li>
     * <li>
     * <p>
     * Customized: The current setting use a custom value specified by the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending
     * approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the service setting. The value can be Default, Customized or PendingUpdate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Default: The current setting uses a default value provisioned by the AWS service team.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Customized: The current setting use a custom value specified by the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending
     *        approval.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSetting withStatus(String status) {
        setStatus(status);
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
        if (getSettingId() != null)
            sb.append("SettingId: ").append(getSettingId()).append(",");
        if (getSettingValue() != null)
            sb.append("SettingValue: ").append(getSettingValue()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLastModifiedUser() != null)
            sb.append("LastModifiedUser: ").append(getLastModifiedUser()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSetting == false)
            return false;
        ServiceSetting other = (ServiceSetting) obj;
        if (other.getSettingId() == null ^ this.getSettingId() == null)
            return false;
        if (other.getSettingId() != null && other.getSettingId().equals(this.getSettingId()) == false)
            return false;
        if (other.getSettingValue() == null ^ this.getSettingValue() == null)
            return false;
        if (other.getSettingValue() != null && other.getSettingValue().equals(this.getSettingValue()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLastModifiedUser() == null ^ this.getLastModifiedUser() == null)
            return false;
        if (other.getLastModifiedUser() != null && other.getLastModifiedUser().equals(this.getLastModifiedUser()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSettingId() == null) ? 0 : getSettingId().hashCode());
        hashCode = prime * hashCode + ((getSettingValue() == null) ? 0 : getSettingValue().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ServiceSetting clone() {
        try {
            return (ServiceSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ServiceSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
