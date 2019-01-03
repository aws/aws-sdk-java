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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationExecutions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutomationExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of details about each automation execution which has occurred which matches the filter specification, if
     * any.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AutomationExecutionMetadata> automationExecutionMetadataList;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of details about each automation execution which has occurred which matches the filter specification, if
     * any.
     * </p>
     * 
     * @return The list of details about each automation execution which has occurred which matches the filter
     *         specification, if any.
     */

    public java.util.List<AutomationExecutionMetadata> getAutomationExecutionMetadataList() {
        if (automationExecutionMetadataList == null) {
            automationExecutionMetadataList = new com.amazonaws.internal.SdkInternalList<AutomationExecutionMetadata>();
        }
        return automationExecutionMetadataList;
    }

    /**
     * <p>
     * The list of details about each automation execution which has occurred which matches the filter specification, if
     * any.
     * </p>
     * 
     * @param automationExecutionMetadataList
     *        The list of details about each automation execution which has occurred which matches the filter
     *        specification, if any.
     */

    public void setAutomationExecutionMetadataList(java.util.Collection<AutomationExecutionMetadata> automationExecutionMetadataList) {
        if (automationExecutionMetadataList == null) {
            this.automationExecutionMetadataList = null;
            return;
        }

        this.automationExecutionMetadataList = new com.amazonaws.internal.SdkInternalList<AutomationExecutionMetadata>(automationExecutionMetadataList);
    }

    /**
     * <p>
     * The list of details about each automation execution which has occurred which matches the filter specification, if
     * any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutomationExecutionMetadataList(java.util.Collection)} or
     * {@link #withAutomationExecutionMetadataList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param automationExecutionMetadataList
     *        The list of details about each automation execution which has occurred which matches the filter
     *        specification, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationExecutionsResult withAutomationExecutionMetadataList(AutomationExecutionMetadata... automationExecutionMetadataList) {
        if (this.automationExecutionMetadataList == null) {
            setAutomationExecutionMetadataList(new com.amazonaws.internal.SdkInternalList<AutomationExecutionMetadata>(automationExecutionMetadataList.length));
        }
        for (AutomationExecutionMetadata ele : automationExecutionMetadataList) {
            this.automationExecutionMetadataList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of details about each automation execution which has occurred which matches the filter specification, if
     * any.
     * </p>
     * 
     * @param automationExecutionMetadataList
     *        The list of details about each automation execution which has occurred which matches the filter
     *        specification, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationExecutionsResult withAutomationExecutionMetadataList(
            java.util.Collection<AutomationExecutionMetadata> automationExecutionMetadataList) {
        setAutomationExecutionMetadataList(automationExecutionMetadataList);
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

    public DescribeAutomationExecutionsResult withNextToken(String nextToken) {
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
        if (getAutomationExecutionMetadataList() != null)
            sb.append("AutomationExecutionMetadataList: ").append(getAutomationExecutionMetadataList()).append(",");
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

        if (obj instanceof DescribeAutomationExecutionsResult == false)
            return false;
        DescribeAutomationExecutionsResult other = (DescribeAutomationExecutionsResult) obj;
        if (other.getAutomationExecutionMetadataList() == null ^ this.getAutomationExecutionMetadataList() == null)
            return false;
        if (other.getAutomationExecutionMetadataList() != null
                && other.getAutomationExecutionMetadataList().equals(this.getAutomationExecutionMetadataList()) == false)
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

        hashCode = prime * hashCode + ((getAutomationExecutionMetadataList() == null) ? 0 : getAutomationExecutionMetadataList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutomationExecutionsResult clone() {
        try {
            return (DescribeAutomationExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
