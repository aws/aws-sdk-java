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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPositionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Resource identifier used in a position configuration.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * Resource type of the resource for which position configuration is retrieved.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * Resource identifier used in a position configuration.
     * </p>
     * 
     * @param resourceIdentifier
     *        Resource identifier used in a position configuration.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Resource identifier used in a position configuration.
     * </p>
     * 
     * @return Resource identifier used in a position configuration.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * Resource identifier used in a position configuration.
     * </p>
     * 
     * @param resourceIdentifier
     *        Resource identifier used in a position configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionConfigurationRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Resource type of the resource for which position configuration is retrieved.
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource for which position configuration is retrieved.
     * @see PositionResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Resource type of the resource for which position configuration is retrieved.
     * </p>
     * 
     * @return Resource type of the resource for which position configuration is retrieved.
     * @see PositionResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Resource type of the resource for which position configuration is retrieved.
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource for which position configuration is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionResourceType
     */

    public GetPositionConfigurationRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Resource type of the resource for which position configuration is retrieved.
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource for which position configuration is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionResourceType
     */

    public GetPositionConfigurationRequest withResourceType(PositionResourceType resourceType) {
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

        if (obj instanceof GetPositionConfigurationRequest == false)
            return false;
        GetPositionConfigurationRequest other = (GetPositionConfigurationRequest) obj;
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
    public GetPositionConfigurationRequest clone() {
        return (GetPositionConfigurationRequest) super.clone();
    }

}
