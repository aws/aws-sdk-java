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
package com.amazonaws.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.util.Date;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.amazonaws.AmazonClientException;

/**
 * Utility methods for extracting data from XML documents using Xpath
 * expressions.
 */
public class XpathUtils {

    private static XPathFactory xpathFactory = XPathFactory.newInstance();

    private static XPath xpath = xpathFactory.newXPath();

    /** Shared DateUtils object for parsing and formatting dates */
    private static DateUtils dateUtils = new DateUtils();

    /** Shared logger */
    private static Log log = LogFactory.getLog(XpathUtils.class);

    private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();


    public static Document documentFrom(InputStream is)
            throws SAXException, IOException, ParserConfigurationException {

        is = new NamespaceRemovingInputStream(is);
        Document doc = factory.newDocumentBuilder().parse(is);
        is.close();
        return doc;
    }

    public static Document documentFrom(String xml) throws SAXException,
            IOException, ParserConfigurationException {
        return documentFrom(new ByteArrayInputStream(xml.getBytes()));
    }

    public static Document documentFrom(URL url) throws SAXException,
            IOException, ParserConfigurationException {
        return documentFrom(url.openStream());
    }

    /**
     * Evaluates the specified XPath expression and returns the results as a
     * Double.
     *
     * @param expression
     *            The XPath expression to evaluate.
     * @param node
     *            The node to run the expression on.
     *
     * @return The Double result.
     *
     * @throws XPathExpressionException
     *             If there was a problem processing the specified XPath
     *             expression.
     */
    public static Double asDouble(String expression, Node node)
            throws XPathExpressionException {
        String doubleString = evaluateAsString(expression, node);
        return (isEmptyString(doubleString)) ? null : Double.parseDouble(doubleString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * string.
     *
     * @param expression
     *            The XPath expression to evaluate.
     * @param node
     *            The node to run the expression on.
     *
     * @return The string result.
     *
     * @throws XPathExpressionException
     *             If there was a problem processing the specified XPath
     *             expression.
     */
    public static String asString(String expression, Node node)
            throws XPathExpressionException {
        return evaluateAsString(expression, node);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as an
     * Integer.
     *
     * @param expression
     *            The XPath expression to evaluate.
     * @param node
     *            The node to run the expression on.
     *
     * @return The Integer result.
     *
     * @throws XPathExpressionException
     *             If there was a problem processing the specified XPath
     *             expression.
     */
    public static Integer asInteger(String expression, Node node)
            throws XPathExpressionException {
        String intString = evaluateAsString(expression, node);
        return (isEmptyString(intString)) ? null : Integer.parseInt(intString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Boolean.
     *
     * @param expression
     *            The XPath expression to evaluate.
     * @param node
     *            The node to run the expression on.
     *
     * @return The Boolean result.
     *
     * @throws XPathExpressionException
     *             If there was a problem processing the specified XPath
     *             expression.
     */
    public static Boolean asBoolean(String expression, Node node)
            throws XPathExpressionException {
        String booleanString = evaluateAsString(expression, node);
        return (isEmptyString(booleanString)) ? null : Boolean.parseBoolean(booleanString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Float.
     *
     * @param expression
     *            The XPath expression to evaluate.
     * @param node
     *            The node to run the expression on.
     *
     * @return The Float result.
     *
     * @throws XPathExpressionException
     *             If there was a problem processing the specified XPath
     *             expression.
     */
    public static Float asFloat(String expression, Node node)
            throws XPathExpressionException {
        String floatString = evaluateAsString(expression, node);
        return (isEmptyString(floatString)) ? null : Float.valueOf(floatString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Long.
     *
     * @param expression
     *            The XPath expression to evaluate.
     * @param node
     *            The node to run the expression on.
     *
     * @return The Long result.
     *
     * @throws XPathExpressionException
     *             If there was a problem processing the specified XPath
     *             expression.
     */
    public static Long asLong(String expression, Node node)
            throws XPathExpressionException {
        String longString = evaluateAsString(expression, node);
        return (isEmptyString(longString)) ? null : Long.parseLong(longString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Byte.
     *
     * @param expression
     *            The XPath expression to evaluate.
     * @param node
     *            The node to run the expression on.
     *
     * @return The Byte result.
     *
     * @throws XPathExpressionException
     *             If there was a problem processing the specified XPath
     *             expression.
     */
    public static Byte asByte(String expression, Node node)
            throws XPathExpressionException {
        String byteString = evaluateAsString(expression, node);
        return (isEmptyString(byteString)) ? null : Byte.valueOf(byteString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Date. Assumes that the node's text is formatted as an ISO 8601 date, as
     * specified by xs:dateTime.
     *
     * @param expression
     *            The XPath expression to evaluate.
     * @param node
     *            The node to run the expression on.
     *
     * @return The Date result.
     *
     * @throws XPathExpressionException
     *             If there was a problem processing the specified XPath
     *             expression.
     */
    public static Date asDate(String expression, Node node)
            throws XPathExpressionException {
        String dateString = evaluateAsString(expression, node);
        if (isEmptyString(dateString)) return null;

        try {
            return dateUtils.parseIso8601Date(dateString);
        } catch (ParseException e) {
            log.warn("Unable to parse date '" + dateString + "':  " + e.getMessage(), e);
            return null;
        }
    }

    /**
     * Evaluates the specified xpath expression, base64 decodes the data and
     * returns the result as a ByteBuffer.
     *
     * @param expression
     *            The Xpath expression to evaluate.
     * @param node
     *            The node on which to evaluate the expression.
     *
     * @return A ByteBuffer of base64 decoded data from the result of evaluating
     *         the specified Xpath expression.
     *
     * @throws XPathExpressionException
     *             If there are any problems evaluating the Xpath expression.
     */
    public static ByteBuffer asByteBuffer(String expression, Node node)
            throws XPathExpressionException {
        String base64EncodedString = evaluateAsString(expression, node);
        if (isEmptyString(base64EncodedString)) return null;

        if (!isEmpty(node)) {
            try {
                byte[] base64EncodedBytes = base64EncodedString.getBytes("UTF-8");
                byte[] decodedBytes = Base64.decodeBase64(base64EncodedBytes);
                return ByteBuffer.wrap(decodedBytes);
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to unmarshall XML data into a ByteBuffer", e);
            }
        }
        return null;
    }

    /**
     * Returns true if the specified node is null or has no children.
     *
     * @param node
     *            The node to test.
     *
     * @return True if the specified node is null or has no children.
     */
    public static boolean isEmpty(Node node) {
        return (node == null);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Node.
     *
     * @param nodeName
     *            The XPath expression to evaluate.
     * @param node
     *            The node to run the expression on.
     *
     * @return The Node result.
     *
     * @throws XPathExpressionException
     *             If there was a problem processing the specified XPath
     *             expression.
     */
    public static Node asNode(String nodeName, Node node)
            throws XPathExpressionException {
        if (node == null) return null;
        return (Node) xpath.evaluate(nodeName, node, XPathConstants.NODE);
    }

    /**
     * Returns the length of the specified node list.
     *
     * @param list
     *            The node list to measure.
     *
     * @return The length of the specified node list.
     */
    public static int nodeLength(NodeList list) {
        return list == null ? 0 : list.getLength();
    }

    /**
     * Evaluates the specified expression on the specified node and returns the
     * result as a String.
     *
     * @param expression
     *            The Xpath expression to evaluate.
     * @param node
     *            The node on which to evaluate the expression.
     *
     * @return The result of evaluating the specified expression, or null if the
     *         evaluation didn't return any result.
     *
     * @throws XPathExpressionException
     *             If there are any problems evaluating the Xpath expression.
     */
    private static String evaluateAsString(String expression, Node node) throws XPathExpressionException {
        if (isEmpty(node)) return null;

        if (!expression.equals(".")) {
            /*
             * If the expression being evaluated doesn't select a node, we want
             * to return null to distinguish between cases where a node isn't
             * present (which should be represented as null) and when a node is
             * present, but empty (which should be represented as the empty
             * string).
             *
             * We skip this test if the expression is "." since we've already
             * checked that the node exists.
             */
            if (asNode(expression, node) == null) return null;
        }

        String s = xpath.evaluate(expression, node);

        return s.trim();
    }

    /**
     * Returns true if the specified string is null or empty.
     *
     * @param s
     *            The string to test.
     * @return True if the specified string is null or empty.
     */
    private static boolean isEmptyString(String s) {
        if (s == null) return true;
        if (s.trim().equals("")) return true;

        return false;
    }

}
