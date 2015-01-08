/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon SES.
 */
public enum SimpleEmailServiceActions implements Action {
    /** Represents any action executed on Amazon SES. */
    AllSimpleEmailServiceActions("ses:*"),

    /** Action for the DeleteIdentity operation. */
    DeleteIdentity("ses:DeleteIdentity"),

    /** Action for the DeleteVerifiedEmailAddress operation. */
    DeleteVerifiedEmailAddress("ses:DeleteVerifiedEmailAddress"),

    /** Action for the GetIdentityDkimAttributes operation. */
    GetIdentityDkimAttributes("ses:GetIdentityDkimAttributes"),

    /** Action for the GetIdentityNotificationAttributes operation. */
    GetIdentityNotificationAttributes("ses:GetIdentityNotificationAttributes"),

    /** Action for the GetIdentityVerificationAttributes operation. */
    GetIdentityVerificationAttributes("ses:GetIdentityVerificationAttributes"),

    /** Action for the GetSendQuota operation. */
    GetSendQuota("ses:GetSendQuota"),

    /** Action for the GetSendStatistics operation. */
    GetSendStatistics("ses:GetSendStatistics"),

    /** Action for the ListIdentities operation. */
    ListIdentities("ses:ListIdentities"),

    /** Action for the ListVerifiedEmailAddresses operation. */
    ListVerifiedEmailAddresses("ses:ListVerifiedEmailAddresses"),

    /** Action for the SendEmail operation. */
    SendEmail("ses:SendEmail"),

    /** Action for the SendRawEmail operation. */
    SendRawEmail("ses:SendRawEmail"),

    /** Action for the SetIdentityDkimEnabled operation. */
    SetIdentityDkimEnabled("ses:SetIdentityDkimEnabled"),

    /** Action for the SetIdentityNotificationTopic operation. */
    SetIdentityNotificationTopic("ses:SetIdentityNotificationTopic"),

    /** Action for the SetIdentityFeedbackForwardingEnabled operation. */
    SetIdentityFeedbackForwardingEnabled("ses:SetIdentityFeedbackForwardingEnabled"),

    /** Action for the VerifyDomainDkim operation. */
    VerifyDomainDkim("ses:VerifyDomainDkim"),

    /** Action for the VerifyDomainIdentity operation. */
    VerifyDomainIdentity("ses:VerifyDomainIdentity"),

    /** Action for the VerifyEmailAddress operation. */
    VerifyEmailAddress("ses:VerifyEmailAddress"),

    /** Action for the VerifyEmailIdentity operation. */
    VerifyEmailIdentity("ses:VerifyEmailIdentity");

    private final String action;

    private SimpleEmailServiceActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
