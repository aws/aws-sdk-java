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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details related to a specific AttributeGroup.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/AttributeGroupDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the attribute group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group.
     * </p>
     */
    private String arn;
    /**
     * <important>
     * <p>
     * This field is no longer supported. We recommend you don't use the field when using
     * <code>ListAttributeGroupsForApplication</code>.
     * </p>
     * </important>
     * <p>
     * The name of the attribute group.
     * </p>
     */
    @Deprecated
    private String name;

    /**
     * <p>
     * The unique identifier of the attribute group.
     * </p>
     * 
     * @param id
     *        The unique identifier of the attribute group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the attribute group.
     * </p>
     * 
     * @return The unique identifier of the attribute group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the attribute group.
     * </p>
     * 
     * @param id
     *        The unique identifier of the attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeGroupDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) that specifies the attribute group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group.
     * </p>
     * 
     * @return The Amazon resource name (ARN) that specifies the attribute group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the attribute group.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) that specifies the attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeGroupDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <important>
     * <p>
     * This field is no longer supported. We recommend you don't use the field when using
     * <code>ListAttributeGroupsForApplication</code>.
     * </p>
     * </important>
     * <p>
     * The name of the attribute group.
     * </p>
     * 
     * @param name
     *        <p>
     *        This field is no longer supported. We recommend you don't use the field when using
     *        <code>ListAttributeGroupsForApplication</code>.
     *        </p>
     *        </important>
     *        <p>
     *        The name of the attribute group.
     */
    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <important>
     * <p>
     * This field is no longer supported. We recommend you don't use the field when using
     * <code>ListAttributeGroupsForApplication</code>.
     * </p>
     * </important>
     * <p>
     * The name of the attribute group.
     * </p>
     * 
     * @return <p>
     *         This field is no longer supported. We recommend you don't use the field when using
     *         <code>ListAttributeGroupsForApplication</code>.
     *         </p>
     *         </important>
     *         <p>
     *         The name of the attribute group.
     */
    @Deprecated
    public String getName() {
        return this.name;
    }

    /**
     * <important>
     * <p>
     * This field is no longer supported. We recommend you don't use the field when using
     * <code>ListAttributeGroupsForApplication</code>.
     * </p>
     * </important>
     * <p>
     * The name of the attribute group.
     * </p>
     * 
     * @param name
     *        <p>
     *        This field is no longer supported. We recommend you don't use the field when using
     *        <code>ListAttributeGroupsForApplication</code>.
     *        </p>
     *        </important>
     *        <p>
     *        The name of the attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public AttributeGroupDetails withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeGroupDetails == false)
            return false;
        AttributeGroupDetails other = (AttributeGroupDetails) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AttributeGroupDetails clone() {
        try {
            return (AttributeGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.AttributeGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
