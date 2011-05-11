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
package com.amazonaws.util;

import java.util.HashMap;
import java.util.Map;

public class TimingInfo {
	private final long startTime;
	private long endTime;

	private Map<String, TimingInfo> subMeasurementsByName = new HashMap<String, TimingInfo>();
	private Map<String, Number> countersByName = new HashMap<String, Number>();


	public TimingInfo() {
		this(System.currentTimeMillis(), -1);
	}

	public TimingInfo(long startTime) {
		this(startTime, -1);
	}

	public TimingInfo(long startTime, long endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}


	/**
	 * Returns the time, in epoch milliseconds, at which this timing period started.
	 *
	 * @return the time, in epoch milliseconds, at which this timing period started.
	 */
	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public void addSubMeasurement(String subMeasurementName, TimingInfo timingInfo) {
		subMeasurementsByName.put(subMeasurementName, timingInfo);
	}

	public TimingInfo getSubMeasurement(String subMeasurementName) {
		return subMeasurementsByName.get(subMeasurementName);
	}

	public void addCounter(String key, Number value) {
		countersByName.put(key, value);
	}

	public Number getCounter(String key) {
		return countersByName.get(key);
	}
}