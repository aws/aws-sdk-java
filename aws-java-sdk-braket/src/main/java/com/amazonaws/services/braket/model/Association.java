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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Braket resource and the association type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/Association" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Association implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Braket resource arn.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The association type for the specified Amazon Braket resource arn.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Braket resource arn.
     * </p>
     * 
     * @param arn
     *        The Amazon Braket resource arn.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Braket resource arn.
     * </p>
     * 
     * @return The Amazon Braket resource arn.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Braket resource arn.
     * </p>
     * 
     * @param arn
     *        The Amazon Braket resource arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The association type for the specified Amazon Braket resource arn.
     * </p>
     * 
     * @param type
     *        The association type for the specified Amazon Braket resource arn.
     * @see AssociationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The association type for the specified Amazon Braket resource arn.
     * </p>
     * 
     * @return The association type for the specified Amazon Braket resource arn.
     * @see AssociationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The association type for the specified Amazon Braket resource arn.
     * </p>
     * 
     * @param type
     *        The association type for the specified Amazon Braket resource arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public Association withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The association type for the specified Amazon Braket resource arn.
     * </p>
     * 
     * @param type
     *        The association type for the specified Amazon Braket resource arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public Association withType(AssociationType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Association == false)
            return false;
        Association other = (Association) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Association clone() {
        try {
            return (Association) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.AssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
