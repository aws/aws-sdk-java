/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object containing the parameters of a <code>Config</code>.
 * </p>
 * <p>
 * See the subtype definitions for what each type of <code>Config</code> contains.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ConfigTypeData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigTypeData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
     * </p>
     */
    private AntennaDownlinkConfig antennaDownlinkConfig;
    /**
     * <p>
     * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
     * </p>
     */
    private AntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig;
    /**
     * <p>
     * Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
     * </p>
     */
    private AntennaUplinkConfig antennaUplinkConfig;
    /**
     * <p>
     * Information about the dataflow endpoint <code>Config</code>.
     * </p>
     */
    private DataflowEndpointConfig dataflowEndpointConfig;
    /**
     * <p>
     * Object that determines whether tracking should be used during a contact executed with this <code>Config</code> in
     * the mission profile.
     * </p>
     */
    private TrackingConfig trackingConfig;
    /**
     * <p>
     * Information about an uplink echo <code>Config</code>.
     * </p>
     * <p>
     * Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified
     * <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a contact.
     * </p>
     */
    private UplinkEchoConfig uplinkEchoConfig;

    /**
     * <p>
     * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
     * </p>
     * 
     * @param antennaDownlinkConfig
     *        Information about how AWS Ground Station should configure an antenna for downlink during a contact.
     */

    public void setAntennaDownlinkConfig(AntennaDownlinkConfig antennaDownlinkConfig) {
        this.antennaDownlinkConfig = antennaDownlinkConfig;
    }

    /**
     * <p>
     * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
     * </p>
     * 
     * @return Information about how AWS Ground Station should configure an antenna for downlink during a contact.
     */

    public AntennaDownlinkConfig getAntennaDownlinkConfig() {
        return this.antennaDownlinkConfig;
    }

    /**
     * <p>
     * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
     * </p>
     * 
     * @param antennaDownlinkConfig
     *        Information about how AWS Ground Station should configure an antenna for downlink during a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigTypeData withAntennaDownlinkConfig(AntennaDownlinkConfig antennaDownlinkConfig) {
        setAntennaDownlinkConfig(antennaDownlinkConfig);
        return this;
    }

    /**
     * <p>
     * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
     * </p>
     * 
     * @param antennaDownlinkDemodDecodeConfig
     *        Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a
     *        contact.
     */

    public void setAntennaDownlinkDemodDecodeConfig(AntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig) {
        this.antennaDownlinkDemodDecodeConfig = antennaDownlinkDemodDecodeConfig;
    }

    /**
     * <p>
     * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
     * </p>
     * 
     * @return Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a
     *         contact.
     */

    public AntennaDownlinkDemodDecodeConfig getAntennaDownlinkDemodDecodeConfig() {
        return this.antennaDownlinkDemodDecodeConfig;
    }

    /**
     * <p>
     * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
     * </p>
     * 
     * @param antennaDownlinkDemodDecodeConfig
     *        Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a
     *        contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigTypeData withAntennaDownlinkDemodDecodeConfig(AntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig) {
        setAntennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig);
        return this;
    }

    /**
     * <p>
     * Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
     * </p>
     * 
     * @param antennaUplinkConfig
     *        Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
     */

    public void setAntennaUplinkConfig(AntennaUplinkConfig antennaUplinkConfig) {
        this.antennaUplinkConfig = antennaUplinkConfig;
    }

    /**
     * <p>
     * Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
     * </p>
     * 
     * @return Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
     */

    public AntennaUplinkConfig getAntennaUplinkConfig() {
        return this.antennaUplinkConfig;
    }

    /**
     * <p>
     * Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
     * </p>
     * 
     * @param antennaUplinkConfig
     *        Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigTypeData withAntennaUplinkConfig(AntennaUplinkConfig antennaUplinkConfig) {
        setAntennaUplinkConfig(antennaUplinkConfig);
        return this;
    }

    /**
     * <p>
     * Information about the dataflow endpoint <code>Config</code>.
     * </p>
     * 
     * @param dataflowEndpointConfig
     *        Information about the dataflow endpoint <code>Config</code>.
     */

    public void setDataflowEndpointConfig(DataflowEndpointConfig dataflowEndpointConfig) {
        this.dataflowEndpointConfig = dataflowEndpointConfig;
    }

    /**
     * <p>
     * Information about the dataflow endpoint <code>Config</code>.
     * </p>
     * 
     * @return Information about the dataflow endpoint <code>Config</code>.
     */

    public DataflowEndpointConfig getDataflowEndpointConfig() {
        return this.dataflowEndpointConfig;
    }

    /**
     * <p>
     * Information about the dataflow endpoint <code>Config</code>.
     * </p>
     * 
     * @param dataflowEndpointConfig
     *        Information about the dataflow endpoint <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigTypeData withDataflowEndpointConfig(DataflowEndpointConfig dataflowEndpointConfig) {
        setDataflowEndpointConfig(dataflowEndpointConfig);
        return this;
    }

    /**
     * <p>
     * Object that determines whether tracking should be used during a contact executed with this <code>Config</code> in
     * the mission profile.
     * </p>
     * 
     * @param trackingConfig
     *        Object that determines whether tracking should be used during a contact executed with this
     *        <code>Config</code> in the mission profile.
     */

    public void setTrackingConfig(TrackingConfig trackingConfig) {
        this.trackingConfig = trackingConfig;
    }

    /**
     * <p>
     * Object that determines whether tracking should be used during a contact executed with this <code>Config</code> in
     * the mission profile.
     * </p>
     * 
     * @return Object that determines whether tracking should be used during a contact executed with this
     *         <code>Config</code> in the mission profile.
     */

    public TrackingConfig getTrackingConfig() {
        return this.trackingConfig;
    }

    /**
     * <p>
     * Object that determines whether tracking should be used during a contact executed with this <code>Config</code> in
     * the mission profile.
     * </p>
     * 
     * @param trackingConfig
     *        Object that determines whether tracking should be used during a contact executed with this
     *        <code>Config</code> in the mission profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigTypeData withTrackingConfig(TrackingConfig trackingConfig) {
        setTrackingConfig(trackingConfig);
        return this;
    }

    /**
     * <p>
     * Information about an uplink echo <code>Config</code>.
     * </p>
     * <p>
     * Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified
     * <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a contact.
     * </p>
     * 
     * @param uplinkEchoConfig
     *        Information about an uplink echo <code>Config</code>.</p>
     *        <p>
     *        Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified
     *        <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a
     *        contact.
     */

    public void setUplinkEchoConfig(UplinkEchoConfig uplinkEchoConfig) {
        this.uplinkEchoConfig = uplinkEchoConfig;
    }

    /**
     * <p>
     * Information about an uplink echo <code>Config</code>.
     * </p>
     * <p>
     * Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified
     * <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a contact.
     * </p>
     * 
     * @return Information about an uplink echo <code>Config</code>.</p>
     *         <p>
     *         Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified
     *         <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a
     *         contact.
     */

    public UplinkEchoConfig getUplinkEchoConfig() {
        return this.uplinkEchoConfig;
    }

    /**
     * <p>
     * Information about an uplink echo <code>Config</code>.
     * </p>
     * <p>
     * Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified
     * <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a contact.
     * </p>
     * 
     * @param uplinkEchoConfig
     *        Information about an uplink echo <code>Config</code>.</p>
     *        <p>
     *        Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified
     *        <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a
     *        contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigTypeData withUplinkEchoConfig(UplinkEchoConfig uplinkEchoConfig) {
        setUplinkEchoConfig(uplinkEchoConfig);
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
        if (getAntennaDownlinkConfig() != null)
            sb.append("AntennaDownlinkConfig: ").append(getAntennaDownlinkConfig()).append(",");
        if (getAntennaDownlinkDemodDecodeConfig() != null)
            sb.append("AntennaDownlinkDemodDecodeConfig: ").append(getAntennaDownlinkDemodDecodeConfig()).append(",");
        if (getAntennaUplinkConfig() != null)
            sb.append("AntennaUplinkConfig: ").append(getAntennaUplinkConfig()).append(",");
        if (getDataflowEndpointConfig() != null)
            sb.append("DataflowEndpointConfig: ").append(getDataflowEndpointConfig()).append(",");
        if (getTrackingConfig() != null)
            sb.append("TrackingConfig: ").append(getTrackingConfig()).append(",");
        if (getUplinkEchoConfig() != null)
            sb.append("UplinkEchoConfig: ").append(getUplinkEchoConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigTypeData == false)
            return false;
        ConfigTypeData other = (ConfigTypeData) obj;
        if (other.getAntennaDownlinkConfig() == null ^ this.getAntennaDownlinkConfig() == null)
            return false;
        if (other.getAntennaDownlinkConfig() != null && other.getAntennaDownlinkConfig().equals(this.getAntennaDownlinkConfig()) == false)
            return false;
        if (other.getAntennaDownlinkDemodDecodeConfig() == null ^ this.getAntennaDownlinkDemodDecodeConfig() == null)
            return false;
        if (other.getAntennaDownlinkDemodDecodeConfig() != null
                && other.getAntennaDownlinkDemodDecodeConfig().equals(this.getAntennaDownlinkDemodDecodeConfig()) == false)
            return false;
        if (other.getAntennaUplinkConfig() == null ^ this.getAntennaUplinkConfig() == null)
            return false;
        if (other.getAntennaUplinkConfig() != null && other.getAntennaUplinkConfig().equals(this.getAntennaUplinkConfig()) == false)
            return false;
        if (other.getDataflowEndpointConfig() == null ^ this.getDataflowEndpointConfig() == null)
            return false;
        if (other.getDataflowEndpointConfig() != null && other.getDataflowEndpointConfig().equals(this.getDataflowEndpointConfig()) == false)
            return false;
        if (other.getTrackingConfig() == null ^ this.getTrackingConfig() == null)
            return false;
        if (other.getTrackingConfig() != null && other.getTrackingConfig().equals(this.getTrackingConfig()) == false)
            return false;
        if (other.getUplinkEchoConfig() == null ^ this.getUplinkEchoConfig() == null)
            return false;
        if (other.getUplinkEchoConfig() != null && other.getUplinkEchoConfig().equals(this.getUplinkEchoConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAntennaDownlinkConfig() == null) ? 0 : getAntennaDownlinkConfig().hashCode());
        hashCode = prime * hashCode + ((getAntennaDownlinkDemodDecodeConfig() == null) ? 0 : getAntennaDownlinkDemodDecodeConfig().hashCode());
        hashCode = prime * hashCode + ((getAntennaUplinkConfig() == null) ? 0 : getAntennaUplinkConfig().hashCode());
        hashCode = prime * hashCode + ((getDataflowEndpointConfig() == null) ? 0 : getDataflowEndpointConfig().hashCode());
        hashCode = prime * hashCode + ((getTrackingConfig() == null) ? 0 : getTrackingConfig().hashCode());
        hashCode = prime * hashCode + ((getUplinkEchoConfig() == null) ? 0 : getUplinkEchoConfig().hashCode());
        return hashCode;
    }

    @Override
    public ConfigTypeData clone() {
        try {
            return (ConfigTypeData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.ConfigTypeDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
