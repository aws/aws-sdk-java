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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retroactively applies an archive rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ApplyArchiveRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplyArchiveRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource name (ARN) of the analyzer.
     * </p>
     */
    private String analyzerArn;
    /**
     * <p>
     * A client token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the rule to apply.
     * </p>
     */
    private String ruleName;

    /**
     * <p>
     * The Amazon resource name (ARN) of the analyzer.
     * </p>
     * 
     * @param analyzerArn
     *        The Amazon resource name (ARN) of the analyzer.
     */

    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the analyzer.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of the analyzer.
     */

    public String getAnalyzerArn() {
        return this.analyzerArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the analyzer.
     * </p>
     * 
     * @param analyzerArn
     *        The Amazon resource name (ARN) of the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyArchiveRuleRequest withAnalyzerArn(String analyzerArn) {
        setAnalyzerArn(analyzerArn);
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

    public ApplyArchiveRuleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the rule to apply.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule to apply.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule to apply.
     * </p>
     * 
     * @return The name of the rule to apply.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule to apply.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyArchiveRuleRequest withRuleName(String ruleName) {
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
        if (getAnalyzerArn() != null)
            sb.append("AnalyzerArn: ").append(getAnalyzerArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof ApplyArchiveRuleRequest == false)
            return false;
        ApplyArchiveRuleRequest other = (ApplyArchiveRuleRequest) obj;
        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        return hashCode;
    }

    @Override
    public ApplyArchiveRuleRequest clone() {
        return (ApplyArchiveRuleRequest) super.clone();
    }

}
