/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a member account that was invited to contribute to a behavior graph.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/MemberDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account identifier for the member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The AWS account root user email address for the member account.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The ARN of the behavior graph that the member account was invited to.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The AWS account identifier of the administrator account for the behavior graph.
     * </p>
     */
    @Deprecated
    private String masterId;
    /**
     * <p>
     * The AWS account identifier of the administrator account for the behavior graph.
     * </p>
     */
    private String administratorId;
    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - Indicates that the member account accepted the invitation but is prevented
     * from contributing data to the behavior graph. <code>DisabledReason</code> provides the reason why the member
     * account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     */
    private String status;
    /**
     * <p>
     * For member accounts with a status of <code>ACCEPTED_BUT_DISABLED</code>, the reason that the member account is
     * not enabled.
     * </p>
     * <p>
     * The reason can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VOLUME_TOO_HIGH</code> - Indicates that adding the member account would cause the data volume for the
     * behavior graph to be too high.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOLUME_UNKNOWN</code> - Indicates that Detective is unable to verify the data volume for the member
     * account. This is usually because the member account is not enrolled in Amazon GuardDuty.
     * </p>
     * </li>
     * </ul>
     */
    private String disabledReason;
    /**
     * <p>
     * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since
     * the epoch.
     * </p>
     */
    private java.util.Date invitedTime;
    /**
     * <p>
     * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * </p>
     */
    private java.util.Date updatedTime;
    /**
     * <p>
     * The data volume in bytes per day for the member account.
     * </p>
     */
    private Long volumeUsageInBytes;
    /**
     * <p>
     * The data and time when the member account data volume was last updated.
     * </p>
     */
    private java.util.Date volumeUsageUpdatedTime;
    /**
     * <p>
     * The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent, and 100
     * indicates 100 percent.
     * </p>
     * <p>
     * Note that this is not the percentage of the behavior graph data volume.
     * </p>
     * <p>
     * For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB per day.
     * If the data volume for the member account is 40 GB per day, then <code>PercentOfGraphUtilization</code> is 25. It
     * represents 25% of the maximum allowed data volume.
     * </p>
     */
    @Deprecated
    private Double percentOfGraphUtilization;
    /**
     * <p>
     * The date and time when the graph utilization percentage was last updated.
     * </p>
     */
    @Deprecated
    private java.util.Date percentOfGraphUtilizationUpdatedTime;

    /**
     * <p>
     * The AWS account identifier for the member account.
     * </p>
     * 
     * @param accountId
     *        The AWS account identifier for the member account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account identifier for the member account.
     * </p>
     * 
     * @return The AWS account identifier for the member account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account identifier for the member account.
     * </p>
     * 
     * @param accountId
     *        The AWS account identifier for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The AWS account root user email address for the member account.
     * </p>
     * 
     * @param emailAddress
     *        The AWS account root user email address for the member account.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The AWS account root user email address for the member account.
     * </p>
     * 
     * @return The AWS account root user email address for the member account.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The AWS account root user email address for the member account.
     * </p>
     * 
     * @param emailAddress
     *        The AWS account root user email address for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The ARN of the behavior graph that the member account was invited to.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph that the member account was invited to.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph that the member account was invited to.
     * </p>
     * 
     * @return The ARN of the behavior graph that the member account was invited to.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph that the member account was invited to.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph that the member account was invited to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The AWS account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @param masterId
     *        The AWS account identifier of the administrator account for the behavior graph.
     */
    @Deprecated
    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * The AWS account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @return The AWS account identifier of the administrator account for the behavior graph.
     */
    @Deprecated
    public String getMasterId() {
        return this.masterId;
    }

    /**
     * <p>
     * The AWS account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @param masterId
     *        The AWS account identifier of the administrator account for the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public MemberDetail withMasterId(String masterId) {
        setMasterId(masterId);
        return this;
    }

    /**
     * <p>
     * The AWS account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @param administratorId
     *        The AWS account identifier of the administrator account for the behavior graph.
     */

    public void setAdministratorId(String administratorId) {
        this.administratorId = administratorId;
    }

    /**
     * <p>
     * The AWS account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @return The AWS account identifier of the administrator account for the behavior graph.
     */

    public String getAdministratorId() {
        return this.administratorId;
    }

    /**
     * <p>
     * The AWS account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @param administratorId
     *        The AWS account identifier of the administrator account for the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withAdministratorId(String administratorId) {
        setAdministratorId(administratorId);
        return this;
    }

    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - Indicates that the member account accepted the invitation but is prevented
     * from contributing data to the behavior graph. <code>DisabledReason</code> provides the reason why the member
     * account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     * 
     * @param status
     *        The current membership status of the member account. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier
     *        and email address provided for the member account match. If they do match, then Detective sends the
     *        invitation. If the email address and account identifier don't match, then the member cannot be added to
     *        the behavior graph.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member
     *        account do not match, and Detective did not send an invitation to the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the
     *        behavior graph.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTED_BUT_DISABLED</code> - Indicates that the member account accepted the invitation but is
     *        prevented from contributing data to the behavior graph. <code>DisabledReason</code> provides the reason
     *        why the member account is not enabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * @see MemberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - Indicates that the member account accepted the invitation but is prevented
     * from contributing data to the behavior graph. <code>DisabledReason</code> provides the reason why the member
     * account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     * 
     * @return The current membership status of the member account. The status can have one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier
     *         and email address provided for the member account match. If they do match, then Detective sends the
     *         invitation. If the email address and account identifier don't match, then the member cannot be added to
     *         the behavior graph.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member
     *         account do not match, and Detective did not send an invitation to the account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the
     *         behavior graph.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCEPTED_BUT_DISABLED</code> - Indicates that the member account accepted the invitation but is
     *         prevented from contributing data to the behavior graph. <code>DisabledReason</code> provides the reason
     *         why the member account is not enabled.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Member accounts that declined an invitation or that were removed from the behavior graph are not
     *         included.
     * @see MemberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - Indicates that the member account accepted the invitation but is prevented
     * from contributing data to the behavior graph. <code>DisabledReason</code> provides the reason why the member
     * account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     * 
     * @param status
     *        The current membership status of the member account. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier
     *        and email address provided for the member account match. If they do match, then Detective sends the
     *        invitation. If the email address and account identifier don't match, then the member cannot be added to
     *        the behavior graph.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member
     *        account do not match, and Detective did not send an invitation to the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the
     *        behavior graph.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTED_BUT_DISABLED</code> - Indicates that the member account accepted the invitation but is
     *        prevented from contributing data to the behavior graph. <code>DisabledReason</code> provides the reason
     *        why the member account is not enabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public MemberDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - Indicates that the member account accepted the invitation but is prevented
     * from contributing data to the behavior graph. <code>DisabledReason</code> provides the reason why the member
     * account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     * 
     * @param status
     *        The current membership status of the member account. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier
     *        and email address provided for the member account match. If they do match, then Detective sends the
     *        invitation. If the email address and account identifier don't match, then the member cannot be added to
     *        the behavior graph.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member
     *        account do not match, and Detective did not send an invitation to the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the
     *        behavior graph.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTED_BUT_DISABLED</code> - Indicates that the member account accepted the invitation but is
     *        prevented from contributing data to the behavior graph. <code>DisabledReason</code> provides the reason
     *        why the member account is not enabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public MemberDetail withStatus(MemberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * For member accounts with a status of <code>ACCEPTED_BUT_DISABLED</code>, the reason that the member account is
     * not enabled.
     * </p>
     * <p>
     * The reason can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VOLUME_TOO_HIGH</code> - Indicates that adding the member account would cause the data volume for the
     * behavior graph to be too high.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOLUME_UNKNOWN</code> - Indicates that Detective is unable to verify the data volume for the member
     * account. This is usually because the member account is not enrolled in Amazon GuardDuty.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disabledReason
     *        For member accounts with a status of <code>ACCEPTED_BUT_DISABLED</code>, the reason that the member
     *        account is not enabled.</p>
     *        <p>
     *        The reason can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VOLUME_TOO_HIGH</code> - Indicates that adding the member account would cause the data volume for
     *        the behavior graph to be too high.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VOLUME_UNKNOWN</code> - Indicates that Detective is unable to verify the data volume for the member
     *        account. This is usually because the member account is not enrolled in Amazon GuardDuty.
     *        </p>
     *        </li>
     * @see MemberDisabledReason
     */

    public void setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
    }

    /**
     * <p>
     * For member accounts with a status of <code>ACCEPTED_BUT_DISABLED</code>, the reason that the member account is
     * not enabled.
     * </p>
     * <p>
     * The reason can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VOLUME_TOO_HIGH</code> - Indicates that adding the member account would cause the data volume for the
     * behavior graph to be too high.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOLUME_UNKNOWN</code> - Indicates that Detective is unable to verify the data volume for the member
     * account. This is usually because the member account is not enrolled in Amazon GuardDuty.
     * </p>
     * </li>
     * </ul>
     * 
     * @return For member accounts with a status of <code>ACCEPTED_BUT_DISABLED</code>, the reason that the member
     *         account is not enabled.</p>
     *         <p>
     *         The reason can have one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VOLUME_TOO_HIGH</code> - Indicates that adding the member account would cause the data volume for
     *         the behavior graph to be too high.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VOLUME_UNKNOWN</code> - Indicates that Detective is unable to verify the data volume for the member
     *         account. This is usually because the member account is not enrolled in Amazon GuardDuty.
     *         </p>
     *         </li>
     * @see MemberDisabledReason
     */

    public String getDisabledReason() {
        return this.disabledReason;
    }

    /**
     * <p>
     * For member accounts with a status of <code>ACCEPTED_BUT_DISABLED</code>, the reason that the member account is
     * not enabled.
     * </p>
     * <p>
     * The reason can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VOLUME_TOO_HIGH</code> - Indicates that adding the member account would cause the data volume for the
     * behavior graph to be too high.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOLUME_UNKNOWN</code> - Indicates that Detective is unable to verify the data volume for the member
     * account. This is usually because the member account is not enrolled in Amazon GuardDuty.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disabledReason
     *        For member accounts with a status of <code>ACCEPTED_BUT_DISABLED</code>, the reason that the member
     *        account is not enabled.</p>
     *        <p>
     *        The reason can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VOLUME_TOO_HIGH</code> - Indicates that adding the member account would cause the data volume for
     *        the behavior graph to be too high.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VOLUME_UNKNOWN</code> - Indicates that Detective is unable to verify the data volume for the member
     *        account. This is usually because the member account is not enrolled in Amazon GuardDuty.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberDisabledReason
     */

    public MemberDetail withDisabledReason(String disabledReason) {
        setDisabledReason(disabledReason);
        return this;
    }

    /**
     * <p>
     * For member accounts with a status of <code>ACCEPTED_BUT_DISABLED</code>, the reason that the member account is
     * not enabled.
     * </p>
     * <p>
     * The reason can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VOLUME_TOO_HIGH</code> - Indicates that adding the member account would cause the data volume for the
     * behavior graph to be too high.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VOLUME_UNKNOWN</code> - Indicates that Detective is unable to verify the data volume for the member
     * account. This is usually because the member account is not enrolled in Amazon GuardDuty.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disabledReason
     *        For member accounts with a status of <code>ACCEPTED_BUT_DISABLED</code>, the reason that the member
     *        account is not enabled.</p>
     *        <p>
     *        The reason can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VOLUME_TOO_HIGH</code> - Indicates that adding the member account would cause the data volume for
     *        the behavior graph to be too high.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VOLUME_UNKNOWN</code> - Indicates that Detective is unable to verify the data volume for the member
     *        account. This is usually because the member account is not enrolled in Amazon GuardDuty.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberDisabledReason
     */

    public MemberDetail withDisabledReason(MemberDisabledReason disabledReason) {
        this.disabledReason = disabledReason.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since
     * the epoch.
     * </p>
     * 
     * @param invitedTime
     *        The date and time that Detective sent the invitation to the member account. The value is in milliseconds
     *        since the epoch.
     */

    public void setInvitedTime(java.util.Date invitedTime) {
        this.invitedTime = invitedTime;
    }

    /**
     * <p>
     * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since
     * the epoch.
     * </p>
     * 
     * @return The date and time that Detective sent the invitation to the member account. The value is in milliseconds
     *         since the epoch.
     */

    public java.util.Date getInvitedTime() {
        return this.invitedTime;
    }

    /**
     * <p>
     * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since
     * the epoch.
     * </p>
     * 
     * @param invitedTime
     *        The date and time that Detective sent the invitation to the member account. The value is in milliseconds
     *        since the epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withInvitedTime(java.util.Date invitedTime) {
        setInvitedTime(invitedTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     */

    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * </p>
     * 
     * @return The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     */

    public java.util.Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withUpdatedTime(java.util.Date updatedTime) {
        setUpdatedTime(updatedTime);
        return this;
    }

    /**
     * <p>
     * The data volume in bytes per day for the member account.
     * </p>
     * 
     * @param volumeUsageInBytes
     *        The data volume in bytes per day for the member account.
     */

    public void setVolumeUsageInBytes(Long volumeUsageInBytes) {
        this.volumeUsageInBytes = volumeUsageInBytes;
    }

    /**
     * <p>
     * The data volume in bytes per day for the member account.
     * </p>
     * 
     * @return The data volume in bytes per day for the member account.
     */

    public Long getVolumeUsageInBytes() {
        return this.volumeUsageInBytes;
    }

    /**
     * <p>
     * The data volume in bytes per day for the member account.
     * </p>
     * 
     * @param volumeUsageInBytes
     *        The data volume in bytes per day for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withVolumeUsageInBytes(Long volumeUsageInBytes) {
        setVolumeUsageInBytes(volumeUsageInBytes);
        return this;
    }

    /**
     * <p>
     * The data and time when the member account data volume was last updated.
     * </p>
     * 
     * @param volumeUsageUpdatedTime
     *        The data and time when the member account data volume was last updated.
     */

    public void setVolumeUsageUpdatedTime(java.util.Date volumeUsageUpdatedTime) {
        this.volumeUsageUpdatedTime = volumeUsageUpdatedTime;
    }

    /**
     * <p>
     * The data and time when the member account data volume was last updated.
     * </p>
     * 
     * @return The data and time when the member account data volume was last updated.
     */

    public java.util.Date getVolumeUsageUpdatedTime() {
        return this.volumeUsageUpdatedTime;
    }

    /**
     * <p>
     * The data and time when the member account data volume was last updated.
     * </p>
     * 
     * @param volumeUsageUpdatedTime
     *        The data and time when the member account data volume was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withVolumeUsageUpdatedTime(java.util.Date volumeUsageUpdatedTime) {
        setVolumeUsageUpdatedTime(volumeUsageUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent, and 100
     * indicates 100 percent.
     * </p>
     * <p>
     * Note that this is not the percentage of the behavior graph data volume.
     * </p>
     * <p>
     * For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB per day.
     * If the data volume for the member account is 40 GB per day, then <code>PercentOfGraphUtilization</code> is 25. It
     * represents 25% of the maximum allowed data volume.
     * </p>
     * 
     * @param percentOfGraphUtilization
     *        The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent,
     *        and 100 indicates 100 percent.</p>
     *        <p>
     *        Note that this is not the percentage of the behavior graph data volume.
     *        </p>
     *        <p>
     *        For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB
     *        per day. If the data volume for the member account is 40 GB per day, then
     *        <code>PercentOfGraphUtilization</code> is 25. It represents 25% of the maximum allowed data volume.
     */
    @Deprecated
    public void setPercentOfGraphUtilization(Double percentOfGraphUtilization) {
        this.percentOfGraphUtilization = percentOfGraphUtilization;
    }

    /**
     * <p>
     * The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent, and 100
     * indicates 100 percent.
     * </p>
     * <p>
     * Note that this is not the percentage of the behavior graph data volume.
     * </p>
     * <p>
     * For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB per day.
     * If the data volume for the member account is 40 GB per day, then <code>PercentOfGraphUtilization</code> is 25. It
     * represents 25% of the maximum allowed data volume.
     * </p>
     * 
     * @return The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent,
     *         and 100 indicates 100 percent.</p>
     *         <p>
     *         Note that this is not the percentage of the behavior graph data volume.
     *         </p>
     *         <p>
     *         For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB
     *         per day. If the data volume for the member account is 40 GB per day, then
     *         <code>PercentOfGraphUtilization</code> is 25. It represents 25% of the maximum allowed data volume.
     */
    @Deprecated
    public Double getPercentOfGraphUtilization() {
        return this.percentOfGraphUtilization;
    }

    /**
     * <p>
     * The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent, and 100
     * indicates 100 percent.
     * </p>
     * <p>
     * Note that this is not the percentage of the behavior graph data volume.
     * </p>
     * <p>
     * For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB per day.
     * If the data volume for the member account is 40 GB per day, then <code>PercentOfGraphUtilization</code> is 25. It
     * represents 25% of the maximum allowed data volume.
     * </p>
     * 
     * @param percentOfGraphUtilization
     *        The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent,
     *        and 100 indicates 100 percent.</p>
     *        <p>
     *        Note that this is not the percentage of the behavior graph data volume.
     *        </p>
     *        <p>
     *        For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB
     *        per day. If the data volume for the member account is 40 GB per day, then
     *        <code>PercentOfGraphUtilization</code> is 25. It represents 25% of the maximum allowed data volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public MemberDetail withPercentOfGraphUtilization(Double percentOfGraphUtilization) {
        setPercentOfGraphUtilization(percentOfGraphUtilization);
        return this;
    }

    /**
     * <p>
     * The date and time when the graph utilization percentage was last updated.
     * </p>
     * 
     * @param percentOfGraphUtilizationUpdatedTime
     *        The date and time when the graph utilization percentage was last updated.
     */
    @Deprecated
    public void setPercentOfGraphUtilizationUpdatedTime(java.util.Date percentOfGraphUtilizationUpdatedTime) {
        this.percentOfGraphUtilizationUpdatedTime = percentOfGraphUtilizationUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the graph utilization percentage was last updated.
     * </p>
     * 
     * @return The date and time when the graph utilization percentage was last updated.
     */
    @Deprecated
    public java.util.Date getPercentOfGraphUtilizationUpdatedTime() {
        return this.percentOfGraphUtilizationUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the graph utilization percentage was last updated.
     * </p>
     * 
     * @param percentOfGraphUtilizationUpdatedTime
     *        The date and time when the graph utilization percentage was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public MemberDetail withPercentOfGraphUtilizationUpdatedTime(java.util.Date percentOfGraphUtilizationUpdatedTime) {
        setPercentOfGraphUtilizationUpdatedTime(percentOfGraphUtilizationUpdatedTime);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getMasterId() != null)
            sb.append("MasterId: ").append(getMasterId()).append(",");
        if (getAdministratorId() != null)
            sb.append("AdministratorId: ").append(getAdministratorId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDisabledReason() != null)
            sb.append("DisabledReason: ").append(getDisabledReason()).append(",");
        if (getInvitedTime() != null)
            sb.append("InvitedTime: ").append(getInvitedTime()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime()).append(",");
        if (getVolumeUsageInBytes() != null)
            sb.append("VolumeUsageInBytes: ").append(getVolumeUsageInBytes()).append(",");
        if (getVolumeUsageUpdatedTime() != null)
            sb.append("VolumeUsageUpdatedTime: ").append(getVolumeUsageUpdatedTime()).append(",");
        if (getPercentOfGraphUtilization() != null)
            sb.append("PercentOfGraphUtilization: ").append(getPercentOfGraphUtilization()).append(",");
        if (getPercentOfGraphUtilizationUpdatedTime() != null)
            sb.append("PercentOfGraphUtilizationUpdatedTime: ").append(getPercentOfGraphUtilizationUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberDetail == false)
            return false;
        MemberDetail other = (MemberDetail) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
            return false;
        if (other.getAdministratorId() == null ^ this.getAdministratorId() == null)
            return false;
        if (other.getAdministratorId() != null && other.getAdministratorId().equals(this.getAdministratorId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDisabledReason() == null ^ this.getDisabledReason() == null)
            return false;
        if (other.getDisabledReason() != null && other.getDisabledReason().equals(this.getDisabledReason()) == false)
            return false;
        if (other.getInvitedTime() == null ^ this.getInvitedTime() == null)
            return false;
        if (other.getInvitedTime() != null && other.getInvitedTime().equals(this.getInvitedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        if (other.getVolumeUsageInBytes() == null ^ this.getVolumeUsageInBytes() == null)
            return false;
        if (other.getVolumeUsageInBytes() != null && other.getVolumeUsageInBytes().equals(this.getVolumeUsageInBytes()) == false)
            return false;
        if (other.getVolumeUsageUpdatedTime() == null ^ this.getVolumeUsageUpdatedTime() == null)
            return false;
        if (other.getVolumeUsageUpdatedTime() != null && other.getVolumeUsageUpdatedTime().equals(this.getVolumeUsageUpdatedTime()) == false)
            return false;
        if (other.getPercentOfGraphUtilization() == null ^ this.getPercentOfGraphUtilization() == null)
            return false;
        if (other.getPercentOfGraphUtilization() != null && other.getPercentOfGraphUtilization().equals(this.getPercentOfGraphUtilization()) == false)
            return false;
        if (other.getPercentOfGraphUtilizationUpdatedTime() == null ^ this.getPercentOfGraphUtilizationUpdatedTime() == null)
            return false;
        if (other.getPercentOfGraphUtilizationUpdatedTime() != null
                && other.getPercentOfGraphUtilizationUpdatedTime().equals(this.getPercentOfGraphUtilizationUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        hashCode = prime * hashCode + ((getAdministratorId() == null) ? 0 : getAdministratorId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDisabledReason() == null) ? 0 : getDisabledReason().hashCode());
        hashCode = prime * hashCode + ((getInvitedTime() == null) ? 0 : getInvitedTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getVolumeUsageInBytes() == null) ? 0 : getVolumeUsageInBytes().hashCode());
        hashCode = prime * hashCode + ((getVolumeUsageUpdatedTime() == null) ? 0 : getVolumeUsageUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getPercentOfGraphUtilization() == null) ? 0 : getPercentOfGraphUtilization().hashCode());
        hashCode = prime * hashCode + ((getPercentOfGraphUtilizationUpdatedTime() == null) ? 0 : getPercentOfGraphUtilizationUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public MemberDetail clone() {
        try {
            return (MemberDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.MemberDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
