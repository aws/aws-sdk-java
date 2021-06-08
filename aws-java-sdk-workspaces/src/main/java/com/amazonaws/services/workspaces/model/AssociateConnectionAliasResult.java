/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateConnectionAlias"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateConnectionAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when
     * you're configuring your DNS routing policies.
     * </p>
     */
    private String connectionIdentifier;

    /**
     * <p>
     * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when
     * you're configuring your DNS routing policies.
     * </p>
     * 
     * @param connectionIdentifier
     *        The identifier of the connection alias association. You use the connection identifier in the DNS TXT
     *        record when you're configuring your DNS routing policies.
     */

    public void setConnectionIdentifier(String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
    }

    /**
     * <p>
     * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when
     * you're configuring your DNS routing policies.
     * </p>
     * 
     * @return The identifier of the connection alias association. You use the connection identifier in the DNS TXT
     *         record when you're configuring your DNS routing policies.
     */

    public String getConnectionIdentifier() {
        return this.connectionIdentifier;
    }

    /**
     * <p>
     * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when
     * you're configuring your DNS routing policies.
     * </p>
     * 
     * @param connectionIdentifier
     *        The identifier of the connection alias association. You use the connection identifier in the DNS TXT
     *        record when you're configuring your DNS routing policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateConnectionAliasResult withConnectionIdentifier(String connectionIdentifier) {
        setConnectionIdentifier(connectionIdentifier);
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
        if (getConnectionIdentifier() != null)
            sb.append("ConnectionIdentifier: ").append(getConnectionIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateConnectionAliasResult == false)
            return false;
        AssociateConnectionAliasResult other = (AssociateConnectionAliasResult) obj;
        if (other.getConnectionIdentifier() == null ^ this.getConnectionIdentifier() == null)
            return false;
        if (other.getConnectionIdentifier() != null && other.getConnectionIdentifier().equals(this.getConnectionIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionIdentifier() == null) ? 0 : getConnectionIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public AssociateConnectionAliasResult clone() {
        try {
            return (AssociateConnectionAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
