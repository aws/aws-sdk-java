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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * View content containing all content necessary to render a view except for runtime input data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/ViewContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The schema representing the input data that the view template must be supplied to render.
     * </p>
     */
    private String inputSchema;
    /**
     * <p>
     * The view template representing the structure of the view.
     * </p>
     */
    private String template;
    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * The schema representing the input data that the view template must be supplied to render.
     * </p>
     * 
     * @param inputSchema
     *        The schema representing the input data that the view template must be supplied to render.
     */

    public void setInputSchema(String inputSchema) {
        this.inputSchema = inputSchema;
    }

    /**
     * <p>
     * The schema representing the input data that the view template must be supplied to render.
     * </p>
     * 
     * @return The schema representing the input data that the view template must be supplied to render.
     */

    public String getInputSchema() {
        return this.inputSchema;
    }

    /**
     * <p>
     * The schema representing the input data that the view template must be supplied to render.
     * </p>
     * 
     * @param inputSchema
     *        The schema representing the input data that the view template must be supplied to render.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewContent withInputSchema(String inputSchema) {
        setInputSchema(inputSchema);
        return this;
    }

    /**
     * <p>
     * The view template representing the structure of the view.
     * </p>
     * 
     * @param template
     *        The view template representing the structure of the view.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The view template representing the structure of the view.
     * </p>
     * 
     * @return The view template representing the structure of the view.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The view template representing the structure of the view.
     * </p>
     * 
     * @param template
     *        The view template representing the structure of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewContent withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     * 
     * @return A list of actions possible from the view
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     * 
     * @param actions
     *        A list of actions possible from the view
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of actions possible from the view
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewContent withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of actions possible from the view
     * </p>
     * 
     * @param actions
     *        A list of actions possible from the view
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewContent withActions(java.util.Collection<String> actions) {
        setActions(actions);
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
        if (getInputSchema() != null)
            sb.append("InputSchema: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append("***Sensitive Data Redacted***").append(",");
        if (getActions() != null)
            sb.append("Actions: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewContent == false)
            return false;
        ViewContent other = (ViewContent) obj;
        if (other.getInputSchema() == null ^ this.getInputSchema() == null)
            return false;
        if (other.getInputSchema() != null && other.getInputSchema().equals(this.getInputSchema()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputSchema() == null) ? 0 : getInputSchema().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public ViewContent clone() {
        try {
            return (ViewContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectparticipant.model.transform.ViewContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
