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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeMountTargets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMountTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the request included the <code>Marker</code>, the response returns that value in this field.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Returns the file system's mount targets as an array of <code>MountTargetDescription</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MountTargetDescription> mountTargets;
    /**
     * <p>
     * If a value is present, there are more mount targets to return. In a subsequent request, you can provide
     * <code>Marker</code> in your request with this value to retrieve the next set of mount targets.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * If the request included the <code>Marker</code>, the response returns that value in this field.
     * </p>
     * 
     * @param marker
     *        If the request included the <code>Marker</code>, the response returns that value in this field.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If the request included the <code>Marker</code>, the response returns that value in this field.
     * </p>
     * 
     * @return If the request included the <code>Marker</code>, the response returns that value in this field.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * If the request included the <code>Marker</code>, the response returns that value in this field.
     * </p>
     * 
     * @param marker
     *        If the request included the <code>Marker</code>, the response returns that value in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMountTargetsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Returns the file system's mount targets as an array of <code>MountTargetDescription</code> objects.
     * </p>
     * 
     * @return Returns the file system's mount targets as an array of <code>MountTargetDescription</code> objects.
     */

    public java.util.List<MountTargetDescription> getMountTargets() {
        if (mountTargets == null) {
            mountTargets = new com.amazonaws.internal.SdkInternalList<MountTargetDescription>();
        }
        return mountTargets;
    }

    /**
     * <p>
     * Returns the file system's mount targets as an array of <code>MountTargetDescription</code> objects.
     * </p>
     * 
     * @param mountTargets
     *        Returns the file system's mount targets as an array of <code>MountTargetDescription</code> objects.
     */

    public void setMountTargets(java.util.Collection<MountTargetDescription> mountTargets) {
        if (mountTargets == null) {
            this.mountTargets = null;
            return;
        }

        this.mountTargets = new com.amazonaws.internal.SdkInternalList<MountTargetDescription>(mountTargets);
    }

    /**
     * <p>
     * Returns the file system's mount targets as an array of <code>MountTargetDescription</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMountTargets(java.util.Collection)} or {@link #withMountTargets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mountTargets
     *        Returns the file system's mount targets as an array of <code>MountTargetDescription</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMountTargetsResult withMountTargets(MountTargetDescription... mountTargets) {
        if (this.mountTargets == null) {
            setMountTargets(new com.amazonaws.internal.SdkInternalList<MountTargetDescription>(mountTargets.length));
        }
        for (MountTargetDescription ele : mountTargets) {
            this.mountTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the file system's mount targets as an array of <code>MountTargetDescription</code> objects.
     * </p>
     * 
     * @param mountTargets
     *        Returns the file system's mount targets as an array of <code>MountTargetDescription</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMountTargetsResult withMountTargets(java.util.Collection<MountTargetDescription> mountTargets) {
        setMountTargets(mountTargets);
        return this;
    }

    /**
     * <p>
     * If a value is present, there are more mount targets to return. In a subsequent request, you can provide
     * <code>Marker</code> in your request with this value to retrieve the next set of mount targets.
     * </p>
     * 
     * @param nextMarker
     *        If a value is present, there are more mount targets to return. In a subsequent request, you can provide
     *        <code>Marker</code> in your request with this value to retrieve the next set of mount targets.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more mount targets to return. In a subsequent request, you can provide
     * <code>Marker</code> in your request with this value to retrieve the next set of mount targets.
     * </p>
     * 
     * @return If a value is present, there are more mount targets to return. In a subsequent request, you can provide
     *         <code>Marker</code> in your request with this value to retrieve the next set of mount targets.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more mount targets to return. In a subsequent request, you can provide
     * <code>Marker</code> in your request with this value to retrieve the next set of mount targets.
     * </p>
     * 
     * @param nextMarker
     *        If a value is present, there are more mount targets to return. In a subsequent request, you can provide
     *        <code>Marker</code> in your request with this value to retrieve the next set of mount targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMountTargetsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMountTargets() != null)
            sb.append("MountTargets: ").append(getMountTargets()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMountTargetsResult == false)
            return false;
        DescribeMountTargetsResult other = (DescribeMountTargetsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMountTargets() == null ^ this.getMountTargets() == null)
            return false;
        if (other.getMountTargets() != null && other.getMountTargets().equals(this.getMountTargets()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMountTargets() == null) ? 0 : getMountTargets().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMountTargetsResult clone() {
        try {
            return (DescribeMountTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
