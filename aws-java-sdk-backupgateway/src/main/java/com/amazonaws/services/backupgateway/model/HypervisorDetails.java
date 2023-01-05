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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * These are the details of the specified hypervisor. A hypervisor is hardware, software, or firmware that creates and
 * manages virtual machines, and allocates resources to them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/HypervisorDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HypervisorDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     */
    private String host;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     */
    private String hypervisorArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS used to encrypt the hypervisor.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * This is the time when the most recent successful sync of metadata occurred.
     * </p>
     */
    private java.util.Date lastSuccessfulMetadataSyncTime;
    /**
     * <p>
     * This is the most recent status for the indicated metadata sync.
     * </p>
     */
    private String latestMetadataSyncStatus;
    /**
     * <p>
     * This is the most recent status for the indicated metadata sync.
     * </p>
     */
    private String latestMetadataSyncStatusMessage;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * </p>
     */
    private String logGroupArn;
    /**
     * <p>
     * This is the name of the specified hypervisor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * This is the current state of the specified hypervisor.
     * </p>
     * <p>
     * The possible states are <code>PENDING</code>, <code>ONLINE</code>, <code>OFFLINE</code>, or <code>ERROR</code>.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @return The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *         (FQDN).
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HypervisorDetails withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor.
     */

    public void setHypervisorArn(String hypervisorArn) {
        this.hypervisorArn = hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the hypervisor.
     */

    public String getHypervisorArn() {
        return this.hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HypervisorDetails withHypervisorArn(String hypervisorArn) {
        setHypervisorArn(hypervisorArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS used to encrypt the hypervisor.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the KMS used to encrypt the hypervisor.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS used to encrypt the hypervisor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS used to encrypt the hypervisor.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS used to encrypt the hypervisor.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the KMS used to encrypt the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HypervisorDetails withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * This is the time when the most recent successful sync of metadata occurred.
     * </p>
     * 
     * @param lastSuccessfulMetadataSyncTime
     *        This is the time when the most recent successful sync of metadata occurred.
     */

    public void setLastSuccessfulMetadataSyncTime(java.util.Date lastSuccessfulMetadataSyncTime) {
        this.lastSuccessfulMetadataSyncTime = lastSuccessfulMetadataSyncTime;
    }

    /**
     * <p>
     * This is the time when the most recent successful sync of metadata occurred.
     * </p>
     * 
     * @return This is the time when the most recent successful sync of metadata occurred.
     */

    public java.util.Date getLastSuccessfulMetadataSyncTime() {
        return this.lastSuccessfulMetadataSyncTime;
    }

    /**
     * <p>
     * This is the time when the most recent successful sync of metadata occurred.
     * </p>
     * 
     * @param lastSuccessfulMetadataSyncTime
     *        This is the time when the most recent successful sync of metadata occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HypervisorDetails withLastSuccessfulMetadataSyncTime(java.util.Date lastSuccessfulMetadataSyncTime) {
        setLastSuccessfulMetadataSyncTime(lastSuccessfulMetadataSyncTime);
        return this;
    }

    /**
     * <p>
     * This is the most recent status for the indicated metadata sync.
     * </p>
     * 
     * @param latestMetadataSyncStatus
     *        This is the most recent status for the indicated metadata sync.
     * @see SyncMetadataStatus
     */

    public void setLatestMetadataSyncStatus(String latestMetadataSyncStatus) {
        this.latestMetadataSyncStatus = latestMetadataSyncStatus;
    }

    /**
     * <p>
     * This is the most recent status for the indicated metadata sync.
     * </p>
     * 
     * @return This is the most recent status for the indicated metadata sync.
     * @see SyncMetadataStatus
     */

    public String getLatestMetadataSyncStatus() {
        return this.latestMetadataSyncStatus;
    }

    /**
     * <p>
     * This is the most recent status for the indicated metadata sync.
     * </p>
     * 
     * @param latestMetadataSyncStatus
     *        This is the most recent status for the indicated metadata sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncMetadataStatus
     */

    public HypervisorDetails withLatestMetadataSyncStatus(String latestMetadataSyncStatus) {
        setLatestMetadataSyncStatus(latestMetadataSyncStatus);
        return this;
    }

    /**
     * <p>
     * This is the most recent status for the indicated metadata sync.
     * </p>
     * 
     * @param latestMetadataSyncStatus
     *        This is the most recent status for the indicated metadata sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncMetadataStatus
     */

    public HypervisorDetails withLatestMetadataSyncStatus(SyncMetadataStatus latestMetadataSyncStatus) {
        this.latestMetadataSyncStatus = latestMetadataSyncStatus.toString();
        return this;
    }

    /**
     * <p>
     * This is the most recent status for the indicated metadata sync.
     * </p>
     * 
     * @param latestMetadataSyncStatusMessage
     *        This is the most recent status for the indicated metadata sync.
     */

    public void setLatestMetadataSyncStatusMessage(String latestMetadataSyncStatusMessage) {
        this.latestMetadataSyncStatusMessage = latestMetadataSyncStatusMessage;
    }

    /**
     * <p>
     * This is the most recent status for the indicated metadata sync.
     * </p>
     * 
     * @return This is the most recent status for the indicated metadata sync.
     */

    public String getLatestMetadataSyncStatusMessage() {
        return this.latestMetadataSyncStatusMessage;
    }

    /**
     * <p>
     * This is the most recent status for the indicated metadata sync.
     * </p>
     * 
     * @param latestMetadataSyncStatusMessage
     *        This is the most recent status for the indicated metadata sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HypervisorDetails withLatestMetadataSyncStatusMessage(String latestMetadataSyncStatusMessage) {
        setLatestMetadataSyncStatusMessage(latestMetadataSyncStatusMessage);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HypervisorDetails withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
        return this;
    }

    /**
     * <p>
     * This is the name of the specified hypervisor.
     * </p>
     * 
     * @param name
     *        This is the name of the specified hypervisor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * This is the name of the specified hypervisor.
     * </p>
     * 
     * @return This is the name of the specified hypervisor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * This is the name of the specified hypervisor.
     * </p>
     * 
     * @param name
     *        This is the name of the specified hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HypervisorDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * This is the current state of the specified hypervisor.
     * </p>
     * <p>
     * The possible states are <code>PENDING</code>, <code>ONLINE</code>, <code>OFFLINE</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @param state
     *        This is the current state of the specified hypervisor.</p>
     *        <p>
     *        The possible states are <code>PENDING</code>, <code>ONLINE</code>, <code>OFFLINE</code>, or
     *        <code>ERROR</code>.
     * @see HypervisorState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * This is the current state of the specified hypervisor.
     * </p>
     * <p>
     * The possible states are <code>PENDING</code>, <code>ONLINE</code>, <code>OFFLINE</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @return This is the current state of the specified hypervisor.</p>
     *         <p>
     *         The possible states are <code>PENDING</code>, <code>ONLINE</code>, <code>OFFLINE</code>, or
     *         <code>ERROR</code>.
     * @see HypervisorState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * This is the current state of the specified hypervisor.
     * </p>
     * <p>
     * The possible states are <code>PENDING</code>, <code>ONLINE</code>, <code>OFFLINE</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @param state
     *        This is the current state of the specified hypervisor.</p>
     *        <p>
     *        The possible states are <code>PENDING</code>, <code>ONLINE</code>, <code>OFFLINE</code>, or
     *        <code>ERROR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HypervisorState
     */

    public HypervisorDetails withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * This is the current state of the specified hypervisor.
     * </p>
     * <p>
     * The possible states are <code>PENDING</code>, <code>ONLINE</code>, <code>OFFLINE</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @param state
     *        This is the current state of the specified hypervisor.</p>
     *        <p>
     *        The possible states are <code>PENDING</code>, <code>ONLINE</code>, <code>OFFLINE</code>, or
     *        <code>ERROR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HypervisorState
     */

    public HypervisorDetails withState(HypervisorState state) {
        this.state = state.toString();
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
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getHypervisorArn() != null)
            sb.append("HypervisorArn: ").append(getHypervisorArn()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getLastSuccessfulMetadataSyncTime() != null)
            sb.append("LastSuccessfulMetadataSyncTime: ").append(getLastSuccessfulMetadataSyncTime()).append(",");
        if (getLatestMetadataSyncStatus() != null)
            sb.append("LatestMetadataSyncStatus: ").append(getLatestMetadataSyncStatus()).append(",");
        if (getLatestMetadataSyncStatusMessage() != null)
            sb.append("LatestMetadataSyncStatusMessage: ").append(getLatestMetadataSyncStatusMessage()).append(",");
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: ").append(getLogGroupArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HypervisorDetails == false)
            return false;
        HypervisorDetails other = (HypervisorDetails) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getHypervisorArn() == null ^ this.getHypervisorArn() == null)
            return false;
        if (other.getHypervisorArn() != null && other.getHypervisorArn().equals(this.getHypervisorArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getLastSuccessfulMetadataSyncTime() == null ^ this.getLastSuccessfulMetadataSyncTime() == null)
            return false;
        if (other.getLastSuccessfulMetadataSyncTime() != null
                && other.getLastSuccessfulMetadataSyncTime().equals(this.getLastSuccessfulMetadataSyncTime()) == false)
            return false;
        if (other.getLatestMetadataSyncStatus() == null ^ this.getLatestMetadataSyncStatus() == null)
            return false;
        if (other.getLatestMetadataSyncStatus() != null && other.getLatestMetadataSyncStatus().equals(this.getLatestMetadataSyncStatus()) == false)
            return false;
        if (other.getLatestMetadataSyncStatusMessage() == null ^ this.getLatestMetadataSyncStatusMessage() == null)
            return false;
        if (other.getLatestMetadataSyncStatusMessage() != null
                && other.getLatestMetadataSyncStatusMessage().equals(this.getLatestMetadataSyncStatusMessage()) == false)
            return false;
        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getHypervisorArn() == null) ? 0 : getHypervisorArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulMetadataSyncTime() == null) ? 0 : getLastSuccessfulMetadataSyncTime().hashCode());
        hashCode = prime * hashCode + ((getLatestMetadataSyncStatus() == null) ? 0 : getLatestMetadataSyncStatus().hashCode());
        hashCode = prime * hashCode + ((getLatestMetadataSyncStatusMessage() == null) ? 0 : getLatestMetadataSyncStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public HypervisorDetails clone() {
        try {
            return (HypervisorDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupgateway.model.transform.HypervisorDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
