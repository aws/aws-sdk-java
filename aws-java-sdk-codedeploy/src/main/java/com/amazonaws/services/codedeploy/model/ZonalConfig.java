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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configure the <code>ZonalConfig</code> object if you want CodeDeploy to deploy your application to one <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-availability-zones"
 * >Availability Zone</a> at a time, within an Amazon Web Services Region. By deploying to one Availability Zone at a
 * time, you can expose your deployment to a progressively larger audience as confidence in the deployment's performance
 * and viability grows. If you don't configure the <code>ZonalConfig</code> object, CodeDeploy deploys your application
 * to a random selection of hosts across a Region.
 * </p>
 * <p>
 * For more information about the zonal configuration feature, see <a
 * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
 * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ZonalConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZonalConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to the <i>first</i>
     * Availability Zone. CodeDeploy will wait this amount of time before starting a deployment to the second
     * Availability Zone. You might set this option if you want to allow extra bake time for the first Availability
     * Zone. If you don't specify a value for <code>firstZoneMonitorDurationInSeconds</code>, then CodeDeploy uses the
     * <code>monitorDurationInSeconds</code> value for the first Availability Zone.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     */
    private Long firstZoneMonitorDurationInSeconds;
    /**
     * <p>
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to an Availability Zone.
     * CodeDeploy will wait this amount of time before starting a deployment to the next Availability Zone. Consider
     * adding a monitor duration to give the deployment some time to prove itself (or 'bake') in one Availability Zone
     * before it is released in the next zone. If you don't specify a <code>monitorDurationInSeconds</code>, CodeDeploy
     * starts deploying to the next Availability Zone immediately.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     */
    private Long monitorDurationInSeconds;
    /**
     * <p>
     * The number or percentage of instances that must remain available per Availability Zone during a deployment. This
     * option works in conjunction with the <code>MinimumHealthyHosts</code> option. For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az"
     * >About the minimum number of healthy hosts per Availability Zone</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * If you don't specify the <code>minimumHealthyHostsPerZone</code> option, then CodeDeploy uses a default value of
     * <code>0</code> percent.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     */
    private MinimumHealthyHostsPerZone minimumHealthyHostsPerZone;

    /**
     * <p>
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to the <i>first</i>
     * Availability Zone. CodeDeploy will wait this amount of time before starting a deployment to the second
     * Availability Zone. You might set this option if you want to allow extra bake time for the first Availability
     * Zone. If you don't specify a value for <code>firstZoneMonitorDurationInSeconds</code>, then CodeDeploy uses the
     * <code>monitorDurationInSeconds</code> value for the first Availability Zone.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param firstZoneMonitorDurationInSeconds
     *        The period of time, in seconds, that CodeDeploy must wait after completing a deployment to the
     *        <i>first</i> Availability Zone. CodeDeploy will wait this amount of time before starting a deployment to
     *        the second Availability Zone. You might set this option if you want to allow extra bake time for the first
     *        Availability Zone. If you don't specify a value for <code>firstZoneMonitorDurationInSeconds</code>, then
     *        CodeDeploy uses the <code>monitorDurationInSeconds</code> value for the first Availability Zone.</p>
     *        <p>
     *        For more information about the zonal configuration feature, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     *        >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     */

    public void setFirstZoneMonitorDurationInSeconds(Long firstZoneMonitorDurationInSeconds) {
        this.firstZoneMonitorDurationInSeconds = firstZoneMonitorDurationInSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to the <i>first</i>
     * Availability Zone. CodeDeploy will wait this amount of time before starting a deployment to the second
     * Availability Zone. You might set this option if you want to allow extra bake time for the first Availability
     * Zone. If you don't specify a value for <code>firstZoneMonitorDurationInSeconds</code>, then CodeDeploy uses the
     * <code>monitorDurationInSeconds</code> value for the first Availability Zone.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @return The period of time, in seconds, that CodeDeploy must wait after completing a deployment to the
     *         <i>first</i> Availability Zone. CodeDeploy will wait this amount of time before starting a deployment to
     *         the second Availability Zone. You might set this option if you want to allow extra bake time for the
     *         first Availability Zone. If you don't specify a value for <code>firstZoneMonitorDurationInSeconds</code>,
     *         then CodeDeploy uses the <code>monitorDurationInSeconds</code> value for the first Availability Zone.</p>
     *         <p>
     *         For more information about the zonal configuration feature, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     *         >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     */

    public Long getFirstZoneMonitorDurationInSeconds() {
        return this.firstZoneMonitorDurationInSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to the <i>first</i>
     * Availability Zone. CodeDeploy will wait this amount of time before starting a deployment to the second
     * Availability Zone. You might set this option if you want to allow extra bake time for the first Availability
     * Zone. If you don't specify a value for <code>firstZoneMonitorDurationInSeconds</code>, then CodeDeploy uses the
     * <code>monitorDurationInSeconds</code> value for the first Availability Zone.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param firstZoneMonitorDurationInSeconds
     *        The period of time, in seconds, that CodeDeploy must wait after completing a deployment to the
     *        <i>first</i> Availability Zone. CodeDeploy will wait this amount of time before starting a deployment to
     *        the second Availability Zone. You might set this option if you want to allow extra bake time for the first
     *        Availability Zone. If you don't specify a value for <code>firstZoneMonitorDurationInSeconds</code>, then
     *        CodeDeploy uses the <code>monitorDurationInSeconds</code> value for the first Availability Zone.</p>
     *        <p>
     *        For more information about the zonal configuration feature, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     *        >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalConfig withFirstZoneMonitorDurationInSeconds(Long firstZoneMonitorDurationInSeconds) {
        setFirstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to an Availability Zone.
     * CodeDeploy will wait this amount of time before starting a deployment to the next Availability Zone. Consider
     * adding a monitor duration to give the deployment some time to prove itself (or 'bake') in one Availability Zone
     * before it is released in the next zone. If you don't specify a <code>monitorDurationInSeconds</code>, CodeDeploy
     * starts deploying to the next Availability Zone immediately.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param monitorDurationInSeconds
     *        The period of time, in seconds, that CodeDeploy must wait after completing a deployment to an Availability
     *        Zone. CodeDeploy will wait this amount of time before starting a deployment to the next Availability Zone.
     *        Consider adding a monitor duration to give the deployment some time to prove itself (or 'bake') in one
     *        Availability Zone before it is released in the next zone. If you don't specify a
     *        <code>monitorDurationInSeconds</code>, CodeDeploy starts deploying to the next Availability Zone
     *        immediately.</p>
     *        <p>
     *        For more information about the zonal configuration feature, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     *        >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     */

    public void setMonitorDurationInSeconds(Long monitorDurationInSeconds) {
        this.monitorDurationInSeconds = monitorDurationInSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to an Availability Zone.
     * CodeDeploy will wait this amount of time before starting a deployment to the next Availability Zone. Consider
     * adding a monitor duration to give the deployment some time to prove itself (or 'bake') in one Availability Zone
     * before it is released in the next zone. If you don't specify a <code>monitorDurationInSeconds</code>, CodeDeploy
     * starts deploying to the next Availability Zone immediately.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @return The period of time, in seconds, that CodeDeploy must wait after completing a deployment to an
     *         Availability Zone. CodeDeploy will wait this amount of time before starting a deployment to the next
     *         Availability Zone. Consider adding a monitor duration to give the deployment some time to prove itself
     *         (or 'bake') in one Availability Zone before it is released in the next zone. If you don't specify a
     *         <code>monitorDurationInSeconds</code>, CodeDeploy starts deploying to the next Availability Zone
     *         immediately.</p>
     *         <p>
     *         For more information about the zonal configuration feature, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     *         >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     */

    public Long getMonitorDurationInSeconds() {
        return this.monitorDurationInSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that CodeDeploy must wait after completing a deployment to an Availability Zone.
     * CodeDeploy will wait this amount of time before starting a deployment to the next Availability Zone. Consider
     * adding a monitor duration to give the deployment some time to prove itself (or 'bake') in one Availability Zone
     * before it is released in the next zone. If you don't specify a <code>monitorDurationInSeconds</code>, CodeDeploy
     * starts deploying to the next Availability Zone immediately.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param monitorDurationInSeconds
     *        The period of time, in seconds, that CodeDeploy must wait after completing a deployment to an Availability
     *        Zone. CodeDeploy will wait this amount of time before starting a deployment to the next Availability Zone.
     *        Consider adding a monitor duration to give the deployment some time to prove itself (or 'bake') in one
     *        Availability Zone before it is released in the next zone. If you don't specify a
     *        <code>monitorDurationInSeconds</code>, CodeDeploy starts deploying to the next Availability Zone
     *        immediately.</p>
     *        <p>
     *        For more information about the zonal configuration feature, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     *        >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalConfig withMonitorDurationInSeconds(Long monitorDurationInSeconds) {
        setMonitorDurationInSeconds(monitorDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The number or percentage of instances that must remain available per Availability Zone during a deployment. This
     * option works in conjunction with the <code>MinimumHealthyHosts</code> option. For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az"
     * >About the minimum number of healthy hosts per Availability Zone</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * If you don't specify the <code>minimumHealthyHostsPerZone</code> option, then CodeDeploy uses a default value of
     * <code>0</code> percent.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param minimumHealthyHostsPerZone
     *        The number or percentage of instances that must remain available per Availability Zone during a
     *        deployment. This option works in conjunction with the <code>MinimumHealthyHosts</code> option. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az"
     *        >About the minimum number of healthy hosts per Availability Zone</a> in the <i>CodeDeploy User
     *        Guide</i>.</p>
     *        <p>
     *        If you don't specify the <code>minimumHealthyHostsPerZone</code> option, then CodeDeploy uses a default
     *        value of <code>0</code> percent.
     *        </p>
     *        <p>
     *        For more information about the zonal configuration feature, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     *        >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     */

    public void setMinimumHealthyHostsPerZone(MinimumHealthyHostsPerZone minimumHealthyHostsPerZone) {
        this.minimumHealthyHostsPerZone = minimumHealthyHostsPerZone;
    }

    /**
     * <p>
     * The number or percentage of instances that must remain available per Availability Zone during a deployment. This
     * option works in conjunction with the <code>MinimumHealthyHosts</code> option. For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az"
     * >About the minimum number of healthy hosts per Availability Zone</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * If you don't specify the <code>minimumHealthyHostsPerZone</code> option, then CodeDeploy uses a default value of
     * <code>0</code> percent.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @return The number or percentage of instances that must remain available per Availability Zone during a
     *         deployment. This option works in conjunction with the <code>MinimumHealthyHosts</code> option. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az"
     *         >About the minimum number of healthy hosts per Availability Zone</a> in the <i>CodeDeploy User
     *         Guide</i>.</p>
     *         <p>
     *         If you don't specify the <code>minimumHealthyHostsPerZone</code> option, then CodeDeploy uses a default
     *         value of <code>0</code> percent.
     *         </p>
     *         <p>
     *         For more information about the zonal configuration feature, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     *         >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     */

    public MinimumHealthyHostsPerZone getMinimumHealthyHostsPerZone() {
        return this.minimumHealthyHostsPerZone;
    }

    /**
     * <p>
     * The number or percentage of instances that must remain available per Availability Zone during a deployment. This
     * option works in conjunction with the <code>MinimumHealthyHosts</code> option. For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az"
     * >About the minimum number of healthy hosts per Availability Zone</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * If you don't specify the <code>minimumHealthyHostsPerZone</code> option, then CodeDeploy uses a default value of
     * <code>0</code> percent.
     * </p>
     * <p>
     * For more information about the zonal configuration feature, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     * >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * </p>
     * 
     * @param minimumHealthyHostsPerZone
     *        The number or percentage of instances that must remain available per Availability Zone during a
     *        deployment. This option works in conjunction with the <code>MinimumHealthyHosts</code> option. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az"
     *        >About the minimum number of healthy hosts per Availability Zone</a> in the <i>CodeDeploy User
     *        Guide</i>.</p>
     *        <p>
     *        If you don't specify the <code>minimumHealthyHostsPerZone</code> option, then CodeDeploy uses a default
     *        value of <code>0</code> percent.
     *        </p>
     *        <p>
     *        For more information about the zonal configuration feature, see <a href=
     *        "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config"
     *        >zonal configuration</a> in the <i>CodeDeploy User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalConfig withMinimumHealthyHostsPerZone(MinimumHealthyHostsPerZone minimumHealthyHostsPerZone) {
        setMinimumHealthyHostsPerZone(minimumHealthyHostsPerZone);
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
        if (getFirstZoneMonitorDurationInSeconds() != null)
            sb.append("FirstZoneMonitorDurationInSeconds: ").append(getFirstZoneMonitorDurationInSeconds()).append(",");
        if (getMonitorDurationInSeconds() != null)
            sb.append("MonitorDurationInSeconds: ").append(getMonitorDurationInSeconds()).append(",");
        if (getMinimumHealthyHostsPerZone() != null)
            sb.append("MinimumHealthyHostsPerZone: ").append(getMinimumHealthyHostsPerZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZonalConfig == false)
            return false;
        ZonalConfig other = (ZonalConfig) obj;
        if (other.getFirstZoneMonitorDurationInSeconds() == null ^ this.getFirstZoneMonitorDurationInSeconds() == null)
            return false;
        if (other.getFirstZoneMonitorDurationInSeconds() != null
                && other.getFirstZoneMonitorDurationInSeconds().equals(this.getFirstZoneMonitorDurationInSeconds()) == false)
            return false;
        if (other.getMonitorDurationInSeconds() == null ^ this.getMonitorDurationInSeconds() == null)
            return false;
        if (other.getMonitorDurationInSeconds() != null && other.getMonitorDurationInSeconds().equals(this.getMonitorDurationInSeconds()) == false)
            return false;
        if (other.getMinimumHealthyHostsPerZone() == null ^ this.getMinimumHealthyHostsPerZone() == null)
            return false;
        if (other.getMinimumHealthyHostsPerZone() != null && other.getMinimumHealthyHostsPerZone().equals(this.getMinimumHealthyHostsPerZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstZoneMonitorDurationInSeconds() == null) ? 0 : getFirstZoneMonitorDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMonitorDurationInSeconds() == null) ? 0 : getMonitorDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMinimumHealthyHostsPerZone() == null) ? 0 : getMinimumHealthyHostsPerZone().hashCode());
        return hashCode;
    }

    @Override
    public ZonalConfig clone() {
        try {
            return (ZonalConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.ZonalConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
