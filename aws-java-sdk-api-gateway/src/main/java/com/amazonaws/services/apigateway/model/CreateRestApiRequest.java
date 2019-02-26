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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The POST Request to add a new <a>RestApi</a> resource to your collection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRestApiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The name of the <a>RestApi</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the <a>RestApi</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A version identifier for the API.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The ID of the <a>RestApi</a> that you want to clone from.
     * </p>
     */
    private String cloneFrom;
    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By default, the <a>RestApi</a> supports only
     * UTF-8-encoded text payloads.
     * </p>
     */
    private java.util.List<String> binaryMediaTypes;
    /**
     * <p>
     * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes,
     * inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero
     * allows compression for any payload size.
     * </p>
     */
    private Integer minimumCompressionSize;
    /**
     * <p>
     * The source of the API key for metering requests according to a usage plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom
     * authorizer.</li>
     * </ul>
     * </p>
     */
    private String apiKeySource;
    /**
     * <p>
     * The endpoint configuration of this <a>RestApi</a> showing the endpoint types of the API.
     * </p>
     */
    private EndpointConfiguration endpointConfiguration;
    /**
     * A stringified JSON policy document that applies to this RestApi regardless of the caller and <a>Method</a>
     * configuration.
     */
    private String policy;

    /**
     * <p>
     * [Required] The name of the <a>RestApi</a>.
     * </p>
     * 
     * @param name
     *        [Required] The name of the <a>RestApi</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name of the <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The name of the <a>RestApi</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * [Required] The name of the <a>RestApi</a>.
     * </p>
     * 
     * @param name
     *        [Required] The name of the <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestApiRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the <a>RestApi</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>RestApi</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <a>RestApi</a>.
     * </p>
     * 
     * @return The description of the <a>RestApi</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the <a>RestApi</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestApiRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * 
     * @param version
     *        A version identifier for the API.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * 
     * @return A version identifier for the API.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * 
     * @param version
     *        A version identifier for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestApiRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The ID of the <a>RestApi</a> that you want to clone from.
     * </p>
     * 
     * @param cloneFrom
     *        The ID of the <a>RestApi</a> that you want to clone from.
     */

    public void setCloneFrom(String cloneFrom) {
        this.cloneFrom = cloneFrom;
    }

    /**
     * <p>
     * The ID of the <a>RestApi</a> that you want to clone from.
     * </p>
     * 
     * @return The ID of the <a>RestApi</a> that you want to clone from.
     */

    public String getCloneFrom() {
        return this.cloneFrom;
    }

    /**
     * <p>
     * The ID of the <a>RestApi</a> that you want to clone from.
     * </p>
     * 
     * @param cloneFrom
     *        The ID of the <a>RestApi</a> that you want to clone from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestApiRequest withCloneFrom(String cloneFrom) {
        setCloneFrom(cloneFrom);
        return this;
    }

    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By default, the <a>RestApi</a> supports only
     * UTF-8-encoded text payloads.
     * </p>
     * 
     * @return The list of binary media types supported by the <a>RestApi</a>. By default, the <a>RestApi</a> supports
     *         only UTF-8-encoded text payloads.
     */

    public java.util.List<String> getBinaryMediaTypes() {
        return binaryMediaTypes;
    }

    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By default, the <a>RestApi</a> supports only
     * UTF-8-encoded text payloads.
     * </p>
     * 
     * @param binaryMediaTypes
     *        The list of binary media types supported by the <a>RestApi</a>. By default, the <a>RestApi</a> supports
     *        only UTF-8-encoded text payloads.
     */

    public void setBinaryMediaTypes(java.util.Collection<String> binaryMediaTypes) {
        if (binaryMediaTypes == null) {
            this.binaryMediaTypes = null;
            return;
        }

        this.binaryMediaTypes = new java.util.ArrayList<String>(binaryMediaTypes);
    }

    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By default, the <a>RestApi</a> supports only
     * UTF-8-encoded text payloads.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBinaryMediaTypes(java.util.Collection)} or {@link #withBinaryMediaTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param binaryMediaTypes
     *        The list of binary media types supported by the <a>RestApi</a>. By default, the <a>RestApi</a> supports
     *        only UTF-8-encoded text payloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestApiRequest withBinaryMediaTypes(String... binaryMediaTypes) {
        if (this.binaryMediaTypes == null) {
            setBinaryMediaTypes(new java.util.ArrayList<String>(binaryMediaTypes.length));
        }
        for (String ele : binaryMediaTypes) {
            this.binaryMediaTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By default, the <a>RestApi</a> supports only
     * UTF-8-encoded text payloads.
     * </p>
     * 
     * @param binaryMediaTypes
     *        The list of binary media types supported by the <a>RestApi</a>. By default, the <a>RestApi</a> supports
     *        only UTF-8-encoded text payloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestApiRequest withBinaryMediaTypes(java.util.Collection<String> binaryMediaTypes) {
        setBinaryMediaTypes(binaryMediaTypes);
        return this;
    }

    /**
     * <p>
     * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes,
     * inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero
     * allows compression for any payload size.
     * </p>
     * 
     * @param minimumCompressionSize
     *        A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M)
     *        bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled,
     *        compression or decompression is not applied on the payload if the payload size is smaller than this value.
     *        Setting it to zero allows compression for any payload size.
     */

    public void setMinimumCompressionSize(Integer minimumCompressionSize) {
        this.minimumCompressionSize = minimumCompressionSize;
    }

    /**
     * <p>
     * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes,
     * inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero
     * allows compression for any payload size.
     * </p>
     * 
     * @return A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M)
     *         bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled,
     *         compression or decompression is not applied on the payload if the payload size is smaller than this
     *         value. Setting it to zero allows compression for any payload size.
     */

    public Integer getMinimumCompressionSize() {
        return this.minimumCompressionSize;
    }

    /**
     * <p>
     * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes,
     * inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or
     * decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero
     * allows compression for any payload size.
     * </p>
     * 
     * @param minimumCompressionSize
     *        A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M)
     *        bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled,
     *        compression or decompression is not applied on the payload if the payload size is smaller than this value.
     *        Setting it to zero allows compression for any payload size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestApiRequest withMinimumCompressionSize(Integer minimumCompressionSize) {
        setMinimumCompressionSize(minimumCompressionSize);
        return this;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom
     * authorizer.</li>
     * </ul>
     * </p>
     * 
     * @param apiKeySource
     *        The source of the API key for metering requests according to a usage plan. Valid values are:
     *        <ul>
     *        <li><code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request.</li>
     *        <li><code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom
     *        authorizer.</li>
     *        </ul>
     * @see ApiKeySourceType
     */

    public void setApiKeySource(String apiKeySource) {
        this.apiKeySource = apiKeySource;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom
     * authorizer.</li>
     * </ul>
     * </p>
     * 
     * @return The source of the API key for metering requests according to a usage plan. Valid values are:
     *         <ul>
     *         <li><code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request.</li>
     *         <li><code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom
     *         authorizer.</li>
     *         </ul>
     * @see ApiKeySourceType
     */

    public String getApiKeySource() {
        return this.apiKeySource;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom
     * authorizer.</li>
     * </ul>
     * </p>
     * 
     * @param apiKeySource
     *        The source of the API key for metering requests according to a usage plan. Valid values are:
     *        <ul>
     *        <li><code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request.</li>
     *        <li><code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom
     *        authorizer.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiKeySourceType
     */

    public CreateRestApiRequest withApiKeySource(String apiKeySource) {
        setApiKeySource(apiKeySource);
        return this;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom
     * authorizer.</li>
     * </ul>
     * </p>
     * 
     * @param apiKeySource
     *        The source of the API key for metering requests according to a usage plan. Valid values are:
     *        <ul>
     *        <li><code>HEADER</code> to read the API key from the <code>X-API-Key</code> header of a request.</li>
     *        <li><code>AUTHORIZER</code> to read the API key from the <code>UsageIdentifierKey</code> from a custom
     *        authorizer.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiKeySourceType
     */

    public CreateRestApiRequest withApiKeySource(ApiKeySourceType apiKeySource) {
        this.apiKeySource = apiKeySource.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>RestApi</a> showing the endpoint types of the API.
     * </p>
     * 
     * @param endpointConfiguration
     *        The endpoint configuration of this <a>RestApi</a> showing the endpoint types of the API.
     */

    public void setEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>RestApi</a> showing the endpoint types of the API.
     * </p>
     * 
     * @return The endpoint configuration of this <a>RestApi</a> showing the endpoint types of the API.
     */

    public EndpointConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>RestApi</a> showing the endpoint types of the API.
     * </p>
     * 
     * @param endpointConfiguration
     *        The endpoint configuration of this <a>RestApi</a> showing the endpoint types of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestApiRequest withEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        setEndpointConfiguration(endpointConfiguration);
        return this;
    }

    /**
     * A stringified JSON policy document that applies to this RestApi regardless of the caller and <a>Method</a>
     * configuration.
     * 
     * @param policy
     *        A stringified JSON policy document that applies to this RestApi regardless of the caller and <a>Method</a>
     *        configuration.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * A stringified JSON policy document that applies to this RestApi regardless of the caller and <a>Method</a>
     * configuration.
     * 
     * @return A stringified JSON policy document that applies to this RestApi regardless of the caller and
     *         <a>Method</a> configuration.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * A stringified JSON policy document that applies to this RestApi regardless of the caller and <a>Method</a>
     * configuration.
     * 
     * @param policy
     *        A stringified JSON policy document that applies to this RestApi regardless of the caller and <a>Method</a>
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestApiRequest withPolicy(String policy) {
        setPolicy(policy);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCloneFrom() != null)
            sb.append("CloneFrom: ").append(getCloneFrom()).append(",");
        if (getBinaryMediaTypes() != null)
            sb.append("BinaryMediaTypes: ").append(getBinaryMediaTypes()).append(",");
        if (getMinimumCompressionSize() != null)
            sb.append("MinimumCompressionSize: ").append(getMinimumCompressionSize()).append(",");
        if (getApiKeySource() != null)
            sb.append("ApiKeySource: ").append(getApiKeySource()).append(",");
        if (getEndpointConfiguration() != null)
            sb.append("EndpointConfiguration: ").append(getEndpointConfiguration()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRestApiRequest == false)
            return false;
        CreateRestApiRequest other = (CreateRestApiRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCloneFrom() == null ^ this.getCloneFrom() == null)
            return false;
        if (other.getCloneFrom() != null && other.getCloneFrom().equals(this.getCloneFrom()) == false)
            return false;
        if (other.getBinaryMediaTypes() == null ^ this.getBinaryMediaTypes() == null)
            return false;
        if (other.getBinaryMediaTypes() != null && other.getBinaryMediaTypes().equals(this.getBinaryMediaTypes()) == false)
            return false;
        if (other.getMinimumCompressionSize() == null ^ this.getMinimumCompressionSize() == null)
            return false;
        if (other.getMinimumCompressionSize() != null && other.getMinimumCompressionSize().equals(this.getMinimumCompressionSize()) == false)
            return false;
        if (other.getApiKeySource() == null ^ this.getApiKeySource() == null)
            return false;
        if (other.getApiKeySource() != null && other.getApiKeySource().equals(this.getApiKeySource()) == false)
            return false;
        if (other.getEndpointConfiguration() == null ^ this.getEndpointConfiguration() == null)
            return false;
        if (other.getEndpointConfiguration() != null && other.getEndpointConfiguration().equals(this.getEndpointConfiguration()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCloneFrom() == null) ? 0 : getCloneFrom().hashCode());
        hashCode = prime * hashCode + ((getBinaryMediaTypes() == null) ? 0 : getBinaryMediaTypes().hashCode());
        hashCode = prime * hashCode + ((getMinimumCompressionSize() == null) ? 0 : getMinimumCompressionSize().hashCode());
        hashCode = prime * hashCode + ((getApiKeySource() == null) ? 0 : getApiKeySource().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public CreateRestApiRequest clone() {
        return (CreateRestApiRequest) super.clone();
    }

}
