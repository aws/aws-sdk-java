/*
 * Copyright 2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map.Entry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;

public class JsonErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

	public AmazonServiceException handle(HttpResponse response) throws Exception {
		JSONObject jsonErrorMessage = new JSONObject(readStreamContents(response.getContent()));

		String message = null;
		try {
			message = jsonErrorMessage.getString("message");
		} catch (JSONException jsone) {}

		AmazonServiceException exception = new AmazonServiceException(message);
		exception.setServiceName(response.getRequest().getServiceName());
		if (jsonErrorMessage.getString("__type") != null) {
			String type = jsonErrorMessage.getString("__type");
			int separator = type.lastIndexOf("#");
			if (separator > 0) {
				exception.setErrorCode(type.substring(separator + 1));
			}
		}

		exception.setStatusCode(response.getStatusCode());
		if (response.getStatusCode() < 500) {
			exception.setErrorType(ErrorType.Client);
		} else {
			exception.setErrorType(ErrorType.Service);
		}

		for (Entry<String, String> headerEntry : response.getHeaders().entrySet()) {
			if (headerEntry.getKey().equalsIgnoreCase("X-Amzn-RequestId")) {
				exception.setRequestId(headerEntry.getValue());
			}
		}

		return exception;
	}

	public boolean needsConnectionLeftOpen() {
		return false;
	}


	private String readStreamContents(final InputStream stream) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			StringBuilder sb = new StringBuilder();
			while (true) {
				String line = reader.readLine();
				if (line == null) break;
				sb.append(line);
			}

			return sb.toString();
		} catch (Exception e) {
			try {stream.close();} catch (Exception ex) {}
			throw new AmazonClientException("Unable to read error response: " + e.getMessage(), e);
		}
	}

}