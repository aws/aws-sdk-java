/*
 * Copyright 2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import org.joda.time.DateTime;

import com.amazonaws.AmazonServiceException.ErrorType;

/**
 * A singleton object that allows for computationally cheap accesses to various
 * limits imposed by the AWS infrastructure. If the value for some limit is not
 * known at the time of the call, a query is made to the AWS backend, and the
 * value subsequently cached and returned. Caching of results means that queries
 * should be made only as often as required.
 *
 * @author Lars Larsson <lars.larsson@elastisys.com>
 */
public enum InfrastructureLimits {
	/**
	 * Singleton instance of {@link InfrastructureLimits}.
	 */
	INSTANCE;

	/*
	 * TODO Want constant values here for a simple implementation that never
	 * queries the backend? Put them in in the constructor, and set the
	 * expiration time for Long.MAX_VALUE milliseconds since the epoch.
	 */
	private final ConcurrentMap<Limits, Future<CachedValue<Long>>> cache = new ConcurrentHashMap<Limits, Future<CachedValue<Long>>>();

	private InfrastructureLimits() {
		// nothing to do here, unless we want "eternal" values in the cache...
	}

	/**
	 * Limits imposed by the AWS infrastructure.
	 *
	 * @author Lars Larsson <lars.larsson@elastisys.com>
	 */
	public enum Limits {
		/**
		 * The number of values permissible for a single filter.
		 */
		FilterValueCount, //
		/**
		 * The max number of queries permissible against the infrastructure.
		 */
		QueriesPerSecond; // TODO Add all limits that need to be supported here!
	}

	/**
	 * Returns the value for the given limit. If the value is not known at the
	 * time of the call, a query is made to the AWS backend, and the value
	 * subsequently cached and returned. Caching of results means that queries
	 * should be made only as often as required.
	 * <p>
	 * The code within is adapted from the thread-safe and well-performing
	 * Memoizer class in "Java Concurrency in Practice", Chapter 5, by Brian
	 * Goetz (with Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, and
	 * Doug Lea).
	 * </p>
	 *
	 * @param limit
	 *            The limit of interest.
	 * @return The value of the specified.
	 */
	public Long getLimit(Limits limit) {
		while (true) {
			Future<CachedValue<Long>> cachedValue = this.cache.get(limit);

			if (cachedValue == null) {
				Callable<CachedValue<Long>> valueFetcher = new Callable<CachedValue<Long>>() {
					@Override
					public CachedValue<Long> call() throws Exception {
						// TODO make request to currently non-existing API!
						return null; // FIXME Return actual result
					}
				};
				FutureTask<CachedValue<Long>> ft = new FutureTask<CachedValue<Long>>(
						valueFetcher);
				cachedValue = this.cache.putIfAbsent(limit, ft);
				if (cachedValue == null) {
					cachedValue = ft;
					ft.run();
				}
			}

			try {
				CachedValue<Long> value = cachedValue.get();
				if (value.getExpirationTime().isBeforeNow()) {
					return value.getValue();
				} else {
					this.cache.remove(limit);
				}
			} catch (CancellationException e) {
				this.cache.remove(limit);
			} catch (ExecutionException e) {
				AmazonServiceException serviceException = new AmazonServiceException(
						"Failed to query AWS for limit value of " + limit, e);
				serviceException.setErrorType(ErrorType.Service);
				throw serviceException;
			} catch (InterruptedException e) {
				AmazonServiceException serviceException = new AmazonServiceException(
						"Failed to query AWS for limit value of due to interruption "
								+ limit, e);
				serviceException.setErrorType(ErrorType.Client);
				throw serviceException;
			}
		}
	}

	/**
	 * Represents a value that is only valid until some expiration time has
	 * passed.
	 *
	 * @author Lars Larsson <lars.larsson@elastisys.com>
	 */
	private final class CachedValue<T> {
		private final DateTime expirationTime;
		private final T value;

		/**
		 * @return The cache expiration time.
		 */
		public DateTime getExpirationTime() {
			return this.expirationTime;
		}

		/**
		 * @return The cached value.
		 */
		public T getValue() {
			return this.value;
		}

		/**
		 * Creates a new instance with the given expiration time and associated
		 * value.
		 *
		 * @param expirationTime
		 *            The expiration time.
		 * @param value
		 *            The value.
		 */
		public CachedValue(DateTime expirationTime, T value) {
			this.expirationTime = expirationTime;
			this.value = value;
		}
	}
}
