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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RebootDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebootDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * When <code>true</code>, the reboot is conducted through a MultiAZ failover.
     * </p>
     * <p>
     * Constraint: You can't specify <code>true</code> if the instance is not configured for MultiAZ.
     * </p>
     */
    private Boolean forceFailover;

    /**
     * Default constructor for RebootDBInstanceRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public RebootDBInstanceRequest() {
    }

    /**
     * Constructs a new RebootDBInstanceRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBInstance.
     *        </p>
     *        </li>
     */
    public RebootDBInstanceRequest(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBInstance.
     *        </p>
     *        </li>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBInstance.
     *         </p>
     *         </li>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBInstance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the reboot is conducted through a MultiAZ failover.
     * </p>
     * <p>
     * Constraint: You can't specify <code>true</code> if the instance is not configured for MultiAZ.
     * </p>
     * 
     * @param forceFailover
     *        When <code>true</code>, the reboot is conducted through a MultiAZ failover. </p>
     *        <p>
     *        Constraint: You can't specify <code>true</code> if the instance is not configured for MultiAZ.
     */

    public void setForceFailover(Boolean forceFailover) {
        this.forceFailover = forceFailover;
    }

    /**
     * <p>
     * When <code>true</code>, the reboot is conducted through a MultiAZ failover.
     * </p>
     * <p>
     * Constraint: You can't specify <code>true</code> if the instance is not configured for MultiAZ.
     * </p>
     * 
     * @return When <code>true</code>, the reboot is conducted through a MultiAZ failover. </p>
     *         <p>
     *         Constraint: You can't specify <code>true</code> if the instance is not configured for MultiAZ.
     */

    public Boolean getForceFailover() {
        return this.forceFailover;
    }

    /**
     * <p>
     * When <code>true</code>, the reboot is conducted through a MultiAZ failover.
     * </p>
     * <p>
     * Constraint: You can't specify <code>true</code> if the instance is not configured for MultiAZ.
     * </p>
     * 
     * @param forceFailover
     *        When <code>true</code>, the reboot is conducted through a MultiAZ failover. </p>
     *        <p>
     *        Constraint: You can't specify <code>true</code> if the instance is not configured for MultiAZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootDBInstanceRequest withForceFailover(Boolean forceFailover) {
        setForceFailover(forceFailover);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the reboot is conducted through a MultiAZ failover.
     * </p>
     * <p>
     * Constraint: You can't specify <code>true</code> if the instance is not configured for MultiAZ.
     * </p>
     * 
     * @return When <code>true</code>, the reboot is conducted through a MultiAZ failover. </p>
     *         <p>
     *         Constraint: You can't specify <code>true</code> if the instance is not configured for MultiAZ.
     */

    public Boolean isForceFailover() {
        return this.forceFailover;
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getForceFailover() != null)
            sb.append("ForceFailover: ").append(getForceFailover());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootDBInstanceRequest == false)
            return false;
        RebootDBInstanceRequest other = (RebootDBInstanceRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getForceFailover() == null ^ this.getForceFailover() == null)
            return false;
        if (other.getForceFailover() != null && other.getForceFailover().equals(this.getForceFailover()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getForceFailover() == null) ? 0 : getForceFailover().hashCode());
        return hashCode;
    }

    @Override
    public RebootDBInstanceRequest clone() {
        return (RebootDBInstanceRequest) super.clone();
    }

}
