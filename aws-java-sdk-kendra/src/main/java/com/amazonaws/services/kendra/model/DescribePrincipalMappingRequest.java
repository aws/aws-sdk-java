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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribePrincipalMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePrincipalMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index required to check the processing of <code>PUT</code> and <code>DELETE</code> actions
     * for mapping users to their groups.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the data source to check the processing of <code>PUT</code> and <code>DELETE</code> actions for
     * mapping users to their groups.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The identifier of the group required to check the processing of <code>PUT</code> and <code>DELETE</code> actions
     * for mapping users to their groups.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * The identifier of the index required to check the processing of <code>PUT</code> and <code>DELETE</code> actions
     * for mapping users to their groups.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index required to check the processing of <code>PUT</code> and <code>DELETE</code>
     *        actions for mapping users to their groups.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index required to check the processing of <code>PUT</code> and <code>DELETE</code> actions
     * for mapping users to their groups.
     * </p>
     * 
     * @return The identifier of the index required to check the processing of <code>PUT</code> and <code>DELETE</code>
     *         actions for mapping users to their groups.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index required to check the processing of <code>PUT</code> and <code>DELETE</code> actions
     * for mapping users to their groups.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index required to check the processing of <code>PUT</code> and <code>DELETE</code>
     *        actions for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalMappingRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source to check the processing of <code>PUT</code> and <code>DELETE</code> actions for
     * mapping users to their groups.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source to check the processing of <code>PUT</code> and <code>DELETE</code>
     *        actions for mapping users to their groups.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source to check the processing of <code>PUT</code> and <code>DELETE</code> actions for
     * mapping users to their groups.
     * </p>
     * 
     * @return The identifier of the data source to check the processing of <code>PUT</code> and <code>DELETE</code>
     *         actions for mapping users to their groups.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source to check the processing of <code>PUT</code> and <code>DELETE</code> actions for
     * mapping users to their groups.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source to check the processing of <code>PUT</code> and <code>DELETE</code>
     *        actions for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalMappingRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the group required to check the processing of <code>PUT</code> and <code>DELETE</code> actions
     * for mapping users to their groups.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group required to check the processing of <code>PUT</code> and <code>DELETE</code>
     *        actions for mapping users to their groups.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier of the group required to check the processing of <code>PUT</code> and <code>DELETE</code> actions
     * for mapping users to their groups.
     * </p>
     * 
     * @return The identifier of the group required to check the processing of <code>PUT</code> and <code>DELETE</code>
     *         actions for mapping users to their groups.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier of the group required to check the processing of <code>PUT</code> and <code>DELETE</code> actions
     * for mapping users to their groups.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group required to check the processing of <code>PUT</code> and <code>DELETE</code>
     *        actions for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalMappingRequest withGroupId(String groupId) {
        setGroupId(groupId);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePrincipalMappingRequest == false)
            return false;
        DescribePrincipalMappingRequest other = (DescribePrincipalMappingRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return hashCode;
    }

    @Override
    public DescribePrincipalMappingRequest clone() {
        return (DescribePrincipalMappingRequest) super.clone();
    }

}
