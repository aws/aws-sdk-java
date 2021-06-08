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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeCustomDomains" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The App Runner subdomain of the App Runner service. The associated custom domain names are mapped to this target
     * name.
     * </p>
     */
    private String dNSTarget;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service whose associated custom domain names you want to
     * describe.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * A list of descriptions of custom domain names that are associated with the service. In a paginated request, the
     * request returns up to <code>MaxResults</code> records per call.
     * </p>
     */
    private java.util.List<CustomDomain> customDomains;
    /**
     * <p>
     * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The App Runner subdomain of the App Runner service. The associated custom domain names are mapped to this target
     * name.
     * </p>
     * 
     * @param dNSTarget
     *        The App Runner subdomain of the App Runner service. The associated custom domain names are mapped to this
     *        target name.
     */

    public void setDNSTarget(String dNSTarget) {
        this.dNSTarget = dNSTarget;
    }

    /**
     * <p>
     * The App Runner subdomain of the App Runner service. The associated custom domain names are mapped to this target
     * name.
     * </p>
     * 
     * @return The App Runner subdomain of the App Runner service. The associated custom domain names are mapped to this
     *         target name.
     */

    public String getDNSTarget() {
        return this.dNSTarget;
    }

    /**
     * <p>
     * The App Runner subdomain of the App Runner service. The associated custom domain names are mapped to this target
     * name.
     * </p>
     * 
     * @param dNSTarget
     *        The App Runner subdomain of the App Runner service. The associated custom domain names are mapped to this
     *        target name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomDomainsResult withDNSTarget(String dNSTarget) {
        setDNSTarget(dNSTarget);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service whose associated custom domain names you want to
     * describe.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service whose associated custom domain names you want to
     *        describe.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service whose associated custom domain names you want to
     * describe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner service whose associated custom domain names you want to
     *         describe.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service whose associated custom domain names you want to
     * describe.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service whose associated custom domain names you want to
     *        describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomDomainsResult withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * A list of descriptions of custom domain names that are associated with the service. In a paginated request, the
     * request returns up to <code>MaxResults</code> records per call.
     * </p>
     * 
     * @return A list of descriptions of custom domain names that are associated with the service. In a paginated
     *         request, the request returns up to <code>MaxResults</code> records per call.
     */

    public java.util.List<CustomDomain> getCustomDomains() {
        return customDomains;
    }

    /**
     * <p>
     * A list of descriptions of custom domain names that are associated with the service. In a paginated request, the
     * request returns up to <code>MaxResults</code> records per call.
     * </p>
     * 
     * @param customDomains
     *        A list of descriptions of custom domain names that are associated with the service. In a paginated
     *        request, the request returns up to <code>MaxResults</code> records per call.
     */

    public void setCustomDomains(java.util.Collection<CustomDomain> customDomains) {
        if (customDomains == null) {
            this.customDomains = null;
            return;
        }

        this.customDomains = new java.util.ArrayList<CustomDomain>(customDomains);
    }

    /**
     * <p>
     * A list of descriptions of custom domain names that are associated with the service. In a paginated request, the
     * request returns up to <code>MaxResults</code> records per call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDomains(java.util.Collection)} or {@link #withCustomDomains(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customDomains
     *        A list of descriptions of custom domain names that are associated with the service. In a paginated
     *        request, the request returns up to <code>MaxResults</code> records per call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomDomainsResult withCustomDomains(CustomDomain... customDomains) {
        if (this.customDomains == null) {
            setCustomDomains(new java.util.ArrayList<CustomDomain>(customDomains.length));
        }
        for (CustomDomain ele : customDomains) {
            this.customDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of descriptions of custom domain names that are associated with the service. In a paginated request, the
     * request returns up to <code>MaxResults</code> records per call.
     * </p>
     * 
     * @param customDomains
     *        A list of descriptions of custom domain names that are associated with the service. In a paginated
     *        request, the request returns up to <code>MaxResults</code> records per call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomDomainsResult withCustomDomains(java.util.Collection<CustomDomain> customDomains) {
        setCustomDomains(customDomains);
        return this;
    }

    /**
     * <p>
     * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated
     * request.
     * </p>
     * 
     * @param nextToken
     *        The token that you can pass in a subsequent request to get the next result page. It's returned in a
     *        paginated request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated
     * request.
     * </p>
     * 
     * @return The token that you can pass in a subsequent request to get the next result page. It's returned in a
     *         paginated request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated
     * request.
     * </p>
     * 
     * @param nextToken
     *        The token that you can pass in a subsequent request to get the next result page. It's returned in a
     *        paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomDomainsResult withNextToken(String nextToken) {
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
        if (getDNSTarget() != null)
            sb.append("DNSTarget: ").append(getDNSTarget()).append(",");
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getCustomDomains() != null)
            sb.append("CustomDomains: ").append(getCustomDomains()).append(",");
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

        if (obj instanceof DescribeCustomDomainsResult == false)
            return false;
        DescribeCustomDomainsResult other = (DescribeCustomDomainsResult) obj;
        if (other.getDNSTarget() == null ^ this.getDNSTarget() == null)
            return false;
        if (other.getDNSTarget() != null && other.getDNSTarget().equals(this.getDNSTarget()) == false)
            return false;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getCustomDomains() == null ^ this.getCustomDomains() == null)
            return false;
        if (other.getCustomDomains() != null && other.getCustomDomains().equals(this.getCustomDomains()) == false)
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

        hashCode = prime * hashCode + ((getDNSTarget() == null) ? 0 : getDNSTarget().hashCode());
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getCustomDomains() == null) ? 0 : getCustomDomains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomDomainsResult clone() {
        try {
            return (DescribeCustomDomainsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
