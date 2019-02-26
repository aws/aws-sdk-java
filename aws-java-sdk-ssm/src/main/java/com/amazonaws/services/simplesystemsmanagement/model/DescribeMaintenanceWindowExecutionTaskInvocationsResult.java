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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTaskInvocations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMaintenanceWindowExecutionTaskInvocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecutionTaskInvocationIdentity> windowExecutionTaskInvocationIdentities;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     * 
     * @return Information about the task invocation results per invocation.
     */

    public java.util.List<MaintenanceWindowExecutionTaskInvocationIdentity> getWindowExecutionTaskInvocationIdentities() {
        if (windowExecutionTaskInvocationIdentities == null) {
            windowExecutionTaskInvocationIdentities = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecutionTaskInvocationIdentity>();
        }
        return windowExecutionTaskInvocationIdentities;
    }

    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     * 
     * @param windowExecutionTaskInvocationIdentities
     *        Information about the task invocation results per invocation.
     */

    public void setWindowExecutionTaskInvocationIdentities(
            java.util.Collection<MaintenanceWindowExecutionTaskInvocationIdentity> windowExecutionTaskInvocationIdentities) {
        if (windowExecutionTaskInvocationIdentities == null) {
            this.windowExecutionTaskInvocationIdentities = null;
            return;
        }

        this.windowExecutionTaskInvocationIdentities = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecutionTaskInvocationIdentity>(
                windowExecutionTaskInvocationIdentities);
    }

    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWindowExecutionTaskInvocationIdentities(java.util.Collection)} or
     * {@link #withWindowExecutionTaskInvocationIdentities(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param windowExecutionTaskInvocationIdentities
     *        Information about the task invocation results per invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionTaskInvocationsResult withWindowExecutionTaskInvocationIdentities(
            MaintenanceWindowExecutionTaskInvocationIdentity... windowExecutionTaskInvocationIdentities) {
        if (this.windowExecutionTaskInvocationIdentities == null) {
            setWindowExecutionTaskInvocationIdentities(new com.amazonaws.internal.SdkInternalList<MaintenanceWindowExecutionTaskInvocationIdentity>(
                    windowExecutionTaskInvocationIdentities.length));
        }
        for (MaintenanceWindowExecutionTaskInvocationIdentity ele : windowExecutionTaskInvocationIdentities) {
            this.windowExecutionTaskInvocationIdentities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     * 
     * @param windowExecutionTaskInvocationIdentities
     *        Information about the task invocation results per invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionTaskInvocationsResult withWindowExecutionTaskInvocationIdentities(
            java.util.Collection<MaintenanceWindowExecutionTaskInvocationIdentity> windowExecutionTaskInvocationIdentities) {
        setWindowExecutionTaskInvocationIdentities(windowExecutionTaskInvocationIdentities);
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

    public DescribeMaintenanceWindowExecutionTaskInvocationsResult withNextToken(String nextToken) {
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
        if (getWindowExecutionTaskInvocationIdentities() != null)
            sb.append("WindowExecutionTaskInvocationIdentities: ").append(getWindowExecutionTaskInvocationIdentities()).append(",");
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

        if (obj instanceof DescribeMaintenanceWindowExecutionTaskInvocationsResult == false)
            return false;
        DescribeMaintenanceWindowExecutionTaskInvocationsResult other = (DescribeMaintenanceWindowExecutionTaskInvocationsResult) obj;
        if (other.getWindowExecutionTaskInvocationIdentities() == null ^ this.getWindowExecutionTaskInvocationIdentities() == null)
            return false;
        if (other.getWindowExecutionTaskInvocationIdentities() != null
                && other.getWindowExecutionTaskInvocationIdentities().equals(this.getWindowExecutionTaskInvocationIdentities()) == false)
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

        hashCode = prime * hashCode + ((getWindowExecutionTaskInvocationIdentities() == null) ? 0 : getWindowExecutionTaskInvocationIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMaintenanceWindowExecutionTaskInvocationsResult clone() {
        try {
            return (DescribeMaintenanceWindowExecutionTaskInvocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
