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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * DescribeNFSFileSharesInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeNFSFileShares"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNFSFileSharesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to be described.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> fileShareARNList;

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to be described.
     * </p>
     * 
     * @return An array containing the Amazon Resource Name (ARN) of each file share to be described.
     */

    public java.util.List<String> getFileShareARNList() {
        if (fileShareARNList == null) {
            fileShareARNList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return fileShareARNList;
    }

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to be described.
     * </p>
     * 
     * @param fileShareARNList
     *        An array containing the Amazon Resource Name (ARN) of each file share to be described.
     */

    public void setFileShareARNList(java.util.Collection<String> fileShareARNList) {
        if (fileShareARNList == null) {
            this.fileShareARNList = null;
            return;
        }

        this.fileShareARNList = new com.amazonaws.internal.SdkInternalList<String>(fileShareARNList);
    }

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to be described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileShareARNList(java.util.Collection)} or {@link #withFileShareARNList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param fileShareARNList
     *        An array containing the Amazon Resource Name (ARN) of each file share to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNFSFileSharesRequest withFileShareARNList(String... fileShareARNList) {
        if (this.fileShareARNList == null) {
            setFileShareARNList(new com.amazonaws.internal.SdkInternalList<String>(fileShareARNList.length));
        }
        for (String ele : fileShareARNList) {
            this.fileShareARNList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the Amazon Resource Name (ARN) of each file share to be described.
     * </p>
     * 
     * @param fileShareARNList
     *        An array containing the Amazon Resource Name (ARN) of each file share to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNFSFileSharesRequest withFileShareARNList(java.util.Collection<String> fileShareARNList) {
        setFileShareARNList(fileShareARNList);
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
        if (getFileShareARNList() != null)
            sb.append("FileShareARNList: ").append(getFileShareARNList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNFSFileSharesRequest == false)
            return false;
        DescribeNFSFileSharesRequest other = (DescribeNFSFileSharesRequest) obj;
        if (other.getFileShareARNList() == null ^ this.getFileShareARNList() == null)
            return false;
        if (other.getFileShareARNList() != null && other.getFileShareARNList().equals(this.getFileShareARNList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileShareARNList() == null) ? 0 : getFileShareARNList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNFSFileSharesRequest clone() {
        return (DescribeNFSFileSharesRequest) super.clone();
    }

}
