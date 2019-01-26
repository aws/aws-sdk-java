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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to the schedule run operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ScheduleRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the project for the run to be scheduled.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The ARN of the app to schedule a run.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The ARN of the device pool for the run to be scheduled.
     * </p>
     */
    private String devicePoolArn;
    /**
     * <p>
     * The filter criteria used to dynamically select a set of devices for a test run, as well as the maximum number of
     * devices to be included in the run.
     * </p>
     * <p>
     * Either <b> <code>devicePoolArn</code> </b> or <b> <code>deviceSelectionConfiguration</code> </b> is required in a
     * request.
     * </p>
     */
    private DeviceSelectionConfiguration deviceSelectionConfiguration;
    /**
     * <p>
     * The name for the run to be scheduled.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Information about the test for the run to be scheduled.
     * </p>
     */
    private ScheduleRunTest test;
    /**
     * <p>
     * Information about the settings for the run to be scheduled.
     * </p>
     */
    private ScheduleRunConfiguration configuration;
    /**
     * <p>
     * Specifies configuration information about a test run, such as the execution timeout (in minutes).
     * </p>
     */
    private ExecutionConfiguration executionConfiguration;

    /**
     * <p>
     * The ARN of the project for the run to be scheduled.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the project for the run to be scheduled.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN of the project for the run to be scheduled.
     * </p>
     * 
     * @return The ARN of the project for the run to be scheduled.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The ARN of the project for the run to be scheduled.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the project for the run to be scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the app to schedule a run.
     * </p>
     * 
     * @param appArn
     *        The ARN of the app to schedule a run.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The ARN of the app to schedule a run.
     * </p>
     * 
     * @return The ARN of the app to schedule a run.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The ARN of the app to schedule a run.
     * </p>
     * 
     * @param appArn
     *        The ARN of the app to schedule a run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the device pool for the run to be scheduled.
     * </p>
     * 
     * @param devicePoolArn
     *        The ARN of the device pool for the run to be scheduled.
     */

    public void setDevicePoolArn(String devicePoolArn) {
        this.devicePoolArn = devicePoolArn;
    }

    /**
     * <p>
     * The ARN of the device pool for the run to be scheduled.
     * </p>
     * 
     * @return The ARN of the device pool for the run to be scheduled.
     */

    public String getDevicePoolArn() {
        return this.devicePoolArn;
    }

    /**
     * <p>
     * The ARN of the device pool for the run to be scheduled.
     * </p>
     * 
     * @param devicePoolArn
     *        The ARN of the device pool for the run to be scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunRequest withDevicePoolArn(String devicePoolArn) {
        setDevicePoolArn(devicePoolArn);
        return this;
    }

    /**
     * <p>
     * The filter criteria used to dynamically select a set of devices for a test run, as well as the maximum number of
     * devices to be included in the run.
     * </p>
     * <p>
     * Either <b> <code>devicePoolArn</code> </b> or <b> <code>deviceSelectionConfiguration</code> </b> is required in a
     * request.
     * </p>
     * 
     * @param deviceSelectionConfiguration
     *        The filter criteria used to dynamically select a set of devices for a test run, as well as the maximum
     *        number of devices to be included in the run.</p>
     *        <p>
     *        Either <b> <code>devicePoolArn</code> </b> or <b> <code>deviceSelectionConfiguration</code> </b> is
     *        required in a request.
     */

    public void setDeviceSelectionConfiguration(DeviceSelectionConfiguration deviceSelectionConfiguration) {
        this.deviceSelectionConfiguration = deviceSelectionConfiguration;
    }

    /**
     * <p>
     * The filter criteria used to dynamically select a set of devices for a test run, as well as the maximum number of
     * devices to be included in the run.
     * </p>
     * <p>
     * Either <b> <code>devicePoolArn</code> </b> or <b> <code>deviceSelectionConfiguration</code> </b> is required in a
     * request.
     * </p>
     * 
     * @return The filter criteria used to dynamically select a set of devices for a test run, as well as the maximum
     *         number of devices to be included in the run.</p>
     *         <p>
     *         Either <b> <code>devicePoolArn</code> </b> or <b> <code>deviceSelectionConfiguration</code> </b> is
     *         required in a request.
     */

    public DeviceSelectionConfiguration getDeviceSelectionConfiguration() {
        return this.deviceSelectionConfiguration;
    }

    /**
     * <p>
     * The filter criteria used to dynamically select a set of devices for a test run, as well as the maximum number of
     * devices to be included in the run.
     * </p>
     * <p>
     * Either <b> <code>devicePoolArn</code> </b> or <b> <code>deviceSelectionConfiguration</code> </b> is required in a
     * request.
     * </p>
     * 
     * @param deviceSelectionConfiguration
     *        The filter criteria used to dynamically select a set of devices for a test run, as well as the maximum
     *        number of devices to be included in the run.</p>
     *        <p>
     *        Either <b> <code>devicePoolArn</code> </b> or <b> <code>deviceSelectionConfiguration</code> </b> is
     *        required in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunRequest withDeviceSelectionConfiguration(DeviceSelectionConfiguration deviceSelectionConfiguration) {
        setDeviceSelectionConfiguration(deviceSelectionConfiguration);
        return this;
    }

    /**
     * <p>
     * The name for the run to be scheduled.
     * </p>
     * 
     * @param name
     *        The name for the run to be scheduled.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the run to be scheduled.
     * </p>
     * 
     * @return The name for the run to be scheduled.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the run to be scheduled.
     * </p>
     * 
     * @param name
     *        The name for the run to be scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about the test for the run to be scheduled.
     * </p>
     * 
     * @param test
     *        Information about the test for the run to be scheduled.
     */

    public void setTest(ScheduleRunTest test) {
        this.test = test;
    }

    /**
     * <p>
     * Information about the test for the run to be scheduled.
     * </p>
     * 
     * @return Information about the test for the run to be scheduled.
     */

    public ScheduleRunTest getTest() {
        return this.test;
    }

    /**
     * <p>
     * Information about the test for the run to be scheduled.
     * </p>
     * 
     * @param test
     *        Information about the test for the run to be scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunRequest withTest(ScheduleRunTest test) {
        setTest(test);
        return this;
    }

    /**
     * <p>
     * Information about the settings for the run to be scheduled.
     * </p>
     * 
     * @param configuration
     *        Information about the settings for the run to be scheduled.
     */

    public void setConfiguration(ScheduleRunConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Information about the settings for the run to be scheduled.
     * </p>
     * 
     * @return Information about the settings for the run to be scheduled.
     */

    public ScheduleRunConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Information about the settings for the run to be scheduled.
     * </p>
     * 
     * @param configuration
     *        Information about the settings for the run to be scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunRequest withConfiguration(ScheduleRunConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Specifies configuration information about a test run, such as the execution timeout (in minutes).
     * </p>
     * 
     * @param executionConfiguration
     *        Specifies configuration information about a test run, such as the execution timeout (in minutes).
     */

    public void setExecutionConfiguration(ExecutionConfiguration executionConfiguration) {
        this.executionConfiguration = executionConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information about a test run, such as the execution timeout (in minutes).
     * </p>
     * 
     * @return Specifies configuration information about a test run, such as the execution timeout (in minutes).
     */

    public ExecutionConfiguration getExecutionConfiguration() {
        return this.executionConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information about a test run, such as the execution timeout (in minutes).
     * </p>
     * 
     * @param executionConfiguration
     *        Specifies configuration information about a test run, such as the execution timeout (in minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunRequest withExecutionConfiguration(ExecutionConfiguration executionConfiguration) {
        setExecutionConfiguration(executionConfiguration);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getDevicePoolArn() != null)
            sb.append("DevicePoolArn: ").append(getDevicePoolArn()).append(",");
        if (getDeviceSelectionConfiguration() != null)
            sb.append("DeviceSelectionConfiguration: ").append(getDeviceSelectionConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTest() != null)
            sb.append("Test: ").append(getTest()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getExecutionConfiguration() != null)
            sb.append("ExecutionConfiguration: ").append(getExecutionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleRunRequest == false)
            return false;
        ScheduleRunRequest other = (ScheduleRunRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getDevicePoolArn() == null ^ this.getDevicePoolArn() == null)
            return false;
        if (other.getDevicePoolArn() != null && other.getDevicePoolArn().equals(this.getDevicePoolArn()) == false)
            return false;
        if (other.getDeviceSelectionConfiguration() == null ^ this.getDeviceSelectionConfiguration() == null)
            return false;
        if (other.getDeviceSelectionConfiguration() != null && other.getDeviceSelectionConfiguration().equals(this.getDeviceSelectionConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTest() == null ^ this.getTest() == null)
            return false;
        if (other.getTest() != null && other.getTest().equals(this.getTest()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getExecutionConfiguration() == null ^ this.getExecutionConfiguration() == null)
            return false;
        if (other.getExecutionConfiguration() != null && other.getExecutionConfiguration().equals(this.getExecutionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getDevicePoolArn() == null) ? 0 : getDevicePoolArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceSelectionConfiguration() == null) ? 0 : getDeviceSelectionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTest() == null) ? 0 : getTest().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getExecutionConfiguration() == null) ? 0 : getExecutionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleRunRequest clone() {
        return (ScheduleRunRequest) super.clone();
    }

}
