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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;
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
     * The parameters that QuickSight uses to connect to your underlying source.
     * </p>
     */
    private DataSourceParameters dataSourceParameters;
    /**
     * <p>
     * The credentials that QuickSight that uses to connect to your underlying source. Currently, only credentials based
     * on user name and password are supported.
     * </p>
     */
    private DataSourceCredentials credentials;
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

    public UpdateDataSourceRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
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

    public UpdateDataSourceRequest withDataSourceId(String dataSourceId) {
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

    public UpdateDataSourceRequest withName(String name) {
        setName(name);
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

    public UpdateDataSourceRequest withDataSourceParameters(DataSourceParameters dataSourceParameters) {
        setDataSourceParameters(dataSourceParameters);
        return this;
    }

    /**
     * <p>
     * The credentials that QuickSight that uses to connect to your underlying source. Currently, only credentials based
     * on user name and password are supported.
     * </p>
     * 
     * @param credentials
     *        The credentials that QuickSight that uses to connect to your underlying source. Currently, only
     *        credentials based on user name and password are supported.
     */

    public void setCredentials(DataSourceCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials that QuickSight that uses to connect to your underlying source. Currently, only credentials based
     * on user name and password are supported.
     * </p>
     * 
     * @return The credentials that QuickSight that uses to connect to your underlying source. Currently, only
     *         credentials based on user name and password are supported.
     */

    public DataSourceCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The credentials that QuickSight that uses to connect to your underlying source. Currently, only credentials based
     * on user name and password are supported.
     * </p>
     * 
     * @param credentials
     *        The credentials that QuickSight that uses to connect to your underlying source. Currently, only
     *        credentials based on user name and password are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withCredentials(DataSourceCredentials credentials) {
        setCredentials(credentials);
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

    public UpdateDataSourceRequest withVpcConnectionProperties(VpcConnectionProperties vpcConnectionProperties) {
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

    public UpdateDataSourceRequest withSslProperties(SslProperties sslProperties) {
        setSslProperties(sslProperties);
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
        if (getDataSourceParameters() != null)
            sb.append("DataSourceParameters: ").append(getDataSourceParameters()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append("***Sensitive Data Redacted***").append(",");
        if (getVpcConnectionProperties() != null)
            sb.append("VpcConnectionProperties: ").append(getVpcConnectionProperties()).append(",");
        if (getSslProperties() != null)
            sb.append("SslProperties: ").append(getSslProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataSourceRequest == false)
            return false;
        UpdateDataSourceRequest other = (UpdateDataSourceRequest) obj;
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
        if (other.getDataSourceParameters() == null ^ this.getDataSourceParameters() == null)
            return false;
        if (other.getDataSourceParameters() != null && other.getDataSourceParameters().equals(this.getDataSourceParameters()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getVpcConnectionProperties() == null ^ this.getVpcConnectionProperties() == null)
            return false;
        if (other.getVpcConnectionProperties() != null && other.getVpcConnectionProperties().equals(this.getVpcConnectionProperties()) == false)
            return false;
        if (other.getSslProperties() == null ^ this.getSslProperties() == null)
            return false;
        if (other.getSslProperties() != null && other.getSslProperties().equals(this.getSslProperties()) == false)
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
        hashCode = prime * hashCode + ((getDataSourceParameters() == null) ? 0 : getDataSourceParameters().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getVpcConnectionProperties() == null) ? 0 : getVpcConnectionProperties().hashCode());
        hashCode = prime * hashCode + ((getSslProperties() == null) ? 0 : getSslProperties().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataSourceRequest clone() {
        return (UpdateDataSourceRequest) super.clone();
    }

}
