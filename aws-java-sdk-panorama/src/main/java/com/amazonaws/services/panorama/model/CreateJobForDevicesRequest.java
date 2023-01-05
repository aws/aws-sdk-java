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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateJobForDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobForDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * IDs of target devices.
     * </p>
     */
    private java.util.List<String> deviceIds;
    /**
     * <p>
     * Configuration settings for a software update job.
     * </p>
     */
    private DeviceJobConfig deviceJobConfig;
    /**
     * <p>
     * The type of job to run.
     * </p>
     */
    private String jobType;

    /**
     * <p>
     * IDs of target devices.
     * </p>
     * 
     * @return IDs of target devices.
     */

    public java.util.List<String> getDeviceIds() {
        return deviceIds;
    }

    /**
     * <p>
     * IDs of target devices.
     * </p>
     * 
     * @param deviceIds
     *        IDs of target devices.
     */

    public void setDeviceIds(java.util.Collection<String> deviceIds) {
        if (deviceIds == null) {
            this.deviceIds = null;
            return;
        }

        this.deviceIds = new java.util.ArrayList<String>(deviceIds);
    }

    /**
     * <p>
     * IDs of target devices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceIds(java.util.Collection)} or {@link #withDeviceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deviceIds
     *        IDs of target devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobForDevicesRequest withDeviceIds(String... deviceIds) {
        if (this.deviceIds == null) {
            setDeviceIds(new java.util.ArrayList<String>(deviceIds.length));
        }
        for (String ele : deviceIds) {
            this.deviceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IDs of target devices.
     * </p>
     * 
     * @param deviceIds
     *        IDs of target devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobForDevicesRequest withDeviceIds(java.util.Collection<String> deviceIds) {
        setDeviceIds(deviceIds);
        return this;
    }

    /**
     * <p>
     * Configuration settings for a software update job.
     * </p>
     * 
     * @param deviceJobConfig
     *        Configuration settings for a software update job.
     */

    public void setDeviceJobConfig(DeviceJobConfig deviceJobConfig) {
        this.deviceJobConfig = deviceJobConfig;
    }

    /**
     * <p>
     * Configuration settings for a software update job.
     * </p>
     * 
     * @return Configuration settings for a software update job.
     */

    public DeviceJobConfig getDeviceJobConfig() {
        return this.deviceJobConfig;
    }

    /**
     * <p>
     * Configuration settings for a software update job.
     * </p>
     * 
     * @param deviceJobConfig
     *        Configuration settings for a software update job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobForDevicesRequest withDeviceJobConfig(DeviceJobConfig deviceJobConfig) {
        setDeviceJobConfig(deviceJobConfig);
        return this;
    }

    /**
     * <p>
     * The type of job to run.
     * </p>
     * 
     * @param jobType
     *        The type of job to run.
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of job to run.
     * </p>
     * 
     * @return The type of job to run.
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The type of job to run.
     * </p>
     * 
     * @param jobType
     *        The type of job to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateJobForDevicesRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The type of job to run.
     * </p>
     * 
     * @param jobType
     *        The type of job to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateJobForDevicesRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
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
        if (getDeviceIds() != null)
            sb.append("DeviceIds: ").append(getDeviceIds()).append(",");
        if (getDeviceJobConfig() != null)
            sb.append("DeviceJobConfig: ").append(getDeviceJobConfig()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobForDevicesRequest == false)
            return false;
        CreateJobForDevicesRequest other = (CreateJobForDevicesRequest) obj;
        if (other.getDeviceIds() == null ^ this.getDeviceIds() == null)
            return false;
        if (other.getDeviceIds() != null && other.getDeviceIds().equals(this.getDeviceIds()) == false)
            return false;
        if (other.getDeviceJobConfig() == null ^ this.getDeviceJobConfig() == null)
            return false;
        if (other.getDeviceJobConfig() != null && other.getDeviceJobConfig().equals(this.getDeviceJobConfig()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceIds() == null) ? 0 : getDeviceIds().hashCode());
        hashCode = prime * hashCode + ((getDeviceJobConfig() == null) ? 0 : getDeviceJobConfig().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobForDevicesRequest clone() {
        return (CreateJobForDevicesRequest) super.clone();
    }

}
