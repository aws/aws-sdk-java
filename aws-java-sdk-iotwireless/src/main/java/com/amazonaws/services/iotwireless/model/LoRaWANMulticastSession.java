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
 * The LoRaWAN information used with the multicast session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANMulticastSession"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANMulticastSession implements Serializable, Cloneable, StructuredPojo {

    private Integer dlDr;

    private Integer dlFreq;

    private java.util.Date sessionStartTime;

    private Integer sessionTimeout;

    /**
     * @param dlDr
     */

    public void setDlDr(Integer dlDr) {
        this.dlDr = dlDr;
    }

    /**
     * @return
     */

    public Integer getDlDr() {
        return this.dlDr;
    }

    /**
     * @param dlDr
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANMulticastSession withDlDr(Integer dlDr) {
        setDlDr(dlDr);
        return this;
    }

    /**
     * @param dlFreq
     */

    public void setDlFreq(Integer dlFreq) {
        this.dlFreq = dlFreq;
    }

    /**
     * @return
     */

    public Integer getDlFreq() {
        return this.dlFreq;
    }

    /**
     * @param dlFreq
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANMulticastSession withDlFreq(Integer dlFreq) {
        setDlFreq(dlFreq);
        return this;
    }

    /**
     * @param sessionStartTime
     */

    public void setSessionStartTime(java.util.Date sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    /**
     * @return
     */

    public java.util.Date getSessionStartTime() {
        return this.sessionStartTime;
    }

    /**
     * @param sessionStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANMulticastSession withSessionStartTime(java.util.Date sessionStartTime) {
        setSessionStartTime(sessionStartTime);
        return this;
    }

    /**
     * @param sessionTimeout
     */

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    /**
     * @return
     */

    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    /**
     * @param sessionTimeout
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANMulticastSession withSessionTimeout(Integer sessionTimeout) {
        setSessionTimeout(sessionTimeout);
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
        if (getDlDr() != null)
            sb.append("DlDr: ").append(getDlDr()).append(",");
        if (getDlFreq() != null)
            sb.append("DlFreq: ").append(getDlFreq()).append(",");
        if (getSessionStartTime() != null)
            sb.append("SessionStartTime: ").append(getSessionStartTime()).append(",");
        if (getSessionTimeout() != null)
            sb.append("SessionTimeout: ").append(getSessionTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANMulticastSession == false)
            return false;
        LoRaWANMulticastSession other = (LoRaWANMulticastSession) obj;
        if (other.getDlDr() == null ^ this.getDlDr() == null)
            return false;
        if (other.getDlDr() != null && other.getDlDr().equals(this.getDlDr()) == false)
            return false;
        if (other.getDlFreq() == null ^ this.getDlFreq() == null)
            return false;
        if (other.getDlFreq() != null && other.getDlFreq().equals(this.getDlFreq()) == false)
            return false;
        if (other.getSessionStartTime() == null ^ this.getSessionStartTime() == null)
            return false;
        if (other.getSessionStartTime() != null && other.getSessionStartTime().equals(this.getSessionStartTime()) == false)
            return false;
        if (other.getSessionTimeout() == null ^ this.getSessionTimeout() == null)
            return false;
        if (other.getSessionTimeout() != null && other.getSessionTimeout().equals(this.getSessionTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDlDr() == null) ? 0 : getDlDr().hashCode());
        hashCode = prime * hashCode + ((getDlFreq() == null) ? 0 : getDlFreq().hashCode());
        hashCode = prime * hashCode + ((getSessionStartTime() == null) ? 0 : getSessionStartTime().hashCode());
        hashCode = prime * hashCode + ((getSessionTimeout() == null) ? 0 : getSessionTimeout().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANMulticastSession clone() {
        try {
            return (LoRaWANMulticastSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANMulticastSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
