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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes users of an EC2 instance providing user-based subscriptions.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/InstanceUserSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceUserSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date a user was associated with an EC2 instance.
     * </p>
     */
    private String associationDate;
    /**
     * <p>
     * The date a user was disassociated from an EC2 instance.
     * </p>
     */
    private String disassociationDate;
    /**
     * <p>
     * The domain name of the user.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     */
    private IdentityProvider identityProvider;
    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The status of a user associated with an EC2 instance.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for users of an EC2 instance.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The user name from the identity provider for the user.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The date a user was associated with an EC2 instance.
     * </p>
     * 
     * @param associationDate
     *        The date a user was associated with an EC2 instance.
     */

    public void setAssociationDate(String associationDate) {
        this.associationDate = associationDate;
    }

    /**
     * <p>
     * The date a user was associated with an EC2 instance.
     * </p>
     * 
     * @return The date a user was associated with an EC2 instance.
     */

    public String getAssociationDate() {
        return this.associationDate;
    }

    /**
     * <p>
     * The date a user was associated with an EC2 instance.
     * </p>
     * 
     * @param associationDate
     *        The date a user was associated with an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUserSummary withAssociationDate(String associationDate) {
        setAssociationDate(associationDate);
        return this;
    }

    /**
     * <p>
     * The date a user was disassociated from an EC2 instance.
     * </p>
     * 
     * @param disassociationDate
     *        The date a user was disassociated from an EC2 instance.
     */

    public void setDisassociationDate(String disassociationDate) {
        this.disassociationDate = disassociationDate;
    }

    /**
     * <p>
     * The date a user was disassociated from an EC2 instance.
     * </p>
     * 
     * @return The date a user was disassociated from an EC2 instance.
     */

    public String getDisassociationDate() {
        return this.disassociationDate;
    }

    /**
     * <p>
     * The date a user was disassociated from an EC2 instance.
     * </p>
     * 
     * @param disassociationDate
     *        The date a user was disassociated from an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUserSummary withDisassociationDate(String disassociationDate) {
        setDisassociationDate(disassociationDate);
        return this;
    }

    /**
     * <p>
     * The domain name of the user.
     * </p>
     * 
     * @param domain
     *        The domain name of the user.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain name of the user.
     * </p>
     * 
     * @return The domain name of the user.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain name of the user.
     * </p>
     * 
     * @param domain
     *        The domain name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUserSummary withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     * 
     * @param identityProvider
     *        An object that specifies details for the identity provider.
     */

    public void setIdentityProvider(IdentityProvider identityProvider) {
        this.identityProvider = identityProvider;
    }

    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     * 
     * @return An object that specifies details for the identity provider.
     */

    public IdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     * 
     * @param identityProvider
     *        An object that specifies details for the identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUserSummary withIdentityProvider(IdentityProvider identityProvider) {
        setIdentityProvider(identityProvider);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance, which provides user-based subscriptions.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     * 
     * @return The ID of the EC2 instance, which provides user-based subscriptions.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance, which provides user-based subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUserSummary withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The status of a user associated with an EC2 instance.
     * </p>
     * 
     * @param status
     *        The status of a user associated with an EC2 instance.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a user associated with an EC2 instance.
     * </p>
     * 
     * @return The status of a user associated with an EC2 instance.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a user associated with an EC2 instance.
     * </p>
     * 
     * @param status
     *        The status of a user associated with an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUserSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status message for users of an EC2 instance.
     * </p>
     * 
     * @param statusMessage
     *        The status message for users of an EC2 instance.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for users of an EC2 instance.
     * </p>
     * 
     * @return The status message for users of an EC2 instance.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for users of an EC2 instance.
     * </p>
     * 
     * @param statusMessage
     *        The status message for users of an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUserSummary withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The user name from the identity provider for the user.
     * </p>
     * 
     * @param username
     *        The user name from the identity provider for the user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name from the identity provider for the user.
     * </p>
     * 
     * @return The user name from the identity provider for the user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name from the identity provider for the user.
     * </p>
     * 
     * @param username
     *        The user name from the identity provider for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUserSummary withUsername(String username) {
        setUsername(username);
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
        if (getAssociationDate() != null)
            sb.append("AssociationDate: ").append(getAssociationDate()).append(",");
        if (getDisassociationDate() != null)
            sb.append("DisassociationDate: ").append(getDisassociationDate()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getIdentityProvider() != null)
            sb.append("IdentityProvider: ").append(getIdentityProvider()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceUserSummary == false)
            return false;
        InstanceUserSummary other = (InstanceUserSummary) obj;
        if (other.getAssociationDate() == null ^ this.getAssociationDate() == null)
            return false;
        if (other.getAssociationDate() != null && other.getAssociationDate().equals(this.getAssociationDate()) == false)
            return false;
        if (other.getDisassociationDate() == null ^ this.getDisassociationDate() == null)
            return false;
        if (other.getDisassociationDate() != null && other.getDisassociationDate().equals(this.getDisassociationDate()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getIdentityProvider() == null ^ this.getIdentityProvider() == null)
            return false;
        if (other.getIdentityProvider() != null && other.getIdentityProvider().equals(this.getIdentityProvider()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationDate() == null) ? 0 : getAssociationDate().hashCode());
        hashCode = prime * hashCode + ((getDisassociationDate() == null) ? 0 : getDisassociationDate().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getIdentityProvider() == null) ? 0 : getIdentityProvider().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public InstanceUserSummary clone() {
        try {
            return (InstanceUserSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerusersubscriptions.model.transform.InstanceUserSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
