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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The configuration options of the S3 Access Grants location. It contains the <code>S3SubPrefix</code> field. The grant
 * scope, the data to which you are granting access, is the result of appending the <code>Subprefix</code> field to the
 * scope of the registered location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AccessGrantsLocationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessGrantsLocationConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>S3SubPrefix</code> is appended to the location scope creating the grant scope. Use this field to narrow
     * the scope of the grant to a subset of the location scope. This field is required if the location scope is the
     * default location <code>s3://</code> because you cannot create a grant for all of your S3 data in the Region and
     * must narrow the scope. For example, if the location scope is the default location <code>s3://</code>, the
     * <code>S3SubPrefx</code> can be a &lt;bucket-name&gt;/*, so the full grant scope path would be
     * <code>s3://&lt;bucket-name&gt;/*</code>. Or the <code>S3SubPrefx</code> can be
     * <code>&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>, so the full grant scope path would be or
     * <code>s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>.
     * </p>
     * <p>
     * If the <code>S3SubPrefix</code> includes a prefix, append the wildcard character <code>*</code> after the prefix
     * to indicate that you want to include all object key names in the bucket that start with that prefix.
     * </p>
     */
    private String s3SubPrefix;

    /**
     * <p>
     * The <code>S3SubPrefix</code> is appended to the location scope creating the grant scope. Use this field to narrow
     * the scope of the grant to a subset of the location scope. This field is required if the location scope is the
     * default location <code>s3://</code> because you cannot create a grant for all of your S3 data in the Region and
     * must narrow the scope. For example, if the location scope is the default location <code>s3://</code>, the
     * <code>S3SubPrefx</code> can be a &lt;bucket-name&gt;/*, so the full grant scope path would be
     * <code>s3://&lt;bucket-name&gt;/*</code>. Or the <code>S3SubPrefx</code> can be
     * <code>&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>, so the full grant scope path would be or
     * <code>s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>.
     * </p>
     * <p>
     * If the <code>S3SubPrefix</code> includes a prefix, append the wildcard character <code>*</code> after the prefix
     * to indicate that you want to include all object key names in the bucket that start with that prefix.
     * </p>
     * 
     * @param s3SubPrefix
     *        The <code>S3SubPrefix</code> is appended to the location scope creating the grant scope. Use this field to
     *        narrow the scope of the grant to a subset of the location scope. This field is required if the location
     *        scope is the default location <code>s3://</code> because you cannot create a grant for all of your S3 data
     *        in the Region and must narrow the scope. For example, if the location scope is the default location
     *        <code>s3://</code>, the <code>S3SubPrefx</code> can be a &lt;bucket-name&gt;/*, so the full grant scope
     *        path would be <code>s3://&lt;bucket-name&gt;/*</code>. Or the <code>S3SubPrefx</code> can be
     *        <code>&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>, so the full grant scope path would be or
     *        <code>s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>.</p>
     *        <p>
     *        If the <code>S3SubPrefix</code> includes a prefix, append the wildcard character <code>*</code> after the
     *        prefix to indicate that you want to include all object key names in the bucket that start with that
     *        prefix.
     */

    public void setS3SubPrefix(String s3SubPrefix) {
        this.s3SubPrefix = s3SubPrefix;
    }

    /**
     * <p>
     * The <code>S3SubPrefix</code> is appended to the location scope creating the grant scope. Use this field to narrow
     * the scope of the grant to a subset of the location scope. This field is required if the location scope is the
     * default location <code>s3://</code> because you cannot create a grant for all of your S3 data in the Region and
     * must narrow the scope. For example, if the location scope is the default location <code>s3://</code>, the
     * <code>S3SubPrefx</code> can be a &lt;bucket-name&gt;/*, so the full grant scope path would be
     * <code>s3://&lt;bucket-name&gt;/*</code>. Or the <code>S3SubPrefx</code> can be
     * <code>&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>, so the full grant scope path would be or
     * <code>s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>.
     * </p>
     * <p>
     * If the <code>S3SubPrefix</code> includes a prefix, append the wildcard character <code>*</code> after the prefix
     * to indicate that you want to include all object key names in the bucket that start with that prefix.
     * </p>
     * 
     * @return The <code>S3SubPrefix</code> is appended to the location scope creating the grant scope. Use this field
     *         to narrow the scope of the grant to a subset of the location scope. This field is required if the
     *         location scope is the default location <code>s3://</code> because you cannot create a grant for all of
     *         your S3 data in the Region and must narrow the scope. For example, if the location scope is the default
     *         location <code>s3://</code>, the <code>S3SubPrefx</code> can be a &lt;bucket-name&gt;/*, so the full
     *         grant scope path would be <code>s3://&lt;bucket-name&gt;/*</code>. Or the <code>S3SubPrefx</code> can be
     *         <code>&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>, so the full grant scope path would be or
     *         <code>s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>.</p>
     *         <p>
     *         If the <code>S3SubPrefix</code> includes a prefix, append the wildcard character <code>*</code> after the
     *         prefix to indicate that you want to include all object key names in the bucket that start with that
     *         prefix.
     */

    public String getS3SubPrefix() {
        return this.s3SubPrefix;
    }

    /**
     * <p>
     * The <code>S3SubPrefix</code> is appended to the location scope creating the grant scope. Use this field to narrow
     * the scope of the grant to a subset of the location scope. This field is required if the location scope is the
     * default location <code>s3://</code> because you cannot create a grant for all of your S3 data in the Region and
     * must narrow the scope. For example, if the location scope is the default location <code>s3://</code>, the
     * <code>S3SubPrefx</code> can be a &lt;bucket-name&gt;/*, so the full grant scope path would be
     * <code>s3://&lt;bucket-name&gt;/*</code>. Or the <code>S3SubPrefx</code> can be
     * <code>&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>, so the full grant scope path would be or
     * <code>s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>.
     * </p>
     * <p>
     * If the <code>S3SubPrefix</code> includes a prefix, append the wildcard character <code>*</code> after the prefix
     * to indicate that you want to include all object key names in the bucket that start with that prefix.
     * </p>
     * 
     * @param s3SubPrefix
     *        The <code>S3SubPrefix</code> is appended to the location scope creating the grant scope. Use this field to
     *        narrow the scope of the grant to a subset of the location scope. This field is required if the location
     *        scope is the default location <code>s3://</code> because you cannot create a grant for all of your S3 data
     *        in the Region and must narrow the scope. For example, if the location scope is the default location
     *        <code>s3://</code>, the <code>S3SubPrefx</code> can be a &lt;bucket-name&gt;/*, so the full grant scope
     *        path would be <code>s3://&lt;bucket-name&gt;/*</code>. Or the <code>S3SubPrefx</code> can be
     *        <code>&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>, so the full grant scope path would be or
     *        <code>s3://&lt;bucket-name&gt;/&lt;prefix-name&gt;*</code>.</p>
     *        <p>
     *        If the <code>S3SubPrefix</code> includes a prefix, append the wildcard character <code>*</code> after the
     *        prefix to indicate that you want to include all object key names in the bucket that start with that
     *        prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessGrantsLocationConfiguration withS3SubPrefix(String s3SubPrefix) {
        setS3SubPrefix(s3SubPrefix);
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
        if (getS3SubPrefix() != null)
            sb.append("S3SubPrefix: ").append(getS3SubPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessGrantsLocationConfiguration == false)
            return false;
        AccessGrantsLocationConfiguration other = (AccessGrantsLocationConfiguration) obj;
        if (other.getS3SubPrefix() == null ^ this.getS3SubPrefix() == null)
            return false;
        if (other.getS3SubPrefix() != null && other.getS3SubPrefix().equals(this.getS3SubPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3SubPrefix() == null) ? 0 : getS3SubPrefix().hashCode());
        return hashCode;
    }

    @Override
    public AccessGrantsLocationConfiguration clone() {
        try {
            return (AccessGrantsLocationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
