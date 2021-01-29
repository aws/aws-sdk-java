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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The idempotency token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     */
    private String identityManagementType;
    /**
     * <p>
     * The name for your instance.
     * </p>
     */
    private String instanceAlias;
    /**
     * <p>
     * The identifier for the directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     */
    private Boolean inboundCallsEnabled;
    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     */
    private Boolean outboundCallsEnabled;

    /**
     * <p>
     * The idempotency token.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token.
     * </p>
     * 
     * @return The idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * 
     * @param identityManagementType
     *        The type of identity management for your Amazon Connect users.
     * @see DirectoryType
     */

    public void setIdentityManagementType(String identityManagementType) {
        this.identityManagementType = identityManagementType;
    }

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * 
     * @return The type of identity management for your Amazon Connect users.
     * @see DirectoryType
     */

    public String getIdentityManagementType() {
        return this.identityManagementType;
    }

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * 
     * @param identityManagementType
     *        The type of identity management for your Amazon Connect users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryType
     */

    public CreateInstanceRequest withIdentityManagementType(String identityManagementType) {
        setIdentityManagementType(identityManagementType);
        return this;
    }

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * 
     * @param identityManagementType
     *        The type of identity management for your Amazon Connect users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryType
     */

    public CreateInstanceRequest withIdentityManagementType(DirectoryType identityManagementType) {
        this.identityManagementType = identityManagementType.toString();
        return this;
    }

    /**
     * <p>
     * The name for your instance.
     * </p>
     * 
     * @param instanceAlias
     *        The name for your instance.
     */

    public void setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
    }

    /**
     * <p>
     * The name for your instance.
     * </p>
     * 
     * @return The name for your instance.
     */

    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    /**
     * <p>
     * The name for your instance.
     * </p>
     * 
     * @param instanceAlias
     *        The name for your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withInstanceAlias(String instanceAlias) {
        setInstanceAlias(instanceAlias);
        return this;
    }

    /**
     * <p>
     * The identifier for the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier for the directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier for the directory.
     * </p>
     * 
     * @return The identifier for the directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier for the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier for the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     * 
     * @param inboundCallsEnabled
     *        Your contact center handles incoming contacts.
     */

    public void setInboundCallsEnabled(Boolean inboundCallsEnabled) {
        this.inboundCallsEnabled = inboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     * 
     * @return Your contact center handles incoming contacts.
     */

    public Boolean getInboundCallsEnabled() {
        return this.inboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     * 
     * @param inboundCallsEnabled
     *        Your contact center handles incoming contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withInboundCallsEnabled(Boolean inboundCallsEnabled) {
        setInboundCallsEnabled(inboundCallsEnabled);
        return this;
    }

    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     * 
     * @return Your contact center handles incoming contacts.
     */

    public Boolean isInboundCallsEnabled() {
        return this.inboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     * 
     * @param outboundCallsEnabled
     *        Your contact center allows outbound calls.
     */

    public void setOutboundCallsEnabled(Boolean outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     * 
     * @return Your contact center allows outbound calls.
     */

    public Boolean getOutboundCallsEnabled() {
        return this.outboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     * 
     * @param outboundCallsEnabled
     *        Your contact center allows outbound calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withOutboundCallsEnabled(Boolean outboundCallsEnabled) {
        setOutboundCallsEnabled(outboundCallsEnabled);
        return this;
    }

    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     * 
     * @return Your contact center allows outbound calls.
     */

    public Boolean isOutboundCallsEnabled() {
        return this.outboundCallsEnabled;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getIdentityManagementType() != null)
            sb.append("IdentityManagementType: ").append(getIdentityManagementType()).append(",");
        if (getInstanceAlias() != null)
            sb.append("InstanceAlias: ").append("***Sensitive Data Redacted***").append(",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getInboundCallsEnabled() != null)
            sb.append("InboundCallsEnabled: ").append(getInboundCallsEnabled()).append(",");
        if (getOutboundCallsEnabled() != null)
            sb.append("OutboundCallsEnabled: ").append(getOutboundCallsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceRequest == false)
            return false;
        CreateInstanceRequest other = (CreateInstanceRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getIdentityManagementType() == null ^ this.getIdentityManagementType() == null)
            return false;
        if (other.getIdentityManagementType() != null && other.getIdentityManagementType().equals(this.getIdentityManagementType()) == false)
            return false;
        if (other.getInstanceAlias() == null ^ this.getInstanceAlias() == null)
            return false;
        if (other.getInstanceAlias() != null && other.getInstanceAlias().equals(this.getInstanceAlias()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getInboundCallsEnabled() == null ^ this.getInboundCallsEnabled() == null)
            return false;
        if (other.getInboundCallsEnabled() != null && other.getInboundCallsEnabled().equals(this.getInboundCallsEnabled()) == false)
            return false;
        if (other.getOutboundCallsEnabled() == null ^ this.getOutboundCallsEnabled() == null)
            return false;
        if (other.getOutboundCallsEnabled() != null && other.getOutboundCallsEnabled().equals(this.getOutboundCallsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getIdentityManagementType() == null) ? 0 : getIdentityManagementType().hashCode());
        hashCode = prime * hashCode + ((getInstanceAlias() == null) ? 0 : getInstanceAlias().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getInboundCallsEnabled() == null) ? 0 : getInboundCallsEnabled().hashCode());
        hashCode = prime * hashCode + ((getOutboundCallsEnabled() == null) ? 0 : getOutboundCallsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstanceRequest clone() {
        return (CreateInstanceRequest) super.clone();
    }

}
