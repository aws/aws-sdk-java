/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;

/**
 * 
 */
public class DisassociateNodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String nodeAssociationStatusToken;

    /**
     * @param nodeAssociationStatusToken
     */

    public void setNodeAssociationStatusToken(String nodeAssociationStatusToken) {
        this.nodeAssociationStatusToken = nodeAssociationStatusToken;
    }

    /**
     * @return
     */

    public String getNodeAssociationStatusToken() {
        return this.nodeAssociationStatusToken;
    }

    /**
     * @param nodeAssociationStatusToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateNodeResult withNodeAssociationStatusToken(String nodeAssociationStatusToken) {
        setNodeAssociationStatusToken(nodeAssociationStatusToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNodeAssociationStatusToken() != null)
            sb.append("NodeAssociationStatusToken: " + getNodeAssociationStatusToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateNodeResult == false)
            return false;
        DisassociateNodeResult other = (DisassociateNodeResult) obj;
        if (other.getNodeAssociationStatusToken() == null ^ this.getNodeAssociationStatusToken() == null)
            return false;
        if (other.getNodeAssociationStatusToken() != null && other.getNodeAssociationStatusToken().equals(this.getNodeAssociationStatusToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeAssociationStatusToken() == null) ? 0 : getNodeAssociationStatusToken().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateNodeResult clone() {
        try {
            return (DisassociateNodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
