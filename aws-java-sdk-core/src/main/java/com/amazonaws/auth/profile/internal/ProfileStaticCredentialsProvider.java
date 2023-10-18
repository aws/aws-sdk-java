/*
 * Copyright 2011-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.auth.ContainerCredentialsProvider;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.util.StringUtils;

/**
 * Serves credentials defined in a {@link BasicProfile}. Does validation that
 * both access key and secret key exists and are non empty.
 */
@SdkInternalApi
@Immutable
public class ProfileStaticCredentialsProvider implements AWSCredentialsProvider {

	private final BasicProfile profile;
	private final AWSCredentialsProvider credentialsProvider;

	
    /**
     * The raw properties in this profile.
     */
    private final Map<String, String> properties;

	public ProfileStaticCredentialsProvider(BasicProfile profile) {
		this.profile = profile;
		this.properties = profile.getProperties();
        boolean hasCredentialSource = properties.containsKey(ProfileKeyConstants.CREDENTIAL_SOURCE);

		if (hasCredentialSource) {
			CredentialSourceType credentialSource = CredentialSourceType.parse(profile.getCredentialSource());
			this.credentialsProvider  = credentialSourceCredentialProvider(credentialSource);
		} else {
			this.credentialsProvider = new StaticCredentialsProvider(fromStaticCredentials());
		}
	}

	@Override
	public AWSCredentials getCredentials() {
		return credentialsProvider.getCredentials();
	}

	@Override
	public void refresh() {
		// No Op
	}

	private AWSCredentials fromStaticCredentials() {
		if (StringUtils.isNullOrEmpty(profile.getAwsAccessIdKey())) {
			throw new SdkClientException(
					String.format("Unable to load credentials into profile [%s]: AWS Access Key ID is not specified.",
							profile.getProfileName()));
		}
		if (StringUtils.isNullOrEmpty(profile.getAwsSecretAccessKey())) {
			throw new SdkClientException(String.format(
					"Unable to load credentials into profile [%s]: AWS Secret Access Key is not specified.",
					profile.getAwsSecretAccessKey()));
		}

		if (profile.getAwsSessionToken() == null) {
			return new BasicAWSCredentials(profile.getAwsAccessIdKey(), profile.getAwsSecretAccessKey());
		} else {
			if (profile.getAwsSessionToken().isEmpty()) {
				throw new SdkClientException(
						String.format("Unable to load credentials into profile [%s]: AWS Session Token is empty.",
								profile.getProfileName()));
			}

			return new BasicSessionCredentials(profile.getAwsAccessIdKey(), profile.getAwsSecretAccessKey(),
					profile.getAwsSessionToken());
		}
	}

	private AWSCredentialsProvider credentialSourceCredentialProvider(CredentialSourceType credentialSource) {
		switch (credentialSource) {
		case ECS_CONTAINER:
			return new ContainerCredentialsProvider();
		case EC2_INSTANCE_METADATA:
			return InstanceProfileCredentialsProvider.getInstance();
		case ENVIRONMENT:
			List<AWSCredentialsProvider> credProviders = new ArrayList<AWSCredentialsProvider>();
			credProviders.add(new EnvironmentVariableCredentialsProvider());
			credProviders.add(new SystemPropertiesCredentialsProvider());
			return new AWSCredentialsProviderChain(credProviders);
		default:
			throw noSourceCredentialsException();
		}
	}

    private IllegalStateException noSourceCredentialsException() {
        String error = String.format("The source profile of '%s', but that source profile has no "
                                     + "credentials configured.", profile.getProfileName());
        return new IllegalStateException(error);
    }
}
