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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The RDS reserved instances configuration used for recommendations.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/RdsReservedInstancesConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsReservedInstancesConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account scope that you want your recommendations for.
     * </p>
     */
    private String accountScope;
    /**
     * <p>
     * Determines whether the recommendation is for a current generation instance.
     * </p>
     */
    private String currentGeneration;
    /**
     * <p>
     * The database edition that the recommended reservation supports.
     * </p>
     */
    private String databaseEdition;
    /**
     * <p>
     * The database engine that the recommended reservation supports.
     * </p>
     */
    private String databaseEngine;
    /**
     * <p>
     * Determines whether the recommendation is for a reservation in a single Availability Zone or a reservation with a
     * backup in a second Availability Zone.
     * </p>
     */
    private String deploymentOption;
    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     */
    private String instanceFamily;
    /**
     * <p>
     * The type of instance that Amazon Web Services recommends.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The license model that the recommended reservation supports.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     */
    private String monthlyRecurringCost;
    /**
     * <p>
     * The number of normalized units that Amazon Web Services recommends that you purchase.
     * </p>
     */
    private String normalizedUnitsToPurchase;
    /**
     * <p>
     * The number of instances that Amazon Web Services recommends that you purchase.
     * </p>
     */
    private String numberOfInstancesToPurchase;
    /**
     * <p>
     * The payment option for the commitment.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The Amazon Web Services Region of the commitment.
     * </p>
     */
    private String reservedInstancesRegion;
    /**
     * <p>
     * The service that you want your recommendations for.
     * </p>
     */
    private String service;
    /**
     * <p>
     * Determines whether the recommendation is size flexible.
     * </p>
     */
    private Boolean sizeFlexEligible;
    /**
     * <p>
     * The reserved instances recommendation term in years.
     * </p>
     */
    private String term;
    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     */
    private String upfrontCost;

    /**
     * <p>
     * The account scope that you want your recommendations for.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want your recommendations for.
     */

    public void setAccountScope(String accountScope) {
        this.accountScope = accountScope;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for.
     * </p>
     * 
     * @return The account scope that you want your recommendations for.
     */

    public String getAccountScope() {
        return this.accountScope;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want your recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withAccountScope(String accountScope) {
        setAccountScope(accountScope);
        return this;
    }

    /**
     * <p>
     * Determines whether the recommendation is for a current generation instance.
     * </p>
     * 
     * @param currentGeneration
     *        Determines whether the recommendation is for a current generation instance.
     */

    public void setCurrentGeneration(String currentGeneration) {
        this.currentGeneration = currentGeneration;
    }

    /**
     * <p>
     * Determines whether the recommendation is for a current generation instance.
     * </p>
     * 
     * @return Determines whether the recommendation is for a current generation instance.
     */

    public String getCurrentGeneration() {
        return this.currentGeneration;
    }

    /**
     * <p>
     * Determines whether the recommendation is for a current generation instance.
     * </p>
     * 
     * @param currentGeneration
     *        Determines whether the recommendation is for a current generation instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withCurrentGeneration(String currentGeneration) {
        setCurrentGeneration(currentGeneration);
        return this;
    }

    /**
     * <p>
     * The database edition that the recommended reservation supports.
     * </p>
     * 
     * @param databaseEdition
     *        The database edition that the recommended reservation supports.
     */

    public void setDatabaseEdition(String databaseEdition) {
        this.databaseEdition = databaseEdition;
    }

    /**
     * <p>
     * The database edition that the recommended reservation supports.
     * </p>
     * 
     * @return The database edition that the recommended reservation supports.
     */

    public String getDatabaseEdition() {
        return this.databaseEdition;
    }

    /**
     * <p>
     * The database edition that the recommended reservation supports.
     * </p>
     * 
     * @param databaseEdition
     *        The database edition that the recommended reservation supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withDatabaseEdition(String databaseEdition) {
        setDatabaseEdition(databaseEdition);
        return this;
    }

    /**
     * <p>
     * The database engine that the recommended reservation supports.
     * </p>
     * 
     * @param databaseEngine
     *        The database engine that the recommended reservation supports.
     */

    public void setDatabaseEngine(String databaseEngine) {
        this.databaseEngine = databaseEngine;
    }

    /**
     * <p>
     * The database engine that the recommended reservation supports.
     * </p>
     * 
     * @return The database engine that the recommended reservation supports.
     */

    public String getDatabaseEngine() {
        return this.databaseEngine;
    }

    /**
     * <p>
     * The database engine that the recommended reservation supports.
     * </p>
     * 
     * @param databaseEngine
     *        The database engine that the recommended reservation supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withDatabaseEngine(String databaseEngine) {
        setDatabaseEngine(databaseEngine);
        return this;
    }

    /**
     * <p>
     * Determines whether the recommendation is for a reservation in a single Availability Zone or a reservation with a
     * backup in a second Availability Zone.
     * </p>
     * 
     * @param deploymentOption
     *        Determines whether the recommendation is for a reservation in a single Availability Zone or a reservation
     *        with a backup in a second Availability Zone.
     */

    public void setDeploymentOption(String deploymentOption) {
        this.deploymentOption = deploymentOption;
    }

    /**
     * <p>
     * Determines whether the recommendation is for a reservation in a single Availability Zone or a reservation with a
     * backup in a second Availability Zone.
     * </p>
     * 
     * @return Determines whether the recommendation is for a reservation in a single Availability Zone or a reservation
     *         with a backup in a second Availability Zone.
     */

    public String getDeploymentOption() {
        return this.deploymentOption;
    }

    /**
     * <p>
     * Determines whether the recommendation is for a reservation in a single Availability Zone or a reservation with a
     * backup in a second Availability Zone.
     * </p>
     * 
     * @param deploymentOption
     *        Determines whether the recommendation is for a reservation in a single Availability Zone or a reservation
     *        with a backup in a second Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withDeploymentOption(String deploymentOption) {
        setDeploymentOption(deploymentOption);
        return this;
    }

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family of the recommended reservation.
     */

    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * 
     * @return The instance family of the recommended reservation.
     */

    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family of the recommended reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withInstanceFamily(String instanceFamily) {
        setInstanceFamily(instanceFamily);
        return this;
    }

    /**
     * <p>
     * The type of instance that Amazon Web Services recommends.
     * </p>
     * 
     * @param instanceType
     *        The type of instance that Amazon Web Services recommends.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance that Amazon Web Services recommends.
     * </p>
     * 
     * @return The type of instance that Amazon Web Services recommends.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instance that Amazon Web Services recommends.
     * </p>
     * 
     * @param instanceType
     *        The type of instance that Amazon Web Services recommends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The license model that the recommended reservation supports.
     * </p>
     * 
     * @param licenseModel
     *        The license model that the recommended reservation supports.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model that the recommended reservation supports.
     * </p>
     * 
     * @return The license model that the recommended reservation supports.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model that the recommended reservation supports.
     * </p>
     * 
     * @param licenseModel
     *        The license model that the recommended reservation supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * 
     * @param monthlyRecurringCost
     *        How much purchasing this instance costs you on a monthly basis.
     */

    public void setMonthlyRecurringCost(String monthlyRecurringCost) {
        this.monthlyRecurringCost = monthlyRecurringCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * 
     * @return How much purchasing this instance costs you on a monthly basis.
     */

    public String getMonthlyRecurringCost() {
        return this.monthlyRecurringCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * 
     * @param monthlyRecurringCost
     *        How much purchasing this instance costs you on a monthly basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withMonthlyRecurringCost(String monthlyRecurringCost) {
        setMonthlyRecurringCost(monthlyRecurringCost);
        return this;
    }

    /**
     * <p>
     * The number of normalized units that Amazon Web Services recommends that you purchase.
     * </p>
     * 
     * @param normalizedUnitsToPurchase
     *        The number of normalized units that Amazon Web Services recommends that you purchase.
     */

    public void setNormalizedUnitsToPurchase(String normalizedUnitsToPurchase) {
        this.normalizedUnitsToPurchase = normalizedUnitsToPurchase;
    }

    /**
     * <p>
     * The number of normalized units that Amazon Web Services recommends that you purchase.
     * </p>
     * 
     * @return The number of normalized units that Amazon Web Services recommends that you purchase.
     */

    public String getNormalizedUnitsToPurchase() {
        return this.normalizedUnitsToPurchase;
    }

    /**
     * <p>
     * The number of normalized units that Amazon Web Services recommends that you purchase.
     * </p>
     * 
     * @param normalizedUnitsToPurchase
     *        The number of normalized units that Amazon Web Services recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withNormalizedUnitsToPurchase(String normalizedUnitsToPurchase) {
        setNormalizedUnitsToPurchase(normalizedUnitsToPurchase);
        return this;
    }

    /**
     * <p>
     * The number of instances that Amazon Web Services recommends that you purchase.
     * </p>
     * 
     * @param numberOfInstancesToPurchase
     *        The number of instances that Amazon Web Services recommends that you purchase.
     */

    public void setNumberOfInstancesToPurchase(String numberOfInstancesToPurchase) {
        this.numberOfInstancesToPurchase = numberOfInstancesToPurchase;
    }

    /**
     * <p>
     * The number of instances that Amazon Web Services recommends that you purchase.
     * </p>
     * 
     * @return The number of instances that Amazon Web Services recommends that you purchase.
     */

    public String getNumberOfInstancesToPurchase() {
        return this.numberOfInstancesToPurchase;
    }

    /**
     * <p>
     * The number of instances that Amazon Web Services recommends that you purchase.
     * </p>
     * 
     * @param numberOfInstancesToPurchase
     *        The number of instances that Amazon Web Services recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withNumberOfInstancesToPurchase(String numberOfInstancesToPurchase) {
        setNumberOfInstancesToPurchase(numberOfInstancesToPurchase);
        return this;
    }

    /**
     * <p>
     * The payment option for the commitment.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the commitment.
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option for the commitment.
     * </p>
     * 
     * @return The payment option for the commitment.
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option for the commitment.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the commitment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the commitment.
     * </p>
     * 
     * @param reservedInstancesRegion
     *        The Amazon Web Services Region of the commitment.
     */

    public void setReservedInstancesRegion(String reservedInstancesRegion) {
        this.reservedInstancesRegion = reservedInstancesRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the commitment.
     * </p>
     * 
     * @return The Amazon Web Services Region of the commitment.
     */

    public String getReservedInstancesRegion() {
        return this.reservedInstancesRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the commitment.
     * </p>
     * 
     * @param reservedInstancesRegion
     *        The Amazon Web Services Region of the commitment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withReservedInstancesRegion(String reservedInstancesRegion) {
        setReservedInstancesRegion(reservedInstancesRegion);
        return this;
    }

    /**
     * <p>
     * The service that you want your recommendations for.
     * </p>
     * 
     * @param service
     *        The service that you want your recommendations for.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The service that you want your recommendations for.
     * </p>
     * 
     * @return The service that you want your recommendations for.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The service that you want your recommendations for.
     * </p>
     * 
     * @param service
     *        The service that you want your recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * Determines whether the recommendation is size flexible.
     * </p>
     * 
     * @param sizeFlexEligible
     *        Determines whether the recommendation is size flexible.
     */

    public void setSizeFlexEligible(Boolean sizeFlexEligible) {
        this.sizeFlexEligible = sizeFlexEligible;
    }

    /**
     * <p>
     * Determines whether the recommendation is size flexible.
     * </p>
     * 
     * @return Determines whether the recommendation is size flexible.
     */

    public Boolean getSizeFlexEligible() {
        return this.sizeFlexEligible;
    }

    /**
     * <p>
     * Determines whether the recommendation is size flexible.
     * </p>
     * 
     * @param sizeFlexEligible
     *        Determines whether the recommendation is size flexible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withSizeFlexEligible(Boolean sizeFlexEligible) {
        setSizeFlexEligible(sizeFlexEligible);
        return this;
    }

    /**
     * <p>
     * Determines whether the recommendation is size flexible.
     * </p>
     * 
     * @return Determines whether the recommendation is size flexible.
     */

    public Boolean isSizeFlexEligible() {
        return this.sizeFlexEligible;
    }

    /**
     * <p>
     * The reserved instances recommendation term in years.
     * </p>
     * 
     * @param term
     *        The reserved instances recommendation term in years.
     */

    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * <p>
     * The reserved instances recommendation term in years.
     * </p>
     * 
     * @return The reserved instances recommendation term in years.
     */

    public String getTerm() {
        return this.term;
    }

    /**
     * <p>
     * The reserved instances recommendation term in years.
     * </p>
     * 
     * @param term
     *        The reserved instances recommendation term in years.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withTerm(String term) {
        setTerm(term);
        return this;
    }

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * 
     * @param upfrontCost
     *        How much purchasing this instance costs you upfront.
     */

    public void setUpfrontCost(String upfrontCost) {
        this.upfrontCost = upfrontCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * 
     * @return How much purchasing this instance costs you upfront.
     */

    public String getUpfrontCost() {
        return this.upfrontCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * 
     * @param upfrontCost
     *        How much purchasing this instance costs you upfront.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsReservedInstancesConfiguration withUpfrontCost(String upfrontCost) {
        setUpfrontCost(upfrontCost);
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
        if (getAccountScope() != null)
            sb.append("AccountScope: ").append(getAccountScope()).append(",");
        if (getCurrentGeneration() != null)
            sb.append("CurrentGeneration: ").append(getCurrentGeneration()).append(",");
        if (getDatabaseEdition() != null)
            sb.append("DatabaseEdition: ").append(getDatabaseEdition()).append(",");
        if (getDatabaseEngine() != null)
            sb.append("DatabaseEngine: ").append(getDatabaseEngine()).append(",");
        if (getDeploymentOption() != null)
            sb.append("DeploymentOption: ").append(getDeploymentOption()).append(",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: ").append(getInstanceFamily()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getMonthlyRecurringCost() != null)
            sb.append("MonthlyRecurringCost: ").append(getMonthlyRecurringCost()).append(",");
        if (getNormalizedUnitsToPurchase() != null)
            sb.append("NormalizedUnitsToPurchase: ").append(getNormalizedUnitsToPurchase()).append(",");
        if (getNumberOfInstancesToPurchase() != null)
            sb.append("NumberOfInstancesToPurchase: ").append(getNumberOfInstancesToPurchase()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getReservedInstancesRegion() != null)
            sb.append("ReservedInstancesRegion: ").append(getReservedInstancesRegion()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getSizeFlexEligible() != null)
            sb.append("SizeFlexEligible: ").append(getSizeFlexEligible()).append(",");
        if (getTerm() != null)
            sb.append("Term: ").append(getTerm()).append(",");
        if (getUpfrontCost() != null)
            sb.append("UpfrontCost: ").append(getUpfrontCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsReservedInstancesConfiguration == false)
            return false;
        RdsReservedInstancesConfiguration other = (RdsReservedInstancesConfiguration) obj;
        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
        if (other.getCurrentGeneration() == null ^ this.getCurrentGeneration() == null)
            return false;
        if (other.getCurrentGeneration() != null && other.getCurrentGeneration().equals(this.getCurrentGeneration()) == false)
            return false;
        if (other.getDatabaseEdition() == null ^ this.getDatabaseEdition() == null)
            return false;
        if (other.getDatabaseEdition() != null && other.getDatabaseEdition().equals(this.getDatabaseEdition()) == false)
            return false;
        if (other.getDatabaseEngine() == null ^ this.getDatabaseEngine() == null)
            return false;
        if (other.getDatabaseEngine() != null && other.getDatabaseEngine().equals(this.getDatabaseEngine()) == false)
            return false;
        if (other.getDeploymentOption() == null ^ this.getDeploymentOption() == null)
            return false;
        if (other.getDeploymentOption() != null && other.getDeploymentOption().equals(this.getDeploymentOption()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getMonthlyRecurringCost() == null ^ this.getMonthlyRecurringCost() == null)
            return false;
        if (other.getMonthlyRecurringCost() != null && other.getMonthlyRecurringCost().equals(this.getMonthlyRecurringCost()) == false)
            return false;
        if (other.getNormalizedUnitsToPurchase() == null ^ this.getNormalizedUnitsToPurchase() == null)
            return false;
        if (other.getNormalizedUnitsToPurchase() != null && other.getNormalizedUnitsToPurchase().equals(this.getNormalizedUnitsToPurchase()) == false)
            return false;
        if (other.getNumberOfInstancesToPurchase() == null ^ this.getNumberOfInstancesToPurchase() == null)
            return false;
        if (other.getNumberOfInstancesToPurchase() != null && other.getNumberOfInstancesToPurchase().equals(this.getNumberOfInstancesToPurchase()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getReservedInstancesRegion() == null ^ this.getReservedInstancesRegion() == null)
            return false;
        if (other.getReservedInstancesRegion() != null && other.getReservedInstancesRegion().equals(this.getReservedInstancesRegion()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getSizeFlexEligible() == null ^ this.getSizeFlexEligible() == null)
            return false;
        if (other.getSizeFlexEligible() != null && other.getSizeFlexEligible().equals(this.getSizeFlexEligible()) == false)
            return false;
        if (other.getTerm() == null ^ this.getTerm() == null)
            return false;
        if (other.getTerm() != null && other.getTerm().equals(this.getTerm()) == false)
            return false;
        if (other.getUpfrontCost() == null ^ this.getUpfrontCost() == null)
            return false;
        if (other.getUpfrontCost() != null && other.getUpfrontCost().equals(this.getUpfrontCost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode + ((getCurrentGeneration() == null) ? 0 : getCurrentGeneration().hashCode());
        hashCode = prime * hashCode + ((getDatabaseEdition() == null) ? 0 : getDatabaseEdition().hashCode());
        hashCode = prime * hashCode + ((getDatabaseEngine() == null) ? 0 : getDatabaseEngine().hashCode());
        hashCode = prime * hashCode + ((getDeploymentOption() == null) ? 0 : getDeploymentOption().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getMonthlyRecurringCost() == null) ? 0 : getMonthlyRecurringCost().hashCode());
        hashCode = prime * hashCode + ((getNormalizedUnitsToPurchase() == null) ? 0 : getNormalizedUnitsToPurchase().hashCode());
        hashCode = prime * hashCode + ((getNumberOfInstancesToPurchase() == null) ? 0 : getNumberOfInstancesToPurchase().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesRegion() == null) ? 0 : getReservedInstancesRegion().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getSizeFlexEligible() == null) ? 0 : getSizeFlexEligible().hashCode());
        hashCode = prime * hashCode + ((getTerm() == null) ? 0 : getTerm().hashCode());
        hashCode = prime * hashCode + ((getUpfrontCost() == null) ? 0 : getUpfrontCost().hashCode());
        return hashCode;
    }

    @Override
    public RdsReservedInstancesConfiguration clone() {
        try {
            return (RdsReservedInstancesConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.RdsReservedInstancesConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
