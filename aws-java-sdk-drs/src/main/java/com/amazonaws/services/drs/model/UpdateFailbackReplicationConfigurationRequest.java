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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateFailbackReplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFailbackReplicationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Configure bandwidth throttling for the outbound data transfer rate of the Recovery Instance in Mbps.
     * </p>
     */
    private Long bandwidthThrottling;
    /**
     * <p>
     * The name of the Failback Replication Configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the Recovery Instance.
     * </p>
     */
    private String recoveryInstanceID;
    /**
     * <p>
     * Whether to use Private IP for the failback replication of the Recovery Instance.
     * </p>
     */
    private Boolean usePrivateIP;

    /**
     * <p>
     * Configure bandwidth throttling for the outbound data transfer rate of the Recovery Instance in Mbps.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Configure bandwidth throttling for the outbound data transfer rate of the Recovery Instance in Mbps.
     */

    public void setBandwidthThrottling(Long bandwidthThrottling) {
        this.bandwidthThrottling = bandwidthThrottling;
    }

    /**
     * <p>
     * Configure bandwidth throttling for the outbound data transfer rate of the Recovery Instance in Mbps.
     * </p>
     * 
     * @return Configure bandwidth throttling for the outbound data transfer rate of the Recovery Instance in Mbps.
     */

    public Long getBandwidthThrottling() {
        return this.bandwidthThrottling;
    }

    /**
     * <p>
     * Configure bandwidth throttling for the outbound data transfer rate of the Recovery Instance in Mbps.
     * </p>
     * 
     * @param bandwidthThrottling
     *        Configure bandwidth throttling for the outbound data transfer rate of the Recovery Instance in Mbps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFailbackReplicationConfigurationRequest withBandwidthThrottling(Long bandwidthThrottling) {
        setBandwidthThrottling(bandwidthThrottling);
        return this;
    }

    /**
     * <p>
     * The name of the Failback Replication Configuration.
     * </p>
     * 
     * @param name
     *        The name of the Failback Replication Configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Failback Replication Configuration.
     * </p>
     * 
     * @return The name of the Failback Replication Configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Failback Replication Configuration.
     * </p>
     * 
     * @param name
     *        The name of the Failback Replication Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFailbackReplicationConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the Recovery Instance.
     * </p>
     * 
     * @param recoveryInstanceID
     *        The ID of the Recovery Instance.
     */

    public void setRecoveryInstanceID(String recoveryInstanceID) {
        this.recoveryInstanceID = recoveryInstanceID;
    }

    /**
     * <p>
     * The ID of the Recovery Instance.
     * </p>
     * 
     * @return The ID of the Recovery Instance.
     */

    public String getRecoveryInstanceID() {
        return this.recoveryInstanceID;
    }

    /**
     * <p>
     * The ID of the Recovery Instance.
     * </p>
     * 
     * @param recoveryInstanceID
     *        The ID of the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFailbackReplicationConfigurationRequest withRecoveryInstanceID(String recoveryInstanceID) {
        setRecoveryInstanceID(recoveryInstanceID);
        return this;
    }

    /**
     * <p>
     * Whether to use Private IP for the failback replication of the Recovery Instance.
     * </p>
     * 
     * @param usePrivateIP
     *        Whether to use Private IP for the failback replication of the Recovery Instance.
     */

    public void setUsePrivateIP(Boolean usePrivateIP) {
        this.usePrivateIP = usePrivateIP;
    }

    /**
     * <p>
     * Whether to use Private IP for the failback replication of the Recovery Instance.
     * </p>
     * 
     * @return Whether to use Private IP for the failback replication of the Recovery Instance.
     */

    public Boolean getUsePrivateIP() {
        return this.usePrivateIP;
    }

    /**
     * <p>
     * Whether to use Private IP for the failback replication of the Recovery Instance.
     * </p>
     * 
     * @param usePrivateIP
     *        Whether to use Private IP for the failback replication of the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFailbackReplicationConfigurationRequest withUsePrivateIP(Boolean usePrivateIP) {
        setUsePrivateIP(usePrivateIP);
        return this;
    }

    /**
     * <p>
     * Whether to use Private IP for the failback replication of the Recovery Instance.
     * </p>
     * 
     * @return Whether to use Private IP for the failback replication of the Recovery Instance.
     */

    public Boolean isUsePrivateIP() {
        return this.usePrivateIP;
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
        if (getBandwidthThrottling() != null)
            sb.append("BandwidthThrottling: ").append(getBandwidthThrottling()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecoveryInstanceID() != null)
            sb.append("RecoveryInstanceID: ").append(getRecoveryInstanceID()).append(",");
        if (getUsePrivateIP() != null)
            sb.append("UsePrivateIP: ").append(getUsePrivateIP());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFailbackReplicationConfigurationRequest == false)
            return false;
        UpdateFailbackReplicationConfigurationRequest other = (UpdateFailbackReplicationConfigurationRequest) obj;
        if (other.getBandwidthThrottling() == null ^ this.getBandwidthThrottling() == null)
            return false;
        if (other.getBandwidthThrottling() != null && other.getBandwidthThrottling().equals(this.getBandwidthThrottling()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecoveryInstanceID() == null ^ this.getRecoveryInstanceID() == null)
            return false;
        if (other.getRecoveryInstanceID() != null && other.getRecoveryInstanceID().equals(this.getRecoveryInstanceID()) == false)
            return false;
        if (other.getUsePrivateIP() == null ^ this.getUsePrivateIP() == null)
            return false;
        if (other.getUsePrivateIP() != null && other.getUsePrivateIP().equals(this.getUsePrivateIP()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandwidthThrottling() == null) ? 0 : getBandwidthThrottling().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecoveryInstanceID() == null) ? 0 : getRecoveryInstanceID().hashCode());
        hashCode = prime * hashCode + ((getUsePrivateIP() == null) ? 0 : getUsePrivateIP().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFailbackReplicationConfigurationRequest clone() {
        return (UpdateFailbackReplicationConfigurationRequest) super.clone();
    }

}
