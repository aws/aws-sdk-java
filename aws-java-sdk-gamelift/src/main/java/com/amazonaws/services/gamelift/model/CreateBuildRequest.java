/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBuildRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Descriptive label that is associated with a build. Build names do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Version that is associated with this build. Version strings do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Amazon S3 location of the game build files to be uploaded. The S3 bucket must be owned by the same AWS account
     * that you're using to manage Amazon GameLift. It also must in the same region that you want to create a new build
     * in. Before calling <code>CreateBuild</code> with this location, you must allow Amazon GameLift to access your
     * Amazon S3 bucket (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     * >Create a Build with Files in Amazon S3</a>).
     * </p>
     */
    private S3Location storageLocation;
    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system.
     * </p>
     */
    private String operatingSystem;

    /**
     * <p>
     * Descriptive label that is associated with a build. Build names do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a build. Build names do not need to be unique. You can use
     *        <a>UpdateBuild</a> to change this value later.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a build. Build names do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @return Descriptive label that is associated with a build. Build names do not need to be unique. You can use
     *         <a>UpdateBuild</a> to change this value later.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a build. Build names do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a build. Build names do not need to be unique. You can use
     *        <a>UpdateBuild</a> to change this value later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Version that is associated with this build. Version strings do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @param version
     *        Version that is associated with this build. Version strings do not need to be unique. You can use
     *        <a>UpdateBuild</a> to change this value later.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version that is associated with this build. Version strings do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @return Version that is associated with this build. Version strings do not need to be unique. You can use
     *         <a>UpdateBuild</a> to change this value later.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version that is associated with this build. Version strings do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @param version
     *        Version that is associated with this build. Version strings do not need to be unique. You can use
     *        <a>UpdateBuild</a> to change this value later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Amazon S3 location of the game build files to be uploaded. The S3 bucket must be owned by the same AWS account
     * that you're using to manage Amazon GameLift. It also must in the same region that you want to create a new build
     * in. Before calling <code>CreateBuild</code> with this location, you must allow Amazon GameLift to access your
     * Amazon S3 bucket (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     * >Create a Build with Files in Amazon S3</a>).
     * </p>
     * 
     * @param storageLocation
     *        Amazon S3 location of the game build files to be uploaded. The S3 bucket must be owned by the same AWS
     *        account that you're using to manage Amazon GameLift. It also must in the same region that you want to
     *        create a new build in. Before calling <code>CreateBuild</code> with this location, you must allow Amazon
     *        GameLift to access your Amazon S3 bucket (see <a href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     *        >Create a Build with Files in Amazon S3</a>).
     */

    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * Amazon S3 location of the game build files to be uploaded. The S3 bucket must be owned by the same AWS account
     * that you're using to manage Amazon GameLift. It also must in the same region that you want to create a new build
     * in. Before calling <code>CreateBuild</code> with this location, you must allow Amazon GameLift to access your
     * Amazon S3 bucket (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     * >Create a Build with Files in Amazon S3</a>).
     * </p>
     * 
     * @return Amazon S3 location of the game build files to be uploaded. The S3 bucket must be owned by the same AWS
     *         account that you're using to manage Amazon GameLift. It also must in the same region that you want to
     *         create a new build in. Before calling <code>CreateBuild</code> with this location, you must allow Amazon
     *         GameLift to access your Amazon S3 bucket (see <a href=
     *         "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     *         >Create a Build with Files in Amazon S3</a>).
     */

    public S3Location getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * Amazon S3 location of the game build files to be uploaded. The S3 bucket must be owned by the same AWS account
     * that you're using to manage Amazon GameLift. It also must in the same region that you want to create a new build
     * in. Before calling <code>CreateBuild</code> with this location, you must allow Amazon GameLift to access your
     * Amazon S3 bucket (see <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     * >Create a Build with Files in Amazon S3</a>).
     * </p>
     * 
     * @param storageLocation
     *        Amazon S3 location of the game build files to be uploaded. The S3 bucket must be owned by the same AWS
     *        account that you're using to manage Amazon GameLift. It also must in the same region that you want to
     *        create a new build in. Before calling <code>CreateBuild</code> with this location, you must allow Amazon
     *        GameLift to access your Amazon S3 bucket (see <a href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     *        >Create a Build with Files in Amazon S3</a>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withStorageLocation(S3Location storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build. If your game build contains multiple executables, they
     *        all must run on the same operating system.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system.
     * </p>
     * 
     * @return Operating system that the game server binaries are built to run on. This value determines the type of
     *         fleet resources that you can use for this build. If your game build contains multiple executables, they
     *         all must run on the same operating system.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build. If your game build contains multiple executables, they
     *        all must run on the same operating system.
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
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build. If your game build contains multiple executables, they
     *        all must run on the same operating system.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * Operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build. If your game build contains multiple executables, they
     *        all must run on the same operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public CreateBuildRequest withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
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
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: ").append(getStorageLocation()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem());
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
