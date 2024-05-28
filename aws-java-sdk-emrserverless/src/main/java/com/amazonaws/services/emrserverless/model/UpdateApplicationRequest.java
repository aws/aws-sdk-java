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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/UpdateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application to update.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The client idempotency token of the application to update. Its value must be unique for each request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The capacity to initialize when the application is updated.
     * </p>
     */
    private java.util.Map<String, InitialCapacityConfig> initialCapacity;
    /**
     * <p>
     * The maximum capacity to allocate when the application is updated. This is cumulative across all workers at any
     * given point in time during the lifespan of the application. No new resources will be created once any one of the
     * defined limits is hit.
     * </p>
     */
    private MaximumAllowedResources maximumCapacity;
    /**
     * <p>
     * The configuration for an application to automatically start on job submission.
     * </p>
     */
    private AutoStartConfig autoStartConfiguration;
    /**
     * <p>
     * The configuration for an application to automatically stop after a certain amount of time being idle.
     * </p>
     */
    private AutoStopConfig autoStopConfiguration;

    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The image configuration to be used for all worker types. You can either set this parameter or
     * <code>imageConfiguration</code> for each worker type in <code>WorkerTypeSpecificationInput</code>.
     * </p>
     */
    private ImageConfigurationInput imageConfiguration;
    /**
     * <p>
     * The key-value pairs that specify worker type to <code>WorkerTypeSpecificationInput</code>. This parameter must
     * contain all valid worker types for a Spark or Hive application. Valid worker types include <code>Driver</code>
     * and <code>Executor</code> for Spark applications and <code>HiveDriver</code> and <code>TezTask</code> for Hive
     * applications. You can either set image details in this parameter for each worker type, or in
     * <code>imageConfiguration</code> for all worker types.
     * </p>
     */
    private java.util.Map<String, WorkerTypeSpecificationInput> workerTypeSpecifications;
    /**
     * <p>
     * The interactive configuration object that contains new interactive use cases when the application is updated.
     * </p>
     */
    private InteractiveConfiguration interactiveConfiguration;
    /**
     * <p>
     * The Amazon EMR release label for the application. You can change the release label to use a different release of
     * Amazon EMR.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html">Configuration</a>
     * specifications to use when updating an application. Each configuration consists of a classification and
     * properties. This configuration is applied across all the job runs submitted under the application.
     * </p>
     */
    private java.util.List<Configuration> runtimeConfiguration;
    /**
     * <p>
     * The configuration setting for monitoring.
     * </p>
     */
    private MonitoringConfiguration monitoringConfiguration;

    /**
     * <p>
     * The ID of the application to update.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application to update.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application to update.
     * </p>
     * 
     * @return The ID of the application to update.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application to update.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The client idempotency token of the application to update. Its value must be unique for each request.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token of the application to update. Its value must be unique for each request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client idempotency token of the application to update. Its value must be unique for each request.
     * </p>
     * 
     * @return The client idempotency token of the application to update. Its value must be unique for each request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client idempotency token of the application to update. Its value must be unique for each request.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token of the application to update. Its value must be unique for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The capacity to initialize when the application is updated.
     * </p>
     * 
     * @return The capacity to initialize when the application is updated.
     */

    public java.util.Map<String, InitialCapacityConfig> getInitialCapacity() {
        return initialCapacity;
    }

    /**
     * <p>
     * The capacity to initialize when the application is updated.
     * </p>
     * 
     * @param initialCapacity
     *        The capacity to initialize when the application is updated.
     */

    public void setInitialCapacity(java.util.Map<String, InitialCapacityConfig> initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    /**
     * <p>
     * The capacity to initialize when the application is updated.
     * </p>
     * 
     * @param initialCapacity
     *        The capacity to initialize when the application is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withInitialCapacity(java.util.Map<String, InitialCapacityConfig> initialCapacity) {
        setInitialCapacity(initialCapacity);
        return this;
    }

    /**
     * Add a single InitialCapacity entry
     *
     * @see UpdateApplicationRequest#withInitialCapacity
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest addInitialCapacityEntry(String key, InitialCapacityConfig value) {
        if (null == this.initialCapacity) {
            this.initialCapacity = new java.util.HashMap<String, InitialCapacityConfig>();
        }
        if (this.initialCapacity.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.initialCapacity.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InitialCapacity.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest clearInitialCapacityEntries() {
        this.initialCapacity = null;
        return this;
    }

    /**
     * <p>
     * The maximum capacity to allocate when the application is updated. This is cumulative across all workers at any
     * given point in time during the lifespan of the application. No new resources will be created once any one of the
     * defined limits is hit.
     * </p>
     * 
     * @param maximumCapacity
     *        The maximum capacity to allocate when the application is updated. This is cumulative across all workers at
     *        any given point in time during the lifespan of the application. No new resources will be created once any
     *        one of the defined limits is hit.
     */

    public void setMaximumCapacity(MaximumAllowedResources maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    /**
     * <p>
     * The maximum capacity to allocate when the application is updated. This is cumulative across all workers at any
     * given point in time during the lifespan of the application. No new resources will be created once any one of the
     * defined limits is hit.
     * </p>
     * 
     * @return The maximum capacity to allocate when the application is updated. This is cumulative across all workers
     *         at any given point in time during the lifespan of the application. No new resources will be created once
     *         any one of the defined limits is hit.
     */

    public MaximumAllowedResources getMaximumCapacity() {
        return this.maximumCapacity;
    }

    /**
     * <p>
     * The maximum capacity to allocate when the application is updated. This is cumulative across all workers at any
     * given point in time during the lifespan of the application. No new resources will be created once any one of the
     * defined limits is hit.
     * </p>
     * 
     * @param maximumCapacity
     *        The maximum capacity to allocate when the application is updated. This is cumulative across all workers at
     *        any given point in time during the lifespan of the application. No new resources will be created once any
     *        one of the defined limits is hit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withMaximumCapacity(MaximumAllowedResources maximumCapacity) {
        setMaximumCapacity(maximumCapacity);
        return this;
    }

    /**
     * <p>
     * The configuration for an application to automatically start on job submission.
     * </p>
     * 
     * @param autoStartConfiguration
     *        The configuration for an application to automatically start on job submission.
     */

    public void setAutoStartConfiguration(AutoStartConfig autoStartConfiguration) {
        this.autoStartConfiguration = autoStartConfiguration;
    }

    /**
     * <p>
     * The configuration for an application to automatically start on job submission.
     * </p>
     * 
     * @return The configuration for an application to automatically start on job submission.
     */

    public AutoStartConfig getAutoStartConfiguration() {
        return this.autoStartConfiguration;
    }

    /**
     * <p>
     * The configuration for an application to automatically start on job submission.
     * </p>
     * 
     * @param autoStartConfiguration
     *        The configuration for an application to automatically start on job submission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withAutoStartConfiguration(AutoStartConfig autoStartConfiguration) {
        setAutoStartConfiguration(autoStartConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for an application to automatically stop after a certain amount of time being idle.
     * </p>
     * 
     * @param autoStopConfiguration
     *        The configuration for an application to automatically stop after a certain amount of time being idle.
     */

    public void setAutoStopConfiguration(AutoStopConfig autoStopConfiguration) {
        this.autoStopConfiguration = autoStopConfiguration;
    }

    /**
     * <p>
     * The configuration for an application to automatically stop after a certain amount of time being idle.
     * </p>
     * 
     * @return The configuration for an application to automatically stop after a certain amount of time being idle.
     */

    public AutoStopConfig getAutoStopConfiguration() {
        return this.autoStopConfiguration;
    }

    /**
     * <p>
     * The configuration for an application to automatically stop after a certain amount of time being idle.
     * </p>
     * 
     * @param autoStopConfiguration
     *        The configuration for an application to automatically stop after a certain amount of time being idle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withAutoStopConfiguration(AutoStopConfig autoStopConfiguration) {
        setAutoStopConfiguration(autoStopConfiguration);
        return this;
    }

    /**
     * @param networkConfiguration
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * @return
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @param networkConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of an application.
     * @see Architecture
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @return The CPU architecture of an application.
     * @see Architecture
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public UpdateApplicationRequest withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public UpdateApplicationRequest withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * The image configuration to be used for all worker types. You can either set this parameter or
     * <code>imageConfiguration</code> for each worker type in <code>WorkerTypeSpecificationInput</code>.
     * </p>
     * 
     * @param imageConfiguration
     *        The image configuration to be used for all worker types. You can either set this parameter or
     *        <code>imageConfiguration</code> for each worker type in <code>WorkerTypeSpecificationInput</code>.
     */

    public void setImageConfiguration(ImageConfigurationInput imageConfiguration) {
        this.imageConfiguration = imageConfiguration;
    }

    /**
     * <p>
     * The image configuration to be used for all worker types. You can either set this parameter or
     * <code>imageConfiguration</code> for each worker type in <code>WorkerTypeSpecificationInput</code>.
     * </p>
     * 
     * @return The image configuration to be used for all worker types. You can either set this parameter or
     *         <code>imageConfiguration</code> for each worker type in <code>WorkerTypeSpecificationInput</code>.
     */

    public ImageConfigurationInput getImageConfiguration() {
        return this.imageConfiguration;
    }

    /**
     * <p>
     * The image configuration to be used for all worker types. You can either set this parameter or
     * <code>imageConfiguration</code> for each worker type in <code>WorkerTypeSpecificationInput</code>.
     * </p>
     * 
     * @param imageConfiguration
     *        The image configuration to be used for all worker types. You can either set this parameter or
     *        <code>imageConfiguration</code> for each worker type in <code>WorkerTypeSpecificationInput</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withImageConfiguration(ImageConfigurationInput imageConfiguration) {
        setImageConfiguration(imageConfiguration);
        return this;
    }

    /**
     * <p>
     * The key-value pairs that specify worker type to <code>WorkerTypeSpecificationInput</code>. This parameter must
     * contain all valid worker types for a Spark or Hive application. Valid worker types include <code>Driver</code>
     * and <code>Executor</code> for Spark applications and <code>HiveDriver</code> and <code>TezTask</code> for Hive
     * applications. You can either set image details in this parameter for each worker type, or in
     * <code>imageConfiguration</code> for all worker types.
     * </p>
     * 
     * @return The key-value pairs that specify worker type to <code>WorkerTypeSpecificationInput</code>. This parameter
     *         must contain all valid worker types for a Spark or Hive application. Valid worker types include
     *         <code>Driver</code> and <code>Executor</code> for Spark applications and <code>HiveDriver</code> and
     *         <code>TezTask</code> for Hive applications. You can either set image details in this parameter for each
     *         worker type, or in <code>imageConfiguration</code> for all worker types.
     */

    public java.util.Map<String, WorkerTypeSpecificationInput> getWorkerTypeSpecifications() {
        return workerTypeSpecifications;
    }

    /**
     * <p>
     * The key-value pairs that specify worker type to <code>WorkerTypeSpecificationInput</code>. This parameter must
     * contain all valid worker types for a Spark or Hive application. Valid worker types include <code>Driver</code>
     * and <code>Executor</code> for Spark applications and <code>HiveDriver</code> and <code>TezTask</code> for Hive
     * applications. You can either set image details in this parameter for each worker type, or in
     * <code>imageConfiguration</code> for all worker types.
     * </p>
     * 
     * @param workerTypeSpecifications
     *        The key-value pairs that specify worker type to <code>WorkerTypeSpecificationInput</code>. This parameter
     *        must contain all valid worker types for a Spark or Hive application. Valid worker types include
     *        <code>Driver</code> and <code>Executor</code> for Spark applications and <code>HiveDriver</code> and
     *        <code>TezTask</code> for Hive applications. You can either set image details in this parameter for each
     *        worker type, or in <code>imageConfiguration</code> for all worker types.
     */

    public void setWorkerTypeSpecifications(java.util.Map<String, WorkerTypeSpecificationInput> workerTypeSpecifications) {
        this.workerTypeSpecifications = workerTypeSpecifications;
    }

    /**
     * <p>
     * The key-value pairs that specify worker type to <code>WorkerTypeSpecificationInput</code>. This parameter must
     * contain all valid worker types for a Spark or Hive application. Valid worker types include <code>Driver</code>
     * and <code>Executor</code> for Spark applications and <code>HiveDriver</code> and <code>TezTask</code> for Hive
     * applications. You can either set image details in this parameter for each worker type, or in
     * <code>imageConfiguration</code> for all worker types.
     * </p>
     * 
     * @param workerTypeSpecifications
     *        The key-value pairs that specify worker type to <code>WorkerTypeSpecificationInput</code>. This parameter
     *        must contain all valid worker types for a Spark or Hive application. Valid worker types include
     *        <code>Driver</code> and <code>Executor</code> for Spark applications and <code>HiveDriver</code> and
     *        <code>TezTask</code> for Hive applications. You can either set image details in this parameter for each
     *        worker type, or in <code>imageConfiguration</code> for all worker types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withWorkerTypeSpecifications(java.util.Map<String, WorkerTypeSpecificationInput> workerTypeSpecifications) {
        setWorkerTypeSpecifications(workerTypeSpecifications);
        return this;
    }

    /**
     * Add a single WorkerTypeSpecifications entry
     *
     * @see UpdateApplicationRequest#withWorkerTypeSpecifications
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest addWorkerTypeSpecificationsEntry(String key, WorkerTypeSpecificationInput value) {
        if (null == this.workerTypeSpecifications) {
            this.workerTypeSpecifications = new java.util.HashMap<String, WorkerTypeSpecificationInput>();
        }
        if (this.workerTypeSpecifications.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.workerTypeSpecifications.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into WorkerTypeSpecifications.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest clearWorkerTypeSpecificationsEntries() {
        this.workerTypeSpecifications = null;
        return this;
    }

    /**
     * <p>
     * The interactive configuration object that contains new interactive use cases when the application is updated.
     * </p>
     * 
     * @param interactiveConfiguration
     *        The interactive configuration object that contains new interactive use cases when the application is
     *        updated.
     */

    public void setInteractiveConfiguration(InteractiveConfiguration interactiveConfiguration) {
        this.interactiveConfiguration = interactiveConfiguration;
    }

    /**
     * <p>
     * The interactive configuration object that contains new interactive use cases when the application is updated.
     * </p>
     * 
     * @return The interactive configuration object that contains new interactive use cases when the application is
     *         updated.
     */

    public InteractiveConfiguration getInteractiveConfiguration() {
        return this.interactiveConfiguration;
    }

    /**
     * <p>
     * The interactive configuration object that contains new interactive use cases when the application is updated.
     * </p>
     * 
     * @param interactiveConfiguration
     *        The interactive configuration object that contains new interactive use cases when the application is
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withInteractiveConfiguration(InteractiveConfiguration interactiveConfiguration) {
        setInteractiveConfiguration(interactiveConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon EMR release label for the application. You can change the release label to use a different release of
     * Amazon EMR.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release label for the application. You can change the release label to use a different
     *        release of Amazon EMR.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release label for the application. You can change the release label to use a different release of
     * Amazon EMR.
     * </p>
     * 
     * @return The Amazon EMR release label for the application. You can change the release label to use a different
     *         release of Amazon EMR.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release label for the application. You can change the release label to use a different release of
     * Amazon EMR.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release label for the application. You can change the release label to use a different
     *        release of Amazon EMR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html">Configuration</a>
     * specifications to use when updating an application. Each configuration consists of a classification and
     * properties. This configuration is applied across all the job runs submitted under the application.
     * </p>
     * 
     * @return The <a
     *         href="https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html">Configuration
     *         </a> specifications to use when updating an application. Each configuration consists of a classification
     *         and properties. This configuration is applied across all the job runs submitted under the application.
     */

    public java.util.List<Configuration> getRuntimeConfiguration() {
        return runtimeConfiguration;
    }

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html">Configuration</a>
     * specifications to use when updating an application. Each configuration consists of a classification and
     * properties. This configuration is applied across all the job runs submitted under the application.
     * </p>
     * 
     * @param runtimeConfiguration
     *        The <a href="https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html">
     *        Configuration</a> specifications to use when updating an application. Each configuration consists of a
     *        classification and properties. This configuration is applied across all the job runs submitted under the
     *        application.
     */

    public void setRuntimeConfiguration(java.util.Collection<Configuration> runtimeConfiguration) {
        if (runtimeConfiguration == null) {
            this.runtimeConfiguration = null;
            return;
        }

        this.runtimeConfiguration = new java.util.ArrayList<Configuration>(runtimeConfiguration);
    }

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html">Configuration</a>
     * specifications to use when updating an application. Each configuration consists of a classification and
     * properties. This configuration is applied across all the job runs submitted under the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuntimeConfiguration(java.util.Collection)} or {@link #withRuntimeConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param runtimeConfiguration
     *        The <a href="https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html">
     *        Configuration</a> specifications to use when updating an application. Each configuration consists of a
     *        classification and properties. This configuration is applied across all the job runs submitted under the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withRuntimeConfiguration(Configuration... runtimeConfiguration) {
        if (this.runtimeConfiguration == null) {
            setRuntimeConfiguration(new java.util.ArrayList<Configuration>(runtimeConfiguration.length));
        }
        for (Configuration ele : runtimeConfiguration) {
            this.runtimeConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html">Configuration</a>
     * specifications to use when updating an application. Each configuration consists of a classification and
     * properties. This configuration is applied across all the job runs submitted under the application.
     * </p>
     * 
     * @param runtimeConfiguration
     *        The <a href="https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html">
     *        Configuration</a> specifications to use when updating an application. Each configuration consists of a
     *        classification and properties. This configuration is applied across all the job runs submitted under the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withRuntimeConfiguration(java.util.Collection<Configuration> runtimeConfiguration) {
        setRuntimeConfiguration(runtimeConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration setting for monitoring.
     * </p>
     * 
     * @param monitoringConfiguration
     *        The configuration setting for monitoring.
     */

    public void setMonitoringConfiguration(MonitoringConfiguration monitoringConfiguration) {
        this.monitoringConfiguration = monitoringConfiguration;
    }

    /**
     * <p>
     * The configuration setting for monitoring.
     * </p>
     * 
     * @return The configuration setting for monitoring.
     */

    public MonitoringConfiguration getMonitoringConfiguration() {
        return this.monitoringConfiguration;
    }

    /**
     * <p>
     * The configuration setting for monitoring.
     * </p>
     * 
     * @param monitoringConfiguration
     *        The configuration setting for monitoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withMonitoringConfiguration(MonitoringConfiguration monitoringConfiguration) {
        setMonitoringConfiguration(monitoringConfiguration);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInitialCapacity() != null)
            sb.append("InitialCapacity: ").append(getInitialCapacity()).append(",");
        if (getMaximumCapacity() != null)
            sb.append("MaximumCapacity: ").append(getMaximumCapacity()).append(",");
        if (getAutoStartConfiguration() != null)
            sb.append("AutoStartConfiguration: ").append(getAutoStartConfiguration()).append(",");
        if (getAutoStopConfiguration() != null)
            sb.append("AutoStopConfiguration: ").append(getAutoStopConfiguration()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getImageConfiguration() != null)
            sb.append("ImageConfiguration: ").append(getImageConfiguration()).append(",");
        if (getWorkerTypeSpecifications() != null)
            sb.append("WorkerTypeSpecifications: ").append(getWorkerTypeSpecifications()).append(",");
        if (getInteractiveConfiguration() != null)
            sb.append("InteractiveConfiguration: ").append(getInteractiveConfiguration()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getRuntimeConfiguration() != null)
            sb.append("RuntimeConfiguration: ").append(getRuntimeConfiguration()).append(",");
        if (getMonitoringConfiguration() != null)
            sb.append("MonitoringConfiguration: ").append(getMonitoringConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInitialCapacity() == null ^ this.getInitialCapacity() == null)
            return false;
        if (other.getInitialCapacity() != null && other.getInitialCapacity().equals(this.getInitialCapacity()) == false)
            return false;
        if (other.getMaximumCapacity() == null ^ this.getMaximumCapacity() == null)
            return false;
        if (other.getMaximumCapacity() != null && other.getMaximumCapacity().equals(this.getMaximumCapacity()) == false)
            return false;
        if (other.getAutoStartConfiguration() == null ^ this.getAutoStartConfiguration() == null)
            return false;
        if (other.getAutoStartConfiguration() != null && other.getAutoStartConfiguration().equals(this.getAutoStartConfiguration()) == false)
            return false;
        if (other.getAutoStopConfiguration() == null ^ this.getAutoStopConfiguration() == null)
            return false;
        if (other.getAutoStopConfiguration() != null && other.getAutoStopConfiguration().equals(this.getAutoStopConfiguration()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getImageConfiguration() == null ^ this.getImageConfiguration() == null)
            return false;
        if (other.getImageConfiguration() != null && other.getImageConfiguration().equals(this.getImageConfiguration()) == false)
            return false;
        if (other.getWorkerTypeSpecifications() == null ^ this.getWorkerTypeSpecifications() == null)
            return false;
        if (other.getWorkerTypeSpecifications() != null && other.getWorkerTypeSpecifications().equals(this.getWorkerTypeSpecifications()) == false)
            return false;
        if (other.getInteractiveConfiguration() == null ^ this.getInteractiveConfiguration() == null)
            return false;
        if (other.getInteractiveConfiguration() != null && other.getInteractiveConfiguration().equals(this.getInteractiveConfiguration()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getRuntimeConfiguration() == null ^ this.getRuntimeConfiguration() == null)
            return false;
        if (other.getRuntimeConfiguration() != null && other.getRuntimeConfiguration().equals(this.getRuntimeConfiguration()) == false)
            return false;
        if (other.getMonitoringConfiguration() == null ^ this.getMonitoringConfiguration() == null)
            return false;
        if (other.getMonitoringConfiguration() != null && other.getMonitoringConfiguration().equals(this.getMonitoringConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInitialCapacity() == null) ? 0 : getInitialCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaximumCapacity() == null) ? 0 : getMaximumCapacity().hashCode());
        hashCode = prime * hashCode + ((getAutoStartConfiguration() == null) ? 0 : getAutoStartConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoStopConfiguration() == null) ? 0 : getAutoStopConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getImageConfiguration() == null) ? 0 : getImageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWorkerTypeSpecifications() == null) ? 0 : getWorkerTypeSpecifications().hashCode());
        hashCode = prime * hashCode + ((getInteractiveConfiguration() == null) ? 0 : getInteractiveConfiguration().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getRuntimeConfiguration() == null) ? 0 : getRuntimeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMonitoringConfiguration() == null) ? 0 : getMonitoringConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
