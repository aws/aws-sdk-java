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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListServicePrincipalNames"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicePrincipalNamesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The service principal name, if any, that the connector uses to authenticate with Active Directory.
     * </p>
     */
    private java.util.List<ServicePrincipalNameSummary> servicePrincipalNames;

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *        received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @return Use this parameter when paginating results in a subsequent request after you receive a response with
     *         truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *         received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *        received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicePrincipalNamesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The service principal name, if any, that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @return The service principal name, if any, that the connector uses to authenticate with Active Directory.
     */

    public java.util.List<ServicePrincipalNameSummary> getServicePrincipalNames() {
        return servicePrincipalNames;
    }

    /**
     * <p>
     * The service principal name, if any, that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param servicePrincipalNames
     *        The service principal name, if any, that the connector uses to authenticate with Active Directory.
     */

    public void setServicePrincipalNames(java.util.Collection<ServicePrincipalNameSummary> servicePrincipalNames) {
        if (servicePrincipalNames == null) {
            this.servicePrincipalNames = null;
            return;
        }

        this.servicePrincipalNames = new java.util.ArrayList<ServicePrincipalNameSummary>(servicePrincipalNames);
    }

    /**
     * <p>
     * The service principal name, if any, that the connector uses to authenticate with Active Directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServicePrincipalNames(java.util.Collection)} or
     * {@link #withServicePrincipalNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param servicePrincipalNames
     *        The service principal name, if any, that the connector uses to authenticate with Active Directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicePrincipalNamesResult withServicePrincipalNames(ServicePrincipalNameSummary... servicePrincipalNames) {
        if (this.servicePrincipalNames == null) {
            setServicePrincipalNames(new java.util.ArrayList<ServicePrincipalNameSummary>(servicePrincipalNames.length));
        }
        for (ServicePrincipalNameSummary ele : servicePrincipalNames) {
            this.servicePrincipalNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The service principal name, if any, that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param servicePrincipalNames
     *        The service principal name, if any, that the connector uses to authenticate with Active Directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicePrincipalNamesResult withServicePrincipalNames(java.util.Collection<ServicePrincipalNameSummary> servicePrincipalNames) {
        setServicePrincipalNames(servicePrincipalNames);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServicePrincipalNames() != null)
            sb.append("ServicePrincipalNames: ").append(getServicePrincipalNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServicePrincipalNamesResult == false)
            return false;
        ListServicePrincipalNamesResult other = (ListServicePrincipalNamesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServicePrincipalNames() == null ^ this.getServicePrincipalNames() == null)
            return false;
        if (other.getServicePrincipalNames() != null && other.getServicePrincipalNames().equals(this.getServicePrincipalNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServicePrincipalNames() == null) ? 0 : getServicePrincipalNames().hashCode());
        return hashCode;
    }

    @Override
    public ListServicePrincipalNamesResult clone() {
        try {
            return (ListServicePrincipalNamesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
