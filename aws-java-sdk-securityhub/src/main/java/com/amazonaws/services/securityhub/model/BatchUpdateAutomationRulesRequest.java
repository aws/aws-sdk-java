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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateAutomationRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateAutomationRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of ARNs for the rules that are to be updated. Optionally, you can also include <code>RuleStatus</code>
     * and <code>RuleOrder</code>.
     * </p>
     */
    private java.util.List<UpdateAutomationRulesRequestItem> updateAutomationRulesRequestItems;

    /**
     * <p>
     * An array of ARNs for the rules that are to be updated. Optionally, you can also include <code>RuleStatus</code>
     * and <code>RuleOrder</code>.
     * </p>
     * 
     * @return An array of ARNs for the rules that are to be updated. Optionally, you can also include
     *         <code>RuleStatus</code> and <code>RuleOrder</code>.
     */

    public java.util.List<UpdateAutomationRulesRequestItem> getUpdateAutomationRulesRequestItems() {
        return updateAutomationRulesRequestItems;
    }

    /**
     * <p>
     * An array of ARNs for the rules that are to be updated. Optionally, you can also include <code>RuleStatus</code>
     * and <code>RuleOrder</code>.
     * </p>
     * 
     * @param updateAutomationRulesRequestItems
     *        An array of ARNs for the rules that are to be updated. Optionally, you can also include
     *        <code>RuleStatus</code> and <code>RuleOrder</code>.
     */

    public void setUpdateAutomationRulesRequestItems(java.util.Collection<UpdateAutomationRulesRequestItem> updateAutomationRulesRequestItems) {
        if (updateAutomationRulesRequestItems == null) {
            this.updateAutomationRulesRequestItems = null;
            return;
        }

        this.updateAutomationRulesRequestItems = new java.util.ArrayList<UpdateAutomationRulesRequestItem>(updateAutomationRulesRequestItems);
    }

    /**
     * <p>
     * An array of ARNs for the rules that are to be updated. Optionally, you can also include <code>RuleStatus</code>
     * and <code>RuleOrder</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateAutomationRulesRequestItems(java.util.Collection)} or
     * {@link #withUpdateAutomationRulesRequestItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param updateAutomationRulesRequestItems
     *        An array of ARNs for the rules that are to be updated. Optionally, you can also include
     *        <code>RuleStatus</code> and <code>RuleOrder</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAutomationRulesRequest withUpdateAutomationRulesRequestItems(UpdateAutomationRulesRequestItem... updateAutomationRulesRequestItems) {
        if (this.updateAutomationRulesRequestItems == null) {
            setUpdateAutomationRulesRequestItems(new java.util.ArrayList<UpdateAutomationRulesRequestItem>(updateAutomationRulesRequestItems.length));
        }
        for (UpdateAutomationRulesRequestItem ele : updateAutomationRulesRequestItems) {
            this.updateAutomationRulesRequestItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of ARNs for the rules that are to be updated. Optionally, you can also include <code>RuleStatus</code>
     * and <code>RuleOrder</code>.
     * </p>
     * 
     * @param updateAutomationRulesRequestItems
     *        An array of ARNs for the rules that are to be updated. Optionally, you can also include
     *        <code>RuleStatus</code> and <code>RuleOrder</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAutomationRulesRequest withUpdateAutomationRulesRequestItems(
            java.util.Collection<UpdateAutomationRulesRequestItem> updateAutomationRulesRequestItems) {
        setUpdateAutomationRulesRequestItems(updateAutomationRulesRequestItems);
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
        if (getUpdateAutomationRulesRequestItems() != null)
            sb.append("UpdateAutomationRulesRequestItems: ").append(getUpdateAutomationRulesRequestItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateAutomationRulesRequest == false)
            return false;
        BatchUpdateAutomationRulesRequest other = (BatchUpdateAutomationRulesRequest) obj;
        if (other.getUpdateAutomationRulesRequestItems() == null ^ this.getUpdateAutomationRulesRequestItems() == null)
            return false;
        if (other.getUpdateAutomationRulesRequestItems() != null
                && other.getUpdateAutomationRulesRequestItems().equals(this.getUpdateAutomationRulesRequestItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateAutomationRulesRequestItems() == null) ? 0 : getUpdateAutomationRulesRequestItems().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateAutomationRulesRequest clone() {
        return (BatchUpdateAutomationRulesRequest) super.clone();
    }

}
