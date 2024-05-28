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
 * Specifies summary information about the space settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SpaceSettingsSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpaceSettingsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of app created within the space.
     * </p>
     */
    private String appType;
    /**
     * <p>
     * The storage settings for a space.
     * </p>
     */
    private SpaceStorageSettings spaceStorageSettings;

    /**
     * <p>
     * The type of app created within the space.
     * </p>
     * 
     * @param appType
     *        The type of app created within the space.
     * @see AppType
     */

    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * <p>
     * The type of app created within the space.
     * </p>
     * 
     * @return The type of app created within the space.
     * @see AppType
     */

    public String getAppType() {
        return this.appType;
    }

    /**
     * <p>
     * The type of app created within the space.
     * </p>
     * 
     * @param appType
     *        The type of app created within the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public SpaceSettingsSummary withAppType(String appType) {
        setAppType(appType);
        return this;
    }

    /**
     * <p>
     * The type of app created within the space.
     * </p>
     * 
     * @param appType
     *        The type of app created within the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public SpaceSettingsSummary withAppType(AppType appType) {
        this.appType = appType.toString();
        return this;
    }

    /**
     * <p>
     * The storage settings for a space.
     * </p>
     * 
     * @param spaceStorageSettings
     *        The storage settings for a space.
     */

    public void setSpaceStorageSettings(SpaceStorageSettings spaceStorageSettings) {
        this.spaceStorageSettings = spaceStorageSettings;
    }

    /**
     * <p>
     * The storage settings for a space.
     * </p>
     * 
     * @return The storage settings for a space.
     */

    public SpaceStorageSettings getSpaceStorageSettings() {
        return this.spaceStorageSettings;
    }

    /**
     * <p>
     * The storage settings for a space.
     * </p>
     * 
     * @param spaceStorageSettings
     *        The storage settings for a space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceSettingsSummary withSpaceStorageSettings(SpaceStorageSettings spaceStorageSettings) {
        setSpaceStorageSettings(spaceStorageSettings);
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
        if (getAppType() != null)
            sb.append("AppType: ").append(getAppType()).append(",");
        if (getSpaceStorageSettings() != null)
            sb.append("SpaceStorageSettings: ").append(getSpaceStorageSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpaceSettingsSummary == false)
            return false;
        SpaceSettingsSummary other = (SpaceSettingsSummary) obj;
        if (other.getAppType() == null ^ this.getAppType() == null)
            return false;
        if (other.getAppType() != null && other.getAppType().equals(this.getAppType()) == false)
            return false;
        if (other.getSpaceStorageSettings() == null ^ this.getSpaceStorageSettings() == null)
            return false;
        if (other.getSpaceStorageSettings() != null && other.getSpaceStorageSettings().equals(this.getSpaceStorageSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppType() == null) ? 0 : getAppType().hashCode());
        hashCode = prime * hashCode + ((getSpaceStorageSettings() == null) ? 0 : getSpaceStorageSettings().hashCode());
        return hashCode;
    }

    @Override
    public SpaceSettingsSummary clone() {
        try {
            return (SpaceSettingsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SpaceSettingsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
