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
 * The configuration details of a generated template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TemplateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>DeletionPolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the stack is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the stack is deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html"
     * >DeletionPolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     */
    private String deletionPolicy;
    /**
     * <p>
     * The <code>UpdateReplacePolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html"
     * >UpdateReplacePolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     */
    private String updateReplacePolicy;

    /**
     * <p>
     * The <code>DeletionPolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the stack is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the stack is deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html"
     * >DeletionPolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param deletionPolicy
     *        The <code>DeletionPolicy</code> assigned to resources in the generated template. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - delete all resources when the stack is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETAIN</code> - retain all resources when the stack is deleted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html"
     *        >DeletionPolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * @see GeneratedTemplateDeletionPolicy
     */

    public void setDeletionPolicy(String deletionPolicy) {
        this.deletionPolicy = deletionPolicy;
    }

    /**
     * <p>
     * The <code>DeletionPolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the stack is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the stack is deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html"
     * >DeletionPolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @return The <code>DeletionPolicy</code> assigned to resources in the generated template. Supported values
     *         are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETE</code> - delete all resources when the stack is deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RETAIN</code> - retain all resources when the stack is deleted.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html"
     *         >DeletionPolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * @see GeneratedTemplateDeletionPolicy
     */

    public String getDeletionPolicy() {
        return this.deletionPolicy;
    }

    /**
     * <p>
     * The <code>DeletionPolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the stack is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the stack is deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html"
     * >DeletionPolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param deletionPolicy
     *        The <code>DeletionPolicy</code> assigned to resources in the generated template. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - delete all resources when the stack is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETAIN</code> - retain all resources when the stack is deleted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html"
     *        >DeletionPolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateDeletionPolicy
     */

    public TemplateConfiguration withDeletionPolicy(String deletionPolicy) {
        setDeletionPolicy(deletionPolicy);
        return this;
    }

    /**
     * <p>
     * The <code>DeletionPolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the stack is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the stack is deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html"
     * >DeletionPolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param deletionPolicy
     *        The <code>DeletionPolicy</code> assigned to resources in the generated template. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - delete all resources when the stack is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETAIN</code> - retain all resources when the stack is deleted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html"
     *        >DeletionPolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateDeletionPolicy
     */

    public TemplateConfiguration withDeletionPolicy(GeneratedTemplateDeletionPolicy deletionPolicy) {
        this.deletionPolicy = deletionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The <code>UpdateReplacePolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html"
     * >UpdateReplacePolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param updateReplacePolicy
     *        The <code>UpdateReplacePolicy</code> assigned to resources in the generated template. Supported values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - delete all resources when the resource is replaced during an update operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETAIN</code> - retain all resources when the resource is replaced during an update operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html"
     *        >UpdateReplacePolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * @see GeneratedTemplateUpdateReplacePolicy
     */

    public void setUpdateReplacePolicy(String updateReplacePolicy) {
        this.updateReplacePolicy = updateReplacePolicy;
    }

    /**
     * <p>
     * The <code>UpdateReplacePolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html"
     * >UpdateReplacePolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @return The <code>UpdateReplacePolicy</code> assigned to resources in the generated template. Supported values
     *         are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETE</code> - delete all resources when the resource is replaced during an update operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RETAIN</code> - retain all resources when the resource is replaced during an update operation.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html"
     *         >UpdateReplacePolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * @see GeneratedTemplateUpdateReplacePolicy
     */

    public String getUpdateReplacePolicy() {
        return this.updateReplacePolicy;
    }

    /**
     * <p>
     * The <code>UpdateReplacePolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html"
     * >UpdateReplacePolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param updateReplacePolicy
     *        The <code>UpdateReplacePolicy</code> assigned to resources in the generated template. Supported values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - delete all resources when the resource is replaced during an update operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETAIN</code> - retain all resources when the resource is replaced during an update operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html"
     *        >UpdateReplacePolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateUpdateReplacePolicy
     */

    public TemplateConfiguration withUpdateReplacePolicy(String updateReplacePolicy) {
        setUpdateReplacePolicy(updateReplacePolicy);
        return this;
    }

    /**
     * <p>
     * The <code>UpdateReplacePolicy</code> assigned to resources in the generated template. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETE</code> - delete all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> - retain all resources when the resource is replaced during an update operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html"
     * >UpdateReplacePolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param updateReplacePolicy
     *        The <code>UpdateReplacePolicy</code> assigned to resources in the generated template. Supported values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETE</code> - delete all resources when the resource is replaced during an update operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETAIN</code> - retain all resources when the resource is replaced during an update operation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html"
     *        >UpdateReplacePolicy attribute</a> in the <i>CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateUpdateReplacePolicy
     */

    public TemplateConfiguration withUpdateReplacePolicy(GeneratedTemplateUpdateReplacePolicy updateReplacePolicy) {
        this.updateReplacePolicy = updateReplacePolicy.toString();
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
        if (getDeletionPolicy() != null)
            sb.append("DeletionPolicy: ").append(getDeletionPolicy()).append(",");
        if (getUpdateReplacePolicy() != null)
            sb.append("UpdateReplacePolicy: ").append(getUpdateReplacePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateConfiguration == false)
            return false;
        TemplateConfiguration other = (TemplateConfiguration) obj;
        if (other.getDeletionPolicy() == null ^ this.getDeletionPolicy() == null)
            return false;
        if (other.getDeletionPolicy() != null && other.getDeletionPolicy().equals(this.getDeletionPolicy()) == false)
            return false;
        if (other.getUpdateReplacePolicy() == null ^ this.getUpdateReplacePolicy() == null)
            return false;
        if (other.getUpdateReplacePolicy() != null && other.getUpdateReplacePolicy().equals(this.getUpdateReplacePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletionPolicy() == null) ? 0 : getDeletionPolicy().hashCode());
        hashCode = prime * hashCode + ((getUpdateReplacePolicy() == null) ? 0 : getUpdateReplacePolicy().hashCode());
        return hashCode;
    }

    @Override
    public TemplateConfiguration clone() {
        try {
            return (TemplateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
