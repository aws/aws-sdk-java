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

import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.branch;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.catcher;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choice;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choiceState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.end;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.eq;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.failState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.gte;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.next;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.parallelState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.passState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.retrier;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.seconds;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.secondsPath;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.stateMachine;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.succeedState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.timestamp;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.timestampPath;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.waitState;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClient;
import com.amazonaws.services.stepfunctions.AWSStepFunctions;
import com.amazonaws.services.stepfunctions.AWSStepFunctionsClient;
import com.amazonaws.services.stepfunctions.builder.states.ChoiceState;
import com.amazonaws.services.stepfunctions.builder.states.FailState;
import com.amazonaws.services.stepfunctions.builder.states.ParallelState;
import com.amazonaws.services.stepfunctions.builder.states.WaitState;
import com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest;
import com.amazonaws.services.stepfunctions.model.CreateStateMachineResult;
import com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest;
import com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest;
import com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult;
import com.amazonaws.test.AWSIntegrationTestBase;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StepFunctionBuilderIntegrationTest extends AWSIntegrationTestBase {

    /**
     * Dummy date so we have a fixed time for comparison.
     */
    private static final Date THE_FUTURE = new Date(4118625810000L);

    private static final String STATE_MACHINE_NAME = "java-sdk-integ-" + System.currentTimeMillis();
    private AWSStepFunctions client;
    private String stateMachineArn;
    private String roleArn;

    @Before
    public void setup() {
        AWSStaticCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(getCredentials());
        client = AWSStepFunctionsClient.builder()
                                       .withCredentials(credentialsProvider)
                                       .build();
        AmazonIdentityManagement iam = AmazonIdentityManagementClient.builder()
                                                                     .withCredentials(credentialsProvider)
                                                                     .build();
        // Any role will do, we aren't actually executing the state machine
        roleArn = iam.listRoles().getRoles().get(0).getArn();

    }

    @After
    public void tearDown() {
        client.deleteStateMachine(new DeleteStateMachineRequest()
                                      .withStateMachineArn(stateMachineArn));
    }

    @Test
    public void rountripStateMachine() {
        StateMachine stateMachine =
            stateMachine().state("ParallelState", testParallelState())
                          .state("WaitForTimestamp", testWaitForTimestamp())
                          .state("WaitForTimestampPath", testWaitForTimestampPath())
                          .state("WaitForSeconds", testWaitForSeconds())
                          .state("WaitForSecondsPath", testWaitForSecondsPath())
                          .state("ChoiceState", testChoiceState())
                          .state("FailState", testFailState())
                          .state("PassState", passState().transition(next("EndState")))
                          .state("EndState", succeedState())
                          .startAt("ParallelState")
                          .build();
        CreateStateMachineResult createResult = client.createStateMachine(
            new CreateStateMachineRequest().withName(STATE_MACHINE_NAME)
                                           .withRoleArn(roleArn)
                                           .withDefinition(stateMachine));
        stateMachineArn = createResult.getStateMachineArn();

        DescribeStateMachineResult describeResult = client.describeStateMachine(
            new DescribeStateMachineRequest().withStateMachineArn(stateMachineArn));
        StatesAsserts.assertStateMachineMatches("IntegrationTestStateMachine.json",
                                                stateMachine);
        StatesAsserts.assertStateMachineMatches("IntegrationTestStateMachine.json",
                                                StateMachine.fromJson(describeResult.getDefinition()).build());
    }

    private ParallelState.Builder testParallelState() {
        return parallelState().parameters("\"foo\"")
                              .resultPath("$.parallel.result")
                              .inputPath("$.parallel.input")
                              .outputPath("$.parallel.output")
                              .transition(next("WaitForTimestamp"))
                              .catcher(catcher().transition(next("EndState"))
                                                .resultPath("$.catcher.result")
                                                .catchAll())
                              .retrier(retrier()
                                           .retryOnAllErrors()
                                           .backoffRate(1.2)
                                           .maxAttempts(3)
                                           .intervalSeconds(5))
                              .comment("This is a parallel state")
                              .branch(branch().comment("Branch One")
                                              .state("BranchOneStart", succeedState()
                                                  .inputPath("$.succeed.input")
                                                  .outputPath("$.succeed.output")
                                                  .comment("Succeed state"))
                                              .startAt("BranchOneStart"))
                              .branch(branch().comment("Branch Two")
                                              .state("BranchTwoStart", passState()
                                                  .inputPath("$.pass.input")
                                                  .outputPath("$.pass.output")
                                                  .parameters("{\"foo\": \"bar\"}")
                                                  .result(new SimplePojo("value"))
                                                  .transition(next("BranchTwoEnd"))
                                                  .comment("Pass state"))
                                              .state("BranchTwoEnd", passState()
                                                  .transition(end())
                                                  .comment("This is the final state of branch two"))
                                              .startAt("BranchTwoStart"));
    }

    private WaitState.Builder testWaitForTimestamp() {
        return waitState().waitFor(timestamp(THE_FUTURE))
                          .transition(next("WaitForTimestampPath"))
                          .inputPath("$.wait.input")
                          .outputPath("$.wait.output")
                          .comment("Wait for timestamp");
    }

    private WaitState.Builder testWaitForTimestampPath() {
        return waitState().waitFor(timestampPath("$.timestamp"))
                          .transition(next("WaitForSeconds"));
    }

    private WaitState.Builder testWaitForSeconds() {
        return waitState().waitFor(seconds(60))
                          .transition(next("WaitForSecondsPath"));
    }

    private WaitState.Builder testWaitForSecondsPath() {
        return waitState().waitFor(secondsPath("$.seconds"))
                          .transition(next("ChoiceState"));
    }

    private ChoiceState.Builder testChoiceState() {
        return choiceState().defaultStateName("EndState")
                            .inputPath("$.choice.input")
                            .outputPath("$.choice.output")
                            .comment("This is a choice state")
                            .choice(choice().condition(eq("$.foo", "bar"))
                                            .transition(next("FailState")))
                            .choice(choice().condition(gte("$.bar", 42))
                                            .transition(next("PassState")));
    }

    private FailState.Builder testFailState() {
        return failState().error("FooError")
                          .cause("Some Cause")
                          .comment("This is a fail state");
    }
}
