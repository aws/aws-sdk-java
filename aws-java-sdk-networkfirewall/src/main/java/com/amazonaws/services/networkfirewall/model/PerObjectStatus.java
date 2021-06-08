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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration status for a single policy or rule group that is used for a firewall endpoint. Network
 * Firewall provides each endpoint with the rules that are configured in the firewall policy. Each time you add a subnet
 * or modify the associated firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can properly
 * filter network traffic. This is part of a <a>SyncState</a> for a firewall.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/PerObjectStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerObjectStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether this object is in sync with the version indicated in the update token.
     * </p>
     */
    private String syncStatus;
    /**
     * <p>
     * The current version of the object that is either in sync or pending synchronization.
     * </p>
     */
    private String updateToken;

    /**
     * <p>
     * Indicates whether this object is in sync with the version indicated in the update token.
     * </p>
     * 
     * @param syncStatus
     *        Indicates whether this object is in sync with the version indicated in the update token.
     * @see PerObjectSyncStatus
     */

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    /**
     * <p>
     * Indicates whether this object is in sync with the version indicated in the update token.
     * </p>
     * 
     * @return Indicates whether this object is in sync with the version indicated in the update token.
     * @see PerObjectSyncStatus
     */

    public String getSyncStatus() {
        return this.syncStatus;
    }

    /**
     * <p>
     * Indicates whether this object is in sync with the version indicated in the update token.
     * </p>
     * 
     * @param syncStatus
     *        Indicates whether this object is in sync with the version indicated in the update token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerObjectSyncStatus
     */

    public PerObjectStatus withSyncStatus(String syncStatus) {
        setSyncStatus(syncStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether this object is in sync with the version indicated in the update token.
     * </p>
     * 
     * @param syncStatus
     *        Indicates whether this object is in sync with the version indicated in the update token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerObjectSyncStatus
     */

    public PerObjectStatus withSyncStatus(PerObjectSyncStatus syncStatus) {
        this.syncStatus = syncStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current version of the object that is either in sync or pending synchronization.
     * </p>
     * 
     * @param updateToken
     *        The current version of the object that is either in sync or pending synchronization.
     */

    public void setUpdateToken(String updateToken) {
        this.updateToken = updateToken;
    }

    /**
     * <p>
     * The current version of the object that is either in sync or pending synchronization.
     * </p>
     * 
     * @return The current version of the object that is either in sync or pending synchronization.
     */

    public String getUpdateToken() {
        return this.updateToken;
    }

    /**
     * <p>
     * The current version of the object that is either in sync or pending synchronization.
     * </p>
     * 
     * @param updateToken
     *        The current version of the object that is either in sync or pending synchronization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerObjectStatus withUpdateToken(String updateToken) {
        setUpdateToken(updateToken);
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
        if (getSyncStatus() != null)
            sb.append("SyncStatus: ").append(getSyncStatus()).append(",");
        if (getUpdateToken() != null)
            sb.append("UpdateToken: ").append(getUpdateToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerObjectStatus == false)
            return false;
        PerObjectStatus other = (PerObjectStatus) obj;
        if (other.getSyncStatus() == null ^ this.getSyncStatus() == null)
            return false;
        if (other.getSyncStatus() != null && other.getSyncStatus().equals(this.getSyncStatus()) == false)
            return false;
        if (other.getUpdateToken() == null ^ this.getUpdateToken() == null)
            return false;
        if (other.getUpdateToken() != null && other.getUpdateToken().equals(this.getUpdateToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncStatus() == null) ? 0 : getSyncStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        return hashCode;
    }

    @Override
    public PerObjectStatus clone() {
        try {
            return (PerObjectStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.PerObjectStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
