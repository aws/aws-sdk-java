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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The total number of buckets that are shared with another AWS account or configured to support cross-origin resource
 * sharing (CORS).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/BucketCountBySharedAccessType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketCountBySharedAccessType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long external;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long internal;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Long notShared;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param external
     *        Reserved for future use.
     */

    public void setExternal(Long external) {
        this.external = external;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public Long getExternal() {
        return this.external;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param external
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountBySharedAccessType withExternal(Long external) {
        setExternal(external);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param internal
     *        Reserved for future use.
     */

    public void setInternal(Long internal) {
        this.internal = internal;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public Long getInternal() {
        return this.internal;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param internal
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountBySharedAccessType withInternal(Long internal) {
        setInternal(internal);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param notShared
     *        Reserved for future use.
     */

    public void setNotShared(Long notShared) {
        this.notShared = notShared;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public Long getNotShared() {
        return this.notShared;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param notShared
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountBySharedAccessType withNotShared(Long notShared) {
        setNotShared(notShared);
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
        if (getExternal() != null)
            sb.append("External: ").append(getExternal()).append(",");
        if (getInternal() != null)
            sb.append("Internal: ").append(getInternal()).append(",");
        if (getNotShared() != null)
            sb.append("NotShared: ").append(getNotShared());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketCountBySharedAccessType == false)
            return false;
        BucketCountBySharedAccessType other = (BucketCountBySharedAccessType) obj;
        if (other.getExternal() == null ^ this.getExternal() == null)
            return false;
        if (other.getExternal() != null && other.getExternal().equals(this.getExternal()) == false)
            return false;
        if (other.getInternal() == null ^ this.getInternal() == null)
            return false;
        if (other.getInternal() != null && other.getInternal().equals(this.getInternal()) == false)
            return false;
        if (other.getNotShared() == null ^ this.getNotShared() == null)
            return false;
        if (other.getNotShared() != null && other.getNotShared().equals(this.getNotShared()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternal() == null) ? 0 : getExternal().hashCode());
        hashCode = prime * hashCode + ((getInternal() == null) ? 0 : getInternal().hashCode());
        hashCode = prime * hashCode + ((getNotShared() == null) ? 0 : getNotShared().hashCode());
        return hashCode;
    }

    @Override
    public BucketCountBySharedAccessType clone() {
        try {
            return (BucketCountBySharedAccessType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketCountBySharedAccessTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
