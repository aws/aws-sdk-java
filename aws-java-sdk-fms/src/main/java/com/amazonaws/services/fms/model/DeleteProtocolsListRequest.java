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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteProtocolsList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProtocolsListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the protocols list that you want to delete. You can retrieve this ID from <code>PutProtocolsList</code>, <code>ListProtocolsLists</code>, and <code>GetProtocolsLost</code>.
     * </p>
     */
    private String listId;

    /**
     * <p>
     * The ID of the protocols list that you want to delete. You can retrieve this ID from <code>PutProtocolsList</code>, <code>ListProtocolsLists</code>, and <code>GetProtocolsLost</code>.
     * </p>
     * 
     * @param listId
     *        The ID of the protocols list that you want to delete. You can retrieve this ID from
     *        <code>PutProtocolsList</code>, <code>ListProtocolsLists</code>, and <code>GetProtocolsLost</code>.
     */

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * <p>
     * The ID of the protocols list that you want to delete. You can retrieve this ID from <code>PutProtocolsList</code>, <code>ListProtocolsLists</code>, and <code>GetProtocolsLost</code>.
     * </p>
     * 
     * @return The ID of the protocols list that you want to delete. You can retrieve this ID from
     *         <code>PutProtocolsList</code>, <code>ListProtocolsLists</code>, and <code>GetProtocolsLost</code>.
     */

    public String getListId() {
        return this.listId;
    }

    /**
     * <p>
     * The ID of the protocols list that you want to delete. You can retrieve this ID from <code>PutProtocolsList</code>, <code>ListProtocolsLists</code>, and <code>GetProtocolsLost</code>.
     * </p>
     * 
     * @param listId
     *        The ID of the protocols list that you want to delete. You can retrieve this ID from
     *        <code>PutProtocolsList</code>, <code>ListProtocolsLists</code>, and <code>GetProtocolsLost</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProtocolsListRequest withListId(String listId) {
        setListId(listId);
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
        if (getListId() != null)
            sb.append("ListId: ").append(getListId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProtocolsListRequest == false)
            return false;
        DeleteProtocolsListRequest other = (DeleteProtocolsListRequest) obj;
        if (other.getListId() == null ^ this.getListId() == null)
            return false;
        if (other.getListId() != null && other.getListId().equals(this.getListId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListId() == null) ? 0 : getListId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProtocolsListRequest clone() {
        return (DeleteProtocolsListRequest) super.clone();
    }

}
