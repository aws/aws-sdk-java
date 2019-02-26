/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.internal;

import java.io.IOException;
import java.io.InputStream;

import javax.net.ssl.SSLSocket;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.util.AWSRequestMetrics;

/**
 * A wrapper to SSLSocket with metric feature to record socket read time.
 */
public class SdkSSLMetricsSocket extends DelegateSSLSocket {

    private MetricsInputStream metricsIS;

    public SdkSSLMetricsSocket(SSLSocket sock) {
        super(sock);
    }

    public void setMetrics(AWSRequestMetrics metrics) throws IOException {
        // make sure metricsIS is initialized.
        getInputStream();
        metricsIS.setMetrics(metrics);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        if (metricsIS == null) {
            metricsIS = new MetricsInputStream(sock.getInputStream());
        }
        return metricsIS;
    }

    @SdkTestInternalApi
    MetricsInputStream getMetricsInputStream() {
        return metricsIS;
    }
}
