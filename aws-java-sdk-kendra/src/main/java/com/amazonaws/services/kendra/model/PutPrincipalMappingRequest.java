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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/PutPrincipalMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPrincipalMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index you want to map users to their groups.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the data source you want to map users to their groups.
     * </p>
     * <p>
     * This is useful if a group is tied to multiple data sources, but you only want the group to access documents of a
     * certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to
     * the company's documents stored in the data sources Confluence and Salesforce. However, "Sales and Marketing" team
     * only needs access to customer-related documents stored in Salesforce.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The identifier of the group you want to map its users to.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The list that contains your users or sub groups that belong the same group.
     * </p>
     * <p>
     * For example, the group "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and
     * "Sales and Marketing".
     * </p>
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     */
    private GroupMembers groupMembers;
    /**
     * <p>
     * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>PUT</code> action
     * with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to process
     * and apply on top of other actions with lower number IDs. This prevents previous actions with lower number IDs
     * from possibly overriding the latest action.
     * </p>
     * <p>
     * The ordering ID can be the UNIX time of the last update you made to a group members list. You would then provide
     * this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>PUT</code> action for that
     * updated group with the latest members list doesn't get overwritten by earlier <code>PUT</code> actions for the
     * same group which are yet to be processed.
     * </p>
     * <p>
     * The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon Kendra.
     * </p>
     */
    private Long orderingId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 file that contains your list of users or sub
     * groups that belong to a group.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html#iam-roles-ds">IAM
     * roles for Amazon Kendra</a>.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The identifier of the index you want to map users to their groups.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to map users to their groups.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to map users to their groups.
     * </p>
     * 
     * @return The identifier of the index you want to map users to their groups.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to map users to their groups.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to map users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPrincipalMappingRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source you want to map users to their groups.
     * </p>
     * <p>
     * This is useful if a group is tied to multiple data sources, but you only want the group to access documents of a
     * certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to
     * the company's documents stored in the data sources Confluence and Salesforce. However, "Sales and Marketing" team
     * only needs access to customer-related documents stored in Salesforce.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source you want to map users to their groups.</p>
     *        <p>
     *        This is useful if a group is tied to multiple data sources, but you only want the group to access
     *        documents of a certain data source. For example, the groups "Research", "Engineering", and
     *        "Sales and Marketing" are all tied to the company's documents stored in the data sources Confluence and
     *        Salesforce. However, "Sales and Marketing" team only needs access to customer-related documents stored in
     *        Salesforce.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source you want to map users to their groups.
     * </p>
     * <p>
     * This is useful if a group is tied to multiple data sources, but you only want the group to access documents of a
     * certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to
     * the company's documents stored in the data sources Confluence and Salesforce. However, "Sales and Marketing" team
     * only needs access to customer-related documents stored in Salesforce.
     * </p>
     * 
     * @return The identifier of the data source you want to map users to their groups.</p>
     *         <p>
     *         This is useful if a group is tied to multiple data sources, but you only want the group to access
     *         documents of a certain data source. For example, the groups "Research", "Engineering", and
     *         "Sales and Marketing" are all tied to the company's documents stored in the data sources Confluence and
     *         Salesforce. However, "Sales and Marketing" team only needs access to customer-related documents stored in
     *         Salesforce.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source you want to map users to their groups.
     * </p>
     * <p>
     * This is useful if a group is tied to multiple data sources, but you only want the group to access documents of a
     * certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing" are all tied to
     * the company's documents stored in the data sources Confluence and Salesforce. However, "Sales and Marketing" team
     * only needs access to customer-related documents stored in Salesforce.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source you want to map users to their groups.</p>
     *        <p>
     *        This is useful if a group is tied to multiple data sources, but you only want the group to access
     *        documents of a certain data source. For example, the groups "Research", "Engineering", and
     *        "Sales and Marketing" are all tied to the company's documents stored in the data sources Confluence and
     *        Salesforce. However, "Sales and Marketing" team only needs access to customer-related documents stored in
     *        Salesforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPrincipalMappingRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the group you want to map its users to.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group you want to map its users to.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier of the group you want to map its users to.
     * </p>
     * 
     * @return The identifier of the group you want to map its users to.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier of the group you want to map its users to.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group you want to map its users to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPrincipalMappingRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The list that contains your users or sub groups that belong the same group.
     * </p>
     * <p>
     * For example, the group "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and
     * "Sales and Marketing".
     * </p>
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     * 
     * @param groupMembers
     *        The list that contains your users or sub groups that belong the same group.</p>
     *        <p>
     *        For example, the group "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and
     *        "Sales and Marketing".
     *        </p>
     *        <p>
     *        If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the
     *        S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000
     *        users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
     */

    public void setGroupMembers(GroupMembers groupMembers) {
        this.groupMembers = groupMembers;
    }

    /**
     * <p>
     * The list that contains your users or sub groups that belong the same group.
     * </p>
     * <p>
     * For example, the group "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and
     * "Sales and Marketing".
     * </p>
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     * 
     * @return The list that contains your users or sub groups that belong the same group.</p>
     *         <p>
     *         For example, the group "Company" includes the user "CEO" and the sub groups "Research", "Engineering",
     *         and "Sales and Marketing".
     *         </p>
     *         <p>
     *         If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to
     *         the S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000
     *         users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
     */

    public GroupMembers getGroupMembers() {
        return this.groupMembers;
    }

    /**
     * <p>
     * The list that contains your users or sub groups that belong the same group.
     * </p>
     * <p>
     * For example, the group "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and
     * "Sales and Marketing".
     * </p>
     * <p>
     * If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the S3
     * file that lists your users and sub groups for a group. Your sub groups can contain more than 1000 users, but the
     * list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * </p>
     * 
     * @param groupMembers
     *        The list that contains your users or sub groups that belong the same group.</p>
     *        <p>
     *        For example, the group "Company" includes the user "CEO" and the sub groups "Research", "Engineering", and
     *        "Sales and Marketing".
     *        </p>
     *        <p>
     *        If you have more than 1000 users and/or sub groups for a single group, you need to provide the path to the
     *        S3 file that lists your users and sub groups for a group. Your sub groups can contain more than 1000
     *        users, but the list of sub groups that belong to a group (and/or users) must be no more than 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPrincipalMappingRequest withGroupMembers(GroupMembers groupMembers) {
        setGroupMembers(groupMembers);
        return this;
    }

    /**
     * <p>
     * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>PUT</code> action
     * with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to process
     * and apply on top of other actions with lower number IDs. This prevents previous actions with lower number IDs
     * from possibly overriding the latest action.
     * </p>
     * <p>
     * The ordering ID can be the UNIX time of the last update you made to a group members list. You would then provide
     * this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>PUT</code> action for that
     * updated group with the latest members list doesn't get overwritten by earlier <code>PUT</code> actions for the
     * same group which are yet to be processed.
     * </p>
     * <p>
     * The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon Kendra.
     * </p>
     * 
     * @param orderingId
     *        The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>PUT</code>
     *        action with previous actions. The highest number ID, which is the ordering ID, is the latest action you
     *        want to process and apply on top of other actions with lower number IDs. This prevents previous actions
     *        with lower number IDs from possibly overriding the latest action.</p>
     *        <p>
     *        The ordering ID can be the UNIX time of the last update you made to a group members list. You would then
     *        provide this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>PUT</code> action
     *        for that updated group with the latest members list doesn't get overwritten by earlier <code>PUT</code>
     *        actions for the same group which are yet to be processed.
     *        </p>
     *        <p>
     *        The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon
     *        Kendra.
     */

    public void setOrderingId(Long orderingId) {
        this.orderingId = orderingId;
    }

    /**
     * <p>
     * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>PUT</code> action
     * with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to process
     * and apply on top of other actions with lower number IDs. This prevents previous actions with lower number IDs
     * from possibly overriding the latest action.
     * </p>
     * <p>
     * The ordering ID can be the UNIX time of the last update you made to a group members list. You would then provide
     * this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>PUT</code> action for that
     * updated group with the latest members list doesn't get overwritten by earlier <code>PUT</code> actions for the
     * same group which are yet to be processed.
     * </p>
     * <p>
     * The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon Kendra.
     * </p>
     * 
     * @return The timestamp identifier you specify to ensure Amazon Kendra does not override the latest
     *         <code>PUT</code> action with previous actions. The highest number ID, which is the ordering ID, is the
     *         latest action you want to process and apply on top of other actions with lower number IDs. This prevents
     *         previous actions with lower number IDs from possibly overriding the latest action.</p>
     *         <p>
     *         The ordering ID can be the UNIX time of the last update you made to a group members list. You would then
     *         provide this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>PUT</code>
     *         action for that updated group with the latest members list doesn't get overwritten by earlier
     *         <code>PUT</code> actions for the same group which are yet to be processed.
     *         </p>
     *         <p>
     *         The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon
     *         Kendra.
     */

    public Long getOrderingId() {
        return this.orderingId;
    }

    /**
     * <p>
     * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>PUT</code> action
     * with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to process
     * and apply on top of other actions with lower number IDs. This prevents previous actions with lower number IDs
     * from possibly overriding the latest action.
     * </p>
     * <p>
     * The ordering ID can be the UNIX time of the last update you made to a group members list. You would then provide
     * this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>PUT</code> action for that
     * updated group with the latest members list doesn't get overwritten by earlier <code>PUT</code> actions for the
     * same group which are yet to be processed.
     * </p>
     * <p>
     * The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon Kendra.
     * </p>
     * 
     * @param orderingId
     *        The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>PUT</code>
     *        action with previous actions. The highest number ID, which is the ordering ID, is the latest action you
     *        want to process and apply on top of other actions with lower number IDs. This prevents previous actions
     *        with lower number IDs from possibly overriding the latest action.</p>
     *        <p>
     *        The ordering ID can be the UNIX time of the last update you made to a group members list. You would then
     *        provide this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>PUT</code> action
     *        for that updated group with the latest members list doesn't get overwritten by earlier <code>PUT</code>
     *        actions for the same group which are yet to be processed.
     *        </p>
     *        <p>
     *        The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon
     *        Kendra.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPrincipalMappingRequest withOrderingId(Long orderingId) {
        setOrderingId(orderingId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 file that contains your list of users or sub
     * groups that belong to a group.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html#iam-roles-ds">IAM
     * roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role that has access to the S3 file that contains your list of users
     *        or sub groups that belong to a group.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html#iam-roles-ds">IAM roles for Amazon
     *        Kendra</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 file that contains your list of users or sub
     * groups that belong to a group.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html#iam-roles-ds">IAM
     * roles for Amazon Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role that has access to the S3 file that contains your list of users
     *         or sub groups that belong to a group.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html#iam-roles-ds">IAM roles for Amazon
     *         Kendra</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 file that contains your list of users or sub
     * groups that belong to a group.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html#iam-roles-ds">IAM
     * roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role that has access to the S3 file that contains your list of users
     *        or sub groups that belong to a group.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html#iam-roles-ds">IAM roles for Amazon
     *        Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPrincipalMappingRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getGroupMembers() != null)
            sb.append("GroupMembers: ").append(getGroupMembers()).append(",");
        if (getOrderingId() != null)
            sb.append("OrderingId: ").append(getOrderingId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPrincipalMappingRequest == false)
            return false;
        PutPrincipalMappingRequest other = (PutPrincipalMappingRequest) obj;
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
        if (other.getGroupMembers() == null ^ this.getGroupMembers() == null)
            return false;
        if (other.getGroupMembers() != null && other.getGroupMembers().equals(this.getGroupMembers()) == false)
            return false;
        if (other.getOrderingId() == null ^ this.getOrderingId() == null)
            return false;
        if (other.getOrderingId() != null && other.getOrderingId().equals(this.getOrderingId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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
        hashCode = prime * hashCode + ((getGroupMembers() == null) ? 0 : getGroupMembers().hashCode());
        hashCode = prime * hashCode + ((getOrderingId() == null) ? 0 : getOrderingId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public PutPrincipalMappingRequest clone() {
        return (PutPrincipalMappingRequest) super.clone();
    }

}
