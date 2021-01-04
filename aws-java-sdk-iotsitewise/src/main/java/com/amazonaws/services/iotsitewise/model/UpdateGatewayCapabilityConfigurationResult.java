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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGatewayCapabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGatewayCapabilityConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     */
    private String capabilityNamespace;
    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is <code>OUT_OF_SYNC</code> until the gateway
     * receives and applies or rejects the updated configuration.
     * </p>
     */
    private String capabilitySyncStatus;

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * 
     * @param capabilityNamespace
     *        The namespace of the gateway capability.
     */

    public void setCapabilityNamespace(String capabilityNamespace) {
        this.capabilityNamespace = capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * 
     * @return The namespace of the gateway capability.
     */

    public String getCapabilityNamespace() {
        return this.capabilityNamespace;
    }

    /**
     * <p>
     * The namespace of the gateway capability.
     * </p>
     * 
     * @param capabilityNamespace
     *        The namespace of the gateway capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayCapabilityConfigurationResult withCapabilityNamespace(String capabilityNamespace) {
        setCapabilityNamespace(capabilityNamespace);
        return this;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is <code>OUT_OF_SYNC</code> until the gateway
     * receives and applies or rejects the updated configuration.
     * </p>
     * 
     * @param capabilitySyncStatus
     *        The synchronization status of the capability configuration. The sync status can be one of the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code> – The gateway is running the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        After you update a capability configuration, its sync status is <code>OUT_OF_SYNC</code> until the gateway
     *        receives and applies or rejects the updated configuration.
     * @see CapabilitySyncStatus
     */

    public void setCapabilitySyncStatus(String capabilitySyncStatus) {
        this.capabilitySyncStatus = capabilitySyncStatus;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is <code>OUT_OF_SYNC</code> until the gateway
     * receives and applies or rejects the updated configuration.
     * </p>
     * 
     * @return The synchronization status of the capability configuration. The sync status can be one of the
     *         following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code> – The gateway is running the capability configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         After you update a capability configuration, its sync status is <code>OUT_OF_SYNC</code> until the
     *         gateway receives and applies or rejects the updated configuration.
     * @see CapabilitySyncStatus
     */

    public String getCapabilitySyncStatus() {
        return this.capabilitySyncStatus;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is <code>OUT_OF_SYNC</code> until the gateway
     * receives and applies or rejects the updated configuration.
     * </p>
     * 
     * @param capabilitySyncStatus
     *        The synchronization status of the capability configuration. The sync status can be one of the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code> – The gateway is running the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        After you update a capability configuration, its sync status is <code>OUT_OF_SYNC</code> until the gateway
     *        receives and applies or rejects the updated configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilitySyncStatus
     */

    public UpdateGatewayCapabilityConfigurationResult withCapabilitySyncStatus(String capabilitySyncStatus) {
        setCapabilitySyncStatus(capabilitySyncStatus);
        return this;
    }

    /**
     * <p>
     * The synchronization status of the capability configuration. The sync status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_SYNC</code> – The gateway is running the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you update a capability configuration, its sync status is <code>OUT_OF_SYNC</code> until the gateway
     * receives and applies or rejects the updated configuration.
     * </p>
     * 
     * @param capabilitySyncStatus
     *        The synchronization status of the capability configuration. The sync status can be one of the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code> – The gateway is running the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUT_OF_SYNC</code> – The gateway hasn't received the capability configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYNC_FAILED</code> – The gateway rejected the capability configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        After you update a capability configuration, its sync status is <code>OUT_OF_SYNC</code> until the gateway
     *        receives and applies or rejects the updated configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilitySyncStatus
     */

    public UpdateGatewayCapabilityConfigurationResult withCapabilitySyncStatus(CapabilitySyncStatus capabilitySyncStatus) {
        this.capabilitySyncStatus = capabilitySyncStatus.toString();
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
        if (getCapabilityNamespace() != null)
            sb.append("CapabilityNamespace: ").append(getCapabilityNamespace()).append(",");
        if (getCapabilitySyncStatus() != null)
            sb.append("CapabilitySyncStatus: ").append(getCapabilitySyncStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGatewayCapabilityConfigurationResult == false)
            return false;
        UpdateGatewayCapabilityConfigurationResult other = (UpdateGatewayCapabilityConfigurationResult) obj;
        if (other.getCapabilityNamespace() == null ^ this.getCapabilityNamespace() == null)
            return false;
        if (other.getCapabilityNamespace() != null && other.getCapabilityNamespace().equals(this.getCapabilityNamespace()) == false)
            return false;
        if (other.getCapabilitySyncStatus() == null ^ this.getCapabilitySyncStatus() == null)
            return false;
        if (other.getCapabilitySyncStatus() != null && other.getCapabilitySyncStatus().equals(this.getCapabilitySyncStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapabilityNamespace() == null) ? 0 : getCapabilityNamespace().hashCode());
        hashCode = prime * hashCode + ((getCapabilitySyncStatus() == null) ? 0 : getCapabilitySyncStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGatewayCapabilityConfigurationResult clone() {
        try {
            return (UpdateGatewayCapabilityConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
