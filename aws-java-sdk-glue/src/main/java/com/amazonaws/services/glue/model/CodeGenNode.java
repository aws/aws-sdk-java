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
 * Represents a node in a directed acyclic graph (DAG)
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CodeGenNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeGenNode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A node identifier that is unique within the node's graph.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of node this is.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     */
    private java.util.List<CodeGenNodeArg> args;
    /**
     * <p>
     * The line number of the node.
     * </p>
     */
    private Integer lineNumber;

    /**
     * <p>
     * A node identifier that is unique within the node's graph.
     * </p>
     * 
     * @param id
     *        A node identifier that is unique within the node's graph.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A node identifier that is unique within the node's graph.
     * </p>
     * 
     * @return A node identifier that is unique within the node's graph.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A node identifier that is unique within the node's graph.
     * </p>
     * 
     * @param id
     *        A node identifier that is unique within the node's graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenNode withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of node this is.
     * </p>
     * 
     * @param nodeType
     *        The type of node this is.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The type of node this is.
     * </p>
     * 
     * @return The type of node this is.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The type of node this is.
     * </p>
     * 
     * @param nodeType
     *        The type of node this is.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenNode withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     * 
     * @return Properties of the node, in the form of name-value pairs.
     */

    public java.util.List<CodeGenNodeArg> getArgs() {
        return args;
    }

    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     * 
     * @param args
     *        Properties of the node, in the form of name-value pairs.
     */

    public void setArgs(java.util.Collection<CodeGenNodeArg> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new java.util.ArrayList<CodeGenNodeArg>(args);
    }

    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArgs(java.util.Collection)} or {@link #withArgs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param args
     *        Properties of the node, in the form of name-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenNode withArgs(CodeGenNodeArg... args) {
        if (this.args == null) {
            setArgs(new java.util.ArrayList<CodeGenNodeArg>(args.length));
        }
        for (CodeGenNodeArg ele : args) {
            this.args.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     * 
     * @param args
     *        Properties of the node, in the form of name-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenNode withArgs(java.util.Collection<CodeGenNodeArg> args) {
        setArgs(args);
        return this;
    }

    /**
     * <p>
     * The line number of the node.
     * </p>
     * 
     * @param lineNumber
     *        The line number of the node.
     */

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * <p>
     * The line number of the node.
     * </p>
     * 
     * @return The line number of the node.
     */

    public Integer getLineNumber() {
        return this.lineNumber;
    }

    /**
     * <p>
     * The line number of the node.
     * </p>
     * 
     * @param lineNumber
     *        The line number of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenNode withLineNumber(Integer lineNumber) {
        setLineNumber(lineNumber);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getArgs() != null)
            sb.append("Args: ").append(getArgs()).append(",");
        if (getLineNumber() != null)
            sb.append("LineNumber: ").append(getLineNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeGenNode == false)
            return false;
        CodeGenNode other = (CodeGenNode) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        if (other.getLineNumber() == null ^ this.getLineNumber() == null)
            return false;
        if (other.getLineNumber() != null && other.getLineNumber().equals(this.getLineNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        hashCode = prime * hashCode + ((getLineNumber() == null) ? 0 : getLineNumber().hashCode());
        return hashCode;
    }

    @Override
    public CodeGenNode clone() {
        try {
            return (CodeGenNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CodeGenNodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
