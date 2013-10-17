/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the response to a <code>DescribeCommands</code> request.
 * </p>
 */
public class DescribeCommandsResult implements Serializable {

    /**
     * An array of <code>Command</code> objects that describe each of the
     * specified commands.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Command> commands;

    /**
     * An array of <code>Command</code> objects that describe each of the
     * specified commands.
     *
     * @return An array of <code>Command</code> objects that describe each of the
     *         specified commands.
     */
    public java.util.List<Command> getCommands() {
        if (commands == null) {
              commands = new com.amazonaws.internal.ListWithAutoConstructFlag<Command>();
              commands.setAutoConstruct(true);
        }
        return commands;
    }
    
    /**
     * An array of <code>Command</code> objects that describe each of the
     * specified commands.
     *
     * @param commands An array of <code>Command</code> objects that describe each of the
     *         specified commands.
     */
    public void setCommands(java.util.Collection<Command> commands) {
        if (commands == null) {
            this.commands = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Command> commandsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Command>(commands.size());
        commandsCopy.addAll(commands);
        this.commands = commandsCopy;
    }
    
    /**
     * An array of <code>Command</code> objects that describe each of the
     * specified commands.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commands An array of <code>Command</code> objects that describe each of the
     *         specified commands.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommandsResult withCommands(Command... commands) {
        if (getCommands() == null) setCommands(new java.util.ArrayList<Command>(commands.length));
        for (Command value : commands) {
            getCommands().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Command</code> objects that describe each of the
     * specified commands.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commands An array of <code>Command</code> objects that describe each of the
     *         specified commands.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommandsResult withCommands(java.util.Collection<Command> commands) {
        if (commands == null) {
            this.commands = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Command> commandsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Command>(commands.size());
            commandsCopy.addAll(commands);
            this.commands = commandsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCommands() != null) sb.append("Commands: " + getCommands() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCommands() == null) ? 0 : getCommands().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCommandsResult == false) return false;
        DescribeCommandsResult other = (DescribeCommandsResult)obj;
        
        if (other.getCommands() == null ^ this.getCommands() == null) return false;
        if (other.getCommands() != null && other.getCommands().equals(this.getCommands()) == false) return false; 
        return true;
    }
    
}
    