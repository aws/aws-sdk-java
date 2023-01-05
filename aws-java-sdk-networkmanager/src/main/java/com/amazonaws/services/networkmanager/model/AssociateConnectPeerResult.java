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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateConnectPeer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateConnectPeerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response to the Connect peer request.
     * </p>
     */
    private ConnectPeerAssociation connectPeerAssociation;

    /**
     * <p>
     * The response to the Connect peer request.
     * </p>
     * 
     * @param connectPeerAssociation
     *        The response to the Connect peer request.
     */

    public void setConnectPeerAssociation(ConnectPeerAssociation connectPeerAssociation) {
        this.connectPeerAssociation = connectPeerAssociation;
    }

    /**
     * <p>
     * The response to the Connect peer request.
     * </p>
     * 
     * @return The response to the Connect peer request.
     */

    public ConnectPeerAssociation getConnectPeerAssociation() {
        return this.connectPeerAssociation;
    }

    /**
     * <p>
     * The response to the Connect peer request.
     * </p>
     * 
     * @param connectPeerAssociation
     *        The response to the Connect peer request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateConnectPeerResult withConnectPeerAssociation(ConnectPeerAssociation connectPeerAssociation) {
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

        if (obj instanceof AssociateConnectPeerResult == false)
            return false;
        AssociateConnectPeerResult other = (AssociateConnectPeerResult) obj;
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
    public AssociateConnectPeerResult clone() {
        try {
            return (AssociateConnectPeerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
