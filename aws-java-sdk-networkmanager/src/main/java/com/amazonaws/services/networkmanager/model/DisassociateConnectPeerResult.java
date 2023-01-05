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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateConnectPeer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateConnectPeerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the Connect peer association.
     * </p>
     */
    private ConnectPeerAssociation connectPeerAssociation;

    /**
     * <p>
     * Describes the Connect peer association.
     * </p>
     * 
     * @param connectPeerAssociation
     *        Describes the Connect peer association.
     */

    public void setConnectPeerAssociation(ConnectPeerAssociation connectPeerAssociation) {
        this.connectPeerAssociation = connectPeerAssociation;
    }

    /**
     * <p>
     * Describes the Connect peer association.
     * </p>
     * 
     * @return Describes the Connect peer association.
     */

    public ConnectPeerAssociation getConnectPeerAssociation() {
        return this.connectPeerAssociation;
    }

    /**
     * <p>
     * Describes the Connect peer association.
     * </p>
     * 
     * @param connectPeerAssociation
     *        Describes the Connect peer association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateConnectPeerResult withConnectPeerAssociation(ConnectPeerAssociation connectPeerAssociation) {
        setConnectPeerAssociation(connectPeerAssociation);
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
        if (getConnectPeerAssociation() != null)
            sb.append("ConnectPeerAssociation: ").append(getConnectPeerAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateConnectPeerResult == false)
            return false;
        DisassociateConnectPeerResult other = (DisassociateConnectPeerResult) obj;
        if (other.getConnectPeerAssociation() == null ^ this.getConnectPeerAssociation() == null)
            return false;
        if (other.getConnectPeerAssociation() != null && other.getConnectPeerAssociation().equals(this.getConnectPeerAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectPeerAssociation() == null) ? 0 : getConnectPeerAssociation().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateConnectPeerResult clone() {
        try {
            return (DisassociateConnectPeerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
