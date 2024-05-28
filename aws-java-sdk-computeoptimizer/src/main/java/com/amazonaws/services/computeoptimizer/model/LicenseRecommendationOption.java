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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the recommendation options for licenses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/LicenseRecommendationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseRecommendationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rank of the license recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     */
    private Integer rank;
    /**
     * <p>
     * The operating system of a license recommendation option.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * The recommended edition of the license for the application that runs on the instance.
     * </p>
     */
    private String licenseEdition;
    /**
     * <p>
     * The recommended license type associated with the instance.
     * </p>
     */
    private String licenseModel;

    private SavingsOpportunity savingsOpportunity;

    /**
     * <p>
     * The rank of the license recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the license recommendation option. </p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * The rank of the license recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @return The rank of the license recommendation option. </p>
     *         <p>
     *         The top recommendation option is ranked as <code>1</code>.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * The rank of the license recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the license recommendation option. </p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendationOption withRank(Integer rank) {
        setRank(rank);
        return this;
    }

    /**
     * <p>
     * The operating system of a license recommendation option.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of a license recommendation option.
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system of a license recommendation option.
     * </p>
     * 
     * @return The operating system of a license recommendation option.
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system of a license recommendation option.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of a license recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendationOption withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The recommended edition of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseEdition
     *        The recommended edition of the license for the application that runs on the instance.
     * @see LicenseEdition
     */

    public void setLicenseEdition(String licenseEdition) {
        this.licenseEdition = licenseEdition;
    }

    /**
     * <p>
     * The recommended edition of the license for the application that runs on the instance.
     * </p>
     * 
     * @return The recommended edition of the license for the application that runs on the instance.
     * @see LicenseEdition
     */

    public String getLicenseEdition() {
        return this.licenseEdition;
    }

    /**
     * <p>
     * The recommended edition of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseEdition
     *        The recommended edition of the license for the application that runs on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseEdition
     */

    public LicenseRecommendationOption withLicenseEdition(String licenseEdition) {
        setLicenseEdition(licenseEdition);
        return this;
    }

    /**
     * <p>
     * The recommended edition of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseEdition
     *        The recommended edition of the license for the application that runs on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseEdition
     */

    public LicenseRecommendationOption withLicenseEdition(LicenseEdition licenseEdition) {
        this.licenseEdition = licenseEdition.toString();
        return this;
    }

    /**
     * <p>
     * The recommended license type associated with the instance.
     * </p>
     * 
     * @param licenseModel
     *        The recommended license type associated with the instance.
     * @see LicenseModel
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The recommended license type associated with the instance.
     * </p>
     * 
     * @return The recommended license type associated with the instance.
     * @see LicenseModel
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The recommended license type associated with the instance.
     * </p>
     * 
     * @param licenseModel
     *        The recommended license type associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseModel
     */

    public LicenseRecommendationOption withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The recommended license type associated with the instance.
     * </p>
     * 
     * @param licenseModel
     *        The recommended license type associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseModel
     */

    public LicenseRecommendationOption withLicenseModel(LicenseModel licenseModel) {
        this.licenseModel = licenseModel.toString();
        return this;
    }

    /**
     * @param savingsOpportunity
     */

    public void setSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        this.savingsOpportunity = savingsOpportunity;
    }

    /**
     * @return
     */

    public SavingsOpportunity getSavingsOpportunity() {
        return this.savingsOpportunity;
    }

    /**
     * @param savingsOpportunity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendationOption withSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        setSavingsOpportunity(savingsOpportunity);
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
        if (getRank() != null)
            sb.append("Rank: ").append(getRank()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getLicenseEdition() != null)
            sb.append("LicenseEdition: ").append(getLicenseEdition()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getSavingsOpportunity() != null)
            sb.append("SavingsOpportunity: ").append(getSavingsOpportunity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseRecommendationOption == false)
            return false;
        LicenseRecommendationOption other = (LicenseRecommendationOption) obj;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getLicenseEdition() == null ^ this.getLicenseEdition() == null)
            return false;
        if (other.getLicenseEdition() != null && other.getLicenseEdition().equals(this.getLicenseEdition()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getSavingsOpportunity() == null ^ this.getSavingsOpportunity() == null)
            return false;
        if (other.getSavingsOpportunity() != null && other.getSavingsOpportunity().equals(this.getSavingsOpportunity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getLicenseEdition() == null) ? 0 : getLicenseEdition().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getSavingsOpportunity() == null) ? 0 : getSavingsOpportunity().hashCode());
        return hashCode;
    }

    @Override
    public LicenseRecommendationOption clone() {
        try {
            return (LicenseRecommendationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.LicenseRecommendationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
