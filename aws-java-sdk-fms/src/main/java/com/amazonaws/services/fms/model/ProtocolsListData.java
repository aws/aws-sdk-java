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
 * An Firewall Manager protocols list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ProtocolsListData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtocolsListData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Firewall Manager protocols list.
     * </p>
     */
    private String listId;
    /**
     * <p>
     * The name of the Firewall Manager protocols list.
     * </p>
     */
    private String listName;
    /**
     * <p>
     * A unique identifier for each update to the list. When you update the list, the update token must match the token
     * of the current version of the application list. You can retrieve the update token by getting the list.
     * </p>
     */
    private String listUpdateToken;
    /**
     * <p>
     * The time that the Firewall Manager protocols list was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time that the Firewall Manager protocols list was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * An array of protocols in the Firewall Manager protocols list.
     * </p>
     */
    private java.util.List<String> protocolsList;
    /**
     * <p>
     * A map of previous version numbers to their corresponding protocol arrays.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> previousProtocolsList;

    /**
     * <p>
     * The ID of the Firewall Manager protocols list.
     * </p>
     * 
     * @param listId
     *        The ID of the Firewall Manager protocols list.
     */

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager protocols list.
     * </p>
     * 
     * @return The ID of the Firewall Manager protocols list.
     */

    public String getListId() {
        return this.listId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager protocols list.
     * </p>
     * 
     * @param listId
     *        The ID of the Firewall Manager protocols list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListData withListId(String listId) {
        setListId(listId);
        return this;
    }

    /**
     * <p>
     * The name of the Firewall Manager protocols list.
     * </p>
     * 
     * @param listName
     *        The name of the Firewall Manager protocols list.
     */

    public void setListName(String listName) {
        this.listName = listName;
    }

    /**
     * <p>
     * The name of the Firewall Manager protocols list.
     * </p>
     * 
     * @return The name of the Firewall Manager protocols list.
     */

    public String getListName() {
        return this.listName;
    }

    /**
     * <p>
     * The name of the Firewall Manager protocols list.
     * </p>
     * 
     * @param listName
     *        The name of the Firewall Manager protocols list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListData withListName(String listName) {
        setListName(listName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for each update to the list. When you update the list, the update token must match the token
     * of the current version of the application list. You can retrieve the update token by getting the list.
     * </p>
     * 
     * @param listUpdateToken
     *        A unique identifier for each update to the list. When you update the list, the update token must match the
     *        token of the current version of the application list. You can retrieve the update token by getting the
     *        list.
     */

    public void setListUpdateToken(String listUpdateToken) {
        this.listUpdateToken = listUpdateToken;
    }

    /**
     * <p>
     * A unique identifier for each update to the list. When you update the list, the update token must match the token
     * of the current version of the application list. You can retrieve the update token by getting the list.
     * </p>
     * 
     * @return A unique identifier for each update to the list. When you update the list, the update token must match
     *         the token of the current version of the application list. You can retrieve the update token by getting
     *         the list.
     */

    public String getListUpdateToken() {
        return this.listUpdateToken;
    }

    /**
     * <p>
     * A unique identifier for each update to the list. When you update the list, the update token must match the token
     * of the current version of the application list. You can retrieve the update token by getting the list.
     * </p>
     * 
     * @param listUpdateToken
     *        A unique identifier for each update to the list. When you update the list, the update token must match the
     *        token of the current version of the application list. You can retrieve the update token by getting the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListData withListUpdateToken(String listUpdateToken) {
        setListUpdateToken(listUpdateToken);
        return this;
    }

    /**
     * <p>
     * The time that the Firewall Manager protocols list was created.
     * </p>
     * 
     * @param createTime
     *        The time that the Firewall Manager protocols list was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time that the Firewall Manager protocols list was created.
     * </p>
     * 
     * @return The time that the Firewall Manager protocols list was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time that the Firewall Manager protocols list was created.
     * </p>
     * 
     * @param createTime
     *        The time that the Firewall Manager protocols list was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListData withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time that the Firewall Manager protocols list was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time that the Firewall Manager protocols list was last updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time that the Firewall Manager protocols list was last updated.
     * </p>
     * 
     * @return The time that the Firewall Manager protocols list was last updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time that the Firewall Manager protocols list was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time that the Firewall Manager protocols list was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListData withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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

    public ProtocolsListData withProtocolsList(String... protocolsList) {
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

    public ProtocolsListData withProtocolsList(java.util.Collection<String> protocolsList) {
        setProtocolsList(protocolsList);
        return this;
    }

    /**
     * <p>
     * A map of previous version numbers to their corresponding protocol arrays.
     * </p>
     * 
     * @return A map of previous version numbers to their corresponding protocol arrays.
     */

    public java.util.Map<String, java.util.List<String>> getPreviousProtocolsList() {
        return previousProtocolsList;
    }

    /**
     * <p>
     * A map of previous version numbers to their corresponding protocol arrays.
     * </p>
     * 
     * @param previousProtocolsList
     *        A map of previous version numbers to their corresponding protocol arrays.
     */

    public void setPreviousProtocolsList(java.util.Map<String, java.util.List<String>> previousProtocolsList) {
        this.previousProtocolsList = previousProtocolsList;
    }

    /**
     * <p>
     * A map of previous version numbers to their corresponding protocol arrays.
     * </p>
     * 
     * @param previousProtocolsList
     *        A map of previous version numbers to their corresponding protocol arrays.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListData withPreviousProtocolsList(java.util.Map<String, java.util.List<String>> previousProtocolsList) {
        setPreviousProtocolsList(previousProtocolsList);
        return this;
    }

    /**
     * Add a single PreviousProtocolsList entry
     *
     * @see ProtocolsListData#withPreviousProtocolsList
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListData addPreviousProtocolsListEntry(String key, java.util.List<String> value) {
        if (null == this.previousProtocolsList) {
            this.previousProtocolsList = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.previousProtocolsList.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.previousProtocolsList.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PreviousProtocolsList.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolsListData clearPreviousProtocolsListEntries() {
        this.previousProtocolsList = null;
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
            sb.append("ListId: ").append(getListId()).append(",");
        if (getListName() != null)
            sb.append("ListName: ").append(getListName()).append(",");
        if (getListUpdateToken() != null)
            sb.append("ListUpdateToken: ").append(getListUpdateToken()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getProtocolsList() != null)
            sb.append("ProtocolsList: ").append(getProtocolsList()).append(",");
        if (getPreviousProtocolsList() != null)
            sb.append("PreviousProtocolsList: ").append(getPreviousProtocolsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtocolsListData == false)
            return false;
        ProtocolsListData other = (ProtocolsListData) obj;
        if (other.getListId() == null ^ this.getListId() == null)
            return false;
        if (other.getListId() != null && other.getListId().equals(this.getListId()) == false)
            return false;
        if (other.getListName() == null ^ this.getListName() == null)
            return false;
        if (other.getListName() != null && other.getListName().equals(this.getListName()) == false)
            return false;
        if (other.getListUpdateToken() == null ^ this.getListUpdateToken() == null)
            return false;
        if (other.getListUpdateToken() != null && other.getListUpdateToken().equals(this.getListUpdateToken()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getProtocolsList() == null ^ this.getProtocolsList() == null)
            return false;
        if (other.getProtocolsList() != null && other.getProtocolsList().equals(this.getProtocolsList()) == false)
            return false;
        if (other.getPreviousProtocolsList() == null ^ this.getPreviousProtocolsList() == null)
            return false;
        if (other.getPreviousProtocolsList() != null && other.getPreviousProtocolsList().equals(this.getPreviousProtocolsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListId() == null) ? 0 : getListId().hashCode());
        hashCode = prime * hashCode + ((getListName() == null) ? 0 : getListName().hashCode());
        hashCode = prime * hashCode + ((getListUpdateToken() == null) ? 0 : getListUpdateToken().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getProtocolsList() == null) ? 0 : getProtocolsList().hashCode());
        hashCode = prime * hashCode + ((getPreviousProtocolsList() == null) ? 0 : getPreviousProtocolsList().hashCode());
        return hashCode;
    }

    @Override
    public ProtocolsListData clone() {
        try {
            return (ProtocolsListData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ProtocolsListDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
