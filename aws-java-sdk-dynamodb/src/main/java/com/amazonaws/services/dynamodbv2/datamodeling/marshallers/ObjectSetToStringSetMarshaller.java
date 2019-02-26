/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling.marshallers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentMarshaller.StringSetAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A legacy marshaller that marshals sets of arbitrary Java objects into
 * DynamoDB StringSets by using {@link String#valueOf(Object)}. Retained for
 * backwards compatibility in case someone is relying on this, but logs a
 * warning if ever used since we only know how to unmarshal back to Java
 * Strings.
 */
public class ObjectSetToStringSetMarshaller
        implements StringSetAttributeMarshaller {

    private static final Log LOG =
            LogFactory.getLog(ObjectSetToStringSetMarshaller.class);

    private static final ObjectSetToStringSetMarshaller INSTANCE =
            new ObjectSetToStringSetMarshaller();

    public static ObjectSetToStringSetMarshaller instance() {
        return INSTANCE;
    }

    private ObjectSetToStringSetMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        Set<?> set = (Set<?>) obj;

        LOG.warn("Marshaling a set of non-String objects to a DynamoDB "
                + "StringSet. You won't be able to read these objects back "
                + "out of DynamoDB unless you REALLY know what you're doing: "
                + "it's probably a bug. If you DO know what you're doing feel"
                + "free to ignore this warning, but consider using a custom "
                + "marshaler for this instead.");

        List<String> strings = new ArrayList<String>(set.size());
        for (Object o : set) {
            strings.add(String.valueOf(o));
        }

        return new AttributeValue().withSS(strings);
    }
}
