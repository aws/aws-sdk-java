/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
/**
 * A higher-level wrapper for AWS Lambda's Invoke operation. Allows you to
 * model the input and/or output of your Lambda functions as POJOs and
 * transparently invoke operations using your model types.
 * <p>
 * Step 1: Model your function's input and/or output as a set of Java POJOs
 * and/or Exceptions.
 * <p>
 * <code>
 * public class AddRequest {
 *
 *     private final int leftHandSide;
 *     private final int rightHandSide;
 *
 *     public AddRequest(int leftHandSide, int rightHandSide) {
 *         this.leftHandSide = leftHandSide;
 *         this.rightHandSide = rightHandSide;
 *     }
 *
 *     public int getLeftHandSide() {
 *         return leftHandSide;
 *     }
 *
 *     public int getRightHandSide() {
 *         return rightHandSide;
 *     }
 * }
 *
 * public class AddResult {
 *
 *     private int sum;
 *
 *     public int getSum() {
 *         return sum;
 *     }
 *
 *     public void setSum(int sum) {
 *         this.sum = sum;
 *     }
 * }
 *
 * public class OverflowException extends LambdaFunctionException {
 *     public AddException(String message) {
 *         super(message, true, "Overflow");
 *     }
 * }
 * </code>
 * <p>
 * Input types will be automatically converted to JSON to pass to your Lambda
 * function. The JSON response from your function will be converted to the
 * corresponding result type.
 * <p>
 * Step 2: Create an interface representing your function(s).
 * <p>
 * <code>
 * public interface CloudAdder {
 *     @LambdaFunction
 *     AddResult add(AddRequest request) throws OverflowException;
 *
 *     @LambdaFunction(functionName="add", logType=LogType.Tail)
 *     AddResult addWithLogging(AddRequest request) throws OverflowException;
 *
 *     @LambdaFunction(functionName="add", invocationType=InvocationType.Event)
 *     void addLater(AddRequest request);
 * }
 * </code>
 * <p>
 * The {@link LambdaFunction} annotation marks interface methods that
 * correspond to Lambda functions you've defined, and adds some additional
 * metadata about how the functions should be called.
 * <p>
 * Step 3: Instantiate a dynamic implementation of your interface.
 * <p>
 * <code>
 * AWSLambda client = new AWSLambdaClient();
 * client.configureRegion(Regions.US_WEST_2);
 *
 * CloudAdder adder = LambdaInvokerFactory.build(CloudAdder.class, client);
 * </code>
 * <p>
 * The {@link LambdaInvokerFactory} creates a dynamic proxy implementing your
 * interface by making a call to Invoke your Lambda function.
 * <p>
 * Step 4: Invoke a function.
 * <p>
 * <code>
 * try {
 *
 *     AddResult result = adder.add(new AddRequest(2, 2));
 *     Assert.assertEquals(4, result.getSum());
 *
 * } catch (OverflowException ex) {
 *     // Your Lambda function was executed and failed with a handled error.
 * } catch (LambdaFunctionException ex) {
 *     // Your Lambda function was executed and failed with an unhandled
 *     // error.
 * } catch (LambdaSerializationException ex) {
 *     // There was an error serializing your Java object to JSON or
 *     // deserializing the Lambda function's response to a Java object.
 * } catch (AmazonServiceException ex) {
 *     // AWS Lambda was unable to execute your function (ie because the
 *     // function does not exist).
 * } catch (AmazonClientException ex) {
 *     // There was a network error contacting AWS Lambda.
 * }
 * </code>
 */
package com.amazonaws.services.lambda.invoke;

