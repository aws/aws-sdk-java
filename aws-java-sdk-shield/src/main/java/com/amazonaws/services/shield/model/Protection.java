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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a resource that is under DDoS protection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/Protection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Protection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) of the protection.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The friendly name of the protection. For example, <code>My CloudFront distributions</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The unique identifier (ID) of the protection.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the protection.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the protection.
     * </p>
     * 
     * @return The unique identifier (ID) of the protection.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the protection.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the protection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Protection withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The friendly name of the protection. For example, <code>My CloudFront distributions</code>.
     * </p>
     * 
     * @param name
     *        The friendly name of the protection. For example, <code>My CloudFront distributions</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the protection. For example, <code>My CloudFront distributions</code>.
     * </p>
     * 
     * @return The friendly name of the protection. For example, <code>My CloudFront distributions</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the protection. For example, <code>My CloudFront distributions</code>.
     * </p>
     * 
     * @param name
     *        The friendly name of the protection. For example, <code>My CloudFront distributions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Protection withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the AWS resource that is protected.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the AWS resource that is protected.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the AWS resource that is protected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Protection withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Protection == false)
            return false;
        Protection other = (Protection) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public Protection clone() {
        try {
            return (Protection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.ProtectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
