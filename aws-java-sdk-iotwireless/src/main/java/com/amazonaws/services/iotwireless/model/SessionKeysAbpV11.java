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
 * Session keys for ABP v1.1
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SessionKeysAbpV1_1" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionKeysAbpV11 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The FNwkSIntKey value.
     * </p>
     */
    private String fNwkSIntKey;
    /**
     * <p>
     * The SNwkSIntKey value.
     * </p>
     */
    private String sNwkSIntKey;
    /**
     * <p>
     * The NwkSEncKey value.
     * </p>
     */
    private String nwkSEncKey;
    /**
     * <p>
     * The AppSKey value.
     * </p>
     */
    private String appSKey;

    /**
     * <p>
     * The FNwkSIntKey value.
     * </p>
     * 
     * @param fNwkSIntKey
     *        The FNwkSIntKey value.
     */

    public void setFNwkSIntKey(String fNwkSIntKey) {
        this.fNwkSIntKey = fNwkSIntKey;
    }

    /**
     * <p>
     * The FNwkSIntKey value.
     * </p>
     * 
     * @return The FNwkSIntKey value.
     */

    public String getFNwkSIntKey() {
        return this.fNwkSIntKey;
    }

    /**
     * <p>
     * The FNwkSIntKey value.
     * </p>
     * 
     * @param fNwkSIntKey
     *        The FNwkSIntKey value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeysAbpV11 withFNwkSIntKey(String fNwkSIntKey) {
        setFNwkSIntKey(fNwkSIntKey);
        return this;
    }

    /**
     * <p>
     * The SNwkSIntKey value.
     * </p>
     * 
     * @param sNwkSIntKey
     *        The SNwkSIntKey value.
     */

    public void setSNwkSIntKey(String sNwkSIntKey) {
        this.sNwkSIntKey = sNwkSIntKey;
    }

    /**
     * <p>
     * The SNwkSIntKey value.
     * </p>
     * 
     * @return The SNwkSIntKey value.
     */

    public String getSNwkSIntKey() {
        return this.sNwkSIntKey;
    }

    /**
     * <p>
     * The SNwkSIntKey value.
     * </p>
     * 
     * @param sNwkSIntKey
     *        The SNwkSIntKey value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeysAbpV11 withSNwkSIntKey(String sNwkSIntKey) {
        setSNwkSIntKey(sNwkSIntKey);
        return this;
    }

    /**
     * <p>
     * The NwkSEncKey value.
     * </p>
     * 
     * @param nwkSEncKey
     *        The NwkSEncKey value.
     */

    public void setNwkSEncKey(String nwkSEncKey) {
        this.nwkSEncKey = nwkSEncKey;
    }

    /**
     * <p>
     * The NwkSEncKey value.
     * </p>
     * 
     * @return The NwkSEncKey value.
     */

    public String getNwkSEncKey() {
        return this.nwkSEncKey;
    }

    /**
     * <p>
     * The NwkSEncKey value.
     * </p>
     * 
     * @param nwkSEncKey
     *        The NwkSEncKey value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeysAbpV11 withNwkSEncKey(String nwkSEncKey) {
        setNwkSEncKey(nwkSEncKey);
        return this;
    }

    /**
     * <p>
     * The AppSKey value.
     * </p>
     * 
     * @param appSKey
     *        The AppSKey value.
     */

    public void setAppSKey(String appSKey) {
        this.appSKey = appSKey;
    }

    /**
     * <p>
     * The AppSKey value.
     * </p>
     * 
     * @return The AppSKey value.
     */

    public String getAppSKey() {
        return this.appSKey;
    }

    /**
     * <p>
     * The AppSKey value.
     * </p>
     * 
     * @param appSKey
     *        The AppSKey value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeysAbpV11 withAppSKey(String appSKey) {
        setAppSKey(appSKey);
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
        if (getFNwkSIntKey() != null)
            sb.append("FNwkSIntKey: ").append(getFNwkSIntKey()).append(",");
        if (getSNwkSIntKey() != null)
            sb.append("SNwkSIntKey: ").append(getSNwkSIntKey()).append(",");
        if (getNwkSEncKey() != null)
            sb.append("NwkSEncKey: ").append(getNwkSEncKey()).append(",");
        if (getAppSKey() != null)
            sb.append("AppSKey: ").append(getAppSKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionKeysAbpV11 == false)
            return false;
        SessionKeysAbpV11 other = (SessionKeysAbpV11) obj;
        if (other.getFNwkSIntKey() == null ^ this.getFNwkSIntKey() == null)
            return false;
        if (other.getFNwkSIntKey() != null && other.getFNwkSIntKey().equals(this.getFNwkSIntKey()) == false)
            return false;
        if (other.getSNwkSIntKey() == null ^ this.getSNwkSIntKey() == null)
            return false;
        if (other.getSNwkSIntKey() != null && other.getSNwkSIntKey().equals(this.getSNwkSIntKey()) == false)
            return false;
        if (other.getNwkSEncKey() == null ^ this.getNwkSEncKey() == null)
            return false;
        if (other.getNwkSEncKey() != null && other.getNwkSEncKey().equals(this.getNwkSEncKey()) == false)
            return false;
        if (other.getAppSKey() == null ^ this.getAppSKey() == null)
            return false;
        if (other.getAppSKey() != null && other.getAppSKey().equals(this.getAppSKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFNwkSIntKey() == null) ? 0 : getFNwkSIntKey().hashCode());
        hashCode = prime * hashCode + ((getSNwkSIntKey() == null) ? 0 : getSNwkSIntKey().hashCode());
        hashCode = prime * hashCode + ((getNwkSEncKey() == null) ? 0 : getNwkSEncKey().hashCode());
        hashCode = prime * hashCode + ((getAppSKey() == null) ? 0 : getAppSKey().hashCode());
        return hashCode;
    }

    @Override
    public SessionKeysAbpV11 clone() {
        try {
            return (SessionKeysAbpV11) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SessionKeysAbpV11Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
