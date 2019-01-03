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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>DescribeDomains</a></code> operation. Specifies the name of the domain
 * you want to describe. To restrict the response to particular expressions, specify the names of the expressions you
 * want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code>
 * option to <code>true</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExpressionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain you want to describe.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Limits the <code><a>DescribeExpressions</a></code> response to the specified expressions. If not specified, all
     * expressions are shown.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> expressionNames;
    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or include any pending changes (
     * <code>false</code>). Defaults to <code>false</code>.
     * </p>
     */
    private Boolean deployed;

    /**
     * <p>
     * The name of the domain you want to describe.
     * </p>
     * 
     * @param domainName
     *        The name of the domain you want to describe.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain you want to describe.
     * </p>
     * 
     * @return The name of the domain you want to describe.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain you want to describe.
     * </p>
     * 
     * @param domainName
     *        The name of the domain you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExpressionsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Limits the <code><a>DescribeExpressions</a></code> response to the specified expressions. If not specified, all
     * expressions are shown.
     * </p>
     * 
     * @return Limits the <code><a>DescribeExpressions</a></code> response to the specified expressions. If not
     *         specified, all expressions are shown.
     */

    public java.util.List<String> getExpressionNames() {
        if (expressionNames == null) {
            expressionNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return expressionNames;
    }

    /**
     * <p>
     * Limits the <code><a>DescribeExpressions</a></code> response to the specified expressions. If not specified, all
     * expressions are shown.
     * </p>
     * 
     * @param expressionNames
     *        Limits the <code><a>DescribeExpressions</a></code> response to the specified expressions. If not
     *        specified, all expressions are shown.
     */

    public void setExpressionNames(java.util.Collection<String> expressionNames) {
        if (expressionNames == null) {
            this.expressionNames = null;
            return;
        }

        this.expressionNames = new com.amazonaws.internal.SdkInternalList<String>(expressionNames);
    }

    /**
     * <p>
     * Limits the <code><a>DescribeExpressions</a></code> response to the specified expressions. If not specified, all
     * expressions are shown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpressionNames(java.util.Collection)} or {@link #withExpressionNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param expressionNames
     *        Limits the <code><a>DescribeExpressions</a></code> response to the specified expressions. If not
     *        specified, all expressions are shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExpressionsRequest withExpressionNames(String... expressionNames) {
        if (this.expressionNames == null) {
            setExpressionNames(new com.amazonaws.internal.SdkInternalList<String>(expressionNames.length));
        }
        for (String ele : expressionNames) {
            this.expressionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Limits the <code><a>DescribeExpressions</a></code> response to the specified expressions. If not specified, all
     * expressions are shown.
     * </p>
     * 
     * @param expressionNames
     *        Limits the <code><a>DescribeExpressions</a></code> response to the specified expressions. If not
     *        specified, all expressions are shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExpressionsRequest withExpressionNames(java.util.Collection<String> expressionNames) {
        setExpressionNames(expressionNames);
        return this;
    }

    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or include any pending changes (
     * <code>false</code>). Defaults to <code>false</code>.
     * </p>
     * 
     * @param deployed
     *        Whether to display the deployed configuration (<code>true</code>) or include any pending changes (
     *        <code>false</code>). Defaults to <code>false</code>.
     */

    public void setDeployed(Boolean deployed) {
        this.deployed = deployed;
    }

    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or include any pending changes (
     * <code>false</code>). Defaults to <code>false</code>.
     * </p>
     * 
     * @return Whether to display the deployed configuration (<code>true</code>) or include any pending changes (
     *         <code>false</code>). Defaults to <code>false</code>.
     */

    public Boolean getDeployed() {
        return this.deployed;
    }

    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or include any pending changes (
     * <code>false</code>). Defaults to <code>false</code>.
     * </p>
     * 
     * @param deployed
     *        Whether to display the deployed configuration (<code>true</code>) or include any pending changes (
     *        <code>false</code>). Defaults to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExpressionsRequest withDeployed(Boolean deployed) {
        setDeployed(deployed);
        return this;
    }

    /**
     * <p>
     * Whether to display the deployed configuration (<code>true</code>) or include any pending changes (
     * <code>false</code>). Defaults to <code>false</code>.
     * </p>
     * 
     * @return Whether to display the deployed configuration (<code>true</code>) or include any pending changes (
     *         <code>false</code>). Defaults to <code>false</code>.
     */

    public Boolean isDeployed() {
        return this.deployed;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getExpressionNames() != null)
            sb.append("ExpressionNames: ").append(getExpressionNames()).append(",");
        if (getDeployed() != null)
            sb.append("Deployed: ").append(getDeployed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExpressionsRequest == false)
            return false;
        DescribeExpressionsRequest other = (DescribeExpressionsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getExpressionNames() == null ^ this.getExpressionNames() == null)
            return false;
        if (other.getExpressionNames() != null && other.getExpressionNames().equals(this.getExpressionNames()) == false)
            return false;
        if (other.getDeployed() == null ^ this.getDeployed() == null)
            return false;
        if (other.getDeployed() != null && other.getDeployed().equals(this.getDeployed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getExpressionNames() == null) ? 0 : getExpressionNames().hashCode());
        hashCode = prime * hashCode + ((getDeployed() == null) ? 0 : getDeployed().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExpressionsRequest clone() {
        return (DescribeExpressionsRequest) super.clone();
    }

}
