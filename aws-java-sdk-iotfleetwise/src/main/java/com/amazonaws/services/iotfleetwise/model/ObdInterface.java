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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A network interface that specifies the On-board diagnostic (OBD) II network protocol.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ObdInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObdInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the interface.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the message requesting vehicle data.
     * </p>
     */
    private Integer requestMessageId;
    /**
     * <p>
     * The standard OBD II PID.
     * </p>
     */
    private String obdStandard;
    /**
     * <p>
     * The maximum number message requests per second.
     * </p>
     */
    private Integer pidRequestIntervalSeconds;
    /**
     * <p>
     * The maximum number message requests per diagnostic trouble code per second.
     * </p>
     */
    private Integer dtcRequestIntervalSeconds;
    /**
     * <p>
     * Whether to use extended IDs in the message.
     * </p>
     */
    private Boolean useExtendedIds;
    /**
     * <p>
     * Whether the vehicle has a transmission control module (TCM).
     * </p>
     */
    private Boolean hasTransmissionEcu;

    /**
     * <p>
     * The name of the interface.
     * </p>
     * 
     * @param name
     *        The name of the interface.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the interface.
     * </p>
     * 
     * @return The name of the interface.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the interface.
     * </p>
     * 
     * @param name
     *        The name of the interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdInterface withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the message requesting vehicle data.
     * </p>
     * 
     * @param requestMessageId
     *        The ID of the message requesting vehicle data.
     */

    public void setRequestMessageId(Integer requestMessageId) {
        this.requestMessageId = requestMessageId;
    }

    /**
     * <p>
     * The ID of the message requesting vehicle data.
     * </p>
     * 
     * @return The ID of the message requesting vehicle data.
     */

    public Integer getRequestMessageId() {
        return this.requestMessageId;
    }

    /**
     * <p>
     * The ID of the message requesting vehicle data.
     * </p>
     * 
     * @param requestMessageId
     *        The ID of the message requesting vehicle data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdInterface withRequestMessageId(Integer requestMessageId) {
        setRequestMessageId(requestMessageId);
        return this;
    }

    /**
     * <p>
     * The standard OBD II PID.
     * </p>
     * 
     * @param obdStandard
     *        The standard OBD II PID.
     */

    public void setObdStandard(String obdStandard) {
        this.obdStandard = obdStandard;
    }

    /**
     * <p>
     * The standard OBD II PID.
     * </p>
     * 
     * @return The standard OBD II PID.
     */

    public String getObdStandard() {
        return this.obdStandard;
    }

    /**
     * <p>
     * The standard OBD II PID.
     * </p>
     * 
     * @param obdStandard
     *        The standard OBD II PID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdInterface withObdStandard(String obdStandard) {
        setObdStandard(obdStandard);
        return this;
    }

    /**
     * <p>
     * The maximum number message requests per second.
     * </p>
     * 
     * @param pidRequestIntervalSeconds
     *        The maximum number message requests per second.
     */

    public void setPidRequestIntervalSeconds(Integer pidRequestIntervalSeconds) {
        this.pidRequestIntervalSeconds = pidRequestIntervalSeconds;
    }

    /**
     * <p>
     * The maximum number message requests per second.
     * </p>
     * 
     * @return The maximum number message requests per second.
     */

    public Integer getPidRequestIntervalSeconds() {
        return this.pidRequestIntervalSeconds;
    }

    /**
     * <p>
     * The maximum number message requests per second.
     * </p>
     * 
     * @param pidRequestIntervalSeconds
     *        The maximum number message requests per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdInterface withPidRequestIntervalSeconds(Integer pidRequestIntervalSeconds) {
        setPidRequestIntervalSeconds(pidRequestIntervalSeconds);
        return this;
    }

    /**
     * <p>
     * The maximum number message requests per diagnostic trouble code per second.
     * </p>
     * 
     * @param dtcRequestIntervalSeconds
     *        The maximum number message requests per diagnostic trouble code per second.
     */

    public void setDtcRequestIntervalSeconds(Integer dtcRequestIntervalSeconds) {
        this.dtcRequestIntervalSeconds = dtcRequestIntervalSeconds;
    }

    /**
     * <p>
     * The maximum number message requests per diagnostic trouble code per second.
     * </p>
     * 
     * @return The maximum number message requests per diagnostic trouble code per second.
     */

    public Integer getDtcRequestIntervalSeconds() {
        return this.dtcRequestIntervalSeconds;
    }

    /**
     * <p>
     * The maximum number message requests per diagnostic trouble code per second.
     * </p>
     * 
     * @param dtcRequestIntervalSeconds
     *        The maximum number message requests per diagnostic trouble code per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdInterface withDtcRequestIntervalSeconds(Integer dtcRequestIntervalSeconds) {
        setDtcRequestIntervalSeconds(dtcRequestIntervalSeconds);
        return this;
    }

    /**
     * <p>
     * Whether to use extended IDs in the message.
     * </p>
     * 
     * @param useExtendedIds
     *        Whether to use extended IDs in the message.
     */

    public void setUseExtendedIds(Boolean useExtendedIds) {
        this.useExtendedIds = useExtendedIds;
    }

    /**
     * <p>
     * Whether to use extended IDs in the message.
     * </p>
     * 
     * @return Whether to use extended IDs in the message.
     */

    public Boolean getUseExtendedIds() {
        return this.useExtendedIds;
    }

    /**
     * <p>
     * Whether to use extended IDs in the message.
     * </p>
     * 
     * @param useExtendedIds
     *        Whether to use extended IDs in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdInterface withUseExtendedIds(Boolean useExtendedIds) {
        setUseExtendedIds(useExtendedIds);
        return this;
    }

    /**
     * <p>
     * Whether to use extended IDs in the message.
     * </p>
     * 
     * @return Whether to use extended IDs in the message.
     */

    public Boolean isUseExtendedIds() {
        return this.useExtendedIds;
    }

    /**
     * <p>
     * Whether the vehicle has a transmission control module (TCM).
     * </p>
     * 
     * @param hasTransmissionEcu
     *        Whether the vehicle has a transmission control module (TCM).
     */

    public void setHasTransmissionEcu(Boolean hasTransmissionEcu) {
        this.hasTransmissionEcu = hasTransmissionEcu;
    }

    /**
     * <p>
     * Whether the vehicle has a transmission control module (TCM).
     * </p>
     * 
     * @return Whether the vehicle has a transmission control module (TCM).
     */

    public Boolean getHasTransmissionEcu() {
        return this.hasTransmissionEcu;
    }

    /**
     * <p>
     * Whether the vehicle has a transmission control module (TCM).
     * </p>
     * 
     * @param hasTransmissionEcu
     *        Whether the vehicle has a transmission control module (TCM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdInterface withHasTransmissionEcu(Boolean hasTransmissionEcu) {
        setHasTransmissionEcu(hasTransmissionEcu);
        return this;
    }

    /**
     * <p>
     * Whether the vehicle has a transmission control module (TCM).
     * </p>
     * 
     * @return Whether the vehicle has a transmission control module (TCM).
     */

    public Boolean isHasTransmissionEcu() {
        return this.hasTransmissionEcu;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequestMessageId() != null)
            sb.append("RequestMessageId: ").append(getRequestMessageId()).append(",");
        if (getObdStandard() != null)
            sb.append("ObdStandard: ").append(getObdStandard()).append(",");
        if (getPidRequestIntervalSeconds() != null)
            sb.append("PidRequestIntervalSeconds: ").append(getPidRequestIntervalSeconds()).append(",");
        if (getDtcRequestIntervalSeconds() != null)
            sb.append("DtcRequestIntervalSeconds: ").append(getDtcRequestIntervalSeconds()).append(",");
        if (getUseExtendedIds() != null)
            sb.append("UseExtendedIds: ").append(getUseExtendedIds()).append(",");
        if (getHasTransmissionEcu() != null)
            sb.append("HasTransmissionEcu: ").append(getHasTransmissionEcu());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObdInterface == false)
            return false;
        ObdInterface other = (ObdInterface) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequestMessageId() == null ^ this.getRequestMessageId() == null)
            return false;
        if (other.getRequestMessageId() != null && other.getRequestMessageId().equals(this.getRequestMessageId()) == false)
            return false;
        if (other.getObdStandard() == null ^ this.getObdStandard() == null)
            return false;
        if (other.getObdStandard() != null && other.getObdStandard().equals(this.getObdStandard()) == false)
            return false;
        if (other.getPidRequestIntervalSeconds() == null ^ this.getPidRequestIntervalSeconds() == null)
            return false;
        if (other.getPidRequestIntervalSeconds() != null && other.getPidRequestIntervalSeconds().equals(this.getPidRequestIntervalSeconds()) == false)
            return false;
        if (other.getDtcRequestIntervalSeconds() == null ^ this.getDtcRequestIntervalSeconds() == null)
            return false;
        if (other.getDtcRequestIntervalSeconds() != null && other.getDtcRequestIntervalSeconds().equals(this.getDtcRequestIntervalSeconds()) == false)
            return false;
        if (other.getUseExtendedIds() == null ^ this.getUseExtendedIds() == null)
            return false;
        if (other.getUseExtendedIds() != null && other.getUseExtendedIds().equals(this.getUseExtendedIds()) == false)
            return false;
        if (other.getHasTransmissionEcu() == null ^ this.getHasTransmissionEcu() == null)
            return false;
        if (other.getHasTransmissionEcu() != null && other.getHasTransmissionEcu().equals(this.getHasTransmissionEcu()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequestMessageId() == null) ? 0 : getRequestMessageId().hashCode());
        hashCode = prime * hashCode + ((getObdStandard() == null) ? 0 : getObdStandard().hashCode());
        hashCode = prime * hashCode + ((getPidRequestIntervalSeconds() == null) ? 0 : getPidRequestIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getDtcRequestIntervalSeconds() == null) ? 0 : getDtcRequestIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getUseExtendedIds() == null) ? 0 : getUseExtendedIds().hashCode());
        hashCode = prime * hashCode + ((getHasTransmissionEcu() == null) ? 0 : getHasTransmissionEcu().hashCode());
        return hashCode;
    }

    @Override
    public ObdInterface clone() {
        try {
            return (ObdInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.ObdInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
