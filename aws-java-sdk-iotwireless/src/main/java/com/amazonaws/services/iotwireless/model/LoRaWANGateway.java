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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * LoRaWANGateway object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANGateway implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The gateway's EUI value.
     * </p>
     */
    private String gatewayEui;
    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     */
    private String rfRegion;

    private java.util.List<java.util.List<String>> joinEuiFilters;

    private java.util.List<String> netIdFilters;

    private java.util.List<Integer> subBands;

    /**
     * <p>
     * The gateway's EUI value.
     * </p>
     * 
     * @param gatewayEui
     *        The gateway's EUI value.
     */

    public void setGatewayEui(String gatewayEui) {
        this.gatewayEui = gatewayEui;
    }

    /**
     * <p>
     * The gateway's EUI value.
     * </p>
     * 
     * @return The gateway's EUI value.
     */

    public String getGatewayEui() {
        return this.gatewayEui;
    }

    /**
     * <p>
     * The gateway's EUI value.
     * </p>
     * 
     * @param gatewayEui
     *        The gateway's EUI value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGateway withGatewayEui(String gatewayEui) {
        setGatewayEui(gatewayEui);
        return this;
    }

    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     * 
     * @param rfRegion
     *        The frequency band (RFRegion) value.
     */

    public void setRfRegion(String rfRegion) {
        this.rfRegion = rfRegion;
    }

    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     * 
     * @return The frequency band (RFRegion) value.
     */

    public String getRfRegion() {
        return this.rfRegion;
    }

    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     * 
     * @param rfRegion
     *        The frequency band (RFRegion) value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGateway withRfRegion(String rfRegion) {
        setRfRegion(rfRegion);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<java.util.List<String>> getJoinEuiFilters() {
        return joinEuiFilters;
    }

    /**
     * @param joinEuiFilters
     */

    public void setJoinEuiFilters(java.util.Collection<java.util.List<String>> joinEuiFilters) {
        if (joinEuiFilters == null) {
            this.joinEuiFilters = null;
            return;
        }

        this.joinEuiFilters = new java.util.ArrayList<java.util.List<String>>(joinEuiFilters);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJoinEuiFilters(java.util.Collection)} or {@link #withJoinEuiFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param joinEuiFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGateway withJoinEuiFilters(java.util.List<String>... joinEuiFilters) {
        if (this.joinEuiFilters == null) {
            setJoinEuiFilters(new java.util.ArrayList<java.util.List<String>>(joinEuiFilters.length));
        }
        for (java.util.List<String> ele : joinEuiFilters) {
            this.joinEuiFilters.add(ele);
        }
        return this;
    }

    /**
     * @param joinEuiFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGateway withJoinEuiFilters(java.util.Collection<java.util.List<String>> joinEuiFilters) {
        setJoinEuiFilters(joinEuiFilters);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getNetIdFilters() {
        return netIdFilters;
    }

    /**
     * @param netIdFilters
     */

    public void setNetIdFilters(java.util.Collection<String> netIdFilters) {
        if (netIdFilters == null) {
            this.netIdFilters = null;
            return;
        }

        this.netIdFilters = new java.util.ArrayList<String>(netIdFilters);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetIdFilters(java.util.Collection)} or {@link #withNetIdFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param netIdFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGateway withNetIdFilters(String... netIdFilters) {
        if (this.netIdFilters == null) {
            setNetIdFilters(new java.util.ArrayList<String>(netIdFilters.length));
        }
        for (String ele : netIdFilters) {
            this.netIdFilters.add(ele);
        }
        return this;
    }

    /**
     * @param netIdFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGateway withNetIdFilters(java.util.Collection<String> netIdFilters) {
        setNetIdFilters(netIdFilters);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Integer> getSubBands() {
        return subBands;
    }

    /**
     * @param subBands
     */

    public void setSubBands(java.util.Collection<Integer> subBands) {
        if (subBands == null) {
            this.subBands = null;
            return;
        }

        this.subBands = new java.util.ArrayList<Integer>(subBands);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubBands(java.util.Collection)} or {@link #withSubBands(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subBands
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGateway withSubBands(Integer... subBands) {
        if (this.subBands == null) {
            setSubBands(new java.util.ArrayList<Integer>(subBands.length));
        }
        for (Integer ele : subBands) {
            this.subBands.add(ele);
        }
        return this;
    }

    /**
     * @param subBands
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGateway withSubBands(java.util.Collection<Integer> subBands) {
        setSubBands(subBands);
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
        if (getGatewayEui() != null)
            sb.append("GatewayEui: ").append(getGatewayEui()).append(",");
        if (getRfRegion() != null)
            sb.append("RfRegion: ").append(getRfRegion()).append(",");
        if (getJoinEuiFilters() != null)
            sb.append("JoinEuiFilters: ").append(getJoinEuiFilters()).append(",");
        if (getNetIdFilters() != null)
            sb.append("NetIdFilters: ").append(getNetIdFilters()).append(",");
        if (getSubBands() != null)
            sb.append("SubBands: ").append(getSubBands());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANGateway == false)
            return false;
        LoRaWANGateway other = (LoRaWANGateway) obj;
        if (other.getGatewayEui() == null ^ this.getGatewayEui() == null)
            return false;
        if (other.getGatewayEui() != null && other.getGatewayEui().equals(this.getGatewayEui()) == false)
            return false;
        if (other.getRfRegion() == null ^ this.getRfRegion() == null)
            return false;
        if (other.getRfRegion() != null && other.getRfRegion().equals(this.getRfRegion()) == false)
            return false;
        if (other.getJoinEuiFilters() == null ^ this.getJoinEuiFilters() == null)
            return false;
        if (other.getJoinEuiFilters() != null && other.getJoinEuiFilters().equals(this.getJoinEuiFilters()) == false)
            return false;
        if (other.getNetIdFilters() == null ^ this.getNetIdFilters() == null)
            return false;
        if (other.getNetIdFilters() != null && other.getNetIdFilters().equals(this.getNetIdFilters()) == false)
            return false;
        if (other.getSubBands() == null ^ this.getSubBands() == null)
            return false;
        if (other.getSubBands() != null && other.getSubBands().equals(this.getSubBands()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayEui() == null) ? 0 : getGatewayEui().hashCode());
        hashCode = prime * hashCode + ((getRfRegion() == null) ? 0 : getRfRegion().hashCode());
        hashCode = prime * hashCode + ((getJoinEuiFilters() == null) ? 0 : getJoinEuiFilters().hashCode());
        hashCode = prime * hashCode + ((getNetIdFilters() == null) ? 0 : getNetIdFilters().hashCode());
        hashCode = prime * hashCode + ((getSubBands() == null) ? 0 : getSubBands().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANGateway clone() {
        try {
            return (LoRaWANGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANGatewayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
