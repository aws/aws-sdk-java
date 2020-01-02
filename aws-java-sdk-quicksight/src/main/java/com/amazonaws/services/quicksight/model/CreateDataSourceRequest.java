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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * An ID for the data source. This ID is unique per AWS Region for each AWS account.
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
     * The type of the data source. Currently, the supported types for this operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     */
    private DataSourceParameters dataSourceParameters;
    /**
     * <p>
     * The credentials QuickSight that uses to connect to your underlying source. Currently, only credentials based on
     * user name and password are supported.
     * </p>
     */
    private DataSourceCredentials credentials;
    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;
    /**
     * <p>
     * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying
     * source.
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
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * An ID for the data source. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param dataSourceId
     *        An ID for the data source. This ID is unique per AWS Region for each AWS account.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * An ID for the data source. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @return An ID for the data source. This ID is unique per AWS Region for each AWS account.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * An ID for the data source. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param dataSourceId
     *        An ID for the data source. This ID is unique per AWS Region for each AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDataSourceId(String dataSourceId) {
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

    public CreateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * 
     * @param type
     *        The type of the data source. Currently, the supported types for this operation are:
     *        <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     *        . Use <code>ListDataSources</code> to return a list of all data sources.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * 
     * @return The type of the data source. Currently, the supported types for this operation are:
     *         <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     *         . Use <code>ListDataSources</code> to return a list of all data sources.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * 
     * @param type
     *        The type of the data source. Currently, the supported types for this operation are:
     *        <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     *        . Use <code>ListDataSources</code> to return a list of all data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateDataSourceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the data source. Currently, the supported types for this operation are:
     * <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     * . Use <code>ListDataSources</code> to return a list of all data sources.
     * </p>
     * 
     * @param type
     *        The type of the data source. Currently, the supported types for this operation are:
     *        <code>ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA</code>
     *        . Use <code>ListDataSources</code> to return a list of all data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateDataSourceRequest withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     * 
     * @param dataSourceParameters
     *        The parameters that QuickSight uses to connect to your underlying source.
     */

    public void setDataSourceParameters(DataSourceParameters dataSourceParameters) {
        this.dataSourceParameters = dataSourceParameters;
    }

    /**
     * <p>
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     * 
     * @return The parameters that QuickSight uses to connect to your underlying source.
     */

    public DataSourceParameters getDataSourceParameters() {
        return this.dataSourceParameters;
    }

    /**
     * <p>
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     * 
     * @param dataSourceParameters
     *        The parameters that QuickSight uses to connect to your underlying source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDataSourceParameters(DataSourceParameters dataSourceParameters) {
        setDataSourceParameters(dataSourceParameters);
        return this;
    }

    /**
     * <p>
     * The credentials QuickSight that uses to connect to your underlying source. Currently, only credentials based on
     * user name and password are supported.
     * </p>
     * 
     * @param credentials
     *        The credentials QuickSight that uses to connect to your underlying source. Currently, only credentials
     *        based on user name and password are supported.
     */

    public void setCredentials(DataSourceCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials QuickSight that uses to connect to your underlying source. Currently, only credentials based on
     * user name and password are supported.
     * </p>
     * 
     * @return The credentials QuickSight that uses to connect to your underlying source. Currently, only credentials
     *         based on user name and password are supported.
     */

    public DataSourceCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The credentials QuickSight that uses to connect to your underlying source. Currently, only credentials based on
     * user name and password are supported.
     * </p>
     * 
     * @param credentials
     *        The credentials QuickSight that uses to connect to your underlying source. Currently, only credentials
     *        based on user name and password are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withCredentials(DataSourceCredentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     * 
     * @return A list of resource permissions on the data source.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     * 
     * @param permissions
     *        A list of resource permissions on the data source.
     */

    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        A list of resource permissions on the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withPermissions(ResourcePermission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<ResourcePermission>(permissions.length));
        }
        for (ResourcePermission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource permissions on the data source.
     * </p>
     * 
     * @param permissions
     *        A list of resource permissions on the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying
     * source.
     * </p>
     * 
     * @param vpcConnectionProperties
     *        Use this parameter only when you want QuickSight to use a VPC connection when connecting to your
     *        underlying source.
     */

    public void setVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
        this.vpcConnectionProperties = vpcConnectionProperties;
    }

    /**
     * <p>
     * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying
     * source.
     * </p>
     * 
     * @return Use this parameter only when you want QuickSight to use a VPC connection when connecting to your
     *         underlying source.
     */

    public VpcConnectionProperties getVpcConnectionProperties() {
        return this.vpcConnectionProperties;
    }

    /**
     * <p>
     * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying
     * source.
     * </p>
     * 
     * @param vpcConnectionProperties
     *        Use this parameter only when you want QuickSight to use a VPC connection when connecting to your
     *        underlying source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
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

    public CreateDataSourceRequest withSslProperties(SslProperties sslProperties) {
        setSslProperties(sslProperties);
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
     * </p>
     * 
     * @return Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDataSourceParameters() != null)
            sb.append("DataSourceParameters: ").append(getDataSourceParameters()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append("***Sensitive Data Redacted***").append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getVpcConnectionProperties() != null)
            sb.append("VpcConnectionProperties: ").append(getVpcConnectionProperties()).append(",");
        if (getSslProperties() != null)
            sb.append("SslProperties: ").append(getSslProperties()).append(",");
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

        if (obj instanceof CreateDataSourceRequest == false)
            return false;
        CreateDataSourceRequest other = (CreateDataSourceRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
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
        if (other.getDataSourceParameters() == null ^ this.getDataSourceParameters() == null)
            return false;
        if (other.getDataSourceParameters() != null && other.getDataSourceParameters().equals(this.getDataSourceParameters()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getVpcConnectionProperties() == null ^ this.getVpcConnectionProperties() == null)
            return false;
        if (other.getVpcConnectionProperties() != null && other.getVpcConnectionProperties().equals(this.getVpcConnectionProperties()) == false)
            return false;
        if (other.getSslProperties() == null ^ this.getSslProperties() == null)
            return false;
        if (other.getSslProperties() != null && other.getSslProperties().equals(this.getSslProperties()) == false)
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

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDataSourceParameters() == null) ? 0 : getDataSourceParameters().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getVpcConnectionProperties() == null) ? 0 : getVpcConnectionProperties().hashCode());
        hashCode = prime * hashCode + ((getSslProperties() == null) ? 0 : getSslProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceRequest clone() {
        return (CreateDataSourceRequest) super.clone();
    }

}
