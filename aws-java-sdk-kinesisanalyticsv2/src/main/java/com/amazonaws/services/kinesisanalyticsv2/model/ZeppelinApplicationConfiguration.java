/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of a Kinesis Data Analytics Studio notebook.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ZeppelinApplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZeppelinApplicationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     */
    private ZeppelinMonitoringConfiguration monitoringConfiguration;
    /**
     * <p>
     * The AWS Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio notebook.
     * </p>
     */
    private CatalogConfiguration catalogConfiguration;
    /**
     * <p>
     * The information required to deploy a Kinesis Data Analytics Studio notebook as an application with durable
     * state..
     * </p>
     */
    private DeployAsApplicationConfiguration deployAsApplicationConfiguration;
    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     */
    private java.util.List<CustomArtifactConfiguration> customArtifactsConfiguration;

    /**
     * <p>
     * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param monitoringConfiguration
     *        The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     */

    public void setMonitoringConfiguration(ZeppelinMonitoringConfiguration monitoringConfiguration) {
        this.monitoringConfiguration = monitoringConfiguration;
    }

    /**
     * <p>
     * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @return The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     */

    public ZeppelinMonitoringConfiguration getMonitoringConfiguration() {
        return this.monitoringConfiguration;
    }

    /**
     * <p>
     * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param monitoringConfiguration
     *        The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfiguration withMonitoringConfiguration(ZeppelinMonitoringConfiguration monitoringConfiguration) {
        setMonitoringConfiguration(monitoringConfiguration);
        return this;
    }

    /**
     * <p>
     * The AWS Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param catalogConfiguration
     *        The AWS Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio notebook.
     */

    public void setCatalogConfiguration(CatalogConfiguration catalogConfiguration) {
        this.catalogConfiguration = catalogConfiguration;
    }

    /**
     * <p>
     * The AWS Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @return The AWS Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio notebook.
     */

    public CatalogConfiguration getCatalogConfiguration() {
        return this.catalogConfiguration;
    }

    /**
     * <p>
     * The AWS Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param catalogConfiguration
     *        The AWS Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfiguration withCatalogConfiguration(CatalogConfiguration catalogConfiguration) {
        setCatalogConfiguration(catalogConfiguration);
        return this;
    }

    /**
     * <p>
     * The information required to deploy a Kinesis Data Analytics Studio notebook as an application with durable
     * state..
     * </p>
     * 
     * @param deployAsApplicationConfiguration
     *        The information required to deploy a Kinesis Data Analytics Studio notebook as an application with durable
     *        state..
     */

    public void setDeployAsApplicationConfiguration(DeployAsApplicationConfiguration deployAsApplicationConfiguration) {
        this.deployAsApplicationConfiguration = deployAsApplicationConfiguration;
    }

    /**
     * <p>
     * The information required to deploy a Kinesis Data Analytics Studio notebook as an application with durable
     * state..
     * </p>
     * 
     * @return The information required to deploy a Kinesis Data Analytics Studio notebook as an application with
     *         durable state..
     */

    public DeployAsApplicationConfiguration getDeployAsApplicationConfiguration() {
        return this.deployAsApplicationConfiguration;
    }

    /**
     * <p>
     * The information required to deploy a Kinesis Data Analytics Studio notebook as an application with durable
     * state..
     * </p>
     * 
     * @param deployAsApplicationConfiguration
     *        The information required to deploy a Kinesis Data Analytics Studio notebook as an application with durable
     *        state..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfiguration withDeployAsApplicationConfiguration(DeployAsApplicationConfiguration deployAsApplicationConfiguration) {
        setDeployAsApplicationConfiguration(deployAsApplicationConfiguration);
        return this;
    }

    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     * 
     * @return Custom artifacts are dependency JARs and user-defined functions (UDF).
     */

    public java.util.List<CustomArtifactConfiguration> getCustomArtifactsConfiguration() {
        return customArtifactsConfiguration;
    }

    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     * 
     * @param customArtifactsConfiguration
     *        Custom artifacts are dependency JARs and user-defined functions (UDF).
     */

    public void setCustomArtifactsConfiguration(java.util.Collection<CustomArtifactConfiguration> customArtifactsConfiguration) {
        if (customArtifactsConfiguration == null) {
            this.customArtifactsConfiguration = null;
            return;
        }

        this.customArtifactsConfiguration = new java.util.ArrayList<CustomArtifactConfiguration>(customArtifactsConfiguration);
    }

    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomArtifactsConfiguration(java.util.Collection)} or
     * {@link #withCustomArtifactsConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customArtifactsConfiguration
     *        Custom artifacts are dependency JARs and user-defined functions (UDF).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfiguration withCustomArtifactsConfiguration(CustomArtifactConfiguration... customArtifactsConfiguration) {
        if (this.customArtifactsConfiguration == null) {
            setCustomArtifactsConfiguration(new java.util.ArrayList<CustomArtifactConfiguration>(customArtifactsConfiguration.length));
        }
        for (CustomArtifactConfiguration ele : customArtifactsConfiguration) {
            this.customArtifactsConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     * 
     * @param customArtifactsConfiguration
     *        Custom artifacts are dependency JARs and user-defined functions (UDF).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfiguration withCustomArtifactsConfiguration(java.util.Collection<CustomArtifactConfiguration> customArtifactsConfiguration) {
        setCustomArtifactsConfiguration(customArtifactsConfiguration);
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
        if (getMonitoringConfiguration() != null)
            sb.append("MonitoringConfiguration: ").append(getMonitoringConfiguration()).append(",");
        if (getCatalogConfiguration() != null)
            sb.append("CatalogConfiguration: ").append(getCatalogConfiguration()).append(",");
        if (getDeployAsApplicationConfiguration() != null)
            sb.append("DeployAsApplicationConfiguration: ").append(getDeployAsApplicationConfiguration()).append(",");
        if (getCustomArtifactsConfiguration() != null)
            sb.append("CustomArtifactsConfiguration: ").append(getCustomArtifactsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZeppelinApplicationConfiguration == false)
            return false;
        ZeppelinApplicationConfiguration other = (ZeppelinApplicationConfiguration) obj;
        if (other.getMonitoringConfiguration() == null ^ this.getMonitoringConfiguration() == null)
            return false;
        if (other.getMonitoringConfiguration() != null && other.getMonitoringConfiguration().equals(this.getMonitoringConfiguration()) == false)
            return false;
        if (other.getCatalogConfiguration() == null ^ this.getCatalogConfiguration() == null)
            return false;
        if (other.getCatalogConfiguration() != null && other.getCatalogConfiguration().equals(this.getCatalogConfiguration()) == false)
            return false;
        if (other.getDeployAsApplicationConfiguration() == null ^ this.getDeployAsApplicationConfiguration() == null)
            return false;
        if (other.getDeployAsApplicationConfiguration() != null
                && other.getDeployAsApplicationConfiguration().equals(this.getDeployAsApplicationConfiguration()) == false)
            return false;
        if (other.getCustomArtifactsConfiguration() == null ^ this.getCustomArtifactsConfiguration() == null)
            return false;
        if (other.getCustomArtifactsConfiguration() != null && other.getCustomArtifactsConfiguration().equals(this.getCustomArtifactsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringConfiguration() == null) ? 0 : getMonitoringConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCatalogConfiguration() == null) ? 0 : getCatalogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeployAsApplicationConfiguration() == null) ? 0 : getDeployAsApplicationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomArtifactsConfiguration() == null) ? 0 : getCustomArtifactsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ZeppelinApplicationConfiguration clone() {
        try {
            return (ZeppelinApplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ZeppelinApplicationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
