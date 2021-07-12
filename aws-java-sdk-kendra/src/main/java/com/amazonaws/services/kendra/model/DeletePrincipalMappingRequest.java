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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeletePrincipalMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePrincipalMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index you want to delete a group from.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the data source you want to delete a group from.
     * </p>
     * <p>
     * This is useful if a group is tied to multiple data sources and you want to delete a group from accessing
     * documents in a certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing"
     * are all tied to the company's documents stored in the data sources Confluence and Salesforce. You want to delete
     * "Research" and "Engineering" groups from Salesforce, so that these groups cannot access customer-related
     * documents stored in Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data source.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The identifier of the group you want to delete.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>DELETE</code>
     * action with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to
     * process and apply on top of other actions with lower number IDs. This prevents previous actions with lower number
     * IDs from possibly overriding the latest action.
     * </p>
     * <p>
     * The ordering ID can be the UNIX time of the last update you made to a group members list. You would then provide
     * this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>DELETE</code> action for that
     * updated group with the latest members list doesn't get overwritten by earlier <code>DELETE</code> actions for the
     * same group which are yet to be processed.
     * </p>
     * <p>
     * The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon Kendra.
     * </p>
     */
    private Long orderingId;

    /**
     * <p>
     * The identifier of the index you want to delete a group from.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to delete a group from.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to delete a group from.
     * </p>
     * 
     * @return The identifier of the index you want to delete a group from.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to delete a group from.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to delete a group from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePrincipalMappingRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source you want to delete a group from.
     * </p>
     * <p>
     * This is useful if a group is tied to multiple data sources and you want to delete a group from accessing
     * documents in a certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing"
     * are all tied to the company's documents stored in the data sources Confluence and Salesforce. You want to delete
     * "Research" and "Engineering" groups from Salesforce, so that these groups cannot access customer-related
     * documents stored in Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data source.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source you want to delete a group from.</p>
     *        <p>
     *        This is useful if a group is tied to multiple data sources and you want to delete a group from accessing
     *        documents in a certain data source. For example, the groups "Research", "Engineering", and
     *        "Sales and Marketing" are all tied to the company's documents stored in the data sources Confluence and
     *        Salesforce. You want to delete "Research" and "Engineering" groups from Salesforce, so that these groups
     *        cannot access customer-related documents stored in Salesforce. Only "Sales and Marketing" should access
     *        documents in the Salesforce data source.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source you want to delete a group from.
     * </p>
     * <p>
     * This is useful if a group is tied to multiple data sources and you want to delete a group from accessing
     * documents in a certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing"
     * are all tied to the company's documents stored in the data sources Confluence and Salesforce. You want to delete
     * "Research" and "Engineering" groups from Salesforce, so that these groups cannot access customer-related
     * documents stored in Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data source.
     * </p>
     * 
     * @return The identifier of the data source you want to delete a group from.</p>
     *         <p>
     *         This is useful if a group is tied to multiple data sources and you want to delete a group from accessing
     *         documents in a certain data source. For example, the groups "Research", "Engineering", and
     *         "Sales and Marketing" are all tied to the company's documents stored in the data sources Confluence and
     *         Salesforce. You want to delete "Research" and "Engineering" groups from Salesforce, so that these groups
     *         cannot access customer-related documents stored in Salesforce. Only "Sales and Marketing" should access
     *         documents in the Salesforce data source.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source you want to delete a group from.
     * </p>
     * <p>
     * This is useful if a group is tied to multiple data sources and you want to delete a group from accessing
     * documents in a certain data source. For example, the groups "Research", "Engineering", and "Sales and Marketing"
     * are all tied to the company's documents stored in the data sources Confluence and Salesforce. You want to delete
     * "Research" and "Engineering" groups from Salesforce, so that these groups cannot access customer-related
     * documents stored in Salesforce. Only "Sales and Marketing" should access documents in the Salesforce data source.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source you want to delete a group from.</p>
     *        <p>
     *        This is useful if a group is tied to multiple data sources and you want to delete a group from accessing
     *        documents in a certain data source. For example, the groups "Research", "Engineering", and
     *        "Sales and Marketing" are all tied to the company's documents stored in the data sources Confluence and
     *        Salesforce. You want to delete "Research" and "Engineering" groups from Salesforce, so that these groups
     *        cannot access customer-related documents stored in Salesforce. Only "Sales and Marketing" should access
     *        documents in the Salesforce data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePrincipalMappingRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the group you want to delete.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group you want to delete.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier of the group you want to delete.
     * </p>
     * 
     * @return The identifier of the group you want to delete.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier of the group you want to delete.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePrincipalMappingRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>DELETE</code>
     * action with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to
     * process and apply on top of other actions with lower number IDs. This prevents previous actions with lower number
     * IDs from possibly overriding the latest action.
     * </p>
     * <p>
     * The ordering ID can be the UNIX time of the last update you made to a group members list. You would then provide
     * this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>DELETE</code> action for that
     * updated group with the latest members list doesn't get overwritten by earlier <code>DELETE</code> actions for the
     * same group which are yet to be processed.
     * </p>
     * <p>
     * The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon Kendra.
     * </p>
     * 
     * @param orderingId
     *        The timestamp identifier you specify to ensure Amazon Kendra does not override the latest
     *        <code>DELETE</code> action with previous actions. The highest number ID, which is the ordering ID, is the
     *        latest action you want to process and apply on top of other actions with lower number IDs. This prevents
     *        previous actions with lower number IDs from possibly overriding the latest action.</p>
     *        <p>
     *        The ordering ID can be the UNIX time of the last update you made to a group members list. You would then
     *        provide this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>DELETE</code>
     *        action for that updated group with the latest members list doesn't get overwritten by earlier
     *        <code>DELETE</code> actions for the same group which are yet to be processed.
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
     * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>DELETE</code>
     * action with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to
     * process and apply on top of other actions with lower number IDs. This prevents previous actions with lower number
     * IDs from possibly overriding the latest action.
     * </p>
     * <p>
     * The ordering ID can be the UNIX time of the last update you made to a group members list. You would then provide
     * this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>DELETE</code> action for that
     * updated group with the latest members list doesn't get overwritten by earlier <code>DELETE</code> actions for the
     * same group which are yet to be processed.
     * </p>
     * <p>
     * The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon Kendra.
     * </p>
     * 
     * @return The timestamp identifier you specify to ensure Amazon Kendra does not override the latest
     *         <code>DELETE</code> action with previous actions. The highest number ID, which is the ordering ID, is the
     *         latest action you want to process and apply on top of other actions with lower number IDs. This prevents
     *         previous actions with lower number IDs from possibly overriding the latest action.</p>
     *         <p>
     *         The ordering ID can be the UNIX time of the last update you made to a group members list. You would then
     *         provide this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>DELETE</code>
     *         action for that updated group with the latest members list doesn't get overwritten by earlier
     *         <code>DELETE</code> actions for the same group which are yet to be processed.
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
     * The timestamp identifier you specify to ensure Amazon Kendra does not override the latest <code>DELETE</code>
     * action with previous actions. The highest number ID, which is the ordering ID, is the latest action you want to
     * process and apply on top of other actions with lower number IDs. This prevents previous actions with lower number
     * IDs from possibly overriding the latest action.
     * </p>
     * <p>
     * The ordering ID can be the UNIX time of the last update you made to a group members list. You would then provide
     * this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>DELETE</code> action for that
     * updated group with the latest members list doesn't get overwritten by earlier <code>DELETE</code> actions for the
     * same group which are yet to be processed.
     * </p>
     * <p>
     * The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon Kendra.
     * </p>
     * 
     * @param orderingId
     *        The timestamp identifier you specify to ensure Amazon Kendra does not override the latest
     *        <code>DELETE</code> action with previous actions. The highest number ID, which is the ordering ID, is the
     *        latest action you want to process and apply on top of other actions with lower number IDs. This prevents
     *        previous actions with lower number IDs from possibly overriding the latest action.</p>
     *        <p>
     *        The ordering ID can be the UNIX time of the last update you made to a group members list. You would then
     *        provide this list when calling <code>PutPrincipalMapping</code>. This ensures your <code>DELETE</code>
     *        action for that updated group with the latest members list doesn't get overwritten by earlier
     *        <code>DELETE</code> actions for the same group which are yet to be processed.
     *        </p>
     *        <p>
     *        The default ordering ID is the current UNIX time in milliseconds that the action was received by Amazon
     *        Kendra.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePrincipalMappingRequest withOrderingId(Long orderingId) {
        setOrderingId(orderingId);
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
        if (getOrderingId() != null)
            sb.append("OrderingId: ").append(getOrderingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePrincipalMappingRequest == false)
            return false;
        DeletePrincipalMappingRequest other = (DeletePrincipalMappingRequest) obj;
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
        if (other.getOrderingId() == null ^ this.getOrderingId() == null)
            return false;
        if (other.getOrderingId() != null && other.getOrderingId().equals(this.getOrderingId()) == false)
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
        hashCode = prime * hashCode + ((getOrderingId() == null) ? 0 : getOrderingId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePrincipalMappingRequest clone() {
        return (DeletePrincipalMappingRequest) super.clone();
    }

}
