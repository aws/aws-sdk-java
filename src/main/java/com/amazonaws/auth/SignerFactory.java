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

import com.amazonaws.internal.config.InternalConfig;
import com.amazonaws.internal.config.SignerConfig;
import com.amazonaws.internal.config.SignerType;

/** Singer factory. */
public enum SignerFactory {
    ;

    public static Signer getSigner(String serviceName, String regionName) {
        InternalConfig config = InternalConfig.Factory.getInternalConfig();
        SignerConfig signerConfig = config.getSignerConfig(serviceName, regionName);
        Signer signer = signerConfig.computeSigner();
        SignerType type = signerConfig.getSignerType();
        switch(type) {
            case AWS4SignerType: {
                AWS4Signer v4 = (AWS4Signer)signer;
                v4.setServiceName(serviceName);
                v4.setRegionName(regionName);
            }
            default:
                // fall thru (more details come later)
        }
        return signer;
    }

    public static Signer getSigner(String serviceName) {
        return getSigner(serviceName, null);
    }
}
