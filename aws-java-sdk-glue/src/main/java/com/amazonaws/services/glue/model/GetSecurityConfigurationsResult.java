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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSecurityConfigurations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecurityConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of security configurations.
     * </p>
     */
    private java.util.List<SecurityConfiguration> securityConfigurations;
    /**
     * <p>
     * A continuation token, if there are more security configurations to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of security configurations.
     * </p>
     * 
     * @return A list of security configurations.
     */

    public java.util.List<SecurityConfiguration> getSecurityConfigurations() {
        return securityConfigurations;
    }

    /**
     * <p>
     * A list of security configurations.
     * </p>
     * 
     * @param securityConfigurations
     *        A list of security configurations.
     */

    public void setSecurityConfigurations(java.util.Collection<SecurityConfiguration> securityConfigurations) {
        if (securityConfigurations == null) {
            this.securityConfigurations = null;
            return;
        }

        this.securityConfigurations = new java.util.ArrayList<SecurityConfiguration>(securityConfigurations);
    }

    /**
     * <p>
     * A list of security configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityConfigurations(java.util.Collection)} or
     * {@link #withSecurityConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityConfigurations
     *        A list of security configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityConfigurationsResult withSecurityConfigurations(SecurityConfiguration... securityConfigurations) {
        if (this.securityConfigurations == null) {
            setSecurityConfigurations(new java.util.ArrayList<SecurityConfiguration>(securityConfigurations.length));
        }
        for (SecurityConfiguration ele : securityConfigurations) {
            this.securityConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security configurations.
     * </p>
     * 
     * @param securityConfigurations
     *        A list of security configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityConfigurationsResult withSecurityConfigurations(java.util.Collection<SecurityConfiguration> securityConfigurations) {
        setSecurityConfigurations(securityConfigurations);
        return this;
    }

    /**
     * <p>
     * A continuation token, if there are more security configurations to return.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if there are more security configurations to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if there are more security configurations to return.
     * </p>
     * 
     * @return A continuation token, if there are more security configurations to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if there are more security configurations to return.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if there are more security configurations to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityConfigurationsResult withNextToken(String nextToken) {
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
        if (getSecurityConfigurations() != null)
            sb.append("SecurityConfigurations: ").append(getSecurityConfigurations()).append(",");
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

        if (obj instanceof GetSecurityConfigurationsResult == false)
            return false;
        GetSecurityConfigurationsResult other = (GetSecurityConfigurationsResult) obj;
        if (other.getSecurityConfigurations() == null ^ this.getSecurityConfigurations() == null)
            return false;
        if (other.getSecurityConfigurations() != null && other.getSecurityConfigurations().equals(this.getSecurityConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getSecurityConfigurations() == null) ? 0 : getSecurityConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSecurityConfigurationsResult clone() {
        try {
            return (GetSecurityConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
