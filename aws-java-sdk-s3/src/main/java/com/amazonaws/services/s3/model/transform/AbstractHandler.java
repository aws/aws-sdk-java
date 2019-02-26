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
package com.amazonaws.services.s3.model.transform;

import java.util.LinkedList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Package private abstract base for all handlers here; adds tracking of the
 * current context so each handler doesn't have to manage it on its own.
 */
abstract class AbstractHandler extends DefaultHandler {

    private final StringBuilder text = new StringBuilder();
    private final LinkedList<String> context = new LinkedList<String>();

    @Override
    public final void startElement(
            String uri,
            String name,
            String qName,
            Attributes attrs) {

        text.setLength(0);
        doStartElement(uri, name, qName, attrs);
        context.add(name);
    }

    protected abstract void doStartElement(
            String uri,
            String name,
            String qName,
            Attributes attrs);

    @Override
    public final void endElement(String uri, String name, String qName) {
        context.removeLast();
        doEndElement(uri, name, qName);
    }

    protected abstract void doEndElement(
            String uri,
            String name,
            String qName);

    @Override
    public final void characters(char ch[], int start, int length) {
        text.append(ch, start, length);
    }

    protected final String getText() {
        return text.toString();
    }

    protected final boolean atTopLevel() {
        return context.isEmpty();
    }

    /**
     * @param path
     *            Path to test
     * @return True if the path provided is the same as the current context. False otherwise
     */
    protected final boolean in(String... path) {
        if (path.length != context.size()) {
            return false;
        }

        int i = 0;
        for (String element : context) {
            String pattern = path[i];
            if (!(pattern.equals("*") || pattern.equals(element))) {
                return false;
            }
            i += 1;
        }

        return true;
    }

}
