/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AssignTapePool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignTapePoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * </p>
     */
    private String tapeARN;
    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     */
    private String poolId;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * </p>
     * 
     * @param tapeARN
     *        The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * </p>
     * 
     * @param tapeARN
     *        The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignTapePoolRequest withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
        return this;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *        tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to
     *        the pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @return The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *         the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *         tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to
     *         the pool.</p>
     *         <p>
     *         Valid values: "GLACIER", "DEEP_ARCHIVE"
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *        tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to
     *        the pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignTapePoolRequest withPoolId(String poolId) {
        setPoolId(poolId);
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
        if (getTapeARN() != null)
            sb.append("TapeARN: ").append(getTapeARN()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignTapePoolRequest == false)
            return false;
        AssignTapePoolRequest other = (AssignTapePoolRequest) obj;
        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        return hashCode;
    }

    @Override
    public AssignTapePoolRequest clone() {
        return (AssignTapePoolRequest) super.clone();
    }

}
