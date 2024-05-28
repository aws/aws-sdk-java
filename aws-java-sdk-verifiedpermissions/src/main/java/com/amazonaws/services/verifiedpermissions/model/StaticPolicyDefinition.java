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
 * Contains information about a static policy.
 * </p>
 * <p>
 * This data type is used as a field that is part of the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_PolicyDefinitionDetail.html"
 * >PolicyDefinitionDetail</a> type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/StaticPolicyDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticPolicyDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the static policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The policy content of the static policy, written in the Cedar policy language.
     * </p>
     */
    private String statement;

    /**
     * <p>
     * The description of the static policy.
     * </p>
     * 
     * @param description
     *        The description of the static policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the static policy.
     * </p>
     * 
     * @return The description of the static policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the static policy.
     * </p>
     * 
     * @param description
     *        The description of the static policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticPolicyDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The policy content of the static policy, written in the Cedar policy language.
     * </p>
     * 
     * @param statement
     *        The policy content of the static policy, written in the Cedar policy language.
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * The policy content of the static policy, written in the Cedar policy language.
     * </p>
     * 
     * @return The policy content of the static policy, written in the Cedar policy language.
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * The policy content of the static policy, written in the Cedar policy language.
     * </p>
     * 
     * @param statement
     *        The policy content of the static policy, written in the Cedar policy language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticPolicyDefinition withStatement(String statement) {
        setStatement(statement);
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
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatement() != null)
            sb.append("Statement: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticPolicyDefinition == false)
            return false;
        StaticPolicyDefinition other = (StaticPolicyDefinition) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        return hashCode;
    }

    @Override
    public StaticPolicyDefinition clone() {
        try {
            return (StaticPolicyDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.StaticPolicyDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
