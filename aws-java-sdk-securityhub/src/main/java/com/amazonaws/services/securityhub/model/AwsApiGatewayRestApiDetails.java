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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a REST API in version 1 of Amazon API Gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiGatewayRestApiDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayRestApiDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the REST API.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the REST API.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the REST API.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates when the API was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createdDate;
    /**
     * <p>
     * The version identifier for the REST API.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The list of binary media types supported by the REST API.
     * </p>
     */
    private java.util.List<String> binaryMediaTypes;
    /**
     * <p>
     * The minimum size in bytes of a payload before compression is enabled.
     * </p>
     * <p>
     * If <code>null</code>, then compression is disabled.
     * </p>
     * <p>
     * If 0, then all payloads are compressed.
     * </p>
     */
    private Integer minimumCompressionSize;
    /**
     * <p>
     * The source of the API key for metering requests according to a usage plan.
     * </p>
     * <p>
     * <code>HEADER</code> indicates whether to read the API key from the X-API-Key header of a request.
     * </p>
     * <p>
     * <code>AUTHORIZER</code> indicates whether to read the API key from the <code>UsageIdentifierKey</code> from a
     * custom authorizer.
     * </p>
     */
    private String apiKeySource;
    /**
     * <p>
     * The endpoint configuration of the REST API.
     * </p>
     */
    private AwsApiGatewayEndpointConfiguration endpointConfiguration;

    /**
     * <p>
     * The identifier of the REST API.
     * </p>
     * 
     * @param id
     *        The identifier of the REST API.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the REST API.
     * </p>
     * 
     * @return The identifier of the REST API.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the REST API.
     * </p>
     * 
     * @param id
     *        The identifier of the REST API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the REST API.
     * </p>
     * 
     * @param name
     *        The name of the REST API.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the REST API.
     * </p>
     * 
     * @return The name of the REST API.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the REST API.
     * </p>
     * 
     * @param name
     *        The name of the REST API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the REST API.
     * </p>
     * 
     * @param description
     *        A description of the REST API.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the REST API.
     * </p>
     * 
     * @return A description of the REST API.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the REST API.
     * </p>
     * 
     * @param description
     *        A description of the REST API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates when the API was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdDate
     *        Indicates when the API was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * Indicates when the API was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the API was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * Indicates when the API was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdDate
     *        Indicates when the API was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withCreatedDate(String createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The version identifier for the REST API.
     * </p>
     * 
     * @param version
     *        The version identifier for the REST API.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version identifier for the REST API.
     * </p>
     * 
     * @return The version identifier for the REST API.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version identifier for the REST API.
     * </p>
     * 
     * @param version
     *        The version identifier for the REST API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The list of binary media types supported by the REST API.
     * </p>
     * 
     * @return The list of binary media types supported by the REST API.
     */

    public java.util.List<String> getBinaryMediaTypes() {
        return binaryMediaTypes;
    }

    /**
     * <p>
     * The list of binary media types supported by the REST API.
     * </p>
     * 
     * @param binaryMediaTypes
     *        The list of binary media types supported by the REST API.
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
     * The list of binary media types supported by the REST API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBinaryMediaTypes(java.util.Collection)} or {@link #withBinaryMediaTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param binaryMediaTypes
     *        The list of binary media types supported by the REST API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withBinaryMediaTypes(String... binaryMediaTypes) {
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
     * The list of binary media types supported by the REST API.
     * </p>
     * 
     * @param binaryMediaTypes
     *        The list of binary media types supported by the REST API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withBinaryMediaTypes(java.util.Collection<String> binaryMediaTypes) {
        setBinaryMediaTypes(binaryMediaTypes);
        return this;
    }

    /**
     * <p>
     * The minimum size in bytes of a payload before compression is enabled.
     * </p>
     * <p>
     * If <code>null</code>, then compression is disabled.
     * </p>
     * <p>
     * If 0, then all payloads are compressed.
     * </p>
     * 
     * @param minimumCompressionSize
     *        The minimum size in bytes of a payload before compression is enabled.</p>
     *        <p>
     *        If <code>null</code>, then compression is disabled.
     *        </p>
     *        <p>
     *        If 0, then all payloads are compressed.
     */

    public void setMinimumCompressionSize(Integer minimumCompressionSize) {
        this.minimumCompressionSize = minimumCompressionSize;
    }

    /**
     * <p>
     * The minimum size in bytes of a payload before compression is enabled.
     * </p>
     * <p>
     * If <code>null</code>, then compression is disabled.
     * </p>
     * <p>
     * If 0, then all payloads are compressed.
     * </p>
     * 
     * @return The minimum size in bytes of a payload before compression is enabled.</p>
     *         <p>
     *         If <code>null</code>, then compression is disabled.
     *         </p>
     *         <p>
     *         If 0, then all payloads are compressed.
     */

    public Integer getMinimumCompressionSize() {
        return this.minimumCompressionSize;
    }

    /**
     * <p>
     * The minimum size in bytes of a payload before compression is enabled.
     * </p>
     * <p>
     * If <code>null</code>, then compression is disabled.
     * </p>
     * <p>
     * If 0, then all payloads are compressed.
     * </p>
     * 
     * @param minimumCompressionSize
     *        The minimum size in bytes of a payload before compression is enabled.</p>
     *        <p>
     *        If <code>null</code>, then compression is disabled.
     *        </p>
     *        <p>
     *        If 0, then all payloads are compressed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withMinimumCompressionSize(Integer minimumCompressionSize) {
        setMinimumCompressionSize(minimumCompressionSize);
        return this;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage plan.
     * </p>
     * <p>
     * <code>HEADER</code> indicates whether to read the API key from the X-API-Key header of a request.
     * </p>
     * <p>
     * <code>AUTHORIZER</code> indicates whether to read the API key from the <code>UsageIdentifierKey</code> from a
     * custom authorizer.
     * </p>
     * 
     * @param apiKeySource
     *        The source of the API key for metering requests according to a usage plan.</p>
     *        <p>
     *        <code>HEADER</code> indicates whether to read the API key from the X-API-Key header of a request.
     *        </p>
     *        <p>
     *        <code>AUTHORIZER</code> indicates whether to read the API key from the <code>UsageIdentifierKey</code>
     *        from a custom authorizer.
     */

    public void setApiKeySource(String apiKeySource) {
        this.apiKeySource = apiKeySource;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage plan.
     * </p>
     * <p>
     * <code>HEADER</code> indicates whether to read the API key from the X-API-Key header of a request.
     * </p>
     * <p>
     * <code>AUTHORIZER</code> indicates whether to read the API key from the <code>UsageIdentifierKey</code> from a
     * custom authorizer.
     * </p>
     * 
     * @return The source of the API key for metering requests according to a usage plan.</p>
     *         <p>
     *         <code>HEADER</code> indicates whether to read the API key from the X-API-Key header of a request.
     *         </p>
     *         <p>
     *         <code>AUTHORIZER</code> indicates whether to read the API key from the <code>UsageIdentifierKey</code>
     *         from a custom authorizer.
     */

    public String getApiKeySource() {
        return this.apiKeySource;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage plan.
     * </p>
     * <p>
     * <code>HEADER</code> indicates whether to read the API key from the X-API-Key header of a request.
     * </p>
     * <p>
     * <code>AUTHORIZER</code> indicates whether to read the API key from the <code>UsageIdentifierKey</code> from a
     * custom authorizer.
     * </p>
     * 
     * @param apiKeySource
     *        The source of the API key for metering requests according to a usage plan.</p>
     *        <p>
     *        <code>HEADER</code> indicates whether to read the API key from the X-API-Key header of a request.
     *        </p>
     *        <p>
     *        <code>AUTHORIZER</code> indicates whether to read the API key from the <code>UsageIdentifierKey</code>
     *        from a custom authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withApiKeySource(String apiKeySource) {
        setApiKeySource(apiKeySource);
        return this;
    }

    /**
     * <p>
     * The endpoint configuration of the REST API.
     * </p>
     * 
     * @param endpointConfiguration
     *        The endpoint configuration of the REST API.
     */

    public void setEndpointConfiguration(AwsApiGatewayEndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of the REST API.
     * </p>
     * 
     * @return The endpoint configuration of the REST API.
     */

    public AwsApiGatewayEndpointConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of the REST API.
     * </p>
     * 
     * @param endpointConfiguration
     *        The endpoint configuration of the REST API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayRestApiDetails withEndpointConfiguration(AwsApiGatewayEndpointConfiguration endpointConfiguration) {
        setEndpointConfiguration(endpointConfiguration);
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
        if (getBinaryMediaTypes() != null)
            sb.append("BinaryMediaTypes: ").append(getBinaryMediaTypes()).append(",");
        if (getMinimumCompressionSize() != null)
            sb.append("MinimumCompressionSize: ").append(getMinimumCompressionSize()).append(",");
        if (getApiKeySource() != null)
            sb.append("ApiKeySource: ").append(getApiKeySource()).append(",");
        if (getEndpointConfiguration() != null)
            sb.append("EndpointConfiguration: ").append(getEndpointConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiGatewayRestApiDetails == false)
            return false;
        AwsApiGatewayRestApiDetails other = (AwsApiGatewayRestApiDetails) obj;
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
        hashCode = prime * hashCode + ((getBinaryMediaTypes() == null) ? 0 : getBinaryMediaTypes().hashCode());
        hashCode = prime * hashCode + ((getMinimumCompressionSize() == null) ? 0 : getMinimumCompressionSize().hashCode());
        hashCode = prime * hashCode + ((getApiKeySource() == null) ? 0 : getApiKeySource().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AwsApiGatewayRestApiDetails clone() {
        try {
            return (AwsApiGatewayRestApiDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsApiGatewayRestApiDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
