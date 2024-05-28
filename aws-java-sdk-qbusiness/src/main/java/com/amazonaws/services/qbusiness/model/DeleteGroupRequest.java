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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application in which the group mapping belongs.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the index you want to delete the group from.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The name of the group you want to delete.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The identifier of the data source linked to the group
     * </p>
     * <p>
     * A group can be tied to multiple data sources. You can delete a group from accessing documents in a certain data
     * source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the
     * company's documents stored in the data sources Confluence and Salesforce. You want to delete "Research" and
     * "Engineering" groups from Salesforce, so that these groups cannot access customer-related documents stored in
     * Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data source.
     * </p>
     */
    private String dataSourceId;

    /**
     * <p>
     * The identifier of the application in which the group mapping belongs.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application in which the group mapping belongs.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application in which the group mapping belongs.
     * </p>
     * 
     * @return The identifier of the application in which the group mapping belongs.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application in which the group mapping belongs.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application in which the group mapping belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGroupRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the index you want to delete the group from.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to delete the group from.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to delete the group from.
     * </p>
     * 
     * @return The identifier of the index you want to delete the group from.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to delete the group from.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to delete the group from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGroupRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The name of the group you want to delete.
     * </p>
     * 
     * @param groupName
     *        The name of the group you want to delete.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group you want to delete.
     * </p>
     * 
     * @return The name of the group you want to delete.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group you want to delete.
     * </p>
     * 
     * @param groupName
     *        The name of the group you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source linked to the group
     * </p>
     * <p>
     * A group can be tied to multiple data sources. You can delete a group from accessing documents in a certain data
     * source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the
     * company's documents stored in the data sources Confluence and Salesforce. You want to delete "Research" and
     * "Engineering" groups from Salesforce, so that these groups cannot access customer-related documents stored in
     * Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data source.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source linked to the group</p>
     *        <p>
     *        A group can be tied to multiple data sources. You can delete a group from accessing documents in a certain
     *        data source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to
     *        the company's documents stored in the data sources Confluence and Salesforce. You want to delete
     *        "Research" and "Engineering" groups from Salesforce, so that these groups cannot access customer-related
     *        documents stored in Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data
     *        source.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source linked to the group
     * </p>
     * <p>
     * A group can be tied to multiple data sources. You can delete a group from accessing documents in a certain data
     * source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the
     * company's documents stored in the data sources Confluence and Salesforce. You want to delete "Research" and
     * "Engineering" groups from Salesforce, so that these groups cannot access customer-related documents stored in
     * Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data source.
     * </p>
     * 
     * @return The identifier of the data source linked to the group</p>
     *         <p>
     *         A group can be tied to multiple data sources. You can delete a group from accessing documents in a
     *         certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all
     *         tied to the company's documents stored in the data sources Confluence and Salesforce. You want to delete
     *         "Research" and "Engineering" groups from Salesforce, so that these groups cannot access customer-related
     *         documents stored in Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data
     *         source.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source linked to the group
     * </p>
     * <p>
     * A group can be tied to multiple data sources. You can delete a group from accessing documents in a certain data
     * source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the
     * company's documents stored in the data sources Confluence and Salesforce. You want to delete "Research" and
     * "Engineering" groups from Salesforce, so that these groups cannot access customer-related documents stored in
     * Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data source.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source linked to the group</p>
     *        <p>
     *        A group can be tied to multiple data sources. You can delete a group from accessing documents in a certain
     *        data source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to
     *        the company's documents stored in the data sources Confluence and Salesforce. You want to delete
     *        "Research" and "Engineering" groups from Salesforce, so that these groups cannot access customer-related
     *        documents stored in Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGroupRequest withDataSourceId(String dataSourceId) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
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

        if (obj instanceof DeleteGroupRequest == false)
            return false;
        DeleteGroupRequest other = (DeleteGroupRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteGroupRequest clone() {
        return (DeleteGroupRequest) super.clone();
    }

}
