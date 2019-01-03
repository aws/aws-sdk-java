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
 * Corresponds to SCTE-35 delivery_not_restricted_flag parameter. To declare delivery restrictions, include this element
 * and its four "restriction" flags. To declare that there are no restrictions, omit this element.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte35DeliveryRestrictions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35DeliveryRestrictions implements Serializable, Cloneable, StructuredPojo {

    /** Corresponds to SCTE-35 archive_allowed_flag. */
    private String archiveAllowedFlag;
    /** Corresponds to SCTE-35 device_restrictions parameter. */
    private String deviceRestrictions;
    /** Corresponds to SCTE-35 no_regional_blackout_flag parameter. */
    private String noRegionalBlackoutFlag;
    /** Corresponds to SCTE-35 web_delivery_allowed_flag parameter. */
    private String webDeliveryAllowedFlag;

    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * 
     * @param archiveAllowedFlag
     *        Corresponds to SCTE-35 archive_allowed_flag.
     * @see Scte35ArchiveAllowedFlag
     */

    public void setArchiveAllowedFlag(String archiveAllowedFlag) {
        this.archiveAllowedFlag = archiveAllowedFlag;
    }

    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * 
     * @return Corresponds to SCTE-35 archive_allowed_flag.
     * @see Scte35ArchiveAllowedFlag
     */

    public String getArchiveAllowedFlag() {
        return this.archiveAllowedFlag;
    }

    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * 
     * @param archiveAllowedFlag
     *        Corresponds to SCTE-35 archive_allowed_flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35ArchiveAllowedFlag
     */

    public Scte35DeliveryRestrictions withArchiveAllowedFlag(String archiveAllowedFlag) {
        setArchiveAllowedFlag(archiveAllowedFlag);
        return this;
    }

    /**
     * Corresponds to SCTE-35 archive_allowed_flag.
     * 
     * @param archiveAllowedFlag
     *        Corresponds to SCTE-35 archive_allowed_flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35ArchiveAllowedFlag
     */

    public Scte35DeliveryRestrictions withArchiveAllowedFlag(Scte35ArchiveAllowedFlag archiveAllowedFlag) {
        this.archiveAllowedFlag = archiveAllowedFlag.toString();
        return this;
    }

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * 
     * @param deviceRestrictions
     *        Corresponds to SCTE-35 device_restrictions parameter.
     * @see Scte35DeviceRestrictions
     */

    public void setDeviceRestrictions(String deviceRestrictions) {
        this.deviceRestrictions = deviceRestrictions;
    }

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * 
     * @return Corresponds to SCTE-35 device_restrictions parameter.
     * @see Scte35DeviceRestrictions
     */

    public String getDeviceRestrictions() {
        return this.deviceRestrictions;
    }

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * 
     * @param deviceRestrictions
     *        Corresponds to SCTE-35 device_restrictions parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35DeviceRestrictions
     */

    public Scte35DeliveryRestrictions withDeviceRestrictions(String deviceRestrictions) {
        setDeviceRestrictions(deviceRestrictions);
        return this;
    }

    /**
     * Corresponds to SCTE-35 device_restrictions parameter.
     * 
     * @param deviceRestrictions
     *        Corresponds to SCTE-35 device_restrictions parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35DeviceRestrictions
     */

    public Scte35DeliveryRestrictions withDeviceRestrictions(Scte35DeviceRestrictions deviceRestrictions) {
        this.deviceRestrictions = deviceRestrictions.toString();
        return this;
    }

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * 
     * @param noRegionalBlackoutFlag
     *        Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * @see Scte35NoRegionalBlackoutFlag
     */

    public void setNoRegionalBlackoutFlag(String noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag;
    }

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * 
     * @return Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * @see Scte35NoRegionalBlackoutFlag
     */

    public String getNoRegionalBlackoutFlag() {
        return this.noRegionalBlackoutFlag;
    }

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * 
     * @param noRegionalBlackoutFlag
     *        Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35NoRegionalBlackoutFlag
     */

    public Scte35DeliveryRestrictions withNoRegionalBlackoutFlag(String noRegionalBlackoutFlag) {
        setNoRegionalBlackoutFlag(noRegionalBlackoutFlag);
        return this;
    }

    /**
     * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * 
     * @param noRegionalBlackoutFlag
     *        Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35NoRegionalBlackoutFlag
     */

    public Scte35DeliveryRestrictions withNoRegionalBlackoutFlag(Scte35NoRegionalBlackoutFlag noRegionalBlackoutFlag) {
        this.noRegionalBlackoutFlag = noRegionalBlackoutFlag.toString();
        return this;
    }

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * 
     * @param webDeliveryAllowedFlag
     *        Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * @see Scte35WebDeliveryAllowedFlag
     */

    public void setWebDeliveryAllowedFlag(String webDeliveryAllowedFlag) {
        this.webDeliveryAllowedFlag = webDeliveryAllowedFlag;
    }

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * 
     * @return Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * @see Scte35WebDeliveryAllowedFlag
     */

    public String getWebDeliveryAllowedFlag() {
        return this.webDeliveryAllowedFlag;
    }

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * 
     * @param webDeliveryAllowedFlag
     *        Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35WebDeliveryAllowedFlag
     */

    public Scte35DeliveryRestrictions withWebDeliveryAllowedFlag(String webDeliveryAllowedFlag) {
        setWebDeliveryAllowedFlag(webDeliveryAllowedFlag);
        return this;
    }

    /**
     * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * 
     * @param webDeliveryAllowedFlag
     *        Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35WebDeliveryAllowedFlag
     */

    public Scte35DeliveryRestrictions withWebDeliveryAllowedFlag(Scte35WebDeliveryAllowedFlag webDeliveryAllowedFlag) {
        this.webDeliveryAllowedFlag = webDeliveryAllowedFlag.toString();
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
        if (getArchiveAllowedFlag() != null)
            sb.append("ArchiveAllowedFlag: ").append(getArchiveAllowedFlag()).append(",");
        if (getDeviceRestrictions() != null)
            sb.append("DeviceRestrictions: ").append(getDeviceRestrictions()).append(",");
        if (getNoRegionalBlackoutFlag() != null)
            sb.append("NoRegionalBlackoutFlag: ").append(getNoRegionalBlackoutFlag()).append(",");
        if (getWebDeliveryAllowedFlag() != null)
            sb.append("WebDeliveryAllowedFlag: ").append(getWebDeliveryAllowedFlag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35DeliveryRestrictions == false)
            return false;
        Scte35DeliveryRestrictions other = (Scte35DeliveryRestrictions) obj;
        if (other.getArchiveAllowedFlag() == null ^ this.getArchiveAllowedFlag() == null)
            return false;
        if (other.getArchiveAllowedFlag() != null && other.getArchiveAllowedFlag().equals(this.getArchiveAllowedFlag()) == false)
            return false;
        if (other.getDeviceRestrictions() == null ^ this.getDeviceRestrictions() == null)
            return false;
        if (other.getDeviceRestrictions() != null && other.getDeviceRestrictions().equals(this.getDeviceRestrictions()) == false)
            return false;
        if (other.getNoRegionalBlackoutFlag() == null ^ this.getNoRegionalBlackoutFlag() == null)
            return false;
        if (other.getNoRegionalBlackoutFlag() != null && other.getNoRegionalBlackoutFlag().equals(this.getNoRegionalBlackoutFlag()) == false)
            return false;
        if (other.getWebDeliveryAllowedFlag() == null ^ this.getWebDeliveryAllowedFlag() == null)
            return false;
        if (other.getWebDeliveryAllowedFlag() != null && other.getWebDeliveryAllowedFlag().equals(this.getWebDeliveryAllowedFlag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveAllowedFlag() == null) ? 0 : getArchiveAllowedFlag().hashCode());
        hashCode = prime * hashCode + ((getDeviceRestrictions() == null) ? 0 : getDeviceRestrictions().hashCode());
        hashCode = prime * hashCode + ((getNoRegionalBlackoutFlag() == null) ? 0 : getNoRegionalBlackoutFlag().hashCode());
        hashCode = prime * hashCode + ((getWebDeliveryAllowedFlag() == null) ? 0 : getWebDeliveryAllowedFlag().hashCode());
        return hashCode;
    }

    @Override
    public Scte35DeliveryRestrictions clone() {
        try {
            return (Scte35DeliveryRestrictions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Scte35DeliveryRestrictionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
