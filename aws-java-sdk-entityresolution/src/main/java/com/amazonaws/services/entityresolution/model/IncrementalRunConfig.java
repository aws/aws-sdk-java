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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object which defines an incremental run type and has only <code>incrementalRunType</code> as a field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/IncrementalRunConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncrementalRunConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of incremental run. It takes only one value: <code>IMMEDIATE</code>.
     * </p>
     */
    private String incrementalRunType;

    /**
     * <p>
     * The type of incremental run. It takes only one value: <code>IMMEDIATE</code>.
     * </p>
     * 
     * @param incrementalRunType
     *        The type of incremental run. It takes only one value: <code>IMMEDIATE</code>.
     * @see IncrementalRunType
     */

    public void setIncrementalRunType(String incrementalRunType) {
        this.incrementalRunType = incrementalRunType;
    }

    /**
     * <p>
     * The type of incremental run. It takes only one value: <code>IMMEDIATE</code>.
     * </p>
     * 
     * @return The type of incremental run. It takes only one value: <code>IMMEDIATE</code>.
     * @see IncrementalRunType
     */

    public String getIncrementalRunType() {
        return this.incrementalRunType;
    }

    /**
     * <p>
     * The type of incremental run. It takes only one value: <code>IMMEDIATE</code>.
     * </p>
     * 
     * @param incrementalRunType
     *        The type of incremental run. It takes only one value: <code>IMMEDIATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncrementalRunType
     */

    public IncrementalRunConfig withIncrementalRunType(String incrementalRunType) {
        setIncrementalRunType(incrementalRunType);
        return this;
    }

    /**
     * <p>
     * The type of incremental run. It takes only one value: <code>IMMEDIATE</code>.
     * </p>
     * 
     * @param incrementalRunType
     *        The type of incremental run. It takes only one value: <code>IMMEDIATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncrementalRunType
     */

    public IncrementalRunConfig withIncrementalRunType(IncrementalRunType incrementalRunType) {
        this.incrementalRunType = incrementalRunType.toString();
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
        if (getIncrementalRunType() != null)
            sb.append("IncrementalRunType: ").append(getIncrementalRunType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncrementalRunConfig == false)
            return false;
        IncrementalRunConfig other = (IncrementalRunConfig) obj;
        if (other.getIncrementalRunType() == null ^ this.getIncrementalRunType() == null)
            return false;
        if (other.getIncrementalRunType() != null && other.getIncrementalRunType().equals(this.getIncrementalRunType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncrementalRunType() == null) ? 0 : getIncrementalRunType().hashCode());
        return hashCode;
    }

    @Override
    public IncrementalRunConfig clone() {
        try {
            return (IncrementalRunConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.IncrementalRunConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
