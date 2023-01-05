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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayPolicyTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Describes the created transit gateway policy table.
     * </p>
     */
    private TransitGatewayPolicyTable transitGatewayPolicyTable;

    /**
     * <p>
     * Describes the created transit gateway policy table.
     * </p>
     * 
     * @param transitGatewayPolicyTable
     *        Describes the created transit gateway policy table.
     */

    public void setTransitGatewayPolicyTable(TransitGatewayPolicyTable transitGatewayPolicyTable) {
        this.transitGatewayPolicyTable = transitGatewayPolicyTable;
    }

    /**
     * <p>
     * Describes the created transit gateway policy table.
     * </p>
     * 
     * @return Describes the created transit gateway policy table.
     */

    public TransitGatewayPolicyTable getTransitGatewayPolicyTable() {
        return this.transitGatewayPolicyTable;
    }

    /**
     * <p>
     * Describes the created transit gateway policy table.
     * </p>
     * 
     * @param transitGatewayPolicyTable
     *        Describes the created transit gateway policy table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayPolicyTableResult withTransitGatewayPolicyTable(TransitGatewayPolicyTable transitGatewayPolicyTable) {
        setTransitGatewayPolicyTable(transitGatewayPolicyTable);
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
        if (getTransitGatewayPolicyTable() != null)
            sb.append("TransitGatewayPolicyTable: ").append(getTransitGatewayPolicyTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitGatewayPolicyTableResult == false)
            return false;
        CreateTransitGatewayPolicyTableResult other = (CreateTransitGatewayPolicyTableResult) obj;
        if (other.getTransitGatewayPolicyTable() == null ^ this.getTransitGatewayPolicyTable() == null)
            return false;
        if (other.getTransitGatewayPolicyTable() != null && other.getTransitGatewayPolicyTable().equals(this.getTransitGatewayPolicyTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayPolicyTable() == null) ? 0 : getTransitGatewayPolicyTable().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayPolicyTableResult clone() {
        try {
            return (CreateTransitGatewayPolicyTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
