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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The protocol settings that are configured for your server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ProtocolDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtocolDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single IPv4 address, such as the public IP address of
     * a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code>aws transfer update-server --protocol-details PassiveIp=0.0.0.0</code>
     * </p>
     * <p>
     * Replace <code>0.0.0.0</code> in the example above with the actual IP address you want to use.
     * </p>
     * <note>
     * <p>
     * If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer Family server for
     * the change to take effect. For details on using passive mode (PASV) in a NAT environment, see <a href=
     * "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     * >Configuring your FTPS server behind a firewall or NAT with Transfer Family</a>.
     * </p>
     * </note>
     * <p>
     * <i>Special values</i>
     * </p>
     * <p>
     * The <code>AUTO</code> and <code>0.0.0.0</code> are special values for the <code>PassiveIp</code> parameter. The
     * value <code>PassiveIp=AUTO</code> is assigned by default to FTP and FTPS type servers. In this case, the server
     * automatically responds with one of the endpoint IPs within the PASV response. <code>PassiveIp=0.0.0.0</code> has
     * a more unique application for its usage. For example, if you have a High Availability (HA) Network Load Balancer
     * (NLB) environment, where you have 3 subnets, you can only specify a single IP address using the
     * <code>PassiveIp</code> parameter. This reduces the effectiveness of having High Availability. In this case, you
     * can specify <code>PassiveIp=0.0.0.0</code>. This tells the client to use the same IP address as the Control
     * connection and utilize all AZs for their connections. Note, however, that not all FTP clients support the
     * <code>PassiveIp=0.0.0.0</code> response. FileZilla and WinSCP do support it. If you are using other clients,
     * check to see if your client supports the <code>PassiveIp=0.0.0.0</code> response.
     * </p>
     */
    private String passiveIp;
    /**
     * <p>
     * A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides a
     * mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * <code>CreateServer</code>, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     */
    private String tlsSessionResumptionMode;
    /**
     * <p>
     * Use the <code>SetStatOption</code> to ignore the error that is generated when the client attempts to use
     * <code>SETSTAT</code> on a file you are uploading to an S3 bucket.
     * </p>
     * <p>
     * Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp and
     * permissions, using commands, such as <code>SETSTAT</code> when uploading the file. However, these commands are
     * not compatible with object storage systems, such as Amazon S3. Due to this incompatibility, file uploads from
     * these clients can result in errors even when the file is otherwise successfully uploaded.
     * </p>
     * <p>
     * Set the value to <code>ENABLE_NO_OP</code> to have the Transfer Family server ignore the <code>SETSTAT</code>
     * command, and upload files without needing to make any changes to your SFTP client. While the
     * <code>SetStatOption</code> <code>ENABLE_NO_OP</code> setting ignores the error, it does generate a log entry in
     * Amazon CloudWatch Logs, so you can determine when the client is making a <code>SETSTAT</code> call.
     * </p>
     * <note>
     * <p>
     * If you want to preserve the original timestamp for your file, and modify other file attributes using
     * <code>SETSTAT</code>, you can use Amazon EFS as backend storage with Transfer Family.
     * </p>
     * </note>
     */
    private String setStatOption;
    /**
     * <p>
     * Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * </p>
     */
    private java.util.List<String> as2Transports;

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single IPv4 address, such as the public IP address of
     * a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code>aws transfer update-server --protocol-details PassiveIp=0.0.0.0</code>
     * </p>
     * <p>
     * Replace <code>0.0.0.0</code> in the example above with the actual IP address you want to use.
     * </p>
     * <note>
     * <p>
     * If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer Family server for
     * the change to take effect. For details on using passive mode (PASV) in a NAT environment, see <a href=
     * "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     * >Configuring your FTPS server behind a firewall or NAT with Transfer Family</a>.
     * </p>
     * </note>
     * <p>
     * <i>Special values</i>
     * </p>
     * <p>
     * The <code>AUTO</code> and <code>0.0.0.0</code> are special values for the <code>PassiveIp</code> parameter. The
     * value <code>PassiveIp=AUTO</code> is assigned by default to FTP and FTPS type servers. In this case, the server
     * automatically responds with one of the endpoint IPs within the PASV response. <code>PassiveIp=0.0.0.0</code> has
     * a more unique application for its usage. For example, if you have a High Availability (HA) Network Load Balancer
     * (NLB) environment, where you have 3 subnets, you can only specify a single IP address using the
     * <code>PassiveIp</code> parameter. This reduces the effectiveness of having High Availability. In this case, you
     * can specify <code>PassiveIp=0.0.0.0</code>. This tells the client to use the same IP address as the Control
     * connection and utilize all AZs for their connections. Note, however, that not all FTP clients support the
     * <code>PassiveIp=0.0.0.0</code> response. FileZilla and WinSCP do support it. If you are using other clients,
     * check to see if your client supports the <code>PassiveIp=0.0.0.0</code> response.
     * </p>
     * 
     * @param passiveIp
     *        Indicates passive mode, for FTP and FTPS protocols. Enter a single IPv4 address, such as the public IP
     *        address of a firewall, router, or load balancer. For example: </p>
     *        <p>
     *        <code>aws transfer update-server --protocol-details PassiveIp=0.0.0.0</code>
     *        </p>
     *        <p>
     *        Replace <code>0.0.0.0</code> in the example above with the actual IP address you want to use.
     *        </p>
     *        <note>
     *        <p>
     *        If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer Family server
     *        for the change to take effect. For details on using passive mode (PASV) in a NAT environment, see <a href=
     *        "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     *        >Configuring your FTPS server behind a firewall or NAT with Transfer Family</a>.
     *        </p>
     *        </note>
     *        <p>
     *        <i>Special values</i>
     *        </p>
     *        <p>
     *        The <code>AUTO</code> and <code>0.0.0.0</code> are special values for the <code>PassiveIp</code>
     *        parameter. The value <code>PassiveIp=AUTO</code> is assigned by default to FTP and FTPS type servers. In
     *        this case, the server automatically responds with one of the endpoint IPs within the PASV response.
     *        <code>PassiveIp=0.0.0.0</code> has a more unique application for its usage. For example, if you have a
     *        High Availability (HA) Network Load Balancer (NLB) environment, where you have 3 subnets, you can only
     *        specify a single IP address using the <code>PassiveIp</code> parameter. This reduces the effectiveness of
     *        having High Availability. In this case, you can specify <code>PassiveIp=0.0.0.0</code>. This tells the
     *        client to use the same IP address as the Control connection and utilize all AZs for their connections.
     *        Note, however, that not all FTP clients support the <code>PassiveIp=0.0.0.0</code> response. FileZilla and
     *        WinSCP do support it. If you are using other clients, check to see if your client supports the
     *        <code>PassiveIp=0.0.0.0</code> response.
     */

    public void setPassiveIp(String passiveIp) {
        this.passiveIp = passiveIp;
    }

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single IPv4 address, such as the public IP address of
     * a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code>aws transfer update-server --protocol-details PassiveIp=0.0.0.0</code>
     * </p>
     * <p>
     * Replace <code>0.0.0.0</code> in the example above with the actual IP address you want to use.
     * </p>
     * <note>
     * <p>
     * If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer Family server for
     * the change to take effect. For details on using passive mode (PASV) in a NAT environment, see <a href=
     * "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     * >Configuring your FTPS server behind a firewall or NAT with Transfer Family</a>.
     * </p>
     * </note>
     * <p>
     * <i>Special values</i>
     * </p>
     * <p>
     * The <code>AUTO</code> and <code>0.0.0.0</code> are special values for the <code>PassiveIp</code> parameter. The
     * value <code>PassiveIp=AUTO</code> is assigned by default to FTP and FTPS type servers. In this case, the server
     * automatically responds with one of the endpoint IPs within the PASV response. <code>PassiveIp=0.0.0.0</code> has
     * a more unique application for its usage. For example, if you have a High Availability (HA) Network Load Balancer
     * (NLB) environment, where you have 3 subnets, you can only specify a single IP address using the
     * <code>PassiveIp</code> parameter. This reduces the effectiveness of having High Availability. In this case, you
     * can specify <code>PassiveIp=0.0.0.0</code>. This tells the client to use the same IP address as the Control
     * connection and utilize all AZs for their connections. Note, however, that not all FTP clients support the
     * <code>PassiveIp=0.0.0.0</code> response. FileZilla and WinSCP do support it. If you are using other clients,
     * check to see if your client supports the <code>PassiveIp=0.0.0.0</code> response.
     * </p>
     * 
     * @return Indicates passive mode, for FTP and FTPS protocols. Enter a single IPv4 address, such as the public IP
     *         address of a firewall, router, or load balancer. For example: </p>
     *         <p>
     *         <code>aws transfer update-server --protocol-details PassiveIp=0.0.0.0</code>
     *         </p>
     *         <p>
     *         Replace <code>0.0.0.0</code> in the example above with the actual IP address you want to use.
     *         </p>
     *         <note>
     *         <p>
     *         If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer Family
     *         server for the change to take effect. For details on using passive mode (PASV) in a NAT environment, see
     *         <a href=
     *         "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     *         >Configuring your FTPS server behind a firewall or NAT with Transfer Family</a>.
     *         </p>
     *         </note>
     *         <p>
     *         <i>Special values</i>
     *         </p>
     *         <p>
     *         The <code>AUTO</code> and <code>0.0.0.0</code> are special values for the <code>PassiveIp</code>
     *         parameter. The value <code>PassiveIp=AUTO</code> is assigned by default to FTP and FTPS type servers. In
     *         this case, the server automatically responds with one of the endpoint IPs within the PASV response.
     *         <code>PassiveIp=0.0.0.0</code> has a more unique application for its usage. For example, if you have a
     *         High Availability (HA) Network Load Balancer (NLB) environment, where you have 3 subnets, you can only
     *         specify a single IP address using the <code>PassiveIp</code> parameter. This reduces the effectiveness of
     *         having High Availability. In this case, you can specify <code>PassiveIp=0.0.0.0</code>. This tells the
     *         client to use the same IP address as the Control connection and utilize all AZs for their connections.
     *         Note, however, that not all FTP clients support the <code>PassiveIp=0.0.0.0</code> response. FileZilla
     *         and WinSCP do support it. If you are using other clients, check to see if your client supports the
     *         <code>PassiveIp=0.0.0.0</code> response.
     */

    public String getPassiveIp() {
        return this.passiveIp;
    }

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single IPv4 address, such as the public IP address of
     * a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code>aws transfer update-server --protocol-details PassiveIp=0.0.0.0</code>
     * </p>
     * <p>
     * Replace <code>0.0.0.0</code> in the example above with the actual IP address you want to use.
     * </p>
     * <note>
     * <p>
     * If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer Family server for
     * the change to take effect. For details on using passive mode (PASV) in a NAT environment, see <a href=
     * "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     * >Configuring your FTPS server behind a firewall or NAT with Transfer Family</a>.
     * </p>
     * </note>
     * <p>
     * <i>Special values</i>
     * </p>
     * <p>
     * The <code>AUTO</code> and <code>0.0.0.0</code> are special values for the <code>PassiveIp</code> parameter. The
     * value <code>PassiveIp=AUTO</code> is assigned by default to FTP and FTPS type servers. In this case, the server
     * automatically responds with one of the endpoint IPs within the PASV response. <code>PassiveIp=0.0.0.0</code> has
     * a more unique application for its usage. For example, if you have a High Availability (HA) Network Load Balancer
     * (NLB) environment, where you have 3 subnets, you can only specify a single IP address using the
     * <code>PassiveIp</code> parameter. This reduces the effectiveness of having High Availability. In this case, you
     * can specify <code>PassiveIp=0.0.0.0</code>. This tells the client to use the same IP address as the Control
     * connection and utilize all AZs for their connections. Note, however, that not all FTP clients support the
     * <code>PassiveIp=0.0.0.0</code> response. FileZilla and WinSCP do support it. If you are using other clients,
     * check to see if your client supports the <code>PassiveIp=0.0.0.0</code> response.
     * </p>
     * 
     * @param passiveIp
     *        Indicates passive mode, for FTP and FTPS protocols. Enter a single IPv4 address, such as the public IP
     *        address of a firewall, router, or load balancer. For example: </p>
     *        <p>
     *        <code>aws transfer update-server --protocol-details PassiveIp=0.0.0.0</code>
     *        </p>
     *        <p>
     *        Replace <code>0.0.0.0</code> in the example above with the actual IP address you want to use.
     *        </p>
     *        <note>
     *        <p>
     *        If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer Family server
     *        for the change to take effect. For details on using passive mode (PASV) in a NAT environment, see <a href=
     *        "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     *        >Configuring your FTPS server behind a firewall or NAT with Transfer Family</a>.
     *        </p>
     *        </note>
     *        <p>
     *        <i>Special values</i>
     *        </p>
     *        <p>
     *        The <code>AUTO</code> and <code>0.0.0.0</code> are special values for the <code>PassiveIp</code>
     *        parameter. The value <code>PassiveIp=AUTO</code> is assigned by default to FTP and FTPS type servers. In
     *        this case, the server automatically responds with one of the endpoint IPs within the PASV response.
     *        <code>PassiveIp=0.0.0.0</code> has a more unique application for its usage. For example, if you have a
     *        High Availability (HA) Network Load Balancer (NLB) environment, where you have 3 subnets, you can only
     *        specify a single IP address using the <code>PassiveIp</code> parameter. This reduces the effectiveness of
     *        having High Availability. In this case, you can specify <code>PassiveIp=0.0.0.0</code>. This tells the
     *        client to use the same IP address as the Control connection and utilize all AZs for their connections.
     *        Note, however, that not all FTP clients support the <code>PassiveIp=0.0.0.0</code> response. FileZilla and
     *        WinSCP do support it. If you are using other clients, check to see if your client supports the
     *        <code>PassiveIp=0.0.0.0</code> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolDetails withPassiveIp(String passiveIp) {
        setPassiveIp(passiveIp);
        return this;
    }

    /**
     * <p>
     * A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides a
     * mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * <code>CreateServer</code>, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param tlsSessionResumptionMode
     *        A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides a
     *        mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS
     *        session. <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent,
     *        negotiated sessions through a unique session ID. This property is available during
     *        <code>CreateServer</code> and <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code>
     *        value is not specified during <code>CreateServer</code>, it is set to <code>ENFORCED</code> by
     *        default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a
     *        new TLS session for each request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption.
     *        The server doesn't reject client data connections that do not perform the TLS session resumption client
     *        processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session
     *        resumption. The server rejects client data connections that do not perform the TLS session resumption
     *        client processing. Before you set the value to <code>ENFORCED</code>, test your clients.
     *        </p>
     *        <note>
     *        <p>
     *        Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption,
     *        you prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine
     *        whether or not you can use the <code>ENFORCED</code> value, you need to test your clients.
     *        </p>
     *        </note></li>
     * @see TlsSessionResumptionMode
     */

    public void setTlsSessionResumptionMode(String tlsSessionResumptionMode) {
        this.tlsSessionResumptionMode = tlsSessionResumptionMode;
    }

    /**
     * <p>
     * A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides a
     * mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * <code>CreateServer</code>, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides
     *         a mechanism to resume or share a negotiated secret key between the control and data connection for an
     *         FTPS session. <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent,
     *         negotiated sessions through a unique session ID. This property is available during
     *         <code>CreateServer</code> and <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code>
     *         value is not specified during <code>CreateServer</code>, it is set to <code>ENFORCED</code> by
     *         default.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a
     *         new TLS session for each request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session
     *         resumption. The server doesn't reject client data connections that do not perform the TLS session
     *         resumption client processing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session
     *         resumption. The server rejects client data connections that do not perform the TLS session resumption
     *         client processing. Before you set the value to <code>ENFORCED</code>, test your clients.
     *         </p>
     *         <note>
     *         <p>
     *         Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption,
     *         you prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine
     *         whether or not you can use the <code>ENFORCED</code> value, you need to test your clients.
     *         </p>
     *         </note></li>
     * @see TlsSessionResumptionMode
     */

    public String getTlsSessionResumptionMode() {
        return this.tlsSessionResumptionMode;
    }

    /**
     * <p>
     * A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides a
     * mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * <code>CreateServer</code>, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param tlsSessionResumptionMode
     *        A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides a
     *        mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS
     *        session. <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent,
     *        negotiated sessions through a unique session ID. This property is available during
     *        <code>CreateServer</code> and <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code>
     *        value is not specified during <code>CreateServer</code>, it is set to <code>ENFORCED</code> by
     *        default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a
     *        new TLS session for each request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption.
     *        The server doesn't reject client data connections that do not perform the TLS session resumption client
     *        processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session
     *        resumption. The server rejects client data connections that do not perform the TLS session resumption
     *        client processing. Before you set the value to <code>ENFORCED</code>, test your clients.
     *        </p>
     *        <note>
     *        <p>
     *        Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption,
     *        you prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine
     *        whether or not you can use the <code>ENFORCED</code> value, you need to test your clients.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsSessionResumptionMode
     */

    public ProtocolDetails withTlsSessionResumptionMode(String tlsSessionResumptionMode) {
        setTlsSessionResumptionMode(tlsSessionResumptionMode);
        return this;
    }

    /**
     * <p>
     * A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides a
     * mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * <code>CreateServer</code>, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param tlsSessionResumptionMode
     *        A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides a
     *        mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS
     *        session. <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent,
     *        negotiated sessions through a unique session ID. This property is available during
     *        <code>CreateServer</code> and <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code>
     *        value is not specified during <code>CreateServer</code>, it is set to <code>ENFORCED</code> by
     *        default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a
     *        new TLS session for each request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption.
     *        The server doesn't reject client data connections that do not perform the TLS session resumption client
     *        processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session
     *        resumption. The server rejects client data connections that do not perform the TLS session resumption
     *        client processing. Before you set the value to <code>ENFORCED</code>, test your clients.
     *        </p>
     *        <note>
     *        <p>
     *        Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption,
     *        you prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine
     *        whether or not you can use the <code>ENFORCED</code> value, you need to test your clients.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsSessionResumptionMode
     */

    public ProtocolDetails withTlsSessionResumptionMode(TlsSessionResumptionMode tlsSessionResumptionMode) {
        this.tlsSessionResumptionMode = tlsSessionResumptionMode.toString();
        return this;
    }

    /**
     * <p>
     * Use the <code>SetStatOption</code> to ignore the error that is generated when the client attempts to use
     * <code>SETSTAT</code> on a file you are uploading to an S3 bucket.
     * </p>
     * <p>
     * Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp and
     * permissions, using commands, such as <code>SETSTAT</code> when uploading the file. However, these commands are
     * not compatible with object storage systems, such as Amazon S3. Due to this incompatibility, file uploads from
     * these clients can result in errors even when the file is otherwise successfully uploaded.
     * </p>
     * <p>
     * Set the value to <code>ENABLE_NO_OP</code> to have the Transfer Family server ignore the <code>SETSTAT</code>
     * command, and upload files without needing to make any changes to your SFTP client. While the
     * <code>SetStatOption</code> <code>ENABLE_NO_OP</code> setting ignores the error, it does generate a log entry in
     * Amazon CloudWatch Logs, so you can determine when the client is making a <code>SETSTAT</code> call.
     * </p>
     * <note>
     * <p>
     * If you want to preserve the original timestamp for your file, and modify other file attributes using
     * <code>SETSTAT</code>, you can use Amazon EFS as backend storage with Transfer Family.
     * </p>
     * </note>
     * 
     * @param setStatOption
     *        Use the <code>SetStatOption</code> to ignore the error that is generated when the client attempts to use
     *        <code>SETSTAT</code> on a file you are uploading to an S3 bucket.</p>
     *        <p>
     *        Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp
     *        and permissions, using commands, such as <code>SETSTAT</code> when uploading the file. However, these
     *        commands are not compatible with object storage systems, such as Amazon S3. Due to this incompatibility,
     *        file uploads from these clients can result in errors even when the file is otherwise successfully
     *        uploaded.
     *        </p>
     *        <p>
     *        Set the value to <code>ENABLE_NO_OP</code> to have the Transfer Family server ignore the
     *        <code>SETSTAT</code> command, and upload files without needing to make any changes to your SFTP client.
     *        While the <code>SetStatOption</code> <code>ENABLE_NO_OP</code> setting ignores the error, it does generate
     *        a log entry in Amazon CloudWatch Logs, so you can determine when the client is making a
     *        <code>SETSTAT</code> call.
     *        </p>
     *        <note>
     *        <p>
     *        If you want to preserve the original timestamp for your file, and modify other file attributes using
     *        <code>SETSTAT</code>, you can use Amazon EFS as backend storage with Transfer Family.
     *        </p>
     * @see SetStatOption
     */

    public void setSetStatOption(String setStatOption) {
        this.setStatOption = setStatOption;
    }

    /**
     * <p>
     * Use the <code>SetStatOption</code> to ignore the error that is generated when the client attempts to use
     * <code>SETSTAT</code> on a file you are uploading to an S3 bucket.
     * </p>
     * <p>
     * Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp and
     * permissions, using commands, such as <code>SETSTAT</code> when uploading the file. However, these commands are
     * not compatible with object storage systems, such as Amazon S3. Due to this incompatibility, file uploads from
     * these clients can result in errors even when the file is otherwise successfully uploaded.
     * </p>
     * <p>
     * Set the value to <code>ENABLE_NO_OP</code> to have the Transfer Family server ignore the <code>SETSTAT</code>
     * command, and upload files without needing to make any changes to your SFTP client. While the
     * <code>SetStatOption</code> <code>ENABLE_NO_OP</code> setting ignores the error, it does generate a log entry in
     * Amazon CloudWatch Logs, so you can determine when the client is making a <code>SETSTAT</code> call.
     * </p>
     * <note>
     * <p>
     * If you want to preserve the original timestamp for your file, and modify other file attributes using
     * <code>SETSTAT</code>, you can use Amazon EFS as backend storage with Transfer Family.
     * </p>
     * </note>
     * 
     * @return Use the <code>SetStatOption</code> to ignore the error that is generated when the client attempts to use
     *         <code>SETSTAT</code> on a file you are uploading to an S3 bucket.</p>
     *         <p>
     *         Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp
     *         and permissions, using commands, such as <code>SETSTAT</code> when uploading the file. However, these
     *         commands are not compatible with object storage systems, such as Amazon S3. Due to this incompatibility,
     *         file uploads from these clients can result in errors even when the file is otherwise successfully
     *         uploaded.
     *         </p>
     *         <p>
     *         Set the value to <code>ENABLE_NO_OP</code> to have the Transfer Family server ignore the
     *         <code>SETSTAT</code> command, and upload files without needing to make any changes to your SFTP client.
     *         While the <code>SetStatOption</code> <code>ENABLE_NO_OP</code> setting ignores the error, it does
     *         generate a log entry in Amazon CloudWatch Logs, so you can determine when the client is making a
     *         <code>SETSTAT</code> call.
     *         </p>
     *         <note>
     *         <p>
     *         If you want to preserve the original timestamp for your file, and modify other file attributes using
     *         <code>SETSTAT</code>, you can use Amazon EFS as backend storage with Transfer Family.
     *         </p>
     * @see SetStatOption
     */

    public String getSetStatOption() {
        return this.setStatOption;
    }

    /**
     * <p>
     * Use the <code>SetStatOption</code> to ignore the error that is generated when the client attempts to use
     * <code>SETSTAT</code> on a file you are uploading to an S3 bucket.
     * </p>
     * <p>
     * Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp and
     * permissions, using commands, such as <code>SETSTAT</code> when uploading the file. However, these commands are
     * not compatible with object storage systems, such as Amazon S3. Due to this incompatibility, file uploads from
     * these clients can result in errors even when the file is otherwise successfully uploaded.
     * </p>
     * <p>
     * Set the value to <code>ENABLE_NO_OP</code> to have the Transfer Family server ignore the <code>SETSTAT</code>
     * command, and upload files without needing to make any changes to your SFTP client. While the
     * <code>SetStatOption</code> <code>ENABLE_NO_OP</code> setting ignores the error, it does generate a log entry in
     * Amazon CloudWatch Logs, so you can determine when the client is making a <code>SETSTAT</code> call.
     * </p>
     * <note>
     * <p>
     * If you want to preserve the original timestamp for your file, and modify other file attributes using
     * <code>SETSTAT</code>, you can use Amazon EFS as backend storage with Transfer Family.
     * </p>
     * </note>
     * 
     * @param setStatOption
     *        Use the <code>SetStatOption</code> to ignore the error that is generated when the client attempts to use
     *        <code>SETSTAT</code> on a file you are uploading to an S3 bucket.</p>
     *        <p>
     *        Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp
     *        and permissions, using commands, such as <code>SETSTAT</code> when uploading the file. However, these
     *        commands are not compatible with object storage systems, such as Amazon S3. Due to this incompatibility,
     *        file uploads from these clients can result in errors even when the file is otherwise successfully
     *        uploaded.
     *        </p>
     *        <p>
     *        Set the value to <code>ENABLE_NO_OP</code> to have the Transfer Family server ignore the
     *        <code>SETSTAT</code> command, and upload files without needing to make any changes to your SFTP client.
     *        While the <code>SetStatOption</code> <code>ENABLE_NO_OP</code> setting ignores the error, it does generate
     *        a log entry in Amazon CloudWatch Logs, so you can determine when the client is making a
     *        <code>SETSTAT</code> call.
     *        </p>
     *        <note>
     *        <p>
     *        If you want to preserve the original timestamp for your file, and modify other file attributes using
     *        <code>SETSTAT</code>, you can use Amazon EFS as backend storage with Transfer Family.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SetStatOption
     */

    public ProtocolDetails withSetStatOption(String setStatOption) {
        setSetStatOption(setStatOption);
        return this;
    }

    /**
     * <p>
     * Use the <code>SetStatOption</code> to ignore the error that is generated when the client attempts to use
     * <code>SETSTAT</code> on a file you are uploading to an S3 bucket.
     * </p>
     * <p>
     * Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp and
     * permissions, using commands, such as <code>SETSTAT</code> when uploading the file. However, these commands are
     * not compatible with object storage systems, such as Amazon S3. Due to this incompatibility, file uploads from
     * these clients can result in errors even when the file is otherwise successfully uploaded.
     * </p>
     * <p>
     * Set the value to <code>ENABLE_NO_OP</code> to have the Transfer Family server ignore the <code>SETSTAT</code>
     * command, and upload files without needing to make any changes to your SFTP client. While the
     * <code>SetStatOption</code> <code>ENABLE_NO_OP</code> setting ignores the error, it does generate a log entry in
     * Amazon CloudWatch Logs, so you can determine when the client is making a <code>SETSTAT</code> call.
     * </p>
     * <note>
     * <p>
     * If you want to preserve the original timestamp for your file, and modify other file attributes using
     * <code>SETSTAT</code>, you can use Amazon EFS as backend storage with Transfer Family.
     * </p>
     * </note>
     * 
     * @param setStatOption
     *        Use the <code>SetStatOption</code> to ignore the error that is generated when the client attempts to use
     *        <code>SETSTAT</code> on a file you are uploading to an S3 bucket.</p>
     *        <p>
     *        Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp
     *        and permissions, using commands, such as <code>SETSTAT</code> when uploading the file. However, these
     *        commands are not compatible with object storage systems, such as Amazon S3. Due to this incompatibility,
     *        file uploads from these clients can result in errors even when the file is otherwise successfully
     *        uploaded.
     *        </p>
     *        <p>
     *        Set the value to <code>ENABLE_NO_OP</code> to have the Transfer Family server ignore the
     *        <code>SETSTAT</code> command, and upload files without needing to make any changes to your SFTP client.
     *        While the <code>SetStatOption</code> <code>ENABLE_NO_OP</code> setting ignores the error, it does generate
     *        a log entry in Amazon CloudWatch Logs, so you can determine when the client is making a
     *        <code>SETSTAT</code> call.
     *        </p>
     *        <note>
     *        <p>
     *        If you want to preserve the original timestamp for your file, and modify other file attributes using
     *        <code>SETSTAT</code>, you can use Amazon EFS as backend storage with Transfer Family.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SetStatOption
     */

    public ProtocolDetails withSetStatOption(SetStatOption setStatOption) {
        this.setStatOption = setStatOption.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * </p>
     * 
     * @return Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * @see As2Transport
     */

    public java.util.List<String> getAs2Transports() {
        return as2Transports;
    }

    /**
     * <p>
     * Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * </p>
     * 
     * @param as2Transports
     *        Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * @see As2Transport
     */

    public void setAs2Transports(java.util.Collection<String> as2Transports) {
        if (as2Transports == null) {
            this.as2Transports = null;
            return;
        }

        this.as2Transports = new java.util.ArrayList<String>(as2Transports);
    }

    /**
     * <p>
     * Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAs2Transports(java.util.Collection)} or {@link #withAs2Transports(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param as2Transports
     *        Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see As2Transport
     */

    public ProtocolDetails withAs2Transports(String... as2Transports) {
        if (this.as2Transports == null) {
            setAs2Transports(new java.util.ArrayList<String>(as2Transports.length));
        }
        for (String ele : as2Transports) {
            this.as2Transports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * </p>
     * 
     * @param as2Transports
     *        Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see As2Transport
     */

    public ProtocolDetails withAs2Transports(java.util.Collection<String> as2Transports) {
        setAs2Transports(as2Transports);
        return this;
    }

    /**
     * <p>
     * Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * </p>
     * 
     * @param as2Transports
     *        Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see As2Transport
     */

    public ProtocolDetails withAs2Transports(As2Transport... as2Transports) {
        java.util.ArrayList<String> as2TransportsCopy = new java.util.ArrayList<String>(as2Transports.length);
        for (As2Transport value : as2Transports) {
            as2TransportsCopy.add(value.toString());
        }
        if (getAs2Transports() == null) {
            setAs2Transports(as2TransportsCopy);
        } else {
            getAs2Transports().addAll(as2TransportsCopy);
        }
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
        if (getPassiveIp() != null)
            sb.append("PassiveIp: ").append(getPassiveIp()).append(",");
        if (getTlsSessionResumptionMode() != null)
            sb.append("TlsSessionResumptionMode: ").append(getTlsSessionResumptionMode()).append(",");
        if (getSetStatOption() != null)
            sb.append("SetStatOption: ").append(getSetStatOption()).append(",");
        if (getAs2Transports() != null)
            sb.append("As2Transports: ").append(getAs2Transports());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtocolDetails == false)
            return false;
        ProtocolDetails other = (ProtocolDetails) obj;
        if (other.getPassiveIp() == null ^ this.getPassiveIp() == null)
            return false;
        if (other.getPassiveIp() != null && other.getPassiveIp().equals(this.getPassiveIp()) == false)
            return false;
        if (other.getTlsSessionResumptionMode() == null ^ this.getTlsSessionResumptionMode() == null)
            return false;
        if (other.getTlsSessionResumptionMode() != null && other.getTlsSessionResumptionMode().equals(this.getTlsSessionResumptionMode()) == false)
            return false;
        if (other.getSetStatOption() == null ^ this.getSetStatOption() == null)
            return false;
        if (other.getSetStatOption() != null && other.getSetStatOption().equals(this.getSetStatOption()) == false)
            return false;
        if (other.getAs2Transports() == null ^ this.getAs2Transports() == null)
            return false;
        if (other.getAs2Transports() != null && other.getAs2Transports().equals(this.getAs2Transports()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPassiveIp() == null) ? 0 : getPassiveIp().hashCode());
        hashCode = prime * hashCode + ((getTlsSessionResumptionMode() == null) ? 0 : getTlsSessionResumptionMode().hashCode());
        hashCode = prime * hashCode + ((getSetStatOption() == null) ? 0 : getSetStatOption().hashCode());
        hashCode = prime * hashCode + ((getAs2Transports() == null) ? 0 : getAs2Transports().hashCode());
        return hashCode;
    }

    @Override
    public ProtocolDetails clone() {
        try {
            return (ProtocolDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ProtocolDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
