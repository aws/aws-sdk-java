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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The full POSIX identity, including the user ID, group ID, and any secondary group IDs, on the access point that is
 * used for all file system operations performed by NFS clients using the access point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PosixUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PosixUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access point.
     * </p>
     */
    private Long uid;
    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access point.
     * </p>
     */
    private Long gid;
    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this access point.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Long> secondaryGids;

    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access point.
     * </p>
     * 
     * @param uid
     *        The POSIX user ID used for all file system operations using this access point.
     */

    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access point.
     * </p>
     * 
     * @return The POSIX user ID used for all file system operations using this access point.
     */

    public Long getUid() {
        return this.uid;
    }

    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access point.
     * </p>
     * 
     * @param uid
     *        The POSIX user ID used for all file system operations using this access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PosixUser withUid(Long uid) {
        setUid(uid);
        return this;
    }

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access point.
     * </p>
     * 
     * @param gid
     *        The POSIX group ID used for all file system operations using this access point.
     */

    public void setGid(Long gid) {
        this.gid = gid;
    }

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access point.
     * </p>
     * 
     * @return The POSIX group ID used for all file system operations using this access point.
     */

    public Long getGid() {
        return this.gid;
    }

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access point.
     * </p>
     * 
     * @param gid
     *        The POSIX group ID used for all file system operations using this access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PosixUser withGid(Long gid) {
        setGid(gid);
        return this;
    }

    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this access point.
     * </p>
     * 
     * @return Secondary POSIX group IDs used for all file system operations using this access point.
     */

    public java.util.List<Long> getSecondaryGids() {
        if (secondaryGids == null) {
            secondaryGids = new com.amazonaws.internal.SdkInternalList<Long>();
        }
        return secondaryGids;
    }

    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this access point.
     * </p>
     * 
     * @param secondaryGids
     *        Secondary POSIX group IDs used for all file system operations using this access point.
     */

    public void setSecondaryGids(java.util.Collection<Long> secondaryGids) {
        if (secondaryGids == null) {
            this.secondaryGids = null;
            return;
        }

        this.secondaryGids = new com.amazonaws.internal.SdkInternalList<Long>(secondaryGids);
    }

    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this access point.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondaryGids(java.util.Collection)} or {@link #withSecondaryGids(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param secondaryGids
     *        Secondary POSIX group IDs used for all file system operations using this access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PosixUser withSecondaryGids(Long... secondaryGids) {
        if (this.secondaryGids == null) {
            setSecondaryGids(new com.amazonaws.internal.SdkInternalList<Long>(secondaryGids.length));
        }
        for (Long ele : secondaryGids) {
            this.secondaryGids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this access point.
     * </p>
     * 
     * @param secondaryGids
     *        Secondary POSIX group IDs used for all file system operations using this access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PosixUser withSecondaryGids(java.util.Collection<Long> secondaryGids) {
        setSecondaryGids(secondaryGids);
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
        if (getUid() != null)
            sb.append("Uid: ").append(getUid()).append(",");
        if (getGid() != null)
            sb.append("Gid: ").append(getGid()).append(",");
        if (getSecondaryGids() != null)
            sb.append("SecondaryGids: ").append(getSecondaryGids());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PosixUser == false)
            return false;
        PosixUser other = (PosixUser) obj;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getGid() == null ^ this.getGid() == null)
            return false;
        if (other.getGid() != null && other.getGid().equals(this.getGid()) == false)
            return false;
        if (other.getSecondaryGids() == null ^ this.getSecondaryGids() == null)
            return false;
        if (other.getSecondaryGids() != null && other.getSecondaryGids().equals(this.getSecondaryGids()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getGid() == null) ? 0 : getGid().hashCode());
        hashCode = prime * hashCode + ((getSecondaryGids() == null) ? 0 : getSecondaryGids().hashCode());
        return hashCode;
    }

    @Override
    public PosixUser clone() {
        try {
            return (PosixUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.PosixUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
