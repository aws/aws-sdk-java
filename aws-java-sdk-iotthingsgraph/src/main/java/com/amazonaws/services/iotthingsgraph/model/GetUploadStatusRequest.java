/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetUploadStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUploadStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the upload. This value is returned by the <code>UploadEntityDefinitions</code> action.
     * </p>
     */
    private String uploadId;

    /**
     * <p>
     * The ID of the upload. This value is returned by the <code>UploadEntityDefinitions</code> action.
     * </p>
     * 
     * @param uploadId
     *        The ID of the upload. This value is returned by the <code>UploadEntityDefinitions</code> action.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The ID of the upload. This value is returned by the <code>UploadEntityDefinitions</code> action.
     * </p>
     * 
     * @return The ID of the upload. This value is returned by the <code>UploadEntityDefinitions</code> action.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The ID of the upload. This value is returned by the <code>UploadEntityDefinitions</code> action.
     * </p>
     * 
     * @param uploadId
     *        The ID of the upload. This value is returned by the <code>UploadEntityDefinitions</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUploadStatusRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
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
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUploadStatusRequest == false)
            return false;
        GetUploadStatusRequest other = (GetUploadStatusRequest) obj;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        return hashCode;
    }

    @Override
    public GetUploadStatusRequest clone() {
        return (GetUploadStatusRequest) super.clone();
    }

}
