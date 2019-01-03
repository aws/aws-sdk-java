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

import static com.amazonaws.util.XpathUtils.asString;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XpathUtilsSyncTest {
    @Test
    public void test() throws Exception {
        // System.setProperty("com.sun.org.apache.xml.internal.dtm.DTMManager",
        // "com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault");
        final String content = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Error>"
                + "  <Code>NoSuchKey</Code>"
                + "  <Message>The resource you requested does not exist</Message>"
                + "  <Resource>/mybucket/myfoto.jpg</Resource> "
                + "  <RequestId>4442587FB7D0A2F9</RequestId>" + "</Error>";
        ExecutorService es = Executors.newCachedThreadPool();

        Callable<Void> task = new Callable<Void>() {
            @Override
            public Void call() throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {
                final Document document = XpathUtils.documentFrom(content);
                final String message = asString("Error/Message", document);
                assertEquals("The resource you requested does not exist", message);
                return null;
            }
        };
        @SuppressWarnings("unchecked")
        Callable<Void>[] a = new Callable[50];
        Arrays.fill(a, task);
        List<Future<Void>> futures = es.invokeAll(Arrays.asList(a));
        for (Future<?> f : futures) {
            f.get();
        }
        task.call();
        task.call();
    }
    
    public static void main(String[] args) throws Exception {
        new XpathUtilsSyncTest().test();
        System.exit(0);
    }
}
