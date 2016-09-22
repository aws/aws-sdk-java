/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * Provides configuration information about a Lambda function version alias.
 * </p>
 */
public class GetAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias
     * called <code>BETA</code> that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * </p>
     */
    private String aliasArn;
    /**
     * <p>
     * Alias name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Function version to which the alias points.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * Alias description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias
     * called <code>BETA</code> that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * </p>
     * 
     * @param aliasArn
     *        Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an
     *        alias called <code>BETA</code> that points to a helloworld function version, the ARN is
     *        <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     */

    public void setAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
    }

    /**
     * <p>
     * Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias
     * called <code>BETA</code> that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * </p>
     * 
     * @return Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an
     *         alias called <code>BETA</code> that points to a helloworld function version, the ARN is
     *         <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     */

    public String getAliasArn() {
        return this.aliasArn;
    }

    /**
     * <p>
     * Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias
     * called <code>BETA</code> that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * </p>
     * 
     * @param aliasArn
     *        Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an
     *        alias called <code>BETA</code> that points to a helloworld function version, the ARN is
     *        <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withAliasArn(String aliasArn) {
        setAliasArn(aliasArn);
        return this;
    }

    /**
     * <p>
     * Alias name.
     * </p>
     * 
     * @param name
     *        Alias name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Alias name.
     * </p>
     * 
     * @return Alias name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Alias name.
     * </p>
     * 
     * @param name
     *        Alias name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Function version to which the alias points.
     * </p>
     * 
     * @param functionVersion
     *        Function version to which the alias points.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * Function version to which the alias points.
     * </p>
     * 
     * @return Function version to which the alias points.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * Function version to which the alias points.
     * </p>
     * 
     * @param functionVersion
     *        Function version to which the alias points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * Alias description.
     * </p>
     * 
     * @param description
     *        Alias description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Alias description.
     * </p>
     * 
     * @return Alias description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Alias description.
     * </p>
     * 
     * @param description
     *        Alias description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAliasArn() != null)
            sb.append("AliasArn: " + getAliasArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getFunctionVersion() != null)
            sb.append("FunctionVersion: " + getFunctionVersion() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAliasResult == false)
            return false;
        GetAliasResult other = (GetAliasResult) obj;
        if (other.getAliasArn() == null ^ this.getAliasArn() == null)
            return false;
        if (other.getAliasArn() != null && other.getAliasArn().equals(this.getAliasArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null)
            return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasArn() == null) ? 0 : getAliasArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public GetAliasResult clone() {
        try {
            return (GetAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
