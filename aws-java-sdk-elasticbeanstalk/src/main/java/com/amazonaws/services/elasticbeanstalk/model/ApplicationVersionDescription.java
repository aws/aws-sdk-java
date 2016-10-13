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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the properties of an application version.
 * </p>
 */
public class ApplicationVersionDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application associated with this release.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The description of this application version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A label uniquely identifying the version for the associated application.
     * </p>
     */
    private String versionLabel;

    private SourceBuildInformation sourceBuildInformation;
    /**
     * <p>
     * The location where the source bundle is located for this version.
     * </p>
     */
    private S3Location sourceBundle;
    /**
     * <p>
     * The creation date of the application version.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     */
    private java.util.Date dateUpdated;
    /**
     * <p>
     * The processing status of the application version.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the application associated with this release.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with this release.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this release.
     * </p>
     * 
     * @return The name of the application associated with this release.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this release.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with this release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The description of this application version.
     * </p>
     * 
     * @param description
     *        The description of this application version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of this application version.
     * </p>
     * 
     * @return The description of this application version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of this application version.
     * </p>
     * 
     * @param description
     *        The description of this application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A label uniquely identifying the version for the associated application.
     * </p>
     * 
     * @param versionLabel
     *        A label uniquely identifying the version for the associated application.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * A label uniquely identifying the version for the associated application.
     * </p>
     * 
     * @return A label uniquely identifying the version for the associated application.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * A label uniquely identifying the version for the associated application.
     * </p>
     * 
     * @param versionLabel
     *        A label uniquely identifying the version for the associated application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * @param sourceBuildInformation
     */

    public void setSourceBuildInformation(SourceBuildInformation sourceBuildInformation) {
        this.sourceBuildInformation = sourceBuildInformation;
    }

    /**
     * @return
     */

    public SourceBuildInformation getSourceBuildInformation() {
        return this.sourceBuildInformation;
    }

    /**
     * @param sourceBuildInformation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withSourceBuildInformation(SourceBuildInformation sourceBuildInformation) {
        setSourceBuildInformation(sourceBuildInformation);
        return this;
    }

    /**
     * <p>
     * The location where the source bundle is located for this version.
     * </p>
     * 
     * @param sourceBundle
     *        The location where the source bundle is located for this version.
     */

    public void setSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
    }

    /**
     * <p>
     * The location where the source bundle is located for this version.
     * </p>
     * 
     * @return The location where the source bundle is located for this version.
     */

    public S3Location getSourceBundle() {
        return this.sourceBundle;
    }

    /**
     * <p>
     * The location where the source bundle is located for this version.
     * </p>
     * 
     * @param sourceBundle
     *        The location where the source bundle is located for this version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withSourceBundle(S3Location sourceBundle) {
        setSourceBundle(sourceBundle);
        return this;
    }

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     * 
     * @param dateCreated
     *        The creation date of the application version.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     * 
     * @return The creation date of the application version.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     * 
     * @param dateCreated
     *        The creation date of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     * 
     * @param dateUpdated
     *        The last modified date of the application version.
     */

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     * 
     * @return The last modified date of the application version.
     */

    public java.util.Date getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     * 
     * @param dateUpdated
     *        The last modified date of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withDateUpdated(java.util.Date dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * The processing status of the application version.
     * </p>
     * 
     * @param status
     *        The processing status of the application version.
     * @see ApplicationVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The processing status of the application version.
     * </p>
     * 
     * @return The processing status of the application version.
     * @see ApplicationVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The processing status of the application version.
     * </p>
     * 
     * @param status
     *        The processing status of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVersionStatus
     */

    public ApplicationVersionDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The processing status of the application version.
     * </p>
     * 
     * @param status
     *        The processing status of the application version.
     * @see ApplicationVersionStatus
     */

    public void setStatus(ApplicationVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The processing status of the application version.
     * </p>
     * 
     * @param status
     *        The processing status of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVersionStatus
     */

    public ApplicationVersionDescription withStatus(ApplicationVersionStatus status) {
        setStatus(status);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getSourceBuildInformation() != null)
            sb.append("SourceBuildInformation: " + getSourceBuildInformation() + ",");
        if (getSourceBundle() != null)
            sb.append("SourceBundle: " + getSourceBundle() + ",");
        if (getDateCreated() != null)
            sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: " + getDateUpdated() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationVersionDescription == false)
            return false;
        ApplicationVersionDescription other = (ApplicationVersionDescription) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getSourceBuildInformation() == null ^ this.getSourceBuildInformation() == null)
            return false;
        if (other.getSourceBuildInformation() != null && other.getSourceBuildInformation().equals(this.getSourceBuildInformation()) == false)
            return false;
        if (other.getSourceBundle() == null ^ this.getSourceBundle() == null)
            return false;
        if (other.getSourceBundle() != null && other.getSourceBundle().equals(this.getSourceBundle()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode + ((getSourceBuildInformation() == null) ? 0 : getSourceBuildInformation().hashCode());
        hashCode = prime * hashCode + ((getSourceBundle() == null) ? 0 : getSourceBundle().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationVersionDescription clone() {
        try {
            return (ApplicationVersionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
