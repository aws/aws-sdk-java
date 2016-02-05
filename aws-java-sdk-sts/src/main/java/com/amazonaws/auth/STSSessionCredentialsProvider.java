/*
 * Copyright 2011-2016 Amazon Technologies, Inc.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.services.securitytoken.model.Credentials;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;
import com.amazonaws.services.securitytoken.model.GetSessionTokenResult;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * AWSCredentialsProvider implementation that uses the AWS Security Token
 * Service to create temporary, short-lived sessions to use for authentication.
 */
@ThreadSafe
public class STSSessionCredentialsProvider implements AWSSessionCredentialsProvider {

    /** Default duration for started sessions */
    public static final int DEFAULT_DURATION_SECONDS = 3600;
    
    /** Time before expiry within which credentials will be renewed. */
    private static final int EXPIRY_TIME_MILLIS = 60 * 1000;

    /** maximum time to wait for STS service to respond */
    private static final long NEW_SESSION_MAX_WAIT_SECONDS = 5;
    
    /**
     * Private class used to atomically store a session
     * with its expiration time.
     */
    private static final class SessionCredentialsHolder {
        private final AWSSessionCredentials sessionCredentials;
        private final Date sessionCredentialsExpiration;
        
        private SessionCredentialsHolder(AWSSessionCredentials sessionCredentials,
                                         Date sessionCredentialsExpiration) {
            this.sessionCredentials = sessionCredentials;
            this.sessionCredentialsExpiration = sessionCredentialsExpiration;
        }
        
        @Override
        public int hashCode() {
            return sessionCredentials.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (null == obj) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final SessionCredentialsHolder other = (SessionCredentialsHolder) obj;
            return !(this.sessionCredentials != other.sessionCredentials
                     && (null == this.sessionCredentials || !this.sessionCredentials.equals(other.sessionCredentials)));
        }
    }
    
    /** The client for starting STS sessions */
    private final AWSSecurityTokenService securityTokenService;
    
    /** Used to synchronize session creation */
    private final Lock newSessionLock = new ReentrantLock();
    private final Condition newSessionCondition = newSessionLock.newCondition();

    /** The current session credentials and expiration time */
    private final AtomicReference<SessionCredentialsHolder> sessionCredentials = new AtomicReference<SessionCredentialsHolder>();
    
    /** The last exception thrown during an asynchronous session refresh */
    private final AtomicReference<Exception> lastException = new AtomicReference<Exception>();
    
    /** Used to interrupt the latest refresh thread */
    private final AtomicReference<Thread> refreshThread = new AtomicReference<Thread>();

    /** Used to ensure only one thread at any given time refreshes the re-usable session */
    private final AtomicBoolean asyncRefreshing = new AtomicBoolean(false);

