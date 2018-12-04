/*
 * Copyright 2015-2016 Amazon Technologies, Inc.
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
package com.amazonaws.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marker interface for methods used by test code in the same module. Methods/Constructors annotated
 * with this method should not be accessed in production code. This annotation should be used
 * sparingly as it's a code smell to need access to internal data/functionality to properly unit
 * test a class. Typically there is a better way to test a class.
 * <p>
 * TODO: Write a linter that makes sure only test code depends on methods or constructors annotated
 * with this method
 */
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD })
public @interface SdkTestInternalApi {
}
