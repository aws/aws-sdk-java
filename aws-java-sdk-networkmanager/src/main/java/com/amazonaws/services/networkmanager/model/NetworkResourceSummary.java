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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a network resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/NetworkResourceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkResourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     */
    private String registeredGatewayArn;
    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Information about the resource, in JSON format. Network Manager gets this information by describing the resource
     * using its Describe API call.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The value for the Name tag.
     * </p>
     */
    private String nameTag;
    /**
     * <p>
     * Indicates whether this is a middlebox appliance.
     * </p>
     */
    private Boolean isMiddlebox;

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @param registeredGatewayArn
     *        The ARN of the gateway.
     */

    public void setRegisteredGatewayArn(String registeredGatewayArn) {
        this.registeredGatewayArn = registeredGatewayArn;
    }

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @return The ARN of the gateway.
     */

    public String getRegisteredGatewayArn() {
        return this.registeredGatewayArn;
    }

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @param registeredGatewayArn
     *        The ARN of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceSummary withRegisteredGatewayArn(String registeredGatewayArn) {
        setRegisteredGatewayArn(registeredGatewayArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceSummary withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Information about the resource, in JSON format. Network Manager gets this information by describing the resource
     * using its Describe API call.
     * </p>
     * 
     * @param definition
     *        Information about the resource, in JSON format. Network Manager gets this information by describing the
     *        resource using its Describe API call.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * Information about the resource, in JSON format. Network Manager gets this information by describing the resource
     * using its Describe API call.
     * </p>
     * 
     * @return Information about the resource, in JSON format. Network Manager gets this information by describing the
     *         resource using its Describe API call.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * Information about the resource, in JSON format. Network Manager gets this information by describing the resource
     * using its Describe API call.
     * </p>
     * 
     * @param definition
     *        Information about the resource, in JSON format. Network Manager gets this information by describing the
     *        resource using its Describe API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceSummary withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The value for the Name tag.
     * </p>
     * 
     * @param nameTag
     *        The value for the Name tag.
     */

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }

    /**
     * <p>
     * The value for the Name tag.
     * </p>
     * 
     * @return The value for the Name tag.
     */

    public String getNameTag() {
        return this.nameTag;
    }

    /**
     * <p>
     * The value for the Name tag.
     * </p>
     * 
     * @param nameTag
     *        The value for the Name tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceSummary withNameTag(String nameTag) {
        setNameTag(nameTag);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is a middlebox appliance.
     * </p>
     * 
     * @param isMiddlebox
     *        Indicates whether this is a middlebox appliance.
     */

    public void setIsMiddlebox(Boolean isMiddlebox) {
        this.isMiddlebox = isMiddlebox;
    }

    /**
     * <p>
     * Indicates whether this is a middlebox appliance.
     * </p>
     * 
     * @return Indicates whether this is a middlebox appliance.
     */

    public Boolean getIsMiddlebox() {
        return this.isMiddlebox;
    }

    /**
     * <p>
     * Indicates whether this is a middlebox appliance.
     * </p>
     * 
     * @param isMiddlebox
     *        Indicates whether this is a middlebox appliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceSummary withIsMiddlebox(Boolean isMiddlebox) {
        setIsMiddlebox(isMiddlebox);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is a middlebox appliance.
     * </p>
     * 
     * @return Indicates whether this is a middlebox appliance.
     */

    public Boolean isMiddlebox() {
        return this.isMiddlebox;
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
        if (getRegisteredGatewayArn() != null)
            sb.append("RegisteredGatewayArn: ").append(getRegisteredGatewayArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getNameTag() != null)
            sb.append("NameTag: ").append(getNameTag()).append(",");
        if (getIsMiddlebox() != null)
            sb.append("IsMiddlebox: ").append(getIsMiddlebox());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkResourceSummary == false)
            return false;
        NetworkResourceSummary other = (NetworkResourceSummary) obj;
        if (other.getRegisteredGatewayArn() == null ^ this.getRegisteredGatewayArn() == null)
            return false;
        if (other.getRegisteredGatewayArn() != null && other.getRegisteredGatewayArn().equals(this.getRegisteredGatewayArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getNameTag() == null ^ this.getNameTag() == null)
            return false;
        if (other.getNameTag() != null && other.getNameTag().equals(this.getNameTag()) == false)
            return false;
        if (other.getIsMiddlebox() == null ^ this.getIsMiddlebox() == null)
            return false;
        if (other.getIsMiddlebox() != null && other.getIsMiddlebox().equals(this.getIsMiddlebox()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegisteredGatewayArn() == null) ? 0 : getRegisteredGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getNameTag() == null) ? 0 : getNameTag().hashCode());
        hashCode = prime * hashCode + ((getIsMiddlebox() == null) ? 0 : getIsMiddlebox().hashCode());
        return hashCode;
    }

    @Override
    public NetworkResourceSummary clone() {
        try {
            return (NetworkResourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.NetworkResourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
