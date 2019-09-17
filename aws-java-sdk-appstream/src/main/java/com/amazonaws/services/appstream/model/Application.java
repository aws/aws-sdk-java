/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an application in the application catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/Application" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Application implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The application name to display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The URL for the application icon. This URL might be time-limited.
     * </p>
     */
    private String iconURL;
    /**
     * <p>
     * The path to the application executable in the instance.
     * </p>
     */
    private String launchPath;
    /**
     * <p>
     * The arguments that are passed to the application at launch.
     * </p>
     */
    private String launchParameters;
    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Additional attributes that describe the application.
     * </p>
     */
    private java.util.Map<String, String> metadata;

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The application name to display.
     * </p>
     * 
     * @param displayName
     *        The application name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The application name to display.
     * </p>
     * 
     * @return The application name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The application name to display.
     * </p>
     * 
     * @param displayName
     *        The application name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The URL for the application icon. This URL might be time-limited.
     * </p>
     * 
     * @param iconURL
     *        The URL for the application icon. This URL might be time-limited.
     */

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    /**
     * <p>
     * The URL for the application icon. This URL might be time-limited.
     * </p>
     * 
     * @return The URL for the application icon. This URL might be time-limited.
     */

    public String getIconURL() {
        return this.iconURL;
    }

    /**
     * <p>
     * The URL for the application icon. This URL might be time-limited.
     * </p>
     * 
     * @param iconURL
     *        The URL for the application icon. This URL might be time-limited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withIconURL(String iconURL) {
        setIconURL(iconURL);
        return this;
    }

    /**
     * <p>
     * The path to the application executable in the instance.
     * </p>
     * 
     * @param launchPath
     *        The path to the application executable in the instance.
     */

    public void setLaunchPath(String launchPath) {
        this.launchPath = launchPath;
    }

    /**
     * <p>
     * The path to the application executable in the instance.
     * </p>
     * 
     * @return The path to the application executable in the instance.
     */

    public String getLaunchPath() {
        return this.launchPath;
    }

    /**
     * <p>
     * The path to the application executable in the instance.
     * </p>
     * 
     * @param launchPath
     *        The path to the application executable in the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withLaunchPath(String launchPath) {
        setLaunchPath(launchPath);
        return this;
    }

    /**
     * <p>
     * The arguments that are passed to the application at launch.
     * </p>
     * 
     * @param launchParameters
     *        The arguments that are passed to the application at launch.
     */

    public void setLaunchParameters(String launchParameters) {
        this.launchParameters = launchParameters;
    }

    /**
     * <p>
     * The arguments that are passed to the application at launch.
     * </p>
     * 
     * @return The arguments that are passed to the application at launch.
     */

    public String getLaunchParameters() {
        return this.launchParameters;
    }

    /**
     * <p>
     * The arguments that are passed to the application at launch.
     * </p>
     * 
     * @param launchParameters
     *        The arguments that are passed to the application at launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withLaunchParameters(String launchParameters) {
        setLaunchParameters(launchParameters);
        return this;
    }

    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     * 
     * @param enabled
     *        If there is a problem, the application can be disabled after image creation.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     * 
     * @return If there is a problem, the application can be disabled after image creation.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     * 
     * @param enabled
     *        If there is a problem, the application can be disabled after image creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If there is a problem, the application can be disabled after image creation.
     * </p>
     * 
     * @return If there is a problem, the application can be disabled after image creation.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Additional attributes that describe the application.
     * </p>
     * 
     * @return Additional attributes that describe the application.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Additional attributes that describe the application.
     * </p>
     * 
     * @param metadata
     *        Additional attributes that describe the application.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Additional attributes that describe the application.
     * </p>
     * 
     * @param metadata
     *        Additional attributes that describe the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    public Application addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application clearMetadataEntries() {
        this.metadata = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getIconURL() != null)
            sb.append("IconURL: ").append(getIconURL()).append(",");
        if (getLaunchPath() != null)
            sb.append("LaunchPath: ").append(getLaunchPath()).append(",");
        if (getLaunchParameters() != null)
            sb.append("LaunchParameters: ").append(getLaunchParameters()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getIconURL() == null ^ this.getIconURL() == null)
            return false;
        if (other.getIconURL() != null && other.getIconURL().equals(this.getIconURL()) == false)
            return false;
        if (other.getLaunchPath() == null ^ this.getLaunchPath() == null)
            return false;
        if (other.getLaunchPath() != null && other.getLaunchPath().equals(this.getLaunchPath()) == false)
            return false;
        if (other.getLaunchParameters() == null ^ this.getLaunchParameters() == null)
            return false;
        if (other.getLaunchParameters() != null && other.getLaunchParameters().equals(this.getLaunchParameters()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIconURL() == null) ? 0 : getIconURL().hashCode());
        hashCode = prime * hashCode + ((getLaunchPath() == null) ? 0 : getLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getLaunchParameters() == null) ? 0 : getLaunchParameters().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public Application clone() {
        try {
            return (Application) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
