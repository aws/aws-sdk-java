/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.internal.auth.SignerProviderContext;
import org.junit.Test;

import java.net.URI;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ExecutionContextTest {

    @Test
    public void legacyGetSignerBehavior() throws Exception {
        AmazonWebServiceClient webServiceClient = mock(AmazonWebServiceClient.class);
        ExecutionContext executionContext = new ExecutionContext(null, false, webServiceClient);
        URI testUri = new URI("http://foo.amazon.com");
        executionContext.getSigner(SignerProviderContext.builder().withUri(testUri).build());
        verify(webServiceClient, times(1)).getSignerByURI(testUri);
    }

}
