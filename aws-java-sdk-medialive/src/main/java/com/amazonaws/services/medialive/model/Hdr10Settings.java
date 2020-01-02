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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Hdr10 Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Hdr10Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Hdr10Settings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Maximum Content Light Level An integer metadata value defining the maximum light level, in nits, of any single
     * pixel within an encoded HDR video stream or file.
     */
    private Integer maxCll;
    /**
     * Maximum Frame Average Light Level An integer metadata value defining the maximum average light level, in nits,
     * for any single frame within an encoded HDR video stream or file.
     */
    private Integer maxFall;

    /**
     * Maximum Content Light Level An integer metadata value defining the maximum light level, in nits, of any single
     * pixel within an encoded HDR video stream or file.
     * 
     * @param maxCll
     *        Maximum Content Light Level An integer metadata value defining the maximum light level, in nits, of any
     *        single pixel within an encoded HDR video stream or file.
     */

    public void setMaxCll(Integer maxCll) {
        this.maxCll = maxCll;
    }

    /**
     * Maximum Content Light Level An integer metadata value defining the maximum light level, in nits, of any single
     * pixel within an encoded HDR video stream or file.
     * 
     * @return Maximum Content Light Level An integer metadata value defining the maximum light level, in nits, of any
     *         single pixel within an encoded HDR video stream or file.
     */

    public Integer getMaxCll() {
        return this.maxCll;
    }

    /**
     * Maximum Content Light Level An integer metadata value defining the maximum light level, in nits, of any single
     * pixel within an encoded HDR video stream or file.
     * 
     * @param maxCll
     *        Maximum Content Light Level An integer metadata value defining the maximum light level, in nits, of any
     *        single pixel within an encoded HDR video stream or file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Settings withMaxCll(Integer maxCll) {
        setMaxCll(maxCll);
        return this;
    }

    /**
     * Maximum Frame Average Light Level An integer metadata value defining the maximum average light level, in nits,
     * for any single frame within an encoded HDR video stream or file.
     * 
     * @param maxFall
     *        Maximum Frame Average Light Level An integer metadata value defining the maximum average light level, in
     *        nits, for any single frame within an encoded HDR video stream or file.
     */

    public void setMaxFall(Integer maxFall) {
        this.maxFall = maxFall;
    }

    /**
     * Maximum Frame Average Light Level An integer metadata value defining the maximum average light level, in nits,
     * for any single frame within an encoded HDR video stream or file.
     * 
     * @return Maximum Frame Average Light Level An integer metadata value defining the maximum average light level, in
     *         nits, for any single frame within an encoded HDR video stream or file.
     */

    public Integer getMaxFall() {
        return this.maxFall;
    }

    /**
     * Maximum Frame Average Light Level An integer metadata value defining the maximum average light level, in nits,
     * for any single frame within an encoded HDR video stream or file.
     * 
     * @param maxFall
     *        Maximum Frame Average Light Level An integer metadata value defining the maximum average light level, in
     *        nits, for any single frame within an encoded HDR video stream or file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Settings withMaxFall(Integer maxFall) {
        setMaxFall(maxFall);
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
        if (getMaxCll() != null)
            sb.append("MaxCll: ").append(getMaxCll()).append(",");
        if (getMaxFall() != null)
            sb.append("MaxFall: ").append(getMaxFall());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hdr10Settings == false)
            return false;
        Hdr10Settings other = (Hdr10Settings) obj;
        if (other.getMaxCll() == null ^ this.getMaxCll() == null)
            return false;
        if (other.getMaxCll() != null && other.getMaxCll().equals(this.getMaxCll()) == false)
            return false;
        if (other.getMaxFall() == null ^ this.getMaxFall() == null)
            return false;
        if (other.getMaxFall() != null && other.getMaxFall().equals(this.getMaxFall()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxCll() == null) ? 0 : getMaxCll().hashCode());
        hashCode = prime * hashCode + ((getMaxFall() == null) ? 0 : getMaxFall().hashCode());
        return hashCode;
    }

    @Override
    public Hdr10Settings clone() {
        try {
            return (Hdr10Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Hdr10SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
