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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a member of the complex data structure. The data type of the property can be either primitive or another
 * <code>struct</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CustomProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified name of the custom property. For example, the fully qualified name of a custom property might
     * be <code>ComplexDataTypes.VehicleDataTypes.SVMCamera.FPS</code>.
     * </p>
     */
    private String fullyQualifiedName;
    /**
     * <p>
     * The data type for the custom property.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * Indicates whether the property is binary data.
     * </p>
     */
    private String dataEncoding;
    /**
     * <p>
     * A brief description of the custom property.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The deprecation message for the node or the branch that was moved or deleted.
     * </p>
     */
    private String deprecationMessage;
    /**
     * <p>
     * A comment in addition to the description.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The fully qualified name of the struct node for the custom property if the data type of the custom property is
     * <code>Struct</code> or <code>StructArray</code>.
     * </p>
     */
    private String structFullyQualifiedName;

    /**
     * <p>
     * The fully qualified name of the custom property. For example, the fully qualified name of a custom property might
     * be <code>ComplexDataTypes.VehicleDataTypes.SVMCamera.FPS</code>.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of the custom property. For example, the fully qualified name of a custom
     *        property might be <code>ComplexDataTypes.VehicleDataTypes.SVMCamera.FPS</code>.
     */

    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the custom property. For example, the fully qualified name of a custom property might
     * be <code>ComplexDataTypes.VehicleDataTypes.SVMCamera.FPS</code>.
     * </p>
     * 
     * @return The fully qualified name of the custom property. For example, the fully qualified name of a custom
     *         property might be <code>ComplexDataTypes.VehicleDataTypes.SVMCamera.FPS</code>.
     */

    public String getFullyQualifiedName() {
        return this.fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the custom property. For example, the fully qualified name of a custom property might
     * be <code>ComplexDataTypes.VehicleDataTypes.SVMCamera.FPS</code>.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of the custom property. For example, the fully qualified name of a custom
     *        property might be <code>ComplexDataTypes.VehicleDataTypes.SVMCamera.FPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomProperty withFullyQualifiedName(String fullyQualifiedName) {
        setFullyQualifiedName(fullyQualifiedName);
        return this;
    }

    /**
     * <p>
     * The data type for the custom property.
     * </p>
     * 
     * @param dataType
     *        The data type for the custom property.
     * @see NodeDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type for the custom property.
     * </p>
     * 
     * @return The data type for the custom property.
     * @see NodeDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type for the custom property.
     * </p>
     * 
     * @param dataType
     *        The data type for the custom property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeDataType
     */

    public CustomProperty withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type for the custom property.
     * </p>
     * 
     * @param dataType
     *        The data type for the custom property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeDataType
     */

    public CustomProperty withDataType(NodeDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the property is binary data.
     * </p>
     * 
     * @param dataEncoding
     *        Indicates whether the property is binary data.
     * @see NodeDataEncoding
     */

    public void setDataEncoding(String dataEncoding) {
        this.dataEncoding = dataEncoding;
    }

    /**
     * <p>
     * Indicates whether the property is binary data.
     * </p>
     * 
     * @return Indicates whether the property is binary data.
     * @see NodeDataEncoding
     */

    public String getDataEncoding() {
        return this.dataEncoding;
    }

    /**
     * <p>
     * Indicates whether the property is binary data.
     * </p>
     * 
     * @param dataEncoding
     *        Indicates whether the property is binary data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeDataEncoding
     */

    public CustomProperty withDataEncoding(String dataEncoding) {
        setDataEncoding(dataEncoding);
        return this;
    }

    /**
     * <p>
     * Indicates whether the property is binary data.
     * </p>
     * 
     * @param dataEncoding
     *        Indicates whether the property is binary data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeDataEncoding
     */

    public CustomProperty withDataEncoding(NodeDataEncoding dataEncoding) {
        this.dataEncoding = dataEncoding.toString();
        return this;
    }

    /**
     * <p>
     * A brief description of the custom property.
     * </p>
     * 
     * @param description
     *        A brief description of the custom property.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the custom property.
     * </p>
     * 
     * @return A brief description of the custom property.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the custom property.
     * </p>
     * 
     * @param description
     *        A brief description of the custom property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomProperty withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The deprecation message for the node or the branch that was moved or deleted.
     * </p>
     * 
     * @param deprecationMessage
     *        The deprecation message for the node or the branch that was moved or deleted.
     */

    public void setDeprecationMessage(String deprecationMessage) {
        this.deprecationMessage = deprecationMessage;
    }

    /**
     * <p>
     * The deprecation message for the node or the branch that was moved or deleted.
     * </p>
     * 
     * @return The deprecation message for the node or the branch that was moved or deleted.
     */

    public String getDeprecationMessage() {
        return this.deprecationMessage;
    }

    /**
     * <p>
     * The deprecation message for the node or the branch that was moved or deleted.
     * </p>
     * 
     * @param deprecationMessage
     *        The deprecation message for the node or the branch that was moved or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomProperty withDeprecationMessage(String deprecationMessage) {
        setDeprecationMessage(deprecationMessage);
        return this;
    }

    /**
     * <p>
     * A comment in addition to the description.
     * </p>
     * 
     * @param comment
     *        A comment in addition to the description.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment in addition to the description.
     * </p>
     * 
     * @return A comment in addition to the description.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment in addition to the description.
     * </p>
     * 
     * @param comment
     *        A comment in addition to the description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomProperty withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The fully qualified name of the struct node for the custom property if the data type of the custom property is
     * <code>Struct</code> or <code>StructArray</code>.
     * </p>
     * 
     * @param structFullyQualifiedName
     *        The fully qualified name of the struct node for the custom property if the data type of the custom
     *        property is <code>Struct</code> or <code>StructArray</code>.
     */

    public void setStructFullyQualifiedName(String structFullyQualifiedName) {
        this.structFullyQualifiedName = structFullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the struct node for the custom property if the data type of the custom property is
     * <code>Struct</code> or <code>StructArray</code>.
     * </p>
     * 
     * @return The fully qualified name of the struct node for the custom property if the data type of the custom
     *         property is <code>Struct</code> or <code>StructArray</code>.
     */

    public String getStructFullyQualifiedName() {
        return this.structFullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the struct node for the custom property if the data type of the custom property is
     * <code>Struct</code> or <code>StructArray</code>.
     * </p>
     * 
     * @param structFullyQualifiedName
     *        The fully qualified name of the struct node for the custom property if the data type of the custom
     *        property is <code>Struct</code> or <code>StructArray</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomProperty withStructFullyQualifiedName(String structFullyQualifiedName) {
        setStructFullyQualifiedName(structFullyQualifiedName);
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
        if (getFullyQualifiedName() != null)
            sb.append("FullyQualifiedName: ").append(getFullyQualifiedName()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getDataEncoding() != null)
            sb.append("DataEncoding: ").append(getDataEncoding()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeprecationMessage() != null)
            sb.append("DeprecationMessage: ").append(getDeprecationMessage()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getStructFullyQualifiedName() != null)
            sb.append("StructFullyQualifiedName: ").append(getStructFullyQualifiedName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomProperty == false)
            return false;
        CustomProperty other = (CustomProperty) obj;
        if (other.getFullyQualifiedName() == null ^ this.getFullyQualifiedName() == null)
            return false;
        if (other.getFullyQualifiedName() != null && other.getFullyQualifiedName().equals(this.getFullyQualifiedName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDataEncoding() == null ^ this.getDataEncoding() == null)
            return false;
        if (other.getDataEncoding() != null && other.getDataEncoding().equals(this.getDataEncoding()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeprecationMessage() == null ^ this.getDeprecationMessage() == null)
            return false;
        if (other.getDeprecationMessage() != null && other.getDeprecationMessage().equals(this.getDeprecationMessage()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getStructFullyQualifiedName() == null ^ this.getStructFullyQualifiedName() == null)
            return false;
        if (other.getStructFullyQualifiedName() != null && other.getStructFullyQualifiedName().equals(this.getStructFullyQualifiedName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFullyQualifiedName() == null) ? 0 : getFullyQualifiedName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDataEncoding() == null) ? 0 : getDataEncoding().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeprecationMessage() == null) ? 0 : getDeprecationMessage().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getStructFullyQualifiedName() == null) ? 0 : getStructFullyQualifiedName().hashCode());
        return hashCode;
    }

    @Override
    public CustomProperty clone() {
        try {
            return (CustomProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.CustomPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
