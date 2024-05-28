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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates that the exported data must include EC2 instance type matches for on-premises servers that are discovered
 * through Amazon Web Services Application Discovery Service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2RecommendationsExportPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If set to true, the export <a href=
     * "https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestSyntax"
     * >preferences</a> is set to <code>Ec2RecommendationsExportPreferences</code>.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The recommended EC2 instance type that matches the CPU usage metric of server performance data.
     * </p>
     */
    private UsageMetricBasis cpuPerformanceMetricBasis;
    /**
     * <p>
     * The recommended EC2 instance type that matches the Memory usage metric of server performance data.
     * </p>
     */
    private UsageMetricBasis ramPerformanceMetricBasis;
    /**
     * <p>
     * The target tenancy to use for your recommended EC2 instances.
     * </p>
     */
    private String tenancy;
    /**
     * <p>
     * An array of instance types to exclude from recommendations.
     * </p>
     */
    private java.util.List<String> excludedInstanceTypes;
    /**
     * <p>
     * The target Amazon Web Services Region for the recommendations. You can use any of the Region codes available for
     * the chosen service, as listed in <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Amazon Web
     * Services service endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String preferredRegion;
    /**
     * <p>
     * The contract type for a reserved instance. If blank, we assume an On-Demand instance is preferred.
     * </p>
     */
    private ReservedInstanceOptions reservedInstanceOptions;

    /**
     * <p>
     * If set to true, the export <a href=
     * "https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestSyntax"
     * >preferences</a> is set to <code>Ec2RecommendationsExportPreferences</code>.
     * </p>
     * 
     * @param enabled
     *        If set to true, the export <a href=
     *        "https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestSyntax"
     *        >preferences</a> is set to <code>Ec2RecommendationsExportPreferences</code>.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If set to true, the export <a href=
     * "https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestSyntax"
     * >preferences</a> is set to <code>Ec2RecommendationsExportPreferences</code>.
     * </p>
     * 
     * @return If set to true, the export <a href=
     *         "https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestSyntax"
     *         >preferences</a> is set to <code>Ec2RecommendationsExportPreferences</code>.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If set to true, the export <a href=
     * "https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestSyntax"
     * >preferences</a> is set to <code>Ec2RecommendationsExportPreferences</code>.
     * </p>
     * 
     * @param enabled
     *        If set to true, the export <a href=
     *        "https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestSyntax"
     *        >preferences</a> is set to <code>Ec2RecommendationsExportPreferences</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2RecommendationsExportPreferences withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If set to true, the export <a href=
     * "https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestSyntax"
     * >preferences</a> is set to <code>Ec2RecommendationsExportPreferences</code>.
     * </p>
     * 
     * @return If set to true, the export <a href=
     *         "https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestSyntax"
     *         >preferences</a> is set to <code>Ec2RecommendationsExportPreferences</code>.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The recommended EC2 instance type that matches the CPU usage metric of server performance data.
     * </p>
     * 
     * @param cpuPerformanceMetricBasis
     *        The recommended EC2 instance type that matches the CPU usage metric of server performance data.
     */

    public void setCpuPerformanceMetricBasis(UsageMetricBasis cpuPerformanceMetricBasis) {
        this.cpuPerformanceMetricBasis = cpuPerformanceMetricBasis;
    }

    /**
     * <p>
     * The recommended EC2 instance type that matches the CPU usage metric of server performance data.
     * </p>
     * 
     * @return The recommended EC2 instance type that matches the CPU usage metric of server performance data.
     */

    public UsageMetricBasis getCpuPerformanceMetricBasis() {
        return this.cpuPerformanceMetricBasis;
    }

    /**
     * <p>
     * The recommended EC2 instance type that matches the CPU usage metric of server performance data.
     * </p>
     * 
     * @param cpuPerformanceMetricBasis
     *        The recommended EC2 instance type that matches the CPU usage metric of server performance data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2RecommendationsExportPreferences withCpuPerformanceMetricBasis(UsageMetricBasis cpuPerformanceMetricBasis) {
        setCpuPerformanceMetricBasis(cpuPerformanceMetricBasis);
        return this;
    }

    /**
     * <p>
     * The recommended EC2 instance type that matches the Memory usage metric of server performance data.
     * </p>
     * 
     * @param ramPerformanceMetricBasis
     *        The recommended EC2 instance type that matches the Memory usage metric of server performance data.
     */

    public void setRamPerformanceMetricBasis(UsageMetricBasis ramPerformanceMetricBasis) {
        this.ramPerformanceMetricBasis = ramPerformanceMetricBasis;
    }

    /**
     * <p>
     * The recommended EC2 instance type that matches the Memory usage metric of server performance data.
     * </p>
     * 
     * @return The recommended EC2 instance type that matches the Memory usage metric of server performance data.
     */

    public UsageMetricBasis getRamPerformanceMetricBasis() {
        return this.ramPerformanceMetricBasis;
    }

    /**
     * <p>
     * The recommended EC2 instance type that matches the Memory usage metric of server performance data.
     * </p>
     * 
     * @param ramPerformanceMetricBasis
     *        The recommended EC2 instance type that matches the Memory usage metric of server performance data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2RecommendationsExportPreferences withRamPerformanceMetricBasis(UsageMetricBasis ramPerformanceMetricBasis) {
        setRamPerformanceMetricBasis(ramPerformanceMetricBasis);
        return this;
    }

    /**
     * <p>
     * The target tenancy to use for your recommended EC2 instances.
     * </p>
     * 
     * @param tenancy
     *        The target tenancy to use for your recommended EC2 instances.
     * @see Tenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The target tenancy to use for your recommended EC2 instances.
     * </p>
     * 
     * @return The target tenancy to use for your recommended EC2 instances.
     * @see Tenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The target tenancy to use for your recommended EC2 instances.
     * </p>
     * 
     * @param tenancy
     *        The target tenancy to use for your recommended EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public Ec2RecommendationsExportPreferences withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The target tenancy to use for your recommended EC2 instances.
     * </p>
     * 
     * @param tenancy
     *        The target tenancy to use for your recommended EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public Ec2RecommendationsExportPreferences withTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * An array of instance types to exclude from recommendations.
     * </p>
     * 
     * @return An array of instance types to exclude from recommendations.
     */

    public java.util.List<String> getExcludedInstanceTypes() {
        return excludedInstanceTypes;
    }

    /**
     * <p>
     * An array of instance types to exclude from recommendations.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        An array of instance types to exclude from recommendations.
     */

    public void setExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        if (excludedInstanceTypes == null) {
            this.excludedInstanceTypes = null;
            return;
        }

        this.excludedInstanceTypes = new java.util.ArrayList<String>(excludedInstanceTypes);
    }

    /**
     * <p>
     * An array of instance types to exclude from recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedInstanceTypes(java.util.Collection)} or
     * {@link #withExcludedInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        An array of instance types to exclude from recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2RecommendationsExportPreferences withExcludedInstanceTypes(String... excludedInstanceTypes) {
        if (this.excludedInstanceTypes == null) {
            setExcludedInstanceTypes(new java.util.ArrayList<String>(excludedInstanceTypes.length));
        }
        for (String ele : excludedInstanceTypes) {
            this.excludedInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of instance types to exclude from recommendations.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        An array of instance types to exclude from recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2RecommendationsExportPreferences withExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        setExcludedInstanceTypes(excludedInstanceTypes);
        return this;
    }

    /**
     * <p>
     * The target Amazon Web Services Region for the recommendations. You can use any of the Region codes available for
     * the chosen service, as listed in <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Amazon Web
     * Services service endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param preferredRegion
     *        The target Amazon Web Services Region for the recommendations. You can use any of the Region codes
     *        available for the chosen service, as listed in <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Amazon Web Services service endpoints</a>
     *        in the <i>Amazon Web Services General Reference</i>.
     */

    public void setPreferredRegion(String preferredRegion) {
        this.preferredRegion = preferredRegion;
    }

    /**
     * <p>
     * The target Amazon Web Services Region for the recommendations. You can use any of the Region codes available for
     * the chosen service, as listed in <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Amazon Web
     * Services service endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The target Amazon Web Services Region for the recommendations. You can use any of the Region codes
     *         available for the chosen service, as listed in <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Amazon Web Services service endpoints</a>
     *         in the <i>Amazon Web Services General Reference</i>.
     */

    public String getPreferredRegion() {
        return this.preferredRegion;
    }

    /**
     * <p>
     * The target Amazon Web Services Region for the recommendations. You can use any of the Region codes available for
     * the chosen service, as listed in <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Amazon Web
     * Services service endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param preferredRegion
     *        The target Amazon Web Services Region for the recommendations. You can use any of the Region codes
     *        available for the chosen service, as listed in <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Amazon Web Services service endpoints</a>
     *        in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2RecommendationsExportPreferences withPreferredRegion(String preferredRegion) {
        setPreferredRegion(preferredRegion);
        return this;
    }

    /**
     * <p>
     * The contract type for a reserved instance. If blank, we assume an On-Demand instance is preferred.
     * </p>
     * 
     * @param reservedInstanceOptions
     *        The contract type for a reserved instance. If blank, we assume an On-Demand instance is preferred.
     */

    public void setReservedInstanceOptions(ReservedInstanceOptions reservedInstanceOptions) {
        this.reservedInstanceOptions = reservedInstanceOptions;
    }

    /**
     * <p>
     * The contract type for a reserved instance. If blank, we assume an On-Demand instance is preferred.
     * </p>
     * 
     * @return The contract type for a reserved instance. If blank, we assume an On-Demand instance is preferred.
     */

    public ReservedInstanceOptions getReservedInstanceOptions() {
        return this.reservedInstanceOptions;
    }

    /**
     * <p>
     * The contract type for a reserved instance. If blank, we assume an On-Demand instance is preferred.
     * </p>
     * 
     * @param reservedInstanceOptions
     *        The contract type for a reserved instance. If blank, we assume an On-Demand instance is preferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2RecommendationsExportPreferences withReservedInstanceOptions(ReservedInstanceOptions reservedInstanceOptions) {
        setReservedInstanceOptions(reservedInstanceOptions);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getCpuPerformanceMetricBasis() != null)
            sb.append("CpuPerformanceMetricBasis: ").append(getCpuPerformanceMetricBasis()).append(",");
        if (getRamPerformanceMetricBasis() != null)
            sb.append("RamPerformanceMetricBasis: ").append(getRamPerformanceMetricBasis()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getExcludedInstanceTypes() != null)
            sb.append("ExcludedInstanceTypes: ").append(getExcludedInstanceTypes()).append(",");
        if (getPreferredRegion() != null)
            sb.append("PreferredRegion: ").append(getPreferredRegion()).append(",");
        if (getReservedInstanceOptions() != null)
            sb.append("ReservedInstanceOptions: ").append(getReservedInstanceOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2RecommendationsExportPreferences == false)
            return false;
        Ec2RecommendationsExportPreferences other = (Ec2RecommendationsExportPreferences) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getCpuPerformanceMetricBasis() == null ^ this.getCpuPerformanceMetricBasis() == null)
            return false;
        if (other.getCpuPerformanceMetricBasis() != null && other.getCpuPerformanceMetricBasis().equals(this.getCpuPerformanceMetricBasis()) == false)
            return false;
        if (other.getRamPerformanceMetricBasis() == null ^ this.getRamPerformanceMetricBasis() == null)
            return false;
        if (other.getRamPerformanceMetricBasis() != null && other.getRamPerformanceMetricBasis().equals(this.getRamPerformanceMetricBasis()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getExcludedInstanceTypes() == null ^ this.getExcludedInstanceTypes() == null)
            return false;
        if (other.getExcludedInstanceTypes() != null && other.getExcludedInstanceTypes().equals(this.getExcludedInstanceTypes()) == false)
            return false;
        if (other.getPreferredRegion() == null ^ this.getPreferredRegion() == null)
            return false;
        if (other.getPreferredRegion() != null && other.getPreferredRegion().equals(this.getPreferredRegion()) == false)
            return false;
        if (other.getReservedInstanceOptions() == null ^ this.getReservedInstanceOptions() == null)
            return false;
        if (other.getReservedInstanceOptions() != null && other.getReservedInstanceOptions().equals(this.getReservedInstanceOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getCpuPerformanceMetricBasis() == null) ? 0 : getCpuPerformanceMetricBasis().hashCode());
        hashCode = prime * hashCode + ((getRamPerformanceMetricBasis() == null) ? 0 : getRamPerformanceMetricBasis().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getExcludedInstanceTypes() == null) ? 0 : getExcludedInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getPreferredRegion() == null) ? 0 : getPreferredRegion().hashCode());
        hashCode = prime * hashCode + ((getReservedInstanceOptions() == null) ? 0 : getReservedInstanceOptions().hashCode());
        return hashCode;
    }

    @Override
    public Ec2RecommendationsExportPreferences clone() {
        try {
            return (Ec2RecommendationsExportPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.Ec2RecommendationsExportPreferencesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
