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

import static com.amazonaws.util.XpathUtils.asBoolean;
import static com.amazonaws.util.XpathUtils.asByte;
import static com.amazonaws.util.XpathUtils.asByteBuffer;
import static com.amazonaws.util.XpathUtils.asDate;
import static com.amazonaws.util.XpathUtils.asDouble;
import static com.amazonaws.util.XpathUtils.asFloat;
import static com.amazonaws.util.XpathUtils.asInteger;
import static com.amazonaws.util.XpathUtils.asLong;
import static com.amazonaws.util.XpathUtils.asNode;
import static com.amazonaws.util.XpathUtils.asString;
import static com.amazonaws.util.XpathUtils.documentFrom;
import static com.amazonaws.util.XpathUtils.isEmpty;
import static com.amazonaws.util.XpathUtils.xpath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Unit tests for the XpathUtils class.
 *
 * @author fulghum@amazon.com
 */
public class XpathUtilsTest {

    /** Test data for all tests to share */
    private static final String DOCUMENT =
        "<Foo>" +
        "    <Title>Boo</Title>" +
        "    <Count Foo='Bar'>1</Count>" +
        "    <Enabled>true</Enabled>" +
        "    <Usage>0.0000071759</Usage>" +
        "    <Since>2008-10-07T11:51:50.000Z</Since>" +
        "    <Item>A</Item>" +
        "    <Item>B</Item>" +
        "    <Item>C</Item>" +
        "    <Empty></Empty>" +
        "    <Blob>aGVsbG8gd29ybGQ=</Blob>" +
        "    <PositiveByte>123</PositiveByte>" +
        "    <NegativeByte>-99</NegativeByte>" +
        "</Foo>";

    /** Test XML document with a namespace */
    private static final String DOCUMENT_WITH_NAMESPACE =
        "<?xml version=\"1.0\"?> \n" +
        "<AllocateAddressResponse xmlns=\"http://ec2.amazonaws.com/doc/2009-04-04/\"> \n" +
        "    <requestId>a074658d-7624-433e-b4e9-9271f6f5264b</requestId> \n" +
        "    <publicIp>174.129.242.223</publicIp> \n" +
        "</AllocateAddressResponse> \n";


    @Test
    public void testXmlDocumentWithNamespace() throws Exception {
        Document document = documentFrom(DOCUMENT_WITH_NAMESPACE);
        XPath xpath = xpath();
        Node root = asNode("/", document, xpath);
        assertNotNull(root);

        Node node = asNode("//AllocateAddressResponse", document, xpath);
        assertNotNull(node);
    }

    @Test
    public void testAsString() throws Exception {
        Document document = documentFrom(DOCUMENT);
        XPath xpath = xpath();
        assertEquals("Boo", asString("Foo/Title", document, xpath));
        assertEquals("", XpathUtils.asString("Foo/Empty", document, xpath));
        assertEquals("Bar", XpathUtils.asString("Foo/Count/@Foo", document, xpath));
    }

    @Test
    public void testAsInteger() throws Exception {
        Document document = documentFrom(DOCUMENT);
        XPath xpath = xpath();
        assertEquals((Integer)1, (Integer)asInteger("Foo/Count", document, xpath));
        assertEquals(null, asInteger("Foo/Empty", document, xpath));
    }

