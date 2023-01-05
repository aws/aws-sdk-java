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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateService"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application which the service is created.
     * </p>
     */
    private String applicationIdentifier;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description of the service.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The ID of the environment in which the service is created.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The configuration for the Lambda endpoint type.
     * </p>
     */
    private LambdaEndpointInput lambdaEndpoint;
    /**
     * <p>
     * The name of the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags to assign to the service. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair..
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The configuration for the URL endpoint type. When creating a route to a service, Refactor Spaces automatically
     * resolves the address in the <code>UrlEndpointInput</code> object URL when the Domain Name System (DNS)
     * time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds.
     * </p>
     */
    private UrlEndpointInput urlEndpoint;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the application which the service is created.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application which the service is created.
     */

    public void setApplicationIdentifier(String applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application which the service is created.
     * </p>
     * 
     * @return The ID of the application which the service is created.
     */

    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application which the service is created.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application which the service is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withApplicationIdentifier(String applicationIdentifier) {
        setApplicationIdentifier(applicationIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description of the service.
     * </p>
     * 
     * @param description
     *        The description of the service.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the service.
     * </p>
     * 
     * @return The description of the service.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the service.
     * </p>
     * 
     * @param description
     *        The description of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
     * @see ServiceEndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
     * </p>
     * 
     * @return The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
     * @see ServiceEndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceEndpointType
     */

    public CreateServiceRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceEndpointType
     */

    public CreateServiceRequest withEndpointType(ServiceEndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the environment in which the service is created.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which the service is created.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which the service is created.
     * </p>
     * 
     * @return The ID of the environment in which the service is created.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which the service is created.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which the service is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The configuration for the Lambda endpoint type.
     * </p>
     * 
     * @param lambdaEndpoint
     *        The configuration for the Lambda endpoint type.
     */

    public void setLambdaEndpoint(LambdaEndpointInput lambdaEndpoint) {
        this.lambdaEndpoint = lambdaEndpoint;
    }

    /**
     * <p>
     * The configuration for the Lambda endpoint type.
     * </p>
     * 
     * @return The configuration for the Lambda endpoint type.
     */

    public LambdaEndpointInput getLambdaEndpoint() {
        return this.lambdaEndpoint;
    }

    /**
     * <p>
     * The configuration for the Lambda endpoint type.
     * </p>
     * 
     * @param lambdaEndpoint
     *        The configuration for the Lambda endpoint type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withLambdaEndpoint(LambdaEndpointInput lambdaEndpoint) {
        setLambdaEndpoint(lambdaEndpoint);
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @return The name of the service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the service. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair..
     * </p>
     * 
     * @return The tags to assign to the service. A tag is a label that you assign to an Amazon Web Services resource.
     *         Each tag consists of a key-value pair..
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the service. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair..
     * </p>
     * 
     * @param tags
     *        The tags to assign to the service. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key-value pair..
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to assign to the service. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair..
     * </p>
     * 
     * @param tags
     *        The tags to assign to the service. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key-value pair..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateServiceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest addTagsEntry(String key, String value) {
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

    public CreateServiceRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The configuration for the URL endpoint type. When creating a route to a service, Refactor Spaces automatically
     * resolves the address in the <code>UrlEndpointInput</code> object URL when the Domain Name System (DNS)
     * time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds.
     * </p>
     * 
     * @param urlEndpoint
     *        The configuration for the URL endpoint type. When creating a route to a service, Refactor Spaces
     *        automatically resolves the address in the <code>UrlEndpointInput</code> object URL when the Domain Name
     *        System (DNS) time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds.
     */

    public void setUrlEndpoint(UrlEndpointInput urlEndpoint) {
        this.urlEndpoint = urlEndpoint;
    }

    /**
     * <p>
     * The configuration for the URL endpoint type. When creating a route to a service, Refactor Spaces automatically
     * resolves the address in the <code>UrlEndpointInput</code> object URL when the Domain Name System (DNS)
     * time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds.
     * </p>
     * 
     * @return The configuration for the URL endpoint type. When creating a route to a service, Refactor Spaces
     *         automatically resolves the address in the <code>UrlEndpointInput</code> object URL when the Domain Name
     *         System (DNS) time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds.
     */

    public UrlEndpointInput getUrlEndpoint() {
        return this.urlEndpoint;
    }

    /**
     * <p>
     * The configuration for the URL endpoint type. When creating a route to a service, Refactor Spaces automatically
     * resolves the address in the <code>UrlEndpointInput</code> object URL when the Domain Name System (DNS)
     * time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds.
     * </p>
     * 
     * @param urlEndpoint
     *        The configuration for the URL endpoint type. When creating a route to a service, Refactor Spaces
     *        automatically resolves the address in the <code>UrlEndpointInput</code> object URL when the Domain Name
     *        System (DNS) time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withUrlEndpoint(UrlEndpointInput urlEndpoint) {
        setUrlEndpoint(urlEndpoint);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getApplicationIdentifier() != null)
            sb.append("ApplicationIdentifier: ").append(getApplicationIdentifier()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getLambdaEndpoint() != null)
            sb.append("LambdaEndpoint: ").append(getLambdaEndpoint()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getUrlEndpoint() != null)
            sb.append("UrlEndpoint: ").append(getUrlEndpoint()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceRequest == false)
            return false;
        CreateServiceRequest other = (CreateServiceRequest) obj;
        if (other.getApplicationIdentifier() == null ^ this.getApplicationIdentifier() == null)
            return false;
        if (other.getApplicationIdentifier() != null && other.getApplicationIdentifier().equals(this.getApplicationIdentifier()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getLambdaEndpoint() == null ^ this.getLambdaEndpoint() == null)
            return false;
        if (other.getLambdaEndpoint() != null && other.getLambdaEndpoint().equals(this.getLambdaEndpoint()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUrlEndpoint() == null ^ this.getUrlEndpoint() == null)
            return false;
        if (other.getUrlEndpoint() != null && other.getUrlEndpoint().equals(this.getUrlEndpoint()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationIdentifier() == null) ? 0 : getApplicationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLambdaEndpoint() == null) ? 0 : getLambdaEndpoint().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUrlEndpoint() == null) ? 0 : getUrlEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceRequest clone() {
        return (CreateServiceRequest) super.clone();
    }

}
