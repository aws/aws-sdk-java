/*
 * Copyright (c) 2017. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.http;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.*;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.tomakehurst.wiremock.client.VerificationException;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import javax.xml.stream.events.XMLEvent;

public class StaxResponseHandlerIntegrationTest {

    @Rule
    public WireMockRule wireMockServer = new WireMockRule(0);

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test(expected = VerificationException.class)
    public void saxParserShouldNotExposeLocalFileSystem() throws Exception {
        File tmpFile = temporaryFolder.newFile("contents.txt");
        writeToTmpFile(tmpFile, "hello-world");

        String payload = "<?xml version=\"1.0\" ?> \n" +
            "<!DOCTYPE a [ \n" +
            "<!ENTITY % asd SYSTEM \"http://127.0.0.1:" + wireMockServer.port() + "/payload.dtd\"> \n" +
            "%asd; \n" +
            "%c; \n" +
            "]> \n" +
            "<a>&rrr;</a>";

        String entityString = "<!ENTITY % file SYSTEM \"file://" + tmpFile.getAbsolutePath() + "\"> \n" +
            "<!ENTITY % c \"<!ENTITY rrr SYSTEM 'http://127.0.0.1:" + wireMockServer.port() + "/?%file;'>\">";

        stubFor(get(urlPathEqualTo("/payload.dtd")).willReturn(aResponse().withBody(entityString)));
        stubFor(get(urlPathEqualTo("/?hello-world")).willReturn(aResponse()));

        StaxResponseHandler<String> responseHandler = new StaxResponseHandler<String>(dummyUnmarshaller());

        HttpResponse response = mock(HttpResponse.class);
        when(response.getContent()).thenReturn(new ByteArrayInputStream(payload.getBytes(Charset.forName("UTF-8"))));

        try {
            responseHandler.handle(response);
        } catch (Exception e) {
            //expected
        }

        WireMock.verify(getRequestedFor(urlPathEqualTo("/?hello-world"))); //We expect this to fail, this call should not be made
    }

    @SuppressWarnings("unchecked")
    private Unmarshaller<String, StaxUnmarshallerContext> dummyUnmarshaller() {
        return new Unmarshaller<String, StaxUnmarshallerContext>() {

            @Override
            public String unmarshall(StaxUnmarshallerContext in) throws Exception {
                while(!in.nextEvent().isEndDocument()) {
                    //read the whole document
                }
                return "Success";
            }
        };
    }

    private void writeToTmpFile(File tmpFile, String contents) throws FileNotFoundException {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(tmpFile);
            writer.write(contents);
            writer.flush();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

}