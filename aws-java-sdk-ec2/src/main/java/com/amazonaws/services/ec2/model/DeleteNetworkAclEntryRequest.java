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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteNetworkAclEntryRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteNetworkAclEntry(DeleteNetworkAclEntryRequest) DeleteNetworkAclEntry operation}.
 * <p>
 * Deletes the specified ingress or egress entry (rule) from the
 * specified network ACL.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteNetworkAclEntry(DeleteNetworkAclEntryRequest)
 */
public class DeleteNetworkAclEntryRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteNetworkAclEntryRequest> {

    /**
     * The ID of the network ACL.
     */
    private String networkAclId;

    /**
     * The rule number of the entry to delete.
     */
    private Integer ruleNumber;

    /**
     * Indicates whether the rule is an egress rule.
     */
    private Boolean egress;

    /**
     * The ID of the network ACL.
     *
     * @return The ID of the network ACL.
     */
    public String getNetworkAclId() {
        return networkAclId;
    }
    
    /**
     * The ID of the network ACL.
     *
     * @param networkAclId The ID of the network ACL.
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }
    
    /**
     * The ID of the network ACL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclId The ID of the network ACL.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteNetworkAclEntryRequest withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * The rule number of the entry to delete.
     *
     * @return The rule number of the entry to delete.
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }
    
    /**
     * The rule number of the entry to delete.
     *
     * @param ruleNumber The rule number of the entry to delete.
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }
    
    /**
     * The rule number of the entry to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleNumber The rule number of the entry to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteNetworkAclEntryRequest withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }

    /**
     * Indicates whether the rule is an egress rule.
     *
     * @return Indicates whether the rule is an egress rule.
     */
    public Boolean isEgress() {
        return egress;
    }
    
    /**
     * Indicates whether the rule is an egress rule.
     *
     * @param egress Indicates whether the rule is an egress rule.
     */
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }
    
    /**
     * Indicates whether the rule is an egress rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param egress Indicates whether the rule is an egress rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteNetworkAclEntryRequest withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }

    /**
     * Indicates whether the rule is an egress rule.
     *
     * @return Indicates whether the rule is an egress rule.
     */
    public Boolean getEgress() {
        return egress;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteNetworkAclEntryRequest> getDryRunRequest() {
        Request<DeleteNetworkAclEntryRequest> request = new DeleteNetworkAclEntryRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNetworkAclId() != null) sb.append("NetworkAclId: " + getNetworkAclId() + ",");
        if (getRuleNumber() != null) sb.append("RuleNumber: " + getRuleNumber() + ",");
        if (isEgress() != null) sb.append("Egress: " + isEgress() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode()); 
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode()); 
        hashCode = prime * hashCode + ((isEgress() == null) ? 0 : isEgress().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteNetworkAclEntryRequest == false) return false;
        DeleteNetworkAclEntryRequest other = (DeleteNetworkAclEntryRequest)obj;
        
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null) return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false) return false; 
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null) return false;
        if (other.getRuleNumber() != null && other.getRuleNumber().equals(this.getRuleNumber()) == false) return false; 
        if (other.isEgress() == null ^ this.isEgress() == null) return false;
        if (other.isEgress() != null && other.isEgress().equals(this.isEgress()) == false) return false; 
        return true;
    }
    
}
    