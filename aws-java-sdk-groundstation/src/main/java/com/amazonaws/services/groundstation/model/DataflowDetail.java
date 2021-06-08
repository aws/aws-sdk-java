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
 * Information about a dataflow edge used in a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DataflowDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataflowDetail implements Serializable, Cloneable, StructuredPojo {

    private Destination destination;
    /**
     * <p>
     * Error message for a dataflow.
     * </p>
     */
    private String errorMessage;

    private Source source;

    /**
     * @param destination
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * @return
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * @param destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataflowDetail withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Error message for a dataflow.
     * </p>
     * 
     * @param errorMessage
     *        Error message for a dataflow.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Error message for a dataflow.
     * </p>
     * 
     * @return Error message for a dataflow.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Error message for a dataflow.
     * </p>
     * 
     * @param errorMessage
     *        Error message for a dataflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataflowDetail withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * @param source
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * @return
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataflowDetail withSource(Source source) {
        setSource(source);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataflowDetail == false)
            return false;
        DataflowDetail other = (DataflowDetail) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public DataflowDetail clone() {
        try {
            return (DataflowDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.DataflowDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
