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
package com.amazonaws.internal.config;

/**
 * An internal class used to help build {@link InternalConfig} after this
 * class per se has been unmarshalled from JSON. This class allows us to make
 * use of Jackson without the need to write any special parser or json
 * marshaller/unmarshaller.
 */
class InternalConfigJsonHelper {
    private SignerConfigJsonHelper defaultSigner;
    // Implementation note:
    // Internally use list instead of Map for ease of implementation to
    // leverage on Jackson which supports recursive list of arbitrary pojos 
    // without the use of custom [un]marshallers.  This is not the case for
    // Map, which Jackson only supports the use of strings 
    // without custom [un]marshaller.
    private JsonIndex<SignerConfigJsonHelper, SignerConfig>[] serviceSigners;
    private JsonIndex<SignerConfigJsonHelper, SignerConfig>[] regionSigners;
    private JsonIndex<SignerConfigJsonHelper, SignerConfig>[] serviceRegionSigners;
    private JsonIndex<HttpClientConfigJsonHelper, HttpClientConfig>[] httpClients;

    SignerConfigJsonHelper getDefaultSigner() {
        return defaultSigner;
    }

    void setDefaultSigner(SignerConfigJsonHelper defaultSigner) {
        this.defaultSigner = defaultSigner;
    }

    public JsonIndex<SignerConfigJsonHelper, SignerConfig>[] getServiceSigners() {
        return serviceSigners;
    }

    void setServiceSigners(JsonIndex<SignerConfigJsonHelper, SignerConfig> ... serviceSigners) {
        this.serviceSigners = serviceSigners;
    }

    public JsonIndex<SignerConfigJsonHelper, SignerConfig>[] getRegionSigners() {
        return regionSigners;
    }

    void setRegionSigners(JsonIndex<SignerConfigJsonHelper, SignerConfig> ... regionSigners) {
        this.regionSigners = regionSigners;
    }

    public JsonIndex<SignerConfigJsonHelper, SignerConfig>[] getServiceRegionSigners() {
        return serviceRegionSigners;
    }

    void setServiceRegionSigners(JsonIndex<SignerConfigJsonHelper, SignerConfig> ... serviceRegionSigners) {
        this.serviceRegionSigners = serviceRegionSigners;
    }

    public JsonIndex<HttpClientConfigJsonHelper, HttpClientConfig>[] getHttpClients() {
        return httpClients;
    }

    public void setHttpClients(JsonIndex<HttpClientConfigJsonHelper, HttpClientConfig> ... httpClients) {
        this.httpClients = httpClients;
    }
}
