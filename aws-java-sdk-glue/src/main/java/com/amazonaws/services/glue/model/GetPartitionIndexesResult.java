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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartitionIndexes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPartitionIndexesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of index descriptors.
     * </p>
     */
    private java.util.List<PartitionIndexDescriptor> partitionIndexDescriptorList;
    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of index descriptors.
     * </p>
     * 
     * @return A list of index descriptors.
     */

    public java.util.List<PartitionIndexDescriptor> getPartitionIndexDescriptorList() {
        return partitionIndexDescriptorList;
    }

    /**
     * <p>
     * A list of index descriptors.
     * </p>
     * 
     * @param partitionIndexDescriptorList
     *        A list of index descriptors.
     */

    public void setPartitionIndexDescriptorList(java.util.Collection<PartitionIndexDescriptor> partitionIndexDescriptorList) {
        if (partitionIndexDescriptorList == null) {
            this.partitionIndexDescriptorList = null;
            return;
        }

        this.partitionIndexDescriptorList = new java.util.ArrayList<PartitionIndexDescriptor>(partitionIndexDescriptorList);
    }

    /**
     * <p>
     * A list of index descriptors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionIndexDescriptorList(java.util.Collection)} or
     * {@link #withPartitionIndexDescriptorList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param partitionIndexDescriptorList
     *        A list of index descriptors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionIndexesResult withPartitionIndexDescriptorList(PartitionIndexDescriptor... partitionIndexDescriptorList) {
        if (this.partitionIndexDescriptorList == null) {
            setPartitionIndexDescriptorList(new java.util.ArrayList<PartitionIndexDescriptor>(partitionIndexDescriptorList.length));
        }
        for (PartitionIndexDescriptor ele : partitionIndexDescriptorList) {
            this.partitionIndexDescriptorList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of index descriptors.
     * </p>
     * 
     * @param partitionIndexDescriptorList
     *        A list of index descriptors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionIndexesResult withPartitionIndexDescriptorList(java.util.Collection<PartitionIndexDescriptor> partitionIndexDescriptorList) {
        setPartitionIndexDescriptorList(partitionIndexDescriptorList);
        return this;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, present if the current list segment is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @return A continuation token, present if the current list segment is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, present if the current list segment is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionIndexesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getPartitionIndexDescriptorList() != null)
            sb.append("PartitionIndexDescriptorList: ").append(getPartitionIndexDescriptorList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPartitionIndexesResult == false)
            return false;
        GetPartitionIndexesResult other = (GetPartitionIndexesResult) obj;
        if (other.getPartitionIndexDescriptorList() == null ^ this.getPartitionIndexDescriptorList() == null)
            return false;
        if (other.getPartitionIndexDescriptorList() != null && other.getPartitionIndexDescriptorList().equals(this.getPartitionIndexDescriptorList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartitionIndexDescriptorList() == null) ? 0 : getPartitionIndexDescriptorList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetPartitionIndexesResult clone() {
        try {
            return (GetPartitionIndexesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
