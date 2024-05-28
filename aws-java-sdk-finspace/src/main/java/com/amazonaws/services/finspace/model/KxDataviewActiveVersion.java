/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The active version of the dataview that is currently in use by this cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxDataviewActiveVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxDataviewActiveVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     */
    private String changesetId;
    /**
     * <p>
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     */
    private java.util.List<KxDataviewSegmentConfiguration> segmentConfigurations;
    /**
     * <p>
     * The list of clusters that are currently using this dataview.
     * </p>
     */
    private java.util.List<String> attachedClusters;
    /**
     * <p>
     * The timestamp at which the dataview version was active. The value is determined as epoch time in milliseconds.
     * For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * A unique identifier of the active version.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier for the changeset.
     */

    public void setChangesetId(String changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @return A unique identifier for the changeset.
     */

    public String getChangesetId() {
        return this.changesetId;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier for the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewActiveVersion withChangesetId(String changesetId) {
        setChangesetId(changesetId);
        return this;
    }

    /**
     * <p>
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     * 
     * @return The configuration that contains the database path of the data that you want to place on each selected
     *         volume. Each segment must have a unique database path for each volume. If you do not explicitly specify
     *         any database path for a volume, they are accessible from the cluster through the default S3/object store
     *         segment.
     */

    public java.util.List<KxDataviewSegmentConfiguration> getSegmentConfigurations() {
        return segmentConfigurations;
    }

    /**
     * <p>
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     * 
     * @param segmentConfigurations
     *        The configuration that contains the database path of the data that you want to place on each selected
     *        volume. Each segment must have a unique database path for each volume. If you do not explicitly specify
     *        any database path for a volume, they are accessible from the cluster through the default S3/object store
     *        segment.
     */

    public void setSegmentConfigurations(java.util.Collection<KxDataviewSegmentConfiguration> segmentConfigurations) {
        if (segmentConfigurations == null) {
            this.segmentConfigurations = null;
            return;
        }

        this.segmentConfigurations = new java.util.ArrayList<KxDataviewSegmentConfiguration>(segmentConfigurations);
    }

    /**
     * <p>
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegmentConfigurations(java.util.Collection)} or
     * {@link #withSegmentConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param segmentConfigurations
     *        The configuration that contains the database path of the data that you want to place on each selected
     *        volume. Each segment must have a unique database path for each volume. If you do not explicitly specify
     *        any database path for a volume, they are accessible from the cluster through the default S3/object store
     *        segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewActiveVersion withSegmentConfigurations(KxDataviewSegmentConfiguration... segmentConfigurations) {
        if (this.segmentConfigurations == null) {
            setSegmentConfigurations(new java.util.ArrayList<KxDataviewSegmentConfiguration>(segmentConfigurations.length));
        }
        for (KxDataviewSegmentConfiguration ele : segmentConfigurations) {
            this.segmentConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     * 
     * @param segmentConfigurations
     *        The configuration that contains the database path of the data that you want to place on each selected
     *        volume. Each segment must have a unique database path for each volume. If you do not explicitly specify
     *        any database path for a volume, they are accessible from the cluster through the default S3/object store
     *        segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewActiveVersion withSegmentConfigurations(java.util.Collection<KxDataviewSegmentConfiguration> segmentConfigurations) {
        setSegmentConfigurations(segmentConfigurations);
        return this;
    }

    /**
     * <p>
     * The list of clusters that are currently using this dataview.
     * </p>
     * 
     * @return The list of clusters that are currently using this dataview.
     */

    public java.util.List<String> getAttachedClusters() {
        return attachedClusters;
    }

    /**
     * <p>
     * The list of clusters that are currently using this dataview.
     * </p>
     * 
     * @param attachedClusters
     *        The list of clusters that are currently using this dataview.
     */

    public void setAttachedClusters(java.util.Collection<String> attachedClusters) {
        if (attachedClusters == null) {
            this.attachedClusters = null;
            return;
        }

        this.attachedClusters = new java.util.ArrayList<String>(attachedClusters);
    }

    /**
     * <p>
     * The list of clusters that are currently using this dataview.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedClusters(java.util.Collection)} or {@link #withAttachedClusters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attachedClusters
     *        The list of clusters that are currently using this dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewActiveVersion withAttachedClusters(String... attachedClusters) {
        if (this.attachedClusters == null) {
            setAttachedClusters(new java.util.ArrayList<String>(attachedClusters.length));
        }
        for (String ele : attachedClusters) {
            this.attachedClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of clusters that are currently using this dataview.
     * </p>
     * 
     * @param attachedClusters
     *        The list of clusters that are currently using this dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewActiveVersion withAttachedClusters(java.util.Collection<String> attachedClusters) {
        setAttachedClusters(attachedClusters);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the dataview version was active. The value is determined as epoch time in milliseconds.
     * For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the dataview version was active. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the dataview version was active. The value is determined as epoch time in milliseconds.
     * For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the dataview version was active. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the dataview version was active. The value is determined as epoch time in milliseconds.
     * For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the dataview version was active. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewActiveVersion withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the active version.
     * </p>
     * 
     * @param versionId
     *        A unique identifier of the active version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * A unique identifier of the active version.
     * </p>
     * 
     * @return A unique identifier of the active version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * A unique identifier of the active version.
     * </p>
     * 
     * @param versionId
     *        A unique identifier of the active version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewActiveVersion withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getChangesetId() != null)
            sb.append("ChangesetId: ").append(getChangesetId()).append(",");
        if (getSegmentConfigurations() != null)
            sb.append("SegmentConfigurations: ").append(getSegmentConfigurations()).append(",");
        if (getAttachedClusters() != null)
            sb.append("AttachedClusters: ").append(getAttachedClusters()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxDataviewActiveVersion == false)
            return false;
        KxDataviewActiveVersion other = (KxDataviewActiveVersion) obj;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
            return false;
        if (other.getSegmentConfigurations() == null ^ this.getSegmentConfigurations() == null)
            return false;
        if (other.getSegmentConfigurations() != null && other.getSegmentConfigurations().equals(this.getSegmentConfigurations()) == false)
            return false;
        if (other.getAttachedClusters() == null ^ this.getAttachedClusters() == null)
            return false;
        if (other.getAttachedClusters() != null && other.getAttachedClusters().equals(this.getAttachedClusters()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getSegmentConfigurations() == null) ? 0 : getSegmentConfigurations().hashCode());
        hashCode = prime * hashCode + ((getAttachedClusters() == null) ? 0 : getAttachedClusters().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public KxDataviewActiveVersion clone() {
        try {
            return (KxDataviewActiveVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxDataviewActiveVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
