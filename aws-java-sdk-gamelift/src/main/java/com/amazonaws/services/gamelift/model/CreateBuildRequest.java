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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class CreateBuildRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Descriptive label associated with a build. Build names do not need to be unique. A build name can be changed
     * later using <code> <a>UpdateBuild</a> </code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Version associated with this build. Version strings do not need to be unique to a build. A build version can be
     * changed later using <code> <a>UpdateBuild</a> </code>.
     * </p>
     */
    private String version;

    private S3Location storageLocation;
    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build.
     * </p>
     */
    private String operatingSystem;

    /**
     * <p>
     * Descriptive label associated with a build. Build names do not need to be unique. A build name can be changed
     * later using <code> <a>UpdateBuild</a> </code>.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a build. Build names do not need to be unique. A build name can be
     *        changed later using <code> <a>UpdateBuild</a> </code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with a build. Build names do not need to be unique. A build name can be changed
     * later using <code> <a>UpdateBuild</a> </code>.
     * </p>
     * 
     * @return Descriptive label associated with a build. Build names do not need to be unique. A build name can be
     *         changed later using <code> <a>UpdateBuild</a> </code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with a build. Build names do not need to be unique. A build name can be changed
     * later using <code> <a>UpdateBuild</a> </code>.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a build. Build names do not need to be unique. A build name can be
     *        changed later using <code> <a>UpdateBuild</a> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Version associated with this build. Version strings do not need to be unique to a build. A build version can be
     * changed later using <code> <a>UpdateBuild</a> </code>.
     * </p>
     * 
     * @param version
     *        Version associated with this build. Version strings do not need to be unique to a build. A build version
     *        can be changed later using <code> <a>UpdateBuild</a> </code>.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version associated with this build. Version strings do not need to be unique to a build. A build version can be
     * changed later using <code> <a>UpdateBuild</a> </code>.
     * </p>
     * 
     * @return Version associated with this build. Version strings do not need to be unique to a build. A build version
     *         can be changed later using <code> <a>UpdateBuild</a> </code>.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version associated with this build. Version strings do not need to be unique to a build. A build version can be
     * changed later using <code> <a>UpdateBuild</a> </code>.
     * </p>
     * 
     * @param version
     *        Version associated with this build. Version strings do not need to be unique to a build. A build version
     *        can be changed later using <code> <a>UpdateBuild</a> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * @param storageLocation
     */

    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * @return
     */

    public S3Location getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @param storageLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withStorageLocation(S3Location storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build.
     * </p>
     * 
     * @return Operating system that the game server binaries are built to run on. This value determines the type of
     *         fleet resources that you can use for this build.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public CreateBuildRequest withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
    }

    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public CreateBuildRequest withOperatingSystem(OperatingSystem operatingSystem) {
        setOperatingSystem(operatingSystem);
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
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: " + getStorageLocation() + ",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: " + getOperatingSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBuildRequest == false)
            return false;
        CreateBuildRequest other = (CreateBuildRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStorageLocation() == null ^ this.getStorageLocation() == null)
            return false;
        if (other.getStorageLocation() != null && other.getStorageLocation().equals(this.getStorageLocation()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        return hashCode;
    }

    @Override
    public CreateBuildRequest clone() {
        return (CreateBuildRequest) super.clone();
    }
}
