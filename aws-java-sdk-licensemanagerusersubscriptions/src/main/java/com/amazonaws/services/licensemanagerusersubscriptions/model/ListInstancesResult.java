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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Metadata that describes the list instances operation.
     * </p>
     */
    private java.util.List<InstanceSummary> instanceSummaries;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Metadata that describes the list instances operation.
     * </p>
     * 
     * @return Metadata that describes the list instances operation.
     */

    public java.util.List<InstanceSummary> getInstanceSummaries() {
        return instanceSummaries;
    }

    /**
     * <p>
     * Metadata that describes the list instances operation.
     * </p>
     * 
     * @param instanceSummaries
     *        Metadata that describes the list instances operation.
     */

    public void setInstanceSummaries(java.util.Collection<InstanceSummary> instanceSummaries) {
        if (instanceSummaries == null) {
            this.instanceSummaries = null;
            return;
        }

        this.instanceSummaries = new java.util.ArrayList<InstanceSummary>(instanceSummaries);
    }

    /**
     * <p>
     * Metadata that describes the list instances operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceSummaries(java.util.Collection)} or {@link #withInstanceSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceSummaries
     *        Metadata that describes the list instances operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesResult withInstanceSummaries(InstanceSummary... instanceSummaries) {
        if (this.instanceSummaries == null) {
            setInstanceSummaries(new java.util.ArrayList<InstanceSummary>(instanceSummaries.length));
        }
        for (InstanceSummary ele : instanceSummaries) {
            this.instanceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that describes the list instances operation.
     * </p>
     * 
     * @param instanceSummaries
     *        Metadata that describes the list instances operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesResult withInstanceSummaries(java.util.Collection<InstanceSummary> instanceSummaries) {
        setInstanceSummaries(instanceSummaries);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesResult withNextToken(String nextToken) {
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
        if (getInstanceSummaries() != null)
            sb.append("InstanceSummaries: ").append(getInstanceSummaries()).append(",");
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

        if (obj instanceof ListInstancesResult == false)
            return false;
        ListInstancesResult other = (ListInstancesResult) obj;
        if (other.getInstanceSummaries() == null ^ this.getInstanceSummaries() == null)
            return false;
        if (other.getInstanceSummaries() != null && other.getInstanceSummaries().equals(this.getInstanceSummaries()) == false)
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

        hashCode = prime * hashCode + ((getInstanceSummaries() == null) ? 0 : getInstanceSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInstancesResult clone() {
        try {
            return (ListInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
