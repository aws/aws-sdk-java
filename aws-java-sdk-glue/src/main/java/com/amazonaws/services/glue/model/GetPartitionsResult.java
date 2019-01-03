/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPartitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of requested partitions.
     * </p>
     */
    private java.util.List<Partition> partitions;
    /**
     * <p>
     * A continuation token, if the returned list of partitions does not does not include the last one.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of requested partitions.
     * </p>
     * 
     * @return A list of requested partitions.
     */

    public java.util.List<Partition> getPartitions() {
        return partitions;
    }

    /**
     * <p>
     * A list of requested partitions.
     * </p>
     * 
     * @param partitions
     *        A list of requested partitions.
     */

    public void setPartitions(java.util.Collection<Partition> partitions) {
        if (partitions == null) {
            this.partitions = null;
            return;
        }

        this.partitions = new java.util.ArrayList<Partition>(partitions);
    }

    /**
     * <p>
     * A list of requested partitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitions(java.util.Collection)} or {@link #withPartitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param partitions
     *        A list of requested partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsResult withPartitions(Partition... partitions) {
        if (this.partitions == null) {
            setPartitions(new java.util.ArrayList<Partition>(partitions.length));
        }
        for (Partition ele : partitions) {
            this.partitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of requested partitions.
     * </p>
     * 
     * @param partitions
     *        A list of requested partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsResult withPartitions(java.util.Collection<Partition> partitions) {
        setPartitions(partitions);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list of partitions does not does not include the last one.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list of partitions does not does not include the last one.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list of partitions does not does not include the last one.
     * </p>
     * 
     * @return A continuation token, if the returned list of partitions does not does not include the last one.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list of partitions does not does not include the last one.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list of partitions does not does not include the last one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsResult withNextToken(String nextToken) {
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
        if (getPartitions() != null)
            sb.append("Partitions: ").append(getPartitions()).append(",");
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

        if (obj instanceof GetPartitionsResult == false)
            return false;
        GetPartitionsResult other = (GetPartitionsResult) obj;
        if (other.getPartitions() == null ^ this.getPartitions() == null)
            return false;
        if (other.getPartitions() != null && other.getPartitions().equals(this.getPartitions()) == false)
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

        hashCode = prime * hashCode + ((getPartitions() == null) ? 0 : getPartitions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetPartitionsResult clone() {
        try {
            return (GetPartitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
