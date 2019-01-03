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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration of a bootstrap action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/BootstrapActionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BootstrapActionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the bootstrap action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The script run by the bootstrap action.
     * </p>
     */
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
     *        The name of the bootstrap action.
     * @param scriptBootstrapAction
     *        The script run by the bootstrap action.
     */
    public BootstrapActionConfig(String name, ScriptBootstrapActionConfig scriptBootstrapAction) {
        setName(name);
        setScriptBootstrapAction(scriptBootstrapAction);
    }

    /**
     * <p>
     * The name of the bootstrap action.
     * </p>
     * 
     * @param name
     *        The name of the bootstrap action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bootstrap action.
     * </p>
     * 
     * @return The name of the bootstrap action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bootstrap action.
     * </p>
     * 
     * @param name
     *        The name of the bootstrap action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BootstrapActionConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The script run by the bootstrap action.
     * </p>
     * 
     * @param scriptBootstrapAction
     *        The script run by the bootstrap action.
     */

    public void setScriptBootstrapAction(ScriptBootstrapActionConfig scriptBootstrapAction) {
        this.scriptBootstrapAction = scriptBootstrapAction;
    }

    /**
     * <p>
     * The script run by the bootstrap action.
     * </p>
     * 
     * @return The script run by the bootstrap action.
     */

    public ScriptBootstrapActionConfig getScriptBootstrapAction() {
        return this.scriptBootstrapAction;
    }

    /**
     * <p>
     * The script run by the bootstrap action.
     * </p>
     * 
     * @param scriptBootstrapAction
     *        The script run by the bootstrap action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BootstrapActionConfig withScriptBootstrapAction(ScriptBootstrapActionConfig scriptBootstrapAction) {
        setScriptBootstrapAction(scriptBootstrapAction);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScriptBootstrapAction() != null)
            sb.append("ScriptBootstrapAction: ").append(getScriptBootstrapAction());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.BootstrapActionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
