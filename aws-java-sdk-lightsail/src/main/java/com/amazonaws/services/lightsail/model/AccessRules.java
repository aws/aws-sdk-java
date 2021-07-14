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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the anonymous access permissions for an Amazon Lightsail bucket and its objects.
 * </p>
 * <p>
 * For more information about bucket access permissions, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-understanding-bucket-permissions"
 * >Understanding bucket permissions in Amazon Lightsail</a> in the
 * </p>
 * <p>
 * <i>Amazon Lightsail Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AccessRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessRules implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the anonymous access to all objects in a bucket.
     * </p>
     * <p>
     * The following options can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>public</code> - Sets all objects in the bucket to public (read-only), making them readable by anyone in the
     * world.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>public</code>, then all objects in the bucket default to
     * public regardless of the <code>allowPublicOverrides</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private</code> - Sets all objects in the bucket to private, making them readable only by you or anyone you
     * give access to.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>private</code>, and the <code>allowPublicOverrides</code>
     * value is set to <code>true</code>, then all objects in the bucket default to private unless they are configured
     * with a <code>public-read</code> ACL. Individual objects with a <code>public-read</code> ACL are readable by
     * anyone in the world.
     * </p>
     * </li>
     * </ul>
     */
    private String getObject;
    /**
     * <p>
     * A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual
     * objects override the <code>getObject</code> option that is currently specified.
     * </p>
     * <p>
     * When this is true, you can use the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html">PutObjectAcl</a> Amazon S3 API
     * action to set individual objects to public (read-only) using the <code>public-read</code> ACL, or to private
     * using the <code>private</code> ACL.
     * </p>
     */
    private Boolean allowPublicOverrides;

    /**
     * <p>
     * Specifies the anonymous access to all objects in a bucket.
     * </p>
     * <p>
     * The following options can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>public</code> - Sets all objects in the bucket to public (read-only), making them readable by anyone in the
     * world.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>public</code>, then all objects in the bucket default to
     * public regardless of the <code>allowPublicOverrides</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private</code> - Sets all objects in the bucket to private, making them readable only by you or anyone you
     * give access to.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>private</code>, and the <code>allowPublicOverrides</code>
     * value is set to <code>true</code>, then all objects in the bucket default to private unless they are configured
     * with a <code>public-read</code> ACL. Individual objects with a <code>public-read</code> ACL are readable by
     * anyone in the world.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getObject
     *        Specifies the anonymous access to all objects in a bucket.</p>
     *        <p>
     *        The following options can be specified:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>public</code> - Sets all objects in the bucket to public (read-only), making them readable by anyone
     *        in the world.
     *        </p>
     *        <p>
     *        If the <code>getObject</code> value is set to <code>public</code>, then all objects in the bucket default
     *        to public regardless of the <code>allowPublicOverrides</code> value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private</code> - Sets all objects in the bucket to private, making them readable only by you or
     *        anyone you give access to.
     *        </p>
     *        <p>
     *        If the <code>getObject</code> value is set to <code>private</code>, and the
     *        <code>allowPublicOverrides</code> value is set to <code>true</code>, then all objects in the bucket
     *        default to private unless they are configured with a <code>public-read</code> ACL. Individual objects with
     *        a <code>public-read</code> ACL are readable by anyone in the world.
     *        </p>
     *        </li>
     * @see AccessType
     */

    public void setGetObject(String getObject) {
        this.getObject = getObject;
    }

    /**
     * <p>
     * Specifies the anonymous access to all objects in a bucket.
     * </p>
     * <p>
     * The following options can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>public</code> - Sets all objects in the bucket to public (read-only), making them readable by anyone in the
     * world.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>public</code>, then all objects in the bucket default to
     * public regardless of the <code>allowPublicOverrides</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private</code> - Sets all objects in the bucket to private, making them readable only by you or anyone you
     * give access to.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>private</code>, and the <code>allowPublicOverrides</code>
     * value is set to <code>true</code>, then all objects in the bucket default to private unless they are configured
     * with a <code>public-read</code> ACL. Individual objects with a <code>public-read</code> ACL are readable by
     * anyone in the world.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the anonymous access to all objects in a bucket.</p>
     *         <p>
     *         The following options can be specified:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>public</code> - Sets all objects in the bucket to public (read-only), making them readable by
     *         anyone in the world.
     *         </p>
     *         <p>
     *         If the <code>getObject</code> value is set to <code>public</code>, then all objects in the bucket default
     *         to public regardless of the <code>allowPublicOverrides</code> value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private</code> - Sets all objects in the bucket to private, making them readable only by you or
     *         anyone you give access to.
     *         </p>
     *         <p>
     *         If the <code>getObject</code> value is set to <code>private</code>, and the
     *         <code>allowPublicOverrides</code> value is set to <code>true</code>, then all objects in the bucket
     *         default to private unless they are configured with a <code>public-read</code> ACL. Individual objects
     *         with a <code>public-read</code> ACL are readable by anyone in the world.
     *         </p>
     *         </li>
     * @see AccessType
     */

    public String getGetObject() {
        return this.getObject;
    }

    /**
     * <p>
     * Specifies the anonymous access to all objects in a bucket.
     * </p>
     * <p>
     * The following options can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>public</code> - Sets all objects in the bucket to public (read-only), making them readable by anyone in the
     * world.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>public</code>, then all objects in the bucket default to
     * public regardless of the <code>allowPublicOverrides</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private</code> - Sets all objects in the bucket to private, making them readable only by you or anyone you
     * give access to.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>private</code>, and the <code>allowPublicOverrides</code>
     * value is set to <code>true</code>, then all objects in the bucket default to private unless they are configured
     * with a <code>public-read</code> ACL. Individual objects with a <code>public-read</code> ACL are readable by
     * anyone in the world.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getObject
     *        Specifies the anonymous access to all objects in a bucket.</p>
     *        <p>
     *        The following options can be specified:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>public</code> - Sets all objects in the bucket to public (read-only), making them readable by anyone
     *        in the world.
     *        </p>
     *        <p>
     *        If the <code>getObject</code> value is set to <code>public</code>, then all objects in the bucket default
     *        to public regardless of the <code>allowPublicOverrides</code> value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private</code> - Sets all objects in the bucket to private, making them readable only by you or
     *        anyone you give access to.
     *        </p>
     *        <p>
     *        If the <code>getObject</code> value is set to <code>private</code>, and the
     *        <code>allowPublicOverrides</code> value is set to <code>true</code>, then all objects in the bucket
     *        default to private unless they are configured with a <code>public-read</code> ACL. Individual objects with
     *        a <code>public-read</code> ACL are readable by anyone in the world.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public AccessRules withGetObject(String getObject) {
        setGetObject(getObject);
        return this;
    }

    /**
     * <p>
     * Specifies the anonymous access to all objects in a bucket.
     * </p>
     * <p>
     * The following options can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>public</code> - Sets all objects in the bucket to public (read-only), making them readable by anyone in the
     * world.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>public</code>, then all objects in the bucket default to
     * public regardless of the <code>allowPublicOverrides</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private</code> - Sets all objects in the bucket to private, making them readable only by you or anyone you
     * give access to.
     * </p>
     * <p>
     * If the <code>getObject</code> value is set to <code>private</code>, and the <code>allowPublicOverrides</code>
     * value is set to <code>true</code>, then all objects in the bucket default to private unless they are configured
     * with a <code>public-read</code> ACL. Individual objects with a <code>public-read</code> ACL are readable by
     * anyone in the world.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getObject
     *        Specifies the anonymous access to all objects in a bucket.</p>
     *        <p>
     *        The following options can be specified:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>public</code> - Sets all objects in the bucket to public (read-only), making them readable by anyone
     *        in the world.
     *        </p>
     *        <p>
     *        If the <code>getObject</code> value is set to <code>public</code>, then all objects in the bucket default
     *        to public regardless of the <code>allowPublicOverrides</code> value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private</code> - Sets all objects in the bucket to private, making them readable only by you or
     *        anyone you give access to.
     *        </p>
     *        <p>
     *        If the <code>getObject</code> value is set to <code>private</code>, and the
     *        <code>allowPublicOverrides</code> value is set to <code>true</code>, then all objects in the bucket
     *        default to private unless they are configured with a <code>public-read</code> ACL. Individual objects with
     *        a <code>public-read</code> ACL are readable by anyone in the world.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public AccessRules withGetObject(AccessType getObject) {
        this.getObject = getObject.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual
     * objects override the <code>getObject</code> option that is currently specified.
     * </p>
     * <p>
     * When this is true, you can use the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html">PutObjectAcl</a> Amazon S3 API
     * action to set individual objects to public (read-only) using the <code>public-read</code> ACL, or to private
     * using the <code>private</code> ACL.
     * </p>
     * 
     * @param allowPublicOverrides
     *        A Boolean value that indicates whether the access control list (ACL) permissions that are applied to
     *        individual objects override the <code>getObject</code> option that is currently specified.</p>
     *        <p>
     *        When this is true, you can use the <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html">PutObjectAcl</a> Amazon S3
     *        API action to set individual objects to public (read-only) using the <code>public-read</code> ACL, or to
     *        private using the <code>private</code> ACL.
     */

    public void setAllowPublicOverrides(Boolean allowPublicOverrides) {
        this.allowPublicOverrides = allowPublicOverrides;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual
     * objects override the <code>getObject</code> option that is currently specified.
     * </p>
     * <p>
     * When this is true, you can use the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html">PutObjectAcl</a> Amazon S3 API
     * action to set individual objects to public (read-only) using the <code>public-read</code> ACL, or to private
     * using the <code>private</code> ACL.
     * </p>
     * 
     * @return A Boolean value that indicates whether the access control list (ACL) permissions that are applied to
     *         individual objects override the <code>getObject</code> option that is currently specified.</p>
     *         <p>
     *         When this is true, you can use the <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html">PutObjectAcl</a> Amazon S3
     *         API action to set individual objects to public (read-only) using the <code>public-read</code> ACL, or to
     *         private using the <code>private</code> ACL.
     */

    public Boolean getAllowPublicOverrides() {
        return this.allowPublicOverrides;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual
     * objects override the <code>getObject</code> option that is currently specified.
     * </p>
     * <p>
     * When this is true, you can use the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html">PutObjectAcl</a> Amazon S3 API
     * action to set individual objects to public (read-only) using the <code>public-read</code> ACL, or to private
     * using the <code>private</code> ACL.
     * </p>
     * 
     * @param allowPublicOverrides
     *        A Boolean value that indicates whether the access control list (ACL) permissions that are applied to
     *        individual objects override the <code>getObject</code> option that is currently specified.</p>
     *        <p>
     *        When this is true, you can use the <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html">PutObjectAcl</a> Amazon S3
     *        API action to set individual objects to public (read-only) using the <code>public-read</code> ACL, or to
     *        private using the <code>private</code> ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessRules withAllowPublicOverrides(Boolean allowPublicOverrides) {
        setAllowPublicOverrides(allowPublicOverrides);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the access control list (ACL) permissions that are applied to individual
     * objects override the <code>getObject</code> option that is currently specified.
     * </p>
     * <p>
     * When this is true, you can use the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html">PutObjectAcl</a> Amazon S3 API
     * action to set individual objects to public (read-only) using the <code>public-read</code> ACL, or to private
     * using the <code>private</code> ACL.
     * </p>
     * 
     * @return A Boolean value that indicates whether the access control list (ACL) permissions that are applied to
     *         individual objects override the <code>getObject</code> option that is currently specified.</p>
     *         <p>
     *         When this is true, you can use the <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectAcl.html">PutObjectAcl</a> Amazon S3
     *         API action to set individual objects to public (read-only) using the <code>public-read</code> ACL, or to
     *         private using the <code>private</code> ACL.
     */

    public Boolean isAllowPublicOverrides() {
        return this.allowPublicOverrides;
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
        if (getGetObject() != null)
            sb.append("GetObject: ").append(getGetObject()).append(",");
        if (getAllowPublicOverrides() != null)
            sb.append("AllowPublicOverrides: ").append(getAllowPublicOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessRules == false)
            return false;
        AccessRules other = (AccessRules) obj;
        if (other.getGetObject() == null ^ this.getGetObject() == null)
            return false;
        if (other.getGetObject() != null && other.getGetObject().equals(this.getGetObject()) == false)
            return false;
        if (other.getAllowPublicOverrides() == null ^ this.getAllowPublicOverrides() == null)
            return false;
        if (other.getAllowPublicOverrides() != null && other.getAllowPublicOverrides().equals(this.getAllowPublicOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGetObject() == null) ? 0 : getGetObject().hashCode());
        hashCode = prime * hashCode + ((getAllowPublicOverrides() == null) ? 0 : getAllowPublicOverrides().hashCode());
        return hashCode;
    }

    @Override
    public AccessRules clone() {
        try {
            return (AccessRules) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AccessRulesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
