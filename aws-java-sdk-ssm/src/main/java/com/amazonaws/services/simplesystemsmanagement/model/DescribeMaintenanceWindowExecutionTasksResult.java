/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTasks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMaintenanceWindowExecutionTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the task executions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecutionTaskIdentity> windowExecutionTaskIdentities;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the task executions.
     * </p>
     * 
     * @return Information about the task executions.
     */

    public java.util.List<MaintenanceWindowExecutionTaskIdentity> getWindowExecutionTaskIdentities() {
        if (windowExecutionTaskIdentities == null) {
            windowExecutionTaskIdentities = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecutionTaskIdentity>();
        }
        return windowExecutionTaskIdentities;
    }

    /**
     * <p>
     * Information about the task executions.
     * </p>
     * 
     * @param windowExecutionTaskIdentities
     *        Information about the task executions.
     */

    public void setWindowExecutionTaskIdentities(java.util.Collection<MaintenanceWindowExecutionTaskIdentity> windowExecutionTaskIdentities) {
        if (windowExecutionTaskIdentities == null) {
            this.windowExecutionTaskIdentities = null;
            return;
        }

        this.windowExecutionTaskIdentities = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecutionTaskIdentity>(windowExecutionTaskIdentities);
    }

    /**
     * <p>
     * Information about the task executions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWindowExecutionTaskIdentities(java.util.Collection)} or
     * {@link #withWindowExecutionTaskIdentities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param windowExecutionTaskIdentities
     *        Information about the task executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionTasksResult withWindowExecutionTaskIdentities(
            MaintenanceWindowExecutionTaskIdentity... windowExecutionTaskIdentities) {
        if (this.windowExecutionTaskIdentities == null) {
            setWindowExecutionTaskIdentities(new com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecutionTaskIdentity>(
                    windowExecutionTaskIdentities.length));
        }
        for (MaintenanceWindowExecutionTaskIdentity ele : windowExecutionTaskIdentities) {
            this.windowExecutionTaskIdentities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the task executions.
     * </p>
     * 
     * @param windowExecutionTaskIdentities
     *        Information about the task executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionTasksResult withWindowExecutionTaskIdentities(
            java.util.Collection<MaintenanceWindowExecutionTaskIdentity> windowExecutionTaskIdentities) {
        setWindowExecutionTaskIdentities(windowExecutionTaskIdentities);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getWindowExecutionTaskIdentities() != null)
            sb.append("WindowExecutionTaskIdentities: ").append(getWindowExecutionTaskIdentities()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMaintenanceWindowExecutionTasksResult == false)
            return false;
        DescribeMaintenanceWindowExecutionTasksResult other = (DescribeMaintenanceWindowExecutionTasksResult) obj;
        if (other.getWindowExecutionTaskIdentities() == null ^ this.getWindowExecutionTaskIdentities() == null)
            return false;
        if (other.getWindowExecutionTaskIdentities() != null
                && other.getWindowExecutionTaskIdentities().equals(this.getWindowExecutionTaskIdentities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionTaskIdentities() == null) ? 0 : getWindowExecutionTaskIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMaintenanceWindowExecutionTasksResult clone() {
        try {
            return (DescribeMaintenanceWindowExecutionTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
