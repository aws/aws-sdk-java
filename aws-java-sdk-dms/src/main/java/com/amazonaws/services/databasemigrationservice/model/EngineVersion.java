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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a replication instance version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/EngineVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version number of the replication instance.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The lifecycle status of the replication instance version. Valid values are <code>DEPRECATED</code>,
     * <code>DEFAULT_VERSION</code>, and <code>ACTIVE</code>.
     * </p>
     */
    private String lifecycle;
    /**
     * <p>
     * The release status of the replication instance version.
     * </p>
     */
    private String releaseStatus;
    /**
     * <p>
     * The date when the replication instance version became publicly available.
     * </p>
     */
    private java.util.Date launchDate;
    /**
     * <p>
     * The date when the replication instance will be automatically upgraded. This setting only applies if the
     * <code>auto-minor-version</code> setting is enabled.
     * </p>
     */
    private java.util.Date autoUpgradeDate;
    /**
     * <p>
     * The date when the replication instance version will be deprecated and can no longer be requested.
     * </p>
     */
    private java.util.Date deprecationDate;
    /**
     * <p>
     * The date when the replication instance will have a version upgrade forced.
     * </p>
     */
    private java.util.Date forceUpgradeDate;
    /**
     * <p>
     * The list of valid replication instance versions that you can upgrade to.
     * </p>
     */
    private java.util.List<String> availableUpgrades;

    /**
     * <p>
     * The version number of the replication instance.
     * </p>
     * 
     * @param version
     *        The version number of the replication instance.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the replication instance.
     * </p>
     * 
     * @return The version number of the replication instance.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the replication instance.
     * </p>
     * 
     * @param version
     *        The version number of the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the replication instance version. Valid values are <code>DEPRECATED</code>,
     * <code>DEFAULT_VERSION</code>, and <code>ACTIVE</code>.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the replication instance version. Valid values are <code>DEPRECATED</code>,
     *        <code>DEFAULT_VERSION</code>, and <code>ACTIVE</code>.
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the replication instance version. Valid values are <code>DEPRECATED</code>,
     * <code>DEFAULT_VERSION</code>, and <code>ACTIVE</code>.
     * </p>
     * 
     * @return The lifecycle status of the replication instance version. Valid values are <code>DEPRECATED</code>,
     *         <code>DEFAULT_VERSION</code>, and <code>ACTIVE</code>.
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the replication instance version. Valid values are <code>DEPRECATED</code>,
     * <code>DEFAULT_VERSION</code>, and <code>ACTIVE</code>.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the replication instance version. Valid values are <code>DEPRECATED</code>,
     *        <code>DEFAULT_VERSION</code>, and <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The release status of the replication instance version.
     * </p>
     * 
     * @param releaseStatus
     *        The release status of the replication instance version.
     * @see ReleaseStatusValues
     */

    public void setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    /**
     * <p>
     * The release status of the replication instance version.
     * </p>
     * 
     * @return The release status of the replication instance version.
     * @see ReleaseStatusValues
     */

    public String getReleaseStatus() {
        return this.releaseStatus;
    }

    /**
     * <p>
     * The release status of the replication instance version.
     * </p>
     * 
     * @param releaseStatus
     *        The release status of the replication instance version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReleaseStatusValues
     */

    public EngineVersion withReleaseStatus(String releaseStatus) {
        setReleaseStatus(releaseStatus);
        return this;
    }

    /**
     * <p>
     * The release status of the replication instance version.
     * </p>
     * 
     * @param releaseStatus
     *        The release status of the replication instance version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReleaseStatusValues
     */

    public EngineVersion withReleaseStatus(ReleaseStatusValues releaseStatus) {
        this.releaseStatus = releaseStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date when the replication instance version became publicly available.
     * </p>
     * 
     * @param launchDate
     *        The date when the replication instance version became publicly available.
     */

    public void setLaunchDate(java.util.Date launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * <p>
     * The date when the replication instance version became publicly available.
     * </p>
     * 
     * @return The date when the replication instance version became publicly available.
     */

    public java.util.Date getLaunchDate() {
        return this.launchDate;
    }

    /**
     * <p>
     * The date when the replication instance version became publicly available.
     * </p>
     * 
     * @param launchDate
     *        The date when the replication instance version became publicly available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withLaunchDate(java.util.Date launchDate) {
        setLaunchDate(launchDate);
        return this;
    }

    /**
     * <p>
     * The date when the replication instance will be automatically upgraded. This setting only applies if the
     * <code>auto-minor-version</code> setting is enabled.
     * </p>
     * 
     * @param autoUpgradeDate
     *        The date when the replication instance will be automatically upgraded. This setting only applies if the
     *        <code>auto-minor-version</code> setting is enabled.
     */

    public void setAutoUpgradeDate(java.util.Date autoUpgradeDate) {
        this.autoUpgradeDate = autoUpgradeDate;
    }

    /**
     * <p>
     * The date when the replication instance will be automatically upgraded. This setting only applies if the
     * <code>auto-minor-version</code> setting is enabled.
     * </p>
     * 
     * @return The date when the replication instance will be automatically upgraded. This setting only applies if the
     *         <code>auto-minor-version</code> setting is enabled.
     */

    public java.util.Date getAutoUpgradeDate() {
        return this.autoUpgradeDate;
    }

    /**
     * <p>
     * The date when the replication instance will be automatically upgraded. This setting only applies if the
     * <code>auto-minor-version</code> setting is enabled.
     * </p>
     * 
     * @param autoUpgradeDate
     *        The date when the replication instance will be automatically upgraded. This setting only applies if the
     *        <code>auto-minor-version</code> setting is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withAutoUpgradeDate(java.util.Date autoUpgradeDate) {
        setAutoUpgradeDate(autoUpgradeDate);
        return this;
    }

    /**
     * <p>
     * The date when the replication instance version will be deprecated and can no longer be requested.
     * </p>
     * 
     * @param deprecationDate
     *        The date when the replication instance version will be deprecated and can no longer be requested.
     */

    public void setDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
    }

    /**
     * <p>
     * The date when the replication instance version will be deprecated and can no longer be requested.
     * </p>
     * 
     * @return The date when the replication instance version will be deprecated and can no longer be requested.
     */

    public java.util.Date getDeprecationDate() {
        return this.deprecationDate;
    }

    /**
     * <p>
     * The date when the replication instance version will be deprecated and can no longer be requested.
     * </p>
     * 
     * @param deprecationDate
     *        The date when the replication instance version will be deprecated and can no longer be requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withDeprecationDate(java.util.Date deprecationDate) {
        setDeprecationDate(deprecationDate);
        return this;
    }

    /**
     * <p>
     * The date when the replication instance will have a version upgrade forced.
     * </p>
     * 
     * @param forceUpgradeDate
     *        The date when the replication instance will have a version upgrade forced.
     */

    public void setForceUpgradeDate(java.util.Date forceUpgradeDate) {
        this.forceUpgradeDate = forceUpgradeDate;
    }

    /**
     * <p>
     * The date when the replication instance will have a version upgrade forced.
     * </p>
     * 
     * @return The date when the replication instance will have a version upgrade forced.
     */

    public java.util.Date getForceUpgradeDate() {
        return this.forceUpgradeDate;
    }

    /**
     * <p>
     * The date when the replication instance will have a version upgrade forced.
     * </p>
     * 
     * @param forceUpgradeDate
     *        The date when the replication instance will have a version upgrade forced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withForceUpgradeDate(java.util.Date forceUpgradeDate) {
        setForceUpgradeDate(forceUpgradeDate);
        return this;
    }

    /**
     * <p>
     * The list of valid replication instance versions that you can upgrade to.
     * </p>
     * 
     * @return The list of valid replication instance versions that you can upgrade to.
     */

    public java.util.List<String> getAvailableUpgrades() {
        return availableUpgrades;
    }

    /**
     * <p>
     * The list of valid replication instance versions that you can upgrade to.
     * </p>
     * 
     * @param availableUpgrades
     *        The list of valid replication instance versions that you can upgrade to.
     */

    public void setAvailableUpgrades(java.util.Collection<String> availableUpgrades) {
        if (availableUpgrades == null) {
            this.availableUpgrades = null;
            return;
        }

        this.availableUpgrades = new java.util.ArrayList<String>(availableUpgrades);
    }

    /**
     * <p>
     * The list of valid replication instance versions that you can upgrade to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailableUpgrades(java.util.Collection)} or {@link #withAvailableUpgrades(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availableUpgrades
     *        The list of valid replication instance versions that you can upgrade to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withAvailableUpgrades(String... availableUpgrades) {
        if (this.availableUpgrades == null) {
            setAvailableUpgrades(new java.util.ArrayList<String>(availableUpgrades.length));
        }
        for (String ele : availableUpgrades) {
            this.availableUpgrades.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of valid replication instance versions that you can upgrade to.
     * </p>
     * 
     * @param availableUpgrades
     *        The list of valid replication instance versions that you can upgrade to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withAvailableUpgrades(java.util.Collection<String> availableUpgrades) {
        setAvailableUpgrades(availableUpgrades);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getReleaseStatus() != null)
            sb.append("ReleaseStatus: ").append(getReleaseStatus()).append(",");
        if (getLaunchDate() != null)
            sb.append("LaunchDate: ").append(getLaunchDate()).append(",");
        if (getAutoUpgradeDate() != null)
            sb.append("AutoUpgradeDate: ").append(getAutoUpgradeDate()).append(",");
        if (getDeprecationDate() != null)
            sb.append("DeprecationDate: ").append(getDeprecationDate()).append(",");
        if (getForceUpgradeDate() != null)
            sb.append("ForceUpgradeDate: ").append(getForceUpgradeDate()).append(",");
        if (getAvailableUpgrades() != null)
            sb.append("AvailableUpgrades: ").append(getAvailableUpgrades());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineVersion == false)
            return false;
        EngineVersion other = (EngineVersion) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getReleaseStatus() == null ^ this.getReleaseStatus() == null)
            return false;
        if (other.getReleaseStatus() != null && other.getReleaseStatus().equals(this.getReleaseStatus()) == false)
            return false;
        if (other.getLaunchDate() == null ^ this.getLaunchDate() == null)
            return false;
        if (other.getLaunchDate() != null && other.getLaunchDate().equals(this.getLaunchDate()) == false)
            return false;
        if (other.getAutoUpgradeDate() == null ^ this.getAutoUpgradeDate() == null)
            return false;
        if (other.getAutoUpgradeDate() != null && other.getAutoUpgradeDate().equals(this.getAutoUpgradeDate()) == false)
            return false;
        if (other.getDeprecationDate() == null ^ this.getDeprecationDate() == null)
            return false;
        if (other.getDeprecationDate() != null && other.getDeprecationDate().equals(this.getDeprecationDate()) == false)
            return false;
        if (other.getForceUpgradeDate() == null ^ this.getForceUpgradeDate() == null)
            return false;
        if (other.getForceUpgradeDate() != null && other.getForceUpgradeDate().equals(this.getForceUpgradeDate()) == false)
            return false;
        if (other.getAvailableUpgrades() == null ^ this.getAvailableUpgrades() == null)
            return false;
        if (other.getAvailableUpgrades() != null && other.getAvailableUpgrades().equals(this.getAvailableUpgrades()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getReleaseStatus() == null) ? 0 : getReleaseStatus().hashCode());
        hashCode = prime * hashCode + ((getLaunchDate() == null) ? 0 : getLaunchDate().hashCode());
        hashCode = prime * hashCode + ((getAutoUpgradeDate() == null) ? 0 : getAutoUpgradeDate().hashCode());
        hashCode = prime * hashCode + ((getDeprecationDate() == null) ? 0 : getDeprecationDate().hashCode());
        hashCode = prime * hashCode + ((getForceUpgradeDate() == null) ? 0 : getForceUpgradeDate().hashCode());
        hashCode = prime * hashCode + ((getAvailableUpgrades() == null) ? 0 : getAvailableUpgrades().hashCode());
        return hashCode;
    }

    @Override
    public EngineVersion clone() {
        try {
            return (EngineVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.EngineVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
