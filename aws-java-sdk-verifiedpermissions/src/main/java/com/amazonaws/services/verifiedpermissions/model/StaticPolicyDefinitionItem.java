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
 * A structure that contains details about a static policy. It includes the description and policy statement.
 * </p>
 * <p>
 * This data type is used within a <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_PolicyDefinition.html"
 * >PolicyDefinition</a> structure as part of a request parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html">CreatePolicy</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/StaticPolicyDefinitionItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticPolicyDefinitionItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the static policy.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A description of the static policy.
     * </p>
     * 
     * @param description
     *        A description of the static policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the static policy.
     * </p>
     * 
     * @return A description of the static policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the static policy.
     * </p>
     * 
     * @param description
     *        A description of the static policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticPolicyDefinitionItem withDescription(String description) {
        setDescription(description);
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticPolicyDefinitionItem == false)
            return false;
        StaticPolicyDefinitionItem other = (StaticPolicyDefinitionItem) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public StaticPolicyDefinitionItem clone() {
        try {
            return (StaticPolicyDefinitionItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.StaticPolicyDefinitionItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
