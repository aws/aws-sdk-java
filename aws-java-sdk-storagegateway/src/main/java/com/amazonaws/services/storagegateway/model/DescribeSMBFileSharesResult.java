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
 * DescribeSMBFileSharesOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSMBFileShares"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSMBFileSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SMBFileShareInfo> sMBFileShareInfoList;

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * 
     * @return An array containing a description for each requested file share.
     */

    public java.util.List<SMBFileShareInfo> getSMBFileShareInfoList() {
        if (sMBFileShareInfoList == null) {
            sMBFileShareInfoList = new com.amazonaws.internal.SdkInternalList<SMBFileShareInfo>();
        }
        return sMBFileShareInfoList;
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * 
     * @param sMBFileShareInfoList
     *        An array containing a description for each requested file share.
     */

    public void setSMBFileShareInfoList(java.util.Collection<SMBFileShareInfo> sMBFileShareInfoList) {
        if (sMBFileShareInfoList == null) {
            this.sMBFileShareInfoList = null;
            return;
        }

        this.sMBFileShareInfoList = new com.amazonaws.internal.SdkInternalList<SMBFileShareInfo>(sMBFileShareInfoList);
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSMBFileShareInfoList(java.util.Collection)} or {@link #withSMBFileShareInfoList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param sMBFileShareInfoList
     *        An array containing a description for each requested file share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSMBFileSharesResult withSMBFileShareInfoList(SMBFileShareInfo... sMBFileShareInfoList) {
        if (this.sMBFileShareInfoList == null) {
            setSMBFileShareInfoList(new com.amazonaws.internal.SdkInternalList<SMBFileShareInfo>(sMBFileShareInfoList.length));
        }
        for (SMBFileShareInfo ele : sMBFileShareInfoList) {
            this.sMBFileShareInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing a description for each requested file share.
     * </p>
     * 
     * @param sMBFileShareInfoList
     *        An array containing a description for each requested file share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSMBFileSharesResult withSMBFileShareInfoList(java.util.Collection<SMBFileShareInfo> sMBFileShareInfoList) {
        setSMBFileShareInfoList(sMBFileShareInfoList);
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
        if (getSMBFileShareInfoList() != null)
            sb.append("SMBFileShareInfoList: ").append(getSMBFileShareInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSMBFileSharesResult == false)
            return false;
        DescribeSMBFileSharesResult other = (DescribeSMBFileSharesResult) obj;
        if (other.getSMBFileShareInfoList() == null ^ this.getSMBFileShareInfoList() == null)
            return false;
        if (other.getSMBFileShareInfoList() != null && other.getSMBFileShareInfoList().equals(this.getSMBFileShareInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSMBFileShareInfoList() == null) ? 0 : getSMBFileShareInfoList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSMBFileSharesResult clone() {
        try {
            return (DescribeSMBFileSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
