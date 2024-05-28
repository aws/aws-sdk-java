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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateCisScanConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCisScanConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The CIS scan configuration ARN.
     * </p>
     */
    private String scanConfigurationArn;
    /**
     * <p>
     * The scan name for the CIS scan configuration.
     * </p>
     */
    private String scanName;
    /**
     * <p>
     * The schedule for the CIS scan configuration.
     * </p>
     */
    private Schedule schedule;
    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     */
    private String securityLevel;
    /**
     * <p>
     * The targets for the CIS scan configuration.
     * </p>
     */
    private UpdateCisTargets targets;

    /**
     * <p>
     * The CIS scan configuration ARN.
     * </p>
     * 
     * @param scanConfigurationArn
     *        The CIS scan configuration ARN.
     */

    public void setScanConfigurationArn(String scanConfigurationArn) {
        this.scanConfigurationArn = scanConfigurationArn;
    }

    /**
     * <p>
     * The CIS scan configuration ARN.
     * </p>
     * 
     * @return The CIS scan configuration ARN.
     */

    public String getScanConfigurationArn() {
        return this.scanConfigurationArn;
    }

    /**
     * <p>
     * The CIS scan configuration ARN.
     * </p>
     * 
     * @param scanConfigurationArn
     *        The CIS scan configuration ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisScanConfigurationRequest withScanConfigurationArn(String scanConfigurationArn) {
        setScanConfigurationArn(scanConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The scan name for the CIS scan configuration.
     * </p>
     * 
     * @param scanName
     *        The scan name for the CIS scan configuration.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The scan name for the CIS scan configuration.
     * </p>
     * 
     * @return The scan name for the CIS scan configuration.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The scan name for the CIS scan configuration.
     * </p>
     * 
     * @param scanName
     *        The scan name for the CIS scan configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisScanConfigurationRequest withScanName(String scanName) {
        setScanName(scanName);
        return this;
    }

    /**
     * <p>
     * The schedule for the CIS scan configuration.
     * </p>
     * 
     * @param schedule
     *        The schedule for the CIS scan configuration.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for the CIS scan configuration.
     * </p>
     * 
     * @return The schedule for the CIS scan configuration.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule for the CIS scan configuration.
     * </p>
     * 
     * @param schedule
     *        The schedule for the CIS scan configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisScanConfigurationRequest withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     * 
     * @param securityLevel
     *        The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS
     *        assigns to a profile.
     * @see CisSecurityLevel
     */

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     * 
     * @return The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS
     *         assigns to a profile.
     * @see CisSecurityLevel
     */

    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     * 
     * @param securityLevel
     *        The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS
     *        assigns to a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public UpdateCisScanConfigurationRequest withSecurityLevel(String securityLevel) {
        setSecurityLevel(securityLevel);
        return this;
    }

    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     * 
     * @param securityLevel
     *        The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS
     *        assigns to a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public UpdateCisScanConfigurationRequest withSecurityLevel(CisSecurityLevel securityLevel) {
        this.securityLevel = securityLevel.toString();
        return this;
    }

    /**
     * <p>
     * The targets for the CIS scan configuration.
     * </p>
     * 
     * @param targets
     *        The targets for the CIS scan configuration.
     */

    public void setTargets(UpdateCisTargets targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * The targets for the CIS scan configuration.
     * </p>
     * 
     * @return The targets for the CIS scan configuration.
     */

    public UpdateCisTargets getTargets() {
        return this.targets;
    }

    /**
     * <p>
     * The targets for the CIS scan configuration.
     * </p>
     * 
     * @param targets
     *        The targets for the CIS scan configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisScanConfigurationRequest withTargets(UpdateCisTargets targets) {
        setTargets(targets);
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
        if (getScanConfigurationArn() != null)
            sb.append("ScanConfigurationArn: ").append(getScanConfigurationArn()).append(",");
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getSecurityLevel() != null)
            sb.append("SecurityLevel: ").append(getSecurityLevel()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCisScanConfigurationRequest == false)
            return false;
        UpdateCisScanConfigurationRequest other = (UpdateCisScanConfigurationRequest) obj;
        if (other.getScanConfigurationArn() == null ^ this.getScanConfigurationArn() == null)
            return false;
        if (other.getScanConfigurationArn() != null && other.getScanConfigurationArn().equals(this.getScanConfigurationArn()) == false)
            return false;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSecurityLevel() == null ^ this.getSecurityLevel() == null)
            return false;
        if (other.getSecurityLevel() != null && other.getSecurityLevel().equals(this.getSecurityLevel()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanConfigurationArn() == null) ? 0 : getScanConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSecurityLevel() == null) ? 0 : getSecurityLevel().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCisScanConfigurationRequest clone() {
        return (UpdateCisScanConfigurationRequest) super.clone();
    }

}
