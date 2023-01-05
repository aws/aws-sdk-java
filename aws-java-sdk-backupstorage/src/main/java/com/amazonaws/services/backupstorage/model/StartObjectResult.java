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
package com.amazonaws.services.backupstorage.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/StartObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartObjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Upload Id for a given upload. */
    private String uploadId;

    /**
     * Upload Id for a given upload.
     * 
     * @param uploadId
     *        Upload Id for a given upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Upload Id for a given upload.
     * 
     * @return Upload Id for a given upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * Upload Id for a given upload.
     * 
     * @param uploadId
     *        Upload Id for a given upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartObjectResult withUploadId(String uploadId) {
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

        if (obj instanceof StartObjectResult == false)
            return false;
        StartObjectResult other = (StartObjectResult) obj;
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
    public StartObjectResult clone() {
        try {
            return (StartObjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
