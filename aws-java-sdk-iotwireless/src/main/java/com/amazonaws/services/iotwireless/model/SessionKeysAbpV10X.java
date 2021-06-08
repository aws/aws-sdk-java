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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SessionKeysAbpV1_0_x" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionKeysAbpV10X implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The NwkSKey value.
     * </p>
     */
    private String nwkSKey;
    /**
     * <p>
     * The AppSKey value.
     * </p>
     */
    private String appSKey;

    /**
     * <p>
     * The NwkSKey value.
     * </p>
     * 
     * @param nwkSKey
     *        The NwkSKey value.
     */

    public void setNwkSKey(String nwkSKey) {
        this.nwkSKey = nwkSKey;
    }

    /**
     * <p>
     * The NwkSKey value.
     * </p>
     * 
     * @return The NwkSKey value.
     */

    public String getNwkSKey() {
        return this.nwkSKey;
    }

    /**
     * <p>
     * The NwkSKey value.
     * </p>
     * 
     * @param nwkSKey
     *        The NwkSKey value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeysAbpV10X withNwkSKey(String nwkSKey) {
        setNwkSKey(nwkSKey);
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

    public SessionKeysAbpV10X withAppSKey(String appSKey) {
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
        if (getNwkSKey() != null)
            sb.append("NwkSKey: ").append(getNwkSKey()).append(",");
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

        if (obj instanceof SessionKeysAbpV10X == false)
            return false;
        SessionKeysAbpV10X other = (SessionKeysAbpV10X) obj;
        if (other.getNwkSKey() == null ^ this.getNwkSKey() == null)
            return false;
        if (other.getNwkSKey() != null && other.getNwkSKey().equals(this.getNwkSKey()) == false)
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

        hashCode = prime * hashCode + ((getNwkSKey() == null) ? 0 : getNwkSKey().hashCode());
        hashCode = prime * hashCode + ((getAppSKey() == null) ? 0 : getAppSKey().hashCode());
        return hashCode;
    }

    @Override
    public SessionKeysAbpV10X clone() {
        try {
            return (SessionKeysAbpV10X) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SessionKeysAbpV10XMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
