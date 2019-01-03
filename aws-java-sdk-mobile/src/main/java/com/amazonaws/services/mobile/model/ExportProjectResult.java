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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure used for requests to export project configuration details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * URL which can be used to download the exported project configuation file(s).
     * </p>
     */
    private String downloadUrl;
    /**
     * <p>
     * URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the same
     * configuration as the specified project. This URL pertains to a snapshot in time of the project configuration that
     * is created when this API is called. If you want to share additional changes to your project configuration, then
     * you will need to create and share a new snapshot by calling this method again.
     * </p>
     */
    private String shareUrl;
    /**
     * <p>
     * Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is included in
     * the share URL.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * URL which can be used to download the exported project configuation file(s).
     * </p>
     * 
     * @param downloadUrl
     *        URL which can be used to download the exported project configuation file(s).
     */

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * <p>
     * URL which can be used to download the exported project configuation file(s).
     * </p>
     * 
     * @return URL which can be used to download the exported project configuation file(s).
     */

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * <p>
     * URL which can be used to download the exported project configuation file(s).
     * </p>
     * 
     * @param downloadUrl
     *        URL which can be used to download the exported project configuation file(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportProjectResult withDownloadUrl(String downloadUrl) {
        setDownloadUrl(downloadUrl);
        return this;
    }

    /**
     * <p>
     * URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the same
     * configuration as the specified project. This URL pertains to a snapshot in time of the project configuration that
     * is created when this API is called. If you want to share additional changes to your project configuration, then
     * you will need to create and share a new snapshot by calling this method again.
     * </p>
     * 
     * @param shareUrl
     *        URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the
     *        same configuration as the specified project. This URL pertains to a snapshot in time of the project
     *        configuration that is created when this API is called. If you want to share additional changes to your
     *        project configuration, then you will need to create and share a new snapshot by calling this method again.
     */

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     * <p>
     * URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the same
     * configuration as the specified project. This URL pertains to a snapshot in time of the project configuration that
     * is created when this API is called. If you want to share additional changes to your project configuration, then
     * you will need to create and share a new snapshot by calling this method again.
     * </p>
     * 
     * @return URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the
     *         same configuration as the specified project. This URL pertains to a snapshot in time of the project
     *         configuration that is created when this API is called. If you want to share additional changes to your
     *         project configuration, then you will need to create and share a new snapshot by calling this method
     *         again.
     */

    public String getShareUrl() {
        return this.shareUrl;
    }

    /**
     * <p>
     * URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the same
     * configuration as the specified project. This URL pertains to a snapshot in time of the project configuration that
     * is created when this API is called. If you want to share additional changes to your project configuration, then
     * you will need to create and share a new snapshot by calling this method again.
     * </p>
     * 
     * @param shareUrl
     *        URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the
     *        same configuration as the specified project. This URL pertains to a snapshot in time of the project
     *        configuration that is created when this API is called. If you want to share additional changes to your
     *        project configuration, then you will need to create and share a new snapshot by calling this method again.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportProjectResult withShareUrl(String shareUrl) {
        setShareUrl(shareUrl);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is included in
     * the share URL.
     * </p>
     * 
     * @param snapshotId
     *        Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is
     *        included in the share URL.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is included in
     * the share URL.
     * </p>
     * 
     * @return Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is
     *         included in the share URL.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is included in
     * the share URL.
     * </p>
     * 
     * @param snapshotId
     *        Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is
     *        included in the share URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportProjectResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
        if (getDownloadUrl() != null)
            sb.append("DownloadUrl: ").append(getDownloadUrl()).append(",");
        if (getShareUrl() != null)
            sb.append("ShareUrl: ").append(getShareUrl()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportProjectResult == false)
            return false;
        ExportProjectResult other = (ExportProjectResult) obj;
        if (other.getDownloadUrl() == null ^ this.getDownloadUrl() == null)
            return false;
        if (other.getDownloadUrl() != null && other.getDownloadUrl().equals(this.getDownloadUrl()) == false)
            return false;
        if (other.getShareUrl() == null ^ this.getShareUrl() == null)
            return false;
        if (other.getShareUrl() != null && other.getShareUrl().equals(this.getShareUrl()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        hashCode = prime * hashCode + ((getShareUrl() == null) ? 0 : getShareUrl().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public ExportProjectResult clone() {
        try {
            return (ExportProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
