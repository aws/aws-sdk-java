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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for an IAM Identity Center configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/IdentityCenterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityCenterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean option that controls whether Trusted Identity Propagation should be used.
     * </p>
     */
    private Boolean enableIdentityPropagation;

    /**
     * <p>
     * A Boolean option that controls whether Trusted Identity Propagation should be used.
     * </p>
     * 
     * @param enableIdentityPropagation
     *        A Boolean option that controls whether Trusted Identity Propagation should be used.
     */

    public void setEnableIdentityPropagation(Boolean enableIdentityPropagation) {
        this.enableIdentityPropagation = enableIdentityPropagation;
    }

    /**
     * <p>
     * A Boolean option that controls whether Trusted Identity Propagation should be used.
     * </p>
     * 
     * @return A Boolean option that controls whether Trusted Identity Propagation should be used.
     */

    public Boolean getEnableIdentityPropagation() {
        return this.enableIdentityPropagation;
    }

    /**
     * <p>
     * A Boolean option that controls whether Trusted Identity Propagation should be used.
     * </p>
     * 
     * @param enableIdentityPropagation
     *        A Boolean option that controls whether Trusted Identity Propagation should be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityCenterConfiguration withEnableIdentityPropagation(Boolean enableIdentityPropagation) {
        setEnableIdentityPropagation(enableIdentityPropagation);
        return this;
    }

    /**
     * <p>
     * A Boolean option that controls whether Trusted Identity Propagation should be used.
     * </p>
     * 
     * @return A Boolean option that controls whether Trusted Identity Propagation should be used.
     */

    public Boolean isEnableIdentityPropagation() {
        return this.enableIdentityPropagation;
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
        if (getEnableIdentityPropagation() != null)
            sb.append("EnableIdentityPropagation: ").append(getEnableIdentityPropagation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityCenterConfiguration == false)
            return false;
        IdentityCenterConfiguration other = (IdentityCenterConfiguration) obj;
        if (other.getEnableIdentityPropagation() == null ^ this.getEnableIdentityPropagation() == null)
            return false;
        if (other.getEnableIdentityPropagation() != null && other.getEnableIdentityPropagation().equals(this.getEnableIdentityPropagation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableIdentityPropagation() == null) ? 0 : getEnableIdentityPropagation().hashCode());
        return hashCode;
    }

    @Override
    public IdentityCenterConfiguration clone() {
        try {
            return (IdentityCenterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.IdentityCenterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
