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

package com.amazonaws.services.stepfunctions.builder;

import static org.junit.Assert.assertEquals;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class StatesAsserts {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void assertStateMachineMatches(String resourcePath, StateMachine stateMachine) {
        final JsonNode expected = loadExpected(resourcePath);
        assertEquals(expected, serialize(stateMachine));
        assertEquals(expected, serialize(roundTripStateMachine(stateMachine)));
        assertEquals(expected, serialize(roundTripPrettyStateMachine(stateMachine)));
    }

    public static void assertStateMachineMatches(String resourcePathPrefix, String resourceName, StateMachine stateMachine) {
        final JsonNode expected = loadExpected(String.format("%s/%s", resourcePathPrefix, resourceName));
        assertEquals(expected, serialize(stateMachine));
        assertEquals(expected, serialize(roundTripStateMachine(stateMachine)));
        assertEquals(expected, serialize(roundTripPrettyStateMachine(stateMachine)));
    }

    public static void assertJsonEquals(String expected, String actual) {
        try {
            assertEquals(MAPPER.readTree(expected), MAPPER.readTree(actual));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Serializes StateMachine into JSON and deserialize back into a StateMachine from the JSON.
     *
     * @param stateMachine State machine to round trip.
     * @return Round-tripped state machine.
     */
    private static StateMachine roundTripStateMachine(StateMachine stateMachine) {
        return StateMachine.fromJson(stateMachine.toJson()).build();
    }

    /**
     * Serializes StateMachine into pretty formatted JSON and deserialize back into a StateMachine from the JSON.
     *
     * @param stateMachine State machine to round trip.
     * @return Round-tripped state machine.
     */
    private static StateMachine roundTripPrettyStateMachine(StateMachine stateMachine) {
        return StateMachine.fromJson(stateMachine.toPrettyJson()).build();
    }

    private static JsonNode serialize(StateMachine stateMachine) {
        try {
            return MAPPER.readTree(stateMachine.toJson());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static JsonNode loadExpected(String resourcePath) {
        return TestResourceLoader.loadAsJson(resourcePath);
    }
}
