/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.artifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Presigned S3 url to access the report content.
     * </p>
     */
    private String documentPresignedUrl;

    /**
     * <p>
     * Presigned S3 url to access the report content.
     * </p>
     * 
     * @param documentPresignedUrl
     *        Presigned S3 url to access the report content.
     */

    public void setDocumentPresignedUrl(String documentPresignedUrl) {
        this.documentPresignedUrl = documentPresignedUrl;
    }

    /**
     * <p>
     * Presigned S3 url to access the report content.
     * </p>
     * 
     * @return Presigned S3 url to access the report content.
     */

    public String getDocumentPresignedUrl() {
        return this.documentPresignedUrl;
    }

    /**
     * <p>
     * Presigned S3 url to access the report content.
     * </p>
     * 
     * @param documentPresignedUrl
     *        Presigned S3 url to access the report content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportResult withDocumentPresignedUrl(String documentPresignedUrl) {
        setDocumentPresignedUrl(documentPresignedUrl);
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
        if (getDocumentPresignedUrl() != null)
            sb.append("DocumentPresignedUrl: ").append(getDocumentPresignedUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReportResult == false)
            return false;
        GetReportResult other = (GetReportResult) obj;
        if (other.getDocumentPresignedUrl() == null ^ this.getDocumentPresignedUrl() == null)
            return false;
        if (other.getDocumentPresignedUrl() != null && other.getDocumentPresignedUrl().equals(this.getDocumentPresignedUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentPresignedUrl() == null) ? 0 : getDocumentPresignedUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetReportResult clone() {
        try {
            return (GetReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
