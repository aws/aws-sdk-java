/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the current access control policies for the bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AccessControlList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControlList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that indicates whether public read access for the bucket is enabled through an Access Control List (ACL).
     * </p>
     */
    private Boolean allowsPublicReadAccess;
    /**
     * <p>
     * A value that indicates whether public write access for the bucket is enabled through an Access Control List
     * (ACL).
     * </p>
     */
    private Boolean allowsPublicWriteAccess;

    /**
     * <p>
     * A value that indicates whether public read access for the bucket is enabled through an Access Control List (ACL).
     * </p>
     * 
     * @param allowsPublicReadAccess
     *        A value that indicates whether public read access for the bucket is enabled through an Access Control List
     *        (ACL).
     */

    public void setAllowsPublicReadAccess(Boolean allowsPublicReadAccess) {
        this.allowsPublicReadAccess = allowsPublicReadAccess;
    }

    /**
     * <p>
     * A value that indicates whether public read access for the bucket is enabled through an Access Control List (ACL).
     * </p>
     * 
     * @return A value that indicates whether public read access for the bucket is enabled through an Access Control
     *         List (ACL).
     */

    public Boolean getAllowsPublicReadAccess() {
        return this.allowsPublicReadAccess;
    }

    /**
     * <p>
     * A value that indicates whether public read access for the bucket is enabled through an Access Control List (ACL).
     * </p>
     * 
     * @param allowsPublicReadAccess
     *        A value that indicates whether public read access for the bucket is enabled through an Access Control List
     *        (ACL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlList withAllowsPublicReadAccess(Boolean allowsPublicReadAccess) {
        setAllowsPublicReadAccess(allowsPublicReadAccess);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether public read access for the bucket is enabled through an Access Control List (ACL).
     * </p>
     * 
     * @return A value that indicates whether public read access for the bucket is enabled through an Access Control
     *         List (ACL).
     */

    public Boolean isAllowsPublicReadAccess() {
        return this.allowsPublicReadAccess;
    }

    /**
     * <p>
     * A value that indicates whether public write access for the bucket is enabled through an Access Control List
     * (ACL).
     * </p>
     * 
     * @param allowsPublicWriteAccess
     *        A value that indicates whether public write access for the bucket is enabled through an Access Control
     *        List (ACL).
     */

    public void setAllowsPublicWriteAccess(Boolean allowsPublicWriteAccess) {
        this.allowsPublicWriteAccess = allowsPublicWriteAccess;
    }

    /**
     * <p>
     * A value that indicates whether public write access for the bucket is enabled through an Access Control List
     * (ACL).
     * </p>
     * 
     * @return A value that indicates whether public write access for the bucket is enabled through an Access Control
     *         List (ACL).
     */

    public Boolean getAllowsPublicWriteAccess() {
        return this.allowsPublicWriteAccess;
    }

    /**
     * <p>
     * A value that indicates whether public write access for the bucket is enabled through an Access Control List
     * (ACL).
     * </p>
     * 
     * @param allowsPublicWriteAccess
     *        A value that indicates whether public write access for the bucket is enabled through an Access Control
     *        List (ACL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlList withAllowsPublicWriteAccess(Boolean allowsPublicWriteAccess) {
        setAllowsPublicWriteAccess(allowsPublicWriteAccess);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether public write access for the bucket is enabled through an Access Control List
     * (ACL).
     * </p>
     * 
     * @return A value that indicates whether public write access for the bucket is enabled through an Access Control
     *         List (ACL).
     */

    public Boolean isAllowsPublicWriteAccess() {
        return this.allowsPublicWriteAccess;
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
        if (getAllowsPublicReadAccess() != null)
            sb.append("AllowsPublicReadAccess: ").append(getAllowsPublicReadAccess()).append(",");
        if (getAllowsPublicWriteAccess() != null)
            sb.append("AllowsPublicWriteAccess: ").append(getAllowsPublicWriteAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControlList == false)
            return false;
        AccessControlList other = (AccessControlList) obj;
        if (other.getAllowsPublicReadAccess() == null ^ this.getAllowsPublicReadAccess() == null)
            return false;
        if (other.getAllowsPublicReadAccess() != null && other.getAllowsPublicReadAccess().equals(this.getAllowsPublicReadAccess()) == false)
            return false;
        if (other.getAllowsPublicWriteAccess() == null ^ this.getAllowsPublicWriteAccess() == null)
            return false;
        if (other.getAllowsPublicWriteAccess() != null && other.getAllowsPublicWriteAccess().equals(this.getAllowsPublicWriteAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowsPublicReadAccess() == null) ? 0 : getAllowsPublicReadAccess().hashCode());
        hashCode = prime * hashCode + ((getAllowsPublicWriteAccess() == null) ? 0 : getAllowsPublicWriteAccess().hashCode());
        return hashCode;
    }

    @Override
    public AccessControlList clone() {
        try {
            return (AccessControlList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AccessControlListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
