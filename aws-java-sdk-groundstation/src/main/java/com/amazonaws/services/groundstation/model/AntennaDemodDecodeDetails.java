/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an antenna demod decode <code>Config</code> used in a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/AntennaDemodDecodeDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AntennaDemodDecodeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of an antenna demod decode output node used in a contact.
     * </p>
     */
    private String outputNode;

    /**
     * <p>
     * Name of an antenna demod decode output node used in a contact.
     * </p>
     * 
     * @param outputNode
     *        Name of an antenna demod decode output node used in a contact.
     */

    public void setOutputNode(String outputNode) {
        this.outputNode = outputNode;
    }

    /**
     * <p>
     * Name of an antenna demod decode output node used in a contact.
     * </p>
     * 
     * @return Name of an antenna demod decode output node used in a contact.
     */

    public String getOutputNode() {
        return this.outputNode;
    }

    /**
     * <p>
     * Name of an antenna demod decode output node used in a contact.
     * </p>
     * 
     * @param outputNode
     *        Name of an antenna demod decode output node used in a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntennaDemodDecodeDetails withOutputNode(String outputNode) {
        setOutputNode(outputNode);
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
        if (getOutputNode() != null)
            sb.append("OutputNode: ").append(getOutputNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AntennaDemodDecodeDetails == false)
            return false;
        AntennaDemodDecodeDetails other = (AntennaDemodDecodeDetails) obj;
        if (other.getOutputNode() == null ^ this.getOutputNode() == null)
            return false;
        if (other.getOutputNode() != null && other.getOutputNode().equals(this.getOutputNode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputNode() == null) ? 0 : getOutputNode().hashCode());
        return hashCode;
    }

    @Override
    public AntennaDemodDecodeDetails clone() {
        try {
            return (AntennaDemodDecodeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.AntennaDemodDecodeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
