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
 * The sub groups that belong to a group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/MemberGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the sub group you want to map to a group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The identifier of the data source for the sub group you want to map to a group.
     * </p>
     */
    private String dataSourceId;

    /**
     * <p>
     * The identifier of the sub group you want to map to a group.
     * </p>
     * 
     * @param groupId
     *        The identifier of the sub group you want to map to a group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier of the sub group you want to map to a group.
     * </p>
     * 
     * @return The identifier of the sub group you want to map to a group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier of the sub group you want to map to a group.
     * </p>
     * 
     * @param groupId
     *        The identifier of the sub group you want to map to a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberGroup withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source for the sub group you want to map to a group.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source for the sub group you want to map to a group.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source for the sub group you want to map to a group.
     * </p>
     * 
     * @return The identifier of the data source for the sub group you want to map to a group.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source for the sub group you want to map to a group.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source for the sub group you want to map to a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberGroup withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberGroup == false)
            return false;
        MemberGroup other = (MemberGroup) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        return hashCode;
    }

    @Override
    public MemberGroup clone() {
        try {
            return (MemberGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.MemberGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
