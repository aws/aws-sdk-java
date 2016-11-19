/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Configuration of the script to run during a bootstrap action.
 * </p>
 */
public class ScriptBootstrapActionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file
     * system.
     * </p>
     */
    private String path;
    /**
     * <p>
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> args;

    /**
     * Default constructor for ScriptBootstrapActionConfig object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ScriptBootstrapActionConfig() {
    }

    /**
     * Constructs a new ScriptBootstrapActionConfig object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param path
     *        Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a
     *        local file system.
     * @param args
     *        A list of command line arguments to pass to the bootstrap action script.
     */
    public ScriptBootstrapActionConfig(String path, java.util.List<String> args) {
        setPath(path);
        setArgs(args);
    }

    /**
     * <p>
     * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file
     * system.
     * </p>
     * 
     * @param path
     *        Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a
     *        local file system.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file
     * system.
     * </p>
     * 
     * @return Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a
     *         local file system.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file
     * system.
     * </p>
     * 
     * @param path
     *        Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a
     *        local file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptBootstrapActionConfig withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     * 
     * @return A list of command line arguments to pass to the bootstrap action script.
     */

    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return args;
    }

    /**
     * <p>
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     * 
     * @param args
     *        A list of command line arguments to pass to the bootstrap action script.
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
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArgs(java.util.Collection)} or {@link #withArgs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param args
     *        A list of command line arguments to pass to the bootstrap action script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptBootstrapActionConfig withArgs(String... args) {
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
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     * 
     * @param args
     *        A list of command line arguments to pass to the bootstrap action script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptBootstrapActionConfig withArgs(java.util.Collection<String> args) {
        setArgs(args);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getArgs() != null)
            sb.append("Args: " + getArgs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScriptBootstrapActionConfig == false)
            return false;
        ScriptBootstrapActionConfig other = (ScriptBootstrapActionConfig) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        return hashCode;
    }

    @Override
    public ScriptBootstrapActionConfig clone() {
        try {
            return (ScriptBootstrapActionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
