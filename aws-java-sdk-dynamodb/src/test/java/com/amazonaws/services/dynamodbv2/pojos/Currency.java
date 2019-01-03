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

/**
 * A currency object.
 */
public class Currency {
    private KeyAndVal<Double,String> kav;
    public Currency(final Double amount, final String unit) {
        this.kav = new KeyAndVal(amount, unit);
    }
    public Currency() {
        this((Double)null, (String)null);
    }
    public Double getAmount() {
        return kav.getKey();
    }
    public void setAmount(final Double amount) {
        kav.setKey(amount);
    }
    public String getUnit() {
        return kav.getVal();
    }
    public void setUnit(final String unit) {
        kav.setVal(unit);
    }
    @Override
    public final boolean equals(final Object o) {
        return (o == this || (o instanceof Currency && kav.equals(((Currency)o).kav)));
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
