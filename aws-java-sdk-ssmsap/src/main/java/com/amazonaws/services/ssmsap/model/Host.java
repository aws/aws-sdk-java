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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of the Dedicated Host.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Host" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Host implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Dedicated Host.
     * </p>
     */
    private String hostName;
    /**
     * <p>
     * The IP address of the Dedicated Host.
     * </p>
     */
    private String hostIp;
    /**
     * <p>
     * The ID of Amazon EC2 instance.
     * </p>
     */
    private String eC2InstanceId;
    /**
     * <p>
     * The instance ID of the instance on the Dedicated Host.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The role of the Dedicated Host.
     * </p>
     */
    private String hostRole;
    /**
     * <p>
     * The version of the operating system.
     * </p>
     */
    private String osVersion;

    /**
     * <p>
     * The name of the Dedicated Host.
     * </p>
     * 
     * @param hostName
     *        The name of the Dedicated Host.
     */

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * <p>
     * The name of the Dedicated Host.
     * </p>
     * 
     * @return The name of the Dedicated Host.
     */

    public String getHostName() {
        return this.hostName;
    }

    /**
     * <p>
     * The name of the Dedicated Host.
     * </p>
     * 
     * @param hostName
     *        The name of the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withHostName(String hostName) {
        setHostName(hostName);
        return this;
    }

    /**
     * <p>
     * The IP address of the Dedicated Host.
     * </p>
     * 
     * @param hostIp
     *        The IP address of the Dedicated Host.
     */

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    /**
     * <p>
     * The IP address of the Dedicated Host.
     * </p>
     * 
     * @return The IP address of the Dedicated Host.
     */

    public String getHostIp() {
        return this.hostIp;
    }

    /**
     * <p>
     * The IP address of the Dedicated Host.
     * </p>
     * 
     * @param hostIp
     *        The IP address of the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withHostIp(String hostIp) {
        setHostIp(hostIp);
        return this;
    }

    /**
     * <p>
     * The ID of Amazon EC2 instance.
     * </p>
     * 
     * @param eC2InstanceId
     *        The ID of Amazon EC2 instance.
     */

    public void setEC2InstanceId(String eC2InstanceId) {
        this.eC2InstanceId = eC2InstanceId;
    }

    /**
     * <p>
     * The ID of Amazon EC2 instance.
     * </p>
     * 
     * @return The ID of Amazon EC2 instance.
     */

    public String getEC2InstanceId() {
        return this.eC2InstanceId;
    }

    /**
     * <p>
     * The ID of Amazon EC2 instance.
     * </p>
     * 
     * @param eC2InstanceId
     *        The ID of Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withEC2InstanceId(String eC2InstanceId) {
        setEC2InstanceId(eC2InstanceId);
        return this;
    }

    /**
     * <p>
     * The instance ID of the instance on the Dedicated Host.
     * </p>
     * 
     * @param instanceId
     *        The instance ID of the instance on the Dedicated Host.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID of the instance on the Dedicated Host.
     * </p>
     * 
     * @return The instance ID of the instance on the Dedicated Host.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID of the instance on the Dedicated Host.
     * </p>
     * 
     * @param instanceId
     *        The instance ID of the instance on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The role of the Dedicated Host.
     * </p>
     * 
     * @param hostRole
     *        The role of the Dedicated Host.
     * @see HostRole
     */

    public void setHostRole(String hostRole) {
        this.hostRole = hostRole;
    }

    /**
     * <p>
     * The role of the Dedicated Host.
     * </p>
     * 
     * @return The role of the Dedicated Host.
     * @see HostRole
     */

    public String getHostRole() {
        return this.hostRole;
    }

    /**
     * <p>
     * The role of the Dedicated Host.
     * </p>
     * 
     * @param hostRole
     *        The role of the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRole
     */

    public Host withHostRole(String hostRole) {
        setHostRole(hostRole);
        return this;
    }

    /**
     * <p>
     * The role of the Dedicated Host.
     * </p>
     * 
     * @param hostRole
     *        The role of the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRole
     */

    public Host withHostRole(HostRole hostRole) {
        this.hostRole = hostRole.toString();
        return this;
    }

    /**
     * <p>
     * The version of the operating system.
     * </p>
     * 
     * @param osVersion
     *        The version of the operating system.
     */

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * <p>
     * The version of the operating system.
     * </p>
     * 
     * @return The version of the operating system.
     */

    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * <p>
     * The version of the operating system.
     * </p>
     * 
     * @param osVersion
     *        The version of the operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withOsVersion(String osVersion) {
        setOsVersion(osVersion);
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
        if (getHostName() != null)
            sb.append("HostName: ").append(getHostName()).append(",");
        if (getHostIp() != null)
            sb.append("HostIp: ").append(getHostIp()).append(",");
        if (getEC2InstanceId() != null)
            sb.append("EC2InstanceId: ").append(getEC2InstanceId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getHostRole() != null)
            sb.append("HostRole: ").append(getHostRole()).append(",");
        if (getOsVersion() != null)
            sb.append("OsVersion: ").append(getOsVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Host == false)
            return false;
        Host other = (Host) obj;
        if (other.getHostName() == null ^ this.getHostName() == null)
            return false;
        if (other.getHostName() != null && other.getHostName().equals(this.getHostName()) == false)
            return false;
        if (other.getHostIp() == null ^ this.getHostIp() == null)
            return false;
        if (other.getHostIp() != null && other.getHostIp().equals(this.getHostIp()) == false)
            return false;
        if (other.getEC2InstanceId() == null ^ this.getEC2InstanceId() == null)
            return false;
        if (other.getEC2InstanceId() != null && other.getEC2InstanceId().equals(this.getEC2InstanceId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getHostRole() == null ^ this.getHostRole() == null)
            return false;
        if (other.getHostRole() != null && other.getHostRole().equals(this.getHostRole()) == false)
            return false;
        if (other.getOsVersion() == null ^ this.getOsVersion() == null)
            return false;
        if (other.getOsVersion() != null && other.getOsVersion().equals(this.getOsVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostName() == null) ? 0 : getHostName().hashCode());
        hashCode = prime * hashCode + ((getHostIp() == null) ? 0 : getHostIp().hashCode());
        hashCode = prime * hashCode + ((getEC2InstanceId() == null) ? 0 : getEC2InstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getHostRole() == null) ? 0 : getHostRole().hashCode());
        hashCode = prime * hashCode + ((getOsVersion() == null) ? 0 : getOsVersion().hashCode());
        return hashCode;
    }

    @Override
    public Host clone() {
        try {
            return (Host) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.HostMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
