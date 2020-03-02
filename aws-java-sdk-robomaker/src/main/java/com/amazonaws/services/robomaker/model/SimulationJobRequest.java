/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a simulation job request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/SimulationJobRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationJobRequest implements Serializable, Cloneable, StructuredPojo {

    private OutputLocation outputLocation;

    private LoggingConfig loggingConfig;
    /**
     * <p>
     * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
     * </p>
     */
    private Long maxJobDurationInSeconds;
    /**
     * <p>
     * The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its associated
     * policies on your behalf. This is how credentials are passed in to your simulation job.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * The failure behavior the simulation job.
     * </p>
     * <dl>
     * <dt>Continue</dt>
     * <dd>
     * <p>
     * Restart the simulation job in the same host instance.
     * </p>
     * </dd>
     * <dt>Fail</dt>
     * <dd>
     * <p>
     * Stop the simulation job and terminate the instance.
     * </p>
     * </dd>
     * </dl>
     */
    private String failureBehavior;
    /**
     * <p>
     * Boolean indicating whether to use default simulation tool applications.
     * </p>
     */
    private Boolean useDefaultApplications;
    /**
     * <p>
     * The robot applications to use in the simulation job.
     * </p>
     */
    private java.util.List<RobotApplicationConfig> robotApplications;
    /**
     * <p>
     * The simulation applications to use in the simulation job.
     * </p>
     */
    private java.util.List<SimulationApplicationConfig> simulationApplications;
    /**
     * <p>
     * Specify data sources to mount read-only files from S3 into your simulation. These files are available under
     * <code>/opt/robomaker/datasources/data_source_name</code>.
     * </p>
     * <note>
     * <p>
     * There is a limit of 100 files and a combined size of 25GB for all <code>DataSourceConfig</code> objects.
     * </p>
     * </note>
     */
    private java.util.List<DataSourceConfig> dataSources;

    private VPCConfig vpcConfig;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the simulation job request.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * @param outputLocation
     */

    public void setOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * @return
     */

    public OutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * @param outputLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withOutputLocation(OutputLocation outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * @param loggingConfig
     */

    public void setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    /**
     * @return
     */

    public LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    /**
     * @param loggingConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withLoggingConfig(LoggingConfig loggingConfig) {
        setLoggingConfig(loggingConfig);
        return this;
    }

    /**
     * <p>
     * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
     * </p>
     * 
     * @param maxJobDurationInSeconds
     *        The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
     */

    public void setMaxJobDurationInSeconds(Long maxJobDurationInSeconds) {
        this.maxJobDurationInSeconds = maxJobDurationInSeconds;
    }

    /**
     * <p>
     * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
     * </p>
     * 
     * @return The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
     */

    public Long getMaxJobDurationInSeconds() {
        return this.maxJobDurationInSeconds;
    }

    /**
     * <p>
     * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
     * </p>
     * 
     * @param maxJobDurationInSeconds
     *        The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withMaxJobDurationInSeconds(Long maxJobDurationInSeconds) {
        setMaxJobDurationInSeconds(maxJobDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its associated
     * policies on your behalf. This is how credentials are passed in to your simulation job.
     * </p>
     * 
     * @param iamRole
     *        The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its
     *        associated policies on your behalf. This is how credentials are passed in to your simulation job.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its associated
     * policies on your behalf. This is how credentials are passed in to your simulation job.
     * </p>
     * 
     * @return The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its
     *         associated policies on your behalf. This is how credentials are passed in to your simulation job.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its associated
     * policies on your behalf. This is how credentials are passed in to your simulation job.
     * </p>
     * 
     * @param iamRole
     *        The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its
     *        associated policies on your behalf. This is how credentials are passed in to your simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * The failure behavior the simulation job.
     * </p>
     * <dl>
     * <dt>Continue</dt>
     * <dd>
     * <p>
     * Restart the simulation job in the same host instance.
     * </p>
     * </dd>
     * <dt>Fail</dt>
     * <dd>
     * <p>
     * Stop the simulation job and terminate the instance.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureBehavior
     *        The failure behavior the simulation job.</p>
     *        <dl>
     *        <dt>Continue</dt>
     *        <dd>
     *        <p>
     *        Restart the simulation job in the same host instance.
     *        </p>
     *        </dd>
     *        <dt>Fail</dt>
     *        <dd>
     *        <p>
     *        Stop the simulation job and terminate the instance.
     *        </p>
     *        </dd>
     * @see FailureBehavior
     */

    public void setFailureBehavior(String failureBehavior) {
        this.failureBehavior = failureBehavior;
    }

    /**
     * <p>
     * The failure behavior the simulation job.
     * </p>
     * <dl>
     * <dt>Continue</dt>
     * <dd>
     * <p>
     * Restart the simulation job in the same host instance.
     * </p>
     * </dd>
     * <dt>Fail</dt>
     * <dd>
     * <p>
     * Stop the simulation job and terminate the instance.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The failure behavior the simulation job.</p>
     *         <dl>
     *         <dt>Continue</dt>
     *         <dd>
     *         <p>
     *         Restart the simulation job in the same host instance.
     *         </p>
     *         </dd>
     *         <dt>Fail</dt>
     *         <dd>
     *         <p>
     *         Stop the simulation job and terminate the instance.
     *         </p>
     *         </dd>
     * @see FailureBehavior
     */

    public String getFailureBehavior() {
        return this.failureBehavior;
    }

    /**
     * <p>
     * The failure behavior the simulation job.
     * </p>
     * <dl>
     * <dt>Continue</dt>
     * <dd>
     * <p>
     * Restart the simulation job in the same host instance.
     * </p>
     * </dd>
     * <dt>Fail</dt>
     * <dd>
     * <p>
     * Stop the simulation job and terminate the instance.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureBehavior
     *        The failure behavior the simulation job.</p>
     *        <dl>
     *        <dt>Continue</dt>
     *        <dd>
     *        <p>
     *        Restart the simulation job in the same host instance.
     *        </p>
     *        </dd>
     *        <dt>Fail</dt>
     *        <dd>
     *        <p>
     *        Stop the simulation job and terminate the instance.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureBehavior
     */

    public SimulationJobRequest withFailureBehavior(String failureBehavior) {
        setFailureBehavior(failureBehavior);
        return this;
    }

    /**
     * <p>
     * The failure behavior the simulation job.
     * </p>
     * <dl>
     * <dt>Continue</dt>
     * <dd>
     * <p>
     * Restart the simulation job in the same host instance.
     * </p>
     * </dd>
     * <dt>Fail</dt>
     * <dd>
     * <p>
     * Stop the simulation job and terminate the instance.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureBehavior
     *        The failure behavior the simulation job.</p>
     *        <dl>
     *        <dt>Continue</dt>
     *        <dd>
     *        <p>
     *        Restart the simulation job in the same host instance.
     *        </p>
     *        </dd>
     *        <dt>Fail</dt>
     *        <dd>
     *        <p>
     *        Stop the simulation job and terminate the instance.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureBehavior
     */

    public SimulationJobRequest withFailureBehavior(FailureBehavior failureBehavior) {
        this.failureBehavior = failureBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Boolean indicating whether to use default simulation tool applications.
     * </p>
     * 
     * @param useDefaultApplications
     *        Boolean indicating whether to use default simulation tool applications.
     */

    public void setUseDefaultApplications(Boolean useDefaultApplications) {
        this.useDefaultApplications = useDefaultApplications;
    }

    /**
     * <p>
     * Boolean indicating whether to use default simulation tool applications.
     * </p>
     * 
     * @return Boolean indicating whether to use default simulation tool applications.
     */

    public Boolean getUseDefaultApplications() {
        return this.useDefaultApplications;
    }

    /**
     * <p>
     * Boolean indicating whether to use default simulation tool applications.
     * </p>
     * 
     * @param useDefaultApplications
     *        Boolean indicating whether to use default simulation tool applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withUseDefaultApplications(Boolean useDefaultApplications) {
        setUseDefaultApplications(useDefaultApplications);
        return this;
    }

    /**
     * <p>
     * Boolean indicating whether to use default simulation tool applications.
     * </p>
     * 
     * @return Boolean indicating whether to use default simulation tool applications.
     */

    public Boolean isUseDefaultApplications() {
        return this.useDefaultApplications;
    }

    /**
     * <p>
     * The robot applications to use in the simulation job.
     * </p>
     * 
     * @return The robot applications to use in the simulation job.
     */

    public java.util.List<RobotApplicationConfig> getRobotApplications() {
        return robotApplications;
    }

    /**
     * <p>
     * The robot applications to use in the simulation job.
     * </p>
     * 
     * @param robotApplications
     *        The robot applications to use in the simulation job.
     */

    public void setRobotApplications(java.util.Collection<RobotApplicationConfig> robotApplications) {
        if (robotApplications == null) {
            this.robotApplications = null;
            return;
        }

        this.robotApplications = new java.util.ArrayList<RobotApplicationConfig>(robotApplications);
    }

    /**
     * <p>
     * The robot applications to use in the simulation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRobotApplications(java.util.Collection)} or {@link #withRobotApplications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param robotApplications
     *        The robot applications to use in the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withRobotApplications(RobotApplicationConfig... robotApplications) {
        if (this.robotApplications == null) {
            setRobotApplications(new java.util.ArrayList<RobotApplicationConfig>(robotApplications.length));
        }
        for (RobotApplicationConfig ele : robotApplications) {
            this.robotApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The robot applications to use in the simulation job.
     * </p>
     * 
     * @param robotApplications
     *        The robot applications to use in the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withRobotApplications(java.util.Collection<RobotApplicationConfig> robotApplications) {
        setRobotApplications(robotApplications);
        return this;
    }

    /**
     * <p>
     * The simulation applications to use in the simulation job.
     * </p>
     * 
     * @return The simulation applications to use in the simulation job.
     */

    public java.util.List<SimulationApplicationConfig> getSimulationApplications() {
        return simulationApplications;
    }

    /**
     * <p>
     * The simulation applications to use in the simulation job.
     * </p>
     * 
     * @param simulationApplications
     *        The simulation applications to use in the simulation job.
     */

    public void setSimulationApplications(java.util.Collection<SimulationApplicationConfig> simulationApplications) {
        if (simulationApplications == null) {
            this.simulationApplications = null;
            return;
        }

        this.simulationApplications = new java.util.ArrayList<SimulationApplicationConfig>(simulationApplications);
    }

    /**
     * <p>
     * The simulation applications to use in the simulation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSimulationApplications(java.util.Collection)} or
     * {@link #withSimulationApplications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param simulationApplications
     *        The simulation applications to use in the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withSimulationApplications(SimulationApplicationConfig... simulationApplications) {
        if (this.simulationApplications == null) {
            setSimulationApplications(new java.util.ArrayList<SimulationApplicationConfig>(simulationApplications.length));
        }
        for (SimulationApplicationConfig ele : simulationApplications) {
            this.simulationApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The simulation applications to use in the simulation job.
     * </p>
     * 
     * @param simulationApplications
     *        The simulation applications to use in the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withSimulationApplications(java.util.Collection<SimulationApplicationConfig> simulationApplications) {
        setSimulationApplications(simulationApplications);
        return this;
    }

    /**
     * <p>
     * Specify data sources to mount read-only files from S3 into your simulation. These files are available under
     * <code>/opt/robomaker/datasources/data_source_name</code>.
     * </p>
     * <note>
     * <p>
     * There is a limit of 100 files and a combined size of 25GB for all <code>DataSourceConfig</code> objects.
     * </p>
     * </note>
     * 
     * @return Specify data sources to mount read-only files from S3 into your simulation. These files are available
     *         under <code>/opt/robomaker/datasources/data_source_name</code>. </p> <note>
     *         <p>
     *         There is a limit of 100 files and a combined size of 25GB for all <code>DataSourceConfig</code> objects.
     *         </p>
     */

    public java.util.List<DataSourceConfig> getDataSources() {
        return dataSources;
    }

    /**
     * <p>
     * Specify data sources to mount read-only files from S3 into your simulation. These files are available under
     * <code>/opt/robomaker/datasources/data_source_name</code>.
     * </p>
     * <note>
     * <p>
     * There is a limit of 100 files and a combined size of 25GB for all <code>DataSourceConfig</code> objects.
     * </p>
     * </note>
     * 
     * @param dataSources
     *        Specify data sources to mount read-only files from S3 into your simulation. These files are available
     *        under <code>/opt/robomaker/datasources/data_source_name</code>. </p> <note>
     *        <p>
     *        There is a limit of 100 files and a combined size of 25GB for all <code>DataSourceConfig</code> objects.
     *        </p>
     */

    public void setDataSources(java.util.Collection<DataSourceConfig> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }

        this.dataSources = new java.util.ArrayList<DataSourceConfig>(dataSources);
    }

    /**
     * <p>
     * Specify data sources to mount read-only files from S3 into your simulation. These files are available under
     * <code>/opt/robomaker/datasources/data_source_name</code>.
     * </p>
     * <note>
     * <p>
     * There is a limit of 100 files and a combined size of 25GB for all <code>DataSourceConfig</code> objects.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSources(java.util.Collection)} or {@link #withDataSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSources
     *        Specify data sources to mount read-only files from S3 into your simulation. These files are available
     *        under <code>/opt/robomaker/datasources/data_source_name</code>. </p> <note>
     *        <p>
     *        There is a limit of 100 files and a combined size of 25GB for all <code>DataSourceConfig</code> objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withDataSources(DataSourceConfig... dataSources) {
        if (this.dataSources == null) {
            setDataSources(new java.util.ArrayList<DataSourceConfig>(dataSources.length));
        }
        for (DataSourceConfig ele : dataSources) {
            this.dataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify data sources to mount read-only files from S3 into your simulation. These files are available under
     * <code>/opt/robomaker/datasources/data_source_name</code>.
     * </p>
     * <note>
     * <p>
     * There is a limit of 100 files and a combined size of 25GB for all <code>DataSourceConfig</code> objects.
     * </p>
     * </note>
     * 
     * @param dataSources
     *        Specify data sources to mount read-only files from S3 into your simulation. These files are available
     *        under <code>/opt/robomaker/datasources/data_source_name</code>. </p> <note>
     *        <p>
     *        There is a limit of 100 files and a combined size of 25GB for all <code>DataSourceConfig</code> objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withDataSources(java.util.Collection<DataSourceConfig> dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withVpcConfig(VPCConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the simulation job request.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the simulation job request.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the simulation job request.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the simulation job request.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the simulation job request.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the simulation job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SimulationJobRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobRequest clearTagsEntries() {
        this.tags = null;
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
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getLoggingConfig() != null)
            sb.append("LoggingConfig: ").append(getLoggingConfig()).append(",");
        if (getMaxJobDurationInSeconds() != null)
            sb.append("MaxJobDurationInSeconds: ").append(getMaxJobDurationInSeconds()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getFailureBehavior() != null)
            sb.append("FailureBehavior: ").append(getFailureBehavior()).append(",");
        if (getUseDefaultApplications() != null)
            sb.append("UseDefaultApplications: ").append(getUseDefaultApplications()).append(",");
        if (getRobotApplications() != null)
            sb.append("RobotApplications: ").append(getRobotApplications()).append(",");
        if (getSimulationApplications() != null)
            sb.append("SimulationApplications: ").append(getSimulationApplications()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimulationJobRequest == false)
            return false;
        SimulationJobRequest other = (SimulationJobRequest) obj;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getLoggingConfig() == null ^ this.getLoggingConfig() == null)
            return false;
        if (other.getLoggingConfig() != null && other.getLoggingConfig().equals(this.getLoggingConfig()) == false)
            return false;
        if (other.getMaxJobDurationInSeconds() == null ^ this.getMaxJobDurationInSeconds() == null)
            return false;
        if (other.getMaxJobDurationInSeconds() != null && other.getMaxJobDurationInSeconds().equals(this.getMaxJobDurationInSeconds()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getFailureBehavior() == null ^ this.getFailureBehavior() == null)
            return false;
        if (other.getFailureBehavior() != null && other.getFailureBehavior().equals(this.getFailureBehavior()) == false)
            return false;
        if (other.getUseDefaultApplications() == null ^ this.getUseDefaultApplications() == null)
            return false;
        if (other.getUseDefaultApplications() != null && other.getUseDefaultApplications().equals(this.getUseDefaultApplications()) == false)
            return false;
        if (other.getRobotApplications() == null ^ this.getRobotApplications() == null)
            return false;
        if (other.getRobotApplications() != null && other.getRobotApplications().equals(this.getRobotApplications()) == false)
            return false;
        if (other.getSimulationApplications() == null ^ this.getSimulationApplications() == null)
            return false;
        if (other.getSimulationApplications() != null && other.getSimulationApplications().equals(this.getSimulationApplications()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfig() == null) ? 0 : getLoggingConfig().hashCode());
        hashCode = prime * hashCode + ((getMaxJobDurationInSeconds() == null) ? 0 : getMaxJobDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getFailureBehavior() == null) ? 0 : getFailureBehavior().hashCode());
        hashCode = prime * hashCode + ((getUseDefaultApplications() == null) ? 0 : getUseDefaultApplications().hashCode());
        hashCode = prime * hashCode + ((getRobotApplications() == null) ? 0 : getRobotApplications().hashCode());
        hashCode = prime * hashCode + ((getSimulationApplications() == null) ? 0 : getSimulationApplications().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SimulationJobRequest clone() {
        try {
            return (SimulationJobRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.SimulationJobRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
