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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CreateConnectorProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectorProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in your AWS account.
     * </p>
     */
    private String connectorProfileName;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     */
    private String kmsArn;
    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to
     * route data over AWS infrastructure without exposing it to the public internet.
     * </p>
     */
    private String connectionMode;
    /**
     * <p>
     * Defines the connector-specific configuration and credentials.
     * </p>
     */
    private ConnectorProfileConfig connectorProfileConfig;

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in your AWS account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in your AWS
     *        account.
     */

    public void setConnectorProfileName(String connectorProfileName) {
        this.connectorProfileName = connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in your AWS account.
     * </p>
     * 
     * @return The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in your AWS
     *         account.
     */

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in your AWS account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in your AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorProfileRequest withConnectorProfileName(String connectorProfileName) {
        setConnectorProfileName(connectorProfileName);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     * 
     * @param kmsArn
     *        The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     *        required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here,
     *        Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */

    public void setKmsArn(String kmsArn) {
        this.kmsArn = kmsArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This
     *         is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything
     *         here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */

    public String getKmsArn() {
        return this.kmsArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     * 
     * @param kmsArn
     *        The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     *        required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here,
     *        Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorProfileRequest withKmsArn(String kmsArn) {
        setKmsArn(kmsArn);
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @return The type of connector, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public CreateConnectorProfileRequest withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public CreateConnectorProfileRequest withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to
     * route data over AWS infrastructure without exposing it to the public internet.
     * </p>
     * 
     * @param connectionMode
     *        Indicates the connection mode and specifies whether it is public or private. Private flows use AWS
     *        PrivateLink to route data over AWS infrastructure without exposing it to the public internet.
     * @see ConnectionMode
     */

    public void setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
    }

    /**
     * <p>
     * Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to
     * route data over AWS infrastructure without exposing it to the public internet.
     * </p>
     * 
     * @return Indicates the connection mode and specifies whether it is public or private. Private flows use AWS
     *         PrivateLink to route data over AWS infrastructure without exposing it to the public internet.
     * @see ConnectionMode
     */

    public String getConnectionMode() {
        return this.connectionMode;
    }

    /**
     * <p>
     * Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to
     * route data over AWS infrastructure without exposing it to the public internet.
     * </p>
     * 
     * @param connectionMode
     *        Indicates the connection mode and specifies whether it is public or private. Private flows use AWS
     *        PrivateLink to route data over AWS infrastructure without exposing it to the public internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionMode
     */

    public CreateConnectorProfileRequest withConnectionMode(String connectionMode) {
        setConnectionMode(connectionMode);
        return this;
    }

    /**
     * <p>
     * Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to
     * route data over AWS infrastructure without exposing it to the public internet.
     * </p>
     * 
     * @param connectionMode
     *        Indicates the connection mode and specifies whether it is public or private. Private flows use AWS
     *        PrivateLink to route data over AWS infrastructure without exposing it to the public internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionMode
     */

    public CreateConnectorProfileRequest withConnectionMode(ConnectionMode connectionMode) {
        this.connectionMode = connectionMode.toString();
        return this;
    }

    /**
     * <p>
     * Defines the connector-specific configuration and credentials.
     * </p>
     * 
     * @param connectorProfileConfig
     *        Defines the connector-specific configuration and credentials.
     */

    public void setConnectorProfileConfig(ConnectorProfileConfig connectorProfileConfig) {
        this.connectorProfileConfig = connectorProfileConfig;
    }

    /**
     * <p>
     * Defines the connector-specific configuration and credentials.
     * </p>
     * 
     * @return Defines the connector-specific configuration and credentials.
     */

    public ConnectorProfileConfig getConnectorProfileConfig() {
        return this.connectorProfileConfig;
    }

    /**
     * <p>
     * Defines the connector-specific configuration and credentials.
     * </p>
     * 
     * @param connectorProfileConfig
     *        Defines the connector-specific configuration and credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorProfileRequest withConnectorProfileConfig(ConnectorProfileConfig connectorProfileConfig) {
        setConnectorProfileConfig(connectorProfileConfig);
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
        if (getConnectorProfileName() != null)
            sb.append("ConnectorProfileName: ").append(getConnectorProfileName()).append(",");
        if (getKmsArn() != null)
            sb.append("KmsArn: ").append(getKmsArn()).append(",");
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getConnectionMode() != null)
            sb.append("ConnectionMode: ").append(getConnectionMode()).append(",");
        if (getConnectorProfileConfig() != null)
            sb.append("ConnectorProfileConfig: ").append(getConnectorProfileConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectorProfileRequest == false)
            return false;
        CreateConnectorProfileRequest other = (CreateConnectorProfileRequest) obj;
        if (other.getConnectorProfileName() == null ^ this.getConnectorProfileName() == null)
            return false;
        if (other.getConnectorProfileName() != null && other.getConnectorProfileName().equals(this.getConnectorProfileName()) == false)
            return false;
        if (other.getKmsArn() == null ^ this.getKmsArn() == null)
            return false;
        if (other.getKmsArn() != null && other.getKmsArn().equals(this.getKmsArn()) == false)
            return false;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getConnectionMode() == null ^ this.getConnectionMode() == null)
            return false;
        if (other.getConnectionMode() != null && other.getConnectionMode().equals(this.getConnectionMode()) == false)
            return false;
        if (other.getConnectorProfileConfig() == null ^ this.getConnectorProfileConfig() == null)
            return false;
        if (other.getConnectorProfileConfig() != null && other.getConnectorProfileConfig().equals(this.getConnectorProfileConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorProfileName() == null) ? 0 : getConnectorProfileName().hashCode());
        hashCode = prime * hashCode + ((getKmsArn() == null) ? 0 : getKmsArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getConnectionMode() == null) ? 0 : getConnectionMode().hashCode());
        hashCode = prime * hashCode + ((getConnectorProfileConfig() == null) ? 0 : getConnectorProfileConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectorProfileRequest clone() {
        return (CreateConnectorProfileRequest) super.clone();
    }

}
