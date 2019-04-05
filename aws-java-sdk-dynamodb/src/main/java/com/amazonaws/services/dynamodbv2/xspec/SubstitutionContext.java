/*
 * Copyright 2015-2019 Amazon Technologies, Inc.
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
 package com.amazonaws.services.dynamodbv2.xspec;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * An internal class to represent the substitution context for name maps and
 * value maps.
 * <p>
 * To avoid attribute names that may conflict with the DynamoDB reserved words,
 * the expressions builder will automatically transform every component of a
 * document path into the use of an "expression attribute name" (that begins
 * with "#") as a placeholder. The actual mapping from the
 * "expression attribute name" to the actual attribute name is automatically
 * taken care of by the builder in a "name map". Similarly, the actual mapping
 * from the "expression attribute value" (that begins with ":") to the actual
 * attribute value is automatically taken care of by the builder in a
 * "value map". See more information at <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
 * >Using Placeholders for Attribute Names and Values</a>.
 */
final class SubstitutionContext {
    private final Map<String, Integer> nameToToken =
        new LinkedHashMap<String, Integer>();
    private final Map<Object, Integer> valueToToken =
        new LinkedHashMap<Object, Integer>();

    /**
     * Returns the name token for the given name, creating a new token as
     * necessary.
     */
    String nameTokenFor(String name) {
        Integer token = nameToToken.get(name);
        if (token == null) {
            token = nameToToken.size();
            nameToToken.put(name, token);
        }
        return "#" + token;
    }

    /**
     * Returns the value token for the given value, creating a new token as
     * necessary.
     */
    String valueTokenFor(Object value) {
        Integer token = valueToToken.get(value);
        if (token == null) {
            token = valueToToken.size();
            valueToToken.put(value, token);
        }
        return ":" + token;
    }

    Map<String, String> getNameMap() {
        if (nameToToken.size() == 0)
            return null;
        Map<String, String> out = new LinkedHashMap<String, String>();
        for (Map.Entry<String,Integer> e: nameToToken.entrySet()) {
            out.put("#" + e.getValue(), e.getKey());
        }
        return out;
    }

    Map<String, Object> getValueMap() {
        if (valueToToken.size() == 0)
            return null;
        Map<String, Object> out = new LinkedHashMap<String, Object>();
        for (Map.Entry<Object,Integer> e: valueToToken.entrySet()) {
            out.put(":" + e.getValue(), e.getKey());
        }
        return out;
    }

    // For testing
    int numNameTokens() {
        return nameToToken.size();
    }

    // For testing
    int numValueTokens() {
        return valueToToken.size();
    }
    
    // For testing
    String getNameByToken(int token) {
        for (Map.Entry<String, Integer> e: nameToToken.entrySet()) {
            if (e.getValue().intValue() == token)
                return e.getKey();
        }
        return null;
    }

    // For testing
    Object getValueByToken(int token) {
        for (Map.Entry<Object, Integer> e: valueToToken.entrySet()) {
            if (e.getValue().intValue() == token)
                return e.getKey();
        }
        return null;
    }

    @Override
    public String toString() {
        return "name-tokens: " + nameToToken.toString() + "\n"
                + "value-tokens: " + valueToToken.toString();
    }
}
