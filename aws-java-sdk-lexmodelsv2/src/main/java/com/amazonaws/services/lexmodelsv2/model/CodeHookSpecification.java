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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CodeHookSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeHookSpecification implements Serializable, Cloneable, StructuredPojo {

    private LambdaCodeHook lambdaCodeHook;

    /**
     * @param lambdaCodeHook
     */

    public void setLambdaCodeHook(LambdaCodeHook lambdaCodeHook) {
        this.lambdaCodeHook = lambdaCodeHook;
    }

    /**
     * @return
     */

    public LambdaCodeHook getLambdaCodeHook() {
        return this.lambdaCodeHook;
    }

    /**
     * @param lambdaCodeHook
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeHookSpecification withLambdaCodeHook(LambdaCodeHook lambdaCodeHook) {
        setLambdaCodeHook(lambdaCodeHook);
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
        if (getLambdaCodeHook() != null)
            sb.append("LambdaCodeHook: ").append(getLambdaCodeHook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeHookSpecification == false)
            return false;
        CodeHookSpecification other = (CodeHookSpecification) obj;
        if (other.getLambdaCodeHook() == null ^ this.getLambdaCodeHook() == null)
            return false;
        if (other.getLambdaCodeHook() != null && other.getLambdaCodeHook().equals(this.getLambdaCodeHook()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaCodeHook() == null) ? 0 : getLambdaCodeHook().hashCode());
        return hashCode;
    }

    @Override
    public CodeHookSpecification clone() {
        try {
            return (CodeHookSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.CodeHookSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
