/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

/**
 * <p>
 * Amazon Route 53 auto naming lets you configure public or private namespaces that your microservice applications run
 * in. When instances of the service become available, you can call the auto naming API to register the instance, and
 * Route 53 automatically creates up to five DNS records and an optional health check. Clients that submit DNS queries
 * for the service receive an answer that contains up to eight healthy records.
 * </p>
 */
package com.amazonaws.services.servicediscovery;

