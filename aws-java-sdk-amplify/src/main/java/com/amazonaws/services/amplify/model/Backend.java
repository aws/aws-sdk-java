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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the backend properties associated with an Amplify <code>Branch</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/Backend" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Backend implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the CloudFormation stack.
     * </p>
     */
    private String stackArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the CloudFormation stack.
     * </p>
     * 
     * @param stackArn
     *        The Amazon Resource Name (ARN) for the CloudFormation stack.
     */

    public void setStackArn(String stackArn) {
        this.stackArn = stackArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the CloudFormation stack.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the CloudFormation stack.
     */

    public String getStackArn() {
        return this.stackArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the CloudFormation stack.
     * </p>
     * 
     * @param stackArn
     *        The Amazon Resource Name (ARN) for the CloudFormation stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backend withStackArn(String stackArn) {
        setStackArn(stackArn);
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
        if (getStackArn() != null)
            sb.append("StackArn: ").append(getStackArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Backend == false)
            return false;
        Backend other = (Backend) obj;
        if (other.getStackArn() == null ^ this.getStackArn() == null)
            return false;
        if (other.getStackArn() != null && other.getStackArn().equals(this.getStackArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackArn() == null) ? 0 : getStackArn().hashCode());
        return hashCode;
    }

    @Override
    public Backend clone() {
        try {
            return (Backend) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.BackendMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