    /**
     * Constructs a new STSSessionCredentialsProvider, which will use the
     * specified long lived AWS credentials to make a request to the AWS
     * Security Token Service (STS) to request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     *
     * @param longLivedCredentials
     *            The main AWS credentials for a user's account.
     */
    public STSSessionCredentialsProvider(AWSCredentials longLivedCredentials) {
        this(longLivedCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new STSSessionCredentialsProvider, which will use the
     * specified long lived AWS credentials to make a request to the AWS
     * Security Token Service (STS) to request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()}
     * method.
     *
     * @param longLivedCredentials
     *            The main AWS credentials for a user's account.
     * @param clientConfiguration
     *            Client configuration connection parameters.
     */
    public STSSessionCredentialsProvider(AWSCredentials longLivedCredentials, ClientConfiguration clientConfiguration) {
        securityTokenService = new AWSSecurityTokenServiceClient(longLivedCredentials, clientConfiguration);
    }

    /**
     * Constructs a new STSSessionCredentialsProvider, which will use the
     * specified credentials provider (which vends long lived AWS credentials)
     * to make a request to the AWS Security Token Service (STS) to request
     * short lived session credentials, which will then be returned by this
     * class's {@link #getCredentials()} method.
     *
     * @param longLivedCredentialsProvider
     *            Credentials provider for the main AWS credentials for a user's
     *            account.
     */
    public STSSessionCredentialsProvider(AWSCredentialsProvider longLivedCredentialsProvider) {
        securityTokenService = new AWSSecurityTokenServiceClient(longLivedCredentialsProvider);
    }

    /**
     * Constructs a new STSSessionCredentialsProvider, which will use the
     * specified credentials provider (which vends long lived AWS credentials)
     * to make a request to the AWS Security Token Service (STS) to request
     * short lived session credentials, which will then be returned by this
     * class's {@link #getCredentials()} method.
     *
     * @param longLivedCredentialsProvider
     *            Credentials provider for the main AWS credentials for a user's
     *            account.
     * @param clientConfiguration
     *            Client configuration connection parameters.
     */
    public STSSessionCredentialsProvider(AWSCredentialsProvider longLivedCredentialsProvider, ClientConfiguration clientConfiguration) {
        securityTokenService = new AWSSecurityTokenServiceClient(longLivedCredentialsProvider, clientConfiguration);
    }

    /**
     * Sets the AWS Security Token Service (STS) endpoint where session
     * credentials are retrieved from.
     * <p></p>
     * The default AWS Security Token Service (STS) endpoint
     * ("sts.amazonaws.com") works for all accounts that are not for
     * China (Beijing) region or GovCloud. You only need to change the endpoint to
     * "sts.cn-north-1.amazonaws.com.cn" when you are requesting session
     * credentials for services in China(Beijing) region or "sts.us-gov-west-1.amazonaws.com" for GovCloud.
     * <p></p>
     * Setting this invalidates existing session credentials.
     * Calling this method will temporarily cause getCredentials() to block until a new session
     * is fetched from the STS service.
     * @param endpoint
     */
    public void setSTSClientEndpoint(String endpoint) {
        securityTokenService.setEndpoint(endpoint);
        sessionCredentials.set(null);
    }

    /**
     * Method will return valid session credentials or throw an AmazonClientException
     * due to STS service time-out or thread interruption. The first call will block
     * until valid session credentials are fetched. Subsequent calls will re-use
     * fetched credentials that are still valid. Expiring credentials are
     * automatically refreshed via a background thread. Multiple threads may call
     * this method concurrently without causing simultaneous network calls to
     * the STS service. Care has been taken to resist Throttling exceptions.
     * 
     * @return 
     */
    @Override
    public AWSSessionCredentials getCredentials() {

        // important null checking to prevent any side-effects of user calls
        // to public setSTSClientEndpoint() and refresh() methods
        for (;;) {
            SessionCredentialsHolder credsHolder = sessionCredentials.get();

            if (needsNewSession(credsHolder)) {
                startSession();
                credsHolder = sessionCredentials.get();
            }

            if (null != credsHolder && null != credsHolder.sessionCredentials) {
                return credsHolder.sessionCredentials;
            }
        }
    }

    /**
     * Brute-force refresh of session credentials. A decision to use this method
     * should be made judiciously since this class automatically manages
     * refreshing expiring credentials limiting its usefulness. Calling this
     * method may temporarily cause getCredentials() to block until a new session
     * is fetched from the STS service.
     */
    @Override
    public void refresh() {
        sessionCredentials.set(null);
        blockingNewSession();
    }
    
    /**
     * Unconditionally calls STS to generate a new session
     * 
     * @return 
     */
    private SessionCredentialsHolder newSession() {
        GetSessionTokenResult sessionTokenResult = securityTokenService
                .getSessionToken(new GetSessionTokenRequest()
                        .withDurationSeconds(DEFAULT_DURATION_SECONDS));

        Credentials stsCredentials = sessionTokenResult.getCredentials();

        AWSSessionCredentials credentials = new BasicSessionCredentials(
                stsCredentials.getAccessKeyId(),
                stsCredentials.getSecretAccessKey(),
                stsCredentials.getSessionToken());

        return new SessionCredentialsHolder(credentials, stsCredentials.getExpiration());
    }
    
    /**
     * Called when a blocking session refresh times-out or is interrupted. Wraps
     * the underlying cause in an AmazonClientException which is then thrown.
     *
     * @param error The description of the error
     * @param cause The Exception causing the error or null
     */
    private void handleWaitError(String error, Exception cause) {

        // set the interrupt flag on the refresh thread in case of temporary error
        Thread newSessionThread = refreshThread.get();
        if (null != newSessionThread) {
            try {
                newSessionThread.interrupt();
            } catch (SecurityException ex) {
                // ignore the security exception when interrupting threads is not allowed by JVM
            }
        }

        throw new AmazonClientException(error, cause);
    }

    /**
     * Used when there is no valid session to return. Callers are blocked until
     * a new session is created or an exception is thrown.
     * Throws AmazonClientException if new session is not created
     * within 5 seconds.
     */
    private void blockingNewSession() {
        newSessionLock.lock();

        try {
            // return if successful refresh occured while waiting for the lock
            if (!expired()) {
                return;
            }

            // trigger a refresh thread if needed
            asyncNewSession();

            // wait for new session or time out
            if (!newSessionCondition.await(NEW_SESSION_MAX_WAIT_SECONDS, TimeUnit.SECONDS)) {
                // timeout occured, check for valid session before throwing an exception
                if (expired()) {
                    handleWaitError("Session credentials request timed-out.", lastException.get());
                }
            }
        } catch (InterruptedException ex) {
            handleWaitError("Interrupted waiting for new session credentials.", ex);
        } finally {
            newSessionLock.unlock();
        }
    }
    
    /**
     * Used to asynchronously refresh the session. Ensures only one
     * thread is spawned at any given time to refresh the session. Caller
     * is never blocked.
     */
    private void asyncNewSession() {
        // immediate return if refresh already in progress
        if (asyncRefreshing.compareAndSet(false, true)) {
            try {
                refreshThread.set(new Thread() {
                    @Override
                    public void run() {
                        try {
                            newSessionLock.lock();
                            sessionCredentials.compareAndSet(sessionCredentials.get(), newSession());
                            newSessionCondition.signalAll();
                            lastException.set(null);
                        } catch (Exception e) {
                            // record the exception and exit the thread
                            lastException.set(e);
                        } finally {
                            asyncRefreshing.set(false);
                            newSessionLock.unlock();
                        }
                    }
                });
                refreshThread.get().start();
            } catch (RuntimeException ex) {
                asyncRefreshing.set(false);
                throw ex;
            }
        }
    }
    
    /**
     * Method returns true if the currently held session credentials are expired
     * or not set yet. Otherwise, returns false.
     * 
     * @return 
     */
    private boolean expired() {
        SessionCredentialsHolder currentSession = sessionCredentials.get();
        return (null == currentSession ||
                currentSession.sessionCredentialsExpiration.getTime() <= System.currentTimeMillis());
    }
    
    /**
     * Starts a new session by sending a request to the AWS Security Token
     * Service (STS) with the long lived AWS credentials. If the currently
     * held session is still valid, a background thread will be triggered
     * to asynchronously fetch new credentials while the expiring credentials
     * are still returned to clients. If the currently held session is expired
     * or non-existent, this method will block until a new session is fetched
     * or an exception is thrown due to time-out or STS service error.
     */
    private void startSession() {
        if (expired()) {
            blockingNewSession();
        } else {
            asyncNewSession();
        }
    }
    
    /**
     * Session credentials that expire in less than a minute are considered expiring.
     * 
     * @param expiry expiration time of a session
     * @return 
     */
    private static boolean expiring(Date expiry) {
        long timeRemaining = expiry.getTime() - System.currentTimeMillis();
        return timeRemaining < EXPIRY_TIME_MILLIS;
    }

    /**
     * Returns true if a new STS session needs to be started. A new STS session
     * is needed when no session has been started yet, or if the last session is
     * within 60 seconds of expiring.
     *
     * @return True if a new STS session needs to be started.
     */
    private static boolean needsNewSession(SessionCredentialsHolder credentialsHolder) {
        if (null == credentialsHolder) return true;
        return expiring(credentialsHolder.sessionCredentialsExpiration);
    }
}
