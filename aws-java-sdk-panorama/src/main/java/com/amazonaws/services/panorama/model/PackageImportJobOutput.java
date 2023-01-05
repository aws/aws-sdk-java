/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Results of a package import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/PackageImportJobOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageImportJobOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The package's output location.
     * </p>
     */
    private OutPutS3Location outputS3Location;
    /**
     * <p>
     * The package's ID.
     * </p>
     */
    private String packageId;
    /**
     * <p>
     * The package's version.
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * The package's patch version.
     * </p>
     */
    private String patchVersion;

    /**
     * <p>
     * The package's output location.
     * </p>
     * 
     * @param outputS3Location
     *        The package's output location.
     */

    public void setOutputS3Location(OutPutS3Location outputS3Location) {
        this.outputS3Location = outputS3Location;
    }

    /**
     * <p>
     * The package's output location.
     * </p>
     * 
     * @return The package's output location.
     */

    public OutPutS3Location getOutputS3Location() {
        return this.outputS3Location;
    }

    /**
     * <p>
     * The package's output location.
     * </p>
     * 
     * @param outputS3Location
     *        The package's output location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageImportJobOutput withOutputS3Location(OutPutS3Location outputS3Location) {
        setOutputS3Location(outputS3Location);
        return this;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @param packageId
     *        The package's ID.
     */

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @return The package's ID.
     */

    public String getPackageId() {
        return this.packageId;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @param packageId
     *        The package's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageImportJobOutput withPackageId(String packageId) {
        setPackageId(packageId);
        return this;
    }

    /**
     * <p>
     * The package's version.
     * </p>
     * 
     * @param packageVersion
     *        The package's version.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * The package's version.
     * </p>
     * 
     * @return The package's version.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * The package's version.
     * </p>
     * 
     * @param packageVersion
     *        The package's version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageImportJobOutput withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * The package's patch version.
     * </p>
     * 
     * @param patchVersion
     *        The package's patch version.
     */

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }

    /**
     * <p>
     * The package's patch version.
     * </p>
     * 
     * @return The package's patch version.
     */

    public String getPatchVersion() {
        return this.patchVersion;
    }

    /**
     * <p>
     * The package's patch version.
     * </p>
     * 
     * @param patchVersion
     *        The package's patch version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageImportJobOutput withPatchVersion(String patchVersion) {
        setPatchVersion(patchVersion);
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
        if (getOutputS3Location() != null)
            sb.append("OutputS3Location: ").append(getOutputS3Location()).append(",");
        if (getPackageId() != null)
            sb.append("PackageId: ").append(getPackageId()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getPatchVersion() != null)
            sb.append("PatchVersion: ").append(getPatchVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageImportJobOutput == false)
            return false;
        PackageImportJobOutput other = (PackageImportJobOutput) obj;
        if (other.getOutputS3Location() == null ^ this.getOutputS3Location() == null)
            return false;
        if (other.getOutputS3Location() != null && other.getOutputS3Location().equals(this.getOutputS3Location()) == false)
            return false;
        if (other.getPackageId() == null ^ this.getPackageId() == null)
            return false;
        if (other.getPackageId() != null && other.getPackageId().equals(this.getPackageId()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getPatchVersion() == null ^ this.getPatchVersion() == null)
            return false;
        if (other.getPatchVersion() != null && other.getPatchVersion().equals(this.getPatchVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputS3Location() == null) ? 0 : getOutputS3Location().hashCode());
        hashCode = prime * hashCode + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getPatchVersion() == null) ? 0 : getPatchVersion().hashCode());
        return hashCode;
    }

    @Override
    public PackageImportJobOutput clone() {
        try {
            return (PackageImportJobOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.PackageImportJobOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
