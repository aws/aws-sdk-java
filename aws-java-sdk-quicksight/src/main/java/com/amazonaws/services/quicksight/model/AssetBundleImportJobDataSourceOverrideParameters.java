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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The override parameters for a single data source that is being imported.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobDataSourceOverrideParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobDataSourceOverrideParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the data source to apply overrides to.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * A new name for the data source.
     * </p>
     */
    private String name;

    private DataSourceParameters dataSourceParameters;

    private VpcConnectionProperties vpcConnectionProperties;

    private SslProperties sslProperties;
    /**
     * <p>
     * An optional structure that provides the credentials to be used to create the imported data source.
     * </p>
     */
    private AssetBundleImportJobDataSourceCredentials credentials;

    /**
     * <p>
     * The ID of the data source to apply overrides to.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source to apply overrides to.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source to apply overrides to.
     * </p>
     * 
     * @return The ID of the data source to apply overrides to.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source to apply overrides to.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceOverrideParameters withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * A new name for the data source.
     * </p>
     * 
     * @param name
     *        A new name for the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A new name for the data source.
     * </p>
     * 
     * @return A new name for the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A new name for the data source.
     * </p>
     * 
     * @param name
     *        A new name for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceOverrideParameters withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param dataSourceParameters
     */

    public void setDataSourceParameters(DataSourceParameters dataSourceParameters) {
        this.dataSourceParameters = dataSourceParameters;
    }

    /**
     * @return
     */

    public DataSourceParameters getDataSourceParameters() {
        return this.dataSourceParameters;
    }

    /**
     * @param dataSourceParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceOverrideParameters withDataSourceParameters(DataSourceParameters dataSourceParameters) {
        setDataSourceParameters(dataSourceParameters);
        return this;
    }

    /**
     * @param vpcConnectionProperties
     */

    public void setVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
        this.vpcConnectionProperties = vpcConnectionProperties;
    }

    /**
     * @return
     */

    public VpcConnectionProperties getVpcConnectionProperties() {
        return this.vpcConnectionProperties;
    }

    /**
     * @param vpcConnectionProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceOverrideParameters withVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
        setVpcConnectionProperties(vpcConnectionProperties);
        return this;
    }

    /**
     * @param sslProperties
     */

    public void setSslProperties(SslProperties sslProperties) {
        this.sslProperties = sslProperties;
    }

    /**
     * @return
     */

    public SslProperties getSslProperties() {
        return this.sslProperties;
    }

    /**
     * @param sslProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceOverrideParameters withSslProperties(SslProperties sslProperties) {
        setSslProperties(sslProperties);
        return this;
    }

    /**
     * <p>
     * An optional structure that provides the credentials to be used to create the imported data source.
     * </p>
     * 
     * @param credentials
     *        An optional structure that provides the credentials to be used to create the imported data source.
     */

    public void setCredentials(AssetBundleImportJobDataSourceCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * An optional structure that provides the credentials to be used to create the imported data source.
     * </p>
     * 
     * @return An optional structure that provides the credentials to be used to create the imported data source.
     */

    public AssetBundleImportJobDataSourceCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * An optional structure that provides the credentials to be used to create the imported data source.
     * </p>
     * 
     * @param credentials
     *        An optional structure that provides the credentials to be used to create the imported data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceOverrideParameters withCredentials(AssetBundleImportJobDataSourceCredentials credentials) {
        setCredentials(credentials);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDataSourceParameters() != null)
            sb.append("DataSourceParameters: ").append(getDataSourceParameters()).append(",");
        if (getVpcConnectionProperties() != null)
            sb.append("VpcConnectionProperties: ").append(getVpcConnectionProperties()).append(",");
        if (getSslProperties() != null)
            sb.append("SslProperties: ").append(getSslProperties()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobDataSourceOverrideParameters == false)
            return false;
        AssetBundleImportJobDataSourceOverrideParameters other = (AssetBundleImportJobDataSourceOverrideParameters) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataSourceParameters() == null ^ this.getDataSourceParameters() == null)
            return false;
        if (other.getDataSourceParameters() != null && other.getDataSourceParameters().equals(this.getDataSourceParameters()) == false)
            return false;
        if (other.getVpcConnectionProperties() == null ^ this.getVpcConnectionProperties() == null)
            return false;
        if (other.getVpcConnectionProperties() != null && other.getVpcConnectionProperties().equals(this.getVpcConnectionProperties()) == false)
            return false;
        if (other.getSslProperties() == null ^ this.getSslProperties() == null)
            return false;
        if (other.getSslProperties() != null && other.getSslProperties().equals(this.getSslProperties()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataSourceParameters() == null) ? 0 : getDataSourceParameters().hashCode());
        hashCode = prime * hashCode + ((getVpcConnectionProperties() == null) ? 0 : getVpcConnectionProperties().hashCode());
        hashCode = prime * hashCode + ((getSslProperties() == null) ? 0 : getSslProperties().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobDataSourceOverrideParameters clone() {
        try {
            return (AssetBundleImportJobDataSourceOverrideParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobDataSourceOverrideParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
