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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/RestoreVolumeFromSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreVolumeFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * The ID of the volume that you are restoring.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The ID of the source snapshot. Specifies the snapshot that you are restoring from.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The settings used when restoring the specified volume from snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     * snapshot. If there are intermediate snapshots and this option isn't used, <code>RestoreVolumeFromSnapshot</code>
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate snapshots. If
     * there are any dependent clone volumes and this option isn't used, <code>RestoreVolumeFromSnapshot</code> fails.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> options;

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreVolumeFromSnapshotRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The ID of the volume that you are restoring.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that you are restoring.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume that you are restoring.
     * </p>
     * 
     * @return The ID of the volume that you are restoring.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume that you are restoring.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that you are restoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreVolumeFromSnapshotRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The ID of the source snapshot. Specifies the snapshot that you are restoring from.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the source snapshot. Specifies the snapshot that you are restoring from.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the source snapshot. Specifies the snapshot that you are restoring from.
     * </p>
     * 
     * @return The ID of the source snapshot. Specifies the snapshot that you are restoring from.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the source snapshot. Specifies the snapshot that you are restoring from.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the source snapshot. Specifies the snapshot that you are restoring from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreVolumeFromSnapshotRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The settings used when restoring the specified volume from snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     * snapshot. If there are intermediate snapshots and this option isn't used, <code>RestoreVolumeFromSnapshot</code>
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate snapshots. If
     * there are any dependent clone volumes and this option isn't used, <code>RestoreVolumeFromSnapshot</code> fails.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The settings used when restoring the specified volume from snapshot.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the
     *         specified snapshot. If there are intermediate snapshots and this option isn't used,
     *         <code>RestoreVolumeFromSnapshot</code> fails.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate
     *         snapshots. If there are any dependent clone volumes and this option isn't used,
     *         <code>RestoreVolumeFromSnapshot</code> fails.
     *         </p>
     *         </li>
     * @see RestoreOpenZFSVolumeOption
     */

    public java.util.List<String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The settings used when restoring the specified volume from snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     * snapshot. If there are intermediate snapshots and this option isn't used, <code>RestoreVolumeFromSnapshot</code>
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate snapshots. If
     * there are any dependent clone volumes and this option isn't used, <code>RestoreVolumeFromSnapshot</code> fails.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        The settings used when restoring the specified volume from snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     *        snapshot. If there are intermediate snapshots and this option isn't used,
     *        <code>RestoreVolumeFromSnapshot</code> fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate
     *        snapshots. If there are any dependent clone volumes and this option isn't used,
     *        <code>RestoreVolumeFromSnapshot</code> fails.
     *        </p>
     *        </li>
     * @see RestoreOpenZFSVolumeOption
     */

    public void setOptions(java.util.Collection<String> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<String>(options);
    }

    /**
     * <p>
     * The settings used when restoring the specified volume from snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     * snapshot. If there are intermediate snapshots and this option isn't used, <code>RestoreVolumeFromSnapshot</code>
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate snapshots. If
     * there are any dependent clone volumes and this option isn't used, <code>RestoreVolumeFromSnapshot</code> fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        The settings used when restoring the specified volume from snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     *        snapshot. If there are intermediate snapshots and this option isn't used,
     *        <code>RestoreVolumeFromSnapshot</code> fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate
     *        snapshots. If there are any dependent clone volumes and this option isn't used,
     *        <code>RestoreVolumeFromSnapshot</code> fails.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreOpenZFSVolumeOption
     */

    public RestoreVolumeFromSnapshotRequest withOptions(String... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<String>(options.length));
        }
        for (String ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The settings used when restoring the specified volume from snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     * snapshot. If there are intermediate snapshots and this option isn't used, <code>RestoreVolumeFromSnapshot</code>
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate snapshots. If
     * there are any dependent clone volumes and this option isn't used, <code>RestoreVolumeFromSnapshot</code> fails.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        The settings used when restoring the specified volume from snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     *        snapshot. If there are intermediate snapshots and this option isn't used,
     *        <code>RestoreVolumeFromSnapshot</code> fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate
     *        snapshots. If there are any dependent clone volumes and this option isn't used,
     *        <code>RestoreVolumeFromSnapshot</code> fails.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreOpenZFSVolumeOption
     */

    public RestoreVolumeFromSnapshotRequest withOptions(java.util.Collection<String> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The settings used when restoring the specified volume from snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     * snapshot. If there are intermediate snapshots and this option isn't used, <code>RestoreVolumeFromSnapshot</code>
     * fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate snapshots. If
     * there are any dependent clone volumes and this option isn't used, <code>RestoreVolumeFromSnapshot</code> fails.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        The settings used when restoring the specified volume from snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots between the current state and the specified
     *        snapshot. If there are intermediate snapshots and this option isn't used,
     *        <code>RestoreVolumeFromSnapshot</code> fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_CLONED_VOLUMES</code> - Deletes any dependent clone volumes created from intermediate
     *        snapshots. If there are any dependent clone volumes and this option isn't used,
     *        <code>RestoreVolumeFromSnapshot</code> fails.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreOpenZFSVolumeOption
     */

    public RestoreVolumeFromSnapshotRequest withOptions(RestoreOpenZFSVolumeOption... options) {
        java.util.ArrayList<String> optionsCopy = new java.util.ArrayList<String>(options.length);
        for (RestoreOpenZFSVolumeOption value : options) {
            optionsCopy.add(value.toString());
        }
        if (getOptions() == null) {
            setOptions(optionsCopy);
        } else {
            getOptions().addAll(optionsCopy);
        }
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreVolumeFromSnapshotRequest == false)
            return false;
        RestoreVolumeFromSnapshotRequest other = (RestoreVolumeFromSnapshotRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public RestoreVolumeFromSnapshotRequest clone() {
        return (RestoreVolumeFromSnapshotRequest) super.clone();
    }

}
