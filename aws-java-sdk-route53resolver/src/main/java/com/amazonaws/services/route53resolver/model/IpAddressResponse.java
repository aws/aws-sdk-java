/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In the response to a <a>GetResolverEndpoint</a> request, information about the IP addresses that the resolver
 * endpoint uses for DNS queries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/IpAddressResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAddressResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of one IP address.
     * </p>
     */
    private String ipId;
    /**
     * <p>
     * The ID of one subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * One IP address that the resolver endpoint uses for DNS queries.
     * </p>
     */
    private String ip;
    /**
     * <p>
     * A status code that gives the current status of the request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message that provides additional information about the status of the request.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     */
    private String modificationTime;

    /**
     * <p>
     * The ID of one IP address.
     * </p>
     * 
     * @param ipId
     *        The ID of one IP address.
     */

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    /**
     * <p>
     * The ID of one IP address.
     * </p>
     * 
     * @return The ID of one IP address.
     */

    public String getIpId() {
        return this.ipId;
    }

    /**
     * <p>
     * The ID of one IP address.
     * </p>
     * 
     * @param ipId
     *        The ID of one IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressResponse withIpId(String ipId) {
        setIpId(ipId);
        return this;
    }

    /**
     * <p>
     * The ID of one subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of one subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of one subnet.
     * </p>
     * 
     * @return The ID of one subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of one subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of one subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressResponse withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * One IP address that the resolver endpoint uses for DNS queries.
     * </p>
     * 
     * @param ip
     *        One IP address that the resolver endpoint uses for DNS queries.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * One IP address that the resolver endpoint uses for DNS queries.
     * </p>
     * 
     * @return One IP address that the resolver endpoint uses for DNS queries.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * One IP address that the resolver endpoint uses for DNS queries.
     * </p>
     * 
     * @param ip
     *        One IP address that the resolver endpoint uses for DNS queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressResponse withIp(String ip) {
        setIp(ip);
        return this;
    }

    /**
     * <p>
     * A status code that gives the current status of the request.
     * </p>
     * 
     * @param status
     *        A status code that gives the current status of the request.
     * @see IpAddressStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A status code that gives the current status of the request.
     * </p>
     * 
     * @return A status code that gives the current status of the request.
     * @see IpAddressStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A status code that gives the current status of the request.
     * </p>
     * 
     * @param status
     *        A status code that gives the current status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressStatus
     */

    public IpAddressResponse withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A status code that gives the current status of the request.
     * </p>
     * 
     * @param status
     *        A status code that gives the current status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressStatus
     */

    public IpAddressResponse withStatus(IpAddressStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message that provides additional information about the status of the request.
     * </p>
     * 
     * @param statusMessage
     *        A message that provides additional information about the status of the request.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message that provides additional information about the status of the request.
     * </p>
     * 
     * @return A message that provides additional information about the status of the request.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message that provides additional information about the status of the request.
     * </p>
     * 
     * @param statusMessage
     *        A message that provides additional information about the status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressResponse withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the IP address was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the IP address was created, in Unix time format and Coordinated Universal Time
     *         (UTC).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the IP address was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressResponse withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the IP address was last modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     */

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @return The date and time that the IP address was last modified, in Unix time format and Coordinated Universal
     *         Time (UTC).
     */

    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the IP address was last modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressResponse withModificationTime(String modificationTime) {
        setModificationTime(modificationTime);
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
        if (getIpId() != null)
            sb.append("IpId: ").append(getIpId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getIp() != null)
            sb.append("Ip: ").append(getIp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getModificationTime() != null)
            sb.append("ModificationTime: ").append(getModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpAddressResponse == false)
            return false;
        IpAddressResponse other = (IpAddressResponse) obj;
        if (other.getIpId() == null ^ this.getIpId() == null)
            return false;
        if (other.getIpId() != null && other.getIpId().equals(this.getIpId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModificationTime() == null ^ this.getModificationTime() == null)
            return false;
        if (other.getModificationTime() != null && other.getModificationTime().equals(this.getModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpId() == null) ? 0 : getIpId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModificationTime() == null) ? 0 : getModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public IpAddressResponse clone() {
        try {
            return (IpAddressResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.IpAddressResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
