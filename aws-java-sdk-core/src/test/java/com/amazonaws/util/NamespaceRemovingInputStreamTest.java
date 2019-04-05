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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Test;


/**
 * Test for filtering out XML namespace attributes when reading XML.
 */
public class NamespaceRemovingInputStreamTest {

    private static final String SAMPLE_RESPONSE_1 =
        "<DomainMetadataResponse xmlns=\"http://sdb.amazonaws.com/doc/2009-04-15/\">\n" +
        "  <DomainMetadataResult>\n" +
        "    <ItemCount>195078</ItemCount>\n" +
        "  </DomainMetadataResult>\n" +
        "  <ResponseMetadata>\n" +
        "        <RequestId>b1e8f1f7-42e9-494c-ad09-2674e557526d</RequestId>\n" +
        "  </ResponseMetadata>\n" +
        "</DomainMetadataResponse>";

    private static final String SAMPLE_RESPONSE_2 =
        "<DomainMetadataResponse xmlns = \"http://sdb.amazonaws.com/doc/2009-04-15/\">\n" +
        "  <DomainMetadataResult>\n" +
        "    <ItemCount>195078</ItemCount>\n" +
        "  </DomainMetadataResult>\n" +
        "  <ResponseMetadata>\n" +
        "        <RequestId>b1e8f1f7-42e9-494c-ad09-2674e557526d</RequestId>\n" +
        "  </ResponseMetadata>\n" +
        "</DomainMetadataResponse>";

    private static final String SAMPLE_RESPONSE_3 =
        "<DomainMetadataResponse xmlns=  \"http://sdb.amazonaws.com/doc/2009-04-15/\">\n" +
        "  <DomainMetadataResult>\n" +
        "    <ItemCount>195078</ItemCount>\n" +
        "  </DomainMetadataResult>\n" +
        "  <ResponseMetadata>\n" +
        "        <RequestId>b1e8f1f7-42e9-494c-ad09-2674e557526d</RequestId>\n" +
        "  </ResponseMetadata>\n" +
        "</DomainMetadataResponse>";

    private static final String EXPECTED_RESULT =
        "<DomainMetadataResponse >\n" +
        "  <DomainMetadataResult>\n" +
        "    <ItemCount>195078</ItemCount>\n" +
        "  </DomainMetadataResult>\n" +
        "  <ResponseMetadata>\n" +
        "        <RequestId>b1e8f1f7-42e9-494c-ad09-2674e557526d</RequestId>\n" +
        "  </ResponseMetadata>\n" +
        "</DomainMetadataResponse>";

    @Test
    public void testNamespaceRemoval() throws Exception {
        assertEquals(EXPECTED_RESULT, removeNamespace(SAMPLE_RESPONSE_1));
        assertEquals(EXPECTED_RESULT, removeNamespace(SAMPLE_RESPONSE_2));
        assertEquals(EXPECTED_RESULT, removeNamespace(SAMPLE_RESPONSE_3));
    }

    private String removeNamespace(String xml) throws Exception {
        NamespaceRemovingInputStream inputStream = new NamespaceRemovingInputStream(new ByteArrayInputStream(xml.getBytes()));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        IOUtils.copy(inputStream, outputStream);

        return new String(outputStream.toByteArray());
    }
}
