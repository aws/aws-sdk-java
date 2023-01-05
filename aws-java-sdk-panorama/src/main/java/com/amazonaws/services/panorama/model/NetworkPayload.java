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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The network configuration for a device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/NetworkPayload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkPayload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Settings for Ethernet port 0.
     * </p>
     */
    private EthernetPayload ethernet0;
    /**
     * <p>
     * Settings for Ethernet port 1.
     * </p>
     */
    private EthernetPayload ethernet1;
    /**
     * <p>
     * Network time protocol (NTP) server settings.
     * </p>
     */
    private NtpPayload ntp;

    /**
     * <p>
     * Settings for Ethernet port 0.
     * </p>
     * 
     * @param ethernet0
     *        Settings for Ethernet port 0.
     */

    public void setEthernet0(EthernetPayload ethernet0) {
        this.ethernet0 = ethernet0;
    }

    /**
     * <p>
     * Settings for Ethernet port 0.
     * </p>
     * 
     * @return Settings for Ethernet port 0.
     */

    public EthernetPayload getEthernet0() {
        return this.ethernet0;
    }

    /**
     * <p>
     * Settings for Ethernet port 0.
     * </p>
     * 
     * @param ethernet0
     *        Settings for Ethernet port 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPayload withEthernet0(EthernetPayload ethernet0) {
        setEthernet0(ethernet0);
        return this;
    }

    /**
     * <p>
     * Settings for Ethernet port 1.
     * </p>
     * 
     * @param ethernet1
     *        Settings for Ethernet port 1.
     */

    public void setEthernet1(EthernetPayload ethernet1) {
        this.ethernet1 = ethernet1;
    }

    /**
     * <p>
     * Settings for Ethernet port 1.
     * </p>
     * 
     * @return Settings for Ethernet port 1.
     */

    public EthernetPayload getEthernet1() {
        return this.ethernet1;
    }

    /**
     * <p>
     * Settings for Ethernet port 1.
     * </p>
     * 
     * @param ethernet1
     *        Settings for Ethernet port 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPayload withEthernet1(EthernetPayload ethernet1) {
        setEthernet1(ethernet1);
        return this;
    }

    /**
     * <p>
     * Network time protocol (NTP) server settings.
     * </p>
     * 
     * @param ntp
     *        Network time protocol (NTP) server settings.
     */

    public void setNtp(NtpPayload ntp) {
        this.ntp = ntp;
    }

    /**
     * <p>
     * Network time protocol (NTP) server settings.
     * </p>
     * 
     * @return Network time protocol (NTP) server settings.
     */

    public NtpPayload getNtp() {
        return this.ntp;
    }

    /**
     * <p>
     * Network time protocol (NTP) server settings.
     * </p>
     * 
     * @param ntp
     *        Network time protocol (NTP) server settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPayload withNtp(NtpPayload ntp) {
        setNtp(ntp);
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
        if (getEthernet0() != null)
            sb.append("Ethernet0: ").append(getEthernet0()).append(",");
        if (getEthernet1() != null)
            sb.append("Ethernet1: ").append(getEthernet1()).append(",");
        if (getNtp() != null)
            sb.append("Ntp: ").append(getNtp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkPayload == false)
            return false;
        NetworkPayload other = (NetworkPayload) obj;
        if (other.getEthernet0() == null ^ this.getEthernet0() == null)
            return false;
        if (other.getEthernet0() != null && other.getEthernet0().equals(this.getEthernet0()) == false)
            return false;
        if (other.getEthernet1() == null ^ this.getEthernet1() == null)
            return false;
        if (other.getEthernet1() != null && other.getEthernet1().equals(this.getEthernet1()) == false)
            return false;
        if (other.getNtp() == null ^ this.getNtp() == null)
            return false;
        if (other.getNtp() != null && other.getNtp().equals(this.getNtp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEthernet0() == null) ? 0 : getEthernet0().hashCode());
        hashCode = prime * hashCode + ((getEthernet1() == null) ? 0 : getEthernet1().hashCode());
        hashCode = prime * hashCode + ((getNtp() == null) ? 0 : getNtp().hashCode());
        return hashCode;
    }

    @Override
    public NetworkPayload clone() {
        try {
            return (NetworkPayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.NetworkPayloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
