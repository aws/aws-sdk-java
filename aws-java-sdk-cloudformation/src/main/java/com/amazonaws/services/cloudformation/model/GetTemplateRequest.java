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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for a <a>GetTemplate</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated
     * template. If you specify a name, you must also specify the <code>StackName</code>.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the
     * user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the same
     * template. By default, AWS CloudFormation specifies <code>Original</code>.
     * </p>
     */
    private String templateStage;

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack, which are not always
     *        interchangeable:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running stacks: You can specify either the stack's name or its unique stack ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deleted stacks: You must specify the unique stack ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: There is no default value.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @return The name or the unique stack ID that is associated with the stack, which are not always
     *         interchangeable:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Running stacks: You can specify either the stack's name or its unique stack ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deleted stacks: You must specify the unique stack ID.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: There is no default value.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack, which are not always
     *        interchangeable:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running stacks: You can specify either the stack's name or its unique stack ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deleted stacks: You must specify the unique stack ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: There is no default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated
     * template. If you specify a name, you must also specify the <code>StackName</code>.
     * </p>
     * 
     * @param changeSetName
     *        The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated
     *        template. If you specify a name, you must also specify the <code>StackName</code>.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated
     * template. If you specify a name, you must also specify the <code>StackName</code>.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the
     *         associated template. If you specify a name, you must also specify the <code>StackName</code>.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated
     * template. If you specify a name, you must also specify the <code>StackName</code>.
     * </p>
     * 
     * @param changeSetName
     *        The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated
     *        template. If you specify a name, you must also specify the <code>StackName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateRequest withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the
     * user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the same
     * template. By default, AWS CloudFormation specifies <code>Original</code>.
     * </p>
     * 
     * @param templateStage
     *        For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get
     *        the user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation
     *        has processed all transforms, specify <code>Processed</code>. </p>
     *        <p>
     *        If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the
     *        same template. By default, AWS CloudFormation specifies <code>Original</code>.
     * @see TemplateStage
     */

    public void setTemplateStage(String templateStage) {
        this.templateStage = templateStage;
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the
     * user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the same
     * template. By default, AWS CloudFormation specifies <code>Original</code>.
     * </p>
     * 
     * @return For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get
     *         the user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation
     *         has processed all transforms, specify <code>Processed</code>. </p>
     *         <p>
     *         If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the
     *         same template. By default, AWS CloudFormation specifies <code>Original</code>.
     * @see TemplateStage
     */

    public String getTemplateStage() {
        return this.templateStage;
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the
     * user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the same
     * template. By default, AWS CloudFormation specifies <code>Original</code>.
     * </p>
     * 
     * @param templateStage
     *        For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get
     *        the user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation
     *        has processed all transforms, specify <code>Processed</code>. </p>
     *        <p>
     *        If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the
     *        same template. By default, AWS CloudFormation specifies <code>Original</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStage
     */

    public GetTemplateRequest withTemplateStage(String templateStage) {
        setTemplateStage(templateStage);
        return this;
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the
     * user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the same
     * template. By default, AWS CloudFormation specifies <code>Original</code>.
     * </p>
     * 
     * @param templateStage
     *        For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get
     *        the user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation
     *        has processed all transforms, specify <code>Processed</code>. </p>
     *        <p>
     *        If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the
     *        same template. By default, AWS CloudFormation specifies <code>Original</code>.
     * @see TemplateStage
     */

    public void setTemplateStage(TemplateStage templateStage) {
        withTemplateStage(templateStage);
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the
     * user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the same
     * template. By default, AWS CloudFormation specifies <code>Original</code>.
     * </p>
     * 
     * @param templateStage
     *        For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get
     *        the user-submitted template, specify <code>Original</code>. To get the template after AWS CloudFormation
     *        has processed all transforms, specify <code>Processed</code>. </p>
     *        <p>
     *        If the template doesn't include transforms, <code>Original</code> and <code>Processed</code> return the
     *        same template. By default, AWS CloudFormation specifies <code>Original</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStage
     */

    public GetTemplateRequest withTemplateStage(TemplateStage templateStage) {
        this.templateStage = templateStage.toString();
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: ").append(getChangeSetName()).append(",");
        if (getTemplateStage() != null)
            sb.append("TemplateStage: ").append(getTemplateStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateRequest == false)
            return false;
        GetTemplateRequest other = (GetTemplateRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getTemplateStage() == null ^ this.getTemplateStage() == null)
            return false;
        if (other.getTemplateStage() != null && other.getTemplateStage().equals(this.getTemplateStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getTemplateStage() == null) ? 0 : getTemplateStage().hashCode());
        return hashCode;
    }

    @Override
    public GetTemplateRequest clone() {
        return (GetTemplateRequest) super.clone();
    }

}
