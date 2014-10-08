/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.worker;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Throttler {

    private static final Log log = LogFactory.getLog(Throttler.class);
    
    /**
     * Human readable name of the resource being throttled. 
     * Used for logging only.
     */
    private final String name_;

    /**
     * Used as a circular buffer
     */
    private CircularLongBuffer checkPointTimes_;

    /**
     * Used as an index to a circular buffer
     */
    private long index_;

    /**
     * Interval used to measure the rate. Shorter interval allows less spikey
     * rates.
     */
    private long rateInterval_;

    private long rateIntervalMilliseconds_;

    private long overslept_;

    /**
     * Construct throttler.
     * @param name Human readable name of the resource being throttled. Used for logging only.
     * @param maxRatePerSecond maximum rate allowed
     * @param rateIntervalMilliseconds rate measurement interval. Interval should be at least
     *        1000 / maxRatePerSecond. 
     */
    public Throttler(String name, double maxRatePerSecond, long rateIntervalMilliseconds) {
        if (null == name) {
            throw new IllegalArgumentException("null name");
        }
        name_ = name;
        if (maxRatePerSecond <= 0) {
            throw new IllegalArgumentException("0 or negative maxRatePerSecond");
        }
        if (rateIntervalMilliseconds <= 0) {
            throw new IllegalArgumentException("0 or negative rateIntervalMilliseconds");
        }
        synchronized(this) {
            rateIntervalMilliseconds_ = rateIntervalMilliseconds;
            setMaxRatePerSecond(maxRatePerSecond);
        }
    }

    public synchronized void setMaxRatePerSecond(double maxRatePerSecond) {
        int maxMessagesPerRateInterval = (int) (maxRatePerSecond * rateIntervalMilliseconds_ / 1000);
        if (maxMessagesPerRateInterval == 0) {
            maxMessagesPerRateInterval = 1;
            rateInterval_ =  (long) (1.0 / maxRatePerSecond * 1000.0);
        } else {
            rateInterval_ = rateIntervalMilliseconds_;
        }
        if (checkPointTimes_ != null) {
            int oldSize = checkPointTimes_.size();
            checkPointTimes_ = checkPointTimes_.copy(index_ - maxMessagesPerRateInterval, maxMessagesPerRateInterval);
            index_ = Math.min(checkPointTimes_.size(), oldSize);
        } else {
            checkPointTimes_ = new CircularLongBuffer(maxMessagesPerRateInterval);
            index_ = 0;
        }
        log.debug("new rate=" + maxRatePerSecond + " (msg/sec)");
    }

    public synchronized void throttle(int count) throws InterruptedException {
        for(int i=0; i<count; ++i) {
            throttle();
        }
    }
    
    /**
     * When called on each request sleeps if called faster then configured average rate.
     * @throws InterruptedException when interrupted
     */
    public synchronized void throttle() throws InterruptedException {
        long now = System.currentTimeMillis();
        long checkPoint = checkPointTimes_.get(index_);
        if (checkPoint > 0) {
            long elapsed = now - checkPoint;
            
            // if the time for this window is less than the minimum per window
            if (elapsed >= 0 && elapsed < rateInterval_) {
                long sleepInterval = rateInterval_ - elapsed - overslept_;
                overslept_ = 0;
                if (sleepInterval > 0) {
                    if (log.isTraceEnabled()) {
                        log.debug("Throttling "
                                + name_
                                + ": called "
                                + checkPointTimes_.size()
                                + " times in last "
                                + elapsed
                                + " milliseconds. Going to sleep for "
                                + sleepInterval
                                + " milliseconds.");
                    }
                    long t = System.currentTimeMillis();
                    Thread.sleep(sleepInterval);
                    overslept_ = System.currentTimeMillis() - t - sleepInterval;
                }
            }
        }
        checkPointTimes_.set(index_++, System.currentTimeMillis());
    }
    
}
