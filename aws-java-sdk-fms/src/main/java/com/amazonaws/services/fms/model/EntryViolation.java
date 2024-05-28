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
 * Detailed information about an entry violation in a network ACL. The violation is against the network ACL
 * specification inside the Firewall Manager network ACL policy. This data object is part of
 * <code>InvalidNetworkAclEntriesViolation</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/EntryViolation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntryViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Firewall Manager-managed network ACL entry that is involved in the entry violation.
     * </p>
     */
    private EntryDescription expectedEntry;
    /**
     * <p>
     * The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> should be,
     * according to the network ACL policy specifications.
     * </p>
     */
    private String expectedEvaluationOrder;
    /**
     * <p>
     * The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> is currently
     * located.
     * </p>
     */
    private String actualEvaluationOrder;
    /**
     * <p>
     * The entry that's currently in the <code>ExpectedEvaluationOrder</code> location, in place of the expected entry.
     * </p>
     */
    private EntryDescription entryAtExpectedEvaluationOrder;
    /**
     * <p>
     * The list of entries that are in conflict with <code>ExpectedEntry</code>.
     * </p>
     */
    private java.util.List<EntryDescription> entriesWithConflicts;
    /**
     * <p>
     * Descriptions of the violations that Firewall Manager found for these entries.
     * </p>
     */
    private java.util.List<String> entryViolationReasons;

    /**
     * <p>
     * The Firewall Manager-managed network ACL entry that is involved in the entry violation.
     * </p>
     * 
     * @param expectedEntry
     *        The Firewall Manager-managed network ACL entry that is involved in the entry violation.
     */

    public void setExpectedEntry(EntryDescription expectedEntry) {
        this.expectedEntry = expectedEntry;
    }

    /**
     * <p>
     * The Firewall Manager-managed network ACL entry that is involved in the entry violation.
     * </p>
     * 
     * @return The Firewall Manager-managed network ACL entry that is involved in the entry violation.
     */

    public EntryDescription getExpectedEntry() {
        return this.expectedEntry;
    }

    /**
     * <p>
     * The Firewall Manager-managed network ACL entry that is involved in the entry violation.
     * </p>
     * 
     * @param expectedEntry
     *        The Firewall Manager-managed network ACL entry that is involved in the entry violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntryViolation withExpectedEntry(EntryDescription expectedEntry) {
        setExpectedEntry(expectedEntry);
        return this;
    }

    /**
     * <p>
     * The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> should be,
     * according to the network ACL policy specifications.
     * </p>
     * 
     * @param expectedEvaluationOrder
     *        The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> should be,
     *        according to the network ACL policy specifications.
     */

    public void setExpectedEvaluationOrder(String expectedEvaluationOrder) {
        this.expectedEvaluationOrder = expectedEvaluationOrder;
    }

    /**
     * <p>
     * The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> should be,
     * according to the network ACL policy specifications.
     * </p>
     * 
     * @return The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> should
     *         be, according to the network ACL policy specifications.
     */

    public String getExpectedEvaluationOrder() {
        return this.expectedEvaluationOrder;
    }

    /**
     * <p>
     * The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> should be,
     * according to the network ACL policy specifications.
     * </p>
     * 
     * @param expectedEvaluationOrder
     *        The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> should be,
     *        according to the network ACL policy specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntryViolation withExpectedEvaluationOrder(String expectedEvaluationOrder) {
        setExpectedEvaluationOrder(expectedEvaluationOrder);
        return this;
    }

    /**
     * <p>
     * The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> is currently
     * located.
     * </p>
     * 
     * @param actualEvaluationOrder
     *        The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> is
     *        currently located.
     */

    public void setActualEvaluationOrder(String actualEvaluationOrder) {
        this.actualEvaluationOrder = actualEvaluationOrder;
    }

    /**
     * <p>
     * The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> is currently
     * located.
     * </p>
     * 
     * @return The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> is
     *         currently located.
     */

    public String getActualEvaluationOrder() {
        return this.actualEvaluationOrder;
    }

    /**
     * <p>
     * The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> is currently
     * located.
     * </p>
     * 
     * @param actualEvaluationOrder
     *        The evaluation location within the ordered list of entries where the <code>ExpectedEntry</code> is
     *        currently located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntryViolation withActualEvaluationOrder(String actualEvaluationOrder) {
        setActualEvaluationOrder(actualEvaluationOrder);
        return this;
    }

    /**
     * <p>
     * The entry that's currently in the <code>ExpectedEvaluationOrder</code> location, in place of the expected entry.
     * </p>
     * 
     * @param entryAtExpectedEvaluationOrder
     *        The entry that's currently in the <code>ExpectedEvaluationOrder</code> location, in place of the expected
     *        entry.
     */

    public void setEntryAtExpectedEvaluationOrder(EntryDescription entryAtExpectedEvaluationOrder) {
        this.entryAtExpectedEvaluationOrder = entryAtExpectedEvaluationOrder;
    }

    /**
     * <p>
     * The entry that's currently in the <code>ExpectedEvaluationOrder</code> location, in place of the expected entry.
     * </p>
     * 
     * @return The entry that's currently in the <code>ExpectedEvaluationOrder</code> location, in place of the expected
     *         entry.
     */

    public EntryDescription getEntryAtExpectedEvaluationOrder() {
        return this.entryAtExpectedEvaluationOrder;
    }

    /**
     * <p>
     * The entry that's currently in the <code>ExpectedEvaluationOrder</code> location, in place of the expected entry.
     * </p>
     * 
     * @param entryAtExpectedEvaluationOrder
     *        The entry that's currently in the <code>ExpectedEvaluationOrder</code> location, in place of the expected
     *        entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntryViolation withEntryAtExpectedEvaluationOrder(EntryDescription entryAtExpectedEvaluationOrder) {
        setEntryAtExpectedEvaluationOrder(entryAtExpectedEvaluationOrder);
        return this;
    }

    /**
     * <p>
     * The list of entries that are in conflict with <code>ExpectedEntry</code>.
     * </p>
     * 
     * @return The list of entries that are in conflict with <code>ExpectedEntry</code>.
     */

    public java.util.List<EntryDescription> getEntriesWithConflicts() {
        return entriesWithConflicts;
    }

    /**
     * <p>
     * The list of entries that are in conflict with <code>ExpectedEntry</code>.
     * </p>
     * 
     * @param entriesWithConflicts
     *        The list of entries that are in conflict with <code>ExpectedEntry</code>.
     */

    public void setEntriesWithConflicts(java.util.Collection<EntryDescription> entriesWithConflicts) {
        if (entriesWithConflicts == null) {
            this.entriesWithConflicts = null;
            return;
        }

        this.entriesWithConflicts = new java.util.ArrayList<EntryDescription>(entriesWithConflicts);
    }

    /**
     * <p>
     * The list of entries that are in conflict with <code>ExpectedEntry</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntriesWithConflicts(java.util.Collection)} or {@link #withEntriesWithConflicts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param entriesWithConflicts
     *        The list of entries that are in conflict with <code>ExpectedEntry</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntryViolation withEntriesWithConflicts(EntryDescription... entriesWithConflicts) {
        if (this.entriesWithConflicts == null) {
            setEntriesWithConflicts(new java.util.ArrayList<EntryDescription>(entriesWithConflicts.length));
        }
        for (EntryDescription ele : entriesWithConflicts) {
            this.entriesWithConflicts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of entries that are in conflict with <code>ExpectedEntry</code>.
     * </p>
     * 
     * @param entriesWithConflicts
     *        The list of entries that are in conflict with <code>ExpectedEntry</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntryViolation withEntriesWithConflicts(java.util.Collection<EntryDescription> entriesWithConflicts) {
        setEntriesWithConflicts(entriesWithConflicts);
        return this;
    }

    /**
     * <p>
     * Descriptions of the violations that Firewall Manager found for these entries.
     * </p>
     * 
     * @return Descriptions of the violations that Firewall Manager found for these entries.
     * @see EntryViolationReason
     */

    public java.util.List<String> getEntryViolationReasons() {
        return entryViolationReasons;
    }

    /**
     * <p>
     * Descriptions of the violations that Firewall Manager found for these entries.
     * </p>
     * 
     * @param entryViolationReasons
     *        Descriptions of the violations that Firewall Manager found for these entries.
     * @see EntryViolationReason
     */

    public void setEntryViolationReasons(java.util.Collection<String> entryViolationReasons) {
        if (entryViolationReasons == null) {
            this.entryViolationReasons = null;
            return;
        }

        this.entryViolationReasons = new java.util.ArrayList<String>(entryViolationReasons);
    }

    /**
     * <p>
     * Descriptions of the violations that Firewall Manager found for these entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntryViolationReasons(java.util.Collection)} or
     * {@link #withEntryViolationReasons(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param entryViolationReasons
     *        Descriptions of the violations that Firewall Manager found for these entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntryViolationReason
     */

    public EntryViolation withEntryViolationReasons(String... entryViolationReasons) {
        if (this.entryViolationReasons == null) {
            setEntryViolationReasons(new java.util.ArrayList<String>(entryViolationReasons.length));
        }
        for (String ele : entryViolationReasons) {
            this.entryViolationReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Descriptions of the violations that Firewall Manager found for these entries.
     * </p>
     * 
     * @param entryViolationReasons
     *        Descriptions of the violations that Firewall Manager found for these entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntryViolationReason
     */

    public EntryViolation withEntryViolationReasons(java.util.Collection<String> entryViolationReasons) {
        setEntryViolationReasons(entryViolationReasons);
        return this;
    }

    /**
     * <p>
     * Descriptions of the violations that Firewall Manager found for these entries.
     * </p>
     * 
     * @param entryViolationReasons
     *        Descriptions of the violations that Firewall Manager found for these entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntryViolationReason
     */

    public EntryViolation withEntryViolationReasons(EntryViolationReason... entryViolationReasons) {
        java.util.ArrayList<String> entryViolationReasonsCopy = new java.util.ArrayList<String>(entryViolationReasons.length);
        for (EntryViolationReason value : entryViolationReasons) {
            entryViolationReasonsCopy.add(value.toString());
        }
        if (getEntryViolationReasons() == null) {
            setEntryViolationReasons(entryViolationReasonsCopy);
        } else {
            getEntryViolationReasons().addAll(entryViolationReasonsCopy);
        }
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
        if (getExpectedEntry() != null)
            sb.append("ExpectedEntry: ").append(getExpectedEntry()).append(",");
        if (getExpectedEvaluationOrder() != null)
            sb.append("ExpectedEvaluationOrder: ").append(getExpectedEvaluationOrder()).append(",");
        if (getActualEvaluationOrder() != null)
            sb.append("ActualEvaluationOrder: ").append(getActualEvaluationOrder()).append(",");
        if (getEntryAtExpectedEvaluationOrder() != null)
            sb.append("EntryAtExpectedEvaluationOrder: ").append(getEntryAtExpectedEvaluationOrder()).append(",");
        if (getEntriesWithConflicts() != null)
            sb.append("EntriesWithConflicts: ").append(getEntriesWithConflicts()).append(",");
        if (getEntryViolationReasons() != null)
            sb.append("EntryViolationReasons: ").append(getEntryViolationReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntryViolation == false)
            return false;
        EntryViolation other = (EntryViolation) obj;
        if (other.getExpectedEntry() == null ^ this.getExpectedEntry() == null)
            return false;
        if (other.getExpectedEntry() != null && other.getExpectedEntry().equals(this.getExpectedEntry()) == false)
            return false;
        if (other.getExpectedEvaluationOrder() == null ^ this.getExpectedEvaluationOrder() == null)
            return false;
        if (other.getExpectedEvaluationOrder() != null && other.getExpectedEvaluationOrder().equals(this.getExpectedEvaluationOrder()) == false)
            return false;
        if (other.getActualEvaluationOrder() == null ^ this.getActualEvaluationOrder() == null)
            return false;
        if (other.getActualEvaluationOrder() != null && other.getActualEvaluationOrder().equals(this.getActualEvaluationOrder()) == false)
            return false;
        if (other.getEntryAtExpectedEvaluationOrder() == null ^ this.getEntryAtExpectedEvaluationOrder() == null)
            return false;
        if (other.getEntryAtExpectedEvaluationOrder() != null
                && other.getEntryAtExpectedEvaluationOrder().equals(this.getEntryAtExpectedEvaluationOrder()) == false)
            return false;
        if (other.getEntriesWithConflicts() == null ^ this.getEntriesWithConflicts() == null)
            return false;
        if (other.getEntriesWithConflicts() != null && other.getEntriesWithConflicts().equals(this.getEntriesWithConflicts()) == false)
            return false;
        if (other.getEntryViolationReasons() == null ^ this.getEntryViolationReasons() == null)
            return false;
        if (other.getEntryViolationReasons() != null && other.getEntryViolationReasons().equals(this.getEntryViolationReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpectedEntry() == null) ? 0 : getExpectedEntry().hashCode());
        hashCode = prime * hashCode + ((getExpectedEvaluationOrder() == null) ? 0 : getExpectedEvaluationOrder().hashCode());
        hashCode = prime * hashCode + ((getActualEvaluationOrder() == null) ? 0 : getActualEvaluationOrder().hashCode());
        hashCode = prime * hashCode + ((getEntryAtExpectedEvaluationOrder() == null) ? 0 : getEntryAtExpectedEvaluationOrder().hashCode());
        hashCode = prime * hashCode + ((getEntriesWithConflicts() == null) ? 0 : getEntriesWithConflicts().hashCode());
        hashCode = prime * hashCode + ((getEntryViolationReasons() == null) ? 0 : getEntryViolationReasons().hashCode());
        return hashCode;
    }

    @Override
    public EntryViolation clone() {
        try {
            return (EntryViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.EntryViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
