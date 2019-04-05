/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.stepfunctions.builder.StatesAsserts.assertJsonEquals;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.end;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.parallelState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.passState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.taskState;

import com.amazonaws.services.stepfunctions.builder.states.ParallelState;
import com.amazonaws.services.stepfunctions.builder.states.PassState;
import com.amazonaws.services.stepfunctions.builder.states.TaskState;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Tests various builders that accept a raw JSON string or POJO to be serialized as JSON. This includes
 * {@link PassState} which has a JSON result object, and PassState, {@link ParallelState}, and {@link TaskState} which
 * accepts JSON for the Parameters field.
 */
@RunWith(Parameterized.class)
public class JsonDocumentSettersTest {

    /**
     * Interface to parameterize the test with different states and fields.
     */
    public interface Handler {

        /**
         * Sets the raw JSON string representing the document.
         *
         * @param json JSON document.
         * @return Roundtripped value (builds the state and calls the appropriate getter).
         */
        String setString(String json);

        /**
         * Sets the POJO object representing the document.
         *
         * @param pojo Object to be serialized into JSON.
         * @return Roundtripped value (builds the state and calls the appropriate getter).
         */
        String setPojo(Object pojo);

    }

    /**
     * @return The collection of test objects to run.
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {
                // PassState#result
                new Handler() {

                    @Override
                    public String setString(String json) {
                        return build(newPassState().result(json));
                    }

                    @Override
                    public String setPojo(Object pojo) {
                        return build(newPassState().result(pojo));
                    }

                    private String build(PassState.Builder result) {
                        return result.build().getResult();
                    }

                }
            },
            // PassState#parameters
            {
                new Handler() {

                    @Override
                    public String setString(String json) {
                        return build(newPassState().parameters(json));
                    }

                    @Override
                    public String setPojo(Object pojo) {
                        return build(newPassState().parameters(pojo));
                    }

                    private String build(PassState.Builder result) {
                        return result.build().getParameters();
                    }
                }
            },
            // TaskState#parameters
            {
                new Handler() {

                    @Override
                    public String setString(String json) {
                        return build(newTaskState().parameters(json));
                    }

                    @Override
                    public String setPojo(Object pojo) {
                        return build(newTaskState().parameters(pojo));
                    }

                    private String build(TaskState.Builder result) {
                        return result.build().getParameters();
                    }
                }
            },
            // ParallelState#parameters
            {
                new Handler() {

                    @Override
                    public String setString(String json) {
                        return build(newParallelState().parameters(json));
                    }

                    @Override
                    public String setPojo(Object pojo) {
                        return build(newParallelState().parameters(pojo));
                    }

                    private String build(ParallelState.Builder result) {
                        return result.build().getParameters();
                    }
                }
            }
        });
    }

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private final Handler handler;

    public JsonDocumentSettersTest(Handler handler) {
        this.handler = handler;
    }

    @Test
    public void setString_ValidJson_ReturnsJsonResult() {
        String strResult = "{\"Foo\": \"Bar\"}";
        assertJsonEquals(strResult, handler.setString(strResult));
    }

    @Test
    public void setString_JsonArray_ReturnsJsonResult() {
        String strResult = "[42, \"foo\", {}]";
        assertJsonEquals(strResult, handler.setString(strResult));
    }

    @Test
    public void setString_JsonPrimitive_ReturnsJsonResult() {
        String strResult = "true";
        assertJsonEquals(strResult, handler.setString(strResult));
    }

    @Test
    public void setString_JsonNull_ReturnsJsonResult() {
        String strResult = "null";
        assertJsonEquals(strResult, handler.setString(strResult));
    }

    @Test
    public void setPojo_ValidPojo_ReturnsJsonResult() {
        SimplePojo pojo = new SimplePojo("value");
        assertJsonEquals("{\"foo\": \"value\"}", handler.setPojo(pojo));
    }

    @Test(expected = Exception.class)
    public void setString_MalformedJson_ThrowsException() {
        handler.setString("{");
    }

    @Test
    public void setPojo_PojoWithJacksonAnnotations_IgnoresAnnotations() {
        PojoWithJacksonAnnotations pojo = new PojoWithJacksonAnnotations();
        pojo.setFoo("FooValue");
        pojo.setBar("BarValue");
        pojo.baz = "BazValue";
        assertJsonEquals("{\"foo\": \"FooValue\", \"bar\": \"BarValue\"}", handler.setPojo(pojo));
    }

    private static PassState.Builder newPassState() {
        return passState().transition(end());
    }

    private static TaskState.Builder newTaskState() {
        return taskState().transition(end());
    }

    private static ParallelState.Builder newParallelState() {
        return parallelState().transition(end());
    }
}
