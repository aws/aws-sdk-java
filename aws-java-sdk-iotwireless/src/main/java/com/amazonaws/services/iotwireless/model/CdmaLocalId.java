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
 * CDMA local ID information, which corresponds to the local identification parameters of a CDMA cell.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CdmaLocalId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CdmaLocalId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Pseudo-noise offset, which is a characteristic of the signal from a cell on a radio tower.
     * </p>
     */
    private Integer pnOffset;
    /**
     * <p>
     * CDMA channel information.
     * </p>
     */
    private Integer cdmaChannel;

    /**
     * <p>
     * Pseudo-noise offset, which is a characteristic of the signal from a cell on a radio tower.
     * </p>
     * 
     * @param pnOffset
     *        Pseudo-noise offset, which is a characteristic of the signal from a cell on a radio tower.
     */

    public void setPnOffset(Integer pnOffset) {
        this.pnOffset = pnOffset;
    }

    /**
     * <p>
     * Pseudo-noise offset, which is a characteristic of the signal from a cell on a radio tower.
     * </p>
     * 
     * @return Pseudo-noise offset, which is a characteristic of the signal from a cell on a radio tower.
     */

    public Integer getPnOffset() {
        return this.pnOffset;
    }

    /**
     * <p>
     * Pseudo-noise offset, which is a characteristic of the signal from a cell on a radio tower.
     * </p>
     * 
     * @param pnOffset
     *        Pseudo-noise offset, which is a characteristic of the signal from a cell on a radio tower.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaLocalId withPnOffset(Integer pnOffset) {
        setPnOffset(pnOffset);
        return this;
    }

    /**
     * <p>
     * CDMA channel information.
     * </p>
     * 
     * @param cdmaChannel
     *        CDMA channel information.
     */

    public void setCdmaChannel(Integer cdmaChannel) {
        this.cdmaChannel = cdmaChannel;
    }

    /**
     * <p>
     * CDMA channel information.
     * </p>
     * 
     * @return CDMA channel information.
     */

    public Integer getCdmaChannel() {
        return this.cdmaChannel;
    }

    /**
     * <p>
     * CDMA channel information.
     * </p>
     * 
     * @param cdmaChannel
     *        CDMA channel information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaLocalId withCdmaChannel(Integer cdmaChannel) {
        setCdmaChannel(cdmaChannel);
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
        if (getPnOffset() != null)
            sb.append("PnOffset: ").append(getPnOffset()).append(",");
        if (getCdmaChannel() != null)
            sb.append("CdmaChannel: ").append(getCdmaChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CdmaLocalId == false)
            return false;
        CdmaLocalId other = (CdmaLocalId) obj;
        if (other.getPnOffset() == null ^ this.getPnOffset() == null)
            return false;
        if (other.getPnOffset() != null && other.getPnOffset().equals(this.getPnOffset()) == false)
            return false;
        if (other.getCdmaChannel() == null ^ this.getCdmaChannel() == null)
            return false;
        if (other.getCdmaChannel() != null && other.getCdmaChannel().equals(this.getCdmaChannel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPnOffset() == null) ? 0 : getPnOffset().hashCode());
        hashCode = prime * hashCode + ((getCdmaChannel() == null) ? 0 : getCdmaChannel().hashCode());
        return hashCode;
    }

    @Override
    public CdmaLocalId clone() {
        try {
            return (CdmaLocalId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.CdmaLocalIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
