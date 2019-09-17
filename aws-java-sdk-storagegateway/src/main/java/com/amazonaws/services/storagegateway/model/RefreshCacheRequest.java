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
 * RefreshCacheInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RefreshCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshCacheRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share you want to refresh.
     * </p>
     */
    private String fileShareARN;
    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache. The default is [<code>"/"</code>]. The
     * default refreshes objects and folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is set to
     * "true", the entire S3 bucket that the file share has access to is refreshed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> folderList;
    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that
     * were in the cache the last time the gateway listed the folder's contents. If this value set to "true", each
     * folder that is listed in <code>FolderList</code> is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in folders listed directly under
     * <code>FolderList</code> are found and used for the update. The default is "true".
     * </p>
     */
    private Boolean recursive;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share you want to refresh.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the file share you want to refresh.
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share you want to refresh.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file share you want to refresh.
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share you want to refresh.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the file share you want to refresh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshCacheRequest withFileShareARN(String fileShareARN) {
        setFileShareARN(fileShareARN);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache. The default is [<code>"/"</code>]. The
     * default refreshes objects and folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is set to
     * "true", the entire S3 bucket that the file share has access to is refreshed.
     * </p>
     * 
     * @return A comma-separated list of the paths of folders to refresh in the cache. The default is [<code>"/"</code>
     *         ]. The default refreshes objects and folders at the root of the Amazon S3 bucket. If
     *         <code>Recursive</code> is set to "true", the entire S3 bucket that the file share has access to is
     *         refreshed.
     */

    public java.util.List<String> getFolderList() {
        if (folderList == null) {
            folderList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return folderList;
    }

    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache. The default is [<code>"/"</code>]. The
     * default refreshes objects and folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is set to
     * "true", the entire S3 bucket that the file share has access to is refreshed.
     * </p>
     * 
     * @param folderList
     *        A comma-separated list of the paths of folders to refresh in the cache. The default is [<code>"/"</code>].
     *        The default refreshes objects and folders at the root of the Amazon S3 bucket. If <code>Recursive</code>
     *        is set to "true", the entire S3 bucket that the file share has access to is refreshed.
     */

    public void setFolderList(java.util.Collection<String> folderList) {
        if (folderList == null) {
            this.folderList = null;
            return;
        }

        this.folderList = new com.amazonaws.internal.SdkInternalList<String>(folderList);
    }

    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache. The default is [<code>"/"</code>]. The
     * default refreshes objects and folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is set to
     * "true", the entire S3 bucket that the file share has access to is refreshed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFolderList(java.util.Collection)} or {@link #withFolderList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param folderList
     *        A comma-separated list of the paths of folders to refresh in the cache. The default is [<code>"/"</code>].
     *        The default refreshes objects and folders at the root of the Amazon S3 bucket. If <code>Recursive</code>
     *        is set to "true", the entire S3 bucket that the file share has access to is refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshCacheRequest withFolderList(String... folderList) {
        if (this.folderList == null) {
            setFolderList(new com.amazonaws.internal.SdkInternalList<String>(folderList.length));
        }
        for (String ele : folderList) {
            this.folderList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache. The default is [<code>"/"</code>]. The
     * default refreshes objects and folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is set to
     * "true", the entire S3 bucket that the file share has access to is refreshed.
     * </p>
     * 
     * @param folderList
     *        A comma-separated list of the paths of folders to refresh in the cache. The default is [<code>"/"</code>].
     *        The default refreshes objects and folders at the root of the Amazon S3 bucket. If <code>Recursive</code>
     *        is set to "true", the entire S3 bucket that the file share has access to is refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshCacheRequest withFolderList(java.util.Collection<String> folderList) {
        setFolderList(folderList);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that
     * were in the cache the last time the gateway listed the folder's contents. If this value set to "true", each
     * folder that is listed in <code>FolderList</code> is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in folders listed directly under
     * <code>FolderList</code> are found and used for the update. The default is "true".
     * </p>
     * 
     * @param recursive
     *        A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders
     *        that were in the cache the last time the gateway listed the folder's contents. If this value set to
     *        "true", each folder that is listed in <code>FolderList</code> is recursively updated. Otherwise,
     *        subfolders listed in <code>FolderList</code> are not refreshed. Only objects that are in folders listed
     *        directly under <code>FolderList</code> are found and used for the update. The default is "true".
     */

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that
     * were in the cache the last time the gateway listed the folder's contents. If this value set to "true", each
     * folder that is listed in <code>FolderList</code> is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in folders listed directly under
     * <code>FolderList</code> are found and used for the update. The default is "true".
     * </p>
     * 
     * @return A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders
     *         that were in the cache the last time the gateway listed the folder's contents. If this value set to
     *         "true", each folder that is listed in <code>FolderList</code> is recursively updated. Otherwise,
     *         subfolders listed in <code>FolderList</code> are not refreshed. Only objects that are in folders listed
     *         directly under <code>FolderList</code> are found and used for the update. The default is "true".
     */

    public Boolean getRecursive() {
        return this.recursive;
    }

    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that
     * were in the cache the last time the gateway listed the folder's contents. If this value set to "true", each
     * folder that is listed in <code>FolderList</code> is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in folders listed directly under
     * <code>FolderList</code> are found and used for the update. The default is "true".
     * </p>
     * 
     * @param recursive
     *        A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders
     *        that were in the cache the last time the gateway listed the folder's contents. If this value set to
     *        "true", each folder that is listed in <code>FolderList</code> is recursively updated. Otherwise,
     *        subfolders listed in <code>FolderList</code> are not refreshed. Only objects that are in folders listed
     *        directly under <code>FolderList</code> are found and used for the update. The default is "true".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshCacheRequest withRecursive(Boolean recursive) {
        setRecursive(recursive);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that
     * were in the cache the last time the gateway listed the folder's contents. If this value set to "true", each
     * folder that is listed in <code>FolderList</code> is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in folders listed directly under
     * <code>FolderList</code> are found and used for the update. The default is "true".
     * </p>
     * 
     * @return A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders
     *         that were in the cache the last time the gateway listed the folder's contents. If this value set to
     *         "true", each folder that is listed in <code>FolderList</code> is recursively updated. Otherwise,
     *         subfolders listed in <code>FolderList</code> are not refreshed. Only objects that are in folders listed
     *         directly under <code>FolderList</code> are found and used for the update. The default is "true".
     */

    public Boolean isRecursive() {
        return this.recursive;
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getFolderList() != null)
            sb.append("FolderList: ").append(getFolderList()).append(",");
        if (getRecursive() != null)
            sb.append("Recursive: ").append(getRecursive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshCacheRequest == false)
            return false;
        RefreshCacheRequest other = (RefreshCacheRequest) obj;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getFolderList() == null ^ this.getFolderList() == null)
            return false;
        if (other.getFolderList() != null && other.getFolderList().equals(this.getFolderList()) == false)
            return false;
        if (other.getRecursive() == null ^ this.getRecursive() == null)
            return false;
        if (other.getRecursive() != null && other.getRecursive().equals(this.getRecursive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getFolderList() == null) ? 0 : getFolderList().hashCode());
        hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        return hashCode;
    }

    @Override
    public RefreshCacheRequest clone() {
        return (RefreshCacheRequest) super.clone();
    }

}
