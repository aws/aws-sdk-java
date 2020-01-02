/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the installation media for a DB engine that requires an on-premises customer provided license, such as
 * Microsoft SQL Server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ImportInstallationMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstallationMediaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The installation medium ID.
     * </p>
     */
    private String installationMediaId;
    /**
     * <p>
     * The custom Availability Zone (AZ) that contains the installation media.
     * </p>
     */
    private String customAvailabilityZoneId;
    /**
     * <p>
     * The DB engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine version of the DB engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The path to the installation medium for the DB engine.
     * </p>
     */
    private String engineInstallationMediaPath;
    /**
     * <p>
     * The path to the installation medium for the operating system associated with the DB engine.
     * </p>
     */
    private String oSInstallationMediaPath;
    /**
     * <p>
     * The status of the installation medium.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If an installation media failure occurred, the cause of the failure.
     * </p>
     */
    private InstallationMediaFailureCause failureCause;

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * 
     * @param installationMediaId
     *        The installation medium ID.
     */

    public void setInstallationMediaId(String installationMediaId) {
        this.installationMediaId = installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * 
     * @return The installation medium ID.
     */

    public String getInstallationMediaId() {
        return this.installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * 
     * @param installationMediaId
     *        The installation medium ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaResult withInstallationMediaId(String installationMediaId) {
        setInstallationMediaId(installationMediaId);
        return this;
    }

    /**
     * <p>
     * The custom Availability Zone (AZ) that contains the installation media.
     * </p>
     * 
     * @param customAvailabilityZoneId
     *        The custom Availability Zone (AZ) that contains the installation media.
     */

    public void setCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
    }

    /**
     * <p>
     * The custom Availability Zone (AZ) that contains the installation media.
     * </p>
     * 
     * @return The custom Availability Zone (AZ) that contains the installation media.
     */

    public String getCustomAvailabilityZoneId() {
        return this.customAvailabilityZoneId;
    }

    /**
     * <p>
     * The custom Availability Zone (AZ) that contains the installation media.
     * </p>
     * 
     * @param customAvailabilityZoneId
     *        The custom Availability Zone (AZ) that contains the installation media.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaResult withCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        setCustomAvailabilityZoneId(customAvailabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The DB engine.
     * </p>
     * 
     * @param engine
     *        The DB engine.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The DB engine.
     * </p>
     * 
     * @return The DB engine.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The DB engine.
     * </p>
     * 
     * @param engine
     *        The DB engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaResult withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine version of the DB engine.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of the DB engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version of the DB engine.
     * </p>
     * 
     * @return The engine version of the DB engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version of the DB engine.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of the DB engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaResult withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The path to the installation medium for the DB engine.
     * </p>
     * 
     * @param engineInstallationMediaPath
     *        The path to the installation medium for the DB engine.
     */

    public void setEngineInstallationMediaPath(String engineInstallationMediaPath) {
        this.engineInstallationMediaPath = engineInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the DB engine.
     * </p>
     * 
     * @return The path to the installation medium for the DB engine.
     */

    public String getEngineInstallationMediaPath() {
        return this.engineInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the DB engine.
     * </p>
     * 
     * @param engineInstallationMediaPath
     *        The path to the installation medium for the DB engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaResult withEngineInstallationMediaPath(String engineInstallationMediaPath) {
        setEngineInstallationMediaPath(engineInstallationMediaPath);
        return this;
    }

    /**
     * <p>
     * The path to the installation medium for the operating system associated with the DB engine.
     * </p>
     * 
     * @param oSInstallationMediaPath
     *        The path to the installation medium for the operating system associated with the DB engine.
     */

    public void setOSInstallationMediaPath(String oSInstallationMediaPath) {
        this.oSInstallationMediaPath = oSInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the operating system associated with the DB engine.
     * </p>
     * 
     * @return The path to the installation medium for the operating system associated with the DB engine.
     */

    public String getOSInstallationMediaPath() {
        return this.oSInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the operating system associated with the DB engine.
     * </p>
     * 
     * @param oSInstallationMediaPath
     *        The path to the installation medium for the operating system associated with the DB engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaResult withOSInstallationMediaPath(String oSInstallationMediaPath) {
        setOSInstallationMediaPath(oSInstallationMediaPath);
        return this;
    }

    /**
     * <p>
     * The status of the installation medium.
     * </p>
     * 
     * @param status
     *        The status of the installation medium.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the installation medium.
     * </p>
     * 
     * @return The status of the installation medium.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the installation medium.
     * </p>
     * 
     * @param status
     *        The status of the installation medium.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If an installation media failure occurred, the cause of the failure.
     * </p>
     * 
     * @param failureCause
     *        If an installation media failure occurred, the cause of the failure.
     */

    public void setFailureCause(InstallationMediaFailureCause failureCause) {
        this.failureCause = failureCause;
    }

    /**
     * <p>
     * If an installation media failure occurred, the cause of the failure.
     * </p>
     * 
     * @return If an installation media failure occurred, the cause of the failure.
     */

    public InstallationMediaFailureCause getFailureCause() {
        return this.failureCause;
    }

    /**
     * <p>
     * If an installation media failure occurred, the cause of the failure.
     * </p>
     * 
     * @param failureCause
     *        If an installation media failure occurred, the cause of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstallationMediaResult withFailureCause(InstallationMediaFailureCause failureCause) {
        setFailureCause(failureCause);
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
        if (getInstallationMediaId() != null)
            sb.append("InstallationMediaId: ").append(getInstallationMediaId()).append(",");
        if (getCustomAvailabilityZoneId() != null)
            sb.append("CustomAvailabilityZoneId: ").append(getCustomAvailabilityZoneId()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEngineInstallationMediaPath() != null)
            sb.append("EngineInstallationMediaPath: ").append(getEngineInstallationMediaPath()).append(",");
        if (getOSInstallationMediaPath() != null)
            sb.append("OSInstallationMediaPath: ").append(getOSInstallationMediaPath()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureCause() != null)
            sb.append("FailureCause: ").append(getFailureCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportInstallationMediaResult == false)
            return false;
        ImportInstallationMediaResult other = (ImportInstallationMediaResult) obj;
        if (other.getInstallationMediaId() == null ^ this.getInstallationMediaId() == null)
            return false;
        if (other.getInstallationMediaId() != null && other.getInstallationMediaId().equals(this.getInstallationMediaId()) == false)
            return false;
        if (other.getCustomAvailabilityZoneId() == null ^ this.getCustomAvailabilityZoneId() == null)
            return false;
        if (other.getCustomAvailabilityZoneId() != null && other.getCustomAvailabilityZoneId().equals(this.getCustomAvailabilityZoneId()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEngineInstallationMediaPath() == null ^ this.getEngineInstallationMediaPath() == null)
            return false;
        if (other.getEngineInstallationMediaPath() != null && other.getEngineInstallationMediaPath().equals(this.getEngineInstallationMediaPath()) == false)
            return false;
        if (other.getOSInstallationMediaPath() == null ^ this.getOSInstallationMediaPath() == null)
            return false;
        if (other.getOSInstallationMediaPath() != null && other.getOSInstallationMediaPath().equals(this.getOSInstallationMediaPath()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureCause() == null ^ this.getFailureCause() == null)
            return false;
        if (other.getFailureCause() != null && other.getFailureCause().equals(this.getFailureCause()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstallationMediaId() == null) ? 0 : getInstallationMediaId().hashCode());
        hashCode = prime * hashCode + ((getCustomAvailabilityZoneId() == null) ? 0 : getCustomAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEngineInstallationMediaPath() == null) ? 0 : getEngineInstallationMediaPath().hashCode());
        hashCode = prime * hashCode + ((getOSInstallationMediaPath() == null) ? 0 : getOSInstallationMediaPath().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureCause() == null) ? 0 : getFailureCause().hashCode());
        return hashCode;
    }

    @Override
    public ImportInstallationMediaResult clone() {
        try {
            return (ImportInstallationMediaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
