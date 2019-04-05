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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon RDS instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RdsDbInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsDbInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance's ARN.
     * </p>
     */
    private String rdsDbInstanceArn;
    /**
     * <p>
     * The DB instance identifier.
     * </p>
     */
    private String dbInstanceIdentifier;
    /**
     * <p>
     * The master user name.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * AWS OpsWorks Stacks returns <code>*****FILTERED*****</code> instead of the actual value.
     * </p>
     */
    private String dbPassword;
    /**
     * <p>
     * The instance's AWS region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The instance's address.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The instance's database engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The ID of the stack with which the instance is registered.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * Set to <code>true</code> if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks
     * Stacks attempts to discover the instance only once. If this value is set to <code>true</code>, you must
     * deregister the instance, and then register it again.
     * </p>
     */
    private Boolean missingOnRds;

    /**
     * <p>
     * The instance's ARN.
     * </p>
     * 
     * @param rdsDbInstanceArn
     *        The instance's ARN.
     */

    public void setRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
    }

    /**
     * <p>
     * The instance's ARN.
     * </p>
     * 
     * @return The instance's ARN.
     */

    public String getRdsDbInstanceArn() {
        return this.rdsDbInstanceArn;
    }

    /**
     * <p>
     * The instance's ARN.
     * </p>
     * 
     * @param rdsDbInstanceArn
     *        The instance's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstance withRdsDbInstanceArn(String rdsDbInstanceArn) {
        setRdsDbInstanceArn(rdsDbInstanceArn);
        return this;
    }

    /**
     * <p>
     * The DB instance identifier.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        The DB instance identifier.
     */

    public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier.
     * </p>
     * 
     * @return The DB instance identifier.
     */

    public String getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        The DB instance identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstance withDbInstanceIdentifier(String dbInstanceIdentifier) {
        setDbInstanceIdentifier(dbInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The master user name.
     * </p>
     * 
     * @param dbUser
     *        The master user name.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The master user name.
     * </p>
     * 
     * @return The master user name.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * The master user name.
     * </p>
     * 
     * @param dbUser
     *        The master user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstance withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * AWS OpsWorks Stacks returns <code>*****FILTERED*****</code> instead of the actual value.
     * </p>
     * 
     * @param dbPassword
     *        AWS OpsWorks Stacks returns <code>*****FILTERED*****</code> instead of the actual value.
     */

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    /**
     * <p>
     * AWS OpsWorks Stacks returns <code>*****FILTERED*****</code> instead of the actual value.
     * </p>
     * 
     * @return AWS OpsWorks Stacks returns <code>*****FILTERED*****</code> instead of the actual value.
     */

    public String getDbPassword() {
        return this.dbPassword;
    }

    /**
     * <p>
     * AWS OpsWorks Stacks returns <code>*****FILTERED*****</code> instead of the actual value.
     * </p>
     * 
     * @param dbPassword
     *        AWS OpsWorks Stacks returns <code>*****FILTERED*****</code> instead of the actual value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstance withDbPassword(String dbPassword) {
        setDbPassword(dbPassword);
        return this;
    }

    /**
     * <p>
     * The instance's AWS region.
     * </p>
     * 
     * @param region
     *        The instance's AWS region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The instance's AWS region.
     * </p>
     * 
     * @return The instance's AWS region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The instance's AWS region.
     * </p>
     * 
     * @param region
     *        The instance's AWS region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstance withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The instance's address.
     * </p>
     * 
     * @param address
     *        The instance's address.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The instance's address.
     * </p>
     * 
     * @return The instance's address.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The instance's address.
     * </p>
     * 
     * @param address
     *        The instance's address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstance withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The instance's database engine.
     * </p>
     * 
     * @param engine
     *        The instance's database engine.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The instance's database engine.
     * </p>
     * 
     * @return The instance's database engine.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The instance's database engine.
     * </p>
     * 
     * @param engine
     *        The instance's database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstance withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The ID of the stack with which the instance is registered.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack with which the instance is registered.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack with which the instance is registered.
     * </p>
     * 
     * @return The ID of the stack with which the instance is registered.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the stack with which the instance is registered.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack with which the instance is registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstance withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks
     * Stacks attempts to discover the instance only once. If this value is set to <code>true</code>, you must
     * deregister the instance, and then register it again.
     * </p>
     * 
     * @param missingOnRds
     *        Set to <code>true</code> if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS
     *        OpsWorks Stacks attempts to discover the instance only once. If this value is set to <code>true</code>,
     *        you must deregister the instance, and then register it again.
     */

    public void setMissingOnRds(Boolean missingOnRds) {
        this.missingOnRds = missingOnRds;
    }

    /**
     * <p>
     * Set to <code>true</code> if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks
     * Stacks attempts to discover the instance only once. If this value is set to <code>true</code>, you must
     * deregister the instance, and then register it again.
     * </p>
     * 
     * @return Set to <code>true</code> if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS
     *         OpsWorks Stacks attempts to discover the instance only once. If this value is set to <code>true</code>,
     *         you must deregister the instance, and then register it again.
     */

    public Boolean getMissingOnRds() {
        return this.missingOnRds;
    }

    /**
     * <p>
     * Set to <code>true</code> if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks
     * Stacks attempts to discover the instance only once. If this value is set to <code>true</code>, you must
     * deregister the instance, and then register it again.
     * </p>
     * 
     * @param missingOnRds
     *        Set to <code>true</code> if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS
     *        OpsWorks Stacks attempts to discover the instance only once. If this value is set to <code>true</code>,
     *        you must deregister the instance, and then register it again.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstance withMissingOnRds(Boolean missingOnRds) {
        setMissingOnRds(missingOnRds);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks
     * Stacks attempts to discover the instance only once. If this value is set to <code>true</code>, you must
     * deregister the instance, and then register it again.
     * </p>
     * 
     * @return Set to <code>true</code> if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS
     *         OpsWorks Stacks attempts to discover the instance only once. If this value is set to <code>true</code>,
     *         you must deregister the instance, and then register it again.
     */

    public Boolean isMissingOnRds() {
        return this.missingOnRds;
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
        if (getRdsDbInstanceArn() != null)
            sb.append("RdsDbInstanceArn: ").append(getRdsDbInstanceArn()).append(",");
        if (getDbInstanceIdentifier() != null)
            sb.append("DbInstanceIdentifier: ").append(getDbInstanceIdentifier()).append(",");
        if (getDbUser() != null)
            sb.append("DbUser: ").append(getDbUser()).append(",");
        if (getDbPassword() != null)
            sb.append("DbPassword: ").append(getDbPassword()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getMissingOnRds() != null)
            sb.append("MissingOnRds: ").append(getMissingOnRds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsDbInstance == false)
            return false;
        RdsDbInstance other = (RdsDbInstance) obj;
        if (other.getRdsDbInstanceArn() == null ^ this.getRdsDbInstanceArn() == null)
            return false;
        if (other.getRdsDbInstanceArn() != null && other.getRdsDbInstanceArn().equals(this.getRdsDbInstanceArn()) == false)
            return false;
        if (other.getDbInstanceIdentifier() == null ^ this.getDbInstanceIdentifier() == null)
            return false;
        if (other.getDbInstanceIdentifier() != null && other.getDbInstanceIdentifier().equals(this.getDbInstanceIdentifier()) == false)
            return false;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getDbPassword() == null ^ this.getDbPassword() == null)
            return false;
        if (other.getDbPassword() != null && other.getDbPassword().equals(this.getDbPassword()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getMissingOnRds() == null ^ this.getMissingOnRds() == null)
            return false;
        if (other.getMissingOnRds() != null && other.getMissingOnRds().equals(this.getMissingOnRds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRdsDbInstanceArn() == null) ? 0 : getRdsDbInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceIdentifier() == null) ? 0 : getDbInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getDbPassword() == null) ? 0 : getDbPassword().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getMissingOnRds() == null) ? 0 : getMissingOnRds().hashCode());
        return hashCode;
    }

    @Override
    public RdsDbInstance clone() {
        try {
            return (RdsDbInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.RdsDbInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
