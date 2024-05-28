/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateAutomationRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateAutomationRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of properly processed rule ARNs.
     * </p>
     */
    private java.util.List<String> processedAutomationRules;
    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't update and why.
     * </p>
     */
    private java.util.List<UnprocessedAutomationRule> unprocessedAutomationRules;

    /**
     * <p>
     * A list of properly processed rule ARNs.
     * </p>
     * 
     * @return A list of properly processed rule ARNs.
     */

    public java.util.List<String> getProcessedAutomationRules() {
        return processedAutomationRules;
    }

    /**
     * <p>
     * A list of properly processed rule ARNs.
     * </p>
     * 
     * @param processedAutomationRules
     *        A list of properly processed rule ARNs.
     */

    public void setProcessedAutomationRules(java.util.Collection<String> processedAutomationRules) {
        if (processedAutomationRules == null) {
            this.processedAutomationRules = null;
            return;
        }

        this.processedAutomationRules = new java.util.ArrayList<String>(processedAutomationRules);
    }

    /**
     * <p>
     * A list of properly processed rule ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessedAutomationRules(java.util.Collection)} or
     * {@link #withProcessedAutomationRules(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param processedAutomationRules
     *        A list of properly processed rule ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAutomationRulesResult withProcessedAutomationRules(String... processedAutomationRules) {
        if (this.processedAutomationRules == null) {
            setProcessedAutomationRules(new java.util.ArrayList<String>(processedAutomationRules.length));
        }
        for (String ele : processedAutomationRules) {
            this.processedAutomationRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of properly processed rule ARNs.
     * </p>
     * 
     * @param processedAutomationRules
     *        A list of properly processed rule ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAutomationRulesResult withProcessedAutomationRules(java.util.Collection<String> processedAutomationRules) {
        setProcessedAutomationRules(processedAutomationRules);
        return this;
    }

    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't update and why.
     * </p>
     * 
     * @return A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>.
     *         This parameter tells you which automation rules the request didn't update and why.
     */

    public java.util.List<UnprocessedAutomationRule> getUnprocessedAutomationRules() {
        return unprocessedAutomationRules;
    }

    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't update and why.
     * </p>
     * 
     * @param unprocessedAutomationRules
     *        A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>.
     *        This parameter tells you which automation rules the request didn't update and why.
     */

    public void setUnprocessedAutomationRules(java.util.Collection<UnprocessedAutomationRule> unprocessedAutomationRules) {
        if (unprocessedAutomationRules == null) {
            this.unprocessedAutomationRules = null;
            return;
        }

        this.unprocessedAutomationRules = new java.util.ArrayList<UnprocessedAutomationRule>(unprocessedAutomationRules);
    }

    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't update and why.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAutomationRules(java.util.Collection)} or
     * {@link #withUnprocessedAutomationRules(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAutomationRules
     *        A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>.
     *        This parameter tells you which automation rules the request didn't update and why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAutomationRulesResult withUnprocessedAutomationRules(UnprocessedAutomationRule... unprocessedAutomationRules) {
        if (this.unprocessedAutomationRules == null) {
            setUnprocessedAutomationRules(new java.util.ArrayList<UnprocessedAutomationRule>(unprocessedAutomationRules.length));
        }
        for (UnprocessedAutomationRule ele : unprocessedAutomationRules) {
            this.unprocessedAutomationRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't update and why.
     * </p>
     * 
     * @param unprocessedAutomationRules
     *        A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>.
     *        This parameter tells you which automation rules the request didn't update and why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAutomationRulesResult withUnprocessedAutomationRules(java.util.Collection<UnprocessedAutomationRule> unprocessedAutomationRules) {
        setUnprocessedAutomationRules(unprocessedAutomationRules);
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
        if (getProcessedAutomationRules() != null)
            sb.append("ProcessedAutomationRules: ").append(getProcessedAutomationRules()).append(",");
        if (getUnprocessedAutomationRules() != null)
            sb.append("UnprocessedAutomationRules: ").append(getUnprocessedAutomationRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateAutomationRulesResult == false)
            return false;
        BatchUpdateAutomationRulesResult other = (BatchUpdateAutomationRulesResult) obj;
        if (other.getProcessedAutomationRules() == null ^ this.getProcessedAutomationRules() == null)
            return false;
        if (other.getProcessedAutomationRules() != null && other.getProcessedAutomationRules().equals(this.getProcessedAutomationRules()) == false)
            return false;
        if (other.getUnprocessedAutomationRules() == null ^ this.getUnprocessedAutomationRules() == null)
            return false;
        if (other.getUnprocessedAutomationRules() != null && other.getUnprocessedAutomationRules().equals(this.getUnprocessedAutomationRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessedAutomationRules() == null) ? 0 : getProcessedAutomationRules().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAutomationRules() == null) ? 0 : getUnprocessedAutomationRules().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateAutomationRulesResult clone() {
        try {
            return (BatchUpdateAutomationRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
