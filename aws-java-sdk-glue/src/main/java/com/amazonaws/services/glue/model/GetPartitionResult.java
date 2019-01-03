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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPartitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested information, in the form of a <code>Partition</code> object.
     * </p>
     */
    private Partition partition;

    /**
     * <p>
     * The requested information, in the form of a <code>Partition</code> object.
     * </p>
     * 
     * @param partition
     *        The requested information, in the form of a <code>Partition</code> object.
     */

    public void setPartition(Partition partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * The requested information, in the form of a <code>Partition</code> object.
     * </p>
     * 
     * @return The requested information, in the form of a <code>Partition</code> object.
     */

    public Partition getPartition() {
        return this.partition;
    }

    /**
     * <p>
     * The requested information, in the form of a <code>Partition</code> object.
     * </p>
     * 
     * @param partition
     *        The requested information, in the form of a <code>Partition</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionResult withPartition(Partition partition) {
        setPartition(partition);
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
        if (getPartition() != null)
            sb.append("Partition: ").append(getPartition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPartitionResult == false)
            return false;
        GetPartitionResult other = (GetPartitionResult) obj;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null && other.getPartition().equals(this.getPartition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        return hashCode;
    }

    @Override
    public GetPartitionResult clone() {
        try {
            return (GetPartitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
