/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import java.io.FilterOutputStream;
import java.io.OutputStream;

import com.amazonaws.util.IOUtils;

/**
 * Base class for AWS Java SDK specific {@link FilterOutputStream}.
 */
public class SdkFilterOutputStream extends FilterOutputStream implements
        MetricAware, Releasable {
    public SdkFilterOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public boolean isMetricActivated() {
        if (out instanceof MetricAware) {
            MetricAware metricAware = (MetricAware)out;
            return metricAware.isMetricActivated();
        }
        return false;
    }

    @Override
    public final void release() {
        // Don't call IOUtils.release(in, null) or else could lead to infinite loop
        IOUtils.closeQuietly(this, null);
        if (out instanceof Releasable) {
            // This allows any underlying stream that has the close operation
            // disabled to be truly released
            Releasable r = (Releasable)out;
            r.release();
        }
    }
}
