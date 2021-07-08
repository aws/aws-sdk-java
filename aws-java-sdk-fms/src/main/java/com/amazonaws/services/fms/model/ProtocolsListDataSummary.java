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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the Firewall Manager protocols list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ProtocolsListDataSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtocolsListDataSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified protocols list.
     * </p>
     */
    private String listArn;
    /**
     * <p>
     * The ID of the specified protocols list.
     * </p>
     */
    private String listId;
    /**
     * <p>
     * The name of the specified protocols list.
     * </p>
     */
    private String listName;
    /**
     * <p>
     * An array of protocols in the Firewall Manager protocols list.
     * </p>
     */
    private java.util.List<String> protocolsList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified protocols list.
     * </p>
     * 
     * @param listArn
     *        The Amazon Resource Name (ARN) of the specified protocols list.
     */

    public void setListArn(String listArn) {
        this.listArn = listArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified protocols list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified protocols list.
     */

    public String getListArn() {
        return this.listArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified protocols list.
     * </p>
     * 
     * @param listArn
     *        The Amazon Resource Name (ARN) of the specified protocols list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListDataSummary withListArn(String listArn) {
        setListArn(listArn);
        return this;
    }

    /**
     * <p>
     * The ID of the specified protocols list.
     * </p>
     * 
     * @param listId
     *        The ID of the specified protocols list.
     */

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * <p>
     * The ID of the specified protocols list.
     * </p>
     * 
     * @return The ID of the specified protocols list.
     */

    public String getListId() {
        return this.listId;
    }

    /**
     * <p>
     * The ID of the specified protocols list.
     * </p>
     * 
     * @param listId
     *        The ID of the specified protocols list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListDataSummary withListId(String listId) {
        setListId(listId);
        return this;
    }

    /**
     * <p>
     * The name of the specified protocols list.
     * </p>
     * 
     * @param listName
     *        The name of the specified protocols list.
     */

    public void setListName(String listName) {
        this.listName = listName;
    }

    /**
     * <p>
     * The name of the specified protocols list.
     * </p>
     * 
     * @return The name of the specified protocols list.
     */

    public String getListName() {
        return this.listName;
    }

    /**
     * <p>
     * The name of the specified protocols list.
     * </p>
     * 
     * @param listName
     *        The name of the specified protocols list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListDataSummary withListName(String listName) {
        setListName(listName);
        return this;
    }

    /**
     * <p>
     * An array of protocols in the Firewall Manager protocols list.
     * </p>
     * 
     * @return An array of protocols in the Firewall Manager protocols list.
     */

    public java.util.List<String> getProtocolsList() {
        return protocolsList;
    }

    /**
     * <p>
     * An array of protocols in the Firewall Manager protocols list.
     * </p>
     * 
     * @param protocolsList
     *        An array of protocols in the Firewall Manager protocols list.
     */

    public void setProtocolsList(java.util.Collection<String> protocolsList) {
        if (protocolsList == null) {
            this.protocolsList = null;
            return;
        }

        this.protocolsList = new java.util.ArrayList<String>(protocolsList);
    }

    /**
     * <p>
     * An array of protocols in the Firewall Manager protocols list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocolsList(java.util.Collection)} or {@link #withProtocolsList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param protocolsList
     *        An array of protocols in the Firewall Manager protocols list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListDataSummary withProtocolsList(String... protocolsList) {
        if (this.protocolsList == null) {
            setProtocolsList(new java.util.ArrayList<String>(protocolsList.length));
        }
        for (String ele : protocolsList) {
            this.protocolsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of protocols in the Firewall Manager protocols list.
     * </p>
     * 
     * @param protocolsList
     *        An array of protocols in the Firewall Manager protocols list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListDataSummary withProtocolsList(java.util.Collection<String> protocolsList) {
        setProtocolsList(protocolsList);
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
        if (getListArn() != null)
            sb.append("ListArn: ").append(getListArn()).append(",");
        if (getListId() != null)
            sb.append("ListId: ").append(getListId()).append(",");
        if (getListName() != null)
            sb.append("ListName: ").append(getListName()).append(",");
        if (getProtocolsList() != null)
            sb.append("ProtocolsList: ").append(getProtocolsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtocolsListDataSummary == false)
            return false;
        ProtocolsListDataSummary other = (ProtocolsListDataSummary) obj;
        if (other.getListArn() == null ^ this.getListArn() == null)
            return false;
        if (other.getListArn() != null && other.getListArn().equals(this.getListArn()) == false)
            return false;
        if (other.getListId() == null ^ this.getListId() == null)
            return false;
        if (other.getListId() != null && other.getListId().equals(this.getListId()) == false)
            return false;
        if (other.getListName() == null ^ this.getListName() == null)
            return false;
        if (other.getListName() != null && other.getListName().equals(this.getListName()) == false)
            return false;
        if (other.getProtocolsList() == null ^ this.getProtocolsList() == null)
            return false;
        if (other.getProtocolsList() != null && other.getProtocolsList().equals(this.getProtocolsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListArn() == null) ? 0 : getListArn().hashCode());
        hashCode = prime * hashCode + ((getListId() == null) ? 0 : getListId().hashCode());
        hashCode = prime * hashCode + ((getListName() == null) ? 0 : getListName().hashCode());
        hashCode = prime * hashCode + ((getProtocolsList() == null) ? 0 : getProtocolsList().hashCode());
        return hashCode;
    }

    @Override
    public ProtocolsListDataSummary clone() {
        try {
            return (ProtocolsListDataSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ProtocolsListDataSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
