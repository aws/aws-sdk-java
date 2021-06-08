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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the auth types for your configured data models.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/BackendAPIAuthType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackendAPIAuthType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the authentication mode.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * Describes settings for the authentication mode.
     * </p>
     */
    private BackendAPIAppSyncAuthSettings settings;

    /**
     * <p>
     * Describes the authentication mode.
     * </p>
     * 
     * @param mode
     *        Describes the authentication mode.
     * @see Mode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Describes the authentication mode.
     * </p>
     * 
     * @return Describes the authentication mode.
     * @see Mode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Describes the authentication mode.
     * </p>
     * 
     * @param mode
     *        Describes the authentication mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public BackendAPIAuthType withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Describes the authentication mode.
     * </p>
     * 
     * @param mode
     *        Describes the authentication mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public BackendAPIAuthType withMode(Mode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * Describes settings for the authentication mode.
     * </p>
     * 
     * @param settings
     *        Describes settings for the authentication mode.
     */

    public void setSettings(BackendAPIAppSyncAuthSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Describes settings for the authentication mode.
     * </p>
     * 
     * @return Describes settings for the authentication mode.
     */

    public BackendAPIAppSyncAuthSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Describes settings for the authentication mode.
     * </p>
     * 
     * @param settings
     *        Describes settings for the authentication mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIAuthType withSettings(BackendAPIAppSyncAuthSettings settings) {
        setSettings(settings);
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendAPIAuthType == false)
            return false;
        BackendAPIAuthType other = (BackendAPIAuthType) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public BackendAPIAuthType clone() {
        try {
            return (BackendAPIAuthType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.BackendAPIAuthTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
