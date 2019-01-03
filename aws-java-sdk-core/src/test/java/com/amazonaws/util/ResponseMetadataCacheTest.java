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
package com.amazonaws.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Random;

import org.junit.Test;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ResponseMetadata;

/** Tests for the response metadata cache class. */
public class ResponseMetadataCacheTest {

    /** Tests that the cache correctly evicts the oldest entries.  */
    @Test
    public void testEviction() {
        ResponseMetadataCache cache = new ResponseMetadataCache(3);

        AmazonWebServiceRequest key1 = new TestRequest();
        AmazonWebServiceRequest key2 = new TestRequest();
        AmazonWebServiceRequest key3 = new TestRequest();
        AmazonWebServiceRequest key4 = new TestRequest();
        ResponseMetadata metadata1 = newResponseMetadata();
        ResponseMetadata metadata2 = newResponseMetadata();
        ResponseMetadata metadata3 = newResponseMetadata();
        ResponseMetadata metadata4 = newResponseMetadata();

        // Fill the cache
        cache.add(key1, metadata1);
        cache.add(key2, metadata2);
        cache.add(key3, metadata3);

        // Verify all entries are still there
        assertEquals(metadata1, cache.get(key1));
        assertEquals(metadata2, cache.get(key2));
        assertEquals(metadata3, cache.get(key3));

        // Add another and make sure the oldest is evicted
        cache.add(key4, metadata4);
        assertNull(cache.get(key1));
        assertEquals(metadata2, cache.get(key2));
        assertEquals(metadata3, cache.get(key3));
        assertEquals(metadata4, cache.get(key4));
    }

    /** Tests that the cache works correctly with size=0  */
    @Test
    public void TestEmpty() {
        ResponseMetadataCache cache = new ResponseMetadataCache(0);

        AmazonWebServiceRequest key = new TestRequest();
        ResponseMetadata metadata = newResponseMetadata();
        // Add item to the cache, it should be immediately evicted.
        cache.add(key, metadata);

        // get should return null
        assertNull(cache.get(key));
    }

    private class TestRequest extends AmazonWebServiceRequest {}

    private ResponseMetadata newResponseMetadata() {
        HashMap<String, String> metadata = new HashMap<String, String>();
        metadata.put("foo", "bar-" + new Random().nextLong());
        return new ResponseMetadata(metadata);
    }
}
