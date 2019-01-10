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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RenderUiTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenderUiTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>Template</code> object containing the worker UI template to render.
     * </p>
     */
    private UiTemplate uiTemplate;
    /**
     * <p>
     * A <code>RenderableTask</code> object containing a representative task to render.
     * </p>
     */
    private RenderableTask task;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * A <code>Template</code> object containing the worker UI template to render.
     * </p>
     * 
     * @param uiTemplate
     *        A <code>Template</code> object containing the worker UI template to render.
     */

    public void setUiTemplate(UiTemplate uiTemplate) {
        this.uiTemplate = uiTemplate;
    }

    /**
     * <p>
     * A <code>Template</code> object containing the worker UI template to render.
     * </p>
     * 
     * @return A <code>Template</code> object containing the worker UI template to render.
     */

    public UiTemplate getUiTemplate() {
        return this.uiTemplate;
    }

    /**
     * <p>
     * A <code>Template</code> object containing the worker UI template to render.
     * </p>
     * 
     * @param uiTemplate
     *        A <code>Template</code> object containing the worker UI template to render.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenderUiTemplateRequest withUiTemplate(UiTemplate uiTemplate) {
        setUiTemplate(uiTemplate);
        return this;
    }

    /**
     * <p>
     * A <code>RenderableTask</code> object containing a representative task to render.
     * </p>
     * 
     * @param task
     *        A <code>RenderableTask</code> object containing a representative task to render.
     */

    public void setTask(RenderableTask task) {
        this.task = task;
    }

    /**
     * <p>
     * A <code>RenderableTask</code> object containing a representative task to render.
     * </p>
     * 
     * @return A <code>RenderableTask</code> object containing a representative task to render.
     */

    public RenderableTask getTask() {
        return this.task;
    }

    /**
     * <p>
     * A <code>RenderableTask</code> object containing a representative task to render.
     * </p>
     * 
     * @param task
     *        A <code>RenderableTask</code> object containing a representative task to render.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenderUiTemplateRequest withTask(RenderableTask task) {
        setTask(task);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenderUiTemplateRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getUiTemplate() != null)
            sb.append("UiTemplate: ").append(getUiTemplate()).append(",");
        if (getTask() != null)
            sb.append("Task: ").append(getTask()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenderUiTemplateRequest == false)
            return false;
        RenderUiTemplateRequest other = (RenderUiTemplateRequest) obj;
        if (other.getUiTemplate() == null ^ this.getUiTemplate() == null)
            return false;
        if (other.getUiTemplate() != null && other.getUiTemplate().equals(this.getUiTemplate()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUiTemplate() == null) ? 0 : getUiTemplate().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public RenderUiTemplateRequest clone() {
        return (RenderUiTemplateRequest) super.clone();
    }

}
