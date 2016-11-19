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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * The parent object that contains your environment's configuration settings.
 * </p>
 */
public class Environment implements Serializable, Cloneable {

    /**
     * <p>
     * The key-value pairs that represent your environment's configuration settings. The value you specify cannot
     * contain a ",".
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> variables;

    /**
     * <p>
     * The key-value pairs that represent your environment's configuration settings. The value you specify cannot
     * contain a ",".
     * </p>
     * 
     * @return The key-value pairs that represent your environment's configuration settings. The value you specify
     *         cannot contain a ",".
     */

    public java.util.Map<String, String> getVariables() {
        if (variables == null) {
            variables = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return variables;
    }

    /**
     * <p>
     * The key-value pairs that represent your environment's configuration settings. The value you specify cannot
     * contain a ",".
     * </p>
     * 
     * @param variables
     *        The key-value pairs that represent your environment's configuration settings. The value you specify cannot
     *        contain a ",".
     */

    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(variables);
    }

    /**
     * <p>
     * The key-value pairs that represent your environment's configuration settings. The value you specify cannot
     * contain a ",".
     * </p>
     * 
     * @param variables
     *        The key-value pairs that represent your environment's configuration settings. The value you specify cannot
     *        contain a ",".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withVariables(java.util.Map<String, String> variables) {
        setVariables(variables);
        return this;
    }

    public Environment addVariablesEntry(String key, String value) {
        if (null == this.variables) {
            this.variables = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Variables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment clearVariablesEntries() {
        this.variables = null;
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
        if (getVariables() != null)
            sb.append("Variables: " + getVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Environment == false)
            return false;
        Environment other = (Environment) obj;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        return hashCode;
    }

    @Override
    public Environment clone() {
        try {
            return (Environment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
