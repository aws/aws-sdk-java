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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetAccessControlEffect" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessControlEffectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The IPv4 address.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The access protocol action. Valid values include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     * <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The user ID.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The identifier for the organization.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization.
     * </p>
     * 
     * @return The identifier for the organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier for the organization.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessControlEffectRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address.
     * </p>
     * 
     * @param ipAddress
     *        The IPv4 address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IPv4 address.
     * </p>
     * 
     * @return The IPv4 address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IPv4 address.
     * </p>
     * 
     * @param ipAddress
     *        The IPv4 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessControlEffectRequest withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The access protocol action. Valid values include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     * <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * </p>
     * 
     * @param action
     *        The access protocol action. Valid values include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *        <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     *        <code>WebMail</code>.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The access protocol action. Valid values include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     * <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * </p>
     * 
     * @return The access protocol action. Valid values include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *         <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     *         <code>WebMail</code>.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The access protocol action. Valid values include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     * <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * </p>
     * 
     * @param action
     *        The access protocol action. Valid values include <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *        <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>, <code>WindowsOutlook</code>, and
     *        <code>WebMail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessControlEffectRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @return The user ID.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessControlEffectRequest withUserId(String userId) {
        setUserId(userId);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessControlEffectRequest == false)
            return false;
        GetAccessControlEffectRequest other = (GetAccessControlEffectRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessControlEffectRequest clone() {
        return (GetAccessControlEffectRequest) super.clone();
    }

}
