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
 * OTAA device object for v1.1
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/OtaaV1_1" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OtaaV11 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AppKey value.
     * </p>
     */
    private String appKey;
    /**
     * <p>
     * The NwkKey value.
     * </p>
     */
    private String nwkKey;
    /**
     * <p>
     * The JoinEUI value.
     * </p>
     */
    private String joinEui;

    /**
     * <p>
     * The AppKey value.
     * </p>
     * 
     * @param appKey
     *        The AppKey value.
     */

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * <p>
     * The AppKey value.
     * </p>
     * 
     * @return The AppKey value.
     */

    public String getAppKey() {
        return this.appKey;
    }

    /**
     * <p>
     * The AppKey value.
     * </p>
     * 
     * @param appKey
     *        The AppKey value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OtaaV11 withAppKey(String appKey) {
        setAppKey(appKey);
        return this;
    }

    /**
     * <p>
     * The NwkKey value.
     * </p>
     * 
     * @param nwkKey
     *        The NwkKey value.
     */

    public void setNwkKey(String nwkKey) {
        this.nwkKey = nwkKey;
    }

    /**
     * <p>
     * The NwkKey value.
     * </p>
     * 
     * @return The NwkKey value.
     */

    public String getNwkKey() {
        return this.nwkKey;
    }

    /**
     * <p>
     * The NwkKey value.
     * </p>
     * 
     * @param nwkKey
     *        The NwkKey value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OtaaV11 withNwkKey(String nwkKey) {
        setNwkKey(nwkKey);
        return this;
    }

    /**
     * <p>
     * The JoinEUI value.
     * </p>
     * 
     * @param joinEui
     *        The JoinEUI value.
     */

    public void setJoinEui(String joinEui) {
        this.joinEui = joinEui;
    }

    /**
     * <p>
     * The JoinEUI value.
     * </p>
     * 
     * @return The JoinEUI value.
     */

    public String getJoinEui() {
        return this.joinEui;
    }

    /**
     * <p>
     * The JoinEUI value.
     * </p>
     * 
     * @param joinEui
     *        The JoinEUI value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OtaaV11 withJoinEui(String joinEui) {
        setJoinEui(joinEui);
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
        if (getAppKey() != null)
            sb.append("AppKey: ").append(getAppKey()).append(",");
        if (getNwkKey() != null)
            sb.append("NwkKey: ").append(getNwkKey()).append(",");
        if (getJoinEui() != null)
            sb.append("JoinEui: ").append(getJoinEui());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OtaaV11 == false)
            return false;
        OtaaV11 other = (OtaaV11) obj;
        if (other.getAppKey() == null ^ this.getAppKey() == null)
            return false;
        if (other.getAppKey() != null && other.getAppKey().equals(this.getAppKey()) == false)
            return false;
        if (other.getNwkKey() == null ^ this.getNwkKey() == null)
            return false;
        if (other.getNwkKey() != null && other.getNwkKey().equals(this.getNwkKey()) == false)
            return false;
        if (other.getJoinEui() == null ^ this.getJoinEui() == null)
            return false;
        if (other.getJoinEui() != null && other.getJoinEui().equals(this.getJoinEui()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppKey() == null) ? 0 : getAppKey().hashCode());
        hashCode = prime * hashCode + ((getNwkKey() == null) ? 0 : getNwkKey().hashCode());
        hashCode = prime * hashCode + ((getJoinEui() == null) ? 0 : getJoinEui().hashCode());
        return hashCode;
    }

    @Override
    public OtaaV11 clone() {
        try {
            return (OtaaV11) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.OtaaV11Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
