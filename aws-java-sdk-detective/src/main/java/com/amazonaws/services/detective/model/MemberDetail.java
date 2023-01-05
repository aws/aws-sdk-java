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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a member account in a behavior graph.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/MemberDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account identifier for the member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Web Services account root user email address for the member account.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The Amazon Web Services account identifier of the administrator account for the behavior graph.
     * </p>
     */
    @Deprecated
    private String masterId;
    /**
     * <p>
     * The Amazon Web Services account identifier of the administrator account for the behavior graph.
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
     * <code>INVITED</code> - For invited accounts only. Indicates that the member was sent an invitation but has not
     * yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - For invited accounts only, indicates that Detective is verifying that the
     * account identifier and email address provided for the member account match. If they do match, then Detective
     * sends the invitation. If the email address and account identifier don't match, then the member cannot be added to
     * the behavior graph.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, indicates that Detective is verifying that the
     * account belongs to the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - For invited accounts only. Indicates that the account and email address
     * provided for the member account do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account currently contributes data to the behavior graph. For
     * invited accounts, the member account accepted the invitation. For organization accounts in the organization
     * behavior graph, the Detective administrator account enabled the organization account as a member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - The account accepted the invitation, or was enabled by the Detective
     * administrator account, but is prevented from contributing data to the behavior graph. <code>DisabledReason</code>
     * provides the reason why the member account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Invited accounts that declined an invitation or that were removed from the behavior graph are not included. In
     * the organization behavior graph, organization accounts that the Detective administrator account did not enable
     * are not included.
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
     * For invited accounts, the date and time that Detective sent the invitation to the account. The value is an
     * ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date invitedTime;
    /**
     * <p>
     * The date and time that the member account was last updated. The value is an ISO8601 formatted string. For
     * example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date updatedTime;
    /**
     * <p>
     * The data volume in bytes per day for the member account.
     * </p>
     */
    @Deprecated
    private Long volumeUsageInBytes;
    /**
     * <p>
     * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    @Deprecated
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
     * The date and time when the graph utilization percentage was last updated. The value is an ISO8601 formatted
     * string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    @Deprecated
    private java.util.Date percentOfGraphUtilizationUpdatedTime;
    /**
     * <p>
     * The type of behavior graph membership.
     * </p>
     * <p>
     * For an organization account in the organization behavior graph, the type is <code>ORGANIZATION</code>.
     * </p>
     * <p>
     * For an account that was invited to a behavior graph, the type is <code>INVITATION</code>.
     * </p>
     */
    private String invitationType;
    /**
     * <p>
     * Details on the volume of usage for each data source package in a behavior graph.
     * </p>
     */
    private java.util.Map<String, DatasourcePackageUsageInfo> volumeUsageByDatasourcePackage;
    /**
     * <p>
     * The state of a data source package for the behavior graph.
     * </p>
     */
    private java.util.Map<String, String> datasourcePackageIngestStates;

    /**
     * <p>
     * The Amazon Web Services account identifier for the member account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account identifier for the member account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier for the member account.
     * </p>
     * 
     * @return The Amazon Web Services account identifier for the member account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier for the member account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account identifier for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account root user email address for the member account.
     * </p>
     * 
     * @param emailAddress
     *        The Amazon Web Services account root user email address for the member account.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The Amazon Web Services account root user email address for the member account.
     * </p>
     * 
     * @return The Amazon Web Services account root user email address for the member account.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The Amazon Web Services account root user email address for the member account.
     * </p>
     * 
     * @param emailAddress
     *        The Amazon Web Services account root user email address for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @return The ARN of the behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @param masterId
     *        The Amazon Web Services account identifier of the administrator account for the behavior graph.
     */
    @Deprecated
    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @return The Amazon Web Services account identifier of the administrator account for the behavior graph.
     */
    @Deprecated
    public String getMasterId() {
        return this.masterId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @param masterId
     *        The Amazon Web Services account identifier of the administrator account for the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public MemberDetail withMasterId(String masterId) {
        setMasterId(masterId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @param administratorId
     *        The Amazon Web Services account identifier of the administrator account for the behavior graph.
     */

    public void setAdministratorId(String administratorId) {
        this.administratorId = administratorId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @return The Amazon Web Services account identifier of the administrator account for the behavior graph.
     */

    public String getAdministratorId() {
        return this.administratorId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the administrator account for the behavior graph.
     * </p>
     * 
     * @param administratorId
     *        The Amazon Web Services account identifier of the administrator account for the behavior graph.
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
     * <code>INVITED</code> - For invited accounts only. Indicates that the member was sent an invitation but has not
     * yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - For invited accounts only, indicates that Detective is verifying that the
     * account identifier and email address provided for the member account match. If they do match, then Detective
     * sends the invitation. If the email address and account identifier don't match, then the member cannot be added to
     * the behavior graph.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, indicates that Detective is verifying that the
     * account belongs to the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - For invited accounts only. Indicates that the account and email address
     * provided for the member account do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account currently contributes data to the behavior graph. For
     * invited accounts, the member account accepted the invitation. For organization accounts in the organization
     * behavior graph, the Detective administrator account enabled the organization account as a member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - The account accepted the invitation, or was enabled by the Detective
     * administrator account, but is prevented from contributing data to the behavior graph. <code>DisabledReason</code>
     * provides the reason why the member account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Invited accounts that declined an invitation or that were removed from the behavior graph are not included. In
     * the organization behavior graph, organization accounts that the Detective administrator account did not enable
     * are not included.
     * </p>
     * 
     * @param status
     *        The current membership status of the member account. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - For invited accounts only. Indicates that the member was sent an invitation but has
     *        not yet responded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_IN_PROGRESS</code> - For invited accounts only, indicates that Detective is verifying
     *        that the account identifier and email address provided for the member account match. If they do match,
     *        then Detective sends the invitation. If the email address and account identifier don't match, then the
     *        member cannot be added to the behavior graph.
     *        </p>
     *        <p>
     *        For organization accounts in the organization behavior graph, indicates that Detective is verifying that
     *        the account belongs to the organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_FAILED</code> - For invited accounts only. Indicates that the account and email address
     *        provided for the member account do not match, and Detective did not send an invitation to the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account currently contributes data to the behavior graph.
     *        For invited accounts, the member account accepted the invitation. For organization accounts in the
     *        organization behavior graph, the Detective administrator account enabled the organization account as a
     *        member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTED_BUT_DISABLED</code> - The account accepted the invitation, or was enabled by the Detective
     *        administrator account, but is prevented from contributing data to the behavior graph.
     *        <code>DisabledReason</code> provides the reason why the member account is not enabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Invited accounts that declined an invitation or that were removed from the behavior graph are not
     *        included. In the organization behavior graph, organization accounts that the Detective administrator
     *        account did not enable are not included.
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
     * <code>INVITED</code> - For invited accounts only. Indicates that the member was sent an invitation but has not
     * yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - For invited accounts only, indicates that Detective is verifying that the
     * account identifier and email address provided for the member account match. If they do match, then Detective
     * sends the invitation. If the email address and account identifier don't match, then the member cannot be added to
     * the behavior graph.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, indicates that Detective is verifying that the
     * account belongs to the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - For invited accounts only. Indicates that the account and email address
     * provided for the member account do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account currently contributes data to the behavior graph. For
     * invited accounts, the member account accepted the invitation. For organization accounts in the organization
     * behavior graph, the Detective administrator account enabled the organization account as a member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - The account accepted the invitation, or was enabled by the Detective
     * administrator account, but is prevented from contributing data to the behavior graph. <code>DisabledReason</code>
     * provides the reason why the member account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Invited accounts that declined an invitation or that were removed from the behavior graph are not included. In
     * the organization behavior graph, organization accounts that the Detective administrator account did not enable
     * are not included.
     * </p>
     * 
     * @return The current membership status of the member account. The status can have one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INVITED</code> - For invited accounts only. Indicates that the member was sent an invitation but
     *         has not yet responded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VERIFICATION_IN_PROGRESS</code> - For invited accounts only, indicates that Detective is verifying
     *         that the account identifier and email address provided for the member account match. If they do match,
     *         then Detective sends the invitation. If the email address and account identifier don't match, then the
     *         member cannot be added to the behavior graph.
     *         </p>
     *         <p>
     *         For organization accounts in the organization behavior graph, indicates that Detective is verifying that
     *         the account belongs to the organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VERIFICATION_FAILED</code> - For invited accounts only. Indicates that the account and email
     *         address provided for the member account do not match, and Detective did not send an invitation to the
     *         account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Indicates that the member account currently contributes data to the behavior
     *         graph. For invited accounts, the member account accepted the invitation. For organization accounts in the
     *         organization behavior graph, the Detective administrator account enabled the organization account as a
     *         member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCEPTED_BUT_DISABLED</code> - The account accepted the invitation, or was enabled by the Detective
     *         administrator account, but is prevented from contributing data to the behavior graph.
     *         <code>DisabledReason</code> provides the reason why the member account is not enabled.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Invited accounts that declined an invitation or that were removed from the behavior graph are not
     *         included. In the organization behavior graph, organization accounts that the Detective administrator
     *         account did not enable are not included.
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
     * <code>INVITED</code> - For invited accounts only. Indicates that the member was sent an invitation but has not
     * yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - For invited accounts only, indicates that Detective is verifying that the
     * account identifier and email address provided for the member account match. If they do match, then Detective
     * sends the invitation. If the email address and account identifier don't match, then the member cannot be added to
     * the behavior graph.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, indicates that Detective is verifying that the
     * account belongs to the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - For invited accounts only. Indicates that the account and email address
     * provided for the member account do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account currently contributes data to the behavior graph. For
     * invited accounts, the member account accepted the invitation. For organization accounts in the organization
     * behavior graph, the Detective administrator account enabled the organization account as a member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - The account accepted the invitation, or was enabled by the Detective
     * administrator account, but is prevented from contributing data to the behavior graph. <code>DisabledReason</code>
     * provides the reason why the member account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Invited accounts that declined an invitation or that were removed from the behavior graph are not included. In
     * the organization behavior graph, organization accounts that the Detective administrator account did not enable
     * are not included.
     * </p>
     * 
     * @param status
     *        The current membership status of the member account. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - For invited accounts only. Indicates that the member was sent an invitation but has
     *        not yet responded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_IN_PROGRESS</code> - For invited accounts only, indicates that Detective is verifying
     *        that the account identifier and email address provided for the member account match. If they do match,
     *        then Detective sends the invitation. If the email address and account identifier don't match, then the
     *        member cannot be added to the behavior graph.
     *        </p>
     *        <p>
     *        For organization accounts in the organization behavior graph, indicates that Detective is verifying that
     *        the account belongs to the organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_FAILED</code> - For invited accounts only. Indicates that the account and email address
     *        provided for the member account do not match, and Detective did not send an invitation to the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account currently contributes data to the behavior graph.
     *        For invited accounts, the member account accepted the invitation. For organization accounts in the
     *        organization behavior graph, the Detective administrator account enabled the organization account as a
     *        member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTED_BUT_DISABLED</code> - The account accepted the invitation, or was enabled by the Detective
     *        administrator account, but is prevented from contributing data to the behavior graph.
     *        <code>DisabledReason</code> provides the reason why the member account is not enabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Invited accounts that declined an invitation or that were removed from the behavior graph are not
     *        included. In the organization behavior graph, organization accounts that the Detective administrator
     *        account did not enable are not included.
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
     * <code>INVITED</code> - For invited accounts only. Indicates that the member was sent an invitation but has not
     * yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - For invited accounts only, indicates that Detective is verifying that the
     * account identifier and email address provided for the member account match. If they do match, then Detective
     * sends the invitation. If the email address and account identifier don't match, then the member cannot be added to
     * the behavior graph.
     * </p>
     * <p>
     * For organization accounts in the organization behavior graph, indicates that Detective is verifying that the
     * account belongs to the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - For invited accounts only. Indicates that the account and email address
     * provided for the member account do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account currently contributes data to the behavior graph. For
     * invited accounts, the member account accepted the invitation. For organization accounts in the organization
     * behavior graph, the Detective administrator account enabled the organization account as a member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED_BUT_DISABLED</code> - The account accepted the invitation, or was enabled by the Detective
     * administrator account, but is prevented from contributing data to the behavior graph. <code>DisabledReason</code>
     * provides the reason why the member account is not enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Invited accounts that declined an invitation or that were removed from the behavior graph are not included. In
     * the organization behavior graph, organization accounts that the Detective administrator account did not enable
     * are not included.
     * </p>
     * 
     * @param status
     *        The current membership status of the member account. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - For invited accounts only. Indicates that the member was sent an invitation but has
     *        not yet responded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_IN_PROGRESS</code> - For invited accounts only, indicates that Detective is verifying
     *        that the account identifier and email address provided for the member account match. If they do match,
     *        then Detective sends the invitation. If the email address and account identifier don't match, then the
     *        member cannot be added to the behavior graph.
     *        </p>
     *        <p>
     *        For organization accounts in the organization behavior graph, indicates that Detective is verifying that
     *        the account belongs to the organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_FAILED</code> - For invited accounts only. Indicates that the account and email address
     *        provided for the member account do not match, and Detective did not send an invitation to the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account currently contributes data to the behavior graph.
     *        For invited accounts, the member account accepted the invitation. For organization accounts in the
     *        organization behavior graph, the Detective administrator account enabled the organization account as a
     *        member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTED_BUT_DISABLED</code> - The account accepted the invitation, or was enabled by the Detective
     *        administrator account, but is prevented from contributing data to the behavior graph.
     *        <code>DisabledReason</code> provides the reason why the member account is not enabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Invited accounts that declined an invitation or that were removed from the behavior graph are not
     *        included. In the organization behavior graph, organization accounts that the Detective administrator
     *        account did not enable are not included.
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
     * For invited accounts, the date and time that Detective sent the invitation to the account. The value is an
     * ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param invitedTime
     *        For invited accounts, the date and time that Detective sent the invitation to the account. The value is an
     *        ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setInvitedTime(java.util.Date invitedTime) {
        this.invitedTime = invitedTime;
    }

    /**
     * <p>
     * For invited accounts, the date and time that Detective sent the invitation to the account. The value is an
     * ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return For invited accounts, the date and time that Detective sent the invitation to the account. The value is
     *         an ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getInvitedTime() {
        return this.invitedTime;
    }

    /**
     * <p>
     * For invited accounts, the date and time that Detective sent the invitation to the account. The value is an
     * ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param invitedTime
     *        For invited accounts, the date and time that Detective sent the invitation to the account. The value is an
     *        ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withInvitedTime(java.util.Date invitedTime) {
        setInvitedTime(invitedTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the member account was last updated. The value is an ISO8601 formatted string. For
     * example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that the member account was last updated. The value is an ISO8601 formatted string. For
     *        example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The date and time that the member account was last updated. The value is an ISO8601 formatted string. For
     * example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The date and time that the member account was last updated. The value is an ISO8601 formatted string. For
     *         example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The date and time that the member account was last updated. The value is an ISO8601 formatted string. For
     * example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that the member account was last updated. The value is an ISO8601 formatted string. For
     *        example, <code>2021-08-18T16:35:56.284Z</code>.
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
    @Deprecated
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
    @Deprecated
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
    @Deprecated
    public MemberDetail withVolumeUsageInBytes(Long volumeUsageInBytes) {
        setVolumeUsageInBytes(volumeUsageInBytes);
        return this;
    }

    /**
     * <p>
     * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param volumeUsageUpdatedTime
     *        The data and time when the member account data volume was last updated. The value is an ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */
    @Deprecated
    public void setVolumeUsageUpdatedTime(java.util.Date volumeUsageUpdatedTime) {
        this.volumeUsageUpdatedTime = volumeUsageUpdatedTime;
    }

    /**
     * <p>
     * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The data and time when the member account data volume was last updated. The value is an ISO8601 formatted
     *         string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */
    @Deprecated
    public java.util.Date getVolumeUsageUpdatedTime() {
        return this.volumeUsageUpdatedTime;
    }

    /**
     * <p>
     * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param volumeUsageUpdatedTime
     *        The data and time when the member account data volume was last updated. The value is an ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
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
     * The date and time when the graph utilization percentage was last updated. The value is an ISO8601 formatted
     * string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param percentOfGraphUtilizationUpdatedTime
     *        The date and time when the graph utilization percentage was last updated. The value is an ISO8601
     *        formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */
    @Deprecated
    public void setPercentOfGraphUtilizationUpdatedTime(java.util.Date percentOfGraphUtilizationUpdatedTime) {
        this.percentOfGraphUtilizationUpdatedTime = percentOfGraphUtilizationUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the graph utilization percentage was last updated. The value is an ISO8601 formatted
     * string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The date and time when the graph utilization percentage was last updated. The value is an ISO8601
     *         formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */
    @Deprecated
    public java.util.Date getPercentOfGraphUtilizationUpdatedTime() {
        return this.percentOfGraphUtilizationUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the graph utilization percentage was last updated. The value is an ISO8601 formatted
     * string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param percentOfGraphUtilizationUpdatedTime
     *        The date and time when the graph utilization percentage was last updated. The value is an ISO8601
     *        formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public MemberDetail withPercentOfGraphUtilizationUpdatedTime(java.util.Date percentOfGraphUtilizationUpdatedTime) {
        setPercentOfGraphUtilizationUpdatedTime(percentOfGraphUtilizationUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The type of behavior graph membership.
     * </p>
     * <p>
     * For an organization account in the organization behavior graph, the type is <code>ORGANIZATION</code>.
     * </p>
     * <p>
     * For an account that was invited to a behavior graph, the type is <code>INVITATION</code>.
     * </p>
     * 
     * @param invitationType
     *        The type of behavior graph membership.</p>
     *        <p>
     *        For an organization account in the organization behavior graph, the type is <code>ORGANIZATION</code>.
     *        </p>
     *        <p>
     *        For an account that was invited to a behavior graph, the type is <code>INVITATION</code>.
     * @see InvitationType
     */

    public void setInvitationType(String invitationType) {
        this.invitationType = invitationType;
    }

    /**
     * <p>
     * The type of behavior graph membership.
     * </p>
     * <p>
     * For an organization account in the organization behavior graph, the type is <code>ORGANIZATION</code>.
     * </p>
     * <p>
     * For an account that was invited to a behavior graph, the type is <code>INVITATION</code>.
     * </p>
     * 
     * @return The type of behavior graph membership.</p>
     *         <p>
     *         For an organization account in the organization behavior graph, the type is <code>ORGANIZATION</code>.
     *         </p>
     *         <p>
     *         For an account that was invited to a behavior graph, the type is <code>INVITATION</code>.
     * @see InvitationType
     */

    public String getInvitationType() {
        return this.invitationType;
    }

    /**
     * <p>
     * The type of behavior graph membership.
     * </p>
     * <p>
     * For an organization account in the organization behavior graph, the type is <code>ORGANIZATION</code>.
     * </p>
     * <p>
     * For an account that was invited to a behavior graph, the type is <code>INVITATION</code>.
     * </p>
     * 
     * @param invitationType
     *        The type of behavior graph membership.</p>
     *        <p>
     *        For an organization account in the organization behavior graph, the type is <code>ORGANIZATION</code>.
     *        </p>
     *        <p>
     *        For an account that was invited to a behavior graph, the type is <code>INVITATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvitationType
     */

    public MemberDetail withInvitationType(String invitationType) {
        setInvitationType(invitationType);
        return this;
    }

    /**
     * <p>
     * The type of behavior graph membership.
     * </p>
     * <p>
     * For an organization account in the organization behavior graph, the type is <code>ORGANIZATION</code>.
     * </p>
     * <p>
     * For an account that was invited to a behavior graph, the type is <code>INVITATION</code>.
     * </p>
     * 
     * @param invitationType
     *        The type of behavior graph membership.</p>
     *        <p>
     *        For an organization account in the organization behavior graph, the type is <code>ORGANIZATION</code>.
     *        </p>
     *        <p>
     *        For an account that was invited to a behavior graph, the type is <code>INVITATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvitationType
     */

    public MemberDetail withInvitationType(InvitationType invitationType) {
        this.invitationType = invitationType.toString();
        return this;
    }

    /**
     * <p>
     * Details on the volume of usage for each data source package in a behavior graph.
     * </p>
     * 
     * @return Details on the volume of usage for each data source package in a behavior graph.
     */

    public java.util.Map<String, DatasourcePackageUsageInfo> getVolumeUsageByDatasourcePackage() {
        return volumeUsageByDatasourcePackage;
    }

    /**
     * <p>
     * Details on the volume of usage for each data source package in a behavior graph.
     * </p>
     * 
     * @param volumeUsageByDatasourcePackage
     *        Details on the volume of usage for each data source package in a behavior graph.
     */

    public void setVolumeUsageByDatasourcePackage(java.util.Map<String, DatasourcePackageUsageInfo> volumeUsageByDatasourcePackage) {
        this.volumeUsageByDatasourcePackage = volumeUsageByDatasourcePackage;
    }

    /**
     * <p>
     * Details on the volume of usage for each data source package in a behavior graph.
     * </p>
     * 
     * @param volumeUsageByDatasourcePackage
     *        Details on the volume of usage for each data source package in a behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withVolumeUsageByDatasourcePackage(java.util.Map<String, DatasourcePackageUsageInfo> volumeUsageByDatasourcePackage) {
        setVolumeUsageByDatasourcePackage(volumeUsageByDatasourcePackage);
        return this;
    }

    /**
     * Add a single VolumeUsageByDatasourcePackage entry
     *
     * @see MemberDetail#withVolumeUsageByDatasourcePackage
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail addVolumeUsageByDatasourcePackageEntry(String key, DatasourcePackageUsageInfo value) {
        if (null == this.volumeUsageByDatasourcePackage) {
            this.volumeUsageByDatasourcePackage = new java.util.HashMap<String, DatasourcePackageUsageInfo>();
        }
        if (this.volumeUsageByDatasourcePackage.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.volumeUsageByDatasourcePackage.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VolumeUsageByDatasourcePackage.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail clearVolumeUsageByDatasourcePackageEntries() {
        this.volumeUsageByDatasourcePackage = null;
        return this;
    }

    /**
     * <p>
     * The state of a data source package for the behavior graph.
     * </p>
     * 
     * @return The state of a data source package for the behavior graph.
     */

    public java.util.Map<String, String> getDatasourcePackageIngestStates() {
        return datasourcePackageIngestStates;
    }

    /**
     * <p>
     * The state of a data source package for the behavior graph.
     * </p>
     * 
     * @param datasourcePackageIngestStates
     *        The state of a data source package for the behavior graph.
     */

    public void setDatasourcePackageIngestStates(java.util.Map<String, String> datasourcePackageIngestStates) {
        this.datasourcePackageIngestStates = datasourcePackageIngestStates;
    }

    /**
     * <p>
     * The state of a data source package for the behavior graph.
     * </p>
     * 
     * @param datasourcePackageIngestStates
     *        The state of a data source package for the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withDatasourcePackageIngestStates(java.util.Map<String, String> datasourcePackageIngestStates) {
        setDatasourcePackageIngestStates(datasourcePackageIngestStates);
        return this;
    }

    /**
     * Add a single DatasourcePackageIngestStates entry
     *
     * @see MemberDetail#withDatasourcePackageIngestStates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail addDatasourcePackageIngestStatesEntry(String key, String value) {
        if (null == this.datasourcePackageIngestStates) {
            this.datasourcePackageIngestStates = new java.util.HashMap<String, String>();
        }
        if (this.datasourcePackageIngestStates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.datasourcePackageIngestStates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DatasourcePackageIngestStates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail clearDatasourcePackageIngestStatesEntries() {
        this.datasourcePackageIngestStates = null;
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
            sb.append("PercentOfGraphUtilizationUpdatedTime: ").append(getPercentOfGraphUtilizationUpdatedTime()).append(",");
        if (getInvitationType() != null)
            sb.append("InvitationType: ").append(getInvitationType()).append(",");
        if (getVolumeUsageByDatasourcePackage() != null)
            sb.append("VolumeUsageByDatasourcePackage: ").append(getVolumeUsageByDatasourcePackage()).append(",");
        if (getDatasourcePackageIngestStates() != null)
            sb.append("DatasourcePackageIngestStates: ").append(getDatasourcePackageIngestStates());
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
        if (other.getInvitationType() == null ^ this.getInvitationType() == null)
            return false;
        if (other.getInvitationType() != null && other.getInvitationType().equals(this.getInvitationType()) == false)
            return false;
        if (other.getVolumeUsageByDatasourcePackage() == null ^ this.getVolumeUsageByDatasourcePackage() == null)
            return false;
        if (other.getVolumeUsageByDatasourcePackage() != null
                && other.getVolumeUsageByDatasourcePackage().equals(this.getVolumeUsageByDatasourcePackage()) == false)
            return false;
        if (other.getDatasourcePackageIngestStates() == null ^ this.getDatasourcePackageIngestStates() == null)
            return false;
        if (other.getDatasourcePackageIngestStates() != null
                && other.getDatasourcePackageIngestStates().equals(this.getDatasourcePackageIngestStates()) == false)
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
        hashCode = prime * hashCode + ((getInvitationType() == null) ? 0 : getInvitationType().hashCode());
        hashCode = prime * hashCode + ((getVolumeUsageByDatasourcePackage() == null) ? 0 : getVolumeUsageByDatasourcePackage().hashCode());
        hashCode = prime * hashCode + ((getDatasourcePackageIngestStates() == null) ? 0 : getDatasourcePackageIngestStates().hashCode());
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
