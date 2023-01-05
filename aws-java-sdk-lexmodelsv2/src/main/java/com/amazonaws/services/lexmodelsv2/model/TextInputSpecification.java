/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the text input specifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TextInputSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextInputSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time for which a bot waits before re-prompting a customer for text input.
     * </p>
     */
    private Integer startTimeoutMs;

    /**
     * <p>
     * Time for which a bot waits before re-prompting a customer for text input.
     * </p>
     * 
     * @param startTimeoutMs
     *        Time for which a bot waits before re-prompting a customer for text input.
     */

    public void setStartTimeoutMs(Integer startTimeoutMs) {
        this.startTimeoutMs = startTimeoutMs;
    }

    /**
     * <p>
     * Time for which a bot waits before re-prompting a customer for text input.
     * </p>
     * 
     * @return Time for which a bot waits before re-prompting a customer for text input.
     */

    public Integer getStartTimeoutMs() {
        return this.startTimeoutMs;
    }

    /**
     * <p>
     * Time for which a bot waits before re-prompting a customer for text input.
     * </p>
     * 
     * @param startTimeoutMs
     *        Time for which a bot waits before re-prompting a customer for text input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextInputSpecification withStartTimeoutMs(Integer startTimeoutMs) {
        setStartTimeoutMs(startTimeoutMs);
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
        if (getStartTimeoutMs() != null)
            sb.append("StartTimeoutMs: ").append(getStartTimeoutMs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextInputSpecification == false)
            return false;
        TextInputSpecification other = (TextInputSpecification) obj;
        if (other.getStartTimeoutMs() == null ^ this.getStartTimeoutMs() == null)
            return false;
        if (other.getStartTimeoutMs() != null && other.getStartTimeoutMs().equals(this.getStartTimeoutMs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTimeoutMs() == null) ? 0 : getStartTimeoutMs().hashCode());
        return hashCode;
    }

    @Override
    public TextInputSpecification clone() {
        try {
            return (TextInputSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TextInputSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
