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
 * A list of errors that can occur when registering partition indexes for an existing table.
 * </p>
 * <p>
 * These errors give the details about why an index registration failed and provide a limited number of partitions in
 * the response, so that you can fix the partitions at fault and try registering the index again. The most common set of
 * errors that can occur are categorized as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * EncryptedPartitionError: The partitions are encrypted.
 * </p>
 * </li>
 * <li>
 * <p>
 * InvalidPartitionTypeDataError: The partition value doesn't match the data type for that partition column.
 * </p>
 * </li>
 * <li>
 * <p>
 * MissingPartitionValueError: The partitions are encrypted.
 * </p>
 * </li>
 * <li>
 * <p>
 * UnsupportedPartitionCharacterError: Characters inside the partition value are not supported. For example: U+0000 ,
 * U+0001, U+0002.
 * </p>
 * </li>
 * <li>
 * <p>
 * InternalError: Any error which does not belong to other error codes.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BackfillError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackfillError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code for an error that occurred when registering partition indexes for an existing table.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A list of a limited number of partitions in the response.
     * </p>
     */
    private java.util.List<PartitionValueList> partitions;

    /**
     * <p>
     * The error code for an error that occurred when registering partition indexes for an existing table.
     * </p>
     * 
     * @param code
     *        The error code for an error that occurred when registering partition indexes for an existing table.
     * @see BackfillErrorCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code for an error that occurred when registering partition indexes for an existing table.
     * </p>
     * 
     * @return The error code for an error that occurred when registering partition indexes for an existing table.
     * @see BackfillErrorCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code for an error that occurred when registering partition indexes for an existing table.
     * </p>
     * 
     * @param code
     *        The error code for an error that occurred when registering partition indexes for an existing table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackfillErrorCode
     */

    public BackfillError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The error code for an error that occurred when registering partition indexes for an existing table.
     * </p>
     * 
     * @param code
     *        The error code for an error that occurred when registering partition indexes for an existing table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackfillErrorCode
     */

    public BackfillError withCode(BackfillErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A list of a limited number of partitions in the response.
     * </p>
     * 
     * @return A list of a limited number of partitions in the response.
     */

    public java.util.List<PartitionValueList> getPartitions() {
        return partitions;
    }

    /**
     * <p>
     * A list of a limited number of partitions in the response.
     * </p>
     * 
     * @param partitions
     *        A list of a limited number of partitions in the response.
     */

    public void setPartitions(java.util.Collection<PartitionValueList> partitions) {
        if (partitions == null) {
            this.partitions = null;
            return;
        }

        this.partitions = new java.util.ArrayList<PartitionValueList>(partitions);
    }

    /**
     * <p>
     * A list of a limited number of partitions in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitions(java.util.Collection)} or {@link #withPartitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param partitions
     *        A list of a limited number of partitions in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackfillError withPartitions(PartitionValueList... partitions) {
        if (this.partitions == null) {
            setPartitions(new java.util.ArrayList<PartitionValueList>(partitions.length));
        }
        for (PartitionValueList ele : partitions) {
            this.partitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of a limited number of partitions in the response.
     * </p>
     * 
     * @param partitions
     *        A list of a limited number of partitions in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackfillError withPartitions(java.util.Collection<PartitionValueList> partitions) {
        setPartitions(partitions);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getPartitions() != null)
            sb.append("Partitions: ").append(getPartitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackfillError == false)
            return false;
        BackfillError other = (BackfillError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getPartitions() == null ^ this.getPartitions() == null)
            return false;
        if (other.getPartitions() != null && other.getPartitions().equals(this.getPartitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getPartitions() == null) ? 0 : getPartitions().hashCode());
        return hashCode;
    }

    @Override
    public BackfillError clone() {
        try {
            return (BackfillError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.BackfillErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
