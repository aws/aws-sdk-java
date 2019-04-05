/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the associated gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociatedGateway" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatedGateway implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of associated gateway.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the AWS account that owns the associated virtual private gateway.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The Region where the associated gateway is located.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     * 
     * @param id
     *        The ID of the associated gateway.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     * 
     * @return The ID of the associated gateway.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     * 
     * @param id
     *        The ID of the associated gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedGateway withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * 
     * @param type
     *        The type of associated gateway.
     * @see GatewayType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * 
     * @return The type of associated gateway.
     * @see GatewayType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * 
     * @param type
     *        The type of associated gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public AssociatedGateway withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * 
     * @param type
     *        The type of associated gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public AssociatedGateway withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the associated virtual private gateway.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the associated virtual private gateway.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the associated virtual private gateway.
     * </p>
     * 
     * @return The ID of the AWS account that owns the associated virtual private gateway.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the associated virtual private gateway.
     * </p>
     * 
     * @param ownerAccount
     *        The ID of the AWS account that owns the associated virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedGateway withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The Region where the associated gateway is located.
     * </p>
     * 
     * @param region
     *        The Region where the associated gateway is located.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region where the associated gateway is located.
     * </p>
     * 
     * @return The Region where the associated gateway is located.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Region where the associated gateway is located.
     * </p>
     * 
     * @param region
     *        The Region where the associated gateway is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedGateway withRegion(String region) {
        setRegion(region);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatedGateway == false)
            return false;
        AssociatedGateway other = (AssociatedGateway) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public AssociatedGateway clone() {
        try {
            return (AssociatedGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.AssociatedGatewayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
