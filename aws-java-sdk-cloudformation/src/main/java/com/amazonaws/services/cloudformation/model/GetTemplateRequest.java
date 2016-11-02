/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for a <a>GetTemplate</a> action.
 * </p>
 */
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
     * Returns the template for a change set using the Amazon Resource Name (ARN) or name of the change set. If you
     * specify a name, you must also specify the <code>StackName</code>.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * The stage of the template that is returned. Valid values are <code>Original</code> and <code>Processed</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Original</code> - Use to return the specified pre-transform template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> - Use to return the template after all transforms have been processed.
     * </p>
     * </li>
     * </ul>
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
     * Returns the template for a change set using the Amazon Resource Name (ARN) or name of the change set. If you
     * specify a name, you must also specify the <code>StackName</code>.
     * </p>
     * 
     * @param changeSetName
     *        Returns the template for a change set using the Amazon Resource Name (ARN) or name of the change set. If
     *        you specify a name, you must also specify the <code>StackName</code>.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * Returns the template for a change set using the Amazon Resource Name (ARN) or name of the change set. If you
     * specify a name, you must also specify the <code>StackName</code>.
     * </p>
     * 
     * @return Returns the template for a change set using the Amazon Resource Name (ARN) or name of the change set. If
     *         you specify a name, you must also specify the <code>StackName</code>.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * Returns the template for a change set using the Amazon Resource Name (ARN) or name of the change set. If you
     * specify a name, you must also specify the <code>StackName</code>.
     * </p>
     * 
     * @param changeSetName
     *        Returns the template for a change set using the Amazon Resource Name (ARN) or name of the change set. If
     *        you specify a name, you must also specify the <code>StackName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateRequest withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * The stage of the template that is returned. Valid values are <code>Original</code> and <code>Processed</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Original</code> - Use to return the specified pre-transform template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> - Use to return the template after all transforms have been processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param templateStage
     *        The stage of the template that is returned. Valid values are <code>Original</code> and
     *        <code>Processed</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Original</code> - Use to return the specified pre-transform template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processed</code> - Use to return the template after all transforms have been processed.
     *        </p>
     *        </li>
     * @see TemplateStage
     */

    public void setTemplateStage(String templateStage) {
        this.templateStage = templateStage;
    }

    /**
     * <p>
     * The stage of the template that is returned. Valid values are <code>Original</code> and <code>Processed</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Original</code> - Use to return the specified pre-transform template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> - Use to return the template after all transforms have been processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The stage of the template that is returned. Valid values are <code>Original</code> and
     *         <code>Processed</code>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Original</code> - Use to return the specified pre-transform template.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Processed</code> - Use to return the template after all transforms have been processed.
     *         </p>
     *         </li>
     * @see TemplateStage
     */

    public String getTemplateStage() {
        return this.templateStage;
    }

    /**
     * <p>
     * The stage of the template that is returned. Valid values are <code>Original</code> and <code>Processed</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Original</code> - Use to return the specified pre-transform template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> - Use to return the template after all transforms have been processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param templateStage
     *        The stage of the template that is returned. Valid values are <code>Original</code> and
     *        <code>Processed</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Original</code> - Use to return the specified pre-transform template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processed</code> - Use to return the template after all transforms have been processed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStage
     */

    public GetTemplateRequest withTemplateStage(String templateStage) {
        setTemplateStage(templateStage);
        return this;
    }

    /**
     * <p>
     * The stage of the template that is returned. Valid values are <code>Original</code> and <code>Processed</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Original</code> - Use to return the specified pre-transform template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> - Use to return the template after all transforms have been processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param templateStage
     *        The stage of the template that is returned. Valid values are <code>Original</code> and
     *        <code>Processed</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Original</code> - Use to return the specified pre-transform template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processed</code> - Use to return the template after all transforms have been processed.
     *        </p>
     *        </li>
     * @see TemplateStage
     */

    public void setTemplateStage(TemplateStage templateStage) {
        this.templateStage = templateStage.toString();
    }

    /**
     * <p>
     * The stage of the template that is returned. Valid values are <code>Original</code> and <code>Processed</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Original</code> - Use to return the specified pre-transform template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> - Use to return the template after all transforms have been processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param templateStage
     *        The stage of the template that is returned. Valid values are <code>Original</code> and
     *        <code>Processed</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Original</code> - Use to return the specified pre-transform template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processed</code> - Use to return the template after all transforms have been processed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStage
     */

    public GetTemplateRequest withTemplateStage(TemplateStage templateStage) {
        setTemplateStage(templateStage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("StackName: " + getStackName() + ",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getTemplateStage() != null)
            sb.append("TemplateStage: " + getTemplateStage());
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
