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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeFileSystemAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileSystemAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file system association to be described.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> fileSystemAssociationARNList;

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file system association to be described.
     * </p>
     * 
     * @return An array containing the Amazon Resource Name (ARN) of each file system association to be described.
     */

    public java.util.List<String> getFileSystemAssociationARNList() {
        if (fileSystemAssociationARNList == null) {
            fileSystemAssociationARNList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return fileSystemAssociationARNList;
    }

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file system association to be described.
     * </p>
     * 
     * @param fileSystemAssociationARNList
     *        An array containing the Amazon Resource Name (ARN) of each file system association to be described.
     */

    public void setFileSystemAssociationARNList(java.util.Collection<String> fileSystemAssociationARNList) {
        if (fileSystemAssociationARNList == null) {
            this.fileSystemAssociationARNList = null;
            return;
        }

        this.fileSystemAssociationARNList = new com.amazonaws.internal.SdkInternalList<String>(fileSystemAssociationARNList);
    }

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file system association to be described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystemAssociationARNList(java.util.Collection)} or
     * {@link #withFileSystemAssociationARNList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param fileSystemAssociationARNList
     *        An array containing the Amazon Resource Name (ARN) of each file system association to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAssociationsRequest withFileSystemAssociationARNList(String... fileSystemAssociationARNList) {
        if (this.fileSystemAssociationARNList == null) {
            setFileSystemAssociationARNList(new com.amazonaws.internal.SdkInternalList<String>(fileSystemAssociationARNList.length));
        }
        for (String ele : fileSystemAssociationARNList) {
            this.fileSystemAssociationARNList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file system association to be described.
     * </p>
     * 
     * @param fileSystemAssociationARNList
     *        An array containing the Amazon Resource Name (ARN) of each file system association to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAssociationsRequest withFileSystemAssociationARNList(java.util.Collection<String> fileSystemAssociationARNList) {
        setFileSystemAssociationARNList(fileSystemAssociationARNList);
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
        if (getFileSystemAssociationARNList() != null)
            sb.append("FileSystemAssociationARNList: ").append(getFileSystemAssociationARNList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFileSystemAssociationsRequest == false)
            return false;
        DescribeFileSystemAssociationsRequest other = (DescribeFileSystemAssociationsRequest) obj;
        if (other.getFileSystemAssociationARNList() == null ^ this.getFileSystemAssociationARNList() == null)
            return false;
        if (other.getFileSystemAssociationARNList() != null && other.getFileSystemAssociationARNList().equals(this.getFileSystemAssociationARNList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemAssociationARNList() == null) ? 0 : getFileSystemAssociationARNList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileSystemAssociationsRequest clone() {
        return (DescribeFileSystemAssociationsRequest) super.clone();
    }

}
