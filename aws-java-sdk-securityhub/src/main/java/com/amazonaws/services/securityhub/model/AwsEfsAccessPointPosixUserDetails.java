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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details for all file system operations using this Amazon EFS access point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEfsAccessPointPosixUserDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEfsAccessPointPosixUserDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access point.
     * </p>
     */
    private String gid;
    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this access point.
     * </p>
     */
    private java.util.List<String> secondaryGids;
    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access point.
     * </p>
     */
    private String uid;

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access point.
     * </p>
     * 
     * @param gid
     *        The POSIX group ID used for all file system operations using this access point.
     */

    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access point.
     * </p>
     * 
     * @return The POSIX group ID used for all file system operations using this access point.
     */

    public String getGid() {
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

    public AwsEfsAccessPointPosixUserDetails withGid(String gid) {
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

    public java.util.List<String> getSecondaryGids() {
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

    public void setSecondaryGids(java.util.Collection<String> secondaryGids) {
        if (secondaryGids == null) {
            this.secondaryGids = null;
            return;
        }

        this.secondaryGids = new java.util.ArrayList<String>(secondaryGids);
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

    public AwsEfsAccessPointPosixUserDetails withSecondaryGids(String... secondaryGids) {
        if (this.secondaryGids == null) {
            setSecondaryGids(new java.util.ArrayList<String>(secondaryGids.length));
        }
        for (String ele : secondaryGids) {
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

    public AwsEfsAccessPointPosixUserDetails withSecondaryGids(java.util.Collection<String> secondaryGids) {
        setSecondaryGids(secondaryGids);
        return this;
    }

    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access point.
     * </p>
     * 
     * @param uid
     *        The POSIX user ID used for all file system operations using this access point.
     */

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access point.
     * </p>
     * 
     * @return The POSIX user ID used for all file system operations using this access point.
     */

    public String getUid() {
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

    public AwsEfsAccessPointPosixUserDetails withUid(String uid) {
        setUid(uid);
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
        if (getGid() != null)
            sb.append("Gid: ").append(getGid()).append(",");
        if (getSecondaryGids() != null)
            sb.append("SecondaryGids: ").append(getSecondaryGids()).append(",");
        if (getUid() != null)
            sb.append("Uid: ").append(getUid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEfsAccessPointPosixUserDetails == false)
            return false;
        AwsEfsAccessPointPosixUserDetails other = (AwsEfsAccessPointPosixUserDetails) obj;
        if (other.getGid() == null ^ this.getGid() == null)
            return false;
        if (other.getGid() != null && other.getGid().equals(this.getGid()) == false)
            return false;
        if (other.getSecondaryGids() == null ^ this.getSecondaryGids() == null)
            return false;
        if (other.getSecondaryGids() != null && other.getSecondaryGids().equals(this.getSecondaryGids()) == false)
            return false;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGid() == null) ? 0 : getGid().hashCode());
        hashCode = prime * hashCode + ((getSecondaryGids() == null) ? 0 : getSecondaryGids().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        return hashCode;
    }

    @Override
    public AwsEfsAccessPointPosixUserDetails clone() {
        try {
            return (AwsEfsAccessPointPosixUserDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEfsAccessPointPosixUserDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
