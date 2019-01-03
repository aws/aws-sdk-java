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
import java.io.IOException;
import java.io.InputStream;
import javax.xml.stream.XMLInputFactory;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class XmlUtils {

    /**
     * Shared factory for creating XML event readers
     */
    private static final ThreadLocal<XMLInputFactory> xmlInputFactory = SdkThreadLocalsRegistry.register(
            new ThreadLocal<XMLInputFactory>() {
                @Override
                protected XMLInputFactory initialValue() {
                    return createXmlInputFactory();
                }
            });

    public static XMLReader parse(InputStream in, ContentHandler handler)
        throws SAXException, IOException {

        XMLReader reader = XMLReaderFactory.createXMLReader();
        reader.setContentHandler(handler);
        reader.parse(new InputSource(in));
        in.close();
        return reader;
    }

    /**
     * @return A {@link ThreadLocal} copy of {@link XMLInputFactory}.
     */
    public static XMLInputFactory getXmlInputFactory() {
        return xmlInputFactory.get();
    }

    /**
     * Disables certain dangerous features that attempt to automatically fetch DTDs
     *
     * See <a href="https://www.owasp.org/index.php/XML_External_Entity_(XXE)_Prevention_Cheat_Sheet">OWASP XXE Cheat Sheet</a>
     */
    private static XMLInputFactory createXmlInputFactory() {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        factory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        factory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
        return factory;
    }

}
