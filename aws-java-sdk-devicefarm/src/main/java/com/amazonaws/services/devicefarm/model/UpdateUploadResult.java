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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateUpload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUploadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A test spec uploaded to Device Farm.
     * </p>
     */
    private Upload upload;

    /**
     * <p>
     * A test spec uploaded to Device Farm.
     * </p>
     * 
     * @param upload
     *        A test spec uploaded to Device Farm.
     */

    public void setUpload(Upload upload) {
        this.upload = upload;
    }

    /**
     * <p>
     * A test spec uploaded to Device Farm.
     * </p>
     * 
     * @return A test spec uploaded to Device Farm.
     */

    public Upload getUpload() {
        return this.upload;
    }

    /**
     * <p>
     * A test spec uploaded to Device Farm.
     * </p>
     * 
     * @param upload
     *        A test spec uploaded to Device Farm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUploadResult withUpload(Upload upload) {
        setUpload(upload);
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
        if (getUpload() != null)
            sb.append("Upload: ").append(getUpload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUploadResult == false)
            return false;
        UpdateUploadResult other = (UpdateUploadResult) obj;
        if (other.getUpload() == null ^ this.getUpload() == null)
            return false;
        if (other.getUpload() != null && other.getUpload().equals(this.getUpload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpload() == null) ? 0 : getUpload().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUploadResult clone() {
        try {
            return (UpdateUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
