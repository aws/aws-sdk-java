/*
 * Copyright 2018 Diffblue Limited
 *
 * Diffblue Limited licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.util;

import com.amazonaws.util.TimestampFormat;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimestampFormatTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromValueInputNotNullOutputNotNull() {

    // Arrange
    final String format = "iso8601";

    // Act
    final TimestampFormat retval = TimestampFormat.fromValue(format);

    // Assert result
    Assert.assertEquals(TimestampFormat.ISO_8601, retval);
  }

  @Test
  public void fromValueInputNotNullOutputNotNull2() {

    // Arrange
    final String format = "unixTimestamp";

    // Act
    final TimestampFormat retval = TimestampFormat.fromValue(format);

    // Assert result
    Assert.assertEquals(TimestampFormat.UNIX_TIMESTAMP, retval);
  }

  @Test
  public void fromValueInputNullOutputNull() {

    // Arrange
    final String format = null;

    // Act
    final TimestampFormat retval = TimestampFormat.fromValue(format);

    // Assert result
    Assert.assertNull(retval);
  }
}
