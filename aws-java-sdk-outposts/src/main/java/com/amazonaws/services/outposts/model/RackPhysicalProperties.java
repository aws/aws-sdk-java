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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the physical and logistical details for racks at sites. For more information about hardware
 * requirements for racks, see <a
 * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network readiness
 * checklist</a> in the Amazon Web Services Outposts User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/RackPhysicalProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RackPhysicalProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The power draw available at the hardware placement position for the rack.
     * </p>
     */
    private String powerDrawKva;
    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     */
    private String powerPhase;
    /**
     * <p>
     * The power connector for the hardware.
     * </p>
     */
    private String powerConnector;
    /**
     * <p>
     * The position of the power feed.
     * </p>
     */
    private String powerFeedDrop;
    /**
     * <p>
     * The uplink speed the rack supports for the connection to the Region.
     * </p>
     */
    private String uplinkGbps;
    /**
     * <p>
     * The number of uplinks each Outpost network device.
     * </p>
     */
    private String uplinkCount;
    /**
     * <p>
     * The type of fiber used to attach the Outpost to the network.
     * </p>
     */
    private String fiberOpticCableType;
    /**
     * <p>
     * The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink speed,
     * fiber type, and distance to the upstream device. For more information about networking requirements for racks,
     * see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     */
    private String opticalStandard;
    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000 lbs (907 kg).
     * </p>
     */
    private String maximumSupportedWeightLbs;

    /**
     * <p>
     * The power draw available at the hardware placement position for the rack.
     * </p>
     * 
     * @param powerDrawKva
     *        The power draw available at the hardware placement position for the rack.
     * @see PowerDrawKva
     */

    public void setPowerDrawKva(String powerDrawKva) {
        this.powerDrawKva = powerDrawKva;
    }

    /**
     * <p>
     * The power draw available at the hardware placement position for the rack.
     * </p>
     * 
     * @return The power draw available at the hardware placement position for the rack.
     * @see PowerDrawKva
     */

    public String getPowerDrawKva() {
        return this.powerDrawKva;
    }

    /**
     * <p>
     * The power draw available at the hardware placement position for the rack.
     * </p>
     * 
     * @param powerDrawKva
     *        The power draw available at the hardware placement position for the rack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerDrawKva
     */

    public RackPhysicalProperties withPowerDrawKva(String powerDrawKva) {
        setPowerDrawKva(powerDrawKva);
        return this;
    }

    /**
     * <p>
     * The power draw available at the hardware placement position for the rack.
     * </p>
     * 
     * @param powerDrawKva
     *        The power draw available at the hardware placement position for the rack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerDrawKva
     */

    public RackPhysicalProperties withPowerDrawKva(PowerDrawKva powerDrawKva) {
        this.powerDrawKva = powerDrawKva.toString();
        return this;
    }

    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     * 
     * @param powerPhase
     *        The power option that you can provide for hardware.
     * @see PowerPhase
     */

    public void setPowerPhase(String powerPhase) {
        this.powerPhase = powerPhase;
    }

    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     * 
     * @return The power option that you can provide for hardware.
     * @see PowerPhase
     */

    public String getPowerPhase() {
        return this.powerPhase;
    }

    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     * 
     * @param powerPhase
     *        The power option that you can provide for hardware.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerPhase
     */

    public RackPhysicalProperties withPowerPhase(String powerPhase) {
        setPowerPhase(powerPhase);
        return this;
    }

    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     * 
     * @param powerPhase
     *        The power option that you can provide for hardware.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerPhase
     */

    public RackPhysicalProperties withPowerPhase(PowerPhase powerPhase) {
        this.powerPhase = powerPhase.toString();
        return this;
    }

    /**
     * <p>
     * The power connector for the hardware.
     * </p>
     * 
     * @param powerConnector
     *        The power connector for the hardware.
     * @see PowerConnector
     */

    public void setPowerConnector(String powerConnector) {
        this.powerConnector = powerConnector;
    }

    /**
     * <p>
     * The power connector for the hardware.
     * </p>
     * 
     * @return The power connector for the hardware.
     * @see PowerConnector
     */

    public String getPowerConnector() {
        return this.powerConnector;
    }

    /**
     * <p>
     * The power connector for the hardware.
     * </p>
     * 
     * @param powerConnector
     *        The power connector for the hardware.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerConnector
     */

    public RackPhysicalProperties withPowerConnector(String powerConnector) {
        setPowerConnector(powerConnector);
        return this;
    }

    /**
     * <p>
     * The power connector for the hardware.
     * </p>
     * 
     * @param powerConnector
     *        The power connector for the hardware.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerConnector
     */

    public RackPhysicalProperties withPowerConnector(PowerConnector powerConnector) {
        this.powerConnector = powerConnector.toString();
        return this;
    }

    /**
     * <p>
     * The position of the power feed.
     * </p>
     * 
     * @param powerFeedDrop
     *        The position of the power feed.
     * @see PowerFeedDrop
     */

    public void setPowerFeedDrop(String powerFeedDrop) {
        this.powerFeedDrop = powerFeedDrop;
    }

    /**
     * <p>
     * The position of the power feed.
     * </p>
     * 
     * @return The position of the power feed.
     * @see PowerFeedDrop
     */

    public String getPowerFeedDrop() {
        return this.powerFeedDrop;
    }

    /**
     * <p>
     * The position of the power feed.
     * </p>
     * 
     * @param powerFeedDrop
     *        The position of the power feed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerFeedDrop
     */

    public RackPhysicalProperties withPowerFeedDrop(String powerFeedDrop) {
        setPowerFeedDrop(powerFeedDrop);
        return this;
    }

    /**
     * <p>
     * The position of the power feed.
     * </p>
     * 
     * @param powerFeedDrop
     *        The position of the power feed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerFeedDrop
     */

    public RackPhysicalProperties withPowerFeedDrop(PowerFeedDrop powerFeedDrop) {
        this.powerFeedDrop = powerFeedDrop.toString();
        return this;
    }

    /**
     * <p>
     * The uplink speed the rack supports for the connection to the Region.
     * </p>
     * 
     * @param uplinkGbps
     *        The uplink speed the rack supports for the connection to the Region.
     * @see UplinkGbps
     */

    public void setUplinkGbps(String uplinkGbps) {
        this.uplinkGbps = uplinkGbps;
    }

    /**
     * <p>
     * The uplink speed the rack supports for the connection to the Region.
     * </p>
     * 
     * @return The uplink speed the rack supports for the connection to the Region.
     * @see UplinkGbps
     */

    public String getUplinkGbps() {
        return this.uplinkGbps;
    }

    /**
     * <p>
     * The uplink speed the rack supports for the connection to the Region.
     * </p>
     * 
     * @param uplinkGbps
     *        The uplink speed the rack supports for the connection to the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UplinkGbps
     */

    public RackPhysicalProperties withUplinkGbps(String uplinkGbps) {
        setUplinkGbps(uplinkGbps);
        return this;
    }

    /**
     * <p>
     * The uplink speed the rack supports for the connection to the Region.
     * </p>
     * 
     * @param uplinkGbps
     *        The uplink speed the rack supports for the connection to the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UplinkGbps
     */

    public RackPhysicalProperties withUplinkGbps(UplinkGbps uplinkGbps) {
        this.uplinkGbps = uplinkGbps.toString();
        return this;
    }

    /**
     * <p>
     * The number of uplinks each Outpost network device.
     * </p>
     * 
     * @param uplinkCount
     *        The number of uplinks each Outpost network device.
     * @see UplinkCount
     */

    public void setUplinkCount(String uplinkCount) {
        this.uplinkCount = uplinkCount;
    }

    /**
     * <p>
     * The number of uplinks each Outpost network device.
     * </p>
     * 
     * @return The number of uplinks each Outpost network device.
     * @see UplinkCount
     */

    public String getUplinkCount() {
        return this.uplinkCount;
    }

    /**
     * <p>
     * The number of uplinks each Outpost network device.
     * </p>
     * 
     * @param uplinkCount
     *        The number of uplinks each Outpost network device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UplinkCount
     */

    public RackPhysicalProperties withUplinkCount(String uplinkCount) {
        setUplinkCount(uplinkCount);
        return this;
    }

    /**
     * <p>
     * The number of uplinks each Outpost network device.
     * </p>
     * 
     * @param uplinkCount
     *        The number of uplinks each Outpost network device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UplinkCount
     */

    public RackPhysicalProperties withUplinkCount(UplinkCount uplinkCount) {
        this.uplinkCount = uplinkCount.toString();
        return this;
    }

    /**
     * <p>
     * The type of fiber used to attach the Outpost to the network.
     * </p>
     * 
     * @param fiberOpticCableType
     *        The type of fiber used to attach the Outpost to the network.
     * @see FiberOpticCableType
     */

    public void setFiberOpticCableType(String fiberOpticCableType) {
        this.fiberOpticCableType = fiberOpticCableType;
    }

    /**
     * <p>
     * The type of fiber used to attach the Outpost to the network.
     * </p>
     * 
     * @return The type of fiber used to attach the Outpost to the network.
     * @see FiberOpticCableType
     */

    public String getFiberOpticCableType() {
        return this.fiberOpticCableType;
    }

    /**
     * <p>
     * The type of fiber used to attach the Outpost to the network.
     * </p>
     * 
     * @param fiberOpticCableType
     *        The type of fiber used to attach the Outpost to the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FiberOpticCableType
     */

    public RackPhysicalProperties withFiberOpticCableType(String fiberOpticCableType) {
        setFiberOpticCableType(fiberOpticCableType);
        return this;
    }

    /**
     * <p>
     * The type of fiber used to attach the Outpost to the network.
     * </p>
     * 
     * @param fiberOpticCableType
     *        The type of fiber used to attach the Outpost to the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FiberOpticCableType
     */

    public RackPhysicalProperties withFiberOpticCableType(FiberOpticCableType fiberOpticCableType) {
        this.fiberOpticCableType = fiberOpticCableType.toString();
        return this;
    }

    /**
     * <p>
     * The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink speed,
     * fiber type, and distance to the upstream device. For more information about networking requirements for racks,
     * see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * 
     * @param opticalStandard
     *        The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink
     *        speed, fiber type, and distance to the upstream device. For more information about networking requirements
     *        for racks, see <a href=
     *        "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     *        >Network</a> in the Amazon Web Services Outposts User Guide.
     * @see OpticalStandard
     */

    public void setOpticalStandard(String opticalStandard) {
        this.opticalStandard = opticalStandard;
    }

    /**
     * <p>
     * The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink speed,
     * fiber type, and distance to the upstream device. For more information about networking requirements for racks,
     * see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * 
     * @return The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink
     *         speed, fiber type, and distance to the upstream device. For more information about networking
     *         requirements for racks, see <a href=
     *         "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     *         >Network</a> in the Amazon Web Services Outposts User Guide.
     * @see OpticalStandard
     */

    public String getOpticalStandard() {
        return this.opticalStandard;
    }

    /**
     * <p>
     * The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink speed,
     * fiber type, and distance to the upstream device. For more information about networking requirements for racks,
     * see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * 
     * @param opticalStandard
     *        The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink
     *        speed, fiber type, and distance to the upstream device. For more information about networking requirements
     *        for racks, see <a href=
     *        "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     *        >Network</a> in the Amazon Web Services Outposts User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpticalStandard
     */

    public RackPhysicalProperties withOpticalStandard(String opticalStandard) {
        setOpticalStandard(opticalStandard);
        return this;
    }

    /**
     * <p>
     * The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink speed,
     * fiber type, and distance to the upstream device. For more information about networking requirements for racks,
     * see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * 
     * @param opticalStandard
     *        The type of optical standard used to attach the Outpost to the network. This field is dependent on uplink
     *        speed, fiber type, and distance to the upstream device. For more information about networking requirements
     *        for racks, see <a href=
     *        "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     *        >Network</a> in the Amazon Web Services Outposts User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpticalStandard
     */

    public RackPhysicalProperties withOpticalStandard(OpticalStandard opticalStandard) {
        this.opticalStandard = opticalStandard.toString();
        return this;
    }

    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000 lbs (907 kg).
     * </p>
     * 
     * @param maximumSupportedWeightLbs
     *        The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000 lbs (907 kg).
     * @see MaximumSupportedWeightLbs
     */

    public void setMaximumSupportedWeightLbs(String maximumSupportedWeightLbs) {
        this.maximumSupportedWeightLbs = maximumSupportedWeightLbs;
    }

    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000 lbs (907 kg).
     * </p>
     * 
     * @return The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000 lbs (907 kg).
     * @see MaximumSupportedWeightLbs
     */

    public String getMaximumSupportedWeightLbs() {
        return this.maximumSupportedWeightLbs;
    }

    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000 lbs (907 kg).
     * </p>
     * 
     * @param maximumSupportedWeightLbs
     *        The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000 lbs (907 kg).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumSupportedWeightLbs
     */

    public RackPhysicalProperties withMaximumSupportedWeightLbs(String maximumSupportedWeightLbs) {
        setMaximumSupportedWeightLbs(maximumSupportedWeightLbs);
        return this;
    }

    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000 lbs (907 kg).
     * </p>
     * 
     * @param maximumSupportedWeightLbs
     *        The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000 lbs (907 kg).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumSupportedWeightLbs
     */

    public RackPhysicalProperties withMaximumSupportedWeightLbs(MaximumSupportedWeightLbs maximumSupportedWeightLbs) {
        this.maximumSupportedWeightLbs = maximumSupportedWeightLbs.toString();
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
        if (getPowerDrawKva() != null)
            sb.append("PowerDrawKva: ").append(getPowerDrawKva()).append(",");
        if (getPowerPhase() != null)
            sb.append("PowerPhase: ").append(getPowerPhase()).append(",");
        if (getPowerConnector() != null)
            sb.append("PowerConnector: ").append(getPowerConnector()).append(",");
        if (getPowerFeedDrop() != null)
            sb.append("PowerFeedDrop: ").append(getPowerFeedDrop()).append(",");
        if (getUplinkGbps() != null)
            sb.append("UplinkGbps: ").append(getUplinkGbps()).append(",");
        if (getUplinkCount() != null)
            sb.append("UplinkCount: ").append(getUplinkCount()).append(",");
        if (getFiberOpticCableType() != null)
            sb.append("FiberOpticCableType: ").append(getFiberOpticCableType()).append(",");
        if (getOpticalStandard() != null)
            sb.append("OpticalStandard: ").append(getOpticalStandard()).append(",");
        if (getMaximumSupportedWeightLbs() != null)
            sb.append("MaximumSupportedWeightLbs: ").append(getMaximumSupportedWeightLbs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RackPhysicalProperties == false)
            return false;
        RackPhysicalProperties other = (RackPhysicalProperties) obj;
        if (other.getPowerDrawKva() == null ^ this.getPowerDrawKva() == null)
            return false;
        if (other.getPowerDrawKva() != null && other.getPowerDrawKva().equals(this.getPowerDrawKva()) == false)
            return false;
        if (other.getPowerPhase() == null ^ this.getPowerPhase() == null)
            return false;
        if (other.getPowerPhase() != null && other.getPowerPhase().equals(this.getPowerPhase()) == false)
            return false;
        if (other.getPowerConnector() == null ^ this.getPowerConnector() == null)
            return false;
        if (other.getPowerConnector() != null && other.getPowerConnector().equals(this.getPowerConnector()) == false)
            return false;
        if (other.getPowerFeedDrop() == null ^ this.getPowerFeedDrop() == null)
            return false;
        if (other.getPowerFeedDrop() != null && other.getPowerFeedDrop().equals(this.getPowerFeedDrop()) == false)
            return false;
        if (other.getUplinkGbps() == null ^ this.getUplinkGbps() == null)
            return false;
        if (other.getUplinkGbps() != null && other.getUplinkGbps().equals(this.getUplinkGbps()) == false)
            return false;
        if (other.getUplinkCount() == null ^ this.getUplinkCount() == null)
            return false;
        if (other.getUplinkCount() != null && other.getUplinkCount().equals(this.getUplinkCount()) == false)
            return false;
        if (other.getFiberOpticCableType() == null ^ this.getFiberOpticCableType() == null)
            return false;
        if (other.getFiberOpticCableType() != null && other.getFiberOpticCableType().equals(this.getFiberOpticCableType()) == false)
            return false;
        if (other.getOpticalStandard() == null ^ this.getOpticalStandard() == null)
            return false;
        if (other.getOpticalStandard() != null && other.getOpticalStandard().equals(this.getOpticalStandard()) == false)
            return false;
        if (other.getMaximumSupportedWeightLbs() == null ^ this.getMaximumSupportedWeightLbs() == null)
            return false;
        if (other.getMaximumSupportedWeightLbs() != null && other.getMaximumSupportedWeightLbs().equals(this.getMaximumSupportedWeightLbs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPowerDrawKva() == null) ? 0 : getPowerDrawKva().hashCode());
        hashCode = prime * hashCode + ((getPowerPhase() == null) ? 0 : getPowerPhase().hashCode());
        hashCode = prime * hashCode + ((getPowerConnector() == null) ? 0 : getPowerConnector().hashCode());
        hashCode = prime * hashCode + ((getPowerFeedDrop() == null) ? 0 : getPowerFeedDrop().hashCode());
        hashCode = prime * hashCode + ((getUplinkGbps() == null) ? 0 : getUplinkGbps().hashCode());
        hashCode = prime * hashCode + ((getUplinkCount() == null) ? 0 : getUplinkCount().hashCode());
        hashCode = prime * hashCode + ((getFiberOpticCableType() == null) ? 0 : getFiberOpticCableType().hashCode());
        hashCode = prime * hashCode + ((getOpticalStandard() == null) ? 0 : getOpticalStandard().hashCode());
        hashCode = prime * hashCode + ((getMaximumSupportedWeightLbs() == null) ? 0 : getMaximumSupportedWeightLbs().hashCode());
        return hashCode;
    }

    @Override
    public RackPhysicalProperties clone() {
        try {
            return (RackPhysicalProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.RackPhysicalPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
