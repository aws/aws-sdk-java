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
 * Describes a single rule in a network ACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/EntryDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntryDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes a rule in a network ACL.
     * </p>
     * <p>
     * Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When
     * determining whether a packet should be allowed in or out of a subnet associated with the network ACL, Amazon Web
     * Services processes the entries in the network ACL according to the rule numbers, in ascending order.
     * </p>
     * <p>
     * When you manage an individual network ACL, you explicitly specify the rule numbers. When you specify the network
     * ACL rules in a Firewall Manager policy, you provide the rules to run first, in the order that you want them to
     * run, and the rules to run last, in the order that you want them to run. Firewall Manager assigns the rule numbers
     * for you when you save the network ACL policy specification.
     * </p>
     */
    private NetworkAclEntry entryDetail;
    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending order by rule number. In a Firewall Manager
     * network ACL policy, Firewall Manager assigns rule numbers.
     * </p>
     */
    private Integer entryRuleNumber;
    /**
     * <p>
     * Specifies whether the entry is managed by Firewall Manager or by a user, and, for Firewall Manager-managed
     * entries, specifies whether the entry is among those that run first in the network ACL or those that run last.
     * </p>
     */
    private String entryType;

    /**
     * <p>
     * Describes a rule in a network ACL.
     * </p>
     * <p>
     * Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When
     * determining whether a packet should be allowed in or out of a subnet associated with the network ACL, Amazon Web
     * Services processes the entries in the network ACL according to the rule numbers, in ascending order.
     * </p>
     * <p>
     * When you manage an individual network ACL, you explicitly specify the rule numbers. When you specify the network
     * ACL rules in a Firewall Manager policy, you provide the rules to run first, in the order that you want them to
     * run, and the rules to run last, in the order that you want them to run. Firewall Manager assigns the rule numbers
     * for you when you save the network ACL policy specification.
     * </p>
     * 
     * @param entryDetail
     *        Describes a rule in a network ACL.</p>
     *        <p>
     *        Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When
     *        determining whether a packet should be allowed in or out of a subnet associated with the network ACL,
     *        Amazon Web Services processes the entries in the network ACL according to the rule numbers, in ascending
     *        order.
     *        </p>
     *        <p>
     *        When you manage an individual network ACL, you explicitly specify the rule numbers. When you specify the
     *        network ACL rules in a Firewall Manager policy, you provide the rules to run first, in the order that you
     *        want them to run, and the rules to run last, in the order that you want them to run. Firewall Manager
     *        assigns the rule numbers for you when you save the network ACL policy specification.
     */

    public void setEntryDetail(NetworkAclEntry entryDetail) {
        this.entryDetail = entryDetail;
    }

    /**
     * <p>
     * Describes a rule in a network ACL.
     * </p>
     * <p>
     * Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When
     * determining whether a packet should be allowed in or out of a subnet associated with the network ACL, Amazon Web
     * Services processes the entries in the network ACL according to the rule numbers, in ascending order.
     * </p>
     * <p>
     * When you manage an individual network ACL, you explicitly specify the rule numbers. When you specify the network
     * ACL rules in a Firewall Manager policy, you provide the rules to run first, in the order that you want them to
     * run, and the rules to run last, in the order that you want them to run. Firewall Manager assigns the rule numbers
     * for you when you save the network ACL policy specification.
     * </p>
     * 
     * @return Describes a rule in a network ACL.</p>
     *         <p>
     *         Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When
     *         determining whether a packet should be allowed in or out of a subnet associated with the network ACL,
     *         Amazon Web Services processes the entries in the network ACL according to the rule numbers, in ascending
     *         order.
     *         </p>
     *         <p>
     *         When you manage an individual network ACL, you explicitly specify the rule numbers. When you specify the
     *         network ACL rules in a Firewall Manager policy, you provide the rules to run first, in the order that you
     *         want them to run, and the rules to run last, in the order that you want them to run. Firewall Manager
     *         assigns the rule numbers for you when you save the network ACL policy specification.
     */

    public NetworkAclEntry getEntryDetail() {
        return this.entryDetail;
    }

    /**
     * <p>
     * Describes a rule in a network ACL.
     * </p>
     * <p>
     * Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When
     * determining whether a packet should be allowed in or out of a subnet associated with the network ACL, Amazon Web
     * Services processes the entries in the network ACL according to the rule numbers, in ascending order.
     * </p>
     * <p>
     * When you manage an individual network ACL, you explicitly specify the rule numbers. When you specify the network
     * ACL rules in a Firewall Manager policy, you provide the rules to run first, in the order that you want them to
     * run, and the rules to run last, in the order that you want them to run. Firewall Manager assigns the rule numbers
     * for you when you save the network ACL policy specification.
     * </p>
     * 
     * @param entryDetail
     *        Describes a rule in a network ACL.</p>
     *        <p>
     *        Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When
     *        determining whether a packet should be allowed in or out of a subnet associated with the network ACL,
     *        Amazon Web Services processes the entries in the network ACL according to the rule numbers, in ascending
     *        order.
     *        </p>
     *        <p>
     *        When you manage an individual network ACL, you explicitly specify the rule numbers. When you specify the
     *        network ACL rules in a Firewall Manager policy, you provide the rules to run first, in the order that you
     *        want them to run, and the rules to run last, in the order that you want them to run. Firewall Manager
     *        assigns the rule numbers for you when you save the network ACL policy specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntryDescription withEntryDetail(NetworkAclEntry entryDetail) {
        setEntryDetail(entryDetail);
        return this;
    }

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending order by rule number. In a Firewall Manager
     * network ACL policy, Firewall Manager assigns rule numbers.
     * </p>
     * 
     * @param entryRuleNumber
     *        The rule number for the entry. ACL entries are processed in ascending order by rule number. In a Firewall
     *        Manager network ACL policy, Firewall Manager assigns rule numbers.
     */

    public void setEntryRuleNumber(Integer entryRuleNumber) {
        this.entryRuleNumber = entryRuleNumber;
    }

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending order by rule number. In a Firewall Manager
     * network ACL policy, Firewall Manager assigns rule numbers.
     * </p>
     * 
     * @return The rule number for the entry. ACL entries are processed in ascending order by rule number. In a Firewall
     *         Manager network ACL policy, Firewall Manager assigns rule numbers.
     */

    public Integer getEntryRuleNumber() {
        return this.entryRuleNumber;
    }

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending order by rule number. In a Firewall Manager
     * network ACL policy, Firewall Manager assigns rule numbers.
     * </p>
     * 
     * @param entryRuleNumber
     *        The rule number for the entry. ACL entries are processed in ascending order by rule number. In a Firewall
     *        Manager network ACL policy, Firewall Manager assigns rule numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntryDescription withEntryRuleNumber(Integer entryRuleNumber) {
        setEntryRuleNumber(entryRuleNumber);
        return this;
    }

    /**
     * <p>
     * Specifies whether the entry is managed by Firewall Manager or by a user, and, for Firewall Manager-managed
     * entries, specifies whether the entry is among those that run first in the network ACL or those that run last.
     * </p>
     * 
     * @param entryType
     *        Specifies whether the entry is managed by Firewall Manager or by a user, and, for Firewall Manager-managed
     *        entries, specifies whether the entry is among those that run first in the network ACL or those that run
     *        last.
     * @see EntryType
     */

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    /**
     * <p>
     * Specifies whether the entry is managed by Firewall Manager or by a user, and, for Firewall Manager-managed
     * entries, specifies whether the entry is among those that run first in the network ACL or those that run last.
     * </p>
     * 
     * @return Specifies whether the entry is managed by Firewall Manager or by a user, and, for Firewall
     *         Manager-managed entries, specifies whether the entry is among those that run first in the network ACL or
     *         those that run last.
     * @see EntryType
     */

    public String getEntryType() {
        return this.entryType;
    }

    /**
     * <p>
     * Specifies whether the entry is managed by Firewall Manager or by a user, and, for Firewall Manager-managed
     * entries, specifies whether the entry is among those that run first in the network ACL or those that run last.
     * </p>
     * 
     * @param entryType
     *        Specifies whether the entry is managed by Firewall Manager or by a user, and, for Firewall Manager-managed
     *        entries, specifies whether the entry is among those that run first in the network ACL or those that run
     *        last.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntryType
     */

    public EntryDescription withEntryType(String entryType) {
        setEntryType(entryType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the entry is managed by Firewall Manager or by a user, and, for Firewall Manager-managed
     * entries, specifies whether the entry is among those that run first in the network ACL or those that run last.
     * </p>
     * 
     * @param entryType
     *        Specifies whether the entry is managed by Firewall Manager or by a user, and, for Firewall Manager-managed
     *        entries, specifies whether the entry is among those that run first in the network ACL or those that run
     *        last.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntryType
     */

    public EntryDescription withEntryType(EntryType entryType) {
        this.entryType = entryType.toString();
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
        if (getEntryDetail() != null)
            sb.append("EntryDetail: ").append(getEntryDetail()).append(",");
        if (getEntryRuleNumber() != null)
            sb.append("EntryRuleNumber: ").append(getEntryRuleNumber()).append(",");
        if (getEntryType() != null)
            sb.append("EntryType: ").append(getEntryType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntryDescription == false)
            return false;
        EntryDescription other = (EntryDescription) obj;
        if (other.getEntryDetail() == null ^ this.getEntryDetail() == null)
            return false;
        if (other.getEntryDetail() != null && other.getEntryDetail().equals(this.getEntryDetail()) == false)
            return false;
        if (other.getEntryRuleNumber() == null ^ this.getEntryRuleNumber() == null)
            return false;
        if (other.getEntryRuleNumber() != null && other.getEntryRuleNumber().equals(this.getEntryRuleNumber()) == false)
            return false;
        if (other.getEntryType() == null ^ this.getEntryType() == null)
            return false;
        if (other.getEntryType() != null && other.getEntryType().equals(this.getEntryType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryDetail() == null) ? 0 : getEntryDetail().hashCode());
        hashCode = prime * hashCode + ((getEntryRuleNumber() == null) ? 0 : getEntryRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getEntryType() == null) ? 0 : getEntryType().hashCode());
        return hashCode;
    }

    @Override
    public EntryDescription clone() {
        try {
            return (EntryDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.EntryDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
