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

/**
 * <p>
 * Represents a REST API.
 * </p>
 * <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Create an API</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRestApiResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs in API Gateway.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The API's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The API's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * A version identifier for the API.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The warning messages reported when <code>failonwarnings</code> is turned on during API import.
     * </p>
     */
    private java.util.List<String> warnings;
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
     * The API's identifier. This identifier is unique across all of your APIs in API Gateway.
     * </p>
     * 
     * @param id
     *        The API's identifier. This identifier is unique across all of your APIs in API Gateway.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs in API Gateway.
     * </p>
     * 
     * @return The API's identifier. This identifier is unique across all of your APIs in API Gateway.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs in API Gateway.
     * </p>
     * 
     * @param id
     *        The API's identifier. This identifier is unique across all of your APIs in API Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The API's name.
     * </p>
     * 
     * @param name
     *        The API's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The API's name.
     * </p>
     * 
     * @return The API's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The API's name.
     * </p>
     * 
     * @param name
     *        The API's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The API's description.
     * </p>
     * 
     * @param description
     *        The API's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The API's description.
     * </p>
     * 
     * @return The API's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The API's description.
     * </p>
     * 
     * @param description
     *        The API's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the API was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     * 
     * @return The timestamp when the API was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the API was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
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

    public PutRestApiResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The warning messages reported when <code>failonwarnings</code> is turned on during API import.
     * </p>
     * 
     * @return The warning messages reported when <code>failonwarnings</code> is turned on during API import.
     */

    public java.util.List<String> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * The warning messages reported when <code>failonwarnings</code> is turned on during API import.
     * </p>
     * 
     * @param warnings
     *        The warning messages reported when <code>failonwarnings</code> is turned on during API import.
     */

    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<String>(warnings);
    }

    /**
     * <p>
     * The warning messages reported when <code>failonwarnings</code> is turned on during API import.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        The warning messages reported when <code>failonwarnings</code> is turned on during API import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiResult withWarnings(String... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<String>(warnings.length));
        }
        for (String ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The warning messages reported when <code>failonwarnings</code> is turned on during API import.
     * </p>
     * 
     * @param warnings
     *        The warning messages reported when <code>failonwarnings</code> is turned on during API import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiResult withWarnings(java.util.Collection<String> warnings) {
        setWarnings(warnings);
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

    public PutRestApiResult withBinaryMediaTypes(String... binaryMediaTypes) {
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

    public PutRestApiResult withBinaryMediaTypes(java.util.Collection<String> binaryMediaTypes) {
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

    public PutRestApiResult withMinimumCompressionSize(Integer minimumCompressionSize) {
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

    public PutRestApiResult withApiKeySource(String apiKeySource) {
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

    public PutRestApiResult withApiKeySource(ApiKeySourceType apiKeySource) {
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

    public PutRestApiResult withEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
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

    public PutRestApiResult withPolicy(String policy) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings()).append(",");
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

        if (obj instanceof PutRestApiResult == false)
            return false;
        PutRestApiResult other = (PutRestApiResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode + ((getBinaryMediaTypes() == null) ? 0 : getBinaryMediaTypes().hashCode());
        hashCode = prime * hashCode + ((getMinimumCompressionSize() == null) ? 0 : getMinimumCompressionSize().hashCode());
        hashCode = prime * hashCode + ((getApiKeySource() == null) ? 0 : getApiKeySource().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutRestApiResult clone() {
        try {
            return (PutRestApiResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
