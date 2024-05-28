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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of a file transfer protocol-enabled server that was specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the server.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Specifies the ARN of the Amazon Web ServicesCertificate Manager (ACM) certificate. Required when
     * <code>Protocols</code> is set to <code>FTPS</code>.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The protocol settings that are configured for your server.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To indicate passive mode (for FTP and FTPS protocols), use the <code>PassiveIp</code> parameter. Enter a single
     * dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * To ignore the error that is generated when the client attempts to use the <code>SETSTAT</code> command on a file
     * that you are uploading to an Amazon S3 bucket, use the <code>SetStatOption</code> parameter. To have the Transfer
     * Family server ignore the <code>SETSTAT</code> command and upload files without needing to make any changes to
     * your SFTP client, set the value to <code>ENABLE_NO_OP</code>. If you set the <code>SetStatOption</code> parameter
     * to <code>ENABLE_NO_OP</code>, Transfer Family generates a log entry to Amazon CloudWatch Logs, so that you can
     * determine when the client is making a <code>SETSTAT</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether your Transfer Family server resumes recent, negotiated sessions through a unique session ID,
     * use the <code>TlsSessionResumptionMode</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>As2Transports</code> indicates the transport method for the AS2 messages. Currently, only HTTP is
     * supported.
     * </p>
     * </li>
     * </ul>
     */
    private ProtocolDetails protocolDetails;
    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers. There are two domains available:
     * Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The virtual private cloud (VPC) endpoint settings that are configured for your server. When you host your
     * endpoint within your VPC, you can make your endpoint accessible only to resources within your VPC, or you can
     * attach Elastic IP addresses and make your endpoint accessible to clients over the internet. Your VPC's default
     * security groups are automatically assigned to your endpoint.
     * </p>
     */
    private EndpointDetails endpointDetails;
    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output
     * of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * </p>
     */
    private String hostKeyFingerprint;
    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of a server is <code>AWS_DIRECTORY_SERVICE</code> or
     * <code>SERVICE_MANAGED</code>.
     * </p>
     */
    private IdentityProviderDetails identityProviderDetails;
    /**
     * <p>
     * The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows you to
     * store and access user credentials within the Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service for
     * Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web
     * Services using AD Connector. This option also requires you to provide a Directory ID by using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
     * authentication by using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If you choose
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter for the
     * <code>IdentityProviderDetails</code> data type.
     * </p>
     */
    private String identityProviderType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on
     * Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your
     * CloudWatch logs.
     * </p>
     */
    private String loggingRole;
    /**
     * <p>
     * Specifies a string to display when users connect to a server. This string is displayed after the user
     * authenticates.
     * </p>
     * <note>
     * <p>
     * The SFTP protocol does not support post-authentication display banners.
     * </p>
     * </note>
     */
    private String postAuthenticationLoginBanner;
    /**
     * <p>
     * Specifies a string to display when users connect to a server. This string is displayed before the user
     * authenticates. For example, the following banner displays details about using the system:
     * </p>
     * <p>
     * <code>This system is for the use of authorized users only. Individuals using this computer system without authority, or in excess of their authority, are subject to having all of their activities on this system monitored and recorded by system personnel.</code>
     * </p>
     */
    private String preAuthenticationLoginBanner;
    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which is used
     * to identify your server when clients connect to it over FTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be either
     * <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity types:
     * <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     * <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be <code>VPC</code>,
     * and domain must be Amazon S3.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.List<String> protocols;
    /**
     * <p>
     * Specifies the name of the security policy for the server.
     * </p>
     */
    private String securityPolicyName;
    /**
     * <p>
     * Specifies the unique system-assigned identifier for a server that you instantiate.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The condition of the server that was described. A value of <code>ONLINE</code> indicates that the server can
     * accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the server cannot
     * perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * </p>
     */
    private Integer userCount;
    /**
     * <p>
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     * workflow.
     * </p>
     * <p>
     * In addition to a workflow to execute when a file is uploaded completely, <code>WorkflowDetails</code> can also
     * contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs
     * when the server session disconnects while the file is still being uploaded.
     * </p>
     */
    private WorkflowDetails workflowDetails;
    /**
     * <p>
     * Specifies the log groups to which your server logs are sent.
     * </p>
     * <p>
     * To specify a log group, you must provide the ARN for an existing log group. In this case, the format of the log
     * group is as follows:
     * </p>
     * <p>
     * <code>arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*</code>
     * </p>
     * <p>
     * For example, <code>arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*</code>
     * </p>
     * <p>
     * If you have previously specified a log group for a server, you can clear it, and in effect turn off structured
     * logging, by providing an empty value for this parameter in an <code>update-server</code> call. For example:
     * </p>
     * <p>
     * <code>update-server --server-id s-1234567890abcdef0 --structured-log-destinations</code>
     * </p>
     */
    private java.util.List<String> structuredLogDestinations;
    /**
     * <p>
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default.
     * </p>
     * <p>
     * By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     * option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     * <code>FILE</code> if you want a mapping to have a file target.
     * </p>
     */
    private S3StorageOptions s3StorageOptions;
    /**
     * <p>
     * The list of egress IP addresses of this server. These IP addresses are only relevant for servers that use the AS2
     * protocol. They are used for sending asynchronous MDNs.
     * </p>
     * <p>
     * These IP addresses are assigned automatically when you create an AS2 server. Additionally, if you update an
     * existing server and add the AS2 protocol, static IP addresses are assigned as well.
     * </p>
     */
    private java.util.List<String> as2ServiceManagedEgressIpAddresses;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the server.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) of the server.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the server.
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) of the server.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the server.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the Amazon Web ServicesCertificate Manager (ACM) certificate. Required when
     * <code>Protocols</code> is set to <code>FTPS</code>.
     * </p>
     * 
     * @param certificate
     *        Specifies the ARN of the Amazon Web ServicesCertificate Manager (ACM) certificate. Required when
     *        <code>Protocols</code> is set to <code>FTPS</code>.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * Specifies the ARN of the Amazon Web ServicesCertificate Manager (ACM) certificate. Required when
     * <code>Protocols</code> is set to <code>FTPS</code>.
     * </p>
     * 
     * @return Specifies the ARN of the Amazon Web ServicesCertificate Manager (ACM) certificate. Required when
     *         <code>Protocols</code> is set to <code>FTPS</code>.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * Specifies the ARN of the Amazon Web ServicesCertificate Manager (ACM) certificate. Required when
     * <code>Protocols</code> is set to <code>FTPS</code>.
     * </p>
     * 
     * @param certificate
     *        Specifies the ARN of the Amazon Web ServicesCertificate Manager (ACM) certificate. Required when
     *        <code>Protocols</code> is set to <code>FTPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The protocol settings that are configured for your server.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To indicate passive mode (for FTP and FTPS protocols), use the <code>PassiveIp</code> parameter. Enter a single
     * dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * To ignore the error that is generated when the client attempts to use the <code>SETSTAT</code> command on a file
     * that you are uploading to an Amazon S3 bucket, use the <code>SetStatOption</code> parameter. To have the Transfer
     * Family server ignore the <code>SETSTAT</code> command and upload files without needing to make any changes to
     * your SFTP client, set the value to <code>ENABLE_NO_OP</code>. If you set the <code>SetStatOption</code> parameter
     * to <code>ENABLE_NO_OP</code>, Transfer Family generates a log entry to Amazon CloudWatch Logs, so that you can
     * determine when the client is making a <code>SETSTAT</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether your Transfer Family server resumes recent, negotiated sessions through a unique session ID,
     * use the <code>TlsSessionResumptionMode</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>As2Transports</code> indicates the transport method for the AS2 messages. Currently, only HTTP is
     * supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocolDetails
     *        The protocol settings that are configured for your server.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To indicate passive mode (for FTP and FTPS protocols), use the <code>PassiveIp</code> parameter. Enter a
     *        single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To ignore the error that is generated when the client attempts to use the <code>SETSTAT</code> command on
     *        a file that you are uploading to an Amazon S3 bucket, use the <code>SetStatOption</code> parameter. To
     *        have the Transfer Family server ignore the <code>SETSTAT</code> command and upload files without needing
     *        to make any changes to your SFTP client, set the value to <code>ENABLE_NO_OP</code>. If you set the
     *        <code>SetStatOption</code> parameter to <code>ENABLE_NO_OP</code>, Transfer Family generates a log entry
     *        to Amazon CloudWatch Logs, so that you can determine when the client is making a <code>SETSTAT</code>
     *        call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To determine whether your Transfer Family server resumes recent, negotiated sessions through a unique
     *        session ID, use the <code>TlsSessionResumptionMode</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>As2Transports</code> indicates the transport method for the AS2 messages. Currently, only HTTP is
     *        supported.
     *        </p>
     *        </li>
     */

    public void setProtocolDetails(ProtocolDetails protocolDetails) {
        this.protocolDetails = protocolDetails;
    }

    /**
     * <p>
     * The protocol settings that are configured for your server.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To indicate passive mode (for FTP and FTPS protocols), use the <code>PassiveIp</code> parameter. Enter a single
     * dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * To ignore the error that is generated when the client attempts to use the <code>SETSTAT</code> command on a file
     * that you are uploading to an Amazon S3 bucket, use the <code>SetStatOption</code> parameter. To have the Transfer
     * Family server ignore the <code>SETSTAT</code> command and upload files without needing to make any changes to
     * your SFTP client, set the value to <code>ENABLE_NO_OP</code>. If you set the <code>SetStatOption</code> parameter
     * to <code>ENABLE_NO_OP</code>, Transfer Family generates a log entry to Amazon CloudWatch Logs, so that you can
     * determine when the client is making a <code>SETSTAT</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether your Transfer Family server resumes recent, negotiated sessions through a unique session ID,
     * use the <code>TlsSessionResumptionMode</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>As2Transports</code> indicates the transport method for the AS2 messages. Currently, only HTTP is
     * supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The protocol settings that are configured for your server.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To indicate passive mode (for FTP and FTPS protocols), use the <code>PassiveIp</code> parameter. Enter a
     *         single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To ignore the error that is generated when the client attempts to use the <code>SETSTAT</code> command on
     *         a file that you are uploading to an Amazon S3 bucket, use the <code>SetStatOption</code> parameter. To
     *         have the Transfer Family server ignore the <code>SETSTAT</code> command and upload files without needing
     *         to make any changes to your SFTP client, set the value to <code>ENABLE_NO_OP</code>. If you set the
     *         <code>SetStatOption</code> parameter to <code>ENABLE_NO_OP</code>, Transfer Family generates a log entry
     *         to Amazon CloudWatch Logs, so that you can determine when the client is making a <code>SETSTAT</code>
     *         call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To determine whether your Transfer Family server resumes recent, negotiated sessions through a unique
     *         session ID, use the <code>TlsSessionResumptionMode</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>As2Transports</code> indicates the transport method for the AS2 messages. Currently, only HTTP is
     *         supported.
     *         </p>
     *         </li>
     */

    public ProtocolDetails getProtocolDetails() {
        return this.protocolDetails;
    }

    /**
     * <p>
     * The protocol settings that are configured for your server.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To indicate passive mode (for FTP and FTPS protocols), use the <code>PassiveIp</code> parameter. Enter a single
     * dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * To ignore the error that is generated when the client attempts to use the <code>SETSTAT</code> command on a file
     * that you are uploading to an Amazon S3 bucket, use the <code>SetStatOption</code> parameter. To have the Transfer
     * Family server ignore the <code>SETSTAT</code> command and upload files without needing to make any changes to
     * your SFTP client, set the value to <code>ENABLE_NO_OP</code>. If you set the <code>SetStatOption</code> parameter
     * to <code>ENABLE_NO_OP</code>, Transfer Family generates a log entry to Amazon CloudWatch Logs, so that you can
     * determine when the client is making a <code>SETSTAT</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * To determine whether your Transfer Family server resumes recent, negotiated sessions through a unique session ID,
     * use the <code>TlsSessionResumptionMode</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>As2Transports</code> indicates the transport method for the AS2 messages. Currently, only HTTP is
     * supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocolDetails
     *        The protocol settings that are configured for your server.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To indicate passive mode (for FTP and FTPS protocols), use the <code>PassiveIp</code> parameter. Enter a
     *        single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To ignore the error that is generated when the client attempts to use the <code>SETSTAT</code> command on
     *        a file that you are uploading to an Amazon S3 bucket, use the <code>SetStatOption</code> parameter. To
     *        have the Transfer Family server ignore the <code>SETSTAT</code> command and upload files without needing
     *        to make any changes to your SFTP client, set the value to <code>ENABLE_NO_OP</code>. If you set the
     *        <code>SetStatOption</code> parameter to <code>ENABLE_NO_OP</code>, Transfer Family generates a log entry
     *        to Amazon CloudWatch Logs, so that you can determine when the client is making a <code>SETSTAT</code>
     *        call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To determine whether your Transfer Family server resumes recent, negotiated sessions through a unique
     *        session ID, use the <code>TlsSessionResumptionMode</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>As2Transports</code> indicates the transport method for the AS2 messages. Currently, only HTTP is
     *        supported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withProtocolDetails(ProtocolDetails protocolDetails) {
        setProtocolDetails(protocolDetails);
        return this;
    }

    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers. There are two domains available:
     * Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     * 
     * @param domain
     *        Specifies the domain of the storage system that is used for file transfers. There are two domains
     *        available: Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The
     *        default value is S3.
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers. There are two domains available:
     * Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     * 
     * @return Specifies the domain of the storage system that is used for file transfers. There are two domains
     *         available: Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The
     *         default value is S3.
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers. There are two domains available:
     * Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     * 
     * @param domain
     *        Specifies the domain of the storage system that is used for file transfers. There are two domains
     *        available: Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The
     *        default value is S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DescribedServer withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers. There are two domains available:
     * Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     * 
     * @param domain
     *        Specifies the domain of the storage system that is used for file transfers. There are two domains
     *        available: Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The
     *        default value is S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DescribedServer withDomain(Domain domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) endpoint settings that are configured for your server. When you host your
     * endpoint within your VPC, you can make your endpoint accessible only to resources within your VPC, or you can
     * attach Elastic IP addresses and make your endpoint accessible to clients over the internet. Your VPC's default
     * security groups are automatically assigned to your endpoint.
     * </p>
     * 
     * @param endpointDetails
     *        The virtual private cloud (VPC) endpoint settings that are configured for your server. When you host your
     *        endpoint within your VPC, you can make your endpoint accessible only to resources within your VPC, or you
     *        can attach Elastic IP addresses and make your endpoint accessible to clients over the internet. Your VPC's
     *        default security groups are automatically assigned to your endpoint.
     */

    public void setEndpointDetails(EndpointDetails endpointDetails) {
        this.endpointDetails = endpointDetails;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) endpoint settings that are configured for your server. When you host your
     * endpoint within your VPC, you can make your endpoint accessible only to resources within your VPC, or you can
     * attach Elastic IP addresses and make your endpoint accessible to clients over the internet. Your VPC's default
     * security groups are automatically assigned to your endpoint.
     * </p>
     * 
     * @return The virtual private cloud (VPC) endpoint settings that are configured for your server. When you host your
     *         endpoint within your VPC, you can make your endpoint accessible only to resources within your VPC, or you
     *         can attach Elastic IP addresses and make your endpoint accessible to clients over the internet. Your
     *         VPC's default security groups are automatically assigned to your endpoint.
     */

    public EndpointDetails getEndpointDetails() {
        return this.endpointDetails;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) endpoint settings that are configured for your server. When you host your
     * endpoint within your VPC, you can make your endpoint accessible only to resources within your VPC, or you can
     * attach Elastic IP addresses and make your endpoint accessible to clients over the internet. Your VPC's default
     * security groups are automatically assigned to your endpoint.
     * </p>
     * 
     * @param endpointDetails
     *        The virtual private cloud (VPC) endpoint settings that are configured for your server. When you host your
     *        endpoint within your VPC, you can make your endpoint accessible only to resources within your VPC, or you
     *        can attach Elastic IP addresses and make your endpoint accessible to clients over the internet. Your VPC's
     *        default security groups are automatically assigned to your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withEndpointDetails(EndpointDetails endpointDetails) {
        setEndpointDetails(endpointDetails);
        return this;
    }

    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     * 
     * @param endpointType
     *        Defines the type of endpoint that your server is connected to. If your server is connected to a VPC
     *        endpoint, your server isn't accessible over the public internet.
     * @see EndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     * 
     * @return Defines the type of endpoint that your server is connected to. If your server is connected to a VPC
     *         endpoint, your server isn't accessible over the public internet.
     * @see EndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     * 
     * @param endpointType
     *        Defines the type of endpoint that your server is connected to. If your server is connected to a VPC
     *        endpoint, your server isn't accessible over the public internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DescribedServer withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     * 
     * @param endpointType
     *        Defines the type of endpoint that your server is connected to. If your server is connected to a VPC
     *        endpoint, your server isn't accessible over the public internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DescribedServer withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output
     * of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * </p>
     * 
     * @param hostKeyFingerprint
     *        Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the
     *        output of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     */

    public void setHostKeyFingerprint(String hostKeyFingerprint) {
        this.hostKeyFingerprint = hostKeyFingerprint;
    }

    /**
     * <p>
     * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output
     * of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * </p>
     * 
     * @return Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the
     *         output of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     */

    public String getHostKeyFingerprint() {
        return this.hostKeyFingerprint;
    }

    /**
     * <p>
     * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output
     * of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * </p>
     * 
     * @param hostKeyFingerprint
     *        Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the
     *        output of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withHostKeyFingerprint(String hostKeyFingerprint) {
        setHostKeyFingerprint(hostKeyFingerprint);
        return this;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of a server is <code>AWS_DIRECTORY_SERVICE</code> or
     * <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @param identityProviderDetails
     *        Specifies information to call a customer-supplied authentication API. This field is not populated when the
     *        <code>IdentityProviderType</code> of a server is <code>AWS_DIRECTORY_SERVICE</code> or
     *        <code>SERVICE_MANAGED</code>.
     */

    public void setIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of a server is <code>AWS_DIRECTORY_SERVICE</code> or
     * <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @return Specifies information to call a customer-supplied authentication API. This field is not populated when
     *         the <code>IdentityProviderType</code> of a server is <code>AWS_DIRECTORY_SERVICE</code> or
     *         <code>SERVICE_MANAGED</code>.
     */

    public IdentityProviderDetails getIdentityProviderDetails() {
        return this.identityProviderDetails;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of a server is <code>AWS_DIRECTORY_SERVICE</code> or
     * <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @param identityProviderDetails
     *        Specifies information to call a customer-supplied authentication API. This field is not populated when the
     *        <code>IdentityProviderType</code> of a server is <code>AWS_DIRECTORY_SERVICE</code> or
     *        <code>SERVICE_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        setIdentityProviderDetails(identityProviderDetails);
        return this;
    }

    /**
     * <p>
     * The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows you to
     * store and access user credentials within the Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service for
     * Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web
     * Services using AD Connector. This option also requires you to provide a Directory ID by using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
     * authentication by using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If you choose
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter for the
     * <code>IdentityProviderDetails</code> data type.
     * </p>
     * 
     * @param identityProviderType
     *        The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows
     *        you to store and access user credentials within the Transfer Family service.</p>
     *        <p>
     *        Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service
     *        for Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon
     *        Web Services using AD Connector. This option also requires you to provide a Directory ID by using the
     *        <code>IdentityProviderDetails</code> parameter.
     *        </p>
     *        <p>
     *        Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     *        <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
     *        authentication by using the <code>IdentityProviderDetails</code> parameter.
     *        </p>
     *        <p>
     *        Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If you
     *        choose this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter
     *        for the <code>IdentityProviderDetails</code> data type.
     * @see IdentityProviderType
     */

    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows you to
     * store and access user credentials within the Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service for
     * Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web
     * Services using AD Connector. This option also requires you to provide a Directory ID by using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
     * authentication by using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If you choose
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter for the
     * <code>IdentityProviderDetails</code> data type.
     * </p>
     * 
     * @return The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows
     *         you to store and access user credentials within the Transfer Family service.</p>
     *         <p>
     *         Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service
     *         for Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon
     *         Web Services using AD Connector. This option also requires you to provide a Directory ID by using the
     *         <code>IdentityProviderDetails</code> parameter.
     *         </p>
     *         <p>
     *         Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     *         <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
     *         authentication by using the <code>IdentityProviderDetails</code> parameter.
     *         </p>
     *         <p>
     *         Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If
     *         you choose this value, you must specify the ARN for the Lambda function in the <code>Function</code>
     *         parameter for the <code>IdentityProviderDetails</code> data type.
     * @see IdentityProviderType
     */

    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * <p>
     * The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows you to
     * store and access user credentials within the Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service for
     * Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web
     * Services using AD Connector. This option also requires you to provide a Directory ID by using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
     * authentication by using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If you choose
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter for the
     * <code>IdentityProviderDetails</code> data type.
     * </p>
     * 
     * @param identityProviderType
     *        The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows
     *        you to store and access user credentials within the Transfer Family service.</p>
     *        <p>
     *        Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service
     *        for Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon
     *        Web Services using AD Connector. This option also requires you to provide a Directory ID by using the
     *        <code>IdentityProviderDetails</code> parameter.
     *        </p>
     *        <p>
     *        Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     *        <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
     *        authentication by using the <code>IdentityProviderDetails</code> parameter.
     *        </p>
     *        <p>
     *        Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If you
     *        choose this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter
     *        for the <code>IdentityProviderDetails</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public DescribedServer withIdentityProviderType(String identityProviderType) {
        setIdentityProviderType(identityProviderType);
        return this;
    }

    /**
     * <p>
     * The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows you to
     * store and access user credentials within the Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service for
     * Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web
     * Services using AD Connector. This option also requires you to provide a Directory ID by using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
     * authentication by using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If you choose
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter for the
     * <code>IdentityProviderDetails</code> data type.
     * </p>
     * 
     * @param identityProviderType
     *        The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows
     *        you to store and access user credentials within the Transfer Family service.</p>
     *        <p>
     *        Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service
     *        for Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon
     *        Web Services using AD Connector. This option also requires you to provide a Directory ID by using the
     *        <code>IdentityProviderDetails</code> parameter.
     *        </p>
     *        <p>
     *        Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     *        <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
     *        authentication by using the <code>IdentityProviderDetails</code> parameter.
     *        </p>
     *        <p>
     *        Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If you
     *        choose this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter
     *        for the <code>IdentityProviderDetails</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public DescribedServer withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on
     * Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your
     * CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to
     *        turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity
     *        in your CloudWatch logs.
     */

    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on
     * Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your
     * CloudWatch logs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to
     *         turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity
     *         in your CloudWatch logs.
     */

    public String getLoggingRole() {
        return this.loggingRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on
     * Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your
     * CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to
     *        turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity
     *        in your CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withLoggingRole(String loggingRole) {
        setLoggingRole(loggingRole);
        return this;
    }

    /**
     * <p>
     * Specifies a string to display when users connect to a server. This string is displayed after the user
     * authenticates.
     * </p>
     * <note>
     * <p>
     * The SFTP protocol does not support post-authentication display banners.
     * </p>
     * </note>
     * 
     * @param postAuthenticationLoginBanner
     *        Specifies a string to display when users connect to a server. This string is displayed after the user
     *        authenticates.</p> <note>
     *        <p>
     *        The SFTP protocol does not support post-authentication display banners.
     *        </p>
     */

    public void setPostAuthenticationLoginBanner(String postAuthenticationLoginBanner) {
        this.postAuthenticationLoginBanner = postAuthenticationLoginBanner;
    }

    /**
     * <p>
     * Specifies a string to display when users connect to a server. This string is displayed after the user
     * authenticates.
     * </p>
     * <note>
     * <p>
     * The SFTP protocol does not support post-authentication display banners.
     * </p>
     * </note>
     * 
     * @return Specifies a string to display when users connect to a server. This string is displayed after the user
     *         authenticates.</p> <note>
     *         <p>
     *         The SFTP protocol does not support post-authentication display banners.
     *         </p>
     */

    public String getPostAuthenticationLoginBanner() {
        return this.postAuthenticationLoginBanner;
    }

    /**
     * <p>
     * Specifies a string to display when users connect to a server. This string is displayed after the user
     * authenticates.
     * </p>
     * <note>
     * <p>
     * The SFTP protocol does not support post-authentication display banners.
     * </p>
     * </note>
     * 
     * @param postAuthenticationLoginBanner
     *        Specifies a string to display when users connect to a server. This string is displayed after the user
     *        authenticates.</p> <note>
     *        <p>
     *        The SFTP protocol does not support post-authentication display banners.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withPostAuthenticationLoginBanner(String postAuthenticationLoginBanner) {
        setPostAuthenticationLoginBanner(postAuthenticationLoginBanner);
        return this;
    }

    /**
     * <p>
     * Specifies a string to display when users connect to a server. This string is displayed before the user
     * authenticates. For example, the following banner displays details about using the system:
     * </p>
     * <p>
     * <code>This system is for the use of authorized users only. Individuals using this computer system without authority, or in excess of their authority, are subject to having all of their activities on this system monitored and recorded by system personnel.</code>
     * </p>
     * 
     * @param preAuthenticationLoginBanner
     *        Specifies a string to display when users connect to a server. This string is displayed before the user
     *        authenticates. For example, the following banner displays details about using the system:</p>
     *        <p>
     *        <code>This system is for the use of authorized users only. Individuals using this computer system without authority, or in excess of their authority, are subject to having all of their activities on this system monitored and recorded by system personnel.</code>
     */

    public void setPreAuthenticationLoginBanner(String preAuthenticationLoginBanner) {
        this.preAuthenticationLoginBanner = preAuthenticationLoginBanner;
    }

    /**
     * <p>
     * Specifies a string to display when users connect to a server. This string is displayed before the user
     * authenticates. For example, the following banner displays details about using the system:
     * </p>
     * <p>
     * <code>This system is for the use of authorized users only. Individuals using this computer system without authority, or in excess of their authority, are subject to having all of their activities on this system monitored and recorded by system personnel.</code>
     * </p>
     * 
     * @return Specifies a string to display when users connect to a server. This string is displayed before the user
     *         authenticates. For example, the following banner displays details about using the system:</p>
     *         <p>
     *         <code>This system is for the use of authorized users only. Individuals using this computer system without authority, or in excess of their authority, are subject to having all of their activities on this system monitored and recorded by system personnel.</code>
     */

    public String getPreAuthenticationLoginBanner() {
        return this.preAuthenticationLoginBanner;
    }

    /**
     * <p>
     * Specifies a string to display when users connect to a server. This string is displayed before the user
     * authenticates. For example, the following banner displays details about using the system:
     * </p>
     * <p>
     * <code>This system is for the use of authorized users only. Individuals using this computer system without authority, or in excess of their authority, are subject to having all of their activities on this system monitored and recorded by system personnel.</code>
     * </p>
     * 
     * @param preAuthenticationLoginBanner
     *        Specifies a string to display when users connect to a server. This string is displayed before the user
     *        authenticates. For example, the following banner displays details about using the system:</p>
     *        <p>
     *        <code>This system is for the use of authorized users only. Individuals using this computer system without authority, or in excess of their authority, are subject to having all of their activities on this system monitored and recorded by system personnel.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withPreAuthenticationLoginBanner(String preAuthenticationLoginBanner) {
        setPreAuthenticationLoginBanner(preAuthenticationLoginBanner);
        return this;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which is used
     * to identify your server when clients connect to it over FTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be either
     * <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity types:
     * <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     * <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be <code>VPC</code>,
     * and domain must be Amazon S3.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *         connect to your server's endpoint. The available protocols are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <ul>
     *         <li>
     *         <p>
     *         If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which
     *         is used to identify your server when clients connect to it over FTPS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     *         <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     *         either <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be
     *         associated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     *         <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity
     *         types: <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     *         <code>API_GATEWAY</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be
     *         <code>VPC</code>, and domain must be Amazon S3.
     *         </p>
     *         </li>
     *         </ul>
     * @see Protocol
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which is used
     * to identify your server when clients connect to it over FTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be either
     * <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity types:
     * <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     * <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be <code>VPC</code>,
     * and domain must be Amazon S3.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param protocols
     *        Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *        connect to your server's endpoint. The available protocols are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which
     *        is used to identify your server when clients connect to it over FTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     *        <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     *        either <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be
     *        associated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     *        <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity
     *        types: <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     *        <code>API_GATEWAY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be
     *        <code>VPC</code>, and domain must be Amazon S3.
     *        </p>
     *        </li>
     *        </ul>
     * @see Protocol
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which is used
     * to identify your server when clients connect to it over FTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be either
     * <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity types:
     * <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     * <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be <code>VPC</code>,
     * and domain must be Amazon S3.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *        connect to your server's endpoint. The available protocols are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which
     *        is used to identify your server when clients connect to it over FTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     *        <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     *        either <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be
     *        associated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     *        <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity
     *        types: <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     *        <code>API_GATEWAY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be
     *        <code>VPC</code>, and domain must be Amazon S3.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public DescribedServer withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new java.util.ArrayList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which is used
     * to identify your server when clients connect to it over FTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be either
     * <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity types:
     * <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     * <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be <code>VPC</code>,
     * and domain must be Amazon S3.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param protocols
     *        Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *        connect to your server's endpoint. The available protocols are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which
     *        is used to identify your server when clients connect to it over FTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     *        <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     *        either <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be
     *        associated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     *        <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity
     *        types: <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     *        <code>API_GATEWAY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be
     *        <code>VPC</code>, and domain must be Amazon S3.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public DescribedServer withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which is used
     * to identify your server when clients connect to it over FTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be either
     * <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity types:
     * <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     * <code>API_GATEWAY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be <code>VPC</code>,
     * and domain must be Amazon S3.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param protocols
     *        Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *        connect to your server's endpoint. The available protocols are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AS2</code> (Applicability Statement 2): used for transporting structured business-to-business data
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        If you select <code>FTPS</code>, you must choose a certificate stored in Certificate Manager (ACM) which
     *        is used to identify your server when clients connect to it over FTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes either <code>FTP</code> or <code>FTPS</code>, then the
     *        <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     *        either <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or <code>API_GATEWAY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes <code>FTP</code>, then <code>AddressAllocationIds</code> cannot be
     *        associated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> is set only to <code>SFTP</code>, the <code>EndpointType</code> can be set to
     *        <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set any of the supported identity
     *        types: <code>SERVICE_MANAGED</code>, <code>AWS_DIRECTORY_SERVICE</code>, <code>AWS_LAMBDA</code>, or
     *        <code>API_GATEWAY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>Protocol</code> includes <code>AS2</code>, then the <code>EndpointType</code> must be
     *        <code>VPC</code>, and domain must be Amazon S3.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public DescribedServer withProtocols(Protocol... protocols) {
        java.util.ArrayList<String> protocolsCopy = new java.util.ArrayList<String>(protocols.length);
        for (Protocol value : protocols) {
            protocolsCopy.add(value.toString());
        }
        if (getProtocols() == null) {
            setProtocols(protocolsCopy);
        } else {
            getProtocols().addAll(protocolsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the name of the security policy for the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy for the server.
     */

    public void setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy for the server.
     * </p>
     * 
     * @return Specifies the name of the security policy for the server.
     */

    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy for the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withSecurityPolicyName(String securityPolicyName) {
        setSecurityPolicyName(securityPolicyName);
        return this;
    }

    /**
     * <p>
     * Specifies the unique system-assigned identifier for a server that you instantiate.
     * </p>
     * 
     * @param serverId
     *        Specifies the unique system-assigned identifier for a server that you instantiate.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * Specifies the unique system-assigned identifier for a server that you instantiate.
     * </p>
     * 
     * @return Specifies the unique system-assigned identifier for a server that you instantiate.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * Specifies the unique system-assigned identifier for a server that you instantiate.
     * </p>
     * 
     * @param serverId
     *        Specifies the unique system-assigned identifier for a server that you instantiate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The condition of the server that was described. A value of <code>ONLINE</code> indicates that the server can
     * accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the server cannot
     * perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @param state
     *        The condition of the server that was described. A value of <code>ONLINE</code> indicates that the server
     *        can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the
     *        server cannot perform file transfer operations.</p>
     *        <p>
     *        The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an
     *        intermediate state, either not fully able to respond, or not fully offline. The values of
     *        <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The condition of the server that was described. A value of <code>ONLINE</code> indicates that the server can
     * accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the server cannot
     * perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @return The condition of the server that was described. A value of <code>ONLINE</code> indicates that the server
     *         can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the
     *         server cannot perform file transfer operations.</p>
     *         <p>
     *         The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an
     *         intermediate state, either not fully able to respond, or not fully offline. The values of
     *         <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The condition of the server that was described. A value of <code>ONLINE</code> indicates that the server can
     * accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the server cannot
     * perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @param state
     *        The condition of the server that was described. A value of <code>ONLINE</code> indicates that the server
     *        can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the
     *        server cannot perform file transfer operations.</p>
     *        <p>
     *        The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an
     *        intermediate state, either not fully able to respond, or not fully offline. The values of
     *        <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public DescribedServer withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The condition of the server that was described. A value of <code>ONLINE</code> indicates that the server can
     * accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the server cannot
     * perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @param state
     *        The condition of the server that was described. A value of <code>ONLINE</code> indicates that the server
     *        can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the
     *        server cannot perform file transfer operations.</p>
     *        <p>
     *        The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an
     *        intermediate state, either not fully able to respond, or not fully offline. The values of
     *        <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public DescribedServer withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     * 
     * @return Specifies the key-value pairs that you can use to search for and group servers that were assigned to the
     *         server that was described.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs that you can use to search for and group servers that were assigned to the
     *        server that was described.
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
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs that you can use to search for and group servers that were assigned to the
     *        server that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withTags(Tag... tags) {
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
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs that you can use to search for and group servers that were assigned to the
     *        server that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * </p>
     * 
     * @param userCount
     *        Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     */

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    /**
     * <p>
     * Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * </p>
     * 
     * @return Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     */

    public Integer getUserCount() {
        return this.userCount;
    }

    /**
     * <p>
     * Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * </p>
     * 
     * @param userCount
     *        Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withUserCount(Integer userCount) {
        setUserCount(userCount);
        return this;
    }

    /**
     * <p>
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     * workflow.
     * </p>
     * <p>
     * In addition to a workflow to execute when a file is uploaded completely, <code>WorkflowDetails</code> can also
     * contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs
     * when the server session disconnects while the file is still being uploaded.
     * </p>
     * 
     * @param workflowDetails
     *        Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     *        workflow.</p>
     *        <p>
     *        In addition to a workflow to execute when a file is uploaded completely, <code>WorkflowDetails</code> can
     *        also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial
     *        upload occurs when the server session disconnects while the file is still being uploaded.
     */

    public void setWorkflowDetails(WorkflowDetails workflowDetails) {
        this.workflowDetails = workflowDetails;
    }

    /**
     * <p>
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     * workflow.
     * </p>
     * <p>
     * In addition to a workflow to execute when a file is uploaded completely, <code>WorkflowDetails</code> can also
     * contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs
     * when the server session disconnects while the file is still being uploaded.
     * </p>
     * 
     * @return Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     *         workflow.</p>
     *         <p>
     *         In addition to a workflow to execute when a file is uploaded completely, <code>WorkflowDetails</code> can
     *         also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial
     *         upload occurs when the server session disconnects while the file is still being uploaded.
     */

    public WorkflowDetails getWorkflowDetails() {
        return this.workflowDetails;
    }

    /**
     * <p>
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     * workflow.
     * </p>
     * <p>
     * In addition to a workflow to execute when a file is uploaded completely, <code>WorkflowDetails</code> can also
     * contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs
     * when the server session disconnects while the file is still being uploaded.
     * </p>
     * 
     * @param workflowDetails
     *        Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     *        workflow.</p>
     *        <p>
     *        In addition to a workflow to execute when a file is uploaded completely, <code>WorkflowDetails</code> can
     *        also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial
     *        upload occurs when the server session disconnects while the file is still being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withWorkflowDetails(WorkflowDetails workflowDetails) {
        setWorkflowDetails(workflowDetails);
        return this;
    }

    /**
     * <p>
     * Specifies the log groups to which your server logs are sent.
     * </p>
     * <p>
     * To specify a log group, you must provide the ARN for an existing log group. In this case, the format of the log
     * group is as follows:
     * </p>
     * <p>
     * <code>arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*</code>
     * </p>
     * <p>
     * For example, <code>arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*</code>
     * </p>
     * <p>
     * If you have previously specified a log group for a server, you can clear it, and in effect turn off structured
     * logging, by providing an empty value for this parameter in an <code>update-server</code> call. For example:
     * </p>
     * <p>
     * <code>update-server --server-id s-1234567890abcdef0 --structured-log-destinations</code>
     * </p>
     * 
     * @return Specifies the log groups to which your server logs are sent.</p>
     *         <p>
     *         To specify a log group, you must provide the ARN for an existing log group. In this case, the format of
     *         the log group is as follows:
     *         </p>
     *         <p>
     *         <code>arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*</code>
     *         </p>
     *         <p>
     *         For example, <code>arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*</code>
     *         </p>
     *         <p>
     *         If you have previously specified a log group for a server, you can clear it, and in effect turn off
     *         structured logging, by providing an empty value for this parameter in an <code>update-server</code> call.
     *         For example:
     *         </p>
     *         <p>
     *         <code>update-server --server-id s-1234567890abcdef0 --structured-log-destinations</code>
     */

    public java.util.List<String> getStructuredLogDestinations() {
        return structuredLogDestinations;
    }

    /**
     * <p>
     * Specifies the log groups to which your server logs are sent.
     * </p>
     * <p>
     * To specify a log group, you must provide the ARN for an existing log group. In this case, the format of the log
     * group is as follows:
     * </p>
     * <p>
     * <code>arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*</code>
     * </p>
     * <p>
     * For example, <code>arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*</code>
     * </p>
     * <p>
     * If you have previously specified a log group for a server, you can clear it, and in effect turn off structured
     * logging, by providing an empty value for this parameter in an <code>update-server</code> call. For example:
     * </p>
     * <p>
     * <code>update-server --server-id s-1234567890abcdef0 --structured-log-destinations</code>
     * </p>
     * 
     * @param structuredLogDestinations
     *        Specifies the log groups to which your server logs are sent.</p>
     *        <p>
     *        To specify a log group, you must provide the ARN for an existing log group. In this case, the format of
     *        the log group is as follows:
     *        </p>
     *        <p>
     *        <code>arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*</code>
     *        </p>
     *        <p>
     *        For example, <code>arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*</code>
     *        </p>
     *        <p>
     *        If you have previously specified a log group for a server, you can clear it, and in effect turn off
     *        structured logging, by providing an empty value for this parameter in an <code>update-server</code> call.
     *        For example:
     *        </p>
     *        <p>
     *        <code>update-server --server-id s-1234567890abcdef0 --structured-log-destinations</code>
     */

    public void setStructuredLogDestinations(java.util.Collection<String> structuredLogDestinations) {
        if (structuredLogDestinations == null) {
            this.structuredLogDestinations = null;
            return;
        }

        this.structuredLogDestinations = new java.util.ArrayList<String>(structuredLogDestinations);
    }

    /**
     * <p>
     * Specifies the log groups to which your server logs are sent.
     * </p>
     * <p>
     * To specify a log group, you must provide the ARN for an existing log group. In this case, the format of the log
     * group is as follows:
     * </p>
     * <p>
     * <code>arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*</code>
     * </p>
     * <p>
     * For example, <code>arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*</code>
     * </p>
     * <p>
     * If you have previously specified a log group for a server, you can clear it, and in effect turn off structured
     * logging, by providing an empty value for this parameter in an <code>update-server</code> call. For example:
     * </p>
     * <p>
     * <code>update-server --server-id s-1234567890abcdef0 --structured-log-destinations</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStructuredLogDestinations(java.util.Collection)} or
     * {@link #withStructuredLogDestinations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param structuredLogDestinations
     *        Specifies the log groups to which your server logs are sent.</p>
     *        <p>
     *        To specify a log group, you must provide the ARN for an existing log group. In this case, the format of
     *        the log group is as follows:
     *        </p>
     *        <p>
     *        <code>arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*</code>
     *        </p>
     *        <p>
     *        For example, <code>arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*</code>
     *        </p>
     *        <p>
     *        If you have previously specified a log group for a server, you can clear it, and in effect turn off
     *        structured logging, by providing an empty value for this parameter in an <code>update-server</code> call.
     *        For example:
     *        </p>
     *        <p>
     *        <code>update-server --server-id s-1234567890abcdef0 --structured-log-destinations</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withStructuredLogDestinations(String... structuredLogDestinations) {
        if (this.structuredLogDestinations == null) {
            setStructuredLogDestinations(new java.util.ArrayList<String>(structuredLogDestinations.length));
        }
        for (String ele : structuredLogDestinations) {
            this.structuredLogDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the log groups to which your server logs are sent.
     * </p>
     * <p>
     * To specify a log group, you must provide the ARN for an existing log group. In this case, the format of the log
     * group is as follows:
     * </p>
     * <p>
     * <code>arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*</code>
     * </p>
     * <p>
     * For example, <code>arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*</code>
     * </p>
     * <p>
     * If you have previously specified a log group for a server, you can clear it, and in effect turn off structured
     * logging, by providing an empty value for this parameter in an <code>update-server</code> call. For example:
     * </p>
     * <p>
     * <code>update-server --server-id s-1234567890abcdef0 --structured-log-destinations</code>
     * </p>
     * 
     * @param structuredLogDestinations
     *        Specifies the log groups to which your server logs are sent.</p>
     *        <p>
     *        To specify a log group, you must provide the ARN for an existing log group. In this case, the format of
     *        the log group is as follows:
     *        </p>
     *        <p>
     *        <code>arn:aws:logs:region-name:amazon-account-id:log-group:log-group-name:*</code>
     *        </p>
     *        <p>
     *        For example, <code>arn:aws:logs:us-east-1:111122223333:log-group:mytestgroup:*</code>
     *        </p>
     *        <p>
     *        If you have previously specified a log group for a server, you can clear it, and in effect turn off
     *        structured logging, by providing an empty value for this parameter in an <code>update-server</code> call.
     *        For example:
     *        </p>
     *        <p>
     *        <code>update-server --server-id s-1234567890abcdef0 --structured-log-destinations</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withStructuredLogDestinations(java.util.Collection<String> structuredLogDestinations) {
        setStructuredLogDestinations(structuredLogDestinations);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default.
     * </p>
     * <p>
     * By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     * option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     * <code>FILE</code> if you want a mapping to have a file target.
     * </p>
     * 
     * @param s3StorageOptions
     *        Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by
     *        default.</p>
     *        <p>
     *        By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     *        option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     *        <code>FILE</code> if you want a mapping to have a file target.
     */

    public void setS3StorageOptions(S3StorageOptions s3StorageOptions) {
        this.s3StorageOptions = s3StorageOptions;
    }

    /**
     * <p>
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default.
     * </p>
     * <p>
     * By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     * option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     * <code>FILE</code> if you want a mapping to have a file target.
     * </p>
     * 
     * @return Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by
     *         default.</p>
     *         <p>
     *         By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable
     *         this option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code>
     *         <code>Type</code> to <code>FILE</code> if you want a mapping to have a file target.
     */

    public S3StorageOptions getS3StorageOptions() {
        return this.s3StorageOptions;
    }

    /**
     * <p>
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default.
     * </p>
     * <p>
     * By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     * option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     * <code>FILE</code> if you want a mapping to have a file target.
     * </p>
     * 
     * @param s3StorageOptions
     *        Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by
     *        default.</p>
     *        <p>
     *        By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     *        option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     *        <code>FILE</code> if you want a mapping to have a file target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withS3StorageOptions(S3StorageOptions s3StorageOptions) {
        setS3StorageOptions(s3StorageOptions);
        return this;
    }

    /**
     * <p>
     * The list of egress IP addresses of this server. These IP addresses are only relevant for servers that use the AS2
     * protocol. They are used for sending asynchronous MDNs.
     * </p>
     * <p>
     * These IP addresses are assigned automatically when you create an AS2 server. Additionally, if you update an
     * existing server and add the AS2 protocol, static IP addresses are assigned as well.
     * </p>
     * 
     * @return The list of egress IP addresses of this server. These IP addresses are only relevant for servers that use
     *         the AS2 protocol. They are used for sending asynchronous MDNs.</p>
     *         <p>
     *         These IP addresses are assigned automatically when you create an AS2 server. Additionally, if you update
     *         an existing server and add the AS2 protocol, static IP addresses are assigned as well.
     */

    public java.util.List<String> getAs2ServiceManagedEgressIpAddresses() {
        return as2ServiceManagedEgressIpAddresses;
    }

    /**
     * <p>
     * The list of egress IP addresses of this server. These IP addresses are only relevant for servers that use the AS2
     * protocol. They are used for sending asynchronous MDNs.
     * </p>
     * <p>
     * These IP addresses are assigned automatically when you create an AS2 server. Additionally, if you update an
     * existing server and add the AS2 protocol, static IP addresses are assigned as well.
     * </p>
     * 
     * @param as2ServiceManagedEgressIpAddresses
     *        The list of egress IP addresses of this server. These IP addresses are only relevant for servers that use
     *        the AS2 protocol. They are used for sending asynchronous MDNs.</p>
     *        <p>
     *        These IP addresses are assigned automatically when you create an AS2 server. Additionally, if you update
     *        an existing server and add the AS2 protocol, static IP addresses are assigned as well.
     */

    public void setAs2ServiceManagedEgressIpAddresses(java.util.Collection<String> as2ServiceManagedEgressIpAddresses) {
        if (as2ServiceManagedEgressIpAddresses == null) {
            this.as2ServiceManagedEgressIpAddresses = null;
            return;
        }

        this.as2ServiceManagedEgressIpAddresses = new java.util.ArrayList<String>(as2ServiceManagedEgressIpAddresses);
    }

    /**
     * <p>
     * The list of egress IP addresses of this server. These IP addresses are only relevant for servers that use the AS2
     * protocol. They are used for sending asynchronous MDNs.
     * </p>
     * <p>
     * These IP addresses are assigned automatically when you create an AS2 server. Additionally, if you update an
     * existing server and add the AS2 protocol, static IP addresses are assigned as well.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAs2ServiceManagedEgressIpAddresses(java.util.Collection)} or
     * {@link #withAs2ServiceManagedEgressIpAddresses(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param as2ServiceManagedEgressIpAddresses
     *        The list of egress IP addresses of this server. These IP addresses are only relevant for servers that use
     *        the AS2 protocol. They are used for sending asynchronous MDNs.</p>
     *        <p>
     *        These IP addresses are assigned automatically when you create an AS2 server. Additionally, if you update
     *        an existing server and add the AS2 protocol, static IP addresses are assigned as well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withAs2ServiceManagedEgressIpAddresses(String... as2ServiceManagedEgressIpAddresses) {
        if (this.as2ServiceManagedEgressIpAddresses == null) {
            setAs2ServiceManagedEgressIpAddresses(new java.util.ArrayList<String>(as2ServiceManagedEgressIpAddresses.length));
        }
        for (String ele : as2ServiceManagedEgressIpAddresses) {
            this.as2ServiceManagedEgressIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of egress IP addresses of this server. These IP addresses are only relevant for servers that use the AS2
     * protocol. They are used for sending asynchronous MDNs.
     * </p>
     * <p>
     * These IP addresses are assigned automatically when you create an AS2 server. Additionally, if you update an
     * existing server and add the AS2 protocol, static IP addresses are assigned as well.
     * </p>
     * 
     * @param as2ServiceManagedEgressIpAddresses
     *        The list of egress IP addresses of this server. These IP addresses are only relevant for servers that use
     *        the AS2 protocol. They are used for sending asynchronous MDNs.</p>
     *        <p>
     *        These IP addresses are assigned automatically when you create an AS2 server. Additionally, if you update
     *        an existing server and add the AS2 protocol, static IP addresses are assigned as well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withAs2ServiceManagedEgressIpAddresses(java.util.Collection<String> as2ServiceManagedEgressIpAddresses) {
        setAs2ServiceManagedEgressIpAddresses(as2ServiceManagedEgressIpAddresses);
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
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getProtocolDetails() != null)
            sb.append("ProtocolDetails: ").append(getProtocolDetails()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getEndpointDetails() != null)
            sb.append("EndpointDetails: ").append(getEndpointDetails()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getHostKeyFingerprint() != null)
            sb.append("HostKeyFingerprint: ").append(getHostKeyFingerprint()).append(",");
        if (getIdentityProviderDetails() != null)
            sb.append("IdentityProviderDetails: ").append(getIdentityProviderDetails()).append(",");
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: ").append(getIdentityProviderType()).append(",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: ").append(getLoggingRole()).append(",");
        if (getPostAuthenticationLoginBanner() != null)
            sb.append("PostAuthenticationLoginBanner: ").append(getPostAuthenticationLoginBanner()).append(",");
        if (getPreAuthenticationLoginBanner() != null)
            sb.append("PreAuthenticationLoginBanner: ").append(getPreAuthenticationLoginBanner()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols()).append(",");
        if (getSecurityPolicyName() != null)
            sb.append("SecurityPolicyName: ").append(getSecurityPolicyName()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUserCount() != null)
            sb.append("UserCount: ").append(getUserCount()).append(",");
        if (getWorkflowDetails() != null)
            sb.append("WorkflowDetails: ").append(getWorkflowDetails()).append(",");
        if (getStructuredLogDestinations() != null)
            sb.append("StructuredLogDestinations: ").append(getStructuredLogDestinations()).append(",");
        if (getS3StorageOptions() != null)
            sb.append("S3StorageOptions: ").append(getS3StorageOptions()).append(",");
        if (getAs2ServiceManagedEgressIpAddresses() != null)
            sb.append("As2ServiceManagedEgressIpAddresses: ").append(getAs2ServiceManagedEgressIpAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribedServer == false)
            return false;
        DescribedServer other = (DescribedServer) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getProtocolDetails() == null ^ this.getProtocolDetails() == null)
            return false;
        if (other.getProtocolDetails() != null && other.getProtocolDetails().equals(this.getProtocolDetails()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getEndpointDetails() == null ^ this.getEndpointDetails() == null)
            return false;
        if (other.getEndpointDetails() != null && other.getEndpointDetails().equals(this.getEndpointDetails()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getHostKeyFingerprint() == null ^ this.getHostKeyFingerprint() == null)
            return false;
        if (other.getHostKeyFingerprint() != null && other.getHostKeyFingerprint().equals(this.getHostKeyFingerprint()) == false)
            return false;
        if (other.getIdentityProviderDetails() == null ^ this.getIdentityProviderDetails() == null)
            return false;
        if (other.getIdentityProviderDetails() != null && other.getIdentityProviderDetails().equals(this.getIdentityProviderDetails()) == false)
            return false;
        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null && other.getLoggingRole().equals(this.getLoggingRole()) == false)
            return false;
        if (other.getPostAuthenticationLoginBanner() == null ^ this.getPostAuthenticationLoginBanner() == null)
            return false;
        if (other.getPostAuthenticationLoginBanner() != null
                && other.getPostAuthenticationLoginBanner().equals(this.getPostAuthenticationLoginBanner()) == false)
            return false;
        if (other.getPreAuthenticationLoginBanner() == null ^ this.getPreAuthenticationLoginBanner() == null)
            return false;
        if (other.getPreAuthenticationLoginBanner() != null && other.getPreAuthenticationLoginBanner().equals(this.getPreAuthenticationLoginBanner()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getSecurityPolicyName() == null ^ this.getSecurityPolicyName() == null)
            return false;
        if (other.getSecurityPolicyName() != null && other.getSecurityPolicyName().equals(this.getSecurityPolicyName()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUserCount() == null ^ this.getUserCount() == null)
            return false;
        if (other.getUserCount() != null && other.getUserCount().equals(this.getUserCount()) == false)
            return false;
        if (other.getWorkflowDetails() == null ^ this.getWorkflowDetails() == null)
            return false;
        if (other.getWorkflowDetails() != null && other.getWorkflowDetails().equals(this.getWorkflowDetails()) == false)
            return false;
        if (other.getStructuredLogDestinations() == null ^ this.getStructuredLogDestinations() == null)
            return false;
        if (other.getStructuredLogDestinations() != null && other.getStructuredLogDestinations().equals(this.getStructuredLogDestinations()) == false)
            return false;
        if (other.getS3StorageOptions() == null ^ this.getS3StorageOptions() == null)
            return false;
        if (other.getS3StorageOptions() != null && other.getS3StorageOptions().equals(this.getS3StorageOptions()) == false)
            return false;
        if (other.getAs2ServiceManagedEgressIpAddresses() == null ^ this.getAs2ServiceManagedEgressIpAddresses() == null)
            return false;
        if (other.getAs2ServiceManagedEgressIpAddresses() != null
                && other.getAs2ServiceManagedEgressIpAddresses().equals(this.getAs2ServiceManagedEgressIpAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getProtocolDetails() == null) ? 0 : getProtocolDetails().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getEndpointDetails() == null) ? 0 : getEndpointDetails().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getHostKeyFingerprint() == null) ? 0 : getHostKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderDetails() == null) ? 0 : getIdentityProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getPostAuthenticationLoginBanner() == null) ? 0 : getPostAuthenticationLoginBanner().hashCode());
        hashCode = prime * hashCode + ((getPreAuthenticationLoginBanner() == null) ? 0 : getPreAuthenticationLoginBanner().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getSecurityPolicyName() == null) ? 0 : getSecurityPolicyName().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserCount() == null) ? 0 : getUserCount().hashCode());
        hashCode = prime * hashCode + ((getWorkflowDetails() == null) ? 0 : getWorkflowDetails().hashCode());
        hashCode = prime * hashCode + ((getStructuredLogDestinations() == null) ? 0 : getStructuredLogDestinations().hashCode());
        hashCode = prime * hashCode + ((getS3StorageOptions() == null) ? 0 : getS3StorageOptions().hashCode());
        hashCode = prime * hashCode + ((getAs2ServiceManagedEgressIpAddresses() == null) ? 0 : getAs2ServiceManagedEgressIpAddresses().hashCode());
        return hashCode;
    }

    @Override
    public DescribedServer clone() {
        try {
            return (DescribedServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DescribedServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
