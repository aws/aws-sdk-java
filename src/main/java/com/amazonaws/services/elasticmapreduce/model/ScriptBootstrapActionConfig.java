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
 * Configuration of the script to run during a bootstrap action.
 * </p>
 */
public class ScriptBootstrapActionConfig implements Serializable {

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
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> args;

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
        setPath(path);
        setArgs(args);
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
              args = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              args.setAutoConstruct(true);
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
        if (args == null) {
            this.args = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> argsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(args.size());
        argsCopy.addAll(args);
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
        if (getArgs() == null) setArgs(new java.util.ArrayList<String>(args.length));
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
        if (getPath() != null) sb.append("Path: " + getPath() + ",");
        if (getArgs() != null) sb.append("Args: " + getArgs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScriptBootstrapActionConfig == false) return false;
        ScriptBootstrapActionConfig other = (ScriptBootstrapActionConfig)obj;
        
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getArgs() == null ^ this.getArgs() == null) return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false) return false; 
        return true;
    }
    
}
    