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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A port scan that was part of the port probe. For each scan, PortProbeDetails provides information about the local IP
 * address and port that were scanned, and the remote IP address that the scan originated from.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/PortProbeDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortProbeDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides information about the port that was scanned.
     * </p>
     */
    private ActionLocalPortDetails localPortDetails;
    /**
     * <p>
     * Provides information about the IP address where the scanned port is located.
     * </p>
     */
    private ActionLocalIpDetails localIpDetails;
    /**
     * <p>
     * Provides information about the remote IP address that performed the scan.
     * </p>
     */
    private ActionRemoteIpDetails remoteIpDetails;

    /**
     * <p>
     * Provides information about the port that was scanned.
     * </p>
     * 
     * @param localPortDetails
     *        Provides information about the port that was scanned.
     */

    public void setLocalPortDetails(ActionLocalPortDetails localPortDetails) {
        this.localPortDetails = localPortDetails;
    }

    /**
     * <p>
     * Provides information about the port that was scanned.
     * </p>
     * 
     * @return Provides information about the port that was scanned.
     */

    public ActionLocalPortDetails getLocalPortDetails() {
        return this.localPortDetails;
    }

    /**
     * <p>
     * Provides information about the port that was scanned.
     * </p>
     * 
     * @param localPortDetails
     *        Provides information about the port that was scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortProbeDetail withLocalPortDetails(ActionLocalPortDetails localPortDetails) {
        setLocalPortDetails(localPortDetails);
        return this;
    }

    /**
     * <p>
     * Provides information about the IP address where the scanned port is located.
     * </p>
     * 
     * @param localIpDetails
     *        Provides information about the IP address where the scanned port is located.
     */

    public void setLocalIpDetails(ActionLocalIpDetails localIpDetails) {
        this.localIpDetails = localIpDetails;
    }

    /**
     * <p>
     * Provides information about the IP address where the scanned port is located.
     * </p>
     * 
     * @return Provides information about the IP address where the scanned port is located.
     */

    public ActionLocalIpDetails getLocalIpDetails() {
        return this.localIpDetails;
    }

    /**
     * <p>
     * Provides information about the IP address where the scanned port is located.
     * </p>
     * 
     * @param localIpDetails
     *        Provides information about the IP address where the scanned port is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortProbeDetail withLocalIpDetails(ActionLocalIpDetails localIpDetails) {
        setLocalIpDetails(localIpDetails);
        return this;
    }

    /**
     * <p>
     * Provides information about the remote IP address that performed the scan.
     * </p>
     * 
     * @param remoteIpDetails
     *        Provides information about the remote IP address that performed the scan.
     */

    public void setRemoteIpDetails(ActionRemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * <p>
     * Provides information about the remote IP address that performed the scan.
     * </p>
     * 
     * @return Provides information about the remote IP address that performed the scan.
     */

    public ActionRemoteIpDetails getRemoteIpDetails() {
        return this.remoteIpDetails;
    }

    /**
     * <p>
     * Provides information about the remote IP address that performed the scan.
     * </p>
     * 
     * @param remoteIpDetails
     *        Provides information about the remote IP address that performed the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortProbeDetail withRemoteIpDetails(ActionRemoteIpDetails remoteIpDetails) {
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
        if (getLocalIpDetails() != null)
            sb.append("LocalIpDetails: ").append(getLocalIpDetails()).append(",");
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
        if (other.getLocalIpDetails() == null ^ this.getLocalIpDetails() == null)
            return false;
        if (other.getLocalIpDetails() != null && other.getLocalIpDetails().equals(this.getLocalIpDetails()) == false)
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
        hashCode = prime * hashCode + ((getLocalIpDetails() == null) ? 0 : getLocalIpDetails().hashCode());
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
        com.amazonaws.services.securityhub.model.transform.PortProbeDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
