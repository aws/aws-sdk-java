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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides connection details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SourceConnectionParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceConnectionParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides <code>ConnectionType</code> details.
     * </p>
     */
    private CodeStarParameters codeStar;

    /**
     * <p>
     * Provides <code>ConnectionType</code> details.
     * </p>
     * 
     * @param codeStar
     *        Provides <code>ConnectionType</code> details.
     */

    public void setCodeStar(CodeStarParameters codeStar) {
        this.codeStar = codeStar;
    }

    /**
     * <p>
     * Provides <code>ConnectionType</code> details.
     * </p>
     * 
     * @return Provides <code>ConnectionType</code> details.
     */

    public CodeStarParameters getCodeStar() {
        return this.codeStar;
    }

    /**
     * <p>
     * Provides <code>ConnectionType</code> details.
     * </p>
     * 
     * @param codeStar
     *        Provides <code>ConnectionType</code> details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectionParameters withCodeStar(CodeStarParameters codeStar) {
        setCodeStar(codeStar);
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
        if (getCodeStar() != null)
            sb.append("CodeStar: ").append(getCodeStar());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceConnectionParameters == false)
            return false;
        SourceConnectionParameters other = (SourceConnectionParameters) obj;
        if (other.getCodeStar() == null ^ this.getCodeStar() == null)
            return false;
        if (other.getCodeStar() != null && other.getCodeStar().equals(this.getCodeStar()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeStar() == null) ? 0 : getCodeStar().hashCode());
        return hashCode;
    }

    @Override
    public SourceConnectionParameters clone() {
        try {
            return (SourceConnectionParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.SourceConnectionParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
