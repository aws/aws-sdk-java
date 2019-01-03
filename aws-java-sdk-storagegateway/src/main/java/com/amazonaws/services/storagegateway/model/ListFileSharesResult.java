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
 * ListFileShareOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListFileShares" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFileSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the request includes <code>Marker</code>, the response returns that value in this field.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * If a value is present, there are more file shares to return. In a subsequent request, use <code>NextMarker</code>
     * as the value for <code>Marker</code> to retrieve the next set of file shares.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FileShareInfo> fileShareInfoList;

    /**
     * <p>
     * If the request includes <code>Marker</code>, the response returns that value in this field.
     * </p>
     * 
     * @param marker
     *        If the request includes <code>Marker</code>, the response returns that value in this field.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If the request includes <code>Marker</code>, the response returns that value in this field.
     * </p>
     * 
     * @return If the request includes <code>Marker</code>, the response returns that value in this field.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * If the request includes <code>Marker</code>, the response returns that value in this field.
     * </p>
     * 
     * @param marker
     *        If the request includes <code>Marker</code>, the response returns that value in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileSharesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * If a value is present, there are more file shares to return. In a subsequent request, use <code>NextMarker</code>
     * as the value for <code>Marker</code> to retrieve the next set of file shares.
     * </p>
     * 
     * @param nextMarker
     *        If a value is present, there are more file shares to return. In a subsequent request, use
     *        <code>NextMarker</code> as the value for <code>Marker</code> to retrieve the next set of file shares.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more file shares to return. In a subsequent request, use <code>NextMarker</code>
     * as the value for <code>Marker</code> to retrieve the next set of file shares.
     * </p>
     * 
     * @return If a value is present, there are more file shares to return. In a subsequent request, use
     *         <code>NextMarker</code> as the value for <code>Marker</code> to retrieve the next set of file shares.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more file shares to return. In a subsequent request, use <code>NextMarker</code>
     * as the value for <code>Marker</code> to retrieve the next set of file shares.
     * </p>
     * 
     * @param nextMarker
     *        If a value is present, there are more file shares to return. In a subsequent request, use
     *        <code>NextMarker</code> as the value for <code>Marker</code> to retrieve the next set of file shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileSharesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     * 
     * @return An array of information about the file gateway's file shares.
     */

    public java.util.List<FileShareInfo> getFileShareInfoList() {
        if (fileShareInfoList == null) {
            fileShareInfoList = new com.amazonaws.internal.SdkInternalList<FileShareInfo>();
        }
        return fileShareInfoList;
    }

    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     * 
     * @param fileShareInfoList
     *        An array of information about the file gateway's file shares.
     */

    public void setFileShareInfoList(java.util.Collection<FileShareInfo> fileShareInfoList) {
        if (fileShareInfoList == null) {
            this.fileShareInfoList = null;
            return;
        }

        this.fileShareInfoList = new com.amazonaws.internal.SdkInternalList<FileShareInfo>(fileShareInfoList);
    }

    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileShareInfoList(java.util.Collection)} or {@link #withFileShareInfoList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param fileShareInfoList
     *        An array of information about the file gateway's file shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileSharesResult withFileShareInfoList(FileShareInfo... fileShareInfoList) {
        if (this.fileShareInfoList == null) {
            setFileShareInfoList(new com.amazonaws.internal.SdkInternalList<FileShareInfo>(fileShareInfoList.length));
        }
        for (FileShareInfo ele : fileShareInfoList) {
            this.fileShareInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of information about the file gateway's file shares.
     * </p>
     * 
     * @param fileShareInfoList
     *        An array of information about the file gateway's file shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileSharesResult withFileShareInfoList(java.util.Collection<FileShareInfo> fileShareInfoList) {
        setFileShareInfoList(fileShareInfoList);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getFileShareInfoList() != null)
            sb.append("FileShareInfoList: ").append(getFileShareInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFileSharesResult == false)
            return false;
        ListFileSharesResult other = (ListFileSharesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getFileShareInfoList() == null ^ this.getFileShareInfoList() == null)
            return false;
        if (other.getFileShareInfoList() != null && other.getFileShareInfoList().equals(this.getFileShareInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getFileShareInfoList() == null) ? 0 : getFileShareInfoList().hashCode());
        return hashCode;
    }

    @Override
    public ListFileSharesResult clone() {
        try {
            return (ListFileSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
