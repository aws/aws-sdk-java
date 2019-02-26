/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.event.TransportEvent;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.model.RawMessage;
import com.amazonaws.services.simpleemail.model.SendRawEmailRequest;
import com.amazonaws.services.simpleemail.model.SendRawEmailResult;
import com.amazonaws.util.VersionInfoUtils;

/**
 * A transport implementation using Amazon Web Service's E-mail Service. For
 * JavaMail purposes this transport implementation uses the "aws" protocol. In
 * order to send messages through the E-mail Service your AWS Credentials
 * (http://aws.amazon.com/security-credentials) need to be either in the
 * JavaMail Session's Properties (mail.aws.user and mail.aws.password), passed
 * into the connect() method, or set in the Session's setPasswordAuthentication
 * method. Parameters passed into the connect method as well as
 * PasswordAuthentication information supersedes the properties field for a
 * particular session. When connecting your AWS Access Key is your username and
 * your AWS Secret Key is your password.
 * <p>
 * This transport implementation only accepts MIME encoded messages (see
 * MimeMessage class) and RFC822 E-mail addresses (see InternetAddress class).
 */
public class AWSJavaMailTransport extends Transport {

    public static final String AWS_EMAIL_SERVICE_ENDPOINT_PROPERTY = "mail.aws.host";
    public static final String AWS_SECRET_KEY_PROPERTY = "mail.aws.password";
    public static final String AWS_ACCESS_KEY_PROPERTY = "mail.aws.user";

    private AmazonSimpleEmailServiceClient emailService;
    private final String accessKey;
    private final String secretKey;
    private final String httpsEndpoint;

    private String lastMessageId;

    public AWSJavaMailTransport(Session session, URLName urlname) {
        super(session, urlname);
        this.accessKey = session.getProperty(AWS_ACCESS_KEY_PROPERTY);
        this.secretKey = session.getProperty(AWS_SECRET_KEY_PROPERTY);
        this.httpsEndpoint = session.getProperty(AWS_EMAIL_SERVICE_ENDPOINT_PROPERTY);
    }

    /**
     * Sends a MIME message through Amazon's E-mail Service with the specified
     * recipients. Addresses that are passed into this method are merged with
     * the ones already embedded in the message (duplicates are removed).
     *
     * @param msg
     *            A Mime type e-mail message to be sent
     * @param addresses
     *            Additional e-mail addresses (RFC-822) to be included in the
     *            message
     */
    @Override
    public void sendMessage(Message msg, Address[] addresses)
            throws MessagingException, SendFailedException {

        checkConnection();
        checkMessage(msg);
        checkAddresses(msg, addresses);
        collateRecipients(msg, addresses);

        SendRawEmailRequest req = prepareEmail(msg);

        sendEmail(msg, req);
    }

    /**
     * Asserts a valid connection to the email service.
     */
    private void checkConnection() {
        if (emailService == null || !super.isConnected()) {
            throw new IllegalStateException("Not connected");
        }
    }

    /**
     * Checks that the message can be sent using AWS Simple E-mail Service.
     */
    private void checkMessage(Message msg) throws MessagingException {
        if (msg == null) {
            throw new MessagingException("Message is null");
        }
        if (!(msg instanceof MimeMessage)) {
            throw new MessagingException(
                    "AWS Mail Service can only send MimeMessages");
        }
    }

    /**
     * Checks to ensure at least one recipient is present (either in the Message
     * or Address[]) and all addresses that are passed in using the Address
     * array are of type InternetAddress.
     */
    private void checkAddresses(Message m, Address[] addresses)
            throws MessagingException, SendFailedException {

        if ( isNullOrEmpty((Object[]) addresses)
                && isNullOrEmpty((Object[]) m.getRecipients(Message.RecipientType.TO))
                && isNullOrEmpty((Object[]) m.getRecipients(Message.RecipientType.CC))
                && isNullOrEmpty((Object[]) m.getRecipients(Message.RecipientType.BCC)) ) {
            throw new SendFailedException("No recipient addresses");
        }

        // Make sure all addresses are internet addresses
        Set<Address> invalid = new HashSet<Address>();
        for ( Address[] recipients : new Address[][] {
                m.getRecipients(Message.RecipientType.TO),
                m.getRecipients(Message.RecipientType.CC),
                m.getRecipients(Message.RecipientType.BCC),
                addresses } ) {
            if ( !isNullOrEmpty(recipients) ) {
                for ( Address a : recipients ) {
                    if ( !(a instanceof InternetAddress) ) {
                        invalid.add(a);
                    }
                }
            }
        }

        if ( !invalid.isEmpty() ) {
            Address[] sent = new Address[0];
            Address[] unsent = new Address[0];
            super.notifyTransportListeners(TransportEvent.MESSAGE_NOT_DELIVERED, sent, unsent,
                    invalid.toArray(new Address[invalid.size()]), m);
            throw new SendFailedException("AWS Mail Service can only send to InternetAddresses");
        }
    }

