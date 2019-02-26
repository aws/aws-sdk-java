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
package com.amazonaws.services.s3.model;
import java.io.Serializable;

/**
 * A container for describing a condition that must be met for the specified
 * redirect to apply. For example if request is for pages in the /docs folder,
 * redirect to the /documents folder or if request results in HTTP error 4xx,
 * redirect request to another host where you might process the error.
 */
public class RoutingRuleCondition implements Serializable {

	/**
	 * The object key name prefix when the redirect is applied. For example, to
	 * redirect requests for ExamplePage.html, the key prefix will be
	 * ExamplePage.html. To redirect request for all pages with the prefix
	 * docs/, the key prefix will be /docs, which identifies all objects in the
	 * docs/ folder.
	 */
	String keyPrefixEquals;

	/**
	 * The HTTP error code when the redirect is applied. In the event of an
	 * error, if the error code equals this value, then the specified redirect
	 * is applied.
	 */
	String httpErrorCodeReturnedEquals;

	/**
	 * Set the object key name prefix when the redirect is applied.
	 */
	public void setKeyPrefixEquals(String keyPrefixEquals) {
		this.keyPrefixEquals = keyPrefixEquals;
	}

	/**
	 * Return the object key name prefix when the redirect is applied.
	 */
	public String getKeyPrefixEquals() {
		return keyPrefixEquals;
	}

	/**
	 * Set the object key name prefix when the redirect is applied and returns a
	 * reference to this object(RoutingRuleCondition) for method chaining.
	 */
	public RoutingRuleCondition withKeyPrefixEquals(String keyPrefixEquals) {
		setKeyPrefixEquals(keyPrefixEquals);
		return this;
	}

	/**
	 * Set the HTTP error code when the redirect is applied.
	 */
	public void setHttpErrorCodeReturnedEquals(
			String httpErrorCodeReturnedEquals) {
		this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
	}

	/**
	 * Return the HTTP error code when the redirect is applied.
	 */
	public String getHttpErrorCodeReturnedEquals() {
		return httpErrorCodeReturnedEquals;
	}

	/**
	 * Set the HTTP error code when the redirect is applied and returns a
	 * reference to this object(RoutingRuleCondition) for method chaining.
	 */
	public RoutingRuleCondition withHttpErrorCodeReturnedEquals(
			String httpErrorCodeReturnedEquals) {
		setHttpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals);
		return this;
	}
}
