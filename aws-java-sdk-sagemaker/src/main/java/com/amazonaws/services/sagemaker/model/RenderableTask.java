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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains input values for a task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RenderableTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenderableTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A JSON object that contains values for the variables defined in the template. It is made available to the
     * template under the substitution variable <code>task.input</code>. For example, if you define a variable
     * <code>task.input.text</code> in your template, you can supply the variable in the JSON object as
     * <code>"text": "sample text"</code>.
     * </p>
     */
    private String input;

    /**
     * <p>
     * A JSON object that contains values for the variables defined in the template. It is made available to the
     * template under the substitution variable <code>task.input</code>. For example, if you define a variable
     * <code>task.input.text</code> in your template, you can supply the variable in the JSON object as
     * <code>"text": "sample text"</code>.
     * </p>
     * 
     * @param input
     *        A JSON object that contains values for the variables defined in the template. It is made available to the
     *        template under the substitution variable <code>task.input</code>. For example, if you define a variable
     *        <code>task.input.text</code> in your template, you can supply the variable in the JSON object as
     *        <code>"text": "sample text"</code>.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * A JSON object that contains values for the variables defined in the template. It is made available to the
     * template under the substitution variable <code>task.input</code>. For example, if you define a variable
     * <code>task.input.text</code> in your template, you can supply the variable in the JSON object as
     * <code>"text": "sample text"</code>.
     * </p>
     * 
     * @return A JSON object that contains values for the variables defined in the template. It is made available to the
     *         template under the substitution variable <code>task.input</code>. For example, if you define a variable
     *         <code>task.input.text</code> in your template, you can supply the variable in the JSON object as
     *         <code>"text": "sample text"</code>.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * A JSON object that contains values for the variables defined in the template. It is made available to the
     * template under the substitution variable <code>task.input</code>. For example, if you define a variable
     * <code>task.input.text</code> in your template, you can supply the variable in the JSON object as
     * <code>"text": "sample text"</code>.
     * </p>
     * 
     * @param input
     *        A JSON object that contains values for the variables defined in the template. It is made available to the
     *        template under the substitution variable <code>task.input</code>. For example, if you define a variable
     *        <code>task.input.text</code> in your template, you can supply the variable in the JSON object as
     *        <code>"text": "sample text"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenderableTask withInput(String input) {
        setInput(input);
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenderableTask == false)
            return false;
        RenderableTask other = (RenderableTask) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        return hashCode;
    }

    @Override
    public RenderableTask clone() {
        try {
            return (RenderableTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RenderableTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