    /**
     * Collates any addresses into the message object.  All addresses in the Address array
     * become of type TO unless they already exist in the Message header. If
     * they are in the Message header they will stay of the same type. Any
     * duplicate addresses are removed. Type BCC and then CC takes precedence
     * over TO when duplicates exist.  If any address is invalid an exception is
     * thrown.
     */
    private void collateRecipients(Message m, Address[] addresses) throws MessagingException {

        if ( !isNullOrEmpty(addresses) ) {
            Hashtable<Address, Message.RecipientType> addressTable = new Hashtable<Address, Message.RecipientType>();

            for ( Address a : addresses ) {
                addressTable.put(a, Message.RecipientType.TO);
            }

            if ( !isNullOrEmpty(m.getRecipients(Message.RecipientType.TO)) ) {
                for ( Address a : m.getRecipients(Message.RecipientType.TO) ) {
                    addressTable.put(a, Message.RecipientType.TO);
                }
            }
            if ( !isNullOrEmpty(m.getRecipients(Message.RecipientType.CC)) ) {
                for ( Address a : m.getRecipients(Message.RecipientType.CC) ) {
                    addressTable.put(a, Message.RecipientType.CC);
                }
            }
            if ( !isNullOrEmpty(m.getRecipients(Message.RecipientType.BCC)) ) {
                for ( Address a : m.getRecipients(Message.RecipientType.BCC) ) {
                    addressTable.put(a, Message.RecipientType.BCC);
                }
            }

            // Clear the original recipients for collation
            m.setRecipients(Message.RecipientType.TO, new Address[0]);
            m.setRecipients(Message.RecipientType.CC, new Address[0]);
            m.setRecipients(Message.RecipientType.BCC, new Address[0]);

            Iterator<Address> aIter = addressTable.keySet().iterator();

            while ( aIter.hasNext() ) {
                Address a = aIter.next();
                m.addRecipient(addressTable.get(a), a);
            }

            // Simple E-mail needs at least one TO address, so add one if there isn't one
            if ( m.getRecipients(Message.RecipientType.TO) == null ||
                    m.getRecipients(Message.RecipientType.TO).length == 0 ) {
                m.setRecipient(Message.RecipientType.TO, addressTable.keySet().iterator().next());
            }
        }
    }

    /**
     * Prepares the email to be sent using the JavaMail service. Wraps up the
     * message into a RawEmailRequest object to be processed by AWS's
     * sendRawEmail().
     *
     * @param m
     *            A JavaMail message to be converted to a request
     * @return A Raw Email Request for AWS E-mail Service
     */
    private SendRawEmailRequest prepareEmail(Message m)
            throws MessagingException {

        try {
            OutputStream byteOutput = new ByteArrayOutputStream();
            m.writeTo(byteOutput);
            SendRawEmailRequest req = new SendRawEmailRequest();
            byte[] messageByteArray = ((ByteArrayOutputStream) byteOutput)
                    .toByteArray();
            RawMessage message = new RawMessage();
            message.setData(ByteBuffer.wrap(messageByteArray));
            req.setRawMessage(message);
            return req;
        } catch (Exception e) {
            Address[] sent = new Address[0];
            Address[] unsent = new Address[0];
            Address[] invalid = m.getAllRecipients();
            super.notifyTransportListeners(
                    TransportEvent.MESSAGE_NOT_DELIVERED, sent, unsent,
                    invalid, m);
            throw new MessagingException("Unable to write message: "
                    + m.toString(), e);
        }
    }

