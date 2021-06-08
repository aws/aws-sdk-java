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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ZeppelinApplicationConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZeppelinApplicationConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     */
    private ZeppelinMonitoringConfigurationDescription monitoringConfigurationDescription;
    /**
     * <p>
     * The AWS Glue Data Catalog that is associated with the Kinesis Data Analytics Studio notebook.
     * </p>
     */
    private CatalogConfigurationDescription catalogConfigurationDescription;
    /**
     * <p>
     * The parameters required to deploy a Kinesis Data Analytics Studio notebook as an application with durable state..
     * </p>
     */
    private DeployAsApplicationConfigurationDescription deployAsApplicationConfigurationDescription;
    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     */
    private java.util.List<CustomArtifactConfigurationDescription> customArtifactsConfigurationDescription;

    /**
     * <p>
     * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param monitoringConfigurationDescription
     *        The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     */

    public void setMonitoringConfigurationDescription(ZeppelinMonitoringConfigurationDescription monitoringConfigurationDescription) {
        this.monitoringConfigurationDescription = monitoringConfigurationDescription;
    }

    /**
     * <p>
     * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @return The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     */

    public ZeppelinMonitoringConfigurationDescription getMonitoringConfigurationDescription() {
        return this.monitoringConfigurationDescription;
    }

    /**
     * <p>
     * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param monitoringConfigurationDescription
     *        The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationDescription withMonitoringConfigurationDescription(
            ZeppelinMonitoringConfigurationDescription monitoringConfigurationDescription) {
        setMonitoringConfigurationDescription(monitoringConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * The AWS Glue Data Catalog that is associated with the Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param catalogConfigurationDescription
     *        The AWS Glue Data Catalog that is associated with the Kinesis Data Analytics Studio notebook.
     */

    public void setCatalogConfigurationDescription(CatalogConfigurationDescription catalogConfigurationDescription) {
        this.catalogConfigurationDescription = catalogConfigurationDescription;
    }

    /**
     * <p>
     * The AWS Glue Data Catalog that is associated with the Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @return The AWS Glue Data Catalog that is associated with the Kinesis Data Analytics Studio notebook.
     */

    public CatalogConfigurationDescription getCatalogConfigurationDescription() {
        return this.catalogConfigurationDescription;
    }

    /**
     * <p>
     * The AWS Glue Data Catalog that is associated with the Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param catalogConfigurationDescription
     *        The AWS Glue Data Catalog that is associated with the Kinesis Data Analytics Studio notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationDescription withCatalogConfigurationDescription(CatalogConfigurationDescription catalogConfigurationDescription) {
        setCatalogConfigurationDescription(catalogConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * The parameters required to deploy a Kinesis Data Analytics Studio notebook as an application with durable state..
     * </p>
     * 
     * @param deployAsApplicationConfigurationDescription
     *        The parameters required to deploy a Kinesis Data Analytics Studio notebook as an application with durable
     *        state..
     */

    public void setDeployAsApplicationConfigurationDescription(DeployAsApplicationConfigurationDescription deployAsApplicationConfigurationDescription) {
        this.deployAsApplicationConfigurationDescription = deployAsApplicationConfigurationDescription;
    }

    /**
     * <p>
     * The parameters required to deploy a Kinesis Data Analytics Studio notebook as an application with durable state..
     * </p>
     * 
     * @return The parameters required to deploy a Kinesis Data Analytics Studio notebook as an application with durable
     *         state..
     */

    public DeployAsApplicationConfigurationDescription getDeployAsApplicationConfigurationDescription() {
        return this.deployAsApplicationConfigurationDescription;
    }

    /**
     * <p>
     * The parameters required to deploy a Kinesis Data Analytics Studio notebook as an application with durable state..
     * </p>
     * 
     * @param deployAsApplicationConfigurationDescription
     *        The parameters required to deploy a Kinesis Data Analytics Studio notebook as an application with durable
     *        state..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationDescription withDeployAsApplicationConfigurationDescription(
            DeployAsApplicationConfigurationDescription deployAsApplicationConfigurationDescription) {
        setDeployAsApplicationConfigurationDescription(deployAsApplicationConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     * 
     * @return Custom artifacts are dependency JARs and user-defined functions (UDF).
     */

    public java.util.List<CustomArtifactConfigurationDescription> getCustomArtifactsConfigurationDescription() {
        return customArtifactsConfigurationDescription;
    }

    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     * 
     * @param customArtifactsConfigurationDescription
     *        Custom artifacts are dependency JARs and user-defined functions (UDF).
     */

    public void setCustomArtifactsConfigurationDescription(java.util.Collection<CustomArtifactConfigurationDescription> customArtifactsConfigurationDescription) {
        if (customArtifactsConfigurationDescription == null) {
            this.customArtifactsConfigurationDescription = null;
            return;
        }

        this.customArtifactsConfigurationDescription = new java.util.ArrayList<CustomArtifactConfigurationDescription>(customArtifactsConfigurationDescription);
    }

    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomArtifactsConfigurationDescription(java.util.Collection)} or
     * {@link #withCustomArtifactsConfigurationDescription(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param customArtifactsConfigurationDescription
     *        Custom artifacts are dependency JARs and user-defined functions (UDF).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationDescription withCustomArtifactsConfigurationDescription(
            CustomArtifactConfigurationDescription... customArtifactsConfigurationDescription) {
        if (this.customArtifactsConfigurationDescription == null) {
            setCustomArtifactsConfigurationDescription(new java.util.ArrayList<CustomArtifactConfigurationDescription>(
                    customArtifactsConfigurationDescription.length));
        }
        for (CustomArtifactConfigurationDescription ele : customArtifactsConfigurationDescription) {
            this.customArtifactsConfigurationDescription.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom artifacts are dependency JARs and user-defined functions (UDF).
     * </p>
     * 
     * @param customArtifactsConfigurationDescription
     *        Custom artifacts are dependency JARs and user-defined functions (UDF).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationDescription withCustomArtifactsConfigurationDescription(
            java.util.Collection<CustomArtifactConfigurationDescription> customArtifactsConfigurationDescription) {
        setCustomArtifactsConfigurationDescription(customArtifactsConfigurationDescription);
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
        if (getMonitoringConfigurationDescription() != null)
            sb.append("MonitoringConfigurationDescription: ").append(getMonitoringConfigurationDescription()).append(",");
        if (getCatalogConfigurationDescription() != null)
            sb.append("CatalogConfigurationDescription: ").append(getCatalogConfigurationDescription()).append(",");
        if (getDeployAsApplicationConfigurationDescription() != null)
            sb.append("DeployAsApplicationConfigurationDescription: ").append(getDeployAsApplicationConfigurationDescription()).append(",");
        if (getCustomArtifactsConfigurationDescription() != null)
            sb.append("CustomArtifactsConfigurationDescription: ").append(getCustomArtifactsConfigurationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZeppelinApplicationConfigurationDescription == false)
            return false;
        ZeppelinApplicationConfigurationDescription other = (ZeppelinApplicationConfigurationDescription) obj;
        if (other.getMonitoringConfigurationDescription() == null ^ this.getMonitoringConfigurationDescription() == null)
            return false;
        if (other.getMonitoringConfigurationDescription() != null
                && other.getMonitoringConfigurationDescription().equals(this.getMonitoringConfigurationDescription()) == false)
            return false;
        if (other.getCatalogConfigurationDescription() == null ^ this.getCatalogConfigurationDescription() == null)
            return false;
        if (other.getCatalogConfigurationDescription() != null
                && other.getCatalogConfigurationDescription().equals(this.getCatalogConfigurationDescription()) == false)
            return false;
        if (other.getDeployAsApplicationConfigurationDescription() == null ^ this.getDeployAsApplicationConfigurationDescription() == null)
            return false;
        if (other.getDeployAsApplicationConfigurationDescription() != null
                && other.getDeployAsApplicationConfigurationDescription().equals(this.getDeployAsApplicationConfigurationDescription()) == false)
            return false;
        if (other.getCustomArtifactsConfigurationDescription() == null ^ this.getCustomArtifactsConfigurationDescription() == null)
            return false;
        if (other.getCustomArtifactsConfigurationDescription() != null
                && other.getCustomArtifactsConfigurationDescription().equals(this.getCustomArtifactsConfigurationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringConfigurationDescription() == null) ? 0 : getMonitoringConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getCatalogConfigurationDescription() == null) ? 0 : getCatalogConfigurationDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDeployAsApplicationConfigurationDescription() == null) ? 0 : getDeployAsApplicationConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getCustomArtifactsConfigurationDescription() == null) ? 0 : getCustomArtifactsConfigurationDescription().hashCode());
        return hashCode;
    }

    @Override
    public ZeppelinApplicationConfigurationDescription clone() {
        try {
            return (ZeppelinApplicationConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ZeppelinApplicationConfigurationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
