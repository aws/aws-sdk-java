/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.profile.internal;

import java.util.LinkedList;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.profile.internal.securitytoken.ProfileCredentialsService;
import com.amazonaws.auth.profile.internal.securitytoken.RoleInfo;
import com.amazonaws.util.StringUtils;

/**
 * Serves assume role credentials defined in a {@link BasicProfile}. If a profile defines the
 * role_arn property then the profile is treated as an assume role profile. Does basic validation
 * that the role exists and the source (long lived) credentials are valid.
 */
@SdkInternalApi
@Immutable
public class ProfileAssumeRoleCredentialsProvider implements AWSCredentialsProvider {


    private final AllProfiles allProfiles;
    private final ProfileCredentialsService profileCredentialsService;
    private final AWSCredentialsProvider assumeRoleCredentialsProvider;

    public ProfileAssumeRoleCredentialsProvider(ProfileCredentialsService profileCredentialsService,
                                                AllProfiles allProfiles, BasicProfile profile) {
        this.allProfiles = allProfiles;
        this.profileCredentialsService = profileCredentialsService;
        LinkedList<BasicProfile> profilesSoFar = new LinkedList<BasicProfile>();
        profilesSoFar.add(profile);
        this.assumeRoleCredentialsProvider = fromAssumeRole(profile, profilesSoFar);
    }

    @Override
    public AWSCredentials getCredentials() {
        return assumeRoleCredentialsProvider.getCredentials();
    }

    @Override
    public void refresh() {
    }

    private AWSCredentialsProvider fromAssumeRole(BasicProfile profile, LinkedList<BasicProfile> profilesSoFar) {
        if (StringUtils.isNullOrEmpty(profile.getRoleSourceProfile())) {
            throw new SdkClientException(String.format(
                    "Unable to load credentials from profile [%s]: Source profile name is not specified",
                    profile.getProfileName()));
        }

        final BasicProfile sourceProfile = allProfiles
                .getProfile(profile.getRoleSourceProfile());
        if (sourceProfile == null) {
            throw new SdkClientException(String.format(
                    "Unable to load source profile [%s]: Source profile was not found [%s]",
                    profile.getProfileName(), profile.getRoleSourceProfile()));
        }
        if (profilesSoFar.contains(sourceProfile)) {
            throw new SdkClientException(String.format(
                    "Unable to load source profile [%s]: recursion detected in source profile references",
                    profile.getProfileName()));
        }
        profilesSoFar.add(sourceProfile);
        AWSCredentialsProvider sourceCredentials = getSourceProfileCredentialsProvider(profilesSoFar, sourceProfile);
        return createCredentialsProvider(profile, sourceCredentials);
    }

    private AWSCredentialsProvider getSourceProfileCredentialsProvider(LinkedList<BasicProfile> profilesSoFar, BasicProfile sourceProfile) {
        LinkedList<String> errors = new LinkedList<String>();
        try {
            return new ProfileStaticCredentialsProvider(sourceProfile);
        } catch (SdkClientException e) {
            errors.add(e.getMessage());
        }
        try {
            return new ProfileProcessCredentialsProvider(sourceProfile);
        } catch (SdkClientException e) {
            errors.add(e.getMessage());
        }
        try {
            return fromAssumeRole(sourceProfile, profilesSoFar);
        } catch (SdkClientException e) {
            errors.add(e.getMessage());
        }
        throw new SdkClientException("Unable to load source profile [%s]: " + errors);
    }

    private AWSCredentialsProvider createCredentialsProvider(BasicProfile profile, AWSCredentialsProvider sourceCredentials) {
        final String roleSessionName = (profile.getRoleSessionName() == null) ?
                "aws-sdk-java-" + System.currentTimeMillis() : profile.getRoleSessionName();

        RoleInfo roleInfo = new RoleInfo().withRoleArn(profile.getRoleArn())
                .withRoleSessionName(roleSessionName)
                .withExternalId(profile.getRoleExternalId())
                .withLongLivedCredentialsProvider(sourceCredentials)
                .withWebIdentityTokenFilePath(profile.getWebIdentityTokenFilePath());

        return profileCredentialsService.getAssumeRoleCredentialsProvider(roleInfo);
    }

}
