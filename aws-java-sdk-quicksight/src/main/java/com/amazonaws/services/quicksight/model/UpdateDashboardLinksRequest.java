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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardLinks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDashboardLinksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the dashboard whose links you want to update.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     * </p>
     */
    private java.util.List<String> linkEntities;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the dashboard whose links you want to update.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the dashboard whose links you want to update.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the dashboard whose links you want to update.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the dashboard whose links you want to update.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the dashboard whose links you want to update.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the dashboard whose links you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardLinksRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @return The ID for the dashboard.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardLinksRequest withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     * </p>
     * 
     * @return list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     */

    public java.util.List<String> getLinkEntities() {
        return linkEntities;
    }

    /**
     * <p>
     * list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     * </p>
     * 
     * @param linkEntities
     *        list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     */

    public void setLinkEntities(java.util.Collection<String> linkEntities) {
        if (linkEntities == null) {
            this.linkEntities = null;
            return;
        }

        this.linkEntities = new java.util.ArrayList<String>(linkEntities);
    }

    /**
     * <p>
     * list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLinkEntities(java.util.Collection)} or {@link #withLinkEntities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param linkEntities
     *        list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardLinksRequest withLinkEntities(String... linkEntities) {
        if (this.linkEntities == null) {
            setLinkEntities(new java.util.ArrayList<String>(linkEntities.length));
        }
        for (String ele : linkEntities) {
            this.linkEntities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     * </p>
     * 
     * @param linkEntities
     *        list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardLinksRequest withLinkEntities(java.util.Collection<String> linkEntities) {
        setLinkEntities(linkEntities);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getLinkEntities() != null)
            sb.append("LinkEntities: ").append(getLinkEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDashboardLinksRequest == false)
            return false;
        UpdateDashboardLinksRequest other = (UpdateDashboardLinksRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getLinkEntities() == null ^ this.getLinkEntities() == null)
            return false;
        if (other.getLinkEntities() != null && other.getLinkEntities().equals(this.getLinkEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getLinkEntities() == null) ? 0 : getLinkEntities().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDashboardLinksRequest clone() {
        return (UpdateDashboardLinksRequest) super.clone();
    }

}
