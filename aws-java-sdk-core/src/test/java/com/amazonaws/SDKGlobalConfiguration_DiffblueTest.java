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
package com.amazonaws;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.amazonaws.SDKGlobalConfiguration;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class SDKGlobalConfiguration_DiffblueTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @PrepareForTest({SDKGlobalConfiguration.class, System.class})
  @Test
  public void isCborDisabledOutputFalse() throws Exception {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    PowerMockito.when(System.getenv(or(isA(String.class), isNull(String.class)))).thenReturn("fALSE");
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)), or(isA(String.class), isNull(String.class)))).thenReturn(null);
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)))).thenReturn(null);

    // Act
    final boolean retval = SDKGlobalConfiguration.isCborDisabled();

    // Assert result
    Assert.assertEquals(false, retval);
  }

  @PrepareForTest({SDKGlobalConfiguration.class, System.class})
  @Test
  public void isCborDisabledOutputTrue() throws Exception {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    PowerMockito.when(System.getenv(or(isA(String.class), isNull(String.class)))).thenReturn("");
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)), or(isA(String.class), isNull(String.class)))).thenReturn(null);
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)))).thenReturn(null);

    // Act
    final boolean retval = SDKGlobalConfiguration.isCborDisabled();

    // Assert result
    Assert.assertEquals(true, retval);
  }

  @PrepareForTest({SDKGlobalConfiguration.class, System.class})
  @Test
  public void isEc2MetadataDisabledOutputFalse() throws Exception {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    PowerMockito.when(System.getenv(or(isA(String.class), isNull(String.class)))).thenReturn("");
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)), or(isA(String.class), isNull(String.class)))).thenReturn(null);
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)))).thenReturn(null);

    // Act
    final boolean retval = SDKGlobalConfiguration.isEc2MetadataDisabled();

    // Assert result
    Assert.assertEquals(false, retval);
  }

  @PrepareForTest({SDKGlobalConfiguration.class, System.class})
  @Test
  public void isEc2MetadataDisabledOutputTrue() throws Exception {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    PowerMockito.when(System.getenv(or(isA(String.class), isNull(String.class)))).thenReturn("tRue");
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)), or(isA(String.class), isNull(String.class)))).thenReturn(null);
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)))).thenReturn(null);

    // Act
    final boolean retval = SDKGlobalConfiguration.isEc2MetadataDisabled();

    // Assert result
    Assert.assertEquals(true, retval);
  }

  @PrepareForTest({SDKGlobalConfiguration.class, System.class})
  @Test
  public void isIonBinaryDisabledOutputFalse() throws Exception {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    PowerMockito.when(System.getenv(or(isA(String.class), isNull(String.class)))).thenReturn("fAlSE");
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)), or(isA(String.class), isNull(String.class)))).thenReturn(null);
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)))).thenReturn(null);

    // Act
    final boolean retval = SDKGlobalConfiguration.isIonBinaryDisabled();

    // Assert result
    Assert.assertEquals(false, retval);
  }

  @PrepareForTest({SDKGlobalConfiguration.class, System.class})
  @Test
  public void isIonBinaryDisabledOutputTrue() throws Exception {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    PowerMockito.when(System.getenv(or(isA(String.class), isNull(String.class)))).thenReturn("");
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)), or(isA(String.class), isNull(String.class)))).thenReturn(null);
    PowerMockito.when(System.getProperty(or(isA(String.class), isNull(String.class)))).thenReturn(null);

    // Act
    final boolean retval = SDKGlobalConfiguration.isIonBinaryDisabled();

    // Assert result
    Assert.assertEquals(true, retval);
  }
}
