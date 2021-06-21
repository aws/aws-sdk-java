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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TestType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the extension.
     * </p>
     */
    private String typeVersionArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the extension.
     * </p>
     * 
     * @param typeVersionArn
     *        The Amazon Resource Number (ARN) of the extension.
     */

    public void setTypeVersionArn(String typeVersionArn) {
        this.typeVersionArn = typeVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the extension.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the extension.
     */

    public String getTypeVersionArn() {
        return this.typeVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the extension.
     * </p>
     * 
     * @param typeVersionArn
     *        The Amazon Resource Number (ARN) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestTypeResult withTypeVersionArn(String typeVersionArn) {
        setTypeVersionArn(typeVersionArn);
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
        if (getTypeVersionArn() != null)
            sb.append("TypeVersionArn: ").append(getTypeVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestTypeResult == false)
            return false;
        TestTypeResult other = (TestTypeResult) obj;
        if (other.getTypeVersionArn() == null ^ this.getTypeVersionArn() == null)
            return false;
        if (other.getTypeVersionArn() != null && other.getTypeVersionArn().equals(this.getTypeVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeVersionArn() == null) ? 0 : getTypeVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public TestTypeResult clone() {
        try {
            return (TestTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
