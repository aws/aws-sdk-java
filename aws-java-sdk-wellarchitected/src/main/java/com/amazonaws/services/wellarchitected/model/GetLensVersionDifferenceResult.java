/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensVersionDifference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLensVersionDifferenceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String lensAlias;
    /**
     * <p>
     * The base version of the lens.
     * </p>
     */
    private String baseLensVersion;
    /**
     * <p>
     * The latest version of the lens.
     * </p>
     */
    private String latestLensVersion;

    private VersionDifferences versionDifferences;

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLensVersionDifferenceResult withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * The base version of the lens.
     * </p>
     * 
     * @param baseLensVersion
     *        The base version of the lens.
     */

    public void setBaseLensVersion(String baseLensVersion) {
        this.baseLensVersion = baseLensVersion;
    }

    /**
     * <p>
     * The base version of the lens.
     * </p>
     * 
     * @return The base version of the lens.
     */

    public String getBaseLensVersion() {
        return this.baseLensVersion;
    }

    /**
     * <p>
     * The base version of the lens.
     * </p>
     * 
     * @param baseLensVersion
     *        The base version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLensVersionDifferenceResult withBaseLensVersion(String baseLensVersion) {
        setBaseLensVersion(baseLensVersion);
        return this;
    }

    /**
     * <p>
     * The latest version of the lens.
     * </p>
     * 
     * @param latestLensVersion
     *        The latest version of the lens.
     */

    public void setLatestLensVersion(String latestLensVersion) {
        this.latestLensVersion = latestLensVersion;
    }

    /**
     * <p>
     * The latest version of the lens.
     * </p>
     * 
     * @return The latest version of the lens.
     */

    public String getLatestLensVersion() {
        return this.latestLensVersion;
    }

    /**
     * <p>
     * The latest version of the lens.
     * </p>
     * 
     * @param latestLensVersion
     *        The latest version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLensVersionDifferenceResult withLatestLensVersion(String latestLensVersion) {
        setLatestLensVersion(latestLensVersion);
        return this;
    }

    /**
     * @param versionDifferences
     */

    public void setVersionDifferences(VersionDifferences versionDifferences) {
        this.versionDifferences = versionDifferences;
    }

    /**
     * @return
     */

    public VersionDifferences getVersionDifferences() {
        return this.versionDifferences;
    }

    /**
     * @param versionDifferences
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLensVersionDifferenceResult withVersionDifferences(VersionDifferences versionDifferences) {
        setVersionDifferences(versionDifferences);
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
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getBaseLensVersion() != null)
            sb.append("BaseLensVersion: ").append(getBaseLensVersion()).append(",");
        if (getLatestLensVersion() != null)
            sb.append("LatestLensVersion: ").append(getLatestLensVersion()).append(",");
        if (getVersionDifferences() != null)
            sb.append("VersionDifferences: ").append(getVersionDifferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLensVersionDifferenceResult == false)
            return false;
        GetLensVersionDifferenceResult other = (GetLensVersionDifferenceResult) obj;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getBaseLensVersion() == null ^ this.getBaseLensVersion() == null)
            return false;
        if (other.getBaseLensVersion() != null && other.getBaseLensVersion().equals(this.getBaseLensVersion()) == false)
            return false;
        if (other.getLatestLensVersion() == null ^ this.getLatestLensVersion() == null)
            return false;
        if (other.getLatestLensVersion() != null && other.getLatestLensVersion().equals(this.getLatestLensVersion()) == false)
            return false;
        if (other.getVersionDifferences() == null ^ this.getVersionDifferences() == null)
            return false;
        if (other.getVersionDifferences() != null && other.getVersionDifferences().equals(this.getVersionDifferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getBaseLensVersion() == null) ? 0 : getBaseLensVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestLensVersion() == null) ? 0 : getLatestLensVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionDifferences() == null) ? 0 : getVersionDifferences().hashCode());
        return hashCode;
    }

    @Override
    public GetLensVersionDifferenceResult clone() {
        try {
            return (GetLensVersionDifferenceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
