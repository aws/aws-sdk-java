/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.pojos;

/**
 * A phone number object.
 */
public class PhoneNumber {

    private String areaCode;
    private String exchange;
    private String subscriber;

    public PhoneNumber(final String areaCode, final String exchange, final String subscriber) {
        setAreaCode(areaCode);
        setExchange(exchange);
        setSubscriber(subscriber);
    }

    public PhoneNumber() {
        this(null, null, null);
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }

    public String getExchange() {
        return this.exchange;
    }

    public void setExchange(final String exchange) {
        this.exchange = exchange;
    }

    public String getSubscriber() {
        return this.subscriber;
    }

    public void setSubscriber(String subscriber) {
        this.subscriber = subscriber;
    }

    public final boolean areaCodeEquals(final Object o) {
        return (areaCode == o || (areaCode != null && areaCode.equals(o)));
    }

    public final boolean exchangeEquals(final Object o) {
        return (exchange == o || (exchange != null && exchange.equals(o)));
    }

    public final boolean subscriberEquals(final Object o) {
        return (subscriber == o || (subscriber != null && subscriber.equals(o)));
    }

    @Override
    public final boolean equals(final Object o) {
        return (o == this || (o instanceof PhoneNumber && areaCodeEquals(((PhoneNumber)o).areaCode) && exchangeEquals(((PhoneNumber)o).exchange) && subscriberEquals(((PhoneNumber)o).subscriber)));
    }

    @Override
    public final int hashCode() {
        return (1 + (areaCode == null ? 0 : areaCode.hashCode()) + (exchange == null ? 0 : exchange.hashCode()) + (subscriber == null ? 0 : subscriber.hashCode()));
    }

    @Override
    public final String toString() {
        return (getClass().getName() + "{areaCode=" + areaCode + ",exchange=" + exchange + ",subscriber=" + subscriber + "}");
    }

}
