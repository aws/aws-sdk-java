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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateKnowledgeBaseTemplateUri"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKnowledgeBaseTemplateUriRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The template URI to update.
     * </p>
     */
    private String templateUri;

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

    public UpdateKnowledgeBaseTemplateUriRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The template URI to update.
     * </p>
     * 
     * @param templateUri
     *        The template URI to update.
     */

    public void setTemplateUri(String templateUri) {
        this.templateUri = templateUri;
    }

    /**
     * <p>
     * The template URI to update.
     * </p>
     * 
     * @return The template URI to update.
     */

    public String getTemplateUri() {
        return this.templateUri;
    }

    /**
     * <p>
     * The template URI to update.
     * </p>
     * 
     * @param templateUri
     *        The template URI to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKnowledgeBaseTemplateUriRequest withTemplateUri(String templateUri) {
        setTemplateUri(templateUri);
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
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getTemplateUri() != null)
            sb.append("TemplateUri: ").append(getTemplateUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKnowledgeBaseTemplateUriRequest == false)
            return false;
        UpdateKnowledgeBaseTemplateUriRequest other = (UpdateKnowledgeBaseTemplateUriRequest) obj;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getTemplateUri() == null ^ this.getTemplateUri() == null)
            return false;
        if (other.getTemplateUri() != null && other.getTemplateUri().equals(this.getTemplateUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getTemplateUri() == null) ? 0 : getTemplateUri().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKnowledgeBaseTemplateUriRequest clone() {
        return (UpdateKnowledgeBaseTemplateUriRequest) super.clone();
    }

}
