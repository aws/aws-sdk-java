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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeSpace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The space's Amazon Resource Name (ARN).
     * </p>
     */
    private String spaceArn;
    /**
     * <p>
     * The name of the space.
     * </p>
     */
    private String spaceName;
    /**
     * <p>
     * The ID of the space's profile in the Amazon Elastic File System volume.
     * </p>
     */
    private String homeEfsFileSystemUid;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The last modified time.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The failure reason.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * A collection of space settings.
     * </p>
     */
    private SpaceSettings spaceSettings;

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the associated Domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @return The ID of the associated Domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the associated Domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpaceResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The space's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param spaceArn
     *        The space's Amazon Resource Name (ARN).
     */

    public void setSpaceArn(String spaceArn) {
        this.spaceArn = spaceArn;
    }

    /**
     * <p>
     * The space's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The space's Amazon Resource Name (ARN).
     */

    public String getSpaceArn() {
        return this.spaceArn;
    }

    /**
     * <p>
     * The space's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param spaceArn
     *        The space's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpaceResult withSpaceArn(String spaceArn) {
        setSpaceArn(spaceArn);
        return this;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @param spaceName
     *        The name of the space.
     */

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @return The name of the space.
     */

    public String getSpaceName() {
        return this.spaceName;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @param spaceName
     *        The name of the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpaceResult withSpaceName(String spaceName) {
        setSpaceName(spaceName);
        return this;
    }

    /**
     * <p>
     * The ID of the space's profile in the Amazon Elastic File System volume.
     * </p>
     * 
     * @param homeEfsFileSystemUid
     *        The ID of the space's profile in the Amazon Elastic File System volume.
     */

    public void setHomeEfsFileSystemUid(String homeEfsFileSystemUid) {
        this.homeEfsFileSystemUid = homeEfsFileSystemUid;
    }

    /**
     * <p>
     * The ID of the space's profile in the Amazon Elastic File System volume.
     * </p>
     * 
     * @return The ID of the space's profile in the Amazon Elastic File System volume.
     */

    public String getHomeEfsFileSystemUid() {
        return this.homeEfsFileSystemUid;
    }

    /**
     * <p>
     * The ID of the space's profile in the Amazon Elastic File System volume.
     * </p>
     * 
     * @param homeEfsFileSystemUid
     *        The ID of the space's profile in the Amazon Elastic File System volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpaceResult withHomeEfsFileSystemUid(String homeEfsFileSystemUid) {
        setHomeEfsFileSystemUid(homeEfsFileSystemUid);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see SpaceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see SpaceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpaceStatus
     */

    public DescribeSpaceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpaceStatus
     */

    public DescribeSpaceResult withStatus(SpaceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @return The last modified time.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpaceResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpaceResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @param failureReason
     *        The failure reason.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @return The failure reason.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @param failureReason
     *        The failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpaceResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * A collection of space settings.
     * </p>
     * 
     * @param spaceSettings
     *        A collection of space settings.
     */

    public void setSpaceSettings(SpaceSettings spaceSettings) {
        this.spaceSettings = spaceSettings;
    }

    /**
     * <p>
     * A collection of space settings.
     * </p>
     * 
     * @return A collection of space settings.
     */

    public SpaceSettings getSpaceSettings() {
        return this.spaceSettings;
    }

    /**
     * <p>
     * A collection of space settings.
     * </p>
     * 
     * @param spaceSettings
     *        A collection of space settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpaceResult withSpaceSettings(SpaceSettings spaceSettings) {
        setSpaceSettings(spaceSettings);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getSpaceArn() != null)
            sb.append("SpaceArn: ").append(getSpaceArn()).append(",");
        if (getSpaceName() != null)
            sb.append("SpaceName: ").append(getSpaceName()).append(",");
        if (getHomeEfsFileSystemUid() != null)
            sb.append("HomeEfsFileSystemUid: ").append(getHomeEfsFileSystemUid()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getSpaceSettings() != null)
            sb.append("SpaceSettings: ").append(getSpaceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpaceResult == false)
            return false;
        DescribeSpaceResult other = (DescribeSpaceResult) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getSpaceArn() == null ^ this.getSpaceArn() == null)
            return false;
        if (other.getSpaceArn() != null && other.getSpaceArn().equals(this.getSpaceArn()) == false)
            return false;
        if (other.getSpaceName() == null ^ this.getSpaceName() == null)
            return false;
        if (other.getSpaceName() != null && other.getSpaceName().equals(this.getSpaceName()) == false)
            return false;
        if (other.getHomeEfsFileSystemUid() == null ^ this.getHomeEfsFileSystemUid() == null)
            return false;
        if (other.getHomeEfsFileSystemUid() != null && other.getHomeEfsFileSystemUid().equals(this.getHomeEfsFileSystemUid()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSpaceSettings() == null ^ this.getSpaceSettings() == null)
            return false;
        if (other.getSpaceSettings() != null && other.getSpaceSettings().equals(this.getSpaceSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getSpaceArn() == null) ? 0 : getSpaceArn().hashCode());
        hashCode = prime * hashCode + ((getSpaceName() == null) ? 0 : getSpaceName().hashCode());
        hashCode = prime * hashCode + ((getHomeEfsFileSystemUid() == null) ? 0 : getHomeEfsFileSystemUid().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSpaceSettings() == null) ? 0 : getSpaceSettings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpaceResult clone() {
        try {
            return (DescribeSpaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
