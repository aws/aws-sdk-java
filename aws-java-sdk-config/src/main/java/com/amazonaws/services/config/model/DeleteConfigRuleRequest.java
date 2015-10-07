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
package com.amazonaws.services.config.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#deleteConfigRule(DeleteConfigRuleRequest) DeleteConfigRule operation}.
 * <p>
 * Deletes the specified AWS Config rule and all of its evaluation
 * results.
 * </p>
 * <p>
 * AWS Config sets the state of a rule to <code>DELETING</code> until the
 * deletion is complete. You cannot update a rule while it is in this
 * state. If you make a <code>PutConfigRule</code> request for the rule,
 * you will receive a <code>ResourceInUseException</code> .
 * </p>
 * <p>
 * You can check the state of a rule by using the
 * <code>DescribeConfigRules</code> request.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#deleteConfigRule(DeleteConfigRuleRequest)
 */
public class DeleteConfigRuleRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the AWS Config rule that you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String configRuleName;

    /**
     * The name of the AWS Config rule that you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The name of the AWS Config rule that you want to delete.
     */
    public String getConfigRuleName() {
        return configRuleName;
    }
    
    /**
     * The name of the AWS Config rule that you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name of the AWS Config rule that you want to delete.
     */
    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }
    
    /**
     * The name of the AWS Config rule that you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name of the AWS Config rule that you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteConfigRuleRequest withConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
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
        if (getConfigRuleName() != null) sb.append("ConfigRuleName: " + getConfigRuleName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteConfigRuleRequest == false) return false;
        DeleteConfigRuleRequest other = (DeleteConfigRuleRequest)obj;
        
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null) return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteConfigRuleRequest clone() {
        
            return (DeleteConfigRuleRequest) super.clone();
    }

}
    