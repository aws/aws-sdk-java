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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeStorageVirtualMachines" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorageVirtualMachinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returned after a successful <code>DescribeStorageVirtualMachines</code> operation, describing each SVM.
     * </p>
     */
    private java.util.List<StorageVirtualMachine> storageVirtualMachines;

    private String nextToken;

    /**
     * <p>
     * Returned after a successful <code>DescribeStorageVirtualMachines</code> operation, describing each SVM.
     * </p>
     * 
     * @return Returned after a successful <code>DescribeStorageVirtualMachines</code> operation, describing each SVM.
     */

    public java.util.List<StorageVirtualMachine> getStorageVirtualMachines() {
        return storageVirtualMachines;
    }

    /**
     * <p>
     * Returned after a successful <code>DescribeStorageVirtualMachines</code> operation, describing each SVM.
     * </p>
     * 
     * @param storageVirtualMachines
     *        Returned after a successful <code>DescribeStorageVirtualMachines</code> operation, describing each SVM.
     */

    public void setStorageVirtualMachines(java.util.Collection<StorageVirtualMachine> storageVirtualMachines) {
        if (storageVirtualMachines == null) {
            this.storageVirtualMachines = null;
            return;
        }

        this.storageVirtualMachines = new java.util.ArrayList<StorageVirtualMachine>(storageVirtualMachines);
    }

    /**
     * <p>
     * Returned after a successful <code>DescribeStorageVirtualMachines</code> operation, describing each SVM.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageVirtualMachines(java.util.Collection)} or
     * {@link #withStorageVirtualMachines(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param storageVirtualMachines
     *        Returned after a successful <code>DescribeStorageVirtualMachines</code> operation, describing each SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageVirtualMachinesResult withStorageVirtualMachines(StorageVirtualMachine... storageVirtualMachines) {
        if (this.storageVirtualMachines == null) {
            setStorageVirtualMachines(new java.util.ArrayList<StorageVirtualMachine>(storageVirtualMachines.length));
        }
        for (StorageVirtualMachine ele : storageVirtualMachines) {
            this.storageVirtualMachines.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returned after a successful <code>DescribeStorageVirtualMachines</code> operation, describing each SVM.
     * </p>
     * 
     * @param storageVirtualMachines
     *        Returned after a successful <code>DescribeStorageVirtualMachines</code> operation, describing each SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageVirtualMachinesResult withStorageVirtualMachines(java.util.Collection<StorageVirtualMachine> storageVirtualMachines) {
        setStorageVirtualMachines(storageVirtualMachines);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageVirtualMachinesResult withNextToken(String nextToken) {
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
        if (getStorageVirtualMachines() != null)
            sb.append("StorageVirtualMachines: ").append(getStorageVirtualMachines()).append(",");
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

        if (obj instanceof DescribeStorageVirtualMachinesResult == false)
            return false;
        DescribeStorageVirtualMachinesResult other = (DescribeStorageVirtualMachinesResult) obj;
        if (other.getStorageVirtualMachines() == null ^ this.getStorageVirtualMachines() == null)
            return false;
        if (other.getStorageVirtualMachines() != null && other.getStorageVirtualMachines().equals(this.getStorageVirtualMachines()) == false)
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

        hashCode = prime * hashCode + ((getStorageVirtualMachines() == null) ? 0 : getStorageVirtualMachines().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorageVirtualMachinesResult clone() {
        try {
            return (DescribeStorageVirtualMachinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
