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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies details about how containers in a multi-container endpoint are run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceExecutionConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceExecutionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How containers in a multi-container are run. The following values are valid.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERIAL</code> - Containers run as a serial pipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT</code> - Only the individual container that you specify is run.
     * </p>
     * </li>
     * </ul>
     */
    private String mode;

    /**
     * <p>
     * How containers in a multi-container are run. The following values are valid.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERIAL</code> - Containers run as a serial pipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT</code> - Only the individual container that you specify is run.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        How containers in a multi-container are run. The following values are valid.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SERIAL</code> - Containers run as a serial pipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT</code> - Only the individual container that you specify is run.
     *        </p>
     *        </li>
     * @see InferenceExecutionMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * How containers in a multi-container are run. The following values are valid.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERIAL</code> - Containers run as a serial pipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT</code> - Only the individual container that you specify is run.
     * </p>
     * </li>
     * </ul>
     * 
     * @return How containers in a multi-container are run. The following values are valid.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SERIAL</code> - Containers run as a serial pipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIRECT</code> - Only the individual container that you specify is run.
     *         </p>
     *         </li>
     * @see InferenceExecutionMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * How containers in a multi-container are run. The following values are valid.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERIAL</code> - Containers run as a serial pipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT</code> - Only the individual container that you specify is run.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        How containers in a multi-container are run. The following values are valid.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SERIAL</code> - Containers run as a serial pipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT</code> - Only the individual container that you specify is run.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExecutionMode
     */

    public InferenceExecutionConfig withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * How containers in a multi-container are run. The following values are valid.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERIAL</code> - Containers run as a serial pipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT</code> - Only the individual container that you specify is run.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        How containers in a multi-container are run. The following values are valid.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SERIAL</code> - Containers run as a serial pipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT</code> - Only the individual container that you specify is run.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExecutionMode
     */

    public InferenceExecutionConfig withMode(InferenceExecutionMode mode) {
        this.mode = mode.toString();
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceExecutionConfig == false)
            return false;
        InferenceExecutionConfig other = (InferenceExecutionConfig) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public InferenceExecutionConfig clone() {
        try {
            return (InferenceExecutionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceExecutionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
