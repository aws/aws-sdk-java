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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. When Athena stores
 * query results in Amazon S3, the canned ACL is set with the <code>x-amz-acl</code> request header. For more
 * information about S3 Object Ownership, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html#object-ownership-overview"
 * >Object Ownership settings</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/AclConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AclConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only supported
     * canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. If a query runs in a workgroup and the workgroup overrides
     * client-side settings, then the Amazon S3 canned ACL specified in the workgroup's settings is used for all queries
     * that run in the workgroup. For more information about Amazon S3 canned ACLs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl">Canned ACL</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private String s3AclOption;

    /**
     * <p>
     * The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only supported
     * canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. If a query runs in a workgroup and the workgroup overrides
     * client-side settings, then the Amazon S3 canned ACL specified in the workgroup's settings is used for all queries
     * that run in the workgroup. For more information about Amazon S3 canned ACLs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl">Canned ACL</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param s3AclOption
     *        The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only
     *        supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. If a query runs in a workgroup and the
     *        workgroup overrides client-side settings, then the Amazon S3 canned ACL specified in the workgroup's
     *        settings is used for all queries that run in the workgroup. For more information about Amazon S3 canned
     *        ACLs, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl">Canned ACL</a>
     *        in the <i>Amazon S3 User Guide</i>.
     * @see S3AclOption
     */

    public void setS3AclOption(String s3AclOption) {
        this.s3AclOption = s3AclOption;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only supported
     * canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. If a query runs in a workgroup and the workgroup overrides
     * client-side settings, then the Amazon S3 canned ACL specified in the workgroup's settings is used for all queries
     * that run in the workgroup. For more information about Amazon S3 canned ACLs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl">Canned ACL</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only
     *         supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. If a query runs in a workgroup and the
     *         workgroup overrides client-side settings, then the Amazon S3 canned ACL specified in the workgroup's
     *         settings is used for all queries that run in the workgroup. For more information about Amazon S3 canned
     *         ACLs, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl">Canned ACL</a>
     *         in the <i>Amazon S3 User Guide</i>.
     * @see S3AclOption
     */

    public String getS3AclOption() {
        return this.s3AclOption;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only supported
     * canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. If a query runs in a workgroup and the workgroup overrides
     * client-side settings, then the Amazon S3 canned ACL specified in the workgroup's settings is used for all queries
     * that run in the workgroup. For more information about Amazon S3 canned ACLs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl">Canned ACL</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param s3AclOption
     *        The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only
     *        supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. If a query runs in a workgroup and the
     *        workgroup overrides client-side settings, then the Amazon S3 canned ACL specified in the workgroup's
     *        settings is used for all queries that run in the workgroup. For more information about Amazon S3 canned
     *        ACLs, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl">Canned ACL</a>
     *        in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3AclOption
     */

    public AclConfiguration withS3AclOption(String s3AclOption) {
        setS3AclOption(s3AclOption);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only supported
     * canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. If a query runs in a workgroup and the workgroup overrides
     * client-side settings, then the Amazon S3 canned ACL specified in the workgroup's settings is used for all queries
     * that run in the workgroup. For more information about Amazon S3 canned ACLs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl">Canned ACL</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param s3AclOption
     *        The Amazon S3 canned ACL that Athena should specify when storing query results. Currently the only
     *        supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. If a query runs in a workgroup and the
     *        workgroup overrides client-side settings, then the Amazon S3 canned ACL specified in the workgroup's
     *        settings is used for all queries that run in the workgroup. For more information about Amazon S3 canned
     *        ACLs, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl">Canned ACL</a>
     *        in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3AclOption
     */

    public AclConfiguration withS3AclOption(S3AclOption s3AclOption) {
        this.s3AclOption = s3AclOption.toString();
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
        if (getS3AclOption() != null)
            sb.append("S3AclOption: ").append(getS3AclOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AclConfiguration == false)
            return false;
        AclConfiguration other = (AclConfiguration) obj;
        if (other.getS3AclOption() == null ^ this.getS3AclOption() == null)
            return false;
        if (other.getS3AclOption() != null && other.getS3AclOption().equals(this.getS3AclOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3AclOption() == null) ? 0 : getS3AclOption().hashCode());
        return hashCode;
    }

    @Override
    public AclConfiguration clone() {
        try {
            return (AclConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.AclConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
