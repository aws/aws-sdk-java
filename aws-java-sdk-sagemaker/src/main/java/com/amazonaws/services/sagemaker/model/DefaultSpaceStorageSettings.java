/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The default storage settings for a space.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DefaultSpaceStorageSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultSpaceStorageSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default EBS storage settings for a space.
     * </p>
     */
    private DefaultEbsStorageSettings defaultEbsStorageSettings;

    /**
     * <p>
     * The default EBS storage settings for a space.
     * </p>
     * 
     * @param defaultEbsStorageSettings
     *        The default EBS storage settings for a space.
     */

    public void setDefaultEbsStorageSettings(DefaultEbsStorageSettings defaultEbsStorageSettings) {
        this.defaultEbsStorageSettings = defaultEbsStorageSettings;
    }

    /**
     * <p>
     * The default EBS storage settings for a space.
     * </p>
     * 
     * @return The default EBS storage settings for a space.
     */

    public DefaultEbsStorageSettings getDefaultEbsStorageSettings() {
        return this.defaultEbsStorageSettings;
    }

    /**
     * <p>
     * The default EBS storage settings for a space.
     * </p>
     * 
     * @param defaultEbsStorageSettings
     *        The default EBS storage settings for a space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSpaceStorageSettings withDefaultEbsStorageSettings(DefaultEbsStorageSettings defaultEbsStorageSettings) {
        setDefaultEbsStorageSettings(defaultEbsStorageSettings);
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
        if (getDefaultEbsStorageSettings() != null)
            sb.append("DefaultEbsStorageSettings: ").append(getDefaultEbsStorageSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultSpaceStorageSettings == false)
            return false;
        DefaultSpaceStorageSettings other = (DefaultSpaceStorageSettings) obj;
        if (other.getDefaultEbsStorageSettings() == null ^ this.getDefaultEbsStorageSettings() == null)
            return false;
        if (other.getDefaultEbsStorageSettings() != null && other.getDefaultEbsStorageSettings().equals(this.getDefaultEbsStorageSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultEbsStorageSettings() == null) ? 0 : getDefaultEbsStorageSettings().hashCode());
        return hashCode;
    }

    @Override
    public DefaultSpaceStorageSettings clone() {
        try {
            return (DefaultSpaceStorageSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DefaultSpaceStorageSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
