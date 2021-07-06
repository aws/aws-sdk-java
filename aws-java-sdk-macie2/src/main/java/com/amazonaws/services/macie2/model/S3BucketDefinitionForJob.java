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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Amazon Web Services account that owns S3 buckets for a classification job to analyze, and one or more
 * specific buckets to analyze for that account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3BucketDefinitionForJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketDefinitionForJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the buckets.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     */
    private java.util.List<String> buckets;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the buckets.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that owns the buckets.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the buckets.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account that owns the buckets.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the buckets.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that owns the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDefinitionForJob withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     * 
     * @return An array that lists the names of the buckets.
     */

    public java.util.List<String> getBuckets() {
        return buckets;
    }

    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     * 
     * @param buckets
     *        An array that lists the names of the buckets.
     */

    public void setBuckets(java.util.Collection<String> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }

        this.buckets = new java.util.ArrayList<String>(buckets);
    }

    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuckets(java.util.Collection)} or {@link #withBuckets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param buckets
     *        An array that lists the names of the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDefinitionForJob withBuckets(String... buckets) {
        if (this.buckets == null) {
            setBuckets(new java.util.ArrayList<String>(buckets.length));
        }
        for (String ele : buckets) {
            this.buckets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     * 
     * @param buckets
     *        An array that lists the names of the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketDefinitionForJob withBuckets(java.util.Collection<String> buckets) {
        setBuckets(buckets);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBuckets() != null)
            sb.append("Buckets: ").append(getBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketDefinitionForJob == false)
            return false;
        S3BucketDefinitionForJob other = (S3BucketDefinitionForJob) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBuckets() == null ^ this.getBuckets() == null)
            return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketDefinitionForJob clone() {
        try {
            return (S3BucketDefinitionForJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3BucketDefinitionForJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
