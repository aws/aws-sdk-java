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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about updates to be applied to a policy.
 * </p>
 * <p>
 * This data type is used as a request parameter in the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicy.html">UpdatePolicy</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePolicyDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains details about the updates to be applied to a static policy.
     * </p>
     */
    private UpdateStaticPolicyDefinition staticValue;

    /**
     * <p>
     * Contains details about the updates to be applied to a static policy.
     * </p>
     * 
     * @param staticValue
     *        Contains details about the updates to be applied to a static policy.
     */

    public void setStatic(UpdateStaticPolicyDefinition staticValue) {
        this.staticValue = staticValue;
    }

    /**
     * <p>
     * Contains details about the updates to be applied to a static policy.
     * </p>
     * 
     * @return Contains details about the updates to be applied to a static policy.
     */

    public UpdateStaticPolicyDefinition getStatic() {
        return this.staticValue;
    }

    /**
     * <p>
     * Contains details about the updates to be applied to a static policy.
     * </p>
     * 
     * @param staticValue
     *        Contains details about the updates to be applied to a static policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyDefinition withStatic(UpdateStaticPolicyDefinition staticValue) {
        setStatic(staticValue);
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
        if (getStatic() != null)
            sb.append("Static: ").append(getStatic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePolicyDefinition == false)
            return false;
        UpdatePolicyDefinition other = (UpdatePolicyDefinition) obj;
        if (other.getStatic() == null ^ this.getStatic() == null)
            return false;
        if (other.getStatic() != null && other.getStatic().equals(this.getStatic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatic() == null) ? 0 : getStatic().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePolicyDefinition clone() {
        try {
            return (UpdatePolicyDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.UpdatePolicyDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
