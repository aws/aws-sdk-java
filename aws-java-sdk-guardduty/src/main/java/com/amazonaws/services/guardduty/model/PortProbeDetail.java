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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Details about the port probe finding.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/PortProbeDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortProbeDetail implements Serializable, Cloneable, StructuredPojo {

    /** Local port information of the connection. */
    private LocalPortDetails localPortDetails;
    /** Remote IP information of the connection. */
    private RemoteIpDetails remoteIpDetails;

    /**
     * Local port information of the connection.
     * 
     * @param localPortDetails
     *        Local port information of the connection.
     */

    public void setLocalPortDetails(LocalPortDetails localPortDetails) {
        this.localPortDetails = localPortDetails;
    }

    /**
     * Local port information of the connection.
     * 
     * @return Local port information of the connection.
     */

    public LocalPortDetails getLocalPortDetails() {
        return this.localPortDetails;
    }

    /**
     * Local port information of the connection.
     * 
     * @param localPortDetails
     *        Local port information of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortProbeDetail withLocalPortDetails(LocalPortDetails localPortDetails) {
        setLocalPortDetails(localPortDetails);
        return this;
    }

    /**
     * Remote IP information of the connection.
     * 
     * @param remoteIpDetails
     *        Remote IP information of the connection.
     */

    public void setRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * Remote IP information of the connection.
     * 
     * @return Remote IP information of the connection.
     */

    public RemoteIpDetails getRemoteIpDetails() {
        return this.remoteIpDetails;
    }

    /**
     * Remote IP information of the connection.
     * 
     * @param remoteIpDetails
     *        Remote IP information of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortProbeDetail withRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        setRemoteIpDetails(remoteIpDetails);
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
        if (getLocalPortDetails() != null)
            sb.append("LocalPortDetails: ").append(getLocalPortDetails()).append(",");
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: ").append(getRemoteIpDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortProbeDetail == false)
            return false;
        PortProbeDetail other = (PortProbeDetail) obj;
        if (other.getLocalPortDetails() == null ^ this.getLocalPortDetails() == null)
            return false;
        if (other.getLocalPortDetails() != null && other.getLocalPortDetails().equals(this.getLocalPortDetails()) == false)
            return false;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalPortDetails() == null) ? 0 : getLocalPortDetails().hashCode());
        hashCode = prime * hashCode + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        return hashCode;
    }

    @Override
    public PortProbeDetail clone() {
        try {
            return (PortProbeDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.PortProbeDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
