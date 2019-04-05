/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.internal.SdkThreadLocalsRegistry;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Utility methods for extracting data from XML documents using Xpath
 * expressions.
 */
public class XpathUtils {

    /** The default property name to load the Xalan DTM manager. */
    private static final String DTM_MANAGER_DEFAULT_PROP_NAME = "com.sun.org.apache.xml.internal.dtm.DTMManager";

    /** The default property name to load the Xalan Document Builder Factory. */
    private static final String DOCUMENT_BUILDER_FACTORY_PROP_NAME = "javax.xml.parsers.DocumentBuilderFactory";

    /** The FQCN of the desired DocumentBuilderFactory implementation. */
    private static final String DOCUMENT_BUILDER_FACTORY_IMPL_CLASS_NAME = "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl";

    /** The FQCN of the internal XPathContext class. */
    private static final String XPATH_CONTEXT_CLASS_NAME = "com.sun.org.apache.xpath.internal.XPathContext";

    /** The FQCN of the desired DTMManager implementation. */
    private static final String DTM_MANAGER_IMPL_CLASS_NAME = "com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault";

    private static final Log log = LogFactory.getLog(XpathUtils.class);

    private static final ErrorHandler ERROR_HANDLER = new ErrorHandler() {

        @Override
        public void warning(SAXParseException e) throws SAXException {
            if (log.isDebugEnabled()) {
                log.debug("xml parse warning: " + e.getMessage(), e);
            }
        }

        @Override
        public void fatalError(SAXParseException e) throws SAXException {
            throw e;
        }

        @Override
        public void error(SAXParseException e) throws SAXException {
            if (log.isDebugEnabled()) {
                log.debug("xml parse error: " + e.getMessage(), e);
            }
        }
    };

    /**
     * Shared factory for creating XML Factory
     */
    private static final ThreadLocal<XPathFactory> X_PATH_FACTORY = SdkThreadLocalsRegistry.register(
            new ThreadLocal<XPathFactory>() {
                @Override
                protected XPathFactory initialValue() {
                    return XPathFactory.newInstance();
                }
            });

    /**
     * Used to optimize performance by avoiding expensive file access every time
     * a DTMManager is constructed as a result of constructing a Xalan xpath
     * context!
     */
    private static void speedUpDTMManager() throws Exception {
        // https://github.com/aws/aws-sdk-java/issues/238
        // http://stackoverflow.com/questions/6340802/java-xpath-apache-jaxp-implementation-performance
        if (System.getProperty(DTM_MANAGER_DEFAULT_PROP_NAME) == null) {
            Class<?> XPathContextClass = Class.forName(XPATH_CONTEXT_CLASS_NAME);
            Method getDTMManager = XPathContextClass.getMethod("getDTMManager");
            Object XPathContext = XPathContextClass.newInstance();
            Object dtmManager = getDTMManager.invoke(XPathContext);

            if (DTM_MANAGER_IMPL_CLASS_NAME.equals(dtmManager.getClass().getName())) {
                // This would avoid the file system to be accessed every time
                // the internal XPathContext is instantiated.
                System.setProperty(DTM_MANAGER_DEFAULT_PROP_NAME,
                        DTM_MANAGER_IMPL_CLASS_NAME);
            }
        }
    }

