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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the server that the user is attached to.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The external ID of the group whose users have access to your Amazon S3 or Amazon EFS resources over the enabled
     * protocols using Amazon Web Services Transfer Family.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The ID of the server that the user is attached to.
     * </p>
     * 
     * @param serverId
     *        The ID of the server that the user is attached to.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The ID of the server that the user is attached to.
     * </p>
     * 
     * @return The ID of the server that the user is attached to.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The ID of the server that the user is attached to.
     * </p>
     * 
     * @param serverId
     *        The ID of the server that the user is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The external ID of the group whose users have access to your Amazon S3 or Amazon EFS resources over the enabled
     * protocols using Amazon Web Services Transfer Family.
     * </p>
     * 
     * @param externalId
     *        The external ID of the group whose users have access to your Amazon S3 or Amazon EFS resources over the
     *        enabled protocols using Amazon Web Services Transfer Family.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID of the group whose users have access to your Amazon S3 or Amazon EFS resources over the enabled
     * protocols using Amazon Web Services Transfer Family.
     * </p>
     * 
     * @return The external ID of the group whose users have access to your Amazon S3 or Amazon EFS resources over the
     *         enabled protocols using Amazon Web Services Transfer Family.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID of the group whose users have access to your Amazon S3 or Amazon EFS resources over the enabled
     * protocols using Amazon Web Services Transfer Family.
     * </p>
     * 
     * @param externalId
     *        The external ID of the group whose users have access to your Amazon S3 or Amazon EFS resources over the
     *        enabled protocols using Amazon Web Services Transfer Family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessResult withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessResult == false)
            return false;
        CreateAccessResult other = (CreateAccessResult) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessResult clone() {
        try {
            return (CreateAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
