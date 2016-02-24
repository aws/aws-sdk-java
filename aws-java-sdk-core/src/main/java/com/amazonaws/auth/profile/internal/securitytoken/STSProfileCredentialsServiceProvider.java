package com.amazonaws.auth.profile.internal.securitytoken;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 */
public class STSProfileCredentialsServiceProvider implements AWSCredentialsProvider {
    private static final String CLASS_NAME = "com.amazonaws.services.securitytoken.internal.STSProfileCredentialsService";
    private static ProfileCredentialsService STS_CREDENTIALS_SERVICE;

    private final RoleInfo roleInfo;
    private AWSCredentialsProvider profileCredentialsProvider;

    public STSProfileCredentialsServiceProvider(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }

    private AWSCredentialsProvider getProfileCredentialsProvider() {
        if (this.profileCredentialsProvider == null) {
            this.profileCredentialsProvider = getProfileCredentialService().getAssumeRoleCredentialsProvider(roleInfo);
        }

        return this.profileCredentialsProvider;
    }

    private static ProfileCredentialsService getProfileCredentialService() {
        if (STS_CREDENTIALS_SERVICE == null) {
            try {
                STS_CREDENTIALS_SERVICE = (ProfileCredentialsService) Class.forName(CLASS_NAME).newInstance();
            } catch (ClassNotFoundException ex) {
                throw new AmazonClientException("To use assume role profiles the aws-java-sdk-sts module must be on the class path.", ex);
            } catch (InstantiationException ex) {
                throw new AmazonClientException("Failed to instantiate " + CLASS_NAME, ex);
            } catch (IllegalAccessException ex) {
                throw new AmazonClientException("Failed to instantiate " + CLASS_NAME, ex);
            }
        }

        return STS_CREDENTIALS_SERVICE;
    }


    @Override
    public AWSCredentials getCredentials() {
        return getProfileCredentialsProvider().getCredentials();
    }

    @Override
    public void refresh() {
        getProfileCredentialsProvider().refresh();
    }
}