    /**
     * Used to optimize performance by avoiding expensive file access every time
     * a DocumentBuilderFactory is constructed as a result of constructing a
     * Xalan document factory.
     */
    private static void speedUpDcoumentBuilderFactory() {
        if (System.getProperty(DOCUMENT_BUILDER_FACTORY_PROP_NAME) == null) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            if (DOCUMENT_BUILDER_FACTORY_IMPL_CLASS_NAME.equals(factory.getClass().getName())) {
                // This would avoid the file system to be accessed every time
                // the internal DocumentBuilderFactory is instantiated.
                System.setProperty(DOCUMENT_BUILDER_FACTORY_PROP_NAME,
                        DOCUMENT_BUILDER_FACTORY_IMPL_CLASS_NAME);
            }
        }
    }

    // static initialization block to conservatively speed things up whenever we
    // can
    static {
        try {
            speedUpDcoumentBuilderFactory();
        } catch(Throwable t) {
            log.debug("Ingore failure in speeding up DocumentBuilderFactory", t);
        }
        try {
            speedUpDTMManager();
        } catch(Throwable t) {
            log.debug("Ingore failure in speeding up DTMManager", t);
        }
    }

    // XPath is not thread safe and not reentrant.
    /**
     * Returns a new instance of XPath, which is not thread safe and not
     * reentrant.
     */
    public static XPath xpath() {
        return X_PATH_FACTORY.get().newXPath();
    }

    /**
     * This method closes the given input stream upon completion.
     */
    public static Document documentFrom(InputStream is)
            throws SAXException, IOException, ParserConfigurationException {
        is = new NamespaceRemovingInputStream(is);
        // DocumentBuilderFactory is not thread safe
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        // ensure that parser writes error/warning messages to the logger
        // rather than stderr
        builder.setErrorHandler(ERROR_HANDLER);
        Document doc = builder.parse(is);
        is.close();
        return doc;
    }

    public static Document documentFrom(String xml) throws SAXException,
            IOException, ParserConfigurationException {
        return documentFrom(new ByteArrayInputStream(xml.getBytes(StringUtils.UTF8)));
    }

    public static Document documentFrom(URL url) throws SAXException,
            IOException, ParserConfigurationException {
        return documentFrom(url.openStream());
    }

    /**
     * Evaluates the specified XPath expression and returns the results as a
     * Double.
     * <p>
     * This method can be expensive as a new xpath is instantiated per
     * invocation. Consider passing in the xpath explicitly via {
     * {@link #asDouble(String, Node, XPath)} instead.  Note {@link XPath} is
     * not thread-safe and not reentrant.
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
        return asDouble(expression, node, xpath());
    }

    /**
     * Same as {@link #asDouble(String, Node)} but allows an xpath to be passed
     * in explicitly for reuse.
     */
    public static Double asDouble(String expression, Node node, XPath xpath)
            throws XPathExpressionException {
        String doubleString = evaluateAsString(expression, node, xpath);
        return (isEmptyString(doubleString)) ? null : Double.parseDouble(doubleString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * string.
     * <p>
     * This method can be expensive as a new xpath is instantiated per
     * invocation. Consider passing in the xpath explicitly via {
     * {@link #asDouble(String, Node, XPath)} instead.  Note {@link XPath} is
     * not thread-safe and not reentrant.
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
        return evaluateAsString(expression, node, xpath());
    }

    /**
     * Same as {@link #asString(String, Node)} but allows an xpath to be passed
     * in explicitly for reuse.
     */
    public static String asString(String expression, Node node, XPath xpath)
            throws XPathExpressionException {
        return evaluateAsString(expression, node, xpath);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as an
     * Integer.
     * <p>
     * This method can be expensive as a new xpath is instantiated per
     * invocation. Consider passing in the xpath explicitly via {
     * {@link #asDouble(String, Node, XPath)} instead.  Note {@link XPath} is
     * not thread-safe and not reentrant.
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
        return asInteger(expression, node, xpath());
    }

    /**
     * Same as {@link #asInteger(String, Node)} but allows an xpath to be passed
     * in explicitly for reuse.
     */
    public static Integer asInteger(String expression, Node node, XPath xpath)
            throws XPathExpressionException {
        String intString = evaluateAsString(expression, node, xpath);
        return (isEmptyString(intString)) ? null : Integer.parseInt(intString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Boolean.
     * <p>
     * This method can be expensive as a new xpath is instantiated per
     * invocation. Consider passing in the xpath explicitly via {
     * {@link #asDouble(String, Node, XPath)} instead.  Note {@link XPath} is
     * not thread-safe and not reentrant.
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
        return asBoolean(expression, node, xpath());
    }

    /**
     * Same as {@link #asBoolean(String, Node)} but allows an xpath to be passed
     * in explicitly for reuse.
     */
    public static Boolean asBoolean(String expression, Node node, XPath xpath)
            throws XPathExpressionException {
        String booleanString = evaluateAsString(expression, node, xpath);
        return (isEmptyString(booleanString)) ? null : Boolean.parseBoolean(booleanString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Float.
     * <p>
     * This method can be expensive as a new xpath is instantiated per
     * invocation. Consider passing in the xpath explicitly via {
     * {@link #asDouble(String, Node, XPath)} instead.  Note {@link XPath} is
     * not thread-safe and not reentrant.
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
        return asFloat(expression, node, xpath());
    }

    /**
     * Same as {@link #asFloat(String, Node)} but allows an xpath to be passed
     * in explicitly for reuse.
     */
    public static Float asFloat(String expression, Node node, XPath xpath)
            throws XPathExpressionException {
        String floatString = evaluateAsString(expression, node, xpath);
        return (isEmptyString(floatString)) ? null : Float.valueOf(floatString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Long.
     * <p>
     * This method can be expensive as a new xpath is instantiated per
     * invocation. Consider passing in the xpath explicitly via {
     * {@link #asDouble(String, Node, XPath)} instead.  Note {@link XPath} is
     * not thread-safe and not reentrant.
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
        return asLong(expression, node, xpath());
    }

    /**
     * Same as {@link #asLong(String, Node)} but allows an xpath to be passed
     * in explicitly for reuse.
     */
    public static Long asLong(String expression, Node node, XPath xpath)
            throws XPathExpressionException {
        String longString = evaluateAsString(expression, node, xpath);
        return (isEmptyString(longString)) ? null : Long.parseLong(longString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Byte.
     * <p>
     * This method can be expensive as a new xpath is instantiated per
     * invocation. Consider passing in the xpath explicitly via {
     * {@link #asDouble(String, Node, XPath)} instead.  Note {@link XPath} is
     * not thread-safe and not reentrant.
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
        return asByte(expression, node, xpath());
    }

    /**
     * Same as {@link #asByte(String, Node)} but allows an xpath to be passed
     * in explicitly for reuse.
     */
    public static Byte asByte(String expression, Node node, XPath xpath)
            throws XPathExpressionException {
        String byteString = evaluateAsString(expression, node, xpath);
        return (isEmptyString(byteString)) ? null : Byte.valueOf(byteString);
    }

    /**
     * Evaluates the specified XPath expression and returns the result as a
     * Date. Assumes that the node's text is formatted as an ISO 8601 date, as
     * specified by xs:dateTime.
     * <p>
     * This method can be expensive as a new xpath is instantiated per
     * invocation. Consider passing in the xpath explicitly via {
     * {@link #asDouble(String, Node, XPath)} instead.  Note {@link XPath} is
     * not thread-safe and not reentrant.
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
        return asDate(expression, node, xpath());
    }

    /**
     * Same as {@link #asDate(String, Node)} but allows an xpath to be passed
     * in explicitly for reuse.
     */
    public static Date asDate(String expression, Node node, XPath xpath)
            throws XPathExpressionException {
        String dateString = evaluateAsString(expression, node, xpath);
        if (isEmptyString(dateString)) return null;

        try {
            return DateUtils.parseISO8601Date(dateString);
        } catch (Exception e) {
            log.warn("Unable to parse date '" + dateString + "':  " + e.getMessage(), e);
            return null;
        }
    }

    /**
     * Evaluates the specified xpath expression, base64 decodes the data and
     * returns the result as a ByteBuffer.
     * <p>
     * This method can be expensive as a new xpath is instantiated per
     * invocation. Consider passing in the xpath explicitly via {
     * {@link #asDouble(String, Node, XPath)} instead.  Note {@link XPath} is
     * not thread-safe and not reentrant.
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
        return asByteBuffer(expression, node, xpath());
    }

    /**
     * Same as {@link #asByteBuffer(String, Node)} but allows an xpath to be
     * passed in explicitly for reuse.
     */
    public static ByteBuffer asByteBuffer(String expression, Node node, XPath xpath)
            throws XPathExpressionException {
        String base64EncodedString = evaluateAsString(expression, node, xpath);
        if (isEmptyString(base64EncodedString)) return null;

        if (!isEmpty(node)) {
            byte[] decodedBytes = Base64.decode(base64EncodedString);
            return ByteBuffer.wrap(decodedBytes);
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
        return asNode(nodeName, node, xpath());
    }

    /**
     * Same as {@link #asNode(String, Node)} but allows an xpath to be
     * passed in explicitly for reuse.
     */
    public static Node asNode(String nodeName, Node node, XPath xpath)
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
    private static String evaluateAsString(String expression, Node node,
            XPath xpath) throws XPathExpressionException {
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
            if (asNode(expression, node, xpath) == null) return null;
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
        return s == null || s.trim().length() == 0;
    }
}