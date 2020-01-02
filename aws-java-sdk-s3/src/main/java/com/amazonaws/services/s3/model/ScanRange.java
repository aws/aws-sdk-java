/*
 * Copyright 2019-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/*
 * Class describing a _single_ byte range corresponding to RFC 2616 (Section 14.35.1):
 * https://tools.ietf.org/html/rfc2616#section-14.35.1
 */
public class ScanRange implements Serializable, Cloneable {
    private Long start = null;
    private Long end = null;

    public Long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public ScanRange withStart(long start) {
        this.start = start;
        return this;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public ScanRange withEnd(long end) {
        this.end = end;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(',');
        if (getEnd() != null)
            sb.append("End: ").append(getEnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return hashCode;
    }

    @Override
    public ScanRange clone() {
        try {
            return (ScanRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
