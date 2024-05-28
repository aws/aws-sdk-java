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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application in which the user and group mapping belongs.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the index in which you want to map users to their groups.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The list that contains your users or sub groups that belong the same group. For example, the group "Company"
     * includes the user "CEO" and the sub groups "Research", "Engineering", and "Sales and Marketing".
     * </p>
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The identifier of the data source for which you want to map users to their groups. This is useful if a group is
     * tied to multiple data sources, but you only want the group to access documents of a certain data source. For
     * example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the company's documents
     * stored in the data sources Confluence and Salesforce. However, "Sales and Marketing" team only needs access to
     * customer-related documents stored in Salesforce.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The type of the group.
     * </p>
     */
    private String type;

    private GroupMembers groupMembers;

    /**
     * <p>
     * The identifier of the application in which the user and group mapping belongs.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application in which the user and group mapping belongs.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application in which the user and group mapping belongs.
     * </p>
     * 
     * @return The identifier of the application in which the user and group mapping belongs.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application in which the user and group mapping belongs.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application in which the user and group mapping belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGroupRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the index in which you want to map users to their groups.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index in which you want to map users to their groups.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index in which you want to map users to their groups.
     * </p>
     * 
     * @return The identifier of the index in which you want to map users to their groups.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index in which you want to map users to their groups.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index in which you want to map users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGroupRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The list that contains your users or sub groups that belong the same group. For example, the group "Company"
     * includes the user "CEO" and the sub groups "Research", "Engineering", and "Sales and Marketing".
     * </p>
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     * 
     * @param groupName
     *        The list that contains your users or sub groups that belong the same group. For example, the group
     *        "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and
     *        "Sales and Marketing".</p>
     *        <p>
     *        If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the
     *        S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000
     *        users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The list that contains your users or sub groups that belong the same group. For example, the group "Company"
     * includes the user "CEO" and the sub groups "Research", "Engineering", and "Sales and Marketing".
     * </p>
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     * 
     * @return The list that contains your users or sub groups that belong the same group. For example, the group
     *         "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and
     *         "Sales and Marketing".</p>
     *         <p>
     *         If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to
     *         the S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000
     *         users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The list that contains your users or sub groups that belong the same group. For example, the group "Company"
     * includes the user "CEO" and the sub groups "Research", "Engineering", and "Sales and Marketing".
     * </p>
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     * 
     * @param groupName
     *        The list that contains your users or sub groups that belong the same group. For example, the group
     *        "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and
     *        "Sales and Marketing".</p>
     *        <p>
     *        If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the
     *        S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000
     *        users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source for which you want to map users to their groups. This is useful if a group is
     * tied to multiple data sources, but you only want the group to access documents of a certain data source. For
     * example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the company's documents
     * stored in the data sources Confluence and Salesforce. However, "Sales and Marketing" team only needs access to
     * customer-related documents stored in Salesforce.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source for which you want to map users to their groups. This is useful if a
     *        group is tied to multiple data sources, but you only want the group to access documents of a certain data
     *        source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the
     *        company's documents stored in the data sources Confluence and Salesforce. However, "Sales and Marketing"
     *        team only needs access to customer-related documents stored in Salesforce.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source for which you want to map users to their groups. This is useful if a group is
     * tied to multiple data sources, but you only want the group to access documents of a certain data source. For
     * example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the company's documents
     * stored in the data sources Confluence and Salesforce. However, "Sales and Marketing" team only needs access to
     * customer-related documents stored in Salesforce.
     * </p>
     * 
     * @return The identifier of the data source for which you want to map users to their groups. This is useful if a
     *         group is tied to multiple data sources, but you only want the group to access documents of a certain data
     *         source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the
     *         company's documents stored in the data sources Confluence and Salesforce. However, "Sales and Marketing"
     *         team only needs access to customer-related documents stored in Salesforce.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source for which you want to map users to their groups. This is useful if a group is
     * tied to multiple data sources, but you only want the group to access documents of a certain data source. For
     * example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the company's documents
     * stored in the data sources Confluence and Salesforce. However, "Sales and Marketing" team only needs access to
     * customer-related documents stored in Salesforce.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source for which you want to map users to their groups. This is useful if a
     *        group is tied to multiple data sources, but you only want the group to access documents of a certain data
     *        source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to the
     *        company's documents stored in the data sources Confluence and Salesforce. However, "Sales and Marketing"
     *        team only needs access to customer-related documents stored in Salesforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGroupRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The type of the group.
     * </p>
     * 
     * @param type
     *        The type of the group.
     * @see MembershipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the group.
     * </p>
     * 
     * @return The type of the group.
     * @see MembershipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the group.
     * </p>
     * 
     * @param type
     *        The type of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public PutGroupRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the group.
     * </p>
     * 
     * @param type
     *        The type of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public PutGroupRequest withType(MembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * @param groupMembers
     */

    public void setGroupMembers(GroupMembers groupMembers) {
        this.groupMembers = groupMembers;
    }

    /**
     * @return
     */

    public GroupMembers getGroupMembers() {
        return this.groupMembers;
    }

    /**
     * @param groupMembers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGroupRequest withGroupMembers(GroupMembers groupMembers) {
        setGroupMembers(groupMembers);
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
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getGroupMembers() != null)
            sb.append("GroupMembers: ").append(getGroupMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutGroupRequest == false)
            return false;
        PutGroupRequest other = (PutGroupRequest) obj;
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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getGroupMembers() == null ^ this.getGroupMembers() == null)
            return false;
        if (other.getGroupMembers() != null && other.getGroupMembers().equals(this.getGroupMembers()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getGroupMembers() == null) ? 0 : getGroupMembers().hashCode());
        return hashCode;
    }

    @Override
    public PutGroupRequest clone() {
        return (PutGroupRequest) super.clone();
    }

}
