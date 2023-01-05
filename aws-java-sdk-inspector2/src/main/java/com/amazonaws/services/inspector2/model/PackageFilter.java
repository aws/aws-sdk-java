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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the details of a package filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/PackageFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains details on the package architecture type to filter on.
     * </p>
     */
    private StringFilter architecture;
    /**
     * <p>
     * An object that contains details on the package epoch to filter on.
     * </p>
     */
    private NumberFilter epoch;
    /**
     * <p>
     * An object that contains details on the name of the package to filter on.
     * </p>
     */
    private StringFilter name;
    /**
     * <p>
     * An object that contains details on the package release to filter on.
     * </p>
     */
    private StringFilter release;

    private StringFilter sourceLambdaLayerArn;
    /**
     * <p>
     * An object that contains details on the source layer hash to filter on.
     * </p>
     */
    private StringFilter sourceLayerHash;
    /**
     * <p>
     * The package version to filter on.
     * </p>
     */
    private StringFilter version;

    /**
     * <p>
     * An object that contains details on the package architecture type to filter on.
     * </p>
     * 
     * @param architecture
     *        An object that contains details on the package architecture type to filter on.
     */

    public void setArchitecture(StringFilter architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * An object that contains details on the package architecture type to filter on.
     * </p>
     * 
     * @return An object that contains details on the package architecture type to filter on.
     */

    public StringFilter getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * An object that contains details on the package architecture type to filter on.
     * </p>
     * 
     * @param architecture
     *        An object that contains details on the package architecture type to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageFilter withArchitecture(StringFilter architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * An object that contains details on the package epoch to filter on.
     * </p>
     * 
     * @param epoch
     *        An object that contains details on the package epoch to filter on.
     */

    public void setEpoch(NumberFilter epoch) {
        this.epoch = epoch;
    }

    /**
     * <p>
     * An object that contains details on the package epoch to filter on.
     * </p>
     * 
     * @return An object that contains details on the package epoch to filter on.
     */

    public NumberFilter getEpoch() {
        return this.epoch;
    }

    /**
     * <p>
     * An object that contains details on the package epoch to filter on.
     * </p>
     * 
     * @param epoch
     *        An object that contains details on the package epoch to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageFilter withEpoch(NumberFilter epoch) {
        setEpoch(epoch);
        return this;
    }

    /**
     * <p>
     * An object that contains details on the name of the package to filter on.
     * </p>
     * 
     * @param name
     *        An object that contains details on the name of the package to filter on.
     */

    public void setName(StringFilter name) {
        this.name = name;
    }

    /**
     * <p>
     * An object that contains details on the name of the package to filter on.
     * </p>
     * 
     * @return An object that contains details on the name of the package to filter on.
     */

    public StringFilter getName() {
        return this.name;
    }

    /**
     * <p>
     * An object that contains details on the name of the package to filter on.
     * </p>
     * 
     * @param name
     *        An object that contains details on the name of the package to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageFilter withName(StringFilter name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An object that contains details on the package release to filter on.
     * </p>
     * 
     * @param release
     *        An object that contains details on the package release to filter on.
     */

    public void setRelease(StringFilter release) {
        this.release = release;
    }

    /**
     * <p>
     * An object that contains details on the package release to filter on.
     * </p>
     * 
     * @return An object that contains details on the package release to filter on.
     */

    public StringFilter getRelease() {
        return this.release;
    }

    /**
     * <p>
     * An object that contains details on the package release to filter on.
     * </p>
     * 
     * @param release
     *        An object that contains details on the package release to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageFilter withRelease(StringFilter release) {
        setRelease(release);
        return this;
    }

    /**
     * @param sourceLambdaLayerArn
     */

    public void setSourceLambdaLayerArn(StringFilter sourceLambdaLayerArn) {
        this.sourceLambdaLayerArn = sourceLambdaLayerArn;
    }

    /**
     * @return
     */

    public StringFilter getSourceLambdaLayerArn() {
        return this.sourceLambdaLayerArn;
    }

    /**
     * @param sourceLambdaLayerArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageFilter withSourceLambdaLayerArn(StringFilter sourceLambdaLayerArn) {
        setSourceLambdaLayerArn(sourceLambdaLayerArn);
        return this;
    }

    /**
     * <p>
     * An object that contains details on the source layer hash to filter on.
     * </p>
     * 
     * @param sourceLayerHash
     *        An object that contains details on the source layer hash to filter on.
     */

    public void setSourceLayerHash(StringFilter sourceLayerHash) {
        this.sourceLayerHash = sourceLayerHash;
    }

    /**
     * <p>
     * An object that contains details on the source layer hash to filter on.
     * </p>
     * 
     * @return An object that contains details on the source layer hash to filter on.
     */

    public StringFilter getSourceLayerHash() {
        return this.sourceLayerHash;
    }

    /**
     * <p>
     * An object that contains details on the source layer hash to filter on.
     * </p>
     * 
     * @param sourceLayerHash
     *        An object that contains details on the source layer hash to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageFilter withSourceLayerHash(StringFilter sourceLayerHash) {
        setSourceLayerHash(sourceLayerHash);
        return this;
    }

    /**
     * <p>
     * The package version to filter on.
     * </p>
     * 
     * @param version
     *        The package version to filter on.
     */

    public void setVersion(StringFilter version) {
        this.version = version;
    }

    /**
     * <p>
     * The package version to filter on.
     * </p>
     * 
     * @return The package version to filter on.
     */

    public StringFilter getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The package version to filter on.
     * </p>
     * 
     * @param version
     *        The package version to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageFilter withVersion(StringFilter version) {
        setVersion(version);
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
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getEpoch() != null)
            sb.append("Epoch: ").append(getEpoch()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRelease() != null)
            sb.append("Release: ").append(getRelease()).append(",");
        if (getSourceLambdaLayerArn() != null)
            sb.append("SourceLambdaLayerArn: ").append(getSourceLambdaLayerArn()).append(",");
        if (getSourceLayerHash() != null)
            sb.append("SourceLayerHash: ").append(getSourceLayerHash()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageFilter == false)
            return false;
        PackageFilter other = (PackageFilter) obj;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getEpoch() == null ^ this.getEpoch() == null)
            return false;
        if (other.getEpoch() != null && other.getEpoch().equals(this.getEpoch()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRelease() == null ^ this.getRelease() == null)
            return false;
        if (other.getRelease() != null && other.getRelease().equals(this.getRelease()) == false)
            return false;
        if (other.getSourceLambdaLayerArn() == null ^ this.getSourceLambdaLayerArn() == null)
            return false;
        if (other.getSourceLambdaLayerArn() != null && other.getSourceLambdaLayerArn().equals(this.getSourceLambdaLayerArn()) == false)
            return false;
        if (other.getSourceLayerHash() == null ^ this.getSourceLayerHash() == null)
            return false;
        if (other.getSourceLayerHash() != null && other.getSourceLayerHash().equals(this.getSourceLayerHash()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getEpoch() == null) ? 0 : getEpoch().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRelease() == null) ? 0 : getRelease().hashCode());
        hashCode = prime * hashCode + ((getSourceLambdaLayerArn() == null) ? 0 : getSourceLambdaLayerArn().hashCode());
        hashCode = prime * hashCode + ((getSourceLayerHash() == null) ? 0 : getSourceLayerHash().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public PackageFilter clone() {
        try {
            return (PackageFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.PackageFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
