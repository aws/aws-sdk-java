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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBucketRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bucket to delete.
     * </p>
     * <p>
     * Use the <a>GetBuckets</a> action to get a list of bucket names that you can specify.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * A Boolean value that indicates whether to force delete the bucket.
     * </p>
     * <p>
     * You must force delete the bucket if it has one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket is the origin of a distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has instances that were granted access to it using the <a>SetResourceAccessForBucket</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has access keys.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Force deleting a bucket might impact other resources that rely on the bucket, such as instances, distributions,
     * or software that use the issued access keys.
     * </p>
     * </important>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The name of the bucket to delete.
     * </p>
     * <p>
     * Use the <a>GetBuckets</a> action to get a list of bucket names that you can specify.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket to delete.</p>
     *        <p>
     *        Use the <a>GetBuckets</a> action to get a list of bucket names that you can specify.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket to delete.
     * </p>
     * <p>
     * Use the <a>GetBuckets</a> action to get a list of bucket names that you can specify.
     * </p>
     * 
     * @return The name of the bucket to delete.</p>
     *         <p>
     *         Use the <a>GetBuckets</a> action to get a list of bucket names that you can specify.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket to delete.
     * </p>
     * <p>
     * Use the <a>GetBuckets</a> action to get a list of bucket names that you can specify.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket to delete.</p>
     *        <p>
     *        Use the <a>GetBuckets</a> action to get a list of bucket names that you can specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBucketRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to force delete the bucket.
     * </p>
     * <p>
     * You must force delete the bucket if it has one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket is the origin of a distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has instances that were granted access to it using the <a>SetResourceAccessForBucket</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has access keys.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Force deleting a bucket might impact other resources that rely on the bucket, such as instances, distributions,
     * or software that use the issued access keys.
     * </p>
     * </important>
     * 
     * @param forceDelete
     *        A Boolean value that indicates whether to force delete the bucket.</p>
     *        <p>
     *        You must force delete the bucket if it has one of the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The bucket is the origin of a distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket has instances that were granted access to it using the <a>SetResourceAccessForBucket</a>
     *        action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket has objects.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket has access keys.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Force deleting a bucket might impact other resources that rely on the bucket, such as instances,
     *        distributions, or software that use the issued access keys.
     *        </p>
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to force delete the bucket.
     * </p>
     * <p>
     * You must force delete the bucket if it has one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket is the origin of a distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has instances that were granted access to it using the <a>SetResourceAccessForBucket</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has access keys.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Force deleting a bucket might impact other resources that rely on the bucket, such as instances, distributions,
     * or software that use the issued access keys.
     * </p>
     * </important>
     * 
     * @return A Boolean value that indicates whether to force delete the bucket.</p>
     *         <p>
     *         You must force delete the bucket if it has one of the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The bucket is the origin of a distribution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket has instances that were granted access to it using the <a>SetResourceAccessForBucket</a>
     *         action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket has objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket has access keys.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         Force deleting a bucket might impact other resources that rely on the bucket, such as instances,
     *         distributions, or software that use the issued access keys.
     *         </p>
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to force delete the bucket.
     * </p>
     * <p>
     * You must force delete the bucket if it has one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket is the origin of a distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has instances that were granted access to it using the <a>SetResourceAccessForBucket</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has access keys.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Force deleting a bucket might impact other resources that rely on the bucket, such as instances, distributions,
     * or software that use the issued access keys.
     * </p>
     * </important>
     * 
     * @param forceDelete
     *        A Boolean value that indicates whether to force delete the bucket.</p>
     *        <p>
     *        You must force delete the bucket if it has one of the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The bucket is the origin of a distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket has instances that were granted access to it using the <a>SetResourceAccessForBucket</a>
     *        action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket has objects.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket has access keys.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Force deleting a bucket might impact other resources that rely on the bucket, such as instances,
     *        distributions, or software that use the issued access keys.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBucketRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to force delete the bucket.
     * </p>
     * <p>
     * You must force delete the bucket if it has one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket is the origin of a distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has instances that were granted access to it using the <a>SetResourceAccessForBucket</a> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket has access keys.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Force deleting a bucket might impact other resources that rely on the bucket, such as instances, distributions,
     * or software that use the issued access keys.
     * </p>
     * </important>
     * 
     * @return A Boolean value that indicates whether to force delete the bucket.</p>
     *         <p>
     *         You must force delete the bucket if it has one of the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The bucket is the origin of a distribution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket has instances that were granted access to it using the <a>SetResourceAccessForBucket</a>
     *         action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket has objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket has access keys.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         Force deleting a bucket might impact other resources that rely on the bucket, such as instances,
     *         distributions, or software that use the issued access keys.
     *         </p>
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBucketRequest == false)
            return false;
        DeleteBucketRequest other = (DeleteBucketRequest) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBucketRequest clone() {
        return (DeleteBucketRequest) super.clone();
    }

}
