/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition;

import com.amazonaws.services.rekognition.model.*;

/**
 * Interface for accessing Amazon Rekognition asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rekognition.AbstractAmazonRekognitionAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is Amazon Rekognition API guide.
 * </p>
 */
public interface AmazonRekognitionAsync extends AmazonRekognition {

    /**
     * <p>
     * Compares a face in the <i>source</i> input image with each face detected in the <i>target</i> input image.
     * </p>
     * <note>
     * <p>
     * If the source image contains multiple faces, the service detects the largest face and uses it to compare with
     * each face detected in the target image.
     * </p>
     * </note>
     * <p>
     * In response, the operation returns an array of face matches ordered by similarity score with the highest
     * similarity scores first. For each face match, the response provides a bounding box of the face and
     * <code>confidence</code> value (indicating the level of confidence that the bounding box contains a face). The
     * response also provides a <code>similarity</code> score, which indicates how closely the faces match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with the similarity score of greater than or equal to 80% are returned in the response.
     * You can change this value.
     * </p>
     * </note>
     * <p>
     * In addition to the face matches, the response returns information about the face in the source image, including
     * the bounding box of the face and confidence value.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-compare-faces</a>
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CompareFaces</code> action.
     * </p>
     * 
     * @param compareFacesRequest
     * @return A Java Future containing the result of the CompareFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.CompareFaces
     */
    java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(CompareFacesRequest compareFacesRequest);

    /**
     * <p>
     * Compares a face in the <i>source</i> input image with each face detected in the <i>target</i> input image.
     * </p>
     * <note>
     * <p>
     * If the source image contains multiple faces, the service detects the largest face and uses it to compare with
     * each face detected in the target image.
     * </p>
     * </note>
     * <p>
     * In response, the operation returns an array of face matches ordered by similarity score with the highest
     * similarity scores first. For each face match, the response provides a bounding box of the face and
     * <code>confidence</code> value (indicating the level of confidence that the bounding box contains a face). The
     * response also provides a <code>similarity</code> score, which indicates how closely the faces match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with the similarity score of greater than or equal to 80% are returned in the response.
     * You can change this value.
     * </p>
     * </note>
     * <p>
     * In addition to the face matches, the response returns information about the face in the source image, including
     * the bounding box of the face and confidence value.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-compare-faces</a>
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CompareFaces</code> action.
     * </p>
     * 
     * @param compareFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompareFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CompareFaces
     */
    java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(CompareFacesRequest compareFacesRequest,
            com.amazonaws.handlers.AsyncHandler<CompareFacesRequest, CompareFacesResult> asyncHandler);

