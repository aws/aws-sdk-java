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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Esam
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Esam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Esam implements Serializable, Cloneable, StructuredPojo {

    /** Sent as acquisitionPointIdentity to identify the MediaLive channel to the POIS. */
    private String acquisitionPointId;
    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to
     * embedded SCTE 104/35 messages and does not apply to OOB messages.
     */
    private Integer adAvailOffset;
    /** Documentation update needed */
    private String passwordParam;
    /**
     * The URL of the signal conditioner endpoint on the Placement Opportunity Information System (POIS). MediaLive
     * sends SignalProcessingEvents here when SCTE-35 messages are read.
     */
    private String poisEndpoint;
    /** Documentation update needed */
    private String username;
    /** Optional data sent as zoneIdentity to identify the MediaLive channel to the POIS. */
    private String zoneIdentity;

    /**
     * Sent as acquisitionPointIdentity to identify the MediaLive channel to the POIS.
     * 
     * @param acquisitionPointId
     *        Sent as acquisitionPointIdentity to identify the MediaLive channel to the POIS.
     */

    public void setAcquisitionPointId(String acquisitionPointId) {
        this.acquisitionPointId = acquisitionPointId;
    }

    /**
     * Sent as acquisitionPointIdentity to identify the MediaLive channel to the POIS.
     * 
     * @return Sent as acquisitionPointIdentity to identify the MediaLive channel to the POIS.
     */

    public String getAcquisitionPointId() {
        return this.acquisitionPointId;
    }

    /**
     * Sent as acquisitionPointIdentity to identify the MediaLive channel to the POIS.
     * 
     * @param acquisitionPointId
     *        Sent as acquisitionPointIdentity to identify the MediaLive channel to the POIS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Esam withAcquisitionPointId(String acquisitionPointId) {
        setAcquisitionPointId(acquisitionPointId);
        return this;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to
     * embedded SCTE 104/35 messages and does not apply to OOB messages.
     * 
     * @param adAvailOffset
     *        When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies
     *        to embedded SCTE 104/35 messages and does not apply to OOB messages.
     */

    public void setAdAvailOffset(Integer adAvailOffset) {
        this.adAvailOffset = adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to
     * embedded SCTE 104/35 messages and does not apply to OOB messages.
     * 
     * @return When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies
     *         to embedded SCTE 104/35 messages and does not apply to OOB messages.
     */

    public Integer getAdAvailOffset() {
        return this.adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to
     * embedded SCTE 104/35 messages and does not apply to OOB messages.
     * 
     * @param adAvailOffset
     *        When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies
     *        to embedded SCTE 104/35 messages and does not apply to OOB messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Esam withAdAvailOffset(Integer adAvailOffset) {
        setAdAvailOffset(adAvailOffset);
        return this;
    }

    /**
     * Documentation update needed
     * 
     * @param passwordParam
     *        Documentation update needed
     */

    public void setPasswordParam(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    /**
     * Documentation update needed
     * 
     * @return Documentation update needed
     */

    public String getPasswordParam() {
        return this.passwordParam;
    }

    /**
     * Documentation update needed
     * 
     * @param passwordParam
     *        Documentation update needed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Esam withPasswordParam(String passwordParam) {
        setPasswordParam(passwordParam);
        return this;
    }

    /**
     * The URL of the signal conditioner endpoint on the Placement Opportunity Information System (POIS). MediaLive
     * sends SignalProcessingEvents here when SCTE-35 messages are read.
     * 
     * @param poisEndpoint
     *        The URL of the signal conditioner endpoint on the Placement Opportunity Information System (POIS).
     *        MediaLive sends SignalProcessingEvents here when SCTE-35 messages are read.
     */

    public void setPoisEndpoint(String poisEndpoint) {
        this.poisEndpoint = poisEndpoint;
    }

    /**
     * The URL of the signal conditioner endpoint on the Placement Opportunity Information System (POIS). MediaLive
     * sends SignalProcessingEvents here when SCTE-35 messages are read.
     * 
     * @return The URL of the signal conditioner endpoint on the Placement Opportunity Information System (POIS).
     *         MediaLive sends SignalProcessingEvents here when SCTE-35 messages are read.
     */

    public String getPoisEndpoint() {
        return this.poisEndpoint;
    }

    /**
     * The URL of the signal conditioner endpoint on the Placement Opportunity Information System (POIS). MediaLive
     * sends SignalProcessingEvents here when SCTE-35 messages are read.
     * 
     * @param poisEndpoint
     *        The URL of the signal conditioner endpoint on the Placement Opportunity Information System (POIS).
     *        MediaLive sends SignalProcessingEvents here when SCTE-35 messages are read.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Esam withPoisEndpoint(String poisEndpoint) {
        setPoisEndpoint(poisEndpoint);
        return this;
    }

    /**
     * Documentation update needed
     * 
     * @param username
     *        Documentation update needed
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Documentation update needed
     * 
     * @return Documentation update needed
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * Documentation update needed
     * 
     * @param username
     *        Documentation update needed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Esam withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * Optional data sent as zoneIdentity to identify the MediaLive channel to the POIS.
     * 
     * @param zoneIdentity
     *        Optional data sent as zoneIdentity to identify the MediaLive channel to the POIS.
     */

    public void setZoneIdentity(String zoneIdentity) {
        this.zoneIdentity = zoneIdentity;
    }

    /**
     * Optional data sent as zoneIdentity to identify the MediaLive channel to the POIS.
     * 
     * @return Optional data sent as zoneIdentity to identify the MediaLive channel to the POIS.
     */

    public String getZoneIdentity() {
        return this.zoneIdentity;
    }

    /**
     * Optional data sent as zoneIdentity to identify the MediaLive channel to the POIS.
     * 
     * @param zoneIdentity
     *        Optional data sent as zoneIdentity to identify the MediaLive channel to the POIS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Esam withZoneIdentity(String zoneIdentity) {
        setZoneIdentity(zoneIdentity);
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
        if (getAcquisitionPointId() != null)
            sb.append("AcquisitionPointId: ").append(getAcquisitionPointId()).append(",");
        if (getAdAvailOffset() != null)
            sb.append("AdAvailOffset: ").append(getAdAvailOffset()).append(",");
        if (getPasswordParam() != null)
            sb.append("PasswordParam: ").append(getPasswordParam()).append(",");
        if (getPoisEndpoint() != null)
            sb.append("PoisEndpoint: ").append(getPoisEndpoint()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getZoneIdentity() != null)
            sb.append("ZoneIdentity: ").append(getZoneIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Esam == false)
            return false;
        Esam other = (Esam) obj;
        if (other.getAcquisitionPointId() == null ^ this.getAcquisitionPointId() == null)
            return false;
        if (other.getAcquisitionPointId() != null && other.getAcquisitionPointId().equals(this.getAcquisitionPointId()) == false)
            return false;
        if (other.getAdAvailOffset() == null ^ this.getAdAvailOffset() == null)
            return false;
        if (other.getAdAvailOffset() != null && other.getAdAvailOffset().equals(this.getAdAvailOffset()) == false)
            return false;
        if (other.getPasswordParam() == null ^ this.getPasswordParam() == null)
            return false;
        if (other.getPasswordParam() != null && other.getPasswordParam().equals(this.getPasswordParam()) == false)
            return false;
        if (other.getPoisEndpoint() == null ^ this.getPoisEndpoint() == null)
            return false;
        if (other.getPoisEndpoint() != null && other.getPoisEndpoint().equals(this.getPoisEndpoint()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getZoneIdentity() == null ^ this.getZoneIdentity() == null)
            return false;
        if (other.getZoneIdentity() != null && other.getZoneIdentity().equals(this.getZoneIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcquisitionPointId() == null) ? 0 : getAcquisitionPointId().hashCode());
        hashCode = prime * hashCode + ((getAdAvailOffset() == null) ? 0 : getAdAvailOffset().hashCode());
        hashCode = prime * hashCode + ((getPasswordParam() == null) ? 0 : getPasswordParam().hashCode());
        hashCode = prime * hashCode + ((getPoisEndpoint() == null) ? 0 : getPoisEndpoint().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getZoneIdentity() == null) ? 0 : getZoneIdentity().hashCode());
        return hashCode;
    }

    @Override
    public Esam clone() {
        try {
            return (Esam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.EsamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
