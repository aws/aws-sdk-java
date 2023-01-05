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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The code execution output in JSON format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StatementOutputData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatementOutputData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code execution output in text format.
     * </p>
     */
    private String textPlain;

    /**
     * <p>
     * The code execution output in text format.
     * </p>
     * 
     * @param textPlain
     *        The code execution output in text format.
     */

    public void setTextPlain(String textPlain) {
        this.textPlain = textPlain;
    }

    /**
     * <p>
     * The code execution output in text format.
     * </p>
     * 
     * @return The code execution output in text format.
     */

    public String getTextPlain() {
        return this.textPlain;
    }

    /**
     * <p>
     * The code execution output in text format.
     * </p>
     * 
     * @param textPlain
     *        The code execution output in text format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatementOutputData withTextPlain(String textPlain) {
        setTextPlain(textPlain);
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
        if (getTextPlain() != null)
            sb.append("TextPlain: ").append(getTextPlain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatementOutputData == false)
            return false;
        StatementOutputData other = (StatementOutputData) obj;
        if (other.getTextPlain() == null ^ this.getTextPlain() == null)
            return false;
        if (other.getTextPlain() != null && other.getTextPlain().equals(this.getTextPlain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextPlain() == null) ? 0 : getTextPlain().hashCode());
        return hashCode;
    }

    @Override
    public StatementOutputData clone() {
        try {
            return (StatementOutputData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.StatementOutputDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
