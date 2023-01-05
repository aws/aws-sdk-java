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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Button Config for an in-app message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/InAppMessageButton" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppMessageButton implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Default button content.
     * </p>
     */
    private OverrideButtonConfiguration android;
    /**
     * <p>
     * Default button content.
     * </p>
     */
    private DefaultButtonConfiguration defaultConfig;
    /**
     * <p>
     * Default button content.
     * </p>
     */
    private OverrideButtonConfiguration iOS;
    /**
     * <p>
     * Default button content.
     * </p>
     */
    private OverrideButtonConfiguration web;

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @param android
     *        Default button content.
     */

    public void setAndroid(OverrideButtonConfiguration android) {
        this.android = android;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @return Default button content.
     */

    public OverrideButtonConfiguration getAndroid() {
        return this.android;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @param android
     *        Default button content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageButton withAndroid(OverrideButtonConfiguration android) {
        setAndroid(android);
        return this;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @param defaultConfig
     *        Default button content.
     */

    public void setDefaultConfig(DefaultButtonConfiguration defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @return Default button content.
     */

    public DefaultButtonConfiguration getDefaultConfig() {
        return this.defaultConfig;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @param defaultConfig
     *        Default button content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageButton withDefaultConfig(DefaultButtonConfiguration defaultConfig) {
        setDefaultConfig(defaultConfig);
        return this;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @param iOS
     *        Default button content.
     */

    public void setIOS(OverrideButtonConfiguration iOS) {
        this.iOS = iOS;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @return Default button content.
     */

    public OverrideButtonConfiguration getIOS() {
        return this.iOS;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @param iOS
     *        Default button content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageButton withIOS(OverrideButtonConfiguration iOS) {
        setIOS(iOS);
        return this;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @param web
     *        Default button content.
     */

    public void setWeb(OverrideButtonConfiguration web) {
        this.web = web;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @return Default button content.
     */

    public OverrideButtonConfiguration getWeb() {
        return this.web;
    }

    /**
     * <p>
     * Default button content.
     * </p>
     * 
     * @param web
     *        Default button content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageButton withWeb(OverrideButtonConfiguration web) {
        setWeb(web);
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
        if (getAndroid() != null)
            sb.append("Android: ").append(getAndroid()).append(",");
        if (getDefaultConfig() != null)
            sb.append("DefaultConfig: ").append(getDefaultConfig()).append(",");
        if (getIOS() != null)
            sb.append("IOS: ").append(getIOS()).append(",");
        if (getWeb() != null)
            sb.append("Web: ").append(getWeb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InAppMessageButton == false)
            return false;
        InAppMessageButton other = (InAppMessageButton) obj;
        if (other.getAndroid() == null ^ this.getAndroid() == null)
            return false;
        if (other.getAndroid() != null && other.getAndroid().equals(this.getAndroid()) == false)
            return false;
        if (other.getDefaultConfig() == null ^ this.getDefaultConfig() == null)
            return false;
        if (other.getDefaultConfig() != null && other.getDefaultConfig().equals(this.getDefaultConfig()) == false)
            return false;
        if (other.getIOS() == null ^ this.getIOS() == null)
            return false;
        if (other.getIOS() != null && other.getIOS().equals(this.getIOS()) == false)
            return false;
        if (other.getWeb() == null ^ this.getWeb() == null)
            return false;
        if (other.getWeb() != null && other.getWeb().equals(this.getWeb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAndroid() == null) ? 0 : getAndroid().hashCode());
        hashCode = prime * hashCode + ((getDefaultConfig() == null) ? 0 : getDefaultConfig().hashCode());
        hashCode = prime * hashCode + ((getIOS() == null) ? 0 : getIOS().hashCode());
        hashCode = prime * hashCode + ((getWeb() == null) ? 0 : getWeb().hashCode());
        return hashCode;
    }

    @Override
    public InAppMessageButton clone() {
        try {
            return (InAppMessageButton) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.InAppMessageButtonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
