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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The options that are available for a DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/OrderableDBInstanceOption" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderableDBInstanceOption implements Serializable, Cloneable {

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     */
    private java.util.List<AvailabilityZone> availabilityZones;
    /**
     * <p>
     * Indicates whether a DB instance is in a virtual private cloud (VPC).
     * </p>
     */
    private Boolean vpc;

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     * 
     * @param engine
     *        The engine type of a DB instance.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     * 
     * @return The engine type of a DB instance.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     * 
     * @param engine
     *        The engine type of a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of a DB instance.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     * 
     * @return The engine version of a DB instance.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class for a DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     * 
     * @return The DB instance class for a DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     * 
     * @param licenseModel
     *        The license model for a DB instance.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     * 
     * @return The license model for a DB instance.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     * 
     * @param licenseModel
     *        The license model for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * 
     * @return A list of Availability Zones for a DB instance.
     */

    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones for a DB instance.
     */

    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<AvailabilityZone>(availabilityZones.length));
        }
        for (AvailabilityZone ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a virtual private cloud (VPC).
     * </p>
     * 
     * @param vpc
     *        Indicates whether a DB instance is in a virtual private cloud (VPC).
     */

    public void setVpc(Boolean vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a virtual private cloud (VPC).
     * </p>
     * 
     * @return Indicates whether a DB instance is in a virtual private cloud (VPC).
     */

    public Boolean getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a virtual private cloud (VPC).
     * </p>
     * 
     * @param vpc
     *        Indicates whether a DB instance is in a virtual private cloud (VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withVpc(Boolean vpc) {
        setVpc(vpc);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a virtual private cloud (VPC).
     * </p>
     * 
     * @return Indicates whether a DB instance is in a virtual private cloud (VPC).
     */

    public Boolean isVpc() {
        return this.vpc;
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderableDBInstanceOption == false)
            return false;
        OrderableDBInstanceOption other = (OrderableDBInstanceOption) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        return hashCode;
    }

    @Override
    public OrderableDBInstanceOption clone() {
        try {
            return (OrderableDBInstanceOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
