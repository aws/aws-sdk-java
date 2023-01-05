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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectAttachmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response to a Connect attachment request.
     * </p>
     */
    private ConnectAttachment connectAttachment;

    /**
     * <p>
     * The response to a Connect attachment request.
     * </p>
     * 
     * @param connectAttachment
     *        The response to a Connect attachment request.
     */

    public void setConnectAttachment(ConnectAttachment connectAttachment) {
        this.connectAttachment = connectAttachment;
    }

    /**
     * <p>
     * The response to a Connect attachment request.
     * </p>
     * 
     * @return The response to a Connect attachment request.
     */

    public ConnectAttachment getConnectAttachment() {
        return this.connectAttachment;
    }

    /**
     * <p>
     * The response to a Connect attachment request.
     * </p>
     * 
     * @param connectAttachment
     *        The response to a Connect attachment request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectAttachmentResult withConnectAttachment(ConnectAttachment connectAttachment) {
        setConnectAttachment(connectAttachment);
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
        if (getConnectAttachment() != null)
            sb.append("ConnectAttachment: ").append(getConnectAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectAttachmentResult == false)
            return false;
        CreateConnectAttachmentResult other = (CreateConnectAttachmentResult) obj;
        if (other.getConnectAttachment() == null ^ this.getConnectAttachment() == null)
            return false;
        if (other.getConnectAttachment() != null && other.getConnectAttachment().equals(this.getConnectAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectAttachment() == null) ? 0 : getConnectAttachment().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectAttachmentResult clone() {
        try {
            return (CreateConnectAttachmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
