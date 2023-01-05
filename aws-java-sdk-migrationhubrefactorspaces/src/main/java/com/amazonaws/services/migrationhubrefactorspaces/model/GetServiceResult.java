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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetService"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Web Services account ID of the service creator.
     * </p>
     */
    private String createdByAccountId;
    /**
     * <p>
     * The timestamp of when the service is created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The description of the service.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The endpoint type of the service.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Any error associated with the service resource.
     * </p>
     */
    private ErrorResponse error;
    /**
     * <p>
     * The configuration for the Lambda endpoint type.
     * </p>
     * <p>
     * The <b>Arn</b> is the Amazon Resource Name (ARN) of the Lambda function associated with this service.
     * </p>
     */
    private LambdaEndpointConfig lambdaEndpoint;
    /**
     * <p>
     * A timestamp that indicates when the service was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The name of the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Web Services account ID of the service owner.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The current state of the service.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags assigned to the service. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The configuration for the URL endpoint type.
     * </p>
     * <p>
     * The <b>Url</b> isthe URL of the endpoint type.
     * </p>
     * <p>
     * The <b>HealthUrl</b> is the health check URL of the endpoint type.
     * </p>
     */
    private UrlEndpointConfig urlEndpoint;
    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the service creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of the service creator.
     */

    public void setCreatedByAccountId(String createdByAccountId) {
        this.createdByAccountId = createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the service creator.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the service creator.
     */

    public String getCreatedByAccountId() {
        return this.createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the service creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of the service creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withCreatedByAccountId(String createdByAccountId) {
        setCreatedByAccountId(createdByAccountId);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the service is created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp of when the service is created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp of when the service is created.
     * </p>
     * 
     * @return The timestamp of when the service is created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp of when the service is created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp of when the service is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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

    public GetServiceResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The endpoint type of the service.
     * </p>
     * 
     * @param endpointType
     *        The endpoint type of the service.
     * @see ServiceEndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The endpoint type of the service.
     * </p>
     * 
     * @return The endpoint type of the service.
     * @see ServiceEndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The endpoint type of the service.
     * </p>
     * 
     * @param endpointType
     *        The endpoint type of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceEndpointType
     */

    public GetServiceResult withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The endpoint type of the service.
     * </p>
     * 
     * @param endpointType
     *        The endpoint type of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceEndpointType
     */

    public GetServiceResult withEndpointType(ServiceEndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @return The unique identifier of the environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Any error associated with the service resource.
     * </p>
     * 
     * @param error
     *        Any error associated with the service resource.
     */

    public void setError(ErrorResponse error) {
        this.error = error;
    }

    /**
     * <p>
     * Any error associated with the service resource.
     * </p>
     * 
     * @return Any error associated with the service resource.
     */

    public ErrorResponse getError() {
        return this.error;
    }

    /**
     * <p>
     * Any error associated with the service resource.
     * </p>
     * 
     * @param error
     *        Any error associated with the service resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withError(ErrorResponse error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The configuration for the Lambda endpoint type.
     * </p>
     * <p>
     * The <b>Arn</b> is the Amazon Resource Name (ARN) of the Lambda function associated with this service.
     * </p>
     * 
     * @param lambdaEndpoint
     *        The configuration for the Lambda endpoint type.</p>
     *        <p>
     *        The <b>Arn</b> is the Amazon Resource Name (ARN) of the Lambda function associated with this service.
     */

    public void setLambdaEndpoint(LambdaEndpointConfig lambdaEndpoint) {
        this.lambdaEndpoint = lambdaEndpoint;
    }

    /**
     * <p>
     * The configuration for the Lambda endpoint type.
     * </p>
     * <p>
     * The <b>Arn</b> is the Amazon Resource Name (ARN) of the Lambda function associated with this service.
     * </p>
     * 
     * @return The configuration for the Lambda endpoint type.</p>
     *         <p>
     *         The <b>Arn</b> is the Amazon Resource Name (ARN) of the Lambda function associated with this service.
     */

    public LambdaEndpointConfig getLambdaEndpoint() {
        return this.lambdaEndpoint;
    }

    /**
     * <p>
     * The configuration for the Lambda endpoint type.
     * </p>
     * <p>
     * The <b>Arn</b> is the Amazon Resource Name (ARN) of the Lambda function associated with this service.
     * </p>
     * 
     * @param lambdaEndpoint
     *        The configuration for the Lambda endpoint type.</p>
     *        <p>
     *        The <b>Arn</b> is the Amazon Resource Name (ARN) of the Lambda function associated with this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withLambdaEndpoint(LambdaEndpointConfig lambdaEndpoint) {
        setLambdaEndpoint(lambdaEndpoint);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the service was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the service was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the service was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when the service was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the service was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the service was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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

    public GetServiceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the service owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the service owner.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the service owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the service owner.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the service owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the service owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     * 
     * @param serviceId
     *        The unique identifier of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     * 
     * @return The unique identifier of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     * 
     * @param serviceId
     *        The unique identifier of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The current state of the service.
     * </p>
     * 
     * @param state
     *        The current state of the service.
     * @see ServiceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the service.
     * </p>
     * 
     * @return The current state of the service.
     * @see ServiceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the service.
     * </p>
     * 
     * @param state
     *        The current state of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceState
     */

    public GetServiceResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the service.
     * </p>
     * 
     * @param state
     *        The current state of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceState
     */

    public GetServiceResult withState(ServiceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags assigned to the service. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair.
     * </p>
     * 
     * @return The tags assigned to the service. A tag is a label that you assign to an Amazon Web Services resource.
     *         Each tag consists of a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the service. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the service. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the service. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the service. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetServiceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult addTagsEntry(String key, String value) {
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

    public GetServiceResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The configuration for the URL endpoint type.
     * </p>
     * <p>
     * The <b>Url</b> isthe URL of the endpoint type.
     * </p>
     * <p>
     * The <b>HealthUrl</b> is the health check URL of the endpoint type.
     * </p>
     * 
     * @param urlEndpoint
     *        The configuration for the URL endpoint type.</p>
     *        <p>
     *        The <b>Url</b> isthe URL of the endpoint type.
     *        </p>
     *        <p>
     *        The <b>HealthUrl</b> is the health check URL of the endpoint type.
     */

    public void setUrlEndpoint(UrlEndpointConfig urlEndpoint) {
        this.urlEndpoint = urlEndpoint;
    }

    /**
     * <p>
     * The configuration for the URL endpoint type.
     * </p>
     * <p>
     * The <b>Url</b> isthe URL of the endpoint type.
     * </p>
     * <p>
     * The <b>HealthUrl</b> is the health check URL of the endpoint type.
     * </p>
     * 
     * @return The configuration for the URL endpoint type.</p>
     *         <p>
     *         The <b>Url</b> isthe URL of the endpoint type.
     *         </p>
     *         <p>
     *         The <b>HealthUrl</b> is the health check URL of the endpoint type.
     */

    public UrlEndpointConfig getUrlEndpoint() {
        return this.urlEndpoint;
    }

    /**
     * <p>
     * The configuration for the URL endpoint type.
     * </p>
     * <p>
     * The <b>Url</b> isthe URL of the endpoint type.
     * </p>
     * <p>
     * The <b>HealthUrl</b> is the health check URL of the endpoint type.
     * </p>
     * 
     * @param urlEndpoint
     *        The configuration for the URL endpoint type.</p>
     *        <p>
     *        The <b>Url</b> isthe URL of the endpoint type.
     *        </p>
     *        <p>
     *        The <b>HealthUrl</b> is the health check URL of the endpoint type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withUrlEndpoint(UrlEndpointConfig urlEndpoint) {
        setUrlEndpoint(urlEndpoint);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC).
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     * 
     * @return The ID of the virtual private cloud (VPC).
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withVpcId(String vpcId) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedByAccountId() != null)
            sb.append("CreatedByAccountId: ").append(getCreatedByAccountId()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getLambdaEndpoint() != null)
            sb.append("LambdaEndpoint: ").append(getLambdaEndpoint()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof GetServiceResult == false)
            return false;
        GetServiceResult other = (GetServiceResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedByAccountId() == null ^ this.getCreatedByAccountId() == null)
            return false;
        if (other.getCreatedByAccountId() != null && other.getCreatedByAccountId().equals(this.getCreatedByAccountId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getLambdaEndpoint() == null ^ this.getLambdaEndpoint() == null)
            return false;
        if (other.getLambdaEndpoint() != null && other.getLambdaEndpoint().equals(this.getLambdaEndpoint()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedByAccountId() == null) ? 0 : getCreatedByAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getLambdaEndpoint() == null) ? 0 : getLambdaEndpoint().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUrlEndpoint() == null) ? 0 : getUrlEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceResult clone() {
        try {
            return (GetServiceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
