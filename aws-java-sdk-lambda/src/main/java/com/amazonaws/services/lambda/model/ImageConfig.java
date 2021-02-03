/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration values that override the container image Dockerfile settings. See <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms">Container settings</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ImageConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the entry point to their application, which is typically the location of the runtime executable.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> entryPoint;
    /**
     * <p>
     * Specifies parameters that you want to pass in with ENTRYPOINT.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> command;
    /**
     * <p>
     * Specifies the working directory.
     * </p>
     */
    private String workingDirectory;

    /**
     * <p>
     * Specifies the entry point to their application, which is typically the location of the runtime executable.
     * </p>
     * 
     * @return Specifies the entry point to their application, which is typically the location of the runtime
     *         executable.
     */

    public java.util.List<String> getEntryPoint() {
        if (entryPoint == null) {
            entryPoint = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return entryPoint;
    }

    /**
     * <p>
     * Specifies the entry point to their application, which is typically the location of the runtime executable.
     * </p>
     * 
     * @param entryPoint
     *        Specifies the entry point to their application, which is typically the location of the runtime executable.
     */

    public void setEntryPoint(java.util.Collection<String> entryPoint) {
        if (entryPoint == null) {
            this.entryPoint = null;
            return;
        }

        this.entryPoint = new com.amazonaws.internal.SdkInternalList<String>(entryPoint);
    }

    /**
     * <p>
     * Specifies the entry point to their application, which is typically the location of the runtime executable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntryPoint(java.util.Collection)} or {@link #withEntryPoint(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entryPoint
     *        Specifies the entry point to their application, which is typically the location of the runtime executable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfig withEntryPoint(String... entryPoint) {
        if (this.entryPoint == null) {
            setEntryPoint(new com.amazonaws.internal.SdkInternalList<String>(entryPoint.length));
        }
        for (String ele : entryPoint) {
            this.entryPoint.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the entry point to their application, which is typically the location of the runtime executable.
     * </p>
     * 
     * @param entryPoint
     *        Specifies the entry point to their application, which is typically the location of the runtime executable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfig withEntryPoint(java.util.Collection<String> entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * Specifies parameters that you want to pass in with ENTRYPOINT.
     * </p>
     * 
     * @return Specifies parameters that you want to pass in with ENTRYPOINT.
     */

    public java.util.List<String> getCommand() {
        if (command == null) {
            command = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return command;
    }

    /**
     * <p>
     * Specifies parameters that you want to pass in with ENTRYPOINT.
     * </p>
     * 
     * @param command
     *        Specifies parameters that you want to pass in with ENTRYPOINT.
     */

    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new com.amazonaws.internal.SdkInternalList<String>(command);
    }

    /**
     * <p>
     * Specifies parameters that you want to pass in with ENTRYPOINT.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        Specifies parameters that you want to pass in with ENTRYPOINT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfig withCommand(String... command) {
        if (this.command == null) {
            setCommand(new com.amazonaws.internal.SdkInternalList<String>(command.length));
        }
        for (String ele : command) {
            this.command.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies parameters that you want to pass in with ENTRYPOINT.
     * </p>
     * 
     * @param command
     *        Specifies parameters that you want to pass in with ENTRYPOINT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfig withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * Specifies the working directory.
     * </p>
     * 
     * @param workingDirectory
     *        Specifies the working directory.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * Specifies the working directory.
     * </p>
     * 
     * @return Specifies the working directory.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * Specifies the working directory.
     * </p>
     * 
     * @param workingDirectory
     *        Specifies the working directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfig withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
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
        if (getEntryPoint() != null)
            sb.append("EntryPoint: ").append(getEntryPoint()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageConfig == false)
            return false;
        ImageConfig other = (ImageConfig) obj;
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null)
            return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        return hashCode;
    }

    @Override
    public ImageConfig clone() {
        try {
            return (ImageConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.ImageConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
