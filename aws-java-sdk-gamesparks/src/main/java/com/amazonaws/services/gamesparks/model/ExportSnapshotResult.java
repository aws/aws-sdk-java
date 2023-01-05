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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ExportSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The presigned URL for the snapshot data.
     * </p>
     * <p>
     * This URL will be available for 10 minutes, and can be used to download the snapshot content. If the URL expires,
     * a new one can be requested using the same operation.
     * </p>
     */
    private String s3Url;

    /**
     * <p>
     * The presigned URL for the snapshot data.
     * </p>
     * <p>
     * This URL will be available for 10 minutes, and can be used to download the snapshot content. If the URL expires,
     * a new one can be requested using the same operation.
     * </p>
     * 
     * @param s3Url
     *        The presigned URL for the snapshot data.</p>
     *        <p>
     *        This URL will be available for 10 minutes, and can be used to download the snapshot content. If the URL
     *        expires, a new one can be requested using the same operation.
     */

    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * <p>
     * The presigned URL for the snapshot data.
     * </p>
     * <p>
     * This URL will be available for 10 minutes, and can be used to download the snapshot content. If the URL expires,
     * a new one can be requested using the same operation.
     * </p>
     * 
     * @return The presigned URL for the snapshot data.</p>
     *         <p>
     *         This URL will be available for 10 minutes, and can be used to download the snapshot content. If the URL
     *         expires, a new one can be requested using the same operation.
     */

    public String getS3Url() {
        return this.s3Url;
    }

    /**
     * <p>
     * The presigned URL for the snapshot data.
     * </p>
     * <p>
     * This URL will be available for 10 minutes, and can be used to download the snapshot content. If the URL expires,
     * a new one can be requested using the same operation.
     * </p>
     * 
     * @param s3Url
     *        The presigned URL for the snapshot data.</p>
     *        <p>
     *        This URL will be available for 10 minutes, and can be used to download the snapshot content. If the URL
     *        expires, a new one can be requested using the same operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotResult withS3Url(String s3Url) {
        setS3Url(s3Url);
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
        if (getS3Url() != null)
            sb.append("S3Url: ").append(getS3Url());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSnapshotResult == false)
            return false;
        ExportSnapshotResult other = (ExportSnapshotResult) obj;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        return hashCode;
    }

    @Override
    public ExportSnapshotResult clone() {
        try {
            return (ExportSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
