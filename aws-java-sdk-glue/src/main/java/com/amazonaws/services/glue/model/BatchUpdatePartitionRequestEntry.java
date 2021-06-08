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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the values and structure used to update a partition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchUpdatePartitionRequestEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdatePartitionRequestEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of values defining the partitions.
     * </p>
     */
    private java.util.List<String> partitionValueList;
    /**
     * <p>
     * The structure used to update a partition.
     * </p>
     */
    private PartitionInput partitionInput;

    /**
     * <p>
     * A list of values defining the partitions.
     * </p>
     * 
     * @return A list of values defining the partitions.
     */

    public java.util.List<String> getPartitionValueList() {
        return partitionValueList;
    }

    /**
     * <p>
     * A list of values defining the partitions.
     * </p>
     * 
     * @param partitionValueList
     *        A list of values defining the partitions.
     */

    public void setPartitionValueList(java.util.Collection<String> partitionValueList) {
        if (partitionValueList == null) {
            this.partitionValueList = null;
            return;
        }

        this.partitionValueList = new java.util.ArrayList<String>(partitionValueList);
    }

    /**
     * <p>
     * A list of values defining the partitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionValueList(java.util.Collection)} or {@link #withPartitionValueList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param partitionValueList
     *        A list of values defining the partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePartitionRequestEntry withPartitionValueList(String... partitionValueList) {
        if (this.partitionValueList == null) {
            setPartitionValueList(new java.util.ArrayList<String>(partitionValueList.length));
        }
        for (String ele : partitionValueList) {
            this.partitionValueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of values defining the partitions.
     * </p>
     * 
     * @param partitionValueList
     *        A list of values defining the partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePartitionRequestEntry withPartitionValueList(java.util.Collection<String> partitionValueList) {
        setPartitionValueList(partitionValueList);
        return this;
    }

    /**
     * <p>
     * The structure used to update a partition.
     * </p>
     * 
     * @param partitionInput
     *        The structure used to update a partition.
     */

    public void setPartitionInput(PartitionInput partitionInput) {
        this.partitionInput = partitionInput;
    }

    /**
     * <p>
     * The structure used to update a partition.
     * </p>
     * 
     * @return The structure used to update a partition.
     */

    public PartitionInput getPartitionInput() {
        return this.partitionInput;
    }

    /**
     * <p>
     * The structure used to update a partition.
     * </p>
     * 
     * @param partitionInput
     *        The structure used to update a partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePartitionRequestEntry withPartitionInput(PartitionInput partitionInput) {
        setPartitionInput(partitionInput);
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
        if (getPartitionValueList() != null)
            sb.append("PartitionValueList: ").append(getPartitionValueList()).append(",");
        if (getPartitionInput() != null)
            sb.append("PartitionInput: ").append(getPartitionInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdatePartitionRequestEntry == false)
            return false;
        BatchUpdatePartitionRequestEntry other = (BatchUpdatePartitionRequestEntry) obj;
        if (other.getPartitionValueList() == null ^ this.getPartitionValueList() == null)
            return false;
        if (other.getPartitionValueList() != null && other.getPartitionValueList().equals(this.getPartitionValueList()) == false)
            return false;
        if (other.getPartitionInput() == null ^ this.getPartitionInput() == null)
            return false;
        if (other.getPartitionInput() != null && other.getPartitionInput().equals(this.getPartitionInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartitionValueList() == null) ? 0 : getPartitionValueList().hashCode());
        hashCode = prime * hashCode + ((getPartitionInput() == null) ? 0 : getPartitionInput().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdatePartitionRequestEntry clone() {
        try {
            return (BatchUpdatePartitionRequestEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.BatchUpdatePartitionRequestEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
