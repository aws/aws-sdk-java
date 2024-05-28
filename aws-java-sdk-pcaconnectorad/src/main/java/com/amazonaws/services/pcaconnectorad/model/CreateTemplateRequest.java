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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Idempotency token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     */
    private String connectorArn;
    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     */
    private TemplateDefinition definition;
    /**
     * <p>
     * Name of the template. The template name must be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Metadata assigned to a template consisting of a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Idempotency token.
     * </p>
     * 
     * @param clientToken
     *        Idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Idempotency token.
     * </p>
     * 
     * @return Idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Idempotency token.
     * </p>
     * 
     * @param clientToken
     *        Idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *        >CreateConnector</a>.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *         >CreateConnector</a>.
     */

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *        >CreateConnector</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
        return this;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param definition
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     */

    public void setDefinition(TemplateDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @return Template configuration to define the information included in certificates. Define certificate validity
     *         and renewal periods, certificate request handling and enrollment options, key usage extensions,
     *         application policies, and cryptography settings.
     */

    public TemplateDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param definition
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withDefinition(TemplateDefinition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * Name of the template. The template name must be unique.
     * </p>
     * 
     * @param name
     *        Name of the template. The template name must be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the template. The template name must be unique.
     * </p>
     * 
     * @return Name of the template. The template name must be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the template. The template name must be unique.
     * </p>
     * 
     * @param name
     *        Name of the template. The template name must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Metadata assigned to a template consisting of a key-value pair.
     * </p>
     * 
     * @return Metadata assigned to a template consisting of a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata assigned to a template consisting of a key-value pair.
     * </p>
     * 
     * @param tags
     *        Metadata assigned to a template consisting of a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata assigned to a template consisting of a key-value pair.
     * </p>
     * 
     * @param tags
     *        Metadata assigned to a template consisting of a key-value pair.
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConnectorArn() != null)
            sb.append("ConnectorArn: ").append(getConnectorArn()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTemplateRequest clone() {
        return (CreateTemplateRequest) super.clone();
    }

}
