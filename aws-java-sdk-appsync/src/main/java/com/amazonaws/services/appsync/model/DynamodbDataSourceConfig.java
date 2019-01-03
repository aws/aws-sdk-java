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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon DynamoDB data source configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DynamodbDataSourceConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamodbDataSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The table name.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The AWS Region.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * Set to TRUE to use Amazon Cognito credentials with this data source.
     * </p>
     */
    private Boolean useCallerCredentials;

    /**
     * <p>
     * The table name.
     * </p>
     * 
     * @param tableName
     *        The table name.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The table name.
     * </p>
     * 
     * @return The table name.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The table name.
     * </p>
     * 
     * @param tableName
     *        The table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamodbDataSourceConfig withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The AWS Region.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The AWS Region.
     * </p>
     * 
     * @return The AWS Region.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The AWS Region.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamodbDataSourceConfig withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * Set to TRUE to use Amazon Cognito credentials with this data source.
     * </p>
     * 
     * @param useCallerCredentials
     *        Set to TRUE to use Amazon Cognito credentials with this data source.
     */

    public void setUseCallerCredentials(Boolean useCallerCredentials) {
        this.useCallerCredentials = useCallerCredentials;
    }

    /**
     * <p>
     * Set to TRUE to use Amazon Cognito credentials with this data source.
     * </p>
     * 
     * @return Set to TRUE to use Amazon Cognito credentials with this data source.
     */

    public Boolean getUseCallerCredentials() {
        return this.useCallerCredentials;
    }

    /**
     * <p>
     * Set to TRUE to use Amazon Cognito credentials with this data source.
     * </p>
     * 
     * @param useCallerCredentials
     *        Set to TRUE to use Amazon Cognito credentials with this data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamodbDataSourceConfig withUseCallerCredentials(Boolean useCallerCredentials) {
        setUseCallerCredentials(useCallerCredentials);
        return this;
    }

    /**
     * <p>
     * Set to TRUE to use Amazon Cognito credentials with this data source.
     * </p>
     * 
     * @return Set to TRUE to use Amazon Cognito credentials with this data source.
     */

    public Boolean isUseCallerCredentials() {
        return this.useCallerCredentials;
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getUseCallerCredentials() != null)
            sb.append("UseCallerCredentials: ").append(getUseCallerCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamodbDataSourceConfig == false)
            return false;
        DynamodbDataSourceConfig other = (DynamodbDataSourceConfig) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getUseCallerCredentials() == null ^ this.getUseCallerCredentials() == null)
            return false;
        if (other.getUseCallerCredentials() != null && other.getUseCallerCredentials().equals(this.getUseCallerCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getUseCallerCredentials() == null) ? 0 : getUseCallerCredentials().hashCode());
        return hashCode;
    }

    @Override
    public DynamodbDataSourceConfig clone() {
        try {
            return (DynamodbDataSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.DynamodbDataSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
