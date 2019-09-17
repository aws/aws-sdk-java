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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action to write data to an Amazon S3 bucket.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The object key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3 canned ACLs</a>.
     * </p>
     */
    private String cannedAcl;

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @return The ARN of the IAM role that grants access.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Action withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The Amazon S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket.
     * </p>
     * 
     * @return The Amazon S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Action withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * 
     * @param key
     *        The object key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * 
     * @return The object key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * 
     * @param key
     *        The object key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Action withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3 canned ACLs</a>.
     * </p>
     * 
     * @param cannedAcl
     *        The Amazon S3 canned ACL that controls access to the object identified by the object key. For more
     *        information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3
     *        canned ACLs</a>.
     * @see CannedAccessControlList
     */

    public void setCannedAcl(String cannedAcl) {
        this.cannedAcl = cannedAcl;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3 canned ACLs</a>.
     * </p>
     * 
     * @return The Amazon S3 canned ACL that controls access to the object identified by the object key. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3 canned ACLs</a>.
     * @see CannedAccessControlList
     */

    public String getCannedAcl() {
        return this.cannedAcl;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3 canned ACLs</a>.
     * </p>
     * 
     * @param cannedAcl
     *        The Amazon S3 canned ACL that controls access to the object identified by the object key. For more
     *        information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3
     *        canned ACLs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CannedAccessControlList
     */

    public S3Action withCannedAcl(String cannedAcl) {
        setCannedAcl(cannedAcl);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3 canned ACLs</a>.
     * </p>
     * 
     * @param cannedAcl
     *        The Amazon S3 canned ACL that controls access to the object identified by the object key. For more
     *        information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3
     *        canned ACLs</a>.
     * @see CannedAccessControlList
     */

    public void setCannedAcl(CannedAccessControlList cannedAcl) {
        withCannedAcl(cannedAcl);
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3 canned ACLs</a>.
     * </p>
     * 
     * @param cannedAcl
     *        The Amazon S3 canned ACL that controls access to the object identified by the object key. For more
     *        information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">S3
     *        canned ACLs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CannedAccessControlList
     */

    public S3Action withCannedAcl(CannedAccessControlList cannedAcl) {
        this.cannedAcl = cannedAcl.toString();
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getCannedAcl() != null)
            sb.append("CannedAcl: ").append(getCannedAcl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Action == false)
            return false;
        S3Action other = (S3Action) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getCannedAcl() == null ^ this.getCannedAcl() == null)
            return false;
        if (other.getCannedAcl() != null && other.getCannedAcl().equals(this.getCannedAcl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getCannedAcl() == null) ? 0 : getCannedAcl().hashCode());
        return hashCode;
    }

    @Override
    public S3Action clone() {
        try {
            return (S3Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.S3ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
