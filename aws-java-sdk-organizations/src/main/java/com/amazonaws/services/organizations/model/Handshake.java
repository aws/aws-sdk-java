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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information that must be exchanged to securely establish a relationship between two accounts (an
 * <i>originator</i> and a <i>recipient</i>). For example, when a master account (the originator) invites another
 * account (the recipient) to join its organization, the two accounts exchange information as a series of handshake
 * requests and responses.
 * </p>
 * <p>
 * <b>Note:</b> Handshakes that are CANCELED, ACCEPTED, or DECLINED show up in lists for only 30 days after entering
 * that state After that they are deleted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/Handshake" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Handshake implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the
     * handshake.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lower-case letters or digits.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a handshake.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Information about the two accounts that are participating in the handshake.
     * </p>
     */
    private java.util.List<HandshakeParty> parties;
    /**
     * <p>
     * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its
     * creation to its acceptance. The meaning of each of the valid values is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types) and
     * not all recipients have responded yet. The request stays in this state until all recipients respond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     * recipients have responded, allowing the originator to complete the handshake action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of any kind
     * from the recipient before the expiration time (15 days).
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The date and time that the handshake request was made.
     * </p>
     */
    private java.util.Date requestedTimestamp;
    /**
     * <p>
     * The date and time that the handshake expires. If the recipient of the handshake request fails to respond before
     * the specified date and time, the handshake becomes inactive and is no longer valid.
     * </p>
     */
    private java.util.Date expirationTimestamp;
    /**
     * <p>
     * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following
     * handshake types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from the
     * master account to only non-member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     * organization. It is always sent from the master account to only <i>invited</i> member accounts. Created accounts
     * do not receive this because those accounts were created by the organization's master account and approval is
     * inferred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     * accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master account and
     * signals the master that it can finalize the process to enable all features.
     * </p>
     * </li>
     * </ul>
     */
    private String action;
    /**
     * <p>
     * Additional information that is needed to process the handshake.
     * </p>
     */
    private java.util.List<HandshakeResource> resources;

    /**
     * <p>
     * The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the
     * handshake.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the
     *        handshake.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-"
     *        followed by from 8 to 32 lower-case letters or digits.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the
     * handshake.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the
     *         handshake.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-"
     *         followed by from 8 to 32 lower-case letters or digits.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the
     * handshake.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the
     *        handshake.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-"
     *        followed by from 8 to 32 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Handshake withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a handshake.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of a handshake.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a handshake.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a handshake.</p>
     *         <p>
     *         For more information about ARNs in Organizations, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *         >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a handshake.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of a handshake.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Handshake withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Information about the two accounts that are participating in the handshake.
     * </p>
     * 
     * @return Information about the two accounts that are participating in the handshake.
     */

    public java.util.List<HandshakeParty> getParties() {
        return parties;
    }

    /**
     * <p>
     * Information about the two accounts that are participating in the handshake.
     * </p>
     * 
     * @param parties
     *        Information about the two accounts that are participating in the handshake.
     */

    public void setParties(java.util.Collection<HandshakeParty> parties) {
        if (parties == null) {
            this.parties = null;
            return;
        }

        this.parties = new java.util.ArrayList<HandshakeParty>(parties);
    }

    /**
     * <p>
     * Information about the two accounts that are participating in the handshake.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParties(java.util.Collection)} or {@link #withParties(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param parties
     *        Information about the two accounts that are participating in the handshake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Handshake withParties(HandshakeParty... parties) {
        if (this.parties == null) {
            setParties(new java.util.ArrayList<HandshakeParty>(parties.length));
        }
        for (HandshakeParty ele : parties) {
            this.parties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the two accounts that are participating in the handshake.
     * </p>
     * 
     * @param parties
     *        Information about the two accounts that are participating in the handshake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Handshake withParties(java.util.Collection<HandshakeParty> parties) {
        setParties(parties);
        return this;
    }

    /**
     * <p>
     * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its
     * creation to its acceptance. The meaning of each of the valid values is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types) and
     * not all recipients have responded yet. The request stays in this state until all recipients respond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     * recipients have responded, allowing the originator to complete the handshake action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of any kind
     * from the recipient before the expiration time (15 days).
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the handshake. Use the state to trace the flow of the handshake through the process
     *        from its creation to its acceptance. The meaning of each of the valid values is as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types)
     *        and not all recipients have responded yet. The request stays in this state until all recipients respond.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     *        recipients have responded, allowing the originator to complete the handshake action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of
     *        any kind from the recipient before the expiration time (15 days).
     *        </p>
     *        </li>
     * @see HandshakeState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its
     * creation to its acceptance. The meaning of each of the valid values is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types) and
     * not all recipients have responded yet. The request stays in this state until all recipients respond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     * recipients have responded, allowing the originator to complete the handshake action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of any kind
     * from the recipient before the expiration time (15 days).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the handshake. Use the state to trace the flow of the handshake through the process
     *         from its creation to its acceptance. The meaning of each of the valid values is as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake
     *         types) and not all recipients have responded yet. The request stays in this state until all recipients
     *         respond.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and
     *         all recipients have responded, allowing the originator to complete the handshake action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of
     *         any kind from the recipient before the expiration time (15 days).
     *         </p>
     *         </li>
     * @see HandshakeState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its
     * creation to its acceptance. The meaning of each of the valid values is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types) and
     * not all recipients have responded yet. The request stays in this state until all recipients respond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     * recipients have responded, allowing the originator to complete the handshake action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of any kind
     * from the recipient before the expiration time (15 days).
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the handshake. Use the state to trace the flow of the handshake through the process
     *        from its creation to its acceptance. The meaning of each of the valid values is as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types)
     *        and not all recipients have responded yet. The request stays in this state until all recipients respond.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     *        recipients have responded, allowing the originator to complete the handshake action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of
     *        any kind from the recipient before the expiration time (15 days).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandshakeState
     */

    public Handshake withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its
     * creation to its acceptance. The meaning of each of the valid values is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types) and
     * not all recipients have responded yet. The request stays in this state until all recipients respond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     * recipients have responded, allowing the originator to complete the handshake action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of any kind
     * from the recipient before the expiration time (15 days).
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the handshake. Use the state to trace the flow of the handshake through the process
     *        from its creation to its acceptance. The meaning of each of the valid values is as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types)
     *        and not all recipients have responded yet. The request stays in this state until all recipients respond.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     *        recipients have responded, allowing the originator to complete the handshake action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of
     *        any kind from the recipient before the expiration time (15 days).
     *        </p>
     *        </li>
     * @see HandshakeState
     */

    public void setState(HandshakeState state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its
     * creation to its acceptance. The meaning of each of the valid values is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types) and
     * not all recipients have responded yet. The request stays in this state until all recipients respond.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     * recipients have responded, allowing the originator to complete the handshake action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of any kind
     * from the recipient before the expiration time (15 days).
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the handshake. Use the state to trace the flow of the handshake through the process
     *        from its creation to its acceptance. The meaning of each of the valid values is as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REQUESTED</b>: This handshake was sent to multiple recipients (applicable to only some handshake types)
     *        and not all recipients have responded yet. The request stays in this state until all recipients respond.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OPEN</b>: This handshake was sent to multiple recipients (applicable to only some policy types) and all
     *        recipients have responded, allowing the originator to complete the handshake action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELED</b>: This handshake is no longer active because it was canceled by the originating account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACCEPTED</b>: This handshake is complete because it has been accepted by the recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DECLINED</b>: This handshake is no longer active because it was declined by the recipient account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EXPIRED</b>: This handshake is no longer active because the originator did not receive a response of
     *        any kind from the recipient before the expiration time (15 days).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandshakeState
     */

    public Handshake withState(HandshakeState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the handshake request was made.
     * </p>
     * 
     * @param requestedTimestamp
     *        The date and time that the handshake request was made.
     */

    public void setRequestedTimestamp(java.util.Date requestedTimestamp) {
        this.requestedTimestamp = requestedTimestamp;
    }

    /**
     * <p>
     * The date and time that the handshake request was made.
     * </p>
     * 
     * @return The date and time that the handshake request was made.
     */

    public java.util.Date getRequestedTimestamp() {
        return this.requestedTimestamp;
    }

    /**
     * <p>
     * The date and time that the handshake request was made.
     * </p>
     * 
     * @param requestedTimestamp
     *        The date and time that the handshake request was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Handshake withRequestedTimestamp(java.util.Date requestedTimestamp) {
        setRequestedTimestamp(requestedTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time that the handshake expires. If the recipient of the handshake request fails to respond before
     * the specified date and time, the handshake becomes inactive and is no longer valid.
     * </p>
     * 
     * @param expirationTimestamp
     *        The date and time that the handshake expires. If the recipient of the handshake request fails to respond
     *        before the specified date and time, the handshake becomes inactive and is no longer valid.
     */

    public void setExpirationTimestamp(java.util.Date expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    /**
     * <p>
     * The date and time that the handshake expires. If the recipient of the handshake request fails to respond before
     * the specified date and time, the handshake becomes inactive and is no longer valid.
     * </p>
     * 
     * @return The date and time that the handshake expires. If the recipient of the handshake request fails to respond
     *         before the specified date and time, the handshake becomes inactive and is no longer valid.
     */

    public java.util.Date getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    /**
     * <p>
     * The date and time that the handshake expires. If the recipient of the handshake request fails to respond before
     * the specified date and time, the handshake becomes inactive and is no longer valid.
     * </p>
     * 
     * @param expirationTimestamp
     *        The date and time that the handshake expires. If the recipient of the handshake request fails to respond
     *        before the specified date and time, the handshake becomes inactive and is no longer valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Handshake withExpirationTimestamp(java.util.Date expirationTimestamp) {
        setExpirationTimestamp(expirationTimestamp);
        return this;
    }

    /**
     * <p>
     * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following
     * handshake types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from the
     * master account to only non-member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     * organization. It is always sent from the master account to only <i>invited</i> member accounts. Created accounts
     * do not receive this because those accounts were created by the organization's master account and approval is
     * inferred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     * accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master account and
     * signals the master that it can finalize the process to enable all features.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The type of handshake, indicating what action occurs when the recipient accepts the handshake. The
     *        following handshake types are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from
     *        the master account to only non-member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     *        organization. It is always sent from the master account to only <i>invited</i> member accounts. Created
     *        accounts do not receive this because those accounts were created by the organization's master account and
     *        approval is inferred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     *        accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master
     *        account and signals the master that it can finalize the process to enable all features.
     *        </p>
     *        </li>
     * @see ActionType
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following
     * handshake types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from the
     * master account to only non-member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     * organization. It is always sent from the master account to only <i>invited</i> member accounts. Created accounts
     * do not receive this because those accounts were created by the organization's master account and approval is
     * inferred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     * accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master account and
     * signals the master that it can finalize the process to enable all features.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of handshake, indicating what action occurs when the recipient accepts the handshake. The
     *         following handshake types are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent
     *         from the master account to only non-member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     *         organization. It is always sent from the master account to only <i>invited</i> member accounts. Created
     *         accounts do not receive this because those accounts were created by the organization's master account and
     *         approval is inferred.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all
     *         member accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the
     *         master account and signals the master that it can finalize the process to enable all features.
     *         </p>
     *         </li>
     * @see ActionType
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following
     * handshake types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from the
     * master account to only non-member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     * organization. It is always sent from the master account to only <i>invited</i> member accounts. Created accounts
     * do not receive this because those accounts were created by the organization's master account and approval is
     * inferred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     * accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master account and
     * signals the master that it can finalize the process to enable all features.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The type of handshake, indicating what action occurs when the recipient accepts the handshake. The
     *        following handshake types are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from
     *        the master account to only non-member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     *        organization. It is always sent from the master account to only <i>invited</i> member accounts. Created
     *        accounts do not receive this because those accounts were created by the organization's master account and
     *        approval is inferred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     *        accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master
     *        account and signals the master that it can finalize the process to enable all features.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Handshake withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following
     * handshake types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from the
     * master account to only non-member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     * organization. It is always sent from the master account to only <i>invited</i> member accounts. Created accounts
     * do not receive this because those accounts were created by the organization's master account and approval is
     * inferred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     * accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master account and
     * signals the master that it can finalize the process to enable all features.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The type of handshake, indicating what action occurs when the recipient accepts the handshake. The
     *        following handshake types are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from
     *        the master account to only non-member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     *        organization. It is always sent from the master account to only <i>invited</i> member accounts. Created
     *        accounts do not receive this because those accounts were created by the organization's master account and
     *        approval is inferred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     *        accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master
     *        account and signals the master that it can finalize the process to enable all features.
     *        </p>
     *        </li>
     * @see ActionType
     */

    public void setAction(ActionType action) {
        withAction(action);
    }

    /**
     * <p>
     * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following
     * handshake types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from the
     * master account to only non-member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     * organization. It is always sent from the master account to only <i>invited</i> member accounts. Created accounts
     * do not receive this because those accounts were created by the organization's master account and approval is
     * inferred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     * accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master account and
     * signals the master that it can finalize the process to enable all features.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The type of handshake, indicating what action occurs when the recipient accepts the handshake. The
     *        following handshake types are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>INVITE</b>: This type of handshake represents a request to join an organization. It is always sent from
     *        the master account to only non-member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ENABLE_ALL_FEATURES</b>: This type of handshake represents a request to enable all features in an
     *        organization. It is always sent from the master account to only <i>invited</i> member accounts. Created
     *        accounts do not receive this because those accounts were created by the organization's master account and
     *        approval is inferred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>APPROVE_ALL_FEATURES</b>: This type of handshake is sent from the Organizations service when all member
     *        accounts have approved the <code>ENABLE_ALL_FEATURES</code> invitation. It is sent only to the master
     *        account and signals the master that it can finalize the process to enable all features.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public Handshake withAction(ActionType action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Additional information that is needed to process the handshake.
     * </p>
     * 
     * @return Additional information that is needed to process the handshake.
     */

    public java.util.List<HandshakeResource> getResources() {
        return resources;
    }

    /**
     * <p>
     * Additional information that is needed to process the handshake.
     * </p>
     * 
     * @param resources
     *        Additional information that is needed to process the handshake.
     */

    public void setResources(java.util.Collection<HandshakeResource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<HandshakeResource>(resources);
    }

    /**
     * <p>
     * Additional information that is needed to process the handshake.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        Additional information that is needed to process the handshake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Handshake withResources(HandshakeResource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<HandshakeResource>(resources.length));
        }
        for (HandshakeResource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional information that is needed to process the handshake.
     * </p>
     * 
     * @param resources
     *        Additional information that is needed to process the handshake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Handshake withResources(java.util.Collection<HandshakeResource> resources) {
        setResources(resources);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getParties() != null)
            sb.append("Parties: ").append(getParties()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getRequestedTimestamp() != null)
            sb.append("RequestedTimestamp: ").append(getRequestedTimestamp()).append(",");
        if (getExpirationTimestamp() != null)
            sb.append("ExpirationTimestamp: ").append(getExpirationTimestamp()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Handshake == false)
            return false;
        Handshake other = (Handshake) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getParties() == null ^ this.getParties() == null)
            return false;
        if (other.getParties() != null && other.getParties().equals(this.getParties()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRequestedTimestamp() == null ^ this.getRequestedTimestamp() == null)
            return false;
        if (other.getRequestedTimestamp() != null && other.getRequestedTimestamp().equals(this.getRequestedTimestamp()) == false)
            return false;
        if (other.getExpirationTimestamp() == null ^ this.getExpirationTimestamp() == null)
            return false;
        if (other.getExpirationTimestamp() != null && other.getExpirationTimestamp().equals(this.getExpirationTimestamp()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getParties() == null) ? 0 : getParties().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getRequestedTimestamp() == null) ? 0 : getRequestedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getExpirationTimestamp() == null) ? 0 : getExpirationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public Handshake clone() {
        try {
            return (Handshake) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.HandshakeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
