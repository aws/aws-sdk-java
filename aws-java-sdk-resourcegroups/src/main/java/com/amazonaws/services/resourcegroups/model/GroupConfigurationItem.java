/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An item in a group configuration. A group service configuration can have one or more items. For details about group
 * service configuration syntax, see <a
 * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
 * groups</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupConfigurationItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupConfigurationItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>. For the
     * list of types that you can specify for a configuration item, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported resource
     * types and parameters</a>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A collection of parameters for this group configuration item. For the list of parameters that you can use with
     * each configuration item type, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported resource
     * types and parameters</a>.
     * </p>
     */
    private java.util.List<GroupConfigurationParameter> parameters;

    /**
     * <p>
     * Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>. For the
     * list of types that you can specify for a configuration item, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported resource
     * types and parameters</a>.
     * </p>
     * 
     * @param type
     *        Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>.
     *        For the list of types that you can specify for a configuration item, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported
     *        resource types and parameters</a>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>. For the
     * list of types that you can specify for a configuration item, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported resource
     * types and parameters</a>.
     * </p>
     * 
     * @return Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>.
     *         For the list of types that you can specify for a configuration item, see <a
     *         href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported
     *         resource types and parameters</a>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>. For the
     * list of types that you can specify for a configuration item, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported resource
     * types and parameters</a>.
     * </p>
     * 
     * @param type
     *        Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>.
     *        For the list of types that you can specify for a configuration item, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported
     *        resource types and parameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfigurationItem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A collection of parameters for this group configuration item. For the list of parameters that you can use with
     * each configuration item type, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported resource
     * types and parameters</a>.
     * </p>
     * 
     * @return A collection of parameters for this group configuration item. For the list of parameters that you can use
     *         with each configuration item type, see <a
     *         href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported
     *         resource types and parameters</a>.
     */

    public java.util.List<GroupConfigurationParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A collection of parameters for this group configuration item. For the list of parameters that you can use with
     * each configuration item type, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported resource
     * types and parameters</a>.
     * </p>
     * 
     * @param parameters
     *        A collection of parameters for this group configuration item. For the list of parameters that you can use
     *        with each configuration item type, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported
     *        resource types and parameters</a>.
     */

    public void setParameters(java.util.Collection<GroupConfigurationParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<GroupConfigurationParameter>(parameters);
    }

    /**
     * <p>
     * A collection of parameters for this group configuration item. For the list of parameters that you can use with
     * each configuration item type, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported resource
     * types and parameters</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A collection of parameters for this group configuration item. For the list of parameters that you can use
     *        with each configuration item type, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported
     *        resource types and parameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfigurationItem withParameters(GroupConfigurationParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<GroupConfigurationParameter>(parameters.length));
        }
        for (GroupConfigurationParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of parameters for this group configuration item. For the list of parameters that you can use with
     * each configuration item type, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported resource
     * types and parameters</a>.
     * </p>
     * 
     * @param parameters
     *        A collection of parameters for this group configuration item. For the list of parameters that you can use
     *        with each configuration item type, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types">Supported
     *        resource types and parameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfigurationItem withParameters(java.util.Collection<GroupConfigurationParameter> parameters) {
        setParameters(parameters);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupConfigurationItem == false)
            return false;
        GroupConfigurationItem other = (GroupConfigurationItem) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public GroupConfigurationItem clone() {
        try {
            return (GroupConfigurationItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.GroupConfigurationItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
