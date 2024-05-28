/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Aliases attached to a user id within an Amazon Q Business application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UserAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserAlias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the index that the user aliases are associated with.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the data source that the user aliases are associated with.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The identifier of the user id associated with the user aliases.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The identifier of the index that the user aliases are associated with.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that the user aliases are associated with.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that the user aliases are associated with.
     * </p>
     * 
     * @return The identifier of the index that the user aliases are associated with.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that the user aliases are associated with.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that the user aliases are associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAlias withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source that the user aliases are associated with.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source that the user aliases are associated with.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source that the user aliases are associated with.
     * </p>
     * 
     * @return The identifier of the data source that the user aliases are associated with.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source that the user aliases are associated with.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source that the user aliases are associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAlias withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user id associated with the user aliases.
     * </p>
     * 
     * @param userId
     *        The identifier of the user id associated with the user aliases.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user id associated with the user aliases.
     * </p>
     * 
     * @return The identifier of the user id associated with the user aliases.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user id associated with the user aliases.
     * </p>
     * 
     * @param userId
     *        The identifier of the user id associated with the user aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAlias withUserId(String userId) {
        setUserId(userId);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserAlias == false)
            return false;
        UserAlias other = (UserAlias) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public UserAlias clone() {
        try {
            return (UserAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.UserAliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
