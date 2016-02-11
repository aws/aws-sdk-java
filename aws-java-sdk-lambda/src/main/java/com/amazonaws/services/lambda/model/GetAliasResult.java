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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * Provides configuration information about a Lambda function version
 * alias.
 * </p>
 */
public class GetAliasResult implements Serializable, Cloneable {

    /**
     * Lambda function ARN that is qualified using the alias name as the
     * suffix. For example, if you create an alias called <code>BETA</code>
     * that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String aliasArn;

    /**
     * Alias name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     */
    private String name;

    /**
     * Function version to which the alias points.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     */
    private String functionVersion;

    /**
     * Alias description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * Lambda function ARN that is qualified using the alias name as the
     * suffix. For example, if you create an alias called <code>BETA</code>
     * that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return Lambda function ARN that is qualified using the alias name as the
     *         suffix. For example, if you create an alias called <code>BETA</code>
     *         that points to a helloworld function version, the ARN is
     *         <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     */
    public String getAliasArn() {
        return aliasArn;
    }
    
    /**
     * Lambda function ARN that is qualified using the alias name as the
     * suffix. For example, if you create an alias called <code>BETA</code>
     * that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param aliasArn Lambda function ARN that is qualified using the alias name as the
     *         suffix. For example, if you create an alias called <code>BETA</code>
     *         that points to a helloworld function version, the ARN is
     *         <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     */
    public void setAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
    }
    
    /**
     * Lambda function ARN that is qualified using the alias name as the
     * suffix. For example, if you create an alias called <code>BETA</code>
     * that points to a helloworld function version, the ARN is
     * <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param aliasArn Lambda function ARN that is qualified using the alias name as the
     *         suffix. For example, if you create an alias called <code>BETA</code>
     *         that points to a helloworld function version, the ARN is
     *         <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAliasResult withAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
        return this;
    }

    /**
     * Alias name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     *
     * @return Alias name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Alias name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     *
     * @param name Alias name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Alias name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     *
     * @param name Alias name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAliasResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Function version to which the alias points.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @return Function version to which the alias points.
     */
    public String getFunctionVersion() {
        return functionVersion;
    }
    
    /**
     * Function version to which the alias points.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param functionVersion Function version to which the alias points.
     */
    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }
    
    /**
     * Function version to which the alias points.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param functionVersion Function version to which the alias points.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAliasResult withFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
        return this;
    }

    /**
     * Alias description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return Alias description.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Alias description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description Alias description.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Alias description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description Alias description.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAliasResult withDescription(String description) {
        this.description = description;
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
        if (getAliasArn() != null) sb.append("AliasArn: " + getAliasArn() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getFunctionVersion() != null) sb.append("FunctionVersion: " + getFunctionVersion() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAliasResult == false) return false;
        GetAliasResult other = (GetAliasResult)obj;
        
        if (other.getAliasArn() == null ^ this.getAliasArn() == null) return false;
        if (other.getAliasArn() != null && other.getAliasArn().equals(this.getAliasArn()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null) return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
    @Override
    public GetAliasResult clone() {
        try {
            return (GetAliasResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    