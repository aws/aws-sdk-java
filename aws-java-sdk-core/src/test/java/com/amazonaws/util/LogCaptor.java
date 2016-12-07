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

package com.amazonaws.util;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * A test utility that allows inspection of log statements
 * during testing.
 * <p>
 * Can either be used stand-alone for example
 * <pre><code>
 *     private LogCaptor logCaptor = new LogCaptor.DefaultLogCaptor(Level.INFO);
 *     // Do stuff that you expect to log things
 *     assertThat(logCaptor.loggedEvents(), is(not(empty())));
 * </code></pre>
 * <p>
 * Or can extend it to make use of @Before / @After test annotations
 * <p>
 * <pre><code>
 *     class MyTestClass extends LogCaptor.LogCaptorTestBase {
 *         {@literal @}Test
 *         public void someTestThatWeExpectToLog() {
 *             // Do stuff that you expect to log things
 *             assertThat(loggedEvents(), is(not(empty())));
 *         }
 *     }
 * </code></pre>
 */

public interface LogCaptor {

    List<LoggingEvent> loggedEvents();

    void clear();

    class LogCaptorTestBase extends DefaultLogCaptor {
        public LogCaptorTestBase() {
            super(Level.ALL);
        }

        @Before
        public void setupLogging() {
            super.setupLogging();
        }

        @After
        public void stopLogging() {
            super.stopLogging();
        }
    }

    class DefaultLogCaptor extends AppenderSkeleton implements LogCaptor {

        private final List<LoggingEvent> loggedEvents = new ArrayList<LoggingEvent>();
        private final Level originalLoggingLevel = Logger.getRootLogger().getLevel();
        private final Level levelToCapture;

        public DefaultLogCaptor(Level levelToCapture) {
            super();
            this.levelToCapture = levelToCapture;
            setupLogging();
        }

        @Override
        public void finalize() {
            super.finalize();
            stopLogging();
        }

        @Override
        public List<LoggingEvent> loggedEvents() {
            return new ArrayList<LoggingEvent>(loggedEvents);
        }

        @Override
        public void clear() {
            loggedEvents.clear();
        }

        protected void setupLogging() {
            loggedEvents.clear();
            Logger.getRootLogger().addAppender(this);
            Logger.getRootLogger().setLevel(levelToCapture);
        }

        protected void stopLogging() {
            Logger.getRootLogger().removeAppender(this);
            Logger.getRootLogger().setLevel(originalLoggingLevel);
        }

        @Override
        protected void append(LoggingEvent loggingEvent) {
            loggedEvents.add(loggingEvent);
        }

        @Override
        public boolean requiresLayout() { return false; }

        @Override
        public void close() { }
    }
}
