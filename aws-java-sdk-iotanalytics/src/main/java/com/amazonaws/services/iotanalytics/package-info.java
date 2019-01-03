/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS IoT Analytics allows you to collect large amounts of device data, process messages, and store them. You can then
 * query the data and run sophisticated analytics on it. AWS IoT Analytics enables advanced data exploration through
 * integration with Jupyter Notebooks and data visualization through integration with Amazon QuickSight.
 * </p>
 * <p>
 * Traditional analytics and business intelligence tools are designed to process structured data. IoT data often comes
 * from devices that record noisy processes (such as temperature, motion, or sound). As a result the data from these
 * devices can have significant gaps, corrupted messages, and false readings that must be cleaned up before analysis can
 * occur. Also, IoT data is often only meaningful in the context of other data from external sources.
 * </p>
 * <p>
 * AWS IoT Analytics automates the steps required to analyze data from IoT devices. AWS IoT Analytics filters,
 * transforms, and enriches IoT data before storing it in a time-series data store for analysis. You can set up the
 * service to collect only the data you need from your devices, apply mathematical transforms to process the data, and
 * enrich the data with device-specific metadata such as device type and location before storing it. Then, you can
 * analyze your data by running queries using the built-in SQL query engine, or perform more complex analytics and
 * machine learning inference. AWS IoT Analytics includes pre-built models for common IoT use cases so you can answer
 * questions like which devices are about to fail or which customers are at risk of abandoning their wearable devices.
 * </p>
 */
package com.amazonaws.services.iotanalytics;

