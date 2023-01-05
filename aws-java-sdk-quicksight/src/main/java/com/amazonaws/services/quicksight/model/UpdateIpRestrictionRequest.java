/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIpRestrictionRequest clone() {
        return (UpdateIpRestrictionRequest) super.clone();
    }

}
