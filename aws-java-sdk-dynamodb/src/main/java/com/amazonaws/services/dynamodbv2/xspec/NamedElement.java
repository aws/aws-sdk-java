/*
 * Copyright 2015-2019 Amazon Technologies, Inc.
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
 package com.amazonaws.services.dynamodbv2.xspec;

import com.amazonaws.annotation.Immutable;

@Immutable
final class NamedElement extends PathElement {
    private final String name;

    NamedElement(String name) {
        if (name == null) {
            throw new NullPointerException("element");
        }
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("element cannot be empty");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NamedElement)) {
            return false;
        }

        return name.equals(((NamedElement) obj).name);
    }

    @Override
    String asNestedPath() {
        return "." + name;
    }

    @Override
    String asToken(SubstitutionContext context) {
        return context.nameTokenFor(name);
    }

    @Override
    String asNestedToken(SubstitutionContext context) {
        return "." + context.nameTokenFor(name);
    }
}
