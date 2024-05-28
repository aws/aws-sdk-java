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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The warnings generated for a specific resource for this generated template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/WarningDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WarningDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The type of this warning. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/generate-IaC-write-only-properties.html">IaC
     * generator and write-only properties</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_PROPERTIES</code> - The resource requires mutually-exclusive write-only properties. The
     * IaC generator selects one set of mutually exclusive properties and converts the included properties into
     * parameters. The parameter names have a suffix <code>OneOf</code> and the parameter descriptions indicate that the
     * corresponding property can be replaced with other exclusive properties.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED_PROPERTIES</code> - Unsupported properties are present in the resource. One example of
     * unsupported properties would be a required write-only property that is an array, because a parameter cannot be an
     * array. Another example is an optional write-only property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_TYPES</code> - One or more required write-only properties are found in the resource, and
     * the type of that property can be any of several types.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently the resource and property reference documentation does not indicate if a property uses a type of
     * <code>oneOf</code> or <code>anyOf</code>. You need to look at the resource provider schema.
     * </p>
     * </note>
     */
    private String type;
    /**
     * <p>
     * The properties of the resource that are impacted by this warning.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<WarningProperty> properties;

    /**
     * <p>
     * The type of this warning. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/generate-IaC-write-only-properties.html">IaC
     * generator and write-only properties</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_PROPERTIES</code> - The resource requires mutually-exclusive write-only properties. The
     * IaC generator selects one set of mutually exclusive properties and converts the included properties into
     * parameters. The parameter names have a suffix <code>OneOf</code> and the parameter descriptions indicate that the
     * corresponding property can be replaced with other exclusive properties.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED_PROPERTIES</code> - Unsupported properties are present in the resource. One example of
     * unsupported properties would be a required write-only property that is an array, because a parameter cannot be an
     * array. Another example is an optional write-only property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_TYPES</code> - One or more required write-only properties are found in the resource, and
     * the type of that property can be any of several types.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently the resource and property reference documentation does not indicate if a property uses a type of
     * <code>oneOf</code> or <code>anyOf</code>. You need to look at the resource provider schema.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of this warning. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/generate-IaC-write-only-properties.html"
     *        >IaC generator and write-only properties</a> in the <i>CloudFormation User Guide</i>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MUTUALLY_EXCLUSIVE_PROPERTIES</code> - The resource requires mutually-exclusive write-only
     *        properties. The IaC generator selects one set of mutually exclusive properties and converts the included
     *        properties into parameters. The parameter names have a suffix <code>OneOf</code> and the parameter
     *        descriptions indicate that the corresponding property can be replaced with other exclusive properties.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNSUPPORTED_PROPERTIES</code> - Unsupported properties are present in the resource. One example of
     *        unsupported properties would be a required write-only property that is an array, because a parameter
     *        cannot be an array. Another example is an optional write-only property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MUTUALLY_EXCLUSIVE_TYPES</code> - One or more required write-only properties are found in the
     *        resource, and the type of that property can be any of several types.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Currently the resource and property reference documentation does not indicate if a property uses a type of
     *        <code>oneOf</code> or <code>anyOf</code>. You need to look at the resource provider schema.
     *        </p>
     * @see WarningType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of this warning. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/generate-IaC-write-only-properties.html">IaC
     * generator and write-only properties</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_PROPERTIES</code> - The resource requires mutually-exclusive write-only properties. The
     * IaC generator selects one set of mutually exclusive properties and converts the included properties into
     * parameters. The parameter names have a suffix <code>OneOf</code> and the parameter descriptions indicate that the
     * corresponding property can be replaced with other exclusive properties.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED_PROPERTIES</code> - Unsupported properties are present in the resource. One example of
     * unsupported properties would be a required write-only property that is an array, because a parameter cannot be an
     * array. Another example is an optional write-only property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_TYPES</code> - One or more required write-only properties are found in the resource, and
     * the type of that property can be any of several types.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently the resource and property reference documentation does not indicate if a property uses a type of
     * <code>oneOf</code> or <code>anyOf</code>. You need to look at the resource provider schema.
     * </p>
     * </note>
     * 
     * @return The type of this warning. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/generate-IaC-write-only-properties.html"
     *         >IaC generator and write-only properties</a> in the <i>CloudFormation User Guide</i>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MUTUALLY_EXCLUSIVE_PROPERTIES</code> - The resource requires mutually-exclusive write-only
     *         properties. The IaC generator selects one set of mutually exclusive properties and converts the included
     *         properties into parameters. The parameter names have a suffix <code>OneOf</code> and the parameter
     *         descriptions indicate that the corresponding property can be replaced with other exclusive properties.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNSUPPORTED_PROPERTIES</code> - Unsupported properties are present in the resource. One example of
     *         unsupported properties would be a required write-only property that is an array, because a parameter
     *         cannot be an array. Another example is an optional write-only property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MUTUALLY_EXCLUSIVE_TYPES</code> - One or more required write-only properties are found in the
     *         resource, and the type of that property can be any of several types.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Currently the resource and property reference documentation does not indicate if a property uses a type
     *         of <code>oneOf</code> or <code>anyOf</code>. You need to look at the resource provider schema.
     *         </p>
     * @see WarningType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of this warning. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/generate-IaC-write-only-properties.html">IaC
     * generator and write-only properties</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_PROPERTIES</code> - The resource requires mutually-exclusive write-only properties. The
     * IaC generator selects one set of mutually exclusive properties and converts the included properties into
     * parameters. The parameter names have a suffix <code>OneOf</code> and the parameter descriptions indicate that the
     * corresponding property can be replaced with other exclusive properties.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED_PROPERTIES</code> - Unsupported properties are present in the resource. One example of
     * unsupported properties would be a required write-only property that is an array, because a parameter cannot be an
     * array. Another example is an optional write-only property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_TYPES</code> - One or more required write-only properties are found in the resource, and
     * the type of that property can be any of several types.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently the resource and property reference documentation does not indicate if a property uses a type of
     * <code>oneOf</code> or <code>anyOf</code>. You need to look at the resource provider schema.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of this warning. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/generate-IaC-write-only-properties.html"
     *        >IaC generator and write-only properties</a> in the <i>CloudFormation User Guide</i>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MUTUALLY_EXCLUSIVE_PROPERTIES</code> - The resource requires mutually-exclusive write-only
     *        properties. The IaC generator selects one set of mutually exclusive properties and converts the included
     *        properties into parameters. The parameter names have a suffix <code>OneOf</code> and the parameter
     *        descriptions indicate that the corresponding property can be replaced with other exclusive properties.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNSUPPORTED_PROPERTIES</code> - Unsupported properties are present in the resource. One example of
     *        unsupported properties would be a required write-only property that is an array, because a parameter
     *        cannot be an array. Another example is an optional write-only property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MUTUALLY_EXCLUSIVE_TYPES</code> - One or more required write-only properties are found in the
     *        resource, and the type of that property can be any of several types.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Currently the resource and property reference documentation does not indicate if a property uses a type of
     *        <code>oneOf</code> or <code>anyOf</code>. You need to look at the resource provider schema.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarningType
     */

    public WarningDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of this warning. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/generate-IaC-write-only-properties.html">IaC
     * generator and write-only properties</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_PROPERTIES</code> - The resource requires mutually-exclusive write-only properties. The
     * IaC generator selects one set of mutually exclusive properties and converts the included properties into
     * parameters. The parameter names have a suffix <code>OneOf</code> and the parameter descriptions indicate that the
     * corresponding property can be replaced with other exclusive properties.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED_PROPERTIES</code> - Unsupported properties are present in the resource. One example of
     * unsupported properties would be a required write-only property that is an array, because a parameter cannot be an
     * array. Another example is an optional write-only property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUALLY_EXCLUSIVE_TYPES</code> - One or more required write-only properties are found in the resource, and
     * the type of that property can be any of several types.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Currently the resource and property reference documentation does not indicate if a property uses a type of
     * <code>oneOf</code> or <code>anyOf</code>. You need to look at the resource provider schema.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of this warning. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/generate-IaC-write-only-properties.html"
     *        >IaC generator and write-only properties</a> in the <i>CloudFormation User Guide</i>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MUTUALLY_EXCLUSIVE_PROPERTIES</code> - The resource requires mutually-exclusive write-only
     *        properties. The IaC generator selects one set of mutually exclusive properties and converts the included
     *        properties into parameters. The parameter names have a suffix <code>OneOf</code> and the parameter
     *        descriptions indicate that the corresponding property can be replaced with other exclusive properties.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNSUPPORTED_PROPERTIES</code> - Unsupported properties are present in the resource. One example of
     *        unsupported properties would be a required write-only property that is an array, because a parameter
     *        cannot be an array. Another example is an optional write-only property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MUTUALLY_EXCLUSIVE_TYPES</code> - One or more required write-only properties are found in the
     *        resource, and the type of that property can be any of several types.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Currently the resource and property reference documentation does not indicate if a property uses a type of
     *        <code>oneOf</code> or <code>anyOf</code>. You need to look at the resource provider schema.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarningType
     */

    public WarningDetail withType(WarningType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The properties of the resource that are impacted by this warning.
     * </p>
     * 
     * @return The properties of the resource that are impacted by this warning.
     */

    public java.util.List<WarningProperty> getProperties() {
        if (properties == null) {
            properties = new com.amazonaws.internal.SdkInternalList<WarningProperty>();
        }
        return properties;
    }

    /**
     * <p>
     * The properties of the resource that are impacted by this warning.
     * </p>
     * 
     * @param properties
     *        The properties of the resource that are impacted by this warning.
     */

    public void setProperties(java.util.Collection<WarningProperty> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new com.amazonaws.internal.SdkInternalList<WarningProperty>(properties);
    }

    /**
     * <p>
     * The properties of the resource that are impacted by this warning.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        The properties of the resource that are impacted by this warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarningDetail withProperties(WarningProperty... properties) {
        if (this.properties == null) {
            setProperties(new com.amazonaws.internal.SdkInternalList<WarningProperty>(properties.length));
        }
        for (WarningProperty ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties of the resource that are impacted by this warning.
     * </p>
     * 
     * @param properties
     *        The properties of the resource that are impacted by this warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarningDetail withProperties(java.util.Collection<WarningProperty> properties) {
        setProperties(properties);
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
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WarningDetail == false)
            return false;
        WarningDetail other = (WarningDetail) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public WarningDetail clone() {
        try {
            return (WarningDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
