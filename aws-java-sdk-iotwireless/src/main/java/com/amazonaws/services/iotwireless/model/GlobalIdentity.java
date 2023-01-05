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
 * Global identity information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GlobalIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Location area code of the global identity.
     * </p>
     */
    private Integer lac;
    /**
     * <p>
     * GERAN (GSM EDGE Radio Access Network) cell global identifier.
     * </p>
     */
    private Integer geranCid;

    /**
     * <p>
     * Location area code of the global identity.
     * </p>
     * 
     * @param lac
     *        Location area code of the global identity.
     */

    public void setLac(Integer lac) {
        this.lac = lac;
    }

    /**
     * <p>
     * Location area code of the global identity.
     * </p>
     * 
     * @return Location area code of the global identity.
     */

    public Integer getLac() {
        return this.lac;
    }

    /**
     * <p>
     * Location area code of the global identity.
     * </p>
     * 
     * @param lac
     *        Location area code of the global identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalIdentity withLac(Integer lac) {
        setLac(lac);
        return this;
    }

    /**
     * <p>
     * GERAN (GSM EDGE Radio Access Network) cell global identifier.
     * </p>
     * 
     * @param geranCid
     *        GERAN (GSM EDGE Radio Access Network) cell global identifier.
     */

    public void setGeranCid(Integer geranCid) {
        this.geranCid = geranCid;
    }

    /**
     * <p>
     * GERAN (GSM EDGE Radio Access Network) cell global identifier.
     * </p>
     * 
     * @return GERAN (GSM EDGE Radio Access Network) cell global identifier.
     */

    public Integer getGeranCid() {
        return this.geranCid;
    }

    /**
     * <p>
     * GERAN (GSM EDGE Radio Access Network) cell global identifier.
     * </p>
     * 
     * @param geranCid
     *        GERAN (GSM EDGE Radio Access Network) cell global identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalIdentity withGeranCid(Integer geranCid) {
        setGeranCid(geranCid);
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
        if (getLac() != null)
            sb.append("Lac: ").append(getLac()).append(",");
        if (getGeranCid() != null)
            sb.append("GeranCid: ").append(getGeranCid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalIdentity == false)
            return false;
        GlobalIdentity other = (GlobalIdentity) obj;
        if (other.getLac() == null ^ this.getLac() == null)
            return false;
        if (other.getLac() != null && other.getLac().equals(this.getLac()) == false)
            return false;
        if (other.getGeranCid() == null ^ this.getGeranCid() == null)
            return false;
        if (other.getGeranCid() != null && other.getGeranCid().equals(this.getGeranCid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLac() == null) ? 0 : getLac().hashCode());
        hashCode = prime * hashCode + ((getGeranCid() == null) ? 0 : getGeranCid().hashCode());
        return hashCode;
    }

    @Override
    public GlobalIdentity clone() {
        try {
            return (GlobalIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.GlobalIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
