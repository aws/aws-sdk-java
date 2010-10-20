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
 * <p>
 * Configuration of the script to run during a bootstrap action.
 * </p>
 */
public class ScriptBootstrapActionConfig {

    /**
     * Location of the script to run during a bootstrap action. Can be either
     * a location in Amazon S3 or on a local file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String path;

    /**
     * A list of command line arguments to pass to the bootstrap action
     * script.
     */
    private java.util.List<String> args;

    /**
     * Default constructor for a new ScriptBootstrapActionConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ScriptBootstrapActionConfig() {}
    
    /**
     * Constructs a new ScriptBootstrapActionConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param path Location of the script to run during a bootstrap action.
     * Can be either a location in Amazon S3 or on a local file system.
     * @param args A list of command line arguments to pass to the bootstrap
     * action script.
     */
    public ScriptBootstrapActionConfig(String path, java.util.List<String> args) {
        this.path = path;
        this.args = args;
    }
    
    /**
     * Location of the script to run during a bootstrap action. Can be either
     * a location in Amazon S3 or on a local file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Location of the script to run during a bootstrap action. Can be either
     *         a location in Amazon S3 or on a local file system.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Location of the script to run during a bootstrap action. Can be either
     * a location in Amazon S3 or on a local file system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param path Location of the script to run during a bootstrap action. Can be either
     *         a location in Amazon S3 or on a local file system.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * Location of the script to run during a bootstrap action. Can be either
     * a location in Amazon S3 or on a local file system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param path Location of the script to run during a bootstrap action. Can be either
     *         a location in Amazon S3 or on a local file system.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScriptBootstrapActionConfig withPath(String path) {
        this.path = path;
        return this;
    }
    
    
    /**
     * A list of command line arguments to pass to the bootstrap action
     * script.
     *
     * @return A list of command line arguments to pass to the bootstrap action
     *         script.
     */
    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new java.util.ArrayList<String>();
        }
        return args;
    }
    
    /**
     * A list of command line arguments to pass to the bootstrap action
     * script.
     *
     * @param args A list of command line arguments to pass to the bootstrap action
     *         script.
     */
    public void setArgs(java.util.Collection<String> args) {
        java.util.List<String> argsCopy = new java.util.ArrayList<String>();
        if (args != null) {
            argsCopy.addAll(args);
        }
        this.args = argsCopy;
    }
    
    /**
     * A list of command line arguments to pass to the bootstrap action
     * script.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args A list of command line arguments to pass to the bootstrap action
     *         script.
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
     * A list of command line arguments to pass to the bootstrap action
     * script.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args A list of command line arguments to pass to the bootstrap action
     *         script.
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
        sb.append("Path: " + path + ", ");
        sb.append("Args: " + args + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    