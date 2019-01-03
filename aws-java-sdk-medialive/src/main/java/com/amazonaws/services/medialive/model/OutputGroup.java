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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Output groups for this Live Event. Output groups contain information about where streams should be distributed.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/OutputGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * Custom output group name optionally defined by the user. Only letters, numbers, and the underscore character
     * allowed; only 32 characters allowed.
     */
    private String name;
    /** Settings associated with the output group. */
    private OutputGroupSettings outputGroupSettings;

    private java.util.List<Output> outputs;

    /**
     * Custom output group name optionally defined by the user. Only letters, numbers, and the underscore character
     * allowed; only 32 characters allowed.
     * 
     * @param name
     *        Custom output group name optionally defined by the user. Only letters, numbers, and the underscore
     *        character allowed; only 32 characters allowed.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Custom output group name optionally defined by the user. Only letters, numbers, and the underscore character
     * allowed; only 32 characters allowed.
     * 
     * @return Custom output group name optionally defined by the user. Only letters, numbers, and the underscore
     *         character allowed; only 32 characters allowed.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Custom output group name optionally defined by the user. Only letters, numbers, and the underscore character
     * allowed; only 32 characters allowed.
     * 
     * @param name
     *        Custom output group name optionally defined by the user. Only letters, numbers, and the underscore
     *        character allowed; only 32 characters allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Settings associated with the output group.
     * 
     * @param outputGroupSettings
     *        Settings associated with the output group.
     */

    public void setOutputGroupSettings(OutputGroupSettings outputGroupSettings) {
        this.outputGroupSettings = outputGroupSettings;
    }

    /**
     * Settings associated with the output group.
     * 
     * @return Settings associated with the output group.
     */

    public OutputGroupSettings getOutputGroupSettings() {
        return this.outputGroupSettings;
    }

    /**
     * Settings associated with the output group.
     * 
     * @param outputGroupSettings
     *        Settings associated with the output group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroup withOutputGroupSettings(OutputGroupSettings outputGroupSettings) {
        setOutputGroupSettings(outputGroupSettings);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * @param outputs
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroup withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * @param outputs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroup withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
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
        if (getOutputGroupSettings() != null)
            sb.append("OutputGroupSettings: ").append(getOutputGroupSettings()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputGroup == false)
            return false;
        OutputGroup other = (OutputGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputGroupSettings() == null ^ this.getOutputGroupSettings() == null)
            return false;
        if (other.getOutputGroupSettings() != null && other.getOutputGroupSettings().equals(this.getOutputGroupSettings()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputGroupSettings() == null) ? 0 : getOutputGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        return hashCode;
    }

    @Override
    public OutputGroup clone() {
        try {
            return (OutputGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.OutputGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