    /**
     * <p>
     * Creates a collection in an AWS region. You can add faces to the collection using the operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your application users. A user can then index faces
     * using the <code>IndexFaces</code> operation and persist results in a specific collection. Then, a user can search
     * the collection for faces in the user-specific container.
     * </p>
     * <p>
     * For an example, see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateCollection</code> action.
     * </p>
     * 
     * @param createCollectionRequest
     * @return A Java Future containing the result of the CreateCollection operation returned by the service.
     * @sample AmazonRekognitionAsync.CreateCollection
     */
    java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest createCollectionRequest);

    /**
     * <p>
     * Creates a collection in an AWS region. You can add faces to the collection using the operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your application users. A user can then index faces
     * using the <code>IndexFaces</code> operation and persist results in a specific collection. Then, a user can search
     * the collection for faces in the user-specific container.
     * </p>
     * <p>
     * For an example, see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateCollection</code> action.
     * </p>
     * 
     * @param createCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCollection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CreateCollection
     */
    java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest createCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCollectionRequest, CreateCollectionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example,
     * see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteCollection</code> action.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @return A Java Future containing the result of the DeleteCollection operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteCollection
     */
    java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest deleteCollectionRequest);

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example,
     * see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteCollection</code> action.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCollection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteCollection
     */
    java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest deleteCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCollectionRequest, DeleteCollectionResult> asyncHandler);

    /**
     * <p>
     * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the
     * collection.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteFaces</code> action.
     * </p>
     * 
     * @param deleteFacesRequest
     * @return A Java Future containing the result of the DeleteFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteFaces
     */
    java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(DeleteFacesRequest deleteFacesRequest);

    /**
     * <p>
     * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the
     * collection.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteFaces</code> action.
     * </p>
     * 
     * @param deleteFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteFaces
     */
    java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(DeleteFacesRequest deleteFacesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFacesRequest, DeleteFacesResult> asyncHandler);

    /**
     * <p>
     * Detects faces within an image (JPEG or PNG) that is provided as input.
     * </p>
     * <p>
     * For each face detected, the operation returns face details including a bounding box of the face, a confidence
     * value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for
     * example, coordinates of eye and mouth), gender, presence of beard, sunglasses, etc.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm
     * may not detect the faces or might detect faces with lower confidence.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-detect-faces</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectFaces</code> action.
     * </p>
     * 
     * @param detectFacesRequest
     * @return A Java Future containing the result of the DetectFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectFaces
     */
    java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(DetectFacesRequest detectFacesRequest);

    /**
     * <p>
     * Detects faces within an image (JPEG or PNG) that is provided as input.
     * </p>
     * <p>
     * For each face detected, the operation returns face details including a bounding box of the face, a confidence
     * value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for
     * example, coordinates of eye and mouth), gender, presence of beard, sunglasses, etc.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm
     * may not detect the faces or might detect faces with lower confidence.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-detect-faces</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectFaces</code> action.
     * </p>
     * 
     * @param detectFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectFaces
     */
    java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(DetectFacesRequest detectFacesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectFacesRequest, DetectFacesResult> asyncHandler);

    /**
     * <p>
     * Detects instances of real-world labels within an image (JPEG or PNG) provided as input. This includes objects
     * like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape,
     * evening, and nature. For an example, see <a>get-started-exercise-detect-labels</a>.
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and
     * the level of confidence that the image contains the object. For example, suppose the input image has a
     * lighthouse, the sea, and a rock. The response will include all three labels, one for each object.
     * </p>
     * <p>
     * <code>{Name: lighthouse, Confidence: 98.4629}</code>
     * </p>
     * <p>
     * <code>{Name: rock,Confidence: 79.2097}</code>
     * </p>
     * <p>
     * <code> {Name: sea,Confidence: 75.061}</code>
     * </p>
     * <p>
     * In the preceding example, the operation returns one label for each of the three objects. The operation can also
     * return multiple labels for the same object in the image. For example, if the input image shows a flower (for
     * example, a tulip), the operation might return the following three labels.
     * </p>
     * <p>
     * <code>{Name: flower,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: plant,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: tulip,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * In this example, the detection algorithm more precisely identifies the flower as a tulip.
     * </p>
     * <p>
     * You can provide the input image as an S3 object or as base64-encoded bytes. In response, the API returns an array
     * of labels. In addition, the response also includes the orientation correction. Optionally, you can specify
     * <code>MinConfidence</code> to control the confidence threshold for the labels returned. The default is 50%. You
     * can also add the <code>MaxLabels</code> parameter to limit the number of labels returned.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the same facial details that the
     * <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectLabels</code> action.
     * </p>
     * 
     * @param detectLabelsRequest
     * @return A Java Future containing the result of the DetectLabels operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectLabels
     */
    java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(DetectLabelsRequest detectLabelsRequest);

    /**
     * <p>
     * Detects instances of real-world labels within an image (JPEG or PNG) provided as input. This includes objects
     * like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape,
     * evening, and nature. For an example, see <a>get-started-exercise-detect-labels</a>.
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and
     * the level of confidence that the image contains the object. For example, suppose the input image has a
     * lighthouse, the sea, and a rock. The response will include all three labels, one for each object.
     * </p>
     * <p>
     * <code>{Name: lighthouse, Confidence: 98.4629}</code>
     * </p>
     * <p>
     * <code>{Name: rock,Confidence: 79.2097}</code>
     * </p>
     * <p>
     * <code> {Name: sea,Confidence: 75.061}</code>
     * </p>
     * <p>
     * In the preceding example, the operation returns one label for each of the three objects. The operation can also
     * return multiple labels for the same object in the image. For example, if the input image shows a flower (for
     * example, a tulip), the operation might return the following three labels.
     * </p>
     * <p>
     * <code>{Name: flower,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: plant,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: tulip,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * In this example, the detection algorithm more precisely identifies the flower as a tulip.
     * </p>
     * <p>
     * You can provide the input image as an S3 object or as base64-encoded bytes. In response, the API returns an array
     * of labels. In addition, the response also includes the orientation correction. Optionally, you can specify
     * <code>MinConfidence</code> to control the confidence threshold for the labels returned. The default is 50%. You
     * can also add the <code>MaxLabels</code> parameter to limit the number of labels returned.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the same facial details that the
     * <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectLabels</code> action.
     * </p>
     * 
     * @param detectLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectLabels operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectLabels
     */
    java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(DetectLabelsRequest detectLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<DetectLabelsRequest, DetectLabelsResult> asyncHandler);

    /**
     * <p>
     * Detects faces in the input image and adds them to the specified collection.
     * </p>
     * <p>
     * Amazon Rekognition does not save the actual faces detected. Instead, the underlying detection algorithm first
     * detects the faces in the input image, and for each face extracts facial features into a feature vector, and
     * stores it in the back-end database. Amazon Rekognition uses feature vectors when performing face match and search
     * operations using the and operations.
     * </p>
     * <p>
     * If you provide the optional <code>externalImageID</code> for the input image you provided, Amazon Rekognition
     * associates this ID with all faces that it detects. When you call the operation, the response returns the external
     * ID. You can use this external image ID to create a client-side index to associate the faces with each image. You
     * can then use the index to find all faces in an image.
     * </p>
     * <p>
     * In response, the operation returns an array of metadata for all detected faces. This includes, the bounding box
     * of the detected face, confidence value (indicating the bounding box contains a face), a face ID assigned by the
     * service for each face that is detected and stored, and an image ID assigned by the service for the input image If
     * you request all facial attributes (using the <code>detectionAttributes</code> parameter, Rekognition returns
     * detailed facial attributes such as facial landmarks (for example, location of eye and mount) and other facial
     * attributes such gender. If you provide the same image, specify the same collection, and use the same external ID
     * in the <code>IndexFaces</code> operation, Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p>
     * For an example, see <a>example2</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:IndexFaces</code> action.
     * </p>
     * 
     * @param indexFacesRequest
     * @return A Java Future containing the result of the IndexFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.IndexFaces
     */
    java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(IndexFacesRequest indexFacesRequest);

    /**
     * <p>
     * Detects faces in the input image and adds them to the specified collection.
     * </p>
     * <p>
     * Amazon Rekognition does not save the actual faces detected. Instead, the underlying detection algorithm first
     * detects the faces in the input image, and for each face extracts facial features into a feature vector, and
     * stores it in the back-end database. Amazon Rekognition uses feature vectors when performing face match and search
     * operations using the and operations.
     * </p>
     * <p>
     * If you provide the optional <code>externalImageID</code> for the input image you provided, Amazon Rekognition
     * associates this ID with all faces that it detects. When you call the operation, the response returns the external
     * ID. You can use this external image ID to create a client-side index to associate the faces with each image. You
     * can then use the index to find all faces in an image.
     * </p>
     * <p>
     * In response, the operation returns an array of metadata for all detected faces. This includes, the bounding box
     * of the detected face, confidence value (indicating the bounding box contains a face), a face ID assigned by the
     * service for each face that is detected and stored, and an image ID assigned by the service for the input image If
     * you request all facial attributes (using the <code>detectionAttributes</code> parameter, Rekognition returns
     * detailed facial attributes such as facial landmarks (for example, location of eye and mount) and other facial
     * attributes such gender. If you provide the same image, specify the same collection, and use the same external ID
     * in the <code>IndexFaces</code> operation, Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p>
     * For an example, see <a>example2</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:IndexFaces</code> action.
     * </p>
     * 
     * @param indexFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IndexFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.IndexFaces
     */
    java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(IndexFacesRequest indexFacesRequest,
            com.amazonaws.handlers.AsyncHandler<IndexFacesRequest, IndexFacesResult> asyncHandler);

    /**
     * <p>
     * Returns list of collection IDs in your account. If the result is truncated, the response also provides a
     * <code>NextToken</code> that you can use in the subsequent request to fetch the next set of collection IDs.
     * </p>
     * <p>
     * For an example, see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListCollections</code> action.
     * </p>
     * 
     * @param listCollectionsRequest
     * @return A Java Future containing the result of the ListCollections operation returned by the service.
     * @sample AmazonRekognitionAsync.ListCollections
     */
    java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest listCollectionsRequest);

    /**
     * <p>
     * Returns list of collection IDs in your account. If the result is truncated, the response also provides a
     * <code>NextToken</code> that you can use in the subsequent request to fetch the next set of collection IDs.
     * </p>
     * <p>
     * For an example, see <a>example1</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListCollections</code> action.
     * </p>
     * 
     * @param listCollectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollections operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListCollections
     */
    java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest listCollectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollectionsRequest, ListCollectionsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding
     * box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see
     * <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListFaces</code> action.
     * </p>
     * 
     * @param listFacesRequest
     * @return A Java Future containing the result of the ListFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.ListFaces
     */
    java.util.concurrent.Future<ListFacesResult> listFacesAsync(ListFacesRequest listFacesRequest);

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding
     * box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see
     * <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListFaces</code> action.
     * </p>
     * 
     * @param listFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListFaces
     */
    java.util.concurrent.Future<ListFacesResult> listFacesAsync(ListFacesRequest listFacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFacesRequest, ListFacesResult> asyncHandler);

    /**
     * <p>
     * For a given input face ID, searches the specified collection for matching faces. You get a face ID when you add a
     * face to the collection using the <a>IndexFaces</a> operation. The operation compares the features of the input
     * face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * You can also search faces without indexing faces by using the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * The operation response returns an array of faces that match, ordered by similarity score with the highest
     * similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the
     * metadata, the response also includes a <code>confidence</code> value for each face match, indicating the
     * confidence that the specific face matches the input face.
     * </p>
     * <p>
     * For an example, see <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFaces</code> action.
     * </p>
     * 
     * @param searchFacesRequest
     * @return A Java Future containing the result of the SearchFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.SearchFaces
     */
    java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(SearchFacesRequest searchFacesRequest);

    /**
     * <p>
     * For a given input face ID, searches the specified collection for matching faces. You get a face ID when you add a
     * face to the collection using the <a>IndexFaces</a> operation. The operation compares the features of the input
     * face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * You can also search faces without indexing faces by using the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * The operation response returns an array of faces that match, ordered by similarity score with the highest
     * similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the
     * metadata, the response also includes a <code>confidence</code> value for each face match, indicating the
     * confidence that the specific face matches the input face.
     * </p>
     * <p>
     * For an example, see <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFaces</code> action.
     * </p>
     * 
     * @param searchFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.SearchFaces
     */
    java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(SearchFacesRequest searchFacesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchFacesRequest, SearchFacesResult> asyncHandler);

    /**
     * <p>
     * For a given input image, first detects the largest face in the image, and then searches the specified collection
     * for matching faces. The operation compares the features of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * To search for all faces in an input image, you might first call the API, and then use the face IDs returned in
     * subsequent calls to the API.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> API and use the bounding boxes in the response to make face crops,
     * which then you can pass in to the <code>SearchFacesByImage</code> API.
     * </p>
     * </note>
     * <p>
     * The response returns an array of faces that match, ordered by similarity score with the highest similarity first.
     * More specifically, it is an array of metadata for each face match found. Along with the metadata, the response
     * also includes a <code>similarity</code> indicating how similar the face is to the input face. In the response,
     * the API also returns the bounding box (and a confidence level that the bounding box contains a face) of the face
     * that Rekognition used for the input image.
     * </p>
     * <p>
     * For an example, see <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFacesByImage</code> action.
     * </p>
     * 
     * @param searchFacesByImageRequest
     * @return A Java Future containing the result of the SearchFacesByImage operation returned by the service.
     * @sample AmazonRekognitionAsync.SearchFacesByImage
     */
    java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(SearchFacesByImageRequest searchFacesByImageRequest);

    /**
     * <p>
     * For a given input image, first detects the largest face in the image, and then searches the specified collection
     * for matching faces. The operation compares the features of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * To search for all faces in an input image, you might first call the API, and then use the face IDs returned in
     * subsequent calls to the API.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> API and use the bounding boxes in the response to make face crops,
     * which then you can pass in to the <code>SearchFacesByImage</code> API.
     * </p>
     * </note>
     * <p>
     * The response returns an array of faces that match, ordered by similarity score with the highest similarity first.
     * More specifically, it is an array of metadata for each face match found. Along with the metadata, the response
     * also includes a <code>similarity</code> indicating how similar the face is to the input face. In the response,
     * the API also returns the bounding box (and a confidence level that the bounding box contains a face) of the face
     * that Rekognition used for the input image.
     * </p>
     * <p>
     * For an example, see <a>example3</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFacesByImage</code> action.
     * </p>
     * 
     * @param searchFacesByImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchFacesByImage operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.SearchFacesByImage
     */
    java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(SearchFacesByImageRequest searchFacesByImageRequest,
            com.amazonaws.handlers.AsyncHandler<SearchFacesByImageRequest, SearchFacesByImageResult> asyncHandler);

}
