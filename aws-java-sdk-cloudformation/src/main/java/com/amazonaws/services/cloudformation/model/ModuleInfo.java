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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the module from which the resource was created, if the resource was created from a module
 * included in the stack template.
 * </p>
 * <p>
 * For more information on modules, see <a href="AWSCloudFormation/latest/UserGuide/modules.html">Using modules to
 * encapsulate and reuse resource configurations</a> in the <i>CloudFormation User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ModuleInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModuleInfo implements Serializable, Cloneable {

    /**
     * <p>
     * A concantenated list of the the module type or types containing the resource. Module types are listed starting
     * with the inner-most nested module, and separated by <code>/</code>.
     * </p>
     * <p>
     * In the following example, the resource was created from a module of type <code>AWS::First::Example::MODULE</code>
     * , that is nested inside a parent module of type <code>AWS::Second::Example::MODULE</code>.
     * </p>
     * <p>
     * <code>AWS::First::Example::MODULE/AWS::Second::Example::MODULE</code>
     * </p>
     */
    private String typeHierarchy;
    /**
     * <p>
     * A concantenated list of the logical IDs of the module or modules containing the resource. Modules are listed
     * starting with the inner-most nested module, and separated by <code>/</code>.
     * </p>
     * <p>
     * In the following example, the resource was created from a module, <code>moduleA</code>, that is nested inside a
     * parent module, <code>moduleB</code>.
     * </p>
     * <p>
     * <code>moduleA/moduleB</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/modules.html#module-ref-resources">Referencing resources in a module</a>
     * in the <i>CloudFormation User Guide</i>.
     * </p>
     */
    private String logicalIdHierarchy;

    /**
     * <p>
     * A concantenated list of the the module type or types containing the resource. Module types are listed starting
     * with the inner-most nested module, and separated by <code>/</code>.
     * </p>
     * <p>
     * In the following example, the resource was created from a module of type <code>AWS::First::Example::MODULE</code>
     * , that is nested inside a parent module of type <code>AWS::Second::Example::MODULE</code>.
     * </p>
     * <p>
     * <code>AWS::First::Example::MODULE/AWS::Second::Example::MODULE</code>
     * </p>
     * 
     * @param typeHierarchy
     *        A concantenated list of the the module type or types containing the resource. Module types are listed
     *        starting with the inner-most nested module, and separated by <code>/</code>.</p>
     *        <p>
     *        In the following example, the resource was created from a module of type
     *        <code>AWS::First::Example::MODULE</code>, that is nested inside a parent module of type
     *        <code>AWS::Second::Example::MODULE</code>.
     *        </p>
     *        <p>
     *        <code>AWS::First::Example::MODULE/AWS::Second::Example::MODULE</code>
     */

    public void setTypeHierarchy(String typeHierarchy) {
        this.typeHierarchy = typeHierarchy;
    }

    /**
     * <p>
     * A concantenated list of the the module type or types containing the resource. Module types are listed starting
     * with the inner-most nested module, and separated by <code>/</code>.
     * </p>
     * <p>
     * In the following example, the resource was created from a module of type <code>AWS::First::Example::MODULE</code>
     * , that is nested inside a parent module of type <code>AWS::Second::Example::MODULE</code>.
     * </p>
     * <p>
     * <code>AWS::First::Example::MODULE/AWS::Second::Example::MODULE</code>
     * </p>
     * 
     * @return A concantenated list of the the module type or types containing the resource. Module types are listed
     *         starting with the inner-most nested module, and separated by <code>/</code>.</p>
     *         <p>
     *         In the following example, the resource was created from a module of type
     *         <code>AWS::First::Example::MODULE</code>, that is nested inside a parent module of type
     *         <code>AWS::Second::Example::MODULE</code>.
     *         </p>
     *         <p>
     *         <code>AWS::First::Example::MODULE/AWS::Second::Example::MODULE</code>
     */

    public String getTypeHierarchy() {
        return this.typeHierarchy;
    }

    /**
     * <p>
     * A concantenated list of the the module type or types containing the resource. Module types are listed starting
     * with the inner-most nested module, and separated by <code>/</code>.
     * </p>
     * <p>
     * In the following example, the resource was created from a module of type <code>AWS::First::Example::MODULE</code>
     * , that is nested inside a parent module of type <code>AWS::Second::Example::MODULE</code>.
     * </p>
     * <p>
     * <code>AWS::First::Example::MODULE/AWS::Second::Example::MODULE</code>
     * </p>
     * 
     * @param typeHierarchy
     *        A concantenated list of the the module type or types containing the resource. Module types are listed
     *        starting with the inner-most nested module, and separated by <code>/</code>.</p>
     *        <p>
     *        In the following example, the resource was created from a module of type
     *        <code>AWS::First::Example::MODULE</code>, that is nested inside a parent module of type
     *        <code>AWS::Second::Example::MODULE</code>.
     *        </p>
     *        <p>
     *        <code>AWS::First::Example::MODULE/AWS::Second::Example::MODULE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModuleInfo withTypeHierarchy(String typeHierarchy) {
        setTypeHierarchy(typeHierarchy);
        return this;
    }

    /**
     * <p>
     * A concantenated list of the logical IDs of the module or modules containing the resource. Modules are listed
     * starting with the inner-most nested module, and separated by <code>/</code>.
     * </p>
     * <p>
     * In the following example, the resource was created from a module, <code>moduleA</code>, that is nested inside a
     * parent module, <code>moduleB</code>.
     * </p>
     * <p>
     * <code>moduleA/moduleB</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/modules.html#module-ref-resources">Referencing resources in a module</a>
     * in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param logicalIdHierarchy
     *        A concantenated list of the logical IDs of the module or modules containing the resource. Modules are
     *        listed starting with the inner-most nested module, and separated by <code>/</code>.</p>
     *        <p>
     *        In the following example, the resource was created from a module, <code>moduleA</code>, that is nested
     *        inside a parent module, <code>moduleB</code>.
     *        </p>
     *        <p>
     *        <code>moduleA/moduleB</code>
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="AWSCloudFormation/latest/UserGuide/modules.html#module-ref-resources">Referencing resources in a
     *        module</a> in the <i>CloudFormation User Guide</i>.
     */

    public void setLogicalIdHierarchy(String logicalIdHierarchy) {
        this.logicalIdHierarchy = logicalIdHierarchy;
    }

    /**
     * <p>
     * A concantenated list of the logical IDs of the module or modules containing the resource. Modules are listed
     * starting with the inner-most nested module, and separated by <code>/</code>.
     * </p>
     * <p>
     * In the following example, the resource was created from a module, <code>moduleA</code>, that is nested inside a
     * parent module, <code>moduleB</code>.
     * </p>
     * <p>
     * <code>moduleA/moduleB</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/modules.html#module-ref-resources">Referencing resources in a module</a>
     * in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @return A concantenated list of the logical IDs of the module or modules containing the resource. Modules are
     *         listed starting with the inner-most nested module, and separated by <code>/</code>.</p>
     *         <p>
     *         In the following example, the resource was created from a module, <code>moduleA</code>, that is nested
     *         inside a parent module, <code>moduleB</code>.
     *         </p>
     *         <p>
     *         <code>moduleA/moduleB</code>
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="AWSCloudFormation/latest/UserGuide/modules.html#module-ref-resources">Referencing resources in a
     *         module</a> in the <i>CloudFormation User Guide</i>.
     */

    public String getLogicalIdHierarchy() {
        return this.logicalIdHierarchy;
    }

    /**
     * <p>
     * A concantenated list of the logical IDs of the module or modules containing the resource. Modules are listed
     * starting with the inner-most nested module, and separated by <code>/</code>.
     * </p>
     * <p>
     * In the following example, the resource was created from a module, <code>moduleA</code>, that is nested inside a
     * parent module, <code>moduleB</code>.
     * </p>
     * <p>
     * <code>moduleA/moduleB</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/modules.html#module-ref-resources">Referencing resources in a module</a>
     * in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param logicalIdHierarchy
     *        A concantenated list of the logical IDs of the module or modules containing the resource. Modules are
     *        listed starting with the inner-most nested module, and separated by <code>/</code>.</p>
     *        <p>
     *        In the following example, the resource was created from a module, <code>moduleA</code>, that is nested
     *        inside a parent module, <code>moduleB</code>.
     *        </p>
     *        <p>
     *        <code>moduleA/moduleB</code>
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="AWSCloudFormation/latest/UserGuide/modules.html#module-ref-resources">Referencing resources in a
     *        module</a> in the <i>CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModuleInfo withLogicalIdHierarchy(String logicalIdHierarchy) {
        setLogicalIdHierarchy(logicalIdHierarchy);
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
        if (getTypeHierarchy() != null)
            sb.append("TypeHierarchy: ").append(getTypeHierarchy()).append(",");
        if (getLogicalIdHierarchy() != null)
            sb.append("LogicalIdHierarchy: ").append(getLogicalIdHierarchy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModuleInfo == false)
            return false;
        ModuleInfo other = (ModuleInfo) obj;
        if (other.getTypeHierarchy() == null ^ this.getTypeHierarchy() == null)
            return false;
        if (other.getTypeHierarchy() != null && other.getTypeHierarchy().equals(this.getTypeHierarchy()) == false)
            return false;
        if (other.getLogicalIdHierarchy() == null ^ this.getLogicalIdHierarchy() == null)
            return false;
        if (other.getLogicalIdHierarchy() != null && other.getLogicalIdHierarchy().equals(this.getLogicalIdHierarchy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeHierarchy() == null) ? 0 : getTypeHierarchy().hashCode());
        hashCode = prime * hashCode + ((getLogicalIdHierarchy() == null) ? 0 : getLogicalIdHierarchy().hashCode());
        return hashCode;
    }

    @Override
    public ModuleInfo clone() {
        try {
            return (ModuleInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
