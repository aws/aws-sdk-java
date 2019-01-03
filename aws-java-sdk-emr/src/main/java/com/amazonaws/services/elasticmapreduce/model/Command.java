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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An entity describing an executable that runs on a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/Command" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Command implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the command.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon S3 location of the command script.
     * </p>
     */
    private String scriptPath;
    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> args;

    /**
     * <p>
     * The name of the command.
     * </p>
     * 
     * @param name
     *        The name of the command.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the command.
     * </p>
     * 
     * @return The name of the command.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the command.
     * </p>
     * 
     * @param name
     *        The name of the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the command script.
     * </p>
     * 
     * @param scriptPath
     *        The Amazon S3 location of the command script.
     */

    public void setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
    }

    /**
     * <p>
     * The Amazon S3 location of the command script.
     * </p>
     * 
     * @return The Amazon S3 location of the command script.
     */

    public String getScriptPath() {
        return this.scriptPath;
    }

    /**
     * <p>
     * The Amazon S3 location of the command script.
     * </p>
     * 
     * @param scriptPath
     *        The Amazon S3 location of the command script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withScriptPath(String scriptPath) {
        setScriptPath(scriptPath);
        return this;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     * 
     * @return Arguments for Amazon EMR to pass to the command for execution.
     */

    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return args;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     * 
     * @param args
     *        Arguments for Amazon EMR to pass to the command for execution.
     */

    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new com.amazonaws.internal.SdkInternalList<String>(args);
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArgs(java.util.Collection)} or {@link #withArgs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param args
     *        Arguments for Amazon EMR to pass to the command for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withArgs(String... args) {
        if (this.args == null) {
            setArgs(new com.amazonaws.internal.SdkInternalList<String>(args.length));
        }
        for (String ele : args) {
            this.args.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     * 
     * @param args
     *        Arguments for Amazon EMR to pass to the command for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withArgs(java.util.Collection<String> args) {
        setArgs(args);
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
        if (getScriptPath() != null)
            sb.append("ScriptPath: ").append(getScriptPath()).append(",");
        if (getArgs() != null)
            sb.append("Args: ").append(getArgs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Command == false)
            return false;
        Command other = (Command) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScriptPath() == null ^ this.getScriptPath() == null)
            return false;
        if (other.getScriptPath() != null && other.getScriptPath().equals(this.getScriptPath()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScriptPath() == null) ? 0 : getScriptPath().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        return hashCode;
    }

    @Override
    public Command clone() {
        try {
            return (Command) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.CommandMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
