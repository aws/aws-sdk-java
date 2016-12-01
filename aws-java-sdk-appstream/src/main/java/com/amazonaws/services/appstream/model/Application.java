/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An entry for a single application in the application catalog.
 * </p>
 */
public class Application implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the application shown to the end users.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The URL for the application icon. This URL may be time-limited.
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
     * A list of arguments that are passed to the application at launch.
     * </p>
     */
    private String launchParameters;
    /**
     * <p>
     * An application can be disabled after image creation if there is a problem.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Additional attributes that describes the application.
     * </p>
     */
    private java.util.Map<String, String> metadata;

    /**
     * <p>
     * The unique identifier for the application.
     * </p>
     * 
     * @param name
     *        The unique identifier for the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique identifier for the application.
     * </p>
     * 
     * @return The unique identifier for the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique identifier for the application.
     * </p>
     * 
     * @param name
     *        The unique identifier for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the application shown to the end users.
     * </p>
     * 
     * @param displayName
     *        The name of the application shown to the end users.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the application shown to the end users.
     * </p>
     * 
     * @return The name of the application shown to the end users.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the application shown to the end users.
     * </p>
     * 
     * @param displayName
     *        The name of the application shown to the end users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The URL for the application icon. This URL may be time-limited.
     * </p>
     * 
     * @param iconURL
     *        The URL for the application icon. This URL may be time-limited.
     */

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    /**
     * <p>
     * The URL for the application icon. This URL may be time-limited.
     * </p>
     * 
     * @return The URL for the application icon. This URL may be time-limited.
     */

    public String getIconURL() {
        return this.iconURL;
    }

    /**
     * <p>
     * The URL for the application icon. This URL may be time-limited.
     * </p>
     * 
     * @param iconURL
     *        The URL for the application icon. This URL may be time-limited.
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
     * A list of arguments that are passed to the application at launch.
     * </p>
     * 
     * @param launchParameters
     *        A list of arguments that are passed to the application at launch.
     */

    public void setLaunchParameters(String launchParameters) {
        this.launchParameters = launchParameters;
    }

    /**
     * <p>
     * A list of arguments that are passed to the application at launch.
     * </p>
     * 
     * @return A list of arguments that are passed to the application at launch.
     */

    public String getLaunchParameters() {
        return this.launchParameters;
    }

    /**
     * <p>
     * A list of arguments that are passed to the application at launch.
     * </p>
     * 
     * @param launchParameters
     *        A list of arguments that are passed to the application at launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withLaunchParameters(String launchParameters) {
        setLaunchParameters(launchParameters);
        return this;
    }

    /**
     * <p>
     * An application can be disabled after image creation if there is a problem.
     * </p>
     * 
     * @param enabled
     *        An application can be disabled after image creation if there is a problem.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * An application can be disabled after image creation if there is a problem.
     * </p>
     * 
     * @return An application can be disabled after image creation if there is a problem.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * An application can be disabled after image creation if there is a problem.
     * </p>
     * 
     * @param enabled
     *        An application can be disabled after image creation if there is a problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * An application can be disabled after image creation if there is a problem.
     * </p>
     * 
     * @return An application can be disabled after image creation if there is a problem.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Additional attributes that describes the application.
     * </p>
     * 
     * @return Additional attributes that describes the application.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Additional attributes that describes the application.
     * </p>
     * 
     * @param metadata
     *        Additional attributes that describes the application.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Additional attributes that describes the application.
     * </p>
     * 
     * @param metadata
     *        Additional attributes that describes the application.
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getIconURL() != null)
            sb.append("IconURL: " + getIconURL() + ",");
        if (getLaunchPath() != null)
            sb.append("LaunchPath: " + getLaunchPath() + ",");
        if (getLaunchParameters() != null)
            sb.append("LaunchParameters: " + getLaunchParameters() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata());
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
}
