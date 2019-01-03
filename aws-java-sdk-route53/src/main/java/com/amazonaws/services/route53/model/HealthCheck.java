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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains information about one health check that is associated with the current AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/HealthCheck" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheck implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier that Amazon Route 53assigned to the health check when you created it. When you add or update a
     * resource record set, you use this value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A unique string that you specified when you created the health check.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * If the health check was created by another service, the service that created the health check. When a health
     * check is created by another service, you can't edit or delete it using Amazon Route 53.
     * </p>
     */
    private LinkedService linkedService;
    /**
     * <p>
     * A complex type that contains detailed information about one health check.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;
    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a call to <code>UpdateHealthCheck</code>
     * to prevent overwriting another change to the health check.
     * </p>
     */
    private Long healthCheckVersion;
    /**
     * <p>
     * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this
     * health check.
     * </p>
     */
    private CloudWatchAlarmConfiguration cloudWatchAlarmConfiguration;

    /**
     * <p>
     * The identifier that Amazon Route 53assigned to the health check when you created it. When you add or update a
     * resource record set, you use this value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * 
     * @param id
     *        The identifier that Amazon Route 53assigned to the health check when you created it. When you add or
     *        update a resource record set, you use this value to specify which health check to use. The value can be up
     *        to 64 characters long.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier that Amazon Route 53assigned to the health check when you created it. When you add or update a
     * resource record set, you use this value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * 
     * @return The identifier that Amazon Route 53assigned to the health check when you created it. When you add or
     *         update a resource record set, you use this value to specify which health check to use. The value can be
     *         up to 64 characters long.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier that Amazon Route 53assigned to the health check when you created it. When you add or update a
     * resource record set, you use this value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * 
     * @param id
     *        The identifier that Amazon Route 53assigned to the health check when you created it. When you add or
     *        update a resource record set, you use this value to specify which health check to use. The value can be up
     *        to 64 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A unique string that you specified when you created the health check.
     * </p>
     * 
     * @param callerReference
     *        A unique string that you specified when you created the health check.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that you specified when you created the health check.
     * </p>
     * 
     * @return A unique string that you specified when you created the health check.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that you specified when you created the health check.
     * </p>
     * 
     * @param callerReference
     *        A unique string that you specified when you created the health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * If the health check was created by another service, the service that created the health check. When a health
     * check is created by another service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * 
     * @param linkedService
     *        If the health check was created by another service, the service that created the health check. When a
     *        health check is created by another service, you can't edit or delete it using Amazon Route 53.
     */

    public void setLinkedService(LinkedService linkedService) {
        this.linkedService = linkedService;
    }

    /**
     * <p>
     * If the health check was created by another service, the service that created the health check. When a health
     * check is created by another service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * 
     * @return If the health check was created by another service, the service that created the health check. When a
     *         health check is created by another service, you can't edit or delete it using Amazon Route 53.
     */

    public LinkedService getLinkedService() {
        return this.linkedService;
    }

    /**
     * <p>
     * If the health check was created by another service, the service that created the health check. When a health
     * check is created by another service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * 
     * @param linkedService
     *        If the health check was created by another service, the service that created the health check. When a
     *        health check is created by another service, you can't edit or delete it using Amazon Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withLinkedService(LinkedService linkedService) {
        setLinkedService(linkedService);
        return this;
    }

    /**
     * <p>
     * A complex type that contains detailed information about one health check.
     * </p>
     * 
     * @param healthCheckConfig
     *        A complex type that contains detailed information about one health check.
     */

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains detailed information about one health check.
     * </p>
     * 
     * @return A complex type that contains detailed information about one health check.
     */

    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains detailed information about one health check.
     * </p>
     * 
     * @param healthCheckConfig
     *        A complex type that contains detailed information about one health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        setHealthCheckConfig(healthCheckConfig);
        return this;
    }

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a call to <code>UpdateHealthCheck</code>
     * to prevent overwriting another change to the health check.
     * </p>
     * 
     * @param healthCheckVersion
     *        The version of the health check. You can optionally pass this value in a call to
     *        <code>UpdateHealthCheck</code> to prevent overwriting another change to the health check.
     */

    public void setHealthCheckVersion(Long healthCheckVersion) {
        this.healthCheckVersion = healthCheckVersion;
    }

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a call to <code>UpdateHealthCheck</code>
     * to prevent overwriting another change to the health check.
     * </p>
     * 
     * @return The version of the health check. You can optionally pass this value in a call to
     *         <code>UpdateHealthCheck</code> to prevent overwriting another change to the health check.
     */

    public Long getHealthCheckVersion() {
        return this.healthCheckVersion;
    }

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a call to <code>UpdateHealthCheck</code>
     * to prevent overwriting another change to the health check.
     * </p>
     * 
     * @param healthCheckVersion
     *        The version of the health check. You can optionally pass this value in a call to
     *        <code>UpdateHealthCheck</code> to prevent overwriting another change to the health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withHealthCheckVersion(Long healthCheckVersion) {
        setHealthCheckVersion(healthCheckVersion);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this
     * health check.
     * </p>
     * 
     * @param cloudWatchAlarmConfiguration
     *        A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for
     *        this health check.
     */

    public void setCloudWatchAlarmConfiguration(CloudWatchAlarmConfiguration cloudWatchAlarmConfiguration) {
        this.cloudWatchAlarmConfiguration = cloudWatchAlarmConfiguration;
    }

    /**
     * <p>
     * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this
     * health check.
     * </p>
     * 
     * @return A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring
     *         for this health check.
     */

    public CloudWatchAlarmConfiguration getCloudWatchAlarmConfiguration() {
        return this.cloudWatchAlarmConfiguration;
    }

    /**
     * <p>
     * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this
     * health check.
     * </p>
     * 
     * @param cloudWatchAlarmConfiguration
     *        A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for
     *        this health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheck withCloudWatchAlarmConfiguration(CloudWatchAlarmConfiguration cloudWatchAlarmConfiguration) {
        setCloudWatchAlarmConfiguration(cloudWatchAlarmConfiguration);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getLinkedService() != null)
            sb.append("LinkedService: ").append(getLinkedService()).append(",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: ").append(getHealthCheckConfig()).append(",");
        if (getHealthCheckVersion() != null)
            sb.append("HealthCheckVersion: ").append(getHealthCheckVersion()).append(",");
        if (getCloudWatchAlarmConfiguration() != null)
            sb.append("CloudWatchAlarmConfiguration: ").append(getCloudWatchAlarmConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheck == false)
            return false;
        HealthCheck other = (HealthCheck) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getLinkedService() == null ^ this.getLinkedService() == null)
            return false;
        if (other.getLinkedService() != null && other.getLinkedService().equals(this.getLinkedService()) == false)
            return false;
        if (other.getHealthCheckConfig() == null ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null && other.getHealthCheckConfig().equals(this.getHealthCheckConfig()) == false)
            return false;
        if (other.getHealthCheckVersion() == null ^ this.getHealthCheckVersion() == null)
            return false;
        if (other.getHealthCheckVersion() != null && other.getHealthCheckVersion().equals(this.getHealthCheckVersion()) == false)
            return false;
        if (other.getCloudWatchAlarmConfiguration() == null ^ this.getCloudWatchAlarmConfiguration() == null)
            return false;
        if (other.getCloudWatchAlarmConfiguration() != null && other.getCloudWatchAlarmConfiguration().equals(this.getCloudWatchAlarmConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getLinkedService() == null) ? 0 : getLinkedService().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckVersion() == null) ? 0 : getHealthCheckVersion().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchAlarmConfiguration() == null) ? 0 : getCloudWatchAlarmConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheck clone() {
        try {
            return (HealthCheck) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
