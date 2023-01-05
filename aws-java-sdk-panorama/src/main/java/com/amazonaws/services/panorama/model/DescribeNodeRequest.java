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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The node's ID.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * The account ID of the node's owner.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The node's ID.
     * </p>
     * 
     * @param nodeId
     *        The node's ID.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * The node's ID.
     * </p>
     * 
     * @return The node's ID.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * The node's ID.
     * </p>
     * 
     * @param nodeId
     *        The node's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeRequest withNodeId(String nodeId) {
        setNodeId(nodeId);
        return this;
    }

    /**
     * <p>
     * The account ID of the node's owner.
     * </p>
     * 
     * @param ownerAccount
     *        The account ID of the node's owner.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The account ID of the node's owner.
     * </p>
     * 
     * @return The account ID of the node's owner.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The account ID of the node's owner.
     * </p>
     * 
     * @param ownerAccount
     *        The account ID of the node's owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
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
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeRequest == false)
            return false;
        DescribeNodeRequest other = (DescribeNodeRequest) obj;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNodeRequest clone() {
        return (DescribeNodeRequest) super.clone();
    }

}
