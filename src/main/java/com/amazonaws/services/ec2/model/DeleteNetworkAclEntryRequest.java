/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteNetworkAclEntry(DeleteNetworkAclEntryRequest) DeleteNetworkAclEntry operation}.
 * <p>
 * Deletes an ingress or egress entry (i.e., rule) from a network ACL.
 * For more information about network ACLs, go to Network ACLs in the
 * Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteNetworkAclEntry(DeleteNetworkAclEntryRequest)
 */
public class DeleteNetworkAclEntryRequest extends AmazonWebServiceRequest {

    /**
     * ID of the network ACL.
     */
    private String networkAclId;

    /**
     * Rule number for the entry to delete.
     */
    private Integer ruleNumber;

    /**
     * Whether the rule to delete is an egress rule (<code>true</code>) or
     * ingress rule (<code>false</code>).
     */
    private Boolean egress;

    /**
     * ID of the network ACL.
     *
     * @return ID of the network ACL.
     */
    public String getNetworkAclId() {
        return networkAclId;
    }
    
    /**
     * ID of the network ACL.
     *
     * @param networkAclId ID of the network ACL.
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }
    
    /**
     * ID of the network ACL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclId ID of the network ACL.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteNetworkAclEntryRequest withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    
    
    /**
     * Rule number for the entry to delete.
     *
     * @return Rule number for the entry to delete.
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }
    
    /**
     * Rule number for the entry to delete.
     *
     * @param ruleNumber Rule number for the entry to delete.
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }
    
    /**
     * Rule number for the entry to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleNumber Rule number for the entry to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteNetworkAclEntryRequest withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }
    
    
    /**
     * Whether the rule to delete is an egress rule (<code>true</code>) or
     * ingress rule (<code>false</code>).
     *
     * @return Whether the rule to delete is an egress rule (<code>true</code>) or
     *         ingress rule (<code>false</code>).
     */
    public Boolean isEgress() {
        return egress;
    }
    
    /**
     * Whether the rule to delete is an egress rule (<code>true</code>) or
     * ingress rule (<code>false</code>).
     *
     * @param egress Whether the rule to delete is an egress rule (<code>true</code>) or
     *         ingress rule (<code>false</code>).
     */
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }
    
    /**
     * Whether the rule to delete is an egress rule (<code>true</code>) or
     * ingress rule (<code>false</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param egress Whether the rule to delete is an egress rule (<code>true</code>) or
     *         ingress rule (<code>false</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteNetworkAclEntryRequest withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }
    
    
    /**
     * Whether the rule to delete is an egress rule (<code>true</code>) or
     * ingress rule (<code>false</code>).
     *
     * @return Whether the rule to delete is an egress rule (<code>true</code>) or
     *         ingress rule (<code>false</code>).
     */
    public Boolean getEgress() {
        return egress;
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
        sb.append("NetworkAclId: " + networkAclId + ", ");
        sb.append("RuleNumber: " + ruleNumber + ", ");
        sb.append("Egress: " + egress + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    