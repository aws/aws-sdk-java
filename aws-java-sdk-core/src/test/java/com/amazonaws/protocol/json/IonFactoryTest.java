/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.protocol.json;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

import org.junit.Before;
import org.junit.Test;

import software.amazon.ion.system.IonSystemBuilder;

public class IonFactoryTest {
    private IonFactory factory;

    @Before
    public void before() {
        factory = new IonFactory(IonSystemBuilder.standard().build());
    }

    @Test
    public void createParserFromByteArray() throws Exception {
        assertThat(factory.createParser(new byte[0]), instanceOf(IonParser.class));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createParserFromCharArray() throws Exception {
        assertThat(factory.createParser(new char[0]), instanceOf(IonParser.class));
    }

    @Test
    public void createParserFromFile() throws Exception {
        File file = File.createTempFile("IonFactoryTest", null);
        file.deleteOnExit();
        assertThat(factory.createParser(file), instanceOf(IonParser.class));
    }

    @Test
    public void createParserFromInputStream() throws Exception {
        assertThat(factory.createParser(new ByteArrayInputStream(new byte[0])), instanceOf(IonParser.class));
    }

    @Test
    public void createParserFromReader() throws Exception {
        assertThat(factory.createParser(new InputStreamReader(new ByteArrayInputStream(new byte[0]))), instanceOf(IonParser.class));
    }

    @Test
    public void createParserFromString() throws Exception {
        assertThat(factory.createParser(""), instanceOf(IonParser.class));
    }

    @Test
    public void createParserFromUrl() throws Exception {
        class NullUrlConnection extends URLConnection {
            protected NullUrlConnection(URL url) {
                super(url);
            }

            @Override
            public void connect() throws IOException {
            }

            @Override
            public InputStream getInputStream() {
                return new ByteArrayInputStream(new byte[0]);
            }
        };

        class NullUrlStreamHandler extends URLStreamHandler {
            @Override
            protected URLConnection openConnection(URL u) throws IOException {
                return new NullUrlConnection(u);
            }
        };

        assertThat(factory.createParser(new URL("foo", "bar", 99, "baz", new NullUrlStreamHandler())), instanceOf(IonParser.class));
    }

    @Test
    public void createParserFromByteArrayWithOffsetAndLength() throws Exception {
        assertThat(factory.createParser(new byte[0], 0, 0), instanceOf(IonParser.class));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createParserFromCharArrayWithOffsetAndLength() throws Exception {
        factory.createParser(new char[0], 0, 0);
    }
}
