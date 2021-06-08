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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * You specify each grantee as a type-value pair using one of these types. You can specify only one type of grantee. For
 * more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAcl.html">PutBucketAcl</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/AclGrantee" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AclGrantee implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value specified is the canonical user ID of an AWS account.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Used for granting permissions to a predefined group.
     * </p>
     */
    private String uri;

    /**
     * <p>
     * The value specified is the canonical user ID of an AWS account.
     * </p>
     * 
     * @param id
     *        The value specified is the canonical user ID of an AWS account.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The value specified is the canonical user ID of an AWS account.
     * </p>
     * 
     * @return The value specified is the canonical user ID of an AWS account.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The value specified is the canonical user ID of an AWS account.
     * </p>
     * 
     * @param id
     *        The value specified is the canonical user ID of an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AclGrantee withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Used for granting permissions to a predefined group.
     * </p>
     * 
     * @param uri
     *        Used for granting permissions to a predefined group.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * Used for granting permissions to a predefined group.
     * </p>
     * 
     * @return Used for granting permissions to a predefined group.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * Used for granting permissions to a predefined group.
     * </p>
     * 
     * @param uri
     *        Used for granting permissions to a predefined group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AclGrantee withUri(String uri) {
        setUri(uri);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AclGrantee == false)
            return false;
        AclGrantee other = (AclGrantee) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        return hashCode;
    }

    @Override
    public AclGrantee clone() {
        try {
            return (AclGrantee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.AclGranteeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
