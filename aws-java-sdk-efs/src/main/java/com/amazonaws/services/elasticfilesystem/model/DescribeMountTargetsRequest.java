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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeMountTargets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMountTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) Maximum number of mount targets to return in the response. Currently, this number is automatically set
     * to 10.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeMountTargets</code> operation (String).
     * If present, it specifies to continue the list from where the previous returning call left off.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * (Optional) ID of the file system whose mount targets you want to list (String). It must be included in your
     * request if <code>MountTargetId</code> is not included.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * (Optional) ID of the mount target that you want to have described (String). It must be included in your request
     * if <code>FileSystemId</code> is not included.
     * </p>
     */
    private String mountTargetId;

    /**
     * <p>
     * (Optional) Maximum number of mount targets to return in the response. Currently, this number is automatically set
     * to 10.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Maximum number of mount targets to return in the response. Currently, this number is
     *        automatically set to 10.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) Maximum number of mount targets to return in the response. Currently, this number is automatically set
     * to 10.
     * </p>
     * 
     * @return (Optional) Maximum number of mount targets to return in the response. Currently, this number is
     *         automatically set to 10.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) Maximum number of mount targets to return in the response. Currently, this number is automatically set
     * to 10.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Maximum number of mount targets to return in the response. Currently, this number is
     *        automatically set to 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMountTargetsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeMountTargets</code> operation (String).
     * If present, it specifies to continue the list from where the previous returning call left off.
     * </p>
     * 
     * @param marker
     *        (Optional) Opaque pagination token returned from a previous <code>DescribeMountTargets</code> operation
     *        (String). If present, it specifies to continue the list from where the previous returning call left off.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeMountTargets</code> operation (String).
     * If present, it specifies to continue the list from where the previous returning call left off.
     * </p>
     * 
     * @return (Optional) Opaque pagination token returned from a previous <code>DescribeMountTargets</code> operation
     *         (String). If present, it specifies to continue the list from where the previous returning call left off.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeMountTargets</code> operation (String).
     * If present, it specifies to continue the list from where the previous returning call left off.
     * </p>
     * 
     * @param marker
     *        (Optional) Opaque pagination token returned from a previous <code>DescribeMountTargets</code> operation
     *        (String). If present, it specifies to continue the list from where the previous returning call left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMountTargetsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose mount targets you want to list (String). It must be included in your
     * request if <code>MountTargetId</code> is not included.
     * </p>
     * 
     * @param fileSystemId
     *        (Optional) ID of the file system whose mount targets you want to list (String). It must be included in
     *        your request if <code>MountTargetId</code> is not included.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose mount targets you want to list (String). It must be included in your
     * request if <code>MountTargetId</code> is not included.
     * </p>
     * 
     * @return (Optional) ID of the file system whose mount targets you want to list (String). It must be included in
     *         your request if <code>MountTargetId</code> is not included.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose mount targets you want to list (String). It must be included in your
     * request if <code>MountTargetId</code> is not included.
     * </p>
     * 
     * @param fileSystemId
     *        (Optional) ID of the file system whose mount targets you want to list (String). It must be included in
     *        your request if <code>MountTargetId</code> is not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMountTargetsRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * (Optional) ID of the mount target that you want to have described (String). It must be included in your request
     * if <code>FileSystemId</code> is not included.
     * </p>
     * 
     * @param mountTargetId
     *        (Optional) ID of the mount target that you want to have described (String). It must be included in your
     *        request if <code>FileSystemId</code> is not included.
     */

    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * (Optional) ID of the mount target that you want to have described (String). It must be included in your request
     * if <code>FileSystemId</code> is not included.
     * </p>
     * 
     * @return (Optional) ID of the mount target that you want to have described (String). It must be included in your
     *         request if <code>FileSystemId</code> is not included.
     */

    public String getMountTargetId() {
        return this.mountTargetId;
    }

    /**
     * <p>
     * (Optional) ID of the mount target that you want to have described (String). It must be included in your request
     * if <code>FileSystemId</code> is not included.
     * </p>
     * 
     * @param mountTargetId
     *        (Optional) ID of the mount target that you want to have described (String). It must be included in your
     *        request if <code>FileSystemId</code> is not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMountTargetsRequest withMountTargetId(String mountTargetId) {
        setMountTargetId(mountTargetId);
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
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getMountTargetId() != null)
            sb.append("MountTargetId: ").append(getMountTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMountTargetsRequest == false)
            return false;
        DescribeMountTargetsRequest other = (DescribeMountTargetsRequest) obj;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMountTargetsRequest clone() {
        return (DescribeMountTargetsRequest) super.clone();
    }

}
