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

/**
 * <p>
 * DescribeNFSFileSharesOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeNFSFileShares"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNFSFileSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NFSFileShareInfo> nFSFileShareInfoList;

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * 
     * @return An array containing a description for each requested file share.
     */

    public java.util.List<NFSFileShareInfo> getNFSFileShareInfoList() {
        if (nFSFileShareInfoList == null) {
            nFSFileShareInfoList = new com.amazonaws.internal.SdkInternalList<NFSFileShareInfo>();
        }
        return nFSFileShareInfoList;
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * 
     * @param nFSFileShareInfoList
     *        An array containing a description for each requested file share.
     */

    public void setNFSFileShareInfoList(java.util.Collection<NFSFileShareInfo> nFSFileShareInfoList) {
        if (nFSFileShareInfoList == null) {
            this.nFSFileShareInfoList = null;
            return;
        }

        this.nFSFileShareInfoList = new com.amazonaws.internal.SdkInternalList<NFSFileShareInfo>(nFSFileShareInfoList);
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNFSFileShareInfoList(java.util.Collection)} or {@link #withNFSFileShareInfoList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param nFSFileShareInfoList
     *        An array containing a description for each requested file share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNFSFileSharesResult withNFSFileShareInfoList(NFSFileShareInfo... nFSFileShareInfoList) {
        if (this.nFSFileShareInfoList == null) {
            setNFSFileShareInfoList(new com.amazonaws.internal.SdkInternalList<NFSFileShareInfo>(nFSFileShareInfoList.length));
        }
        for (NFSFileShareInfo ele : nFSFileShareInfoList) {
            this.nFSFileShareInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * 
     * @param nFSFileShareInfoList
     *        An array containing a description for each requested file share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNFSFileSharesResult withNFSFileShareInfoList(java.util.Collection<NFSFileShareInfo> nFSFileShareInfoList) {
        setNFSFileShareInfoList(nFSFileShareInfoList);
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
        if (getNFSFileShareInfoList() != null)
            sb.append("NFSFileShareInfoList: ").append(getNFSFileShareInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNFSFileSharesResult == false)
            return false;
        DescribeNFSFileSharesResult other = (DescribeNFSFileSharesResult) obj;
        if (other.getNFSFileShareInfoList() == null ^ this.getNFSFileShareInfoList() == null)
            return false;
        if (other.getNFSFileShareInfoList() != null && other.getNFSFileShareInfoList().equals(this.getNFSFileShareInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNFSFileShareInfoList() == null) ? 0 : getNFSFileShareInfoList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNFSFileSharesResult clone() {
        try {
            return (DescribeNFSFileSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
