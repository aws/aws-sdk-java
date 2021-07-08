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
 * An Firewall Manager applications list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AppsListData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppsListData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Firewall Manager applications list.
     * </p>
     */
    private String listId;
    /**
     * <p>
     * The name of the Firewall Manager applications list.
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
     * The time that the Firewall Manager applications list was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time that the Firewall Manager applications list was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * An array of applications in the Firewall Manager applications list.
     * </p>
     */
    private java.util.List<App> appsList;
    /**
     * <p>
     * A map of previous version numbers to their corresponding <code>App</code> object arrays.
     * </p>
     */
    private java.util.Map<String, java.util.List<App>> previousAppsList;

    /**
     * <p>
     * The ID of the Firewall Manager applications list.
     * </p>
     * 
     * @param listId
     *        The ID of the Firewall Manager applications list.
     */

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager applications list.
     * </p>
     * 
     * @return The ID of the Firewall Manager applications list.
     */

    public String getListId() {
        return this.listId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager applications list.
     * </p>
     * 
     * @param listId
     *        The ID of the Firewall Manager applications list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppsListData withListId(String listId) {
        setListId(listId);
        return this;
    }

    /**
     * <p>
     * The name of the Firewall Manager applications list.
     * </p>
     * 
     * @param listName
     *        The name of the Firewall Manager applications list.
     */

    public void setListName(String listName) {
        this.listName = listName;
    }

    /**
     * <p>
     * The name of the Firewall Manager applications list.
     * </p>
     * 
     * @return The name of the Firewall Manager applications list.
     */

    public String getListName() {
        return this.listName;
    }

    /**
     * <p>
     * The name of the Firewall Manager applications list.
     * </p>
     * 
     * @param listName
     *        The name of the Firewall Manager applications list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppsListData withListName(String listName) {
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

    public AppsListData withListUpdateToken(String listUpdateToken) {
        setListUpdateToken(listUpdateToken);
        return this;
    }

    /**
     * <p>
     * The time that the Firewall Manager applications list was created.
     * </p>
     * 
     * @param createTime
     *        The time that the Firewall Manager applications list was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time that the Firewall Manager applications list was created.
     * </p>
     * 
     * @return The time that the Firewall Manager applications list was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time that the Firewall Manager applications list was created.
     * </p>
     * 
     * @param createTime
     *        The time that the Firewall Manager applications list was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppsListData withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time that the Firewall Manager applications list was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time that the Firewall Manager applications list was last updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time that the Firewall Manager applications list was last updated.
     * </p>
     * 
     * @return The time that the Firewall Manager applications list was last updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time that the Firewall Manager applications list was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time that the Firewall Manager applications list was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppsListData withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * An array of applications in the Firewall Manager applications list.
     * </p>
     * 
     * @return An array of applications in the Firewall Manager applications list.
     */

    public java.util.List<App> getAppsList() {
        return appsList;
    }

    /**
     * <p>
     * An array of applications in the Firewall Manager applications list.
     * </p>
     * 
     * @param appsList
     *        An array of applications in the Firewall Manager applications list.
     */

    public void setAppsList(java.util.Collection<App> appsList) {
        if (appsList == null) {
            this.appsList = null;
            return;
        }

        this.appsList = new java.util.ArrayList<App>(appsList);
    }

    /**
     * <p>
     * An array of applications in the Firewall Manager applications list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppsList(java.util.Collection)} or {@link #withAppsList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param appsList
     *        An array of applications in the Firewall Manager applications list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppsListData withAppsList(App... appsList) {
        if (this.appsList == null) {
            setAppsList(new java.util.ArrayList<App>(appsList.length));
        }
        for (App ele : appsList) {
            this.appsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of applications in the Firewall Manager applications list.
     * </p>
     * 
     * @param appsList
     *        An array of applications in the Firewall Manager applications list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppsListData withAppsList(java.util.Collection<App> appsList) {
        setAppsList(appsList);
        return this;
    }

    /**
     * <p>
     * A map of previous version numbers to their corresponding <code>App</code> object arrays.
     * </p>
     * 
     * @return A map of previous version numbers to their corresponding <code>App</code> object arrays.
     */

    public java.util.Map<String, java.util.List<App>> getPreviousAppsList() {
        return previousAppsList;
    }

    /**
     * <p>
     * A map of previous version numbers to their corresponding <code>App</code> object arrays.
     * </p>
     * 
     * @param previousAppsList
     *        A map of previous version numbers to their corresponding <code>App</code> object arrays.
     */

    public void setPreviousAppsList(java.util.Map<String, java.util.List<App>> previousAppsList) {
        this.previousAppsList = previousAppsList;
    }

    /**
     * <p>
     * A map of previous version numbers to their corresponding <code>App</code> object arrays.
     * </p>
     * 
     * @param previousAppsList
     *        A map of previous version numbers to their corresponding <code>App</code> object arrays.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppsListData withPreviousAppsList(java.util.Map<String, java.util.List<App>> previousAppsList) {
        setPreviousAppsList(previousAppsList);
        return this;
    }

    /**
     * Add a single PreviousAppsList entry
     *
     * @see AppsListData#withPreviousAppsList
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AppsListData addPreviousAppsListEntry(String key, java.util.List<App> value) {
        if (null == this.previousAppsList) {
            this.previousAppsList = new java.util.HashMap<String, java.util.List<App>>();
        }
        if (this.previousAppsList.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.previousAppsList.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PreviousAppsList.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppsListData clearPreviousAppsListEntries() {
        this.previousAppsList = null;
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
        if (getAppsList() != null)
            sb.append("AppsList: ").append(getAppsList()).append(",");
        if (getPreviousAppsList() != null)
            sb.append("PreviousAppsList: ").append(getPreviousAppsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppsListData == false)
            return false;
        AppsListData other = (AppsListData) obj;
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
        if (other.getAppsList() == null ^ this.getAppsList() == null)
            return false;
        if (other.getAppsList() != null && other.getAppsList().equals(this.getAppsList()) == false)
            return false;
        if (other.getPreviousAppsList() == null ^ this.getPreviousAppsList() == null)
            return false;
        if (other.getPreviousAppsList() != null && other.getPreviousAppsList().equals(this.getPreviousAppsList()) == false)
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
        hashCode = prime * hashCode + ((getAppsList() == null) ? 0 : getAppsList().hashCode());
        hashCode = prime * hashCode + ((getPreviousAppsList() == null) ? 0 : getPreviousAppsList().hashCode());
        return hashCode;
    }

    @Override
    public AppsListData clone() {
        try {
            return (AppsListData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.AppsListDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
