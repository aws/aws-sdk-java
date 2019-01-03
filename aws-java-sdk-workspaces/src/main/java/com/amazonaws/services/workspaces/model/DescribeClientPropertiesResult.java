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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeClientProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientPropertiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the specified Amazon WorkSpaces clients.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClientPropertiesResult> clientPropertiesList;

    /**
     * <p>
     * Information about the specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @return Information about the specified Amazon WorkSpaces clients.
     */

    public java.util.List<ClientPropertiesResult> getClientPropertiesList() {
        if (clientPropertiesList == null) {
            clientPropertiesList = new com.amazonaws.internal.SdkInternalList<ClientPropertiesResult>();
        }
        return clientPropertiesList;
    }

    /**
     * <p>
     * Information about the specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param clientPropertiesList
     *        Information about the specified Amazon WorkSpaces clients.
     */

    public void setClientPropertiesList(java.util.Collection<ClientPropertiesResult> clientPropertiesList) {
        if (clientPropertiesList == null) {
            this.clientPropertiesList = null;
            return;
        }

        this.clientPropertiesList = new com.amazonaws.internal.SdkInternalList<ClientPropertiesResult>(clientPropertiesList);
    }

    /**
     * <p>
     * Information about the specified Amazon WorkSpaces clients.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientPropertiesList(java.util.Collection)} or {@link #withClientPropertiesList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param clientPropertiesList
     *        Information about the specified Amazon WorkSpaces clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientPropertiesResult withClientPropertiesList(ClientPropertiesResult... clientPropertiesList) {
        if (this.clientPropertiesList == null) {
            setClientPropertiesList(new com.amazonaws.internal.SdkInternalList<ClientPropertiesResult>(clientPropertiesList.length));
        }
        for (ClientPropertiesResult ele : clientPropertiesList) {
            this.clientPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param clientPropertiesList
     *        Information about the specified Amazon WorkSpaces clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientPropertiesResult withClientPropertiesList(java.util.Collection<ClientPropertiesResult> clientPropertiesList) {
        setClientPropertiesList(clientPropertiesList);
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
        if (getClientPropertiesList() != null)
            sb.append("ClientPropertiesList: ").append(getClientPropertiesList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClientPropertiesResult == false)
            return false;
        DescribeClientPropertiesResult other = (DescribeClientPropertiesResult) obj;
        if (other.getClientPropertiesList() == null ^ this.getClientPropertiesList() == null)
            return false;
        if (other.getClientPropertiesList() != null && other.getClientPropertiesList().equals(this.getClientPropertiesList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientPropertiesList() == null) ? 0 : getClientPropertiesList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClientPropertiesResult clone() {
        try {
            return (DescribeClientPropertiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
