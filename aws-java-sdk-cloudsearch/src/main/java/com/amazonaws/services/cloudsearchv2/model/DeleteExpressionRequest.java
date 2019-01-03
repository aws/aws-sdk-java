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
 * Container for the parameters to the <code><a>DeleteExpression</a></code> operation. Specifies the name of the domain
 * you want to update and the name of the expression you want to delete.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteExpressionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String domainName;
    /**
     * <p>
     * The name of the <code><a>Expression</a></code> to delete.
     * </p>
     */
    private String expressionName;

    /**
     * @param domainName
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteExpressionRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The name of the <code><a>Expression</a></code> to delete.
     * </p>
     * 
     * @param expressionName
     *        The name of the <code><a>Expression</a></code> to delete.
     */

    public void setExpressionName(String expressionName) {
        this.expressionName = expressionName;
    }

    /**
     * <p>
     * The name of the <code><a>Expression</a></code> to delete.
     * </p>
     * 
     * @return The name of the <code><a>Expression</a></code> to delete.
     */

    public String getExpressionName() {
        return this.expressionName;
    }

    /**
     * <p>
     * The name of the <code><a>Expression</a></code> to delete.
     * </p>
     * 
     * @param expressionName
     *        The name of the <code><a>Expression</a></code> to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteExpressionRequest withExpressionName(String expressionName) {
        setExpressionName(expressionName);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getExpressionName() != null)
            sb.append("ExpressionName: ").append(getExpressionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteExpressionRequest == false)
            return false;
        DeleteExpressionRequest other = (DeleteExpressionRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getExpressionName() == null ^ this.getExpressionName() == null)
            return false;
        if (other.getExpressionName() != null && other.getExpressionName().equals(this.getExpressionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getExpressionName() == null) ? 0 : getExpressionName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteExpressionRequest clone() {
        return (DeleteExpressionRequest) super.clone();
    }

}
