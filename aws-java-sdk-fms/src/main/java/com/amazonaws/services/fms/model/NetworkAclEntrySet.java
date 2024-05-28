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
 * The configuration of the first and last rules for the network ACL policy, and the remediation settings for each.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkAclEntrySet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkAclEntrySet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rules that you want to run first in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     */
    private java.util.List<NetworkAclEntry> firstEntries;
    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     */
    private Boolean forceRemediateForFirstEntries;
    /**
     * <p>
     * The rules that you want to run last in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     */
    private java.util.List<NetworkAclEntry> lastEntries;
    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     */
    private Boolean forceRemediateForLastEntries;

    /**
     * <p>
     * The rules that you want to run first in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     * 
     * @return The rules that you want to run first in the Firewall Manager managed network ACLs. </p> <note>
     *         <p>
     *         Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule
     *         numbers for you, in the network ACLs that it creates.
     *         </p>
     *         </note>
     *         <p>
     *         You must specify at least one first entry or one last entry in any network ACL policy.
     */

    public java.util.List<NetworkAclEntry> getFirstEntries() {
        return firstEntries;
    }

    /**
     * <p>
     * The rules that you want to run first in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     * 
     * @param firstEntries
     *        The rules that you want to run first in the Firewall Manager managed network ACLs. </p> <note>
     *        <p>
     *        Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule
     *        numbers for you, in the network ACLs that it creates.
     *        </p>
     *        </note>
     *        <p>
     *        You must specify at least one first entry or one last entry in any network ACL policy.
     */

    public void setFirstEntries(java.util.Collection<NetworkAclEntry> firstEntries) {
        if (firstEntries == null) {
            this.firstEntries = null;
            return;
        }

        this.firstEntries = new java.util.ArrayList<NetworkAclEntry>(firstEntries);
    }

    /**
     * <p>
     * The rules that you want to run first in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFirstEntries(java.util.Collection)} or {@link #withFirstEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param firstEntries
     *        The rules that you want to run first in the Firewall Manager managed network ACLs. </p> <note>
     *        <p>
     *        Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule
     *        numbers for you, in the network ACLs that it creates.
     *        </p>
     *        </note>
     *        <p>
     *        You must specify at least one first entry or one last entry in any network ACL policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntrySet withFirstEntries(NetworkAclEntry... firstEntries) {
        if (this.firstEntries == null) {
            setFirstEntries(new java.util.ArrayList<NetworkAclEntry>(firstEntries.length));
        }
        for (NetworkAclEntry ele : firstEntries) {
            this.firstEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules that you want to run first in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     * 
     * @param firstEntries
     *        The rules that you want to run first in the Firewall Manager managed network ACLs. </p> <note>
     *        <p>
     *        Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule
     *        numbers for you, in the network ACLs that it creates.
     *        </p>
     *        </note>
     *        <p>
     *        You must specify at least one first entry or one last entry in any network ACL policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntrySet withFirstEntries(java.util.Collection<NetworkAclEntry> firstEntries) {
        setFirstEntries(firstEntries);
        return this;
    }

    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @param forceRemediateForFirstEntries
     *        Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting
     *        when it finds policy violations that involve conflicts between the custom entries and the policy entries.
     *        </p>
     *        <p>
     *        If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try
     *        to remediate. For more information about the remediation behavior, see <a href=
     *        "https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     *        >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     */

    public void setForceRemediateForFirstEntries(Boolean forceRemediateForFirstEntries) {
        this.forceRemediateForFirstEntries = forceRemediateForFirstEntries;
    }

    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @return Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting
     *         when it finds policy violations that involve conflicts between the custom entries and the policy entries.
     *         </p>
     *         <p>
     *         If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not
     *         try to remediate. For more information about the remediation behavior, see <a href=
     *         "https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     *         >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     */

    public Boolean getForceRemediateForFirstEntries() {
        return this.forceRemediateForFirstEntries;
    }

    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @param forceRemediateForFirstEntries
     *        Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting
     *        when it finds policy violations that involve conflicts between the custom entries and the policy entries.
     *        </p>
     *        <p>
     *        If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try
     *        to remediate. For more information about the remediation behavior, see <a href=
     *        "https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     *        >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntrySet withForceRemediateForFirstEntries(Boolean forceRemediateForFirstEntries) {
        setForceRemediateForFirstEntries(forceRemediateForFirstEntries);
        return this;
    }

    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @return Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting
     *         when it finds policy violations that involve conflicts between the custom entries and the policy entries.
     *         </p>
     *         <p>
     *         If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not
     *         try to remediate. For more information about the remediation behavior, see <a href=
     *         "https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     *         >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     */

    public Boolean isForceRemediateForFirstEntries() {
        return this.forceRemediateForFirstEntries;
    }

    /**
     * <p>
     * The rules that you want to run last in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     * 
     * @return The rules that you want to run last in the Firewall Manager managed network ACLs. </p> <note>
     *         <p>
     *         Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule
     *         numbers for you, in the network ACLs that it creates.
     *         </p>
     *         </note>
     *         <p>
     *         You must specify at least one first entry or one last entry in any network ACL policy.
     */

    public java.util.List<NetworkAclEntry> getLastEntries() {
        return lastEntries;
    }

    /**
     * <p>
     * The rules that you want to run last in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     * 
     * @param lastEntries
     *        The rules that you want to run last in the Firewall Manager managed network ACLs. </p> <note>
     *        <p>
     *        Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule
     *        numbers for you, in the network ACLs that it creates.
     *        </p>
     *        </note>
     *        <p>
     *        You must specify at least one first entry or one last entry in any network ACL policy.
     */

    public void setLastEntries(java.util.Collection<NetworkAclEntry> lastEntries) {
        if (lastEntries == null) {
            this.lastEntries = null;
            return;
        }

        this.lastEntries = new java.util.ArrayList<NetworkAclEntry>(lastEntries);
    }

    /**
     * <p>
     * The rules that you want to run last in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLastEntries(java.util.Collection)} or {@link #withLastEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lastEntries
     *        The rules that you want to run last in the Firewall Manager managed network ACLs. </p> <note>
     *        <p>
     *        Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule
     *        numbers for you, in the network ACLs that it creates.
     *        </p>
     *        </note>
     *        <p>
     *        You must specify at least one first entry or one last entry in any network ACL policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntrySet withLastEntries(NetworkAclEntry... lastEntries) {
        if (this.lastEntries == null) {
            setLastEntries(new java.util.ArrayList<NetworkAclEntry>(lastEntries.length));
        }
        for (NetworkAclEntry ele : lastEntries) {
            this.lastEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules that you want to run last in the Firewall Manager managed network ACLs.
     * </p>
     * <note>
     * <p>
     * Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule numbers
     * for you, in the network ACLs that it creates.
     * </p>
     * </note>
     * <p>
     * You must specify at least one first entry or one last entry in any network ACL policy.
     * </p>
     * 
     * @param lastEntries
     *        The rules that you want to run last in the Firewall Manager managed network ACLs. </p> <note>
     *        <p>
     *        Provide these in the order in which you want them to run. Firewall Manager will assign the specific rule
     *        numbers for you, in the network ACLs that it creates.
     *        </p>
     *        </note>
     *        <p>
     *        You must specify at least one first entry or one last entry in any network ACL policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntrySet withLastEntries(java.util.Collection<NetworkAclEntry> lastEntries) {
        setLastEntries(lastEntries);
        return this;
    }

    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @param forceRemediateForLastEntries
     *        Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting
     *        when it finds policy violations that involve conflicts between the custom entries and the policy entries.
     *        </p>
     *        <p>
     *        If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try
     *        to remediate. For more information about the remediation behavior, see <a href=
     *        "https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     *        >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     */

    public void setForceRemediateForLastEntries(Boolean forceRemediateForLastEntries) {
        this.forceRemediateForLastEntries = forceRemediateForLastEntries;
    }

    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @return Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting
     *         when it finds policy violations that involve conflicts between the custom entries and the policy entries.
     *         </p>
     *         <p>
     *         If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not
     *         try to remediate. For more information about the remediation behavior, see <a href=
     *         "https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     *         >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     */

    public Boolean getForceRemediateForLastEntries() {
        return this.forceRemediateForLastEntries;
    }

    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @param forceRemediateForLastEntries
     *        Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting
     *        when it finds policy violations that involve conflicts between the custom entries and the policy entries.
     *        </p>
     *        <p>
     *        If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try
     *        to remediate. For more information about the remediation behavior, see <a href=
     *        "https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     *        >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntrySet withForceRemediateForLastEntries(Boolean forceRemediateForLastEntries) {
        setForceRemediateForLastEntries(forceRemediateForLastEntries);
        return this;
    }

    /**
     * <p>
     * Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting when it
     * finds policy violations that involve conflicts between the custom entries and the policy entries.
     * </p>
     * <p>
     * If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not try to
     * remediate. For more information about the remediation behavior, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     * >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @return Applies only when remediation is enabled for the policy as a whole. Firewall Manager uses this setting
     *         when it finds policy violations that involve conflicts between the custom entries and the policy entries.
     *         </p>
     *         <p>
     *         If forced remediation is disabled, Firewall Manager marks the network ACL as noncompliant and does not
     *         try to remediate. For more information about the remediation behavior, see <a href=
     *         "https://docs.aws.amazon.com/waf/latest/developerguide/network-acl-policies.html#network-acls-remediation"
     *         >Remediation for managed network ACLs</a> in the <i>Firewall Manager Developer Guide</i>.
     */

    public Boolean isForceRemediateForLastEntries() {
        return this.forceRemediateForLastEntries;
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
        if (getFirstEntries() != null)
            sb.append("FirstEntries: ").append(getFirstEntries()).append(",");
        if (getForceRemediateForFirstEntries() != null)
            sb.append("ForceRemediateForFirstEntries: ").append(getForceRemediateForFirstEntries()).append(",");
        if (getLastEntries() != null)
            sb.append("LastEntries: ").append(getLastEntries()).append(",");
        if (getForceRemediateForLastEntries() != null)
            sb.append("ForceRemediateForLastEntries: ").append(getForceRemediateForLastEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAclEntrySet == false)
            return false;
        NetworkAclEntrySet other = (NetworkAclEntrySet) obj;
        if (other.getFirstEntries() == null ^ this.getFirstEntries() == null)
            return false;
        if (other.getFirstEntries() != null && other.getFirstEntries().equals(this.getFirstEntries()) == false)
            return false;
        if (other.getForceRemediateForFirstEntries() == null ^ this.getForceRemediateForFirstEntries() == null)
            return false;
        if (other.getForceRemediateForFirstEntries() != null
                && other.getForceRemediateForFirstEntries().equals(this.getForceRemediateForFirstEntries()) == false)
            return false;
        if (other.getLastEntries() == null ^ this.getLastEntries() == null)
            return false;
        if (other.getLastEntries() != null && other.getLastEntries().equals(this.getLastEntries()) == false)
            return false;
        if (other.getForceRemediateForLastEntries() == null ^ this.getForceRemediateForLastEntries() == null)
            return false;
        if (other.getForceRemediateForLastEntries() != null && other.getForceRemediateForLastEntries().equals(this.getForceRemediateForLastEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstEntries() == null) ? 0 : getFirstEntries().hashCode());
        hashCode = prime * hashCode + ((getForceRemediateForFirstEntries() == null) ? 0 : getForceRemediateForFirstEntries().hashCode());
        hashCode = prime * hashCode + ((getLastEntries() == null) ? 0 : getLastEntries().hashCode());
        hashCode = prime * hashCode + ((getForceRemediateForLastEntries() == null) ? 0 : getForceRemediateForLastEntries().hashCode());
        return hashCode;
    }

    @Override
    public NetworkAclEntrySet clone() {
        try {
            return (NetworkAclEntrySet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkAclEntrySetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
