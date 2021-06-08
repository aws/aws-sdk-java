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
 * Updates to the configuration of Kinesis Data Analytics Studio notebook.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ZeppelinApplicationConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZeppelinApplicationConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Updates to the monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     */
    private ZeppelinMonitoringConfigurationUpdate monitoringConfigurationUpdate;
    /**
     * <p>
     * Updates to the configuration of the AWS Glue Data Catalog that is associated with the Kinesis Data Analytics
     * Studio notebook.
     * </p>
     */
    private CatalogConfigurationUpdate catalogConfigurationUpdate;

    private DeployAsApplicationConfigurationUpdate deployAsApplicationConfigurationUpdate;
    /**
     * <p>
     * Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions (UDF).
     * </p>
     */
    private java.util.List<CustomArtifactConfiguration> customArtifactsConfigurationUpdate;

    /**
     * <p>
     * Updates to the monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param monitoringConfigurationUpdate
     *        Updates to the monitoring configuration of a Kinesis Data Analytics Studio notebook.
     */

    public void setMonitoringConfigurationUpdate(ZeppelinMonitoringConfigurationUpdate monitoringConfigurationUpdate) {
        this.monitoringConfigurationUpdate = monitoringConfigurationUpdate;
    }

    /**
     * <p>
     * Updates to the monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @return Updates to the monitoring configuration of a Kinesis Data Analytics Studio notebook.
     */

    public ZeppelinMonitoringConfigurationUpdate getMonitoringConfigurationUpdate() {
        return this.monitoringConfigurationUpdate;
    }

    /**
     * <p>
     * Updates to the monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param monitoringConfigurationUpdate
     *        Updates to the monitoring configuration of a Kinesis Data Analytics Studio notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationUpdate withMonitoringConfigurationUpdate(ZeppelinMonitoringConfigurationUpdate monitoringConfigurationUpdate) {
        setMonitoringConfigurationUpdate(monitoringConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * Updates to the configuration of the AWS Glue Data Catalog that is associated with the Kinesis Data Analytics
     * Studio notebook.
     * </p>
     * 
     * @param catalogConfigurationUpdate
     *        Updates to the configuration of the AWS Glue Data Catalog that is associated with the Kinesis Data
     *        Analytics Studio notebook.
     */

    public void setCatalogConfigurationUpdate(CatalogConfigurationUpdate catalogConfigurationUpdate) {
        this.catalogConfigurationUpdate = catalogConfigurationUpdate;
    }

    /**
     * <p>
     * Updates to the configuration of the AWS Glue Data Catalog that is associated with the Kinesis Data Analytics
     * Studio notebook.
     * </p>
     * 
     * @return Updates to the configuration of the AWS Glue Data Catalog that is associated with the Kinesis Data
     *         Analytics Studio notebook.
     */

    public CatalogConfigurationUpdate getCatalogConfigurationUpdate() {
        return this.catalogConfigurationUpdate;
    }

    /**
     * <p>
     * Updates to the configuration of the AWS Glue Data Catalog that is associated with the Kinesis Data Analytics
     * Studio notebook.
     * </p>
     * 
     * @param catalogConfigurationUpdate
     *        Updates to the configuration of the AWS Glue Data Catalog that is associated with the Kinesis Data
     *        Analytics Studio notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationUpdate withCatalogConfigurationUpdate(CatalogConfigurationUpdate catalogConfigurationUpdate) {
        setCatalogConfigurationUpdate(catalogConfigurationUpdate);
        return this;
    }

    /**
     * @param deployAsApplicationConfigurationUpdate
     */

    public void setDeployAsApplicationConfigurationUpdate(DeployAsApplicationConfigurationUpdate deployAsApplicationConfigurationUpdate) {
        this.deployAsApplicationConfigurationUpdate = deployAsApplicationConfigurationUpdate;
    }

    /**
     * @return
     */

    public DeployAsApplicationConfigurationUpdate getDeployAsApplicationConfigurationUpdate() {
        return this.deployAsApplicationConfigurationUpdate;
    }

    /**
     * @param deployAsApplicationConfigurationUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationUpdate withDeployAsApplicationConfigurationUpdate(
            DeployAsApplicationConfigurationUpdate deployAsApplicationConfigurationUpdate) {
        setDeployAsApplicationConfigurationUpdate(deployAsApplicationConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions (UDF).
     * </p>
     * 
     * @return Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions
     *         (UDF).
     */

    public java.util.List<CustomArtifactConfiguration> getCustomArtifactsConfigurationUpdate() {
        return customArtifactsConfigurationUpdate;
    }

    /**
     * <p>
     * Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions (UDF).
     * </p>
     * 
     * @param customArtifactsConfigurationUpdate
     *        Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions
     *        (UDF).
     */

    public void setCustomArtifactsConfigurationUpdate(java.util.Collection<CustomArtifactConfiguration> customArtifactsConfigurationUpdate) {
        if (customArtifactsConfigurationUpdate == null) {
            this.customArtifactsConfigurationUpdate = null;
            return;
        }

        this.customArtifactsConfigurationUpdate = new java.util.ArrayList<CustomArtifactConfiguration>(customArtifactsConfigurationUpdate);
    }

    /**
     * <p>
     * Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions (UDF).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomArtifactsConfigurationUpdate(java.util.Collection)} or
     * {@link #withCustomArtifactsConfigurationUpdate(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param customArtifactsConfigurationUpdate
     *        Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions
     *        (UDF).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationUpdate withCustomArtifactsConfigurationUpdate(CustomArtifactConfiguration... customArtifactsConfigurationUpdate) {
        if (this.customArtifactsConfigurationUpdate == null) {
            setCustomArtifactsConfigurationUpdate(new java.util.ArrayList<CustomArtifactConfiguration>(customArtifactsConfigurationUpdate.length));
        }
        for (CustomArtifactConfiguration ele : customArtifactsConfigurationUpdate) {
            this.customArtifactsConfigurationUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions (UDF).
     * </p>
     * 
     * @param customArtifactsConfigurationUpdate
     *        Updates to the customer artifacts. Custom artifacts are dependency JAR files and user-defined functions
     *        (UDF).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZeppelinApplicationConfigurationUpdate withCustomArtifactsConfigurationUpdate(
            java.util.Collection<CustomArtifactConfiguration> customArtifactsConfigurationUpdate) {
        setCustomArtifactsConfigurationUpdate(customArtifactsConfigurationUpdate);
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
        if (getMonitoringConfigurationUpdate() != null)
            sb.append("MonitoringConfigurationUpdate: ").append(getMonitoringConfigurationUpdate()).append(",");
        if (getCatalogConfigurationUpdate() != null)
            sb.append("CatalogConfigurationUpdate: ").append(getCatalogConfigurationUpdate()).append(",");
        if (getDeployAsApplicationConfigurationUpdate() != null)
            sb.append("DeployAsApplicationConfigurationUpdate: ").append(getDeployAsApplicationConfigurationUpdate()).append(",");
        if (getCustomArtifactsConfigurationUpdate() != null)
            sb.append("CustomArtifactsConfigurationUpdate: ").append(getCustomArtifactsConfigurationUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZeppelinApplicationConfigurationUpdate == false)
            return false;
        ZeppelinApplicationConfigurationUpdate other = (ZeppelinApplicationConfigurationUpdate) obj;
        if (other.getMonitoringConfigurationUpdate() == null ^ this.getMonitoringConfigurationUpdate() == null)
            return false;
        if (other.getMonitoringConfigurationUpdate() != null
                && other.getMonitoringConfigurationUpdate().equals(this.getMonitoringConfigurationUpdate()) == false)
            return false;
        if (other.getCatalogConfigurationUpdate() == null ^ this.getCatalogConfigurationUpdate() == null)
            return false;
        if (other.getCatalogConfigurationUpdate() != null && other.getCatalogConfigurationUpdate().equals(this.getCatalogConfigurationUpdate()) == false)
            return false;
        if (other.getDeployAsApplicationConfigurationUpdate() == null ^ this.getDeployAsApplicationConfigurationUpdate() == null)
            return false;
        if (other.getDeployAsApplicationConfigurationUpdate() != null
                && other.getDeployAsApplicationConfigurationUpdate().equals(this.getDeployAsApplicationConfigurationUpdate()) == false)
            return false;
        if (other.getCustomArtifactsConfigurationUpdate() == null ^ this.getCustomArtifactsConfigurationUpdate() == null)
            return false;
        if (other.getCustomArtifactsConfigurationUpdate() != null
                && other.getCustomArtifactsConfigurationUpdate().equals(this.getCustomArtifactsConfigurationUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringConfigurationUpdate() == null) ? 0 : getMonitoringConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getCatalogConfigurationUpdate() == null) ? 0 : getCatalogConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getDeployAsApplicationConfigurationUpdate() == null) ? 0 : getDeployAsApplicationConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getCustomArtifactsConfigurationUpdate() == null) ? 0 : getCustomArtifactsConfigurationUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ZeppelinApplicationConfigurationUpdate clone() {
        try {
            return (ZeppelinApplicationConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ZeppelinApplicationConfigurationUpdateMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
