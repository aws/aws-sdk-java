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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies S3 buckets to add or remove from the exclusion list defined by the classification scope for an Amazon Macie
 * account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3ClassificationScopeExclusionUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ClassificationScopeExclusionUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array of
     * strings that: lists the names of buckets to add or remove from the list, or specifies a new set of bucket names
     * that overwrites all existing names in the list. Each string must be the full name of an S3 bucket. Values are
     * case sensitive.
     * </p>
     */
    private java.util.List<String> bucketNames;
    /**
     * <p>
     * Specifies how to apply the changes to the exclusion list. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ADD - Append the specified bucket names to the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOVE - Remove the specified bucket names from the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value, Amazon
     * Macie removes all existing names from the list and adds all the specified names to the list.
     * </p>
     * </li>
     * </ul>
     */
    private String operation;

    /**
     * <p>
     * Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array of
     * strings that: lists the names of buckets to add or remove from the list, or specifies a new set of bucket names
     * that overwrites all existing names in the list. Each string must be the full name of an S3 bucket. Values are
     * case sensitive.
     * </p>
     * 
     * @return Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array
     *         of strings that: lists the names of buckets to add or remove from the list, or specifies a new set of
     *         bucket names that overwrites all existing names in the list. Each string must be the full name of an S3
     *         bucket. Values are case sensitive.
     */

    public java.util.List<String> getBucketNames() {
        return bucketNames;
    }

    /**
     * <p>
     * Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array of
     * strings that: lists the names of buckets to add or remove from the list, or specifies a new set of bucket names
     * that overwrites all existing names in the list. Each string must be the full name of an S3 bucket. Values are
     * case sensitive.
     * </p>
     * 
     * @param bucketNames
     *        Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array
     *        of strings that: lists the names of buckets to add or remove from the list, or specifies a new set of
     *        bucket names that overwrites all existing names in the list. Each string must be the full name of an S3
     *        bucket. Values are case sensitive.
     */

    public void setBucketNames(java.util.Collection<String> bucketNames) {
        if (bucketNames == null) {
            this.bucketNames = null;
            return;
        }

        this.bucketNames = new java.util.ArrayList<String>(bucketNames);
    }

    /**
     * <p>
     * Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array of
     * strings that: lists the names of buckets to add or remove from the list, or specifies a new set of bucket names
     * that overwrites all existing names in the list. Each string must be the full name of an S3 bucket. Values are
     * case sensitive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBucketNames(java.util.Collection)} or {@link #withBucketNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bucketNames
     *        Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array
     *        of strings that: lists the names of buckets to add or remove from the list, or specifies a new set of
     *        bucket names that overwrites all existing names in the list. Each string must be the full name of an S3
     *        bucket. Values are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ClassificationScopeExclusionUpdate withBucketNames(String... bucketNames) {
        if (this.bucketNames == null) {
            setBucketNames(new java.util.ArrayList<String>(bucketNames.length));
        }
        for (String ele : bucketNames) {
            this.bucketNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array of
     * strings that: lists the names of buckets to add or remove from the list, or specifies a new set of bucket names
     * that overwrites all existing names in the list. Each string must be the full name of an S3 bucket. Values are
     * case sensitive.
     * </p>
     * 
     * @param bucketNames
     *        Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array
     *        of strings that: lists the names of buckets to add or remove from the list, or specifies a new set of
     *        bucket names that overwrites all existing names in the list. Each string must be the full name of an S3
     *        bucket. Values are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ClassificationScopeExclusionUpdate withBucketNames(java.util.Collection<String> bucketNames) {
        setBucketNames(bucketNames);
        return this;
    }

    /**
     * <p>
     * Specifies how to apply the changes to the exclusion list. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ADD - Append the specified bucket names to the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOVE - Remove the specified bucket names from the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value, Amazon
     * Macie removes all existing names from the list and adds all the specified names to the list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operation
     *        Specifies how to apply the changes to the exclusion list. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ADD - Append the specified bucket names to the current list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOVE - Remove the specified bucket names from the current list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value,
     *        Amazon Macie removes all existing names from the list and adds all the specified names to the list.
     *        </p>
     *        </li>
     * @see ClassificationScopeUpdateOperation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * Specifies how to apply the changes to the exclusion list. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ADD - Append the specified bucket names to the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOVE - Remove the specified bucket names from the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value, Amazon
     * Macie removes all existing names from the list and adds all the specified names to the list.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies how to apply the changes to the exclusion list. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ADD - Append the specified bucket names to the current list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REMOVE - Remove the specified bucket names from the current list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value,
     *         Amazon Macie removes all existing names from the list and adds all the specified names to the list.
     *         </p>
     *         </li>
     * @see ClassificationScopeUpdateOperation
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * Specifies how to apply the changes to the exclusion list. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ADD - Append the specified bucket names to the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOVE - Remove the specified bucket names from the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value, Amazon
     * Macie removes all existing names from the list and adds all the specified names to the list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operation
     *        Specifies how to apply the changes to the exclusion list. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ADD - Append the specified bucket names to the current list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOVE - Remove the specified bucket names from the current list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value,
     *        Amazon Macie removes all existing names from the list and adds all the specified names to the list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClassificationScopeUpdateOperation
     */

    public S3ClassificationScopeExclusionUpdate withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * Specifies how to apply the changes to the exclusion list. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ADD - Append the specified bucket names to the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOVE - Remove the specified bucket names from the current list.
     * </p>
     * </li>
     * <li>
     * <p>
     * REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value, Amazon
     * Macie removes all existing names from the list and adds all the specified names to the list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operation
     *        Specifies how to apply the changes to the exclusion list. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ADD - Append the specified bucket names to the current list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOVE - Remove the specified bucket names from the current list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value,
     *        Amazon Macie removes all existing names from the list and adds all the specified names to the list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClassificationScopeUpdateOperation
     */

    public S3ClassificationScopeExclusionUpdate withOperation(ClassificationScopeUpdateOperation operation) {
        this.operation = operation.toString();
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
        if (getBucketNames() != null)
            sb.append("BucketNames: ").append(getBucketNames()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ClassificationScopeExclusionUpdate == false)
            return false;
        S3ClassificationScopeExclusionUpdate other = (S3ClassificationScopeExclusionUpdate) obj;
        if (other.getBucketNames() == null ^ this.getBucketNames() == null)
            return false;
        if (other.getBucketNames() != null && other.getBucketNames().equals(this.getBucketNames()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketNames() == null) ? 0 : getBucketNames().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        return hashCode;
    }

    @Override
    public S3ClassificationScopeExclusionUpdate clone() {
        try {
            return (S3ClassificationScopeExclusionUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3ClassificationScopeExclusionUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
