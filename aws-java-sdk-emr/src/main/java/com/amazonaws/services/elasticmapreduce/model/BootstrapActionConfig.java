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
 * 
 */
public class BootstrapActionConfig implements Serializable, Cloneable {

    private String name;

    private ScriptBootstrapActionConfig scriptBootstrapAction;

    /**
     * Default constructor for BootstrapActionConfig object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public BootstrapActionConfig() {
    }

    /**
     * Constructs a new BootstrapActionConfig object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param name
     * @param scriptBootstrapAction
     */
    public BootstrapActionConfig(String name, ScriptBootstrapActionConfig scriptBootstrapAction) {
        setName(name);
        setScriptBootstrapAction(scriptBootstrapAction);
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BootstrapActionConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param scriptBootstrapAction
     */

    public void setScriptBootstrapAction(ScriptBootstrapActionConfig scriptBootstrapAction) {
        this.scriptBootstrapAction = scriptBootstrapAction;
    }

    /**
     * @return
     */

    public ScriptBootstrapActionConfig getScriptBootstrapAction() {
        return this.scriptBootstrapAction;
    }

    /**
     * @param scriptBootstrapAction
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BootstrapActionConfig withScriptBootstrapAction(ScriptBootstrapActionConfig scriptBootstrapAction) {
        setScriptBootstrapAction(scriptBootstrapAction);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getScriptBootstrapAction() != null)
            sb.append("ScriptBootstrapAction: " + getScriptBootstrapAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BootstrapActionConfig == false)
            return false;
        BootstrapActionConfig other = (BootstrapActionConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScriptBootstrapAction() == null ^ this.getScriptBootstrapAction() == null)
            return false;
        if (other.getScriptBootstrapAction() != null && other.getScriptBootstrapAction().equals(this.getScriptBootstrapAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScriptBootstrapAction() == null) ? 0 : getScriptBootstrapAction().hashCode());
        return hashCode;
    }

    @Override
    public BootstrapActionConfig clone() {
        try {
            return (BootstrapActionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
