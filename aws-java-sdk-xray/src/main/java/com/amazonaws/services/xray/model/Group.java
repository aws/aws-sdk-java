/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details and metadata for a group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/Group" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Group implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique case-sensitive name of the group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group generated based on the GroupName.
     * </p>
     */
    private String groupARN;
    /**
     * <p>
     * The filter expression defining the parameters to include traces.
     * </p>
     */
    private String filterExpression;
    /**
     * <p>
     * The structure containing configurations related to insights.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable insights for
     * the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The NotificationsEnabled boolean can be set to true to enable insights notifications through Amazon EventBridge
     * for the group.
     * </p>
     * </li>
     * </ul>
     */
    private InsightsConfiguration insightsConfiguration;

    /**
     * <p>
     * The unique case-sensitive name of the group.
     * </p>
     * 
     * @param groupName
     *        The unique case-sensitive name of the group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The unique case-sensitive name of the group.
     * </p>
     * 
     * @return The unique case-sensitive name of the group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The unique case-sensitive name of the group.
     * </p>
     * 
     * @param groupName
     *        The unique case-sensitive name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group generated based on the GroupName.
     * </p>
     * 
     * @param groupARN
     *        The Amazon Resource Name (ARN) of the group generated based on the GroupName.
     */

    public void setGroupARN(String groupARN) {
        this.groupARN = groupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group generated based on the GroupName.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the group generated based on the GroupName.
     */

    public String getGroupARN() {
        return this.groupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group generated based on the GroupName.
     * </p>
     * 
     * @param groupARN
     *        The Amazon Resource Name (ARN) of the group generated based on the GroupName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withGroupARN(String groupARN) {
        setGroupARN(groupARN);
        return this;
    }

    /**
     * <p>
     * The filter expression defining the parameters to include traces.
     * </p>
     * 
     * @param filterExpression
     *        The filter expression defining the parameters to include traces.
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * The filter expression defining the parameters to include traces.
     * </p>
     * 
     * @return The filter expression defining the parameters to include traces.
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * The filter expression defining the parameters to include traces.
     * </p>
     * 
     * @param filterExpression
     *        The filter expression defining the parameters to include traces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
        return this;
    }

    /**
     * <p>
     * The structure containing configurations related to insights.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable insights for
     * the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The NotificationsEnabled boolean can be set to true to enable insights notifications through Amazon EventBridge
     * for the group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param insightsConfiguration
     *        The structure containing configurations related to insights.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable
     *        insights for the group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The NotificationsEnabled boolean can be set to true to enable insights notifications through Amazon
     *        EventBridge for the group.
     *        </p>
     *        </li>
     */

    public void setInsightsConfiguration(InsightsConfiguration insightsConfiguration) {
        this.insightsConfiguration = insightsConfiguration;
    }

    /**
     * <p>
     * The structure containing configurations related to insights.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable insights for
     * the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The NotificationsEnabled boolean can be set to true to enable insights notifications through Amazon EventBridge
     * for the group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The structure containing configurations related to insights.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable
     *         insights for the group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The NotificationsEnabled boolean can be set to true to enable insights notifications through Amazon
     *         EventBridge for the group.
     *         </p>
     *         </li>
     */

    public InsightsConfiguration getInsightsConfiguration() {
        return this.insightsConfiguration;
    }

    /**
     * <p>
     * The structure containing configurations related to insights.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable insights for
     * the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The NotificationsEnabled boolean can be set to true to enable insights notifications through Amazon EventBridge
     * for the group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param insightsConfiguration
     *        The structure containing configurations related to insights.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable
     *        insights for the group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The NotificationsEnabled boolean can be set to true to enable insights notifications through Amazon
     *        EventBridge for the group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withInsightsConfiguration(InsightsConfiguration insightsConfiguration) {
        setInsightsConfiguration(insightsConfiguration);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getGroupARN() != null)
            sb.append("GroupARN: ").append(getGroupARN()).append(",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: ").append(getFilterExpression()).append(",");
        if (getInsightsConfiguration() != null)
            sb.append("InsightsConfiguration: ").append(getInsightsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Group == false)
            return false;
        Group other = (Group) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupARN() == null ^ this.getGroupARN() == null)
            return false;
        if (other.getGroupARN() != null && other.getGroupARN().equals(this.getGroupARN()) == false)
            return false;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        if (other.getInsightsConfiguration() == null ^ this.getInsightsConfiguration() == null)
            return false;
        if (other.getInsightsConfiguration() != null && other.getInsightsConfiguration().equals(this.getInsightsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupARN() == null) ? 0 : getGroupARN().hashCode());
        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime * hashCode + ((getInsightsConfiguration() == null) ? 0 : getInsightsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Group clone() {
        try {
            return (Group) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.GroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
