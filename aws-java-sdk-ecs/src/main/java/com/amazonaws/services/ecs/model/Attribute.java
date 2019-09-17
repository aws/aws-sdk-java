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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An attribute is a name-value pair associated with an Amazon ECS object. Attributes enable you to extend the Amazon
 * ECS data model by adding custom metadata to your resources. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
 * >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Attribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, and
     * periods are allowed.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, periods,
     * at signs (@), forward slashes, colons, and spaces are allowed.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter is required if you use the short form
     * ID for a resource instead of the full ARN.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * The ID of the target. You can specify the short form ID for a resource or the full Amazon Resource Name (ARN).
     * </p>
     */
    private String targetId;

    /**
     * <p>
     * The name of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, and
     * periods are allowed.
     * </p>
     * 
     * @param name
     *        The name of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, and
     *        periods are allowed.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, and
     * periods are allowed.
     * </p>
     * 
     * @return The name of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores,
     *         and periods are allowed.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, and
     * periods are allowed.
     * </p>
     * 
     * @param name
     *        The name of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, and
     *        periods are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, periods,
     * at signs (@), forward slashes, colons, and spaces are allowed.
     * </p>
     * 
     * @param value
     *        The value of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores,
     *        periods, at signs (@), forward slashes, colons, and spaces are allowed.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, periods,
     * at signs (@), forward slashes, colons, and spaces are allowed.
     * </p>
     * 
     * @return The value of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores,
     *         periods, at signs (@), forward slashes, colons, and spaces are allowed.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores, periods,
     * at signs (@), forward slashes, colons, and spaces are allowed.
     * </p>
     * 
     * @param value
     *        The value of the attribute. Up to 128 letters (uppercase and lowercase), numbers, hyphens, underscores,
     *        periods, at signs (@), forward slashes, colons, and spaces are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter is required if you use the short form
     * ID for a resource instead of the full ARN.
     * </p>
     * 
     * @param targetType
     *        The type of the target with which to attach the attribute. This parameter is required if you use the short
     *        form ID for a resource instead of the full ARN.
     * @see TargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter is required if you use the short form
     * ID for a resource instead of the full ARN.
     * </p>
     * 
     * @return The type of the target with which to attach the attribute. This parameter is required if you use the
     *         short form ID for a resource instead of the full ARN.
     * @see TargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter is required if you use the short form
     * ID for a resource instead of the full ARN.
     * </p>
     * 
     * @param targetType
     *        The type of the target with which to attach the attribute. This parameter is required if you use the short
     *        form ID for a resource instead of the full ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public Attribute withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter is required if you use the short form
     * ID for a resource instead of the full ARN.
     * </p>
     * 
     * @param targetType
     *        The type of the target with which to attach the attribute. This parameter is required if you use the short
     *        form ID for a resource instead of the full ARN.
     * @see TargetType
     */

    public void setTargetType(TargetType targetType) {
        withTargetType(targetType);
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter is required if you use the short form
     * ID for a resource instead of the full ARN.
     * </p>
     * 
     * @param targetType
     *        The type of the target with which to attach the attribute. This parameter is required if you use the short
     *        form ID for a resource instead of the full ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public Attribute withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the target. You can specify the short form ID for a resource or the full Amazon Resource Name (ARN).
     * </p>
     * 
     * @param targetId
     *        The ID of the target. You can specify the short form ID for a resource or the full Amazon Resource Name
     *        (ARN).
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The ID of the target. You can specify the short form ID for a resource or the full Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The ID of the target. You can specify the short form ID for a resource or the full Amazon Resource Name
     *         (ARN).
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The ID of the target. You can specify the short form ID for a resource or the full Amazon Resource Name (ARN).
     * </p>
     * 
     * @param targetId
     *        The ID of the target. You can specify the short form ID for a resource or the full Amazon Resource Name
     *        (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withTargetId(String targetId) {
        setTargetId(targetId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        return hashCode;
    }

    @Override
    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.AttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
