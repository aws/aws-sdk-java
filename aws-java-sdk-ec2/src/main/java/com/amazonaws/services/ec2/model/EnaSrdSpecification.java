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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * ENA Express uses Amazon Web Services Scalable Reliable Datagram (SRD) technology to increase the maximum bandwidth
 * used per stream and minimize tail latency of network traffic between EC2 instances. With ENA Express, you can
 * communicate between two EC2 instances in the same subnet within the same account, or in different accounts. Both
 * sending and receiving instances must have ENA Express enabled.
 * </p>
 * <p>
 * To improve the reliability of network packet delivery, ENA Express reorders network packets on the receiving end by
 * default. However, some UDP-based applications are designed to handle network packets that are out of order to reduce
 * the overhead for packet delivery at the network layer. When ENA Express is enabled, you can specify whether UDP
 * network traffic uses it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnaSrdSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnaSrdSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface.
     * </p>
     */
    private Boolean enaSrdEnabled;
    /**
     * <p>
     * Configures ENA Express for UDP network traffic.
     * </p>
     */
    private EnaSrdUdpSpecification enaSrdUdpSpecification;

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface.
     * </p>
     * 
     * @param enaSrdEnabled
     *        Indicates whether ENA Express is enabled for the network interface.
     */

    public void setEnaSrdEnabled(Boolean enaSrdEnabled) {
        this.enaSrdEnabled = enaSrdEnabled;
    }

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface.
     * </p>
     * 
     * @return Indicates whether ENA Express is enabled for the network interface.
     */

    public Boolean getEnaSrdEnabled() {
        return this.enaSrdEnabled;
    }

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface.
     * </p>
     * 
     * @param enaSrdEnabled
     *        Indicates whether ENA Express is enabled for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnaSrdSpecification withEnaSrdEnabled(Boolean enaSrdEnabled) {
        setEnaSrdEnabled(enaSrdEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether ENA Express is enabled for the network interface.
     * </p>
     * 
     * @return Indicates whether ENA Express is enabled for the network interface.
     */

    public Boolean isEnaSrdEnabled() {
        return this.enaSrdEnabled;
    }

    /**
     * <p>
     * Configures ENA Express for UDP network traffic.
     * </p>
     * 
     * @param enaSrdUdpSpecification
     *        Configures ENA Express for UDP network traffic.
     */

    public void setEnaSrdUdpSpecification(EnaSrdUdpSpecification enaSrdUdpSpecification) {
        this.enaSrdUdpSpecification = enaSrdUdpSpecification;
    }

    /**
     * <p>
     * Configures ENA Express for UDP network traffic.
     * </p>
     * 
     * @return Configures ENA Express for UDP network traffic.
     */

    public EnaSrdUdpSpecification getEnaSrdUdpSpecification() {
        return this.enaSrdUdpSpecification;
    }

    /**
     * <p>
     * Configures ENA Express for UDP network traffic.
     * </p>
     * 
     * @param enaSrdUdpSpecification
     *        Configures ENA Express for UDP network traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnaSrdSpecification withEnaSrdUdpSpecification(EnaSrdUdpSpecification enaSrdUdpSpecification) {
        setEnaSrdUdpSpecification(enaSrdUdpSpecification);
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
        if (getEnaSrdEnabled() != null)
            sb.append("EnaSrdEnabled: ").append(getEnaSrdEnabled()).append(",");
        if (getEnaSrdUdpSpecification() != null)
            sb.append("EnaSrdUdpSpecification: ").append(getEnaSrdUdpSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnaSrdSpecification == false)
            return false;
        EnaSrdSpecification other = (EnaSrdSpecification) obj;
        if (other.getEnaSrdEnabled() == null ^ this.getEnaSrdEnabled() == null)
            return false;
        if (other.getEnaSrdEnabled() != null && other.getEnaSrdEnabled().equals(this.getEnaSrdEnabled()) == false)
            return false;
        if (other.getEnaSrdUdpSpecification() == null ^ this.getEnaSrdUdpSpecification() == null)
            return false;
        if (other.getEnaSrdUdpSpecification() != null && other.getEnaSrdUdpSpecification().equals(this.getEnaSrdUdpSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnaSrdEnabled() == null) ? 0 : getEnaSrdEnabled().hashCode());
        hashCode = prime * hashCode + ((getEnaSrdUdpSpecification() == null) ? 0 : getEnaSrdUdpSpecification().hashCode());
        return hashCode;
    }

    @Override
    public EnaSrdSpecification clone() {
        try {
            return (EnaSrdSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
