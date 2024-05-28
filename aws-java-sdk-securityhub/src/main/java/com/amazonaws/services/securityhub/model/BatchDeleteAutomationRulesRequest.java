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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDeleteAutomationRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteAutomationRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) for the rules that are to be deleted.
     * </p>
     */
    private java.util.List<String> automationRulesArns;

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) for the rules that are to be deleted.
     * </p>
     * 
     * @return A list of Amazon Resource Names (ARNs) for the rules that are to be deleted.
     */

    public java.util.List<String> getAutomationRulesArns() {
        return automationRulesArns;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) for the rules that are to be deleted.
     * </p>
     * 
     * @param automationRulesArns
     *        A list of Amazon Resource Names (ARNs) for the rules that are to be deleted.
     */

    public void setAutomationRulesArns(java.util.Collection<String> automationRulesArns) {
        if (automationRulesArns == null) {
            this.automationRulesArns = null;
            return;
        }

        this.automationRulesArns = new java.util.ArrayList<String>(automationRulesArns);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) for the rules that are to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutomationRulesArns(java.util.Collection)} or {@link #withAutomationRulesArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param automationRulesArns
     *        A list of Amazon Resource Names (ARNs) for the rules that are to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteAutomationRulesRequest withAutomationRulesArns(String... automationRulesArns) {
        if (this.automationRulesArns == null) {
            setAutomationRulesArns(new java.util.ArrayList<String>(automationRulesArns.length));
        }
        for (String ele : automationRulesArns) {
            this.automationRulesArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) for the rules that are to be deleted.
     * </p>
     * 
     * @param automationRulesArns
     *        A list of Amazon Resource Names (ARNs) for the rules that are to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteAutomationRulesRequest withAutomationRulesArns(java.util.Collection<String> automationRulesArns) {
        setAutomationRulesArns(automationRulesArns);
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
        if (getAutomationRulesArns() != null)
            sb.append("AutomationRulesArns: ").append(getAutomationRulesArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteAutomationRulesRequest == false)
            return false;
        BatchDeleteAutomationRulesRequest other = (BatchDeleteAutomationRulesRequest) obj;
        if (other.getAutomationRulesArns() == null ^ this.getAutomationRulesArns() == null)
            return false;
        if (other.getAutomationRulesArns() != null && other.getAutomationRulesArns().equals(this.getAutomationRulesArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationRulesArns() == null) ? 0 : getAutomationRulesArns().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteAutomationRulesRequest clone() {
        return (BatchDeleteAutomationRulesRequest) super.clone();
    }

}
