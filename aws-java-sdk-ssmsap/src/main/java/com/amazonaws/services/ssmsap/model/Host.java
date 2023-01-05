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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Host" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Host implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String hostName;
    /** <p/> */
    private String hostRole;
    /** <p/> */
    private String hostIp;
    /** <p/> */
    private String instanceId;

    /**
     * <p/>
     * 
     * @param hostName
     */

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getHostName() {
        return this.hostName;
    }

    /**
     * <p/>
     * 
     * @param hostName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withHostName(String hostName) {
        setHostName(hostName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param hostRole
     * @see HostRole
     */

    public void setHostRole(String hostRole) {
        this.hostRole = hostRole;
    }

    /**
     * <p/>
     * 
     * @return
     * @see HostRole
     */

    public String getHostRole() {
        return this.hostRole;
    }

    /**
     * <p/>
     * 
     * @param hostRole
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRole
     */

    public Host withHostRole(String hostRole) {
        setHostRole(hostRole);
        return this;
    }

    /**
     * <p/>
     * 
     * @param hostRole
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRole
     */

    public Host withHostRole(HostRole hostRole) {
        this.hostRole = hostRole.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param hostIp
     */

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getHostIp() {
        return this.hostIp;
    }

    /**
     * <p/>
     * 
     * @param hostIp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withHostIp(String hostIp) {
        setHostIp(hostIp);
        return this;
    }

    /**
     * <p/>
     * 
     * @param instanceId
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p/>
     * 
     * @param instanceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getHostRole() != null)
            sb.append("HostRole: ").append(getHostRole()).append(",");
        if (getHostIp() != null)
            sb.append("HostIp: ").append(getHostIp()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
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
        if (other.getHostRole() == null ^ this.getHostRole() == null)
            return false;
        if (other.getHostRole() != null && other.getHostRole().equals(this.getHostRole()) == false)
            return false;
        if (other.getHostIp() == null ^ this.getHostIp() == null)
            return false;
        if (other.getHostIp() != null && other.getHostIp().equals(this.getHostIp()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostName() == null) ? 0 : getHostName().hashCode());
        hashCode = prime * hashCode + ((getHostRole() == null) ? 0 : getHostRole().hashCode());
        hashCode = prime * hashCode + ((getHostIp() == null) ? 0 : getHostIp().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
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
