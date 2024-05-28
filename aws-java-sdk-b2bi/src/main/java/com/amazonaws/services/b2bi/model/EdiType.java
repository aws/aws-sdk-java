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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is supported.
 * X12 is a set of standards and corresponding messages that define specific business documents.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/EdiType" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdiType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     */
    private X12Details x12Details;

    /**
     * <p>
     * Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @param x12Details
     *        Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *        supported. X12 is a set of standards and corresponding messages that define specific business documents.
     */

    public void setX12Details(X12Details x12Details) {
        this.x12Details = x12Details;
    }

    /**
     * <p>
     * Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @return Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *         supported. X12 is a set of standards and corresponding messages that define specific business documents.
     */

    public X12Details getX12Details() {
        return this.x12Details;
    }

    /**
     * <p>
     * Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @param x12Details
     *        Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *        supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdiType withX12Details(X12Details x12Details) {
        setX12Details(x12Details);
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
        if (getX12Details() != null)
            sb.append("X12Details: ").append(getX12Details());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdiType == false)
            return false;
        EdiType other = (EdiType) obj;
        if (other.getX12Details() == null ^ this.getX12Details() == null)
            return false;
        if (other.getX12Details() != null && other.getX12Details().equals(this.getX12Details()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getX12Details() == null) ? 0 : getX12Details().hashCode());
        return hashCode;
    }

    @Override
    public EdiType clone() {
        try {
            return (EdiType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.b2bi.model.transform.EdiTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
