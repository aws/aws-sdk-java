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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CopySnapshotAndUpdateVolume" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopySnapshotAndUpdateVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * Specifies the ID of the volume that you are copying the snapshot to.
     * </p>
     */
    private String volumeId;

    private String sourceSnapshotARN;
    /**
     * <p>
     * Specifies the strategy to use when copying data from a snapshot to the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_COPY</code> - Copies only the snapshot data that's changed since the previous replication.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <code>CLONE</code> isn't a valid copy strategy option for the <code>CopySnapshotAndUpdateVolume</code> operation.
     * </p>
     * </note>
     */
    private String copyStrategy;
    /**
     * <p>
     * Confirms that you want to delete data on the destination volume that wasn’t there during the previous snapshot
     * replication.
     * </p>
     * <p>
     * Your replication will fail if you don’t include an option for a specific type of data and that data is on your
     * destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there are
     * intermediate snapshots on the destination, you can’t copy the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on the
     * source volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the source
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match the
     * source snapshot that you’re copying.
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

    public CopySnapshotAndUpdateVolumeRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the volume that you are copying the snapshot to.
     * </p>
     * 
     * @param volumeId
     *        Specifies the ID of the volume that you are copying the snapshot to.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * Specifies the ID of the volume that you are copying the snapshot to.
     * </p>
     * 
     * @return Specifies the ID of the volume that you are copying the snapshot to.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * Specifies the ID of the volume that you are copying the snapshot to.
     * </p>
     * 
     * @param volumeId
     *        Specifies the ID of the volume that you are copying the snapshot to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotAndUpdateVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * @param sourceSnapshotARN
     */

    public void setSourceSnapshotARN(String sourceSnapshotARN) {
        this.sourceSnapshotARN = sourceSnapshotARN;
    }

    /**
     * @return
     */

    public String getSourceSnapshotARN() {
        return this.sourceSnapshotARN;
    }

    /**
     * @param sourceSnapshotARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotAndUpdateVolumeRequest withSourceSnapshotARN(String sourceSnapshotARN) {
        setSourceSnapshotARN(sourceSnapshotARN);
        return this;
    }

    /**
     * <p>
     * Specifies the strategy to use when copying data from a snapshot to the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_COPY</code> - Copies only the snapshot data that's changed since the previous replication.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <code>CLONE</code> isn't a valid copy strategy option for the <code>CopySnapshotAndUpdateVolume</code> operation.
     * </p>
     * </note>
     * 
     * @param copyStrategy
     *        Specifies the strategy to use when copying data from a snapshot to the volume. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_COPY</code> - Copies all data from the snapshot to the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCREMENTAL_COPY</code> - Copies only the snapshot data that's changed since the previous
     *        replication.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        <code>CLONE</code> isn't a valid copy strategy option for the <code>CopySnapshotAndUpdateVolume</code>
     *        operation.
     *        </p>
     * @see OpenZFSCopyStrategy
     */

    public void setCopyStrategy(String copyStrategy) {
        this.copyStrategy = copyStrategy;
    }

    /**
     * <p>
     * Specifies the strategy to use when copying data from a snapshot to the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_COPY</code> - Copies only the snapshot data that's changed since the previous replication.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <code>CLONE</code> isn't a valid copy strategy option for the <code>CopySnapshotAndUpdateVolume</code> operation.
     * </p>
     * </note>
     * 
     * @return Specifies the strategy to use when copying data from a snapshot to the volume. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FULL_COPY</code> - Copies all data from the snapshot to the volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INCREMENTAL_COPY</code> - Copies only the snapshot data that's changed since the previous
     *         replication.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         <code>CLONE</code> isn't a valid copy strategy option for the <code>CopySnapshotAndUpdateVolume</code>
     *         operation.
     *         </p>
     * @see OpenZFSCopyStrategy
     */

    public String getCopyStrategy() {
        return this.copyStrategy;
    }

    /**
     * <p>
     * Specifies the strategy to use when copying data from a snapshot to the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_COPY</code> - Copies only the snapshot data that's changed since the previous replication.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <code>CLONE</code> isn't a valid copy strategy option for the <code>CopySnapshotAndUpdateVolume</code> operation.
     * </p>
     * </note>
     * 
     * @param copyStrategy
     *        Specifies the strategy to use when copying data from a snapshot to the volume. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_COPY</code> - Copies all data from the snapshot to the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCREMENTAL_COPY</code> - Copies only the snapshot data that's changed since the previous
     *        replication.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        <code>CLONE</code> isn't a valid copy strategy option for the <code>CopySnapshotAndUpdateVolume</code>
     *        operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSCopyStrategy
     */

    public CopySnapshotAndUpdateVolumeRequest withCopyStrategy(String copyStrategy) {
        setCopyStrategy(copyStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies the strategy to use when copying data from a snapshot to the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCREMENTAL_COPY</code> - Copies only the snapshot data that's changed since the previous replication.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <code>CLONE</code> isn't a valid copy strategy option for the <code>CopySnapshotAndUpdateVolume</code> operation.
     * </p>
     * </note>
     * 
     * @param copyStrategy
     *        Specifies the strategy to use when copying data from a snapshot to the volume. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULL_COPY</code> - Copies all data from the snapshot to the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCREMENTAL_COPY</code> - Copies only the snapshot data that's changed since the previous
     *        replication.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        <code>CLONE</code> isn't a valid copy strategy option for the <code>CopySnapshotAndUpdateVolume</code>
     *        operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSCopyStrategy
     */

    public CopySnapshotAndUpdateVolumeRequest withCopyStrategy(OpenZFSCopyStrategy copyStrategy) {
        this.copyStrategy = copyStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Confirms that you want to delete data on the destination volume that wasn’t there during the previous snapshot
     * replication.
     * </p>
     * <p>
     * Your replication will fail if you don’t include an option for a specific type of data and that data is on your
     * destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there are
     * intermediate snapshots on the destination, you can’t copy the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on the
     * source volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the source
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match the
     * source snapshot that you’re copying.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Confirms that you want to delete data on the destination volume that wasn’t there during the previous
     *         snapshot replication.</p>
     *         <p>
     *         Your replication will fail if you don’t include an option for a specific type of data and that data is on
     *         your destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there
     *         are intermediate snapshots on the destination, you can’t copy the snapshot.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on
     *         the source volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the
     *         source volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match
     *         the source snapshot that you’re copying.
     *         </p>
     *         </li>
     * @see UpdateOpenZFSVolumeOption
     */

    public java.util.List<String> getOptions() {
        return options;
    }

    /**
     * <p>
     * Confirms that you want to delete data on the destination volume that wasn’t there during the previous snapshot
     * replication.
     * </p>
     * <p>
     * Your replication will fail if you don’t include an option for a specific type of data and that data is on your
     * destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there are
     * intermediate snapshots on the destination, you can’t copy the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on the
     * source volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the source
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match the
     * source snapshot that you’re copying.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        Confirms that you want to delete data on the destination volume that wasn’t there during the previous
     *        snapshot replication.</p>
     *        <p>
     *        Your replication will fail if you don’t include an option for a specific type of data and that data is on
     *        your destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there
     *        are intermediate snapshots on the destination, you can’t copy the snapshot.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on
     *        the source volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the
     *        source volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match
     *        the source snapshot that you’re copying.
     *        </p>
     *        </li>
     * @see UpdateOpenZFSVolumeOption
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
     * Confirms that you want to delete data on the destination volume that wasn’t there during the previous snapshot
     * replication.
     * </p>
     * <p>
     * Your replication will fail if you don’t include an option for a specific type of data and that data is on your
     * destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there are
     * intermediate snapshots on the destination, you can’t copy the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on the
     * source volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the source
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match the
     * source snapshot that you’re copying.
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
     *        Confirms that you want to delete data on the destination volume that wasn’t there during the previous
     *        snapshot replication.</p>
     *        <p>
     *        Your replication will fail if you don’t include an option for a specific type of data and that data is on
     *        your destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there
     *        are intermediate snapshots on the destination, you can’t copy the snapshot.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on
     *        the source volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the
     *        source volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match
     *        the source snapshot that you’re copying.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateOpenZFSVolumeOption
     */

    public CopySnapshotAndUpdateVolumeRequest withOptions(String... options) {
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
     * Confirms that you want to delete data on the destination volume that wasn’t there during the previous snapshot
     * replication.
     * </p>
     * <p>
     * Your replication will fail if you don’t include an option for a specific type of data and that data is on your
     * destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there are
     * intermediate snapshots on the destination, you can’t copy the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on the
     * source volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the source
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match the
     * source snapshot that you’re copying.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        Confirms that you want to delete data on the destination volume that wasn’t there during the previous
     *        snapshot replication.</p>
     *        <p>
     *        Your replication will fail if you don’t include an option for a specific type of data and that data is on
     *        your destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there
     *        are intermediate snapshots on the destination, you can’t copy the snapshot.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on
     *        the source volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the
     *        source volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match
     *        the source snapshot that you’re copying.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateOpenZFSVolumeOption
     */

    public CopySnapshotAndUpdateVolumeRequest withOptions(java.util.Collection<String> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * Confirms that you want to delete data on the destination volume that wasn’t there during the previous snapshot
     * replication.
     * </p>
     * <p>
     * Your replication will fail if you don’t include an option for a specific type of data and that data is on your
     * destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there are
     * intermediate snapshots on the destination, you can’t copy the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on the
     * source volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the source
     * volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match the
     * source snapshot that you’re copying.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        Confirms that you want to delete data on the destination volume that wasn’t there during the previous
     *        snapshot replication.</p>
     *        <p>
     *        Your replication will fail if you don’t include an option for a specific type of data and that data is on
     *        your destination. For example, if you don’t include <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> and there
     *        are intermediate snapshots on the destination, you can’t copy the snapshot.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_SNAPSHOTS</code> - Deletes snapshots on the destination volume that aren’t on
     *        the source volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_CLONED_VOLUMES</code> - Deletes snapshot clones on the destination volume that aren't on the
     *        source volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_INTERMEDIATE_DATA</code> - Overwrites snapshots on the destination volume that don’t match
     *        the source snapshot that you’re copying.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateOpenZFSVolumeOption
     */

    public CopySnapshotAndUpdateVolumeRequest withOptions(UpdateOpenZFSVolumeOption... options) {
        java.util.ArrayList<String> optionsCopy = new java.util.ArrayList<String>(options.length);
        for (UpdateOpenZFSVolumeOption value : options) {
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
        if (getSourceSnapshotARN() != null)
            sb.append("SourceSnapshotARN: ").append(getSourceSnapshotARN()).append(",");
        if (getCopyStrategy() != null)
            sb.append("CopyStrategy: ").append(getCopyStrategy()).append(",");
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

        if (obj instanceof CopySnapshotAndUpdateVolumeRequest == false)
            return false;
        CopySnapshotAndUpdateVolumeRequest other = (CopySnapshotAndUpdateVolumeRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getSourceSnapshotARN() == null ^ this.getSourceSnapshotARN() == null)
            return false;
        if (other.getSourceSnapshotARN() != null && other.getSourceSnapshotARN().equals(this.getSourceSnapshotARN()) == false)
            return false;
        if (other.getCopyStrategy() == null ^ this.getCopyStrategy() == null)
            return false;
        if (other.getCopyStrategy() != null && other.getCopyStrategy().equals(this.getCopyStrategy()) == false)
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
        hashCode = prime * hashCode + ((getSourceSnapshotARN() == null) ? 0 : getSourceSnapshotARN().hashCode());
        hashCode = prime * hashCode + ((getCopyStrategy() == null) ? 0 : getCopyStrategy().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public CopySnapshotAndUpdateVolumeRequest clone() {
        return (CopySnapshotAndUpdateVolumeRequest) super.clone();
    }

}
