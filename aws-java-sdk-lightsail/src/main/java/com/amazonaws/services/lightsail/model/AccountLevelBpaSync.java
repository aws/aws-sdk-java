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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the synchronization status of the Amazon Simple Storage Service (Amazon S3) account-level block public
 * access (BPA) feature for your Lightsail buckets.
 * </p>
 * <p>
 * The account-level BPA feature of Amazon S3 provides centralized controls to limit public access to all Amazon S3
 * buckets in an account. BPA can make all Amazon S3 buckets in an Amazon Web Services account private regardless of the
 * individual bucket and object permissions that are configured. Lightsail buckets take into account the Amazon S3
 * account-level BPA configuration when allowing or denying public access. To do this, Lightsail periodically fetches
 * the account-level BPA configuration from Amazon S3. When the account-level BPA status is <code>InSync</code>, the
 * Amazon S3 account-level BPA configuration is synchronized and it applies to your Lightsail buckets. For more
 * information about Amazon Simple Storage Service account-level BPA and how it affects Lightsail buckets, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-block-public-access-for-buckets">Block
 * public access for buckets in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AccountLevelBpaSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountLevelBpaSync implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the account-level BPA synchronization.
     * </p>
     * <p>
     * The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InSync</code> - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration applies to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NeverSynced</code> - Synchronization has not yet happened. The Amazon S3 account-level BPA configuration
     * does not apply to your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Synchronization failed. The Amazon S3 account-level BPA configuration does not apply to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Defaulted</code> - Synchronization failed and account-level BPA for your Lightsail buckets is defaulted to
     * <i>active</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You might need to complete further actions if the status is <code>Failed</code> or <code>Defaulted</code>. The
     * <code>message</code> parameter provides more information for those statuses.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * The timestamp of when the account-level BPA configuration was last synchronized. This value is null when the
     * account-level BPA configuration has not been synchronized.
     * </p>
     */
    private java.util.Date lastSyncedAt;
    /**
     * <p>
     * A message that provides a reason for a <code>Failed</code> or <code>Defaulted</code> synchronization status.
     * </p>
     * <p>
     * The following messages are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC_ON_HOLD</code> - The synchronization has not yet happened. This status message occurs immediately
     * after you create your first Lightsail bucket. This status message should change after the first synchronization
     * happens, approximately 1 hour after the first bucket is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING</code> - The synchronization failed because the required service-linked role is
     * missing from your Amazon Web Services account. The account-level BPA configuration for your Lightsail buckets is
     * defaulted to <i>active</i> until the synchronization can occur. This means that all your buckets are private and
     * not publicly accessible. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING_ON_HOLD</code> - The synchronization failed because the required service-linked
     * role is missing from your Amazon Web Services account. Account-level BPA is not yet configured for your Lightsail
     * buckets. Therefore, only the bucket access permissions and individual object access permissions apply to your
     * Lightsail buckets. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code> - The reason that synchronization failed is unknown. Contact Amazon Web Services Support for
     * more information.
     * </p>
     * </li>
     * </ul>
     */
    private String message;
    /**
     * <p>
     * A Boolean value that indicates whether account-level block public access is affecting your Lightsail buckets.
     * </p>
     */
    private Boolean bpaImpactsLightsail;

    /**
     * <p>
     * The status of the account-level BPA synchronization.
     * </p>
     * <p>
     * The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InSync</code> - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration applies to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NeverSynced</code> - Synchronization has not yet happened. The Amazon S3 account-level BPA configuration
     * does not apply to your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Synchronization failed. The Amazon S3 account-level BPA configuration does not apply to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Defaulted</code> - Synchronization failed and account-level BPA for your Lightsail buckets is defaulted to
     * <i>active</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You might need to complete further actions if the status is <code>Failed</code> or <code>Defaulted</code>. The
     * <code>message</code> parameter provides more information for those statuses.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the account-level BPA synchronization.</p>
     *        <p>
     *        The following statuses are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InSync</code> - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration
     *        applies to your Lightsail buckets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NeverSynced</code> - Synchronization has not yet happened. The Amazon S3 account-level BPA
     *        configuration does not apply to your Lightsail buckets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - Synchronization failed. The Amazon S3 account-level BPA configuration does not apply
     *        to your Lightsail buckets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Defaulted</code> - Synchronization failed and account-level BPA for your Lightsail buckets is
     *        defaulted to <i>active</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You might need to complete further actions if the status is <code>Failed</code> or <code>Defaulted</code>.
     *        The <code>message</code> parameter provides more information for those statuses.
     *        </p>
     * @see AccountLevelBpaSyncStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the account-level BPA synchronization.
     * </p>
     * <p>
     * The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InSync</code> - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration applies to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NeverSynced</code> - Synchronization has not yet happened. The Amazon S3 account-level BPA configuration
     * does not apply to your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Synchronization failed. The Amazon S3 account-level BPA configuration does not apply to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Defaulted</code> - Synchronization failed and account-level BPA for your Lightsail buckets is defaulted to
     * <i>active</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You might need to complete further actions if the status is <code>Failed</code> or <code>Defaulted</code>. The
     * <code>message</code> parameter provides more information for those statuses.
     * </p>
     * </note>
     * 
     * @return The status of the account-level BPA synchronization.</p>
     *         <p>
     *         The following statuses are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>InSync</code> - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration
     *         applies to your Lightsail buckets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NeverSynced</code> - Synchronization has not yet happened. The Amazon S3 account-level BPA
     *         configuration does not apply to your Lightsail buckets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - Synchronization failed. The Amazon S3 account-level BPA configuration does not
     *         apply to your Lightsail buckets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Defaulted</code> - Synchronization failed and account-level BPA for your Lightsail buckets is
     *         defaulted to <i>active</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         You might need to complete further actions if the status is <code>Failed</code> or <code>Defaulted</code>
     *         . The <code>message</code> parameter provides more information for those statuses.
     *         </p>
     * @see AccountLevelBpaSyncStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the account-level BPA synchronization.
     * </p>
     * <p>
     * The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InSync</code> - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration applies to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NeverSynced</code> - Synchronization has not yet happened. The Amazon S3 account-level BPA configuration
     * does not apply to your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Synchronization failed. The Amazon S3 account-level BPA configuration does not apply to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Defaulted</code> - Synchronization failed and account-level BPA for your Lightsail buckets is defaulted to
     * <i>active</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You might need to complete further actions if the status is <code>Failed</code> or <code>Defaulted</code>. The
     * <code>message</code> parameter provides more information for those statuses.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the account-level BPA synchronization.</p>
     *        <p>
     *        The following statuses are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InSync</code> - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration
     *        applies to your Lightsail buckets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NeverSynced</code> - Synchronization has not yet happened. The Amazon S3 account-level BPA
     *        configuration does not apply to your Lightsail buckets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - Synchronization failed. The Amazon S3 account-level BPA configuration does not apply
     *        to your Lightsail buckets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Defaulted</code> - Synchronization failed and account-level BPA for your Lightsail buckets is
     *        defaulted to <i>active</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You might need to complete further actions if the status is <code>Failed</code> or <code>Defaulted</code>.
     *        The <code>message</code> parameter provides more information for those statuses.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLevelBpaSyncStatus
     */

    public AccountLevelBpaSync withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the account-level BPA synchronization.
     * </p>
     * <p>
     * The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InSync</code> - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration applies to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NeverSynced</code> - Synchronization has not yet happened. The Amazon S3 account-level BPA configuration
     * does not apply to your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Synchronization failed. The Amazon S3 account-level BPA configuration does not apply to
     * your Lightsail buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Defaulted</code> - Synchronization failed and account-level BPA for your Lightsail buckets is defaulted to
     * <i>active</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You might need to complete further actions if the status is <code>Failed</code> or <code>Defaulted</code>. The
     * <code>message</code> parameter provides more information for those statuses.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the account-level BPA synchronization.</p>
     *        <p>
     *        The following statuses are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InSync</code> - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration
     *        applies to your Lightsail buckets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NeverSynced</code> - Synchronization has not yet happened. The Amazon S3 account-level BPA
     *        configuration does not apply to your Lightsail buckets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - Synchronization failed. The Amazon S3 account-level BPA configuration does not apply
     *        to your Lightsail buckets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Defaulted</code> - Synchronization failed and account-level BPA for your Lightsail buckets is
     *        defaulted to <i>active</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You might need to complete further actions if the status is <code>Failed</code> or <code>Defaulted</code>.
     *        The <code>message</code> parameter provides more information for those statuses.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLevelBpaSyncStatus
     */

    public AccountLevelBpaSync withStatus(AccountLevelBpaSyncStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the account-level BPA configuration was last synchronized. This value is null when the
     * account-level BPA configuration has not been synchronized.
     * </p>
     * 
     * @param lastSyncedAt
     *        The timestamp of when the account-level BPA configuration was last synchronized. This value is null when
     *        the account-level BPA configuration has not been synchronized.
     */

    public void setLastSyncedAt(java.util.Date lastSyncedAt) {
        this.lastSyncedAt = lastSyncedAt;
    }

    /**
     * <p>
     * The timestamp of when the account-level BPA configuration was last synchronized. This value is null when the
     * account-level BPA configuration has not been synchronized.
     * </p>
     * 
     * @return The timestamp of when the account-level BPA configuration was last synchronized. This value is null when
     *         the account-level BPA configuration has not been synchronized.
     */

    public java.util.Date getLastSyncedAt() {
        return this.lastSyncedAt;
    }

    /**
     * <p>
     * The timestamp of when the account-level BPA configuration was last synchronized. This value is null when the
     * account-level BPA configuration has not been synchronized.
     * </p>
     * 
     * @param lastSyncedAt
     *        The timestamp of when the account-level BPA configuration was last synchronized. This value is null when
     *        the account-level BPA configuration has not been synchronized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLevelBpaSync withLastSyncedAt(java.util.Date lastSyncedAt) {
        setLastSyncedAt(lastSyncedAt);
        return this;
    }

    /**
     * <p>
     * A message that provides a reason for a <code>Failed</code> or <code>Defaulted</code> synchronization status.
     * </p>
     * <p>
     * The following messages are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC_ON_HOLD</code> - The synchronization has not yet happened. This status message occurs immediately
     * after you create your first Lightsail bucket. This status message should change after the first synchronization
     * happens, approximately 1 hour after the first bucket is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING</code> - The synchronization failed because the required service-linked role is
     * missing from your Amazon Web Services account. The account-level BPA configuration for your Lightsail buckets is
     * defaulted to <i>active</i> until the synchronization can occur. This means that all your buckets are private and
     * not publicly accessible. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING_ON_HOLD</code> - The synchronization failed because the required service-linked
     * role is missing from your Amazon Web Services account. Account-level BPA is not yet configured for your Lightsail
     * buckets. Therefore, only the bucket access permissions and individual object access permissions apply to your
     * Lightsail buckets. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code> - The reason that synchronization failed is unknown. Contact Amazon Web Services Support for
     * more information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param message
     *        A message that provides a reason for a <code>Failed</code> or <code>Defaulted</code> synchronization
     *        status.</p>
     *        <p>
     *        The following messages are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYNC_ON_HOLD</code> - The synchronization has not yet happened. This status message occurs
     *        immediately after you create your first Lightsail bucket. This status message should change after the
     *        first synchronization happens, approximately 1 hour after the first bucket is created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEFAULTED_FOR_SLR_MISSING</code> - The synchronization failed because the required service-linked
     *        role is missing from your Amazon Web Services account. The account-level BPA configuration for your
     *        Lightsail buckets is defaulted to <i>active</i> until the synchronization can occur. This means that all
     *        your buckets are private and not publicly accessible. For more information about how to create the
     *        required service-linked role to allow synchronization, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles"
     *        >Using Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEFAULTED_FOR_SLR_MISSING_ON_HOLD</code> - The synchronization failed because the required
     *        service-linked role is missing from your Amazon Web Services account. Account-level BPA is not yet
     *        configured for your Lightsail buckets. Therefore, only the bucket access permissions and individual object
     *        access permissions apply to your Lightsail buckets. For more information about how to create the required
     *        service-linked role to allow synchronization, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles"
     *        >Using Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unknown</code> - The reason that synchronization failed is unknown. Contact Amazon Web Services
     *        Support for more information.
     *        </p>
     *        </li>
     * @see BPAStatusMessage
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that provides a reason for a <code>Failed</code> or <code>Defaulted</code> synchronization status.
     * </p>
     * <p>
     * The following messages are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC_ON_HOLD</code> - The synchronization has not yet happened. This status message occurs immediately
     * after you create your first Lightsail bucket. This status message should change after the first synchronization
     * happens, approximately 1 hour after the first bucket is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING</code> - The synchronization failed because the required service-linked role is
     * missing from your Amazon Web Services account. The account-level BPA configuration for your Lightsail buckets is
     * defaulted to <i>active</i> until the synchronization can occur. This means that all your buckets are private and
     * not publicly accessible. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING_ON_HOLD</code> - The synchronization failed because the required service-linked
     * role is missing from your Amazon Web Services account. Account-level BPA is not yet configured for your Lightsail
     * buckets. Therefore, only the bucket access permissions and individual object access permissions apply to your
     * Lightsail buckets. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code> - The reason that synchronization failed is unknown. Contact Amazon Web Services Support for
     * more information.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A message that provides a reason for a <code>Failed</code> or <code>Defaulted</code> synchronization
     *         status.</p>
     *         <p>
     *         The following messages are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SYNC_ON_HOLD</code> - The synchronization has not yet happened. This status message occurs
     *         immediately after you create your first Lightsail bucket. This status message should change after the
     *         first synchronization happens, approximately 1 hour after the first bucket is created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEFAULTED_FOR_SLR_MISSING</code> - The synchronization failed because the required service-linked
     *         role is missing from your Amazon Web Services account. The account-level BPA configuration for your
     *         Lightsail buckets is defaulted to <i>active</i> until the synchronization can occur. This means that all
     *         your buckets are private and not publicly accessible. For more information about how to create the
     *         required service-linked role to allow synchronization, see <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles"
     *         >Using Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEFAULTED_FOR_SLR_MISSING_ON_HOLD</code> - The synchronization failed because the required
     *         service-linked role is missing from your Amazon Web Services account. Account-level BPA is not yet
     *         configured for your Lightsail buckets. Therefore, only the bucket access permissions and individual
     *         object access permissions apply to your Lightsail buckets. For more information about how to create the
     *         required service-linked role to allow synchronization, see <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles"
     *         >Using Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unknown</code> - The reason that synchronization failed is unknown. Contact Amazon Web Services
     *         Support for more information.
     *         </p>
     *         </li>
     * @see BPAStatusMessage
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that provides a reason for a <code>Failed</code> or <code>Defaulted</code> synchronization status.
     * </p>
     * <p>
     * The following messages are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC_ON_HOLD</code> - The synchronization has not yet happened. This status message occurs immediately
     * after you create your first Lightsail bucket. This status message should change after the first synchronization
     * happens, approximately 1 hour after the first bucket is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING</code> - The synchronization failed because the required service-linked role is
     * missing from your Amazon Web Services account. The account-level BPA configuration for your Lightsail buckets is
     * defaulted to <i>active</i> until the synchronization can occur. This means that all your buckets are private and
     * not publicly accessible. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING_ON_HOLD</code> - The synchronization failed because the required service-linked
     * role is missing from your Amazon Web Services account. Account-level BPA is not yet configured for your Lightsail
     * buckets. Therefore, only the bucket access permissions and individual object access permissions apply to your
     * Lightsail buckets. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code> - The reason that synchronization failed is unknown. Contact Amazon Web Services Support for
     * more information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param message
     *        A message that provides a reason for a <code>Failed</code> or <code>Defaulted</code> synchronization
     *        status.</p>
     *        <p>
     *        The following messages are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYNC_ON_HOLD</code> - The synchronization has not yet happened. This status message occurs
     *        immediately after you create your first Lightsail bucket. This status message should change after the
     *        first synchronization happens, approximately 1 hour after the first bucket is created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEFAULTED_FOR_SLR_MISSING</code> - The synchronization failed because the required service-linked
     *        role is missing from your Amazon Web Services account. The account-level BPA configuration for your
     *        Lightsail buckets is defaulted to <i>active</i> until the synchronization can occur. This means that all
     *        your buckets are private and not publicly accessible. For more information about how to create the
     *        required service-linked role to allow synchronization, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles"
     *        >Using Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEFAULTED_FOR_SLR_MISSING_ON_HOLD</code> - The synchronization failed because the required
     *        service-linked role is missing from your Amazon Web Services account. Account-level BPA is not yet
     *        configured for your Lightsail buckets. Therefore, only the bucket access permissions and individual object
     *        access permissions apply to your Lightsail buckets. For more information about how to create the required
     *        service-linked role to allow synchronization, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles"
     *        >Using Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unknown</code> - The reason that synchronization failed is unknown. Contact Amazon Web Services
     *        Support for more information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BPAStatusMessage
     */

    public AccountLevelBpaSync withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * A message that provides a reason for a <code>Failed</code> or <code>Defaulted</code> synchronization status.
     * </p>
     * <p>
     * The following messages are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYNC_ON_HOLD</code> - The synchronization has not yet happened. This status message occurs immediately
     * after you create your first Lightsail bucket. This status message should change after the first synchronization
     * happens, approximately 1 hour after the first bucket is created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING</code> - The synchronization failed because the required service-linked role is
     * missing from your Amazon Web Services account. The account-level BPA configuration for your Lightsail buckets is
     * defaulted to <i>active</i> until the synchronization can occur. This means that all your buckets are private and
     * not publicly accessible. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEFAULTED_FOR_SLR_MISSING_ON_HOLD</code> - The synchronization failed because the required service-linked
     * role is missing from your Amazon Web Services account. Account-level BPA is not yet configured for your Lightsail
     * buckets. Therefore, only the bucket access permissions and individual object access permissions apply to your
     * Lightsail buckets. For more information about how to create the required service-linked role to allow
     * synchronization, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles">Using
     * Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code> - The reason that synchronization failed is unknown. Contact Amazon Web Services Support for
     * more information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param message
     *        A message that provides a reason for a <code>Failed</code> or <code>Defaulted</code> synchronization
     *        status.</p>
     *        <p>
     *        The following messages are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYNC_ON_HOLD</code> - The synchronization has not yet happened. This status message occurs
     *        immediately after you create your first Lightsail bucket. This status message should change after the
     *        first synchronization happens, approximately 1 hour after the first bucket is created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEFAULTED_FOR_SLR_MISSING</code> - The synchronization failed because the required service-linked
     *        role is missing from your Amazon Web Services account. The account-level BPA configuration for your
     *        Lightsail buckets is defaulted to <i>active</i> until the synchronization can occur. This means that all
     *        your buckets are private and not publicly accessible. For more information about how to create the
     *        required service-linked role to allow synchronization, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles"
     *        >Using Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEFAULTED_FOR_SLR_MISSING_ON_HOLD</code> - The synchronization failed because the required
     *        service-linked role is missing from your Amazon Web Services account. Account-level BPA is not yet
     *        configured for your Lightsail buckets. Therefore, only the bucket access permissions and individual object
     *        access permissions apply to your Lightsail buckets. For more information about how to create the required
     *        service-linked role to allow synchronization, see <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-using-service-linked-roles"
     *        >Using Service-Linked Roles for Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unknown</code> - The reason that synchronization failed is unknown. Contact Amazon Web Services
     *        Support for more information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BPAStatusMessage
     */

    public AccountLevelBpaSync withMessage(BPAStatusMessage message) {
        this.message = message.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether account-level block public access is affecting your Lightsail buckets.
     * </p>
     * 
     * @param bpaImpactsLightsail
     *        A Boolean value that indicates whether account-level block public access is affecting your Lightsail
     *        buckets.
     */

    public void setBpaImpactsLightsail(Boolean bpaImpactsLightsail) {
        this.bpaImpactsLightsail = bpaImpactsLightsail;
    }

    /**
     * <p>
     * A Boolean value that indicates whether account-level block public access is affecting your Lightsail buckets.
     * </p>
     * 
     * @return A Boolean value that indicates whether account-level block public access is affecting your Lightsail
     *         buckets.
     */

    public Boolean getBpaImpactsLightsail() {
        return this.bpaImpactsLightsail;
    }

    /**
     * <p>
     * A Boolean value that indicates whether account-level block public access is affecting your Lightsail buckets.
     * </p>
     * 
     * @param bpaImpactsLightsail
     *        A Boolean value that indicates whether account-level block public access is affecting your Lightsail
     *        buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLevelBpaSync withBpaImpactsLightsail(Boolean bpaImpactsLightsail) {
        setBpaImpactsLightsail(bpaImpactsLightsail);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether account-level block public access is affecting your Lightsail buckets.
     * </p>
     * 
     * @return A Boolean value that indicates whether account-level block public access is affecting your Lightsail
     *         buckets.
     */

    public Boolean isBpaImpactsLightsail() {
        return this.bpaImpactsLightsail;
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastSyncedAt() != null)
            sb.append("LastSyncedAt: ").append(getLastSyncedAt()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getBpaImpactsLightsail() != null)
            sb.append("BpaImpactsLightsail: ").append(getBpaImpactsLightsail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLevelBpaSync == false)
            return false;
        AccountLevelBpaSync other = (AccountLevelBpaSync) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastSyncedAt() == null ^ this.getLastSyncedAt() == null)
            return false;
        if (other.getLastSyncedAt() != null && other.getLastSyncedAt().equals(this.getLastSyncedAt()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getBpaImpactsLightsail() == null ^ this.getBpaImpactsLightsail() == null)
            return false;
        if (other.getBpaImpactsLightsail() != null && other.getBpaImpactsLightsail().equals(this.getBpaImpactsLightsail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastSyncedAt() == null) ? 0 : getLastSyncedAt().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getBpaImpactsLightsail() == null) ? 0 : getBpaImpactsLightsail().hashCode());
        return hashCode;
    }

    @Override
    public AccountLevelBpaSync clone() {
        try {
            return (AccountLevelBpaSync) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AccountLevelBpaSyncMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
