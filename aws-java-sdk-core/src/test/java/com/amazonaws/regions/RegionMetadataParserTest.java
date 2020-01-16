/*
 * Copyright 2019-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.regions;

import org.junit.Test;
import utils.TestHttpServer;

import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class RegionMetadataParserTest {

    @Test
    public void testExternalEntity() throws IOException {
        TestHttpServer server = new TestHttpServer("secret");
        try {
            String xml = String.format(
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                            + "<!DOCTYPE oops [\n"
                            + "     <!ENTITY foo SYSTEM \"%s\" >\n"
                            + "]>\n"
                            + "<oops>&foo;</oops>",
                    server.url());

            parse(xml);
        } catch (IOException e) {
            // okay
        } finally {
            server.stop();
        }

        if (server.accepted()) {
            fail("Oops! The server has been reached!");
        }
    }

    @Test
    public void testExternalSchema() throws IOException {
        TestHttpServer server = new TestHttpServer("secret");
        try {
            String xml = String.format(
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                            + "<!DOCTYPE oops SYSTEM \"%s\">\n"
                            + "<oops></oops>",
                    server.url());

            parse(xml);
        } catch (IOException e) {
            // okay
        } finally {
            server.stop();
        }

        if (server.accepted()) {
            fail("Oops! The server has been reached!");
        }
    }

    @Test
    public void testExternalEntityParameter() throws IOException {
        TestHttpServer server = new TestHttpServer("secret");
        try {
            String xml = String.format(
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                            + "<!DOCTYPE oops [\n"
                            + "     <!ENTITY %% sp SYSTEM \"%s\">\n"
                            + "%%sp;"
                            + "]>\n"
                            + "<oops></oops>",
                    server.url());

            parse(xml);
        } catch (IOException e) {
            // okay
        } finally {
            server.stop();
        }

        if (server.accepted()) {
            fail("Oops! The server has been reached!");
        }
    }

    @Test(expected = IOException.class)
    public void billionLaughs() throws IOException {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<!DOCTYPE lolz [\n" +
                        " <!ENTITY lol \"lol\">\n" +
                        " <!ELEMENT lolz (#PCDATA)>\n" +
                        " <!ENTITY lol1 \"&lol;&lol;&lol;&lol;&lol;&lol;&lol;&lol;&lol;&lol;\">\n" +
                        " <!ENTITY lol2 \"&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;\">\n" +
                        " <!ENTITY lol3 \"&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;\">\n" +
                        " <!ENTITY lol4 \"&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;\">\n" +
                        " <!ENTITY lol5 \"&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;\">\n" +
                        " <!ENTITY lol6 \"&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;\">\n" +
                        " <!ENTITY lol7 \"&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;\">\n" +
                        " <!ENTITY lol8 \"&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;\">\n" +
                        " <!ENTITY lol9 \"&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;\">\n" +
                        "]>\n" +
                        "<lolz>&lol9;</lolz>";
        parse(xml);
    }

    private static void parse(String xml) throws IOException {
        try {
            RegionMetadataParser.parse(new ByteArrayInputStream(xml.getBytes()));
        } catch (IOException e) {
            if (e.getCause() instanceof ParserConfigurationException) {
                e.printStackTrace(System.out);
                fail("Looks like parser configuration failed");
            }
            throw e;
        }
    }
}