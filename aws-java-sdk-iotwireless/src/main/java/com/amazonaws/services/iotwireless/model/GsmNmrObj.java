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
 * GSM object for network measurement reports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GsmNmrObj" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GsmNmrObj implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * GSM base station identity code (BSIC).
     * </p>
     */
    private Integer bsic;
    /**
     * <p>
     * GSM broadcast control channel.
     * </p>
     */
    private Integer bcch;
    /**
     * <p>
     * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * </p>
     */
    private Integer rxLevel;
    /**
     * <p>
     * Global identity information of the GSM object.
     * </p>
     */
    private GlobalIdentity globalIdentity;

    /**
     * <p>
     * GSM base station identity code (BSIC).
     * </p>
     * 
     * @param bsic
     *        GSM base station identity code (BSIC).
     */

    public void setBsic(Integer bsic) {
        this.bsic = bsic;
    }

    /**
     * <p>
     * GSM base station identity code (BSIC).
     * </p>
     * 
     * @return GSM base station identity code (BSIC).
     */

    public Integer getBsic() {
        return this.bsic;
    }

    /**
     * <p>
     * GSM base station identity code (BSIC).
     * </p>
     * 
     * @param bsic
     *        GSM base station identity code (BSIC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmNmrObj withBsic(Integer bsic) {
        setBsic(bsic);
        return this;
    }

    /**
     * <p>
     * GSM broadcast control channel.
     * </p>
     * 
     * @param bcch
     *        GSM broadcast control channel.
     */

    public void setBcch(Integer bcch) {
        this.bcch = bcch;
    }

    /**
     * <p>
     * GSM broadcast control channel.
     * </p>
     * 
     * @return GSM broadcast control channel.
     */

    public Integer getBcch() {
        return this.bcch;
    }

    /**
     * <p>
     * GSM broadcast control channel.
     * </p>
     * 
     * @param bcch
     *        GSM broadcast control channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmNmrObj withBcch(Integer bcch) {
        setBcch(bcch);
        return this;
    }

    /**
     * <p>
     * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @param rxLevel
     *        Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     */

    public void setRxLevel(Integer rxLevel) {
        this.rxLevel = rxLevel;
    }

    /**
     * <p>
     * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @return Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     */

    public Integer getRxLevel() {
        return this.rxLevel;
    }

    /**
     * <p>
     * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @param rxLevel
     *        Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmNmrObj withRxLevel(Integer rxLevel) {
        setRxLevel(rxLevel);
        return this;
    }

    /**
     * <p>
     * Global identity information of the GSM object.
     * </p>
     * 
     * @param globalIdentity
     *        Global identity information of the GSM object.
     */

    public void setGlobalIdentity(GlobalIdentity globalIdentity) {
        this.globalIdentity = globalIdentity;
    }

    /**
     * <p>
     * Global identity information of the GSM object.
     * </p>
     * 
     * @return Global identity information of the GSM object.
     */

    public GlobalIdentity getGlobalIdentity() {
        return this.globalIdentity;
    }

    /**
     * <p>
     * Global identity information of the GSM object.
     * </p>
     * 
     * @param globalIdentity
     *        Global identity information of the GSM object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmNmrObj withGlobalIdentity(GlobalIdentity globalIdentity) {
        setGlobalIdentity(globalIdentity);
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
        if (getBsic() != null)
            sb.append("Bsic: ").append(getBsic()).append(",");
        if (getBcch() != null)
            sb.append("Bcch: ").append(getBcch()).append(",");
        if (getRxLevel() != null)
            sb.append("RxLevel: ").append(getRxLevel()).append(",");
        if (getGlobalIdentity() != null)
            sb.append("GlobalIdentity: ").append(getGlobalIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GsmNmrObj == false)
            return false;
        GsmNmrObj other = (GsmNmrObj) obj;
        if (other.getBsic() == null ^ this.getBsic() == null)
            return false;
        if (other.getBsic() != null && other.getBsic().equals(this.getBsic()) == false)
            return false;
        if (other.getBcch() == null ^ this.getBcch() == null)
            return false;
        if (other.getBcch() != null && other.getBcch().equals(this.getBcch()) == false)
            return false;
        if (other.getRxLevel() == null ^ this.getRxLevel() == null)
            return false;
        if (other.getRxLevel() != null && other.getRxLevel().equals(this.getRxLevel()) == false)
            return false;
        if (other.getGlobalIdentity() == null ^ this.getGlobalIdentity() == null)
            return false;
        if (other.getGlobalIdentity() != null && other.getGlobalIdentity().equals(this.getGlobalIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBsic() == null) ? 0 : getBsic().hashCode());
        hashCode = prime * hashCode + ((getBcch() == null) ? 0 : getBcch().hashCode());
        hashCode = prime * hashCode + ((getRxLevel() == null) ? 0 : getRxLevel().hashCode());
        hashCode = prime * hashCode + ((getGlobalIdentity() == null) ? 0 : getGlobalIdentity().hashCode());
        return hashCode;
    }

    @Override
    public GsmNmrObj clone() {
        try {
            return (GsmNmrObj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.GsmNmrObjMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
