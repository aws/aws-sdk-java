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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the POSIX identity that is used for file system operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CustomPosixUserConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomPosixUserConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The POSIX user ID.
     * </p>
     */
    private Long uid;
    /**
     * <p>
     * The POSIX group ID.
     * </p>
     */
    private Long gid;

    /**
     * <p>
     * The POSIX user ID.
     * </p>
     * 
     * @param uid
     *        The POSIX user ID.
     */

    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The POSIX user ID.
     * </p>
     * 
     * @return The POSIX user ID.
     */

    public Long getUid() {
        return this.uid;
    }

    /**
     * <p>
     * The POSIX user ID.
     * </p>
     * 
     * @param uid
     *        The POSIX user ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPosixUserConfig withUid(Long uid) {
        setUid(uid);
        return this;
    }

    /**
     * <p>
     * The POSIX group ID.
     * </p>
     * 
     * @param gid
     *        The POSIX group ID.
     */

    public void setGid(Long gid) {
        this.gid = gid;
    }

    /**
     * <p>
     * The POSIX group ID.
     * </p>
     * 
     * @return The POSIX group ID.
     */

    public Long getGid() {
        return this.gid;
    }

    /**
     * <p>
     * The POSIX group ID.
     * </p>
     * 
     * @param gid
     *        The POSIX group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPosixUserConfig withGid(Long gid) {
        setGid(gid);
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
            sb.append("Gid: ").append(getGid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomPosixUserConfig == false)
            return false;
        CustomPosixUserConfig other = (CustomPosixUserConfig) obj;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getGid() == null ^ this.getGid() == null)
            return false;
        if (other.getGid() != null && other.getGid().equals(this.getGid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getGid() == null) ? 0 : getGid().hashCode());
        return hashCode;
    }

    @Override
    public CustomPosixUserConfig clone() {
        try {
            return (CustomPosixUserConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CustomPosixUserConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
