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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIpRestriction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIpRestrictionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the IP rules.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * A map that describes the updated IP rules with CIDR ranges and descriptions.
     * </p>
     */
    private java.util.Map<String, String> ipRestrictionRuleMap;
    /**
     * <p>
     * A map of VPC IDs and their corresponding rules. When you configure this parameter, traffic from all VPC endpoints
     * that are present in the specified VPC is allowed.
     * </p>
     */
    private java.util.Map<String, String> vpcIdRestrictionRuleMap;
    /**
     * <p>
     * A map of allowed VPC endpoint IDs and their corresponding rule descriptions.
     * </p>
     */
    private java.util.Map<String, String> vpcEndpointIdRestrictionRuleMap;
    /**
     * <p>
     * A value that specifies whether IP rules are turned on.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the IP rules.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the IP rules.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the IP rules.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the IP rules.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the IP rules.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the IP rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * A map that describes the updated IP rules with CIDR ranges and descriptions.
     * </p>
     * 
     * @return A map that describes the updated IP rules with CIDR ranges and descriptions.
     */

    public java.util.Map<String, String> getIpRestrictionRuleMap() {
        return ipRestrictionRuleMap;
    }

    /**
     * <p>
     * A map that describes the updated IP rules with CIDR ranges and descriptions.
     * </p>
     * 
     * @param ipRestrictionRuleMap
     *        A map that describes the updated IP rules with CIDR ranges and descriptions.
     */

    public void setIpRestrictionRuleMap(java.util.Map<String, String> ipRestrictionRuleMap) {
        this.ipRestrictionRuleMap = ipRestrictionRuleMap;
    }

    /**
     * <p>
     * A map that describes the updated IP rules with CIDR ranges and descriptions.
     * </p>
     * 
     * @param ipRestrictionRuleMap
     *        A map that describes the updated IP rules with CIDR ranges and descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest withIpRestrictionRuleMap(java.util.Map<String, String> ipRestrictionRuleMap) {
        setIpRestrictionRuleMap(ipRestrictionRuleMap);
        return this;
    }

    /**
     * Add a single IpRestrictionRuleMap entry
     *
     * @see UpdateIpRestrictionRequest#withIpRestrictionRuleMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest addIpRestrictionRuleMapEntry(String key, String value) {
        if (null == this.ipRestrictionRuleMap) {
            this.ipRestrictionRuleMap = new java.util.HashMap<String, String>();
        }
        if (this.ipRestrictionRuleMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.ipRestrictionRuleMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IpRestrictionRuleMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest clearIpRestrictionRuleMapEntries() {
        this.ipRestrictionRuleMap = null;
        return this;
    }

    /**
     * <p>
     * A map of VPC IDs and their corresponding rules. When you configure this parameter, traffic from all VPC endpoints
     * that are present in the specified VPC is allowed.
     * </p>
     * 
     * @return A map of VPC IDs and their corresponding rules. When you configure this parameter, traffic from all VPC
     *         endpoints that are present in the specified VPC is allowed.
     */

    public java.util.Map<String, String> getVpcIdRestrictionRuleMap() {
        return vpcIdRestrictionRuleMap;
    }

    /**
     * <p>
     * A map of VPC IDs and their corresponding rules. When you configure this parameter, traffic from all VPC endpoints
     * that are present in the specified VPC is allowed.
     * </p>
     * 
     * @param vpcIdRestrictionRuleMap
     *        A map of VPC IDs and their corresponding rules. When you configure this parameter, traffic from all VPC
     *        endpoints that are present in the specified VPC is allowed.
     */

    public void setVpcIdRestrictionRuleMap(java.util.Map<String, String> vpcIdRestrictionRuleMap) {
        this.vpcIdRestrictionRuleMap = vpcIdRestrictionRuleMap;
    }

    /**
     * <p>
     * A map of VPC IDs and their corresponding rules. When you configure this parameter, traffic from all VPC endpoints
     * that are present in the specified VPC is allowed.
     * </p>
     * 
     * @param vpcIdRestrictionRuleMap
     *        A map of VPC IDs and their corresponding rules. When you configure this parameter, traffic from all VPC
     *        endpoints that are present in the specified VPC is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest withVpcIdRestrictionRuleMap(java.util.Map<String, String> vpcIdRestrictionRuleMap) {
        setVpcIdRestrictionRuleMap(vpcIdRestrictionRuleMap);
        return this;
    }

    /**
     * Add a single VpcIdRestrictionRuleMap entry
     *
     * @see UpdateIpRestrictionRequest#withVpcIdRestrictionRuleMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest addVpcIdRestrictionRuleMapEntry(String key, String value) {
        if (null == this.vpcIdRestrictionRuleMap) {
            this.vpcIdRestrictionRuleMap = new java.util.HashMap<String, String>();
        }
        if (this.vpcIdRestrictionRuleMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.vpcIdRestrictionRuleMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VpcIdRestrictionRuleMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest clearVpcIdRestrictionRuleMapEntries() {
        this.vpcIdRestrictionRuleMap = null;
        return this;
    }

    /**
     * <p>
     * A map of allowed VPC endpoint IDs and their corresponding rule descriptions.
     * </p>
     * 
     * @return A map of allowed VPC endpoint IDs and their corresponding rule descriptions.
     */

    public java.util.Map<String, String> getVpcEndpointIdRestrictionRuleMap() {
        return vpcEndpointIdRestrictionRuleMap;
    }

    /**
     * <p>
     * A map of allowed VPC endpoint IDs and their corresponding rule descriptions.
     * </p>
     * 
     * @param vpcEndpointIdRestrictionRuleMap
     *        A map of allowed VPC endpoint IDs and their corresponding rule descriptions.
     */

    public void setVpcEndpointIdRestrictionRuleMap(java.util.Map<String, String> vpcEndpointIdRestrictionRuleMap) {
        this.vpcEndpointIdRestrictionRuleMap = vpcEndpointIdRestrictionRuleMap;
    }

    /**
     * <p>
     * A map of allowed VPC endpoint IDs and their corresponding rule descriptions.
     * </p>
     * 
     * @param vpcEndpointIdRestrictionRuleMap
     *        A map of allowed VPC endpoint IDs and their corresponding rule descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest withVpcEndpointIdRestrictionRuleMap(java.util.Map<String, String> vpcEndpointIdRestrictionRuleMap) {
        setVpcEndpointIdRestrictionRuleMap(vpcEndpointIdRestrictionRuleMap);
        return this;
    }

    /**
     * Add a single VpcEndpointIdRestrictionRuleMap entry
     *
     * @see UpdateIpRestrictionRequest#withVpcEndpointIdRestrictionRuleMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest addVpcEndpointIdRestrictionRuleMapEntry(String key, String value) {
        if (null == this.vpcEndpointIdRestrictionRuleMap) {
            this.vpcEndpointIdRestrictionRuleMap = new java.util.HashMap<String, String>();
        }
        if (this.vpcEndpointIdRestrictionRuleMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.vpcEndpointIdRestrictionRuleMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VpcEndpointIdRestrictionRuleMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest clearVpcEndpointIdRestrictionRuleMapEntries() {
        this.vpcEndpointIdRestrictionRuleMap = null;
        return this;
    }

    /**
     * <p>
     * A value that specifies whether IP rules are turned on.
     * </p>
     * 
     * @param enabled
     *        A value that specifies whether IP rules are turned on.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A value that specifies whether IP rules are turned on.
     * </p>
     * 
     * @return A value that specifies whether IP rules are turned on.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A value that specifies whether IP rules are turned on.
     * </p>
     * 
     * @param enabled
     *        A value that specifies whether IP rules are turned on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIpRestrictionRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether IP rules are turned on.
     * </p>
     * 
     * @return A value that specifies whether IP rules are turned on.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getIpRestrictionRuleMap() != null)
            sb.append("IpRestrictionRuleMap: ").append(getIpRestrictionRuleMap()).append(",");
        if (getVpcIdRestrictionRuleMap() != null)
            sb.append("VpcIdRestrictionRuleMap: ").append(getVpcIdRestrictionRuleMap()).append(",");
        if (getVpcEndpointIdRestrictionRuleMap() != null)
            sb.append("VpcEndpointIdRestrictionRuleMap: ").append(getVpcEndpointIdRestrictionRuleMap()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIpRestrictionRequest == false)
            return false;
        UpdateIpRestrictionRequest other = (UpdateIpRestrictionRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getIpRestrictionRuleMap() == null ^ this.getIpRestrictionRuleMap() == null)
            return false;
        if (other.getIpRestrictionRuleMap() != null && other.getIpRestrictionRuleMap().equals(this.getIpRestrictionRuleMap()) == false)
            return false;
        if (other.getVpcIdRestrictionRuleMap() == null ^ this.getVpcIdRestrictionRuleMap() == null)
            return false;
        if (other.getVpcIdRestrictionRuleMap() != null && other.getVpcIdRestrictionRuleMap().equals(this.getVpcIdRestrictionRuleMap()) == false)
            return false;
        if (other.getVpcEndpointIdRestrictionRuleMap() == null ^ this.getVpcEndpointIdRestrictionRuleMap() == null)
            return false;
        if (other.getVpcEndpointIdRestrictionRuleMap() != null
                && other.getVpcEndpointIdRestrictionRuleMap().equals(this.getVpcEndpointIdRestrictionRuleMap()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getIpRestrictionRuleMap() == null) ? 0 : getIpRestrictionRuleMap().hashCode());
        hashCode = prime * hashCode + ((getVpcIdRestrictionRuleMap() == null) ? 0 : getVpcIdRestrictionRuleMap().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointIdRestrictionRuleMap() == null) ? 0 : getVpcEndpointIdRestrictionRuleMap().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIpRestrictionRequest clone() {
        return (UpdateIpRestrictionRequest) super.clone();
    }

}
