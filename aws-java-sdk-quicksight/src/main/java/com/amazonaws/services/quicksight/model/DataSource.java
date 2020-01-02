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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure of a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS account.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * A display name for the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the data source. This type indicates which database engine the data source connects to.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time that this data source was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The last time that this data source was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The parameters that Amazon QuickSight uses to connect to your underlying source. This is a variant type
     * structure. For this structure to be valid, only one of the attributes can be non-null.
     * </p>
     */
    private DataSourceParameters dataSourceParameters;
    /**
     * <p>
     * The VPC connection information. You need to use this parameter only when you want QuickSight to use a VPC
     * connection when connecting to your underlying source.
     * </p>
     */
    private VpcConnectionProperties vpcConnectionProperties;
    /**
     * <p>
     * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
     * </p>
     */
    private SslProperties sslProperties;
    /**
     * <p>
     * Error information from the last update or the creation of the data source.
     * </p>
     */
    private DataSourceErrorInfo errorInfo;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the data source.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the data source.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source. This ID is unique per AWS Region for each AWS account.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @return The ID of the data source. This ID is unique per AWS Region for each AWS account.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source. This ID is unique per AWS Region for each AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * A display name for the data source.
     * </p>
     * 
     * @param name
     *        A display name for the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the data source.
     * </p>
     * 
     * @return A display name for the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the data source.
     * </p>
     * 
     * @param name
     *        A display name for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the data source. This type indicates which database engine the data source connects to.
     * </p>
     * 
     * @param type
     *        The type of the data source. This type indicates which database engine the data source connects to.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source. This type indicates which database engine the data source connects to.
     * </p>
     * 
     * @return The type of the data source. This type indicates which database engine the data source connects to.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source. This type indicates which database engine the data source connects to.
     * </p>
     * 
     * @param type
     *        The type of the data source. This type indicates which database engine the data source connects to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the data source. This type indicates which database engine the data source connects to.
     * </p>
     * 
     * @param type
     *        The type of the data source. This type indicates which database engine the data source connects to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSource withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public DataSource withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public DataSource withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time that this data source was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this data source was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this data source was created.
     * </p>
     * 
     * @return The time that this data source was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that this data source was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this data source was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The last time that this data source was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this data source was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this data source was updated.
     * </p>
     * 
     * @return The last time that this data source was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this data source was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this data source was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The parameters that Amazon QuickSight uses to connect to your underlying source. This is a variant type
     * structure. For this structure to be valid, only one of the attributes can be non-null.
     * </p>
     * 
     * @param dataSourceParameters
     *        The parameters that Amazon QuickSight uses to connect to your underlying source. This is a variant type
     *        structure. For this structure to be valid, only one of the attributes can be non-null.
     */

    public void setDataSourceParameters(DataSourceParameters dataSourceParameters) {
        this.dataSourceParameters = dataSourceParameters;
    }

    /**
     * <p>
     * The parameters that Amazon QuickSight uses to connect to your underlying source. This is a variant type
     * structure. For this structure to be valid, only one of the attributes can be non-null.
     * </p>
     * 
     * @return The parameters that Amazon QuickSight uses to connect to your underlying source. This is a variant type
     *         structure. For this structure to be valid, only one of the attributes can be non-null.
     */

    public DataSourceParameters getDataSourceParameters() {
        return this.dataSourceParameters;
    }

    /**
     * <p>
     * The parameters that Amazon QuickSight uses to connect to your underlying source. This is a variant type
     * structure. For this structure to be valid, only one of the attributes can be non-null.
     * </p>
     * 
     * @param dataSourceParameters
     *        The parameters that Amazon QuickSight uses to connect to your underlying source. This is a variant type
     *        structure. For this structure to be valid, only one of the attributes can be non-null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDataSourceParameters(DataSourceParameters dataSourceParameters) {
        setDataSourceParameters(dataSourceParameters);
        return this;
    }

    /**
     * <p>
     * The VPC connection information. You need to use this parameter only when you want QuickSight to use a VPC
     * connection when connecting to your underlying source.
     * </p>
     * 
     * @param vpcConnectionProperties
     *        The VPC connection information. You need to use this parameter only when you want QuickSight to use a VPC
     *        connection when connecting to your underlying source.
     */

    public void setVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
        this.vpcConnectionProperties = vpcConnectionProperties;
    }

    /**
     * <p>
     * The VPC connection information. You need to use this parameter only when you want QuickSight to use a VPC
     * connection when connecting to your underlying source.
     * </p>
     * 
     * @return The VPC connection information. You need to use this parameter only when you want QuickSight to use a VPC
     *         connection when connecting to your underlying source.
     */

    public VpcConnectionProperties getVpcConnectionProperties() {
        return this.vpcConnectionProperties;
    }

    /**
     * <p>
     * The VPC connection information. You need to use this parameter only when you want QuickSight to use a VPC
     * connection when connecting to your underlying source.
     * </p>
     * 
     * @param vpcConnectionProperties
     *        The VPC connection information. You need to use this parameter only when you want QuickSight to use a VPC
     *        connection when connecting to your underlying source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
        setVpcConnectionProperties(vpcConnectionProperties);
        return this;
    }

    /**
     * <p>
     * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
     * </p>
     * 
     * @param sslProperties
     *        Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
     */

    public void setSslProperties(SslProperties sslProperties) {
        this.sslProperties = sslProperties;
    }

    /**
     * <p>
     * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
     * </p>
     * 
     * @return Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
     */

    public SslProperties getSslProperties() {
        return this.sslProperties;
    }

    /**
     * <p>
     * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
     * </p>
     * 
     * @param sslProperties
     *        Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withSslProperties(SslProperties sslProperties) {
        setSslProperties(sslProperties);
        return this;
    }

    /**
     * <p>
     * Error information from the last update or the creation of the data source.
     * </p>
     * 
     * @param errorInfo
     *        Error information from the last update or the creation of the data source.
     */

    public void setErrorInfo(DataSourceErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Error information from the last update or the creation of the data source.
     * </p>
     * 
     * @return Error information from the last update or the creation of the data source.
     */

    public DataSourceErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * Error information from the last update or the creation of the data source.
     * </p>
     * 
     * @param errorInfo
     *        Error information from the last update or the creation of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withErrorInfo(DataSourceErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getDataSourceParameters() != null)
            sb.append("DataSourceParameters: ").append(getDataSourceParameters()).append(",");
        if (getVpcConnectionProperties() != null)
            sb.append("VpcConnectionProperties: ").append(getVpcConnectionProperties()).append(",");
        if (getSslProperties() != null)
            sb.append("SslProperties: ").append(getSslProperties()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
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
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getDataSourceParameters() == null) ? 0 : getDataSourceParameters().hashCode());
        hashCode = prime * hashCode + ((getVpcConnectionProperties() == null) ? 0 : getVpcConnectionProperties().hashCode());
        hashCode = prime * hashCode + ((getSslProperties() == null) ? 0 : getSslProperties().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        return hashCode;
    }

    @Override
    public DataSource clone() {
        try {
            return (DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
