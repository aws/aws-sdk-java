/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.metrics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.amazonaws.util.AWSRequestMetrics.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class AwsSdkMetricsTest {
    /**
     * By default the AWS SDK metric collection is disabled. Enabling it should
     * fail unless the necessary CloudWatch related jars are on the classpath.
     * Therefore, this test is expected to fail in enabling the default metric
     * collection, but have absolutely no impact otherwise.
     */
    @Test
    public void enableDefaultMetrics() {
        Assert.assertFalse(AwsSdkMetrics.enableDefaultMetrics());
    }

    @Test
    public void test() {
        // by default, it's disabled
        assertFalse(AwsSdkMetrics.isDefaultMetricsEnabled());
        // won't be anble to enable unless the default impl library is on the classpath
        assertFalse(AwsSdkMetrics.enableDefaultMetrics());
        assertFalse(AwsSdkMetrics.isDefaultMetricsEnabled());
        assertSame(RequestMetricCollector.NONE, AwsSdkMetrics.getRequestMetricCollector());
        assertFalse(AwsSdkMetrics.isDefaultMetricsEnabled());
        // effectively no effect
        AwsSdkMetrics.disableMetrics();
        assertFalse(AwsSdkMetrics.isDefaultMetricsEnabled());
    }

    @Test
    public void defaultMetricTypes() {
        // Default set of predefined metric types is not empty
        Set<MetricType> set = AwsSdkMetrics.getPredefinedMetrics();
        assertNotNull(set);
        assertTrue(set.size() > 0);
        // Clear out the default set of predefined metric types
        AwsSdkMetrics.set(Collections.<MetricType>emptyList());
        Set<MetricType> empty = AwsSdkMetrics.getPredefinedMetrics();
        assertNotNull(empty);
        assertTrue(empty.size() == 0);
        // Reconfigure the default set of predefined metric types back to the original
        AwsSdkMetrics.set(set);
        Set<MetricType> set2 = AwsSdkMetrics.getPredefinedMetrics();
        assertNotNull(set2);
        assertTrue(set2.size() > 0);
        // Not the same due to ensuring thread-safety
        assertNotSame(set, set2);
    }

    @Test
    public void setNullOrEmpty() {
        Set<MetricType> orig = AwsSdkMetrics.getPredefinedMetrics();
        assertTrue(orig.size() > 0);
        AwsSdkMetrics.set(null);
        Set<MetricType> empty = AwsSdkMetrics.getPredefinedMetrics();
        assertTrue(empty.size() == 0);
        AwsSdkMetrics.set(null);
        Set<MetricType> stillEmpty = AwsSdkMetrics.getPredefinedMetrics();
        assertSame(empty, stillEmpty);
        AwsSdkMetrics.set(Collections.<MetricType>emptySet());
        Set<MetricType> empty3 = AwsSdkMetrics.getPredefinedMetrics();
        assertSame(empty, empty3);
        AwsSdkMetrics.set(orig);
    }
    @Test
    public void addNull() {
        assertFalse(AwsSdkMetrics.add(null));
    }
    @Test
    public void addAllNull() {
        assertFalse(AwsSdkMetrics.addAll(null));
        assertFalse(AwsSdkMetrics.addAll(Collections.<MetricType>emptyList()));
    }
    @Test
    public void removeNull() {
        assertFalse(AwsSdkMetrics.remove(null));
    }

    @Test
    public void addAndRemove() {
        Set<MetricType> orig = AwsSdkMetrics.getPredefinedMetrics();
        AwsSdkMetrics.set(null);
        // Test add and remove
        assertTrue(AwsSdkMetrics.getPredefinedMetrics().isEmpty());
        AwsSdkMetrics.add(Field.ClientExecuteTime);
        assertFalse(AwsSdkMetrics.getPredefinedMetrics().isEmpty());
        AwsSdkMetrics.remove(Field.ClientExecuteTime);
        assertTrue(AwsSdkMetrics.getPredefinedMetrics().isEmpty());
        // Test add more than one entry
        AwsSdkMetrics.add(Field.ClientExecuteTime);
        AwsSdkMetrics.add(Field.Exception);
        assertTrue(AwsSdkMetrics.getPredefinedMetrics().size() == 2);
        AwsSdkMetrics.set(null);
        assertTrue(AwsSdkMetrics.getPredefinedMetrics().isEmpty());
        // Test addAll
        AwsSdkMetrics.addAll(Arrays.asList(Field.Exception, Field.ClientExecuteTime));
        assertTrue(AwsSdkMetrics.getPredefinedMetrics().size() == 2);
        AwsSdkMetrics.set(orig);
        assertTrue(AwsSdkMetrics.getPredefinedMetrics().size() == orig.size());
    }

    @Test
    public void setJvmMetricsExcluded() {
        final boolean b = AwsSdkMetrics.isMachineMetricExcluded();
        AwsSdkMetrics.setMachineMetricsExcluded(b);
        assertTrue(b == AwsSdkMetrics.isMachineMetricExcluded());
        AwsSdkMetrics.setMachineMetricsExcluded(!b);
        assertFalse(b == AwsSdkMetrics.isMachineMetricExcluded());
        AwsSdkMetrics.setMachineMetricsExcluded(b);
        assertTrue(b == AwsSdkMetrics.isMachineMetricExcluded());
    }

    @Test
    public void setPerHostMetricsIncluded() {
        final boolean b = AwsSdkMetrics.isPerHostMetricIncluded();
        AwsSdkMetrics.setPerHostMetricsIncluded(b);
        assertTrue(b == AwsSdkMetrics.isPerHostMetricIncluded());
        AwsSdkMetrics.setPerHostMetricsIncluded(!b);
        assertFalse(b == AwsSdkMetrics.isPerHostMetricIncluded());
        AwsSdkMetrics.setPerHostMetricsIncluded(b);
        assertTrue(b == AwsSdkMetrics.isPerHostMetricIncluded());
    }

    @Test
    public void testEnableHttpSocketReadMetric() {
        assertFalse(AwsSdkMetrics.isHttpSocketReadMetricEnabled());
        AwsSdkMetrics.enableHttpSocketReadMetric();
        assertTrue(AwsSdkMetrics.isHttpSocketReadMetricEnabled());
    }

    @Test
    public void isMetricEnabled() {
        // originally disabled
        assertFalse(AwsSdkMetrics.isMetricsEnabled());
        // set to NONE, so still disabled
        AwsSdkMetrics.setMetricCollector(MetricCollector.NONE);
        assertFalse(AwsSdkMetrics.isMetricsEnabled());
        // set to a custom collector, so now considered enabled
        AwsSdkMetrics.setMetricCollector(new MetricCollector() {
            @Override public boolean start() { return true; }
            @Override public boolean stop() { return false; }
            @Override public boolean isEnabled() { return true; }
            @Override
            public RequestMetricCollector getRequestMetricCollector() {
                return RequestMetricCollector.NONE;
            }
            @Override
            public ServiceMetricCollector getServiceMetricCollector() {
                return ServiceMetricCollector.NONE;
            }
        });
        assertTrue(AwsSdkMetrics.isMetricsEnabled());
    }

    @Test
    public void setRegion_WithoutRegionsEnum() {
        AwsSdkMetrics.setRegion("us-east-1");
        assertTrue(AwsSdkMetrics.getRegionName().equals("us-east-1"));
    }

    @Test
    public void setRegion_WithNonStandardRegion() {
        AwsSdkMetrics.setRegion("us-east-9");
        assertTrue(AwsSdkMetrics.getRegionName().equals("us-east-9"));
    }

    @Test
    public void setRegions_WhenRegionDoesNotExist_DefaultsToAwsPartition() {
        AwsSdkMetrics.setRegion("non-existent-region");
        assertEquals("non-existent-region", AwsSdkMetrics.getRegionName());
    }

}
