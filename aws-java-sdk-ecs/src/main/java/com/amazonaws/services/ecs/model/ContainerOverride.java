/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * 
 */
public class ContainerOverride implements Serializable {

    /**
     * The name of the container that receives the override.
     */
    private String name;

    /**
     * The command to send to the container that receives the override.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> command;

    /**
     * The name of the container that receives the override.
     *
     * @return The name of the container that receives the override.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the container that receives the override.
     *
     * @param name The name of the container that receives the override.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the container that receives the override.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the container that receives the override.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerOverride withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The command to send to the container that receives the override.
     *
     * @return The command to send to the container that receives the override.
     */
    public java.util.List<String> getCommand() {
        if (command == null) {
              command = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              command.setAutoConstruct(true);
        }
        return command;
    }
    
    /**
     * The command to send to the container that receives the override.
     *
     * @param command The command to send to the container that receives the override.
     */
    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> commandCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(command.size());
        commandCopy.addAll(command);
        this.command = commandCopy;
    }
    
    /**
     * The command to send to the container that receives the override.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param command The command to send to the container that receives the override.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerOverride withCommand(String... command) {
        if (getCommand() == null) setCommand(new java.util.ArrayList<String>(command.length));
        for (String value : command) {
            getCommand().add(value);
        }
        return this;
    }
    
    /**
     * The command to send to the container that receives the override.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param command The command to send to the container that receives the override.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerOverride withCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> commandCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(command.size());
            commandCopy.addAll(command);
            this.command = commandCopy;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getCommand() != null) sb.append("Command: " + getCommand() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ContainerOverride == false) return false;
        ContainerOverride other = (ContainerOverride)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getCommand() == null ^ this.getCommand() == null) return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false) return false; 
        return true;
    }
    
}
    