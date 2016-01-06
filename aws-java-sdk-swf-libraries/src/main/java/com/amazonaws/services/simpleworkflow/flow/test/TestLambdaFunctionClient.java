/*
 * Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.test;

import com.amazonaws.services.simpleworkflow.flow.DecisionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.LambdaFunctionException;
import com.amazonaws.services.simpleworkflow.flow.LambdaFunctionFailedException;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.worker.LambdaFunctionClient;

public class TestLambdaFunctionClient implements LambdaFunctionClient {
	protected final DecisionContextProvider decisionContextProvider;

	protected TestLambdaFunctionInvoker invoker;

	public TestLambdaFunctionClient() {
		this.decisionContextProvider = new DecisionContextProviderImpl();
	}

	@Override
	public Promise<String> scheduleLambdaFunction(final String name,
			final String input) {
		return scheduleLambdaFunction(name, input,
				FlowConstants.DEFAULT_LAMBDA_FUNCTION_TIMEOUT);
	}

	@Override
	public Promise<String> scheduleLambdaFunction(final String name,
			final Promise<String> input) {
		return scheduleLambdaFunction(name, input,
				FlowConstants.DEFAULT_LAMBDA_FUNCTION_TIMEOUT);
	}

	@Override
	public Promise<String> scheduleLambdaFunction(final String name,
			final Promise<String> input, final long timeoutSeconds) {
		final Settable<String> result = new Settable<String>();
		new Task(input) {

			@Override
			protected void doExecute() throws Throwable {
				result.chain(scheduleLambdaFunction(name, input.get(),
						timeoutSeconds));
			}
		};
		return result;
	}

	@Override
	public Promise<String> scheduleLambdaFunction(String name, String input,
			long timeoutSeconds) {
		final String id = decisionContextProvider.getDecisionContext()
				.getWorkflowClient().generateUniqueId();
		final Settable<String> result = new Settable<String>();
		try {
			result.set(invoker.invoke(name, input, timeoutSeconds));
		} catch (Throwable e) {
			if (e instanceof LambdaFunctionException) {
				throw (LambdaFunctionException) e;
			} else {
				LambdaFunctionFailedException failure = new LambdaFunctionFailedException(
						0, name, id, e.getMessage());
				failure.initCause(e);
				throw failure;
			}
		}
		return result;
	}

	public void setInvoker(TestLambdaFunctionInvoker invoker) {
		this.invoker = invoker;
	}
}
