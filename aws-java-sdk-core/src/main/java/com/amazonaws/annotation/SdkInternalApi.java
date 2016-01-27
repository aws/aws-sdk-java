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
 * Marker interface for 'internal' APIs that should not be used outside the core module. Breaking
 * changes can and will be introduced to elements marked as {@link SdkInternalApi}. Users of the SDK
 * and the generated clients themselves should not depend on any packages, types, fields,
 * constructors, or methods with this annotation.
 */
@Target({ ElementType.PACKAGE, ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD })
public @interface SdkInternalApi {
}
