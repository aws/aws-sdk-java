/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Certificate Manager (ACM) certificate. Required when <code>Protocols</code>
     * is set to <code>FTPS</code>.
     * </p>
     * <p>
     * To request a new public certificate, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html">Request a public
     * certificate</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import an existing certificate into ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates into
     * ACM</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To request a private certificate to use FTPS through private IP addresses, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html">Request a private
     * certificate</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * Certificates with the following cryptographic algorithms and key sizes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2048-bit RSA (RSA_2048)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096-bit RSA (RSA_4096)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 256 bit (EC_prime256v1)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 384 bit (EC_secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 521 bit (EC_secp521r1)
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address specified and
     * information about the issuer.
     * </p>
     * </note>
     */
    private String certificate;
    /**
     * <p>
     * The domain of the storage system that is used for file transfers. There are two domains available: Amazon Simple
     * Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     * <note>
     * <p>
     * After the server is created, the domain cannot be changed.
     * </p>
     * </note>
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
     * The type of endpoint that you want your server to use. You can choose to make your server's endpoint publicly
     * accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you can restrict access
     * to your server and resources only within your VPC or choose to make it internet facing by attaching Elastic IP
     * addresses directly to it.
     * </p>
     * <note>
     * <p>
     * After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in your
     * Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have already
     * created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Services account on or before May
     * 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=<code>VPC</code>.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
     * </p>
     * <p>
     * It is recommended that you use <code>VPC</code> as the <code>EndpointType</code>. With this endpoint type, you
     * have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your server's
     * endpoint and use VPC security groups to restrict traffic by the client's public IP address. This is not possible
     * with <code>EndpointType</code> set to <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     */
    private String endpointType;
    /**
     * <p>
     * The RSA, ECDSA, or ED25519 private key to use for your SFTP-enabled server. You can add multiple host keys, in
     * case you want to rotate keys, or have a set of active keys that use different algorithms.
     * </p>
     * <p>
     * Use the following command to generate an RSA 2048 bit key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t rsa -b 2048 -N "" -m PEM -f my-new-server-key</code>.
     * </p>
     * <p>
     * Use a minimum value of 2048 for the <code>-b</code> option. You can create a stronger key by using 3072 or 4096.
     * </p>
     * <p>
     * Use the following command to generate an ECDSA 256 bit key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t ecdsa -b 256 -N "" -m PEM -f my-new-server-key</code>.
     * </p>
     * <p>
     * Valid values for the <code>-b</code> option for ECDSA are 256, 384, and 521.
     * </p>
     * <p>
     * Use the following command to generate an ED25519 key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t ed25519 -N "" -f my-new-server-key</code>.
     * </p>
     * <p>
     * For all of these commands, you can replace <i>my-new-server-key</i> with a string of your choice.
     * </p>
     * <important>
     * <p>
     * If you aren't planning to migrate existing users from an existing SFTP-enabled server to a new server, don't
     * update the host key. Accidentally changing a server's host key can be disruptive.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transfer/latest/userguide/edit-server-config.html#configuring-servers-change-host-key"
     * >Update host keys for your SFTP-enabled server</a> in the <i>Transfer Family User Guide</i>.
     * </p>
     */
    private String hostKey;
    /**
     * <p>
     * Required when <code>IdentityProviderType</code> is set to <code>AWS_DIRECTORY_SERVICE</code> or
     * <code>API_GATEWAY</code>. Accepts an array containing all of the information required to use a directory in
     * <code>AWS_DIRECTORY_SERVICE</code> or invoke a customer-supplied authentication API, including the API Gateway
     * URL. Not required when <code>IdentityProviderType</code> is set to <code>SERVICE_MANAGED</code>.
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
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter or the
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
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     */
    private String securityPolicyName;
    /**
     * <p>
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     * workflow.
     * </p>
     * <p>
     * In additon to a workflow to execute when a file is uploaded completely, <code>WorkflowDeatails</code> can also
     * contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs
     * when a file is open when the session disconnects.
     * </p>
     */
    private WorkflowDetails workflowDetails;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Certificate Manager (ACM) certificate. Required when <code>Protocols</code>
     * is set to <code>FTPS</code>.
     * </p>
     * <p>
     * To request a new public certificate, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html">Request a public
     * certificate</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import an existing certificate into ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates into
     * ACM</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To request a private certificate to use FTPS through private IP addresses, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html">Request a private
     * certificate</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * Certificates with the following cryptographic algorithms and key sizes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2048-bit RSA (RSA_2048)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096-bit RSA (RSA_4096)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 256 bit (EC_prime256v1)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 384 bit (EC_secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 521 bit (EC_secp521r1)
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address specified and
     * information about the issuer.
     * </p>
     * </note>
     * 
     * @param certificate
     *        The Amazon Resource Name (ARN) of the Certificate Manager (ACM) certificate. Required when
     *        <code>Protocols</code> is set to <code>FTPS</code>.</p>
     *        <p>
     *        To request a new public certificate, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html">Request a public
     *        certificate</a> in the <i>Certificate Manager User Guide</i>.
     *        </p>
     *        <p>
     *        To import an existing certificate into ACM, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates
     *        into ACM</a> in the <i>Certificate Manager User Guide</i>.
     *        </p>
     *        <p>
     *        To request a private certificate to use FTPS through private IP addresses, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html">Request a private
     *        certificate</a> in the <i>Certificate Manager User Guide</i>.
     *        </p>
     *        <p>
     *        Certificates with the following cryptographic algorithms and key sizes are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        2048-bit RSA (RSA_2048)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4096-bit RSA (RSA_4096)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Elliptic Prime Curve 256 bit (EC_prime256v1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Elliptic Prime Curve 384 bit (EC_secp384r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Elliptic Prime Curve 521 bit (EC_secp521r1)
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address specified and
     *        information about the issuer.
     *        </p>
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Certificate Manager (ACM) certificate. Required when <code>Protocols</code>
     * is set to <code>FTPS</code>.
     * </p>
     * <p>
     * To request a new public certificate, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html">Request a public
     * certificate</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import an existing certificate into ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates into
     * ACM</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To request a private certificate to use FTPS through private IP addresses, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html">Request a private
     * certificate</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * Certificates with the following cryptographic algorithms and key sizes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2048-bit RSA (RSA_2048)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096-bit RSA (RSA_4096)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 256 bit (EC_prime256v1)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 384 bit (EC_secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 521 bit (EC_secp521r1)
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address specified and
     * information about the issuer.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the Certificate Manager (ACM) certificate. Required when
     *         <code>Protocols</code> is set to <code>FTPS</code>.</p>
     *         <p>
     *         To request a new public certificate, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html">Request a public
     *         certificate</a> in the <i>Certificate Manager User Guide</i>.
     *         </p>
     *         <p>
     *         To import an existing certificate into ACM, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates
     *         into ACM</a> in the <i>Certificate Manager User Guide</i>.
     *         </p>
     *         <p>
     *         To request a private certificate to use FTPS through private IP addresses, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html">Request a private
     *         certificate</a> in the <i>Certificate Manager User Guide</i>.
     *         </p>
     *         <p>
     *         Certificates with the following cryptographic algorithms and key sizes are supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         2048-bit RSA (RSA_2048)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4096-bit RSA (RSA_4096)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Elliptic Prime Curve 256 bit (EC_prime256v1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Elliptic Prime Curve 384 bit (EC_secp384r1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Elliptic Prime Curve 521 bit (EC_secp521r1)
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address specified and
     *         information about the issuer.
     *         </p>
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Certificate Manager (ACM) certificate. Required when <code>Protocols</code>
     * is set to <code>FTPS</code>.
     * </p>
     * <p>
     * To request a new public certificate, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html">Request a public
     * certificate</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import an existing certificate into ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates into
     * ACM</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To request a private certificate to use FTPS through private IP addresses, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html">Request a private
     * certificate</a> in the <i>Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * Certificates with the following cryptographic algorithms and key sizes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2048-bit RSA (RSA_2048)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096-bit RSA (RSA_4096)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 256 bit (EC_prime256v1)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 384 bit (EC_secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * Elliptic Prime Curve 521 bit (EC_secp521r1)
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address specified and
     * information about the issuer.
     * </p>
     * </note>
     * 
     * @param certificate
     *        The Amazon Resource Name (ARN) of the Certificate Manager (ACM) certificate. Required when
     *        <code>Protocols</code> is set to <code>FTPS</code>.</p>
     *        <p>
     *        To request a new public certificate, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html">Request a public
     *        certificate</a> in the <i>Certificate Manager User Guide</i>.
     *        </p>
     *        <p>
     *        To import an existing certificate into ACM, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates
     *        into ACM</a> in the <i>Certificate Manager User Guide</i>.
     *        </p>
     *        <p>
     *        To request a private certificate to use FTPS through private IP addresses, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-private.html">Request a private
     *        certificate</a> in the <i>Certificate Manager User Guide</i>.
     *        </p>
     *        <p>
     *        Certificates with the following cryptographic algorithms and key sizes are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        2048-bit RSA (RSA_2048)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4096-bit RSA (RSA_4096)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Elliptic Prime Curve 256 bit (EC_prime256v1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Elliptic Prime Curve 384 bit (EC_secp384r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Elliptic Prime Curve 521 bit (EC_secp521r1)
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address specified and
     *        information about the issuer.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The domain of the storage system that is used for file transfers. There are two domains available: Amazon Simple
     * Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     * <note>
     * <p>
     * After the server is created, the domain cannot be changed.
     * </p>
     * </note>
     * 
     * @param domain
     *        The domain of the storage system that is used for file transfers. There are two domains available: Amazon
     *        Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is
     *        S3.</p> <note>
     *        <p>
     *        After the server is created, the domain cannot be changed.
     *        </p>
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain of the storage system that is used for file transfers. There are two domains available: Amazon Simple
     * Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     * <note>
     * <p>
     * After the server is created, the domain cannot be changed.
     * </p>
     * </note>
     * 
     * @return The domain of the storage system that is used for file transfers. There are two domains available: Amazon
     *         Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is
     *         S3.</p> <note>
     *         <p>
     *         After the server is created, the domain cannot be changed.
     *         </p>
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain of the storage system that is used for file transfers. There are two domains available: Amazon Simple
     * Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     * <note>
     * <p>
     * After the server is created, the domain cannot be changed.
     * </p>
     * </note>
     * 
     * @param domain
     *        The domain of the storage system that is used for file transfers. There are two domains available: Amazon
     *        Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is
     *        S3.</p> <note>
     *        <p>
     *        After the server is created, the domain cannot be changed.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateServerRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The domain of the storage system that is used for file transfers. There are two domains available: Amazon Simple
     * Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.
     * </p>
     * <note>
     * <p>
     * After the server is created, the domain cannot be changed.
     * </p>
     * </note>
     * 
     * @param domain
     *        The domain of the storage system that is used for file transfers. There are two domains available: Amazon
     *        Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is
     *        S3.</p> <note>
     *        <p>
     *        After the server is created, the domain cannot be changed.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateServerRequest withDomain(Domain domain) {
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

    public CreateServerRequest withEndpointDetails(EndpointDetails endpointDetails) {
        setEndpointDetails(endpointDetails);
        return this;
    }

    /**
     * <p>
     * The type of endpoint that you want your server to use. You can choose to make your server's endpoint publicly
     * accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you can restrict access
     * to your server and resources only within your VPC or choose to make it internet facing by attaching Elastic IP
     * addresses directly to it.
     * </p>
     * <note>
     * <p>
     * After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in your
     * Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have already
     * created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Services account on or before May
     * 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=<code>VPC</code>.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
     * </p>
     * <p>
     * It is recommended that you use <code>VPC</code> as the <code>EndpointType</code>. With this endpoint type, you
     * have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your server's
     * endpoint and use VPC security groups to restrict traffic by the client's public IP address. This is not possible
     * with <code>EndpointType</code> set to <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * 
     * @param endpointType
     *        The type of endpoint that you want your server to use. You can choose to make your server's endpoint
     *        publicly accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you can
     *        restrict access to your server and resources only within your VPC or choose to make it internet facing by
     *        attaching Elastic IP addresses directly to it.</p> <note>
     *        <p>
     *        After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in
     *        your Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have
     *        already created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Services account on
     *        or before May 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=
     *        <code>VPC</code>.
     *        </p>
     *        <p>
     *        For more information, see
     *        https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
     *        </p>
     *        <p>
     *        It is recommended that you use <code>VPC</code> as the <code>EndpointType</code>. With this endpoint type,
     *        you have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your
     *        server's endpoint and use VPC security groups to restrict traffic by the client's public IP address. This
     *        is not possible with <code>EndpointType</code> set to <code>VPC_ENDPOINT</code>.
     *        </p>
     * @see EndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint that you want your server to use. You can choose to make your server's endpoint publicly
     * accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you can restrict access
     * to your server and resources only within your VPC or choose to make it internet facing by attaching Elastic IP
     * addresses directly to it.
     * </p>
     * <note>
     * <p>
     * After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in your
     * Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have already
     * created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Services account on or before May
     * 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=<code>VPC</code>.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
     * </p>
     * <p>
     * It is recommended that you use <code>VPC</code> as the <code>EndpointType</code>. With this endpoint type, you
     * have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your server's
     * endpoint and use VPC security groups to restrict traffic by the client's public IP address. This is not possible
     * with <code>EndpointType</code> set to <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * 
     * @return The type of endpoint that you want your server to use. You can choose to make your server's endpoint
     *         publicly accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you
     *         can restrict access to your server and resources only within your VPC or choose to make it internet
     *         facing by attaching Elastic IP addresses directly to it.</p> <note>
     *         <p>
     *         After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in
     *         your Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have
     *         already created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Services account
     *         on or before May 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=
     *         <code>VPC</code>.
     *         </p>
     *         <p>
     *         For more information, see
     *         https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
     *         </p>
     *         <p>
     *         It is recommended that you use <code>VPC</code> as the <code>EndpointType</code>. With this endpoint
     *         type, you have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with
     *         your server's endpoint and use VPC security groups to restrict traffic by the client's public IP address.
     *         This is not possible with <code>EndpointType</code> set to <code>VPC_ENDPOINT</code>.
     *         </p>
     * @see EndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint that you want your server to use. You can choose to make your server's endpoint publicly
     * accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you can restrict access
     * to your server and resources only within your VPC or choose to make it internet facing by attaching Elastic IP
     * addresses directly to it.
     * </p>
     * <note>
     * <p>
     * After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in your
     * Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have already
     * created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Services account on or before May
     * 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=<code>VPC</code>.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
     * </p>
     * <p>
     * It is recommended that you use <code>VPC</code> as the <code>EndpointType</code>. With this endpoint type, you
     * have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your server's
     * endpoint and use VPC security groups to restrict traffic by the client's public IP address. This is not possible
     * with <code>EndpointType</code> set to <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * 
     * @param endpointType
     *        The type of endpoint that you want your server to use. You can choose to make your server's endpoint
     *        publicly accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you can
     *        restrict access to your server and resources only within your VPC or choose to make it internet facing by
     *        attaching Elastic IP addresses directly to it.</p> <note>
     *        <p>
     *        After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in
     *        your Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have
     *        already created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Services account on
     *        or before May 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=
     *        <code>VPC</code>.
     *        </p>
     *        <p>
     *        For more information, see
     *        https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
     *        </p>
     *        <p>
     *        It is recommended that you use <code>VPC</code> as the <code>EndpointType</code>. With this endpoint type,
     *        you have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your
     *        server's endpoint and use VPC security groups to restrict traffic by the client's public IP address. This
     *        is not possible with <code>EndpointType</code> set to <code>VPC_ENDPOINT</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public CreateServerRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint that you want your server to use. You can choose to make your server's endpoint publicly
     * accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you can restrict access
     * to your server and resources only within your VPC or choose to make it internet facing by attaching Elastic IP
     * addresses directly to it.
     * </p>
     * <note>
     * <p>
     * After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in your
     * Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have already
     * created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Services account on or before May
     * 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=<code>VPC</code>.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
     * </p>
     * <p>
     * It is recommended that you use <code>VPC</code> as the <code>EndpointType</code>. With this endpoint type, you
     * have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your server's
     * endpoint and use VPC security groups to restrict traffic by the client's public IP address. This is not possible
     * with <code>EndpointType</code> set to <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * 
     * @param endpointType
     *        The type of endpoint that you want your server to use. You can choose to make your server's endpoint
     *        publicly accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you can
     *        restrict access to your server and resources only within your VPC or choose to make it internet facing by
     *        attaching Elastic IP addresses directly to it.</p> <note>
     *        <p>
     *        After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in
     *        your Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have
     *        already created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Services account on
     *        or before May 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=
     *        <code>VPC</code>.
     *        </p>
     *        <p>
     *        For more information, see
     *        https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
     *        </p>
     *        <p>
     *        It is recommended that you use <code>VPC</code> as the <code>EndpointType</code>. With this endpoint type,
     *        you have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your
     *        server's endpoint and use VPC security groups to restrict traffic by the client's public IP address. This
     *        is not possible with <code>EndpointType</code> set to <code>VPC_ENDPOINT</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public CreateServerRequest withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The RSA, ECDSA, or ED25519 private key to use for your SFTP-enabled server. You can add multiple host keys, in
     * case you want to rotate keys, or have a set of active keys that use different algorithms.
     * </p>
     * <p>
     * Use the following command to generate an RSA 2048 bit key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t rsa -b 2048 -N "" -m PEM -f my-new-server-key</code>.
     * </p>
     * <p>
     * Use a minimum value of 2048 for the <code>-b</code> option. You can create a stronger key by using 3072 or 4096.
     * </p>
     * <p>
     * Use the following command to generate an ECDSA 256 bit key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t ecdsa -b 256 -N "" -m PEM -f my-new-server-key</code>.
     * </p>
     * <p>
     * Valid values for the <code>-b</code> option for ECDSA are 256, 384, and 521.
     * </p>
     * <p>
     * Use the following command to generate an ED25519 key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t ed25519 -N "" -f my-new-server-key</code>.
     * </p>
     * <p>
     * For all of these commands, you can replace <i>my-new-server-key</i> with a string of your choice.
     * </p>
     * <important>
     * <p>
     * If you aren't planning to migrate existing users from an existing SFTP-enabled server to a new server, don't
     * update the host key. Accidentally changing a server's host key can be disruptive.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transfer/latest/userguide/edit-server-config.html#configuring-servers-change-host-key"
     * >Update host keys for your SFTP-enabled server</a> in the <i>Transfer Family User Guide</i>.
     * </p>
     * 
     * @param hostKey
     *        The RSA, ECDSA, or ED25519 private key to use for your SFTP-enabled server. You can add multiple host
     *        keys, in case you want to rotate keys, or have a set of active keys that use different algorithms.</p>
     *        <p>
     *        Use the following command to generate an RSA 2048 bit key with no passphrase:
     *        </p>
     *        <p>
     *        <code>ssh-keygen -t rsa -b 2048 -N "" -m PEM -f my-new-server-key</code>.
     *        </p>
     *        <p>
     *        Use a minimum value of 2048 for the <code>-b</code> option. You can create a stronger key by using 3072 or
     *        4096.
     *        </p>
     *        <p>
     *        Use the following command to generate an ECDSA 256 bit key with no passphrase:
     *        </p>
     *        <p>
     *        <code>ssh-keygen -t ecdsa -b 256 -N "" -m PEM -f my-new-server-key</code>.
     *        </p>
     *        <p>
     *        Valid values for the <code>-b</code> option for ECDSA are 256, 384, and 521.
     *        </p>
     *        <p>
     *        Use the following command to generate an ED25519 key with no passphrase:
     *        </p>
     *        <p>
     *        <code>ssh-keygen -t ed25519 -N "" -f my-new-server-key</code>.
     *        </p>
     *        <p>
     *        For all of these commands, you can replace <i>my-new-server-key</i> with a string of your choice.
     *        </p>
     *        <important>
     *        <p>
     *        If you aren't planning to migrate existing users from an existing SFTP-enabled server to a new server,
     *        don't update the host key. Accidentally changing a server's host key can be disruptive.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/transfer/latest/userguide/edit-server-config.html#configuring-servers-change-host-key"
     *        >Update host keys for your SFTP-enabled server</a> in the <i>Transfer Family User Guide</i>.
     */

    public void setHostKey(String hostKey) {
        this.hostKey = hostKey;
    }

    /**
     * <p>
     * The RSA, ECDSA, or ED25519 private key to use for your SFTP-enabled server. You can add multiple host keys, in
     * case you want to rotate keys, or have a set of active keys that use different algorithms.
     * </p>
     * <p>
     * Use the following command to generate an RSA 2048 bit key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t rsa -b 2048 -N "" -m PEM -f my-new-server-key</code>.
     * </p>
     * <p>
     * Use a minimum value of 2048 for the <code>-b</code> option. You can create a stronger key by using 3072 or 4096.
     * </p>
     * <p>
     * Use the following command to generate an ECDSA 256 bit key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t ecdsa -b 256 -N "" -m PEM -f my-new-server-key</code>.
     * </p>
     * <p>
     * Valid values for the <code>-b</code> option for ECDSA are 256, 384, and 521.
     * </p>
     * <p>
     * Use the following command to generate an ED25519 key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t ed25519 -N "" -f my-new-server-key</code>.
     * </p>
     * <p>
     * For all of these commands, you can replace <i>my-new-server-key</i> with a string of your choice.
     * </p>
     * <important>
     * <p>
     * If you aren't planning to migrate existing users from an existing SFTP-enabled server to a new server, don't
     * update the host key. Accidentally changing a server's host key can be disruptive.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transfer/latest/userguide/edit-server-config.html#configuring-servers-change-host-key"
     * >Update host keys for your SFTP-enabled server</a> in the <i>Transfer Family User Guide</i>.
     * </p>
     * 
     * @return The RSA, ECDSA, or ED25519 private key to use for your SFTP-enabled server. You can add multiple host
     *         keys, in case you want to rotate keys, or have a set of active keys that use different algorithms.</p>
     *         <p>
     *         Use the following command to generate an RSA 2048 bit key with no passphrase:
     *         </p>
     *         <p>
     *         <code>ssh-keygen -t rsa -b 2048 -N "" -m PEM -f my-new-server-key</code>.
     *         </p>
     *         <p>
     *         Use a minimum value of 2048 for the <code>-b</code> option. You can create a stronger key by using 3072
     *         or 4096.
     *         </p>
     *         <p>
     *         Use the following command to generate an ECDSA 256 bit key with no passphrase:
     *         </p>
     *         <p>
     *         <code>ssh-keygen -t ecdsa -b 256 -N "" -m PEM -f my-new-server-key</code>.
     *         </p>
     *         <p>
     *         Valid values for the <code>-b</code> option for ECDSA are 256, 384, and 521.
     *         </p>
     *         <p>
     *         Use the following command to generate an ED25519 key with no passphrase:
     *         </p>
     *         <p>
     *         <code>ssh-keygen -t ed25519 -N "" -f my-new-server-key</code>.
     *         </p>
     *         <p>
     *         For all of these commands, you can replace <i>my-new-server-key</i> with a string of your choice.
     *         </p>
     *         <important>
     *         <p>
     *         If you aren't planning to migrate existing users from an existing SFTP-enabled server to a new server,
     *         don't update the host key. Accidentally changing a server's host key can be disruptive.
     *         </p>
     *         </important>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/transfer/latest/userguide/edit-server-config.html#configuring-servers-change-host-key"
     *         >Update host keys for your SFTP-enabled server</a> in the <i>Transfer Family User Guide</i>.
     */

    public String getHostKey() {
        return this.hostKey;
    }

    /**
     * <p>
     * The RSA, ECDSA, or ED25519 private key to use for your SFTP-enabled server. You can add multiple host keys, in
     * case you want to rotate keys, or have a set of active keys that use different algorithms.
     * </p>
     * <p>
     * Use the following command to generate an RSA 2048 bit key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t rsa -b 2048 -N "" -m PEM -f my-new-server-key</code>.
     * </p>
     * <p>
     * Use a minimum value of 2048 for the <code>-b</code> option. You can create a stronger key by using 3072 or 4096.
     * </p>
     * <p>
     * Use the following command to generate an ECDSA 256 bit key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t ecdsa -b 256 -N "" -m PEM -f my-new-server-key</code>.
     * </p>
     * <p>
     * Valid values for the <code>-b</code> option for ECDSA are 256, 384, and 521.
     * </p>
     * <p>
     * Use the following command to generate an ED25519 key with no passphrase:
     * </p>
     * <p>
     * <code>ssh-keygen -t ed25519 -N "" -f my-new-server-key</code>.
     * </p>
     * <p>
     * For all of these commands, you can replace <i>my-new-server-key</i> with a string of your choice.
     * </p>
     * <important>
     * <p>
     * If you aren't planning to migrate existing users from an existing SFTP-enabled server to a new server, don't
     * update the host key. Accidentally changing a server's host key can be disruptive.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transfer/latest/userguide/edit-server-config.html#configuring-servers-change-host-key"
     * >Update host keys for your SFTP-enabled server</a> in the <i>Transfer Family User Guide</i>.
     * </p>
     * 
     * @param hostKey
     *        The RSA, ECDSA, or ED25519 private key to use for your SFTP-enabled server. You can add multiple host
     *        keys, in case you want to rotate keys, or have a set of active keys that use different algorithms.</p>
     *        <p>
     *        Use the following command to generate an RSA 2048 bit key with no passphrase:
     *        </p>
     *        <p>
     *        <code>ssh-keygen -t rsa -b 2048 -N "" -m PEM -f my-new-server-key</code>.
     *        </p>
     *        <p>
     *        Use a minimum value of 2048 for the <code>-b</code> option. You can create a stronger key by using 3072 or
     *        4096.
     *        </p>
     *        <p>
     *        Use the following command to generate an ECDSA 256 bit key with no passphrase:
     *        </p>
     *        <p>
     *        <code>ssh-keygen -t ecdsa -b 256 -N "" -m PEM -f my-new-server-key</code>.
     *        </p>
     *        <p>
     *        Valid values for the <code>-b</code> option for ECDSA are 256, 384, and 521.
     *        </p>
     *        <p>
     *        Use the following command to generate an ED25519 key with no passphrase:
     *        </p>
     *        <p>
     *        <code>ssh-keygen -t ed25519 -N "" -f my-new-server-key</code>.
     *        </p>
     *        <p>
     *        For all of these commands, you can replace <i>my-new-server-key</i> with a string of your choice.
     *        </p>
     *        <important>
     *        <p>
     *        If you aren't planning to migrate existing users from an existing SFTP-enabled server to a new server,
     *        don't update the host key. Accidentally changing a server's host key can be disruptive.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/transfer/latest/userguide/edit-server-config.html#configuring-servers-change-host-key"
     *        >Update host keys for your SFTP-enabled server</a> in the <i>Transfer Family User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withHostKey(String hostKey) {
        setHostKey(hostKey);
        return this;
    }

    /**
     * <p>
     * Required when <code>IdentityProviderType</code> is set to <code>AWS_DIRECTORY_SERVICE</code> or
     * <code>API_GATEWAY</code>. Accepts an array containing all of the information required to use a directory in
     * <code>AWS_DIRECTORY_SERVICE</code> or invoke a customer-supplied authentication API, including the API Gateway
     * URL. Not required when <code>IdentityProviderType</code> is set to <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @param identityProviderDetails
     *        Required when <code>IdentityProviderType</code> is set to <code>AWS_DIRECTORY_SERVICE</code> or
     *        <code>API_GATEWAY</code>. Accepts an array containing all of the information required to use a directory
     *        in <code>AWS_DIRECTORY_SERVICE</code> or invoke a customer-supplied authentication API, including the API
     *        Gateway URL. Not required when <code>IdentityProviderType</code> is set to <code>SERVICE_MANAGED</code>.
     */

    public void setIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
    }

    /**
     * <p>
     * Required when <code>IdentityProviderType</code> is set to <code>AWS_DIRECTORY_SERVICE</code> or
     * <code>API_GATEWAY</code>. Accepts an array containing all of the information required to use a directory in
     * <code>AWS_DIRECTORY_SERVICE</code> or invoke a customer-supplied authentication API, including the API Gateway
     * URL. Not required when <code>IdentityProviderType</code> is set to <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @return Required when <code>IdentityProviderType</code> is set to <code>AWS_DIRECTORY_SERVICE</code> or
     *         <code>API_GATEWAY</code>. Accepts an array containing all of the information required to use a directory
     *         in <code>AWS_DIRECTORY_SERVICE</code> or invoke a customer-supplied authentication API, including the API
     *         Gateway URL. Not required when <code>IdentityProviderType</code> is set to <code>SERVICE_MANAGED</code>.
     */

    public IdentityProviderDetails getIdentityProviderDetails() {
        return this.identityProviderDetails;
    }

    /**
     * <p>
     * Required when <code>IdentityProviderType</code> is set to <code>AWS_DIRECTORY_SERVICE</code> or
     * <code>API_GATEWAY</code>. Accepts an array containing all of the information required to use a directory in
     * <code>AWS_DIRECTORY_SERVICE</code> or invoke a customer-supplied authentication API, including the API Gateway
     * URL. Not required when <code>IdentityProviderType</code> is set to <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @param identityProviderDetails
     *        Required when <code>IdentityProviderType</code> is set to <code>AWS_DIRECTORY_SERVICE</code> or
     *        <code>API_GATEWAY</code>. Accepts an array containing all of the information required to use a directory
     *        in <code>AWS_DIRECTORY_SERVICE</code> or invoke a customer-supplied authentication API, including the API
     *        Gateway URL. Not required when <code>IdentityProviderType</code> is set to <code>SERVICE_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
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
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter or the
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
     *        or the <code>IdentityProviderDetails</code> data type.
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
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter or the
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
     *         parameter or the <code>IdentityProviderDetails</code> data type.
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
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter or the
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
     *        or the <code>IdentityProviderDetails</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public CreateServerRequest withIdentityProviderType(String identityProviderType) {
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
     * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter or the
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
     *        or the <code>IdentityProviderDetails</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public CreateServerRequest withIdentityProviderType(IdentityProviderType identityProviderType) {
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

    public CreateServerRequest withLoggingRole(String loggingRole) {
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

    public CreateServerRequest withPostAuthenticationLoginBanner(String postAuthenticationLoginBanner) {
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

    public CreateServerRequest withPreAuthenticationLoginBanner(String preAuthenticationLoginBanner) {
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
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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
     *         <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     *         <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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
     *        <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     *        <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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
     *        <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     *        <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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

    public CreateServerRequest withProtocols(String... protocols) {
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
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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
     *        <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     *        <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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

    public CreateServerRequest withProtocols(java.util.Collection<String> protocols) {
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
     * <code>EndpointType</code> must be <code>VPC</code> and the <code>IdentityProviderType</code> must be
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     * <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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
     *        <code>AWS_DIRECTORY_SERVICE</code> or <code>API_GATEWAY</code>.
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
     *        <code>PUBLIC</code> and the <code>IdentityProviderType</code> can be set to <code>SERVICE_MANAGED</code>.
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

    public CreateServerRequest withProtocols(Protocol... protocols) {
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

    public CreateServerRequest withProtocolDetails(ProtocolDetails protocolDetails) {
        setProtocolDetails(protocolDetails);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy that is attached to the server.
     */

    public void setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @return Specifies the name of the security policy that is attached to the server.
     */

    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy that is attached to the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withSecurityPolicyName(String securityPolicyName) {
        setSecurityPolicyName(securityPolicyName);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for servers.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for servers.
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
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withTags(Tag... tags) {
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
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     * workflow.
     * </p>
     * <p>
     * In additon to a workflow to execute when a file is uploaded completely, <code>WorkflowDeatails</code> can also
     * contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs
     * when a file is open when the session disconnects.
     * </p>
     * 
     * @param workflowDetails
     *        Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     *        workflow.</p>
     *        <p>
     *        In additon to a workflow to execute when a file is uploaded completely, <code>WorkflowDeatails</code> can
     *        also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial
     *        upload occurs when a file is open when the session disconnects.
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
     * In additon to a workflow to execute when a file is uploaded completely, <code>WorkflowDeatails</code> can also
     * contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs
     * when a file is open when the session disconnects.
     * </p>
     * 
     * @return Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     *         workflow.</p>
     *         <p>
     *         In additon to a workflow to execute when a file is uploaded completely, <code>WorkflowDeatails</code> can
     *         also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial
     *         upload occurs when a file is open when the session disconnects.
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
     * In additon to a workflow to execute when a file is uploaded completely, <code>WorkflowDeatails</code> can also
     * contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs
     * when a file is open when the session disconnects.
     * </p>
     * 
     * @param workflowDetails
     *        Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the
     *        workflow.</p>
     *        <p>
     *        In additon to a workflow to execute when a file is uploaded completely, <code>WorkflowDeatails</code> can
     *        also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial
     *        upload occurs when a file is open when the session disconnects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withWorkflowDetails(WorkflowDetails workflowDetails) {
        setWorkflowDetails(workflowDetails);
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
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getEndpointDetails() != null)
            sb.append("EndpointDetails: ").append(getEndpointDetails()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getHostKey() != null)
            sb.append("HostKey: ").append("***Sensitive Data Redacted***").append(",");
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
        if (getProtocolDetails() != null)
            sb.append("ProtocolDetails: ").append(getProtocolDetails()).append(",");
        if (getSecurityPolicyName() != null)
            sb.append("SecurityPolicyName: ").append(getSecurityPolicyName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWorkflowDetails() != null)
            sb.append("WorkflowDetails: ").append(getWorkflowDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServerRequest == false)
            return false;
        CreateServerRequest other = (CreateServerRequest) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
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
        if (other.getHostKey() == null ^ this.getHostKey() == null)
            return false;
        if (other.getHostKey() != null && other.getHostKey().equals(this.getHostKey()) == false)
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
        if (other.getProtocolDetails() == null ^ this.getProtocolDetails() == null)
            return false;
        if (other.getProtocolDetails() != null && other.getProtocolDetails().equals(this.getProtocolDetails()) == false)
            return false;
        if (other.getSecurityPolicyName() == null ^ this.getSecurityPolicyName() == null)
            return false;
        if (other.getSecurityPolicyName() != null && other.getSecurityPolicyName().equals(this.getSecurityPolicyName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWorkflowDetails() == null ^ this.getWorkflowDetails() == null)
            return false;
        if (other.getWorkflowDetails() != null && other.getWorkflowDetails().equals(this.getWorkflowDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getEndpointDetails() == null) ? 0 : getEndpointDetails().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getHostKey() == null) ? 0 : getHostKey().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderDetails() == null) ? 0 : getIdentityProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getPostAuthenticationLoginBanner() == null) ? 0 : getPostAuthenticationLoginBanner().hashCode());
        hashCode = prime * hashCode + ((getPreAuthenticationLoginBanner() == null) ? 0 : getPreAuthenticationLoginBanner().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getProtocolDetails() == null) ? 0 : getProtocolDetails().hashCode());
        hashCode = prime * hashCode + ((getSecurityPolicyName() == null) ? 0 : getSecurityPolicyName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWorkflowDetails() == null) ? 0 : getWorkflowDetails().hashCode());
        return hashCode;
    }

    @Override
    public CreateServerRequest clone() {
        return (CreateServerRequest) super.clone();
    }

}
