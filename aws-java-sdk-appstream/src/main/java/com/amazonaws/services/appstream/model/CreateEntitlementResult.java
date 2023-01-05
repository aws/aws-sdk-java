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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateEntitlement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEntitlementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The entitlement.
     * </p>
     */
    private Entitlement entitlement;

    /**
     * <p>
     * The entitlement.
     * </p>
     * 
     * @param entitlement
     *        The entitlement.
     */

    public void setEntitlement(Entitlement entitlement) {
        this.entitlement = entitlement;
    }

    /**
     * <p>
     * The entitlement.
     * </p>
     * 
     * @return The entitlement.
     */

    public Entitlement getEntitlement() {
        return this.entitlement;
    }

    /**
     * <p>
     * The entitlement.
     * </p>
     * 
     * @param entitlement
     *        The entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntitlementResult withEntitlement(Entitlement entitlement) {
        setEntitlement(entitlement);
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
        if (getEntitlement() != null)
            sb.append("Entitlement: ").append(getEntitlement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEntitlementResult == false)
            return false;
        CreateEntitlementResult other = (CreateEntitlementResult) obj;
        if (other.getEntitlement() == null ^ this.getEntitlement() == null)
            return false;
        if (other.getEntitlement() != null && other.getEntitlement().equals(this.getEntitlement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntitlement() == null) ? 0 : getEntitlement().hashCode());
        return hashCode;
    }

    @Override
    public CreateEntitlementResult clone() {
        try {
            return (CreateEntitlementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
