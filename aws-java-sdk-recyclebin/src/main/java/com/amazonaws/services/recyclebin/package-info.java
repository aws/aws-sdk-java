/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This is the <i>Recycle Bin API Reference</i>. This documentation provides descriptions and syntax for each of the
 * actions and data types in Recycle Bin.
 * </p>
 * <p>
 * Recycle Bin is a resource recovery feature that enables you to restore accidentally deleted snapshots and EBS-backed
 * AMIs. When using Recycle Bin, if your resources are deleted, they are retained in the Recycle Bin for a time period
 * that you specify.
 * </p>
 * <p>
 * You can restore a resource from the Recycle Bin at any time before its retention period expires. After you restore a
 * resource from the Recycle Bin, the resource is removed from the Recycle Bin, and you can then use it in the same way
 * you use any other resource of that type in your account. If the retention period expires and the resource is not
 * restored, the resource is permanently deleted from the Recycle Bin and is no longer available for recovery. For more
 * information about Recycle Bin, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-recycle-bin.html"> Recycle Bin</a> in the
 * <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 */
package com.amazonaws.services.recyclebin;

