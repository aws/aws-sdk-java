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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an individual setting that controls some aspect of DAX behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/Parameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * </p>
     */
    private String parameterType;
    /**
     * <p>
     * The value for the parameter.
     * </p>
     */
    private String parameterValue;
    /**
     * <p>
     * A list of node types, and specific parameter values for each node.
     * </p>
     */
    private java.util.List<NodeTypeSpecificValue> nodeTypeSpecificValues;
    /**
     * <p>
     * A description of the parameter
     * </p>
     */
    private String description;
    /**
     * <p>
     * How the parameter is defined. For example, <code>system</code> denotes a system-defined parameter.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The data type of the parameter. For example, <code>integer</code>:
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * A range of values within which the parameter can be set.
     * </p>
     */
    private String allowedValues;
    /**
     * <p>
     * Whether the customer is allowed to modify the parameter.
     * </p>
     */
    private String isModifiable;
    /**
     * <p>
     * The conditions under which changes to this parameter can be applied. For example, <code>requires-reboot</code>
     * indicates that a new value for this parameter will only take effect if a node is rebooted.
     * </p>
     */
    private String changeType;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * </p>
     * 
     * @param parameterType
     *        Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * @see ParameterType
     */

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    /**
     * <p>
     * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * </p>
     * 
     * @return Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * @see ParameterType
     */

    public String getParameterType() {
        return this.parameterType;
    }

    /**
     * <p>
     * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * </p>
     * 
     * @param parameterType
     *        Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public Parameter withParameterType(String parameterType) {
        setParameterType(parameterType);
        return this;
    }

    /**
     * <p>
     * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * </p>
     * 
     * @param parameterType
     *        Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * @see ParameterType
     */

    public void setParameterType(ParameterType parameterType) {
        withParameterType(parameterType);
    }

    /**
     * <p>
     * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * </p>
     * 
     * @param parameterType
     *        Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public Parameter withParameterType(ParameterType parameterType) {
        this.parameterType = parameterType.toString();
        return this;
    }

    /**
     * <p>
     * The value for the parameter.
     * </p>
     * 
     * @param parameterValue
     *        The value for the parameter.
     */

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The value for the parameter.
     * </p>
     * 
     * @return The value for the parameter.
     */

    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * <p>
     * The value for the parameter.
     * </p>
     * 
     * @param parameterValue
     *        The value for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withParameterValue(String parameterValue) {
        setParameterValue(parameterValue);
        return this;
    }

    /**
     * <p>
     * A list of node types, and specific parameter values for each node.
     * </p>
     * 
     * @return A list of node types, and specific parameter values for each node.
     */

    public java.util.List<NodeTypeSpecificValue> getNodeTypeSpecificValues() {
        return nodeTypeSpecificValues;
    }

    /**
     * <p>
     * A list of node types, and specific parameter values for each node.
     * </p>
     * 
     * @param nodeTypeSpecificValues
     *        A list of node types, and specific parameter values for each node.
     */

    public void setNodeTypeSpecificValues(java.util.Collection<NodeTypeSpecificValue> nodeTypeSpecificValues) {
        if (nodeTypeSpecificValues == null) {
            this.nodeTypeSpecificValues = null;
            return;
        }

        this.nodeTypeSpecificValues = new java.util.ArrayList<NodeTypeSpecificValue>(nodeTypeSpecificValues);
    }

    /**
     * <p>
     * A list of node types, and specific parameter values for each node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeTypeSpecificValues(java.util.Collection)} or
     * {@link #withNodeTypeSpecificValues(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param nodeTypeSpecificValues
     *        A list of node types, and specific parameter values for each node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withNodeTypeSpecificValues(NodeTypeSpecificValue... nodeTypeSpecificValues) {
        if (this.nodeTypeSpecificValues == null) {
            setNodeTypeSpecificValues(new java.util.ArrayList<NodeTypeSpecificValue>(nodeTypeSpecificValues.length));
        }
        for (NodeTypeSpecificValue ele : nodeTypeSpecificValues) {
            this.nodeTypeSpecificValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of node types, and specific parameter values for each node.
     * </p>
     * 
     * @param nodeTypeSpecificValues
     *        A list of node types, and specific parameter values for each node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withNodeTypeSpecificValues(java.util.Collection<NodeTypeSpecificValue> nodeTypeSpecificValues) {
        setNodeTypeSpecificValues(nodeTypeSpecificValues);
        return this;
    }

    /**
     * <p>
     * A description of the parameter
     * </p>
     * 
     * @param description
     *        A description of the parameter
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter
     * </p>
     * 
     * @return A description of the parameter
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the parameter
     * </p>
     * 
     * @param description
     *        A description of the parameter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * How the parameter is defined. For example, <code>system</code> denotes a system-defined parameter.
     * </p>
     * 
     * @param source
     *        How the parameter is defined. For example, <code>system</code> denotes a system-defined parameter.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * How the parameter is defined. For example, <code>system</code> denotes a system-defined parameter.
     * </p>
     * 
     * @return How the parameter is defined. For example, <code>system</code> denotes a system-defined parameter.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * How the parameter is defined. For example, <code>system</code> denotes a system-defined parameter.
     * </p>
     * 
     * @param source
     *        How the parameter is defined. For example, <code>system</code> denotes a system-defined parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The data type of the parameter. For example, <code>integer</code>:
     * </p>
     * 
     * @param dataType
     *        The data type of the parameter. For example, <code>integer</code>:
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the parameter. For example, <code>integer</code>:
     * </p>
     * 
     * @return The data type of the parameter. For example, <code>integer</code>:
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the parameter. For example, <code>integer</code>:
     * </p>
     * 
     * @param dataType
     *        The data type of the parameter. For example, <code>integer</code>:
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * A range of values within which the parameter can be set.
     * </p>
     * 
     * @param allowedValues
     *        A range of values within which the parameter can be set.
     */

    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * A range of values within which the parameter can be set.
     * </p>
     * 
     * @return A range of values within which the parameter can be set.
     */

    public String getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * <p>
     * A range of values within which the parameter can be set.
     * </p>
     * 
     * @param allowedValues
     *        A range of values within which the parameter can be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withAllowedValues(String allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * Whether the customer is allowed to modify the parameter.
     * </p>
     * 
     * @param isModifiable
     *        Whether the customer is allowed to modify the parameter.
     * @see IsModifiable
     */

    public void setIsModifiable(String isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * Whether the customer is allowed to modify the parameter.
     * </p>
     * 
     * @return Whether the customer is allowed to modify the parameter.
     * @see IsModifiable
     */

    public String getIsModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * Whether the customer is allowed to modify the parameter.
     * </p>
     * 
     * @param isModifiable
     *        Whether the customer is allowed to modify the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IsModifiable
     */

    public Parameter withIsModifiable(String isModifiable) {
        setIsModifiable(isModifiable);
        return this;
    }

    /**
     * <p>
     * Whether the customer is allowed to modify the parameter.
     * </p>
     * 
     * @param isModifiable
     *        Whether the customer is allowed to modify the parameter.
     * @see IsModifiable
     */

    public void setIsModifiable(IsModifiable isModifiable) {
        withIsModifiable(isModifiable);
    }

    /**
     * <p>
     * Whether the customer is allowed to modify the parameter.
     * </p>
     * 
     * @param isModifiable
     *        Whether the customer is allowed to modify the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IsModifiable
     */

    public Parameter withIsModifiable(IsModifiable isModifiable) {
        this.isModifiable = isModifiable.toString();
        return this;
    }

    /**
     * <p>
     * The conditions under which changes to this parameter can be applied. For example, <code>requires-reboot</code>
     * indicates that a new value for this parameter will only take effect if a node is rebooted.
     * </p>
     * 
     * @param changeType
     *        The conditions under which changes to this parameter can be applied. For example,
     *        <code>requires-reboot</code> indicates that a new value for this parameter will only take effect if a node
     *        is rebooted.
     * @see ChangeType
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * The conditions under which changes to this parameter can be applied. For example, <code>requires-reboot</code>
     * indicates that a new value for this parameter will only take effect if a node is rebooted.
     * </p>
     * 
     * @return The conditions under which changes to this parameter can be applied. For example,
     *         <code>requires-reboot</code> indicates that a new value for this parameter will only take effect if a
     *         node is rebooted.
     * @see ChangeType
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * The conditions under which changes to this parameter can be applied. For example, <code>requires-reboot</code>
     * indicates that a new value for this parameter will only take effect if a node is rebooted.
     * </p>
     * 
     * @param changeType
     *        The conditions under which changes to this parameter can be applied. For example,
     *        <code>requires-reboot</code> indicates that a new value for this parameter will only take effect if a node
     *        is rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public Parameter withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * The conditions under which changes to this parameter can be applied. For example, <code>requires-reboot</code>
     * indicates that a new value for this parameter will only take effect if a node is rebooted.
     * </p>
     * 
     * @param changeType
     *        The conditions under which changes to this parameter can be applied. For example,
     *        <code>requires-reboot</code> indicates that a new value for this parameter will only take effect if a node
     *        is rebooted.
     * @see ChangeType
     */

    public void setChangeType(ChangeType changeType) {
        withChangeType(changeType);
    }

    /**
     * <p>
     * The conditions under which changes to this parameter can be applied. For example, <code>requires-reboot</code>
     * indicates that a new value for this parameter will only take effect if a node is rebooted.
     * </p>
     * 
     * @param changeType
     *        The conditions under which changes to this parameter can be applied. For example,
     *        <code>requires-reboot</code> indicates that a new value for this parameter will only take effect if a node
     *        is rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public Parameter withChangeType(ChangeType changeType) {
        this.changeType = changeType.toString();
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
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getParameterType() != null)
            sb.append("ParameterType: ").append(getParameterType()).append(",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: ").append(getParameterValue()).append(",");
        if (getNodeTypeSpecificValues() != null)
            sb.append("NodeTypeSpecificValues: ").append(getNodeTypeSpecificValues()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: ").append(getIsModifiable()).append(",");
        if (getChangeType() != null)
            sb.append("ChangeType: ").append(getChangeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterType() == null ^ this.getParameterType() == null)
            return false;
        if (other.getParameterType() != null && other.getParameterType().equals(this.getParameterType()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        if (other.getNodeTypeSpecificValues() == null ^ this.getNodeTypeSpecificValues() == null)
            return false;
        if (other.getNodeTypeSpecificValues() != null && other.getNodeTypeSpecificValues().equals(this.getNodeTypeSpecificValues()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getParameterType() == null) ? 0 : getParameterType().hashCode());
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        hashCode = prime * hashCode + ((getNodeTypeSpecificValues() == null) ? 0 : getNodeTypeSpecificValues().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        return hashCode;
    }

    @Override
    public Parameter clone() {
        try {
            return (Parameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dax.model.transform.ParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
