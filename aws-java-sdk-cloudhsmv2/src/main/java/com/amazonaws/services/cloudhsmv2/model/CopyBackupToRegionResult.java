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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CopyBackupToRegion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyBackupToRegionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information on the backup that will be copied to the destination region, including CreateTimestamp, SourceBackup,
     * SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same as that of the
     * source backup.
     * </p>
     * <p>
     * You will need to use the <code>sourceBackupID</code> returned in this operation to use the <a>DescribeBackups</a>
     * operation on the backup that will be copied to the destination region.
     * </p>
     */
    private DestinationBackup destinationBackup;

    /**
     * <p>
     * Information on the backup that will be copied to the destination region, including CreateTimestamp, SourceBackup,
     * SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same as that of the
     * source backup.
     * </p>
     * <p>
     * You will need to use the <code>sourceBackupID</code> returned in this operation to use the <a>DescribeBackups</a>
     * operation on the backup that will be copied to the destination region.
     * </p>
     * 
     * @param destinationBackup
     *        Information on the backup that will be copied to the destination region, including CreateTimestamp,
     *        SourceBackup, SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same
     *        as that of the source backup.</p>
     *        <p>
     *        You will need to use the <code>sourceBackupID</code> returned in this operation to use the
     *        <a>DescribeBackups</a> operation on the backup that will be copied to the destination region.
     */

    public void setDestinationBackup(DestinationBackup destinationBackup) {
        this.destinationBackup = destinationBackup;
    }

    /**
     * <p>
     * Information on the backup that will be copied to the destination region, including CreateTimestamp, SourceBackup,
     * SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same as that of the
     * source backup.
     * </p>
     * <p>
     * You will need to use the <code>sourceBackupID</code> returned in this operation to use the <a>DescribeBackups</a>
     * operation on the backup that will be copied to the destination region.
     * </p>
     * 
     * @return Information on the backup that will be copied to the destination region, including CreateTimestamp,
     *         SourceBackup, SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the
     *         same as that of the source backup.</p>
     *         <p>
     *         You will need to use the <code>sourceBackupID</code> returned in this operation to use the
     *         <a>DescribeBackups</a> operation on the backup that will be copied to the destination region.
     */

    public DestinationBackup getDestinationBackup() {
        return this.destinationBackup;
    }

    /**
     * <p>
     * Information on the backup that will be copied to the destination region, including CreateTimestamp, SourceBackup,
     * SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same as that of the
     * source backup.
     * </p>
     * <p>
     * You will need to use the <code>sourceBackupID</code> returned in this operation to use the <a>DescribeBackups</a>
     * operation on the backup that will be copied to the destination region.
     * </p>
     * 
     * @param destinationBackup
     *        Information on the backup that will be copied to the destination region, including CreateTimestamp,
     *        SourceBackup, SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same
     *        as that of the source backup.</p>
     *        <p>
     *        You will need to use the <code>sourceBackupID</code> returned in this operation to use the
     *        <a>DescribeBackups</a> operation on the backup that will be copied to the destination region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupToRegionResult withDestinationBackup(DestinationBackup destinationBackup) {
        setDestinationBackup(destinationBackup);
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
        if (getDestinationBackup() != null)
            sb.append("DestinationBackup: ").append(getDestinationBackup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyBackupToRegionResult == false)
            return false;
        CopyBackupToRegionResult other = (CopyBackupToRegionResult) obj;
        if (other.getDestinationBackup() == null ^ this.getDestinationBackup() == null)
            return false;
        if (other.getDestinationBackup() != null && other.getDestinationBackup().equals(this.getDestinationBackup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationBackup() == null) ? 0 : getDestinationBackup().hashCode());
        return hashCode;
    }

    @Override
    public CopyBackupToRegionResult clone() {
        try {
            return (CopyBackupToRegionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
