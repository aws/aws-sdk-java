/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.xspec;

import com.amazonaws.annotation.Immutable;

@Immutable
final class ArrayIndexElement extends PathElement {

    private final int index;

    public ArrayIndexElement(int index) {
        if (index < 0) {
            throw new IllegalArgumentException(
                    "Invalid array index: " + index);
        }
        this.index = index;
    }

    @Override
    public String toString() {
        return "[" + index + "]";
    }

    @Override
    public int hashCode() {
        return index;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArrayIndexElement)) {
            return false;
        }

        return (index == ((ArrayIndexElement) obj).index);
    }

    @Override
    String asNestedPath() {
        return "[" + index + "]";
   }
   
    @Override
    String asToken(SubstitutionContext context) {
        throw new IllegalStateException();
    }

    @Override
    String asNestedToken(SubstitutionContext context) {
        return asNestedPath();
    }
}
