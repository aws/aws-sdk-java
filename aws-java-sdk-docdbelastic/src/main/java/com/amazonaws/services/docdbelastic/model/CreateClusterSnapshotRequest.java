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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateClusterSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster that the snapshot will be taken from.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The name of the Elastic DocumentDB snapshot.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The tags to be assigned to the new Elastic DocumentDB snapshot.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster that the snapshot will be taken from.
     * </p>
     * 
     * @param clusterArn
     *        The arn of the Elastic DocumentDB cluster that the snapshot will be taken from.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster that the snapshot will be taken from.
     * </p>
     * 
     * @return The arn of the Elastic DocumentDB cluster that the snapshot will be taken from.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster that the snapshot will be taken from.
     * </p>
     * 
     * @param clusterArn
     *        The arn of the Elastic DocumentDB cluster that the snapshot will be taken from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSnapshotRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The name of the Elastic DocumentDB snapshot.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB snapshot.
     * </p>
     * 
     * @return The name of the Elastic DocumentDB snapshot.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The name of the Elastic DocumentDB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSnapshotRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the new Elastic DocumentDB snapshot.
     * </p>
     * 
     * @return The tags to be assigned to the new Elastic DocumentDB snapshot.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the new Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the new Elastic DocumentDB snapshot.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be assigned to the new Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the new Elastic DocumentDB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSnapshotRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateClusterSnapshotRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSnapshotRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterSnapshotRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterSnapshotRequest == false)
            return false;
        CreateClusterSnapshotRequest other = (CreateClusterSnapshotRequest) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterSnapshotRequest clone() {
        return (CreateClusterSnapshotRequest) super.clone();
    }

}
