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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/StartContentUpload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartContentUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of content to upload.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String knowledgeBaseId;

    /**
     * <p>
     * The type of content to upload.
     * </p>
     * 
     * @param contentType
     *        The type of content to upload.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of content to upload.
     * </p>
     * 
     * @return The type of content to upload.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of content to upload.
     * </p>
     * 
     * @param contentType
     *        The type of content to upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentUploadRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentUploadRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartContentUploadRequest == false)
            return false;
        StartContentUploadRequest other = (StartContentUploadRequest) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        return hashCode;
    }

    @Override
    public StartContentUploadRequest clone() {
        return (StartContentUploadRequest) super.clone();
    }

}
