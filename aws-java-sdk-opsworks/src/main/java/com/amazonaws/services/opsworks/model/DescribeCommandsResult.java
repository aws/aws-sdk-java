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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeCommands</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeCommands" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCommandsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Command</code> objects that describe each of the specified commands.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Command> commands;

    /**
     * <p>
     * An array of <code>Command</code> objects that describe each of the specified commands.
     * </p>
     * 
     * @return An array of <code>Command</code> objects that describe each of the specified commands.
     */

    public java.util.List<Command> getCommands() {
        if (commands == null) {
            commands = new com.amazonaws.internal.SdkInternalList<Command>();
        }
        return commands;
    }

    /**
     * <p>
     * An array of <code>Command</code> objects that describe each of the specified commands.
     * </p>
     * 
     * @param commands
     *        An array of <code>Command</code> objects that describe each of the specified commands.
     */

    public void setCommands(java.util.Collection<Command> commands) {
        if (commands == null) {
            this.commands = null;
            return;
        }

        this.commands = new com.amazonaws.internal.SdkInternalList<Command>(commands);
    }

    /**
     * <p>
     * An array of <code>Command</code> objects that describe each of the specified commands.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommands(java.util.Collection)} or {@link #withCommands(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param commands
     *        An array of <code>Command</code> objects that describe each of the specified commands.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommandsResult withCommands(Command... commands) {
        if (this.commands == null) {
            setCommands(new com.amazonaws.internal.SdkInternalList<Command>(commands.length));
        }
        for (Command ele : commands) {
            this.commands.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Command</code> objects that describe each of the specified commands.
     * </p>
     * 
     * @param commands
     *        An array of <code>Command</code> objects that describe each of the specified commands.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommandsResult withCommands(java.util.Collection<Command> commands) {
        setCommands(commands);
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
        if (getCommands() != null)
            sb.append("Commands: ").append(getCommands());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCommandsResult == false)
            return false;
        DescribeCommandsResult other = (DescribeCommandsResult) obj;
        if (other.getCommands() == null ^ this.getCommands() == null)
            return false;
        if (other.getCommands() != null && other.getCommands().equals(this.getCommands()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommands() == null) ? 0 : getCommands().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCommandsResult clone() {
        try {
            return (DescribeCommandsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
