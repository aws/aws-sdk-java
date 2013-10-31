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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * An entity describing an executable that runs on a cluster.
 * </p>
 */
public class Command implements Serializable {

    /**
     * The name of the command.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String name;

    /**
     * The Amazon S3 location of the command script.
     */
    private String scriptPath;

    /**
     * Arguments for Amazon EMR to pass to the command for execution.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> args;

    /**
     * The name of the command.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The name of the command.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the command.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the command.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the command.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the command.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The Amazon S3 location of the command script.
     *
     * @return The Amazon S3 location of the command script.
     */
    public String getScriptPath() {
        return scriptPath;
    }
    
    /**
     * The Amazon S3 location of the command script.
     *
     * @param scriptPath The Amazon S3 location of the command script.
     */
    public void setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
    }
    
    /**
     * The Amazon S3 location of the command script.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scriptPath The Amazon S3 location of the command script.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }

    /**
     * Arguments for Amazon EMR to pass to the command for execution.
     *
     * @return Arguments for Amazon EMR to pass to the command for execution.
     */
    public java.util.List<String> getArgs() {
        if (args == null) {
              args = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              args.setAutoConstruct(true);
        }
        return args;
    }
    
    /**
     * Arguments for Amazon EMR to pass to the command for execution.
     *
     * @param args Arguments for Amazon EMR to pass to the command for execution.
     */
    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> argsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(args.size());
        argsCopy.addAll(args);
        this.args = argsCopy;
    }
    
    /**
     * Arguments for Amazon EMR to pass to the command for execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args Arguments for Amazon EMR to pass to the command for execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withArgs(String... args) {
        if (getArgs() == null) setArgs(new java.util.ArrayList<String>(args.length));
        for (String value : args) {
            getArgs().add(value);
        }
        return this;
    }
    
    /**
     * Arguments for Amazon EMR to pass to the command for execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args Arguments for Amazon EMR to pass to the command for execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> argsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(args.size());
            argsCopy.addAll(args);
            this.args = argsCopy;
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
        if (getScriptPath() != null) sb.append("ScriptPath: " + getScriptPath() + ",");
        if (getArgs() != null) sb.append("Args: " + getArgs() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Command == false) return false;
        Command other = (Command)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getScriptPath() == null ^ this.getScriptPath() == null) return false;
        if (other.getScriptPath() != null && other.getScriptPath().equals(this.getScriptPath()) == false) return false; 
        if (other.getArgs() == null ^ this.getArgs() == null) return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false) return false; 
        return true;
    }
    
}
    