/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ABP device object for LoRaWAN specification v1.1
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AbpV1_1" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbpV11 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DevAddr value.
     * </p>
     */
    private String devAddr;
    /**
     * <p>
     * Session keys for ABP v1.1
     * </p>
     */
    private SessionKeysAbpV11 sessionKeys;

    /**
     * <p>
     * The DevAddr value.
     * </p>
     * 
     * @param devAddr
     *        The DevAddr value.
     */

    public void setDevAddr(String devAddr) {
        this.devAddr = devAddr;
    }

    /**
     * <p>
     * The DevAddr value.
     * </p>
     * 
     * @return The DevAddr value.
     */

    public String getDevAddr() {
        return this.devAddr;
    }

    /**
     * <p>
     * The DevAddr value.
     * </p>
     * 
     * @param devAddr
     *        The DevAddr value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbpV11 withDevAddr(String devAddr) {
        setDevAddr(devAddr);
        return this;
    }

    /**
     * <p>
     * Session keys for ABP v1.1
     * </p>
     * 
     * @param sessionKeys
     *        Session keys for ABP v1.1
     */

    public void setSessionKeys(SessionKeysAbpV11 sessionKeys) {
        this.sessionKeys = sessionKeys;
    }

    /**
     * <p>
     * Session keys for ABP v1.1
     * </p>
     * 
     * @return Session keys for ABP v1.1
     */

    public SessionKeysAbpV11 getSessionKeys() {
        return this.sessionKeys;
    }

    /**
     * <p>
     * Session keys for ABP v1.1
     * </p>
     * 
     * @param sessionKeys
     *        Session keys for ABP v1.1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbpV11 withSessionKeys(SessionKeysAbpV11 sessionKeys) {
        setSessionKeys(sessionKeys);
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
        if (getDevAddr() != null)
            sb.append("DevAddr: ").append(getDevAddr()).append(",");
        if (getSessionKeys() != null)
            sb.append("SessionKeys: ").append(getSessionKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbpV11 == false)
            return false;
        AbpV11 other = (AbpV11) obj;
        if (other.getDevAddr() == null ^ this.getDevAddr() == null)
            return false;
        if (other.getDevAddr() != null && other.getDevAddr().equals(this.getDevAddr()) == false)
            return false;
        if (other.getSessionKeys() == null ^ this.getSessionKeys() == null)
            return false;
        if (other.getSessionKeys() != null && other.getSessionKeys().equals(this.getSessionKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevAddr() == null) ? 0 : getDevAddr().hashCode());
        hashCode = prime * hashCode + ((getSessionKeys() == null) ? 0 : getSessionKeys().hashCode());
        return hashCode;
    }

    @Override
    public AbpV11 clone() {
        try {
            return (AbpV11) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.AbpV11Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
