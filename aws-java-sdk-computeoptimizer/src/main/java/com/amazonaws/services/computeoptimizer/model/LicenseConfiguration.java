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
 * Describes the configuration of a license for an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/LicenseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current number of cores associated with the instance.
     * </p>
     */
    private Integer numberOfCores;
    /**
     * <p>
     * The instance type used in the license.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The operating system of the instance.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * The edition of the license for the application that runs on the instance.
     * </p>
     */
    private String licenseEdition;
    /**
     * <p>
     * The name of the license for the application that runs on the instance.
     * </p>
     */
    private String licenseName;
    /**
     * <p>
     * The license type associated with the instance.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The version of the license for the application that runs on the instance.
     * </p>
     */
    private String licenseVersion;
    /**
     * <p>
     * The list of metric sources required to generate recommendations for commercial software licenses.
     * </p>
     */
    private java.util.List<MetricSource> metricsSource;

    /**
     * <p>
     * The current number of cores associated with the instance.
     * </p>
     * 
     * @param numberOfCores
     *        The current number of cores associated with the instance.
     */

    public void setNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    /**
     * <p>
     * The current number of cores associated with the instance.
     * </p>
     * 
     * @return The current number of cores associated with the instance.
     */

    public Integer getNumberOfCores() {
        return this.numberOfCores;
    }

    /**
     * <p>
     * The current number of cores associated with the instance.
     * </p>
     * 
     * @param numberOfCores
     *        The current number of cores associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withNumberOfCores(Integer numberOfCores) {
        setNumberOfCores(numberOfCores);
        return this;
    }

    /**
     * <p>
     * The instance type used in the license.
     * </p>
     * 
     * @param instanceType
     *        The instance type used in the license.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type used in the license.
     * </p>
     * 
     * @return The instance type used in the license.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type used in the license.
     * </p>
     * 
     * @param instanceType
     *        The instance type used in the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The operating system of the instance.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the instance.
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system of the instance.
     * </p>
     * 
     * @return The operating system of the instance.
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system of the instance.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The edition of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseEdition
     *        The edition of the license for the application that runs on the instance.
     * @see LicenseEdition
     */

    public void setLicenseEdition(String licenseEdition) {
        this.licenseEdition = licenseEdition;
    }

    /**
     * <p>
     * The edition of the license for the application that runs on the instance.
     * </p>
     * 
     * @return The edition of the license for the application that runs on the instance.
     * @see LicenseEdition
     */

    public String getLicenseEdition() {
        return this.licenseEdition;
    }

    /**
     * <p>
     * The edition of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseEdition
     *        The edition of the license for the application that runs on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseEdition
     */

    public LicenseConfiguration withLicenseEdition(String licenseEdition) {
        setLicenseEdition(licenseEdition);
        return this;
    }

    /**
     * <p>
     * The edition of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseEdition
     *        The edition of the license for the application that runs on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseEdition
     */

    public LicenseConfiguration withLicenseEdition(LicenseEdition licenseEdition) {
        this.licenseEdition = licenseEdition.toString();
        return this;
    }

    /**
     * <p>
     * The name of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseName
     *        The name of the license for the application that runs on the instance.
     * @see LicenseName
     */

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    /**
     * <p>
     * The name of the license for the application that runs on the instance.
     * </p>
     * 
     * @return The name of the license for the application that runs on the instance.
     * @see LicenseName
     */

    public String getLicenseName() {
        return this.licenseName;
    }

    /**
     * <p>
     * The name of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseName
     *        The name of the license for the application that runs on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseName
     */

    public LicenseConfiguration withLicenseName(String licenseName) {
        setLicenseName(licenseName);
        return this;
    }

    /**
     * <p>
     * The name of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseName
     *        The name of the license for the application that runs on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseName
     */

    public LicenseConfiguration withLicenseName(LicenseName licenseName) {
        this.licenseName = licenseName.toString();
        return this;
    }

    /**
     * <p>
     * The license type associated with the instance.
     * </p>
     * 
     * @param licenseModel
     *        The license type associated with the instance.
     * @see LicenseModel
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license type associated with the instance.
     * </p>
     * 
     * @return The license type associated with the instance.
     * @see LicenseModel
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license type associated with the instance.
     * </p>
     * 
     * @param licenseModel
     *        The license type associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseModel
     */

    public LicenseConfiguration withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The license type associated with the instance.
     * </p>
     * 
     * @param licenseModel
     *        The license type associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseModel
     */

    public LicenseConfiguration withLicenseModel(LicenseModel licenseModel) {
        this.licenseModel = licenseModel.toString();
        return this;
    }

    /**
     * <p>
     * The version of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseVersion
     *        The version of the license for the application that runs on the instance.
     */

    public void setLicenseVersion(String licenseVersion) {
        this.licenseVersion = licenseVersion;
    }

    /**
     * <p>
     * The version of the license for the application that runs on the instance.
     * </p>
     * 
     * @return The version of the license for the application that runs on the instance.
     */

    public String getLicenseVersion() {
        return this.licenseVersion;
    }

    /**
     * <p>
     * The version of the license for the application that runs on the instance.
     * </p>
     * 
     * @param licenseVersion
     *        The version of the license for the application that runs on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withLicenseVersion(String licenseVersion) {
        setLicenseVersion(licenseVersion);
        return this;
    }

    /**
     * <p>
     * The list of metric sources required to generate recommendations for commercial software licenses.
     * </p>
     * 
     * @return The list of metric sources required to generate recommendations for commercial software licenses.
     */

    public java.util.List<MetricSource> getMetricsSource() {
        return metricsSource;
    }

    /**
     * <p>
     * The list of metric sources required to generate recommendations for commercial software licenses.
     * </p>
     * 
     * @param metricsSource
     *        The list of metric sources required to generate recommendations for commercial software licenses.
     */

    public void setMetricsSource(java.util.Collection<MetricSource> metricsSource) {
        if (metricsSource == null) {
            this.metricsSource = null;
            return;
        }

        this.metricsSource = new java.util.ArrayList<MetricSource>(metricsSource);
    }

    /**
     * <p>
     * The list of metric sources required to generate recommendations for commercial software licenses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricsSource(java.util.Collection)} or {@link #withMetricsSource(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param metricsSource
     *        The list of metric sources required to generate recommendations for commercial software licenses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withMetricsSource(MetricSource... metricsSource) {
        if (this.metricsSource == null) {
            setMetricsSource(new java.util.ArrayList<MetricSource>(metricsSource.length));
        }
        for (MetricSource ele : metricsSource) {
            this.metricsSource.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of metric sources required to generate recommendations for commercial software licenses.
     * </p>
     * 
     * @param metricsSource
     *        The list of metric sources required to generate recommendations for commercial software licenses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withMetricsSource(java.util.Collection<MetricSource> metricsSource) {
        setMetricsSource(metricsSource);
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
        if (getNumberOfCores() != null)
            sb.append("NumberOfCores: ").append(getNumberOfCores()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getLicenseEdition() != null)
            sb.append("LicenseEdition: ").append(getLicenseEdition()).append(",");
        if (getLicenseName() != null)
            sb.append("LicenseName: ").append(getLicenseName()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getLicenseVersion() != null)
            sb.append("LicenseVersion: ").append(getLicenseVersion()).append(",");
        if (getMetricsSource() != null)
            sb.append("MetricsSource: ").append(getMetricsSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseConfiguration == false)
            return false;
        LicenseConfiguration other = (LicenseConfiguration) obj;
        if (other.getNumberOfCores() == null ^ this.getNumberOfCores() == null)
            return false;
        if (other.getNumberOfCores() != null && other.getNumberOfCores().equals(this.getNumberOfCores()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getLicenseEdition() == null ^ this.getLicenseEdition() == null)
            return false;
        if (other.getLicenseEdition() != null && other.getLicenseEdition().equals(this.getLicenseEdition()) == false)
            return false;
        if (other.getLicenseName() == null ^ this.getLicenseName() == null)
            return false;
        if (other.getLicenseName() != null && other.getLicenseName().equals(this.getLicenseName()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getLicenseVersion() == null ^ this.getLicenseVersion() == null)
            return false;
        if (other.getLicenseVersion() != null && other.getLicenseVersion().equals(this.getLicenseVersion()) == false)
            return false;
        if (other.getMetricsSource() == null ^ this.getMetricsSource() == null)
            return false;
        if (other.getMetricsSource() != null && other.getMetricsSource().equals(this.getMetricsSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfCores() == null) ? 0 : getNumberOfCores().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getLicenseEdition() == null) ? 0 : getLicenseEdition().hashCode());
        hashCode = prime * hashCode + ((getLicenseName() == null) ? 0 : getLicenseName().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getLicenseVersion() == null) ? 0 : getLicenseVersion().hashCode());
        hashCode = prime * hashCode + ((getMetricsSource() == null) ? 0 : getMetricsSource().hashCode());
        return hashCode;
    }

    @Override
    public LicenseConfiguration clone() {
        try {
            return (LicenseConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.LicenseConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
