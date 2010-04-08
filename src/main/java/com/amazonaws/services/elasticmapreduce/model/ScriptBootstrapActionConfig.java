/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Script Bootstrap Action Config
 */
public class ScriptBootstrapActionConfig {

    private String path;

    private java.util.List<String> args;

    /**
     * Returns the value of the Path property for this object.
     *
     * @return The value of the Path property for this object.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Sets the value of the Path property for this object.
     *
     * @param path The new value for the Path property for this object.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * Sets the value of the Path property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param path The new value for the Path property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScriptBootstrapActionConfig withPath(String path) {
        this.path = path;
        return this;
    }
    
    
    /**
     * Returns the value of the Args property for this object.
     *
     * @return The value of the Args property for this object.
     */
    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new java.util.ArrayList<String>();
        }
        return args;
    }
    
    /**
     * Sets the value of the Args property for this object.
     *
     * @param args The new value for the Args property for this object.
     */
    public void setArgs(java.util.Collection<String> args) {
        java.util.List<String> argsCopy = new java.util.ArrayList<String>();
        if (args != null) {
            argsCopy.addAll(args);
        }
        this.args = argsCopy;
    }
    
    /**
     * Sets the value of the Args property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args The new value for the Args property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScriptBootstrapActionConfig withArgs(String... args) {
        for (String value : args) {
            getArgs().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Args property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args The new value for the Args property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScriptBootstrapActionConfig withArgs(java.util.Collection<String> args) {
        java.util.List<String> argsCopy = new java.util.ArrayList<String>();
        if (args != null) {
            argsCopy.addAll(args);
        }
        this.args = argsCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Path: " + path + ", ");
        sb.append("Args: " + args + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    