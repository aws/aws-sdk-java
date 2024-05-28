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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration information for rendering the UI component associated with the code generation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CodegenJobRenderConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenJobRenderConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the <code>ReactStartCodegenJobData</code> object.
     * </p>
     */
    private ReactStartCodegenJobData react;

    /**
     * <p>
     * The name of the <code>ReactStartCodegenJobData</code> object.
     * </p>
     * 
     * @param react
     *        The name of the <code>ReactStartCodegenJobData</code> object.
     */

    public void setReact(ReactStartCodegenJobData react) {
        this.react = react;
    }

    /**
     * <p>
     * The name of the <code>ReactStartCodegenJobData</code> object.
     * </p>
     * 
     * @return The name of the <code>ReactStartCodegenJobData</code> object.
     */

    public ReactStartCodegenJobData getReact() {
        return this.react;
    }

    /**
     * <p>
     * The name of the <code>ReactStartCodegenJobData</code> object.
     * </p>
     * 
     * @param react
     *        The name of the <code>ReactStartCodegenJobData</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobRenderConfig withReact(ReactStartCodegenJobData react) {
        setReact(react);
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
        if (getReact() != null)
            sb.append("React: ").append(getReact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodegenJobRenderConfig == false)
            return false;
        CodegenJobRenderConfig other = (CodegenJobRenderConfig) obj;
        if (other.getReact() == null ^ this.getReact() == null)
            return false;
        if (other.getReact() != null && other.getReact().equals(this.getReact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReact() == null) ? 0 : getReact().hashCode());
        return hashCode;
    }

    @Override
    public CodegenJobRenderConfig clone() {
        try {
            return (CodegenJobRenderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.CodegenJobRenderConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
