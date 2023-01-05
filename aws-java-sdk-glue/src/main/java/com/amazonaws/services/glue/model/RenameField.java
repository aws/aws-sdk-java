/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a transform that renames a single data property key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RenameField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenameField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * A JSON path to a variable in the data structure for the source data.
     * </p>
     */
    private java.util.List<String> sourcePath;
    /**
     * <p>
     * A JSON path to a variable in the data structure for the target data.
     * </p>
     */
    private java.util.List<String> targetPath;

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @return The name of the transform node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenameField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @return The data inputs identified by their node names.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenameField withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenameField withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the source data.
     * </p>
     * 
     * @return A JSON path to a variable in the data structure for the source data.
     */

    public java.util.List<String> getSourcePath() {
        return sourcePath;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the source data.
     * </p>
     * 
     * @param sourcePath
     *        A JSON path to a variable in the data structure for the source data.
     */

    public void setSourcePath(java.util.Collection<String> sourcePath) {
        if (sourcePath == null) {
            this.sourcePath = null;
            return;
        }

        this.sourcePath = new java.util.ArrayList<String>(sourcePath);
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the source data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourcePath(java.util.Collection)} or {@link #withSourcePath(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourcePath
     *        A JSON path to a variable in the data structure for the source data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenameField withSourcePath(String... sourcePath) {
        if (this.sourcePath == null) {
            setSourcePath(new java.util.ArrayList<String>(sourcePath.length));
        }
        for (String ele : sourcePath) {
            this.sourcePath.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the source data.
     * </p>
     * 
     * @param sourcePath
     *        A JSON path to a variable in the data structure for the source data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenameField withSourcePath(java.util.Collection<String> sourcePath) {
        setSourcePath(sourcePath);
        return this;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the target data.
     * </p>
     * 
     * @return A JSON path to a variable in the data structure for the target data.
     */

    public java.util.List<String> getTargetPath() {
        return targetPath;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the target data.
     * </p>
     * 
     * @param targetPath
     *        A JSON path to a variable in the data structure for the target data.
     */

    public void setTargetPath(java.util.Collection<String> targetPath) {
        if (targetPath == null) {
            this.targetPath = null;
            return;
        }

        this.targetPath = new java.util.ArrayList<String>(targetPath);
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the target data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetPath(java.util.Collection)} or {@link #withTargetPath(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetPath
     *        A JSON path to a variable in the data structure for the target data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenameField withTargetPath(String... targetPath) {
        if (this.targetPath == null) {
            setTargetPath(new java.util.ArrayList<String>(targetPath.length));
        }
        for (String ele : targetPath) {
            this.targetPath.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the target data.
     * </p>
     * 
     * @param targetPath
     *        A JSON path to a variable in the data structure for the target data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenameField withTargetPath(java.util.Collection<String> targetPath) {
        setTargetPath(targetPath);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath()).append(",");
        if (getTargetPath() != null)
            sb.append("TargetPath: ").append(getTargetPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenameField == false)
            return false;
        RenameField other = (RenameField) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        if (other.getTargetPath() == null ^ this.getTargetPath() == null)
            return false;
        if (other.getTargetPath() != null && other.getTargetPath().equals(this.getTargetPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        hashCode = prime * hashCode + ((getTargetPath() == null) ? 0 : getTargetPath().hashCode());
        return hashCode;
    }

    @Override
    public RenameField clone() {
        try {
            return (RenameField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.RenameFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
