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
package com.amazonaws.http.apache.utils;

import com.amazonaws.http.apache.utils.ApacheUtils;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class ApacheUtilsTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @PrepareForTest({StatusLine.class, HttpResponse.class})
  @Test
  public void isRequestSuccessfulInputNotNullOutputFalse() throws Exception {

    // Arrange
    final HttpResponse response = PowerMockito.mock(HttpResponse.class);
    final StatusLine statusLine = PowerMockito.mock(StatusLine.class);
    PowerMockito.doReturn(0).when(statusLine);
    statusLine.getStatusCode();
    PowerMockito.doReturn(statusLine).when(response);
    response.getStatusLine();

    // Act
    final boolean retval = ApacheUtils.isRequestSuccessful(response);

    // Assert result
    Assert.assertEquals(false, retval);
  }

  @PrepareForTest({StatusLine.class, HttpResponse.class})
  @Test
  public void isRequestSuccessfulInputNotNullOutputTrue() throws Exception {

    // Arrange
    final HttpResponse response = PowerMockito.mock(HttpResponse.class);
    final StatusLine statusLine = PowerMockito.mock(StatusLine.class);
    PowerMockito.doReturn(200).when(statusLine);
    statusLine.getStatusCode();
    PowerMockito.doReturn(statusLine).when(response);
    response.getStatusLine();

    // Act
    final boolean retval = ApacheUtils.isRequestSuccessful(response);

    // Assert result
    Assert.assertEquals(true, retval);
  }
}
