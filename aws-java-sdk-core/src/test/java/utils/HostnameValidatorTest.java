/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package utils;

import com.amazonaws.util.HostnameValidator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HostnameValidatorTest {
    private static final String LONG_STRING_64 = "1234567890123456789012345678901234567890123456789012345678901234";

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void validHostComponent_shouldWork() {
        HostnameValidator.validateHostnameCompliant("1", "id", "test");
        HostnameValidator.validateHostnameCompliant(LONG_STRING_64.substring(0, LONG_STRING_64.length() - 1), "id", "test");
    }

    @Test
    public void nullHostComponent_shouldThrowException() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("id");
        exception.expectMessage("missing");
        HostnameValidator.validateHostnameCompliant(null, "id", "test");
    }

    @Test
    public void emptyHostComponent_shouldThrowException() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("id");
        exception.expectMessage("missing");
        HostnameValidator.validateHostnameCompliant("", "id", "test");
    }

    @Test
    public void hostComponentWithSlash_shouldThrowException() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("id");
        exception.expectMessage("alphanumeric");

        HostnameValidator.validateHostnameCompliant("foo%2bar", "id", "test");
    }

    @Test
    public void hostComponentWithEncodedString_shouldThrowException() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("id");
        exception.expectMessage("63");

        HostnameValidator.validateHostnameCompliant(LONG_STRING_64, "id", "test");
    }

    @Test
    public void hostComponentTooLong_shouldThrowException() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("id");
        exception.expectMessage("63");

        HostnameValidator.validateHostnameCompliant(LONG_STRING_64, "id", "test");
    }
}
