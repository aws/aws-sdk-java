/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.amazonaws.internal.config.InternalConfig;
import com.amazonaws.internal.config.SignerConfig;

/** Signer factory. */
public final class SignerFactory {

    private static final String QUERY_STRING_SIGNER = "QueryStringSignerType";
    private static final String VERSION_THREE_SIGNER = "AWS3SignerType";
    private static final String VERSION_FOUR_SIGNER = "AWS4SignerType";

    private static final Map<String, Class<? extends Signer>> SIGNERS
        = new ConcurrentHashMap<String, Class<? extends Signer>>();

    static {
        // Register the standard signer types.
        SIGNERS.put(QUERY_STRING_SIGNER, QueryStringSigner.class);
        SIGNERS.put(VERSION_THREE_SIGNER, AWS3Signer.class);
        SIGNERS.put(VERSION_FOUR_SIGNER, AWS4Signer.class);
    }

    /**
     * Private so you're not tempted to instantiate me.
     */
    private SignerFactory() {
    }

    /**
     * Register an implementation class for the given signer type.
     *
     * @param signerType  The name of the signer type to register.
     * @param signerClass The class implementing the given signature protocol.
     */
    public static void registerSigner(
            final String signerType,
            final Class<? extends Signer> signerClass) {

        if (signerType == null) {
            throw new IllegalArgumentException("signerType cannot be null");
        }
        if (signerClass == null) {
            throw new IllegalArgumentException("signerClass cannot be null");
        }

        SIGNERS.put(signerType, signerClass);
    }

    /**
     * Returns a non-null signer for the specified service and region.
     *
     * @param serviceName   The name of the service to talk to.
     * @param regionName    The name of the region to talk to.
     */
    public static Signer getSigner(String serviceName, String regionName) {

        InternalConfig config = InternalConfig.Factory.getInternalConfig();
        SignerConfig signerConfig = config.getSignerConfig(serviceName, regionName);
        String signerType = signerConfig.getSignerType();
        Class<? extends Signer> signerClass = SIGNERS.get(signerType);

        if (signerClass == null) {
            throw new IllegalStateException(
                "No signer implementation registered for signer type "
                + signerType + ".");
        }

        Signer signer;
        try {
            signer = signerClass.newInstance();
        } catch (InstantiationException exception) {
            throw new IllegalStateException(
                "Cannot create an instance of " + signerClass.getName()
                + " for signer type " + signerType + ".",
                exception);
        } catch (IllegalAccessException exception) {
            throw new IllegalStateException(
                "Cannot create an instance of " + signerClass.getName()
                + " for signer type " + signerType + ".",
                exception);
        }

        if (signer instanceof ServiceAwareSigner) {
            ((ServiceAwareSigner) signer).setServiceName(serviceName);
        }
        if (signer instanceof RegionAwareSigner) {
            ((RegionAwareSigner) signer).setRegionName(regionName);
        }

        return signer;
    }

    /**
     * Returns a non-null signer for the specified service.
     * 
     * @throws UnsupportedOperationException
     *             if the internal signer type configured is not currently
     *             supported.
     */
    public static Signer getSigner(String serviceName) {
        return getSigner(serviceName, null);
    }
}
