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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The flag that enables the matching process of duplicate profiles.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/MatchingRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchingRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The flag that enables the matching process of duplicate profiles.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The day and time when do you want to start the Identity Resolution Job every week.
     * </p>
     */
    private JobSchedule jobSchedule;
    /**
     * <p>
     * Configuration information about the auto-merging process.
     * </p>
     */
    private AutoMerging autoMerging;
    /**
     * <p>
     * Configuration information for exporting Identity Resolution results, for example, to an S3 bucket.
     * </p>
     */
    private ExportingConfig exportingConfig;

    /**
     * <p>
     * The flag that enables the matching process of duplicate profiles.
     * </p>
     * 
     * @param enabled
     *        The flag that enables the matching process of duplicate profiles.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * The flag that enables the matching process of duplicate profiles.
     * </p>
     * 
     * @return The flag that enables the matching process of duplicate profiles.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The flag that enables the matching process of duplicate profiles.
     * </p>
     * 
     * @param enabled
     *        The flag that enables the matching process of duplicate profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * The flag that enables the matching process of duplicate profiles.
     * </p>
     * 
     * @return The flag that enables the matching process of duplicate profiles.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The day and time when do you want to start the Identity Resolution Job every week.
     * </p>
     * 
     * @param jobSchedule
     *        The day and time when do you want to start the Identity Resolution Job every week.
     */

    public void setJobSchedule(JobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
    }

    /**
     * <p>
     * The day and time when do you want to start the Identity Resolution Job every week.
     * </p>
     * 
     * @return The day and time when do you want to start the Identity Resolution Job every week.
     */

    public JobSchedule getJobSchedule() {
        return this.jobSchedule;
    }

    /**
     * <p>
     * The day and time when do you want to start the Identity Resolution Job every week.
     * </p>
     * 
     * @param jobSchedule
     *        The day and time when do you want to start the Identity Resolution Job every week.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingRequest withJobSchedule(JobSchedule jobSchedule) {
        setJobSchedule(jobSchedule);
        return this;
    }

    /**
     * <p>
     * Configuration information about the auto-merging process.
     * </p>
     * 
     * @param autoMerging
     *        Configuration information about the auto-merging process.
     */

    public void setAutoMerging(AutoMerging autoMerging) {
        this.autoMerging = autoMerging;
    }

    /**
     * <p>
     * Configuration information about the auto-merging process.
     * </p>
     * 
     * @return Configuration information about the auto-merging process.
     */

    public AutoMerging getAutoMerging() {
        return this.autoMerging;
    }

    /**
     * <p>
     * Configuration information about the auto-merging process.
     * </p>
     * 
     * @param autoMerging
     *        Configuration information about the auto-merging process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingRequest withAutoMerging(AutoMerging autoMerging) {
        setAutoMerging(autoMerging);
        return this;
    }

    /**
     * <p>
     * Configuration information for exporting Identity Resolution results, for example, to an S3 bucket.
     * </p>
     * 
     * @param exportingConfig
     *        Configuration information for exporting Identity Resolution results, for example, to an S3 bucket.
     */

    public void setExportingConfig(ExportingConfig exportingConfig) {
        this.exportingConfig = exportingConfig;
    }

    /**
     * <p>
     * Configuration information for exporting Identity Resolution results, for example, to an S3 bucket.
     * </p>
     * 
     * @return Configuration information for exporting Identity Resolution results, for example, to an S3 bucket.
     */

    public ExportingConfig getExportingConfig() {
        return this.exportingConfig;
    }

    /**
     * <p>
     * Configuration information for exporting Identity Resolution results, for example, to an S3 bucket.
     * </p>
     * 
     * @param exportingConfig
     *        Configuration information for exporting Identity Resolution results, for example, to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingRequest withExportingConfig(ExportingConfig exportingConfig) {
        setExportingConfig(exportingConfig);
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
        if (getJobSchedule() != null)
            sb.append("JobSchedule: ").append(getJobSchedule()).append(",");
        if (getAutoMerging() != null)
            sb.append("AutoMerging: ").append(getAutoMerging()).append(",");
        if (getExportingConfig() != null)
            sb.append("ExportingConfig: ").append(getExportingConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchingRequest == false)
            return false;
        MatchingRequest other = (MatchingRequest) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getJobSchedule() == null ^ this.getJobSchedule() == null)
            return false;
        if (other.getJobSchedule() != null && other.getJobSchedule().equals(this.getJobSchedule()) == false)
            return false;
        if (other.getAutoMerging() == null ^ this.getAutoMerging() == null)
            return false;
        if (other.getAutoMerging() != null && other.getAutoMerging().equals(this.getAutoMerging()) == false)
            return false;
        if (other.getExportingConfig() == null ^ this.getExportingConfig() == null)
            return false;
        if (other.getExportingConfig() != null && other.getExportingConfig().equals(this.getExportingConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getJobSchedule() == null) ? 0 : getJobSchedule().hashCode());
        hashCode = prime * hashCode + ((getAutoMerging() == null) ? 0 : getAutoMerging().hashCode());
        hashCode = prime * hashCode + ((getExportingConfig() == null) ? 0 : getExportingConfig().hashCode());
        return hashCode;
    }

    @Override
    public MatchingRequest clone() {
        try {
            return (MatchingRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.MatchingRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
