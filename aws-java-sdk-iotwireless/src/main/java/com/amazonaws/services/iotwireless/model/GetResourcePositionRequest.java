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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourcePosition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcePositionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the resource for which position information is retrieved. It can be the wireless device ID or
     * the wireless gateway ID depending on the resource type.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The type of resource for which position information is retrieved, which can be a wireless device or a wireless
     * gateway.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The identifier of the resource for which position information is retrieved. It can be the wireless device ID or
     * the wireless gateway ID depending on the resource type.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier of the resource for which position information is retrieved. It can be the wireless device
     *        ID or the wireless gateway ID depending on the resource type.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the resource for which position information is retrieved. It can be the wireless device ID or
     * the wireless gateway ID depending on the resource type.
     * </p>
     * 
     * @return The identifier of the resource for which position information is retrieved. It can be the wireless device
     *         ID or the wireless gateway ID depending on the resource type.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the resource for which position information is retrieved. It can be the wireless device ID or
     * the wireless gateway ID depending on the resource type.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier of the resource for which position information is retrieved. It can be the wireless device
     *        ID or the wireless gateway ID depending on the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePositionRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of resource for which position information is retrieved, which can be a wireless device or a wireless
     * gateway.
     * </p>
     * 
     * @param resourceType
     *        The type of resource for which position information is retrieved, which can be a wireless device or a
     *        wireless gateway.
     * @see PositionResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource for which position information is retrieved, which can be a wireless device or a wireless
     * gateway.
     * </p>
     * 
     * @return The type of resource for which position information is retrieved, which can be a wireless device or a
     *         wireless gateway.
     * @see PositionResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource for which position information is retrieved, which can be a wireless device or a wireless
     * gateway.
     * </p>
     * 
     * @param resourceType
     *        The type of resource for which position information is retrieved, which can be a wireless device or a
     *        wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionResourceType
     */

    public GetResourcePositionRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource for which position information is retrieved, which can be a wireless device or a wireless
     * gateway.
     * </p>
     * 
     * @param resourceType
     *        The type of resource for which position information is retrieved, which can be a wireless device or a
     *        wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionResourceType
     */

    public GetResourcePositionRequest withResourceType(PositionResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
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

        if (obj instanceof GetResourcePositionRequest == false)
            return false;
        GetResourcePositionRequest other = (GetResourcePositionRequest) obj;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcePositionRequest clone() {
        return (GetResourcePositionRequest) super.clone();
    }

}
