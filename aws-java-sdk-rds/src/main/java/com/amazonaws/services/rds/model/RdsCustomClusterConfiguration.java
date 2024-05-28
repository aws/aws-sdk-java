/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Reserved for future use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RdsCustomClusterConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsCustomClusterConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String interconnectSubnetId;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String transitGatewayMulticastDomainId;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String replicaMode;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param interconnectSubnetId
     *        Reserved for future use.
     */

    public void setInterconnectSubnetId(String interconnectSubnetId) {
        this.interconnectSubnetId = interconnectSubnetId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getInterconnectSubnetId() {
        return this.interconnectSubnetId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param interconnectSubnetId
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsCustomClusterConfiguration withInterconnectSubnetId(String interconnectSubnetId) {
        setInterconnectSubnetId(interconnectSubnetId);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param transitGatewayMulticastDomainId
     *        Reserved for future use.
     */

    public void setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param transitGatewayMulticastDomainId
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsCustomClusterConfiguration withTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        setTransitGatewayMulticastDomainId(transitGatewayMulticastDomainId);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param replicaMode
     *        Reserved for future use.
     * @see ReplicaMode
     */

    public void setReplicaMode(String replicaMode) {
        this.replicaMode = replicaMode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     * @see ReplicaMode
     */

    public String getReplicaMode() {
        return this.replicaMode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param replicaMode
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public RdsCustomClusterConfiguration withReplicaMode(String replicaMode) {
        setReplicaMode(replicaMode);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param replicaMode
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public RdsCustomClusterConfiguration withReplicaMode(ReplicaMode replicaMode) {
        this.replicaMode = replicaMode.toString();
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
        if (getInterconnectSubnetId() != null)
            sb.append("InterconnectSubnetId: ").append(getInterconnectSubnetId()).append(",");
        if (getTransitGatewayMulticastDomainId() != null)
            sb.append("TransitGatewayMulticastDomainId: ").append(getTransitGatewayMulticastDomainId()).append(",");
        if (getReplicaMode() != null)
            sb.append("ReplicaMode: ").append(getReplicaMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsCustomClusterConfiguration == false)
            return false;
        RdsCustomClusterConfiguration other = (RdsCustomClusterConfiguration) obj;
        if (other.getInterconnectSubnetId() == null ^ this.getInterconnectSubnetId() == null)
            return false;
        if (other.getInterconnectSubnetId() != null && other.getInterconnectSubnetId().equals(this.getInterconnectSubnetId()) == false)
            return false;
        if (other.getTransitGatewayMulticastDomainId() == null ^ this.getTransitGatewayMulticastDomainId() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainId() != null
                && other.getTransitGatewayMulticastDomainId().equals(this.getTransitGatewayMulticastDomainId()) == false)
            return false;
        if (other.getReplicaMode() == null ^ this.getReplicaMode() == null)
            return false;
        if (other.getReplicaMode() != null && other.getReplicaMode().equals(this.getReplicaMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterconnectSubnetId() == null) ? 0 : getInterconnectSubnetId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayMulticastDomainId() == null) ? 0 : getTransitGatewayMulticastDomainId().hashCode());
        hashCode = prime * hashCode + ((getReplicaMode() == null) ? 0 : getReplicaMode().hashCode());
        return hashCode;
    }

    @Override
    public RdsCustomClusterConfiguration clone() {
        try {
            return (RdsCustomClusterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