    /**
     * Sends an email using AWS E-mail Service and notifies listeners
     *
     * @param m
     *            Message used to notify users
     * @param req
     *            Raw email to be sent
     */
    private void sendEmail(Message m, SendRawEmailRequest req)
            throws SendFailedException, MessagingException {

        Address[] sent = null;
        Address[] unsent = null;
        Address[] invalid = null;

        try {
            appendUserAgent(req, USER_AGENT);
            SendRawEmailResult resp = this.emailService.sendRawEmail(req);
            lastMessageId = resp.getMessageId();
            sent = m.getAllRecipients();
            unsent = new Address[0];
            invalid = new Address[0];
            super.notifyTransportListeners(TransportEvent.MESSAGE_DELIVERED,
                    sent, unsent, invalid, m);
        } catch (Exception e) {
            sent = new Address[0];
            unsent = m.getAllRecipients();
            invalid = new Address[0];
            super.notifyTransportListeners(
                    TransportEvent.MESSAGE_NOT_DELIVERED, sent, unsent,
                    invalid, m);
            throw new SendFailedException("Unable to send email", e, sent,
                    unsent, invalid);
        }
    }

    /**
     * Sets up a new AmazonSimpleEmailServiceClient. This method is typically called
     * indirectly from the connect() method and should only be called on
     * instantiation or to reopen after a close(). If a non-null or empty User
     * and Password passed in session properties are overridden while user
     * remains connected (mail.aws.user and mail.aws.password). The default
     * https endpoint is specified by the mail client; however, it can be
     * overridden by either passing in a value or setting mail.aws.host. Like
     * the user and password, the variable that is passed in takes preference
     * over the properties file.
     *
     * @param host
     *            Optional - host specifies the AWS E-mail endpoint
     * @param awsAccessKey
     *            Optional - AWS Access Key (otherwise must specify through
     *            properties file)
     * @param awsSecretKey
     *            Optional - AWS Secret key (otherwise must specify through
     *            properties file)
     * @return Returns true if non-empty credentials are given
     */
    @Override
    protected boolean protocolConnect(String host, int port, String awsAccessKey,
            String awsSecretKey) {
        if (isConnected())
            throw new IllegalStateException("Already connected");

        if (isNullOrEmpty(awsAccessKey) || isNullOrEmpty(awsSecretKey)) {
            if (isNullOrEmpty(accessKey) || isNullOrEmpty(secretKey)) {
                // Use the no-argument constructor to fall back on:
                // - Environment Variables
                // - Java System Properties
                // - Instance profile credentials delivered through the Amazon EC2 metadata service
                this.emailService = new AmazonSimpleEmailServiceClient();
            }
            awsAccessKey = this.accessKey;
            awsSecretKey = this.secretKey;
        }

        if (this.emailService == null) {
            // Use the supplied credentials.
            this.emailService = new AmazonSimpleEmailServiceClient(new BasicAWSCredentials(awsAccessKey, awsSecretKey));
        }

        if (!isNullOrEmpty(host)) {
            this.emailService.setEndpoint(host);
        } else if (this.httpsEndpoint != null) {
            this.emailService.setEndpoint(this.httpsEndpoint);
        }
        super.setConnected(true);
        return true;
    }

    @Override
    public void close() throws MessagingException {
        super.close();
        this.emailService = null;
    }

    /**
    * <p>
    * The unique message identifier ot the last message sent by <code>sendMessage</code>
            * </p>
            *
            * @return The unique message identifier sent by the last
    *         <code>sendMessage</code> action.
    */
    public String getLastMessageId() {
        return lastMessageId;
    }

    private static boolean isNullOrEmpty(String s) {
        return (s == null || s.length() == 0);
    }

    private static boolean isNullOrEmpty(Object[] o) {
        return (o == null || o.length == 0);
    }

    public <X extends AmazonWebServiceRequest> X appendUserAgent(X request, String userAgent) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT);
        return request;
    }

    private static final String USER_AGENT = AWSJavaMailTransport.class.getName() + "/" + VersionInfoUtils.getVersion();

}