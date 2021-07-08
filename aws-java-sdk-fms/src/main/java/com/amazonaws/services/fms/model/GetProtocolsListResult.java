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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtocolsList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProtocolsListResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the specified Firewall Manager protocols list.
     * </p>
     */
    private ProtocolsListData protocolsList;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified protocols list.
     * </p>
     */
    private String protocolsListArn;

    /**
     * <p>
     * Information about the specified Firewall Manager protocols list.
     * </p>
     * 
     * @param protocolsList
     *        Information about the specified Firewall Manager protocols list.
     */

    public void setProtocolsList(ProtocolsListData protocolsList) {
        this.protocolsList = protocolsList;
    }

    /**
     * <p>
     * Information about the specified Firewall Manager protocols list.
     * </p>
     * 
     * @return Information about the specified Firewall Manager protocols list.
     */

    public ProtocolsListData getProtocolsList() {
        return this.protocolsList;
    }

    /**
     * <p>
     * Information about the specified Firewall Manager protocols list.
     * </p>
     * 
     * @param protocolsList
     *        Information about the specified Firewall Manager protocols list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtocolsListResult withProtocolsList(ProtocolsListData protocolsList) {
        setProtocolsList(protocolsList);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified protocols list.
     * </p>
     * 
     * @param protocolsListArn
     *        The Amazon Resource Name (ARN) of the specified protocols list.
     */

    public void setProtocolsListArn(String protocolsListArn) {
        this.protocolsListArn = protocolsListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified protocols list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified protocols list.
     */

    public String getProtocolsListArn() {
        return this.protocolsListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified protocols list.
     * </p>
     * 
     * @param protocolsListArn
     *        The Amazon Resource Name (ARN) of the specified protocols list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProtocolsListResult withProtocolsListArn(String protocolsListArn) {
        setProtocolsListArn(protocolsListArn);
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
        if (getProtocolsList() != null)
            sb.append("ProtocolsList: ").append(getProtocolsList()).append(",");
        if (getProtocolsListArn() != null)
            sb.append("ProtocolsListArn: ").append(getProtocolsListArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProtocolsListResult == false)
            return false;
        GetProtocolsListResult other = (GetProtocolsListResult) obj;
        if (other.getProtocolsList() == null ^ this.getProtocolsList() == null)
            return false;
        if (other.getProtocolsList() != null && other.getProtocolsList().equals(this.getProtocolsList()) == false)
            return false;
        if (other.getProtocolsListArn() == null ^ this.getProtocolsListArn() == null)
            return false;
        if (other.getProtocolsListArn() != null && other.getProtocolsListArn().equals(this.getProtocolsListArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocolsList() == null) ? 0 : getProtocolsList().hashCode());
        hashCode = prime * hashCode + ((getProtocolsListArn() == null) ? 0 : getProtocolsListArn().hashCode());
        return hashCode;
    }

    @Override
    public GetProtocolsListResult clone() {
        try {
            return (GetProtocolsListResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
