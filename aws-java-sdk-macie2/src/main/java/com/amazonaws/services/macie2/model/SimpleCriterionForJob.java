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
 * Specifies a property-based condition that determines whether an S3 bucket is included or excluded from a
 * classification job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SimpleCriterionForJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimpleCriterionForJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     */
    private String comparator;
    /**
     * <p>
     * The property to use in the condition.
     * </p>
     */
    private String key;
    /**
     * <p>
     * An array that lists one or more values to use in the condition. If you specify multiple values, Amazon Macie uses
     * OR logic to join the values. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns the
     * bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketpublicaccess-effectivepermission"
     * >BucketPublicAccess.effectivePermission</a> property of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_NAME - A string that represents the name of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketmetadata-sharedaccess"
     * >BucketMetadata.sharedAccess</a> property of a bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in these
     * values.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * @see JobComparator
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     * 
     * @return The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * @see JobComparator
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobComparator
     */

    public SimpleCriterionForJob withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobComparator
     */

    public SimpleCriterionForJob withComparator(JobComparator comparator) {
        this.comparator = comparator.toString();
        return this;
    }

    /**
     * <p>
     * The property to use in the condition.
     * </p>
     * 
     * @param key
     *        The property to use in the condition.
     * @see SimpleCriterionKeyForJob
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The property to use in the condition.
     * </p>
     * 
     * @return The property to use in the condition.
     * @see SimpleCriterionKeyForJob
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The property to use in the condition.
     * </p>
     * 
     * @param key
     *        The property to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimpleCriterionKeyForJob
     */

    public SimpleCriterionForJob withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The property to use in the condition.
     * </p>
     * 
     * @param key
     *        The property to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimpleCriterionKeyForJob
     */

    public SimpleCriterionForJob withKey(SimpleCriterionKeyForJob key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * An array that lists one or more values to use in the condition. If you specify multiple values, Amazon Macie uses
     * OR logic to join the values. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns the
     * bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketpublicaccess-effectivepermission"
     * >BucketPublicAccess.effectivePermission</a> property of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_NAME - A string that represents the name of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketmetadata-sharedaccess"
     * >BucketMetadata.sharedAccess</a> property of a bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in these
     * values.
     * </p>
     * 
     * @return An array that lists one or more values to use in the condition. If you specify multiple values, Amazon
     *         Macie uses OR logic to join the values. Valid values for each supported property (key) are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns
     *         the bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the
     *         <a href=
     *         "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketpublicaccess-effectivepermission"
     *         >BucketPublicAccess.effectivePermission</a> property of a bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_BUCKET_NAME - A string that represents the name of a bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the <a
     *         href=
     *         "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketmetadata-sharedaccess"
     *         >BucketMetadata.sharedAccess</a> property of a bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in
     *         these values.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * An array that lists one or more values to use in the condition. If you specify multiple values, Amazon Macie uses
     * OR logic to join the values. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns the
     * bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketpublicaccess-effectivepermission"
     * >BucketPublicAccess.effectivePermission</a> property of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_NAME - A string that represents the name of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketmetadata-sharedaccess"
     * >BucketMetadata.sharedAccess</a> property of a bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in these
     * values.
     * </p>
     * 
     * @param values
     *        An array that lists one or more values to use in the condition. If you specify multiple values, Amazon
     *        Macie uses OR logic to join the values. Valid values for each supported property (key) are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns
     *        the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the
     *        <a href=
     *        "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketpublicaccess-effectivepermission"
     *        >BucketPublicAccess.effectivePermission</a> property of a bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_NAME - A string that represents the name of a bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the <a href=
     *        "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketmetadata-sharedaccess"
     *        >BucketMetadata.sharedAccess</a> property of a bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in
     *        these values.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * An array that lists one or more values to use in the condition. If you specify multiple values, Amazon Macie uses
     * OR logic to join the values. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns the
     * bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketpublicaccess-effectivepermission"
     * >BucketPublicAccess.effectivePermission</a> property of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_NAME - A string that represents the name of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketmetadata-sharedaccess"
     * >BucketMetadata.sharedAccess</a> property of a bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in these
     * values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array that lists one or more values to use in the condition. If you specify multiple values, Amazon
     *        Macie uses OR logic to join the values. Valid values for each supported property (key) are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns
     *        the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the
     *        <a href=
     *        "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketpublicaccess-effectivepermission"
     *        >BucketPublicAccess.effectivePermission</a> property of a bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_NAME - A string that represents the name of a bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the <a href=
     *        "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketmetadata-sharedaccess"
     *        >BucketMetadata.sharedAccess</a> property of a bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in
     *        these values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleCriterionForJob withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists one or more values to use in the condition. If you specify multiple values, Amazon Macie uses
     * OR logic to join the values. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns the
     * bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketpublicaccess-effectivepermission"
     * >BucketPublicAccess.effectivePermission</a> property of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_NAME - A string that represents the name of a bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the <a href=
     * "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketmetadata-sharedaccess"
     * >BucketMetadata.sharedAccess</a> property of a bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in these
     * values.
     * </p>
     * 
     * @param values
     *        An array that lists one or more values to use in the condition. If you specify multiple values, Amazon
     *        Macie uses OR logic to join the values. Valid values for each supported property (key) are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns
     *        the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the
     *        <a href=
     *        "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketpublicaccess-effectivepermission"
     *        >BucketPublicAccess.effectivePermission</a> property of a bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_NAME - A string that represents the name of a bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the <a href=
     *        "https://docs.aws.amazon.com/macie/latest/APIReference/datasources-s3.html#datasources-s3-prop-bucketmetadata-sharedaccess"
     *        >BucketMetadata.sharedAccess</a> property of a bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in
     *        these values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleCriterionForJob withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleCriterionForJob == false)
            return false;
        SimpleCriterionForJob other = (SimpleCriterionForJob) obj;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public SimpleCriterionForJob clone() {
        try {
            return (SimpleCriterionForJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SimpleCriterionForJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
