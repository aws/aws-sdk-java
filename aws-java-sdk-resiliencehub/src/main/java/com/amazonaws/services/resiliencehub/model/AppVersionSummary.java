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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Version of an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AppVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Version of an application.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * Creation time of the application version.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Identifier of the application version.
     * </p>
     */
    private Long identifier;
    /**
     * <p>
     * Name of the application version.
     * </p>
     */
    private String versionName;

    /**
     * <p>
     * Version of an application.
     * </p>
     * 
     * @param appVersion
     *        Version of an application.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * Version of an application.
     * </p>
     * 
     * @return Version of an application.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * Version of an application.
     * </p>
     * 
     * @param appVersion
     *        Version of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppVersionSummary withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * Creation time of the application version.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the application version.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the application version.
     * </p>
     * 
     * @return Creation time of the application version.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Creation time of the application version.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppVersionSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Identifier of the application version.
     * </p>
     * 
     * @param identifier
     *        Identifier of the application version.
     */

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Identifier of the application version.
     * </p>
     * 
     * @return Identifier of the application version.
     */

    public Long getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Identifier of the application version.
     * </p>
     * 
     * @param identifier
     *        Identifier of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppVersionSummary withIdentifier(Long identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Name of the application version.
     * </p>
     * 
     * @param versionName
     *        Name of the application version.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * Name of the application version.
     * </p>
     * 
     * @return Name of the application version.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * Name of the application version.
     * </p>
     * 
     * @param versionName
     *        Name of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppVersionSummary withVersionName(String versionName) {
        setVersionName(versionName);
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
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppVersionSummary == false)
            return false;
        AppVersionSummary other = (AppVersionSummary) obj;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        return hashCode;
    }

    @Override
    public AppVersionSummary clone() {
        try {
            return (AppVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.AppVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
