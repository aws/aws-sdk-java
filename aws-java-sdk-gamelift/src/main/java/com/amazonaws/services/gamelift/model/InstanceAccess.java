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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information required to remotely connect to a fleet instance. Access is requested by calling
 * <a>GetInstanceAccess</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/InstanceAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceAccess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a fleet containing the instance being accessed.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Unique identifier for an instance being accessed.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * IP address assigned to the instance.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Operating system that is running on the instance.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * Credentials required to access the instance.
     * </p>
     */
    private InstanceCredentials credentials;

    /**
     * <p>
     * Unique identifier for a fleet containing the instance being accessed.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet containing the instance being accessed.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet containing the instance being accessed.
     * </p>
     * 
     * @return Unique identifier for a fleet containing the instance being accessed.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet containing the instance being accessed.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet containing the instance being accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccess withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for an instance being accessed.
     * </p>
     * 
     * @param instanceId
     *        Unique identifier for an instance being accessed.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * Unique identifier for an instance being accessed.
     * </p>
     * 
     * @return Unique identifier for an instance being accessed.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * Unique identifier for an instance being accessed.
     * </p>
     * 
     * @param instanceId
     *        Unique identifier for an instance being accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccess withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * IP address assigned to the instance.
     * </p>
     * 
     * @param ipAddress
     *        IP address assigned to the instance.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address assigned to the instance.
     * </p>
     * 
     * @return IP address assigned to the instance.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address assigned to the instance.
     * </p>
     * 
     * @param ipAddress
     *        IP address assigned to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccess withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Operating system that is running on the instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on the instance.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Operating system that is running on the instance.
     * </p>
     * 
     * @return Operating system that is running on the instance.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Operating system that is running on the instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public InstanceAccess withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * Operating system that is running on the instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on the instance.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * Operating system that is running on the instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public InstanceAccess withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * Credentials required to access the instance.
     * </p>
     * 
     * @param credentials
     *        Credentials required to access the instance.
     */

    public void setCredentials(InstanceCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * Credentials required to access the instance.
     * </p>
     * 
     * @return Credentials required to access the instance.
     */

    public InstanceCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * Credentials required to access the instance.
     * </p>
     * 
     * @param credentials
     *        Credentials required to access the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccess withCredentials(InstanceCredentials credentials) {
        setCredentials(credentials);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAccess == false)
            return false;
        InstanceAccess other = (InstanceAccess) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        return hashCode;
    }

    @Override
    public InstanceAccess clone() {
        try {
            return (InstanceAccess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.InstanceAccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
