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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the specified configurable setting for a directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/SettingEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SettingEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of directory setting. For example, <code>Protocol</code> or <code>Cipher</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the directory setting. For example:
     * </p>
     * <p>
     * <code>TLS_1_0</code>
     * </p>
     */
    private String name;
    /**
     * <p>
     * The valid range of values for the directory setting.
     * </p>
     */
    private String allowedValues;
    /**
     * <p>
     * The value of the directory setting that is applied to the directory.
     * </p>
     */
    private String appliedValue;
    /**
     * <p>
     * The value that was last requested for the directory setting.
     * </p>
     */
    private String requestedValue;
    /**
     * <p>
     * The overall status of the request to update the directory setting request. If the directory setting is deployed
     * in more than one region, and the request fails in any region, the overall status is <code>Failed</code>.
     * </p>
     */
    private String requestStatus;
    /**
     * <p>
     * Details about the status of the request to update the directory setting. If the directory setting is deployed in
     * more than one region, status is returned for the request in each region where the setting is deployed.
     * </p>
     */
    private java.util.Map<String, String> requestDetailedStatus;
    /**
     * <p>
     * The last status message for the directory status request.
     * </p>
     */
    private String requestStatusMessage;
    /**
     * <p>
     * The date and time when the directory setting was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The date and time when the request to update a directory setting was last submitted.
     * </p>
     */
    private java.util.Date lastRequestedDateTime;

    /**
     * <p>
     * The type of directory setting. For example, <code>Protocol</code> or <code>Cipher</code>.
     * </p>
     * 
     * @param type
     *        The type of directory setting. For example, <code>Protocol</code> or <code>Cipher</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of directory setting. For example, <code>Protocol</code> or <code>Cipher</code>.
     * </p>
     * 
     * @return The type of directory setting. For example, <code>Protocol</code> or <code>Cipher</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of directory setting. For example, <code>Protocol</code> or <code>Cipher</code>.
     * </p>
     * 
     * @param type
     *        The type of directory setting. For example, <code>Protocol</code> or <code>Cipher</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The name of the directory setting. For example:
     * </p>
     * <p>
     * <code>TLS_1_0</code>
     * </p>
     * 
     * @param name
     *        The name of the directory setting. For example:</p>
     *        <p>
     *        <code>TLS_1_0</code>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the directory setting. For example:
     * </p>
     * <p>
     * <code>TLS_1_0</code>
     * </p>
     * 
     * @return The name of the directory setting. For example:</p>
     *         <p>
     *         <code>TLS_1_0</code>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the directory setting. For example:
     * </p>
     * <p>
     * <code>TLS_1_0</code>
     * </p>
     * 
     * @param name
     *        The name of the directory setting. For example:</p>
     *        <p>
     *        <code>TLS_1_0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The valid range of values for the directory setting.
     * </p>
     * 
     * @param allowedValues
     *        The valid range of values for the directory setting.
     */

    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the directory setting.
     * </p>
     * 
     * @return The valid range of values for the directory setting.
     */

    public String getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the directory setting.
     * </p>
     * 
     * @param allowedValues
     *        The valid range of values for the directory setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry withAllowedValues(String allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * The value of the directory setting that is applied to the directory.
     * </p>
     * 
     * @param appliedValue
     *        The value of the directory setting that is applied to the directory.
     */

    public void setAppliedValue(String appliedValue) {
        this.appliedValue = appliedValue;
    }

    /**
     * <p>
     * The value of the directory setting that is applied to the directory.
     * </p>
     * 
     * @return The value of the directory setting that is applied to the directory.
     */

    public String getAppliedValue() {
        return this.appliedValue;
    }

    /**
     * <p>
     * The value of the directory setting that is applied to the directory.
     * </p>
     * 
     * @param appliedValue
     *        The value of the directory setting that is applied to the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry withAppliedValue(String appliedValue) {
        setAppliedValue(appliedValue);
        return this;
    }

    /**
     * <p>
     * The value that was last requested for the directory setting.
     * </p>
     * 
     * @param requestedValue
     *        The value that was last requested for the directory setting.
     */

    public void setRequestedValue(String requestedValue) {
        this.requestedValue = requestedValue;
    }

    /**
     * <p>
     * The value that was last requested for the directory setting.
     * </p>
     * 
     * @return The value that was last requested for the directory setting.
     */

    public String getRequestedValue() {
        return this.requestedValue;
    }

    /**
     * <p>
     * The value that was last requested for the directory setting.
     * </p>
     * 
     * @param requestedValue
     *        The value that was last requested for the directory setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry withRequestedValue(String requestedValue) {
        setRequestedValue(requestedValue);
        return this;
    }

    /**
     * <p>
     * The overall status of the request to update the directory setting request. If the directory setting is deployed
     * in more than one region, and the request fails in any region, the overall status is <code>Failed</code>.
     * </p>
     * 
     * @param requestStatus
     *        The overall status of the request to update the directory setting request. If the directory setting is
     *        deployed in more than one region, and the request fails in any region, the overall status is
     *        <code>Failed</code>.
     * @see DirectoryConfigurationStatus
     */

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    /**
     * <p>
     * The overall status of the request to update the directory setting request. If the directory setting is deployed
     * in more than one region, and the request fails in any region, the overall status is <code>Failed</code>.
     * </p>
     * 
     * @return The overall status of the request to update the directory setting request. If the directory setting is
     *         deployed in more than one region, and the request fails in any region, the overall status is
     *         <code>Failed</code>.
     * @see DirectoryConfigurationStatus
     */

    public String getRequestStatus() {
        return this.requestStatus;
    }

    /**
     * <p>
     * The overall status of the request to update the directory setting request. If the directory setting is deployed
     * in more than one region, and the request fails in any region, the overall status is <code>Failed</code>.
     * </p>
     * 
     * @param requestStatus
     *        The overall status of the request to update the directory setting request. If the directory setting is
     *        deployed in more than one region, and the request fails in any region, the overall status is
     *        <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryConfigurationStatus
     */

    public SettingEntry withRequestStatus(String requestStatus) {
        setRequestStatus(requestStatus);
        return this;
    }

    /**
     * <p>
     * The overall status of the request to update the directory setting request. If the directory setting is deployed
     * in more than one region, and the request fails in any region, the overall status is <code>Failed</code>.
     * </p>
     * 
     * @param requestStatus
     *        The overall status of the request to update the directory setting request. If the directory setting is
     *        deployed in more than one region, and the request fails in any region, the overall status is
     *        <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryConfigurationStatus
     */

    public SettingEntry withRequestStatus(DirectoryConfigurationStatus requestStatus) {
        this.requestStatus = requestStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details about the status of the request to update the directory setting. If the directory setting is deployed in
     * more than one region, status is returned for the request in each region where the setting is deployed.
     * </p>
     * 
     * @return Details about the status of the request to update the directory setting. If the directory setting is
     *         deployed in more than one region, status is returned for the request in each region where the setting is
     *         deployed.
     */

    public java.util.Map<String, String> getRequestDetailedStatus() {
        return requestDetailedStatus;
    }

    /**
     * <p>
     * Details about the status of the request to update the directory setting. If the directory setting is deployed in
     * more than one region, status is returned for the request in each region where the setting is deployed.
     * </p>
     * 
     * @param requestDetailedStatus
     *        Details about the status of the request to update the directory setting. If the directory setting is
     *        deployed in more than one region, status is returned for the request in each region where the setting is
     *        deployed.
     */

    public void setRequestDetailedStatus(java.util.Map<String, String> requestDetailedStatus) {
        this.requestDetailedStatus = requestDetailedStatus;
    }

    /**
     * <p>
     * Details about the status of the request to update the directory setting. If the directory setting is deployed in
     * more than one region, status is returned for the request in each region where the setting is deployed.
     * </p>
     * 
     * @param requestDetailedStatus
     *        Details about the status of the request to update the directory setting. If the directory setting is
     *        deployed in more than one region, status is returned for the request in each region where the setting is
     *        deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry withRequestDetailedStatus(java.util.Map<String, String> requestDetailedStatus) {
        setRequestDetailedStatus(requestDetailedStatus);
        return this;
    }

    /**
     * Add a single RequestDetailedStatus entry
     *
     * @see SettingEntry#withRequestDetailedStatus
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry addRequestDetailedStatusEntry(String key, String value) {
        if (null == this.requestDetailedStatus) {
            this.requestDetailedStatus = new java.util.HashMap<String, String>();
        }
        if (this.requestDetailedStatus.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestDetailedStatus.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestDetailedStatus.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry clearRequestDetailedStatusEntries() {
        this.requestDetailedStatus = null;
        return this;
    }

    /**
     * <p>
     * The last status message for the directory status request.
     * </p>
     * 
     * @param requestStatusMessage
     *        The last status message for the directory status request.
     */

    public void setRequestStatusMessage(String requestStatusMessage) {
        this.requestStatusMessage = requestStatusMessage;
    }

    /**
     * <p>
     * The last status message for the directory status request.
     * </p>
     * 
     * @return The last status message for the directory status request.
     */

    public String getRequestStatusMessage() {
        return this.requestStatusMessage;
    }

    /**
     * <p>
     * The last status message for the directory status request.
     * </p>
     * 
     * @param requestStatusMessage
     *        The last status message for the directory status request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry withRequestStatusMessage(String requestStatusMessage) {
        setRequestStatusMessage(requestStatusMessage);
        return this;
    }

    /**
     * <p>
     * The date and time when the directory setting was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time when the directory setting was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time when the directory setting was last updated.
     * </p>
     * 
     * @return The date and time when the directory setting was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time when the directory setting was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time when the directory setting was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the request to update a directory setting was last submitted.
     * </p>
     * 
     * @param lastRequestedDateTime
     *        The date and time when the request to update a directory setting was last submitted.
     */

    public void setLastRequestedDateTime(java.util.Date lastRequestedDateTime) {
        this.lastRequestedDateTime = lastRequestedDateTime;
    }

    /**
     * <p>
     * The date and time when the request to update a directory setting was last submitted.
     * </p>
     * 
     * @return The date and time when the request to update a directory setting was last submitted.
     */

    public java.util.Date getLastRequestedDateTime() {
        return this.lastRequestedDateTime;
    }

    /**
     * <p>
     * The date and time when the request to update a directory setting was last submitted.
     * </p>
     * 
     * @param lastRequestedDateTime
     *        The date and time when the request to update a directory setting was last submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SettingEntry withLastRequestedDateTime(java.util.Date lastRequestedDateTime) {
        setLastRequestedDateTime(lastRequestedDateTime);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getAppliedValue() != null)
            sb.append("AppliedValue: ").append(getAppliedValue()).append(",");
        if (getRequestedValue() != null)
            sb.append("RequestedValue: ").append(getRequestedValue()).append(",");
        if (getRequestStatus() != null)
            sb.append("RequestStatus: ").append(getRequestStatus()).append(",");
        if (getRequestDetailedStatus() != null)
            sb.append("RequestDetailedStatus: ").append(getRequestDetailedStatus()).append(",");
        if (getRequestStatusMessage() != null)
            sb.append("RequestStatusMessage: ").append(getRequestStatusMessage()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getLastRequestedDateTime() != null)
            sb.append("LastRequestedDateTime: ").append(getLastRequestedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SettingEntry == false)
            return false;
        SettingEntry other = (SettingEntry) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getAppliedValue() == null ^ this.getAppliedValue() == null)
            return false;
        if (other.getAppliedValue() != null && other.getAppliedValue().equals(this.getAppliedValue()) == false)
            return false;
        if (other.getRequestedValue() == null ^ this.getRequestedValue() == null)
            return false;
        if (other.getRequestedValue() != null && other.getRequestedValue().equals(this.getRequestedValue()) == false)
            return false;
        if (other.getRequestStatus() == null ^ this.getRequestStatus() == null)
            return false;
        if (other.getRequestStatus() != null && other.getRequestStatus().equals(this.getRequestStatus()) == false)
            return false;
        if (other.getRequestDetailedStatus() == null ^ this.getRequestDetailedStatus() == null)
            return false;
        if (other.getRequestDetailedStatus() != null && other.getRequestDetailedStatus().equals(this.getRequestDetailedStatus()) == false)
            return false;
        if (other.getRequestStatusMessage() == null ^ this.getRequestStatusMessage() == null)
            return false;
        if (other.getRequestStatusMessage() != null && other.getRequestStatusMessage().equals(this.getRequestStatusMessage()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getLastRequestedDateTime() == null ^ this.getLastRequestedDateTime() == null)
            return false;
        if (other.getLastRequestedDateTime() != null && other.getLastRequestedDateTime().equals(this.getLastRequestedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getAppliedValue() == null) ? 0 : getAppliedValue().hashCode());
        hashCode = prime * hashCode + ((getRequestedValue() == null) ? 0 : getRequestedValue().hashCode());
        hashCode = prime * hashCode + ((getRequestStatus() == null) ? 0 : getRequestStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestDetailedStatus() == null) ? 0 : getRequestDetailedStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestStatusMessage() == null) ? 0 : getRequestStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastRequestedDateTime() == null) ? 0 : getLastRequestedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public SettingEntry clone() {
        try {
            return (SettingEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.SettingEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
