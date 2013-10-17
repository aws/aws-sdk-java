/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * A <code>PolicyDocument</code> that specifies access policies for the search domain's services, and the current status of those policies.
 * </p>
 */
public class AccessPoliciesStatus implements Serializable {

    /**
     * An IAM access policy as described in <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?AccessPolicyLanguage.html"
     * target="_blank">The Access Policy Language</a> in <i>Using AWS
     * Identity and Access Management</i>. The maximum size of an access
     * policy document is 100 KB. <p>Example: <code>{"Statement":
     * [{"Effect":"Allow", "Action": "*", "Resource":
     * "arn:aws:cs:us-east-1:1234567890:search/movies", "Condition": {
     * "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }},
     * {"Effect":"Allow", "Action": "*", "Resource":
     * "arn:aws:cs:us-east-1:1234567890:documents/movies", "Condition": {
     * "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }} ] }</code>
     */
    private String options;

    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     */
    private OptionStatus status;

    /**
     * An IAM access policy as described in <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?AccessPolicyLanguage.html"
     * target="_blank">The Access Policy Language</a> in <i>Using AWS
     * Identity and Access Management</i>. The maximum size of an access
     * policy document is 100 KB. <p>Example: <code>{"Statement":
     * [{"Effect":"Allow", "Action": "*", "Resource":
     * "arn:aws:cs:us-east-1:1234567890:search/movies", "Condition": {
     * "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }},
     * {"Effect":"Allow", "Action": "*", "Resource":
     * "arn:aws:cs:us-east-1:1234567890:documents/movies", "Condition": {
     * "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }} ] }</code>
     *
     * @return An IAM access policy as described in <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?AccessPolicyLanguage.html"
     *         target="_blank">The Access Policy Language</a> in <i>Using AWS
     *         Identity and Access Management</i>. The maximum size of an access
     *         policy document is 100 KB. <p>Example: <code>{"Statement":
     *         [{"Effect":"Allow", "Action": "*", "Resource":
     *         "arn:aws:cs:us-east-1:1234567890:search/movies", "Condition": {
     *         "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }},
     *         {"Effect":"Allow", "Action": "*", "Resource":
     *         "arn:aws:cs:us-east-1:1234567890:documents/movies", "Condition": {
     *         "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }} ] }</code>
     */
    public String getOptions() {
        return options;
    }
    
    /**
     * An IAM access policy as described in <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?AccessPolicyLanguage.html"
     * target="_blank">The Access Policy Language</a> in <i>Using AWS
     * Identity and Access Management</i>. The maximum size of an access
     * policy document is 100 KB. <p>Example: <code>{"Statement":
     * [{"Effect":"Allow", "Action": "*", "Resource":
     * "arn:aws:cs:us-east-1:1234567890:search/movies", "Condition": {
     * "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }},
     * {"Effect":"Allow", "Action": "*", "Resource":
     * "arn:aws:cs:us-east-1:1234567890:documents/movies", "Condition": {
     * "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }} ] }</code>
     *
     * @param options An IAM access policy as described in <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?AccessPolicyLanguage.html"
     *         target="_blank">The Access Policy Language</a> in <i>Using AWS
     *         Identity and Access Management</i>. The maximum size of an access
     *         policy document is 100 KB. <p>Example: <code>{"Statement":
     *         [{"Effect":"Allow", "Action": "*", "Resource":
     *         "arn:aws:cs:us-east-1:1234567890:search/movies", "Condition": {
     *         "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }},
     *         {"Effect":"Allow", "Action": "*", "Resource":
     *         "arn:aws:cs:us-east-1:1234567890:documents/movies", "Condition": {
     *         "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }} ] }</code>
     */
    public void setOptions(String options) {
        this.options = options;
    }
    
    /**
     * An IAM access policy as described in <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?AccessPolicyLanguage.html"
     * target="_blank">The Access Policy Language</a> in <i>Using AWS
     * Identity and Access Management</i>. The maximum size of an access
     * policy document is 100 KB. <p>Example: <code>{"Statement":
     * [{"Effect":"Allow", "Action": "*", "Resource":
     * "arn:aws:cs:us-east-1:1234567890:search/movies", "Condition": {
     * "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }},
     * {"Effect":"Allow", "Action": "*", "Resource":
     * "arn:aws:cs:us-east-1:1234567890:documents/movies", "Condition": {
     * "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }} ] }</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options An IAM access policy as described in <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?AccessPolicyLanguage.html"
     *         target="_blank">The Access Policy Language</a> in <i>Using AWS
     *         Identity and Access Management</i>. The maximum size of an access
     *         policy document is 100 KB. <p>Example: <code>{"Statement":
     *         [{"Effect":"Allow", "Action": "*", "Resource":
     *         "arn:aws:cs:us-east-1:1234567890:search/movies", "Condition": {
     *         "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }},
     *         {"Effect":"Allow", "Action": "*", "Resource":
     *         "arn:aws:cs:us-east-1:1234567890:documents/movies", "Condition": {
     *         "IpAddress": { "aws:SourceIp": ["203.0.113.1/32"] } }} ] }</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AccessPoliciesStatus withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     *
     * @return The status of an option, including when it was last updated and
     *         whether it is actively in use for searches.
     */
    public OptionStatus getStatus() {
        return status;
    }
    
    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     *
     * @param status The status of an option, including when it was last updated and
     *         whether it is actively in use for searches.
     */
    public void setStatus(OptionStatus status) {
        this.status = status;
    }
    
    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of an option, including when it was last updated and
     *         whether it is actively in use for searches.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AccessPoliciesStatus withStatus(OptionStatus status) {
        this.status = status;
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
        if (getOptions() != null) sb.append("Options: " + getOptions() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccessPoliciesStatus == false) return false;
        AccessPoliciesStatus other = (AccessPoliciesStatus)obj;
        
        if (other.getOptions() == null ^ this.getOptions() == null) return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    