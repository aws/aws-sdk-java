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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The snapshot configuration to use when creating an OpenZFS volume from a snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateOpenZFSOriginSnapshotConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOpenZFSOriginSnapshotConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String snapshotARN;
    /**
     * <p>
     * The strategy used when copying data from the snapshot to the new volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLONE</code> - The new volume references the data in the origin snapshot. Cloning a snapshot is faster than
     * copying data from the snapshot to a new volume and doesn't consume disk throughput. However, the origin snapshot
     * can't be deleted if there is a volume using its copied data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the new volume.
     * </p>
     * </li>
     * </ul>
     */
    private String copyStrategy;

    /**
     * @param snapshotARN
     */

    public void setSnapshotARN(String snapshotARN) {
        this.snapshotARN = snapshotARN;
    }

    /**
     * @return
     */

    public String getSnapshotARN() {
        return this.snapshotARN;
    }

    /**
     * @param snapshotARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenZFSOriginSnapshotConfiguration withSnapshotARN(String snapshotARN) {
        setSnapshotARN(snapshotARN);
        return this;
    }

    /**
     * <p>
     * The strategy used when copying data from the snapshot to the new volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLONE</code> - The new volume references the data in the origin snapshot. Cloning a snapshot is faster than
     * copying data from the snapshot to a new volume and doesn't consume disk throughput. However, the origin snapshot
     * can't be deleted if there is a volume using its copied data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the new volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copyStrategy
     *        The strategy used when copying data from the snapshot to the new volume. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLONE</code> - The new volume references the data in the origin snapshot. Cloning a snapshot is
     *        faster than copying data from the snapshot to a new volume and doesn't consume disk throughput. However,
     *        the origin snapshot can't be deleted if there is a volume using its copied data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FULL_COPY</code> - Copies all data from the snapshot to the new volume.
     *        </p>
     *        </li>
     * @see OpenZFSCopyStrategy
     */

    public void setCopyStrategy(String copyStrategy) {
        this.copyStrategy = copyStrategy;
    }

    /**
     * <p>
     * The strategy used when copying data from the snapshot to the new volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLONE</code> - The new volume references the data in the origin snapshot. Cloning a snapshot is faster than
     * copying data from the snapshot to a new volume and doesn't consume disk throughput. However, the origin snapshot
     * can't be deleted if there is a volume using its copied data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the new volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The strategy used when copying data from the snapshot to the new volume. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CLONE</code> - The new volume references the data in the origin snapshot. Cloning a snapshot is
     *         faster than copying data from the snapshot to a new volume and doesn't consume disk throughput. However,
     *         the origin snapshot can't be deleted if there is a volume using its copied data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FULL_COPY</code> - Copies all data from the snapshot to the new volume.
     *         </p>
     *         </li>
     * @see OpenZFSCopyStrategy
     */

    public String getCopyStrategy() {
        return this.copyStrategy;
    }

    /**
     * <p>
     * The strategy used when copying data from the snapshot to the new volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLONE</code> - The new volume references the data in the origin snapshot. Cloning a snapshot is faster than
     * copying data from the snapshot to a new volume and doesn't consume disk throughput. However, the origin snapshot
     * can't be deleted if there is a volume using its copied data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the new volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copyStrategy
     *        The strategy used when copying data from the snapshot to the new volume. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLONE</code> - The new volume references the data in the origin snapshot. Cloning a snapshot is
     *        faster than copying data from the snapshot to a new volume and doesn't consume disk throughput. However,
     *        the origin snapshot can't be deleted if there is a volume using its copied data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FULL_COPY</code> - Copies all data from the snapshot to the new volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSCopyStrategy
     */

    public CreateOpenZFSOriginSnapshotConfiguration withCopyStrategy(String copyStrategy) {
        setCopyStrategy(copyStrategy);
        return this;
    }

    /**
     * <p>
     * The strategy used when copying data from the snapshot to the new volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLONE</code> - The new volume references the data in the origin snapshot. Cloning a snapshot is faster than
     * copying data from the snapshot to a new volume and doesn't consume disk throughput. However, the origin snapshot
     * can't be deleted if there is a volume using its copied data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FULL_COPY</code> - Copies all data from the snapshot to the new volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copyStrategy
     *        The strategy used when copying data from the snapshot to the new volume. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLONE</code> - The new volume references the data in the origin snapshot. Cloning a snapshot is
     *        faster than copying data from the snapshot to a new volume and doesn't consume disk throughput. However,
     *        the origin snapshot can't be deleted if there is a volume using its copied data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FULL_COPY</code> - Copies all data from the snapshot to the new volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSCopyStrategy
     */

    public CreateOpenZFSOriginSnapshotConfiguration withCopyStrategy(OpenZFSCopyStrategy copyStrategy) {
        this.copyStrategy = copyStrategy.toString();
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
        if (getSnapshotARN() != null)
            sb.append("SnapshotARN: ").append(getSnapshotARN()).append(",");
        if (getCopyStrategy() != null)
            sb.append("CopyStrategy: ").append(getCopyStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOpenZFSOriginSnapshotConfiguration == false)
            return false;
        CreateOpenZFSOriginSnapshotConfiguration other = (CreateOpenZFSOriginSnapshotConfiguration) obj;
        if (other.getSnapshotARN() == null ^ this.getSnapshotARN() == null)
            return false;
        if (other.getSnapshotARN() != null && other.getSnapshotARN().equals(this.getSnapshotARN()) == false)
            return false;
        if (other.getCopyStrategy() == null ^ this.getCopyStrategy() == null)
            return false;
        if (other.getCopyStrategy() != null && other.getCopyStrategy().equals(this.getCopyStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotARN() == null) ? 0 : getSnapshotARN().hashCode());
        hashCode = prime * hashCode + ((getCopyStrategy() == null) ? 0 : getCopyStrategy().hashCode());
        return hashCode;
    }

    @Override
    public CreateOpenZFSOriginSnapshotConfiguration clone() {
        try {
            return (CreateOpenZFSOriginSnapshotConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateOpenZFSOriginSnapshotConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
