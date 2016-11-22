/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon S3 objects that you specify in your event selectors for your trail to log data events. Data events are
 * object level API operations that access S3 objects, such as <code>GetObject</code>, <code>DeleteObject</code>, and
 * <code>PutObject</code>. You can specify up to 50 S3 buckets and object prefixes for an event selector.
 * </p>
 * <p>
 * Example
 * </p>
 * <ol>
 * <li>
 * <p>
 * You create an event selector for a trail and specify an S3 bucket and an empty prefix, such as
 * <code>arn:aws:s3:::bucket-1/</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You upload an image file to <code>bucket-1</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>PutObject</code> API operation occurs on an object in the S3 bucket that you specified in the event
 * selector. The trail processes and logs the event.
 * </p>
 * </li>
 * <li>
 * <p>
 * You upload another image file to a different S3 bucket named <code>arn:aws:s3:::bucket-2</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The event occurs on an object in an S3 bucket that you didn't specify in the event selector. The trail doesn’t log
 * the event.
 * </p>
 * </li>
 * </ol>
 */
public class DataResource implements Serializable, Cloneable {

    /**
     * <p>
     * The resource type in which you want to log data events. You can specify only the following value:
     * <code>AWS::S3::Object</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A list of ARN-like strings for the specified S3 objects.
     * </p>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The resource type in which you want to log data events. You can specify only the following value:
     * <code>AWS::S3::Object</code>.
     * </p>
     * 
     * @param type
     *        The resource type in which you want to log data events. You can specify only the following value:
     *        <code>AWS::S3::Object</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The resource type in which you want to log data events. You can specify only the following value:
     * <code>AWS::S3::Object</code>.
     * </p>
     * 
     * @return The resource type in which you want to log data events. You can specify only the following value:
     *         <code>AWS::S3::Object</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The resource type in which you want to log data events. You can specify only the following value:
     * <code>AWS::S3::Object</code>.
     * </p>
     * 
     * @param type
     *        The resource type in which you want to log data events. You can specify only the following value:
     *        <code>AWS::S3::Object</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A list of ARN-like strings for the specified S3 objects.
     * </p>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     * 
     * @return A list of ARN-like strings for the specified S3 objects.</p>
     *         <p>
     *         To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     *         <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     *         </p>
     *         <p>
     *         To log data events for specific objects, specify the S3 bucket and object prefix such as
     *         <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3
     *         bucket that match the prefix.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * A list of ARN-like strings for the specified S3 objects.
     * </p>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     * 
     * @param values
     *        A list of ARN-like strings for the specified S3 objects.</p>
     *        <p>
     *        To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     *        <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     *        </p>
     *        <p>
     *        To log data events for specific objects, specify the S3 bucket and object prefix such as
     *        <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3
     *        bucket that match the prefix.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * A list of ARN-like strings for the specified S3 objects.
     * </p>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of ARN-like strings for the specified S3 objects.</p>
     *        <p>
     *        To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     *        <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     *        </p>
     *        <p>
     *        To log data events for specific objects, specify the S3 bucket and object prefix such as
     *        <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3
     *        bucket that match the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResource withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARN-like strings for the specified S3 objects.
     * </p>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     * 
     * @param values
     *        A list of ARN-like strings for the specified S3 objects.</p>
     *        <p>
     *        To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     *        <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     *        </p>
     *        <p>
     *        To log data events for specific objects, specify the S3 bucket and object prefix such as
     *        <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3
     *        bucket that match the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResource withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataResource == false)
            return false;
        DataResource other = (DataResource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public DataResource clone() {
        try {
            return (DataResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
