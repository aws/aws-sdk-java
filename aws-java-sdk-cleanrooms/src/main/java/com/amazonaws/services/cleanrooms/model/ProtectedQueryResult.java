/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the query results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ProtectedQueryResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedQueryResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The output of the protected query.
     * </p>
     */
    private ProtectedQueryOutput output;

    /**
     * <p>
     * The output of the protected query.
     * </p>
     * 
     * @param output
     *        The output of the protected query.
     */

    public void setOutput(ProtectedQueryOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * The output of the protected query.
     * </p>
     * 
     * @return The output of the protected query.
     */

    public ProtectedQueryOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The output of the protected query.
     * </p>
     * 
     * @param output
     *        The output of the protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQueryResult withOutput(ProtectedQueryOutput output) {
        setOutput(output);
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
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedQueryResult == false)
            return false;
        ProtectedQueryResult other = (ProtectedQueryResult) obj;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedQueryResult clone() {
        try {
            return (ProtectedQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ProtectedQueryResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
