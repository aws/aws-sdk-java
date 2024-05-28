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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     */
    private String connectorId;
    /**
     * <p>
     * The URL of the partner's AS2 or SFTP endpoint.
     * </p>
     */
    private String url;
    /**
     * <p>
     * A structure that contains the parameters for an AS2 connector object.
     * </p>
     */
    private As2ConnectorConfig as2Config;
    /**
     * <p>
     * Connectors are used to send files using either the AS2 or SFTP protocol. For the access role, provide the Amazon
     * Resource Name (ARN) of the Identity and Access Management role to use.
     * </p>
     * <p>
     * <b>For AS2 connectors</b>
     * </p>
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * <p>
     * If you are using Basic authentication for your AS2 connector, the access role requires the
     * <code>secretsmanager:GetSecretValue</code> permission for the secret. If the secret is encrypted using a
     * customer-managed key instead of the Amazon Web Services managed key in Secrets Manager, then the role also needs
     * the <code>kms:Decrypt</code> permission for that key.
     * </p>
     * <p>
     * <b>For SFTP connectors</b>
     * </p>
     * <p>
     * Make sure that the access role provides read and write access to the parent directory of the file location that's
     * used in the <code>StartFileTransfer</code> request. Additionally, make sure that the role provides
     * <code>secretsmanager:GetSecretValue</code> permission to Secrets Manager.
     * </p>
     */
    private String accessRole;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn
     * on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
     * </p>
     */
    private String loggingRole;
    /**
     * <p>
     * A structure that contains the parameters for an SFTP connector object.
     * </p>
     */
    private SftpConnectorConfig sftpConfig;
    /**
     * <p>
     * Specifies the name of the security policy for the connector.
     * </p>
     */
    private String securityPolicyName;

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @param connectorId
     *        The unique identifier for the connector.
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @return The unique identifier for the connector.
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @param connectorId
     *        The unique identifier for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * <p>
     * The URL of the partner's AS2 or SFTP endpoint.
     * </p>
     * 
     * @param url
     *        The URL of the partner's AS2 or SFTP endpoint.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the partner's AS2 or SFTP endpoint.
     * </p>
     * 
     * @return The URL of the partner's AS2 or SFTP endpoint.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the partner's AS2 or SFTP endpoint.
     * </p>
     * 
     * @param url
     *        The URL of the partner's AS2 or SFTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * A structure that contains the parameters for an AS2 connector object.
     * </p>
     * 
     * @param as2Config
     *        A structure that contains the parameters for an AS2 connector object.
     */

    public void setAs2Config(As2ConnectorConfig as2Config) {
        this.as2Config = as2Config;
    }

    /**
     * <p>
     * A structure that contains the parameters for an AS2 connector object.
     * </p>
     * 
     * @return A structure that contains the parameters for an AS2 connector object.
     */

    public As2ConnectorConfig getAs2Config() {
        return this.as2Config;
    }

    /**
     * <p>
     * A structure that contains the parameters for an AS2 connector object.
     * </p>
     * 
     * @param as2Config
     *        A structure that contains the parameters for an AS2 connector object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withAs2Config(As2ConnectorConfig as2Config) {
        setAs2Config(as2Config);
        return this;
    }

    /**
     * <p>
     * Connectors are used to send files using either the AS2 or SFTP protocol. For the access role, provide the Amazon
     * Resource Name (ARN) of the Identity and Access Management role to use.
     * </p>
     * <p>
     * <b>For AS2 connectors</b>
     * </p>
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * <p>
     * If you are using Basic authentication for your AS2 connector, the access role requires the
     * <code>secretsmanager:GetSecretValue</code> permission for the secret. If the secret is encrypted using a
     * customer-managed key instead of the Amazon Web Services managed key in Secrets Manager, then the role also needs
     * the <code>kms:Decrypt</code> permission for that key.
     * </p>
     * <p>
     * <b>For SFTP connectors</b>
     * </p>
     * <p>
     * Make sure that the access role provides read and write access to the parent directory of the file location that's
     * used in the <code>StartFileTransfer</code> request. Additionally, make sure that the role provides
     * <code>secretsmanager:GetSecretValue</code> permission to Secrets Manager.
     * </p>
     * 
     * @param accessRole
     *        Connectors are used to send files using either the AS2 or SFTP protocol. For the access role, provide the
     *        Amazon Resource Name (ARN) of the Identity and Access Management role to use.</p>
     *        <p>
     *        <b>For AS2 connectors</b>
     *        </p>
     *        <p>
     *        With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in
     *        the request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     *        <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     *        temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and
     *        write a final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code>
     *        needs to provide read and write access to the parent directory of the file location used in the
     *        <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the
     *        parent directory of the files that you intend to send with <code>StartFileTransfer</code>.
     *        </p>
     *        <p>
     *        If you are using Basic authentication for your AS2 connector, the access role requires the
     *        <code>secretsmanager:GetSecretValue</code> permission for the secret. If the secret is encrypted using a
     *        customer-managed key instead of the Amazon Web Services managed key in Secrets Manager, then the role also
     *        needs the <code>kms:Decrypt</code> permission for that key.
     *        </p>
     *        <p>
     *        <b>For SFTP connectors</b>
     *        </p>
     *        <p>
     *        Make sure that the access role provides read and write access to the parent directory of the file location
     *        that's used in the <code>StartFileTransfer</code> request. Additionally, make sure that the role provides
     *        <code>secretsmanager:GetSecretValue</code> permission to Secrets Manager.
     */

    public void setAccessRole(String accessRole) {
        this.accessRole = accessRole;
    }

    /**
     * <p>
     * Connectors are used to send files using either the AS2 or SFTP protocol. For the access role, provide the Amazon
     * Resource Name (ARN) of the Identity and Access Management role to use.
     * </p>
     * <p>
     * <b>For AS2 connectors</b>
     * </p>
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * <p>
     * If you are using Basic authentication for your AS2 connector, the access role requires the
     * <code>secretsmanager:GetSecretValue</code> permission for the secret. If the secret is encrypted using a
     * customer-managed key instead of the Amazon Web Services managed key in Secrets Manager, then the role also needs
     * the <code>kms:Decrypt</code> permission for that key.
     * </p>
     * <p>
     * <b>For SFTP connectors</b>
     * </p>
     * <p>
     * Make sure that the access role provides read and write access to the parent directory of the file location that's
     * used in the <code>StartFileTransfer</code> request. Additionally, make sure that the role provides
     * <code>secretsmanager:GetSecretValue</code> permission to Secrets Manager.
     * </p>
     * 
     * @return Connectors are used to send files using either the AS2 or SFTP protocol. For the access role, provide the
     *         Amazon Resource Name (ARN) of the Identity and Access Management role to use.</p>
     *         <p>
     *         <b>For AS2 connectors</b>
     *         </p>
     *         <p>
     *         With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in
     *         the request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     *         <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     *         temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and
     *         write a final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code>
     *         needs to provide read and write access to the parent directory of the file location used in the
     *         <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the
     *         parent directory of the files that you intend to send with <code>StartFileTransfer</code>.
     *         </p>
     *         <p>
     *         If you are using Basic authentication for your AS2 connector, the access role requires the
     *         <code>secretsmanager:GetSecretValue</code> permission for the secret. If the secret is encrypted using a
     *         customer-managed key instead of the Amazon Web Services managed key in Secrets Manager, then the role
     *         also needs the <code>kms:Decrypt</code> permission for that key.
     *         </p>
     *         <p>
     *         <b>For SFTP connectors</b>
     *         </p>
     *         <p>
     *         Make sure that the access role provides read and write access to the parent directory of the file
     *         location that's used in the <code>StartFileTransfer</code> request. Additionally, make sure that the role
     *         provides <code>secretsmanager:GetSecretValue</code> permission to Secrets Manager.
     */

    public String getAccessRole() {
        return this.accessRole;
    }

    /**
     * <p>
     * Connectors are used to send files using either the AS2 or SFTP protocol. For the access role, provide the Amazon
     * Resource Name (ARN) of the Identity and Access Management role to use.
     * </p>
     * <p>
     * <b>For AS2 connectors</b>
     * </p>
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * <p>
     * If you are using Basic authentication for your AS2 connector, the access role requires the
     * <code>secretsmanager:GetSecretValue</code> permission for the secret. If the secret is encrypted using a
     * customer-managed key instead of the Amazon Web Services managed key in Secrets Manager, then the role also needs
     * the <code>kms:Decrypt</code> permission for that key.
     * </p>
     * <p>
     * <b>For SFTP connectors</b>
     * </p>
     * <p>
     * Make sure that the access role provides read and write access to the parent directory of the file location that's
     * used in the <code>StartFileTransfer</code> request. Additionally, make sure that the role provides
     * <code>secretsmanager:GetSecretValue</code> permission to Secrets Manager.
     * </p>
     * 
     * @param accessRole
     *        Connectors are used to send files using either the AS2 or SFTP protocol. For the access role, provide the
     *        Amazon Resource Name (ARN) of the Identity and Access Management role to use.</p>
     *        <p>
     *        <b>For AS2 connectors</b>
     *        </p>
     *        <p>
     *        With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in
     *        the request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     *        <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     *        temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and
     *        write a final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code>
     *        needs to provide read and write access to the parent directory of the file location used in the
     *        <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the
     *        parent directory of the files that you intend to send with <code>StartFileTransfer</code>.
     *        </p>
     *        <p>
     *        If you are using Basic authentication for your AS2 connector, the access role requires the
     *        <code>secretsmanager:GetSecretValue</code> permission for the secret. If the secret is encrypted using a
     *        customer-managed key instead of the Amazon Web Services managed key in Secrets Manager, then the role also
     *        needs the <code>kms:Decrypt</code> permission for that key.
     *        </p>
     *        <p>
     *        <b>For SFTP connectors</b>
     *        </p>
     *        <p>
     *        Make sure that the access role provides read and write access to the parent directory of the file location
     *        that's used in the <code>StartFileTransfer</code> request. Additionally, make sure that the role provides
     *        <code>secretsmanager:GetSecretValue</code> permission to Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withAccessRole(String accessRole) {
        setAccessRole(accessRole);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn
     * on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to
     *        turn on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your
     *        CloudWatch logs.
     */

    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn
     * on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector
     *         to turn on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your
     *         CloudWatch logs.
     */

    public String getLoggingRole() {
        return this.loggingRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn
     * on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to
     *        turn on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your
     *        CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withLoggingRole(String loggingRole) {
        setLoggingRole(loggingRole);
        return this;
    }

    /**
     * <p>
     * A structure that contains the parameters for an SFTP connector object.
     * </p>
     * 
     * @param sftpConfig
     *        A structure that contains the parameters for an SFTP connector object.
     */

    public void setSftpConfig(SftpConnectorConfig sftpConfig) {
        this.sftpConfig = sftpConfig;
    }

    /**
     * <p>
     * A structure that contains the parameters for an SFTP connector object.
     * </p>
     * 
     * @return A structure that contains the parameters for an SFTP connector object.
     */

    public SftpConnectorConfig getSftpConfig() {
        return this.sftpConfig;
    }

    /**
     * <p>
     * A structure that contains the parameters for an SFTP connector object.
     * </p>
     * 
     * @param sftpConfig
     *        A structure that contains the parameters for an SFTP connector object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withSftpConfig(SftpConnectorConfig sftpConfig) {
        setSftpConfig(sftpConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the security policy for the connector.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy for the connector.
     */

    public void setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy for the connector.
     * </p>
     * 
     * @return Specifies the name of the security policy for the connector.
     */

    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy for the connector.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withSecurityPolicyName(String securityPolicyName) {
        setSecurityPolicyName(securityPolicyName);
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
        if (getConnectorId() != null)
            sb.append("ConnectorId: ").append(getConnectorId()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getAs2Config() != null)
            sb.append("As2Config: ").append(getAs2Config()).append(",");
        if (getAccessRole() != null)
            sb.append("AccessRole: ").append(getAccessRole()).append(",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: ").append(getLoggingRole()).append(",");
        if (getSftpConfig() != null)
            sb.append("SftpConfig: ").append(getSftpConfig()).append(",");
        if (getSecurityPolicyName() != null)
            sb.append("SecurityPolicyName: ").append(getSecurityPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectorRequest == false)
            return false;
        UpdateConnectorRequest other = (UpdateConnectorRequest) obj;
        if (other.getConnectorId() == null ^ this.getConnectorId() == null)
            return false;
        if (other.getConnectorId() != null && other.getConnectorId().equals(this.getConnectorId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getAs2Config() == null ^ this.getAs2Config() == null)
            return false;
        if (other.getAs2Config() != null && other.getAs2Config().equals(this.getAs2Config()) == false)
            return false;
        if (other.getAccessRole() == null ^ this.getAccessRole() == null)
            return false;
        if (other.getAccessRole() != null && other.getAccessRole().equals(this.getAccessRole()) == false)
            return false;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null && other.getLoggingRole().equals(this.getLoggingRole()) == false)
            return false;
        if (other.getSftpConfig() == null ^ this.getSftpConfig() == null)
            return false;
        if (other.getSftpConfig() != null && other.getSftpConfig().equals(this.getSftpConfig()) == false)
            return false;
        if (other.getSecurityPolicyName() == null ^ this.getSecurityPolicyName() == null)
            return false;
        if (other.getSecurityPolicyName() != null && other.getSecurityPolicyName().equals(this.getSecurityPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getAs2Config() == null) ? 0 : getAs2Config().hashCode());
        hashCode = prime * hashCode + ((getAccessRole() == null) ? 0 : getAccessRole().hashCode());
        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getSftpConfig() == null) ? 0 : getSftpConfig().hashCode());
        hashCode = prime * hashCode + ((getSecurityPolicyName() == null) ? 0 : getSecurityPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectorRequest clone() {
        return (UpdateConnectorRequest) super.clone();
    }

}
