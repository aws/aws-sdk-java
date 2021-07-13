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
 * The request body of the GetServiceSetting API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetServiceSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceSettingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the service setting to get. The setting ID can be one of the following.
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
     * The ID of the service setting to get. The setting ID can be one of the following.
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
     *        The ID of the service setting to get. The setting ID can be one of the following.</p>
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
     * The ID of the service setting to get. The setting ID can be one of the following.
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
     * @return The ID of the service setting to get. The setting ID can be one of the following.</p>
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
     * The ID of the service setting to get. The setting ID can be one of the following.
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
     *        The ID of the service setting to get. The setting ID can be one of the following.</p>
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

    public GetServiceSettingRequest withSettingId(String settingId) {
        setSettingId(settingId);
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
            sb.append("SettingId: ").append(getSettingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceSettingRequest == false)
            return false;
        GetServiceSettingRequest other = (GetServiceSettingRequest) obj;
        if (other.getSettingId() == null ^ this.getSettingId() == null)
            return false;
        if (other.getSettingId() != null && other.getSettingId().equals(this.getSettingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSettingId() == null) ? 0 : getSettingId().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceSettingRequest clone() {
        return (GetServiceSettingRequest) super.clone();
    }

}
