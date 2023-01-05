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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The set of tiering configurations for the pricing rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateTieringInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTieringInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The possible Amazon Web Services Free Tier configurations.
     * </p>
     */
    private CreateFreeTierConfig freeTier;

    /**
     * <p>
     * The possible Amazon Web Services Free Tier configurations.
     * </p>
     * 
     * @param freeTier
     *        The possible Amazon Web Services Free Tier configurations.
     */

    public void setFreeTier(CreateFreeTierConfig freeTier) {
        this.freeTier = freeTier;
    }

    /**
     * <p>
     * The possible Amazon Web Services Free Tier configurations.
     * </p>
     * 
     * @return The possible Amazon Web Services Free Tier configurations.
     */

    public CreateFreeTierConfig getFreeTier() {
        return this.freeTier;
    }

    /**
     * <p>
     * The possible Amazon Web Services Free Tier configurations.
     * </p>
     * 
     * @param freeTier
     *        The possible Amazon Web Services Free Tier configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTieringInput withFreeTier(CreateFreeTierConfig freeTier) {
        setFreeTier(freeTier);
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
        if (getFreeTier() != null)
            sb.append("FreeTier: ").append(getFreeTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTieringInput == false)
            return false;
        CreateTieringInput other = (CreateTieringInput) obj;
        if (other.getFreeTier() == null ^ this.getFreeTier() == null)
            return false;
        if (other.getFreeTier() != null && other.getFreeTier().equals(this.getFreeTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFreeTier() == null) ? 0 : getFreeTier().hashCode());
        return hashCode;
    }

    @Override
    public CreateTieringInput clone() {
        try {
            return (CreateTieringInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.CreateTieringInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
