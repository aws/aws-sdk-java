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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/BatchUpdateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerIdentifier;
    /**
     * <p>
     * The rules for the specified listener.
     * </p>
     */
    private java.util.List<RuleUpdate> rules;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String serviceIdentifier;

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerIdentifier
     *        The ID or Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerIdentifier(String listenerIdentifier) {
        this.listenerIdentifier = listenerIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerIdentifier() {
        return this.listenerIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerIdentifier
     *        The ID or Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRuleRequest withListenerIdentifier(String listenerIdentifier) {
        setListenerIdentifier(listenerIdentifier);
        return this;
    }

    /**
     * <p>
     * The rules for the specified listener.
     * </p>
     * 
     * @return The rules for the specified listener.
     */

    public java.util.List<RuleUpdate> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules for the specified listener.
     * </p>
     * 
     * @param rules
     *        The rules for the specified listener.
     */

    public void setRules(java.util.Collection<RuleUpdate> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<RuleUpdate>(rules);
    }

    /**
     * <p>
     * The rules for the specified listener.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules for the specified listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRuleRequest withRules(RuleUpdate... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<RuleUpdate>(rules.length));
        }
        for (RuleUpdate ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules for the specified listener.
     * </p>
     * 
     * @param rules
     *        The rules for the specified listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRuleRequest withRules(java.util.Collection<RuleUpdate> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     */

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the service.
     */

    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRuleRequest withServiceIdentifier(String serviceIdentifier) {
        setServiceIdentifier(serviceIdentifier);
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
        if (getListenerIdentifier() != null)
            sb.append("ListenerIdentifier: ").append(getListenerIdentifier()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getServiceIdentifier() != null)
            sb.append("ServiceIdentifier: ").append(getServiceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateRuleRequest == false)
            return false;
        BatchUpdateRuleRequest other = (BatchUpdateRuleRequest) obj;
        if (other.getListenerIdentifier() == null ^ this.getListenerIdentifier() == null)
            return false;
        if (other.getListenerIdentifier() != null && other.getListenerIdentifier().equals(this.getListenerIdentifier()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getServiceIdentifier() == null ^ this.getServiceIdentifier() == null)
            return false;
        if (other.getServiceIdentifier() != null && other.getServiceIdentifier().equals(this.getServiceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerIdentifier() == null) ? 0 : getListenerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getServiceIdentifier() == null) ? 0 : getServiceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateRuleRequest clone() {
        return (BatchUpdateRuleRequest) super.clone();
    }

}
