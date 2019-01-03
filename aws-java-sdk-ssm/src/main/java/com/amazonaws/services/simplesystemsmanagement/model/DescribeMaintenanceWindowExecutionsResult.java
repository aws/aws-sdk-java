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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMaintenanceWindowExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the Maintenance Windows execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecution> windowExecutions;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the Maintenance Windows execution.
     * </p>
     * 
     * @return Information about the Maintenance Windows execution.
     */

    public java.util.List<MaintenanceWindowExecution> getWindowExecutions() {
        if (windowExecutions == null) {
            windowExecutions = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecution>();
        }
        return windowExecutions;
    }

    /**
     * <p>
     * Information about the Maintenance Windows execution.
     * </p>
     * 
     * @param windowExecutions
     *        Information about the Maintenance Windows execution.
     */

    public void setWindowExecutions(java.util.Collection<MaintenanceWindowExecution> windowExecutions) {
        if (windowExecutions == null) {
            this.windowExecutions = null;
            return;
        }

        this.windowExecutions = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecution>(windowExecutions);
    }

    /**
     * <p>
     * Information about the Maintenance Windows execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWindowExecutions(java.util.Collection)} or {@link #withWindowExecutions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param windowExecutions
     *        Information about the Maintenance Windows execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionsResult withWindowExecutions(MaintenanceWindowExecution... windowExecutions) {
        if (this.windowExecutions == null) {
            setWindowExecutions(new com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecution>(windowExecutions.length));
        }
        for (MaintenanceWindowExecution ele : windowExecutions) {
            this.windowExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Maintenance Windows execution.
     * </p>
     * 
     * @param windowExecutions
     *        Information about the Maintenance Windows execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionsResult withWindowExecutions(java.util.Collection<MaintenanceWindowExecution> windowExecutions) {
        setWindowExecutions(windowExecutions);
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

    public DescribeMaintenanceWindowExecutionsResult withNextToken(String nextToken) {
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
        if (getWindowExecutions() != null)
            sb.append("WindowExecutions: ").append(getWindowExecutions()).append(",");
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

        if (obj instanceof DescribeMaintenanceWindowExecutionsResult == false)
            return false;
        DescribeMaintenanceWindowExecutionsResult other = (DescribeMaintenanceWindowExecutionsResult) obj;
        if (other.getWindowExecutions() == null ^ this.getWindowExecutions() == null)
            return false;
        if (other.getWindowExecutions() != null && other.getWindowExecutions().equals(this.getWindowExecutions()) == false)
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

        hashCode = prime * hashCode + ((getWindowExecutions() == null) ? 0 : getWindowExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMaintenanceWindowExecutionsResult clone() {
        try {
            return (DescribeMaintenanceWindowExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
