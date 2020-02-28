/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an archive rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateArchiveRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateArchiveRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the created analyzer.
     * </p>
     */
    private String analyzerName;
    /**
     * <p>
     * A client token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The criteria for the rule.
     * </p>
     */
    private java.util.Map<String, Criterion> filter;
    /**
     * <p>
     * The name of the rule to create.
     * </p>
     */
    private String ruleName;

    /**
     * <p>
     * The name of the created analyzer.
     * </p>
     * 
     * @param analyzerName
     *        The name of the created analyzer.
     */

    public void setAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
    }

    /**
     * <p>
     * The name of the created analyzer.
     * </p>
     * 
     * @return The name of the created analyzer.
     */

    public String getAnalyzerName() {
        return this.analyzerName;
    }

    /**
     * <p>
     * The name of the created analyzer.
     * </p>
     * 
     * @param analyzerName
     *        The name of the created analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRuleRequest withAnalyzerName(String analyzerName) {
        setAnalyzerName(analyzerName);
        return this;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @return A client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRuleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The criteria for the rule.
     * </p>
     * 
     * @return The criteria for the rule.
     */

    public java.util.Map<String, Criterion> getFilter() {
        return filter;
    }

    /**
     * <p>
     * The criteria for the rule.
     * </p>
     * 
     * @param filter
     *        The criteria for the rule.
     */

    public void setFilter(java.util.Map<String, Criterion> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The criteria for the rule.
     * </p>
     * 
     * @param filter
     *        The criteria for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRuleRequest withFilter(java.util.Map<String, Criterion> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Add a single Filter entry
     *
     * @see CreateArchiveRuleRequest#withFilter
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRuleRequest addFilterEntry(String key, Criterion value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, Criterion>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRuleRequest clearFilterEntries() {
        this.filter = null;
        return this;
    }

    /**
     * <p>
     * The name of the rule to create.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule to create.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule to create.
     * </p>
     * 
     * @return The name of the rule to create.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule to create.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArchiveRuleRequest withRuleName(String ruleName) {
        setRuleName(ruleName);
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
        if (getAnalyzerName() != null)
            sb.append("AnalyzerName: ").append(getAnalyzerName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateArchiveRuleRequest == false)
            return false;
        CreateArchiveRuleRequest other = (CreateArchiveRuleRequest) obj;
        if (other.getAnalyzerName() == null ^ this.getAnalyzerName() == null)
            return false;
        if (other.getAnalyzerName() != null && other.getAnalyzerName().equals(this.getAnalyzerName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzerName() == null) ? 0 : getAnalyzerName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        return hashCode;
    }

    @Override
    public CreateArchiveRuleRequest clone() {
        return (CreateArchiveRuleRequest) super.clone();
    }

}
