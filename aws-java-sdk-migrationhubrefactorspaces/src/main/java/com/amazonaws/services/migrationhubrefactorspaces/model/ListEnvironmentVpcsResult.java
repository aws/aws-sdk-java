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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironmentVpcs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentVpcsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of <code>EnvironmentVpc</code> objects.
     * </p>
     */
    private java.util.List<EnvironmentVpc> environmentVpcList;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of <code>EnvironmentVpc</code> objects.
     * </p>
     * 
     * @return The list of <code>EnvironmentVpc</code> objects.
     */

    public java.util.List<EnvironmentVpc> getEnvironmentVpcList() {
        return environmentVpcList;
    }

    /**
     * <p>
     * The list of <code>EnvironmentVpc</code> objects.
     * </p>
     * 
     * @param environmentVpcList
     *        The list of <code>EnvironmentVpc</code> objects.
     */

    public void setEnvironmentVpcList(java.util.Collection<EnvironmentVpc> environmentVpcList) {
        if (environmentVpcList == null) {
            this.environmentVpcList = null;
            return;
        }

        this.environmentVpcList = new java.util.ArrayList<EnvironmentVpc>(environmentVpcList);
    }

    /**
     * <p>
     * The list of <code>EnvironmentVpc</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentVpcList(java.util.Collection)} or {@link #withEnvironmentVpcList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param environmentVpcList
     *        The list of <code>EnvironmentVpc</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentVpcsResult withEnvironmentVpcList(EnvironmentVpc... environmentVpcList) {
        if (this.environmentVpcList == null) {
            setEnvironmentVpcList(new java.util.ArrayList<EnvironmentVpc>(environmentVpcList.length));
        }
        for (EnvironmentVpc ele : environmentVpcList) {
            this.environmentVpcList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>EnvironmentVpc</code> objects.
     * </p>
     * 
     * @param environmentVpcList
     *        The list of <code>EnvironmentVpc</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentVpcsResult withEnvironmentVpcList(java.util.Collection<EnvironmentVpc> environmentVpcList) {
        setEnvironmentVpcList(environmentVpcList);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentVpcsResult withNextToken(String nextToken) {
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
        if (getEnvironmentVpcList() != null)
            sb.append("EnvironmentVpcList: ").append(getEnvironmentVpcList()).append(",");
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

        if (obj instanceof ListEnvironmentVpcsResult == false)
            return false;
        ListEnvironmentVpcsResult other = (ListEnvironmentVpcsResult) obj;
        if (other.getEnvironmentVpcList() == null ^ this.getEnvironmentVpcList() == null)
            return false;
        if (other.getEnvironmentVpcList() != null && other.getEnvironmentVpcList().equals(this.getEnvironmentVpcList()) == false)
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

        hashCode = prime * hashCode + ((getEnvironmentVpcList() == null) ? 0 : getEnvironmentVpcList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentVpcsResult clone() {
        try {
            return (ListEnvironmentVpcsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
