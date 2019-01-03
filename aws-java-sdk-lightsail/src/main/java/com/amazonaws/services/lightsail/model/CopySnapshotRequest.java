/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CopySnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopySnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the source instance or disk snapshot to be copied.
     * </p>
     */
    private String sourceSnapshotName;
    /**
     * <p>
     * The name of the new instance or disk snapshot to be created as a copy.
     * </p>
     */
    private String targetSnapshotName;
    /**
     * <p>
     * The AWS Region where the source snapshot is located.
     * </p>
     */
    private String sourceRegion;

    /**
     * <p>
     * The name of the source instance or disk snapshot to be copied.
     * </p>
     * 
     * @param sourceSnapshotName
     *        The name of the source instance or disk snapshot to be copied.
     */

    public void setSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the source instance or disk snapshot to be copied.
     * </p>
     * 
     * @return The name of the source instance or disk snapshot to be copied.
     */

    public String getSourceSnapshotName() {
        return this.sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the source instance or disk snapshot to be copied.
     * </p>
     * 
     * @param sourceSnapshotName
     *        The name of the source instance or disk snapshot to be copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withSourceSnapshotName(String sourceSnapshotName) {
        setSourceSnapshotName(sourceSnapshotName);
        return this;
    }

    /**
     * <p>
     * The name of the new instance or disk snapshot to be created as a copy.
     * </p>
     * 
     * @param targetSnapshotName
     *        The name of the new instance or disk snapshot to be created as a copy.
     */

    public void setTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
    }

    /**
     * <p>
     * The name of the new instance or disk snapshot to be created as a copy.
     * </p>
     * 
     * @return The name of the new instance or disk snapshot to be created as a copy.
     */

    public String getTargetSnapshotName() {
        return this.targetSnapshotName;
    }

    /**
     * <p>
     * The name of the new instance or disk snapshot to be created as a copy.
     * </p>
     * 
     * @param targetSnapshotName
     *        The name of the new instance or disk snapshot to be created as a copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withTargetSnapshotName(String targetSnapshotName) {
        setTargetSnapshotName(targetSnapshotName);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the source snapshot is located.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region where the source snapshot is located.
     * @see RegionName
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The AWS Region where the source snapshot is located.
     * </p>
     * 
     * @return The AWS Region where the source snapshot is located.
     * @see RegionName
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The AWS Region where the source snapshot is located.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region where the source snapshot is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public CopySnapshotRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the source snapshot is located.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region where the source snapshot is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public CopySnapshotRequest withSourceRegion(RegionName sourceRegion) {
        this.sourceRegion = sourceRegion.toString();
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
        if (getSourceSnapshotName() != null)
            sb.append("SourceSnapshotName: ").append(getSourceSnapshotName()).append(",");
        if (getTargetSnapshotName() != null)
            sb.append("TargetSnapshotName: ").append(getTargetSnapshotName()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopySnapshotRequest == false)
            return false;
        CopySnapshotRequest other = (CopySnapshotRequest) obj;
        if (other.getSourceSnapshotName() == null ^ this.getSourceSnapshotName() == null)
            return false;
        if (other.getSourceSnapshotName() != null && other.getSourceSnapshotName().equals(this.getSourceSnapshotName()) == false)
            return false;
        if (other.getTargetSnapshotName() == null ^ this.getTargetSnapshotName() == null)
            return false;
        if (other.getTargetSnapshotName() != null && other.getTargetSnapshotName().equals(this.getTargetSnapshotName()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceSnapshotName() == null) ? 0 : getSourceSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getTargetSnapshotName() == null) ? 0 : getTargetSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CopySnapshotRequest clone() {
        return (CopySnapshotRequest) super.clone();
    }

}
