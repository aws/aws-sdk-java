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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBucketRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bucket to update.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * An object that sets the public accessibility of objects in the specified bucket.
     * </p>
     */
    private AccessRules accessRules;
    /**
     * <p>
     * Specifies whether to enable or suspend versioning of objects in the bucket.
     * </p>
     * <p>
     * The following options can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Enabled</code> - Enables versioning of objects in the specified bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suspended</code> - Suspends versioning of objects in the specified bucket. Existing object versions are
     * retained.
     * </p>
     * </li>
     * </ul>
     */
    private String versioning;
    /**
     * <p>
     * An array of strings to specify the AWS account IDs that can access the bucket.
     * </p>
     * <p>
     * You can give a maximum of 10 AWS accounts access to a bucket.
     * </p>
     */
    private java.util.List<String> readonlyAccessAccounts;

    /**
     * <p>
     * The name of the bucket to update.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket to update.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket to update.
     * </p>
     * 
     * @return The name of the bucket to update.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket to update.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBucketRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * An object that sets the public accessibility of objects in the specified bucket.
     * </p>
     * 
     * @param accessRules
     *        An object that sets the public accessibility of objects in the specified bucket.
     */

    public void setAccessRules(AccessRules accessRules) {
        this.accessRules = accessRules;
    }

    /**
     * <p>
     * An object that sets the public accessibility of objects in the specified bucket.
     * </p>
     * 
     * @return An object that sets the public accessibility of objects in the specified bucket.
     */

    public AccessRules getAccessRules() {
        return this.accessRules;
    }

    /**
     * <p>
     * An object that sets the public accessibility of objects in the specified bucket.
     * </p>
     * 
     * @param accessRules
     *        An object that sets the public accessibility of objects in the specified bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBucketRequest withAccessRules(AccessRules accessRules) {
        setAccessRules(accessRules);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable or suspend versioning of objects in the bucket.
     * </p>
     * <p>
     * The following options can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Enabled</code> - Enables versioning of objects in the specified bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suspended</code> - Suspends versioning of objects in the specified bucket. Existing object versions are
     * retained.
     * </p>
     * </li>
     * </ul>
     * 
     * @param versioning
     *        Specifies whether to enable or suspend versioning of objects in the bucket.</p>
     *        <p>
     *        The following options can be specified:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Enabled</code> - Enables versioning of objects in the specified bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Suspended</code> - Suspends versioning of objects in the specified bucket. Existing object versions
     *        are retained.
     *        </p>
     *        </li>
     */

    public void setVersioning(String versioning) {
        this.versioning = versioning;
    }

    /**
     * <p>
     * Specifies whether to enable or suspend versioning of objects in the bucket.
     * </p>
     * <p>
     * The following options can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Enabled</code> - Enables versioning of objects in the specified bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suspended</code> - Suspends versioning of objects in the specified bucket. Existing object versions are
     * retained.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to enable or suspend versioning of objects in the bucket.</p>
     *         <p>
     *         The following options can be specified:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Enabled</code> - Enables versioning of objects in the specified bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Suspended</code> - Suspends versioning of objects in the specified bucket. Existing object versions
     *         are retained.
     *         </p>
     *         </li>
     */

    public String getVersioning() {
        return this.versioning;
    }

    /**
     * <p>
     * Specifies whether to enable or suspend versioning of objects in the bucket.
     * </p>
     * <p>
     * The following options can be specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Enabled</code> - Enables versioning of objects in the specified bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suspended</code> - Suspends versioning of objects in the specified bucket. Existing object versions are
     * retained.
     * </p>
     * </li>
     * </ul>
     * 
     * @param versioning
     *        Specifies whether to enable or suspend versioning of objects in the bucket.</p>
     *        <p>
     *        The following options can be specified:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Enabled</code> - Enables versioning of objects in the specified bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Suspended</code> - Suspends versioning of objects in the specified bucket. Existing object versions
     *        are retained.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBucketRequest withVersioning(String versioning) {
        setVersioning(versioning);
        return this;
    }

    /**
     * <p>
     * An array of strings to specify the AWS account IDs that can access the bucket.
     * </p>
     * <p>
     * You can give a maximum of 10 AWS accounts access to a bucket.
     * </p>
     * 
     * @return An array of strings to specify the AWS account IDs that can access the bucket.</p>
     *         <p>
     *         You can give a maximum of 10 AWS accounts access to a bucket.
     */

    public java.util.List<String> getReadonlyAccessAccounts() {
        return readonlyAccessAccounts;
    }

    /**
     * <p>
     * An array of strings to specify the AWS account IDs that can access the bucket.
     * </p>
     * <p>
     * You can give a maximum of 10 AWS accounts access to a bucket.
     * </p>
     * 
     * @param readonlyAccessAccounts
     *        An array of strings to specify the AWS account IDs that can access the bucket.</p>
     *        <p>
     *        You can give a maximum of 10 AWS accounts access to a bucket.
     */

    public void setReadonlyAccessAccounts(java.util.Collection<String> readonlyAccessAccounts) {
        if (readonlyAccessAccounts == null) {
            this.readonlyAccessAccounts = null;
            return;
        }

        this.readonlyAccessAccounts = new java.util.ArrayList<String>(readonlyAccessAccounts);
    }

    /**
     * <p>
     * An array of strings to specify the AWS account IDs that can access the bucket.
     * </p>
     * <p>
     * You can give a maximum of 10 AWS accounts access to a bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadonlyAccessAccounts(java.util.Collection)} or
     * {@link #withReadonlyAccessAccounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param readonlyAccessAccounts
     *        An array of strings to specify the AWS account IDs that can access the bucket.</p>
     *        <p>
     *        You can give a maximum of 10 AWS accounts access to a bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBucketRequest withReadonlyAccessAccounts(String... readonlyAccessAccounts) {
        if (this.readonlyAccessAccounts == null) {
            setReadonlyAccessAccounts(new java.util.ArrayList<String>(readonlyAccessAccounts.length));
        }
        for (String ele : readonlyAccessAccounts) {
            this.readonlyAccessAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings to specify the AWS account IDs that can access the bucket.
     * </p>
     * <p>
     * You can give a maximum of 10 AWS accounts access to a bucket.
     * </p>
     * 
     * @param readonlyAccessAccounts
     *        An array of strings to specify the AWS account IDs that can access the bucket.</p>
     *        <p>
     *        You can give a maximum of 10 AWS accounts access to a bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBucketRequest withReadonlyAccessAccounts(java.util.Collection<String> readonlyAccessAccounts) {
        setReadonlyAccessAccounts(readonlyAccessAccounts);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getAccessRules() != null)
            sb.append("AccessRules: ").append(getAccessRules()).append(",");
        if (getVersioning() != null)
            sb.append("Versioning: ").append(getVersioning()).append(",");
        if (getReadonlyAccessAccounts() != null)
            sb.append("ReadonlyAccessAccounts: ").append(getReadonlyAccessAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBucketRequest == false)
            return false;
        UpdateBucketRequest other = (UpdateBucketRequest) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getAccessRules() == null ^ this.getAccessRules() == null)
            return false;
        if (other.getAccessRules() != null && other.getAccessRules().equals(this.getAccessRules()) == false)
            return false;
        if (other.getVersioning() == null ^ this.getVersioning() == null)
            return false;
        if (other.getVersioning() != null && other.getVersioning().equals(this.getVersioning()) == false)
            return false;
        if (other.getReadonlyAccessAccounts() == null ^ this.getReadonlyAccessAccounts() == null)
            return false;
        if (other.getReadonlyAccessAccounts() != null && other.getReadonlyAccessAccounts().equals(this.getReadonlyAccessAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getAccessRules() == null) ? 0 : getAccessRules().hashCode());
        hashCode = prime * hashCode + ((getVersioning() == null) ? 0 : getVersioning().hashCode());
        hashCode = prime * hashCode + ((getReadonlyAccessAccounts() == null) ? 0 : getReadonlyAccessAccounts().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBucketRequest clone() {
        return (UpdateBucketRequest) super.clone();
    }

}
