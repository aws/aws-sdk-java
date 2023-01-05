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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Beaconing parameters for configuring the wireless gateways.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/Beaconing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Beaconing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data rate for gateways that are sending the beacons.
     * </p>
     */
    private Integer dataRate;
    /**
     * <p>
     * The frequency list for the gateways to send the beacons.
     * </p>
     */
    private java.util.List<Integer> frequencies;

    /**
     * <p>
     * The data rate for gateways that are sending the beacons.
     * </p>
     * 
     * @param dataRate
     *        The data rate for gateways that are sending the beacons.
     */

    public void setDataRate(Integer dataRate) {
        this.dataRate = dataRate;
    }

    /**
     * <p>
     * The data rate for gateways that are sending the beacons.
     * </p>
     * 
     * @return The data rate for gateways that are sending the beacons.
     */

    public Integer getDataRate() {
        return this.dataRate;
    }

    /**
     * <p>
     * The data rate for gateways that are sending the beacons.
     * </p>
     * 
     * @param dataRate
     *        The data rate for gateways that are sending the beacons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Beaconing withDataRate(Integer dataRate) {
        setDataRate(dataRate);
        return this;
    }

    /**
     * <p>
     * The frequency list for the gateways to send the beacons.
     * </p>
     * 
     * @return The frequency list for the gateways to send the beacons.
     */

    public java.util.List<Integer> getFrequencies() {
        return frequencies;
    }

    /**
     * <p>
     * The frequency list for the gateways to send the beacons.
     * </p>
     * 
     * @param frequencies
     *        The frequency list for the gateways to send the beacons.
     */

    public void setFrequencies(java.util.Collection<Integer> frequencies) {
        if (frequencies == null) {
            this.frequencies = null;
            return;
        }

        this.frequencies = new java.util.ArrayList<Integer>(frequencies);
    }

    /**
     * <p>
     * The frequency list for the gateways to send the beacons.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrequencies(java.util.Collection)} or {@link #withFrequencies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param frequencies
     *        The frequency list for the gateways to send the beacons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Beaconing withFrequencies(Integer... frequencies) {
        if (this.frequencies == null) {
            setFrequencies(new java.util.ArrayList<Integer>(frequencies.length));
        }
        for (Integer ele : frequencies) {
            this.frequencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The frequency list for the gateways to send the beacons.
     * </p>
     * 
     * @param frequencies
     *        The frequency list for the gateways to send the beacons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Beaconing withFrequencies(java.util.Collection<Integer> frequencies) {
        setFrequencies(frequencies);
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
        if (getDataRate() != null)
            sb.append("DataRate: ").append(getDataRate()).append(",");
        if (getFrequencies() != null)
            sb.append("Frequencies: ").append(getFrequencies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Beaconing == false)
            return false;
        Beaconing other = (Beaconing) obj;
        if (other.getDataRate() == null ^ this.getDataRate() == null)
            return false;
        if (other.getDataRate() != null && other.getDataRate().equals(this.getDataRate()) == false)
            return false;
        if (other.getFrequencies() == null ^ this.getFrequencies() == null)
            return false;
        if (other.getFrequencies() != null && other.getFrequencies().equals(this.getFrequencies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataRate() == null) ? 0 : getDataRate().hashCode());
        hashCode = prime * hashCode + ((getFrequencies() == null) ? 0 : getFrequencies().hashCode());
        return hashCode;
    }

    @Override
    public Beaconing clone() {
        try {
            return (Beaconing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.BeaconingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
