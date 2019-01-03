/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/EC2Specification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2Specification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible reservations.
     * </p>
     */
    private String offeringClass;

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible reservations.
     * </p>
     * 
     * @param offeringClass
     *        Whether you want a recommendation for standard or convertible reservations.
     * @see OfferingClass
     */

    public void setOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
    }

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible reservations.
     * </p>
     * 
     * @return Whether you want a recommendation for standard or convertible reservations.
     * @see OfferingClass
     */

    public String getOfferingClass() {
        return this.offeringClass;
    }

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible reservations.
     * </p>
     * 
     * @param offeringClass
     *        Whether you want a recommendation for standard or convertible reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClass
     */

    public EC2Specification withOfferingClass(String offeringClass) {
        setOfferingClass(offeringClass);
        return this;
    }

    /**
     * <p>
     * Whether you want a recommendation for standard or convertible reservations.
     * </p>
     * 
     * @param offeringClass
     *        Whether you want a recommendation for standard or convertible reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClass
     */

    public EC2Specification withOfferingClass(OfferingClass offeringClass) {
        this.offeringClass = offeringClass.toString();
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
        if (getOfferingClass() != null)
            sb.append("OfferingClass: ").append(getOfferingClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2Specification == false)
            return false;
        EC2Specification other = (EC2Specification) obj;
        if (other.getOfferingClass() == null ^ this.getOfferingClass() == null)
            return false;
        if (other.getOfferingClass() != null && other.getOfferingClass().equals(this.getOfferingClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingClass() == null) ? 0 : getOfferingClass().hashCode());
        return hashCode;
    }

    @Override
    public EC2Specification clone() {
        try {
            return (EC2Specification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.EC2SpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
