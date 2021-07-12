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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the user context for a Amazon Kendra index.
 * </p>
 * <p>
 * This is used for filtering search results for different users based on their access to documents.
 * </p>
 * <p>
 * You provide one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * User token
 * </p>
 * </li>
 * <li>
 * <p>
 * User ID, the groups the user belongs to, and the data sources the groups can access
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you provide both, an exception is thrown.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UserContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user context token for filtering search results for a user. It must be a JWT or a JSON token.
     * </p>
     */
    private String token;
    /**
     * <p>
     * The identifier of the user you want to filter search results based on their access to documents.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The list of groups you want to filter search results based on the groups' access to documents.
     * </p>
     */
    private java.util.List<String> groups;
    /**
     * <p>
     * The list of data source groups you want to filter search results based on groups' access to documents in that
     * data source.
     * </p>
     */
    private java.util.List<DataSourceGroup> dataSourceGroups;

    /**
     * <p>
     * The user context token for filtering search results for a user. It must be a JWT or a JSON token.
     * </p>
     * 
     * @param token
     *        The user context token for filtering search results for a user. It must be a JWT or a JSON token.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The user context token for filtering search results for a user. It must be a JWT or a JSON token.
     * </p>
     * 
     * @return The user context token for filtering search results for a user. It must be a JWT or a JSON token.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The user context token for filtering search results for a user. It must be a JWT or a JSON token.
     * </p>
     * 
     * @param token
     *        The user context token for filtering search results for a user. It must be a JWT or a JSON token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * The identifier of the user you want to filter search results based on their access to documents.
     * </p>
     * 
     * @param userId
     *        The identifier of the user you want to filter search results based on their access to documents.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user you want to filter search results based on their access to documents.
     * </p>
     * 
     * @return The identifier of the user you want to filter search results based on their access to documents.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user you want to filter search results based on their access to documents.
     * </p>
     * 
     * @param userId
     *        The identifier of the user you want to filter search results based on their access to documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The list of groups you want to filter search results based on the groups' access to documents.
     * </p>
     * 
     * @return The list of groups you want to filter search results based on the groups' access to documents.
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The list of groups you want to filter search results based on the groups' access to documents.
     * </p>
     * 
     * @param groups
     *        The list of groups you want to filter search results based on the groups' access to documents.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * The list of groups you want to filter search results based on the groups' access to documents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The list of groups you want to filter search results based on the groups' access to documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of groups you want to filter search results based on the groups' access to documents.
     * </p>
     * 
     * @param groups
     *        The list of groups you want to filter search results based on the groups' access to documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The list of data source groups you want to filter search results based on groups' access to documents in that
     * data source.
     * </p>
     * 
     * @return The list of data source groups you want to filter search results based on groups' access to documents in
     *         that data source.
     */

    public java.util.List<DataSourceGroup> getDataSourceGroups() {
        return dataSourceGroups;
    }

    /**
     * <p>
     * The list of data source groups you want to filter search results based on groups' access to documents in that
     * data source.
     * </p>
     * 
     * @param dataSourceGroups
     *        The list of data source groups you want to filter search results based on groups' access to documents in
     *        that data source.
     */

    public void setDataSourceGroups(java.util.Collection<DataSourceGroup> dataSourceGroups) {
        if (dataSourceGroups == null) {
            this.dataSourceGroups = null;
            return;
        }

        this.dataSourceGroups = new java.util.ArrayList<DataSourceGroup>(dataSourceGroups);
    }

    /**
     * <p>
     * The list of data source groups you want to filter search results based on groups' access to documents in that
     * data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSourceGroups(java.util.Collection)} or {@link #withDataSourceGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dataSourceGroups
     *        The list of data source groups you want to filter search results based on groups' access to documents in
     *        that data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withDataSourceGroups(DataSourceGroup... dataSourceGroups) {
        if (this.dataSourceGroups == null) {
            setDataSourceGroups(new java.util.ArrayList<DataSourceGroup>(dataSourceGroups.length));
        }
        for (DataSourceGroup ele : dataSourceGroups) {
            this.dataSourceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of data source groups you want to filter search results based on groups' access to documents in that
     * data source.
     * </p>
     * 
     * @param dataSourceGroups
     *        The list of data source groups you want to filter search results based on groups' access to documents in
     *        that data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withDataSourceGroups(java.util.Collection<DataSourceGroup> dataSourceGroups) {
        setDataSourceGroups(dataSourceGroups);
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
        if (getToken() != null)
            sb.append("Token: ").append(getToken()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getDataSourceGroups() != null)
            sb.append("DataSourceGroups: ").append(getDataSourceGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserContext == false)
            return false;
        UserContext other = (UserContext) obj;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getDataSourceGroups() == null ^ this.getDataSourceGroups() == null)
            return false;
        if (other.getDataSourceGroups() != null && other.getDataSourceGroups().equals(this.getDataSourceGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getDataSourceGroups() == null) ? 0 : getDataSourceGroups().hashCode());
        return hashCode;
    }

    @Override
    public UserContext clone() {
        try {
            return (UserContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.UserContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
