/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.handlers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.amazonaws.Request;
import com.amazonaws.util.TimingInfo;

public class RequestHandler2AdaptorTest {
    final boolean[] bs = new boolean[3];
    @Test
    public void testDelegation() {
        for (int i=0; i < bs.length; i++) {
            assertFalse(bs[i]);
        }
        RequestHandler old = createRequestHandler();
        RequestHandler2 v2 = new RequestHandler2Adaptor(old);
        v2.beforeRequest(null);
        int i=0;
        assertTrue("beforeRequest is expected to have been invoked", bs[i++]);
        bs[i-1] = false;    // reset the flag
        v2.afterResponse(null, null);
        assertTrue("beforeRequest is expected to have been invoked", bs[i++]);
        bs[i-1] = false;    // reset the flag
        v2.afterError(null, null, null);
        assertTrue("beforeRequest is expected to have been invoked", bs[i++]);
        bs[i-1] = false;    // reset the flag
    }

    @Test
    public void sameOldButDiffAdapters() {
        RequestHandler old = createRequestHandler();
        RequestHandler2 new1 = new RequestHandler2Adaptor(old);
        RequestHandler2 new2 = new RequestHandler2Adaptor(old);
        assertNotSame(new1, new2);
        assertEquals(new1, new2);
        assertTrue(new1.hashCode() == new2.hashCode());
    }

    @Test
    public void diffOldDiffAdapters() {
        RequestHandler old1 = createRequestHandler();
        RequestHandler old2 = createRequestHandler();
        RequestHandler2 new1 = new RequestHandler2Adaptor(old1);
        RequestHandler2 new2 = new RequestHandler2Adaptor(old2);
        assertNotSame(new1, new2);
        assertFalse(new1.equals(new2));
        assertFalse(new1.hashCode() == new2.hashCode());
    }

    RequestHandler createRequestHandler() {
        return new RequestHandler() {
            @Override
            public void beforeRequest(Request<?> request) {
                bs[0] = true;
            }
            
            @Override
            public void afterResponse(Request<?> request, Object response,
                    TimingInfo timingInfo) {
                bs[1] = true;
            }
            
            @Override
            public void afterError(Request<?> request, Exception e) {
                bs[2] = true;
            }
        };
    }
}
