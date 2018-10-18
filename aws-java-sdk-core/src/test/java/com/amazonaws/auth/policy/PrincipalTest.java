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
package com.amazonaws.auth.policy;

import com.amazonaws.auth.policy.Principal.Services;
import com.amazonaws.auth.policy.Principal.WebIdentityProviders;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrincipalTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromStringInputNotNullOutputNotNull() {

    // Arrange
    final String serviceId = "datapipeLIne.amazonawS.COM";

    // Act
    final Services retval = Services.fromString(serviceId);

    // Assert result
    Assert.assertEquals(Services.AWSDataPipeline, retval);
  }

  @Test
  public void fromStringInputNotNullOutputNotNull2() {

    // Arrange
    final String webIdentityProvider = "accOunts.googLe.COm";

    // Act
    final WebIdentityProviders retval = WebIdentityProviders.fromString(webIdentityProvider);

    // Assert result
    Assert.assertEquals(WebIdentityProviders.Google, retval);
  }

  @Test
  public void fromStringInputNullOutputNull() {

    // Arrange
    final String serviceId = null;

    // Act
    final Services retval = Services.fromString(serviceId);

    // Assert result
    Assert.assertNull(retval);
  }

  @Test
  public void fromStringInputNullOutputNull2() {

    // Arrange
    final String webIdentityProvider = null;

    // Act
    final WebIdentityProviders retval = WebIdentityProviders.fromString(webIdentityProvider);

    // Assert result
    Assert.assertNull(retval);
  }
}
