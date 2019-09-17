/*
 * Copyright 2012-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.auth;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.ClientConfiguration;

/**
 * Session credentials provider factory to share providers across potentially
 * many clients.
 */
public class SessionCredentialsProviderFactory {

    /**
     * Key object for the cache combines the access key and the service
     * endpoint.
     */
    private static final class Key {

        private final String awsAccessKeyId;
        private final String serviceEndpoint;

        public Key(String awsAccessKeyId, String serviceEndpoint) {
            this.awsAccessKeyId = awsAccessKeyId;
            this.serviceEndpoint = serviceEndpoint;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((awsAccessKeyId == null) ? 0 : awsAccessKeyId.hashCode());
            result = prime * result + ((serviceEndpoint == null) ? 0 : serviceEndpoint.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if ( this == obj )
                return true;
            if ( obj == null )
                return false;
            if ( getClass() != obj.getClass() )
                return false;
            Key other = (Key) obj;
            if ( awsAccessKeyId == null ) {
                if ( other.awsAccessKeyId != null )
                    return false;
            } else if ( !awsAccessKeyId.equals(other.awsAccessKeyId) )
                return false;
            if ( serviceEndpoint == null ) {
                if ( other.serviceEndpoint != null )
                    return false;
            } else if ( !serviceEndpoint.equals(other.serviceEndpoint) )
                return false;
            return true;
        }
    }

    private static final Map<Key, STSSessionCredentialsProvider> cache = new HashMap<SessionCredentialsProviderFactory.Key, STSSessionCredentialsProvider>();

    /**
     * Gets a session credentials provider for the long-term credentials and
     * service endpoint given. These are shared globally to support reuse of
     * session tokens.
     * 
     * @param longTermCredentials
     *            The long-term AWS account credentials used to initiate a
     *            session.
     * @param serviceEndpoint
     *            The service endpoint for the service the session credentials
     *            will be used to access.
     * @param stsClientConfiguration
     *            Client configuration for the {@link AWSSecurityTokenService}
     *            used to fetch session credentials.
     */
    public static synchronized STSSessionCredentialsProvider getSessionCredentialsProvider(AWSCredentials longTermCredentials,
                                                                                           String serviceEndpoint,
                                                                                           ClientConfiguration stsClientConfiguration) {
        Key key = new Key(longTermCredentials.getAWSAccessKeyId(), serviceEndpoint);
        if ( !cache.containsKey(key) ) {
            cache.put(key, new STSSessionCredentialsProvider(longTermCredentials, stsClientConfiguration));
        }
        return cache.get(key);
    }
}
