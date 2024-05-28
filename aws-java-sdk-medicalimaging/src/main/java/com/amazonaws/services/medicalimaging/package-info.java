/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This is the <i>AWS HealthImaging API Reference</i>. AWS HealthImaging is a HIPAA eligible service that empowers
 * healthcare providers, life science organizations, and their software partners to store, analyze, and share medical
 * images in the cloud at petabyte scale. For an introduction to the service, see the <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/what-is.html"> <i>AWS HealthImaging Developer
 * Guide</i> </a>.
 * </p>
 * <note>
 * <p>
 * We recommend using one of the AWS Software Development Kits (SDKs) for your programming language, as they take care
 * of request authentication, serialization, and connection management. For more information, see <a
 * href="http://aws.amazon.com/developer/tools">Tools to build on AWS</a>.
 * </p>
 * </note>
 * <p>
 * The following sections list AWS HealthImaging API actions categorized according to functionality. Links are provided
 * to actions within this Reference, along with links back to corresponding sections in the <i>AWS HealthImaging
 * Developer Guide</i> where you can view tested code examples.
 * </p>
 * <p class="title">
 * <b>Data store actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_CreateDatastore.html">CreateDatastore</a>
 * – See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/create-data-store.html">Creating a data
 * store</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetDatastore.html">GetDatastore</a> – See
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-data-store.html">Getting data store
 * properties</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_ListDatastores.html">ListDatastores</a> –
 * See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/list-data-stores.html">Listing data
 * stores</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_DeleteDatastore.html">DeleteDatastore</a>
 * – See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/delete-data-store.html">Deleting a data
 * store</a>.
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Import job actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_StartDICOMImportJob.html">
 * StartDICOMImportJob</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/start-dicom-import-job.html">Starting an import
 * job</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetDICOMImportJob.html">GetDICOMImportJob</a>
 * – See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-dicom-import-job.html">Getting import
 * job properties</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_ListDICOMImportJobs.html">
 * ListDICOMImportJobs</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/list-dicom-import-jobs.html">Listing import jobs</a>.
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Image set access actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_SearchImageSets.html">SearchImageSets</a>
 * – See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/search-image-sets.html">Searching image
 * sets</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetImageSet.html">GetImageSet</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-image-set-properties.html">Getting image set
 * properties</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetImageSetMetadata.html">
 * GetImageSetMetadata</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-image-set-metadata.html">Getting image set
 * metadata</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetImageFrame.html">GetImageFrame</a> –
 * See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-image-frame.html">Getting image set pixel
 * data</a>.
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Image set modification actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_ListImageSetVersions.html">
 * ListImageSetVersions</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/list-image-set-versions.html">Listing image set
 * versions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_UpdateImageSetMetadata.html">
 * UpdateImageSetMetadata</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/update-image-set-metadata.html">Updating image set
 * metadata</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_CopyImageSet.html">CopyImageSet</a> – See
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/copy-image-set.html">Copying an image set</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_DeleteImageSet.html">DeleteImageSet</a> –
 * See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/delete-image-set.html">Deleting an image
 * set</a>.
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Tagging actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_TagResource.html">TagResource</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/tag-resource.html">Tagging a resource</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_ListTagsForResource.html">
 * ListTagsForResource</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/list-tag-resource.html">Listing tags for a
 * resource</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_UntagResource.html">UntagResource</a> –
 * See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/untag-resource.html">Untagging a resource</a>.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.medicalimaging;

