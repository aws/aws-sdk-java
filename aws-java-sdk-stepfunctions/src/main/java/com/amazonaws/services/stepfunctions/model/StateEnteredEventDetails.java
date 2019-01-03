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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a state entered during an execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StateEnteredEventDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StateEnteredEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the state.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The string that contains the JSON input data for the state.
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
     * The string that contains the JSON input data for the state.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data for the state.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The string that contains the JSON input data for the state.
     * </p>
     * 
     * @return The string that contains the JSON input data for the state.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The string that contains the JSON input data for the state.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data for the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StateEnteredEventDetails withInput(String input) {
        setInput(input);
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
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***");
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.StateEnteredEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
