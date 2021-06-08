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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A system asset that is evaluated in an AWS Audit Manager assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the specified resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The value of the specified resource.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the specified resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the specified resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the specified resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the specified resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the specified resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The value of the specified resource.
     * </p>
     * 
     * @param value
     *        The value of the specified resource.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the specified resource.
     * </p>
     * 
     * @return The value of the specified resource.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the specified resource.
     * </p>
     * 
     * @param value
     *        The value of the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withValue(String value) {
        setValue(value);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
