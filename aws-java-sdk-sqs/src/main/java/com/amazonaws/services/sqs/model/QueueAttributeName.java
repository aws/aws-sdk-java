/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.sqs.model;

/**
 * 
 */
public enum QueueAttributeName {

	All,
	Policy,
	VisibilityTimeout,
	MaximumMessageSize,
	MessageRetentionPeriod,
	ApproximateNumberOfMessages,
	ApproximateNumberOfMessagesNotVisible,
	CreatedTimestamp,
	LastModifiedTimestamp,
	QueueArn,
	ApproximateNumberOfMessagesDelayed,
	DelaySeconds,
	ReceiveMessageWaitTimeSeconds,
	RedrivePolicy;

	/**
	 * Use this in place of valueOf.
	 *
	 * @param value
	 *        real value
	 * @return QueueAttributeName corresponding to the value
	 */
	public static QueueAttributeName fromValue(final String value) {
		if (value == null || "".equals(value)) {
			throw new IllegalArgumentException("Value cannot be null or empty!");
		}

		for (final QueueAttributeName queueAttributeName : values()) {
			if (queueAttributeName.name().equals(value)) {
				return queueAttributeName;
			}
		}

		throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
	}
}
