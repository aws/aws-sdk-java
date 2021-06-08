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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A system-assigned unique identifier for a server that has this access assigned.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The external ID of the server that the access is attached to.
     * </p>
     */
    private DescribedAccess access;

    /**
     * <p>
     * A system-assigned unique identifier for a server that has this access assigned.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server that has this access assigned.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server that has this access assigned.
     * </p>
     * 
     * @return A system-assigned unique identifier for a server that has this access assigned.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server that has this access assigned.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server that has this access assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The external ID of the server that the access is attached to.
     * </p>
     * 
     * @param access
     *        The external ID of the server that the access is attached to.
     */

    public void setAccess(DescribedAccess access) {
        this.access = access;
    }

    /**
     * <p>
     * The external ID of the server that the access is attached to.
     * </p>
     * 
     * @return The external ID of the server that the access is attached to.
     */

    public DescribedAccess getAccess() {
        return this.access;
    }

    /**
     * <p>
     * The external ID of the server that the access is attached to.
     * </p>
     * 
     * @param access
     *        The external ID of the server that the access is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessResult withAccess(DescribedAccess access) {
        setAccess(access);
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getAccess() != null)
            sb.append("Access: ").append(getAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccessResult == false)
            return false;
        DescribeAccessResult other = (DescribeAccessResult) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getAccess() == null ^ this.getAccess() == null)
            return false;
        if (other.getAccess() != null && other.getAccess().equals(this.getAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getAccess() == null) ? 0 : getAccess().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccessResult clone() {
        try {
            return (DescribeAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
