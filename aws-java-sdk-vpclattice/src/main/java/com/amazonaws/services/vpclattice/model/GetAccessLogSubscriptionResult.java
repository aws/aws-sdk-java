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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAccessLogSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessLogSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log subscription.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the access log subscription was created, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log destination.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * The ID of the access log subscription.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time that the access log subscription was last updated, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network or service.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The ID of the service network or service.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log subscription.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the access log subscription.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log subscription.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the access log subscription.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log subscription.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the access log subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessLogSubscriptionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the access log subscription was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the access log subscription was created, specified in ISO-8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the access log subscription was created, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the access log subscription was created, specified in ISO-8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the access log subscription was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the access log subscription was created, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessLogSubscriptionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log destination.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the access log destination.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log destination.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the access log destination.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access log destination.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the access log destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessLogSubscriptionResult withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * The ID of the access log subscription.
     * </p>
     * 
     * @param id
     *        The ID of the access log subscription.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the access log subscription.
     * </p>
     * 
     * @return The ID of the access log subscription.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the access log subscription.
     * </p>
     * 
     * @param id
     *        The ID of the access log subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessLogSubscriptionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time that the access log subscription was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the access log subscription was last updated, specified in ISO-8601 format.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the access log subscription was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the access log subscription was last updated, specified in ISO-8601 format.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the access log subscription was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the access log subscription was last updated, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessLogSubscriptionResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network or service.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the service network or service.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network or service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service network or service.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network or service.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the service network or service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessLogSubscriptionResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The ID of the service network or service.
     * </p>
     * 
     * @param resourceId
     *        The ID of the service network or service.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the service network or service.
     * </p>
     * 
     * @return The ID of the service network or service.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the service network or service.
     * </p>
     * 
     * @param resourceId
     *        The ID of the service network or service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessLogSubscriptionResult withResourceId(String resourceId) {
        setResourceId(resourceId);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessLogSubscriptionResult == false)
            return false;
        GetAccessLogSubscriptionResult other = (GetAccessLogSubscriptionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessLogSubscriptionResult clone() {
        try {
            return (GetAccessLogSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
