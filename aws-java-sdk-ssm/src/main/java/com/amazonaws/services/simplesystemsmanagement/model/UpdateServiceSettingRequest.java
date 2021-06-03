/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body of the UpdateServiceSetting API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateServiceSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceSettingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service setting to reset. For example,
     * <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>. The
     * setting ID can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/ssm/automation/customer-script-log-destination</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/automation/customer-script-log-group-name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/documents/console/public-sharing-permission</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/parameter-store/default-parameter-tier</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/parameter-store/high-throughput-enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/managed-instance/activation-tier</code>
     * </p>
     * </li>
     * </ul>
     */
    private String settingId;
    /**
     * <p>
     * The new value to specify for the service setting. For the
     * <code>/ssm/parameter-store/default-parameter-tier</code> setting ID, the setting value can be one of the
     * following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Standard
     * </p>
     * </li>
     * <li>
     * <p>
     * Advanced
     * </p>
     * </li>
     * <li>
     * <p>
     * Intelligent-Tiering
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the <code>/ssm/parameter-store/high-throughput-enabled</code>, and
     * <code>/ssm/managed-instance/activation-tier</code> setting IDs, the setting value can be true or false.
     * </p>
     * <p>
     * For the <code>/ssm/automation/customer-script-log-destination</code> setting ID, the setting value can be
     * CloudWatch.
     * </p>
     * <p>
     * For the <code>/ssm/automation/customer-script-log-group-name</code> setting ID, the setting value can be the name
     * of a CloudWatch Logs log group.
     * </p>
     * <p>
     * For the <code>/ssm/documents/console/public-sharing-permission</code> setting ID, the setting value can be Enable
     * or Disable.
     * </p>
     */
    private String settingValue;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service setting to reset. For example,
     * <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>. The
     * setting ID can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/ssm/automation/customer-script-log-destination</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/automation/customer-script-log-group-name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/documents/console/public-sharing-permission</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/parameter-store/default-parameter-tier</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/parameter-store/high-throughput-enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/managed-instance/activation-tier</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param settingId
     *        The Amazon Resource Name (ARN) of the service setting to reset. For example,
     *        <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     *        . The setting ID can be one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>/ssm/automation/customer-script-log-destination</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/automation/customer-script-log-group-name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/documents/console/public-sharing-permission</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/parameter-store/default-parameter-tier</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/parameter-store/high-throughput-enabled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/managed-instance/activation-tier</code>
     *        </p>
     *        </li>
     */

    public void setSettingId(String settingId) {
        this.settingId = settingId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service setting to reset. For example,
     * <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>. The
     * setting ID can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/ssm/automation/customer-script-log-destination</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/automation/customer-script-log-group-name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/documents/console/public-sharing-permission</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/parameter-store/default-parameter-tier</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/parameter-store/high-throughput-enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/managed-instance/activation-tier</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the service setting to reset. For example,
     *         <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     *         . The setting ID can be one of the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>/ssm/automation/customer-script-log-destination</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/ssm/automation/customer-script-log-group-name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/ssm/documents/console/public-sharing-permission</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/ssm/parameter-store/default-parameter-tier</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/ssm/parameter-store/high-throughput-enabled</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/ssm/managed-instance/activation-tier</code>
     *         </p>
     *         </li>
     */

    public String getSettingId() {
        return this.settingId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service setting to reset. For example,
     * <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>. The
     * setting ID can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/ssm/automation/customer-script-log-destination</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/automation/customer-script-log-group-name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/documents/console/public-sharing-permission</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/parameter-store/default-parameter-tier</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/parameter-store/high-throughput-enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/ssm/managed-instance/activation-tier</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param settingId
     *        The Amazon Resource Name (ARN) of the service setting to reset. For example,
     *        <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     *        . The setting ID can be one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>/ssm/automation/customer-script-log-destination</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/automation/customer-script-log-group-name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/documents/console/public-sharing-permission</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/parameter-store/default-parameter-tier</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/parameter-store/high-throughput-enabled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/ssm/managed-instance/activation-tier</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSettingRequest withSettingId(String settingId) {
        setSettingId(settingId);
        return this;
    }

    /**
     * <p>
     * The new value to specify for the service setting. For the
     * <code>/ssm/parameter-store/default-parameter-tier</code> setting ID, the setting value can be one of the
     * following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Standard
     * </p>
     * </li>
     * <li>
     * <p>
     * Advanced
     * </p>
     * </li>
     * <li>
     * <p>
     * Intelligent-Tiering
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the <code>/ssm/parameter-store/high-throughput-enabled</code>, and
     * <code>/ssm/managed-instance/activation-tier</code> setting IDs, the setting value can be true or false.
     * </p>
     * <p>
     * For the <code>/ssm/automation/customer-script-log-destination</code> setting ID, the setting value can be
     * CloudWatch.
     * </p>
     * <p>
     * For the <code>/ssm/automation/customer-script-log-group-name</code> setting ID, the setting value can be the name
     * of a CloudWatch Logs log group.
     * </p>
     * <p>
     * For the <code>/ssm/documents/console/public-sharing-permission</code> setting ID, the setting value can be Enable
     * or Disable.
     * </p>
     * 
     * @param settingValue
     *        The new value to specify for the service setting. For the
     *        <code>/ssm/parameter-store/default-parameter-tier</code> setting ID, the setting value can be one of the
     *        following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Standard
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Advanced
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Intelligent-Tiering
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the <code>/ssm/parameter-store/high-throughput-enabled</code>, and
     *        <code>/ssm/managed-instance/activation-tier</code> setting IDs, the setting value can be true or false.
     *        </p>
     *        <p>
     *        For the <code>/ssm/automation/customer-script-log-destination</code> setting ID, the setting value can be
     *        CloudWatch.
     *        </p>
     *        <p>
     *        For the <code>/ssm/automation/customer-script-log-group-name</code> setting ID, the setting value can be
     *        the name of a CloudWatch Logs log group.
     *        </p>
     *        <p>
     *        For the <code>/ssm/documents/console/public-sharing-permission</code> setting ID, the setting value can be
     *        Enable or Disable.
     */

    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }

    /**
     * <p>
     * The new value to specify for the service setting. For the
     * <code>/ssm/parameter-store/default-parameter-tier</code> setting ID, the setting value can be one of the
     * following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Standard
     * </p>
     * </li>
     * <li>
     * <p>
     * Advanced
     * </p>
     * </li>
     * <li>
     * <p>
     * Intelligent-Tiering
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the <code>/ssm/parameter-store/high-throughput-enabled</code>, and
     * <code>/ssm/managed-instance/activation-tier</code> setting IDs, the setting value can be true or false.
     * </p>
     * <p>
     * For the <code>/ssm/automation/customer-script-log-destination</code> setting ID, the setting value can be
     * CloudWatch.
     * </p>
     * <p>
     * For the <code>/ssm/automation/customer-script-log-group-name</code> setting ID, the setting value can be the name
     * of a CloudWatch Logs log group.
     * </p>
     * <p>
     * For the <code>/ssm/documents/console/public-sharing-permission</code> setting ID, the setting value can be Enable
     * or Disable.
     * </p>
     * 
     * @return The new value to specify for the service setting. For the
     *         <code>/ssm/parameter-store/default-parameter-tier</code> setting ID, the setting value can be one of the
     *         following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Standard
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Advanced
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Intelligent-Tiering
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For the <code>/ssm/parameter-store/high-throughput-enabled</code>, and
     *         <code>/ssm/managed-instance/activation-tier</code> setting IDs, the setting value can be true or false.
     *         </p>
     *         <p>
     *         For the <code>/ssm/automation/customer-script-log-destination</code> setting ID, the setting value can be
     *         CloudWatch.
     *         </p>
     *         <p>
     *         For the <code>/ssm/automation/customer-script-log-group-name</code> setting ID, the setting value can be
     *         the name of a CloudWatch Logs log group.
     *         </p>
     *         <p>
     *         For the <code>/ssm/documents/console/public-sharing-permission</code> setting ID, the setting value can
     *         be Enable or Disable.
     */

    public String getSettingValue() {
        return this.settingValue;
    }

    /**
     * <p>
     * The new value to specify for the service setting. For the
     * <code>/ssm/parameter-store/default-parameter-tier</code> setting ID, the setting value can be one of the
     * following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Standard
     * </p>
     * </li>
     * <li>
     * <p>
     * Advanced
     * </p>
     * </li>
     * <li>
     * <p>
     * Intelligent-Tiering
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the <code>/ssm/parameter-store/high-throughput-enabled</code>, and
     * <code>/ssm/managed-instance/activation-tier</code> setting IDs, the setting value can be true or false.
     * </p>
     * <p>
     * For the <code>/ssm/automation/customer-script-log-destination</code> setting ID, the setting value can be
     * CloudWatch.
     * </p>
     * <p>
     * For the <code>/ssm/automation/customer-script-log-group-name</code> setting ID, the setting value can be the name
     * of a CloudWatch Logs log group.
     * </p>
     * <p>
     * For the <code>/ssm/documents/console/public-sharing-permission</code> setting ID, the setting value can be Enable
     * or Disable.
     * </p>
     * 
     * @param settingValue
     *        The new value to specify for the service setting. For the
     *        <code>/ssm/parameter-store/default-parameter-tier</code> setting ID, the setting value can be one of the
     *        following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Standard
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Advanced
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Intelligent-Tiering
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the <code>/ssm/parameter-store/high-throughput-enabled</code>, and
     *        <code>/ssm/managed-instance/activation-tier</code> setting IDs, the setting value can be true or false.
     *        </p>
     *        <p>
     *        For the <code>/ssm/automation/customer-script-log-destination</code> setting ID, the setting value can be
     *        CloudWatch.
     *        </p>
     *        <p>
     *        For the <code>/ssm/automation/customer-script-log-group-name</code> setting ID, the setting value can be
     *        the name of a CloudWatch Logs log group.
     *        </p>
     *        <p>
     *        For the <code>/ssm/documents/console/public-sharing-permission</code> setting ID, the setting value can be
     *        Enable or Disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSettingRequest withSettingValue(String settingValue) {
        setSettingValue(settingValue);
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
            sb.append("SettingValue: ").append(getSettingValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceSettingRequest == false)
            return false;
        UpdateServiceSettingRequest other = (UpdateServiceSettingRequest) obj;
        if (other.getSettingId() == null ^ this.getSettingId() == null)
            return false;
        if (other.getSettingId() != null && other.getSettingId().equals(this.getSettingId()) == false)
            return false;
        if (other.getSettingValue() == null ^ this.getSettingValue() == null)
            return false;
        if (other.getSettingValue() != null && other.getSettingValue().equals(this.getSettingValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSettingId() == null) ? 0 : getSettingId().hashCode());
        hashCode = prime * hashCode + ((getSettingValue() == null) ? 0 : getSettingValue().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceSettingRequest clone() {
        return (UpdateServiceSettingRequest) super.clone();
    }

}
