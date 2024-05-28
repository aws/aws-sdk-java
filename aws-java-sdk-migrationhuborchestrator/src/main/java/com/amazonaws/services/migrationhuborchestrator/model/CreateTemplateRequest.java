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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the migration workflow template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * A description of the migration workflow template.
     * </p>
     */
    private String templateDescription;
    /**
     * <p>
     * The source of the migration workflow template.
     * </p>
     */
    private TemplateSource templateSource;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://smithy.io/2.0/spec/behavior-traits.html#idempotencytoken-trait">Idempotency</a>
     * in the Smithy documentation.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags to add to the migration workflow template.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the migration workflow template.
     * </p>
     * 
     * @param templateName
     *        The name of the migration workflow template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the migration workflow template.
     * </p>
     * 
     * @return The name of the migration workflow template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the migration workflow template.
     * </p>
     * 
     * @param templateName
     *        The name of the migration workflow template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * A description of the migration workflow template.
     * </p>
     * 
     * @param templateDescription
     *        A description of the migration workflow template.
     */

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * A description of the migration workflow template.
     * </p>
     * 
     * @return A description of the migration workflow template.
     */

    public String getTemplateDescription() {
        return this.templateDescription;
    }

    /**
     * <p>
     * A description of the migration workflow template.
     * </p>
     * 
     * @param templateDescription
     *        A description of the migration workflow template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withTemplateDescription(String templateDescription) {
        setTemplateDescription(templateDescription);
        return this;
    }

    /**
     * <p>
     * The source of the migration workflow template.
     * </p>
     * 
     * @param templateSource
     *        The source of the migration workflow template.
     */

    public void setTemplateSource(TemplateSource templateSource) {
        this.templateSource = templateSource;
    }

    /**
     * <p>
     * The source of the migration workflow template.
     * </p>
     * 
     * @return The source of the migration workflow template.
     */

    public TemplateSource getTemplateSource() {
        return this.templateSource;
    }

    /**
     * <p>
     * The source of the migration workflow template.
     * </p>
     * 
     * @param templateSource
     *        The source of the migration workflow template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withTemplateSource(TemplateSource templateSource) {
        setTemplateSource(templateSource);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://smithy.io/2.0/spec/behavior-traits.html#idempotencytoken-trait">Idempotency</a>
     * in the Smithy documentation.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://smithy.io/2.0/spec/behavior-traits.html#idempotencytoken-trait">Idempotency</a> in the
     *        Smithy documentation.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://smithy.io/2.0/spec/behavior-traits.html#idempotencytoken-trait">Idempotency</a>
     * in the Smithy documentation.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://smithy.io/2.0/spec/behavior-traits.html#idempotencytoken-trait">Idempotency</a> in the
     *         Smithy documentation.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://smithy.io/2.0/spec/behavior-traits.html#idempotencytoken-trait">Idempotency</a>
     * in the Smithy documentation.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://smithy.io/2.0/spec/behavior-traits.html#idempotencytoken-trait">Idempotency</a> in the
     *        Smithy documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags to add to the migration workflow template.
     * </p>
     * 
     * @return The tags to add to the migration workflow template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the migration workflow template.
     * </p>
     * 
     * @param tags
     *        The tags to add to the migration workflow template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to add to the migration workflow template.
     * </p>
     * 
     * @param tags
     *        The tags to add to the migration workflow template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest clearTagsEntries() {
        this.tags = null;
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: ").append(getTemplateDescription()).append(",");
        if (getTemplateSource() != null)
            sb.append("TemplateSource: ").append(getTemplateSource()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTemplateRequest == false)
            return false;
        CreateTemplateRequest other = (CreateTemplateRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        if (other.getTemplateSource() == null ^ this.getTemplateSource() == null)
            return false;
        if (other.getTemplateSource() != null && other.getTemplateSource().equals(this.getTemplateSource()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode + ((getTemplateSource() == null) ? 0 : getTemplateSource().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTemplateRequest clone() {
        return (CreateTemplateRequest) super.clone();
    }

}
