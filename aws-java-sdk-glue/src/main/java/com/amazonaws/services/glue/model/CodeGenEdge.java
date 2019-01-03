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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a directional edge in a directed acyclic graph (DAG).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CodeGenEdge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeGenEdge implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the node at which the edge starts.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The ID of the node at which the edge ends.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The target of the edge.
     * </p>
     */
    private String targetParameter;

    /**
     * <p>
     * The ID of the node at which the edge starts.
     * </p>
     * 
     * @param source
     *        The ID of the node at which the edge starts.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The ID of the node at which the edge starts.
     * </p>
     * 
     * @return The ID of the node at which the edge starts.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The ID of the node at which the edge starts.
     * </p>
     * 
     * @param source
     *        The ID of the node at which the edge starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenEdge withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The ID of the node at which the edge ends.
     * </p>
     * 
     * @param target
     *        The ID of the node at which the edge ends.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The ID of the node at which the edge ends.
     * </p>
     * 
     * @return The ID of the node at which the edge ends.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The ID of the node at which the edge ends.
     * </p>
     * 
     * @param target
     *        The ID of the node at which the edge ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenEdge withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The target of the edge.
     * </p>
     * 
     * @param targetParameter
     *        The target of the edge.
     */

    public void setTargetParameter(String targetParameter) {
        this.targetParameter = targetParameter;
    }

    /**
     * <p>
     * The target of the edge.
     * </p>
     * 
     * @return The target of the edge.
     */

    public String getTargetParameter() {
        return this.targetParameter;
    }

    /**
     * <p>
     * The target of the edge.
     * </p>
     * 
     * @param targetParameter
     *        The target of the edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenEdge withTargetParameter(String targetParameter) {
        setTargetParameter(targetParameter);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getTargetParameter() != null)
            sb.append("TargetParameter: ").append(getTargetParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeGenEdge == false)
            return false;
        CodeGenEdge other = (CodeGenEdge) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getTargetParameter() == null ^ this.getTargetParameter() == null)
            return false;
        if (other.getTargetParameter() != null && other.getTargetParameter().equals(this.getTargetParameter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getTargetParameter() == null) ? 0 : getTargetParameter().hashCode());
        return hashCode;
    }

    @Override
    public CodeGenEdge clone() {
        try {
            return (CodeGenEdge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CodeGenEdgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
