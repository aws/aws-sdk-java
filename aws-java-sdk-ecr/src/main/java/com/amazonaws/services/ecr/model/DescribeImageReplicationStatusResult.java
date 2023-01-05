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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeImageReplicationStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageReplicationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     */
    private String repositoryName;

    private ImageIdentifier imageId;
    /**
     * <p>
     * The replication status details for the images in the specified repository.
     * </p>
     */
    private java.util.List<ImageReplicationStatus> replicationStatuses;

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     * 
     * @param repositoryName
     *        The repository name associated with the request.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     * 
     * @return The repository name associated with the request.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     * 
     * @param repositoryName
     *        The repository name associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageReplicationStatusResult withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * @param imageId
     */

    public void setImageId(ImageIdentifier imageId) {
        this.imageId = imageId;
    }

    /**
     * @return
     */

    public ImageIdentifier getImageId() {
        return this.imageId;
    }

    /**
     * @param imageId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageReplicationStatusResult withImageId(ImageIdentifier imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The replication status details for the images in the specified repository.
     * </p>
     * 
     * @return The replication status details for the images in the specified repository.
     */

    public java.util.List<ImageReplicationStatus> getReplicationStatuses() {
        return replicationStatuses;
    }

    /**
     * <p>
     * The replication status details for the images in the specified repository.
     * </p>
     * 
     * @param replicationStatuses
     *        The replication status details for the images in the specified repository.
     */

    public void setReplicationStatuses(java.util.Collection<ImageReplicationStatus> replicationStatuses) {
        if (replicationStatuses == null) {
            this.replicationStatuses = null;
            return;
        }

        this.replicationStatuses = new java.util.ArrayList<ImageReplicationStatus>(replicationStatuses);
    }

    /**
     * <p>
     * The replication status details for the images in the specified repository.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationStatuses(java.util.Collection)} or {@link #withReplicationStatuses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param replicationStatuses
     *        The replication status details for the images in the specified repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageReplicationStatusResult withReplicationStatuses(ImageReplicationStatus... replicationStatuses) {
        if (this.replicationStatuses == null) {
            setReplicationStatuses(new java.util.ArrayList<ImageReplicationStatus>(replicationStatuses.length));
        }
        for (ImageReplicationStatus ele : replicationStatuses) {
            this.replicationStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The replication status details for the images in the specified repository.
     * </p>
     * 
     * @param replicationStatuses
     *        The replication status details for the images in the specified repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageReplicationStatusResult withReplicationStatuses(java.util.Collection<ImageReplicationStatus> replicationStatuses) {
        setReplicationStatuses(replicationStatuses);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getReplicationStatuses() != null)
            sb.append("ReplicationStatuses: ").append(getReplicationStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImageReplicationStatusResult == false)
            return false;
        DescribeImageReplicationStatusResult other = (DescribeImageReplicationStatusResult) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getReplicationStatuses() == null ^ this.getReplicationStatuses() == null)
            return false;
        if (other.getReplicationStatuses() != null && other.getReplicationStatuses().equals(this.getReplicationStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatuses() == null) ? 0 : getReplicationStatuses().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImageReplicationStatusResult clone() {
        try {
            return (DescribeImageReplicationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
