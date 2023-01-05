/*
 * Copyright 2011-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.internal;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class TokenBucketTest {

    @Test
    public void acquire_notEnabled_returnsTrue() {
        TokenBucket tb = new TokenBucket();
        assertThat(tb.acquire(0.0), equalTo(true));
    }

    @Test
    public void acquire_capacitySufficient_returnsImmediately() {
        TokenBucket tb = Mockito.spy(new TokenBucket());

        // stub out refill() so we have control over the capacity
        Mockito.doAnswer(new Answer() {
            @Override
            public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
                return null;
            }
        }).when(tb).refill();

        tb.setFillRate(0.5);
        tb.setCurrentCapacity(1000.0);
        tb.enable();

        boolean acquired = tb.acquire(1000.0);

        assertThat(acquired, equalTo(true));
        Mockito.verify(tb, Mockito.never()).sleep(Mockito.anyDouble());
    }

    @Test
    public void acquire_capacityInsufficient_sleepsForRequiredTime() {
        TokenBucket tb = Mockito.spy(new TokenBucket());

        // stub out refill() so we have control over the capacity
        Mockito.doAnswer(new Answer() {
            @Override
            public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
                return null;
            }
        }).when(tb).refill();

        tb.setFillRate(1.0);
        tb.setCurrentCapacity(0.0);
        tb.enable();

        // 1 token to wait for at a rate of 1 per second should sleep for approx 1s
        long a = System.nanoTime();
        boolean acquired = tb.acquire(1);
        long elapsed = System.nanoTime() - a;

        assertThat(acquired, equalTo(true));
        assertThat(TimeUnit.NANOSECONDS.toSeconds(elapsed), equalTo(1L));
        assertThat(tb.getCurrentCapacity(), equalTo(-1.0));
    }

    @Test
    public void acquire_amountGreaterThanNonZeroPositiveCapacity_setsNegativeCapacity() {
        TokenBucket tb = Mockito.spy(new TokenBucket());

        // stub out sleep(), since we do not want to wait for sleep time.
        Mockito.doAnswer(new Answer() {
            @Override
            public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
                return null;
            }
        }).when(tb).sleep(90);

        tb.setFillRate(1.0);
        tb.setCurrentCapacity(11.0);
        tb.enable();

        boolean acquired = tb.acquire(101);
        assertThat(acquired, equalTo(true));
        assertThat(tb.getCurrentCapacity(), equalTo(-90.0));
    }

    @Test
    public void acquire_amountGreaterThanNegativeCapacity_setsNegativeCapacity() {
        TokenBucket tb = Mockito.spy(new TokenBucket());

        // stub out sleep(), since we do not want to wait for sleep time.
        Mockito.doAnswer(new Answer() {
            @Override
            public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
                return null;
            }
        }).when(tb).sleep(3);

        tb.setFillRate(1.0);
        tb.setCurrentCapacity(-1.0);
        tb.enable();

        boolean acquired = tb.acquire(2);
        assertThat(acquired, equalTo(true));
        assertThat(tb.getCurrentCapacity(), equalTo(-3.0));
    }

    @Test
    public void acquire_capacityInsufficient_fastFailEnabled_doesNotSleep() {
        TokenBucket tb = Mockito.spy(new TokenBucket());

        // stub out refill() so we have control over the capacity
        Mockito.doAnswer(new Answer() {
            @Override
            public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
                return null;
            }
        }).when(tb).refill();

        tb.setFillRate(1.0);
        tb.setCurrentCapacity(4.0);
        tb.enable();

        long a = System.nanoTime();
        boolean acquired = tb.acquire(5, true);
        long elapsed = System.nanoTime() - a;

        assertThat(acquired, equalTo(false));
        assertThat(tb.getCurrentCapacity(), equalTo(4.0));
        // The method call should be nowhere near a millisecond
        assertThat(TimeUnit.NANOSECONDS.toSeconds(elapsed), equalTo(0L));
    }

    @Test
    public void tryAcquireCapacity_capacitySufficient_returns0() {
        TokenBucket tb = new TokenBucket();
        tb.setCurrentCapacity(5.0);

        assertThat(tb.tryAcquireCapacity(5.0), equalTo(0.0));
        assertThat(tb.getCurrentCapacity(), equalTo(0.0));
    }

    @Test
    public void tryAcquireCapacity_amountGreaterThanCapacity_setsNegativeCapacity() {
        TokenBucket tb = new TokenBucket();
        tb.setCurrentCapacity(5.0);

        assertThat(tb.tryAcquireCapacity(8.0), equalTo(3.0));
        assertThat(tb.getCurrentCapacity(), equalTo(-3.0));
    }

    @Test
    public void tryAcquireCapacity_capacityInsufficient_returnsDifference() {
        TokenBucket tb = new TokenBucket();
        tb.setCurrentCapacity(3.0);

        assertThat(tb.tryAcquireCapacity(5.0), equalTo(2.0));
    }
}
