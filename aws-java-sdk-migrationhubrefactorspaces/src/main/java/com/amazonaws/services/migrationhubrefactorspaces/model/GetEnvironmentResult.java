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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetEnvironment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A timestamp that indicates when the environment is created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The description of the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Any error associated with the environment resource.
     * </p>
     */
    private ErrorResponse error;
    /**
     * <p>
     * A timestamp that indicates when the environment was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     */
    private String networkFabricType;
    /**
     * <p>
     * The Amazon Web Services account ID of the environment owner.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The current state of the environment.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ID of the transit gateway set up by the environment.
     * </p>
     */
    private String transitGatewayId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the environment is created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that indicates when the environment is created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the environment is created.
     * </p>
     * 
     * @return A timestamp that indicates when the environment is created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the environment is created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that indicates when the environment is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @return The description of the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withDescription(String description) {
        setDescription(description);
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

    public GetEnvironmentResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Any error associated with the environment resource.
     * </p>
     * 
     * @param error
     *        Any error associated with the environment resource.
     */

    public void setError(ErrorResponse error) {
        this.error = error;
    }

    /**
     * <p>
     * Any error associated with the environment resource.
     * </p>
     * 
     * @return Any error associated with the environment resource.
     */

    public ErrorResponse getError() {
        return this.error;
    }

    /**
     * <p>
     * Any error associated with the environment resource.
     * </p>
     * 
     * @param error
     *        Any error associated with the environment resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withError(ErrorResponse error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the environment was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the environment was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the environment was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when the environment was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the environment was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the environment was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     * 
     * @param networkFabricType
     *        The network fabric type of the environment.
     * @see NetworkFabricType
     */

    public void setNetworkFabricType(String networkFabricType) {
        this.networkFabricType = networkFabricType;
    }

    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     * 
     * @return The network fabric type of the environment.
     * @see NetworkFabricType
     */

    public String getNetworkFabricType() {
        return this.networkFabricType;
    }

    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     * 
     * @param networkFabricType
     *        The network fabric type of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkFabricType
     */

    public GetEnvironmentResult withNetworkFabricType(String networkFabricType) {
        setNetworkFabricType(networkFabricType);
        return this;
    }

    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     * 
     * @param networkFabricType
     *        The network fabric type of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkFabricType
     */

    public GetEnvironmentResult withNetworkFabricType(NetworkFabricType networkFabricType) {
        this.networkFabricType = networkFabricType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the environment owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the environment owner.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the environment owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the environment owner.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the environment owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the environment owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The current state of the environment.
     * </p>
     * 
     * @param state
     *        The current state of the environment.
     * @see EnvironmentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the environment.
     * </p>
     * 
     * @return The current state of the environment.
     * @see EnvironmentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the environment.
     * </p>
     * 
     * @param state
     *        The current state of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentState
     */

    public GetEnvironmentResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the environment.
     * </p>
     * 
     * @param state
     *        The current state of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentState
     */

    public GetEnvironmentResult withState(EnvironmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @return The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services
     *         resource. Each tag consists of a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services
     *        resource. Each tag consists of a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services
     *        resource. Each tag consists of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetEnvironmentResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult addTagsEntry(String key, String value) {
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

    public GetEnvironmentResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway set up by the environment.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway set up by the environment.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway set up by the environment.
     * </p>
     * 
     * @return The ID of the transit gateway set up by the environment.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway set up by the environment.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway set up by the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkFabricType() != null)
            sb.append("NetworkFabricType: ").append(getNetworkFabricType()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnvironmentResult == false)
            return false;
        GetEnvironmentResult other = (GetEnvironmentResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkFabricType() == null ^ this.getNetworkFabricType() == null)
            return false;
        if (other.getNetworkFabricType() != null && other.getNetworkFabricType().equals(this.getNetworkFabricType()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkFabricType() == null) ? 0 : getNetworkFabricType().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public GetEnvironmentResult clone() {
        try {
            return (GetEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
