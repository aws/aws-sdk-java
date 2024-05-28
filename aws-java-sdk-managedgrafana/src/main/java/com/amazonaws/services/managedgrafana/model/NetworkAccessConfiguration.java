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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration settings for in-bound network access to your workspace.
 * </p>
 * <p>
 * When this is configured, only listed IP addresses and VPC endpoints will be able to access your workspace. Standard
 * Grafana authentication and authorization are still required.
 * </p>
 * <p>
 * Access is granted to a caller that is in either the IP address list or the VPC endpoint list - they do not need to be
 * in both.
 * </p>
 * <p>
 * If this is not configured, or is removed, then all IP addresses and VPC endpoints are allowed. Standard Grafana
 * authentication and authorization are still required.
 * </p>
 * <note>
 * <p>
 * While both <code>prefixListIds</code> and <code>vpceIds</code> are required, you can pass in an empty array of
 * strings for either parameter if you do not want to allow any of that type.
 * </p>
 * <p>
 * If both are passed as empty arrays, no traffic is allowed to the workspace, because only <i>explicitly</i> allowed
 * connections are accepted.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/NetworkAccessConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkAccessConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified
     * are allowed to access your workspace. If the list is not included in the configuration (passed an empty array)
     * then no IP addresses are allowed to access the workspace. You create a prefix list using the Amazon VPC console.
     * </p>
     * <p>
     * Prefix list IDs have the format <code>pl-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about prefix lists, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html">Group CIDR blocks using managed
     * prefix lists</a>in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     */
    private java.util.List<String> prefixListIds;
    /**
     * <p>
     * An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon Managed
     * Grafana workspace for access from within a VPC. If a <code>NetworkAccessConfiguration</code> is specified then
     * only VPC endpoints specified here are allowed to access the workspace. If you pass in an empty array of strings,
     * then no VPCs are allowed to access the workspace.
     * </p>
     * <p>
     * VPC endpoint IDs have the format <code>vpce-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about creating an interface VPC endpoint, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints">Interface VPC endpoints</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces (using the
     * <code>com.amazonaws.[region].grafana-workspace</code> service endpoint). Other VPC endpoints are ignored.
     * </p>
     * </note>
     */
    private java.util.List<String> vpceIds;

    /**
     * <p>
     * An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified
     * are allowed to access your workspace. If the list is not included in the configuration (passed an empty array)
     * then no IP addresses are allowed to access the workspace. You create a prefix list using the Amazon VPC console.
     * </p>
     * <p>
     * Prefix list IDs have the format <code>pl-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about prefix lists, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html">Group CIDR blocks using managed
     * prefix lists</a>in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @return An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses
     *         specified are allowed to access your workspace. If the list is not included in the configuration (passed
     *         an empty array) then no IP addresses are allowed to access the workspace. You create a prefix list using
     *         the Amazon VPC console.</p>
     *         <p>
     *         Prefix list IDs have the format <code>pl-<i>1a2b3c4d</i> </code>.
     *         </p>
     *         <p>
     *         For more information about prefix lists, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html">Group CIDR blocks using
     *         managed prefix lists</a>in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */

    public java.util.List<String> getPrefixListIds() {
        return prefixListIds;
    }

    /**
     * <p>
     * An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified
     * are allowed to access your workspace. If the list is not included in the configuration (passed an empty array)
     * then no IP addresses are allowed to access the workspace. You create a prefix list using the Amazon VPC console.
     * </p>
     * <p>
     * Prefix list IDs have the format <code>pl-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about prefix lists, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html">Group CIDR blocks using managed
     * prefix lists</a>in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param prefixListIds
     *        An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses
     *        specified are allowed to access your workspace. If the list is not included in the configuration (passed
     *        an empty array) then no IP addresses are allowed to access the workspace. You create a prefix list using
     *        the Amazon VPC console.</p>
     *        <p>
     *        Prefix list IDs have the format <code>pl-<i>1a2b3c4d</i> </code>.
     *        </p>
     *        <p>
     *        For more information about prefix lists, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html">Group CIDR blocks using
     *        managed prefix lists</a>in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */

    public void setPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }

        this.prefixListIds = new java.util.ArrayList<String>(prefixListIds);
    }

    /**
     * <p>
     * An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified
     * are allowed to access your workspace. If the list is not included in the configuration (passed an empty array)
     * then no IP addresses are allowed to access the workspace. You create a prefix list using the Amazon VPC console.
     * </p>
     * <p>
     * Prefix list IDs have the format <code>pl-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about prefix lists, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html">Group CIDR blocks using managed
     * prefix lists</a>in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrefixListIds(java.util.Collection)} or {@link #withPrefixListIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param prefixListIds
     *        An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses
     *        specified are allowed to access your workspace. If the list is not included in the configuration (passed
     *        an empty array) then no IP addresses are allowed to access the workspace. You create a prefix list using
     *        the Amazon VPC console.</p>
     *        <p>
     *        Prefix list IDs have the format <code>pl-<i>1a2b3c4d</i> </code>.
     *        </p>
     *        <p>
     *        For more information about prefix lists, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html">Group CIDR blocks using
     *        managed prefix lists</a>in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAccessConfiguration withPrefixListIds(String... prefixListIds) {
        if (this.prefixListIds == null) {
            setPrefixListIds(new java.util.ArrayList<String>(prefixListIds.length));
        }
        for (String ele : prefixListIds) {
            this.prefixListIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified
     * are allowed to access your workspace. If the list is not included in the configuration (passed an empty array)
     * then no IP addresses are allowed to access the workspace. You create a prefix list using the Amazon VPC console.
     * </p>
     * <p>
     * Prefix list IDs have the format <code>pl-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about prefix lists, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html">Group CIDR blocks using managed
     * prefix lists</a>in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param prefixListIds
     *        An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses
     *        specified are allowed to access your workspace. If the list is not included in the configuration (passed
     *        an empty array) then no IP addresses are allowed to access the workspace. You create a prefix list using
     *        the Amazon VPC console.</p>
     *        <p>
     *        Prefix list IDs have the format <code>pl-<i>1a2b3c4d</i> </code>.
     *        </p>
     *        <p>
     *        For more information about prefix lists, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/managed-prefix-lists.html">Group CIDR blocks using
     *        managed prefix lists</a>in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAccessConfiguration withPrefixListIds(java.util.Collection<String> prefixListIds) {
        setPrefixListIds(prefixListIds);
        return this;
    }

    /**
     * <p>
     * An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon Managed
     * Grafana workspace for access from within a VPC. If a <code>NetworkAccessConfiguration</code> is specified then
     * only VPC endpoints specified here are allowed to access the workspace. If you pass in an empty array of strings,
     * then no VPCs are allowed to access the workspace.
     * </p>
     * <p>
     * VPC endpoint IDs have the format <code>vpce-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about creating an interface VPC endpoint, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints">Interface VPC endpoints</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces (using the
     * <code>com.amazonaws.[region].grafana-workspace</code> service endpoint). Other VPC endpoints are ignored.
     * </p>
     * </note>
     * 
     * @return An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon
     *         Managed Grafana workspace for access from within a VPC. If a <code>NetworkAccessConfiguration</code> is
     *         specified then only VPC endpoints specified here are allowed to access the workspace. If you pass in an
     *         empty array of strings, then no VPCs are allowed to access the workspace.</p>
     *         <p>
     *         VPC endpoint IDs have the format <code>vpce-<i>1a2b3c4d</i> </code>.
     *         </p>
     *         <p>
     *         For more information about creating an interface VPC endpoint, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints">Interface VPC endpoints</a> in
     *         the <i>Amazon Managed Grafana User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces
     *         (using the <code>com.amazonaws.[region].grafana-workspace</code> service endpoint). Other VPC endpoints
     *         are ignored.
     *         </p>
     */

    public java.util.List<String> getVpceIds() {
        return vpceIds;
    }

    /**
     * <p>
     * An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon Managed
     * Grafana workspace for access from within a VPC. If a <code>NetworkAccessConfiguration</code> is specified then
     * only VPC endpoints specified here are allowed to access the workspace. If you pass in an empty array of strings,
     * then no VPCs are allowed to access the workspace.
     * </p>
     * <p>
     * VPC endpoint IDs have the format <code>vpce-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about creating an interface VPC endpoint, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints">Interface VPC endpoints</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces (using the
     * <code>com.amazonaws.[region].grafana-workspace</code> service endpoint). Other VPC endpoints are ignored.
     * </p>
     * </note>
     * 
     * @param vpceIds
     *        An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon Managed
     *        Grafana workspace for access from within a VPC. If a <code>NetworkAccessConfiguration</code> is specified
     *        then only VPC endpoints specified here are allowed to access the workspace. If you pass in an empty array
     *        of strings, then no VPCs are allowed to access the workspace.</p>
     *        <p>
     *        VPC endpoint IDs have the format <code>vpce-<i>1a2b3c4d</i> </code>.
     *        </p>
     *        <p>
     *        For more information about creating an interface VPC endpoint, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints">Interface VPC endpoints</a> in
     *        the <i>Amazon Managed Grafana User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces
     *        (using the <code>com.amazonaws.[region].grafana-workspace</code> service endpoint). Other VPC endpoints
     *        are ignored.
     *        </p>
     */

    public void setVpceIds(java.util.Collection<String> vpceIds) {
        if (vpceIds == null) {
            this.vpceIds = null;
            return;
        }

        this.vpceIds = new java.util.ArrayList<String>(vpceIds);
    }

    /**
     * <p>
     * An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon Managed
     * Grafana workspace for access from within a VPC. If a <code>NetworkAccessConfiguration</code> is specified then
     * only VPC endpoints specified here are allowed to access the workspace. If you pass in an empty array of strings,
     * then no VPCs are allowed to access the workspace.
     * </p>
     * <p>
     * VPC endpoint IDs have the format <code>vpce-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about creating an interface VPC endpoint, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints">Interface VPC endpoints</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces (using the
     * <code>com.amazonaws.[region].grafana-workspace</code> service endpoint). Other VPC endpoints are ignored.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpceIds(java.util.Collection)} or {@link #withVpceIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param vpceIds
     *        An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon Managed
     *        Grafana workspace for access from within a VPC. If a <code>NetworkAccessConfiguration</code> is specified
     *        then only VPC endpoints specified here are allowed to access the workspace. If you pass in an empty array
     *        of strings, then no VPCs are allowed to access the workspace.</p>
     *        <p>
     *        VPC endpoint IDs have the format <code>vpce-<i>1a2b3c4d</i> </code>.
     *        </p>
     *        <p>
     *        For more information about creating an interface VPC endpoint, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints">Interface VPC endpoints</a> in
     *        the <i>Amazon Managed Grafana User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces
     *        (using the <code>com.amazonaws.[region].grafana-workspace</code> service endpoint). Other VPC endpoints
     *        are ignored.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAccessConfiguration withVpceIds(String... vpceIds) {
        if (this.vpceIds == null) {
            setVpceIds(new java.util.ArrayList<String>(vpceIds.length));
        }
        for (String ele : vpceIds) {
            this.vpceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon Managed
     * Grafana workspace for access from within a VPC. If a <code>NetworkAccessConfiguration</code> is specified then
     * only VPC endpoints specified here are allowed to access the workspace. If you pass in an empty array of strings,
     * then no VPCs are allowed to access the workspace.
     * </p>
     * <p>
     * VPC endpoint IDs have the format <code>vpce-<i>1a2b3c4d</i> </code>.
     * </p>
     * <p>
     * For more information about creating an interface VPC endpoint, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints">Interface VPC endpoints</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces (using the
     * <code>com.amazonaws.[region].grafana-workspace</code> service endpoint). Other VPC endpoints are ignored.
     * </p>
     * </note>
     * 
     * @param vpceIds
     *        An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon Managed
     *        Grafana workspace for access from within a VPC. If a <code>NetworkAccessConfiguration</code> is specified
     *        then only VPC endpoints specified here are allowed to access the workspace. If you pass in an empty array
     *        of strings, then no VPCs are allowed to access the workspace.</p>
     *        <p>
     *        VPC endpoint IDs have the format <code>vpce-<i>1a2b3c4d</i> </code>.
     *        </p>
     *        <p>
     *        For more information about creating an interface VPC endpoint, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/VPC-endpoints">Interface VPC endpoints</a> in
     *        the <i>Amazon Managed Grafana User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces
     *        (using the <code>com.amazonaws.[region].grafana-workspace</code> service endpoint). Other VPC endpoints
     *        are ignored.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAccessConfiguration withVpceIds(java.util.Collection<String> vpceIds) {
        setVpceIds(vpceIds);
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
        if (getPrefixListIds() != null)
            sb.append("PrefixListIds: ").append(getPrefixListIds()).append(",");
        if (getVpceIds() != null)
            sb.append("VpceIds: ").append(getVpceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAccessConfiguration == false)
            return false;
        NetworkAccessConfiguration other = (NetworkAccessConfiguration) obj;
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null)
            return false;
        if (other.getPrefixListIds() != null && other.getPrefixListIds().equals(this.getPrefixListIds()) == false)
            return false;
        if (other.getVpceIds() == null ^ this.getVpceIds() == null)
            return false;
        if (other.getVpceIds() != null && other.getVpceIds().equals(this.getVpceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode());
        hashCode = prime * hashCode + ((getVpceIds() == null) ? 0 : getVpceIds().hashCode());
        return hashCode;
    }

    @Override
    public NetworkAccessConfiguration clone() {
        try {
            return (NetworkAccessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.NetworkAccessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
