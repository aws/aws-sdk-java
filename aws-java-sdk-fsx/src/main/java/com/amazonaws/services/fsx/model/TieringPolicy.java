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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the data tiering policy for an ONTAP volume. When enabled, Amazon FSx for ONTAP's intelligent tiering
 * automatically transitions a volume's data between the file system's primary storage and capacity pool storage based
 * on your access patterns.
 * </p>
 * <p>
 * Valid tiering policies are the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>SNAPSHOT_ONLY</code> - (Default value) moves cold snapshots to the capacity pool storage tier.
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your access
 * patterns.
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the storage pool
 * tier.
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to the capacity
 * pool tier.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/TieringPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TieringPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the number of days that user data in a volume must remain inactive before it is considered "cold" and
     * moved to the capacity pool. Used with the <code>AUTO</code> and <code>SNAPSHOT_ONLY</code> tiering policies.
     * Enter a whole number between 2 and 183. Default values are 31 days for <code>AUTO</code> and 2 days for
     * <code>SNAPSHOT_ONLY</code>.
     * </p>
     */
    private Integer coolingPeriod;
    /**
     * <p>
     * Specifies the tiering policy used to transition data. Default value is <code>SNAPSHOT_ONLY</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNAPSHOT_ONLY</code> - moves cold snapshots to the capacity pool storage tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your access
     * patterns.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the storage
     * pool tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to the
     * capacity pool tier.
     * </p>
     * </li>
     * </ul>
     */
    private String name;

    /**
     * <p>
     * Specifies the number of days that user data in a volume must remain inactive before it is considered "cold" and
     * moved to the capacity pool. Used with the <code>AUTO</code> and <code>SNAPSHOT_ONLY</code> tiering policies.
     * Enter a whole number between 2 and 183. Default values are 31 days for <code>AUTO</code> and 2 days for
     * <code>SNAPSHOT_ONLY</code>.
     * </p>
     * 
     * @param coolingPeriod
     *        Specifies the number of days that user data in a volume must remain inactive before it is considered
     *        "cold" and moved to the capacity pool. Used with the <code>AUTO</code> and <code>SNAPSHOT_ONLY</code>
     *        tiering policies. Enter a whole number between 2 and 183. Default values are 31 days for <code>AUTO</code>
     *        and 2 days for <code>SNAPSHOT_ONLY</code>.
     */

    public void setCoolingPeriod(Integer coolingPeriod) {
        this.coolingPeriod = coolingPeriod;
    }

    /**
     * <p>
     * Specifies the number of days that user data in a volume must remain inactive before it is considered "cold" and
     * moved to the capacity pool. Used with the <code>AUTO</code> and <code>SNAPSHOT_ONLY</code> tiering policies.
     * Enter a whole number between 2 and 183. Default values are 31 days for <code>AUTO</code> and 2 days for
     * <code>SNAPSHOT_ONLY</code>.
     * </p>
     * 
     * @return Specifies the number of days that user data in a volume must remain inactive before it is considered
     *         "cold" and moved to the capacity pool. Used with the <code>AUTO</code> and <code>SNAPSHOT_ONLY</code>
     *         tiering policies. Enter a whole number between 2 and 183. Default values are 31 days for
     *         <code>AUTO</code> and 2 days for <code>SNAPSHOT_ONLY</code>.
     */

    public Integer getCoolingPeriod() {
        return this.coolingPeriod;
    }

    /**
     * <p>
     * Specifies the number of days that user data in a volume must remain inactive before it is considered "cold" and
     * moved to the capacity pool. Used with the <code>AUTO</code> and <code>SNAPSHOT_ONLY</code> tiering policies.
     * Enter a whole number between 2 and 183. Default values are 31 days for <code>AUTO</code> and 2 days for
     * <code>SNAPSHOT_ONLY</code>.
     * </p>
     * 
     * @param coolingPeriod
     *        Specifies the number of days that user data in a volume must remain inactive before it is considered
     *        "cold" and moved to the capacity pool. Used with the <code>AUTO</code> and <code>SNAPSHOT_ONLY</code>
     *        tiering policies. Enter a whole number between 2 and 183. Default values are 31 days for <code>AUTO</code>
     *        and 2 days for <code>SNAPSHOT_ONLY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TieringPolicy withCoolingPeriod(Integer coolingPeriod) {
        setCoolingPeriod(coolingPeriod);
        return this;
    }

    /**
     * <p>
     * Specifies the tiering policy used to transition data. Default value is <code>SNAPSHOT_ONLY</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNAPSHOT_ONLY</code> - moves cold snapshots to the capacity pool storage tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your access
     * patterns.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the storage
     * pool tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to the
     * capacity pool tier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        Specifies the tiering policy used to transition data. Default value is <code>SNAPSHOT_ONLY</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SNAPSHOT_ONLY</code> - moves cold snapshots to the capacity pool storage tier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your
     *        access patterns.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the
     *        storage pool tier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to
     *        the capacity pool tier.
     *        </p>
     *        </li>
     * @see TieringPolicyName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the tiering policy used to transition data. Default value is <code>SNAPSHOT_ONLY</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNAPSHOT_ONLY</code> - moves cold snapshots to the capacity pool storage tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your access
     * patterns.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the storage
     * pool tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to the
     * capacity pool tier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the tiering policy used to transition data. Default value is <code>SNAPSHOT_ONLY</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SNAPSHOT_ONLY</code> - moves cold snapshots to the capacity pool storage tier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your
     *         access patterns.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the
     *         storage pool tier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to
     *         the capacity pool tier.
     *         </p>
     *         </li>
     * @see TieringPolicyName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the tiering policy used to transition data. Default value is <code>SNAPSHOT_ONLY</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNAPSHOT_ONLY</code> - moves cold snapshots to the capacity pool storage tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your access
     * patterns.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the storage
     * pool tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to the
     * capacity pool tier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        Specifies the tiering policy used to transition data. Default value is <code>SNAPSHOT_ONLY</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SNAPSHOT_ONLY</code> - moves cold snapshots to the capacity pool storage tier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your
     *        access patterns.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the
     *        storage pool tier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to
     *        the capacity pool tier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TieringPolicyName
     */

    public TieringPolicy withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the tiering policy used to transition data. Default value is <code>SNAPSHOT_ONLY</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SNAPSHOT_ONLY</code> - moves cold snapshots to the capacity pool storage tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your access
     * patterns.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the storage
     * pool tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to the
     * capacity pool tier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        Specifies the tiering policy used to transition data. Default value is <code>SNAPSHOT_ONLY</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SNAPSHOT_ONLY</code> - moves cold snapshots to the capacity pool storage tier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO</code> - moves cold user data and snapshots to the capacity pool storage tier based on your
     *        access patterns.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - moves all user data blocks in both the active file system and Snapshot copies to the
     *        storage pool tier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> - keeps a volume's data in the primary storage tier, preventing it from being moved to
     *        the capacity pool tier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TieringPolicyName
     */

    public TieringPolicy withName(TieringPolicyName name) {
        this.name = name.toString();
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
        if (getCoolingPeriod() != null)
            sb.append("CoolingPeriod: ").append(getCoolingPeriod()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TieringPolicy == false)
            return false;
        TieringPolicy other = (TieringPolicy) obj;
        if (other.getCoolingPeriod() == null ^ this.getCoolingPeriod() == null)
            return false;
        if (other.getCoolingPeriod() != null && other.getCoolingPeriod().equals(this.getCoolingPeriod()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoolingPeriod() == null) ? 0 : getCoolingPeriod().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public TieringPolicy clone() {
        try {
            return (TieringPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.TieringPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
