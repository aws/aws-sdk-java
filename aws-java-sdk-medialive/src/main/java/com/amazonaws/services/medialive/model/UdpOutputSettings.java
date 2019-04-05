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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Udp Output Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UdpOutputSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UdpOutputSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * UDP output buffering in milliseconds. Larger values increase latency through the transcoder but simultaneously
     * assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery,
     * input switching, input disruptions, picture reordering, etc.
     */
    private Integer bufferMsec;

    private UdpContainerSettings containerSettings;
    /**
     * Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg.
     * rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
     */
    private OutputLocationRef destination;
    /** Settings for enabling and adjusting Forward Error Correction on UDP outputs. */
    private FecOutputSettings fecOutputSettings;

    /**
     * UDP output buffering in milliseconds. Larger values increase latency through the transcoder but simultaneously
     * assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery,
     * input switching, input disruptions, picture reordering, etc.
     * 
     * @param bufferMsec
     *        UDP output buffering in milliseconds. Larger values increase latency through the transcoder but
     *        simultaneously assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while
     *        accommodating clock recovery, input switching, input disruptions, picture reordering, etc.
     */

    public void setBufferMsec(Integer bufferMsec) {
        this.bufferMsec = bufferMsec;
    }

    /**
     * UDP output buffering in milliseconds. Larger values increase latency through the transcoder but simultaneously
     * assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery,
     * input switching, input disruptions, picture reordering, etc.
     * 
     * @return UDP output buffering in milliseconds. Larger values increase latency through the transcoder but
     *         simultaneously assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while
     *         accommodating clock recovery, input switching, input disruptions, picture reordering, etc.
     */

    public Integer getBufferMsec() {
        return this.bufferMsec;
    }

    /**
     * UDP output buffering in milliseconds. Larger values increase latency through the transcoder but simultaneously
     * assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery,
     * input switching, input disruptions, picture reordering, etc.
     * 
     * @param bufferMsec
     *        UDP output buffering in milliseconds. Larger values increase latency through the transcoder but
     *        simultaneously assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while
     *        accommodating clock recovery, input switching, input disruptions, picture reordering, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UdpOutputSettings withBufferMsec(Integer bufferMsec) {
        setBufferMsec(bufferMsec);
        return this;
    }

    /**
     * @param containerSettings
     */

    public void setContainerSettings(UdpContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
    }

    /**
     * @return
     */

    public UdpContainerSettings getContainerSettings() {
        return this.containerSettings;
    }

    /**
     * @param containerSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UdpOutputSettings withContainerSettings(UdpContainerSettings containerSettings) {
        setContainerSettings(containerSettings);
        return this;
    }

    /**
     * Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg.
     * rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
     * 
     * @param destination
     *        Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg.
     *        rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
     */

    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg.
     * rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
     * 
     * @return Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg.
     *         rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
     */

    public OutputLocationRef getDestination() {
        return this.destination;
    }

    /**
     * Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg.
     * rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
     * 
     * @param destination
     *        Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg.
     *        rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UdpOutputSettings withDestination(OutputLocationRef destination) {
        setDestination(destination);
        return this;
    }

    /**
     * Settings for enabling and adjusting Forward Error Correction on UDP outputs.
     * 
     * @param fecOutputSettings
     *        Settings for enabling and adjusting Forward Error Correction on UDP outputs.
     */

    public void setFecOutputSettings(FecOutputSettings fecOutputSettings) {
        this.fecOutputSettings = fecOutputSettings;
    }

    /**
     * Settings for enabling and adjusting Forward Error Correction on UDP outputs.
     * 
     * @return Settings for enabling and adjusting Forward Error Correction on UDP outputs.
     */

    public FecOutputSettings getFecOutputSettings() {
        return this.fecOutputSettings;
    }

    /**
     * Settings for enabling and adjusting Forward Error Correction on UDP outputs.
     * 
     * @param fecOutputSettings
     *        Settings for enabling and adjusting Forward Error Correction on UDP outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UdpOutputSettings withFecOutputSettings(FecOutputSettings fecOutputSettings) {
        setFecOutputSettings(fecOutputSettings);
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
        if (getBufferMsec() != null)
            sb.append("BufferMsec: ").append(getBufferMsec()).append(",");
        if (getContainerSettings() != null)
            sb.append("ContainerSettings: ").append(getContainerSettings()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getFecOutputSettings() != null)
            sb.append("FecOutputSettings: ").append(getFecOutputSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UdpOutputSettings == false)
            return false;
        UdpOutputSettings other = (UdpOutputSettings) obj;
        if (other.getBufferMsec() == null ^ this.getBufferMsec() == null)
            return false;
        if (other.getBufferMsec() != null && other.getBufferMsec().equals(this.getBufferMsec()) == false)
            return false;
        if (other.getContainerSettings() == null ^ this.getContainerSettings() == null)
            return false;
        if (other.getContainerSettings() != null && other.getContainerSettings().equals(this.getContainerSettings()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getFecOutputSettings() == null ^ this.getFecOutputSettings() == null)
            return false;
        if (other.getFecOutputSettings() != null && other.getFecOutputSettings().equals(this.getFecOutputSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBufferMsec() == null) ? 0 : getBufferMsec().hashCode());
        hashCode = prime * hashCode + ((getContainerSettings() == null) ? 0 : getContainerSettings().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getFecOutputSettings() == null) ? 0 : getFecOutputSettings().hashCode());
        return hashCode;
    }

    @Override
    public UdpOutputSettings clone() {
        try {
            return (UdpOutputSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.UdpOutputSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
