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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the SSO instances that the caller has access to.
     * </p>
     */
    private java.util.List<InstanceMetadata> instances;
    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the SSO instances that the caller has access to.
     * </p>
     * 
     * @return Lists the SSO instances that the caller has access to.
     */

    public java.util.List<InstanceMetadata> getInstances() {
        return instances;
    }

    /**
     * <p>
     * Lists the SSO instances that the caller has access to.
     * </p>
     * 
     * @param instances
     *        Lists the SSO instances that the caller has access to.
     */

    public void setInstances(java.util.Collection<InstanceMetadata> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<InstanceMetadata>(instances);
    }

    /**
     * <p>
     * Lists the SSO instances that the caller has access to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        Lists the SSO instances that the caller has access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesResult withInstances(InstanceMetadata... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<InstanceMetadata>(instances.length));
        }
        for (InstanceMetadata ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the SSO instances that the caller has access to.
     * </p>
     * 
     * @param instances
     *        Lists the SSO instances that the caller has access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesResult withInstances(java.util.Collection<InstanceMetadata> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *        to make subsequent calls.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @return The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *         to make subsequent calls.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *        to make subsequent calls.
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
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
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
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

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
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
