/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateUploadUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUploadUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier for a unique import job. Use it when you call the operation.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * A pre-signed S3 write URL. Upload the zip archive file that contains the definition of your bot or bot locale.
     * </p>
     */
    private String uploadUrl;

    /**
     * <p>
     * An identifier for a unique import job. Use it when you call the operation.
     * </p>
     * 
     * @param importId
     *        An identifier for a unique import job. Use it when you call the operation.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * An identifier for a unique import job. Use it when you call the operation.
     * </p>
     * 
     * @return An identifier for a unique import job. Use it when you call the operation.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * An identifier for a unique import job. Use it when you call the operation.
     * </p>
     * 
     * @param importId
     *        An identifier for a unique import job. Use it when you call the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadUrlResult withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * A pre-signed S3 write URL. Upload the zip archive file that contains the definition of your bot or bot locale.
     * </p>
     * 
     * @param uploadUrl
     *        A pre-signed S3 write URL. Upload the zip archive file that contains the definition of your bot or bot
     *        locale.
     */

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    /**
     * <p>
     * A pre-signed S3 write URL. Upload the zip archive file that contains the definition of your bot or bot locale.
     * </p>
     * 
     * @return A pre-signed S3 write URL. Upload the zip archive file that contains the definition of your bot or bot
     *         locale.
     */

    public String getUploadUrl() {
        return this.uploadUrl;
    }

    /**
     * <p>
     * A pre-signed S3 write URL. Upload the zip archive file that contains the definition of your bot or bot locale.
     * </p>
     * 
     * @param uploadUrl
     *        A pre-signed S3 write URL. Upload the zip archive file that contains the definition of your bot or bot
     *        locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadUrlResult withUploadUrl(String uploadUrl) {
        setUploadUrl(uploadUrl);
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
        if (getImportId() != null)
            sb.append("ImportId: ").append(getImportId()).append(",");
        if (getUploadUrl() != null)
            sb.append("UploadUrl: ").append(getUploadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUploadUrlResult == false)
            return false;
        CreateUploadUrlResult other = (CreateUploadUrlResult) obj;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getUploadUrl() == null ^ this.getUploadUrl() == null)
            return false;
        if (other.getUploadUrl() != null && other.getUploadUrl().equals(this.getUploadUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode + ((getUploadUrl() == null) ? 0 : getUploadUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreateUploadUrlResult clone() {
        try {
            return (CreateUploadUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
