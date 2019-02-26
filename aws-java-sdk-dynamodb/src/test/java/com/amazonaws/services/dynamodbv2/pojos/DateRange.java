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
package com.amazonaws.services.dynamodbv2.pojos;

import java.util.Date;

/**
 * A date range object.
 */
public class DateRange {
    private KeyAndVal<Date,Date> kav;
    public DateRange(final Date start, final Date end) {
        this.kav = new KeyAndVal(start, end);
    }
    public DateRange(final Date date, final Long start, final Long end) {
        this(start == null ? null : new Date(date.getTime() + start), end == null ? null : new Date(date.getTime() + end));
    }
    public DateRange() {
        this((Date)null, (Date)null);
    }
    public Date getStart() {
        return kav.getKey();
    }
    public void setStart(final Date start) {
        kav.setKey(start);
    }
    public Date getEnd() {
        return kav.getVal();
    }
    public void setEnd(final Date end) {
        kav.setVal(end);
    }
    @Override
    public final boolean equals(final Object o) {
        return (o == this || (o instanceof DateRange && kav.equals(((DateRange)o).kav)));
    }
    @Override
    public final int hashCode() {
        return kav.hashCode();
    }
    @Override
    public final String toString() {
        return kav.toString();
    }
}
