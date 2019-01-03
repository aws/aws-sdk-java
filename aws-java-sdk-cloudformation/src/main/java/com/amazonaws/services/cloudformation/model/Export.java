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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>Export</code> structure describes the exported output values for a stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/Export" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Export implements Serializable, Cloneable {

    /**
     * <p>
     * The stack that contains the exported output name and value.
     * </p>
     */
    private String exportingStackId;
    /**
     * <p>
     * The name of exported output value. Use this name and the <code>Fn::ImportValue</code> function to import the
     * associated value into other stacks. The name is defined in the <code>Export</code> field in the associated
     * stack's <code>Outputs</code> section.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the exported output, such as a resource physical ID. This value is defined in the
     * <code>Export</code> field in the associated stack's <code>Outputs</code> section.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The stack that contains the exported output name and value.
     * </p>
     * 
     * @param exportingStackId
     *        The stack that contains the exported output name and value.
     */

    public void setExportingStackId(String exportingStackId) {
        this.exportingStackId = exportingStackId;
    }

    /**
     * <p>
     * The stack that contains the exported output name and value.
     * </p>
     * 
     * @return The stack that contains the exported output name and value.
     */

    public String getExportingStackId() {
        return this.exportingStackId;
    }

    /**
     * <p>
     * The stack that contains the exported output name and value.
     * </p>
     * 
     * @param exportingStackId
     *        The stack that contains the exported output name and value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Export withExportingStackId(String exportingStackId) {
        setExportingStackId(exportingStackId);
        return this;
    }

    /**
     * <p>
     * The name of exported output value. Use this name and the <code>Fn::ImportValue</code> function to import the
     * associated value into other stacks. The name is defined in the <code>Export</code> field in the associated
     * stack's <code>Outputs</code> section.
     * </p>
     * 
     * @param name
     *        The name of exported output value. Use this name and the <code>Fn::ImportValue</code> function to import
     *        the associated value into other stacks. The name is defined in the <code>Export</code> field in the
     *        associated stack's <code>Outputs</code> section.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of exported output value. Use this name and the <code>Fn::ImportValue</code> function to import the
     * associated value into other stacks. The name is defined in the <code>Export</code> field in the associated
     * stack's <code>Outputs</code> section.
     * </p>
     * 
     * @return The name of exported output value. Use this name and the <code>Fn::ImportValue</code> function to import
     *         the associated value into other stacks. The name is defined in the <code>Export</code> field in the
     *         associated stack's <code>Outputs</code> section.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of exported output value. Use this name and the <code>Fn::ImportValue</code> function to import the
     * associated value into other stacks. The name is defined in the <code>Export</code> field in the associated
     * stack's <code>Outputs</code> section.
     * </p>
     * 
     * @param name
     *        The name of exported output value. Use this name and the <code>Fn::ImportValue</code> function to import
     *        the associated value into other stacks. The name is defined in the <code>Export</code> field in the
     *        associated stack's <code>Outputs</code> section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Export withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the exported output, such as a resource physical ID. This value is defined in the
     * <code>Export</code> field in the associated stack's <code>Outputs</code> section.
     * </p>
     * 
     * @param value
     *        The value of the exported output, such as a resource physical ID. This value is defined in the
     *        <code>Export</code> field in the associated stack's <code>Outputs</code> section.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the exported output, such as a resource physical ID. This value is defined in the
     * <code>Export</code> field in the associated stack's <code>Outputs</code> section.
     * </p>
     * 
     * @return The value of the exported output, such as a resource physical ID. This value is defined in the
     *         <code>Export</code> field in the associated stack's <code>Outputs</code> section.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the exported output, such as a resource physical ID. This value is defined in the
     * <code>Export</code> field in the associated stack's <code>Outputs</code> section.
     * </p>
     * 
     * @param value
     *        The value of the exported output, such as a resource physical ID. This value is defined in the
     *        <code>Export</code> field in the associated stack's <code>Outputs</code> section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Export withValue(String value) {
        setValue(value);
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
        if (getExportingStackId() != null)
            sb.append("ExportingStackId: ").append(getExportingStackId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Export == false)
            return false;
        Export other = (Export) obj;
        if (other.getExportingStackId() == null ^ this.getExportingStackId() == null)
            return false;
        if (other.getExportingStackId() != null && other.getExportingStackId().equals(this.getExportingStackId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportingStackId() == null) ? 0 : getExportingStackId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Export clone() {
        try {
            return (Export) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
