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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchWrite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     * <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     */
    private java.util.List<BatchWriteOperation> operations;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     * <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     *        <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     * <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     *         <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     * <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     *        <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     * 
     * @return A list of operations that are part of the batch.
     */

    public java.util.List<BatchWriteOperation> getOperations() {
        return operations;
    }

    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     * 
     * @param operations
     *        A list of operations that are part of the batch.
     */

    public void setOperations(java.util.Collection<BatchWriteOperation> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<BatchWriteOperation>(operations);
    }

    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        A list of operations that are part of the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteRequest withOperations(BatchWriteOperation... operations) {
        if (this.operations == null) {
            setOperations(new java.util.ArrayList<BatchWriteOperation>(operations.length));
        }
        for (BatchWriteOperation ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     * 
     * @param operations
     *        A list of operations that are part of the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteRequest withOperations(java.util.Collection<BatchWriteOperation> operations) {
        setOperations(operations);
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getOperations() != null)
            sb.append("Operations: ").append(getOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchWriteRequest == false)
            return false;
        BatchWriteRequest other = (BatchWriteRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        return hashCode;
    }

    @Override
    public BatchWriteRequest clone() {
        return (BatchWriteRequest) super.clone();
    }

}
