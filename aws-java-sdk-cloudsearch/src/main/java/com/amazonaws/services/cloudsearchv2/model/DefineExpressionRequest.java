/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#defineExpression(DefineExpressionRequest) DefineExpression operation}.
 * <p>
 * Configures an <code> Expression </code> for the search domain. Used to
 * create new expressions and modify existing ones. If the expression
 * exists, the new configuration replaces the old one. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#defineExpression(DefineExpressionRequest)
 */
public class DefineExpressionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * A named expression that can be evaluated at search time. Can be used
     * to sort the search results, define other expressions, or return
     * computed information in the search results.
     */
    private Expression expression;

    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefineExpressionRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * A named expression that can be evaluated at search time. Can be used
     * to sort the search results, define other expressions, or return
     * computed information in the search results.
     *
     * @return A named expression that can be evaluated at search time. Can be used
     *         to sort the search results, define other expressions, or return
     *         computed information in the search results.
     */
    public Expression getExpression() {
        return expression;
    }
    
    /**
     * A named expression that can be evaluated at search time. Can be used
     * to sort the search results, define other expressions, or return
     * computed information in the search results.
     *
     * @param expression A named expression that can be evaluated at search time. Can be used
     *         to sort the search results, define other expressions, or return
     *         computed information in the search results.
     */
    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    
    /**
     * A named expression that can be evaluated at search time. Can be used
     * to sort the search results, define other expressions, or return
     * computed information in the search results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expression A named expression that can be evaluated at search time. Can be used
     *         to sort the search results, define other expressions, or return
     *         computed information in the search results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefineExpressionRequest withExpression(Expression expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getExpression() != null) sb.append("Expression: " + getExpression() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DefineExpressionRequest == false) return false;
        DefineExpressionRequest other = (DefineExpressionRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getExpression() == null ^ this.getExpression() == null) return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false) return false; 
        return true;
    }
    
    @Override
    public DefineExpressionRequest clone() {
        
            return (DefineExpressionRequest) super.clone();
    }

}
    