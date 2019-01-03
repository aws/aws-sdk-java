/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteNetworkAclEntryRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNetworkAclEntryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteNetworkAclEntryRequest> {

    /**
     * <p>
     * Indicates whether the rule is an egress rule.
     * </p>
     */
    private Boolean egress;
    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     */
    private String networkAclId;
    /**
     * <p>
     * The rule number of the entry to delete.
     * </p>
     */
    private Integer ruleNumber;

    /**
     * <p>
     * Indicates whether the rule is an egress rule.
     * </p>
     * 
     * @param egress
     *        Indicates whether the rule is an egress rule.
     */

    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule.
     * </p>
     * 
     * @return Indicates whether the rule is an egress rule.
     */

    public Boolean getEgress() {
        return this.egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule.
     * </p>
     * 
     * @param egress
     *        Indicates whether the rule is an egress rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNetworkAclEntryRequest withEgress(Boolean egress) {
        setEgress(egress);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule.
     * </p>
     * 
     * @return Indicates whether the rule is an egress rule.
     */

    public Boolean isEgress() {
        return this.egress;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The ID of the network ACL.
     */

    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * 
     * @return The ID of the network ACL.
     */

    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The ID of the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNetworkAclEntryRequest withNetworkAclId(String networkAclId) {
        setNetworkAclId(networkAclId);
        return this;
    }

    /**
     * <p>
     * The rule number of the entry to delete.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number of the entry to delete.
     */

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number of the entry to delete.
     * </p>
     * 
     * @return The rule number of the entry to delete.
     */

    public Integer getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * <p>
     * The rule number of the entry to delete.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number of the entry to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNetworkAclEntryRequest withRuleNumber(Integer ruleNumber) {
        setRuleNumber(ruleNumber);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteNetworkAclEntryRequest> getDryRunRequest() {
        Request<DeleteNetworkAclEntryRequest> request = new DeleteNetworkAclEntryRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getEgress() != null)
            sb.append("Egress: ").append(getEgress()).append(",");
        if (getNetworkAclId() != null)
            sb.append("NetworkAclId: ").append(getNetworkAclId()).append(",");
        if (getRuleNumber() != null)
            sb.append("RuleNumber: ").append(getRuleNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNetworkAclEntryRequest == false)
            return false;
        DeleteNetworkAclEntryRequest other = (DeleteNetworkAclEntryRequest) obj;
        if (other.getEgress() == null ^ this.getEgress() == null)
            return false;
        if (other.getEgress() != null && other.getEgress().equals(this.getEgress()) == false)
            return false;
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null)
            return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false)
            return false;
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null)
            return false;
        if (other.getRuleNumber() != null && other.getRuleNumber().equals(this.getRuleNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgress() == null) ? 0 : getEgress().hashCode());
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNetworkAclEntryRequest clone() {
        return (DeleteNetworkAclEntryRequest) super.clone();
    }
}
