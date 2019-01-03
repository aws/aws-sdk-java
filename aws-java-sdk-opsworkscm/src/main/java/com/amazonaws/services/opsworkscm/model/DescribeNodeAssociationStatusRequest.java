/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeNodeAssociationStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeAssociationStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse.
     * </p>
     */
    private String nodeAssociationStatusToken;
    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse.
     * </p>
     * 
     * @param nodeAssociationStatusToken
     *        The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse.
     */

    public void setNodeAssociationStatusToken(String nodeAssociationStatusToken) {
        this.nodeAssociationStatusToken = nodeAssociationStatusToken;
    }

    /**
     * <p>
     * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse.
     * </p>
     * 
     * @return The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse.
     */

    public String getNodeAssociationStatusToken() {
        return this.nodeAssociationStatusToken;
    }

    /**
     * <p>
     * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse.
     * </p>
     * 
     * @param nodeAssociationStatusToken
     *        The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeAssociationStatusRequest withNodeAssociationStatusToken(String nodeAssociationStatusToken) {
        setNodeAssociationStatusToken(nodeAssociationStatusToken);
        return this;
    }

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * 
     * @param serverName
     *        The name of the server from which to disassociate the node.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * 
     * @return The name of the server from which to disassociate the node.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server from which to disassociate the node.
     * </p>
     * 
     * @param serverName
     *        The name of the server from which to disassociate the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeAssociationStatusRequest withServerName(String serverName) {
        setServerName(serverName);
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
        if (getNodeAssociationStatusToken() != null)
            sb.append("NodeAssociationStatusToken: ").append(getNodeAssociationStatusToken()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeAssociationStatusRequest == false)
            return false;
        DescribeNodeAssociationStatusRequest other = (DescribeNodeAssociationStatusRequest) obj;
        if (other.getNodeAssociationStatusToken() == null ^ this.getNodeAssociationStatusToken() == null)
            return false;
        if (other.getNodeAssociationStatusToken() != null && other.getNodeAssociationStatusToken().equals(this.getNodeAssociationStatusToken()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeAssociationStatusToken() == null) ? 0 : getNodeAssociationStatusToken().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNodeAssociationStatusRequest clone() {
        return (DescribeNodeAssociationStatusRequest) super.clone();
    }

}
