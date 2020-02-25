/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The tax documents required in AWS Regions in India.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/INDTaxDocuments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class INDTaxDocuments implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Goods and Services Tax (GST) documents required in AWS Regions in India.
     * </p>
     */
    private String gSTIN;

    /**
     * <p>
     * The Goods and Services Tax (GST) documents required in AWS Regions in India.
     * </p>
     * 
     * @param gSTIN
     *        The Goods and Services Tax (GST) documents required in AWS Regions in India.
     */

    public void setGSTIN(String gSTIN) {
        this.gSTIN = gSTIN;
    }

    /**
     * <p>
     * The Goods and Services Tax (GST) documents required in AWS Regions in India.
     * </p>
     * 
     * @return The Goods and Services Tax (GST) documents required in AWS Regions in India.
     */

    public String getGSTIN() {
        return this.gSTIN;
    }

    /**
     * <p>
     * The Goods and Services Tax (GST) documents required in AWS Regions in India.
     * </p>
     * 
     * @param gSTIN
     *        The Goods and Services Tax (GST) documents required in AWS Regions in India.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public INDTaxDocuments withGSTIN(String gSTIN) {
        setGSTIN(gSTIN);
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
        if (getGSTIN() != null)
            sb.append("GSTIN: ").append(getGSTIN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof INDTaxDocuments == false)
            return false;
        INDTaxDocuments other = (INDTaxDocuments) obj;
        if (other.getGSTIN() == null ^ this.getGSTIN() == null)
            return false;
        if (other.getGSTIN() != null && other.getGSTIN().equals(this.getGSTIN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGSTIN() == null) ? 0 : getGSTIN().hashCode());
        return hashCode;
    }

    @Override
    public INDTaxDocuments clone() {
        try {
            return (INDTaxDocuments) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.INDTaxDocumentsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