    @Test
    public void testAsBoolean() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        XPath xpath = xpath();
        assertEquals(true, asBoolean("Foo/Enabled", document, xpath));
        assertEquals(null, asBoolean("Foo/Empty", document, xpath));
    }

    @Test
    public void testAsFloat() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        XPath xpath = xpath();
        assertEquals((Float)0.0000071759f, (Float)asFloat("Foo/Usage", document, xpath));
        assertEquals(null, asFloat("Foo/Empty", document, xpath));
    }

    /**
     * Tests that we can correctly pull a Byte out of an XML document.
     */
    @Test
    public void testAsByte() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        XPath xpath = xpath();
        assertEquals(new Byte((byte)123), asByte("Foo/PositiveByte", document, xpath));
        assertEquals(new Byte((byte)-99), asByte("Foo/NegativeByte", document, xpath));
        assertEquals(null, XpathUtils.asByte("Foo/Empty", document));
    }

    /**
     * Tests that we can correctly parse out a Date from an XML document.
     */
    @Test
    public void testAsDate() throws Exception {
        /*
         * The example date in our test XML document is:
         *   2008-10-07T11:51:50.000Z
         *
         * So we construct that same date and verify that it matches
         * what we parsed out of the XML.
         */
        Calendar expectedDate = new GregorianCalendar();
        expectedDate.set(Calendar.YEAR, 2008);
        expectedDate.set(Calendar.MONTH, Calendar.OCTOBER);
        expectedDate.set(Calendar.DAY_OF_MONTH, 7);
        expectedDate.set(Calendar.AM_PM, Calendar.AM);
        expectedDate.set(Calendar.HOUR, 11);
        expectedDate.set(Calendar.MINUTE, 51);
        expectedDate.set(Calendar.SECOND, 50);
        expectedDate.set(Calendar.MILLISECOND, 0);
        expectedDate.setTimeZone(new SimpleTimeZone(0, "UTC"));

        Document document = documentFrom(DOCUMENT);
        XPath xpath = xpath();
        Date date = XpathUtils.asDate("Foo/Since", document, xpath);
        assertNotNull(date);
        assertEquals(expectedDate.getTimeInMillis(), date.getTime());

        assertEquals(null, asDate("Foo/Empty", document, xpath));
    }

    @Test
    public void testIsEmpty() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        XPath xpath = xpath();
        Node emptyNode = asNode("Foo/Fake", document, xpath);
        Node realNode = asNode("Foo/Count", document, xpath);

        assertTrue(isEmpty(emptyNode));
        assertFalse(isEmpty(realNode));
    }

    @Test
    public void testAsNode() throws Exception {
        Document document = documentFrom(DOCUMENT);
        XPath xpath = xpath();
        Node node = asNode("Foo/Title", document, xpath);
        assertNotNull(node);
        assertEquals("Title", node.getNodeName());
    }

    /**
     * Tests that we return null when a specified expression doesn't
     * evaluate anything (instead of passing that null/empty value to
     * a parser and getting an error in the parser).
     */
    @Test
    public void testMissingNodes() throws Exception {
        Document document = documentFrom(DOCUMENT);
        XPath xpath = XpathUtils.xpath();
        assertNull(asDouble("non-existant-node/name", document, xpath));
        assertNull(asLong("non-existant-node/name", document, xpath));
        assertNull(asInteger("non-existant-node/name", document, xpath));
        assertNull(asDate("non-existant-node/name", document, xpath));
        assertNull(asFloat("non-existant-node/name", document, xpath));
        assertNull(asString("non-existant-node/name", document, xpath));
    }

    /**
     * Tests that {@link XpathUtils#asByteBuffer(String, Node)} correctly base64
     * decodes the XML text data and transforms it into a ByteBuffer.
     */
    @Test
    public void testAsByteBuffer() throws Exception {
        String expectedData = "hello world";

        Document document = XpathUtils.documentFrom(DOCUMENT);
        XPath xpath = XpathUtils.xpath();
        ByteBuffer byteBuffer = asByteBuffer("Foo/Blob", document, xpath);
        assertEquals(expectedData.length(), byteBuffer.limit());

        String data = new String(byteBuffer.array());
        assertEquals(expectedData, data);

        assertEquals(null, asByteBuffer("Foo/Empty", document, xpath));
    }

    @Test
    public void testFromDocumentDoesNotWriteToStderrWhenXmlInvalid() throws SAXException, IOException, ParserConfigurationException {
        PrintStream err = System.err;
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try {
            PrintStream err2 = new PrintStream(bytes);
            System.setErr(err2);
            // invalid xml
            XpathUtils.documentFrom("a");
            Assert.fail();
        } catch (SAXParseException e) {
            //ensure nothing written to stderr
            assertEquals(0, bytes.toByteArray().length);
        } finally {
            System.setErr(err);
        }
    }

}