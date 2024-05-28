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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resource in a list of resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ResourcesListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcesListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The message returned if the call fails.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The status of the list item.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Provides information about the AppRegistry resource type.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon resource name (ARN) of the resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of the resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon resource name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcesListItem withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The message returned if the call fails.
     * </p>
     * 
     * @param errorMessage
     *        The message returned if the call fails.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message returned if the call fails.
     * </p>
     * 
     * @return The message returned if the call fails.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The message returned if the call fails.
     * </p>
     * 
     * @param errorMessage
     *        The message returned if the call fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcesListItem withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The status of the list item.
     * </p>
     * 
     * @param status
     *        The status of the list item.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the list item.
     * </p>
     * 
     * @return The status of the list item.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the list item.
     * </p>
     * 
     * @param status
     *        The status of the list item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcesListItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Provides information about the AppRegistry resource type.
     * </p>
     * 
     * @param resourceType
     *        Provides information about the AppRegistry resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Provides information about the AppRegistry resource type.
     * </p>
     * 
     * @return Provides information about the AppRegistry resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Provides information about the AppRegistry resource type.
     * </p>
     * 
     * @param resourceType
     *        Provides information about the AppRegistry resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcesListItem withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcesListItem == false)
            return false;
        ResourcesListItem other = (ResourcesListItem) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ResourcesListItem clone() {
        try {
            return (ResourcesListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.ResourcesListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
