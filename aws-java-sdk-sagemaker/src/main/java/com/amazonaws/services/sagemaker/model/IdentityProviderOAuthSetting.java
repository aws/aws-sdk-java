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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon SageMaker Canvas application setting where you configure OAuth for connecting to an external data source,
 * such as Snowflake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/IdentityProviderOAuthSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProviderOAuthSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data source that you're connecting to. Canvas currently supports OAuth for Snowflake and
     * Salesforce Data Cloud.
     * </p>
     */
    private String dataSourceName;
    /**
     * <p>
     * Describes whether OAuth for a data source is enabled or disabled in the Canvas application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ARN of an Amazon Web Services Secrets Manager secret that stores the credentials from your identity provider,
     * such as the client ID and secret, authorization URL, and token URL.
     * </p>
     */
    private String secretArn;

    /**
     * <p>
     * The name of the data source that you're connecting to. Canvas currently supports OAuth for Snowflake and
     * Salesforce Data Cloud.
     * </p>
     * 
     * @param dataSourceName
     *        The name of the data source that you're connecting to. Canvas currently supports OAuth for Snowflake and
     *        Salesforce Data Cloud.
     * @see DataSourceName
     */

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * <p>
     * The name of the data source that you're connecting to. Canvas currently supports OAuth for Snowflake and
     * Salesforce Data Cloud.
     * </p>
     * 
     * @return The name of the data source that you're connecting to. Canvas currently supports OAuth for Snowflake and
     *         Salesforce Data Cloud.
     * @see DataSourceName
     */

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * <p>
     * The name of the data source that you're connecting to. Canvas currently supports OAuth for Snowflake and
     * Salesforce Data Cloud.
     * </p>
     * 
     * @param dataSourceName
     *        The name of the data source that you're connecting to. Canvas currently supports OAuth for Snowflake and
     *        Salesforce Data Cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceName
     */

    public IdentityProviderOAuthSetting withDataSourceName(String dataSourceName) {
        setDataSourceName(dataSourceName);
        return this;
    }

    /**
     * <p>
     * The name of the data source that you're connecting to. Canvas currently supports OAuth for Snowflake and
     * Salesforce Data Cloud.
     * </p>
     * 
     * @param dataSourceName
     *        The name of the data source that you're connecting to. Canvas currently supports OAuth for Snowflake and
     *        Salesforce Data Cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceName
     */

    public IdentityProviderOAuthSetting withDataSourceName(DataSourceName dataSourceName) {
        this.dataSourceName = dataSourceName.toString();
        return this;
    }

    /**
     * <p>
     * Describes whether OAuth for a data source is enabled or disabled in the Canvas application.
     * </p>
     * 
     * @param status
     *        Describes whether OAuth for a data source is enabled or disabled in the Canvas application.
     * @see FeatureStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes whether OAuth for a data source is enabled or disabled in the Canvas application.
     * </p>
     * 
     * @return Describes whether OAuth for a data source is enabled or disabled in the Canvas application.
     * @see FeatureStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes whether OAuth for a data source is enabled or disabled in the Canvas application.
     * </p>
     * 
     * @param status
     *        Describes whether OAuth for a data source is enabled or disabled in the Canvas application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public IdentityProviderOAuthSetting withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes whether OAuth for a data source is enabled or disabled in the Canvas application.
     * </p>
     * 
     * @param status
     *        Describes whether OAuth for a data source is enabled or disabled in the Canvas application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public IdentityProviderOAuthSetting withStatus(FeatureStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services Secrets Manager secret that stores the credentials from your identity provider,
     * such as the client ID and secret, authorization URL, and token URL.
     * </p>
     * 
     * @param secretArn
     *        The ARN of an Amazon Web Services Secrets Manager secret that stores the credentials from your identity
     *        provider, such as the client ID and secret, authorization URL, and token URL.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services Secrets Manager secret that stores the credentials from your identity provider,
     * such as the client ID and secret, authorization URL, and token URL.
     * </p>
     * 
     * @return The ARN of an Amazon Web Services Secrets Manager secret that stores the credentials from your identity
     *         provider, such as the client ID and secret, authorization URL, and token URL.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services Secrets Manager secret that stores the credentials from your identity provider,
     * such as the client ID and secret, authorization URL, and token URL.
     * </p>
     * 
     * @param secretArn
     *        The ARN of an Amazon Web Services Secrets Manager secret that stores the credentials from your identity
     *        provider, such as the client ID and secret, authorization URL, and token URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderOAuthSetting withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getDataSourceName() != null)
            sb.append("DataSourceName: ").append(getDataSourceName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProviderOAuthSetting == false)
            return false;
        IdentityProviderOAuthSetting other = (IdentityProviderOAuthSetting) obj;
        if (other.getDataSourceName() == null ^ this.getDataSourceName() == null)
            return false;
        if (other.getDataSourceName() != null && other.getDataSourceName().equals(this.getDataSourceName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProviderOAuthSetting clone() {
        try {
            return (IdentityProviderOAuthSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.IdentityProviderOAuthSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
