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
package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.util.TimingInfo;

/**
 * @deprecated by {@link RequestHandler2}.
 * <p>
 * Simple implementation of RequestHandler to stub out required methods.
 */
@Deprecated
public abstract class AbstractRequestHandler implements RequestHandler {
	public void beforeRequest(Request<?> request) {}
	public void afterResponse(Request<?> request, Object response, TimingInfo timingInfo) {}
	public void afterError(Request<?> request, Exception e) {}
}
