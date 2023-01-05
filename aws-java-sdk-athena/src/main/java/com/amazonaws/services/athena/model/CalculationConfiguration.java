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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration information for the calculation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CalculationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string that contains the code for the calculation.
     * </p>
     */
    private String codeBlock;

    /**
     * <p>
     * A string that contains the code for the calculation.
     * </p>
     * 
     * @param codeBlock
     *        A string that contains the code for the calculation.
     */

    public void setCodeBlock(String codeBlock) {
        this.codeBlock = codeBlock;
    }

    /**
     * <p>
     * A string that contains the code for the calculation.
     * </p>
     * 
     * @return A string that contains the code for the calculation.
     */

    public String getCodeBlock() {
        return this.codeBlock;
    }

    /**
     * <p>
     * A string that contains the code for the calculation.
     * </p>
     * 
     * @param codeBlock
     *        A string that contains the code for the calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationConfiguration withCodeBlock(String codeBlock) {
        setCodeBlock(codeBlock);
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
        if (getCodeBlock() != null)
            sb.append("CodeBlock: ").append(getCodeBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculationConfiguration == false)
            return false;
        CalculationConfiguration other = (CalculationConfiguration) obj;
        if (other.getCodeBlock() == null ^ this.getCodeBlock() == null)
            return false;
        if (other.getCodeBlock() != null && other.getCodeBlock().equals(this.getCodeBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeBlock() == null) ? 0 : getCodeBlock().hashCode());
        return hashCode;
    }

    @Override
    public CalculationConfiguration clone() {
        try {
            return (CalculationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.CalculationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
