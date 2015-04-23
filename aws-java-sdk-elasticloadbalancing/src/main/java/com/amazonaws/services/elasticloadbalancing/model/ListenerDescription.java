/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * The policies enabled for a listener.
 * </p>
 */
public class ListenerDescription implements Serializable, Cloneable {

    /**
     * Information about a listener. <p>For information about the protocols
     * and the ports supported by Elastic Load Balancing, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listener
     * Configurations for Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     */
    private Listener listener;

    /**
     * The policies. If there are no policies enabled, the list is empty.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNames;

    /**
     * Default constructor for a new ListenerDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListenerDescription() {}
    
    /**
     * Information about a listener. <p>For information about the protocols
     * and the ports supported by Elastic Load Balancing, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listener
     * Configurations for Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     *
     * @return Information about a listener. <p>For information about the protocols
     *         and the ports supported by Elastic Load Balancing, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listener
     *         Configurations for Elastic Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     */
    public Listener getListener() {
        return listener;
    }
    
    /**
     * Information about a listener. <p>For information about the protocols
     * and the ports supported by Elastic Load Balancing, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listener
     * Configurations for Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     *
     * @param listener Information about a listener. <p>For information about the protocols
     *         and the ports supported by Elastic Load Balancing, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listener
     *         Configurations for Elastic Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     */
    public void setListener(Listener listener) {
        this.listener = listener;
    }
    
    /**
     * Information about a listener. <p>For information about the protocols
     * and the ports supported by Elastic Load Balancing, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listener
     * Configurations for Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listener Information about a listener. <p>For information about the protocols
     *         and the ports supported by Elastic Load Balancing, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listener
     *         Configurations for Elastic Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListenerDescription withListener(Listener listener) {
        this.listener = listener;
        return this;
    }

    /**
     * The policies. If there are no policies enabled, the list is empty.
     *
     * @return The policies. If there are no policies enabled, the list is empty.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
              policyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyNames.setAutoConstruct(true);
        }
        return policyNames;
    }
    
    /**
     * The policies. If there are no policies enabled, the list is empty.
     *
     * @param policyNames The policies. If there are no policies enabled, the list is empty.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
        policyNamesCopy.addAll(policyNames);
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * The policies. If there are no policies enabled, the list is empty.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyNames(java.util.Collection)} or {@link
     * #withPolicyNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The policies. If there are no policies enabled, the list is empty.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListenerDescription withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * The policies. If there are no policies enabled, the list is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The policies. If there are no policies enabled, the list is empty.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListenerDescription withPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
            policyNamesCopy.addAll(policyNames);
            this.policyNames = policyNamesCopy;
        }

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
        if (getListener() != null) sb.append("Listener: " + getListener() + ",");
        if (getPolicyNames() != null) sb.append("PolicyNames: " + getPolicyNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getListener() == null) ? 0 : getListener().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListenerDescription == false) return false;
        ListenerDescription other = (ListenerDescription)obj;
        
        if (other.getListener() == null ^ this.getListener() == null) return false;
        if (other.getListener() != null && other.getListener().equals(this.getListener()) == false) return false; 
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null) return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false) return false; 
        return true;
    }
    
    @Override
    public ListenerDescription clone() {
        try {
            return (ListenerDescription) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    