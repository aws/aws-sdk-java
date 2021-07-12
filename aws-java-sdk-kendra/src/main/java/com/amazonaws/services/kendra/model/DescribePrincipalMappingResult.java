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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribePrincipalMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePrincipalMappingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Shows the identifier of the index to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * Shows the identifier of the data source to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * Shows the identifier of the group to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * Shows the following information on the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping
     * users to their groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Status – the status can be either <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>,
     * <code>DELETED</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Last updated – the last date-time an action was updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Received – the last date-time an action was received or submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ordering ID – the latest action that should process and apply after other actions.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure reason – the reason an action could not be processed.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<GroupOrderingIdSummary> groupOrderingIdSummaries;

    /**
     * <p>
     * Shows the identifier of the index to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     * 
     * @param indexId
     *        Shows the identifier of the index to see information on the processing of <code>PUT</code> and
     *        <code>DELETE</code> actions for mapping users to their groups.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * Shows the identifier of the index to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     * 
     * @return Shows the identifier of the index to see information on the processing of <code>PUT</code> and
     *         <code>DELETE</code> actions for mapping users to their groups.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * Shows the identifier of the index to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     * 
     * @param indexId
     *        Shows the identifier of the index to see information on the processing of <code>PUT</code> and
     *        <code>DELETE</code> actions for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalMappingResult withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * Shows the identifier of the data source to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     * 
     * @param dataSourceId
     *        Shows the identifier of the data source to see information on the processing of <code>PUT</code> and
     *        <code>DELETE</code> actions for mapping users to their groups.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * Shows the identifier of the data source to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     * 
     * @return Shows the identifier of the data source to see information on the processing of <code>PUT</code> and
     *         <code>DELETE</code> actions for mapping users to their groups.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * Shows the identifier of the data source to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     * 
     * @param dataSourceId
     *        Shows the identifier of the data source to see information on the processing of <code>PUT</code> and
     *        <code>DELETE</code> actions for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalMappingResult withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * Shows the identifier of the group to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     * 
     * @param groupId
     *        Shows the identifier of the group to see information on the processing of <code>PUT</code> and
     *        <code>DELETE</code> actions for mapping users to their groups.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * Shows the identifier of the group to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     * 
     * @return Shows the identifier of the group to see information on the processing of <code>PUT</code> and
     *         <code>DELETE</code> actions for mapping users to their groups.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * Shows the identifier of the group to see information on the processing of <code>PUT</code> and
     * <code>DELETE</code> actions for mapping users to their groups.
     * </p>
     * 
     * @param groupId
     *        Shows the identifier of the group to see information on the processing of <code>PUT</code> and
     *        <code>DELETE</code> actions for mapping users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalMappingResult withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * Shows the following information on the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping
     * users to their groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Status – the status can be either <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>,
     * <code>DELETED</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Last updated – the last date-time an action was updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Received – the last date-time an action was received or submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ordering ID – the latest action that should process and apply after other actions.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure reason – the reason an action could not be processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Shows the following information on the processing of <code>PUT</code> and <code>DELETE</code> actions for
     *         mapping users to their groups:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Status – the status can be either <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>,
     *         <code>DELETED</code>, or <code>FAILED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Last updated – the last date-time an action was updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Received – the last date-time an action was received or submitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Ordering ID – the latest action that should process and apply after other actions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failure reason – the reason an action could not be processed.
     *         </p>
     *         </li>
     */

    public java.util.List<GroupOrderingIdSummary> getGroupOrderingIdSummaries() {
        return groupOrderingIdSummaries;
    }

    /**
     * <p>
     * Shows the following information on the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping
     * users to their groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Status – the status can be either <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>,
     * <code>DELETED</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Last updated – the last date-time an action was updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Received – the last date-time an action was received or submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ordering ID – the latest action that should process and apply after other actions.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure reason – the reason an action could not be processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupOrderingIdSummaries
     *        Shows the following information on the processing of <code>PUT</code> and <code>DELETE</code> actions for
     *        mapping users to their groups:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Status – the status can be either <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>,
     *        <code>DELETED</code>, or <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Last updated – the last date-time an action was updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Received – the last date-time an action was received or submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Ordering ID – the latest action that should process and apply after other actions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failure reason – the reason an action could not be processed.
     *        </p>
     *        </li>
     */

    public void setGroupOrderingIdSummaries(java.util.Collection<GroupOrderingIdSummary> groupOrderingIdSummaries) {
        if (groupOrderingIdSummaries == null) {
            this.groupOrderingIdSummaries = null;
            return;
        }

        this.groupOrderingIdSummaries = new java.util.ArrayList<GroupOrderingIdSummary>(groupOrderingIdSummaries);
    }

    /**
     * <p>
     * Shows the following information on the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping
     * users to their groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Status – the status can be either <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>,
     * <code>DELETED</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Last updated – the last date-time an action was updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Received – the last date-time an action was received or submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ordering ID – the latest action that should process and apply after other actions.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure reason – the reason an action could not be processed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupOrderingIdSummaries(java.util.Collection)} or
     * {@link #withGroupOrderingIdSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param groupOrderingIdSummaries
     *        Shows the following information on the processing of <code>PUT</code> and <code>DELETE</code> actions for
     *        mapping users to their groups:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Status – the status can be either <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>,
     *        <code>DELETED</code>, or <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Last updated – the last date-time an action was updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Received – the last date-time an action was received or submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Ordering ID – the latest action that should process and apply after other actions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failure reason – the reason an action could not be processed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalMappingResult withGroupOrderingIdSummaries(GroupOrderingIdSummary... groupOrderingIdSummaries) {
        if (this.groupOrderingIdSummaries == null) {
            setGroupOrderingIdSummaries(new java.util.ArrayList<GroupOrderingIdSummary>(groupOrderingIdSummaries.length));
        }
        for (GroupOrderingIdSummary ele : groupOrderingIdSummaries) {
            this.groupOrderingIdSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Shows the following information on the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping
     * users to their groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Status – the status can be either <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>,
     * <code>DELETED</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Last updated – the last date-time an action was updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Received – the last date-time an action was received or submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ordering ID – the latest action that should process and apply after other actions.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure reason – the reason an action could not be processed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupOrderingIdSummaries
     *        Shows the following information on the processing of <code>PUT</code> and <code>DELETE</code> actions for
     *        mapping users to their groups:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Status – the status can be either <code>PROCESSING</code>, <code>SUCCEEDED</code>, <code>DELETING</code>,
     *        <code>DELETED</code>, or <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Last updated – the last date-time an action was updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Received – the last date-time an action was received or submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Ordering ID – the latest action that should process and apply after other actions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failure reason – the reason an action could not be processed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalMappingResult withGroupOrderingIdSummaries(java.util.Collection<GroupOrderingIdSummary> groupOrderingIdSummaries) {
        setGroupOrderingIdSummaries(groupOrderingIdSummaries);
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
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupOrderingIdSummaries() != null)
            sb.append("GroupOrderingIdSummaries: ").append(getGroupOrderingIdSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePrincipalMappingResult == false)
            return false;
        DescribePrincipalMappingResult other = (DescribePrincipalMappingResult) obj;
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
        if (other.getGroupOrderingIdSummaries() == null ^ this.getGroupOrderingIdSummaries() == null)
            return false;
        if (other.getGroupOrderingIdSummaries() != null && other.getGroupOrderingIdSummaries().equals(this.getGroupOrderingIdSummaries()) == false)
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
        hashCode = prime * hashCode + ((getGroupOrderingIdSummaries() == null) ? 0 : getGroupOrderingIdSummaries().hashCode());
        return hashCode;
    }

    @Override
    public DescribePrincipalMappingResult clone() {
        try {
            return (DescribePrincipalMappingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
