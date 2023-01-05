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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/CreateGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The activation key of the created gateway.
     * </p>
     */
    private String activationKey;
    /**
     * <p>
     * The display name of the created gateway.
     * </p>
     */
    private String gatewayDisplayName;
    /**
     * <p>
     * The type of created gateway.
     * </p>
     */
    private String gatewayType;
    /**
     * <p>
     * A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The activation key of the created gateway.
     * </p>
     * 
     * @param activationKey
     *        The activation key of the created gateway.
     */

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    /**
     * <p>
     * The activation key of the created gateway.
     * </p>
     * 
     * @return The activation key of the created gateway.
     */

    public String getActivationKey() {
        return this.activationKey;
    }

    /**
     * <p>
     * The activation key of the created gateway.
     * </p>
     * 
     * @param activationKey
     *        The activation key of the created gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withActivationKey(String activationKey) {
        setActivationKey(activationKey);
        return this;
    }

    /**
     * <p>
     * The display name of the created gateway.
     * </p>
     * 
     * @param gatewayDisplayName
     *        The display name of the created gateway.
     */

    public void setGatewayDisplayName(String gatewayDisplayName) {
        this.gatewayDisplayName = gatewayDisplayName;
    }

    /**
     * <p>
     * The display name of the created gateway.
     * </p>
     * 
     * @return The display name of the created gateway.
     */

    public String getGatewayDisplayName() {
        return this.gatewayDisplayName;
    }

    /**
     * <p>
     * The display name of the created gateway.
     * </p>
     * 
     * @param gatewayDisplayName
     *        The display name of the created gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withGatewayDisplayName(String gatewayDisplayName) {
        setGatewayDisplayName(gatewayDisplayName);
        return this;
    }

    /**
     * <p>
     * The type of created gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of created gateway.
     * @see GatewayType
     */

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * The type of created gateway.
     * </p>
     * 
     * @return The type of created gateway.
     * @see GatewayType
     */

    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * <p>
     * The type of created gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of created gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public CreateGatewayRequest withGatewayType(String gatewayType) {
        setGatewayType(gatewayType);
        return this;
    }

    /**
     * <p>
     * The type of created gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of created gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public CreateGatewayRequest withGatewayType(GatewayType gatewayType) {
        this.gatewayType = gatewayType.toString();
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
     * </p>
     * 
     * @return A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getActivationKey() != null)
            sb.append("ActivationKey: ").append(getActivationKey()).append(",");
        if (getGatewayDisplayName() != null)
            sb.append("GatewayDisplayName: ").append(getGatewayDisplayName()).append(",");
        if (getGatewayType() != null)
            sb.append("GatewayType: ").append(getGatewayType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGatewayRequest == false)
            return false;
        CreateGatewayRequest other = (CreateGatewayRequest) obj;
        if (other.getActivationKey() == null ^ this.getActivationKey() == null)
            return false;
        if (other.getActivationKey() != null && other.getActivationKey().equals(this.getActivationKey()) == false)
            return false;
        if (other.getGatewayDisplayName() == null ^ this.getGatewayDisplayName() == null)
            return false;
        if (other.getGatewayDisplayName() != null && other.getGatewayDisplayName().equals(this.getGatewayDisplayName()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationKey() == null) ? 0 : getActivationKey().hashCode());
        hashCode = prime * hashCode + ((getGatewayDisplayName() == null) ? 0 : getGatewayDisplayName().hashCode());
        hashCode = prime * hashCode + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateGatewayRequest clone() {
        return (CreateGatewayRequest) super.clone();
    }

}
