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
 * The possible Amazon Web Services Free Tier configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateFreeTierConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFreeTierConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Activate or deactivate Amazon Web Services Free Tier.
     * </p>
     */
    private Boolean activated;

    /**
     * <p>
     * Activate or deactivate Amazon Web Services Free Tier.
     * </p>
     * 
     * @param activated
     *        Activate or deactivate Amazon Web Services Free Tier.
     */

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    /**
     * <p>
     * Activate or deactivate Amazon Web Services Free Tier.
     * </p>
     * 
     * @return Activate or deactivate Amazon Web Services Free Tier.
     */

    public Boolean getActivated() {
        return this.activated;
    }

    /**
     * <p>
     * Activate or deactivate Amazon Web Services Free Tier.
     * </p>
     * 
     * @param activated
     *        Activate or deactivate Amazon Web Services Free Tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFreeTierConfig withActivated(Boolean activated) {
        setActivated(activated);
        return this;
    }

    /**
     * <p>
     * Activate or deactivate Amazon Web Services Free Tier.
     * </p>
     * 
     * @return Activate or deactivate Amazon Web Services Free Tier.
     */

    public Boolean isActivated() {
        return this.activated;
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
        if (getActivated() != null)
            sb.append("Activated: ").append(getActivated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFreeTierConfig == false)
            return false;
        CreateFreeTierConfig other = (CreateFreeTierConfig) obj;
        if (other.getActivated() == null ^ this.getActivated() == null)
            return false;
        if (other.getActivated() != null && other.getActivated().equals(this.getActivated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivated() == null) ? 0 : getActivated().hashCode());
        return hashCode;
    }

    @Override
    public CreateFreeTierConfig clone() {
        try {
            return (CreateFreeTierConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.CreateFreeTierConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
