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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a Firewall Manager network ACL policy. This is used in the <code>PolicyOption</code> of a
 * <code>SecurityServicePolicyData</code> for a <code>Policy</code>, when the <code>SecurityServicePolicyData</code>
 * type is set to <code>NETWORK_ACL_COMMON</code>.
 * </p>
 * <p>
 * For information about network ACLs, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-network-acls.html">Control traffic to subnets using
 * network ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkAclCommonPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkAclCommonPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The definition of the first and last rules for the network ACL policy.
     * </p>
     */
    private NetworkAclEntrySet networkAclEntrySet;

    /**
     * <p>
     * The definition of the first and last rules for the network ACL policy.
     * </p>
     * 
     * @param networkAclEntrySet
     *        The definition of the first and last rules for the network ACL policy.
     */

    public void setNetworkAclEntrySet(NetworkAclEntrySet networkAclEntrySet) {
        this.networkAclEntrySet = networkAclEntrySet;
    }

    /**
     * <p>
     * The definition of the first and last rules for the network ACL policy.
     * </p>
     * 
     * @return The definition of the first and last rules for the network ACL policy.
     */

    public NetworkAclEntrySet getNetworkAclEntrySet() {
        return this.networkAclEntrySet;
    }

    /**
     * <p>
     * The definition of the first and last rules for the network ACL policy.
     * </p>
     * 
     * @param networkAclEntrySet
     *        The definition of the first and last rules for the network ACL policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclCommonPolicy withNetworkAclEntrySet(NetworkAclEntrySet networkAclEntrySet) {
        setNetworkAclEntrySet(networkAclEntrySet);
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
        if (getNetworkAclEntrySet() != null)
            sb.append("NetworkAclEntrySet: ").append(getNetworkAclEntrySet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAclCommonPolicy == false)
            return false;
        NetworkAclCommonPolicy other = (NetworkAclCommonPolicy) obj;
        if (other.getNetworkAclEntrySet() == null ^ this.getNetworkAclEntrySet() == null)
            return false;
        if (other.getNetworkAclEntrySet() != null && other.getNetworkAclEntrySet().equals(this.getNetworkAclEntrySet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkAclEntrySet() == null) ? 0 : getNetworkAclEntrySet().hashCode());
        return hashCode;
    }

    @Override
    public NetworkAclCommonPolicy clone() {
        try {
            return (NetworkAclCommonPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkAclCommonPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
