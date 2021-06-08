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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The container for the bucket configuration.
 * </p>
 * <note>
 * <p>
 * This is not supported by Amazon S3 on Outposts buckets.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateBucketConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBucketConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N. Virginia)
     * Region (us-east-1), you do not need to specify the location.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private String locationConstraint;

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N. Virginia)
     * Region (us-east-1), you do not need to specify the location.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param locationConstraint
     *        Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N.
     *        Virginia) Region (us-east-1), you do not need to specify the location. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @see BucketLocationConstraint
     */

    public void setLocationConstraint(String locationConstraint) {
        this.locationConstraint = locationConstraint;
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N. Virginia)
     * Region (us-east-1), you do not need to specify the location.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N.
     *         Virginia) Region (us-east-1), you do not need to specify the location. </p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     * @see BucketLocationConstraint
     */

    public String getLocationConstraint() {
        return this.locationConstraint;
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N. Virginia)
     * Region (us-east-1), you do not need to specify the location.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param locationConstraint
     *        Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N.
     *        Virginia) Region (us-east-1), you do not need to specify the location. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketLocationConstraint
     */

    public CreateBucketConfiguration withLocationConstraint(String locationConstraint) {
        setLocationConstraint(locationConstraint);
        return this;
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N. Virginia)
     * Region (us-east-1), you do not need to specify the location.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param locationConstraint
     *        Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N.
     *        Virginia) Region (us-east-1), you do not need to specify the location. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BucketLocationConstraint
     */

    public CreateBucketConfiguration withLocationConstraint(BucketLocationConstraint locationConstraint) {
        this.locationConstraint = locationConstraint.toString();
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
        if (getLocationConstraint() != null)
            sb.append("LocationConstraint: ").append(getLocationConstraint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBucketConfiguration == false)
            return false;
        CreateBucketConfiguration other = (CreateBucketConfiguration) obj;
        if (other.getLocationConstraint() == null ^ this.getLocationConstraint() == null)
            return false;
        if (other.getLocationConstraint() != null && other.getLocationConstraint().equals(this.getLocationConstraint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationConstraint() == null) ? 0 : getLocationConstraint().hashCode());
        return hashCode;
    }

    @Override
    public CreateBucketConfiguration clone() {
        try {
            return (CreateBucketConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
