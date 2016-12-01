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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;

/**
 * 
 */
public class StateEnteredEventDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the state.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The JSON input data to the state.
     * </p>
     */
    private String input;

    /**
     * <p>
     * The name of the state.
     * </p>
     * 
     * @param name
     *        The name of the state.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the state.
     * </p>
     * 
     * @return The name of the state.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the state.
     * </p>
     * 
     * @param name
     *        The name of the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StateEnteredEventDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The JSON input data to the state.
     * </p>
     * 
     * @param input
     *        The JSON input data to the state.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The JSON input data to the state.
     * </p>
     * 
     * @return The JSON input data to the state.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The JSON input data to the state.
     * </p>
     * 
     * @param input
     *        The JSON input data to the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StateEnteredEventDetails withInput(String input) {
        setInput(input);
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
        if (getInput() != null)
            sb.append("Input: " + getInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StateEnteredEventDetails == false)
            return false;
        StateEnteredEventDetails other = (StateEnteredEventDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        return hashCode;
    }

    @Override
    public StateEnteredEventDetails clone() {
        try {
            return (StateEnteredEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
